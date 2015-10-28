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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad;

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
 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadFactory
 * @model kind="package"
 * @generated
 */
public interface mclevflatmcadPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mclevflatmcad";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mclev/mclevflatmcad";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mclev";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mclevflatmcadPackage eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MMCLEVFLATMCADPackageElementImpl <em>MMCLEVFLATMCADPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MMCLEVFLATMCADPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMMCLEVFLATMCADPackageElement()
	 * @generated
	 */
	int MMCLEVFLATMCAD_PACKAGE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVFLATMCAD_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVFLATMCAD_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMCLEVFLATMCAD_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMCLEVFLATMCADPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVFLATMCAD_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADImpl <em>MFlatMCAD</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatMCAD()
	 * @generated
	 */
	int MFLAT_MCAD = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD__VERSION = MMCLEVFLATMCAD_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD__NAME = MMCLEVFLATMCAD_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD__URI = MMCLEVFLATMCAD_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD__REFERENCED_ELEMENT = MMCLEVFLATMCAD_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD__TARGETS = MMCLEVFLATMCAD_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MFlatMCAD</em>' class.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD_FEATURE_COUNT = MMCLEVFLATMCAD_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADTargetImpl <em>MFlatMCADTarget</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADTargetImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatMCADTarget()
	 * @generated
	 */
	int MFLAT_MCAD_TARGET = 1;

	/**
	 * The feature id for the '<em><b>DeploymentPlatform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD_TARGET__DEPLOYMENT_PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>LeafDeploymentAlternative</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD_TARGET__LEAF_DEPLOYMENT_ALTERNATIVE = 1;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS = 2;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD_TARGET__LIBRARIES = 3;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD_TARGET__COMPONENTS = 4;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD_TARGET__CONNECTIONS = 5;

	/**
	 * The number of structural features of the '<em>MFlatMCADTarget</em>' class.
	 * @generated
	 * @ordered
	 */
	int MFLAT_MCAD_TARGET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatServiceLibraryInstanceImpl <em>MFlatService LibraryInstance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatServiceLibraryInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatServiceLibraryInstance()
	 * @generated
	 */
	int MFLAT_SERVICE_LIBRARY_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Library</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_SERVICE_LIBRARY_INSTANCE__LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MFLAT_SERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS = 1;

	/**
	 * The number of structural features of the '<em>MFlatService LibraryInstance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MFLAT_SERVICE_LIBRARY_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatDriverSLibInstanceImpl <em>MFlatDriverSLibInstance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatDriverSLibInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatDriverSLibInstance()
	 * @generated
	 */
	int MFLAT_DRIVER_SLIB_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Library</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_DRIVER_SLIB_INSTANCE__LIBRARY = MFLAT_SERVICE_LIBRARY_INSTANCE__LIBRARY;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MFLAT_DRIVER_SLIB_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS = MFLAT_SERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>DeviceDriverMappings</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MFLAT_DRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS = MFLAT_SERVICE_LIBRARY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MFlatDriverSLibInstance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MFLAT_DRIVER_SLIB_INSTANCE_FEATURE_COUNT = MFLAT_SERVICE_LIBRARY_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatComponentInstanceImpl <em>MFlatComponentInstance</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatComponentInstanceImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatComponentInstance()
	 * @generated
	 */
	int MFLAT_COMPONENT_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MFLAT_COMPONENT_INSTANCE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_COMPONENT_INSTANCE__COMPONENT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MFLAT_COMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MFlatComponentInstance</em>' class.
	 * @generated
	 * @ordered
	 */
	int MFLAT_COMPONENT_INSTANCE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatConnectionImpl <em>MFlatConnection</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatConnectionImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatConnection()
	 * @generated
	 */
	int MFLAT_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>ClientInstance</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_CONNECTION__CLIENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>ClientPort</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_CONNECTION__CLIENT_PORT = 1;

	/**
	 * The feature id for the '<em><b>ServerInstance</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_CONNECTION__SERVER_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>ServerPort</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_CONNECTION__SERVER_PORT = 3;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_CONNECTION__CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>IfaceMapping</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_CONNECTION__IFACE_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>AttributeValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MFLAT_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS = 6;

	/**
	 * The number of structural features of the '<em>MFlatConnection</em>' class.
	 * @generated
	 * @ordered
	 */
	int MFLAT_CONNECTION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MMCLEVFLATMCADPackageFileImpl <em>MMCLEVFLATMCADPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MMCLEVFLATMCADPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMMCLEVFLATMCADPackageFile()
	 * @generated
	 */
	int MMCLEVFLATMCAD_PACKAGE_FILE = 6;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVFLATMCAD_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMCLEVFLATMCAD_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMCLEVFLATMCAD_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMCLEVFLATMCADPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMCLEVFLATMCAD_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatDeviceDriverMappingImpl <em>MFlatDeviceDriverMapping</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatDeviceDriverMappingImpl
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatDeviceDriverMapping()
	 * @generated
	 */
	int MFLAT_DEVICE_DRIVER_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>DeployedDevice</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_DEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>SupportedDevice</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MFLAT_DEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE = 1;

	/**
	 * The number of structural features of the '<em>MFlatDeviceDriverMapping</em>' class.
	 * @generated
	 * @ordered
	 */
	int MFLAT_DEVICE_DRIVER_MAPPING_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD <em>MFlatMCAD</em>}'.
	 * @return the meta object for class '<em>MFlatMCAD</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD
	 * @generated
	 */
	EClass getMFlatMCAD();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD#getTargets <em>Targets</em>}'.
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD#getTargets()
	 * @see #getMFlatMCAD()
	 * @generated
	 */
	EReference getMFlatMCAD_Targets();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget <em>MFlatMCADTarget</em>}'.
	 * @return the meta object for class '<em>MFlatMCADTarget</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget
	 * @generated
	 */
	EClass getMFlatMCADTarget();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getDeploymentPlatform <em>DeploymentPlatform</em>}'.
	 * @return the meta object for the reference '<em>DeploymentPlatform</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getDeploymentPlatform()
	 * @see #getMFlatMCADTarget()
	 * @generated
	 */
	EReference getMFlatMCADTarget_DeploymentPlatform();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getLeafDeploymentAlternative <em>LeafDeploymentAlternative</em>}'.
	 * @return the meta object for the reference '<em>LeafDeploymentAlternative</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getLeafDeploymentAlternative()
	 * @see #getMFlatMCADTarget()
	 * @generated
	 */
	EReference getMFlatMCADTarget_LeafDeploymentAlternative();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getAttributeValueAssignments()
	 * @see #getMFlatMCADTarget()
	 * @generated
	 */
	EReference getMFlatMCADTarget_AttributeValueAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getLibraries <em>Libraries</em>}'.
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getLibraries()
	 * @see #getMFlatMCADTarget()
	 * @generated
	 */
	EReference getMFlatMCADTarget_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getComponents <em>Components</em>}'.
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getComponents()
	 * @see #getMFlatMCADTarget()
	 * @generated
	 */
	EReference getMFlatMCADTarget_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getConnections <em>Connections</em>}'.
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget#getConnections()
	 * @see #getMFlatMCADTarget()
	 * @generated
	 */
	EReference getMFlatMCADTarget_Connections();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance <em>MFlatService LibraryInstance</em>}'.
	 * @return the meta object for class '<em>MFlatService LibraryInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance
	 * @generated
	 */
	EClass getMFlatServiceLibraryInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance#getLibrary <em>Library</em>}'.
	 * @return the meta object for the reference '<em>Library</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance#getLibrary()
	 * @see #getMFlatServiceLibraryInstance()
	 * @generated
	 */
	EReference getMFlatServiceLibraryInstance_Library();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance#getAttributeValueAssignments()
	 * @see #getMFlatServiceLibraryInstance()
	 * @generated
	 */
	EReference getMFlatServiceLibraryInstance_AttributeValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance <em>MFlatDriverSLibInstance</em>}'.
	 * @return the meta object for class '<em>MFlatDriverSLibInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance
	 * @generated
	 */
	EClass getMFlatDriverSLibInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance#getDeviceDriverMappings <em>DeviceDriverMappings</em>}'.
	 * @return the meta object for the containment reference list '<em>DeviceDriverMappings</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance#getDeviceDriverMappings()
	 * @see #getMFlatDriverSLibInstance()
	 * @generated
	 */
	EReference getMFlatDriverSLibInstance_DeviceDriverMappings();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance <em>MFlatComponentInstance</em>}'.
	 * @return the meta object for class '<em>MFlatComponentInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance
	 * @generated
	 */
	EClass getMFlatComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance#getComponent <em>Component</em>}'.
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance#getComponent()
	 * @see #getMFlatComponentInstance()
	 * @generated
	 */
	EReference getMFlatComponentInstance_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance#getAttributeValueAssignments()
	 * @see #getMFlatComponentInstance()
	 * @generated
	 */
	EReference getMFlatComponentInstance_AttributeValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection <em>MFlatConnection</em>}'.
	 * @return the meta object for class '<em>MFlatConnection</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection
	 * @generated
	 */
	EClass getMFlatConnection();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getClientInstance <em>ClientInstance</em>}'.
	 * @return the meta object for the reference '<em>ClientInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getClientInstance()
	 * @see #getMFlatConnection()
	 * @generated
	 */
	EReference getMFlatConnection_ClientInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getClientPort <em>ClientPort</em>}'.
	 * @return the meta object for the reference '<em>ClientPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getClientPort()
	 * @see #getMFlatConnection()
	 * @generated
	 */
	EReference getMFlatConnection_ClientPort();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getServerInstance <em>ServerInstance</em>}'.
	 * @return the meta object for the reference '<em>ServerInstance</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getServerInstance()
	 * @see #getMFlatConnection()
	 * @generated
	 */
	EReference getMFlatConnection_ServerInstance();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getServerPort <em>ServerPort</em>}'.
	 * @return the meta object for the reference '<em>ServerPort</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getServerPort()
	 * @see #getMFlatConnection()
	 * @generated
	 */
	EReference getMFlatConnection_ServerPort();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getConnector <em>Connector</em>}'.
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getConnector()
	 * @see #getMFlatConnection()
	 * @generated
	 */
	EReference getMFlatConnection_Connector();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getIfaceMapping <em>IfaceMapping</em>}'.
	 * @return the meta object for the reference '<em>IfaceMapping</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getIfaceMapping()
	 * @see #getMFlatConnection()
	 * @generated
	 */
	EReference getMFlatConnection_IfaceMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getAttributeValueAssignments <em>AttributeValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>AttributeValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection#getAttributeValueAssignments()
	 * @see #getMFlatConnection()
	 * @generated
	 */
	EReference getMFlatConnection_AttributeValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile <em>MMCLEVFLATMCADPackageFile</em>}'.
	 * @return the meta object for class '<em>MMCLEVFLATMCADPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile
	 * @generated
	 */
	EClass getMMCLEVFLATMCADPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageElement <em>MMCLEVFLATMCADPackageElement</em>}'.
	 * @return the meta object for class '<em>MMCLEVFLATMCADPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageElement
	 * @generated
	 */
	EClass getMMCLEVFLATMCADPackageElement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping <em>MFlatDeviceDriverMapping</em>}'.
	 * @return the meta object for class '<em>MFlatDeviceDriverMapping</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping
	 * @generated
	 */
	EClass getMFlatDeviceDriverMapping();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping#getDeployedDevice <em>DeployedDevice</em>}'.
	 * @return the meta object for the reference '<em>DeployedDevice</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping#getDeployedDevice()
	 * @see #getMFlatDeviceDriverMapping()
	 * @generated
	 */
	EReference getMFlatDeviceDriverMapping_DeployedDevice();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping#getSupportedDevice <em>SupportedDevice</em>}'.
	 * @return the meta object for the reference '<em>SupportedDevice</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping#getSupportedDevice()
	 * @see #getMFlatDeviceDriverMapping()
	 * @generated
	 */
	EReference getMFlatDeviceDriverMapping_SupportedDevice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mclevflatmcadFactory getmclevflatmcadFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADImpl <em>MFlatMCAD</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatMCAD()
		 * @generated
		 */
		EClass MFLAT_MCAD = eINSTANCE.getMFlatMCAD();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MFLAT_MCAD__TARGETS = eINSTANCE.getMFlatMCAD_Targets();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADTargetImpl <em>MFlatMCADTarget</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatMCADTargetImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatMCADTarget()
		 * @generated
		 */
		EClass MFLAT_MCAD_TARGET = eINSTANCE.getMFlatMCADTarget();

		/**
		 * The meta object literal for the '<em><b>DeploymentPlatform</b></em>' reference feature.
		 * @generated
		 */
		EReference MFLAT_MCAD_TARGET__DEPLOYMENT_PLATFORM = eINSTANCE.getMFlatMCADTarget_DeploymentPlatform();

		/**
		 * The meta object literal for the '<em><b>LeafDeploymentAlternative</b></em>' reference feature.
		 * @generated
		 */
		EReference MFLAT_MCAD_TARGET__LEAF_DEPLOYMENT_ALTERNATIVE = eINSTANCE.getMFlatMCADTarget_LeafDeploymentAlternative();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMFlatMCADTarget_AttributeValueAssignments();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MFLAT_MCAD_TARGET__LIBRARIES = eINSTANCE.getMFlatMCADTarget_Libraries();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MFLAT_MCAD_TARGET__COMPONENTS = eINSTANCE.getMFlatMCADTarget_Components();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MFLAT_MCAD_TARGET__CONNECTIONS = eINSTANCE.getMFlatMCADTarget_Connections();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatServiceLibraryInstanceImpl <em>MFlatService LibraryInstance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatServiceLibraryInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatServiceLibraryInstance()
		 * @generated
		 */
		EClass MFLAT_SERVICE_LIBRARY_INSTANCE = eINSTANCE.getMFlatServiceLibraryInstance();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' reference feature.
		 * @generated
		 */
		EReference MFLAT_SERVICE_LIBRARY_INSTANCE__LIBRARY = eINSTANCE.getMFlatServiceLibraryInstance_Library();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MFLAT_SERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMFlatServiceLibraryInstance_AttributeValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatDriverSLibInstanceImpl <em>MFlatDriverSLibInstance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatDriverSLibInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatDriverSLibInstance()
		 * @generated
		 */
		EClass MFLAT_DRIVER_SLIB_INSTANCE = eINSTANCE.getMFlatDriverSLibInstance();

		/**
		 * The meta object literal for the '<em><b>DeviceDriverMappings</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MFLAT_DRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS = eINSTANCE.getMFlatDriverSLibInstance_DeviceDriverMappings();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatComponentInstanceImpl <em>MFlatComponentInstance</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatComponentInstanceImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatComponentInstance()
		 * @generated
		 */
		EClass MFLAT_COMPONENT_INSTANCE = eINSTANCE.getMFlatComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * @generated
		 */
		EReference MFLAT_COMPONENT_INSTANCE__COMPONENT = eINSTANCE.getMFlatComponentInstance_Component();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MFLAT_COMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMFlatComponentInstance_AttributeValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatConnectionImpl <em>MFlatConnection</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatConnectionImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatConnection()
		 * @generated
		 */
		EClass MFLAT_CONNECTION = eINSTANCE.getMFlatConnection();

		/**
		 * The meta object literal for the '<em><b>ClientInstance</b></em>' reference feature.
		 * @generated
		 */
		EReference MFLAT_CONNECTION__CLIENT_INSTANCE = eINSTANCE.getMFlatConnection_ClientInstance();

		/**
		 * The meta object literal for the '<em><b>ClientPort</b></em>' reference feature.
		 * @generated
		 */
		EReference MFLAT_CONNECTION__CLIENT_PORT = eINSTANCE.getMFlatConnection_ClientPort();

		/**
		 * The meta object literal for the '<em><b>ServerInstance</b></em>' reference feature.
		 * @generated
		 */
		EReference MFLAT_CONNECTION__SERVER_INSTANCE = eINSTANCE.getMFlatConnection_ServerInstance();

		/**
		 * The meta object literal for the '<em><b>ServerPort</b></em>' reference feature.
		 * @generated
		 */
		EReference MFLAT_CONNECTION__SERVER_PORT = eINSTANCE.getMFlatConnection_ServerPort();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * @generated
		 */
		EReference MFLAT_CONNECTION__CONNECTOR = eINSTANCE.getMFlatConnection_Connector();

		/**
		 * The meta object literal for the '<em><b>IfaceMapping</b></em>' reference feature.
		 * @generated
		 */
		EReference MFLAT_CONNECTION__IFACE_MAPPING = eINSTANCE.getMFlatConnection_IfaceMapping();

		/**
		 * The meta object literal for the '<em><b>AttributeValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MFLAT_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS = eINSTANCE.getMFlatConnection_AttributeValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MMCLEVFLATMCADPackageFileImpl <em>MMCLEVFLATMCADPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MMCLEVFLATMCADPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMMCLEVFLATMCADPackageFile()
		 * @generated
		 */
		EClass MMCLEVFLATMCAD_PACKAGE_FILE = eINSTANCE.getMMCLEVFLATMCADPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MMCLEVFLATMCADPackageElementImpl <em>MMCLEVFLATMCADPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MMCLEVFLATMCADPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMMCLEVFLATMCADPackageElement()
		 * @generated
		 */
		EClass MMCLEVFLATMCAD_PACKAGE_ELEMENT = eINSTANCE.getMMCLEVFLATMCADPackageElement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatDeviceDriverMappingImpl <em>MFlatDeviceDriverMapping</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.MFlatDeviceDriverMappingImpl
		 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl.mclevflatmcadPackageImpl#getMFlatDeviceDriverMapping()
		 * @generated
		 */
		EClass MFLAT_DEVICE_DRIVER_MAPPING = eINSTANCE.getMFlatDeviceDriverMapping();

		/**
		 * The meta object literal for the '<em><b>DeployedDevice</b></em>' reference feature.
		 * @generated
		 */
		EReference MFLAT_DEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE = eINSTANCE.getMFlatDeviceDriverMapping_DeployedDevice();

		/**
		 * The meta object literal for the '<em><b>SupportedDevice</b></em>' reference feature.
		 * @generated
		 */
		EReference MFLAT_DEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE = eINSTANCE.getMFlatDeviceDriverMapping_SupportedDevice();

	}

} //mclevflatmcadPackage
