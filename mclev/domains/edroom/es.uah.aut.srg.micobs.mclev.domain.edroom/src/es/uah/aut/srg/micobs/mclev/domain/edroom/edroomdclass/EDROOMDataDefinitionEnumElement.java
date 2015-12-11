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

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of a literal of an enumeration defined inside an EDROOM data class.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataDefinitionEnumElement()
 * @model
 * @generated
 */
public interface EDROOMDataDefinitionEnumElement extends EObject {
	/**
	 * Returns the name of the literal.
	 * @return the name of the literal.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataDefinitionEnumElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the name of the literal.
	 * @param value the new name of the literal.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the integer value assigned to the literal.
	 * @return the integer value equivalent to the literal.
	 * @see #setValue(int)
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataDefinitionEnumElement_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the integer value assigned to the literal.
	 * @param value the new integer value equivalent to the literal.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

}