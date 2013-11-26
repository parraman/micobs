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
package es.uah.aut.srg.micobs.mesp.mesposswp;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;

/**
 * A representation of an operating system software package.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage#getCtools <em>Ctools</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage#getProvidedOSSWIs <em>ProvidedOSSWIs</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage#getMOSSwPackage()
 * @model
 * @generated
 */
public interface MOSSwPackage extends MMESPOSSWPPackageElement, MCommonPackageReferencingElement {
	/**
	 * Returns the list of operating system software packages extended by the 
	 * package.
	 * @return the list of operating system software packages extended by the 
	 * package.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage#getMOSSwPackage_Extends()
	 * @model
	 * @generated
	 */
	EList<MOSSwPackage> getExtends();

	/**
	 * Returns the list of construction tools with which the package can be constructed.
	 * @return the list of construction tools with which the package can be constructed.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage#getMOSSwPackage_Ctools()
	 * @model required="true"
	 * @generated
	 */
	EList<MConstructionTool> getCtools();

	/**
	 * Returns the list of operating system software interfaces supported by the
	 * operating system software package.
	 * @return the list of supported operating system software interfaces.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage#getMOSSwPackage_ProvidedOSSWIs()
	 * @model
	 * @generated
	 */
	EList<MOSSwInterface> getProvidedOSSWIs();

}
