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
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyOSSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpFactory;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.adapter.LanguageAdapter;
import es.uah.aut.srg.micobs.system.adapter.LanguageAdapterFactory;
import es.uah.aut.srg.micobs.ui.wizards.EmptyMICOBSProjectWizard;
import es.uah.aut.srg.micobs.ui.wizards.IMICOBSProjectCreationPage;
import es.uah.aut.srg.modeling.util.file.FileHelper;

/**
 * Wizard that is used to create an empty operating system software package project.
 * Depending on the selected languages, the wizard will eventually trigger the appropriate
 * methods that will create the initial skeleton of the project and the initial
 * set of files.
 *
 */
public class EmptyOSSwPackageProjectWizard extends EmptyMICOBSProjectWizard {
	
	public EmptyOSSwPackageProjectWizard() {
		super(MESPPlugin.INSTANCE.getString("_UI_EmptyOSSwPackageProject_Wizard_name"));
	}

	private MMESPOSSWPPackageFile osswpPackageFile;
	private ReferencingMESPProjectCreationPage mespProjectCreationPage;
	
	@Override
	protected EObject createModel(IMICOBSProjectCreationPage projectCreationPage)
	{	
		osswpPackageFile = mesposswpFactory.eINSTANCE.createMMESPOSSWPPackageFile();
		MOSSwPackage osswp = mesposswpFactory.eINSTANCE.createMOSSwPackage();
		osswpPackageFile.setPackage(mespProjectCreationPage.getSelectedPackage());
		osswp.setName(mespProjectCreationPage.getModelName());
		osswp.setVersion(mespProjectCreationPage.getVersion());
		osswp.setReferencedElement(mespProjectCreationPage.getSelectedElement());
		osswp.getCtools().addAll(mespProjectCreationPage.getSelectedConstructionTools());
		osswpPackageFile.setElement(osswp);
		
		return osswpPackageFile;
	}
	
	@Override
	protected void generateFiles(EObject model, IContainer newProject,
			IProgressMonitor monitor) throws InvocationTargetException {
		
		try {
			MESPGeneratorUtil.generateDefaultMOSSwPackage(newProject.getLocation().toPortableString() + "/" +
				MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"), 
				osswpPackageFile,
				new NullProgressMonitor());
		} catch (Exception e)
		{
			MESPPlugin.INSTANCE.log(e);
		}

		MOSSwPackage osswp = (MOSSwPackage)osswpPackageFile.getElement();
		MOperatingSystem os = (MOperatingSystem)osswp.getReferencedElement();
		for (MLanguage language : os.getLanguages())
		{
			LanguageAdapter adapter = LanguageAdapterFactory.getAdapterFactory().getAdapter(language);
			if (adapter != null)
			{
				IEmptyOSSwPackageProjectCreator creator = (IEmptyOSSwPackageProjectCreator)adapter.adapt(IEmptyOSSwPackageProjectCreator.class);
				if (creator != null)
				{
					creator.generateFiles(osswpPackageFile, newProject, monitor);
				}
			}
		}
	}

	@Override
	protected void createFolders(EObject model, IContainer newProject, IProgressMonitor monitor) {

		FileHelper.createFolder(newProject,
				MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"));
		
		MOSSwPackage osswp = (MOSSwPackage)osswpPackageFile.getElement();
		MOperatingSystem os = (MOperatingSystem)osswp.getReferencedElement();
		
		for (MLanguage language : os.getLanguages())
		{
			LanguageAdapter adapter = LanguageAdapterFactory.getAdapterFactory().getAdapter(language);
			if (adapter != null)
			{
				IEmptyOSSwPackageProjectCreator creator = (IEmptyOSSwPackageProjectCreator)adapter.adapt(IEmptyOSSwPackageProjectCreator.class);
				if (creator != null)
				{
					creator.createFolders(osswpPackageFile, newProject, monitor);
				}
			}
		}

	}

	@Override
	public IMICOBSProjectCreationPage addProjectCreationPage(IStructuredSelection selection) {
		
		Set<MConstructionTool> ctools = new HashSet<MConstructionTool>();

		try {
			
			for (MCommonPackageElement ctool : MESPLibraryManager.getLibraryManager().getAllElementsOfClass(mespctoolPackage.eINSTANCE.getMConstructionTool()))
			{
				ctools.add((MConstructionTool) ctool);
			}
			
			mespProjectCreationPage = new ReferencingMESPProjectCreationPage("ProjectCreationPage", 
					selection, null, MESPLibraryManager.getLibraryManager().getAllPackages(), ctools,
					PDLLibraryManager.getLibraryManager().getAllElementsOfClass(pdlPackage.eINSTANCE.getMOperatingSystem()));
		} catch (LibraryManagerException e) {
			MESPPlugin.INSTANCE.log(e);
			return null;
		}
		mespProjectCreationPage.setTitle(MESPPlugin.INSTANCE.getString("_UI_NewOSSwPackageEmptyProjectWizardPageTitle"));
		mespProjectCreationPage.setDescription(MESPPlugin.INSTANCE.getString("_UI_NewOSSwPackageEmptyProjectWizardPageDescription"));
		mespProjectCreationPage.setModelLabel("OS SwPackage:");
		mespProjectCreationPage.setSelectMultipleCTools(true);
		mespProjectCreationPage.setElementDialogTitle("Operating System Selection");
		mespProjectCreationPage.setElementDialogMessage("Select the attached operating system:");
		mespProjectCreationPage.setElementErrorMessage("An operating system has to be selected");
		mespProjectCreationPage.setElementLabel("Operating System:");
		mespProjectCreationPage.setElementButtonLabel("Select OS");
		
		return mespProjectCreationPage;
	}


	
}
