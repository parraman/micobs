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
package es.uah.aut.srg.micobs.mesp.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;

import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.generator.util.MESPGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyOSSwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiFactory;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.adapter.LanguageAdapter;
import es.uah.aut.srg.micobs.system.adapter.LanguageAdapterFactory;
import es.uah.aut.srg.micobs.ui.wizards.EmptyMICOBSProjectWizard;
import es.uah.aut.srg.micobs.ui.wizards.IMICOBSProjectCreationPage;
import es.uah.aut.srg.modeling.util.file.FileHelper;

/**
 * Wizard that is used to create an empty operating system software interface project.
 * Depending on the selected language, the wizard will eventually trigger the appropriate
 * methods that will create the initial skeleton of the project and the initial
 * set of files.
 *
 */
public class EmptyOSSwInterfaceRepositoryWizard extends EmptyMICOBSProjectWizard {

	private MMESPOSSWIPackageFile osswiPackageFile;

	private ReferencingMESPProjectCreationPage mespProjectCreationPage;

	public EmptyOSSwInterfaceRepositoryWizard() {
		super(MESPPlugin.INSTANCE.getString("_UI_EmptyOSSwInterfaceRepository_Wizard_label"));
	}
	
	@Override
	protected EObject createModel(IMICOBSProjectCreationPage projectCreationPage)
	{
		osswiPackageFile = mesposswiFactory.eINSTANCE.createMMESPOSSWIPackageFile();
		MOSSwInterface osswi = mesposswiFactory.eINSTANCE.createMOSSwInterface();
		osswiPackageFile.setPackage(mespProjectCreationPage.getSelectedPackage());
		osswi.setName(mespProjectCreationPage.getModelName());
		osswi.setVersion(mespProjectCreationPage.getVersion());
		osswi.setReferencedElement((MOperatingSystemAPI) mespProjectCreationPage.getSelectedElement());
		osswiPackageFile.setElement(osswi);
		
		return osswiPackageFile;
	}

	@Override
	protected void generateFiles(EObject model, IContainer newProject,
			IProgressMonitor monitor) throws InvocationTargetException {

		try {
			MESPGeneratorUtil.generateDefaultMOSSwInterface(newProject.getLocation().toPortableString() + "/" +
				MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"), 
				osswiPackageFile,
				new NullProgressMonitor());
		} catch (Exception e)
		{
			MESPPlugin.INSTANCE.log(e);
		}
		
		MOSSwInterface osswi = (MOSSwInterface)osswiPackageFile.getElement();
		MOperatingSystemAPI osapi = (MOperatingSystemAPI) osswi.getReferencedElement();
		
		LanguageAdapter adapter = LanguageAdapterFactory.getAdapterFactory().getAdapter(osapi.getLanguage());
		if (adapter != null)
		{
			IEmptyOSSwInterfaceRepositoryCreator creator = (IEmptyOSSwInterfaceRepositoryCreator)adapter.adapt(IEmptyOSSwInterfaceRepositoryCreator.class);
			if (creator != null)
			{
				creator.generateFiles(osswiPackageFile, newProject, monitor);
			}
		}
	}

	@Override
	protected void createFolders(EObject model, IContainer newProject, IProgressMonitor monitor) {
		
		FileHelper.createFolder(newProject,
				MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"));
		
		MOSSwInterface osswi = (MOSSwInterface)osswiPackageFile.getElement();
		MOperatingSystemAPI osapi = (MOperatingSystemAPI) osswi.getReferencedElement();
		
		LanguageAdapter adapter = LanguageAdapterFactory.getAdapterFactory().getAdapter(osapi.getLanguage());
		if (adapter != null)
		{
			IEmptyOSSwInterfaceRepositoryCreator creator = (IEmptyOSSwInterfaceRepositoryCreator)adapter.adapt(IEmptyOSSwInterfaceRepositoryCreator.class);
			if (creator != null)
			{
				creator.createFolders(osswiPackageFile, newProject, monitor);
			}
		}
	}

	@Override
	public IMICOBSProjectCreationPage addProjectCreationPage(IStructuredSelection selection) {
		
		try {
			mespProjectCreationPage = new ReferencingMESPProjectCreationPage("OSSwInterfaceRepositoryCreationPage", 
					selection, null, MESPLibraryManager.getLibraryManager().getAllPackages(), 
					null,
					PDLLibraryManager.getLibraryManager().getAllElementsOfClass(pdlPackage.eINSTANCE.getMOperatingSystemAPI()));
		} catch (LibraryManagerException e) {
			MESPPlugin.INSTANCE.log(e);
			return null;
		}
		mespProjectCreationPage.setTitle(MESPPlugin.INSTANCE.getString("_UI_NewOSSwInterfaceEmptyRepositoryWizardPageTitle"));
		mespProjectCreationPage.setDescription(MESPPlugin.INSTANCE.getString("_UI_NewOSSwInterfaceEmptyRepositoryWizardPageDescription"));
		mespProjectCreationPage.setModelLabel("OS Software Interface:");
		mespProjectCreationPage.setElementDialogTitle("Operating System API Selection");
		mespProjectCreationPage.setElementDialogMessage("Select the attached operating system API:");
		mespProjectCreationPage.setElementErrorMessage("An operating system API has to be selected");
		mespProjectCreationPage.setElementLabel("Operating System API:");
		mespProjectCreationPage.setElementButtonLabel("Select OSAPI");
		
		return mespProjectCreationPage;
	}

}
