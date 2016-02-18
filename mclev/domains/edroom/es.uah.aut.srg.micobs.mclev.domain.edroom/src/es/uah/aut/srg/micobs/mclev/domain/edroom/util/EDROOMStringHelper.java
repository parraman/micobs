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
package es.uah.aut.srg.micobs.mclev.domain.edroom.util;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;

public class EDROOMStringHelper {

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
