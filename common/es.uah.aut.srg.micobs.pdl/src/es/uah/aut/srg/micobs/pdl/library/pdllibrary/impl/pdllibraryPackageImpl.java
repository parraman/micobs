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
package es.uah.aut.srg.micobs.pdl.library.pdllibrary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemArchitecture;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemBoard;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemCompiler;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemDevice;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemMicroprocessor;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemOperatingSystem;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLItemPlatform;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLLibrary;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageItem;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackageVersionedItem;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemArchitecture;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemBoard;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemCompiler;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemDevice;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemMicroprocessor;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystem;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLVersionedItemPlatform;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryFactory;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryPackage;

/**
 * An implementation of the model <b>Package</b>.
 * 
 * @generated
 */
public class pdllibraryPackageImpl extends EPackageImpl implements pdllibraryPackage {
	/**
	 * @generated
	 */
	private EClass mpdlLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlPackageItemEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlPackageVersionedItemEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlItemOperatingSystemAPIEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlVersionedItemOperatingSystemAPIEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlItemOperatingSystemEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlVersionedItemOperatingSystemEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlItemArchitectureEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlVersionedItemArchitectureEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlItemMicroprocessorEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlVersionedItemMicroprocessorEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlItemBoardEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlVersionedItemBoardEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlItemPlatformEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlVersionedItemPlatformEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlItemCompilerEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlVersionedItemCompilerEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlItemDeviceEClass = null;

	/**
	 * @generated
	 */
	private EClass mpdlVersionedItemDeviceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private pdllibraryPackageImpl() {
		super(eNS_URI, pdllibraryFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link pdllibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static pdllibraryPackage init() {
		if (isInited) return (pdllibraryPackage)EPackage.Registry.INSTANCE.getEPackage(pdllibraryPackage.eNS_URI);

		// Obtain or create and register package
		pdllibraryPackageImpl thepdllibraryPackage = (pdllibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof pdllibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new pdllibraryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thepdllibraryPackage.createPackageContents();

		// Initialize created meta-data
		thepdllibraryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thepdllibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(pdllibraryPackage.eNS_URI, thepdllibraryPackage);
		return thepdllibraryPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLLibrary() {
		return mpdlLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLPackage() {
		return mpdlPackageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLPackageItem() {
		return mpdlPackageItemEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLPackageVersionedItem() {
		return mpdlPackageVersionedItemEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLItemOperatingSystemAPI() {
		return mpdlItemOperatingSystemAPIEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLVersionedItemOperatingSystemAPI() {
		return mpdlVersionedItemOperatingSystemAPIEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLItemOperatingSystem() {
		return mpdlItemOperatingSystemEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLVersionedItemOperatingSystem() {
		return mpdlVersionedItemOperatingSystemEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLItemArchitecture() {
		return mpdlItemArchitectureEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLVersionedItemArchitecture() {
		return mpdlVersionedItemArchitectureEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLItemMicroprocessor() {
		return mpdlItemMicroprocessorEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLVersionedItemMicroprocessor() {
		return mpdlVersionedItemMicroprocessorEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLItemBoard() {
		return mpdlItemBoardEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLVersionedItemBoard() {
		return mpdlVersionedItemBoardEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLItemPlatform() {
		return mpdlItemPlatformEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLVersionedItemPlatform() {
		return mpdlVersionedItemPlatformEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLItemCompiler() {
		return mpdlItemCompilerEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLVersionedItemCompiler() {
		return mpdlVersionedItemCompilerEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLItemDevice() {
		return mpdlItemDeviceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMPDLVersionedItemDevice() {
		return mpdlVersionedItemDeviceEClass;
	}

	/**
	 * @generated
	 */
	public pdllibraryFactory getpdllibraryFactory() {
		return (pdllibraryFactory)getEFactoryInstance();
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
		mpdlLibraryEClass = createEClass(MPDL_LIBRARY);

		mpdlPackageEClass = createEClass(MPDL_PACKAGE);

		mpdlPackageItemEClass = createEClass(MPDL_PACKAGE_ITEM);

		mpdlPackageVersionedItemEClass = createEClass(MPDL_PACKAGE_VERSIONED_ITEM);

		mpdlItemOperatingSystemAPIEClass = createEClass(MPDL_ITEM_OPERATING_SYSTEM_API);

		mpdlVersionedItemOperatingSystemAPIEClass = createEClass(MPDL_VERSIONED_ITEM_OPERATING_SYSTEM_API);

		mpdlItemOperatingSystemEClass = createEClass(MPDL_ITEM_OPERATING_SYSTEM);

		mpdlVersionedItemOperatingSystemEClass = createEClass(MPDL_VERSIONED_ITEM_OPERATING_SYSTEM);

		mpdlItemArchitectureEClass = createEClass(MPDL_ITEM_ARCHITECTURE);

		mpdlVersionedItemArchitectureEClass = createEClass(MPDL_VERSIONED_ITEM_ARCHITECTURE);

		mpdlItemMicroprocessorEClass = createEClass(MPDL_ITEM_MICROPROCESSOR);

		mpdlVersionedItemMicroprocessorEClass = createEClass(MPDL_VERSIONED_ITEM_MICROPROCESSOR);

		mpdlItemBoardEClass = createEClass(MPDL_ITEM_BOARD);

		mpdlVersionedItemBoardEClass = createEClass(MPDL_VERSIONED_ITEM_BOARD);

		mpdlItemPlatformEClass = createEClass(MPDL_ITEM_PLATFORM);

		mpdlVersionedItemPlatformEClass = createEClass(MPDL_VERSIONED_ITEM_PLATFORM);

		mpdlItemCompilerEClass = createEClass(MPDL_ITEM_COMPILER);

		mpdlVersionedItemCompilerEClass = createEClass(MPDL_VERSIONED_ITEM_COMPILER);

		mpdlItemDeviceEClass = createEClass(MPDL_ITEM_DEVICE);

		mpdlVersionedItemDeviceEClass = createEClass(MPDL_VERSIONED_ITEM_DEVICE);
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
		mpdlLibraryEClass.getESuperTypes().add(thecommonPackage.getMCommonLibrary());
		mpdlPackageEClass.getESuperTypes().add(thecommonPackage.getMCommonPackage());
		mpdlPackageItemEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageItem());
		mpdlPackageVersionedItemEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageVersionedItem());
		mpdlItemOperatingSystemAPIEClass.getESuperTypes().add(this.getMPDLPackageItem());
		mpdlVersionedItemOperatingSystemAPIEClass.getESuperTypes().add(this.getMPDLPackageVersionedItem());
		mpdlItemOperatingSystemEClass.getESuperTypes().add(this.getMPDLPackageItem());
		mpdlVersionedItemOperatingSystemEClass.getESuperTypes().add(this.getMPDLPackageVersionedItem());
		mpdlItemArchitectureEClass.getESuperTypes().add(this.getMPDLPackageItem());
		mpdlVersionedItemArchitectureEClass.getESuperTypes().add(this.getMPDLPackageVersionedItem());
		mpdlItemMicroprocessorEClass.getESuperTypes().add(this.getMPDLPackageItem());
		mpdlVersionedItemMicroprocessorEClass.getESuperTypes().add(this.getMPDLPackageVersionedItem());
		mpdlItemBoardEClass.getESuperTypes().add(this.getMPDLPackageItem());
		mpdlVersionedItemBoardEClass.getESuperTypes().add(this.getMPDLPackageVersionedItem());
		mpdlItemPlatformEClass.getESuperTypes().add(this.getMPDLPackageItem());
		mpdlVersionedItemPlatformEClass.getESuperTypes().add(this.getMPDLPackageVersionedItem());
		mpdlItemCompilerEClass.getESuperTypes().add(this.getMPDLPackageItem());
		mpdlVersionedItemCompilerEClass.getESuperTypes().add(this.getMPDLPackageVersionedItem());
		mpdlItemDeviceEClass.getESuperTypes().add(this.getMPDLPackageItem());
		mpdlVersionedItemDeviceEClass.getESuperTypes().add(this.getMPDLPackageVersionedItem());

		// Initialize classes and features; add operations and parameters
		initEClass(mpdlLibraryEClass, MPDLLibrary.class, "MPDLLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlPackageEClass, MPDLPackage.class, "MPDLPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlPackageItemEClass, MPDLPackageItem.class, "MPDLPackageItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlPackageVersionedItemEClass, MPDLPackageVersionedItem.class, "MPDLPackageVersionedItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlItemOperatingSystemAPIEClass, MPDLItemOperatingSystemAPI.class, "MPDLItemOperatingSystemAPI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlVersionedItemOperatingSystemAPIEClass, MPDLVersionedItemOperatingSystemAPI.class, "MPDLVersionedItemOperatingSystemAPI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlItemOperatingSystemEClass, MPDLItemOperatingSystem.class, "MPDLItemOperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlVersionedItemOperatingSystemEClass, MPDLVersionedItemOperatingSystem.class, "MPDLVersionedItemOperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlItemArchitectureEClass, MPDLItemArchitecture.class, "MPDLItemArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlVersionedItemArchitectureEClass, MPDLVersionedItemArchitecture.class, "MPDLVersionedItemArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlItemMicroprocessorEClass, MPDLItemMicroprocessor.class, "MPDLItemMicroprocessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlVersionedItemMicroprocessorEClass, MPDLVersionedItemMicroprocessor.class, "MPDLVersionedItemMicroprocessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlItemBoardEClass, MPDLItemBoard.class, "MPDLItemBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlVersionedItemBoardEClass, MPDLVersionedItemBoard.class, "MPDLVersionedItemBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlItemPlatformEClass, MPDLItemPlatform.class, "MPDLItemPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlVersionedItemPlatformEClass, MPDLVersionedItemPlatform.class, "MPDLVersionedItemPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlItemCompilerEClass, MPDLItemCompiler.class, "MPDLItemCompiler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlVersionedItemCompilerEClass, MPDLVersionedItemCompiler.class, "MPDLVersionedItemCompiler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlItemDeviceEClass, MPDLItemDevice.class, "MPDLItemDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpdlVersionedItemDeviceEClass, MPDLVersionedItemDevice.class, "MPDLVersionedItemDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}
