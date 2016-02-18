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

import org.eclipse.emf.common.util.EList;

/**
 * A representation of an EDROOM data class.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass#getFields <em>Fields</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass#getInherits <em>Inherits</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataClass()
 * @model
 * @generated
 */
public interface EDROOMDataClass extends EDROOMDCLASSPackageElement {
	/**
	 * Returns the list of fields of the class.
	 * @return the list of fields.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataClass_Fields()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EDROOMDataField> getFields();

	/**
	 * Returns the list of types defined by the data class. These types can be
	 * either unions or enumerations.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataClass_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDROOMDataDefinition> getDefinitions();

	/**
	 * Returns the list of data classes from which this class inherits.
	 * @return the list of inherited data classes.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#getEDROOMDataClass_Inherits()
	 * @model
	 * @generated
	 */
	EList<EDROOMDataClass> getInherits();

}