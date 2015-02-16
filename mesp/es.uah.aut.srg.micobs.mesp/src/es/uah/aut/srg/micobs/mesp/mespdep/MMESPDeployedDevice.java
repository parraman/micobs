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

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.pdl.MDevice;

/**
 * A representation of a device deployed onto a deployment platform.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice#getDevice <em>Device</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice#getParameterValueAssignments <em>Parameter Value Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeployedDevice()
 * @model
 * @generated
 */
public interface MMESPDeployedDevice extends MCommonReferenceableObj {
	/**
	 * Returns the device that is being deployed.
	 * @return the reference to the device.
	 * @see #setDevice(MDevice)
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeployedDevice_Device()
	 * @model required="true"
	 * @generated
	 */
	MDevice getDevice();

	/**
	 * Sets the device that is being deployed.
	 * @param value the new device reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(MDevice value);

	/**
	 * Returns the list of value assignments to the parameters defined by the
	 * device that is being deployed. 
	 * @return the list of parameter value assignments..
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#getMMESPDeployedDevice_ParameterValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getParameterValueAssignments();

}
