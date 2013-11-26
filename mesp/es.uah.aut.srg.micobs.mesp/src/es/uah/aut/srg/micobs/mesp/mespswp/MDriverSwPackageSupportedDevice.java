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
package es.uah.aut.srg.micobs.mesp.mespswp;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.pdl.MDevice;

/**
 * A representation of a device supported by a driver software package.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice#getRequired <em>Required</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice#getDevice <em>Device</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMDriverSwPackageSupportedDevice()
 * @model
 * @generated
 */
public interface MDriverSwPackageSupportedDevice extends MCommonReferenceableObj {
	/**
	 * Returns the value of the boolean parameter that indicates if the supported
	 * device is required (true) or optional (false).
	 * @return the value of the parameter that indicates if the supported device
	 * is required or optional.
	 * @see #setRequired(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMDriverSwPackageSupportedDevice_Required()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getRequired();

	/**
	 * Sets the value of the boolean parameter that indicates if the supported
	 * device is required (true) or optional (false).
	 * @param value the new value of the boolean parameter that indicates if the supported
	 * device is required (true) or optional (false).
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(MParameterValueExpression value);

	/**
	 * Returns the reference to the device that is being supported by the
	 * driver for a particular supported platform.
	 * @return the reference to the device that is being supported.
	 * @see #setDevice(MDevice)
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMDriverSwPackageSupportedDevice_Device()
	 * @model required="true"
	 * @generated
	 */
	MDevice getDevice();

	/**
	 * Sets the reference to the device that is being supported by the
	 * driver for a particular supported platform.
	 * @param value the new reference to the device that is being supported.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(MDevice value);

}