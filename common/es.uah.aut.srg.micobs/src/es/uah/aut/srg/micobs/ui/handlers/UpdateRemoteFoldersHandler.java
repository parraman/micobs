/*******************************************************************************
 * Copyright (c) 2013-2015 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.ui.handlers;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import es.uah.aut.srg.micobs.diagnostic.CheckingDiagnostic;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.util.impl.MICOBSUtilProvider;
import es.uah.aut.srg.modeling.util.plugin.ModelingUtilPlugin;
import es.uah.aut.srg.modeling.util.svn.SVNUtil;

/**
 * Class used to implement a handler that updates the SVN externals attribute
 * of a set of folders. The handler will first check the file that
 * triggers the generation, then will ask the user to confirm the operation,
 * then will unlink the previous SVN externals attributes of the folders,
 * and then will update the new SVN externals.
 * 
 * The classes that implement this will have to provide the following:
 * 
 * <ul>
 * 		<li>The root class of the triggering model file.</li>
 * 		<li>The item provider adapter factory corresponding to the model file.</li>
 * 		<li>The message for the user confirmation dialog.</li>
 * 		<li>The error message in case the checking of the triggering model
 * 			fails.</li>
 * 		<li>The list of resources to erase after the confirmation.</li>
 * 		<li>The list of mappings between the folders and their new SVN external
 * 			attributes.</li>
 * </ul>
 *
 * All the updating process is executed synchronously by the GUI thread.
 *
 */
public abstract class UpdateRemoteFoldersHandler extends AbstractHandler {
	
	/**
	 * Returns the message of the user confirmation dialog.
	 * @return the message of the user confirmation dialog.
	 */
	protected abstract String getConfirmDialogMessage();
	
	/**
	 * Returns the message string of the error that is generated if the
	 * name of the folder that contains the triggering model file does not
	 * match with the standard name.
	 * @return the message string of the error.
	 */
	protected String getModelFolderErrorMessage() {
		return MICOBSPlugin.INSTANCE.getString("_UI_Handlers_ModelFolderError_message");
	}
	
	/**
	 * Returns the message string of the error that is generated if the root
	 * class of the triggering model file is not the expected one.
	 * @return the message string of the error.
	 */
	protected abstract String getModelClassErrorMessage();
	
	
	/**
	 * Returns an array with the folders whose SVN externals attribute shall be
	 * erased prior to the update.
	 * 
	 * @param rootFolder the root folder of the project that contains the triggering
	 * 		  			 model file. 
	 * @param model the root object of the triggering model file.
	 * @return the array of folders.
	 */
	protected abstract IFolder[] getFoldersToUnlink(IContainer rootFolder,
			EObject model);
	
	
	/**
	 * Returns the list of mappings between the folders and their new values of
	 * the SVN externals attributes. This list is passed as a parameter and shall
	 * be filled by the method. Each element of the list corresponds to one folder
	 * and the order shall be the same as the one returned by the
	 * {@link #getFoldersToUnlink(IContainer, EObject)} method. Each map should
	 * contain the local name of the external remote folder and the URL.
	 * 
	 * @param rootFolder the root folder of the project that contains the triggering
	 * 		  			 model file. 
	 * @param model the root object of the triggering model file.
	 * @param itemList the list of mapping items.
	 * @return an object with the diagnosis of the generation of the mapping
	 * 		   items.
	 */
	protected abstract Diagnostic getNewMappingLists(IContainer rootFolder,
			EObject model, List<Map<String, String>> itemList);

	/**
	 * Returns the standard MICOBS models folder name.
	 * @param model the root object of the triggering model file.
	 * @return the standard MICOBS models folder name.
	 */
	protected String getModelFolderName() {
		return MICOBSPlugin.INSTANCE.getString("_MICOBSProject_models_foldername");
	};
	
	/**
	 * Returns the {@link EClass} object corresponding to the root class of the
	 * triggering model file.
	 * @return the {@link EClass} object.
	 */
	protected abstract EClass getModelEClass();
	
	/**
	 * Returns the item provider adapter factory of the triggering model file.
	 * @return the item provider adapter factory of the triggering model file.
	 */
	protected abstract AdapterFactory getItemProviderAdapterFactory();
	
