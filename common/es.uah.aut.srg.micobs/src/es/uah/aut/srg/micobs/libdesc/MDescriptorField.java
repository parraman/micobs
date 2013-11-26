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
package es.uah.aut.srg.micobs.libdesc;

import org.eclipse.emf.ecore.EObject;

/**
 * An object of this class stores a particular piece of information related to
 * a remote model element identified by an {@link MDescriptor} object. The information
 * is stored as a name/value pair in which both
 * elements are strings.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.libdesc.MDescriptorField#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.libdesc.MDescriptorField#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage#getMDescriptorField()
 * @model
 * @generated
 */
public interface MDescriptorField extends EObject {
	/**
	 * Returns the name of the field.
	 * @return the name of the field.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage#getMDescriptorField_Name()
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

	/**
	 * Returns the value of the field.
	 * @return the value of the field.
	 * @see #setValue(String)
	 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage#getMDescriptorField_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets value of the field.
	 * @param value the new value of the field.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

}
