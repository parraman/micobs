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
 * A representation of a string literal. This class represents a literal
 * of an enumerated definition which has an associated string.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MEnumParamStringLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMEnumParamStringLiteral()
 * @model
 * @generated
 */
public interface MEnumParamStringLiteral extends MEnumParameterLiteral {
	/**
	 * Returns the string associated with the literal.
	 * @return the string associated with the literal.
	 * @see #setValue(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMEnumParamStringLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the string associated with the literal.
	 * @param value the new string associated with the literal.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

}
