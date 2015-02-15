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
package es.uah.aut.srg.micobs.libdesc;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage
 * @generated
 */
public interface libdescFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	libdescFactory eINSTANCE = es.uah.aut.srg.micobs.libdesc.impl.libdescFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MDescriptor</em>'.
	 * @return a new object of class '<em>MDescriptor</em>'.
	 * @generated
	 */
	MDescriptor createMDescriptor();

	/**
	 * Returns a new object of class '<em>MDescriptorList</em>'.
	 * @return a new object of class '<em>MDescriptorList</em>'.
	 * @generated
	 */
	MDescriptorList createMDescriptorList();

	/**
	 * Returns a new object of class '<em>MDescriptorField</em>'.
	 * @return a new object of class '<em>MDescriptorField</em>'.
	 * @generated
	 */
	MDescriptorField createMDescriptorField();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	libdescPackage getlibdescPackage();

} //libdescFactory
