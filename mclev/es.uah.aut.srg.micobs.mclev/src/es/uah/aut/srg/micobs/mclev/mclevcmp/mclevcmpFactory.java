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
package es.uah.aut.srg.micobs.mclev.mclevcmp;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * 
 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage
 * @generated
 */
public interface mclevcmpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	mclevcmpFactory eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MComponent</em>'.
	 * @return a new object of class '<em>MComponent</em>'.
	 * @generated
	 */
	MComponent createMComponent();

	/**
	 * Returns a new object of class '<em>MAbstractComponent</em>'.
	 * @return a new object of class '<em>MAbstractComponent</em>'.
	 * @generated
	 */
	MAbstractComponent createMAbstractComponent();

	/**
	 * Returns a new object of class '<em>MComponentSupportedPlatform</em>'.
	 * @return a new object of class '<em>MComponentSupportedPlatform</em>'.
	 * @generated
	 */
	MComponentSupportedPlatform createMComponentSupportedPlatform();

	/**
	 * Returns a new object of class '<em>MInternalComponentInstance</em>'.
	 * @return a new object of class '<em>MInternalComponentInstance</em>'.
	 * @generated
	 */
	MInternalComponentInstance createMInternalComponentInstance();

	/**
	 * Returns a new object of class '<em>MServerPort</em>'.
	 * @return a new object of class '<em>MServerPort</em>'.
	 * @generated
	 */
	MServerPort createMServerPort();

	/**
	 * Returns a new object of class '<em>MClientPort</em>'.
	 * @return a new object of class '<em>MClientPort</em>'.
	 * @generated
	 */
	MClientPort createMClientPort();

	/**
	 * Returns a new object of class '<em>MInternalComponentConnection</em>'.
	 * @return a new object of class '<em>MInternalComponentConnection</em>'.
	 * @generated
	 */
	MInternalComponentConnection createMInternalComponentConnection();

	/**
	 * Returns a new object of class '<em>MInternalComponentPlatformSwitch</em>'.
	 * @return a new object of class '<em>MInternalComponentPlatformSwitch</em>'.
	 * @generated
	 */
	MInternalComponentPlatformSwitch createMInternalComponentPlatformSwitch();

	/**
	 * Returns a new object of class '<em>MInternalComponentPlatformSwitchCase</em>'.
	 * @return a new object of class '<em>MInternalComponentPlatformSwitchCase</em>'.
	 * @generated
	 */
	MInternalComponentPlatformSwitchCase createMInternalComponentPlatformSwitchCase();

	/**
	 * Returns a new object of class '<em>MMCLEVCMPPackageFile</em>'.
	 * @return a new object of class '<em>MMCLEVCMPPackageFile</em>'.
	 * @generated
	 */
	MMCLEVCMPPackageFile createMMCLEVCMPPackageFile();

	/**
	 * Returns a new object of class '<em>MBooleanParamCSPSwitch</em>'.
	 * @return a new object of class '<em>MBooleanParamCSPSwitch</em>'.
	 * @generated
	 */
	MBooleanParamCSPSwitch createMBooleanParamCSPSwitch();

	/**
	 * Returns a new object of class '<em>MBooleanParamCSPSwitchCase</em>'.
	 * @return a new object of class '<em>MBooleanParamCSPSwitchCase</em>'.
	 * @generated
	 */
	MBooleanParamCSPSwitchCase createMBooleanParamCSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MStringParamCSPSwitch</em>'.
	 * @return a new object of class '<em>MStringParamCSPSwitch</em>'.
	 * @generated
	 */
	MStringParamCSPSwitch createMStringParamCSPSwitch();

	/**
	 * Returns a new object of class '<em>MStringParamCSPSwitchCase</em>'.
	 * @return a new object of class '<em>MStringParamCSPSwitchCase</em>'.
	 * @generated
	 */
	MStringParamCSPSwitchCase createMStringParamCSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MIntegerParamCSPSwitch</em>'.
	 * @return a new object of class '<em>MIntegerParamCSPSwitch</em>'.
	 * @generated
	 */
	MIntegerParamCSPSwitch createMIntegerParamCSPSwitch();

	/**
	 * Returns a new object of class '<em>MIntegerParamCSPSwitchCase</em>'.
	 * @return a new object of class '<em>MIntegerParamCSPSwitchCase</em>'.
	 * @generated
	 */
	MIntegerParamCSPSwitchCase createMIntegerParamCSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MEnumParamCSPSwitch</em>'.
	 * @return a new object of class '<em>MEnumParamCSPSwitch</em>'.
	 * @generated
	 */
	MEnumParamCSPSwitch createMEnumParamCSPSwitch();

	/**
	 * Returns a new object of class '<em>MEnumParamCSPSwitchCase</em>'.
	 * @return a new object of class '<em>MEnumParamCSPSwitchCase</em>'.
	 * @generated
	 */
	MEnumParamCSPSwitchCase createMEnumParamCSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MRealParamCSPSwitch</em>'.
	 * @return a new object of class '<em>MRealParamCSPSwitch</em>'.
	 * @generated
	 */
	MRealParamCSPSwitch createMRealParamCSPSwitch();

	/**
	 * Returns a new object of class '<em>MRealParamCSPSwitchCase</em>'.
	 * @return a new object of class '<em>MRealParamCSPSwitchCase</em>'.
	 * @generated
	 */
	MRealParamCSPSwitchCase createMRealParamCSPSwitchCase();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	mclevcmpPackage getmclevcmpPackage();

}