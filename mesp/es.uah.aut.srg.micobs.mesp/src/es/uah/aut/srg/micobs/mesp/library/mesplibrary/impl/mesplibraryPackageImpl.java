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
package es.uah.aut.srg.micobs.mesp.library.mesplibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemConstructionTool;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDeployment;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemOSSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPItemSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPLibrary;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageItem;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItem;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPPackageVersionedItemWithRepository;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemConstructionTool;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDeployment;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemOSSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwInterface;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.MMESPVersionedItemSwPackage;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryFactory;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage;

/**
 * An implementation of the model <b>Package</b>.
 * 
 * @generated
 */
public class mesplibraryPackageImpl extends EPackageImpl implements mesplibraryPackage {
	/**
	 * @generated
	 */
	private EClass mmespLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespPackageItemEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespPackageVersionedItemEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespPackageVersionedItemWithRepositoryEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespItemSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespVersionedItemSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespItemSwInterfaceEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespVersionedItemSwInterfaceEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespItemOSSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespVersionedItemOSSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespItemOSSwInterfaceEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespVersionedItemOSSwInterfaceEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespItemPlatformSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespVersionedItemPlatformSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespItemDeploymentEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespVersionedItemDeploymentEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespItemAbstractSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespVersionedItemAbstractSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespItemConstructionToolEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespVersionedItemConstructionToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mmespItemDriverSwPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mmespVersionedItemDriverSwPackageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mesp.library.mesplibrary.mesplibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mesplibraryPackageImpl() {
		super(eNS_URI, mesplibraryFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mesplibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mesplibraryPackage init() {
		if (isInited) return (mesplibraryPackage)EPackage.Registry.INSTANCE.getEPackage(mesplibraryPackage.eNS_URI);

		// Obtain or create and register package
		mesplibraryPackageImpl themesplibraryPackage = (mesplibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mesplibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mesplibraryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themesplibraryPackage.createPackageContents();

		// Initialize created meta-data
		themesplibraryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themesplibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mesplibraryPackage.eNS_URI, themesplibraryPackage);
		return themesplibraryPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPLibrary() {
		return mmespLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPPackage() {
		return mmespPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPPackageItem() {
		return mmespPackageItemEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPPackageVersionedItem() {
		return mmespPackageVersionedItemEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPPackageVersionedItemWithRepository() {
		return mmespPackageVersionedItemWithRepositoryEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPItemSwPackage() {
		return mmespItemSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPVersionedItemSwPackage() {
		return mmespVersionedItemSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPItemSwInterface() {
		return mmespItemSwInterfaceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPVersionedItemSwInterface() {
		return mmespVersionedItemSwInterfaceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPItemOSSwPackage() {
		return mmespItemOSSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPVersionedItemOSSwPackage() {
		return mmespVersionedItemOSSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPItemOSSwInterface() {
		return mmespItemOSSwInterfaceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPVersionedItemOSSwInterface() {
		return mmespVersionedItemOSSwInterfaceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPItemPlatformSwPackage() {
		return mmespItemPlatformSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPVersionedItemPlatformSwPackage() {
		return mmespVersionedItemPlatformSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPItemDeployment() {
		return mmespItemDeploymentEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPVersionedItemDeployment() {
		return mmespVersionedItemDeploymentEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPItemAbstractSwPackage() {
		return mmespItemAbstractSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPVersionedItemAbstractSwPackage() {
		return mmespVersionedItemAbstractSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPItemConstructionTool() {
		return mmespItemConstructionToolEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPVersionedItemConstructionTool() {
		return mmespVersionedItemConstructionToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMESPItemDriverSwPackage() {
		return mmespItemDriverSwPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMMESPVersionedItemDriverSwPackage() {
		return mmespVersionedItemDriverSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public mesplibraryFactory getmesplibraryFactory() {
		return (mesplibraryFactory)getEFactoryInstance();
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
		mmespLibraryEClass = createEClass(MMESP_LIBRARY);

		mmespPackageEClass = createEClass(MMESP_PACKAGE);

		mmespPackageItemEClass = createEClass(MMESP_PACKAGE_ITEM);

		mmespPackageVersionedItemEClass = createEClass(MMESP_PACKAGE_VERSIONED_ITEM);

		mmespPackageVersionedItemWithRepositoryEClass = createEClass(MMESP_PACKAGE_VERSIONED_ITEM_WITH_REPOSITORY);

		mmespItemSwPackageEClass = createEClass(MMESP_ITEM_SW_PACKAGE);

		mmespVersionedItemSwPackageEClass = createEClass(MMESP_VERSIONED_ITEM_SW_PACKAGE);

		mmespItemSwInterfaceEClass = createEClass(MMESP_ITEM_SW_INTERFACE);

		mmespVersionedItemSwInterfaceEClass = createEClass(MMESP_VERSIONED_ITEM_SW_INTERFACE);

		mmespItemOSSwPackageEClass = createEClass(MMESP_ITEM_OS_SW_PACKAGE);

		mmespVersionedItemOSSwPackageEClass = createEClass(MMESP_VERSIONED_ITEM_OS_SW_PACKAGE);

		mmespItemOSSwInterfaceEClass = createEClass(MMESP_ITEM_OS_SW_INTERFACE);

		mmespVersionedItemOSSwInterfaceEClass = createEClass(MMESP_VERSIONED_ITEM_OS_SW_INTERFACE);

		mmespItemPlatformSwPackageEClass = createEClass(MMESP_ITEM_PLATFORM_SW_PACKAGE);

		mmespVersionedItemPlatformSwPackageEClass = createEClass(MMESP_VERSIONED_ITEM_PLATFORM_SW_PACKAGE);

		mmespItemDeploymentEClass = createEClass(MMESP_ITEM_DEPLOYMENT);

		mmespVersionedItemDeploymentEClass = createEClass(MMESP_VERSIONED_ITEM_DEPLOYMENT);

		mmespItemAbstractSwPackageEClass = createEClass(MMESP_ITEM_ABSTRACT_SW_PACKAGE);

		mmespVersionedItemAbstractSwPackageEClass = createEClass(MMESP_VERSIONED_ITEM_ABSTRACT_SW_PACKAGE);

		mmespItemConstructionToolEClass = createEClass(MMESP_ITEM_CONSTRUCTION_TOOL);

		mmespVersionedItemConstructionToolEClass = createEClass(MMESP_VERSIONED_ITEM_CONSTRUCTION_TOOL);

		mmespItemDriverSwPackageEClass = createEClass(MMESP_ITEM_DRIVER_SW_PACKAGE);

		mmespVersionedItemDriverSwPackageEClass = createEClass(MMESP_VERSIONED_ITEM_DRIVER_SW_PACKAGE);
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
		mmespLibraryEClass.getESuperTypes().add(thecommonPackage.getMCommonLibrary());
		mmespPackageEClass.getESuperTypes().add(thecommonPackage.getMCommonPackage());
		mmespPackageItemEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageItem());
		mmespPackageVersionedItemEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageVersionedItem());
		mmespPackageVersionedItemWithRepositoryEClass.getESuperTypes().add(this.getMMESPPackageVersionedItem());
		mmespItemSwPackageEClass.getESuperTypes().add(this.getMMESPPackageItem());
		mmespVersionedItemSwPackageEClass.getESuperTypes().add(this.getMMESPPackageVersionedItemWithRepository());
		mmespItemSwInterfaceEClass.getESuperTypes().add(this.getMMESPPackageItem());
		mmespVersionedItemSwInterfaceEClass.getESuperTypes().add(this.getMMESPPackageVersionedItemWithRepository());
		mmespItemOSSwPackageEClass.getESuperTypes().add(this.getMMESPPackageItem());
		mmespVersionedItemOSSwPackageEClass.getESuperTypes().add(this.getMMESPPackageVersionedItemWithRepository());
		mmespItemOSSwInterfaceEClass.getESuperTypes().add(this.getMMESPPackageItem());
		mmespVersionedItemOSSwInterfaceEClass.getESuperTypes().add(this.getMMESPPackageVersionedItemWithRepository());
		mmespItemPlatformSwPackageEClass.getESuperTypes().add(this.getMMESPPackageItem());
		mmespVersionedItemPlatformSwPackageEClass.getESuperTypes().add(this.getMMESPPackageVersionedItemWithRepository());
		mmespItemDeploymentEClass.getESuperTypes().add(this.getMMESPPackageItem());
		mmespVersionedItemDeploymentEClass.getESuperTypes().add(this.getMMESPPackageVersionedItemWithRepository());
		mmespItemAbstractSwPackageEClass.getESuperTypes().add(this.getMMESPPackageItem());
		mmespVersionedItemAbstractSwPackageEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageVersionedItem());
		mmespItemConstructionToolEClass.getESuperTypes().add(this.getMMESPPackageItem());
		mmespVersionedItemConstructionToolEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageVersionedItem());
		mmespItemDriverSwPackageEClass.getESuperTypes().add(this.getMMESPPackageItem());
		mmespVersionedItemDriverSwPackageEClass.getESuperTypes().add(this.getMMESPPackageVersionedItemWithRepository());

		// Initialize classes and features; add operations and parameters
		initEClass(mmespLibraryEClass, MMESPLibrary.class, "MMESPLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespPackageEClass, MMESPPackage.class, "MMESPPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespPackageItemEClass, MMESPPackageItem.class, "MMESPPackageItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespPackageVersionedItemEClass, MMESPPackageVersionedItem.class, "MMESPPackageVersionedItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespPackageVersionedItemWithRepositoryEClass, MMESPPackageVersionedItemWithRepository.class, "MMESPPackageVersionedItemWithRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespItemSwPackageEClass, MMESPItemSwPackage.class, "MMESPItemSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespVersionedItemSwPackageEClass, MMESPVersionedItemSwPackage.class, "MMESPVersionedItemSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespItemSwInterfaceEClass, MMESPItemSwInterface.class, "MMESPItemSwInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespVersionedItemSwInterfaceEClass, MMESPVersionedItemSwInterface.class, "MMESPVersionedItemSwInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespItemOSSwPackageEClass, MMESPItemOSSwPackage.class, "MMESPItemOSSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespVersionedItemOSSwPackageEClass, MMESPVersionedItemOSSwPackage.class, "MMESPVersionedItemOSSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespItemOSSwInterfaceEClass, MMESPItemOSSwInterface.class, "MMESPItemOSSwInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespVersionedItemOSSwInterfaceEClass, MMESPVersionedItemOSSwInterface.class, "MMESPVersionedItemOSSwInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespItemPlatformSwPackageEClass, MMESPItemPlatformSwPackage.class, "MMESPItemPlatformSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespVersionedItemPlatformSwPackageEClass, MMESPVersionedItemPlatformSwPackage.class, "MMESPVersionedItemPlatformSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespItemDeploymentEClass, MMESPItemDeployment.class, "MMESPItemDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespVersionedItemDeploymentEClass, MMESPVersionedItemDeployment.class, "MMESPVersionedItemDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespItemAbstractSwPackageEClass, MMESPItemAbstractSwPackage.class, "MMESPItemAbstractSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespVersionedItemAbstractSwPackageEClass, MMESPVersionedItemAbstractSwPackage.class, "MMESPVersionedItemAbstractSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespItemConstructionToolEClass, MMESPItemConstructionTool.class, "MMESPItemConstructionTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespVersionedItemConstructionToolEClass, MMESPVersionedItemConstructionTool.class, "MMESPVersionedItemConstructionTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespItemDriverSwPackageEClass, MMESPItemDriverSwPackage.class, "MMESPItemDriverSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespVersionedItemDriverSwPackageEClass, MMESPVersionedItemDriverSwPackage.class, "MMESPVersionedItemDriverSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}
