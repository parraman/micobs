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

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.pdl.MDevice;

/**
 * A representation of a device deployed onto a deployment platform of an MCAD
 * model.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice#getDevice <em>Device</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice#getParameterValueAssignments <em>ParameterValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeployedDevice()
 * @model
 * @generated
 */
public interface MDeployedDevice extends MCommonReferenceableObj {
	/**
	 * Returns the device that is being deployed.
	 * @return the deployed device.
	 * @see #setDevice(MDevice)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeployedDevice_Device()
	 * @model required="true"
	 * @generated
	 */
	MDevice getDevice();

	/**
	 * Sets the device to be deployed.
	 * @param value the new deployed device.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(MDevice value);

	/**
	 * Returns the list of value assignments to the parameters defined by the
	 * device that is being deployed.
	 * @return the list of value assignments to the device parameters.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMDeployedDevice_ParameterValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getParameterValueAssignments();

}