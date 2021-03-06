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
 * A representation of an abstract field of an EDROOM data class.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataField#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataField()
 * @model abstract="true"
 * @generated
 */
public interface EDROOMDataField extends EObject {
	/**
	 * Returns the name of the field.
	 * @return the name of the field.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataField_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the name of the field.
	 * @param value the new name of the field.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

}