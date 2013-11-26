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
 * MICOBS common package class. Each type of package defined within the
 * framework must inherit from this generic class.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackage#getUri <em>Uri</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackage#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackage()
 * @model abstract="true"
 * @generated
 */
public interface MCommonPackage extends EObject {
	/**
	 * Returns the URI of the package.
	 * @return the URI of the package.
	 * @see #setUri(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackage_Uri()
	 * @model required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the URI of the package.
	 * @param value the new value of the URI of the package.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the list of common package items contained by the package.
	 * @return the list of common package items contained by the package.
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackage_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<MCommonPackageItem> getItems();

}
