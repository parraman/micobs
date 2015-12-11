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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMBasicType;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageElement;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageFile;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinition;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnum;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnion;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElement;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasic;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasicArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClassArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnum;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnumArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnion;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnionArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataField;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasic;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasicArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClass;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClassArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnum;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnumArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnion;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnionArray;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassFactory;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class edroomdclassPackageImpl extends EPackageImpl implements edroomdclassPackage {
	/**
	 * @generated
	 */
	private EClass edroomDataClassEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataFieldEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataFieldBasicEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataFieldBasicArrayEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataFieldClassEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataFieldClassArrayEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataFieldUnionArrayEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataFieldUnionEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataFieldEnumArrayEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataFieldEnumEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionUnionEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionUnionElementEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionUnionElementBasicEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionUnionElementClassEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionUnionElementBasicArrayEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionUnionElementClassArrayEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionUnionElementUnionEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionUnionElementUnionArrayEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionEnumEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionEnumElementEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionUnionElementEnumEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomDataDefinitionUnionElementEnumArrayEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomdclassPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass edroomdclassPackageElementEClass = null;

	/**
	 * @generated
	 */
	private EEnum edroomBasicTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private edroomdclassPackageImpl() {
		super(eNS_URI, edroomdclassFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link edroomdclassPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static edroomdclassPackage init() {
		if (isInited) return (edroomdclassPackage)EPackage.Registry.INSTANCE.getEPackage(edroomdclassPackage.eNS_URI);

		// Obtain or create and register package
		edroomdclassPackageImpl theedroomdclassPackage = (edroomdclassPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof edroomdclassPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new edroomdclassPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theedroomdclassPackage.createPackageContents();

		// Initialize created meta-data
		theedroomdclassPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theedroomdclassPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(edroomdclassPackage.eNS_URI, theedroomdclassPackage);
		return theedroomdclassPackage;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataClass() {
		return edroomDataClassEClass;
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMDataClass_Fields() {
		return (EReference)edroomDataClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMDataClass_Definitions() {
		return (EReference)edroomDataClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMDataClass_Inherits() {
		return (EReference)edroomDataClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataField() {
		return edroomDataFieldEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataField_Name() {
		return (EAttribute)edroomDataFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataFieldBasic() {
		return edroomDataFieldBasicEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataFieldBasic_Type() {
		return (EAttribute)edroomDataFieldBasicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataFieldBasicArray() {
		return edroomDataFieldBasicArrayEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataFieldBasicArray_Elements() {
		return (EAttribute)edroomDataFieldBasicArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataFieldClass() {
		return edroomDataFieldClassEClass;
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMDataFieldClass_Type() {
		return (EReference)edroomDataFieldClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataFieldClassArray() {
		return edroomDataFieldClassArrayEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataFieldClassArray_Elements() {
		return (EAttribute)edroomDataFieldClassArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataFieldUnionArray() {
		return edroomDataFieldUnionArrayEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataFieldUnionArray_Elements() {
		return (EAttribute)edroomDataFieldUnionArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataFieldUnion() {
		return edroomDataFieldUnionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMDataFieldUnion_Type() {
		return (EReference)edroomDataFieldUnionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataFieldEnumArray() {
		return edroomDataFieldEnumArrayEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataFieldEnumArray_Elements() {
		return (EAttribute)edroomDataFieldEnumArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataFieldEnum() {
		return edroomDataFieldEnumEClass;
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMDataFieldEnum_Type() {
		return (EReference)edroomDataFieldEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinition() {
		return edroomDataDefinitionEClass;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinitionUnion() {
		return edroomDataDefinitionUnionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMDataDefinitionUnion_Elements() {
		return (EReference)edroomDataDefinitionUnionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinitionUnionElement() {
		return edroomDataDefinitionUnionElementEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataDefinitionUnionElement_Name() {
		return (EAttribute)edroomDataDefinitionUnionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinitionUnionElementBasic() {
		return edroomDataDefinitionUnionElementBasicEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataDefinitionUnionElementBasic_Type() {
		return (EAttribute)edroomDataDefinitionUnionElementBasicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinitionUnionElementClass() {
		return edroomDataDefinitionUnionElementClassEClass;
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMDataDefinitionUnionElementClass_Type() {
		return (EReference)edroomDataDefinitionUnionElementClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinitionUnionElementBasicArray() {
		return edroomDataDefinitionUnionElementBasicArrayEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataDefinitionUnionElementBasicArray_Elements() {
		return (EAttribute)edroomDataDefinitionUnionElementBasicArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinitionUnionElementClassArray() {
		return edroomDataDefinitionUnionElementClassArrayEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataDefinitionUnionElementClassArray_Elements() {
		return (EAttribute)edroomDataDefinitionUnionElementClassArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinitionUnionElementUnion() {
		return edroomDataDefinitionUnionElementUnionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMDataDefinitionUnionElementUnion_Type() {
		return (EReference)edroomDataDefinitionUnionElementUnionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinitionUnionElementUnionArray() {
		return edroomDataDefinitionUnionElementUnionArrayEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataDefinitionUnionElementUnionArray_Elements() {
		return (EAttribute)edroomDataDefinitionUnionElementUnionArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinitionEnum() {
		return edroomDataDefinitionEnumEClass;
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMDataDefinitionEnum_Elements() {
		return (EReference)edroomDataDefinitionEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinitionEnumElement() {
		return edroomDataDefinitionEnumElementEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataDefinitionEnumElement_Name() {
		return (EAttribute)edroomDataDefinitionEnumElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataDefinitionEnumElement_Value() {
		return (EAttribute)edroomDataDefinitionEnumElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinitionUnionElementEnum() {
		return edroomDataDefinitionUnionElementEnumEClass;
	}

	/**
	 * @generated
	 */
	public EReference getEDROOMDataDefinitionUnionElementEnum_Type() {
		return (EReference)edroomDataDefinitionUnionElementEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDataDefinitionUnionElementEnumArray() {
		return edroomDataDefinitionUnionElementEnumArrayEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getEDROOMDataDefinitionUnionElementEnumArray_Elements() {
		return (EAttribute)edroomDataDefinitionUnionElementEnumArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDCLASSPackageFile() {
		return edroomdclassPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EClass getEDROOMDCLASSPackageElement() {
		return edroomdclassPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public EEnum getEDROOMBasicType() {
		return edroomBasicTypeEEnum;
	}

	/**
	 * @generated
	 */
	public edroomdclassFactory getedroomdclassFactory() {
		return (edroomdclassFactory)getEFactoryInstance();
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
		edroomDataClassEClass = createEClass(EDROOM_DATA_CLASS);
		createEReference(edroomDataClassEClass, EDROOM_DATA_CLASS__FIELDS);
		createEReference(edroomDataClassEClass, EDROOM_DATA_CLASS__DEFINITIONS);
		createEReference(edroomDataClassEClass, EDROOM_DATA_CLASS__INHERITS);

		edroomDataFieldEClass = createEClass(EDROOM_DATA_FIELD);
		createEAttribute(edroomDataFieldEClass, EDROOM_DATA_FIELD__NAME);

		edroomDataFieldBasicEClass = createEClass(EDROOM_DATA_FIELD_BASIC);
		createEAttribute(edroomDataFieldBasicEClass, EDROOM_DATA_FIELD_BASIC__TYPE);

		edroomDataFieldBasicArrayEClass = createEClass(EDROOM_DATA_FIELD_BASIC_ARRAY);
		createEAttribute(edroomDataFieldBasicArrayEClass, EDROOM_DATA_FIELD_BASIC_ARRAY__ELEMENTS);

		edroomDataFieldClassEClass = createEClass(EDROOM_DATA_FIELD_CLASS);
		createEReference(edroomDataFieldClassEClass, EDROOM_DATA_FIELD_CLASS__TYPE);

		edroomDataFieldClassArrayEClass = createEClass(EDROOM_DATA_FIELD_CLASS_ARRAY);
		createEAttribute(edroomDataFieldClassArrayEClass, EDROOM_DATA_FIELD_CLASS_ARRAY__ELEMENTS);

		edroomDataFieldUnionArrayEClass = createEClass(EDROOM_DATA_FIELD_UNION_ARRAY);
		createEAttribute(edroomDataFieldUnionArrayEClass, EDROOM_DATA_FIELD_UNION_ARRAY__ELEMENTS);

		edroomDataFieldUnionEClass = createEClass(EDROOM_DATA_FIELD_UNION);
		createEReference(edroomDataFieldUnionEClass, EDROOM_DATA_FIELD_UNION__TYPE);

		edroomDataFieldEnumArrayEClass = createEClass(EDROOM_DATA_FIELD_ENUM_ARRAY);
		createEAttribute(edroomDataFieldEnumArrayEClass, EDROOM_DATA_FIELD_ENUM_ARRAY__ELEMENTS);

		edroomDataFieldEnumEClass = createEClass(EDROOM_DATA_FIELD_ENUM);
		createEReference(edroomDataFieldEnumEClass, EDROOM_DATA_FIELD_ENUM__TYPE);

		edroomDataDefinitionEClass = createEClass(EDROOM_DATA_DEFINITION);

		edroomDataDefinitionUnionEClass = createEClass(EDROOM_DATA_DEFINITION_UNION);
		createEReference(edroomDataDefinitionUnionEClass, EDROOM_DATA_DEFINITION_UNION__ELEMENTS);

		edroomDataDefinitionUnionElementEClass = createEClass(EDROOM_DATA_DEFINITION_UNION_ELEMENT);
		createEAttribute(edroomDataDefinitionUnionElementEClass, EDROOM_DATA_DEFINITION_UNION_ELEMENT__NAME);

		edroomDataDefinitionUnionElementBasicEClass = createEClass(EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC);
		createEAttribute(edroomDataDefinitionUnionElementBasicEClass, EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC__TYPE);

		edroomDataDefinitionUnionElementClassEClass = createEClass(EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS);
		createEReference(edroomDataDefinitionUnionElementClassEClass, EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS__TYPE);

		edroomDataDefinitionUnionElementBasicArrayEClass = createEClass(EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_ARRAY);
		createEAttribute(edroomDataDefinitionUnionElementBasicArrayEClass, EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_ARRAY__ELEMENTS);

		edroomDataDefinitionUnionElementClassArrayEClass = createEClass(EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_ARRAY);
		createEAttribute(edroomDataDefinitionUnionElementClassArrayEClass, EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_ARRAY__ELEMENTS);

		edroomDataDefinitionUnionElementUnionEClass = createEClass(EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION);
		createEReference(edroomDataDefinitionUnionElementUnionEClass, EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION__TYPE);

		edroomDataDefinitionUnionElementUnionArrayEClass = createEClass(EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_ARRAY);
		createEAttribute(edroomDataDefinitionUnionElementUnionArrayEClass, EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_ARRAY__ELEMENTS);

		edroomDataDefinitionEnumEClass = createEClass(EDROOM_DATA_DEFINITION_ENUM);
		createEReference(edroomDataDefinitionEnumEClass, EDROOM_DATA_DEFINITION_ENUM__ELEMENTS);

		edroomDataDefinitionEnumElementEClass = createEClass(EDROOM_DATA_DEFINITION_ENUM_ELEMENT);
		createEAttribute(edroomDataDefinitionEnumElementEClass, EDROOM_DATA_DEFINITION_ENUM_ELEMENT__NAME);
		createEAttribute(edroomDataDefinitionEnumElementEClass, EDROOM_DATA_DEFINITION_ENUM_ELEMENT__VALUE);

		edroomDataDefinitionUnionElementEnumEClass = createEClass(EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM);
		createEReference(edroomDataDefinitionUnionElementEnumEClass, EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM__TYPE);

		edroomDataDefinitionUnionElementEnumArrayEClass = createEClass(EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY);
		createEAttribute(edroomDataDefinitionUnionElementEnumArrayEClass, EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY__ELEMENTS);

		edroomdclassPackageFileEClass = createEClass(EDROOMDCLASS_PACKAGE_FILE);

		edroomdclassPackageElementEClass = createEClass(EDROOMDCLASS_PACKAGE_ELEMENT);

		// Create enums
		edroomBasicTypeEEnum = createEEnum(EDROOM_BASIC_TYPE);
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
		edroomDataClassEClass.getESuperTypes().add(this.getEDROOMDCLASSPackageElement());
		edroomDataFieldBasicEClass.getESuperTypes().add(this.getEDROOMDataField());
		edroomDataFieldBasicArrayEClass.getESuperTypes().add(this.getEDROOMDataFieldBasic());
		edroomDataFieldClassEClass.getESuperTypes().add(this.getEDROOMDataField());
		edroomDataFieldClassArrayEClass.getESuperTypes().add(this.getEDROOMDataFieldClass());
		edroomDataFieldUnionArrayEClass.getESuperTypes().add(this.getEDROOMDataFieldUnion());
		edroomDataFieldUnionEClass.getESuperTypes().add(this.getEDROOMDataField());
		edroomDataFieldEnumArrayEClass.getESuperTypes().add(this.getEDROOMDataFieldEnum());
		edroomDataFieldEnumEClass.getESuperTypes().add(this.getEDROOMDataField());
		edroomDataDefinitionEClass.getESuperTypes().add(thecommonPackage.getMCommonReferenceableObj());
		edroomDataDefinitionUnionEClass.getESuperTypes().add(this.getEDROOMDataDefinition());
		edroomDataDefinitionUnionElementBasicEClass.getESuperTypes().add(this.getEDROOMDataDefinitionUnionElement());
		edroomDataDefinitionUnionElementClassEClass.getESuperTypes().add(this.getEDROOMDataDefinitionUnionElement());
		edroomDataDefinitionUnionElementBasicArrayEClass.getESuperTypes().add(this.getEDROOMDataDefinitionUnionElementBasic());
		edroomDataDefinitionUnionElementClassArrayEClass.getESuperTypes().add(this.getEDROOMDataDefinitionUnionElementClass());
		edroomDataDefinitionUnionElementUnionEClass.getESuperTypes().add(this.getEDROOMDataDefinitionUnionElement());
		edroomDataDefinitionUnionElementUnionArrayEClass.getESuperTypes().add(this.getEDROOMDataDefinitionUnionElementUnion());
		edroomDataDefinitionEnumEClass.getESuperTypes().add(this.getEDROOMDataDefinition());
		edroomDataDefinitionUnionElementEnumEClass.getESuperTypes().add(this.getEDROOMDataDefinitionUnionElement());
		edroomDataDefinitionUnionElementEnumArrayEClass.getESuperTypes().add(this.getEDROOMDataDefinitionUnionElementEnum());
		edroomdclassPackageFileEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageFile());
		edroomdclassPackageElementEClass.getESuperTypes().add(thecommonPackage.getMCommonPackageElement());

		// Initialize classes and features; add operations and parameters
		initEClass(edroomDataClassEClass, EDROOMDataClass.class, "EDROOMDataClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDROOMDataClass_Fields(), this.getEDROOMDataField(), null, "fields", null, 1, -1, EDROOMDataClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDROOMDataClass_Definitions(), this.getEDROOMDataDefinition(), null, "definitions", null, 0, -1, EDROOMDataClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDROOMDataClass_Inherits(), this.getEDROOMDataClass(), null, "inherits", null, 0, -1, EDROOMDataClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataFieldEClass, EDROOMDataField.class, "EDROOMDataField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataField_Name(), ecorePackage.getEString(), "name", null, 1, 1, EDROOMDataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataFieldBasicEClass, EDROOMDataFieldBasic.class, "EDROOMDataFieldBasic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataFieldBasic_Type(), this.getEDROOMBasicType(), "type", null, 1, 1, EDROOMDataFieldBasic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataFieldBasicArrayEClass, EDROOMDataFieldBasicArray.class, "EDROOMDataFieldBasicArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataFieldBasicArray_Elements(), ecorePackage.getEInt(), "elements", null, 1, 1, EDROOMDataFieldBasicArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataFieldClassEClass, EDROOMDataFieldClass.class, "EDROOMDataFieldClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDROOMDataFieldClass_Type(), this.getEDROOMDataClass(), null, "type", null, 1, 1, EDROOMDataFieldClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataFieldClassArrayEClass, EDROOMDataFieldClassArray.class, "EDROOMDataFieldClassArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataFieldClassArray_Elements(), ecorePackage.getEInt(), "elements", null, 1, 1, EDROOMDataFieldClassArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataFieldUnionArrayEClass, EDROOMDataFieldUnionArray.class, "EDROOMDataFieldUnionArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataFieldUnionArray_Elements(), ecorePackage.getEInt(), "elements", null, 1, 1, EDROOMDataFieldUnionArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataFieldUnionEClass, EDROOMDataFieldUnion.class, "EDROOMDataFieldUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDROOMDataFieldUnion_Type(), this.getEDROOMDataDefinitionUnion(), null, "type", null, 1, 1, EDROOMDataFieldUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataFieldEnumArrayEClass, EDROOMDataFieldEnumArray.class, "EDROOMDataFieldEnumArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataFieldEnumArray_Elements(), ecorePackage.getEInt(), "elements", null, 1, 1, EDROOMDataFieldEnumArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataFieldEnumEClass, EDROOMDataFieldEnum.class, "EDROOMDataFieldEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDROOMDataFieldEnum_Type(), this.getEDROOMDataDefinitionEnum(), null, "type", null, 1, 1, EDROOMDataFieldEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataDefinitionEClass, EDROOMDataDefinition.class, "EDROOMDataDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edroomDataDefinitionUnionEClass, EDROOMDataDefinitionUnion.class, "EDROOMDataDefinitionUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDROOMDataDefinitionUnion_Elements(), this.getEDROOMDataDefinitionUnionElement(), null, "elements", null, 2, -1, EDROOMDataDefinitionUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataDefinitionUnionElementEClass, EDROOMDataDefinitionUnionElement.class, "EDROOMDataDefinitionUnionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataDefinitionUnionElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, EDROOMDataDefinitionUnionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataDefinitionUnionElementBasicEClass, EDROOMDataDefinitionUnionElementBasic.class, "EDROOMDataDefinitionUnionElementBasic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataDefinitionUnionElementBasic_Type(), this.getEDROOMBasicType(), "type", null, 1, 1, EDROOMDataDefinitionUnionElementBasic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataDefinitionUnionElementClassEClass, EDROOMDataDefinitionUnionElementClass.class, "EDROOMDataDefinitionUnionElementClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDROOMDataDefinitionUnionElementClass_Type(), this.getEDROOMDataClass(), null, "type", null, 1, 1, EDROOMDataDefinitionUnionElementClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataDefinitionUnionElementBasicArrayEClass, EDROOMDataDefinitionUnionElementBasicArray.class, "EDROOMDataDefinitionUnionElementBasicArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataDefinitionUnionElementBasicArray_Elements(), ecorePackage.getEInt(), "elements", null, 1, 1, EDROOMDataDefinitionUnionElementBasicArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataDefinitionUnionElementClassArrayEClass, EDROOMDataDefinitionUnionElementClassArray.class, "EDROOMDataDefinitionUnionElementClassArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataDefinitionUnionElementClassArray_Elements(), ecorePackage.getEInt(), "elements", null, 1, 1, EDROOMDataDefinitionUnionElementClassArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataDefinitionUnionElementUnionEClass, EDROOMDataDefinitionUnionElementUnion.class, "EDROOMDataDefinitionUnionElementUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDROOMDataDefinitionUnionElementUnion_Type(), this.getEDROOMDataDefinitionUnion(), null, "type", null, 1, 1, EDROOMDataDefinitionUnionElementUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataDefinitionUnionElementUnionArrayEClass, EDROOMDataDefinitionUnionElementUnionArray.class, "EDROOMDataDefinitionUnionElementUnionArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataDefinitionUnionElementUnionArray_Elements(), ecorePackage.getEInt(), "elements", null, 1, 1, EDROOMDataDefinitionUnionElementUnionArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataDefinitionEnumEClass, EDROOMDataDefinitionEnum.class, "EDROOMDataDefinitionEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDROOMDataDefinitionEnum_Elements(), this.getEDROOMDataDefinitionEnumElement(), null, "elements", null, 1, -1, EDROOMDataDefinitionEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataDefinitionEnumElementEClass, EDROOMDataDefinitionEnumElement.class, "EDROOMDataDefinitionEnumElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataDefinitionEnumElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, EDROOMDataDefinitionEnumElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDROOMDataDefinitionEnumElement_Value(), ecorePackage.getEInt(), "value", null, 0, 1, EDROOMDataDefinitionEnumElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataDefinitionUnionElementEnumEClass, EDROOMDataDefinitionUnionElementEnum.class, "EDROOMDataDefinitionUnionElementEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDROOMDataDefinitionUnionElementEnum_Type(), this.getEDROOMDataDefinitionEnum(), null, "type", null, 1, 1, EDROOMDataDefinitionUnionElementEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomDataDefinitionUnionElementEnumArrayEClass, EDROOMDataDefinitionUnionElementEnumArray.class, "EDROOMDataDefinitionUnionElementEnumArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDROOMDataDefinitionUnionElementEnumArray_Elements(), ecorePackage.getEInt(), "elements", null, 1, 1, EDROOMDataDefinitionUnionElementEnumArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edroomdclassPackageFileEClass, EDROOMDCLASSPackageFile.class, "EDROOMDCLASSPackageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edroomdclassPackageElementEClass, EDROOMDCLASSPackageElement.class, "EDROOMDCLASSPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(edroomBasicTypeEEnum, EDROOMBasicType.class, "EDROOMBasicType");
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOM_BOOL);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOM_BYTE);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOM_WORD16);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOM_WORD32);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOM_WORD64);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOMU_INT8);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOMU_INT16);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOMU_INT32);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOMU_INT64);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOM_INT8);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOM_INT16);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOM_INT32);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOM_INT64);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOM_FLOAT);
		addEEnumLiteral(edroomBasicTypeEEnum, EDROOMBasicType.TEDROOM_DOUBLE);

		// Create resource
		createResource(eNS_URI);
	}

}
