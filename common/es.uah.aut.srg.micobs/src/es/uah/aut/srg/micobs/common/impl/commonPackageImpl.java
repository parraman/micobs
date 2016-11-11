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
package es.uah.aut.srg.micobs.common.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import es.uah.aut.srg.micobs.common.MBooleanParameter;
import es.uah.aut.srg.micobs.common.MBooleanParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MEnumParamIntegerLiteral;
import es.uah.aut.srg.micobs.common.MEnumParamRealLiteral;
import es.uah.aut.srg.micobs.common.MEnumParamStringLiteral;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MEnumParameterLiteral;
import es.uah.aut.srg.micobs.common.MEnumParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MIntegerParameter;
import es.uah.aut.srg.micobs.common.MIntegerParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterCCR;
import es.uah.aut.srg.micobs.common.MParameterCOR;
import es.uah.aut.srg.micobs.common.MParameterDefaultValueSingleExpression;
import es.uah.aut.srg.micobs.common.MParameterOCR;
import es.uah.aut.srg.micobs.common.MParameterOOR;
import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.common.MParameterValue;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueAssignmentSingleExpression;
import es.uah.aut.srg.micobs.common.MParameterValueBooleanLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueDependentItem;
import es.uah.aut.srg.micobs.common.MParameterValueDependentItemsList;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.MParameterValueExpressionOperators;
import es.uah.aut.srg.micobs.common.MParameterValueIntegerLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueLiteral;
import es.uah.aut.srg.micobs.common.MParameterValuePAR;
import es.uah.aut.srg.micobs.common.MParameterValueRange;
import es.uah.aut.srg.micobs.common.MParameterValueRealLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueRefObject;
import es.uah.aut.srg.micobs.common.MParameterValueStringLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueTERM;
import es.uah.aut.srg.micobs.common.MParameterValueTERMOperators;
import es.uah.aut.srg.micobs.common.MRealParameter;
import es.uah.aut.srg.micobs.common.MRealParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MStringParameter;
import es.uah.aut.srg.micobs.common.MStringParameterSingleExpression;
import es.uah.aut.srg.micobs.common.commonFactory;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class commonPackageImpl extends EPackageImpl implements commonPackage {
	/**
	 * @generated
	 */
	private EClass mCommonPackageEClass = null;

	/**
	 * @generated
	 */
	private EClass mCommonPackageFileEClass = null;

	/**
	 * @generated
	 */
	private EClass mCommonPackageElementEClass = null;

	/**
	 * @generated
	 */
	private EClass mCommonPackageItemEClass = null;

	/**
	 * @generated
	 */
	private EClass mCommonPackageVersionedItemEClass = null;

	/**
	 * @generated
	 */
	private EClass mCommonLibraryEClass = null;

	/**
	 * @generated
	 */
	private EClass mCommonPackageReferencingElementEClass = null;

	/**
	 * @generated
	 */
	private EClass mCommonPackageParametricReferencingElementEClass = null;

	/**
	 * @generated
	 */
	private EClass mCommonReferenceableObjEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterDefaultValueSingleExpressionEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParameterDefinitionEClass = null;

	/**
	 * @generated
	 */
	private EClass mBooleanParameterEClass = null;

	/**
	 * @generated
	 */
	private EClass mBooleanParameterSingleExpressionEClass = null;

	/**
	 * @generated
	 */
	private EClass mStringParameterEClass = null;

	/**
	 * @generated
	 */
	private EClass mStringParameterSingleExpressionEClass = null;

	/**
	 * @generated
	 */
	private EClass mIntegerParameterEClass = null;

	/**
	 * @generated
	 */
	private EClass mIntegerParameterSingleExpressionEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParameterEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParameterSingleExpressionEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParameterLiteralEClass = null;

	/**
	 * @generated
	 */
	private EClass mRealParameterEClass = null;

	/**
	 * @generated
	 */
	private EClass mRealParameterSingleExpressionEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterRangeEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterOOREClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterOCREClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterCCREClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterCOREClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamIntegerLiteralEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamRealLiteralEClass = null;

	/**
	 * @generated
	 */
	private EClass mEnumParamStringLiteralEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueLiteralEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueIntegerLiteralEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueRealLiteralEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueBooleanLiteralEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueStringLiteralEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueRefObjectEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueExpressionEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueTERMEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValuePAREClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueAssignmentEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueAssignmentSingleExpressionEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueRangeEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueDependentItemEClass = null;

	/**
	 * @generated
	 */
	private EClass mParameterValueDependentItemsListEClass = null;

	/**
	 * @generated
	 */
	private EEnum mParameterValueExpressionOperatorsEEnum = null;

	/**
	 * @generated
	 */
	private EEnum mParameterValueTERMOperatorsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.micobs.common.commonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private commonPackageImpl() {
		super(eNS_URI, commonFactory.eINSTANCE);
	}

	/**
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link commonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static commonPackage init() {
		if (isInited) return (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);

		// Obtain or create and register package
		commonPackageImpl thecommonPackage = (commonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof commonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new commonPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thecommonPackage.createPackageContents();

		// Initialize created meta-data
		thecommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(commonPackage.eNS_URI, thecommonPackage);
		return thecommonPackage;
	}

	/**
	 * @generated
	 */
	public EClass getMCommonPackage() {
		return mCommonPackageEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMCommonPackage_Uri() {
		return (EAttribute)mCommonPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMCommonPackage_Items() {
		return (EReference)mCommonPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMCommonPackageFile() {
		return mCommonPackageFileEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMCommonPackageFile_Package() {
		return (EReference)mCommonPackageFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMCommonPackageFile_Imports() {
		return (EReference)mCommonPackageFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMCommonPackageFile_Element() {
		return (EReference)mCommonPackageFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMCommonPackageElement() {
		return mCommonPackageElementEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMCommonPackageElement_Version() {
		return (EAttribute)mCommonPackageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMCommonPackageElement_Name() {
		return (EAttribute)mCommonPackageElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EAttribute getMCommonPackageElement_Uri() {
		return (EAttribute)mCommonPackageElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMCommonPackageItem() {
		return mCommonPackageItemEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMCommonPackageItem_VersionedItems() {
		return (EReference)mCommonPackageItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMCommonPackageItem_Uri() {
		return (EAttribute)mCommonPackageItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMCommonPackageVersionedItem() {
		return mCommonPackageVersionedItemEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMCommonPackageVersionedItem_LocalModelURI() {
		return (EAttribute)mCommonPackageVersionedItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMCommonPackageVersionedItem_RemoteModelURI() {
		return (EAttribute)mCommonPackageVersionedItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EAttribute getMCommonPackageVersionedItem_RepositoryFolderURI() {
		return (EAttribute)mCommonPackageVersionedItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EAttribute getMCommonPackageVersionedItem_Version() {
		return (EAttribute)mCommonPackageVersionedItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated
	 */
	public EClass getMCommonLibrary() {
		return mCommonLibraryEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMCommonLibrary_Packages() {
		return (EReference)mCommonLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMCommonPackageReferencingElement() {
		return mCommonPackageReferencingElementEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMCommonPackageReferencingElement_ReferencedElement() {
		return (EReference)mCommonPackageReferencingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMCommonPackageParametricReferencingElement() {
		return mCommonPackageParametricReferencingElementEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMCommonPackageParametricReferencingElement_ReferencedElement() {
		return (EReference)mCommonPackageParametricReferencingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMCommonPackageParametricReferencingElement_ParameterElement() {
		return (EReference)mCommonPackageParametricReferencingElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMCommonReferenceableObj() {
		return mCommonReferenceableObjEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMCommonReferenceableObj_Name() {
		return (EAttribute)mCommonReferenceableObjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMCommonReferenceableObj_Description() {
		return (EAttribute)mCommonReferenceableObjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMParameter() {
		return mParameterEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMParameter_Constant() {
		return (EAttribute)mParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterDefaultValueSingleExpression() {
		return mParameterDefaultValueSingleExpressionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterDefaultValueSingleExpression_DefaultValue() {
		return (EReference)mParameterDefaultValueSingleExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParameterDefinition() {
		return mEnumParameterDefinitionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMEnumParameterDefinition_Literals() {
		return (EReference)mEnumParameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMBooleanParameter() {
		return mBooleanParameterEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMBooleanParameterSingleExpression() {
		return mBooleanParameterSingleExpressionEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMStringParameter() {
		return mStringParameterEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMStringParameterSingleExpression() {
		return mStringParameterSingleExpressionEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIntegerParameter() {
		return mIntegerParameterEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMIntegerParameterSingleExpression() {
		return mIntegerParameterSingleExpressionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMIntegerParameterSingleExpression_Range() {
		return (EReference)mIntegerParameterSingleExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParameter() {
		return mEnumParameterEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMEnumParameter_EnumDefinition() {
		return (EReference)mEnumParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParameterSingleExpression() {
		return mEnumParameterSingleExpressionEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParameterLiteral() {
		return mEnumParameterLiteralEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMRealParameter() {
		return mRealParameterEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMRealParameterSingleExpression() {
		return mRealParameterSingleExpressionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMRealParameterSingleExpression_Range() {
		return (EReference)mRealParameterSingleExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterRange() {
		return mParameterRangeEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterRange_LowerValue() {
		return (EReference)mParameterRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMParameterRange_UpperValue() {
		return (EReference)mParameterRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterOOR() {
		return mParameterOOREClass;
	}

	/**
	 * @generated
	 */
	public EClass getMParameterOCR() {
		return mParameterOCREClass;
	}

	/**
	 * @generated
	 */
	public EClass getMParameterCCR() {
		return mParameterCCREClass;
	}

	/**
	 * @generated
	 */
	public EClass getMParameterCOR() {
		return mParameterCOREClass;
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamIntegerLiteral() {
		return mEnumParamIntegerLiteralEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMEnumParamIntegerLiteral_Value() {
		return (EAttribute)mEnumParamIntegerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamRealLiteral() {
		return mEnumParamRealLiteralEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMEnumParamRealLiteral_Value() {
		return (EAttribute)mEnumParamRealLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMEnumParamStringLiteral() {
		return mEnumParamStringLiteralEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMEnumParamStringLiteral_Value() {
		return (EAttribute)mEnumParamStringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMEnumParamStringLiteral_IsRaw() {
		return (EAttribute)mEnumParamStringLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValue() {
		return mParameterValueEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueLiteral() {
		return mParameterValueLiteralEClass;
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueIntegerLiteral() {
		return mParameterValueIntegerLiteralEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMParameterValueIntegerLiteral_Value() {
		return (EAttribute)mParameterValueIntegerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueRealLiteral() {
		return mParameterValueRealLiteralEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMParameterValueRealLiteral_Value() {
		return (EAttribute)mParameterValueRealLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueBooleanLiteral() {
		return mParameterValueBooleanLiteralEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMParameterValueBooleanLiteral_Value() {
		return (EAttribute)mParameterValueBooleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueStringLiteral() {
		return mParameterValueStringLiteralEClass;
	}

	/**
	 * @generated
	 */
	public EAttribute getMParameterValueStringLiteral_Value() {
		return (EAttribute)mParameterValueStringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMParameterValueStringLiteral_IsRaw() {
		return (EAttribute)mParameterValueStringLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueRefObject() {
		return mParameterValueRefObjectEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValueRefObject_Object() {
		return (EReference)mParameterValueRefObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueExpression() {
		return mParameterValueExpressionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValueExpression_Left() {
		return (EReference)mParameterValueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMParameterValueExpression_Operation() {
		return (EAttribute)mParameterValueExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValueExpression_Right() {
		return (EReference)mParameterValueExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueTERM() {
		return mParameterValueTERMEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValueTERM_Left() {
		return (EReference)mParameterValueTERMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EAttribute getMParameterValueTERM_Operation() {
		return (EAttribute)mParameterValueTERMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValueTERM_Right() {
		return (EReference)mParameterValueTERMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValuePAR() {
		return mParameterValuePAREClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValuePAR_Value() {
		return (EReference)mParameterValuePAREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueAssignment() {
		return mParameterValueAssignmentEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValueAssignment_Parameter() {
		return (EReference)mParameterValueAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueAssignmentSingleExpression() {
		return mParameterValueAssignmentSingleExpressionEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValueAssignmentSingleExpression_ParameterValue() {
		return (EReference)mParameterValueAssignmentSingleExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueRange() {
		return mParameterValueRangeEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValueRange_Parameter() {
		return (EReference)mParameterValueRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValueRange_ParameterValue() {
		return (EReference)mParameterValueRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValueRange_Range() {
		return (EReference)mParameterValueRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueDependentItem() {
		return mParameterValueDependentItemEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValueDependentItem_Ranges() {
		return (EReference)mParameterValueDependentItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EClass getMParameterValueDependentItemsList() {
		return mParameterValueDependentItemsListEClass;
	}

	/**
	 * @generated
	 */
	public EReference getMParameterValueDependentItemsList_Items() {
		return (EReference)mParameterValueDependentItemsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated
	 */
	public EEnum getMParameterValueExpressionOperators() {
		return mParameterValueExpressionOperatorsEEnum;
	}

	/**
	 * @generated
	 */
	public EEnum getMParameterValueTERMOperators() {
		return mParameterValueTERMOperatorsEEnum;
	}

	/**
	 * @generated
	 */
	public commonFactory getcommonFactory() {
		return (commonFactory)getEFactoryInstance();
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
		mCommonPackageEClass = createEClass(MCOMMON_PACKAGE);
		createEAttribute(mCommonPackageEClass, MCOMMON_PACKAGE__URI);
		createEReference(mCommonPackageEClass, MCOMMON_PACKAGE__ITEMS);

		mCommonPackageFileEClass = createEClass(MCOMMON_PACKAGE_FILE);
		createEReference(mCommonPackageFileEClass, MCOMMON_PACKAGE_FILE__PACKAGE);
		createEReference(mCommonPackageFileEClass, MCOMMON_PACKAGE_FILE__IMPORTS);
		createEReference(mCommonPackageFileEClass, MCOMMON_PACKAGE_FILE__ELEMENT);

		mCommonPackageElementEClass = createEClass(MCOMMON_PACKAGE_ELEMENT);
		createEAttribute(mCommonPackageElementEClass, MCOMMON_PACKAGE_ELEMENT__VERSION);
		createEAttribute(mCommonPackageElementEClass, MCOMMON_PACKAGE_ELEMENT__NAME);
		createEAttribute(mCommonPackageElementEClass, MCOMMON_PACKAGE_ELEMENT__URI);

		mCommonPackageItemEClass = createEClass(MCOMMON_PACKAGE_ITEM);
		createEReference(mCommonPackageItemEClass, MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS);
		createEAttribute(mCommonPackageItemEClass, MCOMMON_PACKAGE_ITEM__URI);

		mCommonPackageVersionedItemEClass = createEClass(MCOMMON_PACKAGE_VERSIONED_ITEM);
		createEAttribute(mCommonPackageVersionedItemEClass, MCOMMON_PACKAGE_VERSIONED_ITEM__LOCAL_MODEL_URI);
		createEAttribute(mCommonPackageVersionedItemEClass, MCOMMON_PACKAGE_VERSIONED_ITEM__REMOTE_MODEL_URI);
		createEAttribute(mCommonPackageVersionedItemEClass, MCOMMON_PACKAGE_VERSIONED_ITEM__REPOSITORY_FOLDER_URI);
		createEAttribute(mCommonPackageVersionedItemEClass, MCOMMON_PACKAGE_VERSIONED_ITEM__VERSION);

		mCommonLibraryEClass = createEClass(MCOMMON_LIBRARY);
		createEReference(mCommonLibraryEClass, MCOMMON_LIBRARY__PACKAGES);

		mCommonPackageReferencingElementEClass = createEClass(MCOMMON_PACKAGE_REFERENCING_ELEMENT);
		createEReference(mCommonPackageReferencingElementEClass, MCOMMON_PACKAGE_REFERENCING_ELEMENT__REFERENCED_ELEMENT);

		mCommonPackageParametricReferencingElementEClass = createEClass(MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT);
		createEReference(mCommonPackageParametricReferencingElementEClass, MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__REFERENCED_ELEMENT);
		createEReference(mCommonPackageParametricReferencingElementEClass, MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT__PARAMETER_ELEMENT);

		mCommonReferenceableObjEClass = createEClass(MCOMMON_REFERENCEABLE_OBJ);
		createEAttribute(mCommonReferenceableObjEClass, MCOMMON_REFERENCEABLE_OBJ__NAME);
		createEAttribute(mCommonReferenceableObjEClass, MCOMMON_REFERENCEABLE_OBJ__DESCRIPTION);

		mParameterEClass = createEClass(MPARAMETER);
		createEAttribute(mParameterEClass, MPARAMETER__CONSTANT);

		mParameterDefaultValueSingleExpressionEClass = createEClass(MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION);
		createEReference(mParameterDefaultValueSingleExpressionEClass, MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION__DEFAULT_VALUE);

		mEnumParameterDefinitionEClass = createEClass(MENUM_PARAMETER_DEFINITION);
		createEReference(mEnumParameterDefinitionEClass, MENUM_PARAMETER_DEFINITION__LITERALS);

		mBooleanParameterEClass = createEClass(MBOOLEAN_PARAMETER);

		mBooleanParameterSingleExpressionEClass = createEClass(MBOOLEAN_PARAMETER_SINGLE_EXPRESSION);

		mStringParameterEClass = createEClass(MSTRING_PARAMETER);

		mStringParameterSingleExpressionEClass = createEClass(MSTRING_PARAMETER_SINGLE_EXPRESSION);

		mIntegerParameterEClass = createEClass(MINTEGER_PARAMETER);

		mIntegerParameterSingleExpressionEClass = createEClass(MINTEGER_PARAMETER_SINGLE_EXPRESSION);
		createEReference(mIntegerParameterSingleExpressionEClass, MINTEGER_PARAMETER_SINGLE_EXPRESSION__RANGE);

		mEnumParameterEClass = createEClass(MENUM_PARAMETER);
		createEReference(mEnumParameterEClass, MENUM_PARAMETER__ENUM_DEFINITION);

		mEnumParameterSingleExpressionEClass = createEClass(MENUM_PARAMETER_SINGLE_EXPRESSION);

		mEnumParameterLiteralEClass = createEClass(MENUM_PARAMETER_LITERAL);

		mRealParameterEClass = createEClass(MREAL_PARAMETER);

		mRealParameterSingleExpressionEClass = createEClass(MREAL_PARAMETER_SINGLE_EXPRESSION);
		createEReference(mRealParameterSingleExpressionEClass, MREAL_PARAMETER_SINGLE_EXPRESSION__RANGE);

		mParameterRangeEClass = createEClass(MPARAMETER_RANGE);
		createEReference(mParameterRangeEClass, MPARAMETER_RANGE__LOWER_VALUE);
		createEReference(mParameterRangeEClass, MPARAMETER_RANGE__UPPER_VALUE);

		mParameterOOREClass = createEClass(MPARAMETER_OOR);

		mParameterOCREClass = createEClass(MPARAMETER_OCR);

		mParameterCCREClass = createEClass(MPARAMETER_CCR);

		mParameterCOREClass = createEClass(MPARAMETER_COR);

		mEnumParamIntegerLiteralEClass = createEClass(MENUM_PARAM_INTEGER_LITERAL);
		createEAttribute(mEnumParamIntegerLiteralEClass, MENUM_PARAM_INTEGER_LITERAL__VALUE);

		mEnumParamRealLiteralEClass = createEClass(MENUM_PARAM_REAL_LITERAL);
		createEAttribute(mEnumParamRealLiteralEClass, MENUM_PARAM_REAL_LITERAL__VALUE);

		mEnumParamStringLiteralEClass = createEClass(MENUM_PARAM_STRING_LITERAL);
		createEAttribute(mEnumParamStringLiteralEClass, MENUM_PARAM_STRING_LITERAL__VALUE);
		createEAttribute(mEnumParamStringLiteralEClass, MENUM_PARAM_STRING_LITERAL__IS_RAW);

		mParameterValueEClass = createEClass(MPARAMETER_VALUE);

		mParameterValueLiteralEClass = createEClass(MPARAMETER_VALUE_LITERAL);

		mParameterValueIntegerLiteralEClass = createEClass(MPARAMETER_VALUE_INTEGER_LITERAL);
		createEAttribute(mParameterValueIntegerLiteralEClass, MPARAMETER_VALUE_INTEGER_LITERAL__VALUE);

		mParameterValueRealLiteralEClass = createEClass(MPARAMETER_VALUE_REAL_LITERAL);
		createEAttribute(mParameterValueRealLiteralEClass, MPARAMETER_VALUE_REAL_LITERAL__VALUE);

		mParameterValueBooleanLiteralEClass = createEClass(MPARAMETER_VALUE_BOOLEAN_LITERAL);
		createEAttribute(mParameterValueBooleanLiteralEClass, MPARAMETER_VALUE_BOOLEAN_LITERAL__VALUE);

		mParameterValueStringLiteralEClass = createEClass(MPARAMETER_VALUE_STRING_LITERAL);
		createEAttribute(mParameterValueStringLiteralEClass, MPARAMETER_VALUE_STRING_LITERAL__VALUE);
		createEAttribute(mParameterValueStringLiteralEClass, MPARAMETER_VALUE_STRING_LITERAL__IS_RAW);

		mParameterValueRefObjectEClass = createEClass(MPARAMETER_VALUE_REF_OBJECT);
		createEReference(mParameterValueRefObjectEClass, MPARAMETER_VALUE_REF_OBJECT__OBJECT);

		mParameterValueExpressionEClass = createEClass(MPARAMETER_VALUE_EXPRESSION);
		createEReference(mParameterValueExpressionEClass, MPARAMETER_VALUE_EXPRESSION__LEFT);
		createEAttribute(mParameterValueExpressionEClass, MPARAMETER_VALUE_EXPRESSION__OPERATION);
		createEReference(mParameterValueExpressionEClass, MPARAMETER_VALUE_EXPRESSION__RIGHT);

		mParameterValueTERMEClass = createEClass(MPARAMETER_VALUE_TERM);
		createEReference(mParameterValueTERMEClass, MPARAMETER_VALUE_TERM__LEFT);
		createEAttribute(mParameterValueTERMEClass, MPARAMETER_VALUE_TERM__OPERATION);
		createEReference(mParameterValueTERMEClass, MPARAMETER_VALUE_TERM__RIGHT);

		mParameterValuePAREClass = createEClass(MPARAMETER_VALUE_PAR);
		createEReference(mParameterValuePAREClass, MPARAMETER_VALUE_PAR__VALUE);

		mParameterValueAssignmentEClass = createEClass(MPARAMETER_VALUE_ASSIGNMENT);
		createEReference(mParameterValueAssignmentEClass, MPARAMETER_VALUE_ASSIGNMENT__PARAMETER);

		mParameterValueAssignmentSingleExpressionEClass = createEClass(MPARAMETER_VALUE_ASSIGNMENT_SINGLE_EXPRESSION);
		createEReference(mParameterValueAssignmentSingleExpressionEClass, MPARAMETER_VALUE_ASSIGNMENT_SINGLE_EXPRESSION__PARAMETER_VALUE);

		mParameterValueRangeEClass = createEClass(MPARAMETER_VALUE_RANGE);
		createEReference(mParameterValueRangeEClass, MPARAMETER_VALUE_RANGE__PARAMETER);
		createEReference(mParameterValueRangeEClass, MPARAMETER_VALUE_RANGE__PARAMETER_VALUE);
		createEReference(mParameterValueRangeEClass, MPARAMETER_VALUE_RANGE__RANGE);

		mParameterValueDependentItemEClass = createEClass(MPARAMETER_VALUE_DEPENDENT_ITEM);
		createEReference(mParameterValueDependentItemEClass, MPARAMETER_VALUE_DEPENDENT_ITEM__RANGES);

		mParameterValueDependentItemsListEClass = createEClass(MPARAMETER_VALUE_DEPENDENT_ITEMS_LIST);
		createEReference(mParameterValueDependentItemsListEClass, MPARAMETER_VALUE_DEPENDENT_ITEMS_LIST__ITEMS);

		// Create enums
		mParameterValueExpressionOperatorsEEnum = createEEnum(MPARAMETER_VALUE_EXPRESSION_OPERATORS);
		mParameterValueTERMOperatorsEEnum = createEEnum(MPARAMETER_VALUE_TERM_OPERATORS);
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
		mCommonPackageReferencingElementEClass.getESuperTypes().add(this.getMCommonPackageElement());
		mCommonPackageParametricReferencingElementEClass.getESuperTypes().add(this.getMCommonPackageElement());
		mParameterEClass.getESuperTypes().add(this.getMCommonReferenceableObj());
		mParameterDefaultValueSingleExpressionEClass.getESuperTypes().add(this.getMParameter());
		mEnumParameterDefinitionEClass.getESuperTypes().add(this.getMParameter());
		mBooleanParameterEClass.getESuperTypes().add(this.getMParameter());
		mBooleanParameterSingleExpressionEClass.getESuperTypes().add(this.getMBooleanParameter());
		mBooleanParameterSingleExpressionEClass.getESuperTypes().add(this.getMParameterDefaultValueSingleExpression());
		mStringParameterEClass.getESuperTypes().add(this.getMParameter());
		mStringParameterSingleExpressionEClass.getESuperTypes().add(this.getMStringParameter());
		mStringParameterSingleExpressionEClass.getESuperTypes().add(this.getMParameterDefaultValueSingleExpression());
		mIntegerParameterEClass.getESuperTypes().add(this.getMParameter());
		mIntegerParameterSingleExpressionEClass.getESuperTypes().add(this.getMIntegerParameter());
		mIntegerParameterSingleExpressionEClass.getESuperTypes().add(this.getMParameterDefaultValueSingleExpression());
		mEnumParameterEClass.getESuperTypes().add(this.getMParameter());
		mEnumParameterSingleExpressionEClass.getESuperTypes().add(this.getMEnumParameter());
		mEnumParameterSingleExpressionEClass.getESuperTypes().add(this.getMParameterDefaultValueSingleExpression());
		mEnumParameterLiteralEClass.getESuperTypes().add(this.getMCommonReferenceableObj());
		mRealParameterEClass.getESuperTypes().add(this.getMParameter());
		mRealParameterSingleExpressionEClass.getESuperTypes().add(this.getMRealParameter());
		mRealParameterSingleExpressionEClass.getESuperTypes().add(this.getMParameterDefaultValueSingleExpression());
		mParameterOOREClass.getESuperTypes().add(this.getMParameterRange());
		mParameterOCREClass.getESuperTypes().add(this.getMParameterRange());
		mParameterCCREClass.getESuperTypes().add(this.getMParameterRange());
		mParameterCOREClass.getESuperTypes().add(this.getMParameterRange());
		mEnumParamIntegerLiteralEClass.getESuperTypes().add(this.getMEnumParameterLiteral());
		mEnumParamRealLiteralEClass.getESuperTypes().add(this.getMEnumParameterLiteral());
		mEnumParamStringLiteralEClass.getESuperTypes().add(this.getMEnumParameterLiteral());
		mParameterValueLiteralEClass.getESuperTypes().add(this.getMParameterValue());
		mParameterValueIntegerLiteralEClass.getESuperTypes().add(this.getMParameterValueLiteral());
		mParameterValueRealLiteralEClass.getESuperTypes().add(this.getMParameterValueLiteral());
		mParameterValueBooleanLiteralEClass.getESuperTypes().add(this.getMParameterValueLiteral());
		mParameterValueStringLiteralEClass.getESuperTypes().add(this.getMParameterValueLiteral());
		mParameterValueRefObjectEClass.getESuperTypes().add(this.getMParameterValue());
		mParameterValuePAREClass.getESuperTypes().add(this.getMParameterValue());
		mParameterValueAssignmentSingleExpressionEClass.getESuperTypes().add(this.getMParameterValueAssignment());

		// Initialize classes, features, and operations; add parameters
		initEClass(mCommonPackageEClass, MCommonPackage.class, "MCommonPackage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMCommonPackage_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, MCommonPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCommonPackage_Items(), this.getMCommonPackageItem(), null, "items", null, 0, -1, MCommonPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mCommonPackageFileEClass, MCommonPackageFile.class, "MCommonPackageFile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMCommonPackageFile_Package(), this.getMCommonPackage(), null, "package", null, 1, 1, MCommonPackageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCommonPackageFile_Imports(), this.getMCommonPackage(), null, "imports", null, 0, -1, MCommonPackageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCommonPackageFile_Element(), this.getMCommonPackageElement(), null, "element", null, 1, 1, MCommonPackageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mCommonPackageElementEClass, MCommonPackageElement.class, "MCommonPackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMCommonPackageElement_Version(), ecorePackage.getEString(), "version", null, 1, 1, MCommonPackageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCommonPackageElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, MCommonPackageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCommonPackageElement_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, MCommonPackageElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mCommonPackageItemEClass, MCommonPackageItem.class, "MCommonPackageItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMCommonPackageItem_VersionedItems(), this.getMCommonPackageVersionedItem(), null, "versionedItems", null, 0, -1, MCommonPackageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCommonPackageItem_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, MCommonPackageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mCommonPackageVersionedItemEClass, MCommonPackageVersionedItem.class, "MCommonPackageVersionedItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMCommonPackageVersionedItem_LocalModelURI(), ecorePackage.getEString(), "localModelURI", null, 1, 1, MCommonPackageVersionedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCommonPackageVersionedItem_RemoteModelURI(), ecorePackage.getEString(), "remoteModelURI", null, 0, 1, MCommonPackageVersionedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCommonPackageVersionedItem_RepositoryFolderURI(), ecorePackage.getEString(), "repositoryFolderURI", null, 0, 1, MCommonPackageVersionedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCommonPackageVersionedItem_Version(), ecorePackage.getEString(), "version", null, 1, 1, MCommonPackageVersionedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mCommonLibraryEClass, MCommonLibrary.class, "MCommonLibrary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMCommonLibrary_Packages(), this.getMCommonPackage(), null, "packages", null, 0, -1, MCommonLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mCommonPackageReferencingElementEClass, MCommonPackageReferencingElement.class, "MCommonPackageReferencingElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMCommonPackageReferencingElement_ReferencedElement(), this.getMCommonPackageElement(), null, "referencedElement", null, 1, 1, MCommonPackageReferencingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mCommonPackageParametricReferencingElementEClass, MCommonPackageParametricReferencingElement.class, "MCommonPackageParametricReferencingElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMCommonPackageParametricReferencingElement_ReferencedElement(), this.getMCommonPackageElement(), null, "referencedElement", null, 1, 1, MCommonPackageParametricReferencingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMCommonPackageParametricReferencingElement_ParameterElement(), this.getMCommonPackageElement(), null, "parameterElement", null, 1, 1, MCommonPackageParametricReferencingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mCommonReferenceableObjEClass, MCommonReferenceableObj.class, "MCommonReferenceableObj", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMCommonReferenceableObj_Name(), ecorePackage.getEString(), "name", null, 1, 1, MCommonReferenceableObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCommonReferenceableObj_Description(), ecorePackage.getEString(), "description", null, 0, 1, MCommonReferenceableObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterEClass, MParameter.class, "MParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMParameter_Constant(), ecorePackage.getEBoolean(), "constant", null, 1, 1, MParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterDefaultValueSingleExpressionEClass, MParameterDefaultValueSingleExpression.class, "MParameterDefaultValueSingleExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterDefaultValueSingleExpression_DefaultValue(), this.getMParameterValueExpression(), null, "defaultValue", null, 1, 1, MParameterDefaultValueSingleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEnumParameterDefinitionEClass, MEnumParameterDefinition.class, "MEnumParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMEnumParameterDefinition_Literals(), this.getMEnumParameterLiteral(), null, "literals", null, 1, -1, MEnumParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mBooleanParameterEClass, MBooleanParameter.class, "MBooleanParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mBooleanParameterSingleExpressionEClass, MBooleanParameterSingleExpression.class, "MBooleanParameterSingleExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mStringParameterEClass, MStringParameter.class, "MStringParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mStringParameterSingleExpressionEClass, MStringParameterSingleExpression.class, "MStringParameterSingleExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mIntegerParameterEClass, MIntegerParameter.class, "MIntegerParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mIntegerParameterSingleExpressionEClass, MIntegerParameterSingleExpression.class, "MIntegerParameterSingleExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMIntegerParameterSingleExpression_Range(), this.getMParameterRange(), null, "range", null, 0, 1, MIntegerParameterSingleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEnumParameterEClass, MEnumParameter.class, "MEnumParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMEnumParameter_EnumDefinition(), this.getMEnumParameterDefinition(), null, "enumDefinition", null, 1, 1, MEnumParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEnumParameterSingleExpressionEClass, MEnumParameterSingleExpression.class, "MEnumParameterSingleExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mEnumParameterLiteralEClass, MEnumParameterLiteral.class, "MEnumParameterLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mRealParameterEClass, MRealParameter.class, "MRealParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mRealParameterSingleExpressionEClass, MRealParameterSingleExpression.class, "MRealParameterSingleExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMRealParameterSingleExpression_Range(), this.getMParameterRange(), null, "range", null, 0, 1, MRealParameterSingleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterRangeEClass, MParameterRange.class, "MParameterRange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterRange_LowerValue(), this.getMParameterValueExpression(), null, "lowerValue", null, 1, 1, MParameterRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMParameterRange_UpperValue(), this.getMParameterValueExpression(), null, "upperValue", null, 1, 1, MParameterRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterOOREClass, MParameterOOR.class, "MParameterOOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mParameterOCREClass, MParameterOCR.class, "MParameterOCR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mParameterCCREClass, MParameterCCR.class, "MParameterCCR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mParameterCOREClass, MParameterCOR.class, "MParameterCOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mEnumParamIntegerLiteralEClass, MEnumParamIntegerLiteral.class, "MEnumParamIntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMEnumParamIntegerLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, MEnumParamIntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEnumParamRealLiteralEClass, MEnumParamRealLiteral.class, "MEnumParamRealLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMEnumParamRealLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, MEnumParamRealLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEnumParamStringLiteralEClass, MEnumParamStringLiteral.class, "MEnumParamStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMEnumParamStringLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, MEnumParamStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMEnumParamStringLiteral_IsRaw(), ecorePackage.getEBoolean(), "isRaw", null, 1, 1, MEnumParamStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValueEClass, MParameterValue.class, "MParameterValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mParameterValueLiteralEClass, MParameterValueLiteral.class, "MParameterValueLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mParameterValueIntegerLiteralEClass, MParameterValueIntegerLiteral.class, "MParameterValueIntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMParameterValueIntegerLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, MParameterValueIntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValueRealLiteralEClass, MParameterValueRealLiteral.class, "MParameterValueRealLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMParameterValueRealLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, MParameterValueRealLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValueBooleanLiteralEClass, MParameterValueBooleanLiteral.class, "MParameterValueBooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMParameterValueBooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, MParameterValueBooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValueStringLiteralEClass, MParameterValueStringLiteral.class, "MParameterValueStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMParameterValueStringLiteral_Value(), ecorePackage.getEString(), "value", null, 1, 1, MParameterValueStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMParameterValueStringLiteral_IsRaw(), ecorePackage.getEBoolean(), "isRaw", null, 1, 1, MParameterValueStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValueRefObjectEClass, MParameterValueRefObject.class, "MParameterValueRefObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterValueRefObject_Object(), this.getMCommonReferenceableObj(), null, "object", null, 1, 1, MParameterValueRefObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValueExpressionEClass, MParameterValueExpression.class, "MParameterValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterValueExpression_Left(), this.getMParameterValueTERM(), null, "left", null, 1, 1, MParameterValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMParameterValueExpression_Operation(), this.getMParameterValueExpressionOperators(), "operation", null, 0, 1, MParameterValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMParameterValueExpression_Right(), this.getMParameterValueExpression(), null, "right", null, 0, 1, MParameterValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValueTERMEClass, MParameterValueTERM.class, "MParameterValueTERM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterValueTERM_Left(), this.getMParameterValue(), null, "left", null, 1, 1, MParameterValueTERM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMParameterValueTERM_Operation(), this.getMParameterValueTERMOperators(), "operation", null, 0, 1, MParameterValueTERM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMParameterValueTERM_Right(), this.getMParameterValueTERM(), null, "right", null, 0, 1, MParameterValueTERM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValuePAREClass, MParameterValuePAR.class, "MParameterValuePAR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterValuePAR_Value(), this.getMParameterValueExpression(), null, "value", null, 1, 1, MParameterValuePAR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValueAssignmentEClass, MParameterValueAssignment.class, "MParameterValueAssignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterValueAssignment_Parameter(), this.getMParameter(), null, "parameter", null, 1, 1, MParameterValueAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValueAssignmentSingleExpressionEClass, MParameterValueAssignmentSingleExpression.class, "MParameterValueAssignmentSingleExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterValueAssignmentSingleExpression_ParameterValue(), this.getMParameterValueExpression(), null, "parameterValue", null, 1, 1, MParameterValueAssignmentSingleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValueRangeEClass, MParameterValueRange.class, "MParameterValueRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterValueRange_Parameter(), this.getMParameter(), null, "parameter", null, 1, 1, MParameterValueRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMParameterValueRange_ParameterValue(), this.getMParameterValueExpression(), null, "parameterValue", null, 0, 1, MParameterValueRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMParameterValueRange_Range(), this.getMParameterRange(), null, "range", null, 0, 1, MParameterValueRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValueDependentItemEClass, MParameterValueDependentItem.class, "MParameterValueDependentItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterValueDependentItem_Ranges(), this.getMParameterValueRange(), null, "ranges", null, 0, -1, MParameterValueDependentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterValueDependentItemsListEClass, MParameterValueDependentItemsList.class, "MParameterValueDependentItemsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMParameterValueDependentItemsList_Items(), this.getMParameterValueDependentItem(), null, "items", null, 1, -1, MParameterValueDependentItemsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mParameterValueExpressionOperatorsEEnum, MParameterValueExpressionOperators.class, "MParameterValueExpressionOperators");
		addEEnumLiteral(mParameterValueExpressionOperatorsEEnum, MParameterValueExpressionOperators.PLUS);
		addEEnumLiteral(mParameterValueExpressionOperatorsEEnum, MParameterValueExpressionOperators.MINUS);

		initEEnum(mParameterValueTERMOperatorsEEnum, MParameterValueTERMOperators.class, "MParameterValueTERMOperators");
		addEEnumLiteral(mParameterValueTERMOperatorsEEnum, MParameterValueTERMOperators.MULT);
		addEEnumLiteral(mParameterValueTERMOperatorsEEnum, MParameterValueTERMOperators.DIV);

		// Create resource
		createResource(eNS_URI);
	}

}
