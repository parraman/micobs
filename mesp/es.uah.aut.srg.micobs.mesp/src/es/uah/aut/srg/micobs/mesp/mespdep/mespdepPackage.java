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
package es.uah.aut.srg.micobs.mesp.mespdep;

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
 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepFactory
 * @model kind="package"
 * @generated
 */
public interface mespdepPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "mespdep";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mesp/mespdep";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mesp";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	mespdepPackage eINSTANCE = es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDEPPackageElementImpl <em>MMESPDEPPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDEPPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDEPPackageElement()
	 * @generated
	 */
	int MMESPDEP_PACKAGE_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPDEP_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPDEP_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESPDEP_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>MMESPDEPPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPDEP_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentImpl <em>MMESPDeployment</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDeployment()
	 * @generated
	 */
	int MMESP_DEPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT__VERSION = MMESPDEP_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT__NAME = MMESPDEP_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT__URI = MMESPDEP_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Ctool</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT__CTOOL = MMESPDEP_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT__LANGUAGES = MMESPDEP_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT__REQUIRES = MMESPDEP_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DeployedSwPackages</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT__DEPLOYED_SW_PACKAGES = MMESPDEP_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>DeploymentAlternatives</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES = MMESPDEP_PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>DeploymentPlatforms</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT__DEPLOYMENT_PLATFORMS = MMESPDEP_PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>MMESPDeployment</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_FEATURE_COUNT = MMESPDEP_PACKAGE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentPlatformImpl <em>MMESPDeployment Platform</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentPlatformImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDeploymentPlatform()
	 * @generated
	 */
	int MMESP_DEPLOYMENT_PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_PLATFORM__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>PlatformSwPackage</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_PLATFORM__PLATFORM_SW_PACKAGE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_PLATFORM__PLATFORM = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ParameterValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DeployedDevices</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_PLATFORM__DEPLOYED_DEVICES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MMESPDeployment Platform</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_PLATFORM_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeployedDeviceImpl <em>MMESPDeployedDevice</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeployedDeviceImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDeployedDevice()
	 * @generated
	 */
	int MMESP_DEPLOYED_DEVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYED_DEVICE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYED_DEVICE__DEVICE = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ParameterValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYED_DEVICE__PARAMETER_VALUE_ASSIGNMENTS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MMESPDeployedDevice</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYED_DEVICE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentAlternativeImpl <em>MMESPDeployment Alternative</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentAlternativeImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDeploymentAlternative()
	 * @generated
	 */
	int MMESP_DEPLOYMENT_ALTERNATIVE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_ALTERNATIVE__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>DeploymentPlatforms</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_ALTERNATIVE__LANGUAGES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_ALTERNATIVE__REQUIRES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DeployedSwPackages</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYED_SW_PACKAGES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>DeploymentAlternatives</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MMESPDeployment Alternative</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEPLOYMENT_ALTERNATIVE_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPSwPackageDeploymentImpl <em>MMESPSwPackageDeployment</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPSwPackageDeploymentImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPSwPackageDeployment()
	 * @generated
	 */
	int MMESP_SW_PACKAGE_DEPLOYMENT = 4;

	/**
	 * The feature id for the '<em><b>SwPackage</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESP_SW_PACKAGE_DEPLOYMENT__SW_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>ParameterValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_SW_PACKAGE_DEPLOYMENT__PARAMETER_VALUE_ASSIGNMENTS = 1;

	/**
	 * The number of structural features of the '<em>MMESPSwPackageDeployment</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_SW_PACKAGE_DEPLOYMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDriverSwPackageDeploymentImpl <em>MMESPDriver Sw Package Deployment</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDriverSwPackageDeploymentImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDriverSwPackageDeployment()
	 * @generated
	 */
	int MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT = 5;

	/**
	 * The feature id for the '<em><b>Sw Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT__SW_PACKAGE = MMESP_SW_PACKAGE_DEPLOYMENT__SW_PACKAGE;

	/**
	 * The feature id for the '<em><b>ParameterValueAssignments</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT__PARAMETER_VALUE_ASSIGNMENTS = MMESP_SW_PACKAGE_DEPLOYMENT__PARAMETER_VALUE_ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>DeviceDriverMappings</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT__DEVICE_DRIVER_MAPPINGS = MMESP_SW_PACKAGE_DEPLOYMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MMESPDriver Sw Package Deployment</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT_FEATURE_COUNT = MMESP_SW_PACKAGE_DEPLOYMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeviceDriverMappingImpl <em>MMESPDeviceDriverMapping</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeviceDriverMappingImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDeviceDriverMapping()
	 * @generated
	 */
	int MMESP_DEVICE_DRIVER_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>DeployedDevice</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>SupportedDevice</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE = 1;

	/**
	 * The number of structural features of the '<em>MMESPDeviceDriverMapping</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESP_DEVICE_DRIVER_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDEPPackageFileImpl <em>MMESPDEPPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDEPPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDEPPackageFile()
	 * @generated
	 */
	int MMESPDEP_PACKAGE_FILE = 7;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MMESPDEP_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MMESPDEP_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MMESPDEP_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>MMESPDEPPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MMESPDEP_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment <em>MMESPDeployment</em>}'.
	 * @return the meta object for class '<em>MMESPDeployment</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment
	 * @generated
	 */
	EClass getMMESPDeployment();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getCtool <em>Ctool</em>}'.
	 * @return the meta object for the reference '<em>Ctool</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getCtool()
	 * @see #getMMESPDeployment()
	 * @generated
	 */
	EReference getMMESPDeployment_Ctool();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getLanguages <em>Languages</em>}'.
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getLanguages()
	 * @see #getMMESPDeployment()
	 * @generated
	 */
	EReference getMMESPDeployment_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getRequires <em>Requires</em>}'.
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getRequires()
	 * @see #getMMESPDeployment()
	 * @generated
	 */
	EReference getMMESPDeployment_Requires();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getDeployedSwPackages <em>DeployedSwPackages</em>}'.
	 * @return the meta object for the containment reference list '<em>DeployedSwPackages</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getDeployedSwPackages()
	 * @see #getMMESPDeployment()
	 * @generated
	 */
	EReference getMMESPDeployment_DeployedSwPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getDeploymentAlternatives <em>DeploymentAlternatives</em>}'.
	 * @return the meta object for the containment reference list '<em>DeploymentAlternatives</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getDeploymentAlternatives()
	 * @see #getMMESPDeployment()
	 * @generated
	 */
	EReference getMMESPDeployment_DeploymentAlternatives();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getDeploymentPlatforms <em>DeploymentPlatforms</em>}'.
	 * @return the meta object for the containment reference list '<em>DeploymentPlatforms</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment#getDeploymentPlatforms()
	 * @see #getMMESPDeployment()
	 * @generated
	 */
	EReference getMMESPDeployment_DeploymentPlatforms();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform <em>MMESPDeployment Platform</em>}'.
	 * @return the meta object for class '<em>MMESPDeployment Platform</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform
	 * @generated
	 */
	EClass getMMESPDeploymentPlatform();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform#getPlatformSwPackage <em>PlatformSwPackage</em>}'.
	 * @return the meta object for the reference '<em>PlatformSwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform#getPlatformSwPackage()
	 * @see #getMMESPDeploymentPlatform()
	 * @generated
	 */
	EReference getMMESPDeploymentPlatform_PlatformSwPackage();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform#getPlatform <em>Platform</em>}'.
	 * @return the meta object for the reference '<em>Platform</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform#getPlatform()
	 * @see #getMMESPDeploymentPlatform()
	 * @generated
	 */
	EReference getMMESPDeploymentPlatform_Platform();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform#getParameterValueAssignments <em>ParameterValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>ParameterValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform#getParameterValueAssignments()
	 * @see #getMMESPDeploymentPlatform()
	 * @generated
	 */
	EReference getMMESPDeploymentPlatform_ParameterValueAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform#getDeployedDevices <em>DeployedDevices</em>}'.
	 * @return the meta object for the containment reference list '<em>DeployedDevices</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform#getDeployedDevices()
	 * @see #getMMESPDeploymentPlatform()
	 * @generated
	 */
	EReference getMMESPDeploymentPlatform_DeployedDevices();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice <em>MMESPDeployedDevice</em>}'.
	 * @return the meta object for class '<em>MMESPDeployedDevice</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice
	 * @generated
	 */
	EClass getMMESPDeployedDevice();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice#getDevice <em>Device</em>}'.
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice#getDevice()
	 * @see #getMMESPDeployedDevice()
	 * @generated
	 */
	EReference getMMESPDeployedDevice_Device();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice#getParameterValueAssignments <em>ParameterValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>ParameterValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice#getParameterValueAssignments()
	 * @see #getMMESPDeployedDevice()
	 * @generated
	 */
	EReference getMMESPDeployedDevice_ParameterValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative <em>MMESPDeployment Alternative</em>}'.
	 * @return the meta object for class '<em>MMESPDeployment Alternative</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative
	 * @generated
	 */
	EClass getMMESPDeploymentAlternative();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getDeploymentPlatforms <em>DeploymentPlatforms</em>}'.
	 * @return the meta object for the reference list '<em>DeploymentPlatforms</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getDeploymentPlatforms()
	 * @see #getMMESPDeploymentAlternative()
	 * @generated
	 */
	EReference getMMESPDeploymentAlternative_DeploymentPlatforms();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getLanguages <em>Languages</em>}'.
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getLanguages()
	 * @see #getMMESPDeploymentAlternative()
	 * @generated
	 */
	EReference getMMESPDeploymentAlternative_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getRequires <em>Requires</em>}'.
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getRequires()
	 * @see #getMMESPDeploymentAlternative()
	 * @generated
	 */
	EReference getMMESPDeploymentAlternative_Requires();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getDeployedSwPackages <em>DeployedSwPackages</em>}'.
	 * @return the meta object for the containment reference list '<em>DeployedSwPackages</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getDeployedSwPackages()
	 * @see #getMMESPDeploymentAlternative()
	 * @generated
	 */
	EReference getMMESPDeploymentAlternative_DeployedSwPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getDeploymentAlternatives <em>DeploymentAlternatives</em>}'.
	 * @return the meta object for the containment reference list '<em>DeploymentAlternatives</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative#getDeploymentAlternatives()
	 * @see #getMMESPDeploymentAlternative()
	 * @generated
	 */
	EReference getMMESPDeploymentAlternative_DeploymentAlternatives();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment <em>MMESPSwPackageDeployment</em>}'.
	 * @return the meta object for class '<em>MMESPSwPackageDeployment</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment
	 * @generated
	 */
	EClass getMMESPSwPackageDeployment();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment#getSwPackage <em>SwPackage</em>}'.
	 * @return the meta object for the reference '<em>SwPackage</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment#getSwPackage()
	 * @see #getMMESPSwPackageDeployment()
	 * @generated
	 */
	EReference getMMESPSwPackageDeployment_SwPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment#getParameterValueAssignments <em>ParameterValueAssignments</em>}'.
	 * @return the meta object for the containment reference list '<em>ParameterValueAssignments</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment#getParameterValueAssignments()
	 * @see #getMMESPSwPackageDeployment()
	 * @generated
	 */
	EReference getMMESPSwPackageDeployment_ParameterValueAssignments();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment <em>MMESPDriver Sw Package Deployment</em>}'.
	 * @return the meta object for class '<em>MMESPDriver Sw Package Deployment</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment
	 * @generated
	 */
	EClass getMMESPDriverSwPackageDeployment();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment#getDeviceDriverMappings <em>DeviceDriverMappings</em>}'.
	 * @return the meta object for the containment reference list '<em>DeviceDriverMappings</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment#getDeviceDriverMappings()
	 * @see #getMMESPDriverSwPackageDeployment()
	 * @generated
	 */
	EReference getMMESPDriverSwPackageDeployment_DeviceDriverMappings();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping <em>MMESPDeviceDriverMapping</em>}'.
	 * @return the meta object for class '<em>MMESPDeviceDriverMapping</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping
	 * @generated
	 */
	EClass getMMESPDeviceDriverMapping();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping#getDeployedDevice <em>DeployedDevice</em>}'.
	 * @return the meta object for the reference '<em>DeployedDevice</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping#getDeployedDevice()
	 * @see #getMMESPDeviceDriverMapping()
	 * @generated
	 */
	EReference getMMESPDeviceDriverMapping_DeployedDevice();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping#getSupportedDevice <em>SupportedDevice</em>}'.
	 * @return the meta object for the reference '<em>SupportedDevice</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping#getSupportedDevice()
	 * @see #getMMESPDeviceDriverMapping()
	 * @generated
	 */
	EReference getMMESPDeviceDriverMapping_SupportedDevice();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile <em>MMESPDEPPackageFile</em>}'.
	 * @return the meta object for class '<em>MMESPDEPPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile
	 * @generated
	 */
	EClass getMMESPDEPPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageElement <em>MMESPDEPPackageElement</em>}'.
	 * @return the meta object for class '<em>MMESPDEPPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageElement
	 * @generated
	 */
	EClass getMMESPDEPPackageElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mespdepFactory getmespdepFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentImpl <em>MMESPDeployment</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDeployment()
		 * @generated
		 */
		EClass MMESP_DEPLOYMENT = eINSTANCE.getMMESPDeployment();

		/**
		 * The meta object literal for the '<em><b>Ctool</b></em>' reference feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT__CTOOL = eINSTANCE.getMMESPDeployment_Ctool();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT__LANGUAGES = eINSTANCE.getMMESPDeployment_Languages();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT__REQUIRES = eINSTANCE.getMMESPDeployment_Requires();

		/**
		 * The meta object literal for the '<em><b>DeployedSwPackages</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT__DEPLOYED_SW_PACKAGES = eINSTANCE.getMMESPDeployment_DeployedSwPackages();

		/**
		 * The meta object literal for the '<em><b>DeploymentAlternatives</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES = eINSTANCE.getMMESPDeployment_DeploymentAlternatives();

		/**
		 * The meta object literal for the '<em><b>DeploymentPlatforms</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT__DEPLOYMENT_PLATFORMS = eINSTANCE.getMMESPDeployment_DeploymentPlatforms();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentPlatformImpl <em>MMESPDeployment Platform</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentPlatformImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDeploymentPlatform()
		 * @generated
		 */
		EClass MMESP_DEPLOYMENT_PLATFORM = eINSTANCE.getMMESPDeploymentPlatform();

		/**
		 * The meta object literal for the '<em><b>PlatformSwPackage</b></em>' reference feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT_PLATFORM__PLATFORM_SW_PACKAGE = eINSTANCE.getMMESPDeploymentPlatform_PlatformSwPackage();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT_PLATFORM__PLATFORM = eINSTANCE.getMMESPDeploymentPlatform_Platform();

		/**
		 * The meta object literal for the '<em><b>ParameterValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS = eINSTANCE.getMMESPDeploymentPlatform_ParameterValueAssignments();

		/**
		 * The meta object literal for the '<em><b>DeployedDevices</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT_PLATFORM__DEPLOYED_DEVICES = eINSTANCE.getMMESPDeploymentPlatform_DeployedDevices();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeployedDeviceImpl <em>MMESPDeployedDevice</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeployedDeviceImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDeployedDevice()
		 * @generated
		 */
		EClass MMESP_DEPLOYED_DEVICE = eINSTANCE.getMMESPDeployedDevice();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYED_DEVICE__DEVICE = eINSTANCE.getMMESPDeployedDevice_Device();

		/**
		 * The meta object literal for the '<em><b>ParameterValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYED_DEVICE__PARAMETER_VALUE_ASSIGNMENTS = eINSTANCE.getMMESPDeployedDevice_ParameterValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentAlternativeImpl <em>MMESPDeployment Alternative</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeploymentAlternativeImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDeploymentAlternative()
		 * @generated
		 */
		EClass MMESP_DEPLOYMENT_ALTERNATIVE = eINSTANCE.getMMESPDeploymentAlternative();

		/**
		 * The meta object literal for the '<em><b>DeploymentPlatforms</b></em>' reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS = eINSTANCE.getMMESPDeploymentAlternative_DeploymentPlatforms();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT_ALTERNATIVE__LANGUAGES = eINSTANCE.getMMESPDeploymentAlternative_Languages();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT_ALTERNATIVE__REQUIRES = eINSTANCE.getMMESPDeploymentAlternative_Requires();

		/**
		 * The meta object literal for the '<em><b>DeployedSwPackages</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYED_SW_PACKAGES = eINSTANCE.getMMESPDeploymentAlternative_DeployedSwPackages();

		/**
		 * The meta object literal for the '<em><b>DeploymentAlternatives</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES = eINSTANCE.getMMESPDeploymentAlternative_DeploymentAlternatives();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPSwPackageDeploymentImpl <em>MMESPSwPackageDeployment</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPSwPackageDeploymentImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPSwPackageDeployment()
		 * @generated
		 */
		EClass MMESP_SW_PACKAGE_DEPLOYMENT = eINSTANCE.getMMESPSwPackageDeployment();

		/**
		 * The meta object literal for the '<em><b>SwPackage</b></em>' reference feature.
		 * @generated
		 */
		EReference MMESP_SW_PACKAGE_DEPLOYMENT__SW_PACKAGE = eINSTANCE.getMMESPSwPackageDeployment_SwPackage();

		/**
		 * The meta object literal for the '<em><b>ParameterValueAssignments</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMESP_SW_PACKAGE_DEPLOYMENT__PARAMETER_VALUE_ASSIGNMENTS = eINSTANCE.getMMESPSwPackageDeployment_ParameterValueAssignments();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDriverSwPackageDeploymentImpl <em>MMESPDriver Sw Package Deployment</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDriverSwPackageDeploymentImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDriverSwPackageDeployment()
		 * @generated
		 */
		EClass MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT = eINSTANCE.getMMESPDriverSwPackageDeployment();

		/**
		 * The meta object literal for the '<em><b>DeviceDriverMappings</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT__DEVICE_DRIVER_MAPPINGS = eINSTANCE.getMMESPDriverSwPackageDeployment_DeviceDriverMappings();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeviceDriverMappingImpl <em>MMESPDeviceDriverMapping</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDeviceDriverMappingImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDeviceDriverMapping()
		 * @generated
		 */
		EClass MMESP_DEVICE_DRIVER_MAPPING = eINSTANCE.getMMESPDeviceDriverMapping();

		/**
		 * The meta object literal for the '<em><b>DeployedDevice</b></em>' reference feature.
		 * @generated
		 */
		EReference MMESP_DEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE = eINSTANCE.getMMESPDeviceDriverMapping_DeployedDevice();

		/**
		 * The meta object literal for the '<em><b>SupportedDevice</b></em>' reference feature.
		 * @generated
		 */
		EReference MMESP_DEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE = eINSTANCE.getMMESPDeviceDriverMapping_SupportedDevice();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDEPPackageFileImpl <em>MMESPDEPPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDEPPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDEPPackageFile()
		 * @generated
		 */
		EClass MMESPDEP_PACKAGE_FILE = eINSTANCE.getMMESPDEPPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDEPPackageElementImpl <em>MMESPDEPPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.MMESPDEPPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mesp.mespdep.impl.mespdepPackageImpl#getMMESPDEPPackageElement()
		 * @generated
		 */
		EClass MMESPDEP_PACKAGE_ELEMENT = eINSTANCE.getMMESPDEPPackageElement();

	}

}
