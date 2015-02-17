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
package es.uah.aut.srg.micobs.mesp.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.dialogs.DiagnosticDialog;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.tigris.subversion.subclipse.core.ISVNRemoteFile;
import org.tigris.subversion.subclipse.core.ISVNRepositoryLocation;
import org.tigris.subversion.subclipse.core.SVNProviderPlugin;
import org.tigris.subversion.svnclientadapter.ISVNClientAdapter;
import org.tigris.subversion.svnclientadapter.SVNClientException;
import org.tigris.subversion.svnclientadapter.SVNRevision;
import org.tigris.subversion.svnclientadapter.SVNUrl;

import com.google.common.io.Files;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItemWithRepository;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespdep.provider.mespdepItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswi.provider.mesposswiItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswp.provider.mesposswpItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesppswp.provider.mesppswpItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswi.provider.mespswiItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswp.provider.mespswpItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.mesp.ui.wizards.NewModelVersionWizard;
import es.uah.aut.srg.micobs.util.impl.MICOBSUtilProvider;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.plugin.ModelingUtilPlugin;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Handler that implements the functionality of tagging an already
 * existing model on a new folder and updating the version of the
 * model.
 *
 */
public class CreateNewPackageVersionHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IStructuredSelection selection = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
		
		if (selection.getFirstElement() instanceof MMESPPackageVersionedItemWithRepository)
		{
			MMESPPackageVersionedItemWithRepository previousVersionedItem = 
					(MMESPPackageVersionedItemWithRepository)selection.getFirstElement();
			
			Shell shell = HandlerUtil.getActiveShell(event);
			
			ISVNRepositoryLocation location;
			ISVNClientAdapter svnClientAdapter;
			File tmpFolder;
			SVNUrl repositoryUrl;
			SVNUrl remoteModelUrl;
			ISVNRemoteFile model;
			String remoteModelURI = previousVersionedItem.getRemoteModelURI();
			String modelRemoteFolder = "";
			String modelRemoteFilename = "";
			String modelExtension = "";
			String repositoryFolderURI = previousVersionedItem.getRepositoryFolderURI();

			// This operation will have the following restrictions:
			// - The original model remote URI must be stored in a folder called
			//   models/ of the original repository folder
			
	    	for (int i = 0; i < remoteModelURI.length(); i++) {
	    		String partialPath = remoteModelURI.substring(0, i+1);
	    		if (partialPath.endsWith("/")) {
	    			modelRemoteFolder = partialPath.substring(0, i);
	    			modelRemoteFilename = remoteModelURI.substring(i+1, remoteModelURI.length());
	    		}
	    	}
	    	for (int i = 0; i < modelRemoteFilename.length(); i++) {
	    		String partialPath = modelRemoteFilename.substring(0, i+1);
	    		if (partialPath.endsWith(".")) {
	    			modelExtension = modelRemoteFilename.substring(i+1, modelRemoteFilename.length());
	    		}
	    	}
	    	
	    	if (!modelRemoteFolder.equals(repositoryFolderURI + "/" + MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername")))
	    	{
	    		MessageDialog.openError(shell, "Model remote file location",
	    				"The remote file is not located in the correct folder");
	    		return null;
	    	}
	    	
			try {
				repositoryUrl = new SVNUrl(repositoryFolderURI);
				remoteModelUrl = new SVNUrl(remoteModelURI);
				location = SVNProviderPlugin.getPlugin().getRepository(repositoryUrl.toString());
				svnClientAdapter = location.getSVNClient();
				model = location.getRemoteFile(remoteModelUrl);
				tmpFolder = Files.createTempDir();
				svnClientAdapter.checkout(repositoryUrl, tmpFolder, SVNRevision.HEAD, true);
			} catch (CoreException e) {
				throw new ExecutionException(e.toString());
			} catch (SVNClientException e) {
				throw new ExecutionException(e.toString());
			} catch (MalformedURLException e) {
				throw new ExecutionException(e.toString());
			}

			File originalModel = new File(tmpFolder.getAbsolutePath() + File.separator +
					MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername") + 
					File.separator + modelRemoteFilename);
			URI originalFile = URI.createFileURI(originalModel.getAbsolutePath());
			
			XtextResourceSet resourceSet = new XtextResourceSet();
			XtextResource resource = (XtextResource) resourceSet.getResource(originalFile, true);
			MCommonPackageFile packageFile = (MCommonPackageFile)resource.getContents().get(0);
			MCommonPackageElement element = packageFile.getElement();
			
		    Diagnostic diagnostic = MICOBSUtilProvider.getMICOBSUtil().validateResource(resource, getModelAdapterFactory(packageFile));
			
		    if (diagnostic.getSeverity() != Diagnostic.OK)
		    {
				handleDiagnostic(diagnostic);
				return null;
		    }
			
			NewModelVersionWizard wizard = new NewModelVersionWizard(element.getName(), 
					(MCommonPackageItem)previousVersionedItem.eContainer(), model);
			WizardDialog dialog = new WizardDialog(shell, wizard);
			
			dialog.create();
			if (dialog.open() == WizardDialog.OK)
			{
				File newModel = new File(tmpFolder.getAbsolutePath() + File.separator + 
										 MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername") + 
										 File.separator +
										 StringHelper.toLowerDefString(element.getName()) + 
										 "." + modelExtension);
				try {
					svnClientAdapter.move(originalModel, newModel, true);
				} catch (SVNClientException e) {}
				
				URI destFile = URI.createFileURI(newModel.getAbsolutePath());
				XtextResource destRes = (XtextResource) resourceSet.getResource(destFile, true);
				MCommonPackageFile newPack = (MCommonPackageFile)destRes.getContents().get(0);
				MCommonPackageElement newElement = newPack.getElement();
				newElement.setVersion(wizard.getVersion());
				try {
					HashMap<Object, Object> saveOptions = new HashMap<Object, Object>();
					SaveOptions.defaultOptions().addTo(saveOptions);
					destRes.save(saveOptions);
				} catch (IOException e) {
					throw new ExecutionException(e.toString());
				}
				try {
					svnClientAdapter.copy(tmpFolder, wizard.getDestinationUrl(), "Initial branch commit");
				} catch (SVNClientException e) {
					throw new ExecutionException(e.toString());
				}
				
				remoteModelURI = wizard.getDestinationUrl().appendPath(MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername") + 
									 File.separator +
									 StringHelper.toLowerDefString(element.getName()) + 
									 "." + modelExtension).toString();
				
				String elementClassifier = packageFile.getElement().eClass().getName();
				String elementURI = packageFile.getElement().getUri();
				String elementVersion = packageFile.getElement().getVersion();
				
				ILibraryManager libraryManager;
				try {
					libraryManager = MESPLibraryManager.getLibraryManager();
				} catch (LibraryManagerException e) {
					throw new ExecutionException(e.toString());
				}
				
				// We have to make the copy of the file to the plug-in folder
				
				IPath destPath = libraryManager.getPlugin().getStateLocation().append(ILibraryManager.LIBRARY_FOLDER);
				destPath = destPath.append(ILibraryManager.PACKAGES_FOLDER);
				destPath = destPath.append(StringHelper.toLowerDefString(packageFile.getPackage().getUri()));
					
				destPath = destPath.append(UUID.nameUUIDFromBytes(StringHelper.toLowerDefString(
						elementClassifier, elementURI, elementVersion).getBytes()).toString() +
						"." + modelExtension);
				
				File pluginFile = new File(destPath.toOSString());
				
				try {
					if (pluginFile.isFile())
					{
						pluginFile.setWritable(true);
						pluginFile.delete();
					}
					FileHelper.copyBinaryFile(newModel.getAbsolutePath(), destPath.toOSString());
					pluginFile.setWritable(false);
					
				} catch (IOException e) {
					throw new ExecutionException(e.toString());
				}
				
				URI modelURI = URI.createPlatformPluginURI(
							libraryManager.getPlugin().getBundle().getSymbolicName() + "/" +
							ILibraryManager.LIBRARY_FOLDER + "/" +
							ILibraryManager.PACKAGES_FOLDER + "/" +
							StringHelper.toLowerDefString(packageFile.getPackage().getUri()) + "/" +
							UUID.nameUUIDFromBytes(StringHelper.toLowerDefString(elementClassifier, 
									elementURI, elementVersion).getBytes()).toString() +
							"." + modelExtension, true);

				MCommonPackageVersionedItem newItem;
				try {
					newItem = libraryManager.putElement(modelURI);
				} catch (LibraryManagerException e) {
					MessageDialog.openError(shell, "Add Element", e.getMessage());
					return null;
				}

				if (remoteModelURI != null)
				{
					newItem.setRemoteModelURI(remoteModelURI);
				}
				newItem.setRepositoryFolderURI(wizard.getDestinationUrl().toString());

				for (Iterator<EStructuralFeature> f = previousVersionedItem.eClass().getEAllStructuralFeatures().iterator(); f.hasNext(); )
				{
					EStructuralFeature feature = f.next();
					if (feature != commonPackage.eINSTANCE.getMCommonPackageVersionedItem_LocalModelURI() &&
						feature != commonPackage.eINSTANCE.getMCommonPackageVersionedItem_Version() &&
						feature != commonPackage.eINSTANCE.getMCommonPackageVersionedItem_RemoteModelURI() &&
						feature != commonPackage.eINSTANCE.getMCommonPackageVersionedItem_RepositoryFolderURI() &&
								previousVersionedItem.eGet(feature) != null)
					{
						newItem.eSet(feature, previousVersionedItem.eGet(feature));
					}
				}
			}
		}
		
		return null;
	}
	
	protected AdapterFactory getModelAdapterFactory(
			MCommonPackageFile packageFile) {
		if (packageFile instanceof MMESPOSSWPPackageFile)
		{
			return new mesposswpItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMESPOSSWIPackageFile)
		{
			return new mesposswiItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMESPPSWPPackageFile)
		{
			return new mesppswpItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMESPSWIPackageFile)
		{
			return new mespswiItemProviderAdapterFactory();
		}
		else if (packageFile instanceof MMESPSWPPackageFile)
		{
			return new mespswpItemProviderAdapterFactory();
		}
		else
		{
			return new mespdepItemProviderAdapterFactory();
		}
	}
	
	/**
	 * Handles the diagnostic of the given model file. If the file has any kind of error, the
	 * upload will be interrupted and a dialog will be shown with the cause.
	 * 
	 * @param diagnostic the diagnostic of the given model file.
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
			DiagnosticDialog.openProblem
				(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), title, message, diagnostic);
		}
	}

}
