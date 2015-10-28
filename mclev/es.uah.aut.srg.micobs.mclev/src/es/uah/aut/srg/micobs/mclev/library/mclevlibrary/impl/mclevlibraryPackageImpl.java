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
package es.uah.aut.srg.micobs.mclev.library.mclevlibrary.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemFlatMCAD;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemIODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterface;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemMCAD;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemSAI;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVItemServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackage;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageItem;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageVersionedItem;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemFlatMCAD;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemIODomain;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterface;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemMCAD;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryFactory;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage;

/**
 * An implementation of the model <b>Package</b>.
 * 
 * @generated
 */
public class mclevlibraryPackageImpl extends EPackageImpl implements mclevlibraryPackage {
	/**
	 * @generated
	 */
	private EClass mmclevLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevPackageItemEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevPackageVersionedItemEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevItemComponentEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevVersionedItemComponentEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevItemSAIEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevVersionedItemSAIEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevItemInterfaceEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevVersionedItemInterfaceEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevItemInterfaceMappingEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevVersionedItemInterfaceMappingEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevItemServiceLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevVersionedItemServiceLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevItemIODomainEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevVersionedItemIODomainEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevItemAODomainEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevVersionedItemAODomainEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevItemMCADEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevVersionedItemMCADEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevItemAbstractComponentEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevVersionedItemAbstractComponentEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevItemAbstractServiceLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevVersionedItemAbstractServiceLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevItemFlatMCADEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevVersionedItemFlatMCADEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevItemDriverServiceLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevVersionedItemDriverServiceLibraryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mclevlibraryPackageImpl() {
		super(eNS_URI, mclevlibraryFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mclevlibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mclevlibraryPackage init() {
		if (isInited) return (mclevlibraryPackage)EPackage.Registry.INSTANCE.getEPackage(mclevlibraryPackage.eNS_URI);

		// Obtain or create and register package
		mclevlibraryPackageImpl themclevlibraryPackage = (mclevlibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mclevlibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mclevlibraryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themclevlibraryPackage.createPackageContents();

		// Initialize created meta-data
		themclevlibraryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themclevlibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mclevlibraryPackage.eNS_URI, themclevlibraryPackage);
		return themclevlibraryPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVLibrary() {
		return mmclevLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVPackage() {
		return mmclevPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVPackageItem() {
		return mmclevPackageItemEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVPackageVersionedItem() {
		return mmclevPackageVersionedItemEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVItemComponent() {
		return mmclevItemComponentEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVVersionedItemComponent() {
		return mmclevVersionedItemComponentEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMMCLEVVersionedItemComponent_SwPackageURI() {
		return (EAttribute)mmclevVersionedItemComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMMCLEVVersionedItemComponent_SwPackageVersion() {
		return (EAttribute)mmclevVersionedItemComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVItemSAI() {
		return mmclevItemSAIEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVVersionedItemSAI() {
		return mmclevVersionedItemSAIEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMMCLEVVersionedItemSAI_SwInterfaceURI() {
		return (EAttribute)mmclevVersionedItemSAIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMMCLEVVersionedItemSAI_SwInterfaceVersion() {
		return (EAttribute)mmclevVersionedItemSAIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVItemInterface() {
		return mmclevItemInterfaceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVVersionedItemInterface() {
		return mmclevVersionedItemInterfaceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVItemInterfaceMapping() {
		return mmclevItemInterfaceMappingEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVVersionedItemInterfaceMapping() {
		return mmclevVersionedItemInterfaceMappingEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVItemServiceLibrary() {
		return mmclevItemServiceLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVVersionedItemServiceLibrary() {
		return mmclevVersionedItemServiceLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMMCLEVVersionedItemServiceLibrary_SwPackageURI() {
		return (EAttribute)mmclevVersionedItemServiceLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMMCLEVVersionedItemServiceLibrary_SwPackageVersion() {
		return (EAttribute)mmclevVersionedItemServiceLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVItemIODomain() {
		return mmclevItemIODomainEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVVersionedItemIODomain() {
		return mmclevVersionedItemIODomainEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVItemAODomain() {
		return mmclevItemAODomainEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVVersionedItemAODomain() {
		return mmclevVersionedItemAODomainEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVItemMCAD() {
		return mmclevItemMCADEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVVersionedItemMCAD() {
		return mmclevVersionedItemMCADEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVItemAbstractComponent() {
		return mmclevItemAbstractComponentEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVVersionedItemAbstractComponent() {
		return mmclevVersionedItemAbstractComponentEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVItemAbstractServiceLibrary() {
		return mmclevItemAbstractServiceLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVVersionedItemAbstractServiceLibrary() {
		return mmclevVersionedItemAbstractServiceLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVItemFlatMCAD() {
		return mmclevItemFlatMCADEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVVersionedItemFlatMCAD() {
		return mmclevVersionedItemFlatMCADEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVItemDriverServiceLibrary() {
		return mmclevItemDriverServiceLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVVersionedItemDriverServiceLibrary() {
		return mmclevVersionedItemDriverServiceLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMMCLEVVersionedItemDriverServiceLibrary_SwPackageURI() {
		return (EAttribute)mmclevVersionedItemDriverServiceLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMMCLEVVersionedItemDriverServiceLibrary_SwPackageVersion() {
		return (EAttribute)mmclevVersionedItemDriverServiceLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public mclevlibraryFactory getmclevlibraryFactory() {
		return (mclevlibraryFactory)getEFactoryInstance();
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
		mmclevLibraryEClass = createEClass(MMCLEV_LIBRARY);

		mmclevPackageEClass = createEClass(MMCLEV_PACKAGE);

		mmclevPackageItemEClass = createEClass(MMCLEV_PACKAGE_ITEM);

		mmclevPackageVersionedItemEClass = createEClass(MMCLEV_PACKAGE_VERSIONED_ITEM);

		mmclevItemComponentEClass = createEClass(MMCLEV_ITEM_COMPONENT);

		mmclevVersionedItemComponentEClass = createEClass(MMCLEV_VERSIONED_ITEM_COMPONENT);
		createEAttribute(mmclevVersionedItemComponentEClass, MMCLEV_VERSIONED_ITEM_COMPONENT__SW_PACKAGE_URI);
		createEAttribute(mmclevVersionedItemComponentEClass, MMCLEV_VERSIONED_ITEM_COMPONENT__SW_PACKAGE_VERSION);

		mmclevItemSAIEClass = createEClass(MMCLEV_ITEM_SAI);

		mmclevVersionedItemSAIEClass = createEClass(MMCLEV_VERSIONED_ITEM_SAI);
		createEAttribute(mmclevVersionedItemSAIEClass, MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_URI);
		createEAttribute(mmclevVersionedItemSAIEClass, MMCLEV_VERSIONED_ITEM_SAI__SW_INTERFACE_VERSION);

		mmclevItemInterfaceEClass = createEClass(MMCLEV_ITEM_INTERFACE);

		mmclevVersionedItemInterfaceEClass = createEClass(MMCLEV_VERSIONED_ITEM_INTERFACE);

		mmclevItemInterfaceMappingEClass = createEClass(MMCLEV_ITEM_INTERFACE_MAPPING);

		mmclevVersionedItemInterfaceMappingEClass = createEClass(MMCLEV_VERSIONED_ITEM_INTERFACE_MAPPING);

		mmclevItemServiceLibraryEClass = createEClass(MMCLEV_ITEM_SERVICE_LIBRARY);

		mmclevVersionedItemServiceLibraryEClass = createEClass(MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY);
		createEAttribute(mmclevVersionedItemServiceLibraryEClass, MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY__SW_PACKAGE_URI);
		createEAttribute(mmclevVersionedItemServiceLibraryEClass, MMCLEV_VERSIONED_ITEM_SERVICE_LIBRARY__SW_PACKAGE_VERSION);

		mmclevItemIODomainEClass = createEClass(MMCLEV_ITEM_IO_DOMAIN);

		mmclevVersionedItemIODomainEClass = createEClass(MMCLEV_VERSIONED_ITEM_IO_DOMAIN);

		mmclevItemAODomainEClass = createEClass(MMCLEV_ITEM_AO_DOMAIN);

		mmclevVersionedItemAODomainEClass = createEClass(MMCLEV_VERSIONED_ITEM_AO_DOMAIN);

		mmclevItemMCADEClass = createEClass(MMCLEV_ITEM_MCAD);

		mmclevVersionedItemMCADEClass = createEClass(MMCLEV_VERSIONED_ITEM_MCAD);

		mmclevItemAbstractComponentEClass = createEClass(MMCLEV_ITEM_ABSTRACT_COMPONENT);

		mmclevVersionedItemAbstractComponentEClass = createEClass(MMCLEV_VERSIONED_ITEM_ABSTRACT_COMPONENT);

		mmclevItemAbstractServiceLibraryEClass = createEClass(MMCLEV_ITEM_ABSTRACT_SERVICE_LIBRARY);

		mmclevVersionedItemAbstractServiceLibraryEClass = createEClass(MMCLEV_VERSIONED_ITEM_ABSTRACT_SERVICE_LIBRARY);

		mmclevItemFlatMCADEClass = createEClass(MMCLEV_ITEM_FLAT_MCAD);

		mmclevVersionedItemFlatMCADEClass = createEClass(MMCLEV_VERSIONED_ITEM_FLAT_MCAD);

		mmclevItemDriverServiceLibraryEClass = createEClass(MMCLEV_ITEM_DRIVER_SERVICE_LIBRARY);

		mmclevVersionedItemDriverServiceLibraryEClass = createEClass(MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY);
		createEAttribute(mmclevVersionedItemDriverServiceLibraryEClass, MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_URI);
		createEAttribute(mmclevVersionedItemDriverServiceLibraryEClass, MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_VERSION);
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
		mmclevLibraryEClass.getESuperTypes().add(thecommonPackage.getMCommonLibrary());
		mmclevPackageEClass.getESuperTypes().add(thecommonPackage.getMCommonPackage());
		mmclevPackageItemEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageItem());
		mmclevPackageVersionedItemEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageVersionedItem());
		mmclevItemComponentEClass.getESuperTypes().add(this.getMMCLEVPackageItem());
		mmclevVersionedItemComponentEClass.getESuperTypes().add(this.getMMCLEVPackageVersionedItem());
		mmclevItemSAIEClass.getESuperTypes().add(this.getMMCLEVPackageItem());
		mmclevVersionedItemSAIEClass.getESuperTypes().add(this.getMMCLEVPackageVersionedItem());
		mmclevItemInterfaceEClass.getESuperTypes().add(this.getMMCLEVPackageItem());
		mmclevVersionedItemInterfaceEClass.getESuperTypes().add(this.getMMCLEVPackageVersionedItem());
		mmclevItemInterfaceMappingEClass.getESuperTypes().add(this.getMMCLEVPackageItem());
		mmclevVersionedItemInterfaceMappingEClass.getESuperTypes().add(this.getMMCLEVPackageVersionedItem());
		mmclevItemServiceLibraryEClass.getESuperTypes().add(this.getMMCLEVPackageItem());
		mmclevVersionedItemServiceLibraryEClass.getESuperTypes().add(this.getMMCLEVPackageVersionedItem());
		mmclevItemIODomainEClass.getESuperTypes().add(this.getMMCLEVPackageItem());
		mmclevVersionedItemIODomainEClass.getESuperTypes().add(this.getMMCLEVPackageVersionedItem());
		mmclevItemAODomainEClass.getESuperTypes().add(this.getMMCLEVPackageItem());
		mmclevVersionedItemAODomainEClass.getESuperTypes().add(this.getMMCLEVPackageVersionedItem());
		mmclevItemMCADEClass.getESuperTypes().add(this.getMMCLEVPackageItem());
		mmclevVersionedItemMCADEClass.getESuperTypes().add(this.getMMCLEVPackageVersionedItem());
		mmclevItemAbstractComponentEClass.getESuperTypes().add(this.getMMCLEVPackageItem());
		mmclevVersionedItemAbstractComponentEClass.getESuperTypes().add(this.getMMCLEVPackageVersionedItem());
		mmclevItemAbstractServiceLibraryEClass.getESuperTypes().add(this.getMMCLEVPackageItem());
		mmclevVersionedItemAbstractServiceLibraryEClass.getESuperTypes().add(this.getMMCLEVPackageVersionedItem());
		mmclevItemFlatMCADEClass.getESuperTypes().add(this.getMMCLEVPackageItem());
		mmclevVersionedItemFlatMCADEClass.getESuperTypes().add(this.getMMCLEVPackageVersionedItem());
		mmclevItemDriverServiceLibraryEClass.getESuperTypes().add(this.getMMCLEVPackageItem());
		mmclevVersionedItemDriverServiceLibraryEClass.getESuperTypes().add(this.getMMCLEVPackageVersionedItem());

		// Initialize classes and features; add operations and parameters
		initEClass(mmclevLibraryEClass, MMCLEVLibrary.class, "MMCLEVLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevPackageEClass, MMCLEVPackage.class, "MMCLEVPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevPackageItemEClass, MMCLEVPackageItem.class, "MMCLEVPackageItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevPackageVersionedItemEClass, MMCLEVPackageVersionedItem.class, "MMCLEVPackageVersionedItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevItemComponentEClass, MMCLEVItemComponent.class, "MMCLEVItemComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevVersionedItemComponentEClass, MMCLEVVersionedItemComponent.class, "MMCLEVVersionedItemComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMMCLEVVersionedItemComponent_SwPackageURI(), ecorePackage.getEString(), "swPackageURI", null, 0, 1, MMCLEVVersionedItemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMCLEVVersionedItemComponent_SwPackageVersion(), ecorePackage.getEString(), "swPackageVersion", null, 0, 1, MMCLEVVersionedItemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmclevItemSAIEClass, MMCLEVItemSAI.class, "MMCLEVItemSAI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevVersionedItemSAIEClass, MMCLEVVersionedItemSAI.class, "MMCLEVVersionedItemSAI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMMCLEVVersionedItemSAI_SwInterfaceURI(), ecorePackage.getEString(), "swInterfaceURI", null, 0, 1, MMCLEVVersionedItemSAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMCLEVVersionedItemSAI_SwInterfaceVersion(), ecorePackage.getEString(), "swInterfaceVersion", null, 0, 1, MMCLEVVersionedItemSAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmclevItemInterfaceEClass, MMCLEVItemInterface.class, "MMCLEVItemInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevVersionedItemInterfaceEClass, MMCLEVVersionedItemInterface.class, "MMCLEVVersionedItemInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevItemInterfaceMappingEClass, MMCLEVItemInterfaceMapping.class, "MMCLEVItemInterfaceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevVersionedItemInterfaceMappingEClass, MMCLEVVersionedItemInterfaceMapping.class, "MMCLEVVersionedItemInterfaceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevItemServiceLibraryEClass, MMCLEVItemServiceLibrary.class, "MMCLEVItemServiceLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevVersionedItemServiceLibraryEClass, MMCLEVVersionedItemServiceLibrary.class, "MMCLEVVersionedItemServiceLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMMCLEVVersionedItemServiceLibrary_SwPackageURI(), ecorePackage.getEString(), "swPackageURI", null, 0, 1, MMCLEVVersionedItemServiceLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMCLEVVersionedItemServiceLibrary_SwPackageVersion(), ecorePackage.getEString(), "swPackageVersion", null, 0, 1, MMCLEVVersionedItemServiceLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmclevItemIODomainEClass, MMCLEVItemIODomain.class, "MMCLEVItemIODomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevVersionedItemIODomainEClass, MMCLEVVersionedItemIODomain.class, "MMCLEVVersionedItemIODomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevItemAODomainEClass, MMCLEVItemAODomain.class, "MMCLEVItemAODomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevVersionedItemAODomainEClass, MMCLEVVersionedItemAODomain.class, "MMCLEVVersionedItemAODomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevItemMCADEClass, MMCLEVItemMCAD.class, "MMCLEVItemMCAD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevVersionedItemMCADEClass, MMCLEVVersionedItemMCAD.class, "MMCLEVVersionedItemMCAD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevItemAbstractComponentEClass, MMCLEVItemAbstractComponent.class, "MMCLEVItemAbstractComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevVersionedItemAbstractComponentEClass, MMCLEVVersionedItemAbstractComponent.class, "MMCLEVVersionedItemAbstractComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevItemAbstractServiceLibraryEClass, MMCLEVItemAbstractServiceLibrary.class, "MMCLEVItemAbstractServiceLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevVersionedItemAbstractServiceLibraryEClass, MMCLEVVersionedItemAbstractServiceLibrary.class, "MMCLEVVersionedItemAbstractServiceLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevItemFlatMCADEClass, MMCLEVItemFlatMCAD.class, "MMCLEVItemFlatMCAD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevVersionedItemFlatMCADEClass, MMCLEVVersionedItemFlatMCAD.class, "MMCLEVVersionedItemFlatMCAD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevItemDriverServiceLibraryEClass, MMCLEVItemDriverServiceLibrary.class, "MMCLEVItemDriverServiceLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevVersionedItemDriverServiceLibraryEClass, MMCLEVVersionedItemDriverServiceLibrary.class, "MMCLEVVersionedItemDriverServiceLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMMCLEVVersionedItemDriverServiceLibrary_SwPackageURI(), ecorePackage.getEString(), "swPackageURI", null, 0, 1, MMCLEVVersionedItemDriverServiceLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMMCLEVVersionedItemDriverServiceLibrary_SwPackageVersion(), ecorePackage.getEString(), "swPackageVersion", null, 0, 1, MMCLEVVersionedItemDriverServiceLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

}