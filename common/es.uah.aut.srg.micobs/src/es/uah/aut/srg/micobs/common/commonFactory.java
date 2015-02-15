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

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the common classes of the MICOBS model.
 * It provides a create method for each non-abstract class of the model.
 * @see es.uah.aut.srg.micobs.common.commonPackage
 * @generated
 */
public interface commonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	commonFactory eINSTANCE = es.uah.aut.srg.micobs.common.impl.commonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MCommonPackageParametricReferencingElement</em>'.
	 * @return a new object of class '<em>MCommonPackageParametricReferencingElement</em>'.
	 * @generated
	 */
	MCommonPackageParametricReferencingElement createMCommonPackageParametricReferencingElement();

	/**
	 * Returns a new object of class '<em>MEnum ParameterDefinition</em>'.
	 * @return a new object of class '<em>MEnum ParameterDefinition</em>'.
	 * @generated
	 */
	MEnumParameterDefinition createMEnumParameterDefinition();

	/**
	 * Returns a new object of class '<em>MBooleanParameterSingleExpression</em>'.
	 * @return a new object of class '<em>MBooleanParameterSingleExpression</em>'.
	 * @generated
	 */
	MBooleanParameterSingleExpression createMBooleanParameterSingleExpression();

	/**
	 * Returns a new object of class '<em>MStringParameterSingleExpression</em>'.
	 * @return a new object of class '<em>MStringParameterSingleExpression</em>'.
	 * @generated
	 */
	MStringParameterSingleExpression createMStringParameterSingleExpression();

	/**
	 * Returns a new object of class '<em>MIntegerParameterSingleExpression</em>'.
	 * @return a new object of class '<em>MIntegerParameterSingleExpression</em>'.
	 * @generated
	 */
	MIntegerParameterSingleExpression createMIntegerParameterSingleExpression();

	/**
	 * Returns a new object of class '<em>MEnumParameterSingleExpression</em>'.
	 * @return a new object of class '<em>MEnumParameterSingleExpression</em>'.
	 * @generated
	 */
	MEnumParameterSingleExpression createMEnumParameterSingleExpression();

	/**
	 * Returns a new object of class '<em>MEnumParameterLiteral</em>'.
	 * @return a new object of class '<em>MEnumParameterLiteral</em>'.
	 * @generated
	 */
	MEnumParameterLiteral createMEnumParameterLiteral();

	/**
	 * Returns a new object of class '<em>MRealParameterSingleExpression</em>'.
	 * @return a new object of class '<em>MRealParameterSingleExpression</em>'.
	 * @generated
	 */
	MRealParameterSingleExpression createMRealParameterSingleExpression();

	/**
	 * Returns a new object of class '<em>MParameterOOR</em>'.
	 * @return a new object of class '<em>MParameterOOR</em>'.
	 * @generated
	 */
	MParameterOOR createMParameterOOR();

	/**
	 * Returns a new object of class '<em>MParameterOCR</em>'.
	 * @return a new object of class '<em>MParameterOCR</em>'.
	 * @generated
	 */
	MParameterOCR createMParameterOCR();

	/**
	 * Returns a new object of class '<em>MParameterCCR</em>'.
	 * @return a new object of class '<em>MParameterCCR</em>'.
	 * @generated
	 */
	MParameterCCR createMParameterCCR();

	/**
	 * Returns a new object of class '<em>MParameterCOR</em>'.
	 * @return a new object of class '<em>MParameterCOR</em>'.
	 * @generated
	 */
	MParameterCOR createMParameterCOR();

	/**
	 * Returns a new object of class '<em>MEnumParamIntegerLiteral</em>'.
	 * @return a new object of class '<em>MEnumParamIntegerLiteral</em>'.
	 * @generated
	 */
	MEnumParamIntegerLiteral createMEnumParamIntegerLiteral();

	/**
	 * Returns a new object of class '<em>MEnumParamRealLiteral</em>'.
	 * @return a new object of class '<em>MEnumParamRealLiteral</em>'.
	 * @generated
	 */
	MEnumParamRealLiteral createMEnumParamRealLiteral();

	/**
	 * Returns a new object of class '<em>MEnumParamStringLiteral</em>'.
	 * @return a new object of class '<em>MEnumParamStringLiteral</em>'.
	 * @generated
	 */
	MEnumParamStringLiteral createMEnumParamStringLiteral();

	/**
	 * Returns a new object of class '<em>MParameterValueIntegerLiteral</em>'.
	 * @return a new object of class '<em>MParameterValueIntegerLiteral</em>'.
	 * @generated
	 */
	MParameterValueIntegerLiteral createMParameterValueIntegerLiteral();

	/**
	 * Returns a new object of class '<em>MParameterValueRealLiteral</em>'.
	 * @return a new object of class '<em>MParameterValueRealLiteral</em>'.
	 * @generated
	 */
	MParameterValueRealLiteral createMParameterValueRealLiteral();

	/**
	 * Returns a new object of class '<em>MParameterValueBooleanLiteral</em>'.
	 * @return a new object of class '<em>MParameterValueBooleanLiteral</em>'.
	 * @generated
	 */
	MParameterValueBooleanLiteral createMParameterValueBooleanLiteral();

	/**
	 * Returns a new object of class '<em>MParameterValueStringLiteral</em>'.
	 * @return a new object of class '<em>MParameterValueStringLiteral</em>'.
	 * @generated
	 */
	MParameterValueStringLiteral createMParameterValueStringLiteral();

	/**
	 * Returns a new object of class '<em>MParameter Value Ref Object</em>'.
	 * @return a new object of class '<em>MParameter Value Ref Object</em>'.
	 * @generated
	 */
	MParameterValueRefObject createMParameterValueRefObject();

	/**
	 * Returns a new object of class '<em>MParameter Value Expression</em>'.
	 * @return a new object of class '<em>MParameter Value Expression</em>'.
	 * @generated
	 */
	MParameterValueExpression createMParameterValueExpression();

	/**
	 * Returns a new object of class '<em>MParameter Value TERM</em>'.
	 * @return a new object of class '<em>MParameter Value TERM</em>'.
	 * @generated
	 */
	MParameterValueTERM createMParameterValueTERM();

	/**
	 * Returns a new object of class '<em>MParameterValuePAR</em>'.
	 * @return a new object of class '<em>MParameterValuePAR</em>'.
	 * @generated
	 */
	MParameterValuePAR createMParameterValuePAR();

	/**
	 * Returns a new object of class '<em>MParameter Value Assignment Single Expression</em>'.
	 * @return a new object of class '<em>MParameter Value Assignment Single Expression</em>'.
	 * @generated
	 */
	MParameterValueAssignmentSingleExpression createMParameterValueAssignmentSingleExpression();

	/**
	 * Returns a new object of class '<em>MParameterValueRange</em>'.
	 * @return a new object of class '<em>MParameterValueRange</em>'.
	 * @generated
	 */
	MParameterValueRange createMParameterValueRange();

	/**
	 * Returns a new object of class '<em>MParameterValueDependentItemsList</em>'.
	 * @return a new object of class '<em>MParameterValueDependentItemsList</em>'.
	 * @generated
	 */
	MParameterValueDependentItemsList createMParameterValueDependentItemsList();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	commonPackage getcommonPackage();

}
