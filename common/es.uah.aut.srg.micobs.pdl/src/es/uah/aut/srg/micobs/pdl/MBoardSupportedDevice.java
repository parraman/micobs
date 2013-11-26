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

import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MParameterValueExpression;

/**
 * A representation of a support relationship between a board and a device.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice#getDevice <em>Device</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMBoardSupportedDevice()
 * @model
 * @generated
 */
public interface MBoardSupportedDevice extends EObject {
	/**
	 * Returns the lower bound of the number of devices of the same type that
	 * can be deployed on the board.
	 * @return the lower bound of the number of deployable devices.
	 * @see #setLowerBound(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMBoardSupportedDevice_LowerBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getLowerBound();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(MParameterValueExpression value);

	/**
	 * Returns the upper bound of the number of devices of the same type that
	 * can be deployed on the board.
	 * @return the upper bound of the number of deployable devices.
	 * @see #setUpperBound(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMBoardSupportedDevice_UpperBound()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getUpperBound();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(MParameterValueExpression value);

	/**
	 * Returns the device that is part of the supported relationship.
	 * @return the device that is part of the supported relationship.
	 * @see #setDevice(MDevice)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMBoardSupportedDevice_Device()
	 * @model required="true"
	 * @generated
	 */
	MDevice getDevice();

	/**
	 * Sets the device that is part of the supported relationship.
	 * @param value the new value of the device that is part of the supported
	 * relationship.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(MDevice value);

}