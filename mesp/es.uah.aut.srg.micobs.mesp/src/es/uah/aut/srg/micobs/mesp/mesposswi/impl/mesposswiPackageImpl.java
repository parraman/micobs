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
package es.uah.aut.srg.micobs.mesp.mesposswi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;
import es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageElement;
import es.uah.aut.srg.micobs.mesp.mesposswi.MMESPOSSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiFactory;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;

/**
 * An implementation of the model <b>Package</b>.
 * 
 * @generated
 */
public class mesposswiPackageImpl extends EPackageImpl implements mesposswiPackage {
	/**
	 * @generated
	 */
	private EClass mosSwInterfaceEClass = null;

	/**
	 * @generated
	 */
	private EClass mmesposswiPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmesposswiPackageElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mesposswiPackageImpl() {
		super(eNS_URI, mesposswiFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mesposswiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mesposswiPackage init() {
		if (isInited) return (mesposswiPackage)EPackage.Registry.INSTANCE.getEPackage(mesposswiPackage.eNS_URI);

		// Obtain or create and register package
		mesposswiPackageImpl themesposswiPackage = (mesposswiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mesposswiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mesposswiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mespcommonPackage.eINSTANCE.eClass();
		pdlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themesposswiPackage.createPackageContents();

		// Initialize created meta-data
		themesposswiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themesposswiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mesposswiPackage.eNS_URI, themesposswiPackage);
		return themesposswiPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMOSSwInterface() {
		return mosSwInterfaceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMOSSwInterface_Extends() {
		return (EReference)mosSwInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMOSSwInterface_ProvidedResources() {
		return (EReference)mosSwInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMMESPOSSWIPackageFile() {
		return mmesposswiPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPOSSWIPackageElement() {
		return mmesposswiPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public mesposswiFactory getmesposswiFactory() {
		return (mesposswiFactory)getEFactoryInstance();
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
		mosSwInterfaceEClass = createEClass(MOS_SW_INTERFACE);
		createEReference(mosSwInterfaceEClass, MOS_SW_INTERFACE__EXTENDS);
		createEReference(mosSwInterfaceEClass, MOS_SW_INTERFACE__PROVIDED_RESOURCES);

		mmesposswiPackageFileEClass = createEClass(MMESPOSSWI_PACKAGE_FILE);

		mmesposswiPackageElementEClass = createEClass(MMESPOSSWI_PACKAGE_ELEMENT);
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
		mespcommonPackage themespcommonPackage = (mespcommonPackage)EPackage.Registry.INSTANCE.getEPackage(mespcommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mosSwInterfaceEClass.getESuperTypes().add(this.getMMESPOSSWIPackageElement());
		mosSwInterfaceEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageReferencingElement());
		mmesposswiPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmesposswiPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes and features; add operations and parameters
		initEClass(mosSwInterfaceEClass, MOSSwInterface.class, "MOSSwInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMOSSwInterface_Extends(), this.getMOSSwInterface(), null, "extends", null, 0, -1, MOSSwInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOSSwInterface_ProvidedResources(), themespcommonPackage.getMProvidedResource(), null, "providedResources", null, 0, -1, MOSSwInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmesposswiPackageFileEClass, MMESPOSSWIPackageFile.class, "MMESPOSSWIPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmesposswiPackageElementEClass, MMESPOSSWIPackageElement.class, "MMESPOSSWIPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}
