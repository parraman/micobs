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
package es.uah.aut.srg.micobs.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * The <b>Package</b> for the common classes of the MICOBS model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * @see es.uah.aut.srg.micobs.common.commonFactory
 * @model kind="package"
 * @generated
 */
public interface commonPackage extends EPackage {
	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/micobs/common";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "micobs";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	commonPackage eINSTANCE = es.uah.aut.srg.micobs.common.impl.commonPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageImpl <em>MCommonPackage</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackage()
	 * @generated
	 */
	int MCOMMON_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE__URI = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE__ITEMS = 1;

	/**
	 * The number of structural features of the '<em>MCommonPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MCommonPackage</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageFileImpl <em>MCommonPackageFile</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageFileImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackageFile()
	 * @generated
	 */
	int MCOMMON_PACKAGE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_FILE__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_FILE__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_FILE__ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>MCommonPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_FILE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>MCommonPackageFile</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageElementImpl <em>MCommonPackageElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageElementImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackageElement()
	 * @generated
	 */
	int MCOMMON_PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_ELEMENT__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_ELEMENT__URI = 2;

	/**
	 * The number of structural features of the '<em>MCommonPackageElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>MCommon Package Element</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageItemImpl <em>MCommonPackageItem</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageItemImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackageItem()
	 * @generated
	 */
	int MCOMMON_PACKAGE_ITEM = 3;

	/**
	 * The feature id for the '<em><b>VersionedItems</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_ITEM__URI = 1;

	/**
	 * The number of structural features of the '<em>MCommonPackageItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MCommonPackageItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageVersionedItemImpl <em>MCommonPackageVersionedItem</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageVersionedItemImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackageVersionedItem()
	 * @generated
	 */
	int MCOMMON_PACKAGE_VERSIONED_ITEM = 4;

	/**
	 * The feature id for the '<em><b>LocalModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI = 0;

	/**
	 * The feature id for the '<em><b>RemoteModelURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI = 1;

	/**
	 * The feature id for the '<em><b>RepositoryFolderURI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION = 3;

	/**
	 * The number of structural features of the '<em>MCommonPackageVersionedItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_VERSIONED_ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>MCommonPackageVersionedItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_VERSIONED_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonLibraryImpl <em>MCommonLibrary</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MCommonLibraryImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonLibrary()
	 * @generated
	 */
	int MCOMMON_LIBRARY = 5;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_LIBRARY__PACKAGES = 0;

	/**
	 * The number of structural features of the '<em>MCommonLibrary</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>MCommon Library</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageReferencingElementImpl <em>MCommonPackageReferencingElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageReferencingElementImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackageReferencingElement()
	 * @generated
	 */
	int MCOMMON_PACKAGE_REFERENCING_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_REFERENCING_ELEMENT__VERSION = MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_REFERENCING_ELEMENT__NAME = MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_REFERENCING_ELEMENT__URI = MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>ReferencedElement</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT = MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MCommonPackageReferencingElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_REFERENCING_ELEMENT_FEATURE_COUNT = MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MCommon Package Referencing Element</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_REFERENCING_ELEMENT_OPERATION_COUNT = MCOMMON_PACKAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageParametricReferencingElementImpl <em>MCommonPackageParametricReferencingElement</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageParametricReferencingElementImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackageParametricReferencingElement()
	 * @generated
	 */
	int MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__VERSION = MCOMMON_PACKAGE_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__NAME = MCOMMON_PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__URI = MCOMMON_PACKAGE_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>ReferencedElement</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__REFERENCED_ELEMENT = MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ParameterElement</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__PARAMETER_ELEMENT = MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MCommonPackageParametricReferencingElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT_FEATURE_COUNT = MCOMMON_PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MCommonPackageParametricReferencingElement</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT_OPERATION_COUNT = MCOMMON_PACKAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl <em>MCommonReferenceableObj</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonReferenceableObj()
	 * @generated
	 */
	int MCOMMON_REFERENCEABLE_OBJ = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_REFERENCEABLE_OBJ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>MCommonReferenceableObj</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT = 2;


	/**
	 * The number of operations of the '<em>MCommonReferenceableObj</em>' class.
	 * @generated
	 * @ordered
	 */
	int MCOMMON_REFERENCEABLE_OBJ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterImpl <em>MParameter</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameter()
	 * @generated
	 */
	int MPARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER__NAME = MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER__DESCRIPTION = MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER__CONSTANT = MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameter</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_FEATURE_COUNT = MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MParameter</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OPERATION_COUNT = MCOMMON_REFERENCEABLE_OBJ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterDefaultValueSingleExpressionImpl <em>MParameterDefaultValueSingleExpression</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterDefaultValueSingleExpressionImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterDefaultValueSingleExpression()
	 * @generated
	 */
	int MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION__NAME = MPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION__DESCRIPTION = MPARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION__CONSTANT = MPARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION__DEFAULT_VALUE = MPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameterDefaultValueSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION_FEATURE_COUNT = MPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MParameterDefaultValueSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION_OPERATION_COUNT = MPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParameterDefinitionImpl <em>MEnumParameterDefinition</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MEnumParameterDefinitionImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParameterDefinition()
	 * @generated
	 */
	int MENUM_PARAMETER_DEFINITION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_DEFINITION__NAME = MPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_DEFINITION__DESCRIPTION = MPARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_DEFINITION__CONSTANT = MPARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_DEFINITION__LITERALS = MPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MEnumParameterDefinition</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_DEFINITION_FEATURE_COUNT = MPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MEnum Parameter Definition</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_DEFINITION_OPERATION_COUNT = MPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MBooleanParameterImpl <em>MBooleanParameter</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MBooleanParameterImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMBooleanParameter()
	 * @generated
	 */
	int MBOOLEAN_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAMETER__NAME = MPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAMETER__DESCRIPTION = MPARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAMETER__CONSTANT = MPARAMETER__CONSTANT;

	/**
	 * The number of structural features of the '<em>MBooleanParameter</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAMETER_FEATURE_COUNT = MPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBoolean Parameter</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAMETER_OPERATION_COUNT = MPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MBooleanParameterSingleExpressionImpl <em>MBooleanParameterSingleExpression</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MBooleanParameterSingleExpressionImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMBooleanParameterSingleExpression()
	 * @generated
	 */
	int MBOOLEAN_PARAMETER_SINGLE_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAMETER_SINGLE_EXPRESSION__NAME = MBOOLEAN_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAMETER_SINGLE_EXPRESSION__DESCRIPTION = MBOOLEAN_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAMETER_SINGLE_EXPRESSION__CONSTANT = MBOOLEAN_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE = MBOOLEAN_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MBooleanParameterSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAMETER_SINGLE_EXPRESSION_FEATURE_COUNT = MBOOLEAN_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MBooleanParameterSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MBOOLEAN_PARAMETER_SINGLE_EXPRESSION_OPERATION_COUNT = MBOOLEAN_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MStringParameterImpl <em>MStringParameter</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MStringParameterImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMStringParameter()
	 * @generated
	 */
	int MSTRING_PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAMETER__NAME = MPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAMETER__DESCRIPTION = MPARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAMETER__CONSTANT = MPARAMETER__CONSTANT;

	/**
	 * The number of structural features of the '<em>MStringParameter</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAMETER_FEATURE_COUNT = MPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MString Parameter</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAMETER_OPERATION_COUNT = MPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MStringParameterSingleExpressionImpl <em>MStringParameterSingleExpression</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MStringParameterSingleExpressionImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMStringParameterSingleExpression()
	 * @generated
	 */
	int MSTRING_PARAMETER_SINGLE_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAMETER_SINGLE_EXPRESSION__NAME = MSTRING_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAMETER_SINGLE_EXPRESSION__DESCRIPTION = MSTRING_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAMETER_SINGLE_EXPRESSION__CONSTANT = MSTRING_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE = MSTRING_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MStringParameterSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAMETER_SINGLE_EXPRESSION_FEATURE_COUNT = MSTRING_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MStringParameterSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MSTRING_PARAMETER_SINGLE_EXPRESSION_OPERATION_COUNT = MSTRING_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MIntegerParameterImpl <em>MIntegerParameter</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MIntegerParameterImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMIntegerParameter()
	 * @generated
	 */
	int MINTEGER_PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAMETER__NAME = MPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAMETER__DESCRIPTION = MPARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAMETER__CONSTANT = MPARAMETER__CONSTANT;

	/**
	 * The number of structural features of the '<em>MIntegerParameter</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAMETER_FEATURE_COUNT = MPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MInteger Parameter</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAMETER_OPERATION_COUNT = MPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MIntegerParameterSingleExpressionImpl <em>MIntegerParameterSingleExpression</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MIntegerParameterSingleExpressionImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMIntegerParameterSingleExpression()
	 * @generated
	 */
	int MINTEGER_PARAMETER_SINGLE_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAMETER_SINGLE_EXPRESSION__NAME = MINTEGER_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAMETER_SINGLE_EXPRESSION__DESCRIPTION = MINTEGER_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAMETER_SINGLE_EXPRESSION__CONSTANT = MINTEGER_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE = MINTEGER_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAMETER_SINGLE_EXPRESSION__RANGE = MINTEGER_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MIntegerParameterSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAMETER_SINGLE_EXPRESSION_FEATURE_COUNT = MINTEGER_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MIntegerParameterSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MINTEGER_PARAMETER_SINGLE_EXPRESSION_OPERATION_COUNT = MINTEGER_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParameterImpl <em>MEnumParameter</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MEnumParameterImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParameter()
	 * @generated
	 */
	int MENUM_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER__NAME = MPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER__DESCRIPTION = MPARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER__CONSTANT = MPARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>EnumDefinition</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER__ENUM_DEFINITION = MPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MEnumParameter</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_FEATURE_COUNT = MPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MEnum Parameter</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_OPERATION_COUNT = MPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParameterSingleExpressionImpl <em>MEnumParameterSingleExpression</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MEnumParameterSingleExpressionImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParameterSingleExpression()
	 * @generated
	 */
	int MENUM_PARAMETER_SINGLE_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_SINGLE_EXPRESSION__NAME = MENUM_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_SINGLE_EXPRESSION__DESCRIPTION = MENUM_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_SINGLE_EXPRESSION__CONSTANT = MENUM_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>Enum Definition</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_SINGLE_EXPRESSION__ENUM_DEFINITION = MENUM_PARAMETER__ENUM_DEFINITION;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE = MENUM_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MEnumParameterSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_SINGLE_EXPRESSION_FEATURE_COUNT = MENUM_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MEnumParameterSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_SINGLE_EXPRESSION_OPERATION_COUNT = MENUM_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParameterLiteralImpl <em>MEnumParameterLiteral</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MEnumParameterLiteralImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParameterLiteral()
	 * @generated
	 */
	int MENUM_PARAMETER_LITERAL = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_LITERAL__NAME = MCOMMON_REFERENCEABLE_OBJ__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_LITERAL__DESCRIPTION = MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>MEnumParameterLiteral</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_LITERAL_FEATURE_COUNT = MCOMMON_REFERENCEABLE_OBJ_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MEnum Parameter Literal</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAMETER_LITERAL_OPERATION_COUNT = MCOMMON_REFERENCEABLE_OBJ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MRealParameterImpl <em>MRealParameter</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MRealParameterImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMRealParameter()
	 * @generated
	 */
	int MREAL_PARAMETER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAMETER__NAME = MPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAMETER__DESCRIPTION = MPARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAMETER__CONSTANT = MPARAMETER__CONSTANT;

	/**
	 * The number of structural features of the '<em>MRealParameter</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAMETER_FEATURE_COUNT = MPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MReal Parameter</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAMETER_OPERATION_COUNT = MPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MRealParameterSingleExpressionImpl <em>MRealParameterSingleExpression</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MRealParameterSingleExpressionImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMRealParameterSingleExpression()
	 * @generated
	 */
	int MREAL_PARAMETER_SINGLE_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAMETER_SINGLE_EXPRESSION__NAME = MREAL_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAMETER_SINGLE_EXPRESSION__DESCRIPTION = MREAL_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAMETER_SINGLE_EXPRESSION__CONSTANT = MREAL_PARAMETER__CONSTANT;

	/**
	 * The feature id for the '<em><b>DefaultValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAMETER_SINGLE_EXPRESSION__DEFAULT_VALUE = MREAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAMETER_SINGLE_EXPRESSION__RANGE = MREAL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MRealParameterSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAMETER_SINGLE_EXPRESSION_FEATURE_COUNT = MREAL_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MRealParameterSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MREAL_PARAMETER_SINGLE_EXPRESSION_OPERATION_COUNT = MREAL_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterRangeImpl <em>MParameterRange</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterRangeImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterRange()
	 * @generated
	 */
	int MPARAMETER_RANGE = 23;

	/**
	 * The feature id for the '<em><b>LowerValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_RANGE__LOWER_VALUE = 0;

	/**
	 * The feature id for the '<em><b>UpperValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_RANGE__UPPER_VALUE = 1;

	/**
	 * The number of structural features of the '<em>MParameterRange</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_RANGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MParameter Range</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterOORImpl <em>MParameterOOR</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterOORImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterOOR()
	 * @generated
	 */
	int MPARAMETER_OOR = 24;

	/**
	 * The feature id for the '<em><b>LowerValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OOR__LOWER_VALUE = MPARAMETER_RANGE__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>UpperValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OOR__UPPER_VALUE = MPARAMETER_RANGE__UPPER_VALUE;

	/**
	 * The number of structural features of the '<em>MParameterOOR</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OOR_FEATURE_COUNT = MPARAMETER_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MParameter OOR</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OOR_OPERATION_COUNT = MPARAMETER_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterOCRImpl <em>MParameterOCR</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterOCRImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterOCR()
	 * @generated
	 */
	int MPARAMETER_OCR = 25;

	/**
	 * The feature id for the '<em><b>LowerValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OCR__LOWER_VALUE = MPARAMETER_RANGE__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>UpperValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OCR__UPPER_VALUE = MPARAMETER_RANGE__UPPER_VALUE;

	/**
	 * The number of structural features of the '<em>MParameterOCR</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OCR_FEATURE_COUNT = MPARAMETER_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MParameter OCR</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_OCR_OPERATION_COUNT = MPARAMETER_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterCCRImpl <em>MParameterCCR</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterCCRImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterCCR()
	 * @generated
	 */
	int MPARAMETER_CCR = 26;

	/**
	 * The feature id for the '<em><b>LowerValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_CCR__LOWER_VALUE = MPARAMETER_RANGE__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>UpperValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_CCR__UPPER_VALUE = MPARAMETER_RANGE__UPPER_VALUE;

	/**
	 * The number of structural features of the '<em>MParameterCCR</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_CCR_FEATURE_COUNT = MPARAMETER_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MParameter CCR</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_CCR_OPERATION_COUNT = MPARAMETER_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterCORImpl <em>MParameterCOR</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterCORImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterCOR()
	 * @generated
	 */
	int MPARAMETER_COR = 27;

	/**
	 * The feature id for the '<em><b>LowerValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_COR__LOWER_VALUE = MPARAMETER_RANGE__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>UpperValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_COR__UPPER_VALUE = MPARAMETER_RANGE__UPPER_VALUE;

	/**
	 * The number of structural features of the '<em>MParameterCOR</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_COR_FEATURE_COUNT = MPARAMETER_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MParameter COR</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_COR_OPERATION_COUNT = MPARAMETER_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParamIntegerLiteralImpl <em>MEnumParamIntegerLiteral</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MEnumParamIntegerLiteralImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParamIntegerLiteral()
	 * @generated
	 */
	int MENUM_PARAM_INTEGER_LITERAL = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_INTEGER_LITERAL__NAME = MENUM_PARAMETER_LITERAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_INTEGER_LITERAL__DESCRIPTION = MENUM_PARAMETER_LITERAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_INTEGER_LITERAL__VALUE = MENUM_PARAMETER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MEnumParamIntegerLiteral</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_INTEGER_LITERAL_FEATURE_COUNT = MENUM_PARAMETER_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MEnum Param Integer Literal</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_INTEGER_LITERAL_OPERATION_COUNT = MENUM_PARAMETER_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParamRealLiteralImpl <em>MEnumParamRealLiteral</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MEnumParamRealLiteralImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParamRealLiteral()
	 * @generated
	 */
	int MENUM_PARAM_REAL_LITERAL = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_REAL_LITERAL__NAME = MENUM_PARAMETER_LITERAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_REAL_LITERAL__DESCRIPTION = MENUM_PARAMETER_LITERAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_REAL_LITERAL__VALUE = MENUM_PARAMETER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MEnumParamRealLiteral</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_REAL_LITERAL_FEATURE_COUNT = MENUM_PARAMETER_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MEnum Param Real Literal</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_REAL_LITERAL_OPERATION_COUNT = MENUM_PARAMETER_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParamStringLiteralImpl <em>MEnumParamStringLiteral</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MEnumParamStringLiteralImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParamStringLiteral()
	 * @generated
	 */
	int MENUM_PARAM_STRING_LITERAL = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_STRING_LITERAL__NAME = MENUM_PARAMETER_LITERAL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_STRING_LITERAL__DESCRIPTION = MENUM_PARAMETER_LITERAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_STRING_LITERAL__VALUE = MENUM_PARAMETER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IsRaw</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_STRING_LITERAL__IS_RAW = MENUM_PARAMETER_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MEnumParamStringLiteral</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_STRING_LITERAL_FEATURE_COUNT = MENUM_PARAMETER_LITERAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MEnum Param String Literal</em>' class.
	 * @generated
	 * @ordered
	 */
	int MENUM_PARAM_STRING_LITERAL_OPERATION_COUNT = MENUM_PARAMETER_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueImpl <em>MParameterValue</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValue()
	 * @generated
	 */
	int MPARAMETER_VALUE = 31;

	/**
	 * The number of structural features of the '<em>MParameterValue</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>MParameterValue</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueLiteralImpl <em>MParameterValueLiteral</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueLiteralImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueLiteral()
	 * @generated
	 */
	int MPARAMETER_VALUE_LITERAL = 32;

	/**
	 * The number of structural features of the '<em>MParameterValueLiteral</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_LITERAL_FEATURE_COUNT = MPARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MParameter Value Literal</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_LITERAL_OPERATION_COUNT = MPARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueIntegerLiteralImpl <em>MParameterValueIntegerLiteral</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueIntegerLiteralImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueIntegerLiteral()
	 * @generated
	 */
	int MPARAMETER_VALUE_INTEGER_LITERAL = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_INTEGER_LITERAL__VALUE = MPARAMETER_VALUE_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameterValueIntegerLiteral</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_INTEGER_LITERAL_FEATURE_COUNT = MPARAMETER_VALUE_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MParameter Value Integer Literal</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_INTEGER_LITERAL_OPERATION_COUNT = MPARAMETER_VALUE_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueRealLiteralImpl <em>MParameterValueRealLiteral</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueRealLiteralImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueRealLiteral()
	 * @generated
	 */
	int MPARAMETER_VALUE_REAL_LITERAL = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_REAL_LITERAL__VALUE = MPARAMETER_VALUE_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameterValueRealLiteral</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_REAL_LITERAL_FEATURE_COUNT = MPARAMETER_VALUE_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MParameter Value Real Literal</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_REAL_LITERAL_OPERATION_COUNT = MPARAMETER_VALUE_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueBooleanLiteralImpl <em>MParameterValueBooleanLiteral</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueBooleanLiteralImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueBooleanLiteral()
	 * @generated
	 */
	int MPARAMETER_VALUE_BOOLEAN_LITERAL = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_BOOLEAN_LITERAL__VALUE = MPARAMETER_VALUE_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameterValueBooleanLiteral</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_BOOLEAN_LITERAL_FEATURE_COUNT = MPARAMETER_VALUE_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MParameter Value Boolean Literal</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_BOOLEAN_LITERAL_OPERATION_COUNT = MPARAMETER_VALUE_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueStringLiteralImpl <em>MParameterValueString Literal</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueStringLiteralImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueStringLiteral()
	 * @generated
	 */
	int MPARAMETER_VALUE_STRING_LITERAL = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_STRING_LITERAL__VALUE = MPARAMETER_VALUE_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IsRaw</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_STRING_LITERAL__IS_RAW = MPARAMETER_VALUE_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MParameterValueStringLiteral</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_STRING_LITERAL_FEATURE_COUNT = MPARAMETER_VALUE_LITERAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MParameter Value String Literal</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_STRING_LITERAL_OPERATION_COUNT = MPARAMETER_VALUE_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueRefObjectImpl <em>MParameterValueRef Object</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueRefObjectImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueRefObject()
	 * @generated
	 */
	int MPARAMETER_VALUE_REF_OBJECT = 37;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_REF_OBJECT__OBJECT = MPARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameterValueRef Object</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_REF_OBJECT_FEATURE_COUNT = MPARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MParameter Value Ref Object</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_REF_OBJECT_OPERATION_COUNT = MPARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueExpressionImpl <em>MParameterValueExpression</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueExpressionImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueExpression()
	 * @generated
	 */
	int MPARAMETER_VALUE_EXPRESSION = 38;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_EXPRESSION__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_EXPRESSION__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_EXPRESSION__RIGHT = 2;

	/**
	 * The number of structural features of the '<em>MParameterValueExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>MParameter Value Expression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueTERMImpl <em>MParameterValueTERM</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueTERMImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueTERM()
	 * @generated
	 */
	int MPARAMETER_VALUE_TERM = 39;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_TERM__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_TERM__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_TERM__RIGHT = 2;

	/**
	 * The number of structural features of the '<em>MParameterValueTERM</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_TERM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>MParameter Value TERM</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValuePARImpl <em>MParameterValuePAR</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValuePARImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValuePAR()
	 * @generated
	 */
	int MPARAMETER_VALUE_PAR = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_PAR__VALUE = MPARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameterValuePAR</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_PAR_FEATURE_COUNT = MPARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MParameter Value PAR</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_PAR_OPERATION_COUNT = MPARAMETER_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueAssignmentImpl <em>MParameterValueAssignment</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueAssignmentImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueAssignment()
	 * @generated
	 */
	int MPARAMETER_VALUE_ASSIGNMENT = 41;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_ASSIGNMENT__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>MParameterValueAssignment</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_ASSIGNMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>MParameter Value Assignment</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueAssignmentSingleExpressionImpl <em>MParameterValueAssignmentSingleExpression</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueAssignmentSingleExpressionImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueAssignmentSingleExpression()
	 * @generated
	 */
	int MPARAMETER_VALUE_ASSIGNMENT_SINGLE_EXPRESSION = 42;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_ASSIGNMENT_SINGLE_EXPRESSION__PARAMETER = MPARAMETER_VALUE_ASSIGNMENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>ParameterValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_ASSIGNMENT_SINGLE_EXPRESSION__PARAMETER_VALUE = MPARAMETER_VALUE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MParameterValueAssignmentSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_ASSIGNMENT_SINGLE_EXPRESSION_FEATURE_COUNT = MPARAMETER_VALUE_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MParameter Value AssignmentSingleExpression</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_ASSIGNMENT_SINGLE_EXPRESSION_OPERATION_COUNT = MPARAMETER_VALUE_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueRangeImpl <em>MParameterValueRange</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueRangeImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueRange()
	 * @generated
	 */
	int MPARAMETER_VALUE_RANGE = 43;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_RANGE__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>ParameterValue</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_RANGE__PARAMETER_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_RANGE__RANGE = 2;

	/**
	 * The number of structural features of the '<em>MParameterValueRange</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>MParameterValueRange</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueDependentItemImpl <em>MParameterValueDependentItem</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueDependentItemImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueDependentItem()
	 * @generated
	 */
	int MPARAMETER_VALUE_DEPENDENT_ITEM = 44;

	/**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_DEPENDENT_ITEM__RANGES = 0;

	/**
	 * The number of structural features of the '<em>MParameterValueDependentItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_DEPENDENT_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>MParameterValueDependentItem</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_DEPENDENT_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueDependentItemsListImpl <em>MParameterValueDependentItemsList</em>}' class.
	 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueDependentItemsListImpl
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueDependentItemsList()
	 * @generated
	 */
	int MPARAMETER_VALUE_DEPENDENT_ITEMS_LIST = 45;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_DEPENDENT_ITEMS_LIST__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>MParameterValueDependentItemsList</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_DEPENDENT_ITEMS_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>MParameterValueDependentItemsList</em>' class.
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_VALUE_DEPENDENT_ITEMS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.MParameterValueExpressionOperators <em>MParameterValueExpressionOperators</em>}' enum.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueExpressionOperators
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueExpressionOperators()
	 * @generated
	 */
	int MPARAMETER_VALUE_EXPRESSION_OPERATORS = 46;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.micobs.common.MParameterValueTERMOperators <em>MParameterValueTERMOperators</em>}' enum.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueTERMOperators
	 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueTERMOperators()
	 * @generated
	 */
	int MPARAMETER_VALUE_TERM_OPERATORS = 47;

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MCommonPackage <em>MCommonPackage</em>}'.
	 * @return the meta object for class '<em>MCommonPackage</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackage
	 * @generated
	 */
	EClass getMCommonPackage();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MCommonPackage#getUri <em>URI</em>}'.
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackage#getUri()
	 * @see #getMCommonPackage()
	 * @generated
	 */
	EAttribute getMCommonPackage_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.common.MCommonPackage#getItems <em>Items</em>}'.
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackage#getItems()
	 * @see #getMCommonPackage()
	 * @generated
	 */
	EReference getMCommonPackage_Items();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MCommonPackageFile <em>MCommonPackageFile</em>}'.
	 * @return the meta object for class '<em>MCommonPackageFile</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageFile
	 * @generated
	 */
	EClass getMCommonPackageFile();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.common.MCommonPackageFile#getPackage <em>Package</em>}'.
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageFile#getPackage()
	 * @see #getMCommonPackageFile()
	 * @generated
	 */
	EReference getMCommonPackageFile_Package();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.micobs.common.MCommonPackageFile#getImports <em>Imports</em>}'.
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageFile#getImports()
	 * @see #getMCommonPackageFile()
	 * @generated
	 */
	EReference getMCommonPackageFile_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MCommonPackageFile#getElement <em>Element</em>}'.
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageFile#getElement()
	 * @see #getMCommonPackageFile()
	 * @generated
	 */
	EReference getMCommonPackageFile_Element();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MCommonPackageElement <em>MCommonPackageElement</em>}'.
	 * @return the meta object for class '<em>MCommonPackageElement</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageElement
	 * @generated
	 */
	EClass getMCommonPackageElement();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MCommonPackageElement#getVersion <em>Version</em>}'.
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageElement#getVersion()
	 * @see #getMCommonPackageElement()
	 * @generated
	 */
	EAttribute getMCommonPackageElement_Version();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MCommonPackageElement#getName <em>Name</em>}'.
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageElement#getName()
	 * @see #getMCommonPackageElement()
	 * @generated
	 */
	EAttribute getMCommonPackageElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MCommonPackageElement#getUri <em>URI</em>}'.
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageElement#getUri()
	 * @see #getMCommonPackageElement()
	 * @generated
	 */
	EAttribute getMCommonPackageElement_Uri();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MCommonPackageItem <em>MCommonPackageItem</em>}'.
	 * @return the meta object for class '<em>MCommonPackageItem</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageItem
	 * @generated
	 */
	EClass getMCommonPackageItem();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.common.MCommonPackageItem#getVersionedItems <em>VersionedItems</em>}'.
	 * @return the meta object for the containment reference list '<em>VersionedItems</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageItem#getVersionedItems()
	 * @see #getMCommonPackageItem()
	 * @generated
	 */
	EReference getMCommonPackageItem_VersionedItems();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MCommonPackageItem#getUri <em>URI</em>}'.
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageItem#getUri()
	 * @see #getMCommonPackageItem()
	 * @generated
	 */
	EAttribute getMCommonPackageItem_Uri();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem <em>MCommonPackageVersionedItem</em>}'.
	 * @return the meta object for class '<em>MCommonPackageVersionedItem</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem
	 * @generated
	 */
	EClass getMCommonPackageVersionedItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem#getLocalModelURI <em>LocalModelURI</em>}'.
	 * @return the meta object for the attribute '<em>LocalModelURI</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem#getLocalModelURI()
	 * @see #getMCommonPackageVersionedItem()
	 * @generated
	 */
	EAttribute getMCommonPackageVersionedItem_LocalModelURI();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem#getRemoteModelURI <em>RemoteModelURI</em>}'.
	 * @return the meta object for the attribute '<em>RemoteModelURI</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem#getRemoteModelURI()
	 * @see #getMCommonPackageVersionedItem()
	 * @generated
	 */
	EAttribute getMCommonPackageVersionedItem_RemoteModelURI();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem#getRepositoryFolderURI <em>RepositoryFolderURI</em>}'.
	 * @return the meta object for the attribute '<em>RepositoryFolderURI</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem#getRepositoryFolderURI()
	 * @see #getMCommonPackageVersionedItem()
	 * @generated
	 */
	EAttribute getMCommonPackageVersionedItem_RepositoryFolderURI();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem#getVersion <em>Version</em>}'.
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem#getVersion()
	 * @see #getMCommonPackageVersionedItem()
	 * @generated
	 */
	EAttribute getMCommonPackageVersionedItem_Version();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MCommonLibrary <em>MCommonLibrary</em>}'.
	 * @return the meta object for class '<em>MCommonLibrary</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonLibrary
	 * @generated
	 */
	EClass getMCommonLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.common.MCommonLibrary#getPackages <em>Packages</em>}'.
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonLibrary#getPackages()
	 * @see #getMCommonLibrary()
	 * @generated
	 */
	EReference getMCommonLibrary_Packages();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement <em>MCommonPackageReferencingElement</em>}'.
	 * @return the meta object for class '<em>MCommonPackageReferencingElement</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement
	 * @generated
	 */
	EClass getMCommonPackageReferencingElement();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement#getReferencedElement <em>ReferencedElement</em>}'.
	 * @return the meta object for the reference '<em>ReferencedElement</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement#getReferencedElement()
	 * @see #getMCommonPackageReferencingElement()
	 * @generated
	 */
	EReference getMCommonPackageReferencingElement_ReferencedElement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement <em>MCommonPackageParametricReferencingElement</em>}'.
	 * @return the meta object for class '<em>MCommonPackageParametricReferencingElement</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement
	 * @generated
	 */
	EClass getMCommonPackageParametricReferencingElement();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement#getReferencedElement <em>ReferencedElement</em>}'.
	 * @return the meta object for the reference '<em>ReferencedElement</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement#getReferencedElement()
	 * @see #getMCommonPackageParametricReferencingElement()
	 * @generated
	 */
	EReference getMCommonPackageParametricReferencingElement_ReferencedElement();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement#getParameterElement <em>ParameterElement</em>}'.
	 * @return the meta object for the reference '<em>ParameterElement</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement#getParameterElement()
	 * @see #getMCommonPackageParametricReferencingElement()
	 * @generated
	 */
	EReference getMCommonPackageParametricReferencingElement_ParameterElement();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MCommonReferenceableObj <em>MCommonReferenceableObj</em>}'.
	 * @return the meta object for class '<em>MCommonReferenceableObj</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonReferenceableObj
	 * @generated
	 */
	EClass getMCommonReferenceableObj();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MCommonReferenceableObj#getName <em>Name</em>}'.
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonReferenceableObj#getName()
	 * @see #getMCommonReferenceableObj()
	 * @generated
	 */
	EAttribute getMCommonReferenceableObj_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MCommonReferenceableObj#getDescription <em>Description</em>}'.
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uah.aut.srg.micobs.common.MCommonReferenceableObj#getDescription()
	 * @see #getMCommonReferenceableObj()
	 * @generated
	 */
	EAttribute getMCommonReferenceableObj_Description();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameter <em>MParameter</em>}'.
	 * @return the meta object for class '<em>MParameter</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameter
	 * @generated
	 */
	EClass getMParameter();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MParameter#isConstant <em>Constant</em>}'.
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameter#isConstant()
	 * @see #getMParameter()
	 * @generated
	 */
	EAttribute getMParameter_Constant();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterDefaultValueSingleExpression <em>MParameterDefaultValueSingleExpression</em>}'.
	 * @return the meta object for class '<em>MParameterDefaultValueSingleExpression</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterDefaultValueSingleExpression
	 * @generated
	 */
	EClass getMParameterDefaultValueSingleExpression();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MParameterDefaultValueSingleExpression#getDefaultValue <em>DefaultValue</em>}'.
	 * @return the meta object for the containment reference '<em>DefaultValue</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterDefaultValueSingleExpression#getDefaultValue()
	 * @see #getMParameterDefaultValueSingleExpression()
	 * @generated
	 */
	EReference getMParameterDefaultValueSingleExpression_DefaultValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MEnumParameterDefinition <em>MEnumParameterDefinition</em>}'.
	 * @return the meta object for class '<em>MEnumParameterDefinition</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParameterDefinition
	 * @generated
	 */
	EClass getMEnumParameterDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.common.MEnumParameterDefinition#getLiterals <em>Literals</em>}'.
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParameterDefinition#getLiterals()
	 * @see #getMEnumParameterDefinition()
	 * @generated
	 */
	EReference getMEnumParameterDefinition_Literals();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MBooleanParameter <em>MBooleanParameter</em>}'.
	 * @return the meta object for class '<em>MBooleanParameter</em>'.
	 * @see es.uah.aut.srg.micobs.common.MBooleanParameter
	 * @generated
	 */
	EClass getMBooleanParameter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MBooleanParameterSingleExpression <em>MBooleanParameterSingleExpression</em>}'.
	 * @return the meta object for class '<em>MBooleanParameterSingleExpression</em>'.
	 * @see es.uah.aut.srg.micobs.common.MBooleanParameterSingleExpression
	 * @generated
	 */
	EClass getMBooleanParameterSingleExpression();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MStringParameter <em>MStringParameter</em>}'.
	 * @return the meta object for class '<em>MStringParameter</em>'.
	 * @see es.uah.aut.srg.micobs.common.MStringParameter
	 * @generated
	 */
	EClass getMStringParameter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MStringParameterSingleExpression <em>MStringParameterSingleExpression</em>}'.
	 * @return the meta object for class '<em>MStringParameterSingleExpression</em>'.
	 * @see es.uah.aut.srg.micobs.common.MStringParameterSingleExpression
	 * @generated
	 */
	EClass getMStringParameterSingleExpression();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MIntegerParameter <em>MIntegerParameter</em>}'.
	 * @return the meta object for class '<em>MIntegerParameter</em>'.
	 * @see es.uah.aut.srg.micobs.common.MIntegerParameter
	 * @generated
	 */
	EClass getMIntegerParameter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MIntegerParameterSingleExpression <em>MIntegerParameterSingleExpression</em>}'.
	 * @return the meta object for class '<em>MIntegerParameterSingleExpression</em>'.
	 * @see es.uah.aut.srg.micobs.common.MIntegerParameterSingleExpression
	 * @generated
	 */
	EClass getMIntegerParameterSingleExpression();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MIntegerParameterSingleExpression#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.common.MIntegerParameterSingleExpression#getRange()
	 * @see #getMIntegerParameterSingleExpression()
	 * @generated
	 */
	EReference getMIntegerParameterSingleExpression_Range();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MEnumParameter <em>MEnumParameter</em>}'.
	 * @return the meta object for class '<em>MEnumParameter</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParameter
	 * @generated
	 */
	EClass getMEnumParameter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.common.MEnumParameter#getEnumDefinition <em>EnumDefinition</em>}'.
	 * @return the meta object for the reference '<em>EnumDefinition</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParameter#getEnumDefinition()
	 * @see #getMEnumParameter()
	 * @generated
	 */
	EReference getMEnumParameter_EnumDefinition();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MEnumParameterSingleExpression <em>MEnumParameterSingleExpression</em>}'.
	 * @return the meta object for class '<em>MEnumParameterSingleExpression</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParameterSingleExpression
	 * @generated
	 */
	EClass getMEnumParameterSingleExpression();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MEnumParameterLiteral <em>MEnumParameterLiteral</em>}'.
	 * @return the meta object for class '<em>MEnumParameterLiteral</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParameterLiteral
	 * @generated
	 */
	EClass getMEnumParameterLiteral();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MRealParameter <em>MRealParameter</em>}'.
	 * @return the meta object for class '<em>MRealParameter</em>'.
	 * @see es.uah.aut.srg.micobs.common.MRealParameter
	 * @generated
	 */
	EClass getMRealParameter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MRealParameterSingleExpression <em>MRealParameterSingleExpression</em>}'.
	 * @return the meta object for class '<em>MRealParameterSingleExpression</em>'.
	 * @see es.uah.aut.srg.micobs.common.MRealParameterSingleExpression
	 * @generated
	 */
	EClass getMRealParameterSingleExpression();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MRealParameterSingleExpression#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.common.MRealParameterSingleExpression#getRange()
	 * @see #getMRealParameterSingleExpression()
	 * @generated
	 */
	EReference getMRealParameterSingleExpression_Range();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterRange <em>MParameterRange</em>}'.
	 * @return the meta object for class '<em>MParameterRange</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterRange
	 * @generated
	 */
	EClass getMParameterRange();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MParameterRange#getLowerValue <em>LowerValue</em>}'.
	 * @return the meta object for the containment reference '<em>LowerValue</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterRange#getLowerValue()
	 * @see #getMParameterRange()
	 * @generated
	 */
	EReference getMParameterRange_LowerValue();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MParameterRange#getUpperValue <em>UpperValue</em>}'.
	 * @return the meta object for the containment reference '<em>UpperValue</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterRange#getUpperValue()
	 * @see #getMParameterRange()
	 * @generated
	 */
	EReference getMParameterRange_UpperValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterOOR <em>MParameterOOR</em>}'.
	 * @return the meta object for class '<em>MParameterOOR</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterOOR
	 * @generated
	 */
	EClass getMParameterOOR();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterOCR <em>MParameterOCR</em>}'.
	 * @return the meta object for class '<em>MParameterOCR</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterOCR
	 * @generated
	 */
	EClass getMParameterOCR();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterCCR <em>MParameterCCR</em>}'.
	 * @return the meta object for class '<em>MParameterCCR</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterCCR
	 * @generated
	 */
	EClass getMParameterCCR();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterCOR <em>MParameterCOR</em>}'.
	 * @return the meta object for class '<em>MParameterCOR</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterCOR
	 * @generated
	 */
	EClass getMParameterCOR();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MEnumParamIntegerLiteral <em>MEnumParamIntegerLiteral</em>}'.
	 * @return the meta object for class '<em>MEnumParamIntegerLiteral</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParamIntegerLiteral
	 * @generated
	 */
	EClass getMEnumParamIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MEnumParamIntegerLiteral#getValue <em>Value</em>}'.
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParamIntegerLiteral#getValue()
	 * @see #getMEnumParamIntegerLiteral()
	 * @generated
	 */
	EAttribute getMEnumParamIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MEnumParamRealLiteral <em>MEnumParamRealLiteral</em>}'.
	 * @return the meta object for class '<em>MEnumParamRealLiteral</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParamRealLiteral
	 * @generated
	 */
	EClass getMEnumParamRealLiteral();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MEnumParamRealLiteral#getValue <em>Value</em>}'.
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParamRealLiteral#getValue()
	 * @see #getMEnumParamRealLiteral()
	 * @generated
	 */
	EAttribute getMEnumParamRealLiteral_Value();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MEnumParamStringLiteral <em>MEnumParamStringLiteral</em>}'.
	 * @return the meta object for class '<em>MEnumParamStringLiteral</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParamStringLiteral
	 * @generated
	 */
	EClass getMEnumParamStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MEnumParamStringLiteral#getValue <em>Value</em>}'.
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParamStringLiteral#getValue()
	 * @see #getMEnumParamStringLiteral()
	 * @generated
	 */
	EAttribute getMEnumParamStringLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MEnumParamStringLiteral#isIsRaw <em>IsRaw</em>}'.
	 * @return the meta object for the attribute '<em>IsRaw</em>'.
	 * @see es.uah.aut.srg.micobs.common.MEnumParamStringLiteral#isIsRaw()
	 * @see #getMEnumParamStringLiteral()
	 * @generated
	 */
	EAttribute getMEnumParamStringLiteral_IsRaw();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValue <em>MParameterValue</em>}'.
	 * @return the meta object for class '<em>MParameterValue</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValue
	 * @generated
	 */
	EClass getMParameterValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueLiteral <em>MParameterValueLiteral</em>}'.
	 * @return the meta object for class '<em>MParameterValueLiteral</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueLiteral
	 * @generated
	 */
	EClass getMParameterValueLiteral();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueIntegerLiteral <em>MParameterValueIntegerLiteral</em>}'.
	 * @return the meta object for class '<em>MParameterValueIntegerLiteral</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueIntegerLiteral
	 * @generated
	 */
	EClass getMParameterValueIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MParameterValueIntegerLiteral#getValue <em>Value</em>}'.
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueIntegerLiteral#getValue()
	 * @see #getMParameterValueIntegerLiteral()
	 * @generated
	 */
	EAttribute getMParameterValueIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueRealLiteral <em>MParameterValueRealLiteral</em>}'.
	 * @return the meta object for class '<em>MParameterValueRealLiteral</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueRealLiteral
	 * @generated
	 */
	EClass getMParameterValueRealLiteral();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MParameterValueRealLiteral#getValue <em>Value</em>}'.
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueRealLiteral#getValue()
	 * @see #getMParameterValueRealLiteral()
	 * @generated
	 */
	EAttribute getMParameterValueRealLiteral_Value();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueBooleanLiteral <em>MParameterValueBooleanLiteral</em>}'.
	 * @return the meta object for class '<em>MParameterValueBooleanLiteral</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueBooleanLiteral
	 * @generated
	 */
	EClass getMParameterValueBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MParameterValueBooleanLiteral#isValue <em>Value</em>}'.
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueBooleanLiteral#isValue()
	 * @see #getMParameterValueBooleanLiteral()
	 * @generated
	 */
	EAttribute getMParameterValueBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueStringLiteral <em>MParameterValueStringLiteral</em>}'.
	 * @return the meta object for class '<em>MParameterValueStringLiteral</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueStringLiteral
	 * @generated
	 */
	EClass getMParameterValueStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MParameterValueStringLiteral#getValue <em>Value</em>}'.
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueStringLiteral#getValue()
	 * @see #getMParameterValueStringLiteral()
	 * @generated
	 */
	EAttribute getMParameterValueStringLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MParameterValueStringLiteral#isIsRaw <em>IsRaw</em>}'.
	 * @return the meta object for the attribute '<em>IsRaw</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueStringLiteral#isIsRaw()
	 * @see #getMParameterValueStringLiteral()
	 * @generated
	 */
	EAttribute getMParameterValueStringLiteral_IsRaw();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueRefObject <em>MParameterValueRef Object</em>}'.
	 * @return the meta object for class '<em>MParameterValueRefObject</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueRefObject
	 * @generated
	 */
	EClass getMParameterValueRefObject();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.common.MParameterValueRefObject#getObject <em>Object</em>}'.
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueRefObject#getObject()
	 * @see #getMParameterValueRefObject()
	 * @generated
	 */
	EReference getMParameterValueRefObject_Object();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueExpression <em>MParameterValueExpression</em>}'.
	 * @return the meta object for class '<em>MParameterValueExpression</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueExpression
	 * @generated
	 */
	EClass getMParameterValueExpression();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MParameterValueExpression#getLeft <em>Left</em>}'.
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueExpression#getLeft()
	 * @see #getMParameterValueExpression()
	 * @generated
	 */
	EReference getMParameterValueExpression_Left();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MParameterValueExpression#getOperation <em>Operation</em>}'.
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueExpression#getOperation()
	 * @see #getMParameterValueExpression()
	 * @generated
	 */
	EAttribute getMParameterValueExpression_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MParameterValueExpression#getRight <em>Right</em>}'.
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueExpression#getRight()
	 * @see #getMParameterValueExpression()
	 * @generated
	 */
	EReference getMParameterValueExpression_Right();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueTERM <em>MParameterValueTERM</em>}'.
	 * @return the meta object for class '<em>MParameterValueTERM</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueTERM
	 * @generated
	 */
	EClass getMParameterValueTERM();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MParameterValueTERM#getLeft <em>Left</em>}'.
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueTERM#getLeft()
	 * @see #getMParameterValueTERM()
	 * @generated
	 */
	EReference getMParameterValueTERM_Left();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.micobs.common.MParameterValueTERM#getOperation <em>Operation</em>}'.
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueTERM#getOperation()
	 * @see #getMParameterValueTERM()
	 * @generated
	 */
	EAttribute getMParameterValueTERM_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MParameterValueTERM#getRight <em>Right</em>}'.
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueTERM#getRight()
	 * @see #getMParameterValueTERM()
	 * @generated
	 */
	EReference getMParameterValueTERM_Right();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValuePAR <em>MParameterValuePAR</em>}'.
	 * @return the meta object for class '<em>MParameterValuePAR</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValuePAR
	 * @generated
	 */
	EClass getMParameterValuePAR();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MParameterValuePAR#getValue <em>Value</em>}'.
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValuePAR#getValue()
	 * @see #getMParameterValuePAR()
	 * @generated
	 */
	EReference getMParameterValuePAR_Value();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueAssignment <em>MParameterValueAssignment</em>}'.
	 * @return the meta object for class '<em>MParameterValueAssignment</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueAssignment
	 * @generated
	 */
	EClass getMParameterValueAssignment();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.common.MParameterValueAssignment#getParameter <em>Parameter</em>}'.
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueAssignment#getParameter()
	 * @see #getMParameterValueAssignment()
	 * @generated
	 */
	EReference getMParameterValueAssignment_Parameter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueAssignmentSingleExpression <em>MParameterValueAssignmentSingleExpression</em>}'.
	 * @return the meta object for class '<em>MParameterValueAssignmentSingleExpression</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueAssignmentSingleExpression
	 * @generated
	 */
	EClass getMParameterValueAssignmentSingleExpression();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MParameterValueAssignmentSingleExpression#getParameterValue <em>ParameterValue</em>}'.
	 * @return the meta object for the containment reference '<em>ParameterValue</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueAssignmentSingleExpression#getParameterValue()
	 * @see #getMParameterValueAssignmentSingleExpression()
	 * @generated
	 */
	EReference getMParameterValueAssignmentSingleExpression_ParameterValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueRange <em>MParameterValueRange</em>}'.
	 * @return the meta object for class '<em>MParameterValueRange</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueRange
	 * @generated
	 */
	EClass getMParameterValueRange();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.micobs.common.MParameterValueRange#getParameter <em>Parameter</em>}'.
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueRange#getParameter()
	 * @see #getMParameterValueRange()
	 * @generated
	 */
	EReference getMParameterValueRange_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MParameterValueRange#getParameterValue <em>ParameterValue</em>}'.
	 * @return the meta object for the containment reference '<em>ParameterValue</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueRange#getParameterValue()
	 * @see #getMParameterValueRange()
	 * @generated
	 */
	EReference getMParameterValueRange_ParameterValue();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MParameterValueRange#getRange <em>Range</em>}'.
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueRange#getRange()
	 * @see #getMParameterValueRange()
	 * @generated
	 */
	EReference getMParameterValueRange_Range();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueDependentItem <em>MParameterValueDependentItem</em>}'.
	 * @return the meta object for class '<em>MParameterValueDependentItem</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueDependentItem
	 * @generated
	 */
	EClass getMParameterValueDependentItem();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.micobs.common.MParameterValueDependentItem#getRanges <em>Ranges</em>}'.
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueDependentItem#getRanges()
	 * @see #getMParameterValueDependentItem()
	 * @generated
	 */
	EReference getMParameterValueDependentItem_Ranges();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.micobs.common.MParameterValueDependentItemsList <em>MParameterValueDependentItemsList</em>}'.
	 * @return the meta object for class '<em>MParameterValueDependentItemsList</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueDependentItemsList
	 * @generated
	 */
	EClass getMParameterValueDependentItemsList();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.micobs.common.MParameterValueDependentItemsList#getItems <em>Items</em>}'.
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueDependentItemsList#getItems()
	 * @see #getMParameterValueDependentItemsList()
	 * @generated
	 */
	EReference getMParameterValueDependentItemsList_Items();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.common.MParameterValueExpressionOperators <em>MParameterValueExpressionOperators</em>}'.
	 * @return the meta object for enum '<em>MParameterValueExpressionOperators</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueExpressionOperators
	 * @generated
	 */
	EEnum getMParameterValueExpressionOperators();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.micobs.common.MParameterValueTERMOperators <em>MParameterValueTERMOperators</em>}'.
	 * @return the meta object for enum '<em>MParameterValueTERMOperators</em>'.
	 * @see es.uah.aut.srg.micobs.common.MParameterValueTERMOperators
	 * @generated
	 */
	EEnum getMParameterValueTERMOperators();

	/**
	 * Returns the factory that creates the instances of the model.
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	commonFactory getcommonFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageImpl <em>MCommonPackage</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackage()
		 * @generated
		 */
		EClass MCOMMON_PACKAGE = eINSTANCE.getMCommonPackage();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MCOMMON_PACKAGE__URI = eINSTANCE.getMCommonPackage_Uri();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMMON_PACKAGE__ITEMS = eINSTANCE.getMCommonPackage_Items();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageFileImpl <em>MCommonPackageFile</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageFileImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackageFile()
		 * @generated
		 */
		EClass MCOMMON_PACKAGE_FILE = eINSTANCE.getMCommonPackageFile();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMMON_PACKAGE_FILE__PACKAGE = eINSTANCE.getMCommonPackageFile_Package();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * @generated
		 */
		EReference MCOMMON_PACKAGE_FILE__IMPORTS = eINSTANCE.getMCommonPackageFile_Imports();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MCOMMON_PACKAGE_FILE__ELEMENT = eINSTANCE.getMCommonPackageFile_Element();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageElementImpl <em>MCommonPackageElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageElementImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackageElement()
		 * @generated
		 */
		EClass MCOMMON_PACKAGE_ELEMENT = eINSTANCE.getMCommonPackageElement();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MCOMMON_PACKAGE_ELEMENT__VERSION = eINSTANCE.getMCommonPackageElement_Version();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MCOMMON_PACKAGE_ELEMENT__NAME = eINSTANCE.getMCommonPackageElement_Name();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MCOMMON_PACKAGE_ELEMENT__URI = eINSTANCE.getMCommonPackageElement_Uri();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageItemImpl <em>MCommonPackageItem</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageItemImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackageItem()
		 * @generated
		 */
		EClass MCOMMON_PACKAGE_ITEM = eINSTANCE.getMCommonPackageItem();

		/**
		 * The meta object literal for the '<em><b>VersionedItems</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS = eINSTANCE.getMCommonPackageItem_VersionedItems();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MCOMMON_PACKAGE_ITEM__URI = eINSTANCE.getMCommonPackageItem_Uri();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageVersionedItemImpl <em>MCommonPackageVersionedItem</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageVersionedItemImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackageVersionedItem()
		 * @generated
		 */
		EClass MCOMMON_PACKAGE_VERSIONED_ITEM = eINSTANCE.getMCommonPackageVersionedItem();

		/**
		 * The meta object literal for the '<em><b>LocalModelURI</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI = eINSTANCE.getMCommonPackageVersionedItem_LocalModelURI();

		/**
		 * The meta object literal for the '<em><b>RemoteModelURI</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI = eINSTANCE.getMCommonPackageVersionedItem_RemoteModelURI();

		/**
		 * The meta object literal for the '<em><b>RepositoryFolderURI</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI = eINSTANCE.getMCommonPackageVersionedItem_RepositoryFolderURI();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION = eINSTANCE.getMCommonPackageVersionedItem_Version();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonLibraryImpl <em>MCommonLibrary</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MCommonLibraryImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonLibrary()
		 * @generated
		 */
		EClass MCOMMON_LIBRARY = eINSTANCE.getMCommonLibrary();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MCOMMON_LIBRARY__PACKAGES = eINSTANCE.getMCommonLibrary_Packages();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageReferencingElementImpl <em>MCommonPackageReferencingElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageReferencingElementImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackageReferencingElement()
		 * @generated
		 */
		EClass MCOMMON_PACKAGE_REFERENCING_ELEMENT = eINSTANCE.getMCommonPackageReferencingElement();

		/**
		 * The meta object literal for the '<em><b>ReferencedElement</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT = eINSTANCE.getMCommonPackageReferencingElement_ReferencedElement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonPackageParametricReferencingElementImpl <em>MCommonPackageParametricReferencingElement</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MCommonPackageParametricReferencingElementImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonPackageParametricReferencingElement()
		 * @generated
		 */
		EClass MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT = eINSTANCE.getMCommonPackageParametricReferencingElement();

		/**
		 * The meta object literal for the '<em><b>ReferencedElement</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__REFERENCED_ELEMENT = eINSTANCE.getMCommonPackageParametricReferencingElement_ReferencedElement();

		/**
		 * The meta object literal for the '<em><b>ParameterElement</b></em>' reference feature.
		 * @generated
		 */
		EReference MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__PARAMETER_ELEMENT = eINSTANCE.getMCommonPackageParametricReferencingElement_ParameterElement();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl <em>MCommonReferenceableObj</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMCommonReferenceableObj()
		 * @generated
		 */
		EClass MCOMMON_REFERENCEABLE_OBJ = eINSTANCE.getMCommonReferenceableObj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MCOMMON_REFERENCEABLE_OBJ__NAME = eINSTANCE.getMCommonReferenceableObj_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION = eINSTANCE.getMCommonReferenceableObj_Description();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterImpl <em>MParameter</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameter()
		 * @generated
		 */
		EClass MPARAMETER = eINSTANCE.getMParameter();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MPARAMETER__CONSTANT = eINSTANCE.getMParameter_Constant();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterDefaultValueSingleExpressionImpl <em>MParameterDefaultValueSingleExpression</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterDefaultValueSingleExpressionImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterDefaultValueSingleExpression()
		 * @generated
		 */
		EClass MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION = eINSTANCE.getMParameterDefaultValueSingleExpression();

		/**
		 * The meta object literal for the '<em><b>DefaultValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION__DEFAULT_VALUE = eINSTANCE.getMParameterDefaultValueSingleExpression_DefaultValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParameterDefinitionImpl <em>MEnumParameterDefinition</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MEnumParameterDefinitionImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParameterDefinition()
		 * @generated
		 */
		EClass MENUM_PARAMETER_DEFINITION = eINSTANCE.getMEnumParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MENUM_PARAMETER_DEFINITION__LITERALS = eINSTANCE.getMEnumParameterDefinition_Literals();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MBooleanParameterImpl <em>MBooleanParameter</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MBooleanParameterImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMBooleanParameter()
		 * @generated
		 */
		EClass MBOOLEAN_PARAMETER = eINSTANCE.getMBooleanParameter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MBooleanParameterSingleExpressionImpl <em>MBooleanParameterSingleExpression</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MBooleanParameterSingleExpressionImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMBooleanParameterSingleExpression()
		 * @generated
		 */
		EClass MBOOLEAN_PARAMETER_SINGLE_EXPRESSION = eINSTANCE.getMBooleanParameterSingleExpression();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MStringParameterImpl <em>MStringParameter</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MStringParameterImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMStringParameter()
		 * @generated
		 */
		EClass MSTRING_PARAMETER = eINSTANCE.getMStringParameter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MStringParameterSingleExpressionImpl <em>MStringParameterSingleExpression</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MStringParameterSingleExpressionImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMStringParameterSingleExpression()
		 * @generated
		 */
		EClass MSTRING_PARAMETER_SINGLE_EXPRESSION = eINSTANCE.getMStringParameterSingleExpression();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MIntegerParameterImpl <em>MIntegerParameter</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MIntegerParameterImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMIntegerParameter()
		 * @generated
		 */
		EClass MINTEGER_PARAMETER = eINSTANCE.getMIntegerParameter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MIntegerParameterSingleExpressionImpl <em>MIntegerParameterSingleExpression</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MIntegerParameterSingleExpressionImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMIntegerParameterSingleExpression()
		 * @generated
		 */
		EClass MINTEGER_PARAMETER_SINGLE_EXPRESSION = eINSTANCE.getMIntegerParameterSingleExpression();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MINTEGER_PARAMETER_SINGLE_EXPRESSION__RANGE = eINSTANCE.getMIntegerParameterSingleExpression_Range();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParameterImpl <em>MEnumParameter</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MEnumParameterImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParameter()
		 * @generated
		 */
		EClass MENUM_PARAMETER = eINSTANCE.getMEnumParameter();

		/**
		 * The meta object literal for the '<em><b>EnumDefinition</b></em>' reference feature.
		 * @generated
		 */
		EReference MENUM_PARAMETER__ENUM_DEFINITION = eINSTANCE.getMEnumParameter_EnumDefinition();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParameterSingleExpressionImpl <em>MEnumParameterSingleExpression</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MEnumParameterSingleExpressionImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParameterSingleExpression()
		 * @generated
		 */
		EClass MENUM_PARAMETER_SINGLE_EXPRESSION = eINSTANCE.getMEnumParameterSingleExpression();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParameterLiteralImpl <em>MEnumParameterLiteral</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MEnumParameterLiteralImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParameterLiteral()
		 * @generated
		 */
		EClass MENUM_PARAMETER_LITERAL = eINSTANCE.getMEnumParameterLiteral();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MRealParameterImpl <em>MRealParameter</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MRealParameterImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMRealParameter()
		 * @generated
		 */
		EClass MREAL_PARAMETER = eINSTANCE.getMRealParameter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MRealParameterSingleExpressionImpl <em>MRealParameterSingleExpression</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MRealParameterSingleExpressionImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMRealParameterSingleExpression()
		 * @generated
		 */
		EClass MREAL_PARAMETER_SINGLE_EXPRESSION = eINSTANCE.getMRealParameterSingleExpression();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MREAL_PARAMETER_SINGLE_EXPRESSION__RANGE = eINSTANCE.getMRealParameterSingleExpression_Range();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterRangeImpl <em>MParameterRange</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterRangeImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterRange()
		 * @generated
		 */
		EClass MPARAMETER_RANGE = eINSTANCE.getMParameterRange();

		/**
		 * The meta object literal for the '<em><b>LowerValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_RANGE__LOWER_VALUE = eINSTANCE.getMParameterRange_LowerValue();

		/**
		 * The meta object literal for the '<em><b>UpperValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_RANGE__UPPER_VALUE = eINSTANCE.getMParameterRange_UpperValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterOORImpl <em>MParameterOOR</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterOORImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterOOR()
		 * @generated
		 */
		EClass MPARAMETER_OOR = eINSTANCE.getMParameterOOR();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterOCRImpl <em>MParameterOCR</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterOCRImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterOCR()
		 * @generated
		 */
		EClass MPARAMETER_OCR = eINSTANCE.getMParameterOCR();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterCCRImpl <em>MParameterCCR</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterCCRImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterCCR()
		 * @generated
		 */
		EClass MPARAMETER_CCR = eINSTANCE.getMParameterCCR();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterCORImpl <em>MParameterCOR</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterCORImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterCOR()
		 * @generated
		 */
		EClass MPARAMETER_COR = eINSTANCE.getMParameterCOR();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParamIntegerLiteralImpl <em>MEnumParamIntegerLiteral</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MEnumParamIntegerLiteralImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParamIntegerLiteral()
		 * @generated
		 */
		EClass MENUM_PARAM_INTEGER_LITERAL = eINSTANCE.getMEnumParamIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MENUM_PARAM_INTEGER_LITERAL__VALUE = eINSTANCE.getMEnumParamIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParamRealLiteralImpl <em>MEnumParamRealLiteral</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MEnumParamRealLiteralImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParamRealLiteral()
		 * @generated
		 */
		EClass MENUM_PARAM_REAL_LITERAL = eINSTANCE.getMEnumParamRealLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MENUM_PARAM_REAL_LITERAL__VALUE = eINSTANCE.getMEnumParamRealLiteral_Value();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MEnumParamStringLiteralImpl <em>MEnumParamStringLiteral</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MEnumParamStringLiteralImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMEnumParamStringLiteral()
		 * @generated
		 */
		EClass MENUM_PARAM_STRING_LITERAL = eINSTANCE.getMEnumParamStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MENUM_PARAM_STRING_LITERAL__VALUE = eINSTANCE.getMEnumParamStringLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>IsRaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENUM_PARAM_STRING_LITERAL__IS_RAW = eINSTANCE.getMEnumParamStringLiteral_IsRaw();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueImpl <em>MParameterValue</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValue()
		 * @generated
		 */
		EClass MPARAMETER_VALUE = eINSTANCE.getMParameterValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueLiteralImpl <em>MParameterValueLiteral</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueLiteralImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueLiteral()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_LITERAL = eINSTANCE.getMParameterValueLiteral();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueIntegerLiteralImpl <em>MParameterValueIntegerLiteral</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueIntegerLiteralImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueIntegerLiteral()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_INTEGER_LITERAL = eINSTANCE.getMParameterValueIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MPARAMETER_VALUE_INTEGER_LITERAL__VALUE = eINSTANCE.getMParameterValueIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueRealLiteralImpl <em>MParameterValueRealLiteral</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueRealLiteralImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueRealLiteral()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_REAL_LITERAL = eINSTANCE.getMParameterValueRealLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MPARAMETER_VALUE_REAL_LITERAL__VALUE = eINSTANCE.getMParameterValueRealLiteral_Value();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueBooleanLiteralImpl <em>MParameterValueBooleanLiteral</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueBooleanLiteralImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueBooleanLiteral()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_BOOLEAN_LITERAL = eINSTANCE.getMParameterValueBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MPARAMETER_VALUE_BOOLEAN_LITERAL__VALUE = eINSTANCE.getMParameterValueBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueStringLiteralImpl <em>MParameterValueStringLiteral</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueStringLiteralImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueStringLiteral()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_STRING_LITERAL = eINSTANCE.getMParameterValueStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MPARAMETER_VALUE_STRING_LITERAL__VALUE = eINSTANCE.getMParameterValueStringLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>IsRaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPARAMETER_VALUE_STRING_LITERAL__IS_RAW = eINSTANCE.getMParameterValueStringLiteral_IsRaw();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueRefObjectImpl <em>MParameterValueRef Object</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueRefObjectImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueRefObject()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_REF_OBJECT = eINSTANCE.getMParameterValueRefObject();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_REF_OBJECT__OBJECT = eINSTANCE.getMParameterValueRefObject_Object();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueExpressionImpl <em>MParameterValueExpression</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueExpressionImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueExpression()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_EXPRESSION = eINSTANCE.getMParameterValueExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_EXPRESSION__LEFT = eINSTANCE.getMParameterValueExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MPARAMETER_VALUE_EXPRESSION__OPERATION = eINSTANCE.getMParameterValueExpression_Operation();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_EXPRESSION__RIGHT = eINSTANCE.getMParameterValueExpression_Right();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueTERMImpl <em>MParameterValueTERM</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueTERMImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueTERM()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_TERM = eINSTANCE.getMParameterValueTERM();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_TERM__LEFT = eINSTANCE.getMParameterValueTERM_Left();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * @generated
		 */
		EAttribute MPARAMETER_VALUE_TERM__OPERATION = eINSTANCE.getMParameterValueTERM_Operation();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_TERM__RIGHT = eINSTANCE.getMParameterValueTERM_Right();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValuePARImpl <em>MParameterValuePAR</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValuePARImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValuePAR()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_PAR = eINSTANCE.getMParameterValuePAR();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_PAR__VALUE = eINSTANCE.getMParameterValuePAR_Value();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueAssignmentImpl <em>MParameterValueAssignment</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueAssignmentImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueAssignment()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_ASSIGNMENT = eINSTANCE.getMParameterValueAssignment();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_ASSIGNMENT__PARAMETER = eINSTANCE.getMParameterValueAssignment_Parameter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueAssignmentSingleExpressionImpl <em>MParameterValueAssignmentSingleExpression</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueAssignmentSingleExpressionImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueAssignmentSingleExpression()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_ASSIGNMENT_SINGLE_EXPRESSION = eINSTANCE.getMParameterValueAssignmentSingleExpression();

		/**
		 * The meta object literal for the '<em><b>ParameterValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_ASSIGNMENT_SINGLE_EXPRESSION__PARAMETER_VALUE = eINSTANCE.getMParameterValueAssignmentSingleExpression_ParameterValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueRangeImpl <em>MParameterValueRange</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueRangeImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueRange()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_RANGE = eINSTANCE.getMParameterValueRange();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_RANGE__PARAMETER = eINSTANCE.getMParameterValueRange_Parameter();

		/**
		 * The meta object literal for the '<em><b>ParameterValue</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_RANGE__PARAMETER_VALUE = eINSTANCE.getMParameterValueRange_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_RANGE__RANGE = eINSTANCE.getMParameterValueRange_Range();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueDependentItemImpl <em>MParameterValueDependentItem</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueDependentItemImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueDependentItem()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_DEPENDENT_ITEM = eINSTANCE.getMParameterValueDependentItem();

		/**
		 * The meta object literal for the '<em><b>Ranges</b></em>' containment reference feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_DEPENDENT_ITEM__RANGES = eINSTANCE.getMParameterValueDependentItem_Ranges();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.impl.MParameterValueDependentItemsListImpl <em>MParameterValueDependentItemsList</em>}' class.
		 * @see es.uah.aut.srg.micobs.common.impl.MParameterValueDependentItemsListImpl
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueDependentItemsList()
		 * @generated
		 */
		EClass MPARAMETER_VALUE_DEPENDENT_ITEMS_LIST = eINSTANCE.getMParameterValueDependentItemsList();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * @generated
		 */
		EReference MPARAMETER_VALUE_DEPENDENT_ITEMS_LIST__ITEMS = eINSTANCE.getMParameterValueDependentItemsList_Items();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.MParameterValueExpressionOperators <em>MParameterValueExpressionOperators</em>}' enum.
		 * @see es.uah.aut.srg.micobs.common.MParameterValueExpressionOperators
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueExpressionOperators()
		 * @generated
		 */
		EEnum MPARAMETER_VALUE_EXPRESSION_OPERATORS = eINSTANCE.getMParameterValueExpressionOperators();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.micobs.common.MParameterValueTERMOperators <em>MParameterValueTERMOperators</em>}' enum.
		 * @see es.uah.aut.srg.micobs.common.MParameterValueTERMOperators
		 * @see es.uah.aut.srg.micobs.common.impl.commonPackageImpl#getMParameterValueTERMOperators()
		 * @generated
		 */
		EEnum MPARAMETER_VALUE_TERM_OPERATORS = eINSTANCE.getMParameterValueTERMOperators();

	}

}
