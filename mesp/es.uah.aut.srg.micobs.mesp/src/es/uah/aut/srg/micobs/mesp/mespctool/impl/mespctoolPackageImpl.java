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
package es.uah.aut.srg.micobs.mesp.mespctool.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespctool.MMESPCTOOLPackageElement;
import es.uah.aut.srg.micobs.mesp.mespctool.MMESPCTOOLPackageFile;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolFactory;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.system.systemPackage;

/**
 * An implementation of the model <b>Package</b>.
 * 
 * @generated
 */
public class mespctoolPackageImpl extends EPackageImpl implements mespctoolPackage {
	/**
	 * @generated
	 */
	private EClass mConstructionToolEClass = null;

	/**
	 * @generated
	 */
	private EClass mmespctoolPackageFileEClass = null;
	/**
	 * @generated
	 */
	private EClass mmespctoolPackageElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mespctoolPackageImpl() {
		super(eNS_URI, mespctoolFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mespctoolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mespctoolPackage init() {
		if (isInited) return (mespctoolPackage)EPackage.Registry.INSTANCE.getEPackage(mespctoolPackage.eNS_URI);

		// Obtain or create and register package
		mespctoolPackageImpl themespctoolPackage = (mespctoolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mespctoolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mespctoolPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		systemPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themespctoolPackage.createPackageContents();

		// Initialize created meta-data
		themespctoolPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themespctoolPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mespctoolPackage.eNS_URI, themespctoolPackage);
		return themespctoolPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMConstructionTool() {
		return mConstructionToolEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMConstructionTool_Extends() {
		return (EReference)mConstructionToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMConstructionTool_SupportedLanguages() {
		return (EReference)mConstructionToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMMESPCTOOLPackageFile() {
		return mmespctoolPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPCTOOLPackageElement() {
		return mmespctoolPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public mespctoolFactory getmespctoolFactory() {
		return (mespctoolFactory)getEFactoryInstance();
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
		mConstructionToolEClass = createEClass(MCONSTRUCTION_TOOL);
		createEReference(mConstructionToolEClass, MCONSTRUCTION_TOOL__EXTENDS);
		createEReference(mConstructionToolEClass, MCONSTRUCTION_TOOL__SUPPORTED_LANGUAGES);

		mmespctoolPackageFileEClass = createEClass(MMESPCTOOL_PACKAGE_FILE);

		mmespctoolPackageElementEClass = createEClass(MMESPCTOOL_PACKAGE_ELEMENT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mConstructionToolEClass.getESuperTypes().add(this.getMMESPCTOOLPackageElement());
		mmespctoolPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmespctoolPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes and features; add operations and parameters
		initEClass(mConstructionToolEClass, MConstructionTool.class, "MConstructionTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMConstructionTool_Extends(), this.getMConstructionTool(), null, "extends", null, 0, -1, MConstructionTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMConstructionTool_SupportedLanguages(), thesystemPackage.getMLanguage(), null, "supportedLanguages", null, 0, -1, MConstructionTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmespctoolPackageFileEClass, MMESPCTOOLPackageFile.class, "MMESPCTOOLPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmespctoolPackageElementEClass, MMESPCTOOLPackageElement.class, "MMESPCTOOLPackageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}