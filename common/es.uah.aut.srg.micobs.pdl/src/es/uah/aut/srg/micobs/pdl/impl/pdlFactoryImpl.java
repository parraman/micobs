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
package es.uah.aut.srg.micobs.pdl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.MPDLPackageFile;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MStringParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.pdlFactory;
import es.uah.aut.srg.micobs.pdl.pdlPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class pdlFactoryImpl extends EFactoryImpl implements pdlFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static pdlFactory init() {
		try {
			pdlFactory thepdlFactory = (pdlFactory)EPackage.Registry.INSTANCE.getEFactory(pdlPackage.eNS_URI);
			if (thepdlFactory != null) {
				return thepdlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new pdlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public pdlFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case pdlPackage.MBOARD: return createMBoard();
			case pdlPackage.MBOARD_SUPPORTED_DEVICE: return createMBoardSupportedDevice();
			case pdlPackage.MMICROPROCESSOR: return createMMicroprocessor();
			case pdlPackage.MOPERATING_SYSTEM: return createMOperatingSystem();
			case pdlPackage.MOS_SUPPORTED_PLATFORM: return createMOSSupportedPlatform();
			case pdlPackage.MOS_SUPPORTED_OSAPI: return createMOSSupportedOSAPI();
			case pdlPackage.MOS_SUPPORTED_OSAPIPVA_EXPRESSION: return createMOSSupportedOSAPIPVAExpression();
			case pdlPackage.MOS_SUPPORTED_OSAPIPVA_SWITCH: return createMOSSupportedOSAPIPVASwitch();
			case pdlPackage.MOS_SUPPORTED_OSAPIPVA_SWITCH_CASE: return createMOSSupportedOSAPIPVASwitchCase();
			case pdlPackage.MOPERATING_SYSTEM_API: return createMOperatingSystemAPI();
			case pdlPackage.MARCHITECTURE: return createMArchitecture();
			case pdlPackage.MPDL_PACKAGE_FILE: return createMPDLPackageFile();
			case pdlPackage.MPLATFORM: return createMPlatform();
			case pdlPackage.MCOMPILER: return createMCompiler();
			case pdlPackage.MCOMPILER_FRONTEND: return createMCompilerFrontend();
			case pdlPackage.MDEVICE: return createMDevice();
			case pdlPackage.MBOOLEAN_PARAM_OSSP_SWITCH: return createMBooleanParamOSSPSwitch();
			case pdlPackage.MBOOLEAN_PARAM_OSSP_SWITCH_CASE: return createMBooleanParamOSSPSwitchCase();
			case pdlPackage.MSTRING_PARAM_OSSP_SWITCH: return createMStringParamOSSPSwitch();
			case pdlPackage.MSTRING_PARAM_OSSP_SWITCH_CASE: return createMStringParamOSSPSwitchCase();
			case pdlPackage.MINTEGER_PARAM_OSSP_SWITCH: return createMIntegerParamOSSPSwitch();
			case pdlPackage.MINTEGER_PARAM_OSSP_SWITCH_CASE: return createMIntegerParamOSSPSwitchCase();
			case pdlPackage.MENUM_PARAM_OSSP_SWITCH: return createMEnumParamOSSPSwitch();
			case pdlPackage.MENUM_PARAM_OSSP_SWITCH_CASE: return createMEnumParamOSSPSwitchCase();
			case pdlPackage.MREAL_PARAM_OSSP_SWITCH: return createMRealParamOSSPSwitch();
			case pdlPackage.MREAL_PARAM_OSSP_SWITCH_CASE: return createMRealParamOSSPSwitchCase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MBoard createMBoard() {
		MBoardImpl mBoard = new MBoardImpl();
		return mBoard;
	}

	/**
	 * @generated
	 */
	public MBoardSupportedDevice createMBoardSupportedDevice() {
		MBoardSupportedDeviceImpl mBoardSupportedDevice = new MBoardSupportedDeviceImpl();
		return mBoardSupportedDevice;
	}

	/**
	 * @generated
	 */
	public MMicroprocessor createMMicroprocessor() {
		MMicroprocessorImpl mMicroprocessor = new MMicroprocessorImpl();
		return mMicroprocessor;
	}

	/**
	 * @generated
	 */
	public MOperatingSystem createMOperatingSystem() {
		MOperatingSystemImpl mOperatingSystem = new MOperatingSystemImpl();
		return mOperatingSystem;
	}

	/**
	 * @generated
	 */
	public MOSSupportedPlatform createMOSSupportedPlatform() {
		MOSSupportedPlatformImpl mosSupportedPlatform = new MOSSupportedPlatformImpl();
		return mosSupportedPlatform;
	}

	/**
	 * @generated
	 */
	public MOSSupportedOSAPI createMOSSupportedOSAPI() {
		MOSSupportedOSAPIImpl mosSupportedOSAPI = new MOSSupportedOSAPIImpl();
		return mosSupportedOSAPI;
	}

	/**
	 * @generated
	 */
	public MOSSupportedOSAPIPVAExpression createMOSSupportedOSAPIPVAExpression() {
		MOSSupportedOSAPIPVAExpressionImpl mosSupportedOSAPIPVAExpression = new MOSSupportedOSAPIPVAExpressionImpl();
		return mosSupportedOSAPIPVAExpression;
	}

	/**
	 * @generated
	 */
	public MOSSupportedOSAPIPVASwitch createMOSSupportedOSAPIPVASwitch() {
		MOSSupportedOSAPIPVASwitchImpl mosSupportedOSAPIPVASwitch = new MOSSupportedOSAPIPVASwitchImpl();
		return mosSupportedOSAPIPVASwitch;
	}

	/**
	 * @generated
	 */
	public MOSSupportedOSAPIPVASwitchCase createMOSSupportedOSAPIPVASwitchCase() {
		MOSSupportedOSAPIPVASwitchCaseImpl mosSupportedOSAPIPVASwitchCase = new MOSSupportedOSAPIPVASwitchCaseImpl();
		return mosSupportedOSAPIPVASwitchCase;
	}

	/**
	 * @generated
	 */
	public MOperatingSystemAPI createMOperatingSystemAPI() {
		MOperatingSystemAPIImpl mOperatingSystemAPI = new MOperatingSystemAPIImpl();
		return mOperatingSystemAPI;
	}

	/**
	 * @generated
	 */
	public MArchitecture createMArchitecture() {
		MArchitectureImpl mArchitecture = new MArchitectureImpl();
		return mArchitecture;
	}

	/**
	 * @generated
	 */
	public MPDLPackageFile createMPDLPackageFile() {
		MPDLPackageFileImpl mpdlPackageFile = new MPDLPackageFileImpl();
		return mpdlPackageFile;
	}

	/**
	 * @generated
	 */
	public MPlatform createMPlatform() {
		MPlatformImpl mPlatform = new MPlatformImpl();
		return mPlatform;
	}

	/**
	 * @generated
	 */
	public MCompiler createMCompiler() {
		MCompilerImpl mCompiler = new MCompilerImpl();
		return mCompiler;
	}

	/**
	 * @generated
	 */
	public MCompilerFrontend createMCompilerFrontend() {
		MCompilerFrontendImpl mCompilerFrontend = new MCompilerFrontendImpl();
		return mCompilerFrontend;
	}

	/**
	 * @generated
	 */
	public MDevice createMDevice() {
		MDeviceImpl mDevice = new MDeviceImpl();
		return mDevice;
	}

	/**
	 * @generated
	 */
	public MBooleanParamOSSPSwitch createMBooleanParamOSSPSwitch() {
		MBooleanParamOSSPSwitchImpl mBooleanParamOSSPSwitch = new MBooleanParamOSSPSwitchImpl();
		return mBooleanParamOSSPSwitch;
	}

	/**
	 * @generated
	 */
	public MBooleanParamOSSPSwitchCase createMBooleanParamOSSPSwitchCase() {
		MBooleanParamOSSPSwitchCaseImpl mBooleanParamOSSPSwitchCase = new MBooleanParamOSSPSwitchCaseImpl();
		return mBooleanParamOSSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MStringParamOSSPSwitch createMStringParamOSSPSwitch() {
		MStringParamOSSPSwitchImpl mStringParamOSSPSwitch = new MStringParamOSSPSwitchImpl();
		return mStringParamOSSPSwitch;
	}

	/**
	 * @generated
	 */
	public MStringParamOSSPSwitchCase createMStringParamOSSPSwitchCase() {
		MStringParamOSSPSwitchCaseImpl mStringParamOSSPSwitchCase = new MStringParamOSSPSwitchCaseImpl();
		return mStringParamOSSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MIntegerParamOSSPSwitch createMIntegerParamOSSPSwitch() {
		MIntegerParamOSSPSwitchImpl mIntegerParamOSSPSwitch = new MIntegerParamOSSPSwitchImpl();
		return mIntegerParamOSSPSwitch;
	}

	/**
	 * @generated
	 */
	public MIntegerParamOSSPSwitchCase createMIntegerParamOSSPSwitchCase() {
		MIntegerParamOSSPSwitchCaseImpl mIntegerParamOSSPSwitchCase = new MIntegerParamOSSPSwitchCaseImpl();
		return mIntegerParamOSSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MEnumParamOSSPSwitch createMEnumParamOSSPSwitch() {
		MEnumParamOSSPSwitchImpl mEnumParamOSSPSwitch = new MEnumParamOSSPSwitchImpl();
		return mEnumParamOSSPSwitch;
	}

	/**
	 * @generated
	 */
	public MEnumParamOSSPSwitchCase createMEnumParamOSSPSwitchCase() {
		MEnumParamOSSPSwitchCaseImpl mEnumParamOSSPSwitchCase = new MEnumParamOSSPSwitchCaseImpl();
		return mEnumParamOSSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MRealParamOSSPSwitch createMRealParamOSSPSwitch() {
		MRealParamOSSPSwitchImpl mRealParamOSSPSwitch = new MRealParamOSSPSwitchImpl();
		return mRealParamOSSPSwitch;
	}

	/**
	 * @generated
	 */
	public MRealParamOSSPSwitchCase createMRealParamOSSPSwitchCase() {
		MRealParamOSSPSwitchCaseImpl mRealParamOSSPSwitchCase = new MRealParamOSSPSwitchCaseImpl();
		return mRealParamOSSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public pdlPackage getpdlPackage() {
		return (pdlPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static pdlPackage getPackage() {
		return pdlPackage.eINSTANCE;
	}

}
