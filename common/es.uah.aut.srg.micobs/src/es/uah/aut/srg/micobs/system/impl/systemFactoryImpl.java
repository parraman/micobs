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
package es.uah.aut.srg.micobs.system.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.MSYSTEMPackageFile;
import es.uah.aut.srg.micobs.system.systemFactory;
import es.uah.aut.srg.micobs.system.systemPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * 
 * @generated
 */
public class systemFactoryImpl extends EFactoryImpl implements systemFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static systemFactory init() {
		try {
			systemFactory thesystemFactory = (systemFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/system"); 
			if (thesystemFactory != null) {
				return thesystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new systemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public systemFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case systemPackage.MLANGUAGE: return createMLanguage();
			case systemPackage.MSYSTEM_PACKAGE_FILE: return createMSYSTEMPackageFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MLanguage createMLanguage() {
		MLanguageImpl mLanguage = new MLanguageImpl();
		return mLanguage;
	}

	/**
	 * @generated
	 */
	public MSYSTEMPackageFile createMSYSTEMPackageFile() {
		MSYSTEMPackageFileImpl msystemPackageFile = new MSYSTEMPackageFileImpl();
		return msystemPackageFile;
	}

	/**
	 * @generated
	 */
	public systemPackage getsystemPackage() {
		return (systemPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static systemPackage getPackage() {
		return systemPackage.eINSTANCE;
	}

}
