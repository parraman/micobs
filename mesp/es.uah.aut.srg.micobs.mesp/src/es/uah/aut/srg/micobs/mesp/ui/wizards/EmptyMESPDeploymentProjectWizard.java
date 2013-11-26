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
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.adapter.ConstructionToolAdapter;
import es.uah.aut.srg.micobs.mesp.mespctool.adapter.ConstructionToolAdapterFactory;
import es.uah.aut.srg.micobs.mesp.mespctool.generator.IEmptyMESPDeploymentProjectCreator;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepFactory;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.ui.wizards.EmptyMICOBSProjectWizard;
import es.uah.aut.srg.micobs.ui.wizards.IMICOBSProjectCreationPage;
import es.uah.aut.srg.modeling.util.file.FileHelper;

/**
 * Wizard that is used to create an empty MESP deployment project. Depending on the 
 * selected construction tool, the wizard will eventually trigger the appropriate
 * methods that will create the initial skeleton of the project and the initial
 * set of files.
 *
 */
public class EmptyMESPDeploymentProjectWizard extends
		EmptyMICOBSProjectWizard {

	public EmptyMESPDeploymentProjectWizard() {
		super(MESPPlugin.INSTANCE.getString("_UI_EmptyMESPDeploymentProject_Wizard_name"), true);
	}
	
	private MMESPDEPPackageFile depPackageFile;
	
	private MESPProjectCreationPage mespProjectCreationPage;

	@Override
	protected EObject createModel(IMICOBSProjectCreationPage projectCreationPage)
	{
		depPackageFile = mespdepFactory.eINSTANCE.createMMESPDEPPackageFile();
		MMESPDeployment dep = mespdepFactory.eINSTANCE.createMMESPDeployment();
		depPackageFile.setPackage(mespProjectCreationPage.getSelectedPackage());
		dep.setName(mespProjectCreationPage.getModelName());
		dep.setVersion(mespProjectCreationPage.getVersion());
		dep.getLanguages().addAll(mespProjectCreationPage.getSelectedLanguages());
		dep.setCtool(mespProjectCreationPage.getSelectedCTool());
		depPackageFile.setElement(dep);
		
		return depPackageFile;
	}

	@Override
	protected void generateFiles(EObject model, IContainer newProject,
			IProgressMonitor monitor) throws InvocationTargetException {
		
		try {
			MESPGeneratorUtil.generateDefaultMMESPDeployment(newProject.getLocation().toPortableString() + "/" +
				MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"), 
				depPackageFile,
				new NullProgressMonitor());
		} catch (Exception e)
		{
			MESPPlugin.INSTANCE.log(e);
		}
		
		
		MMESPDeployment dep = (MMESPDeployment)depPackageFile.getElement();
		ConstructionToolAdapter adapter = ConstructionToolAdapterFactory.INSTANCE.getAdapter(dep.getCtool());
		if (adapter != null)
		{
			IEmptyMESPDeploymentProjectCreator creator = (IEmptyMESPDeploymentProjectCreator)adapter.adapt(IEmptyMESPDeploymentProjectCreator.class);
			if (creator != null)
			{
				creator.generateFiles(depPackageFile, newProject, monitor);
			}
		}
	}

	@Override
	protected void createFolders(EObject model, IContainer newProject, IProgressMonitor monitor) {

		FileHelper.createFolder(newProject,
				MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"));

		MMESPDeployment dep = (MMESPDeployment)depPackageFile.getElement();
		ConstructionToolAdapter adapter = ConstructionToolAdapterFactory.INSTANCE.getAdapter(dep.getCtool());
		if (adapter != null)
		{
			IEmptyMESPDeploymentProjectCreator creator = (IEmptyMESPDeploymentProjectCreator)adapter.adapt(IEmptyMESPDeploymentProjectCreator.class);
			if (creator != null)
			{
				creator.createFolders(depPackageFile, newProject, monitor);
			}
		}
	}

	@Override
	public IMICOBSProjectCreationPage addProjectCreationPage(IStructuredSelection selection) {
		
		Set<MLanguage> languages = new HashSet<MLanguage>();
		Set<MConstructionTool> ctools = new HashSet<MConstructionTool>();
		
		try {
			
			for (MCommonPackageElement ctool : MESPLibraryManager.getLibraryManager().getAllElementsOfClass(mespctoolPackage.eINSTANCE.getMConstructionTool()))
			{
				ctools.add((MConstructionTool) ctool);
			}
			for (MCommonPackageElement language : SystemLibraryManager.getLibraryManager().getAllElementsOfClass(systemPackage.eINSTANCE.getMLanguage()))
			{
				languages.add((MLanguage) language);
			}
			
			mespProjectCreationPage = new MESPProjectCreationPage("DeploymentProjectCreationPage", 
					selection, languages, MESPLibraryManager.getLibraryManager().getAllPackages(), 
					ctools);
		} catch (LibraryManagerException e) {
			MESPPlugin.INSTANCE.log(e);
			return null;
		}
		mespProjectCreationPage.setTitle(MESPPlugin.INSTANCE.getString("_UI_NewMESPDeploymentEmptyProjectWizardPageTitle"));
		mespProjectCreationPage.setDescription(MESPPlugin.INSTANCE.getString("_UI_NewMESPDeploymentEmptyProjectWizardPageDescription"));
		mespProjectCreationPage.setModelLabel("Deployment project:");
		mespProjectCreationPage.setSelectMultipleLanguages(true);
		
		return mespProjectCreationPage;
	}

	
}
