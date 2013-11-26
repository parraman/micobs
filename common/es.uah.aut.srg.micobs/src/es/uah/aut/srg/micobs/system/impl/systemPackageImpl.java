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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.MSYSTEMPackageElement;
import es.uah.aut.srg.micobs.system.MSYSTEMPackageFile;
import es.uah.aut.srg.micobs.system.systemFactory;
import es.uah.aut.srg.micobs.system.systemPackage;

/**
 * An implementation of the model <b>Package</b>.
 * 
 * @generated
 */
public class systemPackageImpl extends EPackageImpl implements systemPackage {
	/**
	 * @generated
	 */
	private EClass mLanguageEClass = null;

	/**
	 * @generated
	 */
	private EClass msystemPackageFileEClass = null;
	/**
	 * @generated
	 */
	private EClass msystemPackageElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.system.systemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private systemPackageImpl() {
		super(eNS_URI, systemFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link systemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static systemPackage init() {
		if (isInited) return (systemPackage)EPackage.Registry.INSTANCE.getEPackage(systemPackage.eNS_URI);

		// Obtain or create and register package
		systemPackageImpl thesystemPackage = (systemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof systemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new systemPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thesystemPackage.createPackageContents();

		// Initialize created meta-data
		thesystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thesystemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(systemPackage.eNS_URI, thesystemPackage);
		return thesystemPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMLanguage() {
		return mLanguageEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMLanguage_Extends() {
		return (EReference)mLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMSYSTEMPackageFile() {
		return msystemPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMSYSTEMPackageElement() {
		return msystemPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public systemFactory getsystemFactory() {
		return (systemFactory)getEFactoryInstance();
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
		mLanguageEClass = createEClass(MLANGUAGE);
		createEReference(mLanguageEClass, MLANGUAGE__EXTENDS);

		msystemPackageFileEClass = createEClass(MSYSTEM_PACKAGE_FILE);

		msystemPackageElementEClass = createEClass(MSYSTEM_PACKAGE_ELEMENT);
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
		mLanguageEClass.getESuperTypes().add(this.getMSYSTEMPackageElement());
		msystemPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		msystemPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes and features; add operations and parameters
		initEClass(mLanguageEClass, MLanguage.class, "MLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMLanguage_Extends(), this.getMLanguage(), null, "extends", null, 0, -1, MLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msystemPackageFileEClass, MSYSTEMPackageFile.class, "MSYSTEMPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(msystemPackageElementEClass, MSYSTEMPackageElement.class, "MSYSTEMPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}
