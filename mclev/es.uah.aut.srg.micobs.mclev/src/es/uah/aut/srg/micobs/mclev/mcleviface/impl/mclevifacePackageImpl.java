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
package es.uah.aut.srg.micobs.mclev.mcleviface.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageElement;
import es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageFile;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifaceFactory;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class mclevifacePackageImpl extends EPackageImpl implements mclevifacePackage {
	/**
	 * @generated
	 */
	private EClass mInterfaceEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevifacePackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevifacePackageElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mclevifacePackageImpl() {
		super(eNS_URI, mclevifaceFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mclevifacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mclevifacePackage init() {
		if (isInited) return (mclevifacePackage)EPackage.Registry.INSTANCE.getEPackage(mclevifacePackage.eNS_URI);

		// Obtain or create and register package
		mclevifacePackageImpl themclevifacePackage = (mclevifacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mclevifacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mclevifacePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mclevdomPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themclevifacePackage.createPackageContents();

		// Initialize created meta-data
		themclevifacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themclevifacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mclevifacePackage.eNS_URI, themclevifacePackage);
		return themclevifacePackage;
	}

	/**
	 * @generated
	 */
	public EClass getMInterface() {
		return mInterfaceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMInterface_Extends() {
		return (EReference)mInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMInterface_Domain() {
		return (EReference)mInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMInterface_Type() {
		return (EReference)mInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVIFACEPackageFile() {
		return mmclevifacePackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVIFACEPackageElement() {
		return mmclevifacePackageElementEClass;
	}

	/**
	 * @generated
	 */
	public mclevifaceFactory getmclevifaceFactory() {
		return (mclevifaceFactory)getEFactoryInstance();
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
		mInterfaceEClass = createEClass(MINTERFACE);
		createEReference(mInterfaceEClass, MINTERFACE__EXTENDS);
		createEReference(mInterfaceEClass, MINTERFACE__DOMAIN);
		createEReference(mInterfaceEClass, MINTERFACE__TYPE);

		mmclevifacePackageFileEClass = createEClass(MMCLEVIFACE_PACKAGE_FILE);

		mmclevifacePackageElementEClass = createEClass(MMCLEVIFACE_PACKAGE_ELEMENT);
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
		mclevdomPackage themclevdomPackage = (mclevdomPackage)EPackage.Registry.INSTANCE.getEPackage(mclevdomPackage.eNS_URI);
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mInterfaceEClass.getESuperTypes().add(this.getMMCLEVIFACEPackageElement());
		mmclevifacePackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmclevifacePackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes and features; add operations and parameters
		initEClass(mInterfaceEClass, MInterface.class, "MInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMInterface_Extends(), this.getMInterface(), null, "extends", null, 0, -1, MInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInterface_Domain(), themclevdomPackage.getMDomain(), null, "domain", null, 1, 1, MInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInterface_Type(), themclevdomPackage.getMInterfaceType(), null, "type", null, 1, 1, MInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmclevifacePackageFileEClass, MMCLEVIFACEPackageFile.class, "MMCLEVIFACEPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevifacePackageElementEClass, MMCLEVIFACEPackageElement.class, "MMCLEVIFACEPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}