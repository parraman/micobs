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
 * A representation of an integer literal. This class represents a literal
 * of an enumerated definition which has an associated integer value.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MEnumParamIntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMEnumParamIntegerLiteral()
 * @model
 * @generated
 */
public interface MEnumParamIntegerLiteral extends MEnumParameterLiteral {
	/**
	 * Returns the integer value associated with the literal.
	 * @return the integer value associated with the literal.
	 * @see #setValue(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMEnumParamIntegerLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the integer value associated with the literal.
	 * @param value the new integer value associated with the literal.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

}
