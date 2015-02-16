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
package es.uah.aut.srg.micobs.mesp.mespswp;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource;

/**
 * A representation of a demand of an instantiable resource.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand#getResource <em>Resource</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand#getParameterValueAssignments <em>ParameterValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMInstantiableResourceDemand()
 * @model
 * @generated
 */
public interface MInstantiableResourceDemand extends MResourceDemand, MCommonReferenceableObj {
	/**
	 * Returns the demanded resource.
	 * @return the demanded resource.
	 * @see #setResource(MInstantiableResource)
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMInstantiableResourceDemand_Resource()
	 * @model required="true"
	 * @generated
	 */
	MInstantiableResource getResource();

	/**
	 * Sets the demanded resource.
	 * @param value the new demanded resource.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(MInstantiableResource value);

	/**
	 * Returns the list of value assignments of the parameters defined by the
	 * resource.
	 * @return the value of the '<em>ParameterValueAssignments</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMInstantiableResourceDemand_ParameterValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getParameterValueAssignments();

}