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
package es.uah.aut.srg.micobs.mclev.mclevcmp.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MBooleanParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MBooleanParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MEnumParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MEnumParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalConnection;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpFactory;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class mclevcmpPackageImpl extends EPackageImpl implements mclevcmpPackage {
	/**
	 * @generated
	 */
	private EClass mComponentEClass = null;

	/**
	 * @generated
	 */
	private EClass mAbstractComponentEClass = null;

	/**
	 * @generated
	 */
	private EClass mComponentSupportedPlatformEClass = null;

	/**
	 * @generated
	 */
	private EClass mInternalComponentInstanceEClass = null;

	/**
	 * @generated
	 */
	private EClass mPortEClass = null;

	/**
	 * @generated
	 */
	private EClass mServerPortEClass = null;

	/**
	 * @generated
	 */
	private EClass mClientPortEClass = null;

	/**
	 * @generated
	 */
	private EClass mInternalConnectionEClass = null;

	/**
	 * @generated
	 */
	private EClass mInternalComponentConnectionEClass = null;

	/**
	 * @generated
	 */
	private EClass mInternalComponentPlatformSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mInternalComponentPlatformSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevcmpPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevcmpPackageElementEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterCSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterCSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mBooleanParamCSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mBooleanParamCSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mStringParamCSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mStringParamCSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mIntegerParamCSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mIntegerParamCSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamCSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamCSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mRealParamCSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mRealParamCSPSwitchCaseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mclevcmpPackageImpl() {
		super(eNS_URI, mclevcmpFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mclevcmpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mclevcmpPackage init() {
		if (isInited) return (mclevcmpPackage)EPackage.Registry.INSTANCE.getEPackage(mclevcmpPackage.eNS_URI);

		// Obtain or create and register package
		mclevcmpPackageImpl themclevcmpPackage = (mclevcmpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mclevcmpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mclevcmpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mclevimapPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themclevcmpPackage.createPackageContents();

		// Initialize created meta-data
		themclevcmpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themclevcmpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mclevcmpPackage.eNS_URI, themclevcmpPackage);
		return themclevcmpPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMComponent() {
		return mComponentEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMComponent_Requires() {
		return (EReference)mComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMComponent_Languages() {
		return (EReference)mComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMComponent_InternalPorts() {
		return (EReference)mComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMComponent_SupportedPlatforms() {
		return (EReference)mComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMComponent_InternalComponents() {
		return (EReference)mComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMComponent_Connections() {
		return (EReference)mComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EClass getMAbstractComponent() {
		return mAbstractComponentEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMAbstractComponent_AttributeValueAssignments() {
		return (EReference)mAbstractComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMAbstractComponent_Domain() {
		return (EReference)mAbstractComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMAbstractComponent_Type() {
		return (EReference)mAbstractComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMAbstractComponent_Attributes() {
		return (EReference)mAbstractComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMAbstractComponent_Inherits() {
		return (EReference)mAbstractComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMAbstractComponent_ExternalPorts() {
		return (EReference)mAbstractComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EClass getMComponentSupportedPlatform() {
		return mComponentSupportedPlatformEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMComponentSupportedPlatform_Osapi() {
		return (EReference)mComponentSupportedPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentSupportedPlatform_Os() {
		return (EReference)mComponentSupportedPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentSupportedPlatform_Architecture() {
		return (EReference)mComponentSupportedPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentSupportedPlatform_Compiler() {
		return (EReference)mComponentSupportedPlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentSupportedPlatform_Microprocessor() {
		return (EReference)mComponentSupportedPlatformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentSupportedPlatform_Board() {
		return (EReference)mComponentSupportedPlatformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentSupportedPlatform_Requires() {
		return (EReference)mComponentSupportedPlatformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentSupportedPlatform_Languages() {
		return (EReference)mComponentSupportedPlatformEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentSupportedPlatform_AttributeValueAssignments() {
		return (EReference)mComponentSupportedPlatformEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentSupportedPlatform_InternalComponents() {
		return (EReference)mComponentSupportedPlatformEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentSupportedPlatform_Connections() {
		return (EReference)mComponentSupportedPlatformEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * @generated
	 */
	public EReference getMComponentSupportedPlatform_Attributes() {
		return (EReference)mComponentSupportedPlatformEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * @generated
	 */
	public EClass getMInternalComponentInstance() {
		return mInternalComponentInstanceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentInstance_Component() {
		return (EReference)mInternalComponentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMInternalComponentInstance_IsSingleton() {
		return (EAttribute)mInternalComponentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentInstance_AttributeValueAssignments() {
		return (EReference)mInternalComponentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMPort() {
		return mPortEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMPort_Type() {
		return (EReference)mPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMPort_Interface() {
		return (EReference)mPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMPort_AttributeValueAssignments() {
		return (EReference)mPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMServerPort() {
		return mServerPortEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMClientPort() {
		return mClientPortEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMInternalConnection() {
		return mInternalConnectionEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMInternalComponentConnection() {
		return mInternalComponentConnectionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentConnection_ClientInstance() {
		return (EReference)mInternalComponentConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentConnection_ClientPort() {
		return (EReference)mInternalComponentConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentConnection_ServerInstance() {
		return (EReference)mInternalComponentConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentConnection_ServerPort() {
		return (EReference)mInternalComponentConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentConnection_Connector() {
		return (EReference)mInternalComponentConnectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentConnection_IfaceMapping() {
		return (EReference)mInternalComponentConnectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentConnection_AttributeValueAssignments() {
		return (EReference)mInternalComponentConnectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated
	 */
	public EClass getMInternalComponentPlatformSwitch() {
		return mInternalComponentPlatformSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentPlatformSwitch_ClientInstance() {
		return (EReference)mInternalComponentPlatformSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentPlatformSwitch_ClientPort() {
		return (EReference)mInternalComponentPlatformSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentPlatformSwitch_Cases() {
		return (EReference)mInternalComponentPlatformSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMInternalComponentPlatformSwitchCase() {
		return mInternalComponentPlatformSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentPlatformSwitchCase_Platform() {
		return (EReference)mInternalComponentPlatformSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentPlatformSwitchCase_ServerInstance() {
		return (EReference)mInternalComponentPlatformSwitchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentPlatformSwitchCase_ServerPort() {
		return (EReference)mInternalComponentPlatformSwitchCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentPlatformSwitchCase_Connector() {
		return (EReference)mInternalComponentPlatformSwitchCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentPlatformSwitchCase_IfaceMapping() {
		return (EReference)mInternalComponentPlatformSwitchCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMInternalComponentPlatformSwitchCase_AttributeValueAssignments() {
		return (EReference)mInternalComponentPlatformSwitchCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVCMPPackageFile() {
		return mmclevcmpPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVCMPPackageElement() {
		return mmclevcmpPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMParameterCSPSwitch() {
		return mParameterCSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterCSPSwitch_Cases() {
		return (EReference)mParameterCSPSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterCSPSwitchCase() {
		return mParameterCSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterCSPSwitchCase_DefaultValue() {
		return (EReference)mParameterCSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMParameterCSPSwitchCase_Platform() {
		return (EReference)mParameterCSPSwitchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMBooleanParamCSPSwitch() {
		return mBooleanParamCSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMBooleanParamCSPSwitchCase() {
		return mBooleanParamCSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMStringParamCSPSwitch() {
		return mStringParamCSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMStringParamCSPSwitchCase() {
		return mStringParamCSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIntegerParamCSPSwitch() {
		return mIntegerParamCSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIntegerParamCSPSwitchCase() {
		return mIntegerParamCSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMIntegerParamCSPSwitchCase_Range() {
		return (EReference)mIntegerParamCSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamCSPSwitch() {
		return mEnumParamCSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamCSPSwitchCase() {
		return mEnumParamCSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMRealParamCSPSwitch() {
		return mRealParamCSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMRealParamCSPSwitchCase() {
		return mRealParamCSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMRealParamCSPSwitchCase_Range() {
		return (EReference)mRealParamCSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public mclevcmpFactory getmclevcmpFactory() {
		return (mclevcmpFactory)getEFactoryInstance();
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
		mComponentEClass = createEClass(MCOMPONENT);
		createEReference(mComponentEClass, MCOMPONENT__REQUIRES);
		createEReference(mComponentEClass, MCOMPONENT__LANGUAGES);
		createEReference(mComponentEClass, MCOMPONENT__INTERNAL_PORTS);
		createEReference(mComponentEClass, MCOMPONENT__SUPPORTED_PLATFORMS);
		createEReference(mComponentEClass, MCOMPONENT__INTERNAL_COMPONENTS);
		createEReference(mComponentEClass, MCOMPONENT__CONNECTIONS);

		mAbstractComponentEClass = createEClass(MABSTRACT_COMPONENT);
		createEReference(mAbstractComponentEClass, MABSTRACT_COMPONENT__ATTRIBUTE_VALUE_ASSIGNMENTS);
		createEReference(mAbstractComponentEClass, MABSTRACT_COMPONENT__DOMAIN);
		createEReference(mAbstractComponentEClass, MABSTRACT_COMPONENT__TYPE);
		createEReference(mAbstractComponentEClass, MABSTRACT_COMPONENT__ATTRIBUTES);
		createEReference(mAbstractComponentEClass, MABSTRACT_COMPONENT__INHERITS);
		createEReference(mAbstractComponentEClass, MABSTRACT_COMPONENT__EXTERNAL_PORTS);

		mComponentSupportedPlatformEClass = createEClass(MCOMPONENT_SUPPORTED_PLATFORM);
		createEReference(mComponentSupportedPlatformEClass, MCOMPONENT_SUPPORTED_PLATFORM__OSAPI);
		createEReference(mComponentSupportedPlatformEClass, MCOMPONENT_SUPPORTED_PLATFORM__OS);
		createEReference(mComponentSupportedPlatformEClass, MCOMPONENT_SUPPORTED_PLATFORM__ARCHITECTURE);
		createEReference(mComponentSupportedPlatformEClass, MCOMPONENT_SUPPORTED_PLATFORM__COMPILER);
		createEReference(mComponentSupportedPlatformEClass, MCOMPONENT_SUPPORTED_PLATFORM__MICROPROCESSOR);
		createEReference(mComponentSupportedPlatformEClass, MCOMPONENT_SUPPORTED_PLATFORM__BOARD);
		createEReference(mComponentSupportedPlatformEClass, MCOMPONENT_SUPPORTED_PLATFORM__REQUIRES);
		createEReference(mComponentSupportedPlatformEClass, MCOMPONENT_SUPPORTED_PLATFORM__LANGUAGES);
		createEReference(mComponentSupportedPlatformEClass, MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTE_VALUE_ASSIGNMENTS);
		createEReference(mComponentSupportedPlatformEClass, MCOMPONENT_SUPPORTED_PLATFORM__INTERNAL_COMPONENTS);
		createEReference(mComponentSupportedPlatformEClass, MCOMPONENT_SUPPORTED_PLATFORM__CONNECTIONS);
		createEReference(mComponentSupportedPlatformEClass, MCOMPONENT_SUPPORTED_PLATFORM__ATTRIBUTES);

		mInternalComponentInstanceEClass = createEClass(MINTERNAL_COMPONENT_INSTANCE);
		createEReference(mInternalComponentInstanceEClass, MINTERNAL_COMPONENT_INSTANCE__COMPONENT);
		createEAttribute(mInternalComponentInstanceEClass, MINTERNAL_COMPONENT_INSTANCE__IS_SINGLETON);
		createEReference(mInternalComponentInstanceEClass, MINTERNAL_COMPONENT_INSTANCE__ATTRIBUTE_VALUE_ASSIGNMENTS);

		mPortEClass = createEClass(MPORT);
		createEReference(mPortEClass, MPORT__TYPE);
		createEReference(mPortEClass, MPORT__INTERFACE);
		createEReference(mPortEClass, MPORT__ATTRIBUTE_VALUE_ASSIGNMENTS);

		mServerPortEClass = createEClass(MSERVER_PORT);

		mClientPortEClass = createEClass(MCLIENT_PORT);

		mInternalConnectionEClass = createEClass(MINTERNAL_CONNECTION);

		mInternalComponentConnectionEClass = createEClass(MINTERNAL_COMPONENT_CONNECTION);
		createEReference(mInternalComponentConnectionEClass, MINTERNAL_COMPONENT_CONNECTION__CLIENT_INSTANCE);
		createEReference(mInternalComponentConnectionEClass, MINTERNAL_COMPONENT_CONNECTION__CLIENT_PORT);
		createEReference(mInternalComponentConnectionEClass, MINTERNAL_COMPONENT_CONNECTION__SERVER_INSTANCE);
		createEReference(mInternalComponentConnectionEClass, MINTERNAL_COMPONENT_CONNECTION__SERVER_PORT);
		createEReference(mInternalComponentConnectionEClass, MINTERNAL_COMPONENT_CONNECTION__CONNECTOR);
		createEReference(mInternalComponentConnectionEClass, MINTERNAL_COMPONENT_CONNECTION__IFACE_MAPPING);
		createEReference(mInternalComponentConnectionEClass, MINTERNAL_COMPONENT_CONNECTION__ATTRIBUTE_VALUE_ASSIGNMENTS);

		mInternalComponentPlatformSwitchEClass = createEClass(MINTERNAL_COMPONENT_PLATFORM_SWITCH);
		createEReference(mInternalComponentPlatformSwitchEClass, MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_INSTANCE);
		createEReference(mInternalComponentPlatformSwitchEClass, MINTERNAL_COMPONENT_PLATFORM_SWITCH__CLIENT_PORT);
		createEReference(mInternalComponentPlatformSwitchEClass, MINTERNAL_COMPONENT_PLATFORM_SWITCH__CASES);

		mInternalComponentPlatformSwitchCaseEClass = createEClass(MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE);
		createEReference(mInternalComponentPlatformSwitchCaseEClass, MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__PLATFORM);
		createEReference(mInternalComponentPlatformSwitchCaseEClass, MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_INSTANCE);
		createEReference(mInternalComponentPlatformSwitchCaseEClass, MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__SERVER_PORT);
		createEReference(mInternalComponentPlatformSwitchCaseEClass, MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__CONNECTOR);
		createEReference(mInternalComponentPlatformSwitchCaseEClass, MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__IFACE_MAPPING);
		createEReference(mInternalComponentPlatformSwitchCaseEClass, MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE__ATTRIBUTE_VALUE_ASSIGNMENTS);

		mmclevcmpPackageFileEClass = createEClass(MMCLEVCMP_PACKAGE_FILE);

		mmclevcmpPackageElementEClass = createEClass(MMCLEVCMP_PACKAGE_ELEMENT);

		mParameterCSPSwitchEClass = createEClass(MPARAMETER_CSP_SWITCH);
		createEReference(mParameterCSPSwitchEClass, MPARAMETER_CSP_SWITCH__CASES);

		mParameterCSPSwitchCaseEClass = createEClass(MPARAMETER_CSP_SWITCH_CASE);
		createEReference(mParameterCSPSwitchCaseEClass, MPARAMETER_CSP_SWITCH_CASE__DEFAULT_VALUE);
		createEReference(mParameterCSPSwitchCaseEClass, MPARAMETER_CSP_SWITCH_CASE__PLATFORM);

		mBooleanParamCSPSwitchEClass = createEClass(MBOOLEAN_PARAM_CSP_SWITCH);

		mBooleanParamCSPSwitchCaseEClass = createEClass(MBOOLEAN_PARAM_CSP_SWITCH_CASE);

		mStringParamCSPSwitchEClass = createEClass(MSTRING_PARAM_CSP_SWITCH);

		mStringParamCSPSwitchCaseEClass = createEClass(MSTRING_PARAM_CSP_SWITCH_CASE);

		mIntegerParamCSPSwitchEClass = createEClass(MINTEGER_PARAM_CSP_SWITCH);

		mIntegerParamCSPSwitchCaseEClass = createEClass(MINTEGER_PARAM_CSP_SWITCH_CASE);
		createEReference(mIntegerParamCSPSwitchCaseEClass, MINTEGER_PARAM_CSP_SWITCH_CASE__RANGE);

		mEnumParamCSPSwitchEClass = createEClass(MENUM_PARAM_CSP_SWITCH);

		mEnumParamCSPSwitchCaseEClass = createEClass(MENUM_PARAM_CSP_SWITCH_CASE);

		mRealParamCSPSwitchEClass = createEClass(MREAL_PARAM_CSP_SWITCH);

		mRealParamCSPSwitchCaseEClass = createEClass(MREAL_PARAM_CSP_SWITCH_CASE);
		createEReference(mRealParamCSPSwitchCaseEClass, MREAL_PARAM_CSP_SWITCH_CASE__RANGE);
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
		mclevsaiPackage themclevsaiPackage = (mclevsaiPackage)EPackage.Registry.INSTANCE.getEPackage(mclevsaiPackage.eNS_URI);
		systemPackage thesystemPackage = (systemPackage)EPackage.Registry.INSTANCE.getEPackage(systemPackage.eNS_URI);
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);
		mclevdomPackage themclevdomPackage = (mclevdomPackage)EPackage.Registry.INSTANCE.getEPackage(mclevdomPackage.eNS_URI);
		pdlPackage thepdlPackage = (pdlPackage)EPackage.Registry.INSTANCE.getEPackage(pdlPackage.eNS_URI);
		mclevifacePackage themclevifacePackage = (mclevifacePackage)EPackage.Registry.INSTANCE.getEPackage(mclevifacePackage.eNS_URI);
		mclevimapPackage themclevimapPackage = (mclevimapPackage)EPackage.Registry.INSTANCE.getEPackage(mclevimapPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mComponentEClass.getESuperTypes().add(this.getMMCLEVCMPPackageElement());
		mComponentEClass.getESuperTypes().add(this.getMAbstractComponent());
		mAbstractComponentEClass.getESuperTypes().add(this.getMMCLEVCMPPackageElement());
		mComponentSupportedPlatformEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mInternalComponentInstanceEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mPortEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mServerPortEClass.getESuperTypes().add(this.getMPort());
		mClientPortEClass.getESuperTypes().add(this.getMPort());
		mInternalComponentConnectionEClass.getESuperTypes().add(this.getMInternalConnection());
		mInternalComponentPlatformSwitchEClass.getESuperTypes().add(this.getMInternalConnection());
		mmclevcmpPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmclevcmpPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());
		mParameterCSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMParameter());
		mBooleanParamCSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMBooleanParameter());
		mBooleanParamCSPSwitchEClass.getESuperTypes().add(this.getMParameterCSPSwitch());
		mBooleanParamCSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterCSPSwitchCase());
		mStringParamCSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMStringParameter());
		mStringParamCSPSwitchEClass.getESuperTypes().add(this.getMParameterCSPSwitch());
		mStringParamCSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterCSPSwitchCase());
		mIntegerParamCSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMIntegerParameter());
		mIntegerParamCSPSwitchEClass.getESuperTypes().add(this.getMParameterCSPSwitch());
		mIntegerParamCSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterCSPSwitchCase());
		mEnumParamCSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMEnumParameter());
		mEnumParamCSPSwitchEClass.getESuperTypes().add(this.getMParameterCSPSwitch());
		mEnumParamCSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterCSPSwitchCase());
		mRealParamCSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMRealParameter());
		mRealParamCSPSwitchEClass.getESuperTypes().add(this.getMParameterCSPSwitch());
		mRealParamCSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterCSPSwitchCase());

		// Initialize classes and features; add operations and parameters
		initEClass(mComponentEClass, MComponent.class, "MComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMComponent_Requires(), themclevsaiPackage.getMSAI(), null, "requires", null, 0, -1, MComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponent_Languages(), thesystemPackage.getMLanguage(), null, "languages", null, 0, -1, MComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponent_InternalPorts(), this.getMPort(), null, "internalPorts", null, 0, -1, MComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponent_SupportedPlatforms(), this.getMComponentSupportedPlatform(), null, "supportedPlatforms", null, 0, -1, MComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponent_InternalComponents(), this.getMInternalComponentInstance(), null, "internalComponents", null, 0, -1, MComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponent_Connections(), this.getMInternalConnection(), null, "connections", null, 0, -1, MComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mAbstractComponentEClass, MAbstractComponent.class, "MAbstractComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAbstractComponent_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MAbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAbstractComponent_Domain(), themclevdomPackage.getMDomain(), null, "domain", null, 1, 1, MAbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAbstractComponent_Type(), themclevdomPackage.getMComponentType(), null, "type", null, 1, 1, MAbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAbstractComponent_Attributes(), thecommonPackage.getMParameter(), null, "attributes", null, 0, -1, MAbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAbstractComponent_Inherits(), this.getMAbstractComponent(), null, "inherits", null, 0, -1, MAbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAbstractComponent_ExternalPorts(), this.getMPort(), null, "externalPorts", null, 0, -1, MAbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mComponentSupportedPlatformEClass, MComponentSupportedPlatform.class, "MComponentSupportedPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMComponentSupportedPlatform_Osapi(), thepdlPackage.getMOperatingSystemAPI(), null, "osapi", null, 0, 1, MComponentSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentSupportedPlatform_Os(), thepdlPackage.getMOperatingSystem(), null, "os", null, 0, 1, MComponentSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentSupportedPlatform_Architecture(), thepdlPackage.getMArchitecture(), null, "architecture", null, 0, 1, MComponentSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentSupportedPlatform_Compiler(), thepdlPackage.getMCompiler(), null, "compiler", null, 0, 1, MComponentSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentSupportedPlatform_Microprocessor(), thepdlPackage.getMMicroprocessor(), null, "microprocessor", null, 0, 1, MComponentSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentSupportedPlatform_Board(), thepdlPackage.getMBoard(), null, "board", null, 0, 1, MComponentSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentSupportedPlatform_Requires(), themclevsaiPackage.getMSAI(), null, "requires", null, 0, -1, MComponentSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentSupportedPlatform_Languages(), thesystemPackage.getMLanguage(), null, "languages", null, 0, -1, MComponentSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentSupportedPlatform_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MComponentSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentSupportedPlatform_InternalComponents(), this.getMInternalComponentInstance(), null, "internalComponents", null, 0, -1, MComponentSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentSupportedPlatform_Connections(), this.getMInternalComponentConnection(), null, "connections", null, 0, -1, MComponentSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMComponentSupportedPlatform_Attributes(), thecommonPackage.getMParameter(), null, "attributes", null, 0, -1, MComponentSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mInternalComponentInstanceEClass, MInternalComponentInstance.class, "MInternalComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMInternalComponentInstance_Component(), this.getMComponent(), null, "component", null, 1, 1, MInternalComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMInternalComponentInstance_IsSingleton(), ecorePackage.getEBoolean(), "isSingleton", null, 1, 1, MInternalComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentInstance_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MInternalComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mPortEClass, MPort.class, "MPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMPort_Type(), themclevdomPackage.getMPortType(), null, "type", null, 1, 1, MPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPort_Interface(), themclevifacePackage.getMInterface(), null, "interface", null, 1, 1, MPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPort_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mServerPortEClass, MServerPort.class, "MServerPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mClientPortEClass, MClientPort.class, "MClientPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mInternalConnectionEClass, MInternalConnection.class, "MInternalConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mInternalComponentConnectionEClass, MInternalComponentConnection.class, "MInternalComponentConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMInternalComponentConnection_ClientInstance(), this.getMInternalComponentInstance(), null, "clientInstance", null, 0, 1, MInternalComponentConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentConnection_ClientPort(), this.getMClientPort(), null, "clientPort", null, 1, 1, MInternalComponentConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentConnection_ServerInstance(), this.getMInternalComponentInstance(), null, "serverInstance", null, 0, 1, MInternalComponentConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentConnection_ServerPort(), this.getMServerPort(), null, "serverPort", null, 1, 1, MInternalComponentConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentConnection_Connector(), themclevdomPackage.getMConnector(), null, "connector", null, 0, 1, MInternalComponentConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentConnection_IfaceMapping(), themclevimapPackage.getMInterfaceMapping(), null, "ifaceMapping", null, 0, 1, MInternalComponentConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentConnection_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MInternalComponentConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mInternalComponentPlatformSwitchEClass, MInternalComponentPlatformSwitch.class, "MInternalComponentPlatformSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMInternalComponentPlatformSwitch_ClientInstance(), this.getMInternalComponentInstance(), null, "clientInstance", null, 0, 1, MInternalComponentPlatformSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentPlatformSwitch_ClientPort(), this.getMClientPort(), null, "clientPort", null, 1, 1, MInternalComponentPlatformSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentPlatformSwitch_Cases(), this.getMInternalComponentPlatformSwitchCase(), null, "cases", null, 1, -1, MInternalComponentPlatformSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mInternalComponentPlatformSwitchCaseEClass, MInternalComponentPlatformSwitchCase.class, "MInternalComponentPlatformSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMInternalComponentPlatformSwitchCase_Platform(), this.getMComponentSupportedPlatform(), null, "platform", null, 1, 1, MInternalComponentPlatformSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentPlatformSwitchCase_ServerInstance(), this.getMInternalComponentInstance(), null, "serverInstance", null, 0, 1, MInternalComponentPlatformSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentPlatformSwitchCase_ServerPort(), this.getMServerPort(), null, "serverPort", null, 1, 1, MInternalComponentPlatformSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentPlatformSwitchCase_Connector(), themclevdomPackage.getMConnector(), null, "connector", null, 0, 1, MInternalComponentPlatformSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentPlatformSwitchCase_IfaceMapping(), themclevimapPackage.getMInterfaceMapping(), null, "ifaceMapping", null, 0, 1, MInternalComponentPlatformSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInternalComponentPlatformSwitchCase_AttributeValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "attributeValueAssignments", null, 0, -1, MInternalComponentPlatformSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmclevcmpPackageFileEClass, MMCLEVCMPPackageFile.class, "MMCLEVCMPPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevcmpPackageElementEClass, MMCLEVCMPPackageElement.class, "MMCLEVCMPPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mParameterCSPSwitchEClass, MParameterCSPSwitch.class, "MParameterCSPSwitch", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterCSPSwitch_Cases(), this.getMParameterCSPSwitchCase(), null, "cases", null, 1, -1, MParameterCSPSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterCSPSwitchCaseEClass, MParameterCSPSwitchCase.class, "MParameterCSPSwitchCase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterCSPSwitchCase_DefaultValue(), thecommonPackage.getMParameterValueExpression(), null, "defaultValue", null, 1, 1, MParameterCSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMParameterCSPSwitchCase_Platform(), this.getMComponentSupportedPlatform(), null, "platform", null, 1, 1, MParameterCSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mBooleanParamCSPSwitchEClass, MBooleanParamCSPSwitch.class, "MBooleanParamCSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mBooleanParamCSPSwitchCaseEClass, MBooleanParamCSPSwitchCase.class, "MBooleanParamCSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mStringParamCSPSwitchEClass, MStringParamCSPSwitch.class, "MStringParamCSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mStringParamCSPSwitchCaseEClass, MStringParamCSPSwitchCase.class, "MStringParamCSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mIntegerParamCSPSwitchEClass, MIntegerParamCSPSwitch.class, "MIntegerParamCSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mIntegerParamCSPSwitchCaseEClass, MIntegerParamCSPSwitchCase.class, "MIntegerParamCSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMIntegerParamCSPSwitchCase_Range(), thecommonPackage.getMParameterRange(), null, "range", null, 0, 1, MIntegerParamCSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEnumParamCSPSwitchEClass, MEnumParamCSPSwitch.class, "MEnumParamCSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mEnumParamCSPSwitchCaseEClass, MEnumParamCSPSwitchCase.class, "MEnumParamCSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mRealParamCSPSwitchEClass, MRealParamCSPSwitch.class, "MRealParamCSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mRealParamCSPSwitchCaseEClass, MRealParamCSPSwitchCase.class, "MRealParamCSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMRealParamCSPSwitchCase_Range(), thecommonPackage.getMParameterRange(), null, "range", null, 0, 1, MRealParamCSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

}