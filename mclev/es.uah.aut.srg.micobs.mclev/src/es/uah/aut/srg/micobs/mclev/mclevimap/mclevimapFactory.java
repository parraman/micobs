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
package es.uah.aut.srg.micobs.mclev.mclevimap;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage
 * @generated
 */
public interface mclevimapFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	mclevimapFactory eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevimap.impl.mclevimapFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MInterfaceMapping</em>'.
	 * @return a new object of class '<em>MInterfaceMapping</em>'.
	 * @generated
	 */
	MInterfaceMapping createMInterfaceMapping();

	/**
	 * Returns a new object of class '<em>MMCLEVIMAPPackageFile</em>'.
	 * @return a new object of class '<em>MMCLEVIMAPPackageFile</em>'.
	 * @generated
	 */
	MMCLEVIMAPPackageFile createMMCLEVIMAPPackageFile();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	mclevimapPackage getmclevimapPackage();

}