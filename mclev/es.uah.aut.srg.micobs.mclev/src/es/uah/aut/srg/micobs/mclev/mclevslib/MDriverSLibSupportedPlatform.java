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
package es.uah.aut.srg.micobs.mclev.mclevslib;

import org.eclipse.emf.common.util.EList;

/**
 * A representation of a driver service library supported platform.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedPlatform#getSupportedDevices <em>Supported Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMDriverSLibSupportedPlatform()
 * @model
 * @generated
 */
public interface MDriverSLibSupportedPlatform extends MServiceLibrarySupportedPlatform {
	/**
	 * Returns the list of devices supported by the device service library
	 * for the given platform.
	 * @return the list of supported devices.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMDriverSLibSupportedPlatform_SupportedDevices()
	 * @model containment="true"
	 * @generated
	 */
	EList<MDriverSLibSupportedDevice> getSupportedDevices();

}