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
 * A representation of a string literal value that is part of a parameter value
 * assignment expression.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueStringLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueStringLiteral()
 * @model
 * @generated
 */
public interface MParameterValueStringLiteral extends MParameterValueLiteral {
	/**
	 * Returns the string literal value.
	 * @return the string literal value.
	 * @see #setValue(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueStringLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the string literal value.
	 * @param value the new string literal value.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

}
