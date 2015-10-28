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

import es.uah.aut.srg.micobs.common.MParameter;

/**
 * A representation of an abstract service library.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary#getInherits <em>Inherits</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary#getProvides <em>Provides</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMAbstractServiceLibrary()
 * @model
 * @generated
 */
public interface MAbstractServiceLibrary extends MMCLEVSLIBPackageElement {
	/**
	 * Returns the list of attributes defined by the service library.
	 * @return the list of attributes defined by the service library.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMAbstractServiceLibrary_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getAttributes();

	/**
	 * Returns the list of service libraries inherited by the library.
	 * @return the list of inherited service libraries.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMAbstractServiceLibrary_Inherits()
	 * @model
	 * @generated
	 */
	EList<MAbstractServiceLibrary> getInherits();

	/**
	 * Returns the list of Service Access Interfaces (SAIs) provided by the package.
	 * @return the list of SAIs provided by the package.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMAbstractServiceLibrary_Provides()
	 * @model containment="true"
	 * @generated
	 */
	EList<MServiceLibraryProvidedSAI> getProvides();

}