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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * A representation of the literals of the enumeration '<em><b>EDROOMBasicType</b></em>'.
 * This enumeration represents the list of basic types supported by EDROOM which can
 * be used to define new variables.
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMBasicType()
 * @model
 * @generated
 */
public enum EDROOMBasicType implements Enumerator {
	/**
	 * '<em><b>TEDROOMBool</b></em>' basic type. Represents a boolean value.
	 * @see #TEDROOM_BOOL_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOM_BOOL(0, "TEDROOMBool", "TEDROOMBool"),

	/**
	 * '<em><b>TEDROOMByte</b></em>' basic type. Represents a one byte-sized value.
	 * @see #TEDROOM_BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOM_BYTE(1, "TEDROOMByte", "TEDROOMByte"),

	/**
	 * '<em><b>TEDROOMWord16</b></em>' basic type. Represents a 16-bit signed word value.
	 * @see #TEDROOM_WORD16_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOM_WORD16(2, "TEDROOMWord16", "TEDROOMWord16"),

	/**
	 * '<em><b>TEDROOMWord32</b></em>' basic type. Represents a 32-bit signed word value.
	 * @see #TEDROOM_WORD32_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOM_WORD32(3, "TEDROOMWord32", "TEDROOMWord32"),

	/**
	 * '<em><b>TEDROOMWord64</b></em>' basic type. Represents a 64-bit signed word value.
	 * @see #TEDROOM_WORD64_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOM_WORD64(4, "TEDROOMWord64", "TEDROOMWord64"),

	/**
	 * '<em><b>TEDROOMUInt8</b></em>' basic type. Represents an unsigned byte-sized integer value.
	 * @see #TEDROOMU_INT8_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOMU_INT8(5, "TEDROOMUInt8", "TEDROOMUInt8"),

	/**
	 * '<em><b>TEDROOMUInt16</b></em>' basic type. Represents a 16-bit unsigned integer value.
	 * @see #TEDROOMU_INT16_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOMU_INT16(6, "TEDROOMUInt16", "TEDROOMUInt16"),

	/**
	 * '<em><b>TEDROOMUInt32</b></em>' basic type. Represents a 32-bit unsigned integer value.
	 * @see #TEDROOMU_INT32_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOMU_INT32(7, "TEDROOMUInt32", "TEDROOMUInt32"),

	/**
	 * '<em><b>TEDROOMUInt64</b></em>' basic type. Represents a 64-bit unsigned integer value.
	 * @see #TEDROOMU_INT64_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOMU_INT64(8, "TEDROOMUInt64", "TEDROOMUInt64"),

	/**
	 * '<em><b>TEDROOMInt8</b></em>' basic type. Represents an signed byte-sized integer value.
	 * @see #TEDROOM_INT8_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOM_INT8(9, "TEDROOMInt8", "TEDROOMInt8"),

	/**
	 * '<em><b>TEDROOMInt16</b></em>' basic type. Represents a 16-bit signed integer value.
	 * @see #TEDROOM_INT16_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOM_INT16(10, "TEDROOMInt16", "TEDROOMInt16"),

	/**
	 * '<em><b>TEDROOMInt32</b></em>' basic type. Represents a 32-bit signed integer value.
	 * @see #TEDROOM_INT32_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOM_INT32(11, "TEDROOMInt32", "TEDROOMInt32"),

	/**
	 * '<em><b>TEDROOMInt64</b></em>' basic type. Represents a 64-bit signed integer value.
	 * @see #TEDROOM_INT64_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOM_INT64(12, "TEDROOMInt64", "TEDROOMInt64"),

	/**
	 * '<em><b>TEDROOMFloat</b></em>' basic type. Represents a floating point value.
	 * @see #TEDROOM_FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOM_FLOAT(13, "TEDROOMFloat", "TEDROOMFloat"),

	/**
	 * '<em><b>TEDROOMDouble</b></em>' basic type. Represents a double precision floating point value.
	 * @see #TEDROOM_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	TEDROOM_DOUBLE(14, "TEDROOMDouble", "TEDROOMDouble");

	/**
	 * '<em><b>TEDROOMBool</b></em>' literal value.
	 * @see #TEDROOM_BOOL
	 * @model name="TEDROOMBool"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOM_BOOL_VALUE = 0;

	/**
	 * '<em><b>TEDROOMByte</b></em>' literal value.
	 * @see #TEDROOM_BYTE
	 * @model name="TEDROOMByte"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOM_BYTE_VALUE = 1;

	/**
	 * '<em><b>TEDROOMWord16</b></em>' literal value.
	 * @see #TEDROOM_WORD16
	 * @model name="TEDROOMWord16"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOM_WORD16_VALUE = 2;

	/**
	 * '<em><b>TEDROOMWord32</b></em>' literal value.
	 * @see #TEDROOM_WORD32
	 * @model name="TEDROOMWord32"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOM_WORD32_VALUE = 3;

	/**
	 * '<em><b>TEDROOMWord64</b></em>' literal value.
	 * @see #TEDROOM_WORD64
	 * @model name="TEDROOMWord64"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOM_WORD64_VALUE = 4;

	/**
	 * '<em><b>TEDROOMUInt8</b></em>' literal value.
	 * @see #TEDROOMU_INT8
	 * @model name="TEDROOMUInt8"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOMU_INT8_VALUE = 5;

	/**
	 * '<em><b>TEDROOMUInt16</b></em>' literal value.
	 * @see #TEDROOMU_INT16
	 * @model name="TEDROOMUInt16"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOMU_INT16_VALUE = 6;

	/**
	 * '<em><b>TEDROOMUInt32</b></em>' literal value.
	 * @see #TEDROOMU_INT32
	 * @model name="TEDROOMUInt32"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOMU_INT32_VALUE = 7;

	/**
	 * '<em><b>TEDROOMUInt64</b></em>' literal value.
	 * @see #TEDROOMU_INT64
	 * @model name="TEDROOMUInt64"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOMU_INT64_VALUE = 8;

	/**
	 * '<em><b>TEDROOMInt8</b></em>' literal value.
	 * @see #TEDROOM_INT8
	 * @model name="TEDROOMInt8"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOM_INT8_VALUE = 9;

	/**
	 * '<em><b>TEDROOMInt16</b></em>' literal value.
	 * @see #TEDROOM_INT16
	 * @model name="TEDROOMInt16"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOM_INT16_VALUE = 10;

	/**
	 * '<em><b>TEDROOMInt32</b></em>' literal value.
	 * @see #TEDROOM_INT32
	 * @model name="TEDROOMInt32"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOM_INT32_VALUE = 11;

	/**
	 * '<em><b>TEDROOMInt64</b></em>' literal value.
	 * @see #TEDROOM_INT64
	 * @model name="TEDROOMInt64"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOM_INT64_VALUE = 12;

	/**
	 * '<em><b>TEDROOMFloat</b></em>' literal value.
	 * @see #TEDROOM_FLOAT
	 * @model name="TEDROOMFloat"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOM_FLOAT_VALUE = 13;

	/**
	 * '<em><b>TEDROOMDouble</b></em>' literal value.
	 * @see #TEDROOM_DOUBLE
	 * @model name="TEDROOMDouble"
	 * @generated
	 * @ordered
	 */
	public static final int TEDROOM_DOUBLE_VALUE = 14;

	/**
	 * An array of all the '<em><b>EDROOMBasicType</b></em>' enumerators.
	 * @generated
	 */
	private static final EDROOMBasicType[] VALUES_ARRAY =
		new EDROOMBasicType[] {
			TEDROOM_BOOL,
			TEDROOM_BYTE,
			TEDROOM_WORD16,
			TEDROOM_WORD32,
			TEDROOM_WORD64,
			TEDROOMU_INT8,
			TEDROOMU_INT16,
			TEDROOMU_INT32,
			TEDROOMU_INT64,
			TEDROOM_INT8,
			TEDROOM_INT16,
			TEDROOM_INT32,
			TEDROOM_INT64,
			TEDROOM_FLOAT,
			TEDROOM_DOUBLE,
		};

	/**
	 * A public read-only list of all the '<em><b>EDROOMBasicType</b></em>' enumerators.
	 * @generated
	 */
	public static final List<EDROOMBasicType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EDROOMBasicType</b></em>' literal with the specified literal value.
	 * @generated
	 */
	public static EDROOMBasicType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EDROOMBasicType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EDROOMBasicType</b></em>' literal with the specified name.
	 * @generated
	 */
	public static EDROOMBasicType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EDROOMBasicType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EDROOMBasicType</b></em>' literal with the specified integer value.
	 * @generated
	 */
	public static EDROOMBasicType get(int value) {
		switch (value) {
			case TEDROOM_BOOL_VALUE: return TEDROOM_BOOL;
			case TEDROOM_BYTE_VALUE: return TEDROOM_BYTE;
			case TEDROOM_WORD16_VALUE: return TEDROOM_WORD16;
			case TEDROOM_WORD32_VALUE: return TEDROOM_WORD32;
			case TEDROOM_WORD64_VALUE: return TEDROOM_WORD64;
			case TEDROOMU_INT8_VALUE: return TEDROOMU_INT8;
			case TEDROOMU_INT16_VALUE: return TEDROOMU_INT16;
			case TEDROOMU_INT32_VALUE: return TEDROOMU_INT32;
			case TEDROOMU_INT64_VALUE: return TEDROOMU_INT64;
			case TEDROOM_INT8_VALUE: return TEDROOM_INT8;
			case TEDROOM_INT16_VALUE: return TEDROOM_INT16;
			case TEDROOM_INT32_VALUE: return TEDROOM_INT32;
			case TEDROOM_INT64_VALUE: return TEDROOM_INT64;
			case TEDROOM_FLOAT_VALUE: return TEDROOM_FLOAT;
			case TEDROOM_DOUBLE_VALUE: return TEDROOM_DOUBLE;
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
	private EDROOMBasicType(int value, String name, String literal) {
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