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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad;

import org.eclipse.emf.common.util.EList;

/**
 * A representation of a driver service library instance defined on an MCLEV
 * flat deployment model. It inherits from the model element corresponding to
 * the instance of a regular service library 
 * {@link MFlatServiceLibraryInstance}.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance#getDeviceDriverMappings <em>DeviceDriverMappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatDriverSLibInstance()
 * @model
 * @generated
 */
public interface MFlatDriverSLibInstance extends MFlatServiceLibraryInstance {
	/**
	 * Returns the list of mappings between the devices deployed on the
	 * different platforms and the driver.
	 * @return the list of device driver mappings.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatDriverSLibInstance_DeviceDriverMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MFlatDeviceDriverMapping> getDeviceDriverMappings();

}