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

import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice;

/**
 * A representation of a mapping between a deployed device and a driver
 * service library supported device.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping#getDeployedDevice <em>DeployedDevice</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping#getSupportedDevice <em>SupportedDevice</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeviceDriverMapping()
 * @model
 * @generated
 */
public interface MDeviceDriverMapping extends EObject {
	/**
	 * Returns the reference to the deployed device that will be mapped to
	 * the driver service library supported device.
	 * @return the reference to the mapped deployed device.
	 * @see #setDeployedDevice(MDeployedDevice)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeviceDriverMapping_DeployedDevice()
	 * @model required="true"
	 * @generated
	 */
	MDeployedDevice getDeployedDevice();

	/**
	 * Sets the reference to the deployed device that will be mapped to
	 * the driver service library supported device.
	 * @param value the new value of the reference to the mapped deployed device.
	 * @see #getDeployedDevice()
	 * @generated
	 */
	void setDeployedDevice(MDeployedDevice value);

	/**
	 * Returns the reference to the driver service library supported device
	 * that will be mapped to a deployed device.
	 * @return the reference to the mapped driver service library supported
	 * device.
	 * @see #setSupportedDevice(MDriverSLibSupportedDevice)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeviceDriverMapping_SupportedDevice()
	 * @model required="true"
	 * @generated
	 */
	MDriverSLibSupportedDevice getSupportedDevice();

	/**
	 * Sets the reference to the driver service library supported device
	 * that will be mapped to a deployed device.
	 * @param value the new value of the reference to the mapped driver
	 * service library supported device.
	 * @see #getSupportedDevice()
	 * @generated
	 */
	void setSupportedDevice(MDriverSLibSupportedDevice value);

}