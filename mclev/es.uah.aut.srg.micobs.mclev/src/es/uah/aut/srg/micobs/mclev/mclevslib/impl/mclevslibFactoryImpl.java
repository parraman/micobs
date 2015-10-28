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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import es.uah.aut.srg.micobs.mclev.mclevslib.MMCLEVSLIBPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitchCase;
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

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class mclevslibFactoryImpl extends EFactoryImpl implements mclevslibFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mclevslibFactory init() {
		try {
			mclevslibFactory themclevslibFactory = (mclevslibFactory)EPackage.Registry.INSTANCE.getEFactory(mclevslibPackage.eNS_URI);
			if (themclevslibFactory != null) {
				return themclevslibFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mclevslibFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mclevslibFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mclevslibPackage.MSERVICE_LIBRARY: return createMServiceLibrary();
			case mclevslibPackage.MSERVICE_LIBRARY_PROVIDED_SAI: return createMServiceLibraryProvidedSAI();
			case mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_SWITCH: return createMSLibProvidedSAIAVASwitch();
			case mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_SWITCH_CASE: return createMSLibProvidedSAIAVASwitchCase();
			case mclevslibPackage.MS_LIB_PROVIDED_SAIAVA_EXPRESSION: return createMSLibProvidedSAIAVAExpression();
			case mclevslibPackage.MSERVICE_LIBRARY_SUPPORTED_PLATFORM: return createMServiceLibrarySupportedPlatform();
			case mclevslibPackage.MDRIVER_SLIB_SUPPORTED_PLATFORM: return createMDriverSLibSupportedPlatform();
			case mclevslibPackage.MDRIVER_SLIB_SUPPORTED_DEVICE: return createMDriverSLibSupportedDevice();
			case mclevslibPackage.MABSTRACT_SERVICE_LIBRARY: return createMAbstractServiceLibrary();
			case mclevslibPackage.MMCLEVSLIB_PACKAGE_FILE: return createMMCLEVSLIBPackageFile();
			case mclevslibPackage.MDRIVER_SERVICE_LIBRARY: return createMDriverServiceLibrary();
			case mclevslibPackage.MBOOLEAN_PARAM_SLSP_SWITCH: return createMBooleanParamSLSPSwitch();
			case mclevslibPackage.MBOOLEAN_PARAM_SLSP_SWITCH_CASE: return createMBooleanParamSLSPSwitchCase();
			case mclevslibPackage.MSTRING_PARAM_SLSP_SWITCH: return createMStringParamSLSPSwitch();
			case mclevslibPackage.MSTRING_PARAM_SLSP_SWITCH_CASE: return createMStringParamSLSPSwitchCase();
			case mclevslibPackage.MINTEGER_PARAM_SLSP_SWITCH: return createMIntegerParamSLSPSwitch();
			case mclevslibPackage.MINTEGER_PARAM_SLSP_SWITCH_CASE: return createMIntegerParamSLSPSwitchCase();
			case mclevslibPackage.MENUM_PARAM_SLSP_SWITCH: return createMEnumParamSLSPSwitch();
			case mclevslibPackage.MENUM_PARAM_SLSP_SWITCH_CASE: return createMEnumParamSLSPSwitchCase();
			case mclevslibPackage.MREAL_PARAM_SLSP_SWITCH: return createMRealParamSLSPSwitch();
			case mclevslibPackage.MREAL_PARAM_SLSP_SWITCH_CASE: return createMRealParamSLSPSwitchCase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MServiceLibrary createMServiceLibrary() {
		MServiceLibraryImpl mServiceLibrary = new MServiceLibraryImpl();
		return mServiceLibrary;
	}

	/**
	 * @generated
	 */
	public MServiceLibraryProvidedSAI createMServiceLibraryProvidedSAI() {
		MServiceLibraryProvidedSAIImpl mServiceLibraryProvidedSAI = new MServiceLibraryProvidedSAIImpl();
		return mServiceLibraryProvidedSAI;
	}

	/**
	 * @generated
	 */
	public MSLibProvidedSAIAVASwitch createMSLibProvidedSAIAVASwitch() {
		MSLibProvidedSAIAVASwitchImpl msLibProvidedSAIAVASwitch = new MSLibProvidedSAIAVASwitchImpl();
		return msLibProvidedSAIAVASwitch;
	}

	/**
	 * @generated
	 */
	public MSLibProvidedSAIAVASwitchCase createMSLibProvidedSAIAVASwitchCase() {
		MSLibProvidedSAIAVASwitchCaseImpl msLibProvidedSAIAVASwitchCase = new MSLibProvidedSAIAVASwitchCaseImpl();
		return msLibProvidedSAIAVASwitchCase;
	}

	/**
	 * @generated
	 */
	public MSLibProvidedSAIAVAExpression createMSLibProvidedSAIAVAExpression() {
		MSLibProvidedSAIAVAExpressionImpl msLibProvidedSAIAVAExpression = new MSLibProvidedSAIAVAExpressionImpl();
		return msLibProvidedSAIAVAExpression;
	}

	/**
	 * @generated
	 */
	public MServiceLibrarySupportedPlatform createMServiceLibrarySupportedPlatform() {
		MServiceLibrarySupportedPlatformImpl mServiceLibrarySupportedPlatform = new MServiceLibrarySupportedPlatformImpl();
		return mServiceLibrarySupportedPlatform;
	}

	/**
	 * @generated
	 */
	public MDriverSLibSupportedPlatform createMDriverSLibSupportedPlatform() {
		MDriverSLibSupportedPlatformImpl mDriverSLibSupportedPlatform = new MDriverSLibSupportedPlatformImpl();
		return mDriverSLibSupportedPlatform;
	}

	/**
	 * @generated
	 */
	public MDriverSLibSupportedDevice createMDriverSLibSupportedDevice() {
		MDriverSLibSupportedDeviceImpl mDriverSLibSupportedDevice = new MDriverSLibSupportedDeviceImpl();
		return mDriverSLibSupportedDevice;
	}

	/**
	 * @generated
	 */
	public MAbstractServiceLibrary createMAbstractServiceLibrary() {
		MAbstractServiceLibraryImpl mAbstractServiceLibrary = new MAbstractServiceLibraryImpl();
		return mAbstractServiceLibrary;
	}

	/**
	 * @generated
	 */
	public MMCLEVSLIBPackageFile createMMCLEVSLIBPackageFile() {
		MMCLEVSLIBPackageFileImpl mmclevslibPackageFile = new MMCLEVSLIBPackageFileImpl();
		return mmclevslibPackageFile;
	}

	/**
	 * @generated
	 */
	public MDriverServiceLibrary createMDriverServiceLibrary() {
		MDriverServiceLibraryImpl mDriverServiceLibrary = new MDriverServiceLibraryImpl();
		return mDriverServiceLibrary;
	}

	/**
	 * @generated
	 */
	public MBooleanParamSLSPSwitch createMBooleanParamSLSPSwitch() {
		MBooleanParamSLSPSwitchImpl mBooleanParamSLSPSwitch = new MBooleanParamSLSPSwitchImpl();
		return mBooleanParamSLSPSwitch;
	}

	/**
	 * @generated
	 */
	public MBooleanParamSLSPSwitchCase createMBooleanParamSLSPSwitchCase() {
		MBooleanParamSLSPSwitchCaseImpl mBooleanParamSLSPSwitchCase = new MBooleanParamSLSPSwitchCaseImpl();
		return mBooleanParamSLSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MStringParamSLSPSwitch createMStringParamSLSPSwitch() {
		MStringParamSLSPSwitchImpl mStringParamSLSPSwitch = new MStringParamSLSPSwitchImpl();
		return mStringParamSLSPSwitch;
	}

	/**
	 * @generated
	 */
	public MStringParamSLSPSwitchCase createMStringParamSLSPSwitchCase() {
		MStringParamSLSPSwitchCaseImpl mStringParamSLSPSwitchCase = new MStringParamSLSPSwitchCaseImpl();
		return mStringParamSLSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MIntegerParamSLSPSwitch createMIntegerParamSLSPSwitch() {
		MIntegerParamSLSPSwitchImpl mIntegerParamSLSPSwitch = new MIntegerParamSLSPSwitchImpl();
		return mIntegerParamSLSPSwitch;
	}

	/**
	 * @generated
	 */
	public MIntegerParamSLSPSwitchCase createMIntegerParamSLSPSwitchCase() {
		MIntegerParamSLSPSwitchCaseImpl mIntegerParamSLSPSwitchCase = new MIntegerParamSLSPSwitchCaseImpl();
		return mIntegerParamSLSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MEnumParamSLSPSwitch createMEnumParamSLSPSwitch() {
		MEnumParamSLSPSwitchImpl mEnumParamSLSPSwitch = new MEnumParamSLSPSwitchImpl();
		return mEnumParamSLSPSwitch;
	}

	/**
	 * @generated
	 */
	public MEnumParamSLSPSwitchCase createMEnumParamSLSPSwitchCase() {
		MEnumParamSLSPSwitchCaseImpl mEnumParamSLSPSwitchCase = new MEnumParamSLSPSwitchCaseImpl();
		return mEnumParamSLSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MRealParamSLSPSwitch createMRealParamSLSPSwitch() {
		MRealParamSLSPSwitchImpl mRealParamSLSPSwitch = new MRealParamSLSPSwitchImpl();
		return mRealParamSLSPSwitch;
	}

	/**
	 * @generated
	 */
	public MRealParamSLSPSwitchCase createMRealParamSLSPSwitchCase() {
		MRealParamSLSPSwitchCaseImpl mRealParamSLSPSwitchCase = new MRealParamSLSPSwitchCaseImpl();
		return mRealParamSLSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public mclevslibPackage getmclevslibPackage() {
		return (mclevslibPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mclevslibPackage getPackage() {
		return mclevslibPackage.eINSTANCE;
	}

}