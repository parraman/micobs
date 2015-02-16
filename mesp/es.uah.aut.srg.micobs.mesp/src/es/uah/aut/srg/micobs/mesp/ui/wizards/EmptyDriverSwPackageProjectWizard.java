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
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptySwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpFactory;
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
 * Wizard that is used to create an empty driver software package project.
 * Depending on the selected languages, the wizard will eventually trigger the appropriate
 * methods that will create the initial skeleton of the project and the initial
 * set of files.
 *
 */
public class EmptyDriverSwPackageProjectWizard extends EmptyMICOBSProjectWizard {

	private MMESPSWPPackageFile swpPackageFile;

	private MESPProjectCreationPage mespProjectCreationPage;

	public EmptyDriverSwPackageProjectWizard() {
		super(MESPPlugin.INSTANCE.getString("_UI_EmptyDriverSwPackageProject_Wizard_label"));
	}
	
	@Override
	protected EObject createModel(IMICOBSProjectCreationPage projectCreationPage)
	{
		swpPackageFile = mespswpFactory.eINSTANCE.createMMESPSWPPackageFile();
		MDriverSwPackage driver = mespswpFactory.eINSTANCE.createMDriverSwPackage();
		swpPackageFile.setPackage(mespProjectCreationPage.getSelectedPackage());
		driver.setName(mespProjectCreationPage.getModelName());
		driver.setVersion(mespProjectCreationPage.getVersion());
		driver.getLanguages().addAll(mespProjectCreationPage.getSelectedLanguages());
		driver.getCtools().addAll(mespProjectCreationPage.getSelectedConstructionTools());
		swpPackageFile.setElement(driver);
		
		return swpPackageFile;
	}

	@Override
	protected void generateFiles(EObject model, IContainer newProject,
			IProgressMonitor monitor) throws InvocationTargetException {

		try {
			MESPGeneratorUtil.generateDefaultMDriverSwPackage(newProject.getLocation().toPortableString() + "/" +
				MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"), 
				swpPackageFile,
				new NullProgressMonitor());
		} catch (Exception e)
		{
			MESPPlugin.INSTANCE.log(e);
		}
		
		MDriverSwPackage driver = (MDriverSwPackage)swpPackageFile.getElement();
		for (MLanguage language : driver.getLanguages())
		{
			LanguageAdapter adapter = LanguageAdapterFactory.getAdapterFactory().getAdapter(language);
			if (adapter != null)
			{
				IEmptySwPackageProjectCreator creator = (IEmptySwPackageProjectCreator)adapter.adapt(IEmptySwPackageProjectCreator.class);
				if (creator != null)
				{
					creator.generateFiles(swpPackageFile, newProject, monitor);
				}
			}
		}
	}

	@Override
	protected void createFolders(EObject model, IContainer newProject, IProgressMonitor monitor) {
		
		FileHelper.createFolder(newProject,
				MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"));
		
		MDriverSwPackage driver = (MDriverSwPackage)swpPackageFile.getElement();
		
		for (MLanguage language : driver.getLanguages())
		{
			LanguageAdapter adapter = LanguageAdapterFactory.getAdapterFactory().getAdapter(language);
			if (adapter != null)
			{
				IEmptySwPackageProjectCreator creator = (IEmptySwPackageProjectCreator)adapter.adapt(IEmptySwPackageProjectCreator.class);
				if (creator != null)
				{
					creator.createFolders(swpPackageFile, newProject, monitor);
				}
			}
		}

	}

	@Override
	public IMICOBSProjectCreationPage addProjectCreationPage(IStructuredSelection selection) {
		
		Set<MLanguage> languages = new HashSet<MLanguage>();
		Set<MConstructionTool> ctools = new HashSet<MConstructionTool>();
		
		try {
			
			for (MCommonPackageElement language : SystemLibraryManager.getLibraryManager().getAllElementsOfClass(systemPackage.eINSTANCE.getMLanguage()))
			{
				languages.add((MLanguage) language);
			}
			
			for (MCommonPackageElement ctool : MESPLibraryManager.getLibraryManager().getAllElementsOfClass(mespctoolPackage.eINSTANCE.getMConstructionTool()))
			{
				ctools.add((MConstructionTool) ctool);
			}
			
			mespProjectCreationPage = new MESPProjectCreationPage("DriverSwPackageProjectCreationPage", 
					selection, languages, MESPLibraryManager.getLibraryManager().getAllPackages(), 
					ctools);
			
			mespProjectCreationPage.setTitle(MESPPlugin.INSTANCE.getString("_UI_NewDriverSwPackageEmptyProjectWizardPageTitle"));
			mespProjectCreationPage.setDescription(MESPPlugin.INSTANCE.getString("_UI_NewDriverSwPackageEmptyProjectWizardPageDescription"));
			mespProjectCreationPage.setModelLabel("Driver:");
			mespProjectCreationPage.setSelectMultipleCTools(true);
			mespProjectCreationPage.setSelectMultipleLanguages(true);
			
		} catch (LibraryManagerException e) {
			MESPPlugin.INSTANCE.log(e);
			return null;
		}

		
		return mespProjectCreationPage;
	}

}
