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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * A representation of the literals of the enumeration corresponding to the
 * two possible operations of an {@link MParameterValueTERM}
 * expression.
 * 
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueTERMOperators()
 * @model
 * @generated
 */
public enum MParameterValueTERMOperators implements Enumerator {
	/**
	 * The '<em><b>Mult</b></em>' literal object.
	 * @see #MULT_VALUE
	 * @generated
	 * @ordered
	 */
	MULT(0, "mult", "mult"),

	/**
	 * The '<em><b>Div</b></em>' literal object.
	 * @see #DIV_VALUE
	 * @generated
	 * @ordered
	 */
	DIV(1, "div", "div");

	/**
	 * The '<em><b>Mult</b></em>' literal value.
	 * @see #MULT
	 * @model name="mult"
	 * @generated
	 * @ordered
	 */
	public static final int MULT_VALUE = 0;

	/**
	 * The '<em><b>Div</b></em>' literal value.
	 * @see #DIV
	 * @model name="div"
	 * @generated
	 * @ordered
	 */
	public static final int DIV_VALUE = 1;

	/**
	 * An array of all the '<em><b>MParameterValueTERMOperators</b></em>' enumerators.
	 * @generated
	 */
	private static final MParameterValueTERMOperators[] VALUES_ARRAY =
		new MParameterValueTERMOperators[] {
			MULT,
			DIV,
		};

	/**
	 * A public read-only list of all the '<em><b>MParameterValueTERMOperators</b></em>' enumerators.
	 * @generated
	 */
	public static final List<MParameterValueTERMOperators> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MParameterValueTERMOperators</b></em>' literal with the specified literal value.
	 * @generated
	 */
	public static MParameterValueTERMOperators get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MParameterValueTERMOperators result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MParameterValueTERMOperators</b></em>' literal with the specified name.
	 * @generated
	 */
	public static MParameterValueTERMOperators getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MParameterValueTERMOperators result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MParameterValueTERMOperators</b></em>' literal with the specified integer value.
	 * @generated
	 */
	public static MParameterValueTERMOperators get(int value) {
		switch (value) {
			case MULT_VALUE: return MULT;
			case DIV_VALUE: return DIV;
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
	private MParameterValueTERMOperators(int value, String name, String literal) {
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