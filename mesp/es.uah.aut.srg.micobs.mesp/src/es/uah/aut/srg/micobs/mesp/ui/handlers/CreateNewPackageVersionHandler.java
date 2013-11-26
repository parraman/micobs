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
package es.uah.aut.srg.micobs.mesp.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
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
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItemWithRepository;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.mesp.ui.wizards.NewModelVersionWizard;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
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
			MMESPPackageVersionedItemWithRepository item = (MMESPPackageVersionedItemWithRepository)selection.getFirstElement();
			
			Shell shell = HandlerUtil.getActiveShell(event);
			
			ISVNRepositoryLocation location;
			ISVNClientAdapter svnClientAdapter;
			File tmpFolder;
			SVNUrl repositoryUrl;
			SVNUrl remoteModelUrl;
			ISVNRemoteFile model;
			String remoteModelURI = item.getRemoteModelURI();
			String modelRemoteFolder = "";
			String modelRemoteFilename = "";
			String modelExtension = "";
			String repositoryFolderURI = item.getRepositoryFolderURI();

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
				MICOBSPlugin.INSTANCE.log(e);
				return null;
			} catch (SVNClientException e) {
				MICOBSPlugin.INSTANCE.log(e);
				return null;
			} catch (MalformedURLException e) {
				MICOBSPlugin.INSTANCE.log(e);
				return null;
			}

			File originalModel = new File(tmpFolder.getAbsolutePath() + File.separator +
					MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername") + 
					File.separator + modelRemoteFilename);
			URI originalFile = URI.createFileURI(originalModel.getAbsolutePath());
			
			XtextResourceSet resourceSet = new XtextResourceSet();
			XtextResource resource = (XtextResource) resourceSet.getResource(originalFile, true);
			MCommonPackageFile packageFile = (MCommonPackageFile)resource.getContents().get(0);
			MCommonPackageElement element = packageFile.getElement();
			
			NewModelVersionWizard wizard = new NewModelVersionWizard(element.getName(), model);
			WizardDialog dialog = new WizardDialog(shell, wizard);
			
			dialog.create();
			if (dialog.open() == WizardDialog.OK)
			{
				File newModel = new File(tmpFolder.getAbsolutePath() + File.separator + 
										 MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername") + 
										 File.separator +
										 StringHelper.toLowerDefString(element.getName(), wizard.getVersion()) + 
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
					MICOBSPlugin.INSTANCE.log(e);
					return null;
				}
				try {
					svnClientAdapter.copy(tmpFolder, wizard.getDestinationUrl(), "new model!");
				} catch (SVNClientException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		return null;
	}
	

}
