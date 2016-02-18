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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageElement;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageFile;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMReplyMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMSendMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage;

/**
 * An implementation of the model <b>Package</b>.
 *
 * @generated
 */
public class edroomprotPackageImpl extends EPackageImpl implements edroomprotPackage {
	/**
	 * @generated
	 */
	private EClass edroomProtocolEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomMessageEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomSendMessageEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomInvokeMessageEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomReplyMessageEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomprotPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomprotPackageElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private edroomprotPackageImpl() {
		super(eNS_URI, edroomprotFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link edroomprotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static edroomprotPackage init() {
		if (isInited) return (edroomprotPackage)EPackage.Registry.INSTANCE.getEPackage(edroomprotPackage.eNS_URI);

		// Obtain or create and register package
		edroomprotPackageImpl theedroomprotPackage = (edroomprotPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof edroomprotPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new edroomprotPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		edroomdclassPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theedroomprotPackage.createPackageContents();

		// Initialize created meta-data
		theedroomprotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theedroomprotPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(edroomprotPackage.eNS_URI, theedroomprotPackage);
		return theedroomprotPackage;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMProtocol() {
		return edroomProtocolEClass;
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMProtocol_InputMessages() {
		return (EReference)edroomProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMProtocol_OutputMessages() {
		return (EReference)edroomProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMProtocol_Extends() {
		return (EReference)edroomProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMMessage() {
		return edroomMessageEClass;
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMMessage_DataClass() {
		return (EReference)edroomMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMSendMessage() {
		return edroomSendMessageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMInvokeMessage() {
		return edroomInvokeMessageEClass;
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMInvokeMessage_Replies() {
		return (EReference)edroomInvokeMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMReplyMessage() {
		return edroomReplyMessageEClass;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMPROTPackageFile() {
		return edroomprotPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMPROTPackageElement() {
		return edroomprotPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public edroomprotFactory getedroomprotFactory() {
		return (edroomprotFactory)getEFactoryInstance();
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
		edroomProtocolEClass = createEClass(EDROOM_PROTOCOL);
		createEReference(edroomProtocolEClass, EDROOM_PROTOCOL__INPUT_MESSAGES);
		createEReference(edroomProtocolEClass, EDROOM_PROTOCOL__OUTPUT_MESSAGES);
		createEReference(edroomProtocolEClass, EDROOM_PROTOCOL__EXTENDS);

		edroomMessageEClass = createEClass(EDROOM_MESSAGE);
		createEReference(edroomMessageEClass, EDROOM_MESSAGE__DATA_CLASS);

		edroomSendMessageEClass = createEClass(EDROOM_SEND_MESSAGE);

		edroomInvokeMessageEClass = createEClass(EDROOM_INVOKE_MESSAGE);
		createEReference(edroomInvokeMessageEClass, EDROOM_INVOKE_MESSAGE__REPLIES);

		edroomReplyMessageEClass = createEClass(EDROOM_REPLY_MESSAGE);

		edroomprotPackageFileEClass = createEClass(EDROOMPROT_PACKAGE_FILE);

		edroomprotPackageElementEClass = createEClass(EDROOMPROT_PACKAGE_ELEMENT);
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
		edroomdclassPackage theedroomdclassPackage = (edroomdclassPackage)EPackage.Registry.INSTANCE.getEPackage(edroomdclassPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		edroomProtocolEClass.getESuperTypes().add(this.getEDROOMPROTPackageElement());
		edroomMessageEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		edroomSendMessageEClass.getESuperTypes().add(this.getEDROOMMessage());
		edroomInvokeMessageEClass.getESuperTypes().add(this.getEDROOMMessage());
		edroomReplyMessageEClass.getESuperTypes().add(this.getEDROOMMessage());
		edroomprotPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		edroomprotPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageReferencingElement());

		// Initialize classes and features; add operations and parameters
		initEClass(edroomProtocolEClass, EDROOMProtocol.class, "EDROOMProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDROOMProtocol_InputMessages(), this.getEDROOMMessage(), null, "inputMessages", null, 0, -1, EDROOMProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDROOMProtocol_OutputMessages(), this.getEDROOMMessage(), null, "outputMessages", null, 0, -1, EDROOMProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDROOMProtocol_Extends(), this.getEDROOMProtocol(), null, "extends", null, 0, -1, EDROOMProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomMessageEClass, EDROOMMessage.class, "EDROOMMessage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDROOMMessage_DataClass(), theedroomdclassPackage.getEDROOMDataClass(), null, "dataClass", null, 0, 1, EDROOMMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomSendMessageEClass, EDROOMSendMessage.class, "EDROOMSendMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edroomInvokeMessageEClass, EDROOMInvokeMessage.class, "EDROOMInvokeMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDROOMInvokeMessage_Replies(), this.getEDROOMReplyMessage(), null, "replies", null, 1, -1, EDROOMInvokeMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomReplyMessageEClass, EDROOMReplyMessage.class, "EDROOMReplyMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edroomprotPackageFileEClass, EDROOMPROTPackageFile.class, "EDROOMPROTPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edroomprotPackageElementEClass, EDROOMPROTPackageElement.class, "EDROOMPROTPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

}
