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
package es.uah.aut.srg.micobs.mclev.mclevmcad.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadFactory;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class mclevmcadPackageImpl extends EPackageImpl implements mclevmcadPackage {
	/**
	 * @generated
	 */
	private EClass mmcaDeploymentEClass = null;

	/**
	 * @generated
	 */
	private EClass mServiceLibraryInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mDriverSLibInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mDeviceDriverMappingEClass = null;

	/**
	 * @generated
	 */
	private EClass mComponentInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mDeploymentAlternativeEClass = null;

	/**
	 * @generated
	 */
	private EClass mConnectionEClass = null;

	/**
	 * @generated
	 */
	private EClass mCommonConnectionEClass = null;

	/**
	 * @generated
	 */
	private EClass mConnectionSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mConnectionSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mDeploymentPlatformEClass = null;

	/**
	 * @generated
	 */
	private EClass mDeployedDeviceEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevmcadPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevmcadPackageElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mclevmcadPackageImpl() {
		super(eNS_URI, mclevmcadFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mclevmcadPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mclevmcadPackage init() {
		if (isInited) return (mclevmcadPackage)EPackage.Registry.INSTANCE.getEPackage(mclevmcadPackage.eNS_URI);

		// Obtain or create and register package
		mclevmcadPackageImpl themclevmcadPackage = (mclevmcadPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mclevmcadPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mclevmcadPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mclevcmpPackage.eINSTANCE.eClass();
		mclevslibPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themclevmcadPackage.createPackageContents();

		// Initialize created meta-data
		themclevmcadPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themclevmcadPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mclevmcadPackage.eNS_URI, themclevmcadPackage);
		return themclevmcadPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMMCADeployment() {
		return mmcaDeploymentEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMMCADeployment_Domain() {
		return (EReference)mmcaDeploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMMCADeployment_Libraries() {
		return (EReference)mmcaDeploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMMCADeployment_Components() {
		return (EReference)mmcaDeploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMMCADeployment_AttributeValueAssignments() {
		return (EReference)mmcaDeploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMMCADeployment_DeploymentAlternatives() {
		return (EReference)mmcaDeploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMMCADeployment_Connections() {
		return (EReference)mmcaDeploymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EReference getMMCADeployment_DeploymentPlatforms() {
		return (EReference)mmcaDeploymentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated
	 */
	public EClass getMServiceLibraryInstance() {
		return mServiceLibraryInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibraryInstance_Library() {
		return (EReference)mServiceLibraryInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibraryInstance_AttributeValueAssignments() {
		return (EReference)mServiceLibraryInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMDriverSLibInstance() {
		return mDriverSLibInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMDriverSLibInstance_DeviceDriverMappings() {
		return (EReference)mDriverSLibInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMDeviceDriverMapping() {
		return mDeviceDriverMappingEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMDeviceDriverMapping_DeployedDevice() {
		return (EReference)mDeviceDriverMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMDeviceDriverMapping_SupportedDevice() {
		return (EReference)mDeviceDriverMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMComponentInstance() {
		return mComponentInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMComponentInstance_Component() {
		return (EReference)mComponentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentInstance_AttributeValueAssignments() {
		return (EReference)mComponentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMDeploymentAlternative() {
		return mDeploymentAlternativeEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMDeploymentAlternative_DeploymentPlatforms() {
		return (EReference)mDeploymentAlternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMDeploymentAlternative_AttributeValueAssignments() {
		return (EReference)mDeploymentAlternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMDeploymentAlternative_Libraries() {
		return (EReference)mDeploymentAlternativeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMDeploymentAlternative_Components() {
		return (EReference)mDeploymentAlternativeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMDeploymentAlternative_DeploymentAlternatives() {
		return (EReference)mDeploymentAlternativeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMDeploymentAlternative_Connections() {
		return (EReference)mDeploymentAlternativeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EClass getMConnection() {
		return mConnectionEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMCommonConnection() {
		return mCommonConnectionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMCommonConnection_ClientInstance() {
		return (EReference)mCommonConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMCommonConnection_ClientPort() {
		return (EReference)mCommonConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMCommonConnection_ServerInstance() {
		return (EReference)mCommonConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMCommonConnection_ServerPort() {
		return (EReference)mCommonConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMCommonConnection_Connector() {
		return (EReference)mCommonConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMCommonConnection_IfaceMapping() {
		return (EReference)mCommonConnectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EReference getMCommonConnection_AttributeValueAssignments() {
		return (EReference)mCommonConnectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated
	 */
	public EClass getMConnectionSwitch() {
		return mConnectionSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMConnectionSwitch_ClientInstance() {
		return (EReference)mConnectionSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMConnectionSwitch_ClientPort() {
		return (EReference)mConnectionSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMConnectionSwitch_Cases() {
		return (EReference)mConnectionSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMConnectionSwitchCase() {
		return mConnectionSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMConnectionSwitchCase_Alternative() {
		return (EReference)mConnectionSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMConnectionSwitchCase_ServerInstance() {
		return (EReference)mConnectionSwitchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMConnectionSwitchCase_ServerPort() {
		return (EReference)mConnectionSwitchCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMConnectionSwitchCase_Connector() {
		return (EReference)mConnectionSwitchCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMConnectionSwitchCase_IfaceMapping() {
		return (EReference)mConnectionSwitchCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMConnectionSwitchCase_AttributeValueAssignments() {
		return (EReference)mConnectionSwitchCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EClass getMDeploymentPlatform() {
		return mDeploymentPlatformEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMDeploymentPlatform_Platform() {
		return (EReference)mDeploymentPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMDeploymentPlatform_ParameterValueAssignments() {
		return (EReference)mDeploymentPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMDeploymentPlatform_DeployedDevices() {
		return (EReference)mDeploymentPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMDeployedDevice() {
		return mDeployedDeviceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMDeployedDevice_Device() {
		return (EReference)mDeployedDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMDeployedDevice_ParameterValueAssignments() {
		return (EReference)mDeployedDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVMCADPackageFile() {
		return mmclevmcadPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVMCADPackageElement() {
		return mmclevmcadPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public mclevmcadFactory getmclevmcadFactory() {
		return (mclevmcadFactory)getEFactoryInstance();
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
		mmcaDeploymentEClass = createEClass(MMCA_DEPLOYMENT);
		createEReference(mmcaDeploymentEClass, MMCA_DEPLOYMENT__DOMAIN);
		createEReference(mmcaDeploymentEClass, MMCA_DEPLOYMENT__LIBRARIES);
		createEReference(mmcaDeploymentEClass, MMCA_DEPLOYMENT__COMPONENTS);
		createEReference(mmcaDeploymentEClass, MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS);
		createEReference(mmcaDeploymentEClass, MMCA_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES);
		createEReference(mmcaDeploymentEClass, MMCA_DEPLOYMENT__CONNECTIONS);
		createEReference(mmcaDeploymentEClass, MMCA_DEPLOYMENT__DEPLOYMENT_PLATFORMS);

		mServiceLibraryInstanceEClass = createEClass(MSERVICE_LIBRARY_INSTANCE);
		createEReference(mServiceLibraryInstanceEClass, MSERVICE_LIBRARY_INSTANCE__LIBRARY);
		createEReference(mServiceLibraryInstanceEClass, MSERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS);

		mDriverSLibInstanceEClass = createEClass(MDRIVER_SLIB_INSTANCE);
		createEReference(mDriverSLibInstanceEClass, MDRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS);

		mDeviceDriverMappingEClass = createEClass(MDEVICE_DRIVER_MAPPING);
		createEReference(mDeviceDriverMappingEClass, MDEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE);
		createEReference(mDeviceDriverMappingEClass, MDEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE);

		mComponentInstanceEClass = createEClass(MCOMPONENT_INSTANCE);
		createEReference(mComponentInstanceEClass, MCOMPONENT_INSTANCE__COMPONENT);
		createEReference(mComponentInstanceEClass, MCOMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS);

		mDeploymentAlternativeEClass = createEClass(MDEPLOYMENT_ALTERNATIVE);
		createEReference(mDeploymentAlternativeEClass, MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_PLATFORMS);
		createEReference(mDeploymentAlternativeEClass, MDEPLOYMENT_ALTERNATIVE__ATTRIBUTE_VALUE_ASSIGNMENTS);
		createEReference(mDeploymentAlternativeEClass, MDEPLOYMENT_ALTERNATIVE__LIBRARIES);
		createEReference(mDeploymentAlternativeEClass, MDEPLOYMENT_ALTERNATIVE__COMPONENTS);
		createEReference(mDeploymentAlternativeEClass, MDEPLOYMENT_ALTERNATIVE__DEPLOYMENT_ALTERNATIVES);
		createEReference(mDeploymentAlternativeEClass, MDEPLOYMENT_ALTERNATIVE__CONNECTIONS);

		mConnectionEClass = createEClass(MCONNECTION);

		mCommonConnectionEClass = createEClass(MCOMMON_CONNECTION);
		createEReference(mCommonConnectionEClass, MCOMMON_CONNECTION__CLIENT_INSTANCE);
		createEReference(mCommonConnectionEClass, MCOMMON_CONNECTION__CLIENT_PORT);
		createEReference(mCommonConnectionEClass, MCOMMON_CONNECTION__SERVER_INSTANCE);
		createEReference(mCommonConnectionEClass, MCOMMON_CONNECTION__SERVER_PORT);
		createEReference(mCommonConnectionEClass, MCOMMON_CONNECTION__CONNECTOR);
		createEReference(mCommonConnectionEClass, MCOMMON_CONNECTION__IFACE_MAPPING);
		createEReference(mCommonConnectionEClass, MCOMMON_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS);

		mConnectionSwitchEClass = createEClass(MCONNECTION_SWITCH);
		createEReference(mConnectionSwitchEClass, MCONNECTION_SWITCH__CLIENT_INSTANCE);
		createEReference(mConnectionSwitchEClass, MCONNECTION_SWITCH__CLIENT_PORT);
		createEReference(mConnectionSwitchEClass, MCONNECTION_SWITCH__CASES);

		mConnectionSwitchCaseEClass = createEClass(MCONNECTION_SWITCH_CASE);
		createEReference(mConnectionSwitchCaseEClass, MCONNECTION_SWITCH_CASE__ALTERNATIVE);
		createEReference(mConnectionSwitchCaseEClass, MCONNECTION_SWITCH_CASE__SERVER_INSTANCE);
		createEReference(mConnectionSwitchCaseEClass, MCONNECTION_SWITCH_CASE__SERVER_PORT);
		createEReference(mConnectionSwitchCaseEClass, MCONNECTION_SWITCH_CASE__CONNECTOR);
		createEReference(mConnectionSwitchCaseEClass, MCONNECTION_SWITCH_CASE__IFACE_MAPPING);
		createEReference(mConnectionSwitchCaseEClass, MCONNECTION_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS);

		mDeploymentPlatformEClass = createEClass(MDEPLOYMENT_PLATFORM);
		createEReference(mDeploymentPlatformEClass, MDEPLOYMENT_PLATFORM__PLATFORM);
		createEReference(mDeploymentPlatformEClass, MDEPLOYMENT_PLATFORM__PARAMETER_VALUE_ASSIGNMENTS);
		createEReference(mDeploymentPlatformEClass, MDEPLOYMENT_PLATFORM__DEPLOYED_DEVICES);

		mDeployedDeviceEClass = createEClass(MDEPLOYED_DEVICE);
		createEReference(mDeployedDeviceEClass, MDEPLOYED_DEVICE__DEVICE);
		createEReference(mDeployedDeviceEClass, MDEPLOYED_DEVICE__PARAMETER_VALUE_ASSIGNMENTS);

		mmclevmcadPackageFileEClass = createEClass(MMCLEVMCAD_PACKAGE_FILE);

		mmclevmcadPackageElementEClass = createEClass(MMCLEVMCAD_PACKAGE_ELEMENT);
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
		mclevdomPackage themclevdomPackage = (mclevdomPackage)EPackage.Registry.INSTANCE.getEPackage(mclevdomPackage.eNS_URI);
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);
		mclevslibPackage themclevslibPackage = (mclevslibPackage)EPackage.Registry.INSTANCE.getEPackage(mclevslibPackage.eNS_URI);
		mclevcmpPackage themclevcmpPackage = (mclevcmpPackage)EPackage.Registry.INSTANCE.getEPackage(mclevcmpPackage.eNS_URI);
		mclevimapPackage themclevimapPackage = (mclevimapPackage)EPackage.Registry.INSTANCE.getEPackage(mclevimapPackage.eNS_URI);
		pdlPackage thepdlPackage = (pdlPackage)EPackage.Registry.INSTANCE.getEPackage(pdlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mmcaDeploymentEClass.getESuperTypes().add(this.getMMCLEVMCADPackageElement());
		mDriverSLibInstanceEClass.getESuperTypes().add(this.getMServiceLibraryInstance());
		mComponentInstanceEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mDeploymentAlternativeEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mCommonConnectionEClass.getESuperTypes().add(this.getMConnection());
		mConnectionSwitchEClass.getESuperTypes().add(this.getMConnection());
		mDeploymentPlatformEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mDeployedDeviceEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mmclevmcadPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmclevmcadPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes and features; add operations and parameters
		initEClass(mmcaDeploymentEClass, MMCADeployment.class, "MMCADeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMCADeployment_Domain(), themclevdomPackage.getMDomain(), null, "domain", null, 1, 1, MMCADeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMCADeployment_Libraries(), this.getMServiceLibraryInstance(), null, "libraries", null, 0, -1, MMCADeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMCADeployment_Components(), this.getMComponentInstance(), null, "components", null, 0, -1, MMCADeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMCADeployment_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MMCADeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMCADeployment_DeploymentAlternatives(), this.getMDeploymentAlternative(), null, "deploymentAlternatives", null, 0, -1, MMCADeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMCADeployment_Connections(), this.getMConnection(), null, "connections", null, 0, -1, MMCADeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMCADeployment_DeploymentPlatforms(), this.getMDeploymentPlatform(), null, "deploymentPlatforms", null, 0, -1, MMCADeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mServiceLibraryInstanceEClass, MServiceLibraryInstance.class, "MServiceLibraryInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMServiceLibraryInstance_Library(), themclevslibPackage.getMServiceLibrary(), null, "library", null, 1, 1, MServiceLibraryInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibraryInstance_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MServiceLibraryInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDriverSLibInstanceEClass, MDriverSLibInstance.class, "MDriverSLibInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDriverSLibInstance_DeviceDriverMappings(), this.getMDeviceDriverMapping(), null, "deviceDriverMappings", null, 0, -1, MDriverSLibInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDeviceDriverMappingEClass, MDeviceDriverMapping.class, "MDeviceDriverMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDeviceDriverMapping_DeployedDevice(), this.getMDeployedDevice(), null, "deployedDevice", null, 1, 1, MDeviceDriverMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDeviceDriverMapping_SupportedDevice(), themclevslibPackage.getMDriverSLibSupportedDevice(), null, "supportedDevice", null, 1, 1, MDeviceDriverMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mComponentInstanceEClass, MComponentInstance.class, "MComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMComponentInstance_Component(), themclevcmpPackage.getMComponent(), null, "component", null, 1, 1, MComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentInstance_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDeploymentAlternativeEClass, MDeploymentAlternative.class, "MDeploymentAlternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDeploymentAlternative_DeploymentPlatforms(), this.getMDeploymentPlatform(), null, "deploymentPlatforms", null, 0, -1, MDeploymentAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDeploymentAlternative_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MDeploymentAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDeploymentAlternative_Libraries(), this.getMServiceLibraryInstance(), null, "libraries", null, 0, -1, MDeploymentAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDeploymentAlternative_Components(), this.getMComponentInstance(), null, "components", null, 0, -1, MDeploymentAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDeploymentAlternative_DeploymentAlternatives(), this.getMDeploymentAlternative(), null, "deploymentAlternatives", null, 0, -1, MDeploymentAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDeploymentAlternative_Connections(), this.getMConnection(), null, "connections", null, 0, -1, MDeploymentAlternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mConnectionEClass, MConnection.class, "MConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mCommonConnectionEClass, MCommonConnection.class, "MCommonConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMCommonConnection_ClientInstance(), this.getMComponentInstance(), null, "clientInstance", null, 1, 1, MCommonConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCommonConnection_ClientPort(), themclevcmpPackage.getMClientPort(), null, "clientPort", null, 1, 1, MCommonConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCommonConnection_ServerInstance(), this.getMComponentInstance(), null, "serverInstance", null, 1, 1, MCommonConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCommonConnection_ServerPort(), themclevcmpPackage.getMServerPort(), null, "serverPort", null, 1, 1, MCommonConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCommonConnection_Connector(), themclevdomPackage.getMConnector(), null, "connector", null, 1, 1, MCommonConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCommonConnection_IfaceMapping(), themclevimapPackage.getMInterfaceMapping(), null, "ifaceMapping", null, 0, 1, MCommonConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCommonConnection_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MCommonConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mConnectionSwitchEClass, MConnectionSwitch.class, "MConnectionSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMConnectionSwitch_ClientInstance(), this.getMComponentInstance(), null, "clientInstance", null, 1, 1, MConnectionSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConnectionSwitch_ClientPort(), themclevcmpPackage.getMClientPort(), null, "clientPort", null, 1, 1, MConnectionSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConnectionSwitch_Cases(), this.getMConnectionSwitchCase(), null, "cases", null, 1, -1, MConnectionSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mConnectionSwitchCaseEClass, MConnectionSwitchCase.class, "MConnectionSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMConnectionSwitchCase_Alternative(), this.getMDeploymentAlternative(), null, "alternative", null, 1, 1, MConnectionSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConnectionSwitchCase_ServerInstance(), this.getMComponentInstance(), null, "serverInstance", null, 1, 1, MConnectionSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConnectionSwitchCase_ServerPort(), themclevcmpPackage.getMServerPort(), null, "serverPort", null, 1, 1, MConnectionSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConnectionSwitchCase_Connector(), themclevdomPackage.getMConnector(), null, "connector", null, 1, 1, MConnectionSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConnectionSwitchCase_IfaceMapping(), themclevimapPackage.getMInterfaceMapping(), null, "ifaceMapping", null, 0, 1, MConnectionSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConnectionSwitchCase_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MConnectionSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDeploymentPlatformEClass, MDeploymentPlatform.class, "MDeploymentPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDeploymentPlatform_Platform(), thepdlPackage.getMPlatform(), null, "platform", null, 1, 1, MDeploymentPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDeploymentPlatform_ParameterValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "parameterValueAssignments", null, 0, -1, MDeploymentPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDeploymentPlatform_DeployedDevices(), this.getMDeployedDevice(), null, "deployedDevices", null, 0, -1, MDeploymentPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDeployedDeviceEClass, MDeployedDevice.class, "MDeployedDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDeployedDevice_Device(), thepdlPackage.getMDevice(), null, "device", null, 1, 1, MDeployedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDeployedDevice_ParameterValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "parameterValueAssignments", null, 0, -1, MDeployedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmclevmcadPackageFileEClass, MMCLEVMCADPackageFile.class, "MMCLEVMCADPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevmcadPackageElementEClass, MMCLEVMCADPackageElement.class, "MMCLEVMCADPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}