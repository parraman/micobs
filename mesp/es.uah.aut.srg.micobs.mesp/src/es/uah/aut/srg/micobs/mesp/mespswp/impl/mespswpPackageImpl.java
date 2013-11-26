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
package es.uah.aut.srg.micobs.mesp.mespswp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageElement;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVA;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpFactory;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;

/**
 * An implementation of the model <b>Package</b>.
 * 
 * @generated
 */
public class mespswpPackageImpl extends EPackageImpl implements mespswpPackage {
	/**
	 * @generated
	 */
	private EClass mSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mDriverSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mSwPackageProvidedInterfaceEClass = null;

	/**
	 * @generated
	 */
	private EClass mSwPackageProvidedInterfacePVAEClass = null;

	/**
	 * @generated
	 */
	private EClass mSwPackageProvidedInterfacePVASwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mSwPackageProvidedInterfacePVASwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mSwPackageProvidedInterfacePVAExpressionEClass = null;

	/**
	 * @generated
	 */
	private EClass mSwPackageRequiredInterfaceEClass = null;

	/**
	 * @generated
	 */
	private EClass mAbstractSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mSwPackageSupportedPlatformEClass = null;

	/**
	 * @generated
	 */
	private EClass mDriverSwPackageSupportedPlatformEClass = null;

	/**
	 * @generated
	 */
	private EClass mDriverSwPackageSupportedDeviceEClass = null;

	/**
	 * @generated
	 */
	private EClass mResourceDemandEClass = null;

	/**
	 * @generated
	 */
	private EClass mInstantiableResourceDemandEClass = null;

