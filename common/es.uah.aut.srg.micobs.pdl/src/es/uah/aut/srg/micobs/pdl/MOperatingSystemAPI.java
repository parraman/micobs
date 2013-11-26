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

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.system.MLanguage;


/**
 * A representation of an operating system application programming interface
 * (OSAPI).
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI#getLanguage <em>Language</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOperatingSystemAPI()
 * @model
 * @generated
 */
public interface MOperatingSystemAPI extends MPDLPackageElement {

	/**
	 * Returns the list of OSAPIs inherited by this interface.
	 * @return the list of OSAPIs inherited by this interface.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOperatingSystemAPI_Inherits()
	 * @model
	 * @generated
	 */
	EList<MOperatingSystemAPI> getInherits();

	/**
	 * Returns the language of the interface.
	 * @return the language of the interface.
	 * @see #setLanguage(MLanguage)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOperatingSystemAPI_Language()
	 * @model required="true"
	 * @generated
	 */
	MLanguage getLanguage();

	/**
	 * Sets the language of the interface.
	 * @param value the new language of the interface.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(MLanguage value);

	/**
	 * Returns the list of configuration parameters defined by the interface.
	 * @return the list of configuration parameters defined by the interface.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOperatingSystemAPI_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParameters();
}
