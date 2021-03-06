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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * A representation of the literals of the enumeration corresponding to the
 * two possible operations of an {@link MParameterValueExpression} expression.
 * 
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueExpressionOperators()
 * @model
 * @generated
 */
public enum MParameterValueExpressionOperators implements Enumerator {
	
	/**
	 * The '<em><b>Plus</b></em>' literal object.
	 * @see #PLUS_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS(0, "plus", "plus"),

	/**
	 * The '<em><b>Minus</b></em>' literal object.
	 * @see #MINUS_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS(1, "minus", "minus");

	/**
	 * The '<em><b>Plus</b></em>' literal value.
	 * @see #PLUS
	 * @model name="plus"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_VALUE = 0;

	/**
	 * The '<em><b>Minus</b></em>' literal value.
	 * @see #MINUS
	 * @model name="minus"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS_VALUE = 1;

	/**
	 * An array of all the '<em><b>MParameterValueExpressionOperators</b></em>' enumerators.
	 * @generated
	 */
	private static final MParameterValueExpressionOperators[] VALUES_ARRAY =
		new MParameterValueExpressionOperators[] {
			PLUS,
			MINUS,
		};

	/**
	 * A public read-only list of all the '<em><b>MParameterValueExpressionOperators</b></em>' enumerators.
	 * @generated
	 */
	public static final List<MParameterValueExpressionOperators> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MParameterValueExpressionOperators</b></em>' literal with the specified literal value.
	 * @generated
	 */
	public static MParameterValueExpressionOperators get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MParameterValueExpressionOperators result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MParameterValueExpressionOperators</b></em>' literal with the specified name.
	 * @generated
	 */
	public static MParameterValueExpressionOperators getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MParameterValueExpressionOperators result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MParameterValueExpressionOperators</b></em>' literal with the specified integer value.
	 * @generated
	 */
	public static MParameterValueExpressionOperators get(int value) {
		switch (value) {
			case PLUS_VALUE: return PLUS;
			case MINUS_VALUE: return MINUS;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private final int value;

	/**
	 * @generated
	 */
	private final String name;

	/**
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * @generated
	 */
	private MParameterValueExpressionOperators(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
}