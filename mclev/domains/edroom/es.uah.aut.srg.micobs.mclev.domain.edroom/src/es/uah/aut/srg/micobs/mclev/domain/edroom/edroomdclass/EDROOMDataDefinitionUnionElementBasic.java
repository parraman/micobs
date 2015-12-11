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
 * A representation of a union element whose type is an EDROOM basic type.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasic#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataDefinitionUnionElementBasic()
 * @model
 * @generated
 */
public interface EDROOMDataDefinitionUnionElementBasic extends EDROOMDataDefinitionUnionElement {
	/**
	 * Returns the basic type of the element.
	 * @return the type of the element.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMBasicType
	 * @see #setType(EDROOMBasicType)
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataDefinitionUnionElementBasic_Type()
	 * @model required="true"
	 * @generated
	 */
	EDROOMBasicType getType();

	/**
	 * Sets the type of the element.
	 * @param value the new type of the element.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMBasicType
	 * @see #getType()
	 * @generated
	 */
	void setType(EDROOMBasicType value);

}