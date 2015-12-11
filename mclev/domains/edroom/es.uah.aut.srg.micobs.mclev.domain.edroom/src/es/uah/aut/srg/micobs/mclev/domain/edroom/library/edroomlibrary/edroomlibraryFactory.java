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
package es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryPackage
 * @generated
 */
public interface edroomlibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	edroomlibraryFactory eINSTANCE = es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl.edroomlibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EDROOMLibrary</em>'.
	 * @return a new object of class '<em>EDROOMLibrary</em>'.
	 * @generated
	 */
	EDROOMLibrary createEDROOMLibrary();

	/**
	 * Returns a new object of class '<em>EDROOMPackage</em>'.
	 * @return a new object of class '<em>EDROOMPackage</em>'.
	 * @generated
	 */
	EDROOMPackage createEDROOMPackage();

	/**
	 * Returns a new object of class '<em>EDROOMItemDataClass</em>'.
	 * @return a new object of class '<em>EDROOMItemDataClass</em>'.
	 * @generated
	 */
	EDROOMItemDataClass createEDROOMItemDataClass();

	/**
	 * Returns a new object of class '<em>EDROOMVersionedItemDataClass</em>'.
	 * @return a new object of class '<em>EDROOMVersionedItemDataClass</em>'.
	 * @generated
	 */
	EDROOMVersionedItemDataClass createEDROOMVersionedItemDataClass();

	/**
	 * Returns a new object of class '<em>EDROOMItemProtocol</em>'.
	 * @return a new object of class '<em>EDROOMItemProtocol</em>'.
	 * @generated
	 */
	EDROOMItemProtocol createEDROOMItemProtocol();

	/**
	 * Returns a new object of class '<em>EDROOMVersionedItemProtocol</em>'.
	 * @return a new object of class '<em>EDROOMVersionedItemProtocol</em>'.
	 * @generated
	 */
	EDROOMVersionedItemProtocol createEDROOMVersionedItemProtocol();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	edroomlibraryPackage getedroomlibraryPackage();

}
