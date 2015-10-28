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
package es.uah.aut.srg.micobs.mclev.mclevslib;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A representation of a regular service library.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary#getSupportedPlatforms <em>Supported Platforms</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMServiceLibrary()
 * @model
 * @generated
 */
public interface MServiceLibrary extends MMCLEVSLIBPackageElement, MAbstractServiceLibrary {
	/**
	 * Returns the list of service access interfaces required by the package
	 * independently of the platform on which it is deployed.
	 * @return the list of common required service access interfaces.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMServiceLibrary_Requires()
	 * @model
	 * @generated
	 */
	EList<MSAI> getRequires();

	/**
	 * Returns the list of languages in which the library is implemented.
	 * @return the list of languages in which the library is implemented.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMServiceLibrary_Languages()
	 * @model required="true"
	 * @generated
	 */
	EList<MLanguage> getLanguages();

	/**
	 * Returns the list of service library extended by the library.
	 * @return the list of service library extended by the library.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMServiceLibrary_Extends()
	 * @model
	 * @generated
	 */
	EList<MServiceLibrary> getExtends();

	/**
	 * Returns the list of supported platforms defined by the library.
	 * @return the list of supported platforms.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMServiceLibrary_SupportedPlatforms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MServiceLibrarySupportedPlatform> getSupportedPlatforms();

}