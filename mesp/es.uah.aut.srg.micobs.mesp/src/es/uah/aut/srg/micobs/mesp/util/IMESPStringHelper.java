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
package es.uah.aut.srg.micobs.mesp.util;

import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;

public interface IMESPStringHelper {

	/**
	 * Returns the proper name of a software package supported platform.
	 * @param swpsp the software package supported platform.
	 * @return the proper name the supported platform.
	 */
	public String getProperName(MSwPackageSupportedPlatform swpsp);

	
}