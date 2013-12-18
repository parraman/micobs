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
package es.uah.aut.srg.micobs.mesp.ctool.gnumake.generator.util;

import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake.plugin.GNUMakePlugin;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake.util.GNUMakeStringHelper;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.xpand.XpandUtil;

/**
 * Class that provides methods to launch model transformations on MESP models
 * that have attached the GNU Makefile Construction Tools.
 *
 */
public class GNUMakeGeneratorUtil {

	protected static EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
		@Override
		protected EPackage[] allPackages() {
			return new EPackage[] { EcorePackage.eINSTANCE, 
				commonPackage.eINSTANCE,
				systemPackage.eINSTANCE,
				pdlPackage.eINSTANCE,
				mespcommonPackage.eINSTANCE,
				mespctoolPackage.eINSTANCE,
				mesposswiPackage.eINSTANCE,
				mesposswpPackage.eINSTANCE,
				mespswiPackage.eINSTANCE,
				mespswpPackage.eINSTANCE,
				mesppswpPackage.eINSTANCE,
				mespdepPackage.eINSTANCE };
    	}
	};
	
	/**
	 * Creates the default project skeleton on a given workspace folder.
	 * 
	 * @param depPackageFile the root object of the deployment model file.
	 * @param rootFolder the root where the folders will be created.
	 */
	public static void createMESPDeploymentProjectSkeleton(MMESPDEPPackageFile depPackageFile, IContainer rootFolder)
	{
		FileHelper.createFolder(rootFolder,
				GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_swpackages_foldername"));
		
		FileHelper.createFolder(rootFolder,
				GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_osswpackages_foldername"));
		
		FileHelper.createFolder(rootFolder,
				GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_swinterfaces_foldername"));
		
		FileHelper.createFolder(rootFolder,
				GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_osswinterfaces_foldername"));
		
		FileHelper.createFolder(rootFolder,
				GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_platformswpackages_foldername"));

	}
	
	/**
	 * Creates the set of project main folders for a deployment model.
	 * 
	 * @param deployment the deployment model.
	 * @param rootFolder the root where the folders will be created.
	 */
	public static void createMainFolders(
			MMESPDeployment deployment, IContainer rootFolder)
	{
		for (String name : GNUMakeStringHelper.getMainFolderNames(deployment))
		{
			FileHelper.createFolder(rootFolder,
					GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_main_foldername") + "/" +
					name + "/" + GNUMakePlugin.INSTANCE.getString("_MESPPackageProject_include_foldername") + "/" +
					GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_main_foldername"));	

			FileHelper.createFolder(rootFolder,
					GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_main_foldername") + "/" +
					name + "/" + GNUMakePlugin.INSTANCE.getString("_MESPPackageProject_src_foldername"));	
		}
	}
	
	/**
	 * Creates the set of project configuration folders for a deployment model.
	 * 
	 * @param deployment the deployment model.
	 * @param rootFolder the root where the folders will be created.
	 */
	public static void createConfigFolders(
			MMESPDeployment deployment, IContainer rootFolder)
	{
		Set<String> mainFolderNames = GNUMakeStringHelper.getConfigFolderNames(deployment);
		for (String name : mainFolderNames)
		{
			FileHelper.createFolder(rootFolder,
					GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_config_foldername") + "/" +
					name + "/" + GNUMakePlugin.INSTANCE.getString("_MESPPackageProject_public_foldername"));	
		}
	}
	
	/**
	 * Launches a M2T transformation to generate a default construction file
	 * of a software package.
	 * 
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateMSwPackageDefsMk(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::BuildGNUMakeSwPackageDefsMk::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate a default construction file
	 * of an operating system software package.
	 * 
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateMOSSwPackageDefsMk(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::BuildGNUMakeOSSwPackageDefsMk::main",
			false);
	}

	/**
	 * Launches a M2T transformation to generate a default construction file
	 * of a platform software package.
	 * 
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateMPlatformSwPackageDefsMk(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::BuildGNUMakePlatformSwPackageDefsMk::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate the configuration files of
	 * a deployment project.
	 * 
	 * @param containerName the name of the container folder where the resulting
	 * files will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateConfigurationFiles(String containerName, 
			EObject model,
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::BuildGNUMakeDeploymentConfigurationFiles::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate the default construction
	 * files of the main code of a deployment project.
	 * 
	 * @param containerName the name of the container folder where the resulting
	 * files will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateMainConstructionFiles(String containerName, 
			EObject model,
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::BuildGNUMakeMainDefsMk::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate the construction
	 * files of a deployment project.
	 * 
	 * @param containerName the name of the container folder where the resulting
	 * files will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateConstructionFiles(String containerName, 
			EObject model,
			MMESPDeploymentAlternative alternative,
			MMESPDeploymentPlatform deploymentPlatform,
			IProgressMonitor monitor)
	{
			XpandUtil.generate(containerName, 
					model, 
					metamodel, 
					"template::BuildGNUMakeDeploymentMakefiles::main",
					false,
					alternative,
					deploymentPlatform);			
	}
}
