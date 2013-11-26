/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.common;

import org.eclipse.emf.ecore.EObject;

/**
 * MICOBS common referenceable object class. This class is used to define objects
 * within a model element that can be referenced from the same element or from
 * another one. Each object must define a name.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonReferenceableObj#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonReferenceableObj()
 * @model abstract="true"
 * @generated
 */
public interface MCommonReferenceableObj extends EObject {
	/**
	 * Returns the name of the referenceable object.
	 * @return the name of the referenceable object.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonReferenceableObj_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the name of the referenceable object.
	 * @param value the new name of the referenceable object.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns an optional description of the object.
	 * @return the description of the object or <code>null</code> if no
	 * description has been defined.
	 * @see #setDescription(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonReferenceableObj_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the description of the object.
	 * @param value the new description of the object.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

}
