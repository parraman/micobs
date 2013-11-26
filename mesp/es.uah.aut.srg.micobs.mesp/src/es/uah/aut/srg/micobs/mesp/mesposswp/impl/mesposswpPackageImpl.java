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
package es.uah.aut.srg.micobs.mesp.mesposswp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageElement;
import es.uah.aut.srg.micobs.mesp.mesposswp.MMESPOSSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpFactory;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage;

/**
 * An implementation of the model <b>Package</b>.
 * 
 * @generated
 */
public class mesposswpPackageImpl extends EPackageImpl implements mesposswpPackage {
	/**
	 * @generated
	 */
	private EClass mosSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mmesposswpPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmesposswpPackageElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mesposswpPackageImpl() {
		super(eNS_URI, mesposswpFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mesposswpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mesposswpPackage init() {
		if (isInited) return (mesposswpPackage)EPackage.Registry.INSTANCE.getEPackage(mesposswpPackage.eNS_URI);

		// Obtain or create and register package
		mesposswpPackageImpl themesposswpPackage = (mesposswpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mesposswpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mesposswpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mespctoolPackage.eINSTANCE.eClass();
		mesposswiPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themesposswpPackage.createPackageContents();

		// Initialize created meta-data
		themesposswpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themesposswpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mesposswpPackage.eNS_URI, themesposswpPackage);
		return themesposswpPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMOSSwPackage() {
		return mosSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMOSSwPackage_Extends() {
		return (EReference)mosSwPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMOSSwPackage_Ctools() {
		return (EReference)mosSwPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMOSSwPackage_ProvidedOSSWIs() {
		return (EReference)mosSwPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMMESPOSSWPPackageFile() {
		return mmesposswpPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPOSSWPPackageElement() {
		return mmesposswpPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public mesposswpFactory getmesposswpFactory() {
		return (mesposswpFactory)getEFactoryInstance();
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
		mosSwPackageEClass = createEClass(MOS_SW_PACKAGE);
		createEReference(mosSwPackageEClass, MOS_SW_PACKAGE__EXTENDS);
		createEReference(mosSwPackageEClass, MOS_SW_PACKAGE__CTOOLS);
		createEReference(mosSwPackageEClass, MOS_SW_PACKAGE__PROVIDED_OSSW_IS);

		mmesposswpPackageFileEClass = createEClass(MMESPOSSWP_PACKAGE_FILE);

		mmesposswpPackageElementEClass = createEClass(MMESPOSSWP_PACKAGE_ELEMENT);
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
		mespctoolPackage themespctoolPackage = (mespctoolPackage)EPackage.Registry.INSTANCE.getEPackage(mespctoolPackage.eNS_URI);
		mesposswiPackage themesposswiPackage = (mesposswiPackage)EPackage.Registry.INSTANCE.getEPackage(mesposswiPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mosSwPackageEClass.getESuperTypes().add(this.getMMESPOSSWPPackageElement());
		mosSwPackageEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageReferencingElement());
		mmesposswpPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmesposswpPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes and features; add operations and parameters
		initEClass(mosSwPackageEClass, MOSSwPackage.class, "MOSSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMOSSwPackage_Extends(), this.getMOSSwPackage(), null, "extends", null, 0, -1, MOSSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOSSwPackage_Ctools(), themespctoolPackage.getMConstructionTool(), null, "ctools", null, 1, -1, MOSSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMOSSwPackage_ProvidedOSSWIs(), themesposswiPackage.getMOSSwInterface(), null, "providedOSSWIs", null, 0, -1, MOSSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmesposswpPackageFileEClass, MMESPOSSWPPackageFile.class, "MMESPOSSWPPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmesposswpPackageElementEClass, MMESPOSSWPPackageElement.class, "MMESPOSSWPPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}
