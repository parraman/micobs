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

import es.uah.aut.srg.micobs.common.MParameter;

/**
 * A representation of an abstract software package.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage#getProvides <em>Provides</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMAbstractSwPackage()
 * @model
 * @generated
 */
public interface MAbstractSwPackage extends MMESPSWPPackageElement {
	/**
	 * Returns the list of software packages inherited by the package.
	 * @return the list of inherited software packages.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMAbstractSwPackage_Inherits()
	 * @model
	 * @generated
	 */
	EList<MAbstractSwPackage> getInherits();

	/**
	 * Returns the list of software interfaces provided by the package.
	 * @return the list of software interfaces provided by the package.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMAbstractSwPackage_Provides()
	 * @model containment="true"
	 * @generated
	 */
	EList<MSwPackageProvidedInterface> getProvides();

	/**
	 * Returns the list of configuration parameters defined by the software package.
	 * @return the list of configuration parameters defined by the software package.
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#getMAbstractSwPackage_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParameters();

}