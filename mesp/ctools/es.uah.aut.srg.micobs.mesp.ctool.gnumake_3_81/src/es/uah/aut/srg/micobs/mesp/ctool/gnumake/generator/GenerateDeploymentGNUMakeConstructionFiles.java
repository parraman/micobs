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
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mesp.ctool.gnumake.generator.util.GNUMakeGeneratorUtil;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake.plugin.GNUMakePlugin;
import es.uah.aut.srg.micobs.mesp.mespctool.generator.ui.handlers.GenerateDeploymentConstructionFiles;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.util.ui.MESPUtilUI;

/**
 * Handler of the command that generates the construction files of an
 * application from its deployment model.
 *
 */
public class GenerateDeploymentGNUMakeConstructionFiles extends GenerateDeploymentConstructionFiles {

	@Override
	protected List<IResource> getResourcesToErase(IContainer rootFolder,
			EObject model) throws CoreException {
		return new ArrayList<IResource>();
	}

	@Override
	protected void generateResources(EObject model, IContainer rootFolder,
			IProgressMonitor monitor) {
		
		MMESPDeployment deployment = (MMESPDeployment) ((MMESPDEPPackageFile)model).getElement();
		
		if (deployment.getDeploymentAlternatives().isEmpty())
		{
			MMESPDeploymentPlatform deploymentPlatform = 
				MESPUtilUI.selectDeploymentPlatform(shell, deployment);
			if (deploymentPlatform == null)
			{
				return;
			}
			try{
				GNUMakeGeneratorUtil.generateConstructionFiles(
					rootFolder.getLocation().toPortableString(), 
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
				
				GNUMakeGeneratorUtil.generateConstructionFiles(
					rootFolder.getLocation().toPortableString(), 
					deployment,
					deploymentAlternative,
					deploymentPlatform,
					new NullProgressMonitor());
			} catch (Exception e)
			{
				GNUMakePlugin.INSTANCE.log(e);
			}
		}
		// Ensure that the folders are created! :)
		GNUMakeGeneratorUtil.createConfigFolders(deployment, rootFolder);
		try {
			
			GNUMakeGeneratorUtil.generateConfigurationFiles(rootFolder.getLocation().toPortableString(), 
				deployment,
				new NullProgressMonitor());
		} catch (Exception e)
		{
			GNUMakePlugin.INSTANCE.log(e);
		}
		
	}
}
