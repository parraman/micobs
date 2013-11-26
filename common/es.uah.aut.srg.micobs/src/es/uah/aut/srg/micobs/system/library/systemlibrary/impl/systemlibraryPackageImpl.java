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
package es.uah.aut.srg.micobs.system.library.systemlibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemItemLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemLibrary;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageItem;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageVersionedItem;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemVersionedItemLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryFactory;
import es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryPackage;

/**
 * An implementation of the model <b>Package</b>.
 * 
 * @generated
 */
public class systemlibraryPackageImpl extends EPackageImpl implements systemlibraryPackage {
	/**
	 * @generated
	 */
	private EClass mSystemLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mSystemPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mSystemPackageItemEClass = null;

	/**
	 * @generated
	 */
	private EClass mSystemPackageVersionedItemEClass = null;

	/**
	 * @generated
	 */
	private EClass mSystemItemLanguageEClass = null;

	/**
	 * @generated
	 */
	private EClass mSystemVersionedItemLanguageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.system.library.systemlibrary.systemlibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private systemlibraryPackageImpl() {
		super(eNS_URI, systemlibraryFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link systemlibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static systemlibraryPackage init() {
		if (isInited) return (systemlibraryPackage)EPackage.Registry.INSTANCE.getEPackage(systemlibraryPackage.eNS_URI);

		// Obtain or create and register package
		systemlibraryPackageImpl thesystemlibraryPackage = (systemlibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof systemlibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new systemlibraryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thesystemlibraryPackage.createPackageContents();

		// Initialize created meta-data
		thesystemlibraryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thesystemlibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(systemlibraryPackage.eNS_URI, thesystemlibraryPackage);
		return thesystemlibraryPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMSystemLibrary() {
		return mSystemLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMSystemPackage() {
		return mSystemPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMSystemPackageItem() {
		return mSystemPackageItemEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMSystemPackageVersionedItem() {
		return mSystemPackageVersionedItemEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMSystemItemLanguage() {
		return mSystemItemLanguageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMSystemVersionedItemLanguage() {
		return mSystemVersionedItemLanguageEClass;
	}

	/**
	 * @generated
	 */
	public systemlibraryFactory getsystemlibraryFactory() {
		return (systemlibraryFactory)getEFactoryInstance();
	}

	/**
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mSystemLibraryEClass = createEClass(MSYSTEM_LIBRARY);

		mSystemPackageEClass = createEClass(MSYSTEM_PACKAGE);

		mSystemPackageItemEClass = createEClass(MSYSTEM_PACKAGE_ITEM);

		mSystemPackageVersionedItemEClass = createEClass(MSYSTEM_PACKAGE_VERSIONED_ITEM);

		mSystemItemLanguageEClass = createEClass(MSYSTEM_ITEM_LANGUAGE);

		mSystemVersionedItemLanguageEClass = createEClass(MSYSTEM_VERSIONED_ITEM_LANGUAGE);
	}

	/**
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mSystemLibraryEClass.getESuperTypes().add(thecommonPackage.getMCommonLibrary());
		mSystemPackageEClass.getESuperTypes().add(thecommonPackage.getMCommonPackage());
		mSystemPackageItemEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageItem());
		mSystemPackageVersionedItemEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageVersionedItem());
		mSystemItemLanguageEClass.getESuperTypes().add(this.getMSystemPackageItem());
		mSystemVersionedItemLanguageEClass.getESuperTypes().add(this.getMSystemPackageVersionedItem());

		// Initialize classes and features; add operations and parameters
		initEClass(mSystemLibraryEClass, MSystemLibrary.class, "MSystemLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mSystemPackageEClass, MSystemPackage.class, "MSystemPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mSystemPackageItemEClass, MSystemPackageItem.class, "MSystemPackageItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mSystemPackageVersionedItemEClass, MSystemPackageVersionedItem.class, "MSystemPackageVersionedItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mSystemItemLanguageEClass, MSystemItemLanguage.class, "MSystemItemLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mSystemVersionedItemLanguageEClass, MSystemVersionedItemLanguage.class, "MSystemVersionedItemLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}
