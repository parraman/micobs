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
package es.uah.aut.srg.micobs.library.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.diagnostic.CheckingDiagnostic;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapter;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapterFactory;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.modeling.util.file.FileConverter;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.svn.SVNUtil;

/**
 * Class that implements the handler used to update a given set of model elements.
 * During the update, the remote model file will be updated and the local file
 * stored in the library will be overwritten.
 *
 */
public class UpdateRemoteModelFile extends AbstractHandler {
	
	/**
	 * Returns a set with all the versioned items of a package.
	 * @param pack the package.
	 * @return the set with all the versioned items of the package.
	 */
	private Set<MCommonPackageVersionedItem> getVersionedItems(MCommonPackage pack)
	{
		Set<MCommonPackageVersionedItem> items = new HashSet<MCommonPackageVersionedItem>();
		for (MCommonPackageItem item : pack.getItems())
		{
			items.addAll(item.getVersionedItems());
		}
		return items;
	}
	
	/**
	 * Returns a set with all the versioned items of a library.
	 * @param library the package.
	 * @return the set with all the versioned items of the library.
	 */
	private Set<MCommonPackageVersionedItem> getVersionedItems(MCommonLibrary library)
	{
		Set<MCommonPackageVersionedItem> items = new HashSet<MCommonPackageVersionedItem>();
		for (MCommonPackage pack : library.getPackages())
		{
			items.addAll(getVersionedItems(pack));
		}
		return items;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		if (!(HandlerUtil.getCurrentSelection(event) instanceof IStructuredSelection))
		{
			return null;
		}
		
		IStructuredSelection selection = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
		
		MCommonLibrary library = null;
		
		final Set<MCommonPackageVersionedItem> itemsToUpdate = new HashSet<MCommonPackageVersionedItem>();
		
		for (Iterator<?> i = selection.iterator(); i.hasNext(); )
		{
			Object object = i.next();
			if (object instanceof MCommonLibrary)
			{
				itemsToUpdate.addAll(getVersionedItems((MCommonLibrary)object));
				library = (MCommonLibrary)object;
			}
			else if (object instanceof MCommonPackage)
			{
				itemsToUpdate.addAll(getVersionedItems((MCommonPackage)object));
				library = (MCommonLibrary) EcoreUtil.getRootContainer((EObject) object);
			}
			else if (object instanceof MCommonPackageItem)
			{
				MCommonPackageItem item = (MCommonPackageItem) object;
				itemsToUpdate.addAll(item.getVersionedItems());
				library = (MCommonLibrary) EcoreUtil.getRootContainer((EObject) object);
			}
			else if (object instanceof MCommonPackageVersionedItem)
			{
				itemsToUpdate.add((MCommonPackageVersionedItem) object);
				library = (MCommonLibrary) EcoreUtil.getRootContainer((EObject) object);
			}
		}

		final BasicDiagnostic diagnostics = new BasicDiagnostic(MICOBSPlugin.INSTANCE.getSymbolicName(),
				0, "Updating Remote Files", null);
		
		String libraryID = LibraryAdapterFactory.getAdapterFactory().getLibraryID(library.eClass().getName());
		LibraryAdapter adapter = 
			LibraryAdapterFactory.getAdapterFactory().getAdapter(libraryID);
		if (adapter == null)
		{
			CheckingDiagnostic diag = CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_UI_UnknownLibraryError_message",
							new Object[] { library.eClass().getName() }), library);
			diagnostics.add(diag);

		}
		final ILibraryManager manager = (ILibraryManager) adapter.adapt(ILibraryManager.class);
		
		if (manager == null)
		{
			CheckingDiagnostic diag = CheckingDiagnostic.createError(
					MICOBSPlugin.INSTANCE.getString("_UI_LibraryInstallError_message",
							new Object[] { library.eClass().getName() }), library);
			diagnostics.add(diag);
		}
		
		if (diagnostics.getSeverity() != Diagnostic.OK)
		{
		      DiagnosticDialog.open
		        (HandlerUtil.getActiveShell(event), 
		        	MICOBSPlugin.INSTANCE.getString("_UI_updateRemoteModelFileError_Title"),
		        	MICOBSPlugin.INSTANCE.getString("_UI_updateRemoteModelFileError_Message"),
		        	diagnostics);
		      return null;
		}
		
		try 
		{
			new ProgressMonitorDialog(HandlerUtil.getActiveShell(event)).run(true, true, new IRunnableWithProgress() {
				
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException,
						InterruptedException {
					
					monitor.beginTask("Updating Remote Files", 100); //$NON-NLS-1$	

					int step = 100 / itemsToUpdate.size();
					
					for (MCommonPackageVersionedItem versionedItem : itemsToUpdate)
					{
						if (monitor.isCanceled())
						{
							break;
						}
						monitor.worked(step);
						
						if (versionedItem.getRemoteModelURI() == null)
						{
							continue;
						}
						
						MCommonPackageElement element;
						
						try {
							element = manager.getElement(versionedItem);					
						} catch (LibraryManagerException e)
						{
							MICOBSPlugin.INSTANCE.log(e);
							throw new InvocationTargetException(e);
						}
						
						String remoteModelURI = versionedItem.getRemoteModelURI();
						String localModelURI = versionedItem.getLocalModelURI();
						String modelFileExtension = remoteModelURI.substring(remoteModelURI.lastIndexOf(".") + 1, remoteModelURI.length());
						
						File tmp = null;
						try {
							tmp = SVNUtil.loadRemoteFileOnTmp(
									remoteModelURI,
									"model", "." + modelFileExtension, monitor);
						} catch (CoreException e) {
							diagnostics.add(CheckingDiagnostic.createError(
									MICOBSPlugin.INSTANCE.getString("_ERROR_ModelElementLoading", 
											new Object[] { remoteModelURI }), versionedItem));
							continue;
						} catch (IOException e) {
							diagnostics.add(CheckingDiagnostic.createError(
									MICOBSPlugin.INSTANCE.getString("_ERROR_SavingTmp"), 
										versionedItem));
							continue;
						}
						
						File destFile = null;
						String destString = null;
						
						URI resourceURI = URI.createURI(localModelURI, true);

						try
						{
							destFile = FileConverter.platformPluginURItoFile(resourceURI);
							destString = destFile.getAbsolutePath();
							manager.removeElement(element.eClass(), element.getUri(), element.getVersion());
						} 
						catch (Throwable e)
						{
							CheckingDiagnostic diag = CheckingDiagnostic.createError(
									MICOBSPlugin.INSTANCE.getString("_ERR_ResourceUnloadProblem"), versionedItem);
							diagnostics.add(diag);
							continue;
						}
						
						try {
							if (destFile.isFile())
							{
								destFile.setWritable(true);
								destFile.delete();
							}
							FileHelper.copyBinaryFile(tmp.getAbsolutePath(), destString);
							destFile.setWritable(false);
						} catch (IOException e) {
							CheckingDiagnostic diag = CheckingDiagnostic.createError(
									MICOBSPlugin.INSTANCE.getString("_ERROR_CopyingFileToLibrary"), 
									versionedItem);
							diagnostics.add(diag);
							continue;
						}
						
						MCommonPackageVersionedItem newVersionedItem = null;
						
						try
						{
							newVersionedItem = manager.putElement(resourceURI);
						} 
						catch (Throwable e)
						{
							CheckingDiagnostic diag = CheckingDiagnostic.createError(
									MICOBSPlugin.INSTANCE.getString("_ERROR_CopyingFileToLibrary"), versionedItem);
							diagnostics.add(diag);
							continue;
						}
						
						for (Iterator<EStructuralFeature> f = versionedItem.eClass().getEAllStructuralFeatures().iterator(); f.hasNext(); )
						{
							EStructuralFeature feature = f.next();
							if (feature != commonPackage.eINSTANCE.getMCommonPackageVersionedItem_LocalModelURI() &&
								versionedItem.eGet(feature) != null)
							{
								newVersionedItem.eSet(feature, versionedItem.eGet(feature));
							}
						}
					}
					try {
						manager.saveLibrary();
					} catch (IOException e) {
						MICOBSPlugin.INSTANCE.log(e);
						throw new InvocationTargetException(e);
					}

					monitor.done();
					
					
				}
			});

		} catch (InvocationTargetException e) {
			MICOBSPlugin.INSTANCE.log(e);
			return false;
		} catch (InterruptedException e) {
			MICOBSPlugin.INSTANCE.log(e);
			return false;
		}

		if (diagnostics.getSeverity() != Diagnostic.OK)
		{
		      DiagnosticDialog.open
		        (HandlerUtil.getActiveShell(event), 
		        	MICOBSPlugin.INSTANCE.getString("_UI_updateRemoteModelFileError_Title"),
		        	MICOBSPlugin.INSTANCE.getString("_UI_updateRemoteModelFileError_Message"),
		        	diagnostics);
		}
		
		return null;
	}
	

}
