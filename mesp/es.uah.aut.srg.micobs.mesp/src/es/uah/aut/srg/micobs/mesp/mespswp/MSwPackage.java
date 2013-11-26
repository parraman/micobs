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
package es.uah.aut.srg.micobs.mesp.mespswp;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A representation of a software package.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getCtools <em>Ctools</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage#getSupportedPlatforms <em>SupportedPlatforms</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackage()
 * @model
 * @generated
 */
public interface MSwPackage extends MMESPSWPPackageElement, MAbstractSwPackage {
	/**
	 * Returns the list of software packages extended by the package.
	 * @return the list of software packages extended by the package.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackage_Extends()
	 * @model
	 * @generated
	 */
	EList<MSwPackage> getExtends();

	/**
	 * Returns the list of languages in which the package is implemented.
	 * @return the list of languages in which the package is implemented.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackage_Languages()
	 * @model required="true"
	 * @generated
	 */
	EList<MLanguage> getLanguages();

	/**
	 * Returns the list of construction tools that can be used to build
	 * the software package.
	 * @return the list of construction tools that can be used to build
	 * the software package.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackage_Ctools()
	 * @model required="true"
	 * @generated
	 */
	EList<MConstructionTool> getCtools();

	/**
	 * Returns the list of software interfaces required by the package
	 * independently of the platform on which it is deployed.
	 * @return the list of common required software interfaces.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackage_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<MSwPackageRequiredInterface> getRequires();

	/**
	 * Returns the list of supported platforms defined by the package.
	 * @return the list of supported platforms.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackage_SupportedPlatforms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MSwPackageSupportedPlatform> getSupportedPlatforms();

}