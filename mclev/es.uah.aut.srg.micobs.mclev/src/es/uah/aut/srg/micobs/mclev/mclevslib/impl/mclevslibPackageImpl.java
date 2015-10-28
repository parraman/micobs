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
package es.uah.aut.srg.micobs.mclev.mclevslib.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MBooleanParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MBooleanParamSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVA;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVAExpression;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevslib.MStringParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MStringParamSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibFactory;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class mclevslibPackageImpl extends EPackageImpl implements mclevslibPackage {
	/**
	 * @generated
	 */
	private EClass mServiceLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mServiceLibraryProvidedSAIEClass = null;

	/**
	 * @generated
	 */
	private EClass msLibProvidedSAIAVAEClass = null;

	/**
	 * @generated
	 */
	private EClass msLibProvidedSAIAVASwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass msLibProvidedSAIAVASwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass msLibProvidedSAIAVAExpressionEClass = null;

	/**
	 * @generated
	 */
	private EClass mServiceLibrarySupportedPlatformEClass = null;

	/**
	 * @generated
	 */
	private EClass mDriverSLibSupportedPlatformEClass = null;

	/**
	 * @generated
	 */
	private EClass mDriverSLibSupportedDeviceEClass = null;

	/**
	 * @generated
	 */
	private EClass mAbstractServiceLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevslibPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevslibPackageElementEClass = null;

	/**
	 * @generated
	 */
	private EClass mDriverServiceLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterSLSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterSLSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mBooleanParamSLSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mBooleanParamSLSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mStringParamSLSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mStringParamSLSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mIntegerParamSLSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mIntegerParamSLSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamSLSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamSLSPSwitchCaseEClass = null;

	/**
	 * @generated
	 */
	private EClass mRealParamSLSPSwitchEClass = null;

	/**
	 * @generated
	 */
	private EClass mRealParamSLSPSwitchCaseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mclevslibPackageImpl() {
		super(eNS_URI, mclevslibFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mclevslibPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mclevslibPackage init() {
		if (isInited) return (mclevslibPackage)EPackage.Registry.INSTANCE.getEPackage(mclevslibPackage.eNS_URI);

		// Obtain or create and register package
		mclevslibPackageImpl themclevslibPackage = (mclevslibPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mclevslibPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mclevslibPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mclevsaiPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themclevslibPackage.createPackageContents();

		// Initialize created meta-data
		themclevslibPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themclevslibPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mclevslibPackage.eNS_URI, themclevslibPackage);
		return themclevslibPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMServiceLibrary() {
		return mServiceLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrary_Requires() {
		return (EReference)mServiceLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrary_Languages() {
		return (EReference)mServiceLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrary_Extends() {
		return (EReference)mServiceLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrary_SupportedPlatforms() {
		return (EReference)mServiceLibraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EClass getMServiceLibraryProvidedSAI() {
		return mServiceLibraryProvidedSAIEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibraryProvidedSAI_Sai() {
		return (EReference)mServiceLibraryProvidedSAIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibraryProvidedSAI_AttributeValueAssignments() {
		return (EReference)mServiceLibraryProvidedSAIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMSLibProvidedSAIAVA() {
		return msLibProvidedSAIAVAEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMSLibProvidedSAIAVASwitch() {
		return msLibProvidedSAIAVASwitchEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMSLibProvidedSAIAVASwitch_Cases() {
		return (EReference)msLibProvidedSAIAVASwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMSLibProvidedSAIAVASwitchCase() {
		return msLibProvidedSAIAVASwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMSLibProvidedSAIAVASwitchCase_Platform() {
		return (EReference)msLibProvidedSAIAVASwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMSLibProvidedSAIAVASwitchCase_AttributeValue() {
		return (EReference)msLibProvidedSAIAVASwitchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMSLibProvidedSAIAVAExpression() {
		return msLibProvidedSAIAVAExpressionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMSLibProvidedSAIAVAExpression_AttributeValue() {
		return (EReference)msLibProvidedSAIAVAExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMServiceLibrarySupportedPlatform() {
		return mServiceLibrarySupportedPlatformEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrarySupportedPlatform_Osapi() {
		return (EReference)mServiceLibrarySupportedPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrarySupportedPlatform_Os() {
		return (EReference)mServiceLibrarySupportedPlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrarySupportedPlatform_Architecture() {
		return (EReference)mServiceLibrarySupportedPlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrarySupportedPlatform_Compiler() {
		return (EReference)mServiceLibrarySupportedPlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrarySupportedPlatform_Microprocessor() {
		return (EReference)mServiceLibrarySupportedPlatformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrarySupportedPlatform_Board() {
		return (EReference)mServiceLibrarySupportedPlatformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrarySupportedPlatform_Requires() {
		return (EReference)mServiceLibrarySupportedPlatformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrarySupportedPlatform_Attributes() {
		return (EReference)mServiceLibrarySupportedPlatformEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * @generated
	 */
	public EReference getMServiceLibrarySupportedPlatform_Languages() {
		return (EReference)mServiceLibrarySupportedPlatformEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * @generated
	 */
	public EClass getMDriverSLibSupportedPlatform() {
		return mDriverSLibSupportedPlatformEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMDriverSLibSupportedPlatform_SupportedDevices() {
		return (EReference)mDriverSLibSupportedPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMDriverSLibSupportedDevice() {
		return mDriverSLibSupportedDeviceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMDriverSLibSupportedDevice_Required() {
		return (EReference)mDriverSLibSupportedDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMDriverSLibSupportedDevice_Device() {
		return (EReference)mDriverSLibSupportedDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMAbstractServiceLibrary() {
		return mAbstractServiceLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMAbstractServiceLibrary_Attributes() {
		return (EReference)mAbstractServiceLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMAbstractServiceLibrary_Inherits() {
		return (EReference)mAbstractServiceLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMAbstractServiceLibrary_Provides() {
		return (EReference)mAbstractServiceLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVSLIBPackageFile() {
		return mmclevslibPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVSLIBPackageElement() {
		return mmclevslibPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMDriverServiceLibrary() {
		return mDriverServiceLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMParameterSLSPSwitch() {
		return mParameterSLSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterSLSPSwitch_Cases() {
		return (EReference)mParameterSLSPSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterSLSPSwitchCase() {
		return mParameterSLSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterSLSPSwitchCase_DefaultValue() {
		return (EReference)mParameterSLSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMParameterSLSPSwitchCase_Platform() {
		return (EReference)mParameterSLSPSwitchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMBooleanParamSLSPSwitch() {
		return mBooleanParamSLSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMBooleanParamSLSPSwitchCase() {
		return mBooleanParamSLSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMStringParamSLSPSwitch() {
		return mStringParamSLSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMStringParamSLSPSwitchCase() {
		return mStringParamSLSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIntegerParamSLSPSwitch() {
		return mIntegerParamSLSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIntegerParamSLSPSwitchCase() {
		return mIntegerParamSLSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMIntegerParamSLSPSwitchCase_Range() {
		return (EReference)mIntegerParamSLSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamSLSPSwitch() {
		return mEnumParamSLSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamSLSPSwitchCase() {
		return mEnumParamSLSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMRealParamSLSPSwitch() {
		return mRealParamSLSPSwitchEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMRealParamSLSPSwitchCase() {
		return mRealParamSLSPSwitchCaseEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMRealParamSLSPSwitchCase_Range() {
		return (EReference)mRealParamSLSPSwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public mclevslibFactory getmclevslibFactory() {
		return (mclevslibFactory)getEFactoryInstance();
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
		mServiceLibraryEClass = createEClass(MSERVICE_LIBRARY);
		createEReference(mServiceLibraryEClass, MSERVICE_LIBRARY__REQUIRES);
		createEReference(mServiceLibraryEClass, MSERVICE_LIBRARY__LANGUAGES);
		createEReference(mServiceLibraryEClass, MSERVICE_LIBRARY__EXTENDS);
		createEReference(mServiceLibraryEClass, MSERVICE_LIBRARY__SUPPORTED_PLATFORMS);

		mServiceLibraryProvidedSAIEClass = createEClass(MSERVICE_LIBRARY_PROVIDED_SAI);
		createEReference(mServiceLibraryProvidedSAIEClass, MSERVICE_LIBRARY_PROVIDED_SAI__SAI);
		createEReference(mServiceLibraryProvidedSAIEClass, MSERVICE_LIBRARY_PROVIDED_SAI__ATTRIBUTE_VALUE_ASSIGNMENTS);

		msLibProvidedSAIAVAEClass = createEClass(MS_LIB_PROVIDED_SAIAVA);

		msLibProvidedSAIAVASwitchEClass = createEClass(MS_LIB_PROVIDED_SAIAVA_SWITCH);
		createEReference(msLibProvidedSAIAVASwitchEClass, MS_LIB_PROVIDED_SAIAVA_SWITCH__CASES);

		msLibProvidedSAIAVASwitchCaseEClass = createEClass(MS_LIB_PROVIDED_SAIAVA_SWITCH_CASE);
		createEReference(msLibProvidedSAIAVASwitchCaseEClass, MS_LIB_PROVIDED_SAIAVA_SWITCH_CASE__PLATFORM);
		createEReference(msLibProvidedSAIAVASwitchCaseEClass, MS_LIB_PROVIDED_SAIAVA_SWITCH_CASE__ATTRIBUTE_VALUE);

		msLibProvidedSAIAVAExpressionEClass = createEClass(MS_LIB_PROVIDED_SAIAVA_EXPRESSION);
		createEReference(msLibProvidedSAIAVAExpressionEClass, MS_LIB_PROVIDED_SAIAVA_EXPRESSION__ATTRIBUTE_VALUE);

		mServiceLibrarySupportedPlatformEClass = createEClass(MSERVICE_LIBRARY_SUPPORTED_PLATFORM);
		createEReference(mServiceLibrarySupportedPlatformEClass, MSERVICE_LIBRARY_SUPPORTED_PLATFORM__OSAPI);
		createEReference(mServiceLibrarySupportedPlatformEClass, MSERVICE_LIBRARY_SUPPORTED_PLATFORM__OS);
		createEReference(mServiceLibrarySupportedPlatformEClass, MSERVICE_LIBRARY_SUPPORTED_PLATFORM__ARCHITECTURE);
		createEReference(mServiceLibrarySupportedPlatformEClass, MSERVICE_LIBRARY_SUPPORTED_PLATFORM__COMPILER);
		createEReference(mServiceLibrarySupportedPlatformEClass, MSERVICE_LIBRARY_SUPPORTED_PLATFORM__MICROPROCESSOR);
		createEReference(mServiceLibrarySupportedPlatformEClass, MSERVICE_LIBRARY_SUPPORTED_PLATFORM__BOARD);
		createEReference(mServiceLibrarySupportedPlatformEClass, MSERVICE_LIBRARY_SUPPORTED_PLATFORM__REQUIRES);
		createEReference(mServiceLibrarySupportedPlatformEClass, MSERVICE_LIBRARY_SUPPORTED_PLATFORM__ATTRIBUTES);
		createEReference(mServiceLibrarySupportedPlatformEClass, MSERVICE_LIBRARY_SUPPORTED_PLATFORM__LANGUAGES);

		mDriverSLibSupportedPlatformEClass = createEClass(MDRIVER_SLIB_SUPPORTED_PLATFORM);
		createEReference(mDriverSLibSupportedPlatformEClass, MDRIVER_SLIB_SUPPORTED_PLATFORM__SUPPORTED_DEVICES);

		mDriverSLibSupportedDeviceEClass = createEClass(MDRIVER_SLIB_SUPPORTED_DEVICE);
		createEReference(mDriverSLibSupportedDeviceEClass, MDRIVER_SLIB_SUPPORTED_DEVICE__REQUIRED);
		createEReference(mDriverSLibSupportedDeviceEClass, MDRIVER_SLIB_SUPPORTED_DEVICE__DEVICE);

		mAbstractServiceLibraryEClass = createEClass(MABSTRACT_SERVICE_LIBRARY);
		createEReference(mAbstractServiceLibraryEClass, MABSTRACT_SERVICE_LIBRARY__ATTRIBUTES);
		createEReference(mAbstractServiceLibraryEClass, MABSTRACT_SERVICE_LIBRARY__INHERITS);
		createEReference(mAbstractServiceLibraryEClass, MABSTRACT_SERVICE_LIBRARY__PROVIDES);

		mmclevslibPackageFileEClass = createEClass(MMCLEVSLIB_PACKAGE_FILE);

		mmclevslibPackageElementEClass = createEClass(MMCLEVSLIB_PACKAGE_ELEMENT);

		mDriverServiceLibraryEClass = createEClass(MDRIVER_SERVICE_LIBRARY);

		mParameterSLSPSwitchEClass = createEClass(MPARAMETER_SLSP_SWITCH);
		createEReference(mParameterSLSPSwitchEClass, MPARAMETER_SLSP_SWITCH__CASES);

		mParameterSLSPSwitchCaseEClass = createEClass(MPARAMETER_SLSP_SWITCH_CASE);
		createEReference(mParameterSLSPSwitchCaseEClass, MPARAMETER_SLSP_SWITCH_CASE__DEFAULT_VALUE);
		createEReference(mParameterSLSPSwitchCaseEClass, MPARAMETER_SLSP_SWITCH_CASE__PLATFORM);

		mBooleanParamSLSPSwitchEClass = createEClass(MBOOLEAN_PARAM_SLSP_SWITCH);

		mBooleanParamSLSPSwitchCaseEClass = createEClass(MBOOLEAN_PARAM_SLSP_SWITCH_CASE);

		mStringParamSLSPSwitchEClass = createEClass(MSTRING_PARAM_SLSP_SWITCH);

		mStringParamSLSPSwitchCaseEClass = createEClass(MSTRING_PARAM_SLSP_SWITCH_CASE);

		mIntegerParamSLSPSwitchEClass = createEClass(MINTEGER_PARAM_SLSP_SWITCH);

		mIntegerParamSLSPSwitchCaseEClass = createEClass(MINTEGER_PARAM_SLSP_SWITCH_CASE);
		createEReference(mIntegerParamSLSPSwitchCaseEClass, MINTEGER_PARAM_SLSP_SWITCH_CASE__RANGE);

		mEnumParamSLSPSwitchEClass = createEClass(MENUM_PARAM_SLSP_SWITCH);

		mEnumParamSLSPSwitchCaseEClass = createEClass(MENUM_PARAM_SLSP_SWITCH_CASE);

		mRealParamSLSPSwitchEClass = createEClass(MREAL_PARAM_SLSP_SWITCH);

		mRealParamSLSPSwitchCaseEClass = createEClass(MREAL_PARAM_SLSP_SWITCH_CASE);
		createEReference(mRealParamSLSPSwitchCaseEClass, MREAL_PARAM_SLSP_SWITCH_CASE__RANGE);
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
		pdlPackage thepdlPackage = (pdlPackage)EPackage.Registry.INSTANCE.getEPackage(pdlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mServiceLibraryEClass.getESuperTypes().add(this.getMMCLEVSLIBPackageElement());
		mServiceLibraryEClass.getESuperTypes().add(this.getMAbstractServiceLibrary());
		msLibProvidedSAIAVAEClass.getESuperTypes().add(thecommonPackage.getMParameterValueAssignment());
		msLibProvidedSAIAVASwitchEClass.getESuperTypes().add(this.getMSLibProvidedSAIAVA());
		msLibProvidedSAIAVAExpressionEClass.getESuperTypes().add(this.getMSLibProvidedSAIAVA());
		mServiceLibrarySupportedPlatformEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mDriverSLibSupportedPlatformEClass.getESuperTypes().add(this.getMServiceLibrarySupportedPlatform());
		mDriverSLibSupportedDeviceEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mAbstractServiceLibraryEClass.getESuperTypes().add(this.getMMCLEVSLIBPackageElement());
		mmclevslibPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmclevslibPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());
		mDriverServiceLibraryEClass.getESuperTypes().add(this.getMServiceLibrary());
		mParameterSLSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMParameter());
		mBooleanParamSLSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMBooleanParameter());
		mBooleanParamSLSPSwitchEClass.getESuperTypes().add(this.getMParameterSLSPSwitch());
		mBooleanParamSLSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterSLSPSwitchCase());
		mStringParamSLSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMStringParameter());
		mStringParamSLSPSwitchEClass.getESuperTypes().add(this.getMParameterSLSPSwitch());
		mStringParamSLSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterSLSPSwitchCase());
		mIntegerParamSLSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMIntegerParameter());
		mIntegerParamSLSPSwitchEClass.getESuperTypes().add(this.getMParameterSLSPSwitch());
		mIntegerParamSLSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterSLSPSwitchCase());
		mEnumParamSLSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMEnumParameter());
		mEnumParamSLSPSwitchEClass.getESuperTypes().add(this.getMParameterSLSPSwitch());
		mEnumParamSLSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterSLSPSwitchCase());
		mRealParamSLSPSwitchEClass.getESuperTypes().add(thecommonPackage.getMRealParameter());
		mRealParamSLSPSwitchEClass.getESuperTypes().add(this.getMParameterSLSPSwitch());
		mRealParamSLSPSwitchCaseEClass.getESuperTypes().add(this.getMParameterSLSPSwitchCase());

		// Initialize classes and features; add operations and parameters
		initEClass(mServiceLibraryEClass, MServiceLibrary.class, "MServiceLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMServiceLibrary_Requires(), themclevsaiPackage.getMSAI(), null, "requires", null, 0, -1, MServiceLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibrary_Languages(), thesystemPackage.getMLanguage(), null, "languages", null, 1, -1, MServiceLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibrary_Extends(), this.getMServiceLibrary(), null, "extends", null, 0, -1, MServiceLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibrary_SupportedPlatforms(), this.getMServiceLibrarySupportedPlatform(), null, "supportedPlatforms", null, 1, -1, MServiceLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mServiceLibraryProvidedSAIEClass, MServiceLibraryProvidedSAI.class, "MServiceLibraryProvidedSAI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMServiceLibraryProvidedSAI_Sai(), themclevsaiPackage.getMSAI(), null, "sai", null, 1, 1, MServiceLibraryProvidedSAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibraryProvidedSAI_AttributeValueAssignments(), this.getMSLibProvidedSAIAVA(), null, "attributeValueAssignments", null, 0, -1, MServiceLibraryProvidedSAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msLibProvidedSAIAVAEClass, MSLibProvidedSAIAVA.class, "MSLibProvidedSAIAVA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(msLibProvidedSAIAVASwitchEClass, MSLibProvidedSAIAVASwitch.class, "MSLibProvidedSAIAVASwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSLibProvidedSAIAVASwitch_Cases(), this.getMSLibProvidedSAIAVASwitchCase(), null, "cases", null, 1, -1, MSLibProvidedSAIAVASwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msLibProvidedSAIAVASwitchCaseEClass, MSLibProvidedSAIAVASwitchCase.class, "MSLibProvidedSAIAVASwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSLibProvidedSAIAVASwitchCase_Platform(), this.getMServiceLibrarySupportedPlatform(), null, "platform", null, 1, 1, MSLibProvidedSAIAVASwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSLibProvidedSAIAVASwitchCase_AttributeValue(), thecommonPackage.getMParameterValueExpression(), null, "attributeValue", null, 1, 1, MSLibProvidedSAIAVASwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msLibProvidedSAIAVAExpressionEClass, MSLibProvidedSAIAVAExpression.class, "MSLibProvidedSAIAVAExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSLibProvidedSAIAVAExpression_AttributeValue(), thecommonPackage.getMParameterValueExpression(), null, "attributeValue", null, 1, 1, MSLibProvidedSAIAVAExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mServiceLibrarySupportedPlatformEClass, MServiceLibrarySupportedPlatform.class, "MServiceLibrarySupportedPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMServiceLibrarySupportedPlatform_Osapi(), thepdlPackage.getMOperatingSystemAPI(), null, "osapi", null, 0, 1, MServiceLibrarySupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibrarySupportedPlatform_Os(), thepdlPackage.getMOperatingSystem(), null, "os", null, 0, 1, MServiceLibrarySupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibrarySupportedPlatform_Architecture(), thepdlPackage.getMArchitecture(), null, "architecture", null, 0, 1, MServiceLibrarySupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibrarySupportedPlatform_Compiler(), thepdlPackage.getMCompiler(), null, "compiler", null, 0, 1, MServiceLibrarySupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibrarySupportedPlatform_Microprocessor(), thepdlPackage.getMMicroprocessor(), null, "microprocessor", null, 0, 1, MServiceLibrarySupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibrarySupportedPlatform_Board(), thepdlPackage.getMBoard(), null, "board", null, 0, 1, MServiceLibrarySupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibrarySupportedPlatform_Requires(), themclevsaiPackage.getMSAI(), null, "requires", null, 0, -1, MServiceLibrarySupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibrarySupportedPlatform_Attributes(), thecommonPackage.getMParameter(), null, "attributes", null, 0, -1, MServiceLibrarySupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMServiceLibrarySupportedPlatform_Languages(), thesystemPackage.getMLanguage(), null, "languages", null, 0, -1, MServiceLibrarySupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDriverSLibSupportedPlatformEClass, MDriverSLibSupportedPlatform.class, "MDriverSLibSupportedPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDriverSLibSupportedPlatform_SupportedDevices(), this.getMDriverSLibSupportedDevice(), null, "supportedDevices", null, 0, -1, MDriverSLibSupportedPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDriverSLibSupportedDeviceEClass, MDriverSLibSupportedDevice.class, "MDriverSLibSupportedDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDriverSLibSupportedDevice_Required(), thecommonPackage.getMParameterValueExpression(), null, "required", null, 0, 1, MDriverSLibSupportedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDriverSLibSupportedDevice_Device(), thepdlPackage.getMDevice(), null, "device", null, 1, 1, MDriverSLibSupportedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mAbstractServiceLibraryEClass, MAbstractServiceLibrary.class, "MAbstractServiceLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAbstractServiceLibrary_Attributes(), thecommonPackage.getMParameter(), null, "attributes", null, 0, -1, MAbstractServiceLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAbstractServiceLibrary_Inherits(), this.getMAbstractServiceLibrary(), null, "inherits", null, 0, -1, MAbstractServiceLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAbstractServiceLibrary_Provides(), this.getMServiceLibraryProvidedSAI(), null, "provides", null, 0, -1, MAbstractServiceLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmclevslibPackageFileEClass, MMCLEVSLIBPackageFile.class, "MMCLEVSLIBPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevslibPackageElementEClass, MMCLEVSLIBPackageElement.class, "MMCLEVSLIBPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mDriverServiceLibraryEClass, MDriverServiceLibrary.class, "MDriverServiceLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mParameterSLSPSwitchEClass, MParameterSLSPSwitch.class, "MParameterSLSPSwitch", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterSLSPSwitch_Cases(), this.getMParameterSLSPSwitchCase(), null, "cases", null, 1, -1, MParameterSLSPSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterSLSPSwitchCaseEClass, MParameterSLSPSwitchCase.class, "MParameterSLSPSwitchCase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterSLSPSwitchCase_DefaultValue(), thecommonPackage.getMParameterValueExpression(), null, "defaultValue", null, 1, 1, MParameterSLSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMParameterSLSPSwitchCase_Platform(), this.getMServiceLibrarySupportedPlatform(), null, "platform", null, 1, 1, MParameterSLSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mBooleanParamSLSPSwitchEClass, MBooleanParamSLSPSwitch.class, "MBooleanParamSLSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mBooleanParamSLSPSwitchCaseEClass, MBooleanParamSLSPSwitchCase.class, "MBooleanParamSLSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mStringParamSLSPSwitchEClass, MStringParamSLSPSwitch.class, "MStringParamSLSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mStringParamSLSPSwitchCaseEClass, MStringParamSLSPSwitchCase.class, "MStringParamSLSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mIntegerParamSLSPSwitchEClass, MIntegerParamSLSPSwitch.class, "MIntegerParamSLSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mIntegerParamSLSPSwitchCaseEClass, MIntegerParamSLSPSwitchCase.class, "MIntegerParamSLSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMIntegerParamSLSPSwitchCase_Range(), thecommonPackage.getMParameterRange(), null, "range", null, 0, 1, MIntegerParamSLSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEnumParamSLSPSwitchEClass, MEnumParamSLSPSwitch.class, "MEnumParamSLSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mEnumParamSLSPSwitchCaseEClass, MEnumParamSLSPSwitchCase.class, "MEnumParamSLSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mRealParamSLSPSwitchEClass, MRealParamSLSPSwitch.class, "MRealParamSLSPSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mRealParamSLSPSwitchCaseEClass, MRealParamSLSPSwitchCase.class, "MRealParamSLSPSwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMRealParamSLSPSwitchCase_Range(), thecommonPackage.getMParameterRange(), null, "range", null, 0, 1, MRealParamSLSPSwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

}