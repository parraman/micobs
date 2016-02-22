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
package es.uah.aut.srg.micobs.mesp.ctool.gnumake.generator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mesp.ctool.gnumake.generator.util.GNUMakeGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake.plugin.GNUMakePlugin;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake.util.GNUMakeStringHelper;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.provider.mespdepItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.util.ui.MESPUtilUI;
import es.uah.aut.srg.micobs.ui.handlers.GenerateResourcesHandler;

/**
 * Handler of the command that creates the folders for the main code
 * of an application from its deployment model.
 *
 */
public class CreateMainFolders extends GenerateResourcesHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return null;
	}

	@Override
	protected List <IResource> getResourcesToErase(IContainer rootFolder,
			EObject model) throws CoreException {
		
		return new ArrayList<IResource>();
	}

	@Override
	protected void generateResources(EObject model, IContainer rootFolder,
			IProgressMonitor monitor) {
		
		MMESPDeployment deployment = (MMESPDeployment) ((MMESPDEPPackageFile)model).getElement();
		
		GNUMakeGeneratorUtil.createMainFolders(deployment, rootFolder);
		
		if (deployment.getDeploymentAlternatives().isEmpty())
		{
			MMESPDeploymentPlatform deploymentPlatform = 
				MESPUtilUI.selectDeploymentPlatform(shell, deployment);
			if (deploymentPlatform == null)
			{
				return;
			}
			try{
				GNUMakeGeneratorUtil.generateMainTemplateFiles(
					rootFolder.getFolder(
						new Path(GNUMakeStringHelper.getMainFolder())).getLocation().toPortableString(), 
					deployment,
					null,
					deploymentPlatform,
					new NullProgressMonitor());
			} catch (Exception e)
			{
				GNUMakePlugin.INSTANCE.log(e);
			}
		}
		else
		{
			MMESPDeploymentAlternative deploymentAlternative = 
					MESPUtilUI.selectLeafAlternative(shell, deployment);
			if (deploymentAlternative == null)
			{
				return;
			}
			MMESPDeploymentPlatform deploymentPlatform = 
					MESPUtilUI.selectDeploymentPlatform(shell, deploymentAlternative);
			if (deploymentPlatform == null)
			{
				return;
			}
			try {
				
				GNUMakeGeneratorUtil.generateMainTemplateFiles(
					rootFolder.getFolder(
						new Path(GNUMakeStringHelper.getMainFolder())).getLocation().toPortableString(), 
					deployment,
					deploymentAlternative,
					deploymentPlatform,
					new NullProgressMonitor());
			} catch (Exception e)
			{
				GNUMakePlugin.INSTANCE.log(e);
			}
		}
		
		try {
			GNUMakeGeneratorUtil.generateMainConstructionFiles(
					rootFolder.getFolder(
						new Path(GNUMakeStringHelper.getMainFolder())).getLocation().toPortableString(), 
				deployment,
				new NullProgressMonitor());
		} catch (Exception e)
		{
			GNUMakePlugin.INSTANCE.log(e);
		}

	}

	@Override
	protected String getModelClassErrorMessage() {
		return GNUMakePlugin.INSTANCE.getString("_UI_CreateMainFolders_ModelClassError_message");
	}

	@Override
	protected EClass getModelEClass() {
		return mespdepPackage.eINSTANCE.getMMESPDEPPackageFile();
	}

	@Override
	protected AdapterFactory getItemProviderAdapterFactory() {
		return new mespdepItemProviderAdapterFactory();
	}

}
