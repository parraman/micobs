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
package es.uah.aut.srg.micobs.mesp.ctool.gnumake.util;

import java.util.HashSet;
import java.util.Set;

import es.uah.aut.srg.micobs.mesp.ctool.gnumake.plugin.GNUMakePlugin;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Helper functions for string management.
 *
 */
public class GNUMakeStringHelper {
	
	/**
	 * Returns the name of the operating system software packages linking
	 * folder.
	 * @return the osswpackages linking folder.
	 */
	public static String getOSSwPackagesFolder() {
		return GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_osswpackages_foldername");
	}
	
	/**
	 * Returns the name of the software packages linking folder.
	 * @return the swpackages linking folder.
	 */
	public static String getSwPackagesFolder() {
		return GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_swpackages_foldername");
	}

	/**
	 * Returns the name of the operating system software interfaces linking
	 * folder.
	 * @return the osswinterfaces linking folder.
	 */
	public static String getOSSwInterfacesFolder() {
		return GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_osswinterfaces_foldername");
	}
	
	/**
	 * Returns the name of the software interfaces linking folder.
	 * @return the osswinterfaces linking folder.
	 */
	public static String getSwInterfacesFolder() {
		return GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_swinterfaces_foldername");
	}

	/**
	 * Returns the name of the platform software packages linking folder.
	 * @return the pswpackages linking folder.
	 */
	public static String getPlatformSwPackagesFolder() {
		return GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_platformswpackages_foldername");
	}

	/**
	 * Returns the main folder of the project.
	 * @return the main folder.
	 */
	public static String getMainFolder() {
		return GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_main_foldername");
	}

	/**
	 * Returns the config folder of the project.
	 * @return the config folder.
	 */
	public static String getConfigFolder() {
		return GNUMakePlugin.INSTANCE.getString("_MESPDeploymentProject_config_foldername");
	}
	
	/**
	 * Returns the project folder name of a platform software package.
	 * 
	 * @param platform the deployment platform that deploys the platform
	 * software package.
	 * @return the corresponding folder name.
	 */
	public static String getPlatformSwPackageFolderName(
			MMESPDeploymentPlatform platform)
	{
		return StringHelper.toLowerDefString(
				MESPStringHelper.getDefault().getElementName(platform.getPlatformSwPackage()));
	}

	/**
	 * Returns the project folder name of an operating system software
	 * package.
	 * 
	 * @param osswp the operating system software package.
	 * @return the corresponding folder name.
	 */
	public static String getOSSwPackageFolderName(
			MOSSwPackage osswp)
	{
		return StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(osswp));
	}

	
	/**
	 * Returns the project folder name of a software package.
	 * 
	 * @param swpd the object that represents the deployment of the
	 * software package.
	 * @return the corresponding folder name.
	 */
	public static String getSwPackageFolderName(
			MMESPSwPackageDeployment swpd)
	{
		return StringHelper.toLowerDefString(MESPStringHelper.getDefault().getElementName(swpd.getSwPackage()));
	}
	
	/**
	 * Returns the generic project folder name of a pair alternative-platform.
	 * This folder name is used in the main and configuration folders.
	 * 
	 * @param deployment the deployment model.
	 * @param alternative the selected alternative.
	 * @param platform the selected deployment platform.
	 * @return the corresponding project folder name.
	 */
	public static String getDeploymentFolderName(MMESPDeployment deployment, 
			MMESPDeploymentAlternative alternative, 
			MMESPDeploymentPlatform platform)
	{
		return getTargetName(deployment, alternative, platform);
	}
	
	/**
	 * Returns the target name of a pair alternative-platform.
	 * 
	 * This name is used by default for the main, binary configuration folders.
	 * 
	 * @param deployment the deployment model.
	 * @param alternative the selected alternative.
	 * @param platform the selected deployment platform.
	 * @return the corresponding target name.
	 */
	public static String getTargetName(MMESPDeployment deployment, 
			MMESPDeploymentAlternative alternative, 
			MMESPDeploymentPlatform platform)
	{
		if (alternative == null)
		{
			return StringHelper.toLowerDefString(
					MESPStringHelper.getDefault().getFullObjectNameToElementWithoutVersion(platform));
		}
		else if (alternative.getName() != null)
		{
			return StringHelper.toLowerDefString(
					MESPStringHelper.getDefault().getFullObjectNameToElementWithoutVersion(alternative), 
					platform.getName());
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Returns the set of main project folder names for a given deployment
	 * model.
	 * 
	 * @param deployment the deployment model.
	 * @return the set of main project folder names for the alternatives
	 * and platforms.
	 */
	public static Set<String> getMainFolderNames(MMESPDeployment deployment)
	{
		Set<String> results = new HashSet<String>();
		
		if (deployment.getDeploymentAlternatives().isEmpty())
		{
			for (MMESPDeploymentPlatform platform : deployment.getDeploymentPlatforms())
			{
				results.add(getDeploymentFolderName(deployment,
						null, platform));
			}

		}
		else
		{
			for (MMESPDeploymentAlternative alternative : GNUMakeUtilProvider.getMESPUtil().getLeafDeploymentAlternatives(deployment))
			{
				for (MMESPDeploymentPlatform platform : alternative.getDeploymentPlatforms())
				{
					results.add(getDeploymentFolderName(deployment, alternative, platform));
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Returns the set of configuration project folder names for a given
	 * deployment model.
	 * 
	 * @param deployment the deployment model.
	 * @return the set of configuration project folder names for the
	 * alternatives and platforms.
	 */
	public static Set<String> getConfigFolderNames(MMESPDeployment deployment)
	{
		return getMainFolderNames(deployment);
	}
	
	/**
	 * The set of binary project folder names for a given
	 * deployment model.
	 * 
	 * @param deployment the deployment model.
	 * @return the set of binary folder names.
	 */
	public static Set<String> getBinaryFolderNames(MMESPDeployment deployment)
	{
		Set<String> results = new HashSet<String>();
		
		if (deployment.getDeploymentAlternatives().isEmpty())
		{
			for (MMESPDeploymentPlatform platform : deployment.getDeploymentPlatforms())
			{
				for (MMESPSwPackageDeployment swpd : deployment.getDeployedSwPackages())
				{
					results.add(getDeploymentFolderName(deployment,
							null, platform) + "/" +
							getSwPackagesFolder() + "/" +
							getSwPackageFolderName(swpd));
				}	
			}
		}
		else
		{
			for (MMESPDeploymentAlternative alternative : GNUMakeUtilProvider.getMESPUtil().getLeafDeploymentAlternatives(deployment))
			{
				for (MMESPDeploymentPlatform platform : alternative.getDeploymentPlatforms())
				{
					for (MMESPSwPackageDeployment swpd : GNUMakeUtilProvider.getMESPUtil().getAllDeployedSwPackagesFromAlternative(alternative))
					{
						results.add(getDeploymentFolderName(deployment,
								alternative, platform) + "/" +
								getSwPackagesFolder() + "/" +
								getSwPackageFolderName(swpd));
					}
				}
			}
		}
		
		return results;
	}

	
}
