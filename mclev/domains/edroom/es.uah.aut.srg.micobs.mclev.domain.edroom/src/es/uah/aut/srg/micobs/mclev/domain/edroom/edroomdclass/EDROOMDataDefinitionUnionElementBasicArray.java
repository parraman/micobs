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
 * A representation of an element of a union defined inside an EDROOM data class whose type is
 * an array of basic typed items.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasicArray#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataDefinitionUnionElementBasicArray()
 * @model
 * @generated
 */
public interface EDROOMDataDefinitionUnionElementBasicArray extends EDROOMDataDefinitionUnionElementBasic {
	/**
	 * Returns the number of elements of the array.
	 * @return the number of elements of the array.
	 * @see #setElements(int)
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataDefinitionUnionElementBasicArray_Elements()
	 * @model required="true"
	 * @generated
	 */
	int getElements();

	/**
	 * Sets the number of elements of the array.
	 * @param value the new number of elements.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(int value);

}