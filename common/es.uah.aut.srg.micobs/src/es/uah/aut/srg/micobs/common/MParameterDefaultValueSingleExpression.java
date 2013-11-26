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
 * A abstract representation of a parameter whose default value is a single
 * expression.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterDefaultValueSingleExpression#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterDefaultValueSingleExpression()
 * @model abstract="true"
 * @generated
 */
public interface MParameterDefaultValueSingleExpression extends MParameter {
	
	/**
	 * Returns the default value of the parameter.
	 * @return the default value of the parameter.
	 * @see #setDefaultValue(MParameterValueExpression)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterDefaultValueSingleExpression_DefaultValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MParameterValueExpression getDefaultValue();

	/**
	 * Sets the default value of the integer parameter.
	 * @param value the new default value of the integer parameter.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(MParameterValueExpression value);

}