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
 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibFactory
 * @model kind="package"
 * @generated
 */
public interface mclevslibPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mclevslib";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mclev/mclevslib";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mclev";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mclevslibPackage eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MMCLEVSLIBPackageElementImpl <em>MMCLEVSLIBPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MMCLEVSLIBPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMMCLEVSLIBPackageElement()
	 * @generated
	 */
	int MMCLEVSLIB_PACKAGE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSLIB_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSLIB_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSLIB_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVSLIBPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryImpl <em>MServiceLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMServiceLibrary()
	 * @generated
	 */
	int MSERVICE_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY__VERSION = MMCLEVSLIB_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY__NAME = MMCLEVSLIB_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY__URI = MMCLEVSLIB_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY__ATTRIBUTES = MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY__INHERITS = MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY__PROVIDES = MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY__REQUIRES = MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY__LANGUAGES = MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY__EXTENDS = MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>SupportedPlatforms</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY__SUPPORTED_PLATFORMS = MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MServiceLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_FEATURE_COUNT = MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryProvidedSAIImpl <em>MServiceLibrary Provided SAI</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryProvidedSAIImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMServiceLibraryProvidedSAI()
	 * @generated
	 */
	int MSERVICE_LIBRARY_PROVIDED_SAI = 1;

	/**
	 * The feature id for the '<em><b>SAI</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_PROVIDED_SAI__SAI = 0;

	/**
	 * The feature id for the '<em><b>Attribute Value Assignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_PROVIDED_SAI__ATTRIBUTE_VALUE_ASSIGNMENTS = 1;

	/**
	 * The number of structural features of the '<em>MServiceLibrary Provided SAI</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_PROVIDED_SAI_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVAImpl <em>MS Lib Provided SAIAVA</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVAImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMSLibProvidedSAIAVA()
	 * @generated
	 */
	int MS_LIB_PROVIDED_SAIAVA = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MS_LIB_PROVIDED_SAIAVA__PARAMETER = commonPackage.MPARAMETER_VALUE_ASSIGNMENT__PARAMETER;

	/**
	 * The number of structural features of the '<em>MS Lib Provided SAIAVA</em>' class.
	 * @generated
	 * @ordered
	 */
	int MS_LIB_PROVIDED_SAIAVA_FEATURE_COUNT = commonPackage.MPARAMETER_VALUE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVASwitchImpl <em>MS Lib Provided SAIAVA Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVASwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMSLibProvidedSAIAVASwitch()
	 * @generated
	 */
	int MS_LIB_PROVIDED_SAIAVA_SWITCH = 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MS_LIB_PROVIDED_SAIAVA_SWITCH__PARAMETER = MS_LIB_PROVIDED_SAIAVA__PARAMETER;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MS_LIB_PROVIDED_SAIAVA_SWITCH__CASES = MS_LIB_PROVIDED_SAIAVA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MS Lib Provided SAIAVA Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MS_LIB_PROVIDED_SAIAVA_SWITCH_FEATURE_COUNT = MS_LIB_PROVIDED_SAIAVA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVASwitchCaseImpl <em>MS Lib Provided SAIAVA Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVASwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMSLibProvidedSAIAVASwitchCase()
	 * @generated
	 */
	int MS_LIB_PROVIDED_SAIAVA_SWITCH_CASE = 4;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MS_LIB_PROVIDED_SAIAVA_SWITCH_CASE__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>AttributeValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MS_LIB_PROVIDED_SAIAVA_SWITCH_CASE__ATTRIBUTE_VALUE = 1;

	/**
	 * The number of structural features of the '<em>MS Lib Provided SAIAVA Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MS_LIB_PROVIDED_SAIAVA_SWITCH_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVAExpressionImpl <em>MS Lib Provided SAIAVA Expression</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVAExpressionImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMSLibProvidedSAIAVAExpression()
	 * @generated
	 */
	int MS_LIB_PROVIDED_SAIAVA_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MS_LIB_PROVIDED_SAIAVA_EXPRESSION__PARAMETER = MS_LIB_PROVIDED_SAIAVA__PARAMETER;

	/**
	 * The feature id for the '<em><b>AttributeValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MS_LIB_PROVIDED_SAIAVA_EXPRESSION__ATTRIBUTE_VALUE = MS_LIB_PROVIDED_SAIAVA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MS Lib Provided SAIAVA Expression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MS_LIB_PROVIDED_SAIAVA_EXPRESSION_FEATURE_COUNT = MS_LIB_PROVIDED_SAIAVA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibrarySupportedPlatformImpl <em>MServiceLibrarySupportedPlatform</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibrarySupportedPlatformImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMServiceLibrarySupportedPlatform()
	 * @generated
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OSAPI</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM__OSAPI = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>OS</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM__OS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM__ARCHITECTURE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compiler</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM__COMPILER = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Microprocessor</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM__MICROPROCESSOR = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM__BOARD = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM__REQUIRES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM__ATTRIBUTES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM__LANGUAGES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>MServiceLibrarySupportedPlatform</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_SUPPORTED_PLATFORM_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverSLibSupportedPlatformImpl <em>MDriverSLibSupportedPlatform</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverSLibSupportedPlatformImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMDriverSLibSupportedPlatform()
	 * @generated
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM__NAME = MSERVICE_LIBRARY_SUPPORTED_PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM__DESCRIPTION = MSERVICE_LIBRARY_SUPPORTED_PLATFORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OSAPI</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM__OSAPI = MSERVICE_LIBRARY_SUPPORTED_PLATFORM__OSAPI;

	/**
	 * The feature id for the '<em><b>OS</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM__OS = MSERVICE_LIBRARY_SUPPORTED_PLATFORM__OS;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM__ARCHITECTURE = MSERVICE_LIBRARY_SUPPORTED_PLATFORM__ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Compiler</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM__COMPILER = MSERVICE_LIBRARY_SUPPORTED_PLATFORM__COMPILER;

	/**
	 * The feature id for the '<em><b>Microprocessor</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM__MICROPROCESSOR = MSERVICE_LIBRARY_SUPPORTED_PLATFORM__MICROPROCESSOR;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM__BOARD = MSERVICE_LIBRARY_SUPPORTED_PLATFORM__BOARD;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM__REQUIRES = MSERVICE_LIBRARY_SUPPORTED_PLATFORM__REQUIRES;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM__ATTRIBUTES = MSERVICE_LIBRARY_SUPPORTED_PLATFORM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM__LANGUAGES = MSERVICE_LIBRARY_SUPPORTED_PLATFORM__LANGUAGES;

	/**
	 * The feature id for the '<em><b>SupportedDevices</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM__SUPPORTED_DEVICES = MSERVICE_LIBRARY_SUPPORTED_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MDriverSLibSupportedPlatform</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_PLATFORM_FEATURE_COUNT = MSERVICE_LIBRARY_SUPPORTED_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverSLibSupportedDeviceImpl <em>MDriverSLibSupportedDevice</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverSLibSupportedDeviceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMDriverSLibSupportedDevice()
	 * @generated
	 */
	int MDRIVER_SLIB_SUPPORTED_DEVICE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_DEVICE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_DEVICE__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_DEVICE__REQUIRED = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_DEVICE__DEVICE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MDriverSLibSupportedDevice</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_SUPPORTED_DEVICE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MAbstractServiceLibraryImpl <em>MAbstractServiceLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MAbstractServiceLibraryImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMAbstractServiceLibrary()
	 * @generated
	 */
	int MABSTRACT_SERVICE_LIBRARY = 9;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SERVICE_LIBRARY__VERSION = MMCLEVSLIB_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SERVICE_LIBRARY__NAME = MMCLEVSLIB_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SERVICE_LIBRARY__URI = MMCLEVSLIB_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SERVICE_LIBRARY__ATTRIBUTES = MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SERVICE_LIBRARY__INHERITS = MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SERVICE_LIBRARY__PROVIDES = MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MAbstractServiceLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_SERVICE_LIBRARY_FEATURE_COUNT = MMCLEVSLIB_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MMCLEVSLIBPackageFileImpl <em>MMCLEVSLIBPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MMCLEVSLIBPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMMCLEVSLIBPackageFile()
	 * @generated
	 */
	int MMCLEVSLIB_PACKAGE_FILE = 10;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSLIB_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSLIB_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSLIB_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMCLEVSLIBPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVSLIB_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverServiceLibraryImpl <em>MDriverServiceLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverServiceLibraryImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMDriverServiceLibrary()
	 * @generated
	 */
	int MDRIVER_SERVICE_LIBRARY = 12;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SERVICE_LIBRARY__VERSION = MSERVICE_LIBRARY__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SERVICE_LIBRARY__NAME = MSERVICE_LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SERVICE_LIBRARY__URI = MSERVICE_LIBRARY__URI;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SERVICE_LIBRARY__ATTRIBUTES = MSERVICE_LIBRARY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SERVICE_LIBRARY__INHERITS = MSERVICE_LIBRARY__INHERITS;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SERVICE_LIBRARY__PROVIDES = MSERVICE_LIBRARY__PROVIDES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SERVICE_LIBRARY__REQUIRES = MSERVICE_LIBRARY__REQUIRES;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SERVICE_LIBRARY__LANGUAGES = MSERVICE_LIBRARY__LANGUAGES;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SERVICE_LIBRARY__EXTENDS = MSERVICE_LIBRARY__EXTENDS;

	/**
	 * The feature id for the '<em><b>SupportedPlatforms</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SERVICE_LIBRARY__SUPPORTED_PLATFORMS = MSERVICE_LIBRARY__SUPPORTED_PLATFORMS;

	/**
	 * The number of structural features of the '<em>MDriverServiceLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SERVICE_LIBRARY_FEATURE_COUNT = MSERVICE_LIBRARY_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MParameterSLSPSwitchImpl <em>MParameterSLSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MParameterSLSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMParameterSLSPSwitch()
	 * @generated
	 */
	int MPARAMETER_SLSP_SWITCH = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SLSP_SWITCH__NAME = commonPackage.MPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SLSP_SWITCH__DESCRIPTION = commonPackage.MPARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SLSP_SWITCH__CONSTANT = commonPackage.MPARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SLSP_SWITCH__CASES = commonPackage.MPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameterSLSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SLSP_SWITCH_FEATURE_COUNT = commonPackage.MPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MParameterSLSPSwitchCaseImpl <em>MParameterSLSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MParameterSLSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMParameterSLSPSwitchCase()
	 * @generated
	 */
	int MPARAMETER_SLSP_SWITCH_CASE = 14;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SLSP_SWITCH_CASE__PLATFORM = 1;

	/**
	 * The number of structural features of the '<em>MParameterSLSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_SLSP_SWITCH_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MBooleanParamSLSPSwitchImpl <em>MBooleanParamSLSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MBooleanParamSLSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMBooleanParamSLSPSwitch()
	 * @generated
	 */
	int MBOOLEAN_PARAM_SLSP_SWITCH = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SLSP_SWITCH__NAME = commonPackage.MBOOLEAN_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SLSP_SWITCH__DESCRIPTION = commonPackage.MBOOLEAN_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SLSP_SWITCH__CONSTANT = commonPackage.MBOOLEAN_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SLSP_SWITCH__CASES = commonPackage.MBOOLEAN_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MBooleanParamSLSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SLSP_SWITCH_FEATURE_COUNT = commonPackage.MBOOLEAN_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MBooleanParamSLSPSwitchCaseImpl <em>MBooleanParamSLSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MBooleanParamSLSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMBooleanParamSLSPSwitchCase()
	 * @generated
	 */
	int MBOOLEAN_PARAM_SLSP_SWITCH_CASE = 16;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SLSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SLSP_SWITCH_CASE__PLATFORM = MPARAMETER_SLSP_SWITCH_CASE__PLATFORM;

	/**
	 * The number of structural features of the '<em>MBooleanParamSLSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_SLSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_SLSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MStringParamSLSPSwitchImpl <em>MStringParamSLSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MStringParamSLSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMStringParamSLSPSwitch()
	 * @generated
	 */
	int MSTRING_PARAM_SLSP_SWITCH = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SLSP_SWITCH__NAME = commonPackage.MSTRING_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SLSP_SWITCH__DESCRIPTION = commonPackage.MSTRING_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SLSP_SWITCH__CONSTANT = commonPackage.MSTRING_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SLSP_SWITCH__CASES = commonPackage.MSTRING_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MStringParamSLSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SLSP_SWITCH_FEATURE_COUNT = commonPackage.MSTRING_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MStringParamSLSPSwitchCaseImpl <em>MStringParamSLSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MStringParamSLSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMStringParamSLSPSwitchCase()
	 * @generated
	 */
	int MSTRING_PARAM_SLSP_SWITCH_CASE = 18;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SLSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SLSP_SWITCH_CASE__PLATFORM = MPARAMETER_SLSP_SWITCH_CASE__PLATFORM;

	/**
	 * The number of structural features of the '<em>MStringParamSLSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_SLSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_SLSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MIntegerParamSLSPSwitchImpl <em>MIntegerParamSLSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MIntegerParamSLSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMIntegerParamSLSPSwitch()
	 * @generated
	 */
	int MINTEGER_PARAM_SLSP_SWITCH = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SLSP_SWITCH__NAME = commonPackage.MINTEGER_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SLSP_SWITCH__DESCRIPTION = commonPackage.MINTEGER_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SLSP_SWITCH__CONSTANT = commonPackage.MINTEGER_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SLSP_SWITCH__CASES = commonPackage.MINTEGER_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MIntegerParamSLSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SLSP_SWITCH_FEATURE_COUNT = commonPackage.MINTEGER_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MIntegerParamSLSPSwitchCaseImpl <em>MIntegerParamSLSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MIntegerParamSLSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMIntegerParamSLSPSwitchCase()
	 * @generated
	 */
	int MINTEGER_PARAM_SLSP_SWITCH_CASE = 20;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SLSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SLSP_SWITCH_CASE__PLATFORM = MPARAMETER_SLSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SLSP_SWITCH_CASE__RANGE = MPARAMETER_SLSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MIntegerParamSLSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_SLSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_SLSP_SWITCH_CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MEnumParamSLSPSwitchImpl <em>MEnumParamSLSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MEnumParamSLSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMEnumParamSLSPSwitch()
	 * @generated
	 */
	int MENUM_PARAM_SLSP_SWITCH = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SLSP_SWITCH__NAME = commonPackage.MENUM_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SLSP_SWITCH__DESCRIPTION = commonPackage.MENUM_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SLSP_SWITCH__CONSTANT = commonPackage.MENUM_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Enum Definition</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SLSP_SWITCH__ENUM_DEFINITION = commonPackage.MENUM_PARAMETER__ENUM_DEFINITION;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SLSP_SWITCH__CASES = commonPackage.MENUM_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MEnumParamSLSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SLSP_SWITCH_FEATURE_COUNT = commonPackage.MENUM_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MEnumParamSLSPSwitchCaseImpl <em>MEnumParamSLSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MEnumParamSLSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMEnumParamSLSPSwitchCase()
	 * @generated
	 */
	int MENUM_PARAM_SLSP_SWITCH_CASE = 22;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SLSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SLSP_SWITCH_CASE__PLATFORM = MPARAMETER_SLSP_SWITCH_CASE__PLATFORM;

	/**
	 * The number of structural features of the '<em>MEnumParamSLSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_SLSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_SLSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MRealParamSLSPSwitchImpl <em>MRealParamSLSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MRealParamSLSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMRealParamSLSPSwitch()
	 * @generated
	 */
	int MREAL_PARAM_SLSP_SWITCH = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SLSP_SWITCH__NAME = commonPackage.MREAL_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SLSP_SWITCH__DESCRIPTION = commonPackage.MREAL_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SLSP_SWITCH__CONSTANT = commonPackage.MREAL_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SLSP_SWITCH__CASES = commonPackage.MREAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MRealParamSLSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SLSP_SWITCH_FEATURE_COUNT = commonPackage.MREAL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MRealParamSLSPSwitchCaseImpl <em>MRealParamSLSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MRealParamSLSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMRealParamSLSPSwitchCase()
	 * @generated
	 */
	int MREAL_PARAM_SLSP_SWITCH_CASE = 24;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SLSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SLSP_SWITCH_CASE__PLATFORM = MPARAMETER_SLSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SLSP_SWITCH_CASE__RANGE = MPARAMETER_SLSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MRealParamSLSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_SLSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_SLSP_SWITCH_CASE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary <em>MServiceLibrary</em>}'.
	 * @return the meta object for class '<em>MServiceLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary
	 * @generated
	 */
	EClass getMServiceLibrary();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary#getRequires <em>Requires</em>}'.
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary#getRequires()
	 * @see #getMServiceLibrary()
	 * @generated
	 */
	EReference getMServiceLibrary_Requires();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary#getLanguages <em>Languages</em>}'.
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary#getLanguages()
	 * @see #getMServiceLibrary()
	 * @generated
	 */
	EReference getMServiceLibrary_Languages();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary#getExtends <em>Extends</em>}'.
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary#getExtends()
	 * @see #getMServiceLibrary()
	 * @generated
	 */
	EReference getMServiceLibrary_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary#getSupportedPlatforms <em>SupportedPlatforms</em>}'.
	 * @return the meta object for the containment reference list '<em>SupportedPlatforms</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary#getSupportedPlatforms()
	 * @see #getMServiceLibrary()
	 * @generated
	 */
	EReference getMServiceLibrary_SupportedPlatforms();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI <em>MServiceLibrary Provided SAI</em>}'.
	 * @return the meta object for class '<em>MServiceLibrary Provided SAI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI
	 * @generated
	 */
	EClass getMServiceLibraryProvidedSAI();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI#getSai <em>SAI</em>}'.
	 * @return the meta object for the reference '<em>SAI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI#getSai()
	 * @see #getMServiceLibraryProvidedSAI()
	 * @generated
	 */
	EReference getMServiceLibraryProvidedSAI_Sai();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI#getAttributeValueAssignments <em>Attribute Value Assignments</em>}'.
	 * @return the meta object for the containment reference list '<em>Attribute Value Assignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI#getAttributeValueAssignments()
	 * @see #getMServiceLibraryProvidedSAI()
	 * @generated
	 */
	EReference getMServiceLibraryProvidedSAI_AttributeValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVA <em>MS Lib Provided SAIAVA</em>}'.
	 * @return the meta object for class '<em>MS Lib Provided SAIAVA</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVA
	 * @generated
	 */
	EClass getMSLibProvidedSAIAVA();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitch <em>MS Lib Provided SAIAVA Switch</em>}'.
	 * @return the meta object for class '<em>MS Lib Provided SAIAVA Switch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitch
	 * @generated
	 */
	EClass getMSLibProvidedSAIAVASwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitch#getCases <em>Cases</em>}'.
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitch#getCases()
	 * @see #getMSLibProvidedSAIAVASwitch()
	 * @generated
	 */
	EReference getMSLibProvidedSAIAVASwitch_Cases();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase <em>MS Lib Provided SAIAVA Switch Case</em>}'.
	 * @return the meta object for class '<em>MS Lib Provided SAIAVA Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase
	 * @generated
	 */
	EClass getMSLibProvidedSAIAVASwitchCase();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase#getPlatform <em>Platform</em>}'.
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase#getPlatform()
	 * @see #getMSLibProvidedSAIAVASwitchCase()
	 * @generated
	 */
	EReference getMSLibProvidedSAIAVASwitchCase_Platform();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase#getAttributeValue <em>AttributeValue</em>}'.
	 * @return the meta object for the containment reference '<em>AttributeValue</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase#getAttributeValue()
	 * @see #getMSLibProvidedSAIAVASwitchCase()
	 * @generated
	 */
	EReference getMSLibProvidedSAIAVASwitchCase_AttributeValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVAExpression <em>MS Lib Provided SAIAVA Expression</em>}'.
	 * @return the meta object for class '<em>MS Lib Provided SAIAVA Expression</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVAExpression
	 * @generated
	 */
	EClass getMSLibProvidedSAIAVAExpression();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVAExpression#getAttributeValue <em>AttributeValue</em>}'.
	 * @return the meta object for the containment reference '<em>AttributeValue</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVAExpression#getAttributeValue()
	 * @see #getMSLibProvidedSAIAVAExpression()
	 * @generated
	 */
	EReference getMSLibProvidedSAIAVAExpression_AttributeValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform <em>MServiceLibrarySupportedPlatform</em>}'.
	 * @return the meta object for class '<em>MServiceLibrarySupportedPlatform</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform
	 * @generated
	 */
	EClass getMServiceLibrarySupportedPlatform();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getOsapi <em>OSAPI</em>}'.
	 * @return the meta object for the reference '<em>OSAPI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getOsapi()
	 * @see #getMServiceLibrarySupportedPlatform()
	 * @generated
	 */
	EReference getMServiceLibrarySupportedPlatform_Osapi();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getOs <em>OS</em>}'.
	 * @return the meta object for the reference '<em>OS</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getOs()
	 * @see #getMServiceLibrarySupportedPlatform()
	 * @generated
	 */
	EReference getMServiceLibrarySupportedPlatform_Os();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getArchitecture <em>Architecture</em>}'.
	 * @return the meta object for the reference '<em>Architecture</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getArchitecture()
	 * @see #getMServiceLibrarySupportedPlatform()
	 * @generated
	 */
	EReference getMServiceLibrarySupportedPlatform_Architecture();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getCompiler <em>Compiler</em>}'.
	 * @return the meta object for the reference '<em>Compiler</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getCompiler()
	 * @see #getMServiceLibrarySupportedPlatform()
	 * @generated
	 */
	EReference getMServiceLibrarySupportedPlatform_Compiler();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getMicroprocessor <em>Microprocessor</em>}'.
	 * @return the meta object for the reference '<em>Microprocessor</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getMicroprocessor()
	 * @see #getMServiceLibrarySupportedPlatform()
	 * @generated
	 */
	EReference getMServiceLibrarySupportedPlatform_Microprocessor();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getBoard <em>Board</em>}'.
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getBoard()
	 * @see #getMServiceLibrarySupportedPlatform()
	 * @generated
	 */
	EReference getMServiceLibrarySupportedPlatform_Board();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getRequires <em>Requires</em>}'.
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getRequires()
	 * @see #getMServiceLibrarySupportedPlatform()
	 * @generated
	 */
	EReference getMServiceLibrarySupportedPlatform_Requires();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getAttributes <em>Attributes</em>}'.
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getAttributes()
	 * @see #getMServiceLibrarySupportedPlatform()
	 * @generated
	 */
	EReference getMServiceLibrarySupportedPlatform_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getLanguages <em>Languages</em>}'.
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform#getLanguages()
	 * @see #getMServiceLibrarySupportedPlatform()
	 * @generated
	 */
	EReference getMServiceLibrarySupportedPlatform_Languages();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedPlatform <em>MDriverSLibSupportedPlatform</em>}'.
	 * @return the meta object for class '<em>MDriverSLibSupportedPlatform</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedPlatform
	 * @generated
	 */
	EClass getMDriverSLibSupportedPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedPlatform#getSupportedDevices <em>SupportedDevices</em>}'.
	 * @return the meta object for the containment reference list '<em>SupportedDevices</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedPlatform#getSupportedDevices()
	 * @see #getMDriverSLibSupportedPlatform()
	 * @generated
	 */
	EReference getMDriverSLibSupportedPlatform_SupportedDevices();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice <em>MDriverSLibSupportedDevice</em>}'.
	 * @return the meta object for class '<em>MDriverSLibSupportedDevice</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice
	 * @generated
	 */
	EClass getMDriverSLibSupportedDevice();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice#getRequired <em>Required</em>}'.
	 * @return the meta object for the containment reference '<em>Required</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice#getRequired()
	 * @see #getMDriverSLibSupportedDevice()
	 * @generated
	 */
	EReference getMDriverSLibSupportedDevice_Required();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice#getDevice <em>Device</em>}'.
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice#getDevice()
	 * @see #getMDriverSLibSupportedDevice()
	 * @generated
	 */
	EReference getMDriverSLibSupportedDevice_Device();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary <em>MAbstractServiceLibrary</em>}'.
	 * @return the meta object for class '<em>MAbstractServiceLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary
	 * @generated
	 */
	EClass getMAbstractServiceLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary#getAttributes <em>Attributes</em>}'.
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary#getAttributes()
	 * @see #getMAbstractServiceLibrary()
	 * @generated
	 */
	EReference getMAbstractServiceLibrary_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary#getInherits()
	 * @see #getMAbstractServiceLibrary()
	 * @generated
	 */
	EReference getMAbstractServiceLibrary_Inherits();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary#getProvides <em>Provides</em>}'.
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary#getProvides()
	 * @see #getMAbstractServiceLibrary()
	 * @generated
	 */
	EReference getMAbstractServiceLibrary_Provides();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageFile <em>MMCLEVSLIBPackageFile</em>}'.
	 * @return the meta object for class '<em>MMCLEVSLIBPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageFile
	 * @generated
	 */
	EClass getMMCLEVSLIBPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageElement <em>MMCLEVSLIBPackageElement</em>}'.
	 * @return the meta object for class '<em>MMCLEVSLIBPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageElement
	 * @generated
	 */
	EClass getMMCLEVSLIBPackageElement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MDriverServiceLibrary <em>MDriverServiceLibrary</em>}'.
	 * @return the meta object for class '<em>MDriverServiceLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MDriverServiceLibrary
	 * @generated
	 */
	EClass getMDriverServiceLibrary();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitch <em>MParameterSLSPSwitch</em>}'.
	 * @return the meta object for class '<em>MParameterSLSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitch
	 * @generated
	 */
	EClass getMParameterSLSPSwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitch#getCases <em>Cases</em>}'.
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitch#getCases()
	 * @see #getMParameterSLSPSwitch()
	 * @generated
	 */
	EReference getMParameterSLSPSwitch_Cases();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase <em>MParameterSLSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MParameterSLSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase
	 * @generated
	 */
	EClass getMParameterSLSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase#getDefaultValue <em>DefaultValue</em>}'.
	 * @return the meta object for the containment reference '<em>DefaultValue</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase#getDefaultValue()
	 * @see #getMParameterSLSPSwitchCase()
	 * @generated
	 */
	EReference getMParameterSLSPSwitchCase_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase#getPlatform <em>Platform</em>}'.
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase#getPlatform()
	 * @see #getMParameterSLSPSwitchCase()
	 * @generated
	 */
	EReference getMParameterSLSPSwitchCase_Platform();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MBooleanParamSLSPSwitch <em>MBooleanParamSLSPSwitch</em>}'.
	 * @return the meta object for class '<em>MBooleanParamSLSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MBooleanParamSLSPSwitch
	 * @generated
	 */
	EClass getMBooleanParamSLSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MBooleanParamSLSPSwitchCase <em>MBooleanParamSLSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MBooleanParamSLSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MBooleanParamSLSPSwitchCase
	 * @generated
	 */
	EClass getMBooleanParamSLSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MStringParamSLSPSwitch <em>MStringParamSLSPSwitch</em>}'.
	 * @return the meta object for class '<em>MStringParamSLSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MStringParamSLSPSwitch
	 * @generated
	 */
	EClass getMStringParamSLSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MStringParamSLSPSwitchCase <em>MStringParamSLSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MStringParamSLSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MStringParamSLSPSwitchCase
	 * @generated
	 */
	EClass getMStringParamSLSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitch <em>MIntegerParamSLSPSwitch</em>}'.
	 * @return the meta object for class '<em>MIntegerParamSLSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitch
	 * @generated
	 */
	EClass getMIntegerParamSLSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitchCase <em>MIntegerParamSLSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MIntegerParamSLSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitchCase
	 * @generated
	 */
	EClass getMIntegerParamSLSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitchCase#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitchCase#getRange()
	 * @see #getMIntegerParamSLSPSwitchCase()
	 * @generated
	 */
	EReference getMIntegerParamSLSPSwitchCase_Range();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitch <em>MEnumParamSLSPSwitch</em>}'.
	 * @return the meta object for class '<em>MEnumParamSLSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitch
	 * @generated
	 */
	EClass getMEnumParamSLSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitchCase <em>MEnumParamSLSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MEnumParamSLSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitchCase
	 * @generated
	 */
	EClass getMEnumParamSLSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitch <em>MRealParamSLSPSwitch</em>}'.
	 * @return the meta object for class '<em>MRealParamSLSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitch
	 * @generated
	 */
	EClass getMRealParamSLSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitchCase <em>MRealParamSLSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MRealParamSLSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitchCase
	 * @generated
	 */
	EClass getMRealParamSLSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitchCase#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitchCase#getRange()
	 * @see #getMRealParamSLSPSwitchCase()
	 * @generated
	 */
	EReference getMRealParamSLSPSwitchCase_Range();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mclevslibFactory getmclevslibFactory();

	/**
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryImpl <em>MServiceLibrary</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMServiceLibrary()
		 * @generated
		 */
		EClass MSERVICE_LIBRARY = eINSTANCE.getMServiceLibrary();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY__REQUIRES = eINSTANCE.getMServiceLibrary_Requires();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY__LANGUAGES = eINSTANCE.getMServiceLibrary_Languages();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY__EXTENDS = eINSTANCE.getMServiceLibrary_Extends();

		/**
		 * The meta object literal for the '<em><b>SupportedPlatforms</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY__SUPPORTED_PLATFORMS = eINSTANCE.getMServiceLibrary_SupportedPlatforms();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryProvidedSAIImpl <em>MServiceLibrary Provided SAI</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibraryProvidedSAIImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMServiceLibraryProvidedSAI()
		 * @generated
		 */
		EClass MSERVICE_LIBRARY_PROVIDED_SAI = eINSTANCE.getMServiceLibraryProvidedSAI();

		/**
		 * The meta object literal for the '<em><b>SAI</b></em>' reference feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_PROVIDED_SAI__SAI = eINSTANCE.getMServiceLibraryProvidedSAI_Sai();

		/**
		 * The meta object literal for the '<em><b>Attribute Value Assignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_PROVIDED_SAI__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMServiceLibraryProvidedSAI_AttributeValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVAImpl <em>MS Lib Provided SAIAVA</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVAImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMSLibProvidedSAIAVA()
		 * @generated
		 */
		EClass MS_LIB_PROVIDED_SAIAVA = eINSTANCE.getMSLibProvidedSAIAVA();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVASwitchImpl <em>MS Lib Provided SAIAVA Switch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVASwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMSLibProvidedSAIAVASwitch()
		 * @generated
		 */
		EClass MS_LIB_PROVIDED_SAIAVA_SWITCH = eINSTANCE.getMSLibProvidedSAIAVASwitch();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MS_LIB_PROVIDED_SAIAVA_SWITCH__CASES = eINSTANCE.getMSLibProvidedSAIAVASwitch_Cases();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVASwitchCaseImpl <em>MS Lib Provided SAIAVA Switch Case</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVASwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMSLibProvidedSAIAVASwitchCase()
		 * @generated
		 */
		EClass MS_LIB_PROVIDED_SAIAVA_SWITCH_CASE = eINSTANCE.getMSLibProvidedSAIAVASwitchCase();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * @generated
		 */
		EReference MS_LIB_PROVIDED_SAIAVA_SWITCH_CASE__PLATFORM = eINSTANCE.getMSLibProvidedSAIAVASwitchCase_Platform();

		/**
		 * The meta object literal for the '<em><b>AttributeValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MS_LIB_PROVIDED_SAIAVA_SWITCH_CASE__ATTRIBUTE_VALUE = eINSTANCE.getMSLibProvidedSAIAVASwitchCase_AttributeValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVAExpressionImpl <em>MS Lib Provided SAIAVA Expression</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MSLibProvidedSAIAVAExpressionImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMSLibProvidedSAIAVAExpression()
		 * @generated
		 */
		EClass MS_LIB_PROVIDED_SAIAVA_EXPRESSION = eINSTANCE.getMSLibProvidedSAIAVAExpression();

		/**
		 * The meta object literal for the '<em><b>AttributeValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MS_LIB_PROVIDED_SAIAVA_EXPRESSION__ATTRIBUTE_VALUE = eINSTANCE.getMSLibProvidedSAIAVAExpression_AttributeValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibrarySupportedPlatformImpl <em>MServiceLibrarySupportedPlatform</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MServiceLibrarySupportedPlatformImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMServiceLibrarySupportedPlatform()
		 * @generated
		 */
		EClass MSERVICE_LIBRARY_SUPPORTED_PLATFORM = eINSTANCE.getMServiceLibrarySupportedPlatform();

		/**
		 * The meta object literal for the '<em><b>OSAPI</b></em>' reference feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_SUPPORTED_PLATFORM__OSAPI = eINSTANCE.getMServiceLibrarySupportedPlatform_Osapi();

		/**
		 * The meta object literal for the '<em><b>OS</b></em>' reference feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_SUPPORTED_PLATFORM__OS = eINSTANCE.getMServiceLibrarySupportedPlatform_Os();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' reference feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_SUPPORTED_PLATFORM__ARCHITECTURE = eINSTANCE.getMServiceLibrarySupportedPlatform_Architecture();

		/**
		 * The meta object literal for the '<em><b>Compiler</b></em>' reference feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_SUPPORTED_PLATFORM__COMPILER = eINSTANCE.getMServiceLibrarySupportedPlatform_Compiler();

		/**
		 * The meta object literal for the '<em><b>Microprocessor</b></em>' reference feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_SUPPORTED_PLATFORM__MICROPROCESSOR = eINSTANCE.getMServiceLibrarySupportedPlatform_Microprocessor();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_SUPPORTED_PLATFORM__BOARD = eINSTANCE.getMServiceLibrarySupportedPlatform_Board();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_SUPPORTED_PLATFORM__REQUIRES = eINSTANCE.getMServiceLibrarySupportedPlatform_Requires();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_SUPPORTED_PLATFORM__ATTRIBUTES = eINSTANCE.getMServiceLibrarySupportedPlatform_Attributes();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_SUPPORTED_PLATFORM__LANGUAGES = eINSTANCE.getMServiceLibrarySupportedPlatform_Languages();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverSLibSupportedPlatformImpl <em>MDriverSLibSupportedPlatform</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverSLibSupportedPlatformImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMDriverSLibSupportedPlatform()
		 * @generated
		 */
		EClass MDRIVER_SLIB_SUPPORTED_PLATFORM = eINSTANCE.getMDriverSLibSupportedPlatform();

		/**
		 * The meta object literal for the '<em><b>SupportedDevices</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDRIVER_SLIB_SUPPORTED_PLATFORM__SUPPORTED_DEVICES = eINSTANCE.getMDriverSLibSupportedPlatform_SupportedDevices();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverSLibSupportedDeviceImpl <em>MDriverSLibSupportedDevice</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverSLibSupportedDeviceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMDriverSLibSupportedDevice()
		 * @generated
		 */
		EClass MDRIVER_SLIB_SUPPORTED_DEVICE = eINSTANCE.getMDriverSLibSupportedDevice();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MDRIVER_SLIB_SUPPORTED_DEVICE__REQUIRED = eINSTANCE.getMDriverSLibSupportedDevice_Required();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * @generated
		 */
		EReference MDRIVER_SLIB_SUPPORTED_DEVICE__DEVICE = eINSTANCE.getMDriverSLibSupportedDevice_Device();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MAbstractServiceLibraryImpl <em>MAbstractServiceLibrary</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MAbstractServiceLibraryImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMAbstractServiceLibrary()
		 * @generated
		 */
		EClass MABSTRACT_SERVICE_LIBRARY = eINSTANCE.getMAbstractServiceLibrary();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MABSTRACT_SERVICE_LIBRARY__ATTRIBUTES = eINSTANCE.getMAbstractServiceLibrary_Attributes();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MABSTRACT_SERVICE_LIBRARY__INHERITS = eINSTANCE.getMAbstractServiceLibrary_Inherits();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MABSTRACT_SERVICE_LIBRARY__PROVIDES = eINSTANCE.getMAbstractServiceLibrary_Provides();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MMCLEVSLIBPackageFileImpl <em>MMCLEVSLIBPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MMCLEVSLIBPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMMCLEVSLIBPackageFile()
		 * @generated
		 */
		EClass MMCLEVSLIB_PACKAGE_FILE = eINSTANCE.getMMCLEVSLIBPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MMCLEVSLIBPackageElementImpl <em>MMCLEVSLIBPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MMCLEVSLIBPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMMCLEVSLIBPackageElement()
		 * @generated
		 */
		EClass MMCLEVSLIB_PACKAGE_ELEMENT = eINSTANCE.getMMCLEVSLIBPackageElement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverServiceLibraryImpl <em>MDriverServiceLibrary</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MDriverServiceLibraryImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMDriverServiceLibrary()
		 * @generated
		 */
		EClass MDRIVER_SERVICE_LIBRARY = eINSTANCE.getMDriverServiceLibrary();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MParameterSLSPSwitchImpl <em>MParameterSLSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MParameterSLSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMParameterSLSPSwitch()
		 * @generated
		 */
		EClass MPARAMETER_SLSP_SWITCH = eINSTANCE.getMParameterSLSPSwitch();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MPARAMETER_SLSP_SWITCH__CASES = eINSTANCE.getMParameterSLSPSwitch_Cases();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MParameterSLSPSwitchCaseImpl <em>MParameterSLSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MParameterSLSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMParameterSLSPSwitchCase()
		 * @generated
		 */
		EClass MPARAMETER_SLSP_SWITCH_CASE = eINSTANCE.getMParameterSLSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>DefaultValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE = eINSTANCE.getMParameterSLSPSwitchCase_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * @generated
		 */
		EReference MPARAMETER_SLSP_SWITCH_CASE__PLATFORM = eINSTANCE.getMParameterSLSPSwitchCase_Platform();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MBooleanParamSLSPSwitchImpl <em>MBooleanParamSLSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MBooleanParamSLSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMBooleanParamSLSPSwitch()
		 * @generated
		 */
		EClass MBOOLEAN_PARAM_SLSP_SWITCH = eINSTANCE.getMBooleanParamSLSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MBooleanParamSLSPSwitchCaseImpl <em>MBooleanParamSLSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MBooleanParamSLSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMBooleanParamSLSPSwitchCase()
		 * @generated
		 */
		EClass MBOOLEAN_PARAM_SLSP_SWITCH_CASE = eINSTANCE.getMBooleanParamSLSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MStringParamSLSPSwitchImpl <em>MStringParamSLSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MStringParamSLSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMStringParamSLSPSwitch()
		 * @generated
		 */
		EClass MSTRING_PARAM_SLSP_SWITCH = eINSTANCE.getMStringParamSLSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MStringParamSLSPSwitchCaseImpl <em>MStringParamSLSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MStringParamSLSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMStringParamSLSPSwitchCase()
		 * @generated
		 */
		EClass MSTRING_PARAM_SLSP_SWITCH_CASE = eINSTANCE.getMStringParamSLSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MIntegerParamSLSPSwitchImpl <em>MIntegerParamSLSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MIntegerParamSLSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMIntegerParamSLSPSwitch()
		 * @generated
		 */
		EClass MINTEGER_PARAM_SLSP_SWITCH = eINSTANCE.getMIntegerParamSLSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MIntegerParamSLSPSwitchCaseImpl <em>MIntegerParamSLSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MIntegerParamSLSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMIntegerParamSLSPSwitchCase()
		 * @generated
		 */
		EClass MINTEGER_PARAM_SLSP_SWITCH_CASE = eINSTANCE.getMIntegerParamSLSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MINTEGER_PARAM_SLSP_SWITCH_CASE__RANGE = eINSTANCE.getMIntegerParamSLSPSwitchCase_Range();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MEnumParamSLSPSwitchImpl <em>MEnumParamSLSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MEnumParamSLSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMEnumParamSLSPSwitch()
		 * @generated
		 */
		EClass MENUM_PARAM_SLSP_SWITCH = eINSTANCE.getMEnumParamSLSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MEnumParamSLSPSwitchCaseImpl <em>MEnumParamSLSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MEnumParamSLSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMEnumParamSLSPSwitchCase()
		 * @generated
		 */
		EClass MENUM_PARAM_SLSP_SWITCH_CASE = eINSTANCE.getMEnumParamSLSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MRealParamSLSPSwitchImpl <em>MRealParamSLSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MRealParamSLSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMRealParamSLSPSwitch()
		 * @generated
		 */
		EClass MREAL_PARAM_SLSP_SWITCH = eINSTANCE.getMRealParamSLSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevslib.impl.MRealParamSLSPSwitchCaseImpl <em>MRealParamSLSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.MRealParamSLSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevslib.impl.mclevslibPackageImpl#getMRealParamSLSPSwitchCase()
		 * @generated
		 */
		EClass MREAL_PARAM_SLSP_SWITCH_CASE = eINSTANCE.getMRealParamSLSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MREAL_PARAM_SLSP_SWITCH_CASE__RANGE = eINSTANCE.getMRealParamSLSPSwitchCase_Range();

	}

}