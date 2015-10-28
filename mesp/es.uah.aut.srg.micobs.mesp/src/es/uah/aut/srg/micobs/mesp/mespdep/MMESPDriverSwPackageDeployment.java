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
package es.uah.aut.srg.micobs.mesp.mespdep;

import org.eclipse.emf.common.util.EList;

/**
 * A representation of a driver software package deployed as part of a
 * deployment alternative or of the root of a deployment model.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment#getDeviceDriverAssignments <em>Device Driver Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDriverSwPackageDeployment()
 * @model
 * @generated
 */
public interface MMESPDriverSwPackageDeployment extends MMESPSwPackageDeployment {
	/**
	 * Returns the list of device driver mappings defined between the
	 * driver software package's supported devices and the deployed ones.
	 * @return the list of device driver mappings.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDriverSwPackageDeployment_DeviceDriverMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MMESPDeviceDriverMapping> getDeviceDriverMappings();

}
