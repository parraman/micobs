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
package es.uah.aut.srg.micobs.mclev.mclevdom;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage
 * @generated
 */
public interface mclevdomFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	mclevdomFactory eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MAODomain</em>'.
	 * @return a new object of class '<em>MAODomain</em>'.
	 * @generated
	 */
	MAODomain createMAODomain();

	/**
	 * Returns a new object of class '<em>MIODomain</em>'.
	 * @return a new object of class '<em>MIODomain</em>'.
	 * @generated
	 */
	MIODomain createMIODomain();

	/**
	 * Returns a new object of class '<em>MIODAbstractComponentType</em>'.
	 * @return a new object of class '<em>MIODAbstractComponentType</em>'.
	 * @generated
	 */
	MIODAbstractComponentType createMIODAbstractComponentType();

	/**
	 * Returns a new object of class '<em>MIODComponentType</em>'.
	 * @return a new object of class '<em>MIODComponentType</em>'.
	 * @generated
	 */
	MIODComponentType createMIODComponentType();

	/**
	 * Returns a new object of class '<em>MAODComponentType</em>'.
	 * @return a new object of class '<em>MAODComponentType</em>'.
	 * @generated
	 */
	MAODComponentType createMAODComponentType();

	/**
	 * Returns a new object of class '<em>MIODComponentTypeInstance</em>'.
	 * @return a new object of class '<em>MIODComponentTypeInstance</em>'.
	 * @generated
	 */
	MIODComponentTypeInstance createMIODComponentTypeInstance();

	/**
	 * Returns a new object of class '<em>MAODComponentTypeInstance</em>'.
	 * @return a new object of class '<em>MAODComponentTypeInstance</em>'.
	 * @generated
	 */
	MAODComponentTypeInstance createMAODComponentTypeInstance();

	/**
	 * Returns a new object of class '<em>MInternalPortTypeInstance</em>'.
	 * @return a new object of class '<em>MInternalPortTypeInstance</em>'.
	 * @generated
	 */
	MInternalPortTypeInstance createMInternalPortTypeInstance();

	/**
	 * Returns a new object of class '<em>MInternalClientPortTypeInstance</em>'.
	 * @return a new object of class '<em>MInternalClientPortTypeInstance</em>'.
	 * @generated
	 */
	MInternalClientPortTypeInstance createMInternalClientPortTypeInstance();

	/**
	 * Returns a new object of class '<em>MInternalServerPortTypeInstance</em>'.
	 * @return a new object of class '<em>MInternalServerPortTypeInstance</em>'.
	 * @generated
	 */
	MInternalServerPortTypeInstance createMInternalServerPortTypeInstance();

	/**
	 * Returns a new object of class '<em>MExternalPortTypeInstance</em>'.
	 * @return a new object of class '<em>MExternalPortTypeInstance</em>'.
	 * @generated
	 */
	MExternalPortTypeInstance createMExternalPortTypeInstance();

	/**
	 * Returns a new object of class '<em>MExternalClientPortTypeInstance</em>'.
	 * @return a new object of class '<em>MExternalClientPortTypeInstance</em>'.
	 * @generated
	 */
	MExternalClientPortTypeInstance createMExternalClientPortTypeInstance();

	/**
	 * Returns a new object of class '<em>MExternalServerPortTypeInstance</em>'.
	 * @return a new object of class '<em>MExternalServerPortTypeInstance</em>'.
	 * @generated
	 */
	MExternalServerPortTypeInstance createMExternalServerPortTypeInstance();

	/**
	 * Returns a new object of class '<em>MConnector</em>'.
	 * @return a new object of class '<em>MConnector</em>'.
	 * @generated
	 */
	MConnector createMConnector();

	/**
	 * Returns a new object of class '<em>MPortType</em>'.
	 * @return a new object of class '<em>MPortType</em>'.
	 * @generated
	 */
	MPortType createMPortType();

	/**
	 * Returns a new object of class '<em>MInterfaceType</em>'.
	 * @return a new object of class '<em>MInterfaceType</em>'.
	 * @generated
	 */
	MInterfaceType createMInterfaceType();

	/**
	 * Returns a new object of class '<em>MExchangeModel</em>'.
	 * @return a new object of class '<em>MExchangeModel</em>'.
	 * @generated
	 */
	MExchangeModel createMExchangeModel();

	/**
	 * Returns a new object of class '<em>MMCLEVDOMPackageFile</em>'.
	 * @return a new object of class '<em>MMCLEVDOMPackageFile</em>'.
	 * @generated
	 */
	MMCLEVDOMPackageFile createMMCLEVDOMPackageFile();

	/**
	 * Returns a new object of class '<em>MIODomainSupportedPlatform</em>'.
	 * @return a new object of class '<em>MIODomainSupportedPlatform</em>'.
	 * @generated
	 */
	MIODomainSupportedPlatform createMIODomainSupportedPlatform();

	/**
	 * Returns a new object of class '<em>MBooleanParamIODSPSwitch</em>'.
	 * @return a new object of class '<em>MBooleanParamIODSPSwitch</em>'.
	 * @generated
	 */
	MBooleanParamIODSPSwitch createMBooleanParamIODSPSwitch();

	/**
	 * Returns a new object of class '<em>MBooleanParamIODSPSwitchCase</em>'.
	 * @return a new object of class '<em>MBooleanParamIODSPSwitchCase</em>'.
	 * @generated
	 */
	MBooleanParamIODSPSwitchCase createMBooleanParamIODSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MStringParamIODSPSwitch</em>'.
	 * @return a new object of class '<em>MStringParamIODSPSwitch</em>'.
	 * @generated
	 */
	MStringParamIODSPSwitch createMStringParamIODSPSwitch();

	/**
	 * Returns a new object of class '<em>MStringParamIODSPSwitchCase</em>'.
	 * @return a new object of class '<em>MStringParamIODSPSwitchCase</em>'.
	 * @generated
	 */
	MStringParamIODSPSwitchCase createMStringParamIODSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MIntegerParamIODSPSwitch</em>'.
	 * @return a new object of class '<em>MIntegerParamIODSPSwitch</em>'.
	 * @generated
	 */
	MIntegerParamIODSPSwitch createMIntegerParamIODSPSwitch();

	/**
	 * Returns a new object of class '<em>MIntegerParamIODSPSwitchCase</em>'.
	 * @return a new object of class '<em>MIntegerParamIODSPSwitchCase</em>'.
	 * @generated
	 */
	MIntegerParamIODSPSwitchCase createMIntegerParamIODSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MEnumParamIODSPSwitch</em>'.
	 * @return a new object of class '<em>MEnumParamIODSPSwitch</em>'.
	 * @generated
	 */
	MEnumParamIODSPSwitch createMEnumParamIODSPSwitch();

	/**
	 * Returns a new object of class '<em>MEnumParamIODSPSwitchCase</em>'.
	 * @return a new object of class '<em>MEnumParamIODSPSwitchCase</em>'.
	 * @generated
	 */
	MEnumParamIODSPSwitchCase createMEnumParamIODSPSwitchCase();

	/**
	 * Returns a new object of class '<em>MRealParamIODSPSwitch</em>'.
	 * @return a new object of class '<em>MRealParamIODSPSwitch</em>'.
	 * @generated
	 */
	MRealParamIODSPSwitch createMRealParamIODSPSwitch();

	/**
	 * Returns a new object of class '<em>MRealParamIODSPSwitchCase</em>'.
	 * @return a new object of class '<em>MRealParamIODSPSwitchCase</em>'.
	 * @generated
	 */
	MRealParamIODSPSwitchCase createMRealParamIODSPSwitchCase();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	mclevdomPackage getmclevdomPackage();

}