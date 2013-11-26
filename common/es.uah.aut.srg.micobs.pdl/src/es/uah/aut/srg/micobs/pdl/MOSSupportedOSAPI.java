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
package es.uah.aut.srg.micobs.pdl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of an OSAPI supported by an operating system. These objects
 * are used by an operating system to state that it supports a particular OSAPI
 * and to give values to its configuration parameters.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI#getOsapi <em>Osapi</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI#getParametersValueAssignments <em>Parameters Value Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedOSAPI()
 * @model
 * @generated
 */
public interface MOSSupportedOSAPI extends EObject {
	/**
	 * Returns the OSAPI being supported.
	 * @return the OSAPI being supported.
	 * @see #setOsapi(MOperatingSystemAPI)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedOSAPI_Osapi()
	 * @model required="true"
	 * @generated
	 */
	MOperatingSystemAPI getOsapi();

	/**
	 * Sets the OSAPI being supported.
	 * @param value the new OSAPI being supported.
	 * @see #getOsapi()
	 * @generated
	 */
	void setOsapi(MOperatingSystemAPI value);

	/**
	 * Returns the list of parameter value assignments.
	 * @return the list of parameter value assignments.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedOSAPI_ParametersValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MOSSupportedOSAPIPVA> getParameterValueAssignments();

}
