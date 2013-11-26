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
package es.uah.aut.srg.micobs.pdl;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MParameter;


/**
 * A representation of a board.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MBoard#getMicroprocessor <em>Microprocessor</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMBoard()
 * @model
 * @generated
 */
public interface MBoard extends MPDLPackageElement {
	/**
	 * Returns the microprocessor deployed in the board.
	 * @return the microprocessor deployed in the board.
	 * @see #setMicroprocessor(MMicroprocessor)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMBoard_Microprocessor()
	 * @model required="true"
	 * @generated
	 */
	MMicroprocessor getMicroprocessor();

	/**
	 * Sets the microprocessor deployed in the board.
	 * @param value the new microprocessor deployed in the board.
	 * @see #getMicroprocessor()
	 * @generated
	 */
	void setMicroprocessor(MMicroprocessor value);

	/**
	 * Returns the list of parameters defined by the board.
	 * @return the list of parameters.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMBoard_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParameters();

	/**
	 * Returns the list of devices supported by the board.
	 * @return the list of supported devices.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMBoard_SupportedDevices()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBoardSupportedDevice> getSupportedDevices();

}
