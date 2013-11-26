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
package es.uah.aut.srg.micobs.mesp.mespswi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiFactory;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * 
 * @generated
 */
public class mespswiFactoryImpl extends EFactoryImpl implements mespswiFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mespswiFactory init() {
		try {
			mespswiFactory themespswiFactory = (mespswiFactory)EPackage.Registry.INSTANCE.getEFactory(mespswiPackage.eNS_URI);
			if (themespswiFactory != null) {
				return themespswiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mespswiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mespswiFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mespswiPackage.MSW_INTERFACE: return createMSwInterface();
			case mespswiPackage.MMESPSWI_PACKAGE_FILE: return createMMESPSWIPackageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MSwInterface createMSwInterface() {
		MSwInterfaceImpl mSwInterface = new MSwInterfaceImpl();
		return mSwInterface;
	}

	/**
	 * @generated
	 */
	public MMESPSWIPackageFile createMMESPSWIPackageFile() {
		MMESPSWIPackageFileImpl mmespswiPackageFile = new MMESPSWIPackageFileImpl();
		return mmespswiPackageFile;
	}

	/**
	 * @generated
	 */
	public mespswiPackage getmespswiPackage() {
		return (mespswiPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mespswiPackage getPackage() {
		return mespswiPackage.eINSTANCE;
	}

}