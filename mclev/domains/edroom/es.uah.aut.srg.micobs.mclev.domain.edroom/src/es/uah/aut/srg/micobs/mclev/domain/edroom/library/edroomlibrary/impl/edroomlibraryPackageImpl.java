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
package es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMItemProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMLibrary;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageItem;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMPackageVersionedItem;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.EDROOMVersionedItemProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryPackage;

/**
 * An implementation of the model <b>Package</b>.
 *
 * @generated
 */
public class edroomlibraryPackageImpl extends EPackageImpl implements edroomlibraryPackage {
	/**
	 * @generated
	 */
	private EClass edroomLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomPackageItemEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomPackageVersionedItemEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomItemDataClassEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomVersionedItemDataClassEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomItemProtocolEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomVersionedItemProtocolEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.edroomlibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private edroomlibraryPackageImpl() {
		super(eNS_URI, edroomlibraryFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link edroomlibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static edroomlibraryPackage init() {
		if (isInited) return (edroomlibraryPackage)EPackage.Registry.INSTANCE.getEPackage(edroomlibraryPackage.eNS_URI);

		// Obtain or create and register package
		edroomlibraryPackageImpl theedroomlibraryPackage = (edroomlibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof edroomlibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new edroomlibraryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theedroomlibraryPackage.createPackageContents();

		// Initialize created meta-data
		theedroomlibraryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theedroomlibraryPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(edroomlibraryPackage.eNS_URI, theedroomlibraryPackage);
		return theedroomlibraryPackage;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMLibrary() {
		return edroomLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMPackage() {
		return edroomPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMPackageItem() {
		return edroomPackageItemEClass;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMPackageVersionedItem() {
		return edroomPackageVersionedItemEClass;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMItemDataClass() {
		return edroomItemDataClassEClass;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMVersionedItemDataClass() {
		return edroomVersionedItemDataClassEClass;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMItemProtocol() {
		return edroomItemProtocolEClass;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMVersionedItemProtocol() {
		return edroomVersionedItemProtocolEClass;
	}

	/**
	 * @generated
	 */
	public edroomlibraryFactory getedroomlibraryFactory() {
		return (edroomlibraryFactory)getEFactoryInstance();
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
		edroomLibraryEClass = createEClass(EDROOM_LIBRARY);

		edroomPackageEClass = createEClass(EDROOM_PACKAGE);

		edroomPackageItemEClass = createEClass(EDROOM_PACKAGE_ITEM);

		edroomPackageVersionedItemEClass = createEClass(EDROOM_PACKAGE_VERSIONED_ITEM);

		edroomItemDataClassEClass = createEClass(EDROOM_ITEM_DATA_CLASS);

		edroomVersionedItemDataClassEClass = createEClass(EDROOM_VERSIONED_ITEM_DATA_CLASS);

		edroomItemProtocolEClass = createEClass(EDROOM_ITEM_PROTOCOL);

		edroomVersionedItemProtocolEClass = createEClass(EDROOM_VERSIONED_ITEM_PROTOCOL);
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
		edroomLibraryEClass.getESuperTypes().add(thecommonPackage.getMCommonLibrary());
		edroomPackageEClass.getESuperTypes().add(thecommonPackage.getMCommonPackage());
		edroomPackageItemEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageItem());
		edroomPackageVersionedItemEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageVersionedItem());
		edroomItemDataClassEClass.getESuperTypes().add(this.getEDROOMPackageItem());
		edroomVersionedItemDataClassEClass.getESuperTypes().add(this.getEDROOMPackageVersionedItem());
		edroomItemProtocolEClass.getESuperTypes().add(this.getEDROOMPackageItem());
		edroomVersionedItemProtocolEClass.getESuperTypes().add(this.getEDROOMPackageVersionedItem());

		// Initialize classes and features; add operations and parameters
		initEClass(edroomLibraryEClass, EDROOMLibrary.class, "EDROOMLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edroomPackageEClass, EDROOMPackage.class, "EDROOMPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edroomPackageItemEClass, EDROOMPackageItem.class, "EDROOMPackageItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edroomPackageVersionedItemEClass, EDROOMPackageVersionedItem.class, "EDROOMPackageVersionedItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edroomItemDataClassEClass, EDROOMItemDataClass.class, "EDROOMItemDataClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edroomVersionedItemDataClassEClass, EDROOMVersionedItemDataClass.class, "EDROOMVersionedItemDataClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edroomItemProtocolEClass, EDROOMItemProtocol.class, "EDROOMItemProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edroomVersionedItemProtocolEClass, EDROOMVersionedItemProtocol.class, "EDROOMVersionedItemProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}
