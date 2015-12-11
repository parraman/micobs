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
 * A representation of a field of an EDROOM data class whose type is another data class.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClass#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataFieldClass()
 * @model
 * @generated
 */
public interface EDROOMDataFieldClass extends EDROOMDataField {
	/**
	 * Returns the data class that is the type of the field.
	 * @return the data class of the field.
	 * @see #setType(EDROOMDataClass)
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataFieldClass_Type()
	 * @model required="true"
	 * @generated
	 */
	EDROOMDataClass getType();

	/**
	 * Sets the data class of the field.
	 * @param value the new data class of the field.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDROOMDataClass value);

}