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
package es.uah.aut.srg.micobs.mclev.mclevslib;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage
 * @generated
 */
public interface mclevslibFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	mclevslibFactory eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MServiceLibrary</em>'.
	 * @return a new object of class '<em>MServiceLibrary</em>'.
	 * @generated
	 */
	MServiceLibrary createMServiceLibrary();

	/**
	 * Returns a new object of class '<em>MServiceLibraryProvidedSAI</em>'.
	 * @return a new object of class '<em>MServiceLibraryProvidedSAI</em>'.
	 * @generated
	 */
	MServiceLibraryProvidedSAI createMServiceLibraryProvidedSAI();

	/**
	 * Returns a new object of class '<em>MSLibProvidedSAIAVASwitch</em>'.
	 * @return a new object of class '<em>MSLibProvidedSAIAVASwitch</em>'.
	 * @generated
	 */
	MSLibProvidedSAIAVASwitch createMSLibProvidedSAIAVASwitch();

	/**
	 * Returns a new object of class '<em>MSLibProvidedSAIAVASwitchCase</em>'.
	 * @return a new object of class '<em>MSLibProvidedSAIAVASwitchCase</em>'.
	 * @generated
	 */
	MSLibProvidedSAIAVASwitchCase createMSLibProvidedSAIAVASwitchCase();

	/**
	 * Returns a new object of class '<em>MSLibProvidedSAIAVAExpression</em>'.
	 * @return a new object of class '<em>MSLibProvidedSAIAVAExpression</em>'.
	 * @generated
	 */
	MSLibProvidedSAIAVAExpression createMSLibProvidedSAIAVAExpression();

	/**
	 * Returns a new object of class '<em>MServiceLibrarySupportedPlatform</em>'.
	 * @return a new object of class '<em>MServiceLibrarySupportedPlatform</em>'.
	 * @generated
	 */
	MServiceLibrarySupportedPlatform createMServiceLibrarySupportedPlatform();

	/**
	 * Returns a new object of class '<em>MDriverSLibSupportedPlatform</em>'.
	 * @return a new object of class '<em>MDriverSLibSupportedPlatform</em>'.
	 * @generated
	 */
	MDriverSLibSupportedPlatform createMDriverSLibSupportedPlatform();

	/**
	 * Returns a new object of class '<em>MDriverSLibSupportedDevice</em>'.
	 * @return a new object of class '<em>MDriverSLibSupportedDevice</em>'.
	 * @generated
	 */
	MDriverSLibSupportedDevice createMDriverSLibSupportedDevice();

	/**
	 * Returns a new object of class '<em>MAbstractServiceLibrary</em>'.
	 * @return a new object of class '<em>MAbstractServiceLibrary</em>'.
	 * @generated
	 */
	MAbstractServiceLibrary createMAbstractServiceLibrary();

	/**
	 * Returns a new object of class '<em>MMCLEVSLIBPackageFile</em>'.
	 * @return a new object of class '<em>MMCLEVSLIBPackageFile</em>'.
	 * @generated
	 */
	MMCLEVSLIBPackageFile createMMCLEVSLIBPackageFile();

	/**
	 * Returns a new object of class '<em>MDriverServiceLibrary</em>'.
	 * @return a new object of class '<em>MDriverServiceLibrary</em>'.
	 * @generated
	 */
	MDriverServiceLibrary createMDriverServiceLibrary();

	/**
	 * Returns a new object of class '<em>MBooleanParamSLSPSwitch</em>'.
	 * @return a new object of class '<em>MBooleanParamSLSPSwitch</em>'.
	 * @generated
	 */
	MBooleanParamSLSPSwitch createMBooleanParamSLSPSwitch();

	/**
	 * Returns a new object of class '<em>MBooleanParamSLSPSwitchCase</em>'.
	 * @return a new object of class '<em>MBooleanParamSLSPSwitchCase</em>'.
	 * @generated
	 */
	MBooleanParamSLSPSwitchCase createMBooleanParamSLSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MStringParamSLSPSwitch</em>'.
	 * @return a new object of class '<em>MStringParamSLSPSwitch</em>'.
	 * @generated
	 */
	MStringParamSLSPSwitch createMStringParamSLSPSwitch();

	/**
	 * Returns a new object of class '<em>MStringParamSLSPSwitchCase</em>'.
	 * @return a new object of class '<em>MStringParamSLSPSwitchCase</em>'.
	 * @generated
	 */
	MStringParamSLSPSwitchCase createMStringParamSLSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MIntegerParamSLSPSwitch</em>'.
	 * @return a new object of class '<em>MIntegerParamSLSPSwitch</em>'.
	 * @generated
	 */
	MIntegerParamSLSPSwitch createMIntegerParamSLSPSwitch();

	/**
	 * Returns a new object of class '<em>MIntegerParamSLSPSwitchCase</em>'.
	 * @return a new object of class '<em>MIntegerParamSLSPSwitchCase</em>'.
	 * @generated
	 */
	MIntegerParamSLSPSwitchCase createMIntegerParamSLSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MEnumParamSLSPSwitch</em>'.
	 * @return a new object of class '<em>MEnumParamSLSPSwitch</em>'.
	 * @generated
	 */
	MEnumParamSLSPSwitch createMEnumParamSLSPSwitch();

	/**
	 * Returns a new object of class '<em>MEnumParamSLSPSwitchCase</em>'.
	 * @return a new object of class '<em>MEnumParamSLSPSwitchCase</em>'.
	 * @generated
	 */
	MEnumParamSLSPSwitchCase createMEnumParamSLSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MRealParamSLSPSwitch</em>'.
	 * @return a new object of class '<em>MRealParamSLSPSwitch</em>'.
	 * @generated
	 */
	MRealParamSLSPSwitch createMRealParamSLSPSwitch();

	/**
	 * Returns a new object of class '<em>MRealParamSLSPSwitchCase</em>'.
	 * @return a new object of class '<em>MRealParamSLSPSwitchCase</em>'.
	 * @generated
	 */
	MRealParamSLSPSwitchCase createMRealParamSLSPSwitchCase();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	mclevslibPackage getmclevslibPackage();

}