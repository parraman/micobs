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
package es.uah.aut.srg.micobs.libdesc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonPackageItem;

/**
 * A representation of a library descriptor. These descriptors are stored as
 * part of a descriptors list and include information on a model element
 * stored remotely on a repository. This information is stored in a list
 * of {@link MDescriptorField} objects contained by the descriptor.
 * 
 * Apart from model elements, library descriptors can refer to a library
 * package. In this case, the library descriptor calls for the creation
 * of a package with a given URI.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.libdesc.MDescriptor#getUri <em>Uri</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.libdesc.MDescriptor#getLibrary <em>Library</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.libdesc.MDescriptor#getItem <em>Item</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.libdesc.MDescriptor#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage#getMDescriptor()
 * @model
 * @generated
 */
public interface MDescriptor extends EObject {
	/**
	 * Returns the URI of the remote element.
	 * @return the URI of the remote element.
	 * @see #setUri(String)
	 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage#getMDescriptor_Uri()
	 * @model required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the URI of the remote element.
	 * @param value the new URI of the remote element.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the library to which the model element pointed by the descriptor
	 * belongs.
	 * @return the library to which the model element pointed by the descriptor
	 * belongs.
	 * @see #setLibrary(String)
	 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage#getMDescriptor_Library()
	 * @model required="true"
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the library to which the model element associated to the descriptor
	 * belongs.
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(String value);

	/**
	 * Returns a string with the name ID corresponding to the the model element
	 * associated to the descriptor. This name ID is most usually the name of the
	 * class derived from {@link MCommonPackageItem} associated to the kind of
	 * model element.
	 * @return string with the name ID corresponding to the the model element
	 * associated to the descriptor.
	 * @see #setItem(String)
	 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage#getMDescriptor_Item()
	 * @model required="true"
	 * @generated
	 */
	String getItem();

	/**
	 * Sets the string with the name ID corresponding to the the model element
	 * associated to the descriptor.
	 * @param value the new string with the name ID corresponding to the the model
	 * element associated to the descriptor.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(String value);

	/**
	 * Returns the list of {@link MDescriptorField} elements that contain the
	 * information on the remote model element.
	 * @return the list of {@link MDescriptorField} elements.
	 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage#getMDescriptor_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<MDescriptorField> getFields();

}
