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
 * A representation of a field of an EDROOM data class whose type is an array of enumerations.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnumArray#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataFieldEnumArray()
 * @model
 * @generated
 */
public interface EDROOMDataFieldEnumArray extends EDROOMDataFieldEnum {
	/**
	 * Returns the number of elements of the array.
	 * @return the size of the array.
	 * @see #setElements(int)
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataFieldEnumArray_Elements()
	 * @model required="true"
	 * @generated
	 */
	int getElements();

	/**
	 * Sets the number of elements of the array.
	 * @param value the new size of the array.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(int value);

}