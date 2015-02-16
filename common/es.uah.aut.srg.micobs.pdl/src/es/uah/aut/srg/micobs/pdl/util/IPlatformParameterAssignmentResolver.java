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
package es.uah.aut.srg.micobs.pdl.util;

import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.util.IParameterAssignmentResolver;

public interface IPlatformParameterAssignmentResolver extends
		IParameterAssignmentResolver {

	
	/**
	 * Returns the platform that will be used to deploy the system.
	 * @return the platform.
	 */
	public MPlatform getPlatform();
	
}
