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
package es.uah.aut.srg.micobs.common;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of an expression used to assign a value of a parameter.
 * The expression is formed of a left value, a right value and an operation.
 * This operation can be either a sum or a difference. The right value can
 * be another MParameterValueExpression object or <code>null</code> if
 * only has a left value. The left value shall be an
 * {@link MParameterValueTERM} object.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueExpression#getOperation <em>Operation</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueExpression()
 * @model
 * @generated
 */
public interface MParameterValueExpression extends EObject {
	/**
	 * Returns the left value of the expression.
	 * @return the left value of the expression.
	 * @see #setLeft(MParameterValueTERM)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueTERM getLeft();

	/**
	 * Sets the left value of the expression.
	 * @param value the new left value of the expression.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(MParameterValueTERM value);

	/**
	 * Returns the operation of the expression.
	 * @return the operation of the expression.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueExpressionOperators
	 * @see #setOperation(MParameterValueExpressionOperators)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueExpression_Operation()
	 * @model
	 * @generated
	 */
	MParameterValueExpressionOperators getOperation();

	/**
	 * Sets the operation of the expression.
	 * @param value the new operation of the expression.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueExpressionOperators
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(MParameterValueExpressionOperators value);

	/**
	 * Returns the right part of the expression or <code>null</code> if it
	 * only has a left part.
	 * @return the right part of the expression or <code>null</code> if it
	 * only has a left part.
	 * @see #setRight(MParameterValueExpression)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueExpression_Right()
	 * @model containment="true"
	 * @generated
	 */
	MParameterValueExpression getRight();

	/**
	 * Sets the right part of the expression.
	 * @param value the new right part of the expression.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(MParameterValueExpression value);

}