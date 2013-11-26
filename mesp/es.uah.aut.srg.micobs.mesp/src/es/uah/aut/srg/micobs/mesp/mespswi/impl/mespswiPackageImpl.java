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
package es.uah.aut.srg.micobs.mesp.mespswi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageElement;
import es.uah.aut.srg.micobs.mesp.mespswi.MMESPSWIPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiFactory;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;

/**
 * An implementation of the model <b>Package</b>.
 * 
 * @generated
 */
public class mespswiPackageImpl extends EPackageImpl implements mespswiPackage {
	/**
	 * @generated
	 */
	private EClass mSwInterfaceEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespswiPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespswiPackageElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mespswiPackageImpl() {
		super(eNS_URI, mespswiFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mespswiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mespswiPackage init() {
		if (isInited) return (mespswiPackage)EPackage.Registry.INSTANCE.getEPackage(mespswiPackage.eNS_URI);

		// Obtain or create and register package
		mespswiPackageImpl themespswiPackage = (mespswiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mespswiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mespswiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mespcommonPackage.eINSTANCE.eClass();
		pdlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themespswiPackage.createPackageContents();

		// Initialize created meta-data
		themespswiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themespswiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mespswiPackage.eNS_URI, themespswiPackage);
		return themespswiPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMSwInterface() {
		return mSwInterfaceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMSwInterface_Extends() {
		return (EReference)mSwInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMSwInterface_Language() {
		return (EReference)mSwInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMSwInterface_Requires() {
		return (EReference)mSwInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMSwInterface_Parameters() {
		return (EReference)mSwInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMSwInterface_ProvidedResources() {
		return (EReference)mSwInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMSwInterface_RequiredOSAPI() {
		return (EReference)mSwInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated
	 */
	public EClass getMMESPSWIPackageFile() {
		return mmespswiPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPSWIPackageElement() {
		return mmespswiPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public mespswiFactory getmespswiFactory() {
		return (mespswiFactory)getEFactoryInstance();
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
		mSwInterfaceEClass = createEClass(MSW_INTERFACE);
		createEReference(mSwInterfaceEClass, MSW_INTERFACE__EXTENDS);
		createEReference(mSwInterfaceEClass, MSW_INTERFACE__LANGUAGE);
		createEReference(mSwInterfaceEClass, MSW_INTERFACE__REQUIRES);
		createEReference(mSwInterfaceEClass, MSW_INTERFACE__PARAMETERS);
		createEReference(mSwInterfaceEClass, MSW_INTERFACE__PROVIDED_RESOURCES);
		createEReference(mSwInterfaceEClass, MSW_INTERFACE__REQUIRED_OSAPI);

		mmespswiPackageFileEClass = createEClass(MMESPSWI_PACKAGE_FILE);

		mmespswiPackageElementEClass = createEClass(MMESPSWI_PACKAGE_ELEMENT);
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
		systemPackage thesystemPackage = (systemPackage)EPackage.Registry.INSTANCE.getEPackage(systemPackage.eNS_URI);
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);
		mespcommonPackage themespcommonPackage = (mespcommonPackage)EPackage.Registry.INSTANCE.getEPackage(mespcommonPackage.eNS_URI);
		pdlPackage thepdlPackage = (pdlPackage)EPackage.Registry.INSTANCE.getEPackage(pdlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mSwInterfaceEClass.getESuperTypes().add(this.getMMESPSWIPackageElement());
		mmespswiPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmespswiPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(mSwInterfaceEClass, MSwInterface.class, "MSwInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSwInterface_Extends(), this.getMSwInterface(), null, "extends", null, 0, -1, MSwInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwInterface_Language(), thesystemPackage.getMLanguage(), null, "language", null, 1, 1, MSwInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwInterface_Requires(), this.getMSwInterface(), null, "requires", null, 0, -1, MSwInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwInterface_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MSwInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwInterface_ProvidedResources(), themespcommonPackage.getMProvidedResource(), null, "providedResources", null, 0, -1, MSwInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSwInterface_RequiredOSAPI(), thepdlPackage.getMOperatingSystemAPI(), null, "requiredOSAPI", null, 0, 1, MSwInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmespswiPackageFileEClass, MMESPSWIPackageFile.class, "MMESPSWIPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespswiPackageElementEClass, MMESPSWIPackageElement.class, "MMESPSWIPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}