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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadFactory;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class mclevflatmcadFactoryImpl extends EFactoryImpl implements mclevflatmcadFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mclevflatmcadFactory init() {
		try {
			mclevflatmcadFactory themclevflatmcadFactory = (mclevflatmcadFactory)EPackage.Registry.INSTANCE.getEFactory(mclevflatmcadPackage.eNS_URI);
			if (themclevflatmcadFactory != null) {
				return themclevflatmcadFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mclevflatmcadFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mclevflatmcadFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mclevflatmcadPackage.MFLAT_MCAD: return createMFlatMCAD();
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET: return createMFlatMCADTarget();
			case mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE: return createMFlatServiceLibraryInstance();
			case mclevflatmcadPackage.MFLAT_DRIVER_SLIB_INSTANCE: return createMFlatDriverSLibInstance();
			case mclevflatmcadPackage.MFLAT_COMPONENT_INSTANCE: return createMFlatComponentInstance();
			case mclevflatmcadPackage.MFLAT_CONNECTION: return createMFlatConnection();
			case mclevflatmcadPackage.MMCLEVFLATMCAD_PACKAGE_FILE: return createMMCLEVFLATMCADPackageFile();
			case mclevflatmcadPackage.MFLAT_DEVICE_DRIVER_MAPPING: return createMFlatDeviceDriverMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MFlatMCAD createMFlatMCAD() {
		MFlatMCADImpl mFlatMCAD = new MFlatMCADImpl();
		return mFlatMCAD;
	}

	/**
	 * @generated
	 */
	public MFlatMCADTarget createMFlatMCADTarget() {
		MFlatMCADTargetImpl mFlatMCADTarget = new MFlatMCADTargetImpl();
		return mFlatMCADTarget;
	}

	/**
	 * @generated
	 */
	public MFlatServiceLibraryInstance createMFlatServiceLibraryInstance() {
		MFlatServiceLibraryInstanceImpl mFlatServiceLibraryInstance = new MFlatServiceLibraryInstanceImpl();
		return mFlatServiceLibraryInstance;
	}

	/**
	 * @generated
	 */
	public MFlatDriverSLibInstance createMFlatDriverSLibInstance() {
		MFlatDriverSLibInstanceImpl mFlatDriverSLibInstance = new MFlatDriverSLibInstanceImpl();
		return mFlatDriverSLibInstance;
	}

	/**
	 * @generated
	 */
	public MFlatComponentInstance createMFlatComponentInstance() {
		MFlatComponentInstanceImpl mFlatComponentInstance = new MFlatComponentInstanceImpl();
		return mFlatComponentInstance;
	}

	/**
	 * @generated
	 */
	public MFlatConnection createMFlatConnection() {
		MFlatConnectionImpl mFlatConnection = new MFlatConnectionImpl();
		return mFlatConnection;
	}

	/**
	 * @generated
	 */
	public MMCLEVFLATMCADPackageFile createMMCLEVFLATMCADPackageFile() {
		MMCLEVFLATMCADPackageFileImpl mmclevflatmcadPackageFile = new MMCLEVFLATMCADPackageFileImpl();
		return mmclevflatmcadPackageFile;
	}

	/**
	 * @generated
	 */
	public MFlatDeviceDriverMapping createMFlatDeviceDriverMapping() {
		MFlatDeviceDriverMappingImpl mFlatDeviceDriverMapping = new MFlatDeviceDriverMappingImpl();
		return mFlatDeviceDriverMapping;
	}

	/**
	 * @generated
	 */
	public mclevflatmcadPackage getmclevflatmcadPackage() {
		return (mclevflatmcadPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mclevflatmcadPackage getPackage() {
		return mclevflatmcadPackage.eINSTANCE;
	}

}