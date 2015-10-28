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
package es.uah.aut.srg.micobs.mclev.mcleviface.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageFile;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifaceFactory;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class mclevifaceFactoryImpl extends EFactoryImpl implements mclevifaceFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mclevifaceFactory init() {
		try {
			mclevifaceFactory themclevifaceFactory = (mclevifaceFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/mclev/mcleviface"); 
			if (themclevifaceFactory != null) {
				return themclevifaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mclevifaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mclevifaceFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mclevifacePackage.MINTERFACE: return createMInterface();
			case mclevifacePackage.MMCLEVIFACE_PACKAGE_FILE: return createMMCLEVIFACEPackageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MInterface createMInterface() {
		MInterfaceImpl mInterface = new MInterfaceImpl();
		return mInterface;
	}

	/**
	 * @generated
	 */
	public MMCLEVIFACEPackageFile createMMCLEVIFACEPackageFile() {
		MMCLEVIFACEPackageFileImpl mmclevifacePackageFile = new MMCLEVIFACEPackageFileImpl();
		return mmclevifacePackageFile;
	}

	/**
	 * @generated
	 */
	public mclevifacePackage getmclevifacePackage() {
		return (mclevifacePackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mclevifacePackage getPackage() {
		return mclevifacePackage.eINSTANCE;
	}

}