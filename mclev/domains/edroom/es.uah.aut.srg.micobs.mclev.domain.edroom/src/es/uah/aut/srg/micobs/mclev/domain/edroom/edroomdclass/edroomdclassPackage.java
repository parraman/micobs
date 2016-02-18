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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.edroomdclassFactory
 * @model kind="package"
 * @generated
 */
public interface edroomdclassPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "edroomdclass";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/mclev/domain/edroom/edroomdclass";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs.mclev.domain.edroom";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	edroomdclassPackage eINSTANCE = es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDCLASSPackageElementImpl <em>EDROOMDCLASSPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDCLASSPackageElementImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDCLASSPackageElement()
	 * @generated
	 */
	int EDROOMDCLASS_PACKAGE_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOMDCLASS_PACKAGE_ELEMENT__VERSION = commonPackage.MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOMDCLASS_PACKAGE_ELEMENT__NAME = commonPackage.MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOMDCLASS_PACKAGE_ELEMENT__URI = commonPackage.MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>EDROOMDCLASSPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOMDCLASS_PACKAGE_ELEMENT_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataClassImpl <em>EDROOMDataClass</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataClassImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataClass()
	 * @generated
	 */
	int EDROOM_DATA_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_CLASS__VERSION = EDROOMDCLASS_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_CLASS__NAME = EDROOMDCLASS_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_CLASS__URI = EDROOMDCLASS_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_CLASS__FIELDS = EDROOMDCLASS_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_CLASS__DEFINITIONS = EDROOMDCLASS_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_CLASS__INHERITS = EDROOMDCLASS_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EDROOMDataClass</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_CLASS_FEATURE_COUNT = EDROOMDCLASS_PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldImpl <em>EDROOMDataField</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataField()
	 * @generated
	 */
	int EDROOM_DATA_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD__NAME = 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataField</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldBasicImpl <em>EDROOMDataFieldBasic</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldBasicImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldBasic()
	 * @generated
	 */
	int EDROOM_DATA_FIELD_BASIC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_BASIC__NAME = EDROOM_DATA_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_BASIC__TYPE = EDROOM_DATA_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataFieldBasic</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_BASIC_FEATURE_COUNT = EDROOM_DATA_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldBasicArrayImpl <em>EDROOMDataFieldBasicArray</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldBasicArrayImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldBasicArray()
	 * @generated
	 */
	int EDROOM_DATA_FIELD_BASIC_ARRAY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_BASIC_ARRAY__NAME = EDROOM_DATA_FIELD_BASIC__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_BASIC_ARRAY__TYPE = EDROOM_DATA_FIELD_BASIC__TYPE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_BASIC_ARRAY__ELEMENTS = EDROOM_DATA_FIELD_BASIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataFieldBasicArray</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_BASIC_ARRAY_FEATURE_COUNT = EDROOM_DATA_FIELD_BASIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldClassImpl <em>EDROOMDataFieldClass</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldClassImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldClass()
	 * @generated
	 */
	int EDROOM_DATA_FIELD_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_CLASS__NAME = EDROOM_DATA_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_CLASS__TYPE = EDROOM_DATA_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataFieldClass</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_CLASS_FEATURE_COUNT = EDROOM_DATA_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldClassArrayImpl <em>EDROOMDataFieldClassArray</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldClassArrayImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldClassArray()
	 * @generated
	 */
	int EDROOM_DATA_FIELD_CLASS_ARRAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_CLASS_ARRAY__NAME = EDROOM_DATA_FIELD_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_CLASS_ARRAY__TYPE = EDROOM_DATA_FIELD_CLASS__TYPE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_CLASS_ARRAY__ELEMENTS = EDROOM_DATA_FIELD_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataFieldClassArray</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_CLASS_ARRAY_FEATURE_COUNT = EDROOM_DATA_FIELD_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldUnionImpl <em>EDROOMDataFieldUnion</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldUnionImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldUnion()
	 * @generated
	 */
	int EDROOM_DATA_FIELD_UNION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_UNION__NAME = EDROOM_DATA_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_UNION__TYPE = EDROOM_DATA_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataFieldUnion</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_UNION_FEATURE_COUNT = EDROOM_DATA_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldUnionArrayImpl <em>EDROOMDataFieldUnionArray</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldUnionArrayImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldUnionArray()
	 * @generated
	 */
	int EDROOM_DATA_FIELD_UNION_ARRAY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_UNION_ARRAY__NAME = EDROOM_DATA_FIELD_UNION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_UNION_ARRAY__TYPE = EDROOM_DATA_FIELD_UNION__TYPE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_UNION_ARRAY__ELEMENTS = EDROOM_DATA_FIELD_UNION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataFieldUnionArray</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_UNION_ARRAY_FEATURE_COUNT = EDROOM_DATA_FIELD_UNION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldEnumImpl <em>EDROOMDataFieldEnum</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldEnumImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldEnum()
	 * @generated
	 */
	int EDROOM_DATA_FIELD_ENUM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_ENUM__NAME = EDROOM_DATA_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_ENUM__TYPE = EDROOM_DATA_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataFieldEnum</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_ENUM_FEATURE_COUNT = EDROOM_DATA_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldEnumArrayImpl <em>EDROOMDataFieldEnumArray</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldEnumArrayImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldEnumArray()
	 * @generated
	 */
	int EDROOM_DATA_FIELD_ENUM_ARRAY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_ENUM_ARRAY__NAME = EDROOM_DATA_FIELD_ENUM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_ENUM_ARRAY__TYPE = EDROOM_DATA_FIELD_ENUM__TYPE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_ENUM_ARRAY__ELEMENTS = EDROOM_DATA_FIELD_ENUM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataFieldEnumArray</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_FIELD_ENUM_ARRAY_FEATURE_COUNT = EDROOM_DATA_FIELD_ENUM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionImpl <em>EDROOMDataDefinition</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinition()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION__NAME = commonPackage.MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinition</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_FEATURE_COUNT = commonPackage.MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionImpl <em>EDROOMDataDefinitionUnion</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnion()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION_UNION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION__NAME = EDROOM_DATA_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION__ELEMENTS = EDROOM_DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinitionUnion</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_FEATURE_COUNT = EDROOM_DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementImpl <em>EDROOMDataDefinitionUnionElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElement()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinitionUnionElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementBasicImpl <em>EDROOMDataDefinitionUnionElementBasic</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementBasicImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementBasic()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC__NAME = EDROOM_DATA_DEFINITION_UNION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC__TYPE = EDROOM_DATA_DEFINITION_UNION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinitionUnionElementBasic</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_FEATURE_COUNT = EDROOM_DATA_DEFINITION_UNION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementClassImpl <em>EDROOMDataDefinitionUnionElementClass</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementClassImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementClass()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS__NAME = EDROOM_DATA_DEFINITION_UNION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS__TYPE = EDROOM_DATA_DEFINITION_UNION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinitionUnionElementClass</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_FEATURE_COUNT = EDROOM_DATA_DEFINITION_UNION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementBasicArrayImpl <em>EDROOMDataDefinitionUnionElementBasicArray</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementBasicArrayImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementBasicArray()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_ARRAY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_ARRAY__NAME = EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_ARRAY__TYPE = EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC__TYPE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_ARRAY__ELEMENTS = EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinitionUnionElementBasicArray</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_ARRAY_FEATURE_COUNT = EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementClassArrayImpl <em>EDROOMDataDefinitionUnionElementClassArray</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementClassArrayImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementClassArray()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_ARRAY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_ARRAY__NAME = EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_ARRAY__TYPE = EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS__TYPE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_ARRAY__ELEMENTS = EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinitionUnionElementClassArray</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_ARRAY_FEATURE_COUNT = EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementUnionImpl <em>EDROOMDataDefinitionUnionElementUnion</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementUnionImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementUnion()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION__NAME = EDROOM_DATA_DEFINITION_UNION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION__TYPE = EDROOM_DATA_DEFINITION_UNION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinitionUnionElementUnion</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_FEATURE_COUNT = EDROOM_DATA_DEFINITION_UNION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementUnionArrayImpl <em>EDROOMDataDefinitionUnionElementUnionArray</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementUnionArrayImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementUnionArray()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_ARRAY = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_ARRAY__NAME = EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_ARRAY__TYPE = EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION__TYPE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_ARRAY__ELEMENTS = EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinitionUnionElementUnionArray</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_ARRAY_FEATURE_COUNT = EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionEnumImpl <em>EDROOMDataDefinitionEnum</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionEnumImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionEnum()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION_ENUM = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_ENUM__NAME = EDROOM_DATA_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_ENUM__ELEMENTS = EDROOM_DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinitionEnum</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_ENUM_FEATURE_COUNT = EDROOM_DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionEnumElementImpl <em>EDROOMDataDefinitionEnumElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionEnumElementImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionEnumElement()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION_ENUM_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_ENUM_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_ENUM_ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinitionEnumElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_ENUM_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementEnumImpl <em>EDROOMDataDefinitionUnionElementEnum</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementEnumImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementEnum()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM__NAME = EDROOM_DATA_DEFINITION_UNION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM__TYPE = EDROOM_DATA_DEFINITION_UNION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinitionUnionElementEnum</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_FEATURE_COUNT = EDROOM_DATA_DEFINITION_UNION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementEnumArrayImpl <em>EDROOMDataDefinitionUnionElementEnumArray</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementEnumArrayImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementEnumArray()
	 * @generated
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY__NAME = EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY__TYPE = EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM__TYPE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY__ELEMENTS = EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDROOMDataDefinitionUnionElementEnumArray</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY_FEATURE_COUNT = EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDCLASSPackageFileImpl <em>EDROOMDCLASSPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDCLASSPackageFileImpl
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDCLASSPackageFile()
	 * @generated
	 */
	int EDROOMDCLASS_PACKAGE_FILE = 23;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int EDROOMDCLASS_PACKAGE_FILE__PACKAGE = commonPackage.MCOMMON_PACKAGE_FILE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int EDROOMDCLASS_PACKAGE_FILE__IMPORTS = commonPackage.MCOMMON_PACKAGE_FILE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int EDROOMDCLASS_PACKAGE_FILE__ELEMENT = commonPackage.MCOMMON_PACKAGE_FILE__ELEMENT;

	/**
	 * The number of structural features of the '<em>EDROOMDCLASSPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int EDROOMDCLASS_PACKAGE_FILE_FEATURE_COUNT = commonPackage.MCOMMON_PACKAGE_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMBasicType <em>EDROOMBasicType</em>}' enum.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMBasicType
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMBasicType()
	 * @generated
	 */
	int EDROOM_BASIC_TYPE = 25;

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass <em>EDROOMDataClass</em>}'.
	 * @return the meta object for class '<em>EDROOMDataClass</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass
	 * @generated
	 */
	EClass getEDROOMDataClass();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass#getFields <em>Fields</em>}'.
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass#getFields()
	 * @see #getEDROOMDataClass()
	 * @generated
	 */
	EReference getEDROOMDataClass_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass#getDefinitions <em>Definitions</em>}'.
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass#getDefinitions()
	 * @see #getEDROOMDataClass()
	 * @generated
	 */
	EReference getEDROOMDataClass_Definitions();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass#getInherits <em>Inherits</em>}'.
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataClass#getInherits()
	 * @see #getEDROOMDataClass()
	 * @generated
	 */
	EReference getEDROOMDataClass_Inherits();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataField <em>EDROOMDataField</em>}'.
	 * @return the meta object for class '<em>EDROOMDataField</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataField
	 * @generated
	 */
	EClass getEDROOMDataField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataField#getName <em>Name</em>}'.
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataField#getName()
	 * @see #getEDROOMDataField()
	 * @generated
	 */
	EAttribute getEDROOMDataField_Name();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasic <em>EDROOMDataFieldBasic</em>}'.
	 * @return the meta object for class '<em>EDROOMDataFieldBasic</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasic
	 * @generated
	 */
	EClass getEDROOMDataFieldBasic();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasic#getType <em>Type</em>}'.
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasic#getType()
	 * @see #getEDROOMDataFieldBasic()
	 * @generated
	 */
	EAttribute getEDROOMDataFieldBasic_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasicArray <em>EDROOMDataFieldBasicArray</em>}'.
	 * @return the meta object for class '<em>EDROOMDataFieldBasicArray</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasicArray
	 * @generated
	 */
	EClass getEDROOMDataFieldBasicArray();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasicArray#getElements <em>Elements</em>}'.
	 * @return the meta object for the attribute '<em>Elements</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldBasicArray#getElements()
	 * @see #getEDROOMDataFieldBasicArray()
	 * @generated
	 */
	EAttribute getEDROOMDataFieldBasicArray_Elements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClass <em>EDROOMDataFieldClass</em>}'.
	 * @return the meta object for class '<em>EDROOMDataFieldClass</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClass
	 * @generated
	 */
	EClass getEDROOMDataFieldClass();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClass#getType <em>Type</em>}'.
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClass#getType()
	 * @see #getEDROOMDataFieldClass()
	 * @generated
	 */
	EReference getEDROOMDataFieldClass_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClassArray <em>EDROOMDataFieldClassArray</em>}'.
	 * @return the meta object for class '<em>EDROOMDataFieldClassArray</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClassArray
	 * @generated
	 */
	EClass getEDROOMDataFieldClassArray();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClassArray#getElements <em>Elements</em>}'.
	 * @return the meta object for the attribute '<em>Elements</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldClassArray#getElements()
	 * @see #getEDROOMDataFieldClassArray()
	 * @generated
	 */
	EAttribute getEDROOMDataFieldClassArray_Elements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnionArray <em>EDROOMDataFieldUnionArray</em>}'.
	 * @return the meta object for class '<em>EDROOMDataFieldUnionArray</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnionArray
	 * @generated
	 */
	EClass getEDROOMDataFieldUnionArray();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnionArray#getElements <em>Elements</em>}'.
	 * @return the meta object for the attribute '<em>Elements</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnionArray#getElements()
	 * @see #getEDROOMDataFieldUnionArray()
	 * @generated
	 */
	EAttribute getEDROOMDataFieldUnionArray_Elements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnion <em>EDROOMDataFieldUnion</em>}'.
	 * @return the meta object for class '<em>EDROOMDataFieldUnion</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnion
	 * @generated
	 */
	EClass getEDROOMDataFieldUnion();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnion#getType <em>Type</em>}'.
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldUnion#getType()
	 * @see #getEDROOMDataFieldUnion()
	 * @generated
	 */
	EReference getEDROOMDataFieldUnion_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnumArray <em>EDROOMDataFieldEnumArray</em>}'.
	 * @return the meta object for class '<em>EDROOMDataFieldEnumArray</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnumArray
	 * @generated
	 */
	EClass getEDROOMDataFieldEnumArray();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnumArray#getElements <em>Elements</em>}'.
	 * @return the meta object for the attribute '<em>Elements</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnumArray#getElements()
	 * @see #getEDROOMDataFieldEnumArray()
	 * @generated
	 */
	EAttribute getEDROOMDataFieldEnumArray_Elements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnum <em>EDROOMDataFieldEnum</em>}'.
	 * @return the meta object for class '<em>EDROOMDataFieldEnum</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnum
	 * @generated
	 */
	EClass getEDROOMDataFieldEnum();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnum#getType <em>Type</em>}'.
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataFieldEnum#getType()
	 * @see #getEDROOMDataFieldEnum()
	 * @generated
	 */
	EReference getEDROOMDataFieldEnum_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinition <em>EDROOMDataDefinition</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinition</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinition
	 * @generated
	 */
	EClass getEDROOMDataDefinition();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnion <em>EDROOMDataDefinitionUnion</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinitionUnion</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnion
	 * @generated
	 */
	EClass getEDROOMDataDefinitionUnion();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnion#getElements <em>Elements</em>}'.
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnion#getElements()
	 * @see #getEDROOMDataDefinitionUnion()
	 * @generated
	 */
	EReference getEDROOMDataDefinitionUnion_Elements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElement <em>EDROOMDataDefinitionUnionElement</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinitionUnionElement</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElement
	 * @generated
	 */
	EClass getEDROOMDataDefinitionUnionElement();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElement#getName <em>Name</em>}'.
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElement#getName()
	 * @see #getEDROOMDataDefinitionUnionElement()
	 * @generated
	 */
	EAttribute getEDROOMDataDefinitionUnionElement_Name();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasic <em>EDROOMDataDefinitionUnionElementBasic</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinitionUnionElementBasic</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasic
	 * @generated
	 */
	EClass getEDROOMDataDefinitionUnionElementBasic();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasic#getType <em>Type</em>}'.
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasic#getType()
	 * @see #getEDROOMDataDefinitionUnionElementBasic()
	 * @generated
	 */
	EAttribute getEDROOMDataDefinitionUnionElementBasic_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClass <em>EDROOMDataDefinitionUnionElementClass</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinitionUnionElementClass</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClass
	 * @generated
	 */
	EClass getEDROOMDataDefinitionUnionElementClass();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClass#getType <em>Type</em>}'.
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClass#getType()
	 * @see #getEDROOMDataDefinitionUnionElementClass()
	 * @generated
	 */
	EReference getEDROOMDataDefinitionUnionElementClass_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasicArray <em>EDROOMDataDefinitionUnionElementBasicArray</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinitionUnionElementBasicArray</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasicArray
	 * @generated
	 */
	EClass getEDROOMDataDefinitionUnionElementBasicArray();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasicArray#getElements <em>Elements</em>}'.
	 * @return the meta object for the attribute '<em>Elements</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementBasicArray#getElements()
	 * @see #getEDROOMDataDefinitionUnionElementBasicArray()
	 * @generated
	 */
	EAttribute getEDROOMDataDefinitionUnionElementBasicArray_Elements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClassArray <em>EDROOMDataDefinitionUnionElementClassArray</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinitionUnionElementClassArray</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClassArray
	 * @generated
	 */
	EClass getEDROOMDataDefinitionUnionElementClassArray();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClassArray#getElements <em>Elements</em>}'.
	 * @return the meta object for the attribute '<em>Elements</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementClassArray#getElements()
	 * @see #getEDROOMDataDefinitionUnionElementClassArray()
	 * @generated
	 */
	EAttribute getEDROOMDataDefinitionUnionElementClassArray_Elements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnion <em>EDROOMDataDefinitionUnionElementUnion</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinitionUnionElementUnion</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnion
	 * @generated
	 */
	EClass getEDROOMDataDefinitionUnionElementUnion();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnion#getType <em>Type</em>}'.
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnion#getType()
	 * @see #getEDROOMDataDefinitionUnionElementUnion()
	 * @generated
	 */
	EReference getEDROOMDataDefinitionUnionElementUnion_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnionArray <em>EDROOMDataDefinitionUnionElementUnionArray</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinitionUnionElementUnionArray</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnionArray
	 * @generated
	 */
	EClass getEDROOMDataDefinitionUnionElementUnionArray();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnionArray#getElements <em>Elements</em>}'.
	 * @return the meta object for the attribute '<em>Elements</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementUnionArray#getElements()
	 * @see #getEDROOMDataDefinitionUnionElementUnionArray()
	 * @generated
	 */
	EAttribute getEDROOMDataDefinitionUnionElementUnionArray_Elements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnum <em>EDROOMDataDefinitionEnum</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinitionEnum</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnum
	 * @generated
	 */
	EClass getEDROOMDataDefinitionEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnum#getElements <em>Elements</em>}'.
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnum#getElements()
	 * @see #getEDROOMDataDefinitionEnum()
	 * @generated
	 */
	EReference getEDROOMDataDefinitionEnum_Elements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement <em>EDROOMDataDefinitionEnumElement</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinitionEnumElement</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement
	 * @generated
	 */
	EClass getEDROOMDataDefinitionEnumElement();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement#getName <em>Name</em>}'.
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement#getName()
	 * @see #getEDROOMDataDefinitionEnumElement()
	 * @generated
	 */
	EAttribute getEDROOMDataDefinitionEnumElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement#getValue <em>Value</em>}'.
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionEnumElement#getValue()
	 * @see #getEDROOMDataDefinitionEnumElement()
	 * @generated
	 */
	EAttribute getEDROOMDataDefinitionEnumElement_Value();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnum <em>EDROOMDataDefinitionUnionElementEnum</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinitionUnionElementEnum</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnum
	 * @generated
	 */
	EClass getEDROOMDataDefinitionUnionElementEnum();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnum#getType <em>Type</em>}'.
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnum#getType()
	 * @see #getEDROOMDataDefinitionUnionElementEnum()
	 * @generated
	 */
	EReference getEDROOMDataDefinitionUnionElementEnum_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnumArray <em>EDROOMDataDefinitionUnionElementEnumArray</em>}'.
	 * @return the meta object for class '<em>EDROOMDataDefinitionUnionElementEnumArray</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnumArray
	 * @generated
	 */
	EClass getEDROOMDataDefinitionUnionElementEnumArray();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnumArray#getElements <em>Elements</em>}'.
	 * @return the meta object for the attribute '<em>Elements</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDataDefinitionUnionElementEnumArray#getElements()
	 * @see #getEDROOMDataDefinitionUnionElementEnumArray()
	 * @generated
	 */
	EAttribute getEDROOMDataDefinitionUnionElementEnumArray_Elements();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageFile <em>EDROOMDCLASSPackageFile</em>}'.
	 * @return the meta object for class '<em>EDROOMDCLASSPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageFile
	 * @generated
	 */
	EClass getEDROOMDCLASSPackageFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageElement <em>EDROOMDCLASSPackageElement</em>}'.
	 * @return the meta object for class '<em>EDROOMDCLASSPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMDCLASSPackageElement
	 * @generated
	 */
	EClass getEDROOMDCLASSPackageElement();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMBasicType <em>EDROOMBasicType</em>}'.
	 * @return the meta object for enum '<em>EDROOMBasicType</em>'.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMBasicType
	 * @generated
	 */
	EEnum getEDROOMBasicType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	edroomdclassFactory getedroomdclassFactory();

	/**
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataClassImpl <em>EDROOMDataClass</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataClassImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataClass()
		 * @generated
		 */
		EClass EDROOM_DATA_CLASS = eINSTANCE.getEDROOMDataClass();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference EDROOM_DATA_CLASS__FIELDS = eINSTANCE.getEDROOMDataClass_Fields();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference EDROOM_DATA_CLASS__DEFINITIONS = eINSTANCE.getEDROOMDataClass_Definitions();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * @generated
		 */
		EReference EDROOM_DATA_CLASS__INHERITS = eINSTANCE.getEDROOMDataClass_Inherits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldImpl <em>EDROOMDataField</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataField()
		 * @generated
		 */
		EClass EDROOM_DATA_FIELD = eINSTANCE.getEDROOMDataField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_FIELD__NAME = eINSTANCE.getEDROOMDataField_Name();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldBasicImpl <em>EDROOMDataFieldBasic</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldBasicImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldBasic()
		 * @generated
		 */
		EClass EDROOM_DATA_FIELD_BASIC = eINSTANCE.getEDROOMDataFieldBasic();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_FIELD_BASIC__TYPE = eINSTANCE.getEDROOMDataFieldBasic_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldBasicArrayImpl <em>EDROOMDataFieldBasicArray</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldBasicArrayImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldBasicArray()
		 * @generated
		 */
		EClass EDROOM_DATA_FIELD_BASIC_ARRAY = eINSTANCE.getEDROOMDataFieldBasicArray();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_FIELD_BASIC_ARRAY__ELEMENTS = eINSTANCE.getEDROOMDataFieldBasicArray_Elements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldClassImpl <em>EDROOMDataFieldClass</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldClassImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldClass()
		 * @generated
		 */
		EClass EDROOM_DATA_FIELD_CLASS = eINSTANCE.getEDROOMDataFieldClass();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * @generated
		 */
		EReference EDROOM_DATA_FIELD_CLASS__TYPE = eINSTANCE.getEDROOMDataFieldClass_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldClassArrayImpl <em>EDROOMDataFieldClassArray</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldClassArrayImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldClassArray()
		 * @generated
		 */
		EClass EDROOM_DATA_FIELD_CLASS_ARRAY = eINSTANCE.getEDROOMDataFieldClassArray();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_FIELD_CLASS_ARRAY__ELEMENTS = eINSTANCE.getEDROOMDataFieldClassArray_Elements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldUnionArrayImpl <em>EDROOMDataFieldUnionArray</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldUnionArrayImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldUnionArray()
		 * @generated
		 */
		EClass EDROOM_DATA_FIELD_UNION_ARRAY = eINSTANCE.getEDROOMDataFieldUnionArray();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_FIELD_UNION_ARRAY__ELEMENTS = eINSTANCE.getEDROOMDataFieldUnionArray_Elements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldUnionImpl <em>EDROOMDataFieldUnion</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldUnionImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldUnion()
		 * @generated
		 */
		EClass EDROOM_DATA_FIELD_UNION = eINSTANCE.getEDROOMDataFieldUnion();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * @generated
		 */
		EReference EDROOM_DATA_FIELD_UNION__TYPE = eINSTANCE.getEDROOMDataFieldUnion_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldEnumArrayImpl <em>EDROOMDataFieldEnumArray</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldEnumArrayImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldEnumArray()
		 * @generated
		 */
		EClass EDROOM_DATA_FIELD_ENUM_ARRAY = eINSTANCE.getEDROOMDataFieldEnumArray();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_FIELD_ENUM_ARRAY__ELEMENTS = eINSTANCE.getEDROOMDataFieldEnumArray_Elements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldEnumImpl <em>EDROOMDataFieldEnum</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataFieldEnumImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataFieldEnum()
		 * @generated
		 */
		EClass EDROOM_DATA_FIELD_ENUM = eINSTANCE.getEDROOMDataFieldEnum();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * @generated
		 */
		EReference EDROOM_DATA_FIELD_ENUM__TYPE = eINSTANCE.getEDROOMDataFieldEnum_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionImpl <em>EDROOMDataDefinition</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinition()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION = eINSTANCE.getEDROOMDataDefinition();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionImpl <em>EDROOMDataDefinitionUnion</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnion()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION_UNION = eINSTANCE.getEDROOMDataDefinitionUnion();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference EDROOM_DATA_DEFINITION_UNION__ELEMENTS = eINSTANCE.getEDROOMDataDefinitionUnion_Elements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementImpl <em>EDROOMDataDefinitionUnionElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElement()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION_UNION_ELEMENT = eINSTANCE.getEDROOMDataDefinitionUnionElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_DEFINITION_UNION_ELEMENT__NAME = eINSTANCE.getEDROOMDataDefinitionUnionElement_Name();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementBasicImpl <em>EDROOMDataDefinitionUnionElementBasic</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementBasicImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementBasic()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC = eINSTANCE.getEDROOMDataDefinitionUnionElementBasic();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC__TYPE = eINSTANCE.getEDROOMDataDefinitionUnionElementBasic_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementClassImpl <em>EDROOMDataDefinitionUnionElementClass</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementClassImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementClass()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS = eINSTANCE.getEDROOMDataDefinitionUnionElementClass();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * @generated
		 */
		EReference EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS__TYPE = eINSTANCE.getEDROOMDataDefinitionUnionElementClass_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementBasicArrayImpl <em>EDROOMDataDefinitionUnionElementBasicArray</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementBasicArrayImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementBasicArray()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_ARRAY = eINSTANCE.getEDROOMDataDefinitionUnionElementBasicArray();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_DEFINITION_UNION_ELEMENT_BASIC_ARRAY__ELEMENTS = eINSTANCE.getEDROOMDataDefinitionUnionElementBasicArray_Elements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementClassArrayImpl <em>EDROOMDataDefinitionUnionElementClassArray</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementClassArrayImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementClassArray()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_ARRAY = eINSTANCE.getEDROOMDataDefinitionUnionElementClassArray();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_DEFINITION_UNION_ELEMENT_CLASS_ARRAY__ELEMENTS = eINSTANCE.getEDROOMDataDefinitionUnionElementClassArray_Elements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementUnionImpl <em>EDROOMDataDefinitionUnionElementUnion</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementUnionImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementUnion()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION = eINSTANCE.getEDROOMDataDefinitionUnionElementUnion();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * @generated
		 */
		EReference EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION__TYPE = eINSTANCE.getEDROOMDataDefinitionUnionElementUnion_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementUnionArrayImpl <em>EDROOMDataDefinitionUnionElementUnionArray</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementUnionArrayImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementUnionArray()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_ARRAY = eINSTANCE.getEDROOMDataDefinitionUnionElementUnionArray();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_DEFINITION_UNION_ELEMENT_UNION_ARRAY__ELEMENTS = eINSTANCE.getEDROOMDataDefinitionUnionElementUnionArray_Elements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionEnumImpl <em>EDROOMDataDefinitionEnum</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionEnumImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionEnum()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION_ENUM = eINSTANCE.getEDROOMDataDefinitionEnum();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference EDROOM_DATA_DEFINITION_ENUM__ELEMENTS = eINSTANCE.getEDROOMDataDefinitionEnum_Elements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionEnumElementImpl <em>EDROOMDataDefinitionEnumElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionEnumElementImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionEnumElement()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION_ENUM_ELEMENT = eINSTANCE.getEDROOMDataDefinitionEnumElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_DEFINITION_ENUM_ELEMENT__NAME = eINSTANCE.getEDROOMDataDefinitionEnumElement_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_DEFINITION_ENUM_ELEMENT__VALUE = eINSTANCE.getEDROOMDataDefinitionEnumElement_Value();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementEnumImpl <em>EDROOMDataDefinitionUnionElementEnum</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementEnumImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementEnum()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM = eINSTANCE.getEDROOMDataDefinitionUnionElementEnum();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * @generated
		 */
		EReference EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM__TYPE = eINSTANCE.getEDROOMDataDefinitionUnionElementEnum_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementEnumArrayImpl <em>EDROOMDataDefinitionUnionElementEnumArray</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDataDefinitionUnionElementEnumArrayImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDataDefinitionUnionElementEnumArray()
		 * @generated
		 */
		EClass EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY = eINSTANCE.getEDROOMDataDefinitionUnionElementEnumArray();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute EDROOM_DATA_DEFINITION_UNION_ELEMENT_ENUM_ARRAY__ELEMENTS = eINSTANCE.getEDROOMDataDefinitionUnionElementEnumArray_Elements();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDCLASSPackageFileImpl <em>EDROOMDCLASSPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDCLASSPackageFileImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDCLASSPackageFile()
		 * @generated
		 */
		EClass EDROOMDCLASS_PACKAGE_FILE = eINSTANCE.getEDROOMDCLASSPackageFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDCLASSPackageElementImpl <em>EDROOMDCLASSPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.EDROOMDCLASSPackageElementImpl
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMDCLASSPackageElement()
		 * @generated
		 */
		EClass EDROOMDCLASS_PACKAGE_ELEMENT = eINSTANCE.getEDROOMDCLASSPackageElement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMBasicType <em>EDROOMBasicType</em>}' enum.
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.EDROOMBasicType
		 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomdclass.impl.edroomdclassPackageImpl#getEDROOMBasicType()
		 * @generated
		 */
		EEnum EDROOM_BASIC_TYPE = eINSTANCE.getEDROOMBasicType();

	}

}
