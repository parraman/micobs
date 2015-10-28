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
package es.uah.aut.srg.micobs.mclev.mclevsai.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiFactory;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class mclevsaiFactoryImpl extends EFactoryImpl implements mclevsaiFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mclevsaiFactory init() {
		try {
			mclevsaiFactory themclevsaiFactory = (mclevsaiFactory)EPackage.Registry.INSTANCE.getEFactory(mclevsaiPackage.eNS_URI);
			if (themclevsaiFactory != null) {
				return themclevsaiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mclevsaiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mclevsaiFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mclevsaiPackage.MSAI: return createMSAI();
			case mclevsaiPackage.MMCLEVSAI_PACKAGE_FILE: return createMMCLEVSAIPackageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MSAI createMSAI() {
		MSAIImpl msai = new MSAIImpl();
		return msai;
	}

	/**
	 * @generated
	 */
	public MMCLEVSAIPackageFile createMMCLEVSAIPackageFile() {
		MMCLEVSAIPackageFileImpl mmclevsaiPackageFile = new MMCLEVSAIPackageFileImpl();
		return mmclevsaiPackageFile;
	}

	/**
	 * @generated
	 */
	public mclevsaiPackage getmclevsaiPackage() {
		return (mclevsaiPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mclevsaiPackage getPackage() {
		return mclevsaiPackage.eINSTANCE;
	}

}