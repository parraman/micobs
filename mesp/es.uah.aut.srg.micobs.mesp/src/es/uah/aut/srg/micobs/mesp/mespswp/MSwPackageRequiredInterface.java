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
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;

/**
 * A representation of a requirement by a software package of an interface.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface#getResourceDemands <em>ResourceDemands</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackageRequiredInterface()
 * @model
 * @generated
 */
public interface MSwPackageRequiredInterface extends EObject {
	/**
	 * Returns the list of resources provided by the interface that are
	 * being demanded by the package.
	 * @return the list of resource demands.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackageRequiredInterface_ResourceDemands()
	 * @model containment="true"
	 * @generated
	 */
	EList<MResourceDemand> getResourceDemands();

	/**
	 * Returns the interface that is being required.
	 * @return the interface that is being required.
	 * @see #setInterface(MCommonPackageElement)
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMSwPackageRequiredInterface_Interface()
	 * @model required="true"
	 * @generated
	 */
	MCommonPackageElement getInterface();

	/**
	 * Sets the interface that is being required.
	 * @param value the new interface that is being required.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(MCommonPackageElement value);

}