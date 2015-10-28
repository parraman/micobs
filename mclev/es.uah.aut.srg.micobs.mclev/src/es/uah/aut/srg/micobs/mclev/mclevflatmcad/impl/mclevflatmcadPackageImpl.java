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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadFactory;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class mclevflatmcadPackageImpl extends EPackageImpl implements mclevflatmcadPackage {
	/**
	 * @generated
	 */
	private EClass mFlatMCADEClass = null;

	/**
	 * @generated
	 */
	private EClass mFlatMCADTargetEClass = null;

	/**
	 * @generated
	 */
	private EClass mFlatServiceLibraryInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mFlatDriverSLibInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mFlatComponentInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mFlatConnectionEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevflatmcadPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevflatmcadPackageElementEClass = null;

	/**
	 * @generated
	 */
	private EClass mFlatDeviceDriverMappingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mclevflatmcadPackageImpl() {
		super(eNS_URI, mclevflatmcadFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mclevflatmcadPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mclevflatmcadPackage init() {
		if (isInited) return (mclevflatmcadPackage)EPackage.Registry.INSTANCE.getEPackage(mclevflatmcadPackage.eNS_URI);

		// Obtain or create and register package
		mclevflatmcadPackageImpl themclevflatmcadPackage = (mclevflatmcadPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mclevflatmcadPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mclevflatmcadPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mclevmcadPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themclevflatmcadPackage.createPackageContents();

		// Initialize created meta-data
		themclevflatmcadPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themclevflatmcadPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mclevflatmcadPackage.eNS_URI, themclevflatmcadPackage);
		return themclevflatmcadPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMFlatMCAD() {
		return mFlatMCADEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMFlatMCAD_Targets() {
		return (EReference)mFlatMCADEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMFlatMCADTarget() {
		return mFlatMCADTargetEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMFlatMCADTarget_DeploymentPlatform() {
		return (EReference)mFlatMCADTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatMCADTarget_LeafDeploymentAlternative() {
		return (EReference)mFlatMCADTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatMCADTarget_AttributeValueAssignments() {
		return (EReference)mFlatMCADTargetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatMCADTarget_Libraries() {
		return (EReference)mFlatMCADTargetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatMCADTarget_Components() {
		return (EReference)mFlatMCADTargetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatMCADTarget_Connections() {
		return (EReference)mFlatMCADTargetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EClass getMFlatServiceLibraryInstance() {
		return mFlatServiceLibraryInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMFlatServiceLibraryInstance_Library() {
		return (EReference)mFlatServiceLibraryInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatServiceLibraryInstance_AttributeValueAssignments() {
		return (EReference)mFlatServiceLibraryInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMFlatDriverSLibInstance() {
		return mFlatDriverSLibInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMFlatDriverSLibInstance_DeviceDriverMappings() {
		return (EReference)mFlatDriverSLibInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMFlatComponentInstance() {
		return mFlatComponentInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMFlatComponentInstance_Component() {
		return (EReference)mFlatComponentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatComponentInstance_AttributeValueAssignments() {
		return (EReference)mFlatComponentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMFlatConnection() {
		return mFlatConnectionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMFlatConnection_ClientInstance() {
		return (EReference)mFlatConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatConnection_ClientPort() {
		return (EReference)mFlatConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatConnection_ServerInstance() {
		return (EReference)mFlatConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatConnection_ServerPort() {
		return (EReference)mFlatConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatConnection_Connector() {
		return (EReference)mFlatConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatConnection_IfaceMapping() {
		return (EReference)mFlatConnectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatConnection_AttributeValueAssignments() {
		return (EReference)mFlatConnectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVFLATMCADPackageFile() {
		return mmclevflatmcadPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVFLATMCADPackageElement() {
		return mmclevflatmcadPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMFlatDeviceDriverMapping() {
		return mFlatDeviceDriverMappingEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMFlatDeviceDriverMapping_DeployedDevice() {
		return (EReference)mFlatDeviceDriverMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMFlatDeviceDriverMapping_SupportedDevice() {
		return (EReference)mFlatDeviceDriverMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public mclevflatmcadFactory getmclevflatmcadFactory() {
		return (mclevflatmcadFactory)getEFactoryInstance();
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
		mFlatMCADEClass = createEClass(MFLAT_MCAD);
		createEReference(mFlatMCADEClass, MFLAT_MCAD__TARGETS);

		mFlatMCADTargetEClass = createEClass(MFLAT_MCAD_TARGET);
		createEReference(mFlatMCADTargetEClass, MFLAT_MCAD_TARGET__DEPLOYMENT_PLATFORM);
		createEReference(mFlatMCADTargetEClass, MFLAT_MCAD_TARGET__LEAF_DEPLOYMENT_ALTERNATIVE);
		createEReference(mFlatMCADTargetEClass, MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS);
		createEReference(mFlatMCADTargetEClass, MFLAT_MCAD_TARGET__LIBRARIES);
		createEReference(mFlatMCADTargetEClass, MFLAT_MCAD_TARGET__COMPONENTS);
		createEReference(mFlatMCADTargetEClass, MFLAT_MCAD_TARGET__CONNECTIONS);

		mFlatServiceLibraryInstanceEClass = createEClass(MFLAT_SERVICE_LIBRARY_INSTANCE);
		createEReference(mFlatServiceLibraryInstanceEClass, MFLAT_SERVICE_LIBRARY_INSTANCE__LIBRARY);
		createEReference(mFlatServiceLibraryInstanceEClass, MFLAT_SERVICE_LIBRARY_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS);

		mFlatDriverSLibInstanceEClass = createEClass(MFLAT_DRIVER_SLIB_INSTANCE);
		createEReference(mFlatDriverSLibInstanceEClass, MFLAT_DRIVER_SLIB_INSTANCE__DEVICE_DRIVER_MAPPINGS);

		mFlatComponentInstanceEClass = createEClass(MFLAT_COMPONENT_INSTANCE);
		createEReference(mFlatComponentInstanceEClass, MFLAT_COMPONENT_INSTANCE__COMPONENT);
		createEReference(mFlatComponentInstanceEClass, MFLAT_COMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS);

		mFlatConnectionEClass = createEClass(MFLAT_CONNECTION);
		createEReference(mFlatConnectionEClass, MFLAT_CONNECTION__CLIENT_INSTANCE);
		createEReference(mFlatConnectionEClass, MFLAT_CONNECTION__CLIENT_PORT);
		createEReference(mFlatConnectionEClass, MFLAT_CONNECTION__SERVER_INSTANCE);
		createEReference(mFlatConnectionEClass, MFLAT_CONNECTION__SERVER_PORT);
		createEReference(mFlatConnectionEClass, MFLAT_CONNECTION__CONNECTOR);
		createEReference(mFlatConnectionEClass, MFLAT_CONNECTION__IFACE_MAPPING);
		createEReference(mFlatConnectionEClass, MFLAT_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS);

		mmclevflatmcadPackageFileEClass = createEClass(MMCLEVFLATMCAD_PACKAGE_FILE);

		mmclevflatmcadPackageElementEClass = createEClass(MMCLEVFLATMCAD_PACKAGE_ELEMENT);

		mFlatDeviceDriverMappingEClass = createEClass(MFLAT_DEVICE_DRIVER_MAPPING);
		createEReference(mFlatDeviceDriverMappingEClass, MFLAT_DEVICE_DRIVER_MAPPING__DEPLOYED_DEVICE);
		createEReference(mFlatDeviceDriverMappingEClass, MFLAT_DEVICE_DRIVER_MAPPING__SUPPORTED_DEVICE);
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
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);
		mclevmcadPackage themclevmcadPackage = (mclevmcadPackage)EPackage.Registry.INSTANCE.getEPackage(mclevmcadPackage.eNS_URI);
		mclevslibPackage themclevslibPackage = (mclevslibPackage)EPackage.Registry.INSTANCE.getEPackage(mclevslibPackage.eNS_URI);
		mclevcmpPackage themclevcmpPackage = (mclevcmpPackage)EPackage.Registry.INSTANCE.getEPackage(mclevcmpPackage.eNS_URI);
		mclevdomPackage themclevdomPackage = (mclevdomPackage)EPackage.Registry.INSTANCE.getEPackage(mclevdomPackage.eNS_URI);
		mclevimapPackage themclevimapPackage = (mclevimapPackage)EPackage.Registry.INSTANCE.getEPackage(mclevimapPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mFlatMCADEClass.getESuperTypes().add(this.getMMCLEVFLATMCADPackageElement());
		mFlatMCADEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageReferencingElement());
		mFlatDriverSLibInstanceEClass.getESuperTypes().add(this.getMFlatServiceLibraryInstance());
		mFlatComponentInstanceEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mmclevflatmcadPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmclevflatmcadPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes and features; add operations and parameters
		initEClass(mFlatMCADEClass, MFlatMCAD.class, "MFlatMCAD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFlatMCAD_Targets(), this.getMFlatMCADTarget(), null, "targets", null, 1, -1, MFlatMCAD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mFlatMCADTargetEClass, MFlatMCADTarget.class, "MFlatMCADTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFlatMCADTarget_DeploymentPlatform(), themclevmcadPackage.getMDeploymentPlatform(), null, "deploymentPlatform", null, 1, 1, MFlatMCADTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatMCADTarget_LeafDeploymentAlternative(), themclevmcadPackage.getMDeploymentAlternative(), null, "leafDeploymentAlternative", null, 0, 1, MFlatMCADTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatMCADTarget_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MFlatMCADTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatMCADTarget_Libraries(), this.getMFlatServiceLibraryInstance(), null, "libraries", null, 0, -1, MFlatMCADTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatMCADTarget_Components(), this.getMFlatComponentInstance(), null, "components", null, 0, -1, MFlatMCADTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatMCADTarget_Connections(), this.getMFlatConnection(), null, "connections", null, 0, -1, MFlatMCADTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mFlatServiceLibraryInstanceEClass, MFlatServiceLibraryInstance.class, "MFlatServiceLibraryInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFlatServiceLibraryInstance_Library(), themclevslibPackage.getMServiceLibrary(), null, "library", null, 1, 1, MFlatServiceLibraryInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatServiceLibraryInstance_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MFlatServiceLibraryInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mFlatDriverSLibInstanceEClass, MFlatDriverSLibInstance.class, "MFlatDriverSLibInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFlatDriverSLibInstance_DeviceDriverMappings(), this.getMFlatDeviceDriverMapping(), null, "deviceDriverMappings", null, 0, -1, MFlatDriverSLibInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mFlatComponentInstanceEClass, MFlatComponentInstance.class, "MFlatComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFlatComponentInstance_Component(), themclevcmpPackage.getMComponent(), null, "component", null, 1, 1, MFlatComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatComponentInstance_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MFlatComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mFlatConnectionEClass, MFlatConnection.class, "MFlatConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFlatConnection_ClientInstance(), this.getMFlatComponentInstance(), null, "clientInstance", null, 1, 1, MFlatConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatConnection_ClientPort(), themclevcmpPackage.getMClientPort(), null, "clientPort", null, 1, 1, MFlatConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatConnection_ServerInstance(), this.getMFlatComponentInstance(), null, "serverInstance", null, 1, 1, MFlatConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatConnection_ServerPort(), themclevcmpPackage.getMServerPort(), null, "serverPort", null, 1, 1, MFlatConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatConnection_Connector(), themclevdomPackage.getMConnector(), null, "connector", null, 1, 1, MFlatConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatConnection_IfaceMapping(), themclevimapPackage.getMInterfaceMapping(), null, "ifaceMapping", null, 0, 1, MFlatConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatConnection_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MFlatConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmclevflatmcadPackageFileEClass, MMCLEVFLATMCADPackageFile.class, "MMCLEVFLATMCADPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevflatmcadPackageElementEClass, MMCLEVFLATMCADPackageElement.class, "MMCLEVFLATMCADPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mFlatDeviceDriverMappingEClass, MFlatDeviceDriverMapping.class, "MFlatDeviceDriverMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMFlatDeviceDriverMapping_DeployedDevice(), themclevmcadPackage.getMDeployedDevice(), null, "deployedDevice", null, 1, 1, MFlatDeviceDriverMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMFlatDeviceDriverMapping_SupportedDevice(), themclevslibPackage.getMDriverSLibSupportedDevice(), null, "supportedDevice", null, 1, 1, MFlatDeviceDriverMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

}