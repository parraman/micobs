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
package es.uah.aut.srg.micobs.mclev.util;

import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;

public interface IMCLEVStringHelper {

	/**
	 * Returns the relative object name of a target defined within a Flat MCAD
	 * model.
	 * @param target the target.
	 * @return the relative object name of the target.
	 */
	public String getRelativeObjectName(MFlatMCADTarget target);

	/**
	 * Returns the full object name of a target defined within a Flat MCAD
	 * model.
	 * @param target the target.
	 * @return the full object name of the target.
	 */
	public String getFullObjectNameToElement(MFlatMCADTarget target);

	/**
	 * Returns the proper name of an implementation-oriented domain supported
	 * platform.
	 * @param iodsp the supported platform.
	 * @return the proper name the supported platform.
	 */
	public String getProperName(MIODomainSupportedPlatform iodsp);

	/**
	 * Returns the proper name of a service library supported platform.
	 * @param swpsp the service library supported platform.
	 * @return the proper name the supported platform.
	 */
	public String getProperName(MServiceLibrarySupportedPlatform slsp);

	/**
	 * Returns the proper name of a component supported platform.
	 * @param swpsp the component supported platform.
	 * @return the proper name the supported platform.
	 */
	public String getProperName(MComponentSupportedPlatform cmpsp);

}