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
package es.uah.aut.srg.micobs.mesp.mesppswp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageElement;
import es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpFactory;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;

/**
 * An implementation of the model <b>Package</b>.
 * 
 * @generated
 */
public class mesppswpPackageImpl extends EPackageImpl implements mesppswpPackage {
	/**
	 * @generated
	 */
	private EClass mPlatformSwPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mmesppswpPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mmesppswpPackageElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private mesppswpPackageImpl() {
		super(eNS_URI, mesppswpFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link mesppswpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static mesppswpPackage init() {
		if (isInited) return (mesppswpPackage)EPackage.Registry.INSTANCE.getEPackage(mesppswpPackage.eNS_URI);

		// Obtain or create and register package
		mesppswpPackageImpl themesppswpPackage = (mesppswpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof mesppswpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new mesppswpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		mesposswpPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		themesppswpPackage.createPackageContents();

		// Initialize created meta-data
		themesppswpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themesppswpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(mesppswpPackage.eNS_URI, themesppswpPackage);
		return themesppswpPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMPlatformSwPackage() {
		return mPlatformSwPackageEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMPlatformSwPackage_OsSwPackages() {
		return (EReference)mPlatformSwPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMPlatformSwPackage_Ctools() {
		return (EReference)mPlatformSwPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMMESPPSWPPackageFile() {
		return mmesppswpPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMMESPPSWPPackageElement() {
		return mmesppswpPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public mesppswpFactory getmesppswpFactory() {
		return (mesppswpFactory)getEFactoryInstance();
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
		mPlatformSwPackageEClass = createEClass(MPLATFORM_SW_PACKAGE);
		createEReference(mPlatformSwPackageEClass, MPLATFORM_SW_PACKAGE__OS_SW_PACKAGES);
		createEReference(mPlatformSwPackageEClass, MPLATFORM_SW_PACKAGE__CTOOLS);

		mmesppswpPackageFileEClass = createEClass(MMESPPSWP_PACKAGE_FILE);

		mmesppswpPackageElementEClass = createEClass(MMESPPSWP_PACKAGE_ELEMENT);
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
		mesposswpPackage themesposswpPackage = (mesposswpPackage)EPackage.Registry.INSTANCE.getEPackage(mesposswpPackage.eNS_URI);
		mespctoolPackage themespctoolPackage = (mespctoolPackage)EPackage.Registry.INSTANCE.getEPackage(mespctoolPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mPlatformSwPackageEClass.getESuperTypes().add(this.getMMESPPSWPPackageElement());
		mPlatformSwPackageEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageReferencingElement());
		mmesppswpPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		mmesppswpPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes and features; add operations and parameters
		initEClass(mPlatformSwPackageEClass, MPlatformSwPackage.class, "MPlatformSwPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMPlatformSwPackage_OsSwPackages(), themesposswpPackage.getMOSSwPackage(), null, "osSwPackages", null, 1, -1, MPlatformSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPlatformSwPackage_Ctools(), themespctoolPackage.getMConstructionTool(), null, "ctools", null, 1, -1, MPlatformSwPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mmesppswpPackageFileEClass, MMESPPSWPPackageFile.class, "MMESPPSWPPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mmesppswpPackageElementEClass, MMESPPSWPPackageElement.class, "MMESPPSWPPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}
