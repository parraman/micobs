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
package es.uah.aut.srg.micobs.mesp.mespdep.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepFactory;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class mespdepFactoryImpl extends EFactoryImpl implements mespdepFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mespdepFactory init() {
		try {
			mespdepFactory themespdepFactory = (mespdepFactory)EPackage.Registry.INSTANCE.getEFactory(mespdepPackage.eNS_URI);
			if (themespdepFactory != null) {
				return themespdepFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mespdepFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mespdepFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mespdepPackage.MMESP_DEPLOYMENT: return createMMESPDeployment();
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM: return createMMESPDeploymentPlatform();
			case mespdepPackage.MMESP_DEPLOYED_DEVICE: return createMMESPDeployedDevice();
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE: return createMMESPDeploymentAlternative();
			case mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT: return createMMESPSwPackageDeployment();
			case mespdepPackage.MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT: return createMMESPDriverSwPackageDeployment();
			case mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING: return createMMESPDeviceDriverMapping();
			case mespdepPackage.MMESPDEP_PACKAGE_FILE: return createMMESPDEPPackageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MMESPDeployment createMMESPDeployment() {
		MMESPDeploymentImpl mmespDeployment = new MMESPDeploymentImpl();
		return mmespDeployment;
	}

	/**
	 * @generated
	 */
	public MMESPDeploymentPlatform createMMESPDeploymentPlatform() {
		MMESPDeploymentPlatformImpl mmespDeploymentPlatform = new MMESPDeploymentPlatformImpl();
		return mmespDeploymentPlatform;
	}

	/**
	 * @generated
	 */
	public MMESPDeployedDevice createMMESPDeployedDevice() {
		MMESPDeployedDeviceImpl mmespDeployedDevice = new MMESPDeployedDeviceImpl();
		return mmespDeployedDevice;
	}

	/**
	 * @generated
	 */
	public MMESPDeploymentAlternative createMMESPDeploymentAlternative() {
		MMESPDeploymentAlternativeImpl mmespDeploymentAlternative = new MMESPDeploymentAlternativeImpl();
		return mmespDeploymentAlternative;
	}

	/**
	 * @generated
	 */
	public MMESPSwPackageDeployment createMMESPSwPackageDeployment() {
		MMESPSwPackageDeploymentImpl mmespSwPackageDeployment = new MMESPSwPackageDeploymentImpl();
		return mmespSwPackageDeployment;
	}

	/**
	 * @generated
	 */
	public MMESPDriverSwPackageDeployment createMMESPDriverSwPackageDeployment() {
		MMESPDriverSwPackageDeploymentImpl mmespDriverSwPackageDeployment = new MMESPDriverSwPackageDeploymentImpl();
		return mmespDriverSwPackageDeployment;
	}

	/**
	 * @generated
	 */
	public MMESPDeviceDriverMapping createMMESPDeviceDriverMapping() {
		MMESPDeviceDriverMappingImpl mmespDeviceDriverMapping = new MMESPDeviceDriverMappingImpl();
		return mmespDeviceDriverMapping;
	}

	/**
	 * @generated
	 */
	public MMESPDEPPackageFile createMMESPDEPPackageFile() {
		MMESPDEPPackageFileImpl mmespdepPackageFile = new MMESPDEPPackageFileImpl();
		return mmespdepPackageFile;
	}

	/**
	 * @generated
	 */
	public mespdepPackage getmespdepPackage() {
		return (mespdepPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mespdepPackage getPackage() {
		return mespdepPackage.eINSTANCE;
	}

}
