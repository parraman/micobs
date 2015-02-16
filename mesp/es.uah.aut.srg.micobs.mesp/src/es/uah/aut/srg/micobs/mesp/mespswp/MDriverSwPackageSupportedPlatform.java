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
package es.uah.aut.srg.micobs.mesp.mespswp;

import org.eclipse.emf.common.util.EList;

/**
 * A representation of a driver software package supported platform.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform#getSupportedDevices <em>Supported Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMDriverSwPackageSupportedPlatform()
 * @model
 * @generated
 */
public interface MDriverSwPackageSupportedPlatform extends MSwPackageSupportedPlatform {
	/**
	 * Returns the value of the '<em><b>Supported Devices</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Devices</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMDriverSwPackageSupportedPlatform_SupportedDevices()
	 * @model containment="true"
	 * @generated
	 */
	EList<MDriverSwPackageSupportedDevice> getSupportedDevices();

} // MDriverSwPackageSupportedPlatform
