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


/**
 * A representation of a field of an EDROOM data class whose type is an enumeration.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnum#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataFieldEnum()
 * @model
 * @generated
 */
public interface EDROOMDataFieldEnum extends EDROOMDataField {
	/**
	 * Returns the enumeration that is the type of the field.
	 * @return the enumeration.
	 * @see #setType(EDROOMDataDefinitionEnum)
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataFieldEnum_Type()
	 * @model required="true"
	 * @generated
	 */
	EDROOMDataDefinitionEnum getType();

	/**
	 * Sets the enumeration that shall be the type of the field.
	 * @param value the new enumeration.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDROOMDataDefinitionEnum value);

}