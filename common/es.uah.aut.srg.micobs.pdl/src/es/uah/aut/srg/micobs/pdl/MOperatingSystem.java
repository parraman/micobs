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
 * A representation of the an operating system.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOperatingSystem#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOperatingSystem#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOperatingSystem#getParameters <em>Parameters</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOperatingSystem#getSupportedPlatforms <em>Supported Platforms</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOperatingSystem#getSupportedOSAPIs <em>Supported OSAP Is</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOperatingSystem()
 * @model
 * @generated
 */
public interface MOperatingSystem extends MPDLPackageElement {
	/**
	 * Returns the list of operating systems inherited by this operating system.
	 * @return the list of operating systems inherited by this operating system.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOperatingSystem_Inherits()
	 * @model
	 * @generated
	 */
	EList<MOperatingSystem> getInherits();

	/**
	 * Returns the list of languages in which this operating system is programmed.
	 * @return the value of the '<em>Languages</em>' reference list.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOperatingSystem_Languages()
	 * @model required="true"
	 * @generated
	 */
	EList<MLanguage> getLanguages();

	/**
	 * Returns the list of configuration parameters defined by the operating
	 * system.
	 * @return the list of configuration parameters defined by the operating
	 * system.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOperatingSystem_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParameters();

	/**
	 * Returns the list of platforms supported by the operating system.
	 * @return the list of platforms supported by the operating system.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOperatingSystem_SupportedPlatforms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MOSSupportedPlatform> getSupportedPlatforms();

	/**
	 * Returns the list of supported OSAPIs.
	 * @return the list of supported OSAPIs.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOperatingSystem_SupportedOSAPIs()
	 * @model containment="true"
	 * @generated
	 */
	EList<MOSSupportedOSAPI> getSupportedOSAPIs();

}
