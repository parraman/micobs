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
package es.uah.aut.srg.micobs.system.library.systemlibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemItemLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemLibrary;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageVersionedItem;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemVersionedItemLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryFactory;
import es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * 
 * @generated
 */
public class systemlibraryFactoryImpl extends EFactoryImpl implements systemlibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static systemlibraryFactory init() {
		try {
			systemlibraryFactory thesystemlibraryFactory = (systemlibraryFactory)EPackage.Registry.INSTANCE.getEFactory("http://srg.aut.uah.es/micobs/library/systemlibrary"); 
			if (thesystemlibraryFactory != null) {
				return thesystemlibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new systemlibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public systemlibraryFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case systemlibraryPackage.MSYSTEM_LIBRARY: return createMSystemLibrary();
			case systemlibraryPackage.MSYSTEM_PACKAGE: return createMSystemPackage();
			case systemlibraryPackage.MSYSTEM_PACKAGE_VERSIONED_ITEM: return createMSystemPackageVersionedItem();
			case systemlibraryPackage.MSYSTEM_ITEM_LANGUAGE: return createMSystemItemLanguage();
			case systemlibraryPackage.MSYSTEM_VERSIONED_ITEM_LANGUAGE: return createMSystemVersionedItemLanguage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MSystemLibrary createMSystemLibrary() {
		MSystemLibraryImpl mSystemLibrary = new MSystemLibraryImpl();
		return mSystemLibrary;
	}

	/**
	 * @generated
	 */
	public MSystemPackage createMSystemPackage() {
		MSystemPackageImpl mSystemPackage = new MSystemPackageImpl();
		return mSystemPackage;
	}

	/**
	 * @generated
	 */
	public MSystemPackageVersionedItem createMSystemPackageVersionedItem() {
		MSystemPackageVersionedItemImpl mSystemPackageVersionedItem = new MSystemPackageVersionedItemImpl();
		return mSystemPackageVersionedItem;
	}

	/**
	 * @generated
	 */
	public MSystemItemLanguage createMSystemItemLanguage() {
		MSystemItemLanguageImpl mSystemItemLanguage = new MSystemItemLanguageImpl();
		return mSystemItemLanguage;
	}

	/**
	 * @generated
	 */
	public MSystemVersionedItemLanguage createMSystemVersionedItemLanguage() {
		MSystemVersionedItemLanguageImpl mSystemVersionedItemLanguage = new MSystemVersionedItemLanguageImpl();
		return mSystemVersionedItemLanguage;
	}

	/**
	 * @generated
	 */
	public systemlibraryPackage getsystemlibraryPackage() {
		return (systemlibraryPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static systemlibraryPackage getPackage() {
		return systemlibraryPackage.eINSTANCE;
	}

}
