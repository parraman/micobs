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
package es.uah.aut.srg.micobs.libdesc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.MDescriptorField;
import es.uah.aut.srg.micobs.libdesc.MDescriptorList;
import es.uah.aut.srg.micobs.libdesc.libdescFactory;
import es.uah.aut.srg.micobs.libdesc.libdescPackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class libdescPackageImpl extends EPackageImpl implements libdescPackage {
	/**
	 * @generated
	 */
	private EClass mDescriptorEClass = null;

	/**
	 * @generated
	 */
	private EClass mDescriptorListEClass = null;

	/**
	 * @generated
	 */
	private EClass mDescriptorFieldEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private libdescPackageImpl() {
		super(eNS_URI, libdescFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link libdescPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static libdescPackage init() {
		if (isInited) return (libdescPackage)EPackage.Registry.INSTANCE.getEPackage(libdescPackage.eNS_URI);

		// Obtain or create and register package
		libdescPackageImpl thelibdescPackage = (libdescPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof libdescPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new libdescPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thelibdescPackage.createPackageContents();

		// Initialize created meta-data
		thelibdescPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thelibdescPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(libdescPackage.eNS_URI, thelibdescPackage);
		return thelibdescPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMDescriptor() {
		return mDescriptorEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMDescriptor_Uri() {
		return (EAttribute)mDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMDescriptor_Library() {
		return (EAttribute)mDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EAttribute getMDescriptor_Item() {
		return (EAttribute)mDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EReference getMDescriptor_Fields() {
		return (EReference)mDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EClass getMDescriptorList() {
		return mDescriptorListEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMDescriptorList_Descriptors() {
		return (EReference)mDescriptorListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMDescriptorField() {
		return mDescriptorFieldEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMDescriptorField_Name() {
		return (EAttribute)mDescriptorFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMDescriptorField_Value() {
		return (EAttribute)mDescriptorFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public libdescFactory getlibdescFactory() {
		return (libdescFactory)getEFactoryInstance();
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
		mDescriptorEClass = createEClass(MDESCRIPTOR);
		createEAttribute(mDescriptorEClass, MDESCRIPTOR__URI);
		createEAttribute(mDescriptorEClass, MDESCRIPTOR__LIBRARY);
		createEAttribute(mDescriptorEClass, MDESCRIPTOR__ITEM);
		createEReference(mDescriptorEClass, MDESCRIPTOR__FIELDS);

		mDescriptorListEClass = createEClass(MDESCRIPTOR_LIST);
		createEReference(mDescriptorListEClass, MDESCRIPTOR_LIST__DESCRIPTORS);

		mDescriptorFieldEClass = createEClass(MDESCRIPTOR_FIELD);
		createEAttribute(mDescriptorFieldEClass, MDESCRIPTOR_FIELD__NAME);
		createEAttribute(mDescriptorFieldEClass, MDESCRIPTOR_FIELD__VALUE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mDescriptorEClass, MDescriptor.class, "MDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMDescriptor_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, MDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDescriptor_Library(), ecorePackage.getEString(), "library", null, 1, 1, MDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDescriptor_Item(), ecorePackage.getEString(), "item", null, 1, 1, MDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMDescriptor_Fields(), this.getMDescriptorField(), null, "fields", null, 0, -1, MDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDescriptorListEClass, MDescriptorList.class, "MDescriptorList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDescriptorList_Descriptors(), this.getMDescriptor(), null, "descriptors", null, 1, -1, MDescriptorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mDescriptorFieldEClass, MDescriptorField.class, "MDescriptorField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMDescriptorField_Name(), ecorePackage.getEString(), "name", null, 1, 1, MDescriptorField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDescriptorField_Value(), ecorePackage.getEString(), "value", null, 0, 1, MDescriptorField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

}
