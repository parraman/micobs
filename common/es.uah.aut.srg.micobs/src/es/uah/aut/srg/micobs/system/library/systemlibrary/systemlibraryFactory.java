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
package es.uah.aut.srg.micobs.system.library.systemlibrary;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * 
 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryPackage
 * @generated
 */
public interface systemlibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	systemlibraryFactory eINSTANCE = es.uah.aut.srg.micobs.system.library.systemlibrary.impl.systemlibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MSystemLibrary</em>'.
	 * @return a new object of class '<em>MSystemLibrary</em>'.
	 * @generated
	 */
	MSystemLibrary createMSystemLibrary();

	/**
	 * Returns a new object of class '<em>MSystemPackage</em>'.
	 * @return a new object of class '<em>MSystemPackage</em>'.
	 * @generated
	 */
	MSystemPackage createMSystemPackage();

	/**
	 * Returns a new object of class '<em>MSystemPackageVersionedItem</em>'.
	 * @return a new object of class '<em>MSystemPackageVersionedItem</em>'.
	 * @generated
	 */
	MSystemPackageVersionedItem createMSystemPackageVersionedItem();

	/**
	 * Returns a new object of class '<em>MSystemItemLanguage</em>'.
	 * @return a new object of class '<em>MSystemItemLanguage</em>'.
	 * @generated
	 */
	MSystemItemLanguage createMSystemItemLanguage();

	/**
	 * Returns a new object of class '<em>MSystemVersionedItemLanguage</em>'.
	 * @return a new object of class '<em>MSystemVersionedItemLanguage</em>'.
	 * @generated
	 */
	MSystemVersionedItemLanguage createMSystemVersionedItemLanguage();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	systemlibraryPackage getsystemlibraryPackage();

}