	protected Shell shell;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		if (selection instanceof IStructuredSelection)
		{
			final Object object = ((IStructuredSelection)selection).getFirstElement();
			if (object instanceof IResource)
			{
				shell = HandlerUtil.getActiveShell(event);
				final IRunnableContext context = new ProgressMonitorDialog(shell);
				final Exception except[] = new Exception[1];

				// First we obtain the model folder
				final IContainer modelFolder = ((IResource)object).getParent();
				
				if (!modelFolder.getName().equals(getModelFolderName()))
				{
					MessageDialog.openError(shell, 
							MICOBSPlugin.INSTANCE.getString("_UI_UpdateResourcesHandler_ModelFolderNameMismatch_dialogTitle"), 
							getModelFolderErrorMessage());
					return null;
				}
				
				final IContainer rootFolder = modelFolder.getParent();
				
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = 
					resourceSet.getResource(URI.createPlatformResourceURI(((IResource)object).getFullPath().toString(), true), true);
				
				final EObject model = resource.getContents().get(0);
				
				if (model.eClass() != getModelEClass())
				{
					MessageDialog.openError(shell, 
							MICOBSPlugin.INSTANCE.getString("_UI_UpdateResourcesHandler_ModelClassMismatch_dialogTitle"), 
							getModelClassErrorMessage());
					return null;
				}

				Diagnostic diagnostic = MICOBSUtilProvider.getMICOBSUtil().validateResource(resource, getItemProviderAdapterFactory());

			    if (diagnostic.getSeverity() != Diagnostic.OK)
			    {
					handleDiagnostic(diagnostic);
					return null;
			    }
				
				if (!MessageDialog.openQuestion(shell, 
						MICOBSPlugin.INSTANCE.getString("_UI_UpdateResourcesHandler_ConfirmOperation_dialogTitle"), 
						getConfirmDialogMessage()))
				{
					return null;
				}
				
				final BasicDiagnostic runningDiagnostics = new BasicDiagnostic(MICOBSPlugin.INSTANCE.getSymbolicName(),
						0, "Update Resources Handler", null);
				
				// Now that we have the OK and the model is fine, we can start
				// the action!
				
				shell.getDisplay().syncExec(new Runnable() {

					@Override
					public void run() {
						
						try {
							context.run(false, true, new IRunnableWithProgress() {

								@Override
								public void run(IProgressMonitor monitor)
										throws InvocationTargetException,
										InterruptedException {

									monitor.beginTask(
											MICOBSPlugin.INSTANCE.getString("_UI_UpdateResourcesHandler_Task_message"), 100);
									
									IFolder[] folders = getFoldersToUnlink(rootFolder, model);
									List<Map<String, String>> itemList = new ArrayList<Map<String, String>>();
									Diagnostic diag = getNewMappingLists(rootFolder, model, itemList);
									if (diag != null)
									{
										runningDiagnostics.add(diag);
									}
									if (runningDiagnostics.getSeverity() != Diagnostic.OK)
									{
										return;
									}
									
									if (folders.length == 0 || itemList.size() == 0)
									{
										return;
									}
									
									int step = (100 + folders.length - 1) / folders.length;
									
									for (int i = 0; i < folders.length; i++)
									{
										monitor.subTask(MICOBSPlugin.INSTANCE.getString("_UI_UpdateResourcesHandler_UpdatingFolderSubTask_message",
												new Object[] { folders[i].getName() }));
										if (folders[i].exists() == false)
										{
											runningDiagnostics.add(CheckingDiagnostic.createError("Folder " + folders[i].getName() + 
													" does not exist"));
											continue;
										}
										Collection<String> foldersToErase = new HashSet<String>();
										Map<String, String> oldItems = SVNUtil.getExternalItems(folders[i]);
										for (Iterator<String> m = oldItems.keySet().iterator(); m.hasNext(); )
										{
											String key = m.next();
											if (!itemList.get(i).containsKey(key))
											{
												// This means that it was a
												// linked resource that is no more
												foldersToErase.add(key);
											}
										}
										
										// Now we have to clean the externals
										SVNUtil.setExternalItems(folders[i], itemList.get(i));
										SVNUtil.updateResources(new IResource[] { folders[i] });
										monitor.worked(step/2);							
										
										// Now it's cleaned.. we have to erase
										// foldersToErase
										monitor.subTask(MICOBSPlugin.INSTANCE.getString("_UI_UpdateResourcesHandler_ErasingSubTask_message"));
										for (Iterator<String> f = foldersToErase.iterator(); f.hasNext(); )
										{
											String erase = f.next();
											IFolder eraseFolder = folders[i].getFolder(new Path(erase));
											if (eraseFolder.exists())
											{
												try {
													eraseFolder.delete(true, new NullProgressMonitor());
												} catch (CoreException e) {
													throw new InvocationTargetException(e);
												}
											}
										}
										monitor.worked(step/2);
										if (monitor.isCanceled())
										{
											return;
										}
									}
									
									try {
										((IResource)object).getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
									} catch (CoreException e) {
										throw new InvocationTargetException(e);
									}
									
									monitor.done();

								}
							});
						} catch (InvocationTargetException e) {
							except[0] = e;
						} catch (InterruptedException e) {
							except[0] = e;
						}
					}
				});

				if (except[0] != null)
				{
					MICOBSPlugin.INSTANCE.log(except[0]);
					return null;
				}
				
				if (runningDiagnostics.getSeverity() != Diagnostic.OK)
				{
					handleDiagnostic(runningDiagnostics);
					return null;
				}
			}
		}
		return null;
	}

	/**
	 * Handles the diagnostic of the triggering model file in case an error
	 * is detected when triggering the transformation. This function will
	 * display a diagnostic dialog in case an error or a warning is
	 * encountered.
	 * @param diagnostic the resulting diagnostic of the triggering model
	 * 					 check.
	 */
	protected void handleDiagnostic(Diagnostic diagnostic)
	{
		int severity = diagnostic.getSeverity();
		String title = null;
		String message = null;

		if (severity == Diagnostic.ERROR || severity == Diagnostic.WARNING)
		{
			title = ModelingUtilPlugin.getString("_UI_ValidationProblems_title");
			message = ModelingUtilPlugin.getString("_UI_ValidationProblems_message");
		}
		else
		{
			title = ModelingUtilPlugin.getString("_UI_ValidationResults_title");
			message = ModelingUtilPlugin.getString(severity == Diagnostic.OK ? "_UI_ValidationOK_message" : "_UI_ValidationResults_message");
		}

		if (diagnostic.getSeverity() == Diagnostic.OK)
		{
			MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), title, message);
		}
		else
		{
			DiagnosticDialog.open
				(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), title, message, diagnostic);
		}
	}
	
}
