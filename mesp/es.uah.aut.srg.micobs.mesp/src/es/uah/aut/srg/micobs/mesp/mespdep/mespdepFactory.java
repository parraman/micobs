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
package es.uah.aut.srg.micobs.mesp.mespdep;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * 
 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage
 * @generated
 */
public interface mespdepFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	mespdepFactory eINSTANCE = es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MMESPDeployment</em>'.
	 * @return a new object of class '<em>MMESPDeployment</em>'.
	 * @generated
	 */
	MMESPDeployment createMMESPDeployment();

	/**
	 * Returns a new object of class '<em>MMESPDeploymentPlatform</em>'.
	 * @return a new object of class '<em>MMESPDeploymentPlatform</em>'.
	 * @generated
	 */
	MMESPDeploymentPlatform createMMESPDeploymentPlatform();

	/**
	 * Returns a new object of class '<em>MMESPDeployedDevice</em>'.
	 * @return a new object of class '<em>MMESPDeployedDevice</em>'.
	 * @generated
	 */
	MMESPDeployedDevice createMMESPDeployedDevice();

	/**
	 * Returns a new object of class '<em>MMESPDeploymentAlternative</em>'.
	 * @return a new object of class '<em>MMESPDeploymentAlternative</em>'.
	 * @generated
	 */
	MMESPDeploymentAlternative createMMESPDeploymentAlternative();

	/**
	 * Returns a new object of class '<em>MMESPSwPackageDeployment</em>'.
	 * @return a new object of class '<em>MMESPSwPackageDeployment</em>'.
	 * @generated
	 */
	MMESPSwPackageDeployment createMMESPSwPackageDeployment();

	/**
	 * Returns a new object of class '<em>MMESPDriverSwPackageDeployment</em>'.
	 * @return a new object of class '<em>MMESPDriverSwPackageDeployment</em>'.
	 * @generated
	 */
	MMESPDriverSwPackageDeployment createMMESPDriverSwPackageDeployment();

	/**
	 * Returns a new object of class '<em>MMESPDeviceDriverMapping</em>'.
	 * @return a new object of class '<em>MMESPDeviceDriverMapping</em>'.
	 * @generated
	 */
	MMESPDeviceDriverMapping createMMESPDeviceDriverMapping();

	/**
	 * Returns a new object of class '<em>MMESPDEPPackageFile</em>'.
	 * @return a new object of class '<em>MMESPDEPPackageFile</em>'.
	 * @generated
	 */
	MMESPDEPPackageFile createMMESPDEPPackageFile();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	mespdepPackage getmespdepPackage();

}
