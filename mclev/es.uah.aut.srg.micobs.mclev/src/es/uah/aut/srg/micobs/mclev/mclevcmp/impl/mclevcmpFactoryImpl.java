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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MStringParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpFactory;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class mclevcmpFactoryImpl extends EFactoryImpl implements mclevcmpFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mclevcmpFactory init() {
		try {
			mclevcmpFactory themclevcmpFactory = (mclevcmpFactory)EPackage.Registry.INSTANCE.getEFactory(mclevcmpPackage.eNS_URI);
			if (themclevcmpFactory != null) {
				return themclevcmpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mclevcmpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mclevcmpFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mclevcmpPackage.MCOMPONENT: return createMComponent();
			case mclevcmpPackage.MABSTRACT_COMPONENT: return createMAbstractComponent();
			case mclevcmpPackage.MCOMPONENT_SUPPORTED_PLATFORM: return createMComponentSupportedPlatform();
			case mclevcmpPackage.MINTERNAL_COMPONENT_INSTANCE: return createMInternalComponentInstance();
			case mclevcmpPackage.MSERVER_PORT: return createMServerPort();
			case mclevcmpPackage.MCLIENT_PORT: return createMClientPort();
			case mclevcmpPackage.MINTERNAL_COMPONENT_CONNECTION: return createMInternalComponentConnection();
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH: return createMInternalComponentPlatformSwitch();
			case mclevcmpPackage.MINTERNAL_COMPONENT_PLATFORM_SWITCH_CASE: return createMInternalComponentPlatformSwitchCase();
			case mclevcmpPackage.MMCLEVCMP_PACKAGE_FILE: return createMMCLEVCMPPackageFile();
			case mclevcmpPackage.MBOOLEAN_PARAM_CSP_SWITCH: return createMBooleanParamCSPSwitch();
			case mclevcmpPackage.MBOOLEAN_PARAM_CSP_SWITCH_CASE: return createMBooleanParamCSPSwitchCase();
			case mclevcmpPackage.MSTRING_PARAM_CSP_SWITCH: return createMStringParamCSPSwitch();
			case mclevcmpPackage.MSTRING_PARAM_CSP_SWITCH_CASE: return createMStringParamCSPSwitchCase();
			case mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH: return createMIntegerParamCSPSwitch();
			case mclevcmpPackage.MINTEGER_PARAM_CSP_SWITCH_CASE: return createMIntegerParamCSPSwitchCase();
			case mclevcmpPackage.MENUM_PARAM_CSP_SWITCH: return createMEnumParamCSPSwitch();
			case mclevcmpPackage.MENUM_PARAM_CSP_SWITCH_CASE: return createMEnumParamCSPSwitchCase();
			case mclevcmpPackage.MREAL_PARAM_CSP_SWITCH: return createMRealParamCSPSwitch();
			case mclevcmpPackage.MREAL_PARAM_CSP_SWITCH_CASE: return createMRealParamCSPSwitchCase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MComponent createMComponent() {
		MComponentImpl mComponent = new MComponentImpl();
		return mComponent;
	}

	/**
	 * @generated
	 */
	public MAbstractComponent createMAbstractComponent() {
		MAbstractComponentImpl mAbstractComponent = new MAbstractComponentImpl();
		return mAbstractComponent;
	}

	/**
	 * @generated
	 */
	public MComponentSupportedPlatform createMComponentSupportedPlatform() {
		MComponentSupportedPlatformImpl mComponentSupportedPlatform = new MComponentSupportedPlatformImpl();
		return mComponentSupportedPlatform;
	}

	/**
	 * @generated
	 */
	public MInternalComponentInstance createMInternalComponentInstance() {
		MInternalComponentInstanceImpl mInternalComponentInstance = new MInternalComponentInstanceImpl();
		return mInternalComponentInstance;
	}

	/**
	 * @generated
	 */
	public MServerPort createMServerPort() {
		MServerPortImpl mServerPort = new MServerPortImpl();
		return mServerPort;
	}

	/**
	 * @generated
	 */
	public MClientPort createMClientPort() {
		MClientPortImpl mClientPort = new MClientPortImpl();
		return mClientPort;
	}

	/**
	 * @generated
	 */
	public MInternalComponentConnection createMInternalComponentConnection() {
		MInternalComponentConnectionImpl mInternalComponentConnection = new MInternalComponentConnectionImpl();
		return mInternalComponentConnection;
	}

	/**
	 * @generated
	 */
	public MInternalComponentPlatformSwitch createMInternalComponentPlatformSwitch() {
		MInternalComponentPlatformSwitchImpl mInternalComponentPlatformSwitch = new MInternalComponentPlatformSwitchImpl();
		return mInternalComponentPlatformSwitch;
	}

	/**
	 * @generated
	 */
	public MInternalComponentPlatformSwitchCase createMInternalComponentPlatformSwitchCase() {
		MInternalComponentPlatformSwitchCaseImpl mInternalComponentPlatformSwitchCase = new MInternalComponentPlatformSwitchCaseImpl();
		return mInternalComponentPlatformSwitchCase;
	}

	/**
	 * @generated
	 */
	public MMCLEVCMPPackageFile createMMCLEVCMPPackageFile() {
		MMCLEVCMPPackageFileImpl mmclevcmpPackageFile = new MMCLEVCMPPackageFileImpl();
		return mmclevcmpPackageFile;
	}

	/**
	 * @generated
	 */
	public MBooleanParamCSPSwitch createMBooleanParamCSPSwitch() {
		MBooleanParamCSPSwitchImpl mBooleanParamCSPSwitch = new MBooleanParamCSPSwitchImpl();
		return mBooleanParamCSPSwitch;
	}

	/**
	 * @generated
	 */
	public MBooleanParamCSPSwitchCase createMBooleanParamCSPSwitchCase() {
		MBooleanParamCSPSwitchCaseImpl mBooleanParamCSPSwitchCase = new MBooleanParamCSPSwitchCaseImpl();
		return mBooleanParamCSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MStringParamCSPSwitch createMStringParamCSPSwitch() {
		MStringParamCSPSwitchImpl mStringParamCSPSwitch = new MStringParamCSPSwitchImpl();
		return mStringParamCSPSwitch;
	}

	/**
	 * @generated
	 */
	public MStringParamCSPSwitchCase createMStringParamCSPSwitchCase() {
		MStringParamCSPSwitchCaseImpl mStringParamCSPSwitchCase = new MStringParamCSPSwitchCaseImpl();
		return mStringParamCSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MIntegerParamCSPSwitch createMIntegerParamCSPSwitch() {
		MIntegerParamCSPSwitchImpl mIntegerParamCSPSwitch = new MIntegerParamCSPSwitchImpl();
		return mIntegerParamCSPSwitch;
	}

	/**
	 * @generated
	 */
	public MIntegerParamCSPSwitchCase createMIntegerParamCSPSwitchCase() {
		MIntegerParamCSPSwitchCaseImpl mIntegerParamCSPSwitchCase = new MIntegerParamCSPSwitchCaseImpl();
		return mIntegerParamCSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MEnumParamCSPSwitch createMEnumParamCSPSwitch() {
		MEnumParamCSPSwitchImpl mEnumParamCSPSwitch = new MEnumParamCSPSwitchImpl();
		return mEnumParamCSPSwitch;
	}

	/**
	 * @generated
	 */
	public MEnumParamCSPSwitchCase createMEnumParamCSPSwitchCase() {
		MEnumParamCSPSwitchCaseImpl mEnumParamCSPSwitchCase = new MEnumParamCSPSwitchCaseImpl();
		return mEnumParamCSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MRealParamCSPSwitch createMRealParamCSPSwitch() {
		MRealParamCSPSwitchImpl mRealParamCSPSwitch = new MRealParamCSPSwitchImpl();
		return mRealParamCSPSwitch;
	}

	/**
	 * @generated
	 */
	public MRealParamCSPSwitchCase createMRealParamCSPSwitchCase() {
		MRealParamCSPSwitchCaseImpl mRealParamCSPSwitchCase = new MRealParamCSPSwitchCaseImpl();
		return mRealParamCSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public mclevcmpPackage getmclevcmpPackage() {
		return (mclevcmpPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mclevcmpPackage getPackage() {
		return mclevcmpPackage.eINSTANCE;
	}

}