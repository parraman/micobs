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
package es.uah.aut.srg.micobs.pdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * 
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage
 * @generated
 */
public interface pdlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	pdlFactory eINSTANCE = es.uah.aut.srg.micobs.pdl.impl.pdlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MBoard</em>'.
	 * @return a new object of class '<em>MBoard</em>'.
	 * @generated
	 */
	MBoard createMBoard();

	/**
	 * Returns a new object of class '<em>MBoardSupportedDevice</em>'.
	 * @return a new object of class '<em>MBoardSupportedDevice</em>'.
	 * @generated
	 */
	MBoardSupportedDevice createMBoardSupportedDevice();

	/**
	 * Returns a new object of class '<em>MMicroprocessor</em>'.
	 * @return a new object of class '<em>MMicroprocessor</em>'.
	 * @generated
	 */
	MMicroprocessor createMMicroprocessor();

	/**
	 * Returns a new object of class '<em>MOperatingSystem</em>'.
	 * @return a new object of class '<em>MOperatingSystem</em>'.
	 * @generated
	 */
	MOperatingSystem createMOperatingSystem();

	/**
	 * Returns a new object of class '<em>MOSSupportedPlatform</em>'.
	 * @return a new object of class '<em>MOSSupportedPlatform</em>'.
	 * @generated
	 */
	MOSSupportedPlatform createMOSSupportedPlatform();

	/**
	 * Returns a new object of class '<em>MOSSupportedOSAPI</em>'.
	 * @return a new object of class '<em>MOSSupportedOSAPI</em>'.
	 * @generated
	 */
	MOSSupportedOSAPI createMOSSupportedOSAPI();

	/**
	 * Returns a new object of class '<em>MOSSupportedOSAPIPVAExpression</em>'.
	 * @return a new object of class '<em>MOSSupportedOSAPIPVAExpression</em>'.
	 * @generated
	 */
	MOSSupportedOSAPIPVAExpression createMOSSupportedOSAPIPVAExpression();

	/**
	 * Returns a new object of class '<em>MOSSupportedOSAPIPVASwitch</em>'.
	 * @return a new object of class '<em>MOSSupportedOSAPIPVASwitch</em>'.
	 * @generated
	 */
	MOSSupportedOSAPIPVASwitch createMOSSupportedOSAPIPVASwitch();

	/**
	 * Returns a new object of class '<em>MOSSupportedOSAPIPVASwitchCase</em>'.
	 * @return a new object of class '<em>MOSSupportedOSAPIPVASwitchCase</em>'.
	 * @generated
	 */
	MOSSupportedOSAPIPVASwitchCase createMOSSupportedOSAPIPVASwitchCase();

	/**
	 * Returns a new object of class '<em>MOperatingSystemAPI</em>'.
	 * @return a new object of class '<em>MOperatingSystemAPI</em>'.
	 * @generated
	 */
	MOperatingSystemAPI createMOperatingSystemAPI();

	/**
	 * Returns a new object of class '<em>MArchitecture</em>'.
	 * @return a new object of class '<em>MArchitecture</em>'.
	 * @generated
	 */
	MArchitecture createMArchitecture();

	/**
	 * Returns a new object of class '<em>MPDLPackageFile</em>'.
	 * @return a new object of class '<em>MPDLPackageFile</em>'.
	 * @generated
	 */
	MPDLPackageFile createMPDLPackageFile();

	/**
	 * Returns a new object of class '<em>MPlatform</em>'.
	 * @return a new object of class '<em>MPlatform</em>'.
	 * @generated
	 */
	MPlatform createMPlatform();

	/**
	 * Returns a new object of class '<em>MCompiler</em>'.
	 * @return a new object of class '<em>MCompiler</em>'.
	 * @generated
	 */
	MCompiler createMCompiler();

	/**
	 * Returns a new object of class '<em>MCompilerFrontend</em>'.
	 * @return a new object of class '<em>MCompilerFrontend</em>'.
	 * @generated
	 */
	MCompilerFrontend createMCompilerFrontend();

	/**
	 * Returns a new object of class '<em>MDevice</em>'.
	 * @return a new object of class '<em>MDevice</em>'.
	 * @generated
	 */
	MDevice createMDevice();

	/**
	 * Returns a new object of class '<em>MBooleanParamOSSPSwitch</em>'.
	 * @return a new object of class '<em>MBooleanParamOSSPSwitch</em>'.
	 * @generated
	 */
	MBooleanParamOSSPSwitch createMBooleanParamOSSPSwitch();

	/**
	 * Returns a new object of class '<em>MBooleanParamOSSPSwitchCase</em>'.
	 * @return a new object of class '<em>MBooleanParamOSSPSwitchCase</em>'.
	 * @generated
	 */
	MBooleanParamOSSPSwitchCase createMBooleanParamOSSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MStringParamOSSPSwitch</em>'.
	 * @return a new object of class '<em>MStringParamOSSPSwitch</em>'.
	 * @generated
	 */
	MStringParamOSSPSwitch createMStringParamOSSPSwitch();

	/**
	 * Returns a new object of class '<em>MStringParamOSSPSwitchCase</em>'.
	 * @return a new object of class '<em>MStringParamOSSPSwitchCase</em>'.
	 * @generated
	 */
	MStringParamOSSPSwitchCase createMStringParamOSSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MIntegerParamOSSPSwitch</em>'.
	 * @return a new object of class '<em>MIntegerParamOSSPSwitch</em>'.
	 * @generated
	 */
	MIntegerParamOSSPSwitch createMIntegerParamOSSPSwitch();

	/**
	 * Returns a new object of class '<em>MIntegerParamOSSPSwitchCase</em>'.
	 * @return a new object of class '<em>MIntegerParamOSSPSwitchCase</em>'.
	 * @generated
	 */
	MIntegerParamOSSPSwitchCase createMIntegerParamOSSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MEnumParamOSSPSwitch</em>'.
	 * @return a new object of class '<em>MEnumParamOSSPSwitch</em>'.
	 * @generated
	 */
	MEnumParamOSSPSwitch createMEnumParamOSSPSwitch();

	/**
	 * Returns a new object of class '<em>MEnumParamOSSPSwitchCase</em>'.
	 * @return a new object of class '<em>MEnumParamOSSPSwitchCase</em>'.
	 * @generated
	 */
	MEnumParamOSSPSwitchCase createMEnumParamOSSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MRealParamOSSPSwitch</em>'.
	 * @return a new object of class '<em>MRealParamOSSPSwitch</em>'.
	 * @generated
	 */
	MRealParamOSSPSwitch createMRealParamOSSPSwitch();

	/**
	 * Returns a new object of class '<em>MRealParamOSSPSwitchCase</em>'.
	 * @return a new object of class '<em>MRealParamOSSPSwitchCase</em>'.
	 * @generated
	 */
	MRealParamOSSPSwitchCase createMRealParamOSSPSwitchCase();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	pdlPackage getpdlPackage();

}
