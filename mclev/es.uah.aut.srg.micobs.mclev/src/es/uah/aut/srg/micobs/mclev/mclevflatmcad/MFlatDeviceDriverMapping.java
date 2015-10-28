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

import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice;

/**
 * A representation of a device driver mapping defined on an MCLEV flat
 * deployment model.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping#getDeployedDevice <em>Deployed Device</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping#getSupportedDevice <em>Supported Device</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatDeviceDriverMapping()
 * @model
 * @generated
 */
public interface MFlatDeviceDriverMapping extends EObject {
	/**
	 * Returns the deployed device. This device will belong to one of the
	 * deployment platforms defined in the deployment model.
	 * @return the deployed device to which the driver is mapped.
	 * @see #setDeployedDevice(MDeployedDevice)
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatDeviceDriverMapping_DeployedDevice()
	 * @model required="true"
	 * @generated
	 */
	MDeployedDevice getDeployedDevice();

	/**
	 * Sets the deployed device that will be mapped to the driver.
	 * @param value the new deployed device.
	 * @see #getDeployedDevice()
	 * @generated
	 */
	void setDeployedDevice(MDeployedDevice value);

	/**
	 * Returns the supported device of the mapped driver. This supported device
	 * is the hook between the device and the driver.
	 * @return the supported device of the mapped driver.
	 * @see #setSupportedDevice(MDriverSLibSupportedDevice)
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatDeviceDriverMapping_SupportedDevice()
	 * @model required="true"
	 * @generated
	 */
	MDriverSLibSupportedDevice getSupportedDevice();

	/**
	 * Sets the supported device of the mapped driver.
	 * @param value the new supported device of the mapped driver.
	 * @see #getSupportedDevice()
	 * @generated
	 */
	void setSupportedDevice(MDriverSLibSupportedDevice value);

}