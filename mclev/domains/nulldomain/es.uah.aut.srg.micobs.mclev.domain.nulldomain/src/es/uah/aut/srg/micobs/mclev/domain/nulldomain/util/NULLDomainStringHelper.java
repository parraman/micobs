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
package es.uah.aut.srg.micobs.mclev.domain.nulldomain.util;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

public class NULLDomainStringHelper {
	
	/**
	 * Returns the generic project folder name of a pair alternative-platform.
	 * This folder name is used in the main and configuration folders.
	 * 
	 * @param deployment the deployment model.
	 * @param alternative the selected alternative.
	 * @param platform the selected deployment platform.
	 * @return the corresponding project folder name.
	 */
	public static String getDeploymentFolderName(MMCADeployment deployment, 
			MDeploymentAlternative alternative, 
			MDeploymentPlatform platform)
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
	public static String getTargetName(MMCADeployment deployment, 
			MDeploymentAlternative alternative, 
			MDeploymentPlatform platform)
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
	 * Returns a string with the MESP relative target name of a parameter 
	 * defined by a service library.
	 * 
	 * @param slib the service library
	 * @param parameter the parameter
	 * @return the relative name of the parameter.
	 */
	public static String getMESPParameterName(MServiceLibrary slib, MParameter parameter)
	{
		if (slib.getAttributes().contains(parameter))
		{
			return parameter.getName();
		}
		for (MServiceLibrarySupportedPlatform slsp : slib.getSupportedPlatforms())
		{
			if (slsp.getAttributes().contains(parameter))
			{
				return MCLEVStringHelper.getDefault().getRelativeObjectName(parameter);
			}
		}

		if (MCLEVUtil.getDefault().getAllAttributes(slib).contains(parameter))
		{
			return MCLEVStringHelper.getDefault().getFullObjectNameToElement(parameter);
		}
		return null;
	}
	
}
