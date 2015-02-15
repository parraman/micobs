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


/**
 * A representation of a single-expression parameter value assignment.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueAssignmentSingleExpression#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueAssignmentSingleExpression()
 * @model
 * @generated
 */
public interface MParameterValueAssignmentSingleExpression extends MParameterValueAssignment {
	/**
	 * Returns the expression that represents the value assigned to the
	 * parameter.
	 * @return the parameter value assignment expression.
	 * @see #setParameterValue(MParameterValueExpression)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueAssignmentSingleExpression_ParameterValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getParameterValue();

	/**
	 * Sets the expression that represents the value assigned to the parameter.
	 * @param value the new parameter value assignment expression.
	 * @see #getParameterValue()
	 * @generated
	 */
	void setParameterValue(MParameterValueExpression value);

}