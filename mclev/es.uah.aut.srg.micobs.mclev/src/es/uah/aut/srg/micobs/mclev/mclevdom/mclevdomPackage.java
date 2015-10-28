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
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomFactory
 * @model kind="package"
 * @generated
 */
public interface mclevdomPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mclevdom";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mclev/mclevdom";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mclev";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mclevdomPackage eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MMCLEVDOMPackageElementImpl <em>MMCLEVDOM Package Element</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MMCLEVDOMPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMMCLEVDOMPackageElement()
	 * @generated
	 */
	int MMCLEVDOM_PACKAGE_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVDOM_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVDOM_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVDOM_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVDOM Package Element</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVDOM_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MDomainImpl <em>MDomain</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MDomainImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMDomain()
	 * @generated
	 */
	int MDOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDOMAIN__VERSION = MMCLEVDOM_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDOMAIN__NAME = MMCLEVDOM_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDOMAIN__URI = MMCLEVDOM_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Allows Singleton</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MDOMAIN__ALLOWS_SINGLETON = MMCLEVDOM_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDOMAIN__ATTRIBUTES = MMCLEVDOM_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Types</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDOMAIN__PORT_TYPES = MMCLEVDOM_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDOMAIN__INTERFACE_TYPES = MMCLEVDOM_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MDOMAIN__CONNECTORS = MMCLEVDOM_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MDomain</em>' class.
	 * @generated
	 * @ordered
	 */
	int MDOMAIN_FEATURE_COUNT = MMCLEVDOM_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODomainImpl <em>MAO Domain</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODomainImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMAODomain()
	 * @generated
	 */
	int MAO_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN__VERSION = MDOMAIN__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN__NAME = MDOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN__URI = MDOMAIN__URI;

	/**
	 * The feature id for the '<em><b>Allows Singleton</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN__ALLOWS_SINGLETON = MDOMAIN__ALLOWS_SINGLETON;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN__ATTRIBUTES = MDOMAIN__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Types</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN__PORT_TYPES = MDOMAIN__PORT_TYPES;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN__INTERFACE_TYPES = MDOMAIN__INTERFACE_TYPES;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN__CONNECTORS = MDOMAIN__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Output IO Domains</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN__OUTPUT_IO_DOMAINS = MDOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN__INHERITS = MDOMAIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Type Instances</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN__COMPONENT_TYPE_INSTANCES = MDOMAIN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Types</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN__COMPONENT_TYPES = MDOMAIN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MAO Domain</em>' class.
	 * @generated
	 * @ordered
	 */
	int MAO_DOMAIN_FEATURE_COUNT = MDOMAIN_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainImpl <em>MIO Domain</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIODomain()
	 * @generated
	 */
	int MIO_DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__VERSION = MDOMAIN__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__NAME = MDOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__URI = MDOMAIN__URI;

	/**
	 * The feature id for the '<em><b>Allows Singleton</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__ALLOWS_SINGLETON = MDOMAIN__ALLOWS_SINGLETON;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__ATTRIBUTES = MDOMAIN__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Types</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__PORT_TYPES = MDOMAIN__PORT_TYPES;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__INTERFACE_TYPES = MDOMAIN__INTERFACE_TYPES;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__CONNECTORS = MDOMAIN__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__INHERITS = MDOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__LANGUAGES = MDOMAIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__REQUIRES = MDOMAIN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exchange Models</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__EXCHANGE_MODELS = MDOMAIN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supported Platforms</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__SUPPORTED_PLATFORMS = MDOMAIN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Component Types</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__COMPONENT_TYPES = MDOMAIN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Component Type Instances</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN__COMPONENT_TYPE_INSTANCES = MDOMAIN_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>MIO Domain</em>' class.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_FEATURE_COUNT = MDOMAIN_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MComponentTypeImpl <em>MComponent Type</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MComponentTypeImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMComponentType()
	 * @generated
	 */
	int MCOMPONENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_TYPE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_TYPE__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_TYPE__ATTRIBUTES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Type Instances</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_TYPE__PORT_TYPE_INSTANCES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MComponent Type</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_TYPE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODAbstractComponentTypeImpl <em>MIOD Abstract Component Type</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODAbstractComponentTypeImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIODAbstractComponentType()
	 * @generated
	 */
	int MIOD_ABSTRACT_COMPONENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MIOD_ABSTRACT_COMPONENT_TYPE__NAME = MCOMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MIOD_ABSTRACT_COMPONENT_TYPE__DESCRIPTION = MCOMPONENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIOD_ABSTRACT_COMPONENT_TYPE__ATTRIBUTES = MCOMPONENT_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Type Instances</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIOD_ABSTRACT_COMPONENT_TYPE__PORT_TYPE_INSTANCES = MCOMPONENT_TYPE__PORT_TYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MIOD_ABSTRACT_COMPONENT_TYPE__INHERITS = MCOMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Type Instances</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIOD_ABSTRACT_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES = MCOMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MIOD Abstract Component Type</em>' class.
	 * @generated
	 * @ordered
	 */
	int MIOD_ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT = MCOMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODComponentTypeImpl <em>MIOD Component Type</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODComponentTypeImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIODComponentType()
	 * @generated
	 */
	int MIOD_COMPONENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MIOD_COMPONENT_TYPE__NAME = MIOD_ABSTRACT_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MIOD_COMPONENT_TYPE__DESCRIPTION = MIOD_ABSTRACT_COMPONENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIOD_COMPONENT_TYPE__ATTRIBUTES = MIOD_ABSTRACT_COMPONENT_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Type Instances</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIOD_COMPONENT_TYPE__PORT_TYPE_INSTANCES = MIOD_ABSTRACT_COMPONENT_TYPE__PORT_TYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MIOD_COMPONENT_TYPE__INHERITS = MIOD_ABSTRACT_COMPONENT_TYPE__INHERITS;

	/**
	 * The feature id for the '<em><b>Component Type Instances</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIOD_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES = MIOD_ABSTRACT_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MIOD_COMPONENT_TYPE__LANGUAGE = MIOD_ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MIOD Component Type</em>' class.
	 * @generated
	 * @ordered
	 */
	int MIOD_COMPONENT_TYPE_FEATURE_COUNT = MIOD_ABSTRACT_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODComponentTypeImpl <em>MAOD Component Type</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODComponentTypeImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMAODComponentType()
	 * @generated
	 */
	int MAOD_COMPONENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MAOD_COMPONENT_TYPE__NAME = MCOMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MAOD_COMPONENT_TYPE__DESCRIPTION = MCOMPONENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MAOD_COMPONENT_TYPE__ATTRIBUTES = MCOMPONENT_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Port Type Instances</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MAOD_COMPONENT_TYPE__PORT_TYPE_INSTANCES = MCOMPONENT_TYPE__PORT_TYPE_INSTANCES;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MAOD_COMPONENT_TYPE__INHERITS = MCOMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Type Instances</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MAOD_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES = MCOMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MAOD Component Type</em>' class.
	 * @generated
	 * @ordered
	 */
	int MAOD_COMPONENT_TYPE_FEATURE_COUNT = MCOMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MComponentTypeInstanceImpl <em>MComponent Type Instance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MComponentTypeInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMComponentTypeInstance()
	 * @generated
	 */
	int MCOMPONENT_TYPE_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_TYPE_INSTANCE__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_TYPE_INSTANCE__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>MComponent Type Instance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMPONENT_TYPE_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODComponentTypeInstanceImpl <em>MIOD Component Type Instance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODComponentTypeInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIODComponentTypeInstance()
	 * @generated
	 */
	int MIOD_COMPONENT_TYPE_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MIOD_COMPONENT_TYPE_INSTANCE__LOWER_BOUND = MCOMPONENT_TYPE_INSTANCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MIOD_COMPONENT_TYPE_INSTANCE__UPPER_BOUND = MCOMPONENT_TYPE_INSTANCE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MIOD_COMPONENT_TYPE_INSTANCE__COMPONENT_TYPE = MCOMPONENT_TYPE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MIOD Component Type Instance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MIOD_COMPONENT_TYPE_INSTANCE_FEATURE_COUNT = MCOMPONENT_TYPE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODComponentTypeInstanceImpl <em>MAOD Component Type Instance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODComponentTypeInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMAODComponentTypeInstance()
	 * @generated
	 */
	int MAOD_COMPONENT_TYPE_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MAOD_COMPONENT_TYPE_INSTANCE__LOWER_BOUND = MCOMPONENT_TYPE_INSTANCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MAOD_COMPONENT_TYPE_INSTANCE__UPPER_BOUND = MCOMPONENT_TYPE_INSTANCE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MAOD_COMPONENT_TYPE_INSTANCE__COMPONENT_TYPE = MCOMPONENT_TYPE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MAOD Component Type Instance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MAOD_COMPONENT_TYPE_INSTANCE_FEATURE_COUNT = MCOMPONENT_TYPE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeInstanceImpl <em>MPort Type Instance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMPortTypeInstance()
	 * @generated
	 */
	int MPORT_TYPE_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPORT_TYPE_INSTANCE__PORT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPORT_TYPE_INSTANCE__LOWER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPORT_TYPE_INSTANCE__UPPER_BOUND = 2;

	/**
	 * The number of structural features of the '<em>MPort Type Instance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPORT_TYPE_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInternalPortTypeInstanceImpl <em>MInternal Port Type Instance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInternalPortTypeInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMInternalPortTypeInstance()
	 * @generated
	 */
	int MINTERNAL_PORT_TYPE_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_PORT_TYPE_INSTANCE__PORT_TYPE = MPORT_TYPE_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_PORT_TYPE_INSTANCE__LOWER_BOUND = MPORT_TYPE_INSTANCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_PORT_TYPE_INSTANCE__UPPER_BOUND = MPORT_TYPE_INSTANCE__UPPER_BOUND;

	/**
	 * The number of structural features of the '<em>MInternal Port Type Instance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_PORT_TYPE_INSTANCE_FEATURE_COUNT = MPORT_TYPE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInternalClientPortTypeInstanceImpl <em>MInternal Client Port Type Instance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInternalClientPortTypeInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMInternalClientPortTypeInstance()
	 * @generated
	 */
	int MINTERNAL_CLIENT_PORT_TYPE_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_CLIENT_PORT_TYPE_INSTANCE__PORT_TYPE = MINTERNAL_PORT_TYPE_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_CLIENT_PORT_TYPE_INSTANCE__LOWER_BOUND = MINTERNAL_PORT_TYPE_INSTANCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_CLIENT_PORT_TYPE_INSTANCE__UPPER_BOUND = MINTERNAL_PORT_TYPE_INSTANCE__UPPER_BOUND;

	/**
	 * The number of structural features of the '<em>MInternal Client Port Type Instance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_CLIENT_PORT_TYPE_INSTANCE_FEATURE_COUNT = MINTERNAL_PORT_TYPE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInternalServerPortTypeInstanceImpl <em>MInternal Server Port Type Instance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInternalServerPortTypeInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMInternalServerPortTypeInstance()
	 * @generated
	 */
	int MINTERNAL_SERVER_PORT_TYPE_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_SERVER_PORT_TYPE_INSTANCE__PORT_TYPE = MINTERNAL_PORT_TYPE_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_SERVER_PORT_TYPE_INSTANCE__LOWER_BOUND = MINTERNAL_PORT_TYPE_INSTANCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_SERVER_PORT_TYPE_INSTANCE__UPPER_BOUND = MINTERNAL_PORT_TYPE_INSTANCE__UPPER_BOUND;

	/**
	 * The number of structural features of the '<em>MInternal Server Port Type Instance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTERNAL_SERVER_PORT_TYPE_INSTANCE_FEATURE_COUNT = MINTERNAL_PORT_TYPE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExternalPortTypeInstanceImpl <em>MExternal Port Type Instance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExternalPortTypeInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMExternalPortTypeInstance()
	 * @generated
	 */
	int MEXTERNAL_PORT_TYPE_INSTANCE = 14;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MEXTERNAL_PORT_TYPE_INSTANCE__PORT_TYPE = MPORT_TYPE_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MEXTERNAL_PORT_TYPE_INSTANCE__LOWER_BOUND = MPORT_TYPE_INSTANCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MEXTERNAL_PORT_TYPE_INSTANCE__UPPER_BOUND = MPORT_TYPE_INSTANCE__UPPER_BOUND;

	/**
	 * The number of structural features of the '<em>MExternal Port Type Instance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MEXTERNAL_PORT_TYPE_INSTANCE_FEATURE_COUNT = MPORT_TYPE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExternalClientPortTypeInstanceImpl <em>MExternal Client Port Type Instance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExternalClientPortTypeInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMExternalClientPortTypeInstance()
	 * @generated
	 */
	int MEXTERNAL_CLIENT_PORT_TYPE_INSTANCE = 15;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MEXTERNAL_CLIENT_PORT_TYPE_INSTANCE__PORT_TYPE = MEXTERNAL_PORT_TYPE_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MEXTERNAL_CLIENT_PORT_TYPE_INSTANCE__LOWER_BOUND = MEXTERNAL_PORT_TYPE_INSTANCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MEXTERNAL_CLIENT_PORT_TYPE_INSTANCE__UPPER_BOUND = MEXTERNAL_PORT_TYPE_INSTANCE__UPPER_BOUND;

	/**
	 * The number of structural features of the '<em>MExternal Client Port Type Instance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MEXTERNAL_CLIENT_PORT_TYPE_INSTANCE_FEATURE_COUNT = MEXTERNAL_PORT_TYPE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExternalServerPortTypeInstanceImpl <em>MExternal Server Port Type Instance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExternalServerPortTypeInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMExternalServerPortTypeInstance()
	 * @generated
	 */
	int MEXTERNAL_SERVER_PORT_TYPE_INSTANCE = 16;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MEXTERNAL_SERVER_PORT_TYPE_INSTANCE__PORT_TYPE = MEXTERNAL_PORT_TYPE_INSTANCE__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MEXTERNAL_SERVER_PORT_TYPE_INSTANCE__LOWER_BOUND = MEXTERNAL_PORT_TYPE_INSTANCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MEXTERNAL_SERVER_PORT_TYPE_INSTANCE__UPPER_BOUND = MEXTERNAL_PORT_TYPE_INSTANCE__UPPER_BOUND;

	/**
	 * The number of structural features of the '<em>MExternal Server Port Type Instance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MEXTERNAL_SERVER_PORT_TYPE_INSTANCE_FEATURE_COUNT = MEXTERNAL_PORT_TYPE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MConnectorImpl <em>MConnector</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MConnectorImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMConnector()
	 * @generated
	 */
	int MCONNECTOR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCONNECTOR__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCONNECTOR__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCONNECTOR__INHERITS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCONNECTOR__ATTRIBUTES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client Port Types</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCONNECTOR__CLIENT_PORT_TYPES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Server Port Types</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCONNECTOR__SERVER_PORT_TYPES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exchange Model</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCONNECTOR__EXCHANGE_MODEL = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MConnector</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCONNECTOR_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeImpl <em>MPort Type</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMPortType()
	 * @generated
	 */
	int MPORT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPORT_TYPE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPORT_TYPE__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MPORT_TYPE__INHERITS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MPORT_TYPE__INTERFACE_TYPES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPORT_TYPE__ATTRIBUTES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Client Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPORT_TYPE__CLIENT_ATTRIBUTES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Server Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPORT_TYPE__SERVER_ATTRIBUTES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MPort Type</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPORT_TYPE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInterfaceTypeImpl <em>MInterface Type</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInterfaceTypeImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMInterfaceType()
	 * @generated
	 */
	int MINTERFACE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE_TYPE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE_TYPE__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE_TYPE__INHERITS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MInterface Type</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTERFACE_TYPE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExchangeModelImpl <em>MExchange Model</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExchangeModelImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMExchangeModel()
	 * @generated
	 */
	int MEXCHANGE_MODEL = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MEXCHANGE_MODEL__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MEXCHANGE_MODEL__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MEXCHANGE_MODEL__INTERFACE_TYPES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MEXCHANGE_MODEL__INHERITS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MExchange Model</em>' class.
	 * @generated
	 * @ordered
	 */
	int MEXCHANGE_MODEL_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MMCLEVDOMPackageFileImpl <em>MMCLEVDOM Package File</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MMCLEVDOMPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMMCLEVDOMPackageFile()
	 * @generated
	 */
	int MMCLEVDOM_PACKAGE_FILE = 21;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVDOM_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEVDOM_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVDOM_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMCLEVDOM Package File</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVDOM_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainSupportedPlatformImpl <em>MIO Domain Supported Platform</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainSupportedPlatformImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIODomainSupportedPlatform()
	 * @generated
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM__DESCRIPTION = commonPackage.MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Osapi</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM__OSAPI = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM__OS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM__ARCHITECTURE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compiler</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM__COMPILER = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Microprocessor</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM__MICROPROCESSOR = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM__BOARD = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM__ATTRIBUTES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM__REQUIRES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM__LANGUAGES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>MIO Domain Supported Platform</em>' class.
	 * @generated
	 * @ordered
	 */
	int MIO_DOMAIN_SUPPORTED_PLATFORM_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 9;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MParameterIODSPSwitchImpl <em>MParameter IODSP Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MParameterIODSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMParameterIODSPSwitch()
	 * @generated
	 */
	int MPARAMETER_IODSP_SWITCH = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_IODSP_SWITCH__NAME = commonPackage.MPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_IODSP_SWITCH__DESCRIPTION = commonPackage.MPARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_IODSP_SWITCH__CONSTANT = commonPackage.MPARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_IODSP_SWITCH__CASES = commonPackage.MPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameter IODSP Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_IODSP_SWITCH_FEATURE_COUNT = commonPackage.MPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MParameterIODSPSwitchCaseImpl <em>MParameter IODSP Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MParameterIODSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMParameterIODSPSwitchCase()
	 * @generated
	 */
	int MPARAMETER_IODSP_SWITCH_CASE = 25;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_IODSP_SWITCH_CASE__DEFAULT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_IODSP_SWITCH_CASE__PLATFORM = 1;

	/**
	 * The number of structural features of the '<em>MParameter IODSP Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_IODSP_SWITCH_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MBooleanParamIODSPSwitchImpl <em>MBoolean Param IODSP Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MBooleanParamIODSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMBooleanParamIODSPSwitch()
	 * @generated
	 */
	int MBOOLEAN_PARAM_IODSP_SWITCH = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_IODSP_SWITCH__NAME = commonPackage.MBOOLEAN_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_IODSP_SWITCH__DESCRIPTION = commonPackage.MBOOLEAN_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_IODSP_SWITCH__CONSTANT = commonPackage.MBOOLEAN_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_IODSP_SWITCH__CASES = commonPackage.MBOOLEAN_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MBoolean Param IODSP Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_IODSP_SWITCH_FEATURE_COUNT = commonPackage.MBOOLEAN_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MBooleanParamIODSPSwitchCaseImpl <em>MBoolean Param IODSP Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MBooleanParamIODSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMBooleanParamIODSPSwitchCase()
	 * @generated
	 */
	int MBOOLEAN_PARAM_IODSP_SWITCH_CASE = 27;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_IODSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_IODSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_IODSP_SWITCH_CASE__PLATFORM = MPARAMETER_IODSP_SWITCH_CASE__PLATFORM;

	/**
	 * The number of structural features of the '<em>MBoolean Param IODSP Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAM_IODSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_IODSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MStringParamIODSPSwitchImpl <em>MString Param IODSP Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MStringParamIODSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMStringParamIODSPSwitch()
	 * @generated
	 */
	int MSTRING_PARAM_IODSP_SWITCH = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_IODSP_SWITCH__NAME = commonPackage.MSTRING_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_IODSP_SWITCH__DESCRIPTION = commonPackage.MSTRING_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_IODSP_SWITCH__CONSTANT = commonPackage.MSTRING_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_IODSP_SWITCH__CASES = commonPackage.MSTRING_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MString Param IODSP Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_IODSP_SWITCH_FEATURE_COUNT = commonPackage.MSTRING_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MStringParamIODSPSwitchCaseImpl <em>MString Param IODSP Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MStringParamIODSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMStringParamIODSPSwitchCase()
	 * @generated
	 */
	int MSTRING_PARAM_IODSP_SWITCH_CASE = 29;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_IODSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_IODSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_IODSP_SWITCH_CASE__PLATFORM = MPARAMETER_IODSP_SWITCH_CASE__PLATFORM;

	/**
	 * The number of structural features of the '<em>MString Param IODSP Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAM_IODSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_IODSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIntegerParamIODSPSwitchImpl <em>MInteger Param IODSP Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIntegerParamIODSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIntegerParamIODSPSwitch()
	 * @generated
	 */
	int MINTEGER_PARAM_IODSP_SWITCH = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_IODSP_SWITCH__NAME = commonPackage.MINTEGER_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_IODSP_SWITCH__DESCRIPTION = commonPackage.MINTEGER_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_IODSP_SWITCH__CONSTANT = commonPackage.MINTEGER_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_IODSP_SWITCH__CASES = commonPackage.MINTEGER_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MInteger Param IODSP Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_IODSP_SWITCH_FEATURE_COUNT = commonPackage.MINTEGER_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIntegerParamIODSPSwitchCaseImpl <em>MInteger Param IODSP Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIntegerParamIODSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIntegerParamIODSPSwitchCase()
	 * @generated
	 */
	int MINTEGER_PARAM_IODSP_SWITCH_CASE = 31;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_IODSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_IODSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_IODSP_SWITCH_CASE__PLATFORM = MPARAMETER_IODSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_IODSP_SWITCH_CASE__RANGE = MPARAMETER_IODSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MInteger Param IODSP Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAM_IODSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_IODSP_SWITCH_CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MEnumParamIODSPSwitchImpl <em>MEnum Param IODSP Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MEnumParamIODSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMEnumParamIODSPSwitch()
	 * @generated
	 */
	int MENUM_PARAM_IODSP_SWITCH = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_IODSP_SWITCH__NAME = commonPackage.MENUM_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_IODSP_SWITCH__DESCRIPTION = commonPackage.MENUM_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_IODSP_SWITCH__CONSTANT = commonPackage.MENUM_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Enum Definition</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_IODSP_SWITCH__ENUM_DEFINITION = commonPackage.MENUM_PARAMETER__ENUM_DEFINITION;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_IODSP_SWITCH__CASES = commonPackage.MENUM_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MEnum Param IODSP Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_IODSP_SWITCH_FEATURE_COUNT = commonPackage.MENUM_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MEnumParamIODSPSwitchCaseImpl <em>MEnum Param IODSP Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MEnumParamIODSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMEnumParamIODSPSwitchCase()
	 * @generated
	 */
	int MENUM_PARAM_IODSP_SWITCH_CASE = 33;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_IODSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_IODSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_IODSP_SWITCH_CASE__PLATFORM = MPARAMETER_IODSP_SWITCH_CASE__PLATFORM;

	/**
	 * The number of structural features of the '<em>MEnum Param IODSP Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_IODSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_IODSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MRealParamIODSPSwitchImpl <em>MReal Param IODSP Switch</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MRealParamIODSPSwitchImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMRealParamIODSPSwitch()
	 * @generated
	 */
	int MREAL_PARAM_IODSP_SWITCH = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_IODSP_SWITCH__NAME = commonPackage.MREAL_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_IODSP_SWITCH__DESCRIPTION = commonPackage.MREAL_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_IODSP_SWITCH__CONSTANT = commonPackage.MREAL_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_IODSP_SWITCH__CASES = commonPackage.MREAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MReal Param IODSP Switch</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_IODSP_SWITCH_FEATURE_COUNT = commonPackage.MREAL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MRealParamIODSPSwitchCaseImpl <em>MReal Param IODSP Switch Case</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MRealParamIODSPSwitchCaseImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMRealParamIODSPSwitchCase()
	 * @generated
	 */
	int MREAL_PARAM_IODSP_SWITCH_CASE = 35;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_IODSP_SWITCH_CASE__DEFAULT_VALUE = MPARAMETER_IODSP_SWITCH_CASE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_IODSP_SWITCH_CASE__PLATFORM = MPARAMETER_IODSP_SWITCH_CASE__PLATFORM;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_IODSP_SWITCH_CASE__RANGE = MPARAMETER_IODSP_SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MReal Param IODSP Switch Case</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAM_IODSP_SWITCH_CASE_FEATURE_COUNT = MPARAMETER_IODSP_SWITCH_CASE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain <em>MDomain</em>}'.
	 * @return the meta object for class '<em>MDomain</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MDomain
	 * @generated
	 */
	EClass getMDomain();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#isAllowsSingleton <em>Allows Singleton</em>}'.
	 * @return the meta object for the attribute '<em>Allows Singleton</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#isAllowsSingleton()
	 * @see #getMDomain()
	 * @generated
	 */
	EAttribute getMDomain_AllowsSingleton();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#getAttributes <em>Attributes</em>}'.
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#getAttributes()
	 * @see #getMDomain()
	 * @generated
	 */
	EReference getMDomain_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#getPortTypes <em>Port Types</em>}'.
	 * @return the meta object for the containment reference list '<em>Port Types</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#getPortTypes()
	 * @see #getMDomain()
	 * @generated
	 */
	EReference getMDomain_PortTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#getInterfaceTypes <em>Interface Types</em>}'.
	 * @return the meta object for the containment reference list '<em>Interface Types</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#getInterfaceTypes()
	 * @see #getMDomain()
	 * @generated
	 */
	EReference getMDomain_InterfaceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#getConnectors <em>Connectors</em>}'.
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MDomain#getConnectors()
	 * @see #getMDomain()
	 * @generated
	 */
	EReference getMDomain_Connectors();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain <em>MAO Domain</em>}'.
	 * @return the meta object for class '<em>MAO Domain</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain
	 * @generated
	 */
	EClass getMAODomain();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain#getOutputIODomains <em>Output IO Domains</em>}'.
	 * @return the meta object for the reference list '<em>Output IO Domains</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain#getOutputIODomains()
	 * @see #getMAODomain()
	 * @generated
	 */
	EReference getMAODomain_OutputIODomains();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain#getInherits()
	 * @see #getMAODomain()
	 * @generated
	 */
	EReference getMAODomain_Inherits();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain#getComponentTypeInstances <em>Component Type Instances</em>}'.
	 * @return the meta object for the containment reference list '<em>Component Type Instances</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain#getComponentTypeInstances()
	 * @see #getMAODomain()
	 * @generated
	 */
	EReference getMAODomain_ComponentTypeInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain#getComponentTypes <em>Component Types</em>}'.
	 * @return the meta object for the containment reference list '<em>Component Types</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain#getComponentTypes()
	 * @see #getMAODomain()
	 * @generated
	 */
	EReference getMAODomain_ComponentTypes();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain <em>MIO Domain</em>}'.
	 * @return the meta object for class '<em>MIO Domain</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain
	 * @generated
	 */
	EClass getMIODomain();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getInherits()
	 * @see #getMIODomain()
	 * @generated
	 */
	EReference getMIODomain_Inherits();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getLanguages <em>Languages</em>}'.
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getLanguages()
	 * @see #getMIODomain()
	 * @generated
	 */
	EReference getMIODomain_Languages();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getRequires <em>Requires</em>}'.
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getRequires()
	 * @see #getMIODomain()
	 * @generated
	 */
	EReference getMIODomain_Requires();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getExchangeModels <em>Exchange Models</em>}'.
	 * @return the meta object for the containment reference list '<em>Exchange Models</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getExchangeModels()
	 * @see #getMIODomain()
	 * @generated
	 */
	EReference getMIODomain_ExchangeModels();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getSupportedPlatforms <em>Supported Platforms</em>}'.
	 * @return the meta object for the containment reference list '<em>Supported Platforms</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getSupportedPlatforms()
	 * @see #getMIODomain()
	 * @generated
	 */
	EReference getMIODomain_SupportedPlatforms();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getComponentTypes <em>Component Types</em>}'.
	 * @return the meta object for the containment reference list '<em>Component Types</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getComponentTypes()
	 * @see #getMIODomain()
	 * @generated
	 */
	EReference getMIODomain_ComponentTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getComponentTypeInstances <em>Component Type Instances</em>}'.
	 * @return the meta object for the containment reference list '<em>Component Type Instances</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain#getComponentTypeInstances()
	 * @see #getMIODomain()
	 * @generated
	 */
	EReference getMIODomain_ComponentTypeInstances();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType <em>MComponent Type</em>}'.
	 * @return the meta object for class '<em>MComponent Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType
	 * @generated
	 */
	EClass getMComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType#getAttributes <em>Attributes</em>}'.
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType#getAttributes()
	 * @see #getMComponentType()
	 * @generated
	 */
	EReference getMComponentType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType#getPortTypeInstances <em>Port Type Instances</em>}'.
	 * @return the meta object for the containment reference list '<em>Port Type Instances</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType#getPortTypeInstances()
	 * @see #getMComponentType()
	 * @generated
	 */
	EReference getMComponentType_PortTypeInstances();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType <em>MIOD Abstract Component Type</em>}'.
	 * @return the meta object for class '<em>MIOD Abstract Component Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType
	 * @generated
	 */
	EClass getMIODAbstractComponentType();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType#getInherits()
	 * @see #getMIODAbstractComponentType()
	 * @generated
	 */
	EReference getMIODAbstractComponentType_Inherits();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType#getComponentTypeInstances <em>Component Type Instances</em>}'.
	 * @return the meta object for the containment reference list '<em>Component Type Instances</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType#getComponentTypeInstances()
	 * @see #getMIODAbstractComponentType()
	 * @generated
	 */
	EReference getMIODAbstractComponentType_ComponentTypeInstances();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType <em>MIOD Component Type</em>}'.
	 * @return the meta object for class '<em>MIOD Component Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType
	 * @generated
	 */
	EClass getMIODComponentType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType#getLanguage <em>Language</em>}'.
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType#getLanguage()
	 * @see #getMIODComponentType()
	 * @generated
	 */
	EReference getMIODComponentType_Language();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType <em>MAOD Component Type</em>}'.
	 * @return the meta object for class '<em>MAOD Component Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType
	 * @generated
	 */
	EClass getMAODComponentType();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType#getInherits()
	 * @see #getMAODComponentType()
	 * @generated
	 */
	EReference getMAODComponentType_Inherits();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType#getComponentTypeInstances <em>Component Type Instances</em>}'.
	 * @return the meta object for the containment reference list '<em>Component Type Instances</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType#getComponentTypeInstances()
	 * @see #getMAODComponentType()
	 * @generated
	 */
	EReference getMAODComponentType_ComponentTypeInstances();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance <em>MComponent Type Instance</em>}'.
	 * @return the meta object for class '<em>MComponent Type Instance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance
	 * @generated
	 */
	EClass getMComponentTypeInstance();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance#getLowerBound <em>Lower Bound</em>}'.
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance#getLowerBound()
	 * @see #getMComponentTypeInstance()
	 * @generated
	 */
	EReference getMComponentTypeInstance_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance#getUpperBound <em>Upper Bound</em>}'.
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance#getUpperBound()
	 * @see #getMComponentTypeInstance()
	 * @generated
	 */
	EReference getMComponentTypeInstance_UpperBound();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentTypeInstance <em>MIOD Component Type Instance</em>}'.
	 * @return the meta object for class '<em>MIOD Component Type Instance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentTypeInstance
	 * @generated
	 */
	EClass getMIODComponentTypeInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentTypeInstance#getComponentType <em>Component Type</em>}'.
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentTypeInstance#getComponentType()
	 * @see #getMIODComponentTypeInstance()
	 * @generated
	 */
	EReference getMIODComponentTypeInstance_ComponentType();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentTypeInstance <em>MAOD Component Type Instance</em>}'.
	 * @return the meta object for class '<em>MAOD Component Type Instance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentTypeInstance
	 * @generated
	 */
	EClass getMAODComponentTypeInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentTypeInstance#getComponentType <em>Component Type</em>}'.
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentTypeInstance#getComponentType()
	 * @see #getMAODComponentTypeInstance()
	 * @generated
	 */
	EReference getMAODComponentTypeInstance_ComponentType();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance <em>MPort Type Instance</em>}'.
	 * @return the meta object for class '<em>MPort Type Instance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance
	 * @generated
	 */
	EClass getMPortTypeInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance#getPortType <em>Port Type</em>}'.
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance#getPortType()
	 * @see #getMPortTypeInstance()
	 * @generated
	 */
	EReference getMPortTypeInstance_PortType();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance#getLowerBound <em>Lower Bound</em>}'.
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance#getLowerBound()
	 * @see #getMPortTypeInstance()
	 * @generated
	 */
	EReference getMPortTypeInstance_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance#getUpperBound <em>Upper Bound</em>}'.
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance#getUpperBound()
	 * @see #getMPortTypeInstance()
	 * @generated
	 */
	EReference getMPortTypeInstance_UpperBound();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MInternalPortTypeInstance <em>MInternal Port Type Instance</em>}'.
	 * @return the meta object for class '<em>MInternal Port Type Instance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MInternalPortTypeInstance
	 * @generated
	 */
	EClass getMInternalPortTypeInstance();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MInternalClientPortTypeInstance <em>MInternal Client Port Type Instance</em>}'.
	 * @return the meta object for class '<em>MInternal Client Port Type Instance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MInternalClientPortTypeInstance
	 * @generated
	 */
	EClass getMInternalClientPortTypeInstance();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MInternalServerPortTypeInstance <em>MInternal Server Port Type Instance</em>}'.
	 * @return the meta object for class '<em>MInternal Server Port Type Instance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MInternalServerPortTypeInstance
	 * @generated
	 */
	EClass getMInternalServerPortTypeInstance();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MExternalPortTypeInstance <em>MExternal Port Type Instance</em>}'.
	 * @return the meta object for class '<em>MExternal Port Type Instance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MExternalPortTypeInstance
	 * @generated
	 */
	EClass getMExternalPortTypeInstance();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MExternalClientPortTypeInstance <em>MExternal Client Port Type Instance</em>}'.
	 * @return the meta object for class '<em>MExternal Client Port Type Instance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MExternalClientPortTypeInstance
	 * @generated
	 */
	EClass getMExternalClientPortTypeInstance();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MExternalServerPortTypeInstance <em>MExternal Server Port Type Instance</em>}'.
	 * @return the meta object for class '<em>MExternal Server Port Type Instance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MExternalServerPortTypeInstance
	 * @generated
	 */
	EClass getMExternalServerPortTypeInstance();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MConnector <em>MConnector</em>}'.
	 * @return the meta object for class '<em>MConnector</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MConnector
	 * @generated
	 */
	EClass getMConnector();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getInherits()
	 * @see #getMConnector()
	 * @generated
	 */
	EReference getMConnector_Inherits();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getAttributes <em>Attributes</em>}'.
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getAttributes()
	 * @see #getMConnector()
	 * @generated
	 */
	EReference getMConnector_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getClientPortTypes <em>Client Port Types</em>}'.
	 * @return the meta object for the reference list '<em>Client Port Types</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getClientPortTypes()
	 * @see #getMConnector()
	 * @generated
	 */
	EReference getMConnector_ClientPortTypes();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getServerPortTypes <em>Server Port Types</em>}'.
	 * @return the meta object for the reference list '<em>Server Port Types</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getServerPortTypes()
	 * @see #getMConnector()
	 * @generated
	 */
	EReference getMConnector_ServerPortTypes();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getExchangeModel <em>Exchange Model</em>}'.
	 * @return the meta object for the reference '<em>Exchange Model</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MConnector#getExchangeModel()
	 * @see #getMConnector()
	 * @generated
	 */
	EReference getMConnector_ExchangeModel();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortType <em>MPort Type</em>}'.
	 * @return the meta object for class '<em>MPort Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MPortType
	 * @generated
	 */
	EClass getMPortType();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getInherits()
	 * @see #getMPortType()
	 * @generated
	 */
	EReference getMPortType_Inherits();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getInterfaceTypes <em>Interface Types</em>}'.
	 * @return the meta object for the reference list '<em>Interface Types</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getInterfaceTypes()
	 * @see #getMPortType()
	 * @generated
	 */
	EReference getMPortType_InterfaceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getAttributes <em>Attributes</em>}'.
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getAttributes()
	 * @see #getMPortType()
	 * @generated
	 */
	EReference getMPortType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getClientAttributes <em>Client Attributes</em>}'.
	 * @return the meta object for the containment reference list '<em>Client Attributes</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getClientAttributes()
	 * @see #getMPortType()
	 * @generated
	 */
	EReference getMPortType_ClientAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getServerAttributes <em>Server Attributes</em>}'.
	 * @return the meta object for the containment reference list '<em>Server Attributes</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MPortType#getServerAttributes()
	 * @see #getMPortType()
	 * @generated
	 */
	EReference getMPortType_ServerAttributes();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType <em>MInterface Type</em>}'.
	 * @return the meta object for class '<em>MInterface Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType
	 * @generated
	 */
	EClass getMInterfaceType();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType#getInherits()
	 * @see #getMInterfaceType()
	 * @generated
	 */
	EReference getMInterfaceType_Inherits();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel <em>MExchange Model</em>}'.
	 * @return the meta object for class '<em>MExchange Model</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel
	 * @generated
	 */
	EClass getMExchangeModel();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel#getInterfaceTypes <em>Interface Types</em>}'.
	 * @return the meta object for the reference list '<em>Interface Types</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel#getInterfaceTypes()
	 * @see #getMExchangeModel()
	 * @generated
	 */
	EReference getMExchangeModel_InterfaceTypes();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel#getInherits()
	 * @see #getMExchangeModel()
	 * @generated
	 */
	EReference getMExchangeModel_Inherits();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MMCLEVDOMPackageFile <em>MMCLEVDOM Package File</em>}'.
	 * @return the meta object for class '<em>MMCLEVDOM Package File</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MMCLEVDOMPackageFile
	 * @generated
	 */
	EClass getMMCLEVDOMPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MMCLEVDOMPackageElement <em>MMCLEVDOM Package Element</em>}'.
	 * @return the meta object for class '<em>MMCLEVDOM Package Element</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MMCLEVDOMPackageElement
	 * @generated
	 */
	EClass getMMCLEVDOMPackageElement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform <em>MIO Domain Supported Platform</em>}'.
	 * @return the meta object for class '<em>MIO Domain Supported Platform</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform
	 * @generated
	 */
	EClass getMIODomainSupportedPlatform();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getOsapi <em>Osapi</em>}'.
	 * @return the meta object for the reference '<em>Osapi</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getOsapi()
	 * @see #getMIODomainSupportedPlatform()
	 * @generated
	 */
	EReference getMIODomainSupportedPlatform_Osapi();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getOs <em>Os</em>}'.
	 * @return the meta object for the reference '<em>Os</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getOs()
	 * @see #getMIODomainSupportedPlatform()
	 * @generated
	 */
	EReference getMIODomainSupportedPlatform_Os();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getArchitecture <em>Architecture</em>}'.
	 * @return the meta object for the reference '<em>Architecture</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getArchitecture()
	 * @see #getMIODomainSupportedPlatform()
	 * @generated
	 */
	EReference getMIODomainSupportedPlatform_Architecture();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getCompiler <em>Compiler</em>}'.
	 * @return the meta object for the reference '<em>Compiler</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getCompiler()
	 * @see #getMIODomainSupportedPlatform()
	 * @generated
	 */
	EReference getMIODomainSupportedPlatform_Compiler();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getMicroprocessor <em>Microprocessor</em>}'.
	 * @return the meta object for the reference '<em>Microprocessor</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getMicroprocessor()
	 * @see #getMIODomainSupportedPlatform()
	 * @generated
	 */
	EReference getMIODomainSupportedPlatform_Microprocessor();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getBoard <em>Board</em>}'.
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getBoard()
	 * @see #getMIODomainSupportedPlatform()
	 * @generated
	 */
	EReference getMIODomainSupportedPlatform_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getAttributes <em>Attributes</em>}'.
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getAttributes()
	 * @see #getMIODomainSupportedPlatform()
	 * @generated
	 */
	EReference getMIODomainSupportedPlatform_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getRequires <em>Requires</em>}'.
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getRequires()
	 * @see #getMIODomainSupportedPlatform()
	 * @generated
	 */
	EReference getMIODomainSupportedPlatform_Requires();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getLanguages <em>Languages</em>}'.
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getLanguages()
	 * @see #getMIODomainSupportedPlatform()
	 * @generated
	 */
	EReference getMIODomainSupportedPlatform_Languages();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitch <em>MParameter IODSP Switch</em>}'.
	 * @return the meta object for class '<em>MParameter IODSP Switch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitch
	 * @generated
	 */
	EClass getMParameterIODSPSwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitch#getCases <em>Cases</em>}'.
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitch#getCases()
	 * @see #getMParameterIODSPSwitch()
	 * @generated
	 */
	EReference getMParameterIODSPSwitch_Cases();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitchCase <em>MParameter IODSP Switch Case</em>}'.
	 * @return the meta object for class '<em>MParameter IODSP Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitchCase
	 * @generated
	 */
	EClass getMParameterIODSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitchCase#getDefaultValue <em>Default Value</em>}'.
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitchCase#getDefaultValue()
	 * @see #getMParameterIODSPSwitchCase()
	 * @generated
	 */
	EReference getMParameterIODSPSwitchCase_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitchCase#getPlatform <em>Platform</em>}'.
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitchCase#getPlatform()
	 * @see #getMParameterIODSPSwitchCase()
	 * @generated
	 */
	EReference getMParameterIODSPSwitchCase_Platform();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MBooleanParamIODSPSwitch <em>MBoolean Param IODSP Switch</em>}'.
	 * @return the meta object for class '<em>MBoolean Param IODSP Switch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MBooleanParamIODSPSwitch
	 * @generated
	 */
	EClass getMBooleanParamIODSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MBooleanParamIODSPSwitchCase <em>MBoolean Param IODSP Switch Case</em>}'.
	 * @return the meta object for class '<em>MBoolean Param IODSP Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MBooleanParamIODSPSwitchCase
	 * @generated
	 */
	EClass getMBooleanParamIODSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MStringParamIODSPSwitch <em>MString Param IODSP Switch</em>}'.
	 * @return the meta object for class '<em>MString Param IODSP Switch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MStringParamIODSPSwitch
	 * @generated
	 */
	EClass getMStringParamIODSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MStringParamIODSPSwitchCase <em>MString Param IODSP Switch Case</em>}'.
	 * @return the meta object for class '<em>MString Param IODSP Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MStringParamIODSPSwitchCase
	 * @generated
	 */
	EClass getMStringParamIODSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitch <em>MInteger Param IODSP Switch</em>}'.
	 * @return the meta object for class '<em>MInteger Param IODSP Switch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitch
	 * @generated
	 */
	EClass getMIntegerParamIODSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitchCase <em>MInteger Param IODSP Switch Case</em>}'.
	 * @return the meta object for class '<em>MInteger Param IODSP Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitchCase
	 * @generated
	 */
	EClass getMIntegerParamIODSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitchCase#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitchCase#getRange()
	 * @see #getMIntegerParamIODSPSwitchCase()
	 * @generated
	 */
	EReference getMIntegerParamIODSPSwitchCase_Range();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MEnumParamIODSPSwitch <em>MEnum Param IODSP Switch</em>}'.
	 * @return the meta object for class '<em>MEnum Param IODSP Switch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MEnumParamIODSPSwitch
	 * @generated
	 */
	EClass getMEnumParamIODSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MEnumParamIODSPSwitchCase <em>MEnum Param IODSP Switch Case</em>}'.
	 * @return the meta object for class '<em>MEnum Param IODSP Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MEnumParamIODSPSwitchCase
	 * @generated
	 */
	EClass getMEnumParamIODSPSwitchCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitch <em>MReal Param IODSP Switch</em>}'.
	 * @return the meta object for class '<em>MReal Param IODSP Switch</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitch
	 * @generated
	 */
	EClass getMRealParamIODSPSwitch();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitchCase <em>MReal Param IODSP Switch Case</em>}'.
	 * @return the meta object for class '<em>MReal Param IODSP Switch Case</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitchCase
	 * @generated
	 */
	EClass getMRealParamIODSPSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitchCase#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitchCase#getRange()
	 * @see #getMRealParamIODSPSwitchCase()
	 * @generated
	 */
	EReference getMRealParamIODSPSwitchCase_Range();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mclevdomFactory getmclevdomFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MDomainImpl <em>MDomain</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MDomainImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMDomain()
		 * @generated
		 */
		EClass MDOMAIN = eINSTANCE.getMDomain();

		/**
		 * The meta object literal for the '<em><b>Allows Singleton</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MDOMAIN__ALLOWS_SINGLETON = eINSTANCE.getMDomain_AllowsSingleton();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDOMAIN__ATTRIBUTES = eINSTANCE.getMDomain_Attributes();

		/**
		 * The meta object literal for the '<em><b>Port Types</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDOMAIN__PORT_TYPES = eINSTANCE.getMDomain_PortTypes();

		/**
		 * The meta object literal for the '<em><b>Interface Types</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDOMAIN__INTERFACE_TYPES = eINSTANCE.getMDomain_InterfaceTypes();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MDOMAIN__CONNECTORS = eINSTANCE.getMDomain_Connectors();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODomainImpl <em>MAO Domain</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODomainImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMAODomain()
		 * @generated
		 */
		EClass MAO_DOMAIN = eINSTANCE.getMAODomain();

		/**
		 * The meta object literal for the '<em><b>Output IO Domains</b></em>' reference list feature.
		 * @generated
		 */
		EReference MAO_DOMAIN__OUTPUT_IO_DOMAINS = eINSTANCE.getMAODomain_OutputIODomains();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MAO_DOMAIN__INHERITS = eINSTANCE.getMAODomain_Inherits();

		/**
		 * The meta object literal for the '<em><b>Component Type Instances</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MAO_DOMAIN__COMPONENT_TYPE_INSTANCES = eINSTANCE.getMAODomain_ComponentTypeInstances();

		/**
		 * The meta object literal for the '<em><b>Component Types</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MAO_DOMAIN__COMPONENT_TYPES = eINSTANCE.getMAODomain_ComponentTypes();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainImpl <em>MIO Domain</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIODomain()
		 * @generated
		 */
		EClass MIO_DOMAIN = eINSTANCE.getMIODomain();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MIO_DOMAIN__INHERITS = eINSTANCE.getMIODomain_Inherits();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MIO_DOMAIN__LANGUAGES = eINSTANCE.getMIODomain_Languages();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * @generated
		 */
		EReference MIO_DOMAIN__REQUIRES = eINSTANCE.getMIODomain_Requires();

		/**
		 * The meta object literal for the '<em><b>Exchange Models</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MIO_DOMAIN__EXCHANGE_MODELS = eINSTANCE.getMIODomain_ExchangeModels();

		/**
		 * The meta object literal for the '<em><b>Supported Platforms</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MIO_DOMAIN__SUPPORTED_PLATFORMS = eINSTANCE.getMIODomain_SupportedPlatforms();

		/**
		 * The meta object literal for the '<em><b>Component Types</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MIO_DOMAIN__COMPONENT_TYPES = eINSTANCE.getMIODomain_ComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Component Type Instances</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MIO_DOMAIN__COMPONENT_TYPE_INSTANCES = eINSTANCE.getMIODomain_ComponentTypeInstances();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MComponentTypeImpl <em>MComponent Type</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MComponentTypeImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMComponentType()
		 * @generated
		 */
		EClass MCOMPONENT_TYPE = eINSTANCE.getMComponentType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT_TYPE__ATTRIBUTES = eINSTANCE.getMComponentType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Port Type Instances</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMPONENT_TYPE__PORT_TYPE_INSTANCES = eINSTANCE.getMComponentType_PortTypeInstances();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODAbstractComponentTypeImpl <em>MIOD Abstract Component Type</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODAbstractComponentTypeImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIODAbstractComponentType()
		 * @generated
		 */
		EClass MIOD_ABSTRACT_COMPONENT_TYPE = eINSTANCE.getMIODAbstractComponentType();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MIOD_ABSTRACT_COMPONENT_TYPE__INHERITS = eINSTANCE.getMIODAbstractComponentType_Inherits();

		/**
		 * The meta object literal for the '<em><b>Component Type Instances</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MIOD_ABSTRACT_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES = eINSTANCE.getMIODAbstractComponentType_ComponentTypeInstances();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODComponentTypeImpl <em>MIOD Component Type</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODComponentTypeImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIODComponentType()
		 * @generated
		 */
		EClass MIOD_COMPONENT_TYPE = eINSTANCE.getMIODComponentType();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * @generated
		 */
		EReference MIOD_COMPONENT_TYPE__LANGUAGE = eINSTANCE.getMIODComponentType_Language();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODComponentTypeImpl <em>MAOD Component Type</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODComponentTypeImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMAODComponentType()
		 * @generated
		 */
		EClass MAOD_COMPONENT_TYPE = eINSTANCE.getMAODComponentType();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MAOD_COMPONENT_TYPE__INHERITS = eINSTANCE.getMAODComponentType_Inherits();

		/**
		 * The meta object literal for the '<em><b>Component Type Instances</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MAOD_COMPONENT_TYPE__COMPONENT_TYPE_INSTANCES = eINSTANCE.getMAODComponentType_ComponentTypeInstances();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MComponentTypeInstanceImpl <em>MComponent Type Instance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MComponentTypeInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMComponentTypeInstance()
		 * @generated
		 */
		EClass MCOMPONENT_TYPE_INSTANCE = eINSTANCE.getMComponentTypeInstance();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MCOMPONENT_TYPE_INSTANCE__LOWER_BOUND = eINSTANCE.getMComponentTypeInstance_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MCOMPONENT_TYPE_INSTANCE__UPPER_BOUND = eINSTANCE.getMComponentTypeInstance_UpperBound();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODComponentTypeInstanceImpl <em>MIOD Component Type Instance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODComponentTypeInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIODComponentTypeInstance()
		 * @generated
		 */
		EClass MIOD_COMPONENT_TYPE_INSTANCE = eINSTANCE.getMIODComponentTypeInstance();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * @generated
		 */
		EReference MIOD_COMPONENT_TYPE_INSTANCE__COMPONENT_TYPE = eINSTANCE.getMIODComponentTypeInstance_ComponentType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODComponentTypeInstanceImpl <em>MAOD Component Type Instance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MAODComponentTypeInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMAODComponentTypeInstance()
		 * @generated
		 */
		EClass MAOD_COMPONENT_TYPE_INSTANCE = eINSTANCE.getMAODComponentTypeInstance();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * @generated
		 */
		EReference MAOD_COMPONENT_TYPE_INSTANCE__COMPONENT_TYPE = eINSTANCE.getMAODComponentTypeInstance_ComponentType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeInstanceImpl <em>MPort Type Instance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMPortTypeInstance()
		 * @generated
		 */
		EClass MPORT_TYPE_INSTANCE = eINSTANCE.getMPortTypeInstance();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' reference feature.
		 * @generated
		 */
		EReference MPORT_TYPE_INSTANCE__PORT_TYPE = eINSTANCE.getMPortTypeInstance_PortType();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPORT_TYPE_INSTANCE__LOWER_BOUND = eINSTANCE.getMPortTypeInstance_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPORT_TYPE_INSTANCE__UPPER_BOUND = eINSTANCE.getMPortTypeInstance_UpperBound();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInternalPortTypeInstanceImpl <em>MInternal Port Type Instance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInternalPortTypeInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMInternalPortTypeInstance()
		 * @generated
		 */
		EClass MINTERNAL_PORT_TYPE_INSTANCE = eINSTANCE.getMInternalPortTypeInstance();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInternalClientPortTypeInstanceImpl <em>MInternal Client Port Type Instance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInternalClientPortTypeInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMInternalClientPortTypeInstance()
		 * @generated
		 */
		EClass MINTERNAL_CLIENT_PORT_TYPE_INSTANCE = eINSTANCE.getMInternalClientPortTypeInstance();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInternalServerPortTypeInstanceImpl <em>MInternal Server Port Type Instance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInternalServerPortTypeInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMInternalServerPortTypeInstance()
		 * @generated
		 */
		EClass MINTERNAL_SERVER_PORT_TYPE_INSTANCE = eINSTANCE.getMInternalServerPortTypeInstance();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExternalPortTypeInstanceImpl <em>MExternal Port Type Instance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExternalPortTypeInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMExternalPortTypeInstance()
		 * @generated
		 */
		EClass MEXTERNAL_PORT_TYPE_INSTANCE = eINSTANCE.getMExternalPortTypeInstance();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExternalClientPortTypeInstanceImpl <em>MExternal Client Port Type Instance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExternalClientPortTypeInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMExternalClientPortTypeInstance()
		 * @generated
		 */
		EClass MEXTERNAL_CLIENT_PORT_TYPE_INSTANCE = eINSTANCE.getMExternalClientPortTypeInstance();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExternalServerPortTypeInstanceImpl <em>MExternal Server Port Type Instance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExternalServerPortTypeInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMExternalServerPortTypeInstance()
		 * @generated
		 */
		EClass MEXTERNAL_SERVER_PORT_TYPE_INSTANCE = eINSTANCE.getMExternalServerPortTypeInstance();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MConnectorImpl <em>MConnector</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MConnectorImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMConnector()
		 * @generated
		 */
		EClass MCONNECTOR = eINSTANCE.getMConnector();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MCONNECTOR__INHERITS = eINSTANCE.getMConnector_Inherits();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCONNECTOR__ATTRIBUTES = eINSTANCE.getMConnector_Attributes();

		/**
		 * The meta object literal for the '<em><b>Client Port Types</b></em>' reference list feature.
		 * @generated
		 */
		EReference MCONNECTOR__CLIENT_PORT_TYPES = eINSTANCE.getMConnector_ClientPortTypes();

		/**
		 * The meta object literal for the '<em><b>Server Port Types</b></em>' reference list feature.
		 * @generated
		 */
		EReference MCONNECTOR__SERVER_PORT_TYPES = eINSTANCE.getMConnector_ServerPortTypes();

		/**
		 * The meta object literal for the '<em><b>Exchange Model</b></em>' reference feature.
		 * @generated
		 */
		EReference MCONNECTOR__EXCHANGE_MODEL = eINSTANCE.getMConnector_ExchangeModel();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeImpl <em>MPort Type</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MPortTypeImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMPortType()
		 * @generated
		 */
		EClass MPORT_TYPE = eINSTANCE.getMPortType();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MPORT_TYPE__INHERITS = eINSTANCE.getMPortType_Inherits();

		/**
		 * The meta object literal for the '<em><b>Interface Types</b></em>' reference list feature.
		 * @generated
		 */
		EReference MPORT_TYPE__INTERFACE_TYPES = eINSTANCE.getMPortType_InterfaceTypes();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MPORT_TYPE__ATTRIBUTES = eINSTANCE.getMPortType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Client Attributes</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MPORT_TYPE__CLIENT_ATTRIBUTES = eINSTANCE.getMPortType_ClientAttributes();

		/**
		 * The meta object literal for the '<em><b>Server Attributes</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MPORT_TYPE__SERVER_ATTRIBUTES = eINSTANCE.getMPortType_ServerAttributes();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInterfaceTypeImpl <em>MInterface Type</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MInterfaceTypeImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMInterfaceType()
		 * @generated
		 */
		EClass MINTERFACE_TYPE = eINSTANCE.getMInterfaceType();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MINTERFACE_TYPE__INHERITS = eINSTANCE.getMInterfaceType_Inherits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExchangeModelImpl <em>MExchange Model</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MExchangeModelImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMExchangeModel()
		 * @generated
		 */
		EClass MEXCHANGE_MODEL = eINSTANCE.getMExchangeModel();

		/**
		 * The meta object literal for the '<em><b>Interface Types</b></em>' reference list feature.
		 * @generated
		 */
		EReference MEXCHANGE_MODEL__INTERFACE_TYPES = eINSTANCE.getMExchangeModel_InterfaceTypes();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference MEXCHANGE_MODEL__INHERITS = eINSTANCE.getMExchangeModel_Inherits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MMCLEVDOMPackageFileImpl <em>MMCLEVDOM Package File</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MMCLEVDOMPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMMCLEVDOMPackageFile()
		 * @generated
		 */
		EClass MMCLEVDOM_PACKAGE_FILE = eINSTANCE.getMMCLEVDOMPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MMCLEVDOMPackageElementImpl <em>MMCLEVDOM Package Element</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MMCLEVDOMPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMMCLEVDOMPackageElement()
		 * @generated
		 */
		EClass MMCLEVDOM_PACKAGE_ELEMENT = eINSTANCE.getMMCLEVDOMPackageElement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainSupportedPlatformImpl <em>MIO Domain Supported Platform</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIODomainSupportedPlatformImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIODomainSupportedPlatform()
		 * @generated
		 */
		EClass MIO_DOMAIN_SUPPORTED_PLATFORM = eINSTANCE.getMIODomainSupportedPlatform();

		/**
		 * The meta object literal for the '<em><b>Osapi</b></em>' reference feature.
		 * @generated
		 */
		EReference MIO_DOMAIN_SUPPORTED_PLATFORM__OSAPI = eINSTANCE.getMIODomainSupportedPlatform_Osapi();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' reference feature.
		 * @generated
		 */
		EReference MIO_DOMAIN_SUPPORTED_PLATFORM__OS = eINSTANCE.getMIODomainSupportedPlatform_Os();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' reference feature.
		 * @generated
		 */
		EReference MIO_DOMAIN_SUPPORTED_PLATFORM__ARCHITECTURE = eINSTANCE.getMIODomainSupportedPlatform_Architecture();

		/**
		 * The meta object literal for the '<em><b>Compiler</b></em>' reference feature.
		 * @generated
		 */
		EReference MIO_DOMAIN_SUPPORTED_PLATFORM__COMPILER = eINSTANCE.getMIODomainSupportedPlatform_Compiler();

		/**
		 * The meta object literal for the '<em><b>Microprocessor</b></em>' reference feature.
		 * @generated
		 */
		EReference MIO_DOMAIN_SUPPORTED_PLATFORM__MICROPROCESSOR = eINSTANCE.getMIODomainSupportedPlatform_Microprocessor();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * @generated
		 */
		EReference MIO_DOMAIN_SUPPORTED_PLATFORM__BOARD = eINSTANCE.getMIODomainSupportedPlatform_Board();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MIO_DOMAIN_SUPPORTED_PLATFORM__ATTRIBUTES = eINSTANCE.getMIODomainSupportedPlatform_Attributes();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * @generated
		 */
		EReference MIO_DOMAIN_SUPPORTED_PLATFORM__REQUIRES = eINSTANCE.getMIODomainSupportedPlatform_Requires();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MIO_DOMAIN_SUPPORTED_PLATFORM__LANGUAGES = eINSTANCE.getMIODomainSupportedPlatform_Languages();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MParameterIODSPSwitchImpl <em>MParameter IODSP Switch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MParameterIODSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMParameterIODSPSwitch()
		 * @generated
		 */
		EClass MPARAMETER_IODSP_SWITCH = eINSTANCE.getMParameterIODSPSwitch();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MPARAMETER_IODSP_SWITCH__CASES = eINSTANCE.getMParameterIODSPSwitch_Cases();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MParameterIODSPSwitchCaseImpl <em>MParameter IODSP Switch Case</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MParameterIODSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMParameterIODSPSwitchCase()
		 * @generated
		 */
		EClass MPARAMETER_IODSP_SWITCH_CASE = eINSTANCE.getMParameterIODSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_IODSP_SWITCH_CASE__DEFAULT_VALUE = eINSTANCE.getMParameterIODSPSwitchCase_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * @generated
		 */
		EReference MPARAMETER_IODSP_SWITCH_CASE__PLATFORM = eINSTANCE.getMParameterIODSPSwitchCase_Platform();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MBooleanParamIODSPSwitchImpl <em>MBoolean Param IODSP Switch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MBooleanParamIODSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMBooleanParamIODSPSwitch()
		 * @generated
		 */
		EClass MBOOLEAN_PARAM_IODSP_SWITCH = eINSTANCE.getMBooleanParamIODSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MBooleanParamIODSPSwitchCaseImpl <em>MBoolean Param IODSP Switch Case</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MBooleanParamIODSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMBooleanParamIODSPSwitchCase()
		 * @generated
		 */
		EClass MBOOLEAN_PARAM_IODSP_SWITCH_CASE = eINSTANCE.getMBooleanParamIODSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MStringParamIODSPSwitchImpl <em>MString Param IODSP Switch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MStringParamIODSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMStringParamIODSPSwitch()
		 * @generated
		 */
		EClass MSTRING_PARAM_IODSP_SWITCH = eINSTANCE.getMStringParamIODSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MStringParamIODSPSwitchCaseImpl <em>MString Param IODSP Switch Case</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MStringParamIODSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMStringParamIODSPSwitchCase()
		 * @generated
		 */
		EClass MSTRING_PARAM_IODSP_SWITCH_CASE = eINSTANCE.getMStringParamIODSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIntegerParamIODSPSwitchImpl <em>MInteger Param IODSP Switch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIntegerParamIODSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIntegerParamIODSPSwitch()
		 * @generated
		 */
		EClass MINTEGER_PARAM_IODSP_SWITCH = eINSTANCE.getMIntegerParamIODSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIntegerParamIODSPSwitchCaseImpl <em>MInteger Param IODSP Switch Case</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MIntegerParamIODSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMIntegerParamIODSPSwitchCase()
		 * @generated
		 */
		EClass MINTEGER_PARAM_IODSP_SWITCH_CASE = eINSTANCE.getMIntegerParamIODSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MINTEGER_PARAM_IODSP_SWITCH_CASE__RANGE = eINSTANCE.getMIntegerParamIODSPSwitchCase_Range();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MEnumParamIODSPSwitchImpl <em>MEnum Param IODSP Switch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MEnumParamIODSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMEnumParamIODSPSwitch()
		 * @generated
		 */
		EClass MENUM_PARAM_IODSP_SWITCH = eINSTANCE.getMEnumParamIODSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MEnumParamIODSPSwitchCaseImpl <em>MEnum Param IODSP Switch Case</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MEnumParamIODSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMEnumParamIODSPSwitchCase()
		 * @generated
		 */
		EClass MENUM_PARAM_IODSP_SWITCH_CASE = eINSTANCE.getMEnumParamIODSPSwitchCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MRealParamIODSPSwitchImpl <em>MReal Param IODSP Switch</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MRealParamIODSPSwitchImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMRealParamIODSPSwitch()
		 * @generated
		 */
		EClass MREAL_PARAM_IODSP_SWITCH = eINSTANCE.getMRealParamIODSPSwitch();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.impl.MRealParamIODSPSwitchCaseImpl <em>MReal Param IODSP Switch Case</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.MRealParamIODSPSwitchCaseImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevdom.impl.mclevdomPackageImpl#getMRealParamIODSPSwitchCase()
		 * @generated
		 */
		EClass MREAL_PARAM_IODSP_SWITCH_CASE = eINSTANCE.getMRealParamIODSPSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MREAL_PARAM_IODSP_SWITCH_CASE__RANGE = eINSTANCE.getMRealParamIODSPSwitchCase_Range();

	}

}