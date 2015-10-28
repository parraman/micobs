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
package es.uah.aut.srg.micobs.mclev.ui.wizards;

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
import es.uah.aut.srg.micobs.mclev.generator.util.MCLEVGeneratorUtil;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.adapter.DomainAdapter;
import es.uah.aut.srg.micobs.mclev.mclevdom.adapter.DomainAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevdom.generator.IEmptyMCLEVDeploymentProjectCreator;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadFactory;
import es.uah.aut.srg.micobs.mclev.plugin.MCLEVPlugin;
import es.uah.aut.srg.micobs.ui.wizards.EmptyMICOBSProjectWizard;
import es.uah.aut.srg.micobs.ui.wizards.IMICOBSProjectCreationPage;
import es.uah.aut.srg.modeling.util.file.FileHelper;

/**
 * Wizard that is used to create an empty MCLEV deployment project from an
 * existing model file. Depending on the attached model, the wizard will
 * call the corresponding interface provided by the domain's plug-in using
 * the domain adapter factory.
 * TODO: Add the full wizard to the plugin.
 */
public class EmptyMCLEVDeploymentProjectWizard extends
		EmptyMICOBSProjectWizard {

	public EmptyMCLEVDeploymentProjectWizard() {
		super(MCLEVPlugin.INSTANCE.getString("_UI_EmptyMCLEVDeploymentProject_Wizard_name"), true);
	}
	
	private MMCLEVMCADPackageFile depPackageFile;
	
	private MCLEVProjectCreationPage mclevProjectCreationPage;

	@Override
	protected EObject createModel(IMICOBSProjectCreationPage projectCreationPage)
	{
		depPackageFile = mclevmcadFactory.eINSTANCE.createMMCLEVMCADPackageFile();
		MMCADeployment dep = mclevmcadFactory.eINSTANCE.createMMCADeployment();
		depPackageFile.setPackage(mclevProjectCreationPage.getSelectedPackage());
		dep.setName(mclevProjectCreationPage.getModelName());
		dep.setVersion(mclevProjectCreationPage.getVersion());
		dep.setDomain(mclevProjectCreationPage.getSelectedDomain());
		depPackageFile.setElement(dep);
		
		return depPackageFile;
	}

	@Override
	protected void generateFiles(EObject model, IContainer newProject,
			IProgressMonitor monitor) throws InvocationTargetException {
		
		try {
			MCLEVGeneratorUtil.generateDefaultMCADeployment(newProject.getLocation().toPortableString() + "/" +
				MCLEVPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"), 
				depPackageFile,
				new NullProgressMonitor());
		} catch (Exception e)
		{
			MCLEVPlugin.INSTANCE.log(e);
		}
		
		
		MMCADeployment dep = (MMCADeployment)depPackageFile.getElement();
		DomainAdapter adapter = DomainAdapterFactory.getAdapterFactory().getAdapter(dep.getDomain());
		if (adapter != null)
		{
			IEmptyMCLEVDeploymentProjectCreator creator = (IEmptyMCLEVDeploymentProjectCreator)adapter.adapt(IEmptyMCLEVDeploymentProjectCreator.class);
			if (creator != null)
			{
				creator.generateFiles(depPackageFile, newProject, monitor);
			}
		}
	}

	@Override
	protected void createFolders(EObject model, IContainer newProject, IProgressMonitor monitor) {

		FileHelper.createFolder(newProject,
				MCLEVPlugin.INSTANCE.getString("_MICOBSProject_models_foldername"));

		MMCADeployment dep = (MMCADeployment)depPackageFile.getElement();
		DomainAdapter adapter = DomainAdapterFactory.getAdapterFactory().getAdapter(dep.getDomain());
		if (adapter != null)
		{
			IEmptyMCLEVDeploymentProjectCreator creator = (IEmptyMCLEVDeploymentProjectCreator)adapter.adapt(IEmptyMCLEVDeploymentProjectCreator.class);
			if (creator != null)
			{
				creator.createFolders(depPackageFile, newProject, monitor);
			}
		}
	}

	@Override
	public IMICOBSProjectCreationPage addProjectCreationPage(IStructuredSelection selection) {
		
		Set<MDomain> domains = new HashSet<MDomain>();
		
		try {
			
			for (MCommonPackageElement domain : MCLEVLibraryManager.getLibraryManager().getAllElementsOfClass(mclevdomPackage.eINSTANCE.getMIODomain()))
			{
				if (DomainAdapterFactory.getAdapterFactory().getAdapter((MDomain) domain) != null &&
					DomainAdapterFactory.getAdapterFactory().getAdapter((MDomain) domain).isAdapterForType(IEmptyMCLEVDeploymentProjectCreator.class))
				{
					domains.add((MDomain) domain);
				}
			}
			
			mclevProjectCreationPage = new MCLEVProjectCreationPage("DeploymentProjectCreationPage", 
					selection, null,
					MCLEVLibraryManager.getLibraryManager().getAllPackages(), 
					domains);
		} catch (LibraryManagerException e) {
			MCLEVPlugin.INSTANCE.log(e);
			return null;
		}
		mclevProjectCreationPage.setTitle(MCLEVPlugin.INSTANCE.getString("_UI_NewMCLEVDeploymentEmptyProjectWizardPageTitle"));
		mclevProjectCreationPage.setDescription(MCLEVPlugin.INSTANCE.getString("_UI_NewMCLEVDeploymentEmptyProjectWizardPageDescription"));
		mclevProjectCreationPage.setModelLabel("Deployment project:");
		
		return mclevProjectCreationPage;
	}

}