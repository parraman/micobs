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
package es.uah.aut.srg.micobs.mesp.mespswi;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A representation of a software interface.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getLanguage <em>Language</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getParameters <em>Parameters</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface#getProvidedResources <em>ProvidedResources</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage#getMSwInterface()
 * @model
 * @generated
 */
public interface MSwInterface extends MMESPSWIPackageElement {
	/**
	 * Returns the list of software interfaces extended by the interface.
	 * @return the list of software interfaces extended by the interface.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage#getMSwInterface_Extends()
	 * @model
	 * @generated
	 */
	EList<MSwInterface> getExtends();

	/**
	 * Returns the programming language of the interface.
	 * @return the programming language of the interface.
	 * @see #setLanguage(MLanguage)
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage#getMSwInterface_Language()
	 * @model required="true"
	 * @generated
	 */
	MLanguage getLanguage();

	/**
	 * Sets the programming language of the interface.
	 * @param value the new programming language of the interface.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(MLanguage value);

	/**
	 * Returns the list of software interfaces required by the interface.
	 * @return the list of software interfaces required by the interface.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage#getMSwInterface_Requires()
	 * @model
	 * @generated
	 */
	EList<MSwInterface> getRequires();

	/**
	 * Returns the parameters defined by the interface.
	 * @return the parameters defined by the interface.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage#getMSwInterface_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParameters();

	/**
	 * Returns the list of provided resources defined by the interface.
	 * @return the list of provided resources defined by the interface.
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage#getMSwInterface_ProvidedResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<MProvidedResource> getProvidedResources();

	/**
	 * Returns the operating system API required by the software interface or
	 * <code>null</code> if it does not require any OSAPI.
	 * @return the required OSAPI or <code>null</code> if no OSAPI
	 * is required.
	 * @see #setRequiredOSAPI(MOperatingSystemAPI)
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage#getMSwInterface_RequiredOSAPI()
	 * @model
	 * @generated
	 */
	MOperatingSystemAPI getRequiredOSAPI();

	/**
	 * Sets the operating system API required by the software interface.
	 * @param value the new operating system API required by the
	 * software interface.
	 * @see #getRequiredOSAPI()
	 * @generated
	 */
	void setRequiredOSAPI(MOperatingSystemAPI value);

}