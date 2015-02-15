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
package es.uah.aut.srg.micobs.common;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of a left value second-level assignment operation. 
 * The expression is formed of a left value, a right value and an operation.
 * This operation can be either a multiplication or a division. The right value can
 * be another MParameterValueAssignmentTERM object or <code>null</code> if
 * only has a left value. The left value shall be an
 * {@link MParameterValue} object.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueTERM#getLeft <em>Left</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueTERM#getOperation <em>Operation</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueTERM#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueTERM()
 * @model
 * @generated
 */
public interface MParameterValueTERM extends EObject {
	/**
	 * Returns the left value of the expression.
	 * @return the left value of the expression.
	 * @see #setLeft(MParameterValue)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueTERM_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValue getLeft();

	/**
	 * Sets the left value of the expression.
	 * @param value the new left value of the expression.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(MParameterValue value);

	/**
	 * Returns the operation of the expression.
	 * @return the operation of the expression.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueTERMOperators
	 * @see #setOperation(MParameterValueTERMOperators)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueTERM_Operation()
	 * @model
	 * @generated
	 */
	MParameterValueTERMOperators getOperation();

	/**
	 * Sets the operation of the expression.
	 * @param value the new operation of the expression.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueTERMOperators
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(MParameterValueTERMOperators value);

	/**
	 * Returns the right part of the expression or <code>null</code> if it
	 * only has a left part.
	 * @return the right part of the expression or <code>null</code> if it
	 * only has a left part.
	 * @see #setRight(MParameterValueTERM)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueTERM_Right()
	 * @model containment="true"
	 * @generated
	 */
	MParameterValueTERM getRight();

	/**
	 * Sets the right part of the expression.
	 * @param value the new right part of the expression.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(MParameterValueTERM value);

}