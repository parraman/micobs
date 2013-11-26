/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.mesp.mespdep.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageElement;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepFactory;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class mespdepPackageImpl extends EPackageImpl implements mespdepPackage {
	/**
	 * @generated
	 */
	private EClass mmespDeploymentEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespDeploymentPlatformEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespDeployedDeviceEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespDeploymentAlternativeEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespSwPackageDeploymentEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespDriverSwPackageDeploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mmespDeviceDriverMappingEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespdepPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespdepPackageElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mespdepPackageImpl() {
		super(eNS_URI, mespdepFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mespdepPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mespdepPackage init() {
		if (isInited) return (mespdepPackage)EPackage.Registry.INSTANCE.getEPackage(mespdepPackage.eNS_URI);

		// Obtain or create and register package
		mespdepPackageImpl themespdepPackage = (mespdepPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mespdepPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mespdepPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mesppswpPackage.eINSTANCE.eClass();
		mespswpPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themespdepPackage.createPackageContents();

		// Initialize created meta-data
		themespdepPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themespdepPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mespdepPackage.eNS_URI, themespdepPackage);
		return themespdepPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPDeployment() {
		return mmespDeploymentEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeployment_Ctool() {
		return (EReference)mmespDeploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeployment_Languages() {
		return (EReference)mmespDeploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeployment_Requires() {
		return (EReference)mmespDeploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeployment_DeployedSwPackages() {
		return (EReference)mmespDeploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeployment_DeploymentAlternatives() {
		return (EReference)mmespDeploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeployment_DeploymentPlatforms() {
		return (EReference)mmespDeploymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EClass getMMESPDeploymentPlatform() {
		return mmespDeploymentPlatformEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeploymentPlatform_PlatformSwPackage() {
		return (EReference)mmespDeploymentPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeploymentPlatform_Platform() {
		return (EReference)mmespDeploymentPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeploymentPlatform_ParameterValueAssignments() {
		return (EReference)mmespDeploymentPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeploymentPlatform_DeployedDevices() {
		return (EReference)mmespDeploymentPlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EClass getMMESPDeployedDevice() {
		return mmespDeployedDeviceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeployedDevice_Device() {
		return (EReference)mmespDeployedDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeployedDevice_ParameterValueAssignments() {
		return (EReference)mmespDeployedDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMMESPDeploymentAlternative() {
		return mmespDeploymentAlternativeEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeploymentAlternative_DeploymentPlatforms() {
		return (EReference)mmespDeploymentAlternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeploymentAlternative_Languages() {
		return (EReference)mmespDeploymentAlternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeploymentAlternative_Requires() {
		return (EReference)mmespDeploymentAlternativeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeploymentAlternative_DeployedSwPackages() {
		return (EReference)mmespDeploymentAlternativeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPDeploymentAlternative_DeploymentAlternatives() {
		return (EReference)mmespDeploymentAlternativeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EClass getMMESPSwPackageDeployment() {
		return mmespSwPackageDeploymentEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMMESPSwPackageDeployment_SwPackage() {
		return (EReference)mmespSwPackageDeploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMMESPSwPackageDeployment_ParameterValueAssignments() {
		return (EReference)mmespSwPackageDeploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMMESPDriverSwPackageDeployment() {
		return mmespDriverSwPackageDeploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMESPDriverSwPackageDeployment_DeviceDriverMappings() {
		return (EReference)mmespDriverSwPackageDeploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMESPDeviceDriverMapping() {
		return mmespDeviceDriverMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMESPDeviceDriverMapping_DeployedDevice() {
		return (EReference)mmespDeviceDriverMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMMESPDeviceDriverMapping_SupportedDevice() {
		return (EReference)mmespDeviceDriverMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMMESPDEPPackageFile() {
		return mmespdepPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPDEPPackageElement() {
		return mmespdepPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public mespdepFactory getmespdepFactory() {
		return (mespdepFactory)getEFactoryInstance();
	}

	/**
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mmespDeploymentEClass = createEClass(MMESP_DEPLOYMENT);
		createEReference(mmespDeploymentEClass, MMESP_DEPLOYMENT__CTOOL);
		createEReference(mmespDeploymentEClass, MMESP_DEPLOYMENT__LANGUAGES);
		createEReference(mmespDeploymentEClass, MMESP_DEPLOYMENT__REQUIRES);
		createEReference(mmespDeploymentEClass, MMESP_DEPLOYMENT__DEPLOYED_SW_PACKAGES);
		createEReference(mmespDeploymentEClass, MMESP_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES);
		createEReference(mmespDeploymentEClass, MMESP_DEPLOYMENT__DEPLOYMENT_PLATFORMS);

		mmespDeploymentPlatformEClass = createEClass(MMESP_DEPLOYMENT_PLATFORM);
		createEReference(mmespDeploymentPlatformEClass, MMESP_DEPLOYMENT_PLATFORM__PLATFORM_SW_PACKAGE);
		createEReference(mmespDeploymentPlatformEClass, MMESP_DEPLOYMENT_PLATFORM__PLATFORM);
		createEReference(mmespDeploymentPlatformEClass, MMESP_DEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS);
		createEReference(mmespDeploymentPlatformEClass, MMESP_DEPLOYMENT_PLATFORM__DEPLOYED_DEVICES);

		mmespDeployedDeviceEClass = createEClass(MMESP_DEPLOYED_DEVICE);
		createEReference(mmespDeployedDeviceEClass, MMESP_DEPLOYED_DEVICE__DEVICE);
		createEReference(mmespDeployedDeviceEClass, MMESP_DEPLOYED_DEVICE__PARAMETER_VALUE_ASSIGNMENTS);

		mmespDeploymentAlternativeEClass = createEClass(MMESP_DEPLOYMENT_ALTERNATIVE);
		createEReference(mmespDeploymentAlternativeEClass, MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS);
		createEReference(mmespDeploymentAlternativeEClass, MMESP_DEPLOYMENT_ALTERNATIVE__LANGUAGES);
		createEReference(mmespDeploymentAlternativeEClass, MMESP_DEPLOYMENT_ALTERNATIVE__REQUIRES);
		createEReference(mmespDeploymentAlternativeEClass, MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYED_SW_PACKAGES);
		createEReference(mmespDeploymentAlternativeEClass, MMESP_DEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES);

		mmespSwPackageDeploymentEClass = createEClass(MMESP_SW_PACKAGE_DEPLOYMENT);
		createEReference(mmespSwPackageDeploymentEClass, MMESP_SW_PACKAGE_DEPLOYMENT__SW_PACKAGE);
		createEReference(mmespSwPackageDeploymentEClass, MMESP_SW_PACKAGE_DEPLOYMENT__PARAMETER_VALUE_ASSIGNMENTS);

		mmespDriverSwPackageDeploymentEClass = createEClass(MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT);
		createEReference(mmespDriverSwPackageDeploymentEClass, MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT__DEVICE_DRIVER_MAPPINGS);

		mmespDeviceDriverMappingEClass = createEClass(MMESP_DEVICE_DRIVER_MAPPING);
		createEReference(mmespDeviceDriverMappingEClass, MMESP_DEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE);
		createEReference(mmespDeviceDriverMappingEClass, MMESP_DEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE);

		mmespdepPackageFileEClass = createEClass(MMESPDEP_PACKAGE_FILE);

		mmespdepPackageElementEClass = createEClass(MMESPDEP_PACKAGE_ELEMENT);
	}

	/**
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		mespctoolPackage themespctoolPackage = (mespctoolPackage)EPackage.Registry.INSTANCE.getEPackage(mespctoolPackage.eNS_URI);
		systemPackage thesystemPackage = (systemPackage)EPackage.Registry.INSTANCE.getEPackage(systemPackage.eNS_URI);
		mespswpPackage themespswpPackage = (mespswpPackage)EPackage.Registry.INSTANCE.getEPackage(mespswpPackage.eNS_URI);
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);
		mesppswpPackage themesppswpPackage = (mesppswpPackage)EPackage.Registry.INSTANCE.getEPackage(mesppswpPackage.eNS_URI);
		pdlPackage thepdlPackage = (pdlPackage)EPackage.Registry.INSTANCE.getEPackage(pdlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mmespDeploymentEClass.getESuperTypes().add(this.getMMESPDEPPackageElement());
		mmespDeploymentPlatformEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mmespDeployedDeviceEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mmespDeploymentAlternativeEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mmespDriverSwPackageDeploymentEClass.getESuperTypes().add(this.getMMESPSwPackageDeployment());
		mmespdepPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmespdepPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes and features; add operations and parameters
		initEClass(mmespDeploymentEClass, MMESPDeployment.class, "MMESPDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMESPDeployment_Ctool(), themespctoolPackage.getMConstructionTool(), null, "ctool", null, 1, 1, MMESPDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeployment_Languages(), thesystemPackage.getMLanguage(), null, "languages", null, 0, -1, MMESPDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeployment_Requires(), themespswpPackage.getMSwPackageRequiredInterface(), null, "requires", null, 0, -1, MMESPDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeployment_DeployedSwPackages(), this.getMMESPSwPackageDeployment(), null, "deployedSwPackages", null, 0, -1, MMESPDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeployment_DeploymentAlternatives(), this.getMMESPDeploymentAlternative(), null, "deploymentAlternatives", null, 0, -1, MMESPDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeployment_DeploymentPlatforms(), this.getMMESPDeploymentPlatform(), null, "deploymentPlatforms", null, 1, -1, MMESPDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmespDeploymentPlatformEClass, MMESPDeploymentPlatform.class, "MMESPDeploymentPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMESPDeploymentPlatform_PlatformSwPackage(), themesppswpPackage.getMPlatformSwPackage(), null, "platformSwPackage", null, 1, 1, MMESPDeploymentPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeploymentPlatform_Platform(), thepdlPackage.getMPlatform(), null, "platform", null, 1, 1, MMESPDeploymentPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeploymentPlatform_ParameterValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "parameterValueAssignments", null, 0, -1, MMESPDeploymentPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeploymentPlatform_DeployedDevices(), this.getMMESPDeployedDevice(), null, "deployedDevices", null, 0, -1, MMESPDeploymentPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmespDeployedDeviceEClass, MMESPDeployedDevice.class, "MMESPDeployedDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMESPDeployedDevice_Device(), thepdlPackage.getMDevice(), null, "device", null, 1, 1, MMESPDeployedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeployedDevice_ParameterValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "parameterValueAssignments", null, 0, -1, MMESPDeployedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmespDeploymentAlternativeEClass, MMESPDeploymentAlternative.class, "MMESPDeploymentAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMESPDeploymentAlternative_DeploymentPlatforms(), this.getMMESPDeploymentPlatform(), null, "deploymentPlatforms", null, 1, -1, MMESPDeploymentAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeploymentAlternative_Languages(), thesystemPackage.getMLanguage(), null, "languages", null, 0, -1, MMESPDeploymentAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeploymentAlternative_Requires(), themespswpPackage.getMSwPackageRequiredInterface(), null, "requires", null, 0, -1, MMESPDeploymentAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeploymentAlternative_DeployedSwPackages(), this.getMMESPSwPackageDeployment(), null, "deployedSwPackages", null, 0, -1, MMESPDeploymentAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeploymentAlternative_DeploymentAlternatives(), this.getMMESPDeploymentAlternative(), null, "deploymentAlternatives", null, 0, -1, MMESPDeploymentAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmespSwPackageDeploymentEClass, MMESPSwPackageDeployment.class, "MMESPSwPackageDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMESPSwPackageDeployment_SwPackage(), themespswpPackage.getMSwPackage(), null, "swPackage", null, 1, 1, MMESPSwPackageDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPSwPackageDeployment_ParameterValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "parameterValueAssignments", null, 0, -1, MMESPSwPackageDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmespDriverSwPackageDeploymentEClass, MMESPDriverSwPackageDeployment.class, "MMESPDriverSwPackageDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMESPDriverSwPackageDeployment_DeviceDriverMappings(), this.getMMESPDeviceDriverMapping(), null, "deviceDriverMappings", null, 0, -1, MMESPDriverSwPackageDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmespDeviceDriverMappingEClass, MMESPDeviceDriverMapping.class, "MMESPDeviceDriverMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMESPDeviceDriverMapping_DeployedDevice(), this.getMMESPDeployedDevice(), null, "deployedDevice", null, 1, 1, MMESPDeviceDriverMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMESPDeviceDriverMapping_SupportedDevice(), themespswpPackage.getMDriverSwPackageSupportedDevice(), null, "supportedDevice", null, 1, 1, MMESPDeviceDriverMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmespdepPackageFileEClass, MMESPDEPPackageFile.class, "MMESPDEPPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespdepPackageElementEClass, MMESPDEPPackageElement.class, "MMESPDEPPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}
