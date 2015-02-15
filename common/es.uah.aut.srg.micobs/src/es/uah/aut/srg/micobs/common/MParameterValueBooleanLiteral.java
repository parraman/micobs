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
 * A representation of a boolean literal value that is part of a parameter value
 * assignment expression.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueBooleanLiteral#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueBooleanLiteral()
 * @model
 * @generated
 */
public interface MParameterValueBooleanLiteral extends MParameterValueLiteral {
	/**
	 * Returns the boolean literal value.
	 * @return the boolean literal value.
	 * @see #setValue(boolean)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueBooleanLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the boolean literal value.
	 * @param value the new boolean literal value.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

}