	/**
	 * @generated
	 */
	private EClass mQuantifiableResourceDemandEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespswpPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespswpPackageElementEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterSWPSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterSWPSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mBooleanParamSWPSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mBooleanParamSWPSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mStringParamSWPSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mStringParamSWPSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mIntegerParamSWPSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mIntegerParamSWPSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamSWPSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamSWPSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mRealParamSWPSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mRealParamSWPSPSwitchCaseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mespswpPackageImpl() {
		super(eNS_URI, mespswpFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mespswpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mespswpPackage init() {
		if (isInited) return (mespswpPackage)EPackage.Registry.INSTANCE.getEPackage(mespswpPackage.eNS_URI);

		// Obtain or create and register package
		mespswpPackageImpl themespswpPackage = (mespswpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mespswpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mespswpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mespctoolPackage.eINSTANCE.eClass();
		mesposswiPackage.eINSTANCE.eClass();
		mespswiPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themespswpPackage.createPackageContents();

		// Initialize created meta-data
		themespswpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themespswpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mespswpPackage.eNS_URI, themespswpPackage);
		return themespswpPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMSwPackage() {
		return mSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackage_Extends() {
		return (EReference)mSwPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackage_Languages() {
		return (EReference)mSwPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackage_Ctools() {
		return (EReference)mSwPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackage_Requires() {
		return (EReference)mSwPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackage_SupportedPlatforms() {
		return (EReference)mSwPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EClass getMDriverSwPackage() {
		return mDriverSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMSwPackageProvidedInterface() {
		return mSwPackageProvidedInterfaceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageProvidedInterface_Swinterface() {
		return (EReference)mSwPackageProvidedInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageProvidedInterface_ParameterValueAssignments() {
		return (EReference)mSwPackageProvidedInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMSwPackageProvidedInterfacePVA() {
		return mSwPackageProvidedInterfacePVAEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMSwPackageProvidedInterfacePVASwitch() {
		return mSwPackageProvidedInterfacePVASwitchEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageProvidedInterfacePVASwitch_Cases() {
		return (EReference)mSwPackageProvidedInterfacePVASwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMSwPackageProvidedInterfacePVASwitchCase() {
		return mSwPackageProvidedInterfacePVASwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageProvidedInterfacePVASwitchCase_Platform() {
		return (EReference)mSwPackageProvidedInterfacePVASwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageProvidedInterfacePVASwitchCase_ParameterValue() {
		return (EReference)mSwPackageProvidedInterfacePVASwitchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMSwPackageProvidedInterfacePVAExpression() {
		return mSwPackageProvidedInterfacePVAExpressionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageProvidedInterfacePVAExpression_ParameterValue() {
		return (EReference)mSwPackageProvidedInterfacePVAExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMSwPackageRequiredInterface() {
		return mSwPackageRequiredInterfaceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageRequiredInterface_ResourceDemands() {
		return (EReference)mSwPackageRequiredInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageRequiredInterface_Interface() {
		return (EReference)mSwPackageRequiredInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMAbstractSwPackage() {
		return mAbstractSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMAbstractSwPackage_Inherits() {
		return (EReference)mAbstractSwPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMAbstractSwPackage_Provides() {
		return (EReference)mAbstractSwPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMAbstractSwPackage_Parameters() {
		return (EReference)mAbstractSwPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMSwPackageSupportedPlatform() {
		return mSwPackageSupportedPlatformEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageSupportedPlatform_Osapi() {
		return (EReference)mSwPackageSupportedPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageSupportedPlatform_Os() {
		return (EReference)mSwPackageSupportedPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageSupportedPlatform_Architecture() {
		return (EReference)mSwPackageSupportedPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageSupportedPlatform_Compiler() {
		return (EReference)mSwPackageSupportedPlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageSupportedPlatform_Microprocessor() {
		return (EReference)mSwPackageSupportedPlatformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageSupportedPlatform_Board() {
		return (EReference)mSwPackageSupportedPlatformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageSupportedPlatform_Languages() {
		return (EReference)mSwPackageSupportedPlatformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageSupportedPlatform_Requires() {
		return (EReference)mSwPackageSupportedPlatformEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * @generated
	 */
	public EReference getMSwPackageSupportedPlatform_Parameters() {
		return (EReference)mSwPackageSupportedPlatformEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * @generated
	 */
	public EClass getMDriverSwPackageSupportedPlatform() {
		return mDriverSwPackageSupportedPlatformEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMDriverSwPackageSupportedPlatform_SupportedDevices() {
		return (EReference)mDriverSwPackageSupportedPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMDriverSwPackageSupportedDevice() {
		return mDriverSwPackageSupportedDeviceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMDriverSwPackageSupportedDevice_Required() {
		return (EReference)mDriverSwPackageSupportedDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMDriverSwPackageSupportedDevice_Device() {
		return (EReference)mDriverSwPackageSupportedDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMResourceDemand() {
		return mResourceDemandEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMInstantiableResourceDemand() {
		return mInstantiableResourceDemandEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMInstantiableResourceDemand_Resource() {
		return (EReference)mInstantiableResourceDemandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMInstantiableResourceDemand_ParameterValueAssignments() {
		return (EReference)mInstantiableResourceDemandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMQuantifiableResourceDemand() {
		return mQuantifiableResourceDemandEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMQuantifiableResourceDemand_Resource() {
		return (EReference)mQuantifiableResourceDemandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMQuantifiableResourceDemand_ResourceValue() {
		return (EReference)mQuantifiableResourceDemandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMMESPSWPPackageFile() {
		return mmespswpPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPSWPPackageElement() {
		return mmespswpPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMParameterSWPSPSwitch() {
		return mParameterSWPSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterSWPSPSwitch_Cases() {
		return (EReference)mParameterSWPSPSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterSWPSPSwitchCase() {
		return mParameterSWPSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterSWPSPSwitchCase_Platform() {
		return (EReference)mParameterSWPSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMParameterSWPSPSwitchCase_DefaultValue() {
		return (EReference)mParameterSWPSPSwitchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMBooleanParamSWPSPSwitch() {
		return mBooleanParamSWPSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMBooleanParamSWPSPSwitchCase() {
		return mBooleanParamSWPSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMStringParamSWPSPSwitch() {
		return mStringParamSWPSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMStringParamSWPSPSwitchCase() {
		return mStringParamSWPSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIntegerParamSWPSPSwitch() {
		return mIntegerParamSWPSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIntegerParamSWPSPSwitchCase() {
		return mIntegerParamSWPSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMIntegerParamSWPSPSwitchCase_Range() {
		return (EReference)mIntegerParamSWPSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamSWPSPSwitch() {
		return mEnumParamSWPSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamSWPSPSwitchCase() {
		return mEnumParamSWPSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMRealParamSWPSPSwitch() {
		return mRealParamSWPSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMRealParamSWPSPSwitchCase() {
		return mRealParamSWPSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMRealParamSWPSPSwitchCase_Range() {
		return (EReference)mRealParamSWPSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public mespswpFactory getmespswpFactory() {
		return (mespswpFactory)getEFactoryInstance();
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
		mSwPackageEClass = createEClass(MSW_PACKAGE);
		createEReference(mSwPackageEClass, MSW_PACKAGE__EXTENDS);
		createEReference(mSwPackageEClass, MSW_PACKAGE__LANGUAGES);
		createEReference(mSwPackageEClass, MSW_PACKAGE__CTOOLS);
		createEReference(mSwPackageEClass, MSW_PACKAGE__REQUIRES);
		createEReference(mSwPackageEClass, MSW_PACKAGE__SUPPORTED_PLATFORMS);

		mDriverSwPackageEClass = createEClass(MDRIVER_SW_PACKAGE);

		mSwPackageProvidedInterfaceEClass = createEClass(MSW_PACKAGE_PROVIDED_INTERFACE);
		createEReference(mSwPackageProvidedInterfaceEClass, MSW_PACKAGE_PROVIDED_INTERFACE__SWINTERFACE);
		createEReference(mSwPackageProvidedInterfaceEClass, MSW_PACKAGE_PROVIDED_INTERFACE__PARAMETER_VALUE_ASSIGNMENTS);

		mSwPackageProvidedInterfacePVAEClass = createEClass(MSW_PACKAGE_PROVIDED_INTERFACE_PVA);

		mSwPackageProvidedInterfacePVASwitchEClass = createEClass(MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH);
		createEReference(mSwPackageProvidedInterfacePVASwitchEClass, MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH__CASES);

		mSwPackageProvidedInterfacePVASwitchCaseEClass = createEClass(MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE);
		createEReference(mSwPackageProvidedInterfacePVASwitchCaseEClass, MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PLATFORM);
		createEReference(mSwPackageProvidedInterfacePVASwitchCaseEClass, MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE__PARAMETER_VALUE);

		mSwPackageProvidedInterfacePVAExpressionEClass = createEClass(MSW_PACKAGE_PROVIDED_INTERFACE_PVA_EXPRESSION);
		createEReference(mSwPackageProvidedInterfacePVAExpressionEClass, MSW_PACKAGE_PROVIDED_INTERFACE_PVA_EXPRESSION__PARAMETER_VALUE);

		mSwPackageRequiredInterfaceEClass = createEClass(MSW_PACKAGE_REQUIRED_INTERFACE);
		createEReference(mSwPackageRequiredInterfaceEClass, MSW_PACKAGE_REQUIRED_INTERFACE__RESOURCE_DEMANDS);
		createEReference(mSwPackageRequiredInterfaceEClass, MSW_PACKAGE_REQUIRED_INTERFACE__INTERFACE);

		mAbstractSwPackageEClass = createEClass(MABSTRACT_SW_PACKAGE);
		createEReference(mAbstractSwPackageEClass, MABSTRACT_SW_PACKAGE__INHERITS);
		createEReference(mAbstractSwPackageEClass, MABSTRACT_SW_PACKAGE__PROVIDES);
		createEReference(mAbstractSwPackageEClass, MABSTRACT_SW_PACKAGE__PARAMETERS);

		mSwPackageSupportedPlatformEClass = createEClass(MSW_PACKAGE_SUPPORTED_PLATFORM);
		createEReference(mSwPackageSupportedPlatformEClass, MSW_PACKAGE_SUPPORTED_PLATFORM__OSAPI);
		createEReference(mSwPackageSupportedPlatformEClass, MSW_PACKAGE_SUPPORTED_PLATFORM__OS);
		createEReference(mSwPackageSupportedPlatformEClass, MSW_PACKAGE_SUPPORTED_PLATFORM__ARCHITECTURE);
		createEReference(mSwPackageSupportedPlatformEClass, MSW_PACKAGE_SUPPORTED_PLATFORM__COMPILER);
		createEReference(mSwPackageSupportedPlatformEClass, MSW_PACKAGE_SUPPORTED_PLATFORM__MICROPROCESSOR);
		createEReference(mSwPackageSupportedPlatformEClass, MSW_PACKAGE_SUPPORTED_PLATFORM__BOARD);
		createEReference(mSwPackageSupportedPlatformEClass, MSW_PACKAGE_SUPPORTED_PLATFORM__LANGUAGES);
		createEReference(mSwPackageSupportedPlatformEClass, MSW_PACKAGE_SUPPORTED_PLATFORM__REQUIRES);
		createEReference(mSwPackageSupportedPlatformEClass, MSW_PACKAGE_SUPPORTED_PLATFORM__PARAMETERS);

		mDriverSwPackageSupportedPlatformEClass = createEClass(MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM);
		createEReference(mDriverSwPackageSupportedPlatformEClass, MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM__SUPPORTED_DEVICES);

		mDriverSwPackageSupportedDeviceEClass = createEClass(MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE);
		createEReference(mDriverSwPackageSupportedDeviceEClass, MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__REQUIRED);
		createEReference(mDriverSwPackageSupportedDeviceEClass, MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE__DEVICE);

		mResourceDemandEClass = createEClass(MRESOURCE_DEMAND);

		mInstantiableResourceDemandEClass = createEClass(MINSTANTIABLE_RESOURCE_DEMAND);
		createEReference(mInstantiableResourceDemandEClass, MINSTANTIABLE_RESOURCE_DEMAND__RESOURCE);
		createEReference(mInstantiableResourceDemandEClass, MINSTANTIABLE_RESOURCE_DEMAND__PARAMETER_VALUE_ASSIGNMENTS);

		mQuantifiableResourceDemandEClass = createEClass(MQUANTIFIABLE_RESOURCE_DEMAND);
		createEReference(mQuantifiableResourceDemandEClass, MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE);
		createEReference(mQuantifiableResourceDemandEClass, MQUANTIFIABLE_RESOURCE_DEMAND__RESOURCE_VALUE);

		mmespswpPackageFileEClass = createEClass(MMESPSWP_PACKAGE_FILE);

		mmespswpPackageElementEClass = createEClass(MMESPSWP_PACKAGE_ELEMENT);

		mParameterSWPSPSwitchEClass = createEClass(MPARAMETER_SWPSP_SWITCH);
		createEReference(mParameterSWPSPSwitchEClass, MPARAMETER_SWPSP_SWITCH__CASES);

		mParameterSWPSPSwitchCaseEClass = createEClass(MPARAMETER_SWPSP_SWITCH_CASE);
		createEReference(mParameterSWPSPSwitchCaseEClass, MPARAMETER_SWPSP_SWITCH_CASE__PLATFORM);
		createEReference(mParameterSWPSPSwitchCaseEClass, MPARAMETER_SWPSP_SWITCH_CASE__DEFAULT_VALUE);

		mBooleanParamSWPSPSwitchEClass = createEClass(MBOOLEAN_PARAM_SWPSP_SWITCH);

		mBooleanParamSWPSPSwitchCaseEClass = createEClass(MBOOLEAN_PARAM_SWPSP_SWITCH_CASE);

		mStringParamSWPSPSwitchEClass = createEClass(MSTRING_PARAM_SWPSP_SWITCH);

		mStringParamSWPSPSwitchCaseEClass = createEClass(MSTRING_PARAM_SWPSP_SWITCH_CASE);

		mIntegerParamSWPSPSwitchEClass = createEClass(MINTEGER_PARAM_SWPSP_SWITCH);

		mIntegerParamSWPSPSwitchCaseEClass = createEClass(MINTEGER_PARAM_SWPSP_SWITCH_CASE);
		createEReference(mIntegerParamSWPSPSwitchCaseEClass, MINTEGER_PARAM_SWPSP_SWITCH_CASE__RANGE);

		mEnumParamSWPSPSwitchEClass = createEClass(MENUM_PARAM_SWPSP_SWITCH);

		mEnumParamSWPSPSwitchCaseEClass = createEClass(MENUM_PARAM_SWPSP_SWITCH_CASE);

		mRealParamSWPSPSwitchEClass = createEClass(MREAL_PARAM_SWPSP_SWITCH);

		mRealParamSWPSPSwitchCaseEClass = createEClass(MREAL_PARAM_SWPSP_SWITCH_CASE);
		createEReference(mRealParamSWPSPSwitchCaseEClass, MREAL_PARAM_SWPSP_SWITCH_CASE__RANGE);
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
		systemPackage thesystemPackage = (systemPackage)EPackage.Registry.INSTANCE.getEPackage(systemPackage.eNS_URI);
		mespctoolPackage themespctoolPackage = (mespctoolPackage)EPackage.Registry.INSTANCE.getEPackage(mespctoolPackage.eNS_URI);
		mespswiPackage themespswiPackage = (mespswiPackage)EPackage.Registry.INSTANCE.getEPackage(mespswiPackage.eNS_URI);
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);
		pdlPackage thepdlPackage = (pdlPackage)EPackage.Registry.INSTANCE.getEPackage(pdlPackage.eNS_URI);
		mespcommonPackage themespcommonPackage = (mespcommonPackage)EPackage.Registry.INSTANCE.getEPackage(mespcommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mSwPackageEClass.getESuperTypes().add(this.getMMESPSWPPackageElement());
		mSwPackageEClass.getESuperTypes().add(this.getMAbstractSwPackage());
		mDriverSwPackageEClass.getESuperTypes().add(this.getMMESPSWPPackageElement());
		mDriverSwPackageEClass.getESuperTypes().add(this.getMSwPackage());
		mSwPackageProvidedInterfacePVAEClass.getESuperTypes().add(thecommonPackage.getMParameterValueAssignment());
		mSwPackageProvidedInterfacePVASwitchEClass.getESuperTypes().add(this.getMSwPackageProvidedInterfacePVA());
		mSwPackageProvidedInterfacePVAExpressionEClass.getESuperTypes().add(this.getMSwPackageProvidedInterfacePVA());
		mAbstractSwPackageEClass.getESuperTypes().add(this.getMMESPSWPPackageElement());
		mSwPackageSupportedPlatformEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mDriverSwPackageSupportedPlatformEClass.getESuperTypes().add(this.getMSwPackageSupportedPlatform());
		mDriverSwPackageSupportedDeviceEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mInstantiableResourceDemandEClass.getESuperTypes().add(this.getMResourceDemand());
		mInstantiableResourceDemandEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mQuantifiableResourceDemandEClass.getESuperTypes().add(this.getMResourceDemand());
		mmespswpPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmespswpPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());
		mParameterSWPSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMParameter());
		mBooleanParamSWPSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMBooleanParameter());
		mBooleanParamSWPSPSwitchEClass.getESuperTypes().add(this.getMParameterSWPSPSwitch());
		mBooleanParamSWPSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterSWPSPSwitchCase());
		mStringParamSWPSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMStringParameter());
		mStringParamSWPSPSwitchEClass.getESuperTypes().add(this.getMParameterSWPSPSwitch());
		mStringParamSWPSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterSWPSPSwitchCase());
		mIntegerParamSWPSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMIntegerParameter());
		mIntegerParamSWPSPSwitchEClass.getESuperTypes().add(this.getMParameterSWPSPSwitch());
		mIntegerParamSWPSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterSWPSPSwitchCase());
		mEnumParamSWPSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMEnumParameter());
		mEnumParamSWPSPSwitchEClass.getESuperTypes().add(this.getMParameterSWPSPSwitch());
		mEnumParamSWPSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterSWPSPSwitchCase());
		mRealParamSWPSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMRealParameter());
		mRealParamSWPSPSwitchEClass.getESuperTypes().add(this.getMParameterSWPSPSwitch());
		mRealParamSWPSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterSWPSPSwitchCase());

		// Initialize classes and features; add operations and parameters
		initEClass(mSwPackageEClass, MSwPackage.class, "MSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSwPackage_Extends(), this.getMSwPackage(), null, "extends", null, 0, -1, MSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackage_Languages(), thesystemPackage.getMLanguage(), null, "languages", null, 1, -1, MSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackage_Ctools(), themespctoolPackage.getMConstructionTool(), null, "ctools", null, 1, -1, MSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackage_Requires(), this.getMSwPackageRequiredInterface(), null, "requires", null, 0, -1, MSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackage_SupportedPlatforms(), this.getMSwPackageSupportedPlatform(), null, "supportedPlatforms", null, 1, -1, MSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDriverSwPackageEClass, MDriverSwPackage.class, "MDriverSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mSwPackageProvidedInterfaceEClass, MSwPackageProvidedInterface.class, "MSwPackageProvidedInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSwPackageProvidedInterface_Swinterface(), themespswiPackage.getMSwInterface(), null, "swinterface", null, 1, 1, MSwPackageProvidedInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackageProvidedInterface_ParameterValueAssignments(), this.getMSwPackageProvidedInterfacePVA(), null, "parameterValueAssignments", null, 0, -1, MSwPackageProvidedInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSwPackageProvidedInterfacePVAEClass, MSwPackageProvidedInterfacePVA.class, "MSwPackageProvidedInterfacePVA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mSwPackageProvidedInterfacePVASwitchEClass, MSwPackageProvidedInterfacePVASwitch.class, "MSwPackageProvidedInterfacePVASwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSwPackageProvidedInterfacePVASwitch_Cases(), this.getMSwPackageProvidedInterfacePVASwitchCase(), null, "cases", null, 1, -1, MSwPackageProvidedInterfacePVASwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSwPackageProvidedInterfacePVASwitchCaseEClass, MSwPackageProvidedInterfacePVASwitchCase.class, "MSwPackageProvidedInterfacePVASwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSwPackageProvidedInterfacePVASwitchCase_Platform(), this.getMSwPackageSupportedPlatform(), null, "platform", null, 1, 1, MSwPackageProvidedInterfacePVASwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackageProvidedInterfacePVASwitchCase_ParameterValue(), thecommonPackage.getMParameterValueExpression(), null, "parameterValue", null, 1, 1, MSwPackageProvidedInterfacePVASwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSwPackageProvidedInterfacePVAExpressionEClass, MSwPackageProvidedInterfacePVAExpression.class, "MSwPackageProvidedInterfacePVAExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSwPackageProvidedInterfacePVAExpression_ParameterValue(), thecommonPackage.getMParameterValueExpression(), null, "parameterValue", null, 1, 1, MSwPackageProvidedInterfacePVAExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSwPackageRequiredInterfaceEClass, MSwPackageRequiredInterface.class, "MSwPackageRequiredInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSwPackageRequiredInterface_ResourceDemands(), this.getMResourceDemand(), null, "resourceDemands", null, 0, -1, MSwPackageRequiredInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackageRequiredInterface_Interface(), thecommonPackage.getMCommonPackageElement(), null, "interface", null, 1, 1, MSwPackageRequiredInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mAbstractSwPackageEClass, MAbstractSwPackage.class, "MAbstractSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAbstractSwPackage_Inherits(), this.getMAbstractSwPackage(), null, "inherits", null, 0, -1, MAbstractSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAbstractSwPackage_Provides(), this.getMSwPackageProvidedInterface(), null, "provides", null, 0, -1, MAbstractSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAbstractSwPackage_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MAbstractSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mSwPackageSupportedPlatformEClass, MSwPackageSupportedPlatform.class, "MSwPackageSupportedPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSwPackageSupportedPlatform_Osapi(), thepdlPackage.getMOperatingSystemAPI(), null, "osapi", null, 0, 1, MSwPackageSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackageSupportedPlatform_Os(), thepdlPackage.getMOperatingSystem(), null, "os", null, 0, 1, MSwPackageSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackageSupportedPlatform_Architecture(), thepdlPackage.getMArchitecture(), null, "architecture", null, 0, 1, MSwPackageSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackageSupportedPlatform_Compiler(), thepdlPackage.getMCompiler(), null, "compiler", null, 0, 1, MSwPackageSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackageSupportedPlatform_Microprocessor(), thepdlPackage.getMMicroprocessor(), null, "microprocessor", null, 0, 1, MSwPackageSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackageSupportedPlatform_Board(), thepdlPackage.getMBoard(), null, "board", null, 0, 1, MSwPackageSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackageSupportedPlatform_Languages(), thesystemPackage.getMLanguage(), null, "languages", null, 0, -1, MSwPackageSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackageSupportedPlatform_Requires(), this.getMSwPackageRequiredInterface(), null, "requires", null, 0, -1, MSwPackageSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwPackageSupportedPlatform_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MSwPackageSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDriverSwPackageSupportedPlatformEClass, MDriverSwPackageSupportedPlatform.class, "MDriverSwPackageSupportedPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDriverSwPackageSupportedPlatform_SupportedDevices(), this.getMDriverSwPackageSupportedDevice(), null, "supportedDevices", null, 0, -1, MDriverSwPackageSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDriverSwPackageSupportedDeviceEClass, MDriverSwPackageSupportedDevice.class, "MDriverSwPackageSupportedDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDriverSwPackageSupportedDevice_Required(), thecommonPackage.getMParameterValueExpression(), null, "required", null, 0, 1, MDriverSwPackageSupportedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDriverSwPackageSupportedDevice_Device(), thepdlPackage.getMDevice(), null, "device", null, 1, 1, MDriverSwPackageSupportedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mResourceDemandEClass, MResourceDemand.class, "MResourceDemand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mInstantiableResourceDemandEClass, MInstantiableResourceDemand.class, "MInstantiableResourceDemand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMInstantiableResourceDemand_Resource(), themespcommonPackage.getMInstantiableResource(), null, "resource", null, 1, 1, MInstantiableResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInstantiableResourceDemand_ParameterValueAssignments(), thecommonPackage.getMParameterValueAssignment(), null, "parameterValueAssignments", null, 0, -1, MInstantiableResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mQuantifiableResourceDemandEClass, MQuantifiableResourceDemand.class, "MQuantifiableResourceDemand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMQuantifiableResourceDemand_Resource(), themespcommonPackage.getMQuantifiableResource(), null, "resource", null, 1, 1, MQuantifiableResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMQuantifiableResourceDemand_ResourceValue(), thecommonPackage.getMParameterValueExpression(), null, "resourceValue", null, 1, 1, MQuantifiableResourceDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmespswpPackageFileEClass, MMESPSWPPackageFile.class, "MMESPSWPPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespswpPackageElementEClass, MMESPSWPPackageElement.class, "MMESPSWPPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mParameterSWPSPSwitchEClass, MParameterSWPSPSwitch.class, "MParameterSWPSPSwitch", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterSWPSPSwitch_Cases(), this.getMParameterSWPSPSwitchCase(), null, "cases", null, 1, -1, MParameterSWPSPSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterSWPSPSwitchCaseEClass, MParameterSWPSPSwitchCase.class, "MParameterSWPSPSwitchCase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterSWPSPSwitchCase_Platform(), this.getMSwPackageSupportedPlatform(), null, "platform", null, 1, 1, MParameterSWPSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMParameterSWPSPSwitchCase_DefaultValue(), thecommonPackage.getMParameterValueExpression(), null, "defaultValue", null, 1, 1, MParameterSWPSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mBooleanParamSWPSPSwitchEClass, MBooleanParamSWPSPSwitch.class, "MBooleanParamSWPSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mBooleanParamSWPSPSwitchCaseEClass, MBooleanParamSWPSPSwitchCase.class, "MBooleanParamSWPSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mStringParamSWPSPSwitchEClass, MStringParamSWPSPSwitch.class, "MStringParamSWPSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mStringParamSWPSPSwitchCaseEClass, MStringParamSWPSPSwitchCase.class, "MStringParamSWPSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mIntegerParamSWPSPSwitchEClass, MIntegerParamSWPSPSwitch.class, "MIntegerParamSWPSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mIntegerParamSWPSPSwitchCaseEClass, MIntegerParamSWPSPSwitchCase.class, "MIntegerParamSWPSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMIntegerParamSWPSPSwitchCase_Range(), thecommonPackage.getMParameterRange(), null, "range", null, 0, 1, MIntegerParamSWPSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEnumParamSWPSPSwitchEClass, MEnumParamSWPSPSwitch.class, "MEnumParamSWPSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mEnumParamSWPSPSwitchCaseEClass, MEnumParamSWPSPSwitchCase.class, "MEnumParamSWPSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mRealParamSWPSPSwitchEClass, MRealParamSWPSPSwitch.class, "MRealParamSWPSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mRealParamSWPSPSwitchCaseEClass, MRealParamSWPSPSwitchCase.class, "MRealParamSWPSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMRealParamSWPSPSwitchCase_Range(), thecommonPackage.getMParameterRange(), null, "range", null, 0, 1, MRealParamSWPSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

}