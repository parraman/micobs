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

import org.eclipse.emf.ecore.EAttribute;
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
 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpFactory
 * @model kind="package"
 * @generated
 */
public interface mclevcmpPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mclevcmp";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mclev/mclevcmp";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mclev";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mclevcmpPackage eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MMCLEVCMPPackageElementImpl <em>MMCLEVCMPPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MMCLEVCMPPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMMCLEVCMPPackageElement()
	 * @generated
	 */
	int MMCLEVCMP_PACKAGE_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVCMP_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVCMP_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVCMP_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVCMPPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl <em>MComponent</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMComponent()
	 * @generated
	 */
	int MCOMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__VERSION = MMCLEVCMP_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__NAME = MMCLEVCMP_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__URI = MMCLEVCMP_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__DOMAIN = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__TYPE = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__ATTRIBUTES = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__INHERITS = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ExternalPorts</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__EXTERNAL_PORTS = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__REQUIRES = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__LANGUAGES = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>InternalPorts</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__INTERNAL_PORTS = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Supported Platforms</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__SUPPORTED_PLATFORMS = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>InternalComponents</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__INTERNAL_COMPONENTS = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT__CONNECTIONS = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>MComponent</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_FEATURE_COUNT = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MAbstractComponentImpl <em>MAbstractComponent</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MAbstractComponentImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMAbstractComponent()
	 * @generated
	 */
	int MABSTRACT_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_COMPONENT__VERSION = MMCLEVCMP_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_COMPONENT__NAME = MMCLEVCMP_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_COMPONENT__URI = MMCLEVCMP_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_COMPONENT__DOMAIN = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_COMPONENT__TYPE = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_COMPONENT__ATTRIBUTES = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_COMPONENT__INHERITS = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ExternalPorts</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_COMPONENT__EXTERNAL_PORTS = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MAbstractComponent</em>' class.
	 * @generated
	 * @ordered
	 */
	int MABSTRACT_COMPONENT_FEATURE_COUNT = MMCLEVCMP_PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentSupportedPlatformImpl <em>MComponent Supported Platform</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentSupportedPlatformImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMComponentSupportedPlatform()
	 * @generated
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>OSAPI</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__OSAPI = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>OS</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__OS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__ARCHITECTURE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compiler</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__COMPILER = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Microprocessor</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__MICROPROCESSOR = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__BOARD = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__REQUIRES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__LANGUAGES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTE_VALUE_ASSIGNMENTS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>InternalComponents</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__INTERNAL_COMPONENTS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__CONNECTIONS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>MComponent Supported Platform</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_SUPPORTED_PLATFORM_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentInstanceImpl <em>MInternalComponentInstance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMInternalComponentInstance()
	 * @generated
	 */
	int MINTERNAL_COMPONENT_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_INSTANCE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_INSTANCE__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_INSTANCE__COMPONENT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IsSingleton</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_INSTANCE__IS_SINGLETON = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MInternalComponentInstance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_INSTANCE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MPortImpl <em>MPort</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MPortImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMPort()
	 * @generated
	 */
	int MPORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPORT__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPORT__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPORT__TYPE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPORT__INTERFACE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPORT__ATTRIBUTE_VALUE_ASSIGNMENTS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MPort</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPORT_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MServerPortImpl <em>MServerPort</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MServerPortImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMServerPort()
	 * @generated
	 */
	int MSERVER_PORT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSERVER_PORT__NAME = MPORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSERVER_PORT__DESCRIPTION = MPORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSERVER_PORT__TYPE = MPORT__TYPE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSERVER_PORT__INTERFACE = MPORT__INTERFACE;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSERVER_PORT__ATTRIBUTE_VALUE_ASSIGNMENTS = MPORT__ATTRIBUTE_VALUE_ASSIGNMENTS;

	/**
	 * The number of structural features of the '<em>MServerPort</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSERVER_PORT_FEATURE_COUNT = MPORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MClientPortImpl <em>MClientPort</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MClientPortImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMClientPort()
	 * @generated
	 */
	int MCLIENT_PORT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCLIENT_PORT__NAME = MPORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCLIENT_PORT__DESCRIPTION = MPORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCLIENT_PORT__TYPE = MPORT__TYPE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCLIENT_PORT__INTERFACE = MPORT__INTERFACE;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCLIENT_PORT__ATTRIBUTE_VALUE_ASSIGNMENTS = MPORT__ATTRIBUTE_VALUE_ASSIGNMENTS;

	/**
	 * The number of structural features of the '<em>MClientPort</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCLIENT_PORT_FEATURE_COUNT = MPORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalConnectionImpl <em>MInternalConnection</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalConnectionImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMInternalConnection()
	 * @generated
	 */
	int MINTERNAL_CONNECTION = 7;

	/**
	 * The number of structural features of the '<em>MInternalConnection</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_CONNECTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentConnectionImpl <em>MInternalComponentConnection</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentConnectionImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMInternalComponentConnection()
	 * @generated
	 */
	int MINTERNAL_COMPONENT_CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>ClientInstance</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_CONNECTION__CLIENT_INSTANCE = MINTERNAL_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ClientPort</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_CONNECTION__CLIENT_PORT = MINTERNAL_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ServerInstance</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_CONNECTION__SERVER_INSTANCE = MINTERNAL_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ServerPort</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_CONNECTION__SERVER_PORT = MINTERNAL_CONNECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_CONNECTION__CONNECTOR = MINTERNAL_CONNECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>IfaceMapping</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_CONNECTION__IFACE_MAPPING = MINTERNAL_CONNECTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS = MINTERNAL_CONNECTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MInternalComponentConnection</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_CONNECTION_FEATURE_COUNT = MINTERNAL_CONNECTION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchImpl <em>MInternalComponentPlatformSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMInternalComponentPlatformSwitch()
	 * @generated
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH = 9;

	/**
	 * The feature id for the '<em><b>ClientInstance</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_INSTANCE = MINTERNAL_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ClientPort</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_PORT = MINTERNAL_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH__CASES = MINTERNAL_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>MInternalComponentPlatformSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH_FEATURE_COUNT = MINTERNAL_CONNECTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchCaseImpl <em>MInternalComponentPlatformSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMInternalComponentPlatformSwitchCase()
	 * @generated
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE = 10;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>ServerInstance</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>ServerPort</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_PORT = 2;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>IfaceMapping</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__IFACE_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS = 5;

	/**
	 * The number of structural features of the '<em>MInternalComponentPlatformSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MMCLEVCMPPackageFileImpl <em>MMCLEVCMPPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MMCLEVCMPPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMMCLEVCMPPackageFile()
	 * @generated
	 */
	int MMCLEVCMP_PACKAGE_FILE = 11;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVCMP_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEVCMP_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVCMP_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMCLEVCMPPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVCMP_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MParameterCSPSwitchImpl <em>MParameterCSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MParameterCSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMParameterCSPSwitch()
	 * @generated
	 */
	int MPARAMETER_CSP_SWITCH = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_CSP_SWITCH__NAME = commonPackage.MPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_CSP_SWITCH__DESCRIPTION = commonPackage.MPARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_CSP_SWITCH__CONSTANT = commonPackage.MPARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_CSP_SWITCH__CASES = commonPackage.MPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameterCSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_CSP_SWITCH_FEATURE_COUNT = commonPackage.MPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MParameterCSPSwitchCaseImpl <em>MParameterCSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MParameterCSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMParameterCSPSwitchCase()
	 * @generated
	 */
	int MPARAMETER_CSP_SWITCH_CASE = 14;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_CSP_SWITCH_CASE__DEFAULT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_CSP_SWITCH_CASE__PLATFORM = 1;

	/**
	 * The number of structural features of the '<em>MParameterCSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_CSP_SWITCH_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MBooleanParamCSPSwitchImpl <em>MBooleanParamCSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MBooleanParamCSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMBooleanParamCSPSwitch()
	 * @generated
	 */
	int MBOOLEAN_PARAM_CSP_SWITCH = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_CSP_SWITCH__NAME = commonPackage.MBOOLEAN_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_CSP_SWITCH__DESCRIPTION = commonPackage.MBOOLEAN_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_CSP_SWITCH__CONSTANT = commonPackage.MBOOLEAN_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_CSP_SWITCH__CASES = commonPackage.MBOOLEAN_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MBooleanParamCSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_CSP_SWITCH_FEATURE_COUNT = commonPackage.MBOOLEAN_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MBooleanParamCSPSwitchCaseImpl <em>MBooleanParamCSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MBooleanParamCSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMBooleanParamCSPSwitchCase()
	 * @generated
	 */
	int MBOOLEAN_PARAM_CSP_SWITCH_CASE = 16;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_CSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_CSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_CSP_SWITCH_CASE__PLATFORM = MPARAMETER_CSP_SWITCH_CASE__PLATFORM;

	/**
	 * The number of structural features of the '<em>MBooleanParamCSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_CSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_CSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MStringParamCSPSwitchImpl <em>MStringParamCSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MStringParamCSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMStringParamCSPSwitch()
	 * @generated
	 */
	int MSTRING_PARAM_CSP_SWITCH = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_CSP_SWITCH__NAME = commonPackage.MSTRING_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_CSP_SWITCH__DESCRIPTION = commonPackage.MSTRING_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_CSP_SWITCH__CONSTANT = commonPackage.MSTRING_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_CSP_SWITCH__CASES = commonPackage.MSTRING_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MStringParamCSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_CSP_SWITCH_FEATURE_COUNT = commonPackage.MSTRING_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MStringParamCSPSwitchCaseImpl <em>MStringParamCSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MStringParamCSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMStringParamCSPSwitchCase()
	 * @generated
	 */
	int MSTRING_PARAM_CSP_SWITCH_CASE = 18;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_CSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_CSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_CSP_SWITCH_CASE__PLATFORM = MPARAMETER_CSP_SWITCH_CASE__PLATFORM;

	/**
	 * The number of structural features of the '<em>MStringParamCSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_CSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_CSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MIntegerParamCSPSwitchImpl <em>MIntegerParamCSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MIntegerParamCSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMIntegerParamCSPSwitch()
	 * @generated
	 */
	int MINTEGER_PARAM_CSP_SWITCH = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_CSP_SWITCH__NAME = commonPackage.MINTEGER_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_CSP_SWITCH__DESCRIPTION = commonPackage.MINTEGER_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_CSP_SWITCH__CONSTANT = commonPackage.MINTEGER_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_CSP_SWITCH__CASES = commonPackage.MINTEGER_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MIntegerParamCSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_CSP_SWITCH_FEATURE_COUNT = commonPackage.MINTEGER_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MIntegerParamCSPSwitchCaseImpl <em>MIntegerParamCSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MIntegerParamCSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMIntegerParamCSPSwitchCase()
	 * @generated
	 */
	int MINTEGER_PARAM_CSP_SWITCH_CASE = 20;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_CSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_CSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_CSP_SWITCH_CASE__PLATFORM = MPARAMETER_CSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_CSP_SWITCH_CASE__RANGE = MPARAMETER_CSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MIntegerParamCSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_CSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_CSP_SWITCH_CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MEnumParamCSPSwitchImpl <em>MEnumParamCSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MEnumParamCSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMEnumParamCSPSwitch()
	 * @generated
	 */
	int MENUM_PARAM_CSP_SWITCH = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_CSP_SWITCH__NAME = commonPackage.MENUM_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_CSP_SWITCH__DESCRIPTION = commonPackage.MENUM_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_CSP_SWITCH__CONSTANT = commonPackage.MENUM_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Enum Definition</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_CSP_SWITCH__ENUM_DEFINITION = commonPackage.MENUM_PARAMETER__ENUM_DEFINITION;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_CSP_SWITCH__CASES = commonPackage.MENUM_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MEnumParamCSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_CSP_SWITCH_FEATURE_COUNT = commonPackage.MENUM_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MEnumParamCSPSwitchCaseImpl <em>MEnumParamCSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MEnumParamCSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMEnumParamCSPSwitchCase()
	 * @generated
	 */
	int MENUM_PARAM_CSP_SWITCH_CASE = 22;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_CSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_CSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_CSP_SWITCH_CASE__PLATFORM = MPARAMETER_CSP_SWITCH_CASE__PLATFORM;

	/**
	 * The number of structural features of the '<em>MEnumParamCSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_CSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_CSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MRealParamCSPSwitchImpl <em>MRealParamCSPSwitch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MRealParamCSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMRealParamCSPSwitch()
	 * @generated
	 */
	int MREAL_PARAM_CSP_SWITCH = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_CSP_SWITCH__NAME = commonPackage.MREAL_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_CSP_SWITCH__DESCRIPTION = commonPackage.MREAL_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_CSP_SWITCH__CONSTANT = commonPackage.MREAL_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_CSP_SWITCH__CASES = commonPackage.MREAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MRealParamCSPSwitch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_CSP_SWITCH_FEATURE_COUNT = commonPackage.MREAL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MRealParamCSPSwitchCaseImpl <em>MRealParamCSPSwitchCase</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MRealParamCSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMRealParamCSPSwitchCase()
	 * @generated
	 */
	int MREAL_PARAM_CSP_SWITCH_CASE = 24;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_CSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_CSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_CSP_SWITCH_CASE__PLATFORM = MPARAMETER_CSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_CSP_SWITCH_CASE__RANGE = MPARAMETER_CSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MRealParamCSPSwitchCase</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_CSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_CSP_SWITCH_CASE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent <em>MComponent</em>}'.
	 * @return the meta object for class '<em>MComponent</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent
	 * @generated
	 */
	EClass getMComponent();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getRequires <em>Requires</em>}'.
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getRequires()
	 * @see #getMComponent()
	 * @generated
	 */
	EReference getMComponent_Requires();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getLanguages <em>Languages</em>}'.
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getLanguages()
	 * @see #getMComponent()
	 * @generated
	 */
	EReference getMComponent_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getInternalPorts <em>InternalPorts</em>}'.
	 * @return the meta object for the containment reference list '<em>InternalPorts</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getInternalPorts()
	 * @see #getMComponent()
	 * @generated
	 */
	EReference getMComponent_InternalPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getSupportedPlatforms <em>Supported Platforms</em>}'.
	 * @return the meta object for the containment reference list '<em>Supported Platforms</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getSupportedPlatforms()
	 * @see #getMComponent()
	 * @generated
	 */
	EReference getMComponent_SupportedPlatforms();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getInternalComponents <em>InternalComponents</em>}'.
	 * @return the meta object for the containment reference list '<em>InternalComponents</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getInternalComponents()
	 * @see #getMComponent()
	 * @generated
	 */
	EReference getMComponent_InternalComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getConnections <em>Connections</em>}'.
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent#getConnections()
	 * @see #getMComponent()
	 * @generated
	 */
	EReference getMComponent_Connections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent <em>MAbstractComponent</em>}'.
	 * @return the meta object for class '<em>MAbstractComponent</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent
	 * @generated
	 */
	EClass getMAbstractComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getAttributeValueAssignments()
	 * @see #getMAbstractComponent()
	 * @generated
	 */
	EReference getMAbstractComponent_AttributeValueAssignments();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getDomain <em>Domain</em>}'.
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getDomain()
	 * @see #getMAbstractComponent()
	 * @generated
	 */
	EReference getMAbstractComponent_Domain();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getType <em>Type</em>}'.
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getType()
	 * @see #getMAbstractComponent()
	 * @generated
	 */
	EReference getMAbstractComponent_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getAttributes <em>Attributes</em>}'.
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getAttributes()
	 * @see #getMAbstractComponent()
	 * @generated
	 */
	EReference getMAbstractComponent_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getInherits()
	 * @see #getMAbstractComponent()
	 * @generated
	 */
	EReference getMAbstractComponent_Inherits();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getExternalPorts <em>ExternalPorts</em>}'.
	 * @return the meta object for the containment reference list '<em>ExternalPorts</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent#getExternalPorts()
	 * @see #getMAbstractComponent()
	 * @generated
	 */
	EReference getMAbstractComponent_ExternalPorts();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform <em>MComponent Supported Platform</em>}'.
	 * @return the meta object for class '<em>MComponent Supported Platform</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform
	 * @generated
	 */
	EClass getMComponentSupportedPlatform();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getOsapi <em>OSAPI</em>}'.
	 * @return the meta object for the reference '<em>OSAPI</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getOsapi()
	 * @see #getMComponentSupportedPlatform()
	 * @generated
	 */
	EReference getMComponentSupportedPlatform_Osapi();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getOs <em>OS</em>}'.
	 * @return the meta object for the reference '<em>OS</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getOs()
	 * @see #getMComponentSupportedPlatform()
	 * @generated
	 */
	EReference getMComponentSupportedPlatform_Os();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getArchitecture <em>Architecture</em>}'.
	 * @return the meta object for the reference '<em>Architecture</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getArchitecture()
	 * @see #getMComponentSupportedPlatform()
	 * @generated
	 */
	EReference getMComponentSupportedPlatform_Architecture();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getCompiler <em>Compiler</em>}'.
	 * @return the meta object for the reference '<em>Compiler</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getCompiler()
	 * @see #getMComponentSupportedPlatform()
	 * @generated
	 */
	EReference getMComponentSupportedPlatform_Compiler();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getMicroprocessor <em>Microprocessor</em>}'.
	 * @return the meta object for the reference '<em>Microprocessor</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getMicroprocessor()
	 * @see #getMComponentSupportedPlatform()
	 * @generated
	 */
	EReference getMComponentSupportedPlatform_Microprocessor();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getBoard <em>Board</em>}'.
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getBoard()
	 * @see #getMComponentSupportedPlatform()
	 * @generated
	 */
	EReference getMComponentSupportedPlatform_Board();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getRequires <em>Requires</em>}'.
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getRequires()
	 * @see #getMComponentSupportedPlatform()
	 * @generated
	 */
	EReference getMComponentSupportedPlatform_Requires();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getLanguages <em>Languages</em>}'.
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getLanguages()
	 * @see #getMComponentSupportedPlatform()
	 * @generated
	 */
	EReference getMComponentSupportedPlatform_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getAttributeValueAssignments()
	 * @see #getMComponentSupportedPlatform()
	 * @generated
	 */
	EReference getMComponentSupportedPlatform_AttributeValueAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getInternalComponents <em>InternalComponents</em>}'.
	 * @return the meta object for the containment reference list '<em>InternalComponents</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getInternalComponents()
	 * @see #getMComponentSupportedPlatform()
	 * @generated
	 */
	EReference getMComponentSupportedPlatform_InternalComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getConnections <em>Connections</em>}'.
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getConnections()
	 * @see #getMComponentSupportedPlatform()
	 * @generated
	 */
	EReference getMComponentSupportedPlatform_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getAttributes <em>Attributes</em>}'.
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getAttributes()
	 * @see #getMComponentSupportedPlatform()
	 * @generated
	 */
	EReference getMComponentSupportedPlatform_Attributes();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance <em>MInternalComponentInstance</em>}'.
	 * @return the meta object for class '<em>MInternalComponentInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance
	 * @generated
	 */
	EClass getMInternalComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance#getComponent <em>Component</em>}'.
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance#getComponent()
	 * @see #getMInternalComponentInstance()
	 * @generated
	 */
	EReference getMInternalComponentInstance_Component();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance#isIsSingleton <em>IsSingleton</em>}'.
	 * @return the meta object for the attribute '<em>IsSingleton</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance#isIsSingleton()
	 * @see #getMInternalComponentInstance()
	 * @generated
	 */
	EAttribute getMInternalComponentInstance_IsSingleton();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance#getAttributeValueAssignments()
	 * @see #getMInternalComponentInstance()
	 * @generated
	 */
	EReference getMInternalComponentInstance_AttributeValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MPort <em>MPort</em>}'.
	 * @return the meta object for class '<em>MPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MPort
	 * @generated
	 */
	EClass getMPort();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MPort#getType <em>Type</em>}'.
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MPort#getType()
	 * @see #getMPort()
	 * @generated
	 */
	EReference getMPort_Type();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MPort#getInterface <em>Interface</em>}'.
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MPort#getInterface()
	 * @see #getMPort()
	 * @generated
	 */
	EReference getMPort_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MPort#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MPort#getAttributeValueAssignments()
	 * @see #getMPort()
	 * @generated
	 */
	EReference getMPort_AttributeValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort <em>MServerPort</em>}'.
	 * @return the meta object for class '<em>MServerPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort
	 * @generated
	 */
	EClass getMServerPort();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort <em>MClientPort</em>}'.
	 * @return the meta object for class '<em>MClientPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort
	 * @generated
	 */
	EClass getMClientPort();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalConnection <em>MInternalConnection</em>}'.
	 * @return the meta object for class '<em>MInternalConnection</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalConnection
	 * @generated
	 */
	EClass getMInternalConnection();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection <em>MInternalComponentConnection</em>}'.
	 * @return the meta object for class '<em>MInternalComponentConnection</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection
	 * @generated
	 */
	EClass getMInternalComponentConnection();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getClientInstance <em>ClientInstance</em>}'.
	 * @return the meta object for the reference '<em>ClientInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getClientInstance()
	 * @see #getMInternalComponentConnection()
	 * @generated
	 */
	EReference getMInternalComponentConnection_ClientInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getClientPort <em>ClientPort</em>}'.
	 * @return the meta object for the reference '<em>ClientPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getClientPort()
	 * @see #getMInternalComponentConnection()
	 * @generated
	 */
	EReference getMInternalComponentConnection_ClientPort();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getServerInstance <em>ServerInstance</em>}'.
	 * @return the meta object for the reference '<em>ServerInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getServerInstance()
	 * @see #getMInternalComponentConnection()
	 * @generated
	 */
	EReference getMInternalComponentConnection_ServerInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getServerPort <em>ServerPort</em>}'.
	 * @return the meta object for the reference '<em>ServerPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getServerPort()
	 * @see #getMInternalComponentConnection()
	 * @generated
	 */
	EReference getMInternalComponentConnection_ServerPort();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getConnector <em>Connector</em>}'.
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getConnector()
	 * @see #getMInternalComponentConnection()
	 * @generated
	 */
	EReference getMInternalComponentConnection_Connector();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getIfaceMapping <em>IfaceMapping</em>}'.
	 * @return the meta object for the reference '<em>IfaceMapping</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getIfaceMapping()
	 * @see #getMInternalComponentConnection()
	 * @generated
	 */
	EReference getMInternalComponentConnection_IfaceMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection#getAttributeValueAssignments()
	 * @see #getMInternalComponentConnection()
	 * @generated
	 */
	EReference getMInternalComponentConnection_AttributeValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch <em>MInternalComponentPlatformSwitch</em>}'.
	 * @return the meta object for class '<em>MInternalComponentPlatformSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch
	 * @generated
	 */
	EClass getMInternalComponentPlatformSwitch();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch#getClientInstance <em>ClientInstance</em>}'.
	 * @return the meta object for the reference '<em>ClientInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch#getClientInstance()
	 * @see #getMInternalComponentPlatformSwitch()
	 * @generated
	 */
	EReference getMInternalComponentPlatformSwitch_ClientInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch#getClientPort <em>ClientPort</em>}'.
	 * @return the meta object for the reference '<em>ClientPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch#getClientPort()
	 * @see #getMInternalComponentPlatformSwitch()
	 * @generated
	 */
	EReference getMInternalComponentPlatformSwitch_ClientPort();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch#getCases <em>Cases</em>}'.
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch#getCases()
	 * @see #getMInternalComponentPlatformSwitch()
	 * @generated
	 */
	EReference getMInternalComponentPlatformSwitch_Cases();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase <em>MInternalComponentPlatformSwitchCase</em>}'.
	 * @return the meta object for class '<em>MInternalComponentPlatformSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase
	 * @generated
	 */
	EClass getMInternalComponentPlatformSwitchCase();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getPlatform <em>Platform</em>}'.
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getPlatform()
	 * @see #getMInternalComponentPlatformSwitchCase()
	 * @generated
	 */
	EReference getMInternalComponentPlatformSwitchCase_Platform();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getServerInstance <em>ServerInstance</em>}'.
	 * @return the meta object for the reference '<em>ServerInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getServerInstance()
	 * @see #getMInternalComponentPlatformSwitchCase()
	 * @generated
	 */
	EReference getMInternalComponentPlatformSwitchCase_ServerInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getServerPort <em>ServerPort</em>}'.
	 * @return the meta object for the reference '<em>ServerPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getServerPort()
	 * @see #getMInternalComponentPlatformSwitchCase()
	 * @generated
	 */
	EReference getMInternalComponentPlatformSwitchCase_ServerPort();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getConnector <em>Connector</em>}'.
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getConnector()
	 * @see #getMInternalComponentPlatformSwitchCase()
	 * @generated
	 */
	EReference getMInternalComponentPlatformSwitchCase_Connector();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getIfaceMapping <em>IfaceMapping</em>}'.
	 * @return the meta object for the reference '<em>IfaceMapping</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getIfaceMapping()
	 * @see #getMInternalComponentPlatformSwitchCase()
	 * @generated
	 */
	EReference getMInternalComponentPlatformSwitchCase_IfaceMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase#getAttributeValueAssignments()
	 * @see #getMInternalComponentPlatformSwitchCase()
	 * @generated
	 */
	EReference getMInternalComponentPlatformSwitchCase_AttributeValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageFile <em>MMCLEVCMPPackageFile</em>}'.
	 * @return the meta object for class '<em>MMCLEVCMPPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageFile
	 * @generated
	 */
	EClass getMMCLEVCMPPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageElement <em>MMCLEVCMPPackageElement</em>}'.
	 * @return the meta object for class '<em>MMCLEVCMPPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageElement
	 * @generated
	 */
	EClass getMMCLEVCMPPackageElement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitch <em>MParameterCSPSwitch</em>}'.
	 * @return the meta object for class '<em>MParameterCSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitch
	 * @generated
	 */
	EClass getMParameterCSPSwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitch#getCases <em>Cases</em>}'.
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitch#getCases()
	 * @see #getMParameterCSPSwitch()
	 * @generated
	 */
	EReference getMParameterCSPSwitch_Cases();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitchCase <em>MParameterCSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MParameterCSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitchCase
	 * @generated
	 */
	EClass getMParameterCSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitchCase#getDefaultValue <em>Default Value</em>}'.
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitchCase#getDefaultValue()
	 * @see #getMParameterCSPSwitchCase()
	 * @generated
	 */
	EReference getMParameterCSPSwitchCase_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitchCase#getPlatform <em>Platform</em>}'.
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitchCase#getPlatform()
	 * @see #getMParameterCSPSwitchCase()
	 * @generated
	 */
	EReference getMParameterCSPSwitchCase_Platform();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MBooleanParamCSPSwitch <em>MBooleanParamCSPSwitch</em>}'.
	 * @return the meta object for class '<em>MBooleanParamCSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MBooleanParamCSPSwitch
	 * @generated
	 */
	EClass getMBooleanParamCSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MBooleanParamCSPSwitchCase <em>MBooleanParamCSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MBooleanParamCSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MBooleanParamCSPSwitchCase
	 * @generated
	 */
	EClass getMBooleanParamCSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitch <em>MStringParamCSPSwitch</em>}'.
	 * @return the meta object for class '<em>MStringParamCSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitch
	 * @generated
	 */
	EClass getMStringParamCSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitchCase <em>MStringParamCSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MStringParamCSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitchCase
	 * @generated
	 */
	EClass getMStringParamCSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitch <em>MIntegerParamCSPSwitch</em>}'.
	 * @return the meta object for class '<em>MIntegerParamCSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitch
	 * @generated
	 */
	EClass getMIntegerParamCSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitchCase <em>MIntegerParamCSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MIntegerParamCSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitchCase
	 * @generated
	 */
	EClass getMIntegerParamCSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitchCase#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitchCase#getRange()
	 * @see #getMIntegerParamCSPSwitchCase()
	 * @generated
	 */
	EReference getMIntegerParamCSPSwitchCase_Range();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MEnumParamCSPSwitch <em>MEnumParamCSPSwitch</em>}'.
	 * @return the meta object for class '<em>MEnumParamCSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MEnumParamCSPSwitch
	 * @generated
	 */
	EClass getMEnumParamCSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MEnumParamCSPSwitchCase <em>MEnumParamCSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MEnumParamCSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MEnumParamCSPSwitchCase
	 * @generated
	 */
	EClass getMEnumParamCSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitch <em>MRealParamCSPSwitch</em>}'.
	 * @return the meta object for class '<em>MRealParamCSPSwitch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitch
	 * @generated
	 */
	EClass getMRealParamCSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitchCase <em>MRealParamCSPSwitchCase</em>}'.
	 * @return the meta object for class '<em>MRealParamCSPSwitchCase</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitchCase
	 * @generated
	 */
	EClass getMRealParamCSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitchCase#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitchCase#getRange()
	 * @see #getMRealParamCSPSwitchCase()
	 * @generated
	 */
	EReference getMRealParamCSPSwitchCase_Range();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mclevcmpFactory getmclevcmpFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl <em>MComponent</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMComponent()
		 * @generated
		 */
		EClass MCOMPONENT = eINSTANCE.getMComponent();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT__REQUIRES = eINSTANCE.getMComponent_Requires();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT__LANGUAGES = eINSTANCE.getMComponent_Languages();

		/**
		 * The meta object literal for the '<em><b>InternalPorts</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT__INTERNAL_PORTS = eINSTANCE.getMComponent_InternalPorts();

		/**
		 * The meta object literal for the '<em><b>Supported Platforms</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT__SUPPORTED_PLATFORMS = eINSTANCE.getMComponent_SupportedPlatforms();

		/**
		 * The meta object literal for the '<em><b>InternalComponents</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT__INTERNAL_COMPONENTS = eINSTANCE.getMComponent_InternalComponents();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT__CONNECTIONS = eINSTANCE.getMComponent_Connections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MAbstractComponentImpl <em>MAbstractComponent</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MAbstractComponentImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMAbstractComponent()
		 * @generated
		 */
		EClass MABSTRACT_COMPONENT = eINSTANCE.getMAbstractComponent();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMAbstractComponent_AttributeValueAssignments();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * @generated
		 */
		EReference MABSTRACT_COMPONENT__DOMAIN = eINSTANCE.getMAbstractComponent_Domain();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * @generated
		 */
		EReference MABSTRACT_COMPONENT__TYPE = eINSTANCE.getMAbstractComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MABSTRACT_COMPONENT__ATTRIBUTES = eINSTANCE.getMAbstractComponent_Attributes();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MABSTRACT_COMPONENT__INHERITS = eINSTANCE.getMAbstractComponent_Inherits();

		/**
		 * The meta object literal for the '<em><b>ExternalPorts</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MABSTRACT_COMPONENT__EXTERNAL_PORTS = eINSTANCE.getMAbstractComponent_ExternalPorts();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentSupportedPlatformImpl <em>MComponent Supported Platform</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MComponentSupportedPlatformImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMComponentSupportedPlatform()
		 * @generated
		 */
		EClass MCOMPONENT_SUPPORTED_PLATFORM = eINSTANCE.getMComponentSupportedPlatform();

		/**
		 * The meta object literal for the '<em><b>OSAPI</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMPONENT_SUPPORTED_PLATFORM__OSAPI = eINSTANCE.getMComponentSupportedPlatform_Osapi();

		/**
		 * The meta object literal for the '<em><b>OS</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMPONENT_SUPPORTED_PLATFORM__OS = eINSTANCE.getMComponentSupportedPlatform_Os();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMPONENT_SUPPORTED_PLATFORM__ARCHITECTURE = eINSTANCE.getMComponentSupportedPlatform_Architecture();

		/**
		 * The meta object literal for the '<em><b>Compiler</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMPONENT_SUPPORTED_PLATFORM__COMPILER = eINSTANCE.getMComponentSupportedPlatform_Compiler();

		/**
		 * The meta object literal for the '<em><b>Microprocessor</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMPONENT_SUPPORTED_PLATFORM__MICROPROCESSOR = eINSTANCE.getMComponentSupportedPlatform_Microprocessor();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMPONENT_SUPPORTED_PLATFORM__BOARD = eINSTANCE.getMComponentSupportedPlatform_Board();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT_SUPPORTED_PLATFORM__REQUIRES = eINSTANCE.getMComponentSupportedPlatform_Requires();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT_SUPPORTED_PLATFORM__LANGUAGES = eINSTANCE.getMComponentSupportedPlatform_Languages();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMComponentSupportedPlatform_AttributeValueAssignments();

		/**
		 * The meta object literal for the '<em><b>InternalComponents</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT_SUPPORTED_PLATFORM__INTERNAL_COMPONENTS = eINSTANCE.getMComponentSupportedPlatform_InternalComponents();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT_SUPPORTED_PLATFORM__CONNECTIONS = eINSTANCE.getMComponentSupportedPlatform_Connections();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES = eINSTANCE.getMComponentSupportedPlatform_Attributes();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentInstanceImpl <em>MInternalComponentInstance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMInternalComponentInstance()
		 * @generated
		 */
		EClass MINTERNAL_COMPONENT_INSTANCE = eINSTANCE.getMInternalComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_INSTANCE__COMPONENT = eINSTANCE.getMInternalComponentInstance_Component();

		/**
		 * The meta object literal for the '<em><b>IsSingleton</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MINTERNAL_COMPONENT_INSTANCE__IS_SINGLETON = eINSTANCE.getMInternalComponentInstance_IsSingleton();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMInternalComponentInstance_AttributeValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MPortImpl <em>MPort</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MPortImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMPort()
		 * @generated
		 */
		EClass MPORT = eINSTANCE.getMPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * @generated
		 */
		EReference MPORT__TYPE = eINSTANCE.getMPort_Type();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * @generated
		 */
		EReference MPORT__INTERFACE = eINSTANCE.getMPort_Interface();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MPORT__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMPort_AttributeValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MServerPortImpl <em>MServerPort</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MServerPortImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMServerPort()
		 * @generated
		 */
		EClass MSERVER_PORT = eINSTANCE.getMServerPort();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MClientPortImpl <em>MClientPort</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MClientPortImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMClientPort()
		 * @generated
		 */
		EClass MCLIENT_PORT = eINSTANCE.getMClientPort();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalConnectionImpl <em>MInternalConnection</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalConnectionImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMInternalConnection()
		 * @generated
		 */
		EClass MINTERNAL_CONNECTION = eINSTANCE.getMInternalConnection();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentConnectionImpl <em>MInternalComponentConnection</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentConnectionImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMInternalComponentConnection()
		 * @generated
		 */
		EClass MINTERNAL_COMPONENT_CONNECTION = eINSTANCE.getMInternalComponentConnection();

		/**
		 * The meta object literal for the '<em><b>ClientInstance</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_CONNECTION__CLIENT_INSTANCE = eINSTANCE.getMInternalComponentConnection_ClientInstance();

		/**
		 * The meta object literal for the '<em><b>ClientPort</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_CONNECTION__CLIENT_PORT = eINSTANCE.getMInternalComponentConnection_ClientPort();

		/**
		 * The meta object literal for the '<em><b>ServerInstance</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_CONNECTION__SERVER_INSTANCE = eINSTANCE.getMInternalComponentConnection_ServerInstance();

		/**
		 * The meta object literal for the '<em><b>ServerPort</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_CONNECTION__SERVER_PORT = eINSTANCE.getMInternalComponentConnection_ServerPort();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_CONNECTION__CONNECTOR = eINSTANCE.getMInternalComponentConnection_Connector();

		/**
		 * The meta object literal for the '<em><b>IfaceMapping</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_CONNECTION__IFACE_MAPPING = eINSTANCE.getMInternalComponentConnection_IfaceMapping();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMInternalComponentConnection_AttributeValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchImpl <em>MInternalComponentPlatformSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMInternalComponentPlatformSwitch()
		 * @generated
		 */
		EClass MINTERNAL_COMPONENT_PLATFORM_SWITCH = eINSTANCE.getMInternalComponentPlatformSwitch();

		/**
		 * The meta object literal for the '<em><b>ClientInstance</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_INSTANCE = eINSTANCE.getMInternalComponentPlatformSwitch_ClientInstance();

		/**
		 * The meta object literal for the '<em><b>ClientPort</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_PORT = eINSTANCE.getMInternalComponentPlatformSwitch_ClientPort();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_PLATFORM_SWITCH__CASES = eINSTANCE.getMInternalComponentPlatformSwitch_Cases();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchCaseImpl <em>MInternalComponentPlatformSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MInternalComponentPlatformSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMInternalComponentPlatformSwitchCase()
		 * @generated
		 */
		EClass MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE = eINSTANCE.getMInternalComponentPlatformSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__PLATFORM = eINSTANCE.getMInternalComponentPlatformSwitchCase_Platform();

		/**
		 * The meta object literal for the '<em><b>ServerInstance</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_INSTANCE = eINSTANCE.getMInternalComponentPlatformSwitchCase_ServerInstance();

		/**
		 * The meta object literal for the '<em><b>ServerPort</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_PORT = eINSTANCE.getMInternalComponentPlatformSwitchCase_ServerPort();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__CONNECTOR = eINSTANCE.getMInternalComponentPlatformSwitchCase_Connector();

		/**
		 * The meta object literal for the '<em><b>IfaceMapping</b></em>' reference feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__IFACE_MAPPING = eINSTANCE.getMInternalComponentPlatformSwitchCase_IfaceMapping();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMInternalComponentPlatformSwitchCase_AttributeValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MMCLEVCMPPackageFileImpl <em>MMCLEVCMPPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MMCLEVCMPPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMMCLEVCMPPackageFile()
		 * @generated
		 */
		EClass MMCLEVCMP_PACKAGE_FILE = eINSTANCE.getMMCLEVCMPPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MMCLEVCMPPackageElementImpl <em>MMCLEVCMPPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MMCLEVCMPPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMMCLEVCMPPackageElement()
		 * @generated
		 */
		EClass MMCLEVCMP_PACKAGE_ELEMENT = eINSTANCE.getMMCLEVCMPPackageElement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MParameterCSPSwitchImpl <em>MParameterCSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MParameterCSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMParameterCSPSwitch()
		 * @generated
		 */
		EClass MPARAMETER_CSP_SWITCH = eINSTANCE.getMParameterCSPSwitch();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MPARAMETER_CSP_SWITCH__CASES = eINSTANCE.getMParameterCSPSwitch_Cases();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MParameterCSPSwitchCaseImpl <em>MParameterCSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MParameterCSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMParameterCSPSwitchCase()
		 * @generated
		 */
		EClass MPARAMETER_CSP_SWITCH_CASE = eINSTANCE.getMParameterCSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_CSP_SWITCH_CASE__DEFAULT_VALUE = eINSTANCE.getMParameterCSPSwitchCase_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * @generated
		 */
		EReference MPARAMETER_CSP_SWITCH_CASE__PLATFORM = eINSTANCE.getMParameterCSPSwitchCase_Platform();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MBooleanParamCSPSwitchImpl <em>MBooleanParamCSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MBooleanParamCSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMBooleanParamCSPSwitch()
		 * @generated
		 */
		EClass MBOOLEAN_PARAM_CSP_SWITCH = eINSTANCE.getMBooleanParamCSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MBooleanParamCSPSwitchCaseImpl <em>MBooleanParamCSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MBooleanParamCSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMBooleanParamCSPSwitchCase()
		 * @generated
		 */
		EClass MBOOLEAN_PARAM_CSP_SWITCH_CASE = eINSTANCE.getMBooleanParamCSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MStringParamCSPSwitchImpl <em>MStringParamCSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MStringParamCSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMStringParamCSPSwitch()
		 * @generated
		 */
		EClass MSTRING_PARAM_CSP_SWITCH = eINSTANCE.getMStringParamCSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MStringParamCSPSwitchCaseImpl <em>MStringParamCSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MStringParamCSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMStringParamCSPSwitchCase()
		 * @generated
		 */
		EClass MSTRING_PARAM_CSP_SWITCH_CASE = eINSTANCE.getMStringParamCSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MIntegerParamCSPSwitchImpl <em>MIntegerParamCSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MIntegerParamCSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMIntegerParamCSPSwitch()
		 * @generated
		 */
		EClass MINTEGER_PARAM_CSP_SWITCH = eINSTANCE.getMIntegerParamCSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MIntegerParamCSPSwitchCaseImpl <em>MIntegerParamCSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MIntegerParamCSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMIntegerParamCSPSwitchCase()
		 * @generated
		 */
		EClass MINTEGER_PARAM_CSP_SWITCH_CASE = eINSTANCE.getMIntegerParamCSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MINTEGER_PARAM_CSP_SWITCH_CASE__RANGE = eINSTANCE.getMIntegerParamCSPSwitchCase_Range();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MEnumParamCSPSwitchImpl <em>MEnumParamCSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MEnumParamCSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMEnumParamCSPSwitch()
		 * @generated
		 */
		EClass MENUM_PARAM_CSP_SWITCH = eINSTANCE.getMEnumParamCSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MEnumParamCSPSwitchCaseImpl <em>MEnumParamCSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MEnumParamCSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMEnumParamCSPSwitchCase()
		 * @generated
		 */
		EClass MENUM_PARAM_CSP_SWITCH_CASE = eINSTANCE.getMEnumParamCSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MRealParamCSPSwitchImpl <em>MRealParamCSPSwitch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MRealParamCSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMRealParamCSPSwitch()
		 * @generated
		 */
		EClass MREAL_PARAM_CSP_SWITCH = eINSTANCE.getMRealParamCSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MRealParamCSPSwitchCaseImpl <em>MRealParamCSPSwitchCase</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.MRealParamCSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.impl.mclevcmpPackageImpl#getMRealParamCSPSwitchCase()
		 * @generated
		 */
		EClass MREAL_PARAM_CSP_SWITCH_CASE = eINSTANCE.getMRealParamCSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MREAL_PARAM_CSP_SWITCH_CASE__RANGE = eINSTANCE.getMRealParamCSPSwitchCase_Range();

	}

}