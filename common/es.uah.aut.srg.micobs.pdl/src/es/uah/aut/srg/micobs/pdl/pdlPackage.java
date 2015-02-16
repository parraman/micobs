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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * 
 * @see es.uah.aut.srg.micobs.pdl.pdlFactory
 * @model kind="package"
 * @generated
 */
public interface pdlPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "pdl";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/pdl";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	pdlPackage eINSTANCE = es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MPDLPackageElementImpl <em>MPDLPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MPDLPackageElementImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMPDLPackageElement()
	 * @generated
	 */
	int MPDL_PACKAGE_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MPDLPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MBoardImpl <em>MBoard</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MBoardImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMBoard()
	 * @generated
	 */
	int MBOARD = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOARD__VERSION = MPDL_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOARD__NAME = MPDL_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOARD__URI = MPDL_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Microprocessor</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MBOARD__MICROPROCESSOR = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MBOARD__PARAMETERS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>SupportedDevices</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MBOARD__SUPPORTED_DEVICES = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MBoard</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOARD_FEATURE_COUNT = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MBoardSupportedDeviceImpl <em>MBoardSupportedDevice</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MBoardSupportedDeviceImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMBoardSupportedDevice()
	 * @generated
	 */
	int MBOARD_SUPPORTED_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>LowerBound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MBOARD_SUPPORTED_DEVICE__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>UpperBound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MBOARD_SUPPORTED_DEVICE__UPPER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MBOARD_SUPPORTED_DEVICE__DEVICE = 2;

	/**
	 * The number of structural features of the '<em>MBoardSupportedDevice</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOARD_SUPPORTED_DEVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MMicroprocessorImpl <em>MMicroprocessor</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MMicroprocessorImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMMicroprocessor()
	 * @generated
	 */
	int MMICROPROCESSOR = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMICROPROCESSOR__VERSION = MPDL_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMICROPROCESSOR__NAME = MPDL_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMICROPROCESSOR__URI = MPDL_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMICROPROCESSOR__ARCHITECTURE = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMICROPROCESSOR__PARAMETERS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MMicroprocessor</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMICROPROCESSOR_FEATURE_COUNT = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemImpl <em>MOperatingSystem</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOperatingSystem()
	 * @generated
	 */
	int MOPERATING_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM__VERSION = MPDL_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM__NAME = MPDL_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM__URI = MPDL_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM__INHERITS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM__LANGUAGES = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM__PARAMETERS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>SupportedPlatforms</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM__SUPPORTED_PLATFORMS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>SupportedOSAPIs</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM__SUPPORTED_OSAP_IS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MOperatingSystem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM_FEATURE_COUNT = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedPlatformImpl <em>MOSSupportedPlatform</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MOSSupportedPlatformImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOSSupportedPlatform()
	 * @generated
	 */
	int MOS_SUPPORTED_PLATFORM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_PLATFORM__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_PLATFORM__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_PLATFORM__ARCHITECTURE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compiler</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_PLATFORM__COMPILER = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Microprocessor</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_PLATFORM__MICROPROCESSOR = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_PLATFORM__BOARD = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_PLATFORM__PARAMETERS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_PLATFORM__LANGUAGES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MOSSupportedPlatform</em>' class.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_PLATFORM_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIImpl <em>MOSSupportedOSAPI</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOSSupportedOSAPI()
	 * @generated
	 */
	int MOS_SUPPORTED_OSAPI = 5;

	/**
	 * The feature id for the '<em><b>OSAPI</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPI__OSAPI = 0;

	/**
	 * The feature id for the '<em><b>ParameterValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPI__PARAMETER_VALUE_ASSIGNMENTS = 1;

	/**
	 * The number of structural features of the '<em>MOSSupportedOSAPI</em>' class.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPI_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVAImpl <em>MOS Supported OSAPIPVA</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVAImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOSSupportedOSAPIPVA()
	 * @generated
	 */
	int MOS_SUPPORTED_OSAPIPVA = 6;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPIPVA__PARAMETER = commonPackage.MPARAMETER_VALUE_ASSIGNMENT__PARAMETER;

	/**
	 * The number of structural features of the '<em>MOS Supported OSAPIPVA</em>' class.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPIPVA_FEATURE_COUNT = commonPackage.MPARAMETER_VALUE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVAExpressionImpl <em>MOSSupportedOSAPIPVAExpression</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVAExpressionImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOSSupportedOSAPIPVAExpression()
	 * @generated
	 */
	int MOS_SUPPORTED_OSAPIPVA_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPIPVA_EXPRESSION__PARAMETER = MOS_SUPPORTED_OSAPIPVA__PARAMETER;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPIPVA_EXPRESSION__PARAMETER_VALUE = MOS_SUPPORTED_OSAPIPVA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MOSSupportedOSAPIPVAExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPIPVA_EXPRESSION_FEATURE_COUNT = MOS_SUPPORTED_OSAPIPVA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVASwitchImpl <em>MOSSupportedOSAPIPVASwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVASwitchImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOSSupportedOSAPIPVASwitch()
	 * @generated
	 */
	int MOS_SUPPORTED_OSAPIPVA_SWITCH = 8;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPIPVA_SWITCH__PARAMETER = MOS_SUPPORTED_OSAPIPVA__PARAMETER;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPIPVA_SWITCH__CASES = MOS_SUPPORTED_OSAPIPVA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MOSSupportedOSAPIPVASwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPIPVA_SWITCH_FEATURE_COUNT = MOS_SUPPORTED_OSAPIPVA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVASwitchCaseImpl <em>MOSSupportedOSAPIPVASwitch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVASwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOSSupportedOSAPIPVASwitchCase()
	 * @generated
	 */
	int MOS_SUPPORTED_OSAPIPVA_SWITCH_CASE = 9;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPIPVA_SWITCH_CASE__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPIPVA_SWITCH_CASE__PARAMETER_VALUE = 1;

	/**
	 * The number of structural features of the '<em>MOSSupportedOSAPIPVASwitch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MOS_SUPPORTED_OSAPIPVA_SWITCH_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemAPIImpl <em>MOperatingSystemAPI</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemAPIImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOperatingSystemAPI()
	 * @generated
	 */
	int MOPERATING_SYSTEM_API = 10;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM_API__VERSION = MPDL_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM_API__NAME = MPDL_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM_API__URI = MPDL_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM_API__INHERITS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM_API__LANGUAGE = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM_API__PARAMETERS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MOperatingSystemAPI</em>' class.
	 * @generated
	 * @ordered
	 */
	int MOPERATING_SYSTEM_API_FEATURE_COUNT = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MArchitectureImpl <em>MArchitecture</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MArchitectureImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMArchitecture()
	 * @generated
	 */
	int MARCHITECTURE = 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MARCHITECTURE__VERSION = MPDL_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MARCHITECTURE__NAME = MPDL_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MARCHITECTURE__URI = MPDL_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MARCHITECTURE__EXTENDS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MARCHITECTURE__PARAMETERS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MArchitecture</em>' class.
	 * @generated
	 * @ordered
	 */
	int MARCHITECTURE_FEATURE_COUNT = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MPDLPackageFileImpl <em>MPDLPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MPDLPackageFileImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMPDLPackageFile()
	 * @generated
	 */
	int MPDL_PACKAGE_FILE = 12;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MPDLPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPDL_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MPlatformImpl <em>MPlatform</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MPlatformImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMPlatform()
	 * @generated
	 */
	int MPLATFORM = 14;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM__VERSION = MPDL_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM__NAME = MPDL_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM__URI = MPDL_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>OSAPI</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM__OSAPI = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>OS</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM__OS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM__ARCHITECTURE = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compiler</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM__COMPILER = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Microprocessor</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM__MICROPROCESSOR = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM__BOARD = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM__PARAMETERS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MPlatform</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPLATFORM_FEATURE_COUNT = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MCompilerImpl <em>MCompiler</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MCompilerImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMCompiler()
	 * @generated
	 */
	int MCOMPILER = 15;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER__VERSION = MPDL_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER__NAME = MPDL_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER__URI = MPDL_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Frontends</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER__FRONTENDS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER__EXTENDS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER__PARAMETERS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MCompiler</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER_FEATURE_COUNT = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MCompilerFrontendImpl <em>MCompilerFrontend</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MCompilerFrontendImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMCompilerFrontend()
	 * @generated
	 */
	int MCOMPILER_FRONTEND = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER_FRONTEND__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER_FRONTEND__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER_FRONTEND__LANGUAGE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Architectures</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER_FRONTEND__ARCHITECTURES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER_FRONTEND__PARAMETERS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MCompilerFrontend</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMPILER_FRONTEND_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MDeviceImpl <em>MDevice</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MDeviceImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMDevice()
	 * @generated
	 */
	int MDEVICE = 17;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDEVICE__VERSION = MPDL_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDEVICE__NAME = MPDL_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDEVICE__URI = MPDL_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDEVICE__PARAMETERS = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MDevice</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDEVICE_FEATURE_COUNT = MPDL_PACKAGE_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MParameterOSSPSwitchImpl <em>MParameter OSSP Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MParameterOSSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMParameterOSSPSwitch()
	 * @generated
	 */
	int MPARAMETER_OSSP_SWITCH = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OSSP_SWITCH__NAME = commonPackage.MPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OSSP_SWITCH__DESCRIPTION = commonPackage.MPARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OSSP_SWITCH__CONSTANT = commonPackage.MPARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OSSP_SWITCH__CASES = commonPackage.MPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameter OSSP Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OSSP_SWITCH_FEATURE_COUNT = commonPackage.MPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MParameterOSSPSwitchCaseImpl <em>MParameter OSSP Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MParameterOSSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMParameterOSSPSwitchCase()
	 * @generated
	 */
	int MPARAMETER_OSSP_SWITCH_CASE = 19;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OSSP_SWITCH_CASE__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OSSP_SWITCH_CASE__DEFAULT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>MParameter OSSP Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OSSP_SWITCH_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MBooleanParamOSSPSwitchImpl <em>MBoolean Param OSSP Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MBooleanParamOSSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMBooleanParamOSSPSwitch()
	 * @generated
	 */
	int MBOOLEAN_PARAM_OSSP_SWITCH = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_OSSP_SWITCH__NAME = commonPackage.MBOOLEAN_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_OSSP_SWITCH__DESCRIPTION = commonPackage.MBOOLEAN_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_OSSP_SWITCH__CONSTANT = commonPackage.MBOOLEAN_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_OSSP_SWITCH__CASES = commonPackage.MBOOLEAN_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MBoolean Param OSSP Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_OSSP_SWITCH_FEATURE_COUNT = commonPackage.MBOOLEAN_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MBooleanParamOSSPSwitchCaseImpl <em>MBoolean Param OSSP Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MBooleanParamOSSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMBooleanParamOSSPSwitchCase()
	 * @generated
	 */
	int MBOOLEAN_PARAM_OSSP_SWITCH_CASE = 21;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_OSSP_SWITCH_CASE__PLATFORM = MPARAMETER_OSSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_OSSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_OSSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The number of structural features of the '<em>MBoolean Param OSSP Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_OSSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_OSSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MStringParamOSSPSwitchImpl <em>MString Param OSSP Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MStringParamOSSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMStringParamOSSPSwitch()
	 * @generated
	 */
	int MSTRING_PARAM_OSSP_SWITCH = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_OSSP_SWITCH__NAME = commonPackage.MSTRING_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_OSSP_SWITCH__DESCRIPTION = commonPackage.MSTRING_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_OSSP_SWITCH__CONSTANT = commonPackage.MSTRING_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_OSSP_SWITCH__CASES = commonPackage.MSTRING_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MString Param OSSP Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_OSSP_SWITCH_FEATURE_COUNT = commonPackage.MSTRING_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MStringParamOSSPSwitchCaseImpl <em>MString Param OSSP Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MStringParamOSSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMStringParamOSSPSwitchCase()
	 * @generated
	 */
	int MSTRING_PARAM_OSSP_SWITCH_CASE = 23;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_OSSP_SWITCH_CASE__PLATFORM = MPARAMETER_OSSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_OSSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_OSSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The number of structural features of the '<em>MString Param OSSP Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_OSSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_OSSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MIntegerParamOSSPSwitchImpl <em>MInteger Param OSSP Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MIntegerParamOSSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMIntegerParamOSSPSwitch()
	 * @generated
	 */
	int MINTEGER_PARAM_OSSP_SWITCH = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_OSSP_SWITCH__NAME = commonPackage.MINTEGER_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_OSSP_SWITCH__DESCRIPTION = commonPackage.MINTEGER_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_OSSP_SWITCH__CONSTANT = commonPackage.MINTEGER_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_OSSP_SWITCH__CASES = commonPackage.MINTEGER_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MInteger Param OSSP Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_OSSP_SWITCH_FEATURE_COUNT = commonPackage.MINTEGER_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MIntegerParamOSSPSwitchCaseImpl <em>MInteger Param OSSP Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MIntegerParamOSSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMIntegerParamOSSPSwitchCase()
	 * @generated
	 */
	int MINTEGER_PARAM_OSSP_SWITCH_CASE = 25;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_OSSP_SWITCH_CASE__PLATFORM = MPARAMETER_OSSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_OSSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_OSSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_OSSP_SWITCH_CASE__RANGE = MPARAMETER_OSSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MInteger Param OSSP Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_OSSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_OSSP_SWITCH_CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MEnumParamOSSPSwitchImpl <em>MEnum Param OSSP Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MEnumParamOSSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMEnumParamOSSPSwitch()
	 * @generated
	 */
	int MENUM_PARAM_OSSP_SWITCH = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_OSSP_SWITCH__NAME = commonPackage.MENUM_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_OSSP_SWITCH__DESCRIPTION = commonPackage.MENUM_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_OSSP_SWITCH__CONSTANT = commonPackage.MENUM_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Enum Definition</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_OSSP_SWITCH__ENUM_DEFINITION = commonPackage.MENUM_PARAMETER__ENUM_DEFINITION;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_OSSP_SWITCH__CASES = commonPackage.MENUM_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MEnum Param OSSP Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_OSSP_SWITCH_FEATURE_COUNT = commonPackage.MENUM_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MEnumParamOSSPSwitchCaseImpl <em>MEnum Param OSSP Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MEnumParamOSSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMEnumParamOSSPSwitchCase()
	 * @generated
	 */
	int MENUM_PARAM_OSSP_SWITCH_CASE = 27;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_OSSP_SWITCH_CASE__PLATFORM = MPARAMETER_OSSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_OSSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_OSSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The number of structural features of the '<em>MEnum Param OSSP Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_OSSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_OSSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MRealParamOSSPSwitchImpl <em>MReal Param OSSP Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MRealParamOSSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMRealParamOSSPSwitch()
	 * @generated
	 */
	int MREAL_PARAM_OSSP_SWITCH = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_OSSP_SWITCH__NAME = commonPackage.MREAL_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_OSSP_SWITCH__DESCRIPTION = commonPackage.MREAL_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_OSSP_SWITCH__CONSTANT = commonPackage.MREAL_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_OSSP_SWITCH__CASES = commonPackage.MREAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MReal Param OSSP Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_OSSP_SWITCH_FEATURE_COUNT = commonPackage.MREAL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.pdl.impl.MRealParamOSSPSwitchCaseImpl <em>MReal Param OSSP Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.pdl.impl.MRealParamOSSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMRealParamOSSPSwitchCase()
	 * @generated
	 */
	int MREAL_PARAM_OSSP_SWITCH_CASE = 29;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_OSSP_SWITCH_CASE__PLATFORM = MPARAMETER_OSSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_OSSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_OSSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_OSSP_SWITCH_CASE__RANGE = MPARAMETER_OSSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MReal Param OSSP Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_OSSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_OSSP_SWITCH_CASE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MBoard <em>MBoard</em>}'.
	 * @return the meta object for class '<em>MBoard</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MBoard
	 * @generated
	 */
	EClass getMBoard();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MBoard#getMicroprocessor <em>Microprocessor</em>}'.
	 * @return the meta object for the reference '<em>Microprocessor</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MBoard#getMicroprocessor()
	 * @see #getMBoard()
	 * @generated
	 */
	EReference getMBoard_Microprocessor();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MBoard#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MBoard#getParameters()
	 * @see #getMBoard()
	 * @generated
	 */
	EReference getMBoard_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MBoard#getSupportedDevices <em>SupportedDevices</em>}'.
	 * @return the meta object for the containment reference list '<em>SupportedDevices</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MBoard#getSupportedDevices()
	 * @see #getMBoard()
	 * @generated
	 */
	EReference getMBoard_SupportedDevices();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice <em>MBoardSupportedDevice</em>}'.
	 * @return the meta object for class '<em>MBoardSupportedDevice</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice
	 * @generated
	 */
	EClass getMBoardSupportedDevice();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice#getLowerBound <em>LowerBound</em>}'.
	 * @return the meta object for the containment reference '<em>LowerBound</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice#getLowerBound()
	 * @see #getMBoardSupportedDevice()
	 * @generated
	 */
	EReference getMBoardSupportedDevice_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice#getUpperBound <em>UpperBound</em>}'.
	 * @return the meta object for the containment reference '<em>UpperBound</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice#getUpperBound()
	 * @see #getMBoardSupportedDevice()
	 * @generated
	 */
	EReference getMBoardSupportedDevice_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice#getDevice <em>Device</em>}'.
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice#getDevice()
	 * @see #getMBoardSupportedDevice()
	 * @generated
	 */
	EReference getMBoardSupportedDevice_Device();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MMicroprocessor <em>MMicroprocessor</em>}'.
	 * @return the meta object for class '<em>MMicroprocessor</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MMicroprocessor
	 * @generated
	 */
	EClass getMMicroprocessor();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MMicroprocessor#getArchitecture <em>Architecture</em>}'.
	 * @return the meta object for the reference '<em>Architecture</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MMicroprocessor#getArchitecture()
	 * @see #getMMicroprocessor()
	 * @generated
	 */
	EReference getMMicroprocessor_Architecture();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MMicroprocessor#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MMicroprocessor#getParameters()
	 * @see #getMMicroprocessor()
	 * @generated
	 */
	EReference getMMicroprocessor_Parameters();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MOperatingSystem <em>MOperatingSystem</em>}'.
	 * @return the meta object for class '<em>MOperatingSystem</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOperatingSystem
	 * @generated
	 */
	EClass getMOperatingSystem();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.pdl.MOperatingSystem#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOperatingSystem#getInherits()
	 * @see #getMOperatingSystem()
	 * @generated
	 */
	EReference getMOperatingSystem_Inherits();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.pdl.MOperatingSystem#getLanguages <em>Languages</em>}'.
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOperatingSystem#getLanguages()
	 * @see #getMOperatingSystem()
	 * @generated
	 */
	EReference getMOperatingSystem_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MOperatingSystem#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOperatingSystem#getParameters()
	 * @see #getMOperatingSystem()
	 * @generated
	 */
	EReference getMOperatingSystem_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MOperatingSystem#getSupportedPlatforms <em>SupportedPlatforms</em>}'.
	 * @return the meta object for the containment reference list '<em>SupportedPlatforms</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOperatingSystem#getSupportedPlatforms()
	 * @see #getMOperatingSystem()
	 * @generated
	 */
	EReference getMOperatingSystem_SupportedPlatforms();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MOperatingSystem#getSupportedOSAPIs <em>SupportedOSAPIs</em>}'.
	 * @return the meta object for the containment reference list '<em>SupportedOSAPIs</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOperatingSystem#getSupportedOSAPIs()
	 * @see #getMOperatingSystem()
	 * @generated
	 */
	EReference getMOperatingSystem_SupportedOSAPIs();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform <em>MOSSupportedPlatform</em>}'.
	 * @return the meta object for class '<em>MOSSupportedPlatform</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform
	 * @generated
	 */
	EClass getMOSSupportedPlatform();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getArchitecture <em>Architecture</em>}'.
	 * @return the meta object for the reference '<em>Architecture</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getArchitecture()
	 * @see #getMOSSupportedPlatform()
	 * @generated
	 */
	EReference getMOSSupportedPlatform_Architecture();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getCompiler <em>Compiler</em>}'.
	 * @return the meta object for the reference '<em>Compiler</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getCompiler()
	 * @see #getMOSSupportedPlatform()
	 * @generated
	 */
	EReference getMOSSupportedPlatform_Compiler();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getMicroprocessor <em>Microprocessor</em>}'.
	 * @return the meta object for the reference '<em>Microprocessor</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getMicroprocessor()
	 * @see #getMOSSupportedPlatform()
	 * @generated
	 */
	EReference getMOSSupportedPlatform_Microprocessor();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getBoard <em>Board</em>}'.
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getBoard()
	 * @see #getMOSSupportedPlatform()
	 * @generated
	 */
	EReference getMOSSupportedPlatform_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getParameters()
	 * @see #getMOSSupportedPlatform()
	 * @generated
	 */
	EReference getMOSSupportedPlatform_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getLanguages <em>Languages</em>}'.
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getLanguages()
	 * @see #getMOSSupportedPlatform()
	 * @generated
	 */
	EReference getMOSSupportedPlatform_Languages();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI <em>MOSSupportedOSAPI</em>}'.
	 * @return the meta object for class '<em>MOSSupportedOSAPI</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI
	 * @generated
	 */
	EClass getMOSSupportedOSAPI();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI#getOsapi <em>OSAPI</em>}'.
	 * @return the meta object for the reference '<em>OSAPI</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI#getOsapi()
	 * @see #getMOSSupportedOSAPI()
	 * @generated
	 */
	EReference getMOSSupportedOSAPI_Osapi();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI#getParameterValueAssignments <em>ParameterValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>ParameterValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI#getParameterValueAssignments()
	 * @see #getMOSSupportedOSAPI()
	 * @generated
	 */
	EReference getMOSSupportedOSAPI_ParameterValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVA <em>MOS Supported OSAPIPVA</em>}'.
	 * @return the meta object for class '<em>MOS Supported OSAPIPVA</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVA
	 * @generated
	 */
	EClass getMOSSupportedOSAPIPVA();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression <em>MOSSupportedOSAPIPVAExpression</em>}'.
	 * @return the meta object for class '<em>MOSSupportedOSAPIPVAExpression</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression
	 * @generated
	 */
	EClass getMOSSupportedOSAPIPVAExpression();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression#getParameterValue <em>Parameter Value</em>}'.
	 * @return the meta object for the containment reference '<em>Parameter Value</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression#getParameterValue()
	 * @see #getMOSSupportedOSAPIPVAExpression()
	 * @generated
	 */
	EReference getMOSSupportedOSAPIPVAExpression_ParameterValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch <em>MOSSupportedOSAPIPVASwitch</em>}'.
	 * @return the meta object for class '<em>MOSSupportedOSAPIPVASwitch</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch
	 * @generated
	 */
	EClass getMOSSupportedOSAPIPVASwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch#getCases <em>Cases</em>}'.
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch#getCases()
	 * @see #getMOSSupportedOSAPIPVASwitch()
	 * @generated
	 */
	EReference getMOSSupportedOSAPIPVASwitch_Cases();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase <em>MOSSupportedOSAPIPVASwitch Case</em>}'.
	 * @return the meta object for class '<em>MOSSupportedOSAPIPVASwitch Case</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase
	 * @generated
	 */
	EClass getMOSSupportedOSAPIPVASwitchCase();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase#getPlatform <em>Platform</em>}'.
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase#getPlatform()
	 * @see #getMOSSupportedOSAPIPVASwitchCase()
	 * @generated
	 */
	EReference getMOSSupportedOSAPIPVASwitchCase_Platform();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase#getParameterValue <em>Parameter Value</em>}'.
	 * @return the meta object for the containment reference '<em>Parameter Value</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase#getParameterValue()
	 * @see #getMOSSupportedOSAPIPVASwitchCase()
	 * @generated
	 */
	EReference getMOSSupportedOSAPIPVASwitchCase_ParameterValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI <em>MOperatingSystemAPI</em>}'.
	 * @return the meta object for class '<em>MOperatingSystemAPI</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI
	 * @generated
	 */
	EClass getMOperatingSystemAPI();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI#getInherits()
	 * @see #getMOperatingSystemAPI()
	 * @generated
	 */
	EReference getMOperatingSystemAPI_Inherits();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI#getLanguage <em>Language</em>}'.
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI#getLanguage()
	 * @see #getMOperatingSystemAPI()
	 * @generated
	 */
	EReference getMOperatingSystemAPI_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI#getParameters()
	 * @see #getMOperatingSystemAPI()
	 * @generated
	 */
	EReference getMOperatingSystemAPI_Parameters();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MArchitecture <em>MArchitecture</em>}'.
	 * @return the meta object for class '<em>MArchitecture</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MArchitecture
	 * @generated
	 */
	EClass getMArchitecture();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.pdl.MArchitecture#getExtends <em>Extends</em>}'.
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MArchitecture#getExtends()
	 * @see #getMArchitecture()
	 * @generated
	 */
	EReference getMArchitecture_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MArchitecture#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MArchitecture#getParameters()
	 * @see #getMArchitecture()
	 * @generated
	 */
	EReference getMArchitecture_Parameters();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MPDLPackageFile <em>MPDLPackageFile</em>}'.
	 * @return the meta object for class '<em>MPDLPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MPDLPackageFile
	 * @generated
	 */
	EClass getMPDLPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MPDLPackageElement <em>MPDLPackageElement</em>}'.
	 * @return the meta object for class '<em>MPDLPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MPDLPackageElement
	 * @generated
	 */
	EClass getMPDLPackageElement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MPlatform <em>MPlatform</em>}'.
	 * @return the meta object for class '<em>MPlatform</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MPlatform
	 * @generated
	 */
	EClass getMPlatform();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MPlatform#getOsapi <em>OSAPI</em>}'.
	 * @return the meta object for the reference '<em>OSAPI</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MPlatform#getOsapi()
	 * @see #getMPlatform()
	 * @generated
	 */
	EReference getMPlatform_Osapi();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MPlatform#getOs <em>OS</em>}'.
	 * @return the meta object for the reference '<em>OS</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MPlatform#getOs()
	 * @see #getMPlatform()
	 * @generated
	 */
	EReference getMPlatform_Os();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MPlatform#getArchitecture <em>Architecture</em>}'.
	 * @return the meta object for the reference '<em>Architecture</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MPlatform#getArchitecture()
	 * @see #getMPlatform()
	 * @generated
	 */
	EReference getMPlatform_Architecture();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MPlatform#getCompiler <em>Compiler</em>}'.
	 * @return the meta object for the reference '<em>Compiler</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MPlatform#getCompiler()
	 * @see #getMPlatform()
	 * @generated
	 */
	EReference getMPlatform_Compiler();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MPlatform#getMicroprocessor <em>Microprocessor</em>}'.
	 * @return the meta object for the reference '<em>Microprocessor</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MPlatform#getMicroprocessor()
	 * @see #getMPlatform()
	 * @generated
	 */
	EReference getMPlatform_Microprocessor();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MPlatform#getBoard <em>Board</em>}'.
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MPlatform#getBoard()
	 * @see #getMPlatform()
	 * @generated
	 */
	EReference getMPlatform_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MPlatform#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MPlatform#getParameters()
	 * @see #getMPlatform()
	 * @generated
	 */
	EReference getMPlatform_Parameters();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MCompiler <em>MCompiler</em>}'.
	 * @return the meta object for class '<em>MCompiler</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MCompiler
	 * @generated
	 */
	EClass getMCompiler();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MCompiler#getFrontends <em>Frontends</em>}'.
	 * @return the meta object for the containment reference list '<em>Frontends</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MCompiler#getFrontends()
	 * @see #getMCompiler()
	 * @generated
	 */
	EReference getMCompiler_Frontends();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.pdl.MCompiler#getExtends <em>Extends</em>}'.
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MCompiler#getExtends()
	 * @see #getMCompiler()
	 * @generated
	 */
	EReference getMCompiler_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MCompiler#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MCompiler#getParameters()
	 * @see #getMCompiler()
	 * @generated
	 */
	EReference getMCompiler_Parameters();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MCompilerFrontend <em>MCompilerFrontend</em>}'.
	 * @return the meta object for class '<em>MCompilerFrontend</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MCompilerFrontend
	 * @generated
	 */
	EClass getMCompilerFrontend();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MCompilerFrontend#getLanguage <em>Language</em>}'.
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MCompilerFrontend#getLanguage()
	 * @see #getMCompilerFrontend()
	 * @generated
	 */
	EReference getMCompilerFrontend_Language();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.pdl.MCompilerFrontend#getArchitectures <em>Architectures</em>}'.
	 * @return the meta object for the reference list '<em>Architectures</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MCompilerFrontend#getArchitectures()
	 * @see #getMCompilerFrontend()
	 * @generated
	 */
	EReference getMCompilerFrontend_Architectures();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MCompilerFrontend#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MCompilerFrontend#getParameters()
	 * @see #getMCompilerFrontend()
	 * @generated
	 */
	EReference getMCompilerFrontend_Parameters();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MDevice <em>MDevice</em>}'.
	 * @return the meta object for class '<em>MDevice</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MDevice
	 * @generated
	 */
	EClass getMDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MDevice#getParameters <em>Parameters</em>}'.
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MDevice#getParameters()
	 * @see #getMDevice()
	 * @generated
	 */
	EReference getMDevice_Parameters();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitch <em>MParameter OSSP Switch</em>}'.
	 * @return the meta object for class '<em>MParameter OSSP Switch</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitch
	 * @generated
	 */
	EClass getMParameterOSSPSwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitch#getCases <em>Cases</em>}'.
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitch#getCases()
	 * @see #getMParameterOSSPSwitch()
	 * @generated
	 */
	EReference getMParameterOSSPSwitch_Cases();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase <em>MParameter OSSP Switch Case</em>}'.
	 * @return the meta object for class '<em>MParameter OSSP Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase
	 * @generated
	 */
	EClass getMParameterOSSPSwitchCase();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase#getPlatform <em>Platform</em>}'.
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase#getPlatform()
	 * @see #getMParameterOSSPSwitchCase()
	 * @generated
	 */
	EReference getMParameterOSSPSwitchCase_Platform();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase#getDefaultValue <em>Default Value</em>}'.
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase#getDefaultValue()
	 * @see #getMParameterOSSPSwitchCase()
	 * @generated
	 */
	EReference getMParameterOSSPSwitchCase_DefaultValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitch <em>MBoolean Param OSSP Switch</em>}'.
	 * @return the meta object for class '<em>MBoolean Param OSSP Switch</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitch
	 * @generated
	 */
	EClass getMBooleanParamOSSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitchCase <em>MBoolean Param OSSP Switch Case</em>}'.
	 * @return the meta object for class '<em>MBoolean Param OSSP Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitchCase
	 * @generated
	 */
	EClass getMBooleanParamOSSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitch <em>MString Param OSSP Switch</em>}'.
	 * @return the meta object for class '<em>MString Param OSSP Switch</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitch
	 * @generated
	 */
	EClass getMStringParamOSSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitchCase <em>MString Param OSSP Switch Case</em>}'.
	 * @return the meta object for class '<em>MString Param OSSP Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitchCase
	 * @generated
	 */
	EClass getMStringParamOSSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitch <em>MInteger Param OSSP Switch</em>}'.
	 * @return the meta object for class '<em>MInteger Param OSSP Switch</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitch
	 * @generated
	 */
	EClass getMIntegerParamOSSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitchCase <em>MInteger Param OSSP Switch Case</em>}'.
	 * @return the meta object for class '<em>MInteger Param OSSP Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitchCase
	 * @generated
	 */
	EClass getMIntegerParamOSSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitchCase#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitchCase#getRange()
	 * @see #getMIntegerParamOSSPSwitchCase()
	 * @generated
	 */
	EReference getMIntegerParamOSSPSwitchCase_Range();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitch <em>MEnum Param OSSP Switch</em>}'.
	 * @return the meta object for class '<em>MEnum Param OSSP Switch</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitch
	 * @generated
	 */
	EClass getMEnumParamOSSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitchCase <em>MEnum Param OSSP Switch Case</em>}'.
	 * @return the meta object for class '<em>MEnum Param OSSP Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitchCase
	 * @generated
	 */
	EClass getMEnumParamOSSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitch <em>MReal Param OSSP Switch</em>}'.
	 * @return the meta object for class '<em>MReal Param OSSP Switch</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitch
	 * @generated
	 */
	EClass getMRealParamOSSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase <em>MReal Param OSSP Switch Case</em>}'.
	 * @return the meta object for class '<em>MReal Param OSSP Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase
	 * @generated
	 */
	EClass getMRealParamOSSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase#getRange()
	 * @see #getMRealParamOSSPSwitchCase()
	 * @generated
	 */
	EReference getMRealParamOSSPSwitchCase_Range();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	pdlFactory getpdlFactory();

	/**
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MBoardImpl <em>MBoard</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MBoardImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMBoard()
		 * @generated
		 */
		EClass MBOARD = eINSTANCE.getMBoard();

		/**
		 * The meta object literal for the '<em><b>Microprocessor</b></em>' reference feature.
		 * @generated
		 */
		EReference MBOARD__MICROPROCESSOR = eINSTANCE.getMBoard_Microprocessor();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MBOARD__PARAMETERS = eINSTANCE.getMBoard_Parameters();

		/**
		 * The meta object literal for the '<em><b>SupportedDevices</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MBOARD__SUPPORTED_DEVICES = eINSTANCE.getMBoard_SupportedDevices();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MBoardSupportedDeviceImpl <em>MBoardSupportedDevice</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MBoardSupportedDeviceImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMBoardSupportedDevice()
		 * @generated
		 */
		EClass MBOARD_SUPPORTED_DEVICE = eINSTANCE.getMBoardSupportedDevice();

		/**
		 * The meta object literal for the '<em><b>LowerBound</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MBOARD_SUPPORTED_DEVICE__LOWER_BOUND = eINSTANCE.getMBoardSupportedDevice_LowerBound();

		/**
		 * The meta object literal for the '<em><b>UpperBound</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MBOARD_SUPPORTED_DEVICE__UPPER_BOUND = eINSTANCE.getMBoardSupportedDevice_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * @generated
		 */
		EReference MBOARD_SUPPORTED_DEVICE__DEVICE = eINSTANCE.getMBoardSupportedDevice_Device();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MMicroprocessorImpl <em>MMicroprocessor</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MMicroprocessorImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMMicroprocessor()
		 * @generated
		 */
		EClass MMICROPROCESSOR = eINSTANCE.getMMicroprocessor();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' reference feature.
		 * @generated
		 */
		EReference MMICROPROCESSOR__ARCHITECTURE = eINSTANCE.getMMicroprocessor_Architecture();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMICROPROCESSOR__PARAMETERS = eINSTANCE.getMMicroprocessor_Parameters();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemImpl <em>MOperatingSystem</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOperatingSystem()
		 * @generated
		 */
		EClass MOPERATING_SYSTEM = eINSTANCE.getMOperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MOPERATING_SYSTEM__INHERITS = eINSTANCE.getMOperatingSystem_Inherits();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MOPERATING_SYSTEM__LANGUAGES = eINSTANCE.getMOperatingSystem_Languages();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MOPERATING_SYSTEM__PARAMETERS = eINSTANCE.getMOperatingSystem_Parameters();

		/**
		 * The meta object literal for the '<em><b>SupportedPlatforms</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MOPERATING_SYSTEM__SUPPORTED_PLATFORMS = eINSTANCE.getMOperatingSystem_SupportedPlatforms();

		/**
		 * The meta object literal for the '<em><b>SupportedOSAPIs</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MOPERATING_SYSTEM__SUPPORTED_OSAP_IS = eINSTANCE.getMOperatingSystem_SupportedOSAPIs();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedPlatformImpl <em>MOSSupportedPlatform</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MOSSupportedPlatformImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOSSupportedPlatform()
		 * @generated
		 */
		EClass MOS_SUPPORTED_PLATFORM = eINSTANCE.getMOSSupportedPlatform();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' reference feature.
		 * @generated
		 */
		EReference MOS_SUPPORTED_PLATFORM__ARCHITECTURE = eINSTANCE.getMOSSupportedPlatform_Architecture();

		/**
		 * The meta object literal for the '<em><b>Compiler</b></em>' reference feature.
		 * @generated
		 */
		EReference MOS_SUPPORTED_PLATFORM__COMPILER = eINSTANCE.getMOSSupportedPlatform_Compiler();

		/**
		 * The meta object literal for the '<em><b>Microprocessor</b></em>' reference feature.
		 * @generated
		 */
		EReference MOS_SUPPORTED_PLATFORM__MICROPROCESSOR = eINSTANCE.getMOSSupportedPlatform_Microprocessor();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * @generated
		 */
		EReference MOS_SUPPORTED_PLATFORM__BOARD = eINSTANCE.getMOSSupportedPlatform_Board();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MOS_SUPPORTED_PLATFORM__PARAMETERS = eINSTANCE.getMOSSupportedPlatform_Parameters();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MOS_SUPPORTED_PLATFORM__LANGUAGES = eINSTANCE.getMOSSupportedPlatform_Languages();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIImpl <em>MOSSupportedOSAPI</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOSSupportedOSAPI()
		 * @generated
		 */
		EClass MOS_SUPPORTED_OSAPI = eINSTANCE.getMOSSupportedOSAPI();

		/**
		 * The meta object literal for the '<em><b>OSAPI</b></em>' reference feature.
		 * @generated
		 */
		EReference MOS_SUPPORTED_OSAPI__OSAPI = eINSTANCE.getMOSSupportedOSAPI_Osapi();

		/**
		 * The meta object literal for the '<em><b>ParameterValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MOS_SUPPORTED_OSAPI__PARAMETER_VALUE_ASSIGNMENTS = eINSTANCE.getMOSSupportedOSAPI_ParameterValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVAImpl <em>MOSSupportedOSAPIPVA</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVAImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOSSupportedOSAPIPVA()
		 * @generated
		 */
		EClass MOS_SUPPORTED_OSAPIPVA = eINSTANCE.getMOSSupportedOSAPIPVA();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVAExpressionImpl <em>MOSSupportedOSAPIPVAExpressionImpl</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVAExpressionImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOSSupportedOSAPIPVAExpression()
		 * @generated
		 */
		EClass MOS_SUPPORTED_OSAPIPVA_EXPRESSION = eINSTANCE.getMOSSupportedOSAPIPVAExpression();

		/**
		 * The meta object literal for the '<em><b>ParameterValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MOS_SUPPORTED_OSAPIPVA_EXPRESSION__PARAMETER_VALUE = eINSTANCE.getMOSSupportedOSAPIPVAExpression_ParameterValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVASwitchImpl <em>MOSSupportedOSAPIPVASwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVASwitchImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOSSupportedOSAPIPVASwitch()
		 * @generated
		 */
		EClass MOS_SUPPORTED_OSAPIPVA_SWITCH = eINSTANCE.getMOSSupportedOSAPIPVASwitch();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MOS_SUPPORTED_OSAPIPVA_SWITCH__CASES = eINSTANCE.getMOSSupportedOSAPIPVASwitch_Cases();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVASwitchCaseImpl <em>MOSSupportedOSAPIPVASwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVASwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOSSupportedOSAPIPVASwitchCase()
		 * @generated
		 */
		EClass MOS_SUPPORTED_OSAPIPVA_SWITCH_CASE = eINSTANCE.getMOSSupportedOSAPIPVASwitchCase();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * @generated
		 */
		EReference MOS_SUPPORTED_OSAPIPVA_SWITCH_CASE__PLATFORM = eINSTANCE.getMOSSupportedOSAPIPVASwitchCase_Platform();

		/**
		 * The meta object literal for the '<em><b>ParameterValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MOS_SUPPORTED_OSAPIPVA_SWITCH_CASE__PARAMETER_VALUE = eINSTANCE.getMOSSupportedOSAPIPVASwitchCase_ParameterValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemAPIImpl <em>MOperatingSystemAPI</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MOperatingSystemAPIImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMOperatingSystemAPI()
		 * @generated
		 */
		EClass MOPERATING_SYSTEM_API = eINSTANCE.getMOperatingSystemAPI();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MOPERATING_SYSTEM_API__INHERITS = eINSTANCE.getMOperatingSystemAPI_Inherits();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * @generated
		 */
		EReference MOPERATING_SYSTEM_API__LANGUAGE = eINSTANCE.getMOperatingSystemAPI_Language();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MOPERATING_SYSTEM_API__PARAMETERS = eINSTANCE.getMOperatingSystemAPI_Parameters();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MArchitectureImpl <em>MArchitecture</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MArchitectureImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMArchitecture()
		 * @generated
		 */
		EClass MARCHITECTURE = eINSTANCE.getMArchitecture();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * @generated
		 */
		EReference MARCHITECTURE__EXTENDS = eINSTANCE.getMArchitecture_Extends();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MARCHITECTURE__PARAMETERS = eINSTANCE.getMArchitecture_Parameters();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MPDLPackageFileImpl <em>MPDLPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MPDLPackageFileImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMPDLPackageFile()
		 * @generated
		 */
		EClass MPDL_PACKAGE_FILE = eINSTANCE.getMPDLPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MPDLPackageElementImpl <em>MPDLPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MPDLPackageElementImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMPDLPackageElement()
		 * @generated
		 */
		EClass MPDL_PACKAGE_ELEMENT = eINSTANCE.getMPDLPackageElement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MPlatformImpl <em>MPlatform</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MPlatformImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMPlatform()
		 * @generated
		 */
		EClass MPLATFORM = eINSTANCE.getMPlatform();

		/**
		 * The meta object literal for the '<em><b>OSAPI</b></em>' reference feature.
		 * @generated
		 */
		EReference MPLATFORM__OSAPI = eINSTANCE.getMPlatform_Osapi();

		/**
		 * The meta object literal for the '<em><b>OS</b></em>' reference feature.
		 * @generated
		 */
		EReference MPLATFORM__OS = eINSTANCE.getMPlatform_Os();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' reference feature.
		 * @generated
		 */
		EReference MPLATFORM__ARCHITECTURE = eINSTANCE.getMPlatform_Architecture();

		/**
		 * The meta object literal for the '<em><b>Compiler</b></em>' reference feature.
		 * @generated
		 */
		EReference MPLATFORM__COMPILER = eINSTANCE.getMPlatform_Compiler();

		/**
		 * The meta object literal for the '<em><b>Microprocessor</b></em>' reference feature.
		 * @generated
		 */
		EReference MPLATFORM__MICROPROCESSOR = eINSTANCE.getMPlatform_Microprocessor();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * @generated
		 */
		EReference MPLATFORM__BOARD = eINSTANCE.getMPlatform_Board();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MPLATFORM__PARAMETERS = eINSTANCE.getMPlatform_Parameters();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MCompilerImpl <em>MCompiler</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MCompilerImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMCompiler()
		 * @generated
		 */
		EClass MCOMPILER = eINSTANCE.getMCompiler();

		/**
		 * The meta object literal for the '<em><b>Frontends</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPILER__FRONTENDS = eINSTANCE.getMCompiler_Frontends();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * @generated
		 */
		EReference MCOMPILER__EXTENDS = eINSTANCE.getMCompiler_Extends();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPILER__PARAMETERS = eINSTANCE.getMCompiler_Parameters();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MCompilerFrontendImpl <em>MCompilerFrontend</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MCompilerFrontendImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMCompilerFrontend()
		 * @generated
		 */
		EClass MCOMPILER_FRONTEND = eINSTANCE.getMCompilerFrontend();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMPILER_FRONTEND__LANGUAGE = eINSTANCE.getMCompilerFrontend_Language();

		/**
		 * The meta object literal for the '<em><b>Architectures</b></em>' reference list feature.
		 * @generated
		 */
		EReference MCOMPILER_FRONTEND__ARCHITECTURES = eINSTANCE.getMCompilerFrontend_Architectures();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPILER_FRONTEND__PARAMETERS = eINSTANCE.getMCompilerFrontend_Parameters();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MDeviceImpl <em>MDevice</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MDeviceImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMDevice()
		 * @generated
		 */
		EClass MDEVICE = eINSTANCE.getMDevice();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDEVICE__PARAMETERS = eINSTANCE.getMDevice_Parameters();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MParameterOSSPSwitchImpl <em>MParameterOSSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MParameterOSSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMParameterOSSPSwitch()
		 * @generated
		 */
		EClass MPARAMETER_OSSP_SWITCH = eINSTANCE.getMParameterOSSPSwitch();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MPARAMETER_OSSP_SWITCH__CASES = eINSTANCE.getMParameterOSSPSwitch_Cases();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MParameterOSSPSwitchCaseImpl <em>MParameterOSSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MParameterOSSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMParameterOSSPSwitchCase()
		 * @generated
		 */
		EClass MPARAMETER_OSSP_SWITCH_CASE = eINSTANCE.getMParameterOSSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * @generated
		 */
		EReference MPARAMETER_OSSP_SWITCH_CASE__PLATFORM = eINSTANCE.getMParameterOSSPSwitchCase_Platform();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPARAMETER_OSSP_SWITCH_CASE__DEFAULT_VALUE = eINSTANCE.getMParameterOSSPSwitchCase_DefaultValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MBooleanParamOSSPSwitchImpl <em>MBooleanParamOSSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MBooleanParamOSSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMBooleanParamOSSPSwitch()
		 * @generated
		 */
		EClass MBOOLEAN_PARAM_OSSP_SWITCH = eINSTANCE.getMBooleanParamOSSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MBooleanParamOSSPSwitchCaseImpl <em>MBooleanParamOSSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MBooleanParamOSSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMBooleanParamOSSPSwitchCase()
		 * @generated
		 */
		EClass MBOOLEAN_PARAM_OSSP_SWITCH_CASE = eINSTANCE.getMBooleanParamOSSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MStringParamOSSPSwitchImpl <em>MStringParamOSSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MStringParamOSSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMStringParamOSSPSwitch()
		 * @generated
		 */
		EClass MSTRING_PARAM_OSSP_SWITCH = eINSTANCE.getMStringParamOSSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MStringParamOSSPSwitchCaseImpl <em>MStringParamOSSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MStringParamOSSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMStringParamOSSPSwitchCase()
		 * @generated
		 */
		EClass MSTRING_PARAM_OSSP_SWITCH_CASE = eINSTANCE.getMStringParamOSSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MIntegerParamOSSPSwitchImpl <em>MIntegerParamOSSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MIntegerParamOSSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMIntegerParamOSSPSwitch()
		 * @generated
		 */
		EClass MINTEGER_PARAM_OSSP_SWITCH = eINSTANCE.getMIntegerParamOSSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MIntegerParamOSSPSwitchCaseImpl <em>MIntegerParamOSSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MIntegerParamOSSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMIntegerParamOSSPSwitchCase()
		 * @generated
		 */
		EClass MINTEGER_PARAM_OSSP_SWITCH_CASE = eINSTANCE.getMIntegerParamOSSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MINTEGER_PARAM_OSSP_SWITCH_CASE__RANGE = eINSTANCE.getMIntegerParamOSSPSwitchCase_Range();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MEnumParamOSSPSwitchImpl <em>MEnumParamOSSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MEnumParamOSSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMEnumParamOSSPSwitch()
		 * @generated
		 */
		EClass MENUM_PARAM_OSSP_SWITCH = eINSTANCE.getMEnumParamOSSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MEnumParamOSSPSwitchCaseImpl <em>MEnumParamOSSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MEnumParamOSSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMEnumParamOSSPSwitchCase()
		 * @generated
		 */
		EClass MENUM_PARAM_OSSP_SWITCH_CASE = eINSTANCE.getMEnumParamOSSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MRealParamOSSPSwitchImpl <em>MRealParamOSSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MRealParamOSSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMRealParamOSSPSwitch()
		 * @generated
		 */
		EClass MREAL_PARAM_OSSP_SWITCH = eINSTANCE.getMRealParamOSSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.pdl.impl.MRealParamOSSPSwitchCaseImpl <em>MRealParamOSSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.pdl.impl.MRealParamOSSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.pdl.impl.pdlPackageImpl#getMRealParamOSSPSwitchCase()
		 * @generated
		 */
		EClass MREAL_PARAM_OSSP_SWITCH_CASE = eINSTANCE.getMRealParamOSSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MREAL_PARAM_OSSP_SWITCH_CASE__RANGE = eINSTANCE.getMRealParamOSSPSwitchCase_Range();

	}

}
