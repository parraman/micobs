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
package es.uah.aut.srg.micobs.mesp.mesppswp;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;

/**
 * A representation of a platform software package.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage#getOsSwPackages <em>OsSwPackages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage#getCtools <em>Ctools</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage#getMPlatformSwPackage()
 * @model
 * @generated
 */
public interface MPlatformSwPackage extends MMESPPSWPPackageElement, MCommonPackageReferencingElement {
	/**
	 * Returns the list of operating system software packages attached to the
	 * platform software package.
	 * @return the list of attached operating system software packages.
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage#getMPlatformSwPackage_OsSwPackages()
	 * @model required="true"
	 * @generated
	 */
	EList<MOSSwPackage> getOsSwPackages();

	/**
	 * Returns the list of construction tools supported by the platform software
	 * package.
	 * @return the list of supported platform software packages.
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage#getMPlatformSwPackage_Ctools()
	 * @model required="true"
	 * @generated
	 */
	EList<MConstructionTool> getCtools();

}
