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
package es.uah.aut.srg.micobs.mesp.mesposswi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiFactory;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * 
 * @generated
 */
public class mesposswiFactoryImpl extends EFactoryImpl implements mesposswiFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mesposswiFactory init() {
		try {
			mesposswiFactory themesposswiFactory = (mesposswiFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/mesp/mesposswi"); 
			if (themesposswiFactory != null) {
				return themesposswiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mesposswiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mesposswiFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mesposswiPackage.MOS_SW_INTERFACE: return createMOSSwInterface();
			case mesposswiPackage.MMESPOSSWI_PACKAGE_FILE: return createMMESPOSSWIPackageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MOSSwInterface createMOSSwInterface() {
		MOSSwInterfaceImpl mosSwInterface = new MOSSwInterfaceImpl();
		return mosSwInterface;
	}

	/**
	 * @generated
	 */
	public MMESPOSSWIPackageFile createMMESPOSSWIPackageFile() {
		MMESPOSSWIPackageFileImpl mmesposswiPackageFile = new MMESPOSSWIPackageFileImpl();
		return mmesposswiPackageFile;
	}

	/**
	 * @generated
	 */
	public mesposswiPackage getmesposswiPackage() {
		return (mesposswiPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mesposswiPackage getPackage() {
		return mesposswiPackage.eINSTANCE;
	}

}
