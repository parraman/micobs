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
package es.uah.aut.srg.micobs.mesp.mesposswi;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource;

/**
 * A representation of an operating system software interface.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface#getProvidedResources <em>ProvidedResources</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage#getMOSSwInterface()
 * @model
 * @generated
 */
public interface MOSSwInterface extends MMESPOSSWIPackageElement, MCommonPackageReferencingElement {
	/**
	 * Returns the list of operating system software interfaces extended
	 * by this interface.
	 * @return the list of operating system software interfaces extended
	 * by this interface.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage#getMOSSwInterface_Extends()
	 * @model
	 * @generated
	 */
	EList<MOSSwInterface> getExtends();

	/**
	 * Returns the list of resources provided by the operating system software
	 * interface.
	 * @return the list of resources provided by the operating system software
	 * interface.
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage#getMOSSwInterface_ProvidedResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<MProvidedResource> getProvidedResources();

}
