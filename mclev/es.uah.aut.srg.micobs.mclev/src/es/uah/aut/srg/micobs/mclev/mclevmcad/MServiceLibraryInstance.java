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
package es.uah.aut.srg.micobs.mclev.mclevmcad;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;

/**
 * A representation of a service library deployed as part of a deployment
 * alternative or of the root of an MCAD model.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance#getLibrary <em>Library</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMServiceLibraryInstance()
 * @model
 * @generated
 */
public interface MServiceLibraryInstance extends EObject {
	/**
	 * Returns the service library that is being deployed.
	 * @return the service library that is being deployed.
	 * @see #setLibrary(MServiceLibrary)
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMServiceLibraryInstance_Library()
	 * @model required="true"
	 * @generated
	 */
	MServiceLibrary getLibrary();

	/**
	 * Sets the software package that will be deployed.
	 * @param value the new service library.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(MServiceLibrary value);

	/**
	 * Returns the list of value assignments to the attributes of the service
	 * library.
	 * @return the list of attribute value assignments.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMServiceLibraryInstance_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

}