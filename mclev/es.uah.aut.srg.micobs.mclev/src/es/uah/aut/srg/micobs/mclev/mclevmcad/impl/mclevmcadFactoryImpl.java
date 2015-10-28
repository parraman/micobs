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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadFactory;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class mclevmcadFactoryImpl extends EFactoryImpl implements mclevmcadFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mclevmcadFactory init() {
		try {
			mclevmcadFactory themclevmcadFactory = (mclevmcadFactory)EPackage.Registry.INSTANCE.getEFactory(mclevmcadPackage.eNS_URI);
			if (themclevmcadFactory != null) {
				return themclevmcadFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mclevmcadFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mclevmcadFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mclevmcadPackage.MMCA_DEPLOYMENT: return createMMCADeployment();
			case mclevmcadPackage.MSERVICE_LIBRARY_INSTANCE: return createMServiceLibraryInstance();
			case mclevmcadPackage.MDRIVER_SLIB_INSTANCE: return createMDriverSLibInstance();
			case mclevmcadPackage.MDEVICE_DRIVER_MAPPING: return createMDeviceDriverMapping();
			case mclevmcadPackage.MCOMPONENT_INSTANCE: return createMComponentInstance();
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE: return createMDeploymentAlternative();
			case mclevmcadPackage.MCOMMON_CONNECTION: return createMCommonConnection();
			case mclevmcadPackage.MCONNECTION_SWITCH: return createMConnectionSwitch();
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE: return createMConnectionSwitchCase();
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM: return createMDeploymentPlatform();
			case mclevmcadPackage.MDEPLOYED_DEVICE: return createMDeployedDevice();
			case mclevmcadPackage.MMCLEVMCAD_PACKAGE_FILE: return createMMCLEVMCADPackageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MMCADeployment createMMCADeployment() {
		MMCADeploymentImpl mmcaDeployment = new MMCADeploymentImpl();
		return mmcaDeployment;
	}

	/**
	 * @generated
	 */
	public MServiceLibraryInstance createMServiceLibraryInstance() {
		MServiceLibraryInstanceImpl mServiceLibraryInstance = new MServiceLibraryInstanceImpl();
		return mServiceLibraryInstance;
	}

	/**
	 * @generated
	 */
	public MDriverSLibInstance createMDriverSLibInstance() {
		MDriverSLibInstanceImpl mDriverSLibInstance = new MDriverSLibInstanceImpl();
		return mDriverSLibInstance;
	}

	/**
	 * @generated
	 */
	public MDeviceDriverMapping createMDeviceDriverMapping() {
		MDeviceDriverMappingImpl mDeviceDriverMapping = new MDeviceDriverMappingImpl();
		return mDeviceDriverMapping;
	}

	/**
	 * @generated
	 */
	public MComponentInstance createMComponentInstance() {
		MComponentInstanceImpl mComponentInstance = new MComponentInstanceImpl();
		return mComponentInstance;
	}

	/**
	 * @generated
	 */
	public MDeploymentAlternative createMDeploymentAlternative() {
		MDeploymentAlternativeImpl mDeploymentAlternative = new MDeploymentAlternativeImpl();
		return mDeploymentAlternative;
	}

	/**
	 * @generated
	 */
	public MCommonConnection createMCommonConnection() {
		MCommonConnectionImpl mCommonConnection = new MCommonConnectionImpl();
		return mCommonConnection;
	}

	/**
	 * @generated
	 */
	public MConnectionSwitch createMConnectionSwitch() {
		MConnectionSwitchImpl mConnectionSwitch = new MConnectionSwitchImpl();
		return mConnectionSwitch;
	}

	/**
	 * @generated
	 */
	public MConnectionSwitchCase createMConnectionSwitchCase() {
		MConnectionSwitchCaseImpl mConnectionSwitchCase = new MConnectionSwitchCaseImpl();
		return mConnectionSwitchCase;
	}

	/**
	 * @generated
	 */
	public MDeploymentPlatform createMDeploymentPlatform() {
		MDeploymentPlatformImpl mDeploymentPlatform = new MDeploymentPlatformImpl();
		return mDeploymentPlatform;
	}

	/**
	 * @generated
	 */
	public MDeployedDevice createMDeployedDevice() {
		MDeployedDeviceImpl mDeployedDevice = new MDeployedDeviceImpl();
		return mDeployedDevice;
	}

	/**
	 * @generated
	 */
	public MMCLEVMCADPackageFile createMMCLEVMCADPackageFile() {
		MMCLEVMCADPackageFileImpl mmclevmcadPackageFile = new MMCLEVMCADPackageFileImpl();
		return mmclevmcadPackageFile;
	}

	/**
	 * @generated
	 */
	public mclevmcadPackage getmclevmcadPackage() {
		return (mclevmcadPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mclevmcadPackage getPackage() {
		return mclevmcadPackage.eINSTANCE;
	}

}