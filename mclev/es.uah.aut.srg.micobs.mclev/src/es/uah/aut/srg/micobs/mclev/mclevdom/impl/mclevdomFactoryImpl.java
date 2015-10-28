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
package es.uah.aut.srg.micobs.mclev.mclevdom.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MBooleanParamIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MBooleanParamIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevdom.MEnumParamIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MEnumParamIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalClientPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalServerPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalClientPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalServerPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MMCLEVDOMPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.MStringParamIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MStringParamIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomFactory;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class mclevdomFactoryImpl extends EFactoryImpl implements mclevdomFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mclevdomFactory init() {
		try {
			mclevdomFactory themclevdomFactory = (mclevdomFactory)EPackage.Registry.INSTANCE.getEFactory(mclevdomPackage.eNS_URI);
			if (themclevdomFactory != null) {
				return themclevdomFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mclevdomFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mclevdomFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mclevdomPackage.MAO_DOMAIN: return createMAODomain();
			case mclevdomPackage.MIO_DOMAIN: return createMIODomain();
			case mclevdomPackage.MIOD_ABSTRACT_COMPONENT_TYPE: return createMIODAbstractComponentType();
			case mclevdomPackage.MIOD_COMPONENT_TYPE: return createMIODComponentType();
			case mclevdomPackage.MAOD_COMPONENT_TYPE: return createMAODComponentType();
			case mclevdomPackage.MIOD_COMPONENT_TYPE_INSTANCE: return createMIODComponentTypeInstance();
			case mclevdomPackage.MAOD_COMPONENT_TYPE_INSTANCE: return createMAODComponentTypeInstance();
			case mclevdomPackage.MINTERNAL_PORT_TYPE_INSTANCE: return createMInternalPortTypeInstance();
			case mclevdomPackage.MINTERNAL_CLIENT_PORT_TYPE_INSTANCE: return createMInternalClientPortTypeInstance();
			case mclevdomPackage.MINTERNAL_SERVER_PORT_TYPE_INSTANCE: return createMInternalServerPortTypeInstance();
			case mclevdomPackage.MEXTERNAL_PORT_TYPE_INSTANCE: return createMExternalPortTypeInstance();
			case mclevdomPackage.MEXTERNAL_CLIENT_PORT_TYPE_INSTANCE: return createMExternalClientPortTypeInstance();
			case mclevdomPackage.MEXTERNAL_SERVER_PORT_TYPE_INSTANCE: return createMExternalServerPortTypeInstance();
			case mclevdomPackage.MCONNECTOR: return createMConnector();
			case mclevdomPackage.MPORT_TYPE: return createMPortType();
			case mclevdomPackage.MINTERFACE_TYPE: return createMInterfaceType();
			case mclevdomPackage.MEXCHANGE_MODEL: return createMExchangeModel();
			case mclevdomPackage.MMCLEVDOM_PACKAGE_FILE: return createMMCLEVDOMPackageFile();
			case mclevdomPackage.MIO_DOMAIN_SUPPORTED_PLATFORM: return createMIODomainSupportedPlatform();
			case mclevdomPackage.MBOOLEAN_PARAM_IODSP_SWITCH: return createMBooleanParamIODSPSwitch();
			case mclevdomPackage.MBOOLEAN_PARAM_IODSP_SWITCH_CASE: return createMBooleanParamIODSPSwitchCase();
			case mclevdomPackage.MSTRING_PARAM_IODSP_SWITCH: return createMStringParamIODSPSwitch();
			case mclevdomPackage.MSTRING_PARAM_IODSP_SWITCH_CASE: return createMStringParamIODSPSwitchCase();
			case mclevdomPackage.MINTEGER_PARAM_IODSP_SWITCH: return createMIntegerParamIODSPSwitch();
			case mclevdomPackage.MINTEGER_PARAM_IODSP_SWITCH_CASE: return createMIntegerParamIODSPSwitchCase();
			case mclevdomPackage.MENUM_PARAM_IODSP_SWITCH: return createMEnumParamIODSPSwitch();
			case mclevdomPackage.MENUM_PARAM_IODSP_SWITCH_CASE: return createMEnumParamIODSPSwitchCase();
			case mclevdomPackage.MREAL_PARAM_IODSP_SWITCH: return createMRealParamIODSPSwitch();
			case mclevdomPackage.MREAL_PARAM_IODSP_SWITCH_CASE: return createMRealParamIODSPSwitchCase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MAODomain createMAODomain() {
		MAODomainImpl maoDomain = new MAODomainImpl();
		return maoDomain;
	}

	/**
	 * @generated
	 */
	public MIODomain createMIODomain() {
		MIODomainImpl mioDomain = new MIODomainImpl();
		return mioDomain;
	}

	/**
	 * @generated
	 */
	public MIODAbstractComponentType createMIODAbstractComponentType() {
		MIODAbstractComponentTypeImpl miodAbstractComponentType = new MIODAbstractComponentTypeImpl();
		return miodAbstractComponentType;
	}

	/**
	 * @generated
	 */
	public MIODComponentType createMIODComponentType() {
		MIODComponentTypeImpl miodComponentType = new MIODComponentTypeImpl();
		return miodComponentType;
	}

	/**
	 * @generated
	 */
	public MAODComponentType createMAODComponentType() {
		MAODComponentTypeImpl maodComponentType = new MAODComponentTypeImpl();
		return maodComponentType;
	}

	/**
	 * @generated
	 */
	public MIODComponentTypeInstance createMIODComponentTypeInstance() {
		MIODComponentTypeInstanceImpl miodComponentTypeInstance = new MIODComponentTypeInstanceImpl();
		return miodComponentTypeInstance;
	}

	/**
	 * @generated
	 */
	public MAODComponentTypeInstance createMAODComponentTypeInstance() {
		MAODComponentTypeInstanceImpl maodComponentTypeInstance = new MAODComponentTypeInstanceImpl();
		return maodComponentTypeInstance;
	}

	/**
	 * @generated
	 */
	public MInternalPortTypeInstance createMInternalPortTypeInstance() {
		MInternalPortTypeInstanceImpl mInternalPortTypeInstance = new MInternalPortTypeInstanceImpl();
		return mInternalPortTypeInstance;
	}

	/**
	 * @generated
	 */
	public MInternalClientPortTypeInstance createMInternalClientPortTypeInstance() {
		MInternalClientPortTypeInstanceImpl mInternalClientPortTypeInstance = new MInternalClientPortTypeInstanceImpl();
		return mInternalClientPortTypeInstance;
	}

	/**
	 * @generated
	 */
	public MInternalServerPortTypeInstance createMInternalServerPortTypeInstance() {
		MInternalServerPortTypeInstanceImpl mInternalServerPortTypeInstance = new MInternalServerPortTypeInstanceImpl();
		return mInternalServerPortTypeInstance;
	}

	/**
	 * @generated
	 */
	public MExternalPortTypeInstance createMExternalPortTypeInstance() {
		MExternalPortTypeInstanceImpl mExternalPortTypeInstance = new MExternalPortTypeInstanceImpl();
		return mExternalPortTypeInstance;
	}

	/**
	 * @generated
	 */
	public MExternalClientPortTypeInstance createMExternalClientPortTypeInstance() {
		MExternalClientPortTypeInstanceImpl mExternalClientPortTypeInstance = new MExternalClientPortTypeInstanceImpl();
		return mExternalClientPortTypeInstance;
	}

	/**
	 * @generated
	 */
	public MExternalServerPortTypeInstance createMExternalServerPortTypeInstance() {
		MExternalServerPortTypeInstanceImpl mExternalServerPortTypeInstance = new MExternalServerPortTypeInstanceImpl();
		return mExternalServerPortTypeInstance;
	}

	/**
	 * @generated
	 */
	public MConnector createMConnector() {
		MConnectorImpl mConnector = new MConnectorImpl();
		return mConnector;
	}

	/**
	 * @generated
	 */
	public MPortType createMPortType() {
		MPortTypeImpl mPortType = new MPortTypeImpl();
		return mPortType;
	}

	/**
	 * @generated
	 */
	public MInterfaceType createMInterfaceType() {
		MInterfaceTypeImpl mInterfaceType = new MInterfaceTypeImpl();
		return mInterfaceType;
	}

	/**
	 * @generated
	 */
	public MExchangeModel createMExchangeModel() {
		MExchangeModelImpl mExchangeModel = new MExchangeModelImpl();
		return mExchangeModel;
	}

	/**
	 * @generated
	 */
	public MMCLEVDOMPackageFile createMMCLEVDOMPackageFile() {
		MMCLEVDOMPackageFileImpl mmclevdomPackageFile = new MMCLEVDOMPackageFileImpl();
		return mmclevdomPackageFile;
	}

	/**
	 * @generated
	 */
	public MIODomainSupportedPlatform createMIODomainSupportedPlatform() {
		MIODomainSupportedPlatformImpl mioDomainSupportedPlatform = new MIODomainSupportedPlatformImpl();
		return mioDomainSupportedPlatform;
	}

	/**
	 * @generated
	 */
	public MBooleanParamIODSPSwitch createMBooleanParamIODSPSwitch() {
		MBooleanParamIODSPSwitchImpl mBooleanParamIODSPSwitch = new MBooleanParamIODSPSwitchImpl();
		return mBooleanParamIODSPSwitch;
	}

	/**
	 * @generated
	 */
	public MBooleanParamIODSPSwitchCase createMBooleanParamIODSPSwitchCase() {
		MBooleanParamIODSPSwitchCaseImpl mBooleanParamIODSPSwitchCase = new MBooleanParamIODSPSwitchCaseImpl();
		return mBooleanParamIODSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MStringParamIODSPSwitch createMStringParamIODSPSwitch() {
		MStringParamIODSPSwitchImpl mStringParamIODSPSwitch = new MStringParamIODSPSwitchImpl();
		return mStringParamIODSPSwitch;
	}

	/**
	 * @generated
	 */
	public MStringParamIODSPSwitchCase createMStringParamIODSPSwitchCase() {
		MStringParamIODSPSwitchCaseImpl mStringParamIODSPSwitchCase = new MStringParamIODSPSwitchCaseImpl();
		return mStringParamIODSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MIntegerParamIODSPSwitch createMIntegerParamIODSPSwitch() {
		MIntegerParamIODSPSwitchImpl mIntegerParamIODSPSwitch = new MIntegerParamIODSPSwitchImpl();
		return mIntegerParamIODSPSwitch;
	}

	/**
	 * @generated
	 */
	public MIntegerParamIODSPSwitchCase createMIntegerParamIODSPSwitchCase() {
		MIntegerParamIODSPSwitchCaseImpl mIntegerParamIODSPSwitchCase = new MIntegerParamIODSPSwitchCaseImpl();
		return mIntegerParamIODSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MEnumParamIODSPSwitch createMEnumParamIODSPSwitch() {
		MEnumParamIODSPSwitchImpl mEnumParamIODSPSwitch = new MEnumParamIODSPSwitchImpl();
		return mEnumParamIODSPSwitch;
	}

	/**
	 * @generated
	 */
	public MEnumParamIODSPSwitchCase createMEnumParamIODSPSwitchCase() {
		MEnumParamIODSPSwitchCaseImpl mEnumParamIODSPSwitchCase = new MEnumParamIODSPSwitchCaseImpl();
		return mEnumParamIODSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public MRealParamIODSPSwitch createMRealParamIODSPSwitch() {
		MRealParamIODSPSwitchImpl mRealParamIODSPSwitch = new MRealParamIODSPSwitchImpl();
		return mRealParamIODSPSwitch;
	}

	/**
	 * @generated
	 */
	public MRealParamIODSPSwitchCase createMRealParamIODSPSwitchCase() {
		MRealParamIODSPSwitchCaseImpl mRealParamIODSPSwitchCase = new MRealParamIODSPSwitchCaseImpl();
		return mRealParamIODSPSwitchCase;
	}

	/**
	 * @generated
	 */
	public mclevdomPackage getmclevdomPackage() {
		return (mclevdomPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mclevdomPackage getPackage() {
		return mclevdomPackage.eINSTANCE;
	}

}