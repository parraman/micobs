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
package es.uah.aut.srg.micobs.mesp.mespcommon.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonFactory;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;

/**
 * An implementation of the model <b>Package</b>.
 * 
 * @generated
 */
public class mespcommonPackageImpl extends EPackageImpl implements mespcommonPackage {
	/**
	 * @generated
	 */
	private EClass mProvidedResourceEClass = null;

	/**
	 * @generated
	 */
	private EClass mQuantifiableResourceEClass = null;

	/**
	 * @generated
	 */
	private EClass mInstantiableResourceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mespcommonPackageImpl() {
		super(eNS_URI, mespcommonFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mespcommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mespcommonPackage init() {
		if (isInited) return (mespcommonPackage)EPackage.Registry.INSTANCE.getEPackage(mespcommonPackage.eNS_URI);

		// Obtain or create and register package
		mespcommonPackageImpl themespcommonPackage = (mespcommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mespcommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mespcommonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themespcommonPackage.createPackageContents();

		// Initialize created meta-data
		themespcommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themespcommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mespcommonPackage.eNS_URI, themespcommonPackage);
		return themespcommonPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMProvidedResource() {
		return mProvidedResourceEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMQuantifiableResource() {
		return mQuantifiableResourceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMQuantifiableResource_LowerBound() {
		return (EReference)mQuantifiableResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMQuantifiableResource_UpperBound() {
		return (EReference)mQuantifiableResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMInstantiableResource() {
		return mInstantiableResourceEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMInstantiableResource_Parameters() {
		return (EReference)mInstantiableResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public mespcommonFactory getmespcommonFactory() {
		return (mespcommonFactory)getEFactoryInstance();
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
		mProvidedResourceEClass = createEClass(MPROVIDED_RESOURCE);

		mQuantifiableResourceEClass = createEClass(MQUANTIFIABLE_RESOURCE);
		createEReference(mQuantifiableResourceEClass, MQUANTIFIABLE_RESOURCE__LOWER_BOUND);
		createEReference(mQuantifiableResourceEClass, MQUANTIFIABLE_RESOURCE__UPPER_BOUND);

		mInstantiableResourceEClass = createEClass(MINSTANTIABLE_RESOURCE);
		createEReference(mInstantiableResourceEClass, MINSTANTIABLE_RESOURCE__PARAMETERS);
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
		mProvidedResourceEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		mQuantifiableResourceEClass.getESuperTypes().add(this.getMProvidedResource());
		mInstantiableResourceEClass.getESuperTypes().add(this.getMProvidedResource());

		// Initialize classes and features; add operations and parameters
		initEClass(mProvidedResourceEClass, MProvidedResource.class, "MProvidedResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mQuantifiableResourceEClass, MQuantifiableResource.class, "MQuantifiableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMQuantifiableResource_LowerBound(), thecommonPackage.getMParameterValueExpression(), null, "lowerBound", null, 1, 1, MQuantifiableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMQuantifiableResource_UpperBound(), thecommonPackage.getMParameterValueExpression(), null, "upperBound", null, 1, 1, MQuantifiableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mInstantiableResourceEClass, MInstantiableResource.class, "MInstantiableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMInstantiableResource_Parameters(), thecommonPackage.getMParameter(), null, "parameters", null, 0, -1, MInstantiableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

}
