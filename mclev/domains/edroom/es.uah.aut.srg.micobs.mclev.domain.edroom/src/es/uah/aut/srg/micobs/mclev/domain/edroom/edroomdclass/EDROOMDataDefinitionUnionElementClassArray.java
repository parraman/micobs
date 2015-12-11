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
 * A representation of a union element whose type is an array of EDROOM data classes.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClassArray#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataDefinitionUnionElementClassArray()
 * @model
 * @generated
 */
public interface EDROOMDataDefinitionUnionElementClassArray extends EDROOMDataDefinitionUnionElementClass {
	/**
	 * Returns the number of elements of the array.
	 * @return the size of the array.
	 * @see #setElements(int)
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataDefinitionUnionElementClassArray_Elements()
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