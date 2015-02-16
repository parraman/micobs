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
import es.uah.aut.srg.micobs.mesp.lang.generator.IEmptyPlatformSwPackageProjectCreator;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpFactory;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.pdl.MCompilerFrontend;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.adapter.LanguageAdapter;
import es.uah.aut.srg.micobs.system.adapter.LanguageAdapterFactory;
import es.uah.aut.srg.micobs.ui.wizards.EmptyMICOBSProjectWizard;
import es.uah.aut.srg.micobs.ui.wizards.IMICOBSProjectCreationPage;
import es.uah.aut.srg.modeling.util.file.FileHelper;

/**
 * Wizard that is used to create an empty platform software package project.
 * Depending on the selected languages, the wizard will eventually trigger the appropriate
 * methods that will create the initial skeleton of the project and the initial
 * set of files.
 *
 */
public class EmptyPlatformSwPackageProjectWizard extends EmptyMICOBSProjectWizard {

	private MMESPPSWPPackageFile pswpPackageFile;
	private ReferencingMESPProjectCreationPage mespProjectCreationPage;
	
	public EmptyPlatformSwPackageProjectWizard() {
		super(MESPPlugin.INSTANCE.getString("_UI_EmptyPlatformSwPackageProject_Wizard_label"));
	}

	@Override
	protected EObject createModel(IMICOBSProjectCreationPage projectCreationPage)
	{
		pswpPackageFile = mesppswpFactory.eINSTANCE.createMMESPPSWPPackageFile();
		MPlatformSwPackage pswp = mesppswpFactory.eINSTANCE.createMPlatformSwPackage();
		pswpPackageFile.setPackage(mespProjectCreationPage.getSelectedPackage());
		pswp.setName(mespProjectCreationPage.getModelName());
		pswp.setVersion(mespProjectCreationPage.getVersion());
		pswp.setReferencedElement(mespProjectCreationPage.getSelectedElement());
		pswp.getCtools().addAll(mespProjectCreationPage.getSelectedConstructionTools());
		pswpPackageFile.setElement(pswp);
		
		return pswpPackageFile;
		
	}
	
	@Override
	protected void generateFiles(EObject model, IContainer newProject,
			IProgressMonitor monitor) throws InvocationTargetException {

		monitor.beginTask("Generating files", 100);//$NON-NLS-1$
		
		try {
			MESPGeneratorUtil.generateDefaultMPlatformSwPackage(newProject.getLocation().toPortableString() + "/" +
				MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"), 
				pswpPackageFile,
				new NullProgressMonitor());
		} catch (Exception e)
		{
			MESPPlugin.INSTANCE.log(e);
		}
	
		MPlatformSwPackage dep = (MPlatformSwPackage)pswpPackageFile.getElement();
		MPlatform platform = (MPlatform)dep.getReferencedElement();
		
		for (MCompilerFrontend frontend : platform.getCompiler().getFrontends())
		{
			LanguageAdapter adapter = LanguageAdapterFactory.getAdapterFactory().getAdapter(frontend.getLanguage());
			if (adapter != null)
			{
				IEmptyPlatformSwPackageProjectCreator creator = (IEmptyPlatformSwPackageProjectCreator)adapter.adapt(IEmptyPlatformSwPackageProjectCreator.class);
				if (creator != null)
				{
					creator.generateFiles(pswpPackageFile, newProject, monitor);
				}
			}
		}
		
		monitor.done();
		
	}

	@Override
	protected void createFolders(EObject model, IContainer project, IProgressMonitor monitor) {

		monitor.beginTask("Creating folders", 100);//$NON-NLS-1$
		
		// And create the models foldername
		FileHelper.createFolder(project,
				MESPPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"));
		
		MPlatformSwPackage dep = (MPlatformSwPackage)pswpPackageFile.getElement();
		MPlatform platform = (MPlatform)dep.getReferencedElement();
		
		for (MCompilerFrontend frontend : platform.getCompiler().getFrontends())
		{
			LanguageAdapter adapter = LanguageAdapterFactory.getAdapterFactory().getAdapter(frontend.getLanguage());
			if (adapter != null)
			{
				IEmptyPlatformSwPackageProjectCreator creator = (IEmptyPlatformSwPackageProjectCreator)adapter.adapt(IEmptyPlatformSwPackageProjectCreator.class);
				if (creator != null)
				{
					creator.createFolders(pswpPackageFile, project, monitor);
				}
			}
		}
		
		monitor.done();

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
					PDLLibraryManager.getLibraryManager().getAllElementsOfClass(pdlPackage.eINSTANCE.getMPlatform()));
		} catch (LibraryManagerException e) {
			MESPPlugin.INSTANCE.log(e);
			return null;
		}
		mespProjectCreationPage.setTitle(MESPPlugin.INSTANCE.getString("_UI_NewPlatformSwPackageEmptyProjectWizardPageTitle"));
		mespProjectCreationPage.setDescription(MESPPlugin.INSTANCE.getString("_UI_NewPlatformSwPackageEmptyProjectWizardPageDescription"));
		mespProjectCreationPage.setModelLabel("Platform SwPackage:");
		mespProjectCreationPage.setSelectMultipleCTools(true);
		mespProjectCreationPage.setElementDialogTitle("Platform Selection");
		mespProjectCreationPage.setElementDialogMessage("Select the attached platform:");
		mespProjectCreationPage.setElementErrorMessage("A platform has to be selected");
		mespProjectCreationPage.setElementLabel("Platform:");
		mespProjectCreationPage.setElementButtonLabel("Select Platform");
		
		return mespProjectCreationPage;
	}

}
