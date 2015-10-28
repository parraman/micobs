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
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadFactory
 * @model kind="package"
 * @generated
 */
public interface mclevmcadPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mclevmcad";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mclev/mclevmcad";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mclev";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mclevmcadPackage eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCLEVMCADPackageElementImpl <em>MMCLEVMCADPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCLEVMCADPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMMCLEVMCADPackageElement()
	 * @generated
	 */
	int MMCLEVMCAD_PACKAGE_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVMCAD_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVMCAD_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVMCAD_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVMCADPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVMCAD_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCADeploymentImpl <em>MMCADeployment</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCADeploymentImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMMCADeployment()
	 * @generated
	 */
	int MMCA_DEPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCA_DEPLOYMENT__VERSION = MMCLEVMCAD_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCA_DEPLOYMENT__NAME = MMCLEVMCAD_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCA_DEPLOYMENT__URI = MMCLEVMCAD_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMCA_DEPLOYMENT__DOMAIN = MMCLEVMCAD_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCA_DEPLOYMENT__LIBRARIES = MMCLEVMCAD_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCA_DEPLOYMENT__COMPONENTS = MMCLEVMCAD_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS = MMCLEVMCAD_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>DeploymentAlternatives</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCA_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES = MMCLEVMCAD_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCA_DEPLOYMENT__CONNECTIONS = MMCLEVMCAD_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>DeploymentPlatforms</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMCA_DEPLOYMENT__DEPLOYMENT_PLATFORMS = MMCLEVMCAD_PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MMCADeployment</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCA_DEPLOYMENT_FEATURE_COUNT = MMCLEVMCAD_PACKAGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MServiceLibraryInstanceImpl <em>MService LibraryInstance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MServiceLibraryInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMServiceLibraryInstance()
	 * @generated
	 */
	int MSERVICE_LIBRARY_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Library</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_INSTANCE__LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS = 1;

	/**
	 * The number of structural features of the '<em>MService LibraryInstance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSERVICE_LIBRARY_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDriverSLibInstanceImpl <em>MDriver SLibInstance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDriverSLibInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMDriverSLibInstance()
	 * @generated
	 */
	int MDRIVER_SLIB_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Library</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_INSTANCE__LIBRARY = MSERVICE_LIBRARY_INSTANCE__LIBRARY;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS = MSERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>DeviceDriverMappings</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS = MSERVICE_LIBRARY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MDriver SLibInstance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDRIVER_SLIB_INSTANCE_FEATURE_COUNT = MSERVICE_LIBRARY_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeviceDriverMappingImpl <em>MDevice DriverMapping</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeviceDriverMappingImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMDeviceDriverMapping()
	 * @generated
	 */
	int MDEVICE_DRIVER_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>DeployedDevice</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>SupportedDevice</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE = 1;

	/**
	 * The number of structural features of the '<em>MDevice DriverMapping</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDEVICE_DRIVER_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MComponentInstanceImpl <em>MComponentInstance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MComponentInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMComponentInstance()
	 * @generated
	 */
	int MCOMPONENT_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_INSTANCE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_INSTANCE__COMPONENT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MComponentInstance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_INSTANCE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentAlternativeImpl <em>MDeploymentAlternative</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentAlternativeImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMDeploymentAlternative()
	 * @generated
	 */
	int MDEPLOYMENT_ALTERNATIVE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_ALTERNATIVE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>DeploymentPlatforms</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_ALTERNATIVE__ATTRIBUTE_VALUE_ASSIGNMENTS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_ALTERNATIVE__LIBRARIES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_ALTERNATIVE__COMPONENTS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>DeploymentAlternatives</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_ALTERNATIVE__CONNECTIONS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MDeploymentAlternative</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_ALTERNATIVE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionImpl <em>MConnection</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMConnection()
	 * @generated
	 */
	int MCONNECTION = 6;

	/**
	 * The number of structural features of the '<em>MConnection</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCONNECTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MCommonConnectionImpl <em>MCommonConnection</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MCommonConnectionImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMCommonConnection()
	 * @generated
	 */
	int MCOMMON_CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>ClientInstance</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_CONNECTION__CLIENT_INSTANCE = MCONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ClientPort</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_CONNECTION__CLIENT_PORT = MCONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ServerInstance</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_CONNECTION__SERVER_INSTANCE = MCONNECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ServerPort</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_CONNECTION__SERVER_PORT = MCONNECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_CONNECTION__CONNECTOR = MCONNECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>IfaceMapping</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_CONNECTION__IFACE_MAPPING = MCONNECTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS = MCONNECTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MCommonConnection</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_CONNECTION_FEATURE_COUNT = MCONNECTION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchImpl <em>MConnectionSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMConnectionSwitch()
	 * @generated
	 */
	int MCONNECTION_SWITCH = 8;

	/**
	 * The feature id for the '<em><b>ClientInstance</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCONNECTION_SWITCH__CLIENT_INSTANCE = MCONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ClientPort</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCONNECTION_SWITCH__CLIENT_PORT = MCONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCONNECTION_SWITCH__CASES = MCONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MConnectionSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCONNECTION_SWITCH_FEATURE_COUNT = MCONNECTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchCaseImpl <em>MConnectionSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMConnectionSwitchCase()
	 * @generated
	 */
	int MCONNECTION_SWITCH_CASE = 9;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCONNECTION_SWITCH_CASE__ALTERNATIVE = 0;

	/**
	 * The feature id for the '<em><b>ServerInstance</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCONNECTION_SWITCH_CASE__SERVER_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>ServerPort</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCONNECTION_SWITCH_CASE__SERVER_PORT = 2;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCONNECTION_SWITCH_CASE__CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>IfaceMapping</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCONNECTION_SWITCH_CASE__IFACE_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCONNECTION_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS = 5;

	/**
	 * The number of structural features of the '<em>MConnectionSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCONNECTION_SWITCH_CASE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentPlatformImpl <em>MDeploymentPlatform</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentPlatformImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMDeploymentPlatform()
	 * @generated
	 */
	int MDEPLOYMENT_PLATFORM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_PLATFORM__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_PLATFORM__PLATFORM = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ParameterValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DeployedDevices</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_PLATFORM__DEPLOYED_DEVICES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MDeploymentPlatform</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYMENT_PLATFORM_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeployedDeviceImpl <em>MDeployedDevice</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeployedDeviceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMDeployedDevice()
	 * @generated
	 */
	int MDEPLOYED_DEVICE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYED_DEVICE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYED_DEVICE__DEVICE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ParameterValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYED_DEVICE__PARAMETER_VALUE_ASSIGNMENTS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MDeployedDevice</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDEPLOYED_DEVICE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCLEVMCADPackageFileImpl <em>MMCLEVMCADPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCLEVMCADPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMMCLEVMCADPackageFile()
	 * @generated
	 */
	int MMCLEVMCAD_PACKAGE_FILE = 12;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVMCAD_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEVMCAD_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVMCAD_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMCLEVMCADPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVMCAD_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment <em>MMCADeployment</em>}'.
	 * @return the meta object for class '<em>MMCADeployment</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment
	 * @generated
	 */
	EClass getMMCADeployment();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getDomain <em>Domain</em>}'.
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getDomain()
	 * @see #getMMCADeployment()
	 * @generated
	 */
	EReference getMMCADeployment_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getLibraries <em>Libraries</em>}'.
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getLibraries()
	 * @see #getMMCADeployment()
	 * @generated
	 */
	EReference getMMCADeployment_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getComponents <em>Components</em>}'.
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getComponents()
	 * @see #getMMCADeployment()
	 * @generated
	 */
	EReference getMMCADeployment_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getAttributeValueAssignments()
	 * @see #getMMCADeployment()
	 * @generated
	 */
	EReference getMMCADeployment_AttributeValueAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getDeploymentAlternatives <em>DeploymentAlternatives</em>}'.
	 * @return the meta object for the containment reference list '<em>DeploymentAlternatives</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getDeploymentAlternatives()
	 * @see #getMMCADeployment()
	 * @generated
	 */
	EReference getMMCADeployment_DeploymentAlternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getConnections <em>Connections</em>}'.
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getConnections()
	 * @see #getMMCADeployment()
	 * @generated
	 */
	EReference getMMCADeployment_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getDeploymentPlatforms <em>DeploymentPlatforms</em>}'.
	 * @return the meta object for the containment reference list '<em>DeploymentPlatforms</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment#getDeploymentPlatforms()
	 * @see #getMMCADeployment()
	 * @generated
	 */
	EReference getMMCADeployment_DeploymentPlatforms();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance <em>MService LibraryInstance</em>}'.
	 * @return the meta object for class '<em>MService LibraryInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance
	 * @generated
	 */
	EClass getMServiceLibraryInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance#getLibrary <em>Library</em>}'.
	 * @return the meta object for the reference '<em>Library</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance#getLibrary()
	 * @see #getMServiceLibraryInstance()
	 * @generated
	 */
	EReference getMServiceLibraryInstance_Library();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance#getAttributeValueAssignments()
	 * @see #getMServiceLibraryInstance()
	 * @generated
	 */
	EReference getMServiceLibraryInstance_AttributeValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance <em>MDriver SLibInstance</em>}'.
	 * @return the meta object for class '<em>MDriver SLibInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance
	 * @generated
	 */
	EClass getMDriverSLibInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance#getDeviceDriverMappings <em>DeviceDriverMappings</em>}'.
	 * @return the meta object for the containment reference list '<em>DeviceDriverMappings</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance#getDeviceDriverMappings()
	 * @see #getMDriverSLibInstance()
	 * @generated
	 */
	EReference getMDriverSLibInstance_DeviceDriverMappings();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping <em>MDevice DriverMapping</em>}'.
	 * @return the meta object for class '<em>MDevice DriverMapping</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping
	 * @generated
	 */
	EClass getMDeviceDriverMapping();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping#getDeployedDevice <em>DeployedDevice</em>}'.
	 * @return the meta object for the reference '<em>DeployedDevice</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping#getDeployedDevice()
	 * @see #getMDeviceDriverMapping()
	 * @generated
	 */
	EReference getMDeviceDriverMapping_DeployedDevice();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping#getSupportedDevice <em>SupportedDevice</em>}'.
	 * @return the meta object for the reference '<em>SupportedDevice</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping#getSupportedDevice()
	 * @see #getMDeviceDriverMapping()
	 * @generated
	 */
	EReference getMDeviceDriverMapping_SupportedDevice();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance <em>MComponentInstance</em>}'.
	 * @return the meta object for class '<em>MComponentInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance
	 * @generated
	 */
	EClass getMComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance#getComponent <em>Component</em>}'.
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance#getComponent()
	 * @see #getMComponentInstance()
	 * @generated
	 */
	EReference getMComponentInstance_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance#getAttributeValueAssignments()
	 * @see #getMComponentInstance()
	 * @generated
	 */
	EReference getMComponentInstance_AttributeValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative <em>MDeploymentAlternative</em>}'.
	 * @return the meta object for class '<em>MDeploymentAlternative</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative
	 * @generated
	 */
	EClass getMDeploymentAlternative();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getDeploymentPlatforms <em>DeploymentPlatforms</em>}'.
	 * @return the meta object for the reference list '<em>DeploymentPlatforms</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getDeploymentPlatforms()
	 * @see #getMDeploymentAlternative()
	 * @generated
	 */
	EReference getMDeploymentAlternative_DeploymentPlatforms();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getAttributeValueAssignments()
	 * @see #getMDeploymentAlternative()
	 * @generated
	 */
	EReference getMDeploymentAlternative_AttributeValueAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getLibraries <em>Libraries</em>}'.
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getLibraries()
	 * @see #getMDeploymentAlternative()
	 * @generated
	 */
	EReference getMDeploymentAlternative_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getComponents <em>Components</em>}'.
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getComponents()
	 * @see #getMDeploymentAlternative()
	 * @generated
	 */
	EReference getMDeploymentAlternative_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getDeploymentAlternatives <em>DeploymentAlternatives</em>}'.
	 * @return the meta object for the containment reference list '<em>DeploymentAlternatives</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getDeploymentAlternatives()
	 * @see #getMDeploymentAlternative()
	 * @generated
	 */
	EReference getMDeploymentAlternative_DeploymentAlternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getConnections <em>Connections</em>}'.
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative#getConnections()
	 * @see #getMDeploymentAlternative()
	 * @generated
	 */
	EReference getMDeploymentAlternative_Connections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection <em>MConnection</em>}'.
	 * @return the meta object for class '<em>MConnection</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection
	 * @generated
	 */
	EClass getMConnection();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection <em>MCommonConnection</em>}'.
	 * @return the meta object for class '<em>MCommonConnection</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection
	 * @generated
	 */
	EClass getMCommonConnection();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getClientInstance <em>ClientInstance</em>}'.
	 * @return the meta object for the reference '<em>ClientInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getClientInstance()
	 * @see #getMCommonConnection()
	 * @generated
	 */
	EReference getMCommonConnection_ClientInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getClientPort <em>ClientPort</em>}'.
	 * @return the meta object for the reference '<em>ClientPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getClientPort()
	 * @see #getMCommonConnection()
	 * @generated
	 */
	EReference getMCommonConnection_ClientPort();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getServerInstance <em>ServerInstance</em>}'.
	 * @return the meta object for the reference '<em>ServerInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getServerInstance()
	 * @see #getMCommonConnection()
	 * @generated
	 */
	EReference getMCommonConnection_ServerInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getServerPort <em>ServerPort</em>}'.
	 * @return the meta object for the reference '<em>ServerPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getServerPort()
	 * @see #getMCommonConnection()
	 * @generated
	 */
	EReference getMCommonConnection_ServerPort();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getConnector <em>Connector</em>}'.
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getConnector()
	 * @see #getMCommonConnection()
	 * @generated
	 */
	EReference getMCommonConnection_Connector();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getIfaceMapping <em>IfaceMapping</em>}'.
	 * @return the meta object for the reference '<em>IfaceMapping</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getIfaceMapping()
	 * @see #getMCommonConnection()
	 * @generated
	 */
	EReference getMCommonConnection_IfaceMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection#getAttributeValueAssignments()
	 * @see #getMCommonConnection()
	 * @generated
	 */
	EReference getMCommonConnection_AttributeValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch <em>MConnectionSwitch</em>}'.
	 * @return the meta object for class '<em>MConnectionSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch
	 * @generated
	 */
	EClass getMConnectionSwitch();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch#getClientInstance <em>ClientInstance</em>}'.
	 * @return the meta object for the reference '<em>ClientInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch#getClientInstance()
	 * @see #getMConnectionSwitch()
	 * @generated
	 */
	EReference getMConnectionSwitch_ClientInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch#getClientPort <em>ClientPort</em>}'.
	 * @return the meta object for the reference '<em>ClientPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch#getClientPort()
	 * @see #getMConnectionSwitch()
	 * @generated
	 */
	EReference getMConnectionSwitch_ClientPort();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch#getCases <em>Cases</em>}'.
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch#getCases()
	 * @see #getMConnectionSwitch()
	 * @generated
	 */
	EReference getMConnectionSwitch_Cases();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase <em>MConnectionSwitchCase</em>}'.
	 * @return the meta object for class '<em>MConnectionSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase
	 * @generated
	 */
	EClass getMConnectionSwitchCase();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getAlternative <em>Alternative</em>}'.
	 * @return the meta object for the reference '<em>Alternative</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getAlternative()
	 * @see #getMConnectionSwitchCase()
	 * @generated
	 */
	EReference getMConnectionSwitchCase_Alternative();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getServerInstance <em>ServerInstance</em>}'.
	 * @return the meta object for the reference '<em>ServerInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getServerInstance()
	 * @see #getMConnectionSwitchCase()
	 * @generated
	 */
	EReference getMConnectionSwitchCase_ServerInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getServerPort <em>ServerPort</em>}'.
	 * @return the meta object for the reference '<em>ServerPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getServerPort()
	 * @see #getMConnectionSwitchCase()
	 * @generated
	 */
	EReference getMConnectionSwitchCase_ServerPort();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getConnector <em>Connector</em>}'.
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getConnector()
	 * @see #getMConnectionSwitchCase()
	 * @generated
	 */
	EReference getMConnectionSwitchCase_Connector();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getIfaceMapping <em>IfaceMapping</em>}'.
	 * @return the meta object for the reference '<em>IfaceMapping</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getIfaceMapping()
	 * @see #getMConnectionSwitchCase()
	 * @generated
	 */
	EReference getMConnectionSwitchCase_IfaceMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase#getAttributeValueAssignments()
	 * @see #getMConnectionSwitchCase()
	 * @generated
	 */
	EReference getMConnectionSwitchCase_AttributeValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform <em>MDeploymentPlatform</em>}'.
	 * @return the meta object for class '<em>MDeploymentPlatform</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform
	 * @generated
	 */
	EClass getMDeploymentPlatform();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform#getPlatform <em>Platform</em>}'.
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform#getPlatform()
	 * @see #getMDeploymentPlatform()
	 * @generated
	 */
	EReference getMDeploymentPlatform_Platform();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform#getParameterValueAssignments <em>ParameterValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>ParameterValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform#getParameterValueAssignments()
	 * @see #getMDeploymentPlatform()
	 * @generated
	 */
	EReference getMDeploymentPlatform_ParameterValueAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform#getDeployedDevices <em>DeployedDevices</em>}'.
	 * @return the meta object for the containment reference list '<em>DeployedDevices</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform#getDeployedDevices()
	 * @see #getMDeploymentPlatform()
	 * @generated
	 */
	EReference getMDeploymentPlatform_DeployedDevices();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice <em>MDeployedDevice</em>}'.
	 * @return the meta object for class '<em>MDeployedDevice</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice
	 * @generated
	 */
	EClass getMDeployedDevice();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice#getDevice <em>Device</em>}'.
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice#getDevice()
	 * @see #getMDeployedDevice()
	 * @generated
	 */
	EReference getMDeployedDevice_Device();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice#getParameterValueAssignments <em>ParameterValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>ParameterValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice#getParameterValueAssignments()
	 * @see #getMDeployedDevice()
	 * @generated
	 */
	EReference getMDeployedDevice_ParameterValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile <em>MMCLEVMCADPackageFile</em>}'.
	 * @return the meta object for class '<em>MMCLEVMCADPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile
	 * @generated
	 */
	EClass getMMCLEVMCADPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageElement <em>MMCLEVMCADPackageElement</em>}'.
	 * @return the meta object for class '<em>MMCLEVMCADPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageElement
	 * @generated
	 */
	EClass getMMCLEVMCADPackageElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mclevmcadFactory getmclevmcadFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCADeploymentImpl <em>MMCADeployment</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCADeploymentImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMMCADeployment()
		 * @generated
		 */
		EClass MMCA_DEPLOYMENT = eINSTANCE.getMMCADeployment();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * @generated
		 */
		EReference MMCA_DEPLOYMENT__DOMAIN = eINSTANCE.getMMCADeployment_Domain();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMCA_DEPLOYMENT__LIBRARIES = eINSTANCE.getMMCADeployment_Libraries();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMCA_DEPLOYMENT__COMPONENTS = eINSTANCE.getMMCADeployment_Components();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMMCADeployment_AttributeValueAssignments();

		/**
		 * The meta object literal for the '<em><b>DeploymentAlternatives</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMCA_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES = eINSTANCE.getMMCADeployment_DeploymentAlternatives();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMCA_DEPLOYMENT__CONNECTIONS = eINSTANCE.getMMCADeployment_Connections();

		/**
		 * The meta object literal for the '<em><b>DeploymentPlatforms</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMCA_DEPLOYMENT__DEPLOYMENT_PLATFORMS = eINSTANCE.getMMCADeployment_DeploymentPlatforms();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MServiceLibraryInstanceImpl <em>MService LibraryInstance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MServiceLibraryInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMServiceLibraryInstance()
		 * @generated
		 */
		EClass MSERVICE_LIBRARY_INSTANCE = eINSTANCE.getMServiceLibraryInstance();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' reference feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_INSTANCE__LIBRARY = eINSTANCE.getMServiceLibraryInstance_Library();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MSERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMServiceLibraryInstance_AttributeValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDriverSLibInstanceImpl <em>MDriver SLibInstance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDriverSLibInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMDriverSLibInstance()
		 * @generated
		 */
		EClass MDRIVER_SLIB_INSTANCE = eINSTANCE.getMDriverSLibInstance();

		/**
		 * The meta object literal for the '<em><b>DeviceDriverMappings</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS = eINSTANCE.getMDriverSLibInstance_DeviceDriverMappings();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeviceDriverMappingImpl <em>MDevice DriverMapping</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeviceDriverMappingImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMDeviceDriverMapping()
		 * @generated
		 */
		EClass MDEVICE_DRIVER_MAPPING = eINSTANCE.getMDeviceDriverMapping();

		/**
		 * The meta object literal for the '<em><b>DeployedDevice</b></em>' reference feature.
		 * @generated
		 */
		EReference MDEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE = eINSTANCE.getMDeviceDriverMapping_DeployedDevice();

		/**
		 * The meta object literal for the '<em><b>SupportedDevice</b></em>' reference feature.
		 * @generated
		 */
		EReference MDEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE = eINSTANCE.getMDeviceDriverMapping_SupportedDevice();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MComponentInstanceImpl <em>MComponentInstance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MComponentInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMComponentInstance()
		 * @generated
		 */
		EClass MCOMPONENT_INSTANCE = eINSTANCE.getMComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMPONENT_INSTANCE__COMPONENT = eINSTANCE.getMComponentInstance_Component();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMComponentInstance_AttributeValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentAlternativeImpl <em>MDeploymentAlternative</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentAlternativeImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMDeploymentAlternative()
		 * @generated
		 */
		EClass MDEPLOYMENT_ALTERNATIVE = eINSTANCE.getMDeploymentAlternative();

		/**
		 * The meta object literal for the '<em><b>DeploymentPlatforms</b></em>' reference list feature.
		 * @generated
		 */
		EReference MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS = eINSTANCE.getMDeploymentAlternative_DeploymentPlatforms();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDEPLOYMENT_ALTERNATIVE__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMDeploymentAlternative_AttributeValueAssignments();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDEPLOYMENT_ALTERNATIVE__LIBRARIES = eINSTANCE.getMDeploymentAlternative_Libraries();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDEPLOYMENT_ALTERNATIVE__COMPONENTS = eINSTANCE.getMDeploymentAlternative_Components();

		/**
		 * The meta object literal for the '<em><b>DeploymentAlternatives</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES = eINSTANCE.getMDeploymentAlternative_DeploymentAlternatives();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDEPLOYMENT_ALTERNATIVE__CONNECTIONS = eINSTANCE.getMDeploymentAlternative_Connections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionImpl <em>MConnection</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMConnection()
		 * @generated
		 */
		EClass MCONNECTION = eINSTANCE.getMConnection();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MCommonConnectionImpl <em>MCommonConnection</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MCommonConnectionImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMCommonConnection()
		 * @generated
		 */
		EClass MCOMMON_CONNECTION = eINSTANCE.getMCommonConnection();

		/**
		 * The meta object literal for the '<em><b>ClientInstance</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMMON_CONNECTION__CLIENT_INSTANCE = eINSTANCE.getMCommonConnection_ClientInstance();

		/**
		 * The meta object literal for the '<em><b>ClientPort</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMMON_CONNECTION__CLIENT_PORT = eINSTANCE.getMCommonConnection_ClientPort();

		/**
		 * The meta object literal for the '<em><b>ServerInstance</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMMON_CONNECTION__SERVER_INSTANCE = eINSTANCE.getMCommonConnection_ServerInstance();

		/**
		 * The meta object literal for the '<em><b>ServerPort</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMMON_CONNECTION__SERVER_PORT = eINSTANCE.getMCommonConnection_ServerPort();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMMON_CONNECTION__CONNECTOR = eINSTANCE.getMCommonConnection_Connector();

		/**
		 * The meta object literal for the '<em><b>IfaceMapping</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMMON_CONNECTION__IFACE_MAPPING = eINSTANCE.getMCommonConnection_IfaceMapping();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMMON_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMCommonConnection_AttributeValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchImpl <em>MConnectionSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMConnectionSwitch()
		 * @generated
		 */
		EClass MCONNECTION_SWITCH = eINSTANCE.getMConnectionSwitch();

		/**
		 * The meta object literal for the '<em><b>ClientInstance</b></em>' reference feature.
		 * @generated
		 */
		EReference MCONNECTION_SWITCH__CLIENT_INSTANCE = eINSTANCE.getMConnectionSwitch_ClientInstance();

		/**
		 * The meta object literal for the '<em><b>ClientPort</b></em>' reference feature.
		 * @generated
		 */
		EReference MCONNECTION_SWITCH__CLIENT_PORT = eINSTANCE.getMConnectionSwitch_ClientPort();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCONNECTION_SWITCH__CASES = eINSTANCE.getMConnectionSwitch_Cases();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchCaseImpl <em>MConnectionSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MConnectionSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMConnectionSwitchCase()
		 * @generated
		 */
		EClass MCONNECTION_SWITCH_CASE = eINSTANCE.getMConnectionSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' reference feature.
		 * @generated
		 */
		EReference MCONNECTION_SWITCH_CASE__ALTERNATIVE = eINSTANCE.getMConnectionSwitchCase_Alternative();

		/**
		 * The meta object literal for the '<em><b>ServerInstance</b></em>' reference feature.
		 * @generated
		 */
		EReference MCONNECTION_SWITCH_CASE__SERVER_INSTANCE = eINSTANCE.getMConnectionSwitchCase_ServerInstance();

		/**
		 * The meta object literal for the '<em><b>ServerPort</b></em>' reference feature.
		 * @generated
		 */
		EReference MCONNECTION_SWITCH_CASE__SERVER_PORT = eINSTANCE.getMConnectionSwitchCase_ServerPort();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * @generated
		 */
		EReference MCONNECTION_SWITCH_CASE__CONNECTOR = eINSTANCE.getMConnectionSwitchCase_Connector();

		/**
		 * The meta object literal for the '<em><b>IfaceMapping</b></em>' reference feature.
		 * @generated
		 */
		EReference MCONNECTION_SWITCH_CASE__IFACE_MAPPING = eINSTANCE.getMConnectionSwitchCase_IfaceMapping();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCONNECTION_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMConnectionSwitchCase_AttributeValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentPlatformImpl <em>MDeploymentPlatform</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeploymentPlatformImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMDeploymentPlatform()
		 * @generated
		 */
		EClass MDEPLOYMENT_PLATFORM = eINSTANCE.getMDeploymentPlatform();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * @generated
		 */
		EReference MDEPLOYMENT_PLATFORM__PLATFORM = eINSTANCE.getMDeploymentPlatform_Platform();

		/**
		 * The meta object literal for the '<em><b>ParameterValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS = eINSTANCE.getMDeploymentPlatform_ParameterValueAssignments();

		/**
		 * The meta object literal for the '<em><b>DeployedDevices</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDEPLOYMENT_PLATFORM__DEPLOYED_DEVICES = eINSTANCE.getMDeploymentPlatform_DeployedDevices();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeployedDeviceImpl <em>MDeployedDevice</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MDeployedDeviceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMDeployedDevice()
		 * @generated
		 */
		EClass MDEPLOYED_DEVICE = eINSTANCE.getMDeployedDevice();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * @generated
		 */
		EReference MDEPLOYED_DEVICE__DEVICE = eINSTANCE.getMDeployedDevice_Device();

		/**
		 * The meta object literal for the '<em><b>ParameterValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDEPLOYED_DEVICE__PARAMETER_VALUE_ASSIGNMENTS = eINSTANCE.getMDeployedDevice_ParameterValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCLEVMCADPackageFileImpl <em>MMCLEVMCADPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCLEVMCADPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMMCLEVMCADPackageFile()
		 * @generated
		 */
		EClass MMCLEVMCAD_PACKAGE_FILE = eINSTANCE.getMMCLEVMCADPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCLEVMCADPackageElementImpl <em>MMCLEVMCADPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.MMCLEVMCADPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.impl.mclevmcadPackageImpl#getMMCLEVMCADPackageElement()
		 * @generated
		 */
		EClass MMCLEVMCAD_PACKAGE_ELEMENT = eINSTANCE.getMMCLEVMCADPackageElement();

	}

} //mclevmcadPackage
