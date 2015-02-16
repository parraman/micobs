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
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.MPDLPackageFile;
import es.uah.aut.srg.micobs.pdl.pdlFactory;
import es.uah.aut.srg.micobs.pdl.generator.util.PDLGeneratorUtil;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.pdl.plugin.PDLPlugin;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.ui.wizards.MICOBSResourceCreationPage;
import es.uah.aut.srg.micobs.ui.wizards.NewMICOBSFileWizard;
import es.uah.aut.srg.modeling.util.file.FileConverter;

/**
 * Wizard that automates the creation of an OSAPI model file.
 *
 */
public class NewOperatingSystemAPIFileWizard extends NewMICOBSFileWizard {

	MICOBSResourceCreationPage creationPage;
	
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
		MOperatingSystemAPI osapi = pdlFactory.eINSTANCE.createMOperatingSystemAPI();
		pdlPackageFile.setPackage(creationPage.getSelectedPackage());
		osapi.setName(creationPage.getModelName());
		osapi.setVersion(creationPage.getVersion());
		osapi.setLanguage(creationPage.getSelectedLanguage());
		pdlPackageFile.setElement(osapi);

		try {
			PDLGeneratorUtil.generateDefaultMOperatingSystemAPI(creationPage.getRootFolder().getLocation().toPortableString(), 
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
			Set<MLanguage> languages = new HashSet<MLanguage>();
			
			try {
				
				for (MCommonPackageElement language : SystemLibraryManager.getLibraryManager().getAllElementsOfClass(systemPackage.eINSTANCE.getMLanguage()))
				{
					languages.add((MLanguage) language);
				}
				creationPage = new MICOBSResourceCreationPage("OperatingSystemFileCreationPage",
						getFileExtension(), getInitialFolder(), languages, PDLLibraryManager.getLibraryManager().getAllPackages());
				
				creationPage.setTitle(PDLPlugin.INSTANCE.getString("_UI_NewOperatingSystemAPIFileWizardPageTitle"));
				creationPage.setDescription(PDLPlugin.INSTANCE.getString("_UI_NewOperatingSystemAPIFileWizardPageDescription"));
				creationPage.setModelLabel("Operating System API:");
				creationPage.setSelectMultipleLanguages(false);
				
			} catch (LibraryManagerException e) {
				PDLPlugin.INSTANCE.log(e);
				return null;
			}
		}
		return creationPage;
	}

}
