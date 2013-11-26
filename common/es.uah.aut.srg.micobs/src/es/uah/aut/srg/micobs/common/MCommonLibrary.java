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
package es.uah.aut.srg.micobs.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * MICOBS common library class. The main class of each library defined within
 * the framework must inherit from this generic class.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonLibrary#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonLibrary()
 * @model abstract="true"
 * @generated
 */
public interface MCommonLibrary extends EObject {
	/**
	 * Returns the list of packages contained by the library.
	 * @return the list of packages contained by the library.
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonLibrary_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<MCommonPackage> getPackages();

}
