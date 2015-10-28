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
package es.uah.aut.srg.micobs.mclev.mclevsai.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiFactory;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class mclevsaiPackageImpl extends EPackageImpl implements mclevsaiPackage {
	/**
	 * @generated
	 */
	private EClass msaiEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevsaiPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevsaiPackageElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mclevsaiPackageImpl() {
		super(eNS_URI, mclevsaiFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mclevsaiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mclevsaiPackage init() {
		if (isInited) return (mclevsaiPackage)EPackage.Registry.INSTANCE.getEPackage(mclevsaiPackage.eNS_URI);

		// Obtain or create and register package
		mclevsaiPackageImpl themclevsaiPackage = (mclevsaiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mclevsaiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mclevsaiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		pdlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themclevsaiPackage.createPackageContents();

		// Initialize created meta-data
		themclevsaiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themclevsaiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mclevsaiPackage.eNS_URI, themclevsaiPackage);
		return themclevsaiPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMSAI() {
		return msaiEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMSAI_Extends() {
		return (EReference)msaiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMSAI_Language() {
		return (EReference)msaiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMSAI_Requires() {
		return (EReference)msaiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMSAI_Attributes() {
		return (EReference)msaiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EReference getMSAI_RequiredOSAPI() {
		return (EReference)msaiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVSAIPackageFile() {
		return mmclevsaiPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVSAIPackageElement() {
		return mmclevsaiPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public mclevsaiFactory getmclevsaiFactory() {
		return (mclevsaiFactory)getEFactoryInstance();
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
		msaiEClass = createEClass(MSAI);
		createEReference(msaiEClass, MSAI__EXTENDS);
		createEReference(msaiEClass, MSAI__LANGUAGE);
		createEReference(msaiEClass, MSAI__REQUIRES);
		createEReference(msaiEClass, MSAI__ATTRIBUTES);
		createEReference(msaiEClass, MSAI__REQUIRED_OSAPI);

		mmclevsaiPackageFileEClass = createEClass(MMCLEVSAI_PACKAGE_FILE);

		mmclevsaiPackageElementEClass = createEClass(MMCLEVSAI_PACKAGE_ELEMENT);
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
		pdlPackage thepdlPackage = (pdlPackage)EPackage.Registry.INSTANCE.getEPackage(pdlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		msaiEClass.getESuperTypes().add(this.getMMCLEVSAIPackageElement());
		mmclevsaiPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmclevsaiPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(msaiEClass, es.uah.aut.srg.micobs.mclev.mclevsai.MSAI.class, "MSAI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMSAI_Extends(), this.getMSAI(), null, "extends", null, 0, -1, es.uah.aut.srg.micobs.mclev.mclevsai.MSAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSAI_Language(), thesystemPackage.getMLanguage(), null, "language", null, 1, 1, es.uah.aut.srg.micobs.mclev.mclevsai.MSAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSAI_Requires(), this.getMSAI(), null, "requires", null, 0, -1, es.uah.aut.srg.micobs.mclev.mclevsai.MSAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSAI_Attributes(), thecommonPackage.getMParameter(), null, "attributes", null, 0, -1, es.uah.aut.srg.micobs.mclev.mclevsai.MSAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMSAI_RequiredOSAPI(), thepdlPackage.getMOperatingSystemAPI(), null, "requiredOSAPI", null, 0, 1, es.uah.aut.srg.micobs.mclev.mclevsai.MSAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmclevsaiPackageFileEClass, MMCLEVSAIPackageFile.class, "MMCLEVSAIPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevsaiPackageElementEClass, MMCLEVSAIPackageElement.class, "MMCLEVSAIPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}