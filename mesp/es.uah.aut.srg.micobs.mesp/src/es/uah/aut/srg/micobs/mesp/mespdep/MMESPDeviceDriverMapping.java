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
package es.uah.aut.srg.micobs.mesp.mespdep;

import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;

/**
 * A representation of a mapping between a deployed device and a driver
 * software package supported device.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping#getDeployedDevice <em>Deployed Device</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping#getSupportedDevice <em>Supported Device</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeviceDriverMapping()
 * @model
 * @generated
 */
public interface MMESPDeviceDriverMapping extends EObject {
	/**
	 * Returns the reference to the deployed device that will be mapped to
	 * the driver software package supported device.
	 * @return the reference to the mapped deployed device.
	 * @see #setDeployedDevice(MMESPDeployedDevice)
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeviceDriverMapping_DeployedDevice()
	 * @model required="true"
	 * @generated
	 */
	MMESPDeployedDevice getDeployedDevice();

	/**
	 * Sets the reference to the deployed device that will be mapped to
	 * the driver software package supported device.
	 * @param value the new value of the reference to the mapped deployed device.
	 * @see #getDeployedDevice()
	 * @generated
	 */
	void setDeployedDevice(MMESPDeployedDevice value);

	/**
	 * Returns the reference to the driver software package supported device
	 * that will be mapped to a deployed device.
	 * @return the reference to the mapped driver software package supported
	 * device.
	 * @see #setSupportedDevice(MDriverSwPackageSupportedDevice)
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeviceDriverMapping_SupportedDevice()
	 * @model required="true"
	 * @generated
	 */
	MDriverSwPackageSupportedDevice getSupportedDevice();

	/**
	 * Sets the reference to the driver software package supported device
	 * that will be mapped to a deployed device.
	 * @param value the new value of the reference to the mapped driver
	 * software package supported device.
	 * @see #getSupportedDevice()
	 * @generated
	 */
	void setSupportedDevice(MDriverSwPackageSupportedDevice value);

}
