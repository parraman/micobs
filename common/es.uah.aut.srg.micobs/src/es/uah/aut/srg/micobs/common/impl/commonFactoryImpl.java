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
package es.uah.aut.srg.micobs.common.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import es.uah.aut.srg.micobs.common.MBooleanParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement;
import es.uah.aut.srg.micobs.common.MEnumParamIntegerLiteral;
import es.uah.aut.srg.micobs.common.MEnumParamRealLiteral;
import es.uah.aut.srg.micobs.common.MEnumParamStringLiteral;
import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MEnumParameterLiteral;
import es.uah.aut.srg.micobs.common.MEnumParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MIntegerParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MParameterCCR;
import es.uah.aut.srg.micobs.common.MParameterCOR;
import es.uah.aut.srg.micobs.common.MParameterOCR;
import es.uah.aut.srg.micobs.common.MParameterOOR;
import es.uah.aut.srg.micobs.common.MParameterValueAssignmentSingleExpression;
import es.uah.aut.srg.micobs.common.MParameterValueBooleanLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueDependentItemsList;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.MParameterValueExpressionOperators;
import es.uah.aut.srg.micobs.common.MParameterValueIntegerLiteral;
import es.uah.aut.srg.micobs.common.MParameterValuePAR;
import es.uah.aut.srg.micobs.common.MParameterValueRange;
import es.uah.aut.srg.micobs.common.MParameterValueRealLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueRefObject;
import es.uah.aut.srg.micobs.common.MParameterValueStringLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueTERM;
import es.uah.aut.srg.micobs.common.MParameterValueTERMOperators;
import es.uah.aut.srg.micobs.common.MRealParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MStringParameterSingleExpression;
import es.uah.aut.srg.micobs.common.commonFactory;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class commonFactoryImpl extends EFactoryImpl implements commonFactory {
	/**
	 * Creates the default factory implementation.
	 * @generated
	 */
	public static commonFactory init() {
		try {
			commonFactory thecommonFactory = (commonFactory)EPackage.Registry.INSTANCE.getEFactory(commonPackage.eNS_URI);
			if (thecommonFactory != null) {
				return thecommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new commonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * @generated
	 */
	public commonFactoryImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT: return createMCommonPackageParametricReferencingElement();
			case commonPackage.MENUM_PARAMETER_DEFINITION: return createMEnumParameterDefinition();
			case commonPackage.MBOOLEAN_PARAMETER_SINGLE_EXPRESSION: return createMBooleanParameterSingleExpression();
			case commonPackage.MSTRING_PARAMETER_SINGLE_EXPRESSION: return createMStringParameterSingleExpression();
			case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION: return createMIntegerParameterSingleExpression();
			case commonPackage.MENUM_PARAMETER_SINGLE_EXPRESSION: return createMEnumParameterSingleExpression();
			case commonPackage.MENUM_PARAMETER_LITERAL: return createMEnumParameterLiteral();
			case commonPackage.MREAL_PARAMETER_SINGLE_EXPRESSION: return createMRealParameterSingleExpression();
			case commonPackage.MPARAMETER_OOR: return createMParameterOOR();
			case commonPackage.MPARAMETER_OCR: return createMParameterOCR();
			case commonPackage.MPARAMETER_CCR: return createMParameterCCR();
			case commonPackage.MPARAMETER_COR: return createMParameterCOR();
			case commonPackage.MENUM_PARAM_INTEGER_LITERAL: return createMEnumParamIntegerLiteral();
			case commonPackage.MENUM_PARAM_REAL_LITERAL: return createMEnumParamRealLiteral();
			case commonPackage.MENUM_PARAM_STRING_LITERAL: return createMEnumParamStringLiteral();
			case commonPackage.MPARAMETER_VALUE_INTEGER_LITERAL: return createMParameterValueIntegerLiteral();
			case commonPackage.MPARAMETER_VALUE_REAL_LITERAL: return createMParameterValueRealLiteral();
			case commonPackage.MPARAMETER_VALUE_BOOLEAN_LITERAL: return createMParameterValueBooleanLiteral();
			case commonPackage.MPARAMETER_VALUE_STRING_LITERAL: return createMParameterValueStringLiteral();
			case commonPackage.MPARAMETER_VALUE_REF_OBJECT: return createMParameterValueRefObject();
			case commonPackage.MPARAMETER_VALUE_EXPRESSION: return createMParameterValueExpression();
			case commonPackage.MPARAMETER_VALUE_TERM: return createMParameterValueTERM();
			case commonPackage.MPARAMETER_VALUE_PAR: return createMParameterValuePAR();
			case commonPackage.MPARAMETER_VALUE_ASSIGNMENT_SINGLE_EXPRESSION: return createMParameterValueAssignmentSingleExpression();
			case commonPackage.MPARAMETER_VALUE_RANGE: return createMParameterValueRange();
			case commonPackage.MPARAMETER_VALUE_DEPENDENT_ITEMS_LIST: return createMParameterValueDependentItemsList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case commonPackage.MPARAMETER_VALUE_EXPRESSION_OPERATORS:
				return createMParameterValueExpressionOperatorsFromString(eDataType, initialValue);
			case commonPackage.MPARAMETER_VALUE_TERM_OPERATORS:
				return createMParameterValueTERMOperatorsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case commonPackage.MPARAMETER_VALUE_EXPRESSION_OPERATORS:
				return convertMParameterValueExpressionOperatorsToString(eDataType, instanceValue);
			case commonPackage.MPARAMETER_VALUE_TERM_OPERATORS:
				return convertMParameterValueTERMOperatorsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * @generated
	 */
	public MCommonPackageParametricReferencingElement createMCommonPackageParametricReferencingElement() {
		MCommonPackageParametricReferencingElementImpl mCommonPackageParametricReferencingElement = new MCommonPackageParametricReferencingElementImpl();
		return mCommonPackageParametricReferencingElement;
	}

	/**
	 * @generated
	 */
	public MEnumParameterDefinition createMEnumParameterDefinition() {
		MEnumParameterDefinitionImpl mEnumParameterDefinition = new MEnumParameterDefinitionImpl();
		return mEnumParameterDefinition;
	}

	/**
	 * @generated
	 */
	public MBooleanParameterSingleExpression createMBooleanParameterSingleExpression() {
		MBooleanParameterSingleExpressionImpl mBooleanParameterSingleExpression = new MBooleanParameterSingleExpressionImpl();
		return mBooleanParameterSingleExpression;
	}

	/**
	 * @generated
	 */
	public MStringParameterSingleExpression createMStringParameterSingleExpression() {
		MStringParameterSingleExpressionImpl mStringParameterSingleExpression = new MStringParameterSingleExpressionImpl();
		return mStringParameterSingleExpression;
	}

	/**
	 * @generated
	 */
	public MIntegerParameterSingleExpression createMIntegerParameterSingleExpression() {
		MIntegerParameterSingleExpressionImpl mIntegerParameterSingleExpression = new MIntegerParameterSingleExpressionImpl();
		return mIntegerParameterSingleExpression;
	}

	/**
	 * @generated
	 */
	public MEnumParameterSingleExpression createMEnumParameterSingleExpression() {
		MEnumParameterSingleExpressionImpl mEnumParameterSingleExpression = new MEnumParameterSingleExpressionImpl();
		return mEnumParameterSingleExpression;
	}

	/**
	 * @generated
	 */
	public MEnumParameterLiteral createMEnumParameterLiteral() {
		MEnumParameterLiteralImpl mEnumParameterLiteral = new MEnumParameterLiteralImpl();
		return mEnumParameterLiteral;
	}

	/**
	 * @generated
	 */
	public MRealParameterSingleExpression createMRealParameterSingleExpression() {
		MRealParameterSingleExpressionImpl mRealParameterSingleExpression = new MRealParameterSingleExpressionImpl();
		return mRealParameterSingleExpression;
	}

	/**
	 * @generated
	 */
	public MParameterOOR createMParameterOOR() {
		MParameterOORImpl mParameterOOR = new MParameterOORImpl();
		return mParameterOOR;
	}

	/**
	 * @generated
	 */
	public MParameterOCR createMParameterOCR() {
		MParameterOCRImpl mParameterOCR = new MParameterOCRImpl();
		return mParameterOCR;
	}

	/**
	 * @generated
	 */
	public MParameterCCR createMParameterCCR() {
		MParameterCCRImpl mParameterCCR = new MParameterCCRImpl();
		return mParameterCCR;
	}

	/**
	 * @generated
	 */
	public MParameterCOR createMParameterCOR() {
		MParameterCORImpl mParameterCOR = new MParameterCORImpl();
		return mParameterCOR;
	}

	/**
	 * @generated
	 */
	public MEnumParamIntegerLiteral createMEnumParamIntegerLiteral() {
		MEnumParamIntegerLiteralImpl mEnumParamIntegerLiteral = new MEnumParamIntegerLiteralImpl();
		return mEnumParamIntegerLiteral;
	}

	/**
	 * @generated
	 */
	public MEnumParamRealLiteral createMEnumParamRealLiteral() {
		MEnumParamRealLiteralImpl mEnumParamRealLiteral = new MEnumParamRealLiteralImpl();
		return mEnumParamRealLiteral;
	}

	/**
	 * @generated
	 */
	public MEnumParamStringLiteral createMEnumParamStringLiteral() {
		MEnumParamStringLiteralImpl mEnumParamStringLiteral = new MEnumParamStringLiteralImpl();
		return mEnumParamStringLiteral;
	}

	/**
	 * @generated
	 */
	public MParameterValueIntegerLiteral createMParameterValueIntegerLiteral() {
		MParameterValueIntegerLiteralImpl mParameterValueIntegerLiteral = new MParameterValueIntegerLiteralImpl();
		return mParameterValueIntegerLiteral;
	}

	/**
	 * @generated
	 */
	public MParameterValueRealLiteral createMParameterValueRealLiteral() {
		MParameterValueRealLiteralImpl mParameterValueRealLiteral = new MParameterValueRealLiteralImpl();
		return mParameterValueRealLiteral;
	}

	/**
	 * @generated
	 */
	public MParameterValueBooleanLiteral createMParameterValueBooleanLiteral() {
		MParameterValueBooleanLiteralImpl mParameterValueBooleanLiteral = new MParameterValueBooleanLiteralImpl();
		return mParameterValueBooleanLiteral;
	}

	/**
	 * @generated
	 */
	public MParameterValueStringLiteral createMParameterValueStringLiteral() {
		MParameterValueStringLiteralImpl mParameterValueStringLiteral = new MParameterValueStringLiteralImpl();
		return mParameterValueStringLiteral;
	}

	/**
	 * @generated
	 */
	public MParameterValueRefObject createMParameterValueRefObject() {
		MParameterValueRefObjectImpl mParameterValueRefObject = new MParameterValueRefObjectImpl();
		return mParameterValueRefObject;
	}

	/**
	 * @generated
	 */
	public MParameterValueExpression createMParameterValueExpression() {
		MParameterValueExpressionImpl mParameterValueExpression = new MParameterValueExpressionImpl();
		return mParameterValueExpression;
	}

	/**
	 * @generated
	 */
	public MParameterValueTERM createMParameterValueTERM() {
		MParameterValueTERMImpl mParameterValueTERM = new MParameterValueTERMImpl();
		return mParameterValueTERM;
	}

	/**
	 * @generated
	 */
	public MParameterValuePAR createMParameterValuePAR() {
		MParameterValuePARImpl mParameterValuePAR = new MParameterValuePARImpl();
		return mParameterValuePAR;
	}

	/**
	 * @generated
	 */
	public MParameterValueAssignmentSingleExpression createMParameterValueAssignmentSingleExpression() {
		MParameterValueAssignmentSingleExpressionImpl mParameterValueAssignmentSingleExpression = new MParameterValueAssignmentSingleExpressionImpl();
		return mParameterValueAssignmentSingleExpression;
	}

	/**
	 * @generated
	 */
	public MParameterValueRange createMParameterValueRange() {
		MParameterValueRangeImpl mParameterValueRange = new MParameterValueRangeImpl();
		return mParameterValueRange;
	}

	/**
	 * @generated
	 */
	public MParameterValueDependentItemsList createMParameterValueDependentItemsList() {
		MParameterValueDependentItemsListImpl mParameterValueDependentItemsList = new MParameterValueDependentItemsListImpl();
		return mParameterValueDependentItemsList;
	}

	/**
	 * @generated
	 */
	public MParameterValueExpressionOperators createMParameterValueExpressionOperatorsFromString(EDataType eDataType, String initialValue) {
		MParameterValueExpressionOperators result = MParameterValueExpressionOperators.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * @generated
	 */
	public String convertMParameterValueExpressionOperatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * @generated
	 */
	public MParameterValueTERMOperators createMParameterValueTERMOperatorsFromString(EDataType eDataType, String initialValue) {
		MParameterValueTERMOperators result = MParameterValueTERMOperators.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * @generated
	 */
	public String convertMParameterValueTERMOperatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * @generated
	 */
	public commonPackage getcommonPackage() {
		return (commonPackage)getEPackage();
	}

	/**
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static commonPackage getPackage() {
		return commonPackage.eINSTANCE;
	}

}
