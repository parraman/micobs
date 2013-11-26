/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
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
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
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

import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.util.impl.MICOBSUtil;
import es.uah.aut.srg.modeling.util.plugin.ModelingUtilPlugin;

/**
 * Abstract handler class that helps with the generation of resources in the
 * workspace. The handler will first check the file that triggers the
 * generation, then will ask the user to confirm the operation, then will
 * erase a set of resources that will depend on the generation process, and
 * then will call for the generation of the files.
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
 * 		<li>The implementation of the method that will generate the files.</li>
 * </ul>
 *
 * All the generation process is executed synchronously by the GUI thread.
 */
public abstract class GenerateResourcesHandler extends AbstractHandler {
	
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
	 * Returns the list of workspace resources to erase.
	 * 
	 * The method will throw a {@link CoreException} if an error occurs when
	 * obtaining the list of resources to erase.
	 * 
	 * @param rootFolder the root folder of the project that contains the triggering
	 * 		  			 model file.
	 * @param model the root object of the triggering model file.
	 * @return the list of workspace resources to erase.
	 */
	protected abstract List<IResource> getResourcesToErase(IContainer rootFolder,
			EObject model) throws CoreException;

	/**
	 * Performs the generation of the workspace resources.
	 * 
	 * @param model the root object of the triggering model file.
	 * @param rootFolder the root folder of the project that contains the triggering
	 * 		  			 model file. 
	 * @param monitor the progress monitor that will be shown during the generation
	 * 			      process.
	 */
	protected abstract void generateResources(EObject model,
			IContainer rootFolder,
			IProgressMonitor monitor);
	
	/**
	 * Returns the standard MICOBS models folder name.
	 * @param model the root object of the triggering model file.
	 * @return the standard MICOBS models folder name.
	 */
	protected String getModelFolderName(EObject model) {
		return MICOBSPlugin.INSTANCE.getString("_MICOBSProject_models_foldername");
	}
	
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
				
				final IContainer rootFolder = modelFolder.getParent();
				
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = 
					resourceSet.getResource(URI.createPlatformResourceURI(((IResource)object).getFullPath().toString(), true), true);
				
				final EObject model = resource.getContents().get(0);
				
				if (model.eClass() != getModelEClass())
				{
					MessageDialog.openError(shell, 
							MICOBSPlugin.INSTANCE.getString("_UI_GenerateFileHandler_ModelClassMismatch_dialogTitle"), 
							getModelClassErrorMessage());
					return null;
				}
				
			    Diagnostic diagnostic = MICOBSUtil.getDefault().validateResource(resource, getItemProviderAdapterFactory());
				
			    if (diagnostic.getSeverity() != Diagnostic.OK)
			    {
					handleDiagnostic(diagnostic);
					return null;
			    }
				
				if (getModelFolderName(model) != null &&
					!modelFolder.getName().equals(getModelFolderName(model)))
				{
					MessageDialog.openError(shell, 
							MICOBSPlugin.INSTANCE.getString("_UI_GenerateFileHandler_ModelFolderNameMismatch_dialogTitle"), 
							getModelFolderErrorMessage());
					return null;
				}
				
				if (getConfirmDialogMessage() != null &&
					!MessageDialog.openQuestion(shell, 
					MICOBSPlugin.INSTANCE.getString("_UI_GenerateFileHandler_ConfirmOperation_dialogTitle"), 
					getConfirmDialogMessage()))
				{
					return null;
				}
				
				shell.getDisplay().syncExec(new Runnable() {

					@Override
					public void run() {
						
						try {
							context.run(false, false, new IRunnableWithProgress() {

								@Override
								public void run(IProgressMonitor monitor)
										throws InvocationTargetException,
										InterruptedException {

									monitor.beginTask(
											MICOBSPlugin.INSTANCE.getString("_UI_GenerateFileHandler_ErasingTask_message"), 100);
									
									try
									{
										List<IResource> resources = getResourcesToErase(rootFolder, model);
										if (resources.size() == 0)
										{
											monitor.done();
											return;
										}
										
										int step = 100 / resources.size();
										for (Iterator<IResource> res = resources.iterator(); res.hasNext(); )
										{
											IResource resource = res.next();
											
											if (resource.exists())
											{
												res.remove();
												resource.delete(true, new SubProgressMonitor(monitor, step));
											}
										}
									} catch (CoreException e)
									{
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
				
				// Now we have to link the new stuff and update
				
				shell.getDisplay().syncExec(new Runnable() {

					@Override
					public void run() {
						
						try {
							context.run(false, false, new IRunnableWithProgress() {
								public void run(IProgressMonitor monitor) 
								throws InvocationTargetException, InterruptedException {
									
									monitor.beginTask(
											MICOBSPlugin.INSTANCE.getString("_UI_GenerateFileHandler_FileGeneration_message"), 100);
																		
									generateResources(model, rootFolder, monitor);
									
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

				try {
					((IResource)object).getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					MICOBSPlugin.INSTANCE.log(e);
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
