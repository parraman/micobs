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
package es.uah.aut.srg.micobs.pdl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice;
import es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MBooleanParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MCompilerFrontend;
import es.uah.aut.srg.micobs.pdl.MDevice;
import es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVA;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.MPDLPackageElement;
import es.uah.aut.srg.micobs.pdl.MPDLPackageFile;
import es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.pdlFactory;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class pdlPackageImpl extends EPackageImpl implements pdlPackage {
	/**
	 * @generated
	 */
	private EClass mBoardEClass = null;

	/**
	 * @generated
	 */
	private EClass mBoardSupportedDeviceEClass = null;

	/**
	 * @generated
	 */
	private EClass mMicroprocessorEClass = null;

	/**
	 * @generated
	 */
	private EClass mOperatingSystemEClass = null;

	/**
	 * @generated
	 */
	private EClass mosSupportedPlatformEClass = null;

	/**
	 * @generated
	 */
	private EClass mosSupportedOSAPIEClass = null;

	/**
	 * @generated
	 */
	private EClass mosSupportedOSAPIPVAEClass = null;

	/**
	 * @generated
	 */
	private EClass mosSupportedOSAPIPVAExpressionEClass = null;

	/**
	 * @generated
	 */
	private EClass mosSupportedOSAPIPVASwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mosSupportedOSAPIPVASwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mOperatingSystemAPIEClass = null;

	/**
	 * @generated
	 */
	private EClass mArchitectureEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlPackageElementEClass = null;

	/**
	 * @generated
	 */
	private EClass mPlatformEClass = null;

	/**
	 * @generated
	 */
	private EClass mCompilerEClass = null;

	/**
	 * @generated
	 */
	private EClass mCompilerFrontendEClass = null;

	/**
	 * @generated
	 */
	private EClass mDeviceEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterOSSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterOSSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mBooleanParamOSSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mBooleanParamOSSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mStringParamOSSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mStringParamOSSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mIntegerParamOSSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mIntegerParamOSSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamOSSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamOSSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mRealParamOSSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mRealParamOSSPSwitchCaseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private pdlPackageImpl() {
		super(eNS_URI, pdlFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link pdlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static pdlPackage init() {
		if (isInited) return (pdlPackage)EPackage.Registry.INSTANCE.getEPackage(pdlPackage.eNS_URI);

		// Obtain or create and register package
		pdlPackageImpl thepdlPackage = (pdlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof pdlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new pdlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		systemPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thepdlPackage.createPackageContents();

		// Initialize created meta-data
		thepdlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thepdlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(pdlPackage.eNS_URI, thepdlPackage);
		return thepdlPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMBoard() {
		return mBoardEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMBoard_Microprocessor() {
		return (EReference)mBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMBoard_Parameters() {
		return (EReference)mBoardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMBoard_SupportedDevices() {
		return (EReference)mBoardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMBoardSupportedDevice() {
		return mBoardSupportedDeviceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMBoardSupportedDevice_LowerBound() {
		return (EReference)mBoardSupportedDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMBoardSupportedDevice_UpperBound() {
		return (EReference)mBoardSupportedDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMBoardSupportedDevice_Device() {
		return (EReference)mBoardSupportedDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMMicroprocessor() {
		return mMicroprocessorEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMMicroprocessor_Architecture() {
		return (EReference)mMicroprocessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMMicroprocessor_Parameters() {
		return (EReference)mMicroprocessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMOperatingSystem() {
		return mOperatingSystemEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMOperatingSystem_Inherits() {
		return (EReference)mOperatingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMOperatingSystem_Languages() {
		return (EReference)mOperatingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMOperatingSystem_Parameters() {
		return (EReference)mOperatingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMOperatingSystem_SupportedPlatforms() {
		return (EReference)mOperatingSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMOperatingSystem_SupportedOSAPIs() {
		return (EReference)mOperatingSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EClass getMOSSupportedPlatform() {
		return mosSupportedPlatformEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMOSSupportedPlatform_Architecture() {
		return (EReference)mosSupportedPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMOSSupportedPlatform_Compiler() {
		return (EReference)mosSupportedPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMOSSupportedPlatform_Microprocessor() {
		return (EReference)mosSupportedPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMOSSupportedPlatform_Board() {
		return (EReference)mosSupportedPlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMOSSupportedPlatform_Parameters() {
		return (EReference)mosSupportedPlatformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMOSSupportedPlatform_Languages() {
		return (EReference)mosSupportedPlatformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EClass getMOSSupportedOSAPI() {
		return mosSupportedOSAPIEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMOSSupportedOSAPI_Osapi() {
		return (EReference)mosSupportedOSAPIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMOSSupportedOSAPI_ParameterValueAssignments() {
		return (EReference)mosSupportedOSAPIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMOSSupportedOSAPIPVA() {
		return mosSupportedOSAPIPVAEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMOSSupportedOSAPIPVAExpression() {
		return mosSupportedOSAPIPVAExpressionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMOSSupportedOSAPIPVAExpression_ParameterValue() {
		return (EReference)mosSupportedOSAPIPVAExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMOSSupportedOSAPIPVASwitch() {
		return mosSupportedOSAPIPVASwitchEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMOSSupportedOSAPIPVASwitch_Cases() {
		return (EReference)mosSupportedOSAPIPVASwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMOSSupportedOSAPIPVASwitchCase() {
		return mosSupportedOSAPIPVASwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMOSSupportedOSAPIPVASwitchCase_Platform() {
		return (EReference)mosSupportedOSAPIPVASwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMOSSupportedOSAPIPVASwitchCase_ParameterValue() {
		return (EReference)mosSupportedOSAPIPVASwitchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMOperatingSystemAPI() {
		return mOperatingSystemAPIEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMOperatingSystemAPI_Inherits() {
		return (EReference)mOperatingSystemAPIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMOperatingSystemAPI_Language() {
		return (EReference)mOperatingSystemAPIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMOperatingSystemAPI_Parameters() {
		return (EReference)mOperatingSystemAPIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMArchitecture() {
		return mArchitectureEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMArchitecture_Extends() {
		return (EReference)mArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMArchitecture_Parameters() {
		return (EReference)mArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMPDLPackageFile() {
		return mpdlPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLPackageElement() {
		return mpdlPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPlatform() {
		return mPlatformEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMPlatform_Osapi() {
		return (EReference)mPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMPlatform_Os() {
		return (EReference)mPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMPlatform_Architecture() {
		return (EReference)mPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMPlatform_Compiler() {
		return (EReference)mPlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMPlatform_Microprocessor() {
		return (EReference)mPlatformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMPlatform_Board() {
		return (EReference)mPlatformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EReference getMPlatform_Parameters() {
		return (EReference)mPlatformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated
	 */
	public EClass getMCompiler() {
		return mCompilerEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMCompiler_Frontends() {
		return (EReference)mCompilerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMCompiler_Extends() {
		return (EReference)mCompilerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMCompiler_Parameters() {
		return (EReference)mCompilerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMCompilerFrontend() {
		return mCompilerFrontendEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMCompilerFrontend_Language() {
		return (EReference)mCompilerFrontendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMCompilerFrontend_Architectures() {
		return (EReference)mCompilerFrontendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMCompilerFrontend_Parameters() {
		return (EReference)mCompilerFrontendEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMDevice() {
		return mDeviceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMDevice_Parameters() {
		return (EReference)mDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterOSSPSwitch() {
		return mParameterOSSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterOSSPSwitch_Cases() {
		return (EReference)mParameterOSSPSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterOSSPSwitchCase() {
		return mParameterOSSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterOSSPSwitchCase_Platform() {
		return (EReference)mParameterOSSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMParameterOSSPSwitchCase_DefaultValue() {
		return (EReference)mParameterOSSPSwitchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMBooleanParamOSSPSwitch() {
		return mBooleanParamOSSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMBooleanParamOSSPSwitchCase() {
		return mBooleanParamOSSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMStringParamOSSPSwitch() {
		return mStringParamOSSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMStringParamOSSPSwitchCase() {
		return mStringParamOSSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIntegerParamOSSPSwitch() {
		return mIntegerParamOSSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIntegerParamOSSPSwitchCase() {
		return mIntegerParamOSSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMIntegerParamOSSPSwitchCase_Range() {
		return (EReference)mIntegerParamOSSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamOSSPSwitch() {
		return mEnumParamOSSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamOSSPSwitchCase() {
		return mEnumParamOSSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMRealParamOSSPSwitch() {
		return mRealParamOSSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMRealParamOSSPSwitchCase() {
		return mRealParamOSSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMRealParamOSSPSwitchCase_Range() {
		return (EReference)mRealParamOSSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public pdlFactory getpdlFactory() {
		return (pdlFactory)getEFactoryInstance();
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
		mBoardEClass = createEClass(MBOARD);
		createEReference(mBoardEClass, MBOARD__MICROPROCESSOR);
		createEReference(mBoardEClass, MBOARD__PARAMETERS);
		createEReference(mBoardEClass, MBOARD__SUPPORTED_DEVICES);

		mBoardSupportedDeviceEClass = createEClass(MBOARD_SUPPORTED_DEVICE);
		createEReference(mBoardSupportedDeviceEClass, MBOARD_SUPPORTED_DEVICE__LOWER_BOUND);
		createEReference(mBoardSupportedDeviceEClass, MBOARD_SUPPORTED_DEVICE__UPPER_BOUND);
		createEReference(mBoardSupportedDeviceEClass, MBOARD_SUPPORTED_DEVICE__DEVICE);

		mMicroprocessorEClass = createEClass(MMICROPROCESSOR);
		createEReference(mMicroprocessorEClass, MMICROPROCESSOR__ARCHITECTURE);
		createEReference(mMicroprocessorEClass, MMICROPROCESSOR__PARAMETERS);

		mOperatingSystemEClass = createEClass(MOPERATING_SYSTEM);
		createEReference(mOperatingSystemEClass, MOPERATING_SYSTEM__INHERITS);
		createEReference(mOperatingSystemEClass, MOPERATING_SYSTEM__LANGUAGES);
		createEReference(mOperatingSystemEClass, MOPERATING_SYSTEM__PARAMETERS);
		createEReference(mOperatingSystemEClass, MOPERATING_SYSTEM__SUPPORTED_PLATFORMS);
		createEReference(mOperatingSystemEClass, MOPERATING_SYSTEM__SUPPORTED_OSAP_IS);

		mosSupportedPlatformEClass = createEClass(MOS_SUPPORTED_PLATFORM);
		createEReference(mosSupportedPlatformEClass, MOS_SUPPORTED_PLATFORM__ARCHITECTURE);
		createEReference(mosSupportedPlatformEClass, MOS_SUPPORTED_PLATFORM__COMPILER);
		createEReference(mosSupportedPlatformEClass, MOS_SUPPORTED_PLATFORM__MICROPROCESSOR);
		createEReference(mosSupportedPlatformEClass, MOS_SUPPORTED_PLATFORM__BOARD);
		createEReference(mosSupportedPlatformEClass, MOS_SUPPORTED_PLATFORM__PARAMETERS);
		createEReference(mosSupportedPlatformEClass, MOS_SUPPORTED_PLATFORM__LANGUAGES);

		mosSupportedOSAPIEClass = createEClass(MOS_SUPPORTED_OSAPI);
		createEReference(mosSupportedOSAPIEClass, MOS_SUPPORTED_OSAPI__OSAPI);
		createEReference(mosSupportedOSAPIEClass, MOS_SUPPORTED_OSAPI__PARAMETER_VALUE_ASSIGNMENTS);

		mosSupportedOSAPIPVAEClass = createEClass(MOS_SUPPORTED_OSAPIPVA);

		mosSupportedOSAPIPVAExpressionEClass = createEClass(MOS_SUPPORTED_OSAPIPVA_EXPRESSION);
		createEReference(mosSupportedOSAPIPVAExpressionEClass, MOS_SUPPORTED_OSAPIPVA_EXPRESSION__PARAMETER_VALUE);

		mosSupportedOSAPIPVASwitchEClass = createEClass(MOS_SUPPORTED_OSAPIPVA_SWITCH);
		createEReference(mosSupportedOSAPIPVASwitchEClass, MOS_SUPPORTED_OSAPIPVA_SWITCH__CASES);

		mosSupportedOSAPIPVASwitchCaseEClass = createEClass(MOS_SUPPORTED_OSAPIPVA_SWITCH_CASE);
		createEReference(mosSupportedOSAPIPVASwitchCaseEClass, MOS_SUPPORTED_OSAPIPVA_SWITCH_CASE__PLATFORM);
		createEReference(mosSupportedOSAPIPVASwitchCaseEClass, MOS_SUPPORTED_OSAPIPVA_SWITCH_CASE__PARAMETER_VALUE);

		mOperatingSystemAPIEClass = createEClass(MOPERATING_SYSTEM_API);
		createEReference(mOperatingSystemAPIEClass, MOPERATING_SYSTEM_API__INHERITS);
		createEReference(mOperatingSystemAPIEClass, MOPERATING_SYSTEM_API__LANGUAGE);
		createEReference(mOperatingSystemAPIEClass, MOPERATING_SYSTEM_API__PARAMETERS);

		mArchitectureEClass = createEClass(MARCHITECTURE);
		createEReference(mArchitectureEClass, MARCHITECTURE__EXTENDS);
		createEReference(mArchitectureEClass, MARCHITECTURE__PARAMETERS);

		mpdlPackageFileEClass = createEClass(MPDL_PACKAGE_FILE);

		mpdlPackageElementEClass = createEClass(MPDL_PACKAGE_ELEMENT);

		mPlatformEClass = createEClass(MPLATFORM);
		createEReference(mPlatformEClass, MPLATFORM__OSAPI);
		createEReference(mPlatformEClass, MPLATFORM__OS);
		createEReference(mPlatformEClass, MPLATFORM__ARCHITECTURE);
		createEReference(mPlatformEClass, MPLATFORM__COMPILER);
		createEReference(mPlatformEClass, MPLATFORM__MICROPROCESSOR);
		createEReference(mPlatformEClass, MPLATFORM__BOARD);
		createEReference(mPlatformEClass, MPLATFORM__PARAMETERS);

		mCompilerEClass = createEClass(MCOMPILER);
		createEReference(mCompilerEClass, MCOMPILER__FRONTENDS);
		createEReference(mCompilerEClass, MCOMPILER__EXTENDS);
		createEReference(mCompilerEClass, MCOMPILER__PARAMETERS);

		mCompilerFrontendEClass = createEClass(MCOMPILER_FRONTEND);
		createEReference(mCompilerFrontendEClass, MCOMPILER_FRONTEND__LANGUAGE);
		createEReference(mCompilerFrontendEClass, MCOMPILER_FRONTEND__ARCHITECTURES);
		createEReference(mCompilerFrontendEClass, MCOMPILER_FRONTEND__PARAMETERS);

		mDeviceEClass = createEClass(MDEVICE);
		createEReference(mDeviceEClass, MDEVICE__PARAMETERS);

		mParameterOSSPSwitchEClass = createEClass(MPARAMETER_OSSP_SWITCH);
		createEReference(mParameterOSSPSwitchEClass, MPARAMETER_OSSP_SWITCH__CASES);

		mParameterOSSPSwitchCaseEClass = createEClass(MPARAMETER_OSSP_SWITCH_CASE);
		createEReference(mParameterOSSPSwitchCaseEClass, MPARAMETER_OSSP_SWITCH_CASE__PLATFORM);
		createEReference(mParameterOSSPSwitchCaseEClass, MPARAMETER_OSSP_SWITCH_CASE__DEFAULT_VALUE);

		mBooleanParamOSSPSwitchEClass = createEClass(MBOOLEAN_PARAM_OSSP_SWITCH);

		mBooleanParamOSSPSwitchCaseEClass = createEClass(MBOOLEAN_PARAM_OSSP_SWITCH_CASE);

		mStringParamOSSPSwitchEClass = createEClass(MSTRING_PARAM_OSSP_SWITCH);

		mStringParamOSSPSwitchCaseEClass = createEClass(MSTRING_PARAM_OSSP_SWITCH_CASE);

		mIntegerParamOSSPSwitchEClass = createEClass(MINTEGER_PARAM_OSSP_SWITCH);

		mIntegerParamOSSPSwitchCaseEClass = createEClass(MINTEGER_PARAM_OSSP_SWITCH_CASE);
		createEReference(mIntegerParamOSSPSwitchCaseEClass, MINTEGER_PARAM_OSSP_SWITCH_CASE__RANGE);

		mEnumParamOSSPSwitchEClass = createEClass(MENUM_PARAM_OSSP_SWITCH);

		mEnumParamOSSPSwitchCaseEClass = createEClass(MENUM_PARAM_OSSP_SWITCH_CASE);

		mRealParamOSSPSwitchEClass = createEClass(MREAL_PARAM_OSSP_SWITCH);

		mRealParamOSSPSwitchCaseEClass = createEClass(MREAL_PARAM_OSSP_SWITCH_CASE);
		createEReference(mRealParamOSSPSwitchCaseEClass, MREAL_PARAM_OSSP_SWITCH_CASE__RANGE);
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
		systemPackage thesystemPackage = (systemPackage)EPackage.Registry.INSTANCE.getEPackage(systemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mBoardEClass.getESuperTypes().add(this.getMPDLPackageElement());
		mMicroprocessorEClass.getESuperTypes().add(this.getMPDLPackageElement());
		mOperatingSystemEClass.getESuperTypes().add(this.getMPDLPackageElement());
		mosSupportedPlatformEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mosSupportedOSAPIPVAEClass.getESuperTypes().add(thecommonPackage.getMParameterValueAssignment());
		mosSupportedOSAPIPVAExpressionEClass.getESuperTypes().add(this.getMOSSupportedOSAPIPVA());
		mosSupportedOSAPIPVASwitchEClass.getESuperTypes().add(this.getMOSSupportedOSAPIPVA());
		mOperatingSystemAPIEClass.getESuperTypes().add(this.getMPDLPackageElement());
		mArchitectureEClass.getESuperTypes().add(this.getMPDLPackageElement());
		mpdlPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mpdlPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());
		mPlatformEClass.getESuperTypes().add(this.getMPDLPackageElement());
		mCompilerEClass.getESuperTypes().add(this.getMPDLPackageElement());
		mCompilerFrontendEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mDeviceEClass.getESuperTypes().add(this.getMPDLPackageElement());
		mParameterOSSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMParameter());
		mBooleanParamOSSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMBooleanParameter());
		mBooleanParamOSSPSwitchEClass.getESuperTypes().add(this.getMParameterOSSPSwitch());
		mBooleanParamOSSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterOSSPSwitchCase());
		mStringParamOSSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMStringParameter());
		mStringParamOSSPSwitchEClass.getESuperTypes().add(this.getMParameterOSSPSwitch());
		mStringParamOSSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterOSSPSwitchCase());
		mIntegerParamOSSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMIntegerParameter());
		mIntegerParamOSSPSwitchEClass.getESuperTypes().add(this.getMParameterOSSPSwitch());
		mIntegerParamOSSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterOSSPSwitchCase());
		mEnumParamOSSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMEnumParameter());
		mEnumParamOSSPSwitchEClass.getESuperTypes().add(this.getMParameterOSSPSwitch());
		mEnumParamOSSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterOSSPSwitchCase());
		mRealParamOSSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMRealParameter());
		mRealParamOSSPSwitchEClass.getESuperTypes().add(this.getMParameterOSSPSwitch());
		mRealParamOSSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterOSSPSwitchCase());

		// Initialize classes and features; add operations and parameters
		initEClass(mBoardEClass, MBoard.class, "MBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMBoard_Microprocessor(), this.getMMicroprocessor(), null, "microprocessor", null, 1, 1, MBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBoard_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBoard_SupportedDevices(), this.getMBoardSupportedDevice(), null, "supportedDevices", null, 0, -1, MBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mBoardSupportedDeviceEClass, MBoardSupportedDevice.class, "MBoardSupportedDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMBoardSupportedDevice_LowerBound(), thecommonPackage.getMParameterValueExpression(), null, "lowerBound", null, 1, 1, MBoardSupportedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBoardSupportedDevice_UpperBound(), thecommonPackage.getMParameterValueExpression(), null, "upperBound", null, 1, 1, MBoardSupportedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMBoardSupportedDevice_Device(), this.getMDevice(), null, "device", null, 1, 1, MBoardSupportedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mMicroprocessorEClass, MMicroprocessor.class, "MMicroprocessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMMicroprocessor_Architecture(), this.getMArchitecture(), null, "architecture", null, 1, 1, MMicroprocessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMMicroprocessor_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MMicroprocessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mOperatingSystemEClass, MOperatingSystem.class, "MOperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMOperatingSystem_Inherits(), this.getMOperatingSystem(), null, "inherits", null, 0, -1, MOperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOperatingSystem_Languages(), thesystemPackage.getMLanguage(), null, "languages", null, 1, -1, MOperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOperatingSystem_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MOperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOperatingSystem_SupportedPlatforms(), this.getMOSSupportedPlatform(), null, "supportedPlatforms", null, 1, -1, MOperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOperatingSystem_SupportedOSAPIs(), this.getMOSSupportedOSAPI(), null, "supportedOSAPIs", null, 0, -1, MOperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mosSupportedPlatformEClass, MOSSupportedPlatform.class, "MOSSupportedPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMOSSupportedPlatform_Architecture(), this.getMArchitecture(), null, "architecture", null, 1, 1, MOSSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOSSupportedPlatform_Compiler(), this.getMCompiler(), null, "compiler", null, 1, 1, MOSSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOSSupportedPlatform_Microprocessor(), this.getMMicroprocessor(), null, "microprocessor", null, 0, 1, MOSSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOSSupportedPlatform_Board(), this.getMBoard(), null, "board", null, 0, 1, MOSSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOSSupportedPlatform_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MOSSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOSSupportedPlatform_Languages(), thesystemPackage.getMLanguage(), null, "languages", null, 0, -1, MOSSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mosSupportedOSAPIEClass, MOSSupportedOSAPI.class, "MOSSupportedOSAPI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMOSSupportedOSAPI_Osapi(), this.getMOperatingSystemAPI(), null, "osapi", null, 1, 1, MOSSupportedOSAPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOSSupportedOSAPI_ParameterValueAssignments(), this.getMOSSupportedOSAPIPVA(), null, "parameterValueAssignments", null, 0, -1, MOSSupportedOSAPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mosSupportedOSAPIPVAEClass, MOSSupportedOSAPIPVA.class, "MOSSupportedOSAPIPVA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mosSupportedOSAPIPVAExpressionEClass, MOSSupportedOSAPIPVAExpression.class, "MOSSupportedOSAPIPVAExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMOSSupportedOSAPIPVAExpression_ParameterValue(), thecommonPackage.getMParameterValueExpression(), null, "parameterValue", null, 1, 1, MOSSupportedOSAPIPVAExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mosSupportedOSAPIPVASwitchEClass, MOSSupportedOSAPIPVASwitch.class, "MOSSupportedOSAPIPVASwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMOSSupportedOSAPIPVASwitch_Cases(), this.getMOSSupportedOSAPIPVASwitchCase(), null, "cases", null, 1, -1, MOSSupportedOSAPIPVASwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mosSupportedOSAPIPVASwitchCaseEClass, MOSSupportedOSAPIPVASwitchCase.class, "MOSSupportedOSAPIPVASwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMOSSupportedOSAPIPVASwitchCase_Platform(), this.getMOSSupportedPlatform(), null, "platform", null, 1, 1, MOSSupportedOSAPIPVASwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOSSupportedOSAPIPVASwitchCase_ParameterValue(), thecommonPackage.getMParameterValueExpression(), null, "parameterValue", null, 1, 1, MOSSupportedOSAPIPVASwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mOperatingSystemAPIEClass, MOperatingSystemAPI.class, "MOperatingSystemAPI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMOperatingSystemAPI_Inherits(), this.getMOperatingSystemAPI(), null, "inherits", null, 0, -1, MOperatingSystemAPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOperatingSystemAPI_Language(), thesystemPackage.getMLanguage(), null, "language", null, 1, 1, MOperatingSystemAPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOperatingSystemAPI_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MOperatingSystemAPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mArchitectureEClass, MArchitecture.class, "MArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMArchitecture_Extends(), this.getMArchitecture(), null, "extends", null, 0, -1, MArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMArchitecture_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mpdlPackageFileEClass, MPDLPackageFile.class, "MPDLPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlPackageElementEClass, MPDLPackageElement.class, "MPDLPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mPlatformEClass, MPlatform.class, "MPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMPlatform_Osapi(), this.getMOperatingSystemAPI(), null, "osapi", null, 1, 1, MPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPlatform_Os(), this.getMOperatingSystem(), null, "os", null, 1, 1, MPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPlatform_Architecture(), this.getMArchitecture(), null, "architecture", null, 1, 1, MPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPlatform_Compiler(), this.getMCompiler(), null, "compiler", null, 1, 1, MPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPlatform_Microprocessor(), this.getMMicroprocessor(), null, "microprocessor", null, 0, 1, MPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPlatform_Board(), this.getMBoard(), null, "board", null, 0, 1, MPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPlatform_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mCompilerEClass, MCompiler.class, "MCompiler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMCompiler_Frontends(), this.getMCompilerFrontend(), null, "frontends", null, 0, -1, MCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCompiler_Extends(), this.getMCompiler(), null, "extends", null, 0, -1, MCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCompiler_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MCompiler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mCompilerFrontendEClass, MCompilerFrontend.class, "MCompilerFrontend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMCompilerFrontend_Language(), thesystemPackage.getMLanguage(), null, "language", null, 1, 1, MCompilerFrontend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCompilerFrontend_Architectures(), this.getMArchitecture(), null, "architectures", null, 1, -1, MCompilerFrontend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCompilerFrontend_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MCompilerFrontend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDeviceEClass, MDevice.class, "MDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDevice_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterOSSPSwitchEClass, MParameterOSSPSwitch.class, "MParameterOSSPSwitch", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterOSSPSwitch_Cases(), this.getMParameterOSSPSwitchCase(), null, "cases", null, 1, -1, MParameterOSSPSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterOSSPSwitchCaseEClass, MParameterOSSPSwitchCase.class, "MParameterOSSPSwitchCase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterOSSPSwitchCase_Platform(), this.getMOSSupportedPlatform(), null, "platform", null, 1, 1, MParameterOSSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMParameterOSSPSwitchCase_DefaultValue(), thecommonPackage.getMParameterValueExpression(), null, "defaultValue", null, 1, 1, MParameterOSSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mBooleanParamOSSPSwitchEClass, MBooleanParamOSSPSwitch.class, "MBooleanParamOSSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mBooleanParamOSSPSwitchCaseEClass, MBooleanParamOSSPSwitchCase.class, "MBooleanParamOSSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mStringParamOSSPSwitchEClass, MStringParamOSSPSwitch.class, "MStringParamOSSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mStringParamOSSPSwitchCaseEClass, MStringParamOSSPSwitchCase.class, "MStringParamOSSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mIntegerParamOSSPSwitchEClass, MIntegerParamOSSPSwitch.class, "MIntegerParamOSSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mIntegerParamOSSPSwitchCaseEClass, MIntegerParamOSSPSwitchCase.class, "MIntegerParamOSSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMIntegerParamOSSPSwitchCase_Range(), thecommonPackage.getMParameterRange(), null, "range", null, 0, 1, MIntegerParamOSSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEnumParamOSSPSwitchEClass, MEnumParamOSSPSwitch.class, "MEnumParamOSSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mEnumParamOSSPSwitchCaseEClass, MEnumParamOSSPSwitchCase.class, "MEnumParamOSSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mRealParamOSSPSwitchEClass, MRealParamOSSPSwitch.class, "MRealParamOSSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mRealParamOSSPSwitchCaseEClass, MRealParamOSSPSwitchCase.class, "MRealParamOSSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMRealParamOSSPSwitchCase_Range(), thecommonPackage.getMParameterRange(), null, "range", null, 0, 1, MRealParamOSSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

}
