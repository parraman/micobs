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
package es.uah.aut.srg.micobs.mclev.mclevimap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.mclevimap.MMCLEVIMAPPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevimap.MMCLEVIMAPPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapFactory;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class mclevimapPackageImpl extends EPackageImpl implements mclevimapPackage {
	/**
	 * @generated
	 */
	private EClass mInterfaceMappingEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevimapPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmclevimapPackageElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mclevimapPackageImpl() {
		super(eNS_URI, mclevimapFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mclevimapPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mclevimapPackage init() {
		if (isInited) return (mclevimapPackage)EPackage.Registry.INSTANCE.getEPackage(mclevimapPackage.eNS_URI);

		// Obtain or create and register package
		mclevimapPackageImpl themclevimapPackage = (mclevimapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mclevimapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mclevimapPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mclevifacePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themclevimapPackage.createPackageContents();

		// Initialize created meta-data
		themclevimapPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themclevimapPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mclevimapPackage.eNS_URI, themclevimapPackage);
		return themclevimapPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMInterfaceMapping() {
		return mInterfaceMappingEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMInterfaceMapping_Domain() {
		return (EReference)mInterfaceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMInterfaceMapping_Type() {
		return (EReference)mInterfaceMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMInterfaceMapping_Interfaces() {
		return (EReference)mInterfaceMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVIMAPPackageFile() {
		return mmclevimapPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMCLEVIMAPPackageElement() {
		return mmclevimapPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public mclevimapFactory getmclevimapFactory() {
		return (mclevimapFactory)getEFactoryInstance();
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
		mInterfaceMappingEClass = createEClass(MINTERFACE_MAPPING);
		createEReference(mInterfaceMappingEClass, MINTERFACE_MAPPING__DOMAIN);
		createEReference(mInterfaceMappingEClass, MINTERFACE_MAPPING__TYPE);
		createEReference(mInterfaceMappingEClass, MINTERFACE_MAPPING__INTERFACES);

		mmclevimapPackageFileEClass = createEClass(MMCLEVIMAP_PACKAGE_FILE);

		mmclevimapPackageElementEClass = createEClass(MMCLEVIMAP_PACKAGE_ELEMENT);
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
		mclevifacePackage themclevifacePackage = (mclevifacePackage)EPackage.Registry.INSTANCE.getEPackage(mclevifacePackage.eNS_URI);
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mInterfaceMappingEClass.getESuperTypes().add(this.getMMCLEVIMAPPackageElement());
		mmclevimapPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmclevimapPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes and features; add operations and parameters
		initEClass(mInterfaceMappingEClass, MInterfaceMapping.class, "MInterfaceMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMInterfaceMapping_Domain(), themclevdomPackage.getMIODomain(), null, "domain", null, 1, 1, MInterfaceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInterfaceMapping_Type(), themclevdomPackage.getMExchangeModel(), null, "type", null, 1, 1, MInterfaceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInterfaceMapping_Interfaces(), themclevifacePackage.getMInterface(), null, "interfaces", null, 2, 2, MInterfaceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmclevimapPackageFileEClass, MMCLEVIMAPPackageFile.class, "MMCLEVIMAPPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmclevimapPackageElementEClass, MMCLEVIMAPPackageElement.class, "MMCLEVIMAPPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}