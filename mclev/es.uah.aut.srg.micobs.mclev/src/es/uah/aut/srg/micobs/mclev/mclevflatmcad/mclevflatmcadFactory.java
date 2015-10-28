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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage
 * @generated
 */
public interface mclevflatmcadFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	mclevflatmcadFactory eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MFlatMCAD</em>'.
	 * @return a new object of class '<em>MFlatMCAD</em>'.
	 * @generated
	 */
	MFlatMCAD createMFlatMCAD();

	/**
	 * Returns a new object of class '<em>MFlatMCADTarget</em>'.
	 * @return a new object of class '<em>MFlatMCADTarget</em>'.
	 * @generated
	 */
	MFlatMCADTarget createMFlatMCADTarget();

	/**
	 * Returns a new object of class '<em>MFlatServiceLibraryInstance</em>'.
	 * @return a new object of class '<em>MFlatServiceLibraryInstance</em>'.
	 * @generated
	 */
	MFlatServiceLibraryInstance createMFlatServiceLibraryInstance();

	/**
	 * Returns a new object of class '<em>MFlatDriverSLibInstance</em>'.
	 * @return a new object of class '<em>MFlatDriverSLibInstance</em>'.
	 * @generated
	 */
	MFlatDriverSLibInstance createMFlatDriverSLibInstance();

	/**
	 * Returns a new object of class '<em>MFlatComponentInstance</em>'.
	 * @return a new object of class '<em>MFlatComponentInstance</em>'.
	 * @generated
	 */
	MFlatComponentInstance createMFlatComponentInstance();

	/**
	 * Returns a new object of class '<em>MFlatConnection</em>'.
	 * @return a new object of class '<em>MFlatConnection</em>'.
	 * @generated
	 */
	MFlatConnection createMFlatConnection();

	/**
	 * Returns a new object of class '<em>MMCLEVFLATMCADPackageFile</em>'.
	 * @return a new object of class '<em>MMCLEVFLATMCADPackageFile</em>'.
	 * @generated
	 */
	MMCLEVFLATMCADPackageFile createMMCLEVFLATMCADPackageFile();

	/**
	 * Returns a new object of class '<em>MFlatDeviceDriverMapping</em>'.
	 * @return a new object of class '<em>MFlatDeviceDriverMapping</em>'.
	 * @generated
	 */
	MFlatDeviceDriverMapping createMFlatDeviceDriverMapping();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	mclevflatmcadPackage getmclevflatmcadPackage();

}