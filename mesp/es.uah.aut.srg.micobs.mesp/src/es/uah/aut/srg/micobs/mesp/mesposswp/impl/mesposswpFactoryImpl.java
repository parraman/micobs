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
package es.uah.aut.srg.micobs.mesp.mesposswp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpFactory;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * 
 * @generated
 */
public class mesposswpFactoryImpl extends EFactoryImpl implements mesposswpFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mesposswpFactory init() {
		try {
			mesposswpFactory themesposswpFactory = (mesposswpFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/mesp/mesposswp"); 
			if (themesposswpFactory != null) {
				return themesposswpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mesposswpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mesposswpFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mesposswpPackage.MOS_SW_PACKAGE: return createMOSSwPackage();
			case mesposswpPackage.MMESPOSSWP_PACKAGE_FILE: return createMMESPOSSWPPackageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MOSSwPackage createMOSSwPackage() {
		MOSSwPackageImpl mosSwPackage = new MOSSwPackageImpl();
		return mosSwPackage;
	}

	/**
	 * @generated
	 */
	public MMESPOSSWPPackageFile createMMESPOSSWPPackageFile() {
		MMESPOSSWPPackageFileImpl mmesposswpPackageFile = new MMESPOSSWPPackageFileImpl();
		return mmesposswpPackageFile;
	}

	/**
	 * @generated
	 */
	public mesposswpPackage getmesposswpPackage() {
		return (mesposswpPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mesposswpPackage getPackage() {
		return mesposswpPackage.eINSTANCE;
	}

}
