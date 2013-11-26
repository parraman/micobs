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


/**
 * A representation of a parameter value corresponding to an expression
 * between parenthesis <code>()</code>. The expression between the parenthesis
 * is represented as a contained {@link MParameterValueAssignmentExpression}
 * object.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValuePAR#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValuePAR()
 * @model
 * @generated
 */
public interface MParameterValuePAR extends MParameterValue {
	/**
	 * Returns the object corresponding to the expression between parenthesis.
	 * @return the object corresponding to the expression between parenthesis.
	 * @see #setValue(MParameterValueAssignmentExpression)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValuePAR_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getValue();

	/**
	 * Sets the object corresponding to the expression between parenthesis.
	 * @param value the new object corresponding to the expression between
	 * parenthesis.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(MParameterValueExpression value);

}
