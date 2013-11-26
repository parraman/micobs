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
package es.uah.aut.srg.micobs.pdl.util;

import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MPlatform;

public interface IPDLStringHelper {

	/**
	 * Returns the proper name of an operating system supported platform.
	 * @param ossp the operating system supported platform.
	 * @return the proper name the supported platform.
	 */
	public String getProperName(MOSSupportedPlatform ossp);

	/**
	 * Returns the proper name of a platform.
	 * @param platform the platform.
	 * @return the proper name the platform.
	 */
	public String getProperName(MPlatform platform);

}