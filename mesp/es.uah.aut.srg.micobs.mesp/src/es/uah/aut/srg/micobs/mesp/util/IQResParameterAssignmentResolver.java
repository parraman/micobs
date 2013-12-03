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
package es.uah.aut.srg.micobs.mesp.util;

import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.pdl.util.IPlatformParameterAssignmentResolver;

public interface IQResParameterAssignmentResolver extends
		IPlatformParameterAssignmentResolver {

	/**
	 * Returns the quantifiable resource that is being demanded.
	 * @return the quantifiable resource.
	 */
	public MQuantifiableResource getResource();
	
	
	/**
	 * Returns the sum of the demands of a specific resource.
	 * If the resource is not being demanded, it must return 0.
	 * @param resource the demanded resource.
	 * @return the amount of resource that is being demanded.
	 */
	public Long getSumDemands(MQuantifiableResource resource);
}
