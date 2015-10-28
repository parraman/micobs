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
package es.uah.aut.srg.micobs.mclev.mclevmcad;

import org.eclipse.emf.common.util.EList;

/**
 * A representation of a driver service library package deployed as part of a
 * deployment alternative or of the root of an MCAD model.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance#getDeviceDriverMappings <em>Device Driver Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDriverSLibInstance()
 * @model
 * @generated
 */
public interface MDriverSLibInstance extends MServiceLibraryInstance {
	/**
	 * Returns the list of device driver mappings defined between the
	 * driver service library's supported devices and the deployed ones.
	 * @return the list of device driver mappings.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDriverSLibInstance_DeviceDriverMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MDeviceDriverMapping> getDeviceDriverMappings();

}