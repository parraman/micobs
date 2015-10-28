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
package es.uah.aut.srg.micobs.mclev.mclevmcad;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage
 * @generated
 */
public interface mclevmcadFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	mclevmcadFactory eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MMCADeployment</em>'.
	 * @return a new object of class '<em>MMCADeployment</em>'.
	 * @generated
	 */
	MMCADeployment createMMCADeployment();

	/**
	 * Returns a new object of class '<em>MServiceLibraryInstance</em>'.
	 * @return a new object of class '<em>MServiceLibraryInstance</em>'.
	 * @generated
	 */
	MServiceLibraryInstance createMServiceLibraryInstance();

	/**
	 * Returns a new object of class '<em>MDriverSLibInstance</em>'.
	 * @return a new object of class '<em>MDriverSLibInstance</em>'.
	 * @generated
	 */
	MDriverSLibInstance createMDriverSLibInstance();

	/**
	 * Returns a new object of class '<em>MDeviceDriverMapping</em>'.
	 * @return a new object of class '<em>MDeviceDriverMapping</em>'.
	 * @generated
	 */
	MDeviceDriverMapping createMDeviceDriverMapping();

	/**
	 * Returns a new object of class '<em>MComponentInstance</em>'.
	 * @return a new object of class '<em>MComponentInstance</em>'.
	 * @generated
	 */
	MComponentInstance createMComponentInstance();

	/**
	 * Returns a new object of class '<em>MDeploymentAlternative</em>'.
	 * @return a new object of class '<em>MDeploymentAlternative</em>'.
	 * @generated
	 */
	MDeploymentAlternative createMDeploymentAlternative();

	/**
	 * Returns a new object of class '<em>MCommonConnection</em>'.
	 * @return a new object of class '<em>MCommonConnection</em>'.
	 * @generated
	 */
	MCommonConnection createMCommonConnection();

	/**
	 * Returns a new object of class '<em>MConnectionSwitch</em>'.
	 * @return a new object of class '<em>MConnectionSwitch</em>'.
	 * @generated
	 */
	MConnectionSwitch createMConnectionSwitch();

	/**
	 * Returns a new object of class '<em>MConnectionSwitchCase</em>'.
	 * @return a new object of class '<em>MConnectionSwitchCase</em>'.
	 * @generated
	 */
	MConnectionSwitchCase createMConnectionSwitchCase();

	/**
	 * Returns a new object of class '<em>MDeploymentPlatform</em>'.
	 * @return a new object of class '<em>MDeploymentPlatform</em>'.
	 * @generated
	 */
	MDeploymentPlatform createMDeploymentPlatform();

	/**
	 * Returns a new object of class '<em>MDeployedDevice</em>'.
	 * @return a new object of class '<em>MDeployedDevice</em>'.
	 * @generated
	 */
	MDeployedDevice createMDeployedDevice();

	/**
	 * Returns a new object of class '<em>MMCLEVMCADPackageFile</em>'.
	 * @return a new object of class '<em>MMCLEVMCADPackageFile</em>'.
	 * @generated
	 */
	MMCLEVMCADPackageFile createMMCLEVMCADPackageFile();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	mclevmcadPackage getmclevmcadPackage();

}