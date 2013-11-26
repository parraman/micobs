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
package es.uah.aut.srg.micobs.common.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
import es.uah.aut.srg.micobs.common.MParameterValueIntegerLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueLiteral;
import es.uah.aut.srg.micobs.common.MParameterValuePAR;
import es.uah.aut.srg.micobs.common.MParameterValueRange;
import es.uah.aut.srg.micobs.common.MParameterValueRealLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueRefObject;
import es.uah.aut.srg.micobs.common.MParameterValueStringLiteral;
import es.uah.aut.srg.micobs.common.MParameterValueTERM;
import es.uah.aut.srg.micobs.common.MRealParameter;
import es.uah.aut.srg.micobs.common.MRealParameterSingleExpression;
import es.uah.aut.srg.micobs.common.MStringParameter;
import es.uah.aut.srg.micobs.common.MStringParameterSingleExpression;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @see es.uah.aut.srg.micobs.common.commonPackage
 * @generated
 */
public class commonSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static commonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public commonSwitch() {
		if (modelPackage == null) {
			modelPackage = commonPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case commonPackage.MCOMMON_PACKAGE: {
				MCommonPackage mCommonPackage = (MCommonPackage)theEObject;
				T result = caseMCommonPackage(mCommonPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MCOMMON_PACKAGE_FILE: {
				MCommonPackageFile mCommonPackageFile = (MCommonPackageFile)theEObject;
				T result = caseMCommonPackageFile(mCommonPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MCOMMON_PACKAGE_ELEMENT: {
				MCommonPackageElement mCommonPackageElement = (MCommonPackageElement)theEObject;
				T result = caseMCommonPackageElement(mCommonPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MCOMMON_PACKAGE_ITEM: {
				MCommonPackageItem mCommonPackageItem = (MCommonPackageItem)theEObject;
				T result = caseMCommonPackageItem(mCommonPackageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MCOMMON_PACKAGE_VERSIONED_ITEM: {
				MCommonPackageVersionedItem mCommonPackageVersionedItem = (MCommonPackageVersionedItem)theEObject;
				T result = caseMCommonPackageVersionedItem(mCommonPackageVersionedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MCOMMON_LIBRARY: {
				MCommonLibrary mCommonLibrary = (MCommonLibrary)theEObject;
				T result = caseMCommonLibrary(mCommonLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MCOMMON_PACKAGE_REFERENCING_ELEMENT: {
				MCommonPackageReferencingElement mCommonPackageReferencingElement = (MCommonPackageReferencingElement)theEObject;
				T result = caseMCommonPackageReferencingElement(mCommonPackageReferencingElement);
				if (result == null) result = caseMCommonPackageElement(mCommonPackageReferencingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MCOMMON_PACKAGE_PARAMETRIC_REFERENCING_ELEMENT: {
				MCommonPackageParametricReferencingElement mCommonPackageParametricReferencingElement = (MCommonPackageParametricReferencingElement)theEObject;
				T result = caseMCommonPackageParametricReferencingElement(mCommonPackageParametricReferencingElement);
				if (result == null) result = caseMCommonPackageElement(mCommonPackageParametricReferencingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MCOMMON_REFERENCEABLE_OBJ: {
				MCommonReferenceableObj mCommonReferenceableObj = (MCommonReferenceableObj)theEObject;
				T result = caseMCommonReferenceableObj(mCommonReferenceableObj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER: {
				MParameter mParameter = (MParameter)theEObject;
				T result = caseMParameter(mParameter);
				if (result == null) result = caseMCommonReferenceableObj(mParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_DEFAULT_VALUE_SINGLE_EXPRESSION: {
				MParameterDefaultValueSingleExpression mParameterDefaultValueSingleExpression = (MParameterDefaultValueSingleExpression)theEObject;
				T result = caseMParameterDefaultValueSingleExpression(mParameterDefaultValueSingleExpression);
				if (result == null) result = caseMParameter(mParameterDefaultValueSingleExpression);
				if (result == null) result = caseMCommonReferenceableObj(mParameterDefaultValueSingleExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MENUM_PARAMETER_DEFINITION: {
				MEnumParameterDefinition mEnumParameterDefinition = (MEnumParameterDefinition)theEObject;
				T result = caseMEnumParameterDefinition(mEnumParameterDefinition);
				if (result == null) result = caseMParameter(mEnumParameterDefinition);
				if (result == null) result = caseMCommonReferenceableObj(mEnumParameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MBOOLEAN_PARAMETER: {
				MBooleanParameter mBooleanParameter = (MBooleanParameter)theEObject;
				T result = caseMBooleanParameter(mBooleanParameter);
				if (result == null) result = caseMParameter(mBooleanParameter);
				if (result == null) result = caseMCommonReferenceableObj(mBooleanParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MBOOLEAN_PARAMETER_SINGLE_EXPRESSION: {
				MBooleanParameterSingleExpression mBooleanParameterSingleExpression = (MBooleanParameterSingleExpression)theEObject;
				T result = caseMBooleanParameterSingleExpression(mBooleanParameterSingleExpression);
				if (result == null) result = caseMBooleanParameter(mBooleanParameterSingleExpression);
				if (result == null) result = caseMParameterDefaultValueSingleExpression(mBooleanParameterSingleExpression);
				if (result == null) result = caseMParameter(mBooleanParameterSingleExpression);
				if (result == null) result = caseMCommonReferenceableObj(mBooleanParameterSingleExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MSTRING_PARAMETER: {
				MStringParameter mStringParameter = (MStringParameter)theEObject;
				T result = caseMStringParameter(mStringParameter);
				if (result == null) result = caseMParameter(mStringParameter);
				if (result == null) result = caseMCommonReferenceableObj(mStringParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MSTRING_PARAMETER_SINGLE_EXPRESSION: {
				MStringParameterSingleExpression mStringParameterSingleExpression = (MStringParameterSingleExpression)theEObject;
				T result = caseMStringParameterSingleExpression(mStringParameterSingleExpression);
				if (result == null) result = caseMStringParameter(mStringParameterSingleExpression);
				if (result == null) result = caseMParameterDefaultValueSingleExpression(mStringParameterSingleExpression);
				if (result == null) result = caseMParameter(mStringParameterSingleExpression);
				if (result == null) result = caseMCommonReferenceableObj(mStringParameterSingleExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MINTEGER_PARAMETER: {
				MIntegerParameter mIntegerParameter = (MIntegerParameter)theEObject;
				T result = caseMIntegerParameter(mIntegerParameter);
				if (result == null) result = caseMParameter(mIntegerParameter);
				if (result == null) result = caseMCommonReferenceableObj(mIntegerParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MINTEGER_PARAMETER_SINGLE_EXPRESSION: {
				MIntegerParameterSingleExpression mIntegerParameterSingleExpression = (MIntegerParameterSingleExpression)theEObject;
				T result = caseMIntegerParameterSingleExpression(mIntegerParameterSingleExpression);
				if (result == null) result = caseMIntegerParameter(mIntegerParameterSingleExpression);
				if (result == null) result = caseMParameterDefaultValueSingleExpression(mIntegerParameterSingleExpression);
				if (result == null) result = caseMParameter(mIntegerParameterSingleExpression);
				if (result == null) result = caseMCommonReferenceableObj(mIntegerParameterSingleExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MENUM_PARAMETER: {
				MEnumParameter mEnumParameter = (MEnumParameter)theEObject;
				T result = caseMEnumParameter(mEnumParameter);
				if (result == null) result = caseMParameter(mEnumParameter);
				if (result == null) result = caseMCommonReferenceableObj(mEnumParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MENUM_PARAMETER_SINGLE_EXPRESSION: {
				MEnumParameterSingleExpression mEnumParameterSingleExpression = (MEnumParameterSingleExpression)theEObject;
				T result = caseMEnumParameterSingleExpression(mEnumParameterSingleExpression);
				if (result == null) result = caseMEnumParameter(mEnumParameterSingleExpression);
				if (result == null) result = caseMParameterDefaultValueSingleExpression(mEnumParameterSingleExpression);
				if (result == null) result = caseMParameter(mEnumParameterSingleExpression);
				if (result == null) result = caseMCommonReferenceableObj(mEnumParameterSingleExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MENUM_PARAMETER_LITERAL: {
				MEnumParameterLiteral mEnumParameterLiteral = (MEnumParameterLiteral)theEObject;
				T result = caseMEnumParameterLiteral(mEnumParameterLiteral);
				if (result == null) result = caseMCommonReferenceableObj(mEnumParameterLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MREAL_PARAMETER: {
				MRealParameter mRealParameter = (MRealParameter)theEObject;
				T result = caseMRealParameter(mRealParameter);
				if (result == null) result = caseMParameter(mRealParameter);
				if (result == null) result = caseMCommonReferenceableObj(mRealParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MREAL_PARAMETER_SINGLE_EXPRESSION: {
				MRealParameterSingleExpression mRealParameterSingleExpression = (MRealParameterSingleExpression)theEObject;
				T result = caseMRealParameterSingleExpression(mRealParameterSingleExpression);
				if (result == null) result = caseMRealParameter(mRealParameterSingleExpression);
				if (result == null) result = caseMParameterDefaultValueSingleExpression(mRealParameterSingleExpression);
				if (result == null) result = caseMParameter(mRealParameterSingleExpression);
				if (result == null) result = caseMCommonReferenceableObj(mRealParameterSingleExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_RANGE: {
				MParameterRange mParameterRange = (MParameterRange)theEObject;
				T result = caseMParameterRange(mParameterRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_OOR: {
				MParameterOOR mParameterOOR = (MParameterOOR)theEObject;
				T result = caseMParameterOOR(mParameterOOR);
				if (result == null) result = caseMParameterRange(mParameterOOR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_OCR: {
				MParameterOCR mParameterOCR = (MParameterOCR)theEObject;
				T result = caseMParameterOCR(mParameterOCR);
				if (result == null) result = caseMParameterRange(mParameterOCR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_CCR: {
				MParameterCCR mParameterCCR = (MParameterCCR)theEObject;
				T result = caseMParameterCCR(mParameterCCR);
				if (result == null) result = caseMParameterRange(mParameterCCR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_COR: {
				MParameterCOR mParameterCOR = (MParameterCOR)theEObject;
				T result = caseMParameterCOR(mParameterCOR);
				if (result == null) result = caseMParameterRange(mParameterCOR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MENUM_PARAM_INTEGER_LITERAL: {
				MEnumParamIntegerLiteral mEnumParamIntegerLiteral = (MEnumParamIntegerLiteral)theEObject;
				T result = caseMEnumParamIntegerLiteral(mEnumParamIntegerLiteral);
				if (result == null) result = caseMEnumParameterLiteral(mEnumParamIntegerLiteral);
				if (result == null) result = caseMCommonReferenceableObj(mEnumParamIntegerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MENUM_PARAM_REAL_LITERAL: {
				MEnumParamRealLiteral mEnumParamRealLiteral = (MEnumParamRealLiteral)theEObject;
				T result = caseMEnumParamRealLiteral(mEnumParamRealLiteral);
				if (result == null) result = caseMEnumParameterLiteral(mEnumParamRealLiteral);
				if (result == null) result = caseMCommonReferenceableObj(mEnumParamRealLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MENUM_PARAM_STRING_LITERAL: {
				MEnumParamStringLiteral mEnumParamStringLiteral = (MEnumParamStringLiteral)theEObject;
				T result = caseMEnumParamStringLiteral(mEnumParamStringLiteral);
				if (result == null) result = caseMEnumParameterLiteral(mEnumParamStringLiteral);
				if (result == null) result = caseMCommonReferenceableObj(mEnumParamStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE: {
				MParameterValue mParameterValue = (MParameterValue)theEObject;
				T result = caseMParameterValue(mParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_LITERAL: {
				MParameterValueLiteral mParameterValueLiteral = (MParameterValueLiteral)theEObject;
				T result = caseMParameterValueLiteral(mParameterValueLiteral);
				if (result == null) result = caseMParameterValue(mParameterValueLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_INTEGER_LITERAL: {
				MParameterValueIntegerLiteral mParameterValueIntegerLiteral = (MParameterValueIntegerLiteral)theEObject;
				T result = caseMParameterValueIntegerLiteral(mParameterValueIntegerLiteral);
				if (result == null) result = caseMParameterValueLiteral(mParameterValueIntegerLiteral);
				if (result == null) result = caseMParameterValue(mParameterValueIntegerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_REAL_LITERAL: {
				MParameterValueRealLiteral mParameterValueRealLiteral = (MParameterValueRealLiteral)theEObject;
				T result = caseMParameterValueRealLiteral(mParameterValueRealLiteral);
				if (result == null) result = caseMParameterValueLiteral(mParameterValueRealLiteral);
				if (result == null) result = caseMParameterValue(mParameterValueRealLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_BOOLEAN_LITERAL: {
				MParameterValueBooleanLiteral mParameterValueBooleanLiteral = (MParameterValueBooleanLiteral)theEObject;
				T result = caseMParameterValueBooleanLiteral(mParameterValueBooleanLiteral);
				if (result == null) result = caseMParameterValueLiteral(mParameterValueBooleanLiteral);
				if (result == null) result = caseMParameterValue(mParameterValueBooleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_STRING_LITERAL: {
				MParameterValueStringLiteral mParameterValueStringLiteral = (MParameterValueStringLiteral)theEObject;
				T result = caseMParameterValueStringLiteral(mParameterValueStringLiteral);
				if (result == null) result = caseMParameterValueLiteral(mParameterValueStringLiteral);
				if (result == null) result = caseMParameterValue(mParameterValueStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_REF_OBJECT: {
				MParameterValueRefObject mParameterValueRefObject = (MParameterValueRefObject)theEObject;
				T result = caseMParameterValueRefObject(mParameterValueRefObject);
				if (result == null) result = caseMParameterValue(mParameterValueRefObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_EXPRESSION: {
				MParameterValueExpression mParameterValueExpression = (MParameterValueExpression)theEObject;
				T result = caseMParameterValueExpression(mParameterValueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_TERM: {
				MParameterValueTERM mParameterValueTERM = (MParameterValueTERM)theEObject;
				T result = caseMParameterValueTERM(mParameterValueTERM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_PAR: {
				MParameterValuePAR mParameterValuePAR = (MParameterValuePAR)theEObject;
				T result = caseMParameterValuePAR(mParameterValuePAR);
				if (result == null) result = caseMParameterValue(mParameterValuePAR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_ASSIGNMENT: {
				MParameterValueAssignment mParameterValueAssignment = (MParameterValueAssignment)theEObject;
				T result = caseMParameterValueAssignment(mParameterValueAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_ASSIGNMENT_SINGLE_EXPRESSION: {
				MParameterValueAssignmentSingleExpression mParameterValueAssignmentSingleExpression = (MParameterValueAssignmentSingleExpression)theEObject;
				T result = caseMParameterValueAssignmentSingleExpression(mParameterValueAssignmentSingleExpression);
				if (result == null) result = caseMParameterValueAssignment(mParameterValueAssignmentSingleExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_RANGE: {
				MParameterValueRange mParameterValueRange = (MParameterValueRange)theEObject;
				T result = caseMParameterValueRange(mParameterValueRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_DEPENDENT_ITEM: {
				MParameterValueDependentItem mParameterValueDependentItem = (MParameterValueDependentItem)theEObject;
				T result = caseMParameterValueDependentItem(mParameterValueDependentItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case commonPackage.MPARAMETER_VALUE_DEPENDENT_ITEMS_LIST: {
				MParameterValueDependentItemsList mParameterValueDependentItemsList = (MParameterValueDependentItemsList)theEObject;
				T result = caseMParameterValueDependentItemsList(mParameterValueDependentItemsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackage(MCommonPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageFile(MCommonPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageElement(MCommonPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageItem(MCommonPackageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageVersionedItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageVersionedItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageVersionedItem(MCommonPackageVersionedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonLibrary</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonLibrary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonLibrary(MCommonLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageReferencingElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageReferencingElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageReferencingElement(MCommonPackageReferencingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageParametricReferencingElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageParametricReferencingElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageParametricReferencingElement(MCommonPackageParametricReferencingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonReferenceableObj</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonReferenceableObj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonReferenceableObj(MCommonReferenceableObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameter(MParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterDefaultValueSingleExpression</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterDefaultValueSingleExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterDefaultValueSingleExpression(MParameterDefaultValueSingleExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParameterDefinition</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParameterDefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParameterDefinition(MEnumParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBooleanParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBooleanParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParameter(MBooleanParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBooleanParameterSingleExpression</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBooleanParameterSingleExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParameterSingleExpression(MBooleanParameterSingleExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStringParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStringParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParameter(MStringParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStringParameterSingleExpression</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStringParameterSingleExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParameterSingleExpression(MStringParameterSingleExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIntegerParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIntegerParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParameter(MIntegerParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIntegerParameterSingleExpression</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIntegerParameterSingleExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParameterSingleExpression(MIntegerParameterSingleExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParameter(MEnumParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParameterSingleExpression</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParameterSingleExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParameterSingleExpression(MEnumParameterSingleExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParameterLiteral</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParameterLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParameterLiteral(MEnumParameterLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRealParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRealParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParameter(MRealParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRealParameterSingleExpression</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRealParameterSingleExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParameterSingleExpression(MRealParameterSingleExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterRange</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterRange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterRange(MParameterRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterOOR</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterOOR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterOOR(MParameterOOR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterOCR</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterOCR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterOCR(MParameterOCR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterCCR</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterCCR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterCCR(MParameterCCR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterCOR</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterCOR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterCOR(MParameterCOR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParamIntegerLiteral</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParamIntegerLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamIntegerLiteral(MEnumParamIntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParamRealLiteral</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParamRealLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamRealLiteral(MEnumParamRealLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParamStringLiteral</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParamStringLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamStringLiteral(MEnumParamStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValue</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValue(MParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueLiteral</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueLiteral(MParameterValueLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueIntegerLiteral</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueIntegerLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueIntegerLiteral(MParameterValueIntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueRealLiteral</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueRealLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueRealLiteral(MParameterValueRealLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueBooleanLiteral</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueBooleanLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueBooleanLiteral(MParameterValueBooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueStringLiteral</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueStringLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueStringLiteral(MParameterValueStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueRefObject</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueRefObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueRefObject(MParameterValueRefObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueExpression</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueExpression(MParameterValueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueTERM</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueTERM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueTERM(MParameterValueTERM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValuePAR</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValuePAR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValuePAR(MParameterValuePAR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueAssignment</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueAssignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueAssignment(MParameterValueAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueAssignmentSingleExpression<</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueAssignmentSingleExpression<</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueAssignmentSingleExpression(MParameterValueAssignmentSingleExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueRange</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueRange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueRange(MParameterValueRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueDependentItem</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueDependentItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueDependentItem(MParameterValueDependentItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueDependentItemsList</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueDependentItemsList</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueDependentItemsList(MParameterValueDependentItemsList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

}