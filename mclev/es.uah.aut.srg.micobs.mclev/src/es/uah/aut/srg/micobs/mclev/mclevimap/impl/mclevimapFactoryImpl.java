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
package es.uah.aut.srg.micobs.mclev.mclevimap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.mclevimap.MMCLEVIMAPPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapFactory;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class mclevimapFactoryImpl extends EFactoryImpl implements mclevimapFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mclevimapFactory init() {
		try {
			mclevimapFactory themclevimapFactory = (mclevimapFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/mclev/mclevimap"); 
			if (themclevimapFactory != null) {
				return themclevimapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mclevimapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mclevimapFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mclevimapPackage.MINTERFACE_MAPPING: return createMInterfaceMapping();
			case mclevimapPackage.MMCLEVIMAP_PACKAGE_FILE: return createMMCLEVIMAPPackageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MInterfaceMapping createMInterfaceMapping() {
		MInterfaceMappingImpl mInterfaceMapping = new MInterfaceMappingImpl();
		return mInterfaceMapping;
	}

	/**
	 * @generated
	 */
	public MMCLEVIMAPPackageFile createMMCLEVIMAPPackageFile() {
		MMCLEVIMAPPackageFileImpl mmclevimapPackageFile = new MMCLEVIMAPPackageFileImpl();
		return mmclevimapPackageFile;
	}

	/**
	 * @generated
	 */
	public mclevimapPackage getmclevimapPackage() {
		return (mclevimapPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mclevimapPackage getPackage() {
		return mclevimapPackage.eINSTANCE;
	}

}