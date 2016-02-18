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
 * A representation of a union element whose type is a union.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnion#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataDefinitionUnionElementUnion()
 * @model
 * @generated
 */
public interface EDROOMDataDefinitionUnionElementUnion extends EDROOMDataDefinitionUnionElement {
	/**
	 * Returns the union that is the type of the element.
	 * @return the type of the element.
	 * @see #setType(EDROOMDataDefinitionUnion)
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataDefinitionUnionElementUnion_Type()
	 * @model required="true"
	 * @generated
	 */
	EDROOMDataDefinitionUnion getType();

	/**
	 * Sets the union that will be the type of the element.
	 * @param value the new type of element.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDROOMDataDefinitionUnion value);

}