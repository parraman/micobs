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
package es.uah.aut.srg.micobs.mesp.mespswp;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * 
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage
 * @generated
 */
public interface mespswpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	mespswpFactory eINSTANCE = es.uah.aut.srg.micobs.mesp.mespswp.impl.mespswpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MSwPackage</em>'.
	 * @return a new object of class '<em>MSwPackage</em>'.
	 * @generated
	 */
	MSwPackage createMSwPackage();

	/**
	 * Returns a new object of class '<em>MDriverSwPackage</em>'.
	 * @return a new object of class '<em>MDriverSwPackage</em>'.
	 * @generated
	 */
	MDriverSwPackage createMDriverSwPackage();

	/**
	 * Returns a new object of class '<em>MSwPackageProvidedInterface</em>'.
	 * @return a new object of class '<em>MSwPackageProvidedInterface</em>'.
	 * @generated
	 */
	MSwPackageProvidedInterface createMSwPackageProvidedInterface();

	/**
	 * Returns a new object of class '<em>MSwPackageProvidedInterfacePVASwitch</em>'.
	 * @return a new object of class '<em>MSwPackageProvidedInterfacePVASwitch</em>'.
	 * @generated
	 */
	MSwPackageProvidedInterfacePVASwitch createMSwPackageProvidedInterfacePVASwitch();

	/**
	 * Returns a new object of class '<em>MSwPackageProvidedInterfacePVASwitchCase</em>'.
	 * @return a new object of class '<em>MSwPackageProvidedInterfacePVASwitchCase</em>'.
	 * @generated
	 */
	MSwPackageProvidedInterfacePVASwitchCase createMSwPackageProvidedInterfacePVASwitchCase();

	/**
	 * Returns a new object of class '<em>MSwPackageProvidedInterfacePVAExpression</em>'.
	 * @return a new object of class '<em>MSwPackageProvidedInterfacePVAExpression</em>'.
	 * @generated
	 */
	MSwPackageProvidedInterfacePVAExpression createMSwPackageProvidedInterfacePVAExpression();

	/**
	 * Returns a new object of class '<em>MSwPackageRequiredInterface</em>'.
	 * @return a new object of class '<em>MSwPackageRequiredInterface</em>'.
	 * @generated
	 */
	MSwPackageRequiredInterface createMSwPackageRequiredInterface();

	/**
	 * Returns a new object of class '<em>MAbstractSwPackage</em>'.
	 * @return a new object of class '<em>MAbstractSwPackage</em>'.
	 * @generated
	 */
	MAbstractSwPackage createMAbstractSwPackage();

	/**
	 * Returns a new object of class '<em>MSwPackageSupportedPlatform</em>'.
	 * @return a new object of class '<em>MSwPackageSupportedPlatform</em>'.
	 * @generated
	 */
	MSwPackageSupportedPlatform createMSwPackageSupportedPlatform();

	/**
	 * Returns a new object of class '<em>MDriverSwPackageSupportedPlatform</em>'.
	 * @return a new object of class '<em>MDriverSwPackageSupportedPlatform</em>'.
	 * @generated
	 */
	MDriverSwPackageSupportedPlatform createMDriverSwPackageSupportedPlatform();

	/**
	 * Returns a new object of class '<em>MDriverSwPackageSupportedDevice</em>'.
	 * @return a new object of class '<em>MDriverSwPackageSupportedDevice</em>'.
	 * @generated
	 */
	MDriverSwPackageSupportedDevice createMDriverSwPackageSupportedDevice();

	/**
	 * Returns a new object of class '<em>MInstantiableResourceDemand</em>'.
	 * @return a new object of class '<em>MInstantiableResourceDemand</em>'.
	 * @generated
	 */
	MInstantiableResourceDemand createMInstantiableResourceDemand();

	/**
	 * Returns a new object of class '<em>MQuantifiableResourceDemand</em>'.
	 * @return a new object of class '<em>MQuantifiableResourceDemand</em>'.
	 * @generated
	 */
	MQuantifiableResourceDemand createMQuantifiableResourceDemand();

	/**
	 * Returns a new object of class '<em>MMESPSWPPackageFile</em>'.
	 * @return a new object of class '<em>MMESPSWPPackageFile</em>'.
	 * @generated
	 */
	MMESPSWPPackageFile createMMESPSWPPackageFile();

	/**
	 * Returns a new object of class '<em>MBooleanParamSWPSPSwitch</em>'.
	 * @return a new object of class '<em>MBooleanParamSWPSPSwitch</em>'.
	 * @generated
	 */
	MBooleanParamSWPSPSwitch createMBooleanParamSWPSPSwitch();

	/**
	 * Returns a new object of class '<em>MBooleanParamSWPSPSwitchCase</em>'.
	 * @return a new object of class '<em>MBooleanParamSWPSPSwitchCase</em>'.
	 * @generated
	 */
	MBooleanParamSWPSPSwitchCase createMBooleanParamSWPSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MStringParamSWPSPSwitch</em>'.
	 * @return a new object of class '<em>MStringParamSWPSPSwitch</em>'.
	 * @generated
	 */
	MStringParamSWPSPSwitch createMStringParamSWPSPSwitch();

	/**
	 * Returns a new object of class '<em>MStringParamSWPSPSwitchCase</em>'.
	 * @return a new object of class '<em>MStringParamSWPSPSwitchCase</em>'.
	 * @generated
	 */
	MStringParamSWPSPSwitchCase createMStringParamSWPSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MIntegerParamSWPSPSwitch</em>'.
	 * @return a new object of class '<em>MIntegerParamSWPSPSwitch</em>'.
	 * @generated
	 */
	MIntegerParamSWPSPSwitch createMIntegerParamSWPSPSwitch();

	/**
	 * Returns a new object of class '<em>MIntegerParamSWPSPSwitchCase</em>'.
	 * @return a new object of class '<em>MIntegerParamSWPSPSwitchCase</em>'.
	 * @generated
	 */
	MIntegerParamSWPSPSwitchCase createMIntegerParamSWPSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MEnumParamSWPSPSwitch</em>'.
	 * @return a new object of class '<em>MEnumParamSWPSPSwitch</em>'.
	 * @generated
	 */
	MEnumParamSWPSPSwitch createMEnumParamSWPSPSwitch();

	/**
	 * Returns a new object of class '<em>MEnumParamSWPSPSwitchCase</em>'.
	 * @return a new object of class '<em>MEnumParamSWPSPSwitchCase</em>'.
	 * @generated
	 */
	MEnumParamSWPSPSwitchCase createMEnumParamSWPSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MRealParamSWPSPSwitch</em>'.
	 * @return a new object of class '<em>MRealParamSWPSPSwitch</em>'.
	 * @generated
	 */
	MRealParamSWPSPSwitch createMRealParamSWPSPSwitch();

	/**
	 * Returns a new object of class '<em>MRealParamSWPSPSwitchCase</em>'.
	 * @return a new object of class '<em>MRealParamSWPSPSwitchCase</em>'.
	 * @generated
	 */
	MRealParamSWPSPSwitchCase createMRealParamSWPSPSwitchCase();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	mespswpPackage getmespswpPackage();

}