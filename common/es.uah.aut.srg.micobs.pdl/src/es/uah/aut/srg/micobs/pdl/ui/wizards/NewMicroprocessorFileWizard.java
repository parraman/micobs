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
package es.uah.aut.srg.micobs.pdl.ui.wizards;

import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;

import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MPDLPackageFile;
import es.uah.aut.srg.micobs.pdl.pdlFactory;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.generator.util.PDLGeneratorUtil;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.pdl.plugin.PDLPlugin;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.ui.wizards.MICOBSReferencingFileCreationPage;
import es.uah.aut.srg.micobs.ui.wizards.MICOBSResourceCreationPage;
import es.uah.aut.srg.micobs.ui.wizards.NewMICOBSFileWizard;
import es.uah.aut.srg.modeling.util.file.FileConverter;

/**
 * Wizard that automates the creation of a microprocessor model file.
 *
 */
public class NewMicroprocessorFileWizard extends NewMICOBSFileWizard {

	MICOBSReferencingFileCreationPage creationPage;
	
	@Override
	protected void initializeDefaultPageImageDescriptor() {
		
		URI iconURI = URI.createPlatformPluginURI("/es.uah.aut.srg.micobs.pdl/icons/full/wizban/PDLNewWizard.gif", true);
		try {
			ImageDescriptor desc = ImageDescriptor.createFromURL(
					FileConverter.platformPluginURItoURL(iconURI));
			setDefaultPageImageDescriptor(desc);
		} catch (IOException e) {
			MICOBSPlugin.INSTANCE.log(e);
		}
	}
	
	@Override
	protected void generateFile(MICOBSResourceCreationPage page,
			IProgressMonitor progressMonitor) {
		
		MPDLPackageFile pdlPackageFile = pdlFactory.eINSTANCE.createMPDLPackageFile();
		MMicroprocessor microprocessor = pdlFactory.eINSTANCE.createMMicroprocessor();
		pdlPackageFile.setPackage(creationPage.getSelectedPackage());
		microprocessor.setName(creationPage.getModelName());
		microprocessor.setVersion(creationPage.getVersion());
		microprocessor.setArchitecture((MArchitecture) creationPage.getSelectedElement());
		pdlPackageFile.setElement(microprocessor);

		try {
			PDLGeneratorUtil.generateDefaultMMicroprocessor(creationPage.getRootFolder().getLocation().toPortableString(), 
				pdlPackageFile,
				new NullProgressMonitor());
		} catch (Exception e)
		{
			PDLPlugin.INSTANCE.log(e);
		}
	}

	@Override
	protected String getFileExtension() {
		return PDLPlugin.INSTANCE.getString("_PDLEditorFilenameExtension");
	}

	@Override
	protected MICOBSResourceCreationPage getResourceCreationPage() {
		if (creationPage == null)
		{
			try {
				
				creationPage = new MICOBSReferencingFileCreationPage("MicroprocessorFileCreationPage",
						getFileExtension(), getInitialFolder(), null,
						PDLLibraryManager.getLibraryManager().getAllPackages(),
						PDLLibraryManager.getLibraryManager().getAllElementsOfClass(pdlPackage.eINSTANCE.getMArchitecture()));
				
				creationPage.setTitle(PDLPlugin.INSTANCE.getString("_UI_NewMicroprocessorFileWizardPageTitle"));
				creationPage.setDescription(PDLPlugin.INSTANCE.getString("_UI_NewMicroprocessorFileWizardPageDescription"));
				creationPage.setModelLabel("Microprocessor:");
				creationPage.setElementDialogTitle("Architecture Selection");
				creationPage.setElementDialogMessage("Select the microprocessor's architecture:");
				creationPage.setElementErrorMessage("An architecture has to be selected");
				creationPage.setElementLabel("Architecture:");
				creationPage.setElementButtonLabel("Select Arch");
				
			} catch (LibraryManagerException e) {
				PDLPlugin.INSTANCE.log(e);
				return null;
			}
		}
		return creationPage;
	}

}
