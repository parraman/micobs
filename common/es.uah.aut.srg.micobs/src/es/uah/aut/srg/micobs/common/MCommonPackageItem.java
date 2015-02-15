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
package es.uah.aut.srg.micobs.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * MICOBS common package item class. The different types of library items
 * defined within the framework must inherit from this class. Each one of
 * these items represents a set of elements installed in the library that have
 * the same URI but different versions.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageItem#getVersionedItems <em>VersionedItems</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.MCommonPackageItem#getUri <em>URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageItem()
 * @model abstract="true"
 * @generated
 */
public interface MCommonPackageItem extends EObject {
	/**
	 * Returns the list of versions of the same item installed in the library.
	 * @return the list of versions of the same item installed in the library.
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageItem_VersionedItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<MCommonPackageVersionedItem> getVersionedItems();

	/**
	 * Returns the URI of the item.
	 * @return the URI of the item.
	 * @see #setUri(String)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMCommonPackageItem_Uri()
	 * @model required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the URI of the item.
	 * @param value the new value of the URI of the item..
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

}
