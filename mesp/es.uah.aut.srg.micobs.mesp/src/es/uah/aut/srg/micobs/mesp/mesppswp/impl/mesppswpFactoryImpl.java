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
package es.uah.aut.srg.micobs.mesp.mesppswp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpFactory;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * 
 * @generated
 */
public class mesppswpFactoryImpl extends EFactoryImpl implements mesppswpFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static mesppswpFactory init() {
		try {
			mesppswpFactory themesppswpFactory = (mesppswpFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/mesp/mesppswp"); 
			if (themesppswpFactory != null) {
				return themesppswpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mesppswpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public mesppswpFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mesppswpPackage.MPLATFORM_SW_PACKAGE: return createMPlatformSwPackage();
			case mesppswpPackage.MMESPPSWP_PACKAGE_FILE: return createMMESPPSWPPackageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MPlatformSwPackage createMPlatformSwPackage() {
		MPlatformSwPackageImpl mPlatformSwPackage = new MPlatformSwPackageImpl();
		return mPlatformSwPackage;
	}

	/**
	 * @generated
	 */
	public MMESPPSWPPackageFile createMMESPPSWPPackageFile() {
		MMESPPSWPPackageFileImpl mmesppswpPackageFile = new MMESPPSWPPackageFileImpl();
		return mmesppswpPackageFile;
	}

	/**
	 * @generated
	 */
	public mesppswpPackage getmesppswpPackage() {
		return (mesppswpPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mesppswpPackage getPackage() {
		return mesppswpPackage.eINSTANCE;
	}

}
