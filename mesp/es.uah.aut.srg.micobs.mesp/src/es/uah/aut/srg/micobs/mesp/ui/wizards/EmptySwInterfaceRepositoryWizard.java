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
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.generator.util.MESPGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptySwInterfaceRepositoryCreator;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiFactory;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.micobs.system.adapter.LanguageAdapter;
import es.uah.aut.srg.micobs.system.adapter.LanguageAdapterFactory;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.ui.wizards.EmptyMICOBSProjectWizard;
import es.uah.aut.srg.micobs.ui.wizards.IMICOBSProjectCreationPage;
import es.uah.aut.srg.modeling.util.file.FileHelper;

/**
 * Wizard that is used to create an empty software interface project.
 * Depending on the selected language, the wizard will eventually trigger the appropriate
 * methods that will create the initial skeleton of the project and the initial
 * set of files.
 *
 */
public class EmptySwInterfaceRepositoryWizard extends EmptyMICOBSProjectWizard {

	private MMESPSWIPackageFile swInterfacePackageFile;

	private MESPProjectCreationPage mespProjectCreationPage;

	public EmptySwInterfaceRepositoryWizard() {
		super(MESPPlugin.INSTANCE.getString("_UI_EmptySwInterfaceRepository_Wizard_label"));
	}
	
	@Override
	protected EObject createModel(IMICOBSProjectCreationPage projectCreationPage)
	{
		swInterfacePackageFile = mespswiFactory.eINSTANCE.createMMESPSWIPackageFile();
		MSwInterface swInterface = mespswiFactory.eINSTANCE.createMSwInterface();
		swInterfacePackageFile.setPackage(mespProjectCreationPage.getSelectedPackage());
		swInterface.setName(mespProjectCreationPage.getModelName());
		swInterface.setVersion(mespProjectCreationPage.getVersion());
		swInterface.setLanguage(mespProjectCreationPage.getSelectedLanguage());
		swInterfacePackageFile.setElement(swInterface);
		
		return swInterfacePackageFile;
	}

	@Override
	protected void generateFiles(EObject model, IContainer newProject,
			IProgressMonitor monitor) throws InvocationTargetException {

		try {
			MESPGeneratorUtil.generateDefaultMSwInterface(newProject.getLocation().toPortableString() + "/" +
				MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"), 
				swInterfacePackageFile,
				new NullProgressMonitor());
		} catch (Exception e)
		{
			MESPPlugin.INSTANCE.log(e);
		}
		
		MSwInterface swInterface = (MSwInterface)swInterfacePackageFile.getElement();
		
		LanguageAdapter adapter = LanguageAdapterFactory.getAdapterFactory().getAdapter(swInterface.getLanguage());
		if (adapter != null)
		{
			IEmptySwInterfaceRepositoryCreator creator = (IEmptySwInterfaceRepositoryCreator)adapter.adapt(IEmptySwInterfaceRepositoryCreator.class);
			if (creator != null)
			{
				creator.generateFiles(swInterfacePackageFile, newProject, monitor);
			}
		}
	}

	@Override
	protected void createFolders(EObject model, IContainer newProject, IProgressMonitor monitor) {
		
		FileHelper.createFolder(newProject,
				MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"));
		
		MSwInterface swInterface = (MSwInterface)swInterfacePackageFile.getElement();
		
		LanguageAdapter adapter = LanguageAdapterFactory.getAdapterFactory().getAdapter(swInterface.getLanguage());
		if (adapter != null)
		{
			IEmptySwInterfaceRepositoryCreator creator = (IEmptySwInterfaceRepositoryCreator)adapter.adapt(IEmptySwInterfaceRepositoryCreator.class);
			if (creator != null)
			{
				creator.createFolders(swInterfacePackageFile, newProject, monitor);
			}
		}
	}

	@Override
	public IMICOBSProjectCreationPage addProjectCreationPage(IStructuredSelection selection) {
		
		Set<MLanguage> languages = new HashSet<MLanguage>();
		
		try {
			
			for (MCommonPackageElement language : SystemLibraryManager.getLibraryManager().getAllElementsOfClass(systemPackage.eINSTANCE.getMLanguage()))
			{
				if (LanguageAdapterFactory.getAdapterFactory().getAdapter((MLanguage) language) != null &&
					LanguageAdapterFactory.getAdapterFactory().getAdapter((MLanguage) language).isAdapterForType(IEmptySwInterfaceRepositoryCreator.class))
				{
					languages.add((MLanguage) language);
				}
			}
			
			mespProjectCreationPage = new MESPProjectCreationPage("SwInterfaceRepositoryCreationPage", 
					selection, languages,
					MESPLibraryManager.getLibraryManager().getAllPackages(), 
					null);
		} catch (LibraryManagerException e) {
			MESPPlugin.INSTANCE.log(e);
			return null;
		}
		mespProjectCreationPage.setTitle(MESPPlugin.INSTANCE.getString("_UI_NewSwInterfaceEmptyRepositoryWizardPageTitle"));
		mespProjectCreationPage.setDescription(MESPPlugin.INSTANCE.getString("_UI_NewSwInterfaceEmptyRepositoryWizardPageDescription"));
		mespProjectCreationPage.setModelLabel("Software Interface:");
		mespProjectCreationPage.setSelectMultipleLanguages(false);
		
		return mespProjectCreationPage;
	}

}
