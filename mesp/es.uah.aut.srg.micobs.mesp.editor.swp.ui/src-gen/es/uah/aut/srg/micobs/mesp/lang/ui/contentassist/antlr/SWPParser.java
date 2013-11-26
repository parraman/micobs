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
package es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.mesp.lang.services.SWPGrammarAccess;

public class SWPParser extends AbstractContentAssistParser {
	
	@Inject
	private SWPGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalSWPParser createParser() {
		es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalSWPParser result = new es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalSWPParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMMESPSWPPackageElementAccess().getAlternatives(), "rule__MMESPSWPPackageElement__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getMSwPackageProvidedInterfacePVAAccess().getAlternatives(), "rule__MSwPackageProvidedInterfacePVA__Alternatives");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_0_2(), "rule__MDriverSwPackageSupportedPlatform__Alternatives_5_0_2");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_1_2(), "rule__MDriverSwPackageSupportedPlatform__Alternatives_5_1_2");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_2_2(), "rule__MDriverSwPackageSupportedPlatform__Alternatives_5_2_2");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_4_2(), "rule__MDriverSwPackageSupportedPlatform__Alternatives_5_4_2");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_5_2(), "rule__MDriverSwPackageSupportedPlatform__Alternatives_5_5_2");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_0_2(), "rule__MSwPackageSupportedPlatform__Alternatives_5_0_2");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_1_2(), "rule__MSwPackageSupportedPlatform__Alternatives_5_1_2");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_2_2(), "rule__MSwPackageSupportedPlatform__Alternatives_5_2_2");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_4_2(), "rule__MSwPackageSupportedPlatform__Alternatives_5_4_2");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_5_2(), "rule__MSwPackageSupportedPlatform__Alternatives_5_5_2");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getMResourceDemandAccess().getAlternatives(), "rule__MResourceDemand__Alternatives");
					put(grammarAccess.getMParameterAccess().getAlternatives(), "rule__MParameter__Alternatives");
					put(grammarAccess.getMParameterWithoutSWPSPAccess().getAlternatives(), "rule__MParameterWithoutSWPSP__Alternatives");
					put(grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives(), "rule__MEnumParameterLiteralRule__Alternatives");
					put(grammarAccess.getMParameterValueAccess().getAlternatives(), "rule__MParameterValue__Alternatives");
					put(grammarAccess.getMParameterValueLiteralAccess().getAlternatives(), "rule__MParameterValueLiteral__Alternatives");
					put(grammarAccess.getMParameterRangeAccess().getAlternatives(), "rule__MParameterRange__Alternatives");
					put(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives(), "rule__MParameterValueExpressionOperators__Alternatives");
					put(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives(), "rule__MParameterValueTERMOperators__Alternatives");
					put(grammarAccess.getMMESPSWPPackageFileAccess().getGroup(), "rule__MMESPSWPPackageFile__Group__0");
					put(grammarAccess.getMMESPSWPPackageFileAccess().getGroup_3(), "rule__MMESPSWPPackageFile__Group_3__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_0_1(), "rule__Version__Group_0_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getVersionedQualifiedNameAccess().getGroup(), "rule__VersionedQualifiedName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup(), "rule__VersionedQualifiedReferenceName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0(), "rule__VersionedQualifiedReferenceName__Group_0__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2(), "rule__VersionedQualifiedReferenceName__Group_2__0");
					put(grammarAccess.getMAbstractSwPackageAccess().getGroup(), "rule__MAbstractSwPackage__Group__0");
					put(grammarAccess.getMAbstractSwPackageAccess().getGroup_3(), "rule__MAbstractSwPackage__Group_3__0");
					put(grammarAccess.getMAbstractSwPackageAccess().getGroup_3_2(), "rule__MAbstractSwPackage__Group_3_2__0");
					put(grammarAccess.getMAbstractSwPackageAccess().getGroup_5_0(), "rule__MAbstractSwPackage__Group_5_0__0");
					put(grammarAccess.getMAbstractSwPackageAccess().getGroup_5_1(), "rule__MAbstractSwPackage__Group_5_1__0");
					put(grammarAccess.getMAbstractSwPackageAccess().getGroup_5_2(), "rule__MAbstractSwPackage__Group_5_2__0");
					put(grammarAccess.getMSwPackageProvidedInterfaceAccess().getGroup(), "rule__MSwPackageProvidedInterface__Group__0");
					put(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getGroup(), "rule__MSwPackageProvidedInterfacePVAExpression__Group__0");
					put(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getGroup(), "rule__MSwPackageProvidedInterfacePVASwitch__Group__0");
					put(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getGroup(), "rule__MSwPackageProvidedInterfacePVASwitchCase__Group__0");
					put(grammarAccess.getMSwPackageRequiredInterfaceAccess().getGroup(), "rule__MSwPackageRequiredInterface__Group__0");
					put(grammarAccess.getMSwPackageAccess().getGroup(), "rule__MSwPackage__Group__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_2(), "rule__MSwPackage__Group_2__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_2_2(), "rule__MSwPackage__Group_2_2__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_3(), "rule__MSwPackage__Group_3__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_3_2(), "rule__MSwPackage__Group_3_2__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_5_0(), "rule__MSwPackage__Group_5_0__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_5_1(), "rule__MSwPackage__Group_5_1__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_5_1_3(), "rule__MSwPackage__Group_5_1_3__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_5_2(), "rule__MSwPackage__Group_5_2__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_5_2_4(), "rule__MSwPackage__Group_5_2_4__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_5_3(), "rule__MSwPackage__Group_5_3__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_5_4(), "rule__MSwPackage__Group_5_4__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_5_5(), "rule__MSwPackage__Group_5_5__0");
					put(grammarAccess.getMSwPackageAccess().getGroup_5_6(), "rule__MSwPackage__Group_5_6__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup(), "rule__MDriverSwPackage__Group__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_2(), "rule__MDriverSwPackage__Group_2__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_2_2(), "rule__MDriverSwPackage__Group_2_2__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_3(), "rule__MDriverSwPackage__Group_3__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_3_2(), "rule__MDriverSwPackage__Group_3_2__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_5_0(), "rule__MDriverSwPackage__Group_5_0__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_5_1(), "rule__MDriverSwPackage__Group_5_1__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_5_1_3(), "rule__MDriverSwPackage__Group_5_1_3__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_5_2(), "rule__MDriverSwPackage__Group_5_2__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_5_2_4(), "rule__MDriverSwPackage__Group_5_2_4__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_5_3(), "rule__MDriverSwPackage__Group_5_3__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_5_4(), "rule__MDriverSwPackage__Group_5_4__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_5_5(), "rule__MDriverSwPackage__Group_5_5__0");
					put(grammarAccess.getMDriverSwPackageAccess().getGroup_5_6(), "rule__MDriverSwPackage__Group_5_6__0");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup(), "rule__MDriverSwPackageSupportedPlatform__Group__0");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_0(), "rule__MDriverSwPackageSupportedPlatform__Group_5_0__0");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_1(), "rule__MDriverSwPackageSupportedPlatform__Group_5_1__0");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_2(), "rule__MDriverSwPackageSupportedPlatform__Group_5_2__0");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_3(), "rule__MDriverSwPackageSupportedPlatform__Group_5_3__0");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_4(), "rule__MDriverSwPackageSupportedPlatform__Group_5_4__0");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_5(), "rule__MDriverSwPackageSupportedPlatform__Group_5_5__0");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_6(), "rule__MDriverSwPackageSupportedPlatform__Group_5_6__0");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_6_3(), "rule__MDriverSwPackageSupportedPlatform__Group_5_6_3__0");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_7(), "rule__MDriverSwPackageSupportedPlatform__Group_5_7__0");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_8(), "rule__MDriverSwPackageSupportedPlatform__Group_5_8__0");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_9(), "rule__MDriverSwPackageSupportedPlatform__Group_5_9__0");
					put(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getGroup(), "rule__MDriverSwPackageSupportedDevice__Group__0");
					put(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getGroup_4(), "rule__MDriverSwPackageSupportedDevice__Group_4__0");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup(), "rule__MSwPackageSupportedPlatform__Group__0");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_0(), "rule__MSwPackageSupportedPlatform__Group_5_0__0");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_1(), "rule__MSwPackageSupportedPlatform__Group_5_1__0");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_2(), "rule__MSwPackageSupportedPlatform__Group_5_2__0");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_3(), "rule__MSwPackageSupportedPlatform__Group_5_3__0");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_4(), "rule__MSwPackageSupportedPlatform__Group_5_4__0");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_5(), "rule__MSwPackageSupportedPlatform__Group_5_5__0");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_6(), "rule__MSwPackageSupportedPlatform__Group_5_6__0");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_6_3(), "rule__MSwPackageSupportedPlatform__Group_5_6_3__0");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_7(), "rule__MSwPackageSupportedPlatform__Group_5_7__0");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_8(), "rule__MSwPackageSupportedPlatform__Group_5_8__0");
					put(grammarAccess.getMParameterValueAssignmentAccess().getGroup(), "rule__MParameterValueAssignment__Group__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
					put(grammarAccess.getREALAccess().getGroup_1(), "rule__REAL__Group_1__0");
					put(grammarAccess.getREALAccess().getGroup_2(), "rule__REAL__Group_2__0");
					put(grammarAccess.getMInstantiableResourceDemandAccess().getGroup(), "rule__MInstantiableResourceDemand__Group__0");
					put(grammarAccess.getMQuantifiableResourceDemandAccess().getGroup(), "rule__MQuantifiableResourceDemand__Group__0");
					put(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getGroup(), "rule__MBooleanParamSWPSPSwitch__Group__0");
					put(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getGroup(), "rule__MBooleanParamSWPSPSwitchCase__Group__0");
					put(grammarAccess.getMStringParamSWPSPSwitchAccess().getGroup(), "rule__MStringParamSWPSPSwitch__Group__0");
					put(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getGroup(), "rule__MStringParamSWPSPSwitchCase__Group__0");
					put(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getGroup(), "rule__MIntegerParamSWPSPSwitch__Group__0");
					put(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getGroup(), "rule__MIntegerParamSWPSPSwitchCase__Group__0");
					put(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getGroup_4(), "rule__MIntegerParamSWPSPSwitchCase__Group_4__0");
					put(grammarAccess.getMRealParamSWPSPSwitchAccess().getGroup(), "rule__MRealParamSWPSPSwitch__Group__0");
					put(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getGroup(), "rule__MRealParamSWPSPSwitchCase__Group__0");
					put(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getGroup_4(), "rule__MRealParamSWPSPSwitchCase__Group_4__0");
					put(grammarAccess.getMEnumParamSWPSPSwitchAccess().getGroup(), "rule__MEnumParamSWPSPSwitch__Group__0");
					put(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getGroup(), "rule__MEnumParamSWPSPSwitchCase__Group__0");
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getGroup(), "rule__MBooleanParameterSingleExpression__Group__0");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getGroup(), "rule__MStringParameterSingleExpression__Group__0");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup(), "rule__MIntegerParameterSingleExpression__Group__0");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_5(), "rule__MIntegerParameterSingleExpression__Group_5__0");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getGroup(), "rule__MEnumParameterDefinition__Group__0");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getGroup_4(), "rule__MEnumParameterDefinition__Group_4__0");
					put(grammarAccess.getMEnumParameterSingleExpressionAccess().getGroup(), "rule__MEnumParameterSingleExpression__Group__0");
					put(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup(), "rule__MRealParameterSingleExpression__Group__0");
					put(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_5(), "rule__MRealParameterSingleExpression__Group_5__0");
					put(grammarAccess.getMParameterValueBooleanLiteralAccess().getGroup(), "rule__MParameterValueBooleanLiteral__Group__0");
					put(grammarAccess.getMParameterValueStringLiteralAccess().getGroup(), "rule__MParameterValueStringLiteral__Group__0");
					put(grammarAccess.getMParameterValueIntegerLiteralAccess().getGroup(), "rule__MParameterValueIntegerLiteral__Group__0");
					put(grammarAccess.getMParameterValueRealLiteralAccess().getGroup(), "rule__MParameterValueRealLiteral__Group__0");
					put(grammarAccess.getMParameterValueRefObjectAccess().getGroup(), "rule__MParameterValueRefObject__Group__0");
					put(grammarAccess.getMParameterValuePARAccess().getGroup(), "rule__MParameterValuePAR__Group__0");
					put(grammarAccess.getMParameterValueExpressionAccess().getGroup(), "rule__MParameterValueExpression__Group__0");
					put(grammarAccess.getMParameterValueExpressionAccess().getGroup_2(), "rule__MParameterValueExpression__Group_2__0");
					put(grammarAccess.getMParameterValueTERMAccess().getGroup(), "rule__MParameterValueTERM__Group__0");
					put(grammarAccess.getMParameterValueTERMAccess().getGroup_2(), "rule__MParameterValueTERM__Group_2__0");
					put(grammarAccess.getMParameterOCRAccess().getGroup(), "rule__MParameterOCR__Group__0");
					put(grammarAccess.getMParameterOORAccess().getGroup(), "rule__MParameterOOR__Group__0");
					put(grammarAccess.getMParameterCORAccess().getGroup(), "rule__MParameterCOR__Group__0");
					put(grammarAccess.getMParameterCCRAccess().getGroup(), "rule__MParameterCCR__Group__0");
					put(grammarAccess.getMEnumParameterLiteralAccess().getGroup(), "rule__MEnumParameterLiteral__Group__0");
					put(grammarAccess.getMEnumParamIntegerLiteralAccess().getGroup(), "rule__MEnumParamIntegerLiteral__Group__0");
					put(grammarAccess.getMEnumParamRealLiteralAccess().getGroup(), "rule__MEnumParamRealLiteral__Group__0");
					put(grammarAccess.getMEnumParamStringLiteralAccess().getGroup(), "rule__MEnumParamStringLiteral__Group__0");
					put(grammarAccess.getMMESPSWPPackageFileAccess().getPackageAssignment_1(), "rule__MMESPSWPPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMESPSWPPackageFileAccess().getImportsAssignment_3_1(), "rule__MMESPSWPPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMESPSWPPackageFileAccess().getElementAssignment_4(), "rule__MMESPSWPPackageFile__ElementAssignment_4");
					put(grammarAccess.getMAbstractSwPackageAccess().getNameAssignment_2(), "rule__MAbstractSwPackage__NameAssignment_2");
					put(grammarAccess.getMAbstractSwPackageAccess().getInheritsAssignment_3_1(), "rule__MAbstractSwPackage__InheritsAssignment_3_1");
					put(grammarAccess.getMAbstractSwPackageAccess().getInheritsAssignment_3_2_1(), "rule__MAbstractSwPackage__InheritsAssignment_3_2_1");
					put(grammarAccess.getMAbstractSwPackageAccess().getVersionAssignment_5_0_2(), "rule__MAbstractSwPackage__VersionAssignment_5_0_2");
					put(grammarAccess.getMAbstractSwPackageAccess().getParametersAssignment_5_1_3(), "rule__MAbstractSwPackage__ParametersAssignment_5_1_3");
					put(grammarAccess.getMAbstractSwPackageAccess().getProvidesAssignment_5_2_3(), "rule__MAbstractSwPackage__ProvidesAssignment_5_2_3");
					put(grammarAccess.getMSwPackageProvidedInterfaceAccess().getSwinterfaceAssignment_1(), "rule__MSwPackageProvidedInterface__SwinterfaceAssignment_1");
					put(grammarAccess.getMSwPackageProvidedInterfaceAccess().getParameterValueAssignmentsAssignment_3(), "rule__MSwPackageProvidedInterface__ParameterValueAssignmentsAssignment_3");
					put(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterAssignment_1(), "rule__MSwPackageProvidedInterfacePVAExpression__ParameterAssignment_1");
					put(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterValueAssignment_3(), "rule__MSwPackageProvidedInterfacePVAExpression__ParameterValueAssignment_3");
					put(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterAssignment_1(), "rule__MSwPackageProvidedInterfacePVASwitch__ParameterAssignment_1");
					put(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getCasesAssignment_5(), "rule__MSwPackageProvidedInterfacePVASwitch__CasesAssignment_5");
					put(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getPlatformAssignment_1(), "rule__MSwPackageProvidedInterfacePVASwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getParameterValueAssignment_3(), "rule__MSwPackageProvidedInterfacePVASwitchCase__ParameterValueAssignment_3");
					put(grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceAssignment_1(), "rule__MSwPackageRequiredInterface__InterfaceAssignment_1");
					put(grammarAccess.getMSwPackageRequiredInterfaceAccess().getResourceDemandsAssignment_3(), "rule__MSwPackageRequiredInterface__ResourceDemandsAssignment_3");
					put(grammarAccess.getMSwPackageAccess().getNameAssignment_1(), "rule__MSwPackage__NameAssignment_1");
					put(grammarAccess.getMSwPackageAccess().getInheritsAssignment_2_1(), "rule__MSwPackage__InheritsAssignment_2_1");
					put(grammarAccess.getMSwPackageAccess().getInheritsAssignment_2_2_1(), "rule__MSwPackage__InheritsAssignment_2_2_1");
					put(grammarAccess.getMSwPackageAccess().getExtendsAssignment_3_1(), "rule__MSwPackage__ExtendsAssignment_3_1");
					put(grammarAccess.getMSwPackageAccess().getExtendsAssignment_3_2_1(), "rule__MSwPackage__ExtendsAssignment_3_2_1");
					put(grammarAccess.getMSwPackageAccess().getVersionAssignment_5_0_2(), "rule__MSwPackage__VersionAssignment_5_0_2");
					put(grammarAccess.getMSwPackageAccess().getLanguagesAssignment_5_1_2(), "rule__MSwPackage__LanguagesAssignment_5_1_2");
					put(grammarAccess.getMSwPackageAccess().getLanguagesAssignment_5_1_3_1(), "rule__MSwPackage__LanguagesAssignment_5_1_3_1");
					put(grammarAccess.getMSwPackageAccess().getCtoolsAssignment_5_2_3(), "rule__MSwPackage__CtoolsAssignment_5_2_3");
					put(grammarAccess.getMSwPackageAccess().getCtoolsAssignment_5_2_4_1(), "rule__MSwPackage__CtoolsAssignment_5_2_4_1");
					put(grammarAccess.getMSwPackageAccess().getParametersAssignment_5_3_3(), "rule__MSwPackage__ParametersAssignment_5_3_3");
					put(grammarAccess.getMSwPackageAccess().getProvidesAssignment_5_4_3(), "rule__MSwPackage__ProvidesAssignment_5_4_3");
					put(grammarAccess.getMSwPackageAccess().getRequiresAssignment_5_5_3(), "rule__MSwPackage__RequiresAssignment_5_5_3");
					put(grammarAccess.getMSwPackageAccess().getSupportedPlatformsAssignment_5_6_3(), "rule__MSwPackage__SupportedPlatformsAssignment_5_6_3");
					put(grammarAccess.getMDriverSwPackageAccess().getNameAssignment_1(), "rule__MDriverSwPackage__NameAssignment_1");
					put(grammarAccess.getMDriverSwPackageAccess().getInheritsAssignment_2_1(), "rule__MDriverSwPackage__InheritsAssignment_2_1");
					put(grammarAccess.getMDriverSwPackageAccess().getInheritsAssignment_2_2_1(), "rule__MDriverSwPackage__InheritsAssignment_2_2_1");
					put(grammarAccess.getMDriverSwPackageAccess().getExtendsAssignment_3_1(), "rule__MDriverSwPackage__ExtendsAssignment_3_1");
					put(grammarAccess.getMDriverSwPackageAccess().getExtendsAssignment_3_2_1(), "rule__MDriverSwPackage__ExtendsAssignment_3_2_1");
					put(grammarAccess.getMDriverSwPackageAccess().getVersionAssignment_5_0_2(), "rule__MDriverSwPackage__VersionAssignment_5_0_2");
					put(grammarAccess.getMDriverSwPackageAccess().getLanguagesAssignment_5_1_2(), "rule__MDriverSwPackage__LanguagesAssignment_5_1_2");
					put(grammarAccess.getMDriverSwPackageAccess().getLanguagesAssignment_5_1_3_1(), "rule__MDriverSwPackage__LanguagesAssignment_5_1_3_1");
					put(grammarAccess.getMDriverSwPackageAccess().getCtoolsAssignment_5_2_3(), "rule__MDriverSwPackage__CtoolsAssignment_5_2_3");
					put(grammarAccess.getMDriverSwPackageAccess().getCtoolsAssignment_5_2_4_1(), "rule__MDriverSwPackage__CtoolsAssignment_5_2_4_1");
					put(grammarAccess.getMDriverSwPackageAccess().getParametersAssignment_5_3_3(), "rule__MDriverSwPackage__ParametersAssignment_5_3_3");
					put(grammarAccess.getMDriverSwPackageAccess().getProvidesAssignment_5_4_3(), "rule__MDriverSwPackage__ProvidesAssignment_5_4_3");
					put(grammarAccess.getMDriverSwPackageAccess().getRequiresAssignment_5_5_3(), "rule__MDriverSwPackage__RequiresAssignment_5_5_3");
					put(grammarAccess.getMDriverSwPackageAccess().getSupportedPlatformsAssignment_5_6_3(), "rule__MDriverSwPackage__SupportedPlatformsAssignment_5_6_3");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getNameAssignment_3(), "rule__MDriverSwPackageSupportedPlatform__NameAssignment_3");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiAssignment_5_0_2_1(), "rule__MDriverSwPackageSupportedPlatform__OsapiAssignment_5_0_2_1");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsAssignment_5_1_2_1(), "rule__MDriverSwPackageSupportedPlatform__OsAssignment_5_1_2_1");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1(), "rule__MDriverSwPackageSupportedPlatform__ArchitectureAssignment_5_2_2_1");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerAssignment_5_3_2(), "rule__MDriverSwPackageSupportedPlatform__CompilerAssignment_5_3_2");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1(), "rule__MDriverSwPackageSupportedPlatform__MicroprocessorAssignment_5_4_2_1");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardAssignment_5_5_2_1(), "rule__MDriverSwPackageSupportedPlatform__BoardAssignment_5_5_2_1");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_2(), "rule__MDriverSwPackageSupportedPlatform__LanguagesAssignment_5_6_2");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_3_1(), "rule__MDriverSwPackageSupportedPlatform__LanguagesAssignment_5_6_3_1");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersAssignment_5_7_3(), "rule__MDriverSwPackageSupportedPlatform__ParametersAssignment_5_7_3");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiresAssignment_5_8_3(), "rule__MDriverSwPackageSupportedPlatform__RequiresAssignment_5_8_3");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedDevicesAssignment_5_9_3(), "rule__MDriverSwPackageSupportedPlatform__SupportedDevicesAssignment_5_9_3");
					put(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceAssignment_1(), "rule__MDriverSwPackageSupportedDevice__DeviceAssignment_1");
					put(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getNameAssignment_2(), "rule__MDriverSwPackageSupportedDevice__NameAssignment_2");
					put(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRequiredAssignment_4_2(), "rule__MDriverSwPackageSupportedDevice__RequiredAssignment_4_2");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getNameAssignment_3(), "rule__MSwPackageSupportedPlatform__NameAssignment_3");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiAssignment_5_0_2_1(), "rule__MSwPackageSupportedPlatform__OsapiAssignment_5_0_2_1");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsAssignment_5_1_2_1(), "rule__MSwPackageSupportedPlatform__OsAssignment_5_1_2_1");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1(), "rule__MSwPackageSupportedPlatform__ArchitectureAssignment_5_2_2_1");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerAssignment_5_3_2(), "rule__MSwPackageSupportedPlatform__CompilerAssignment_5_3_2");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1(), "rule__MSwPackageSupportedPlatform__MicroprocessorAssignment_5_4_2_1");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardAssignment_5_5_2_1(), "rule__MSwPackageSupportedPlatform__BoardAssignment_5_5_2_1");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_2(), "rule__MSwPackageSupportedPlatform__LanguagesAssignment_5_6_2");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_3_1(), "rule__MSwPackageSupportedPlatform__LanguagesAssignment_5_6_3_1");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersAssignment_5_7_3(), "rule__MSwPackageSupportedPlatform__ParametersAssignment_5_7_3");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiresAssignment_5_8_3(), "rule__MSwPackageSupportedPlatform__RequiresAssignment_5_8_3");
					put(grammarAccess.getMParameterValueAssignmentAccess().getParameterAssignment_1(), "rule__MParameterValueAssignment__ParameterAssignment_1");
					put(grammarAccess.getMParameterValueAssignmentAccess().getParameterValueAssignment_3(), "rule__MParameterValueAssignment__ParameterValueAssignment_3");
					put(grammarAccess.getMInstantiableResourceDemandAccess().getResourceAssignment_2(), "rule__MInstantiableResourceDemand__ResourceAssignment_2");
					put(grammarAccess.getMInstantiableResourceDemandAccess().getNameAssignment_3(), "rule__MInstantiableResourceDemand__NameAssignment_3");
					put(grammarAccess.getMInstantiableResourceDemandAccess().getParameterValueAssignmentsAssignment_5(), "rule__MInstantiableResourceDemand__ParameterValueAssignmentsAssignment_5");
					put(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceAssignment_3(), "rule__MQuantifiableResourceDemand__ResourceAssignment_3");
					put(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceValueAssignment_5(), "rule__MQuantifiableResourceDemand__ResourceValueAssignment_5");
					put(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getConstantAssignment_0(), "rule__MBooleanParamSWPSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getNameAssignment_2(), "rule__MBooleanParamSWPSPSwitch__NameAssignment_2");
					put(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getCasesAssignment_6(), "rule__MBooleanParamSWPSPSwitch__CasesAssignment_6");
					put(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MBooleanParamSWPSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MBooleanParamSWPSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMStringParamSWPSPSwitchAccess().getConstantAssignment_0(), "rule__MStringParamSWPSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMStringParamSWPSPSwitchAccess().getNameAssignment_2(), "rule__MStringParamSWPSPSwitch__NameAssignment_2");
					put(grammarAccess.getMStringParamSWPSPSwitchAccess().getCasesAssignment_6(), "rule__MStringParamSWPSPSwitch__CasesAssignment_6");
					put(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MStringParamSWPSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MStringParamSWPSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getConstantAssignment_0(), "rule__MIntegerParamSWPSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getNameAssignment_2(), "rule__MIntegerParamSWPSPSwitch__NameAssignment_2");
					put(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getCasesAssignment_6(), "rule__MIntegerParamSWPSPSwitch__CasesAssignment_6");
					put(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MIntegerParamSWPSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MIntegerParamSWPSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getRangeAssignment_4_1(), "rule__MIntegerParamSWPSPSwitchCase__RangeAssignment_4_1");
					put(grammarAccess.getMRealParamSWPSPSwitchAccess().getConstantAssignment_0(), "rule__MRealParamSWPSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMRealParamSWPSPSwitchAccess().getNameAssignment_2(), "rule__MRealParamSWPSPSwitch__NameAssignment_2");
					put(grammarAccess.getMRealParamSWPSPSwitchAccess().getCasesAssignment_6(), "rule__MRealParamSWPSPSwitch__CasesAssignment_6");
					put(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MRealParamSWPSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MRealParamSWPSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getRangeAssignment_4_1(), "rule__MRealParamSWPSPSwitchCase__RangeAssignment_4_1");
					put(grammarAccess.getMEnumParamSWPSPSwitchAccess().getConstantAssignment_0(), "rule__MEnumParamSWPSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumDefinitionAssignment_2(), "rule__MEnumParamSWPSPSwitch__EnumDefinitionAssignment_2");
					put(grammarAccess.getMEnumParamSWPSPSwitchAccess().getNameAssignment_3(), "rule__MEnumParamSWPSPSwitch__NameAssignment_3");
					put(grammarAccess.getMEnumParamSWPSPSwitchAccess().getCasesAssignment_7(), "rule__MEnumParamSWPSPSwitch__CasesAssignment_7");
					put(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MEnumParamSWPSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MEnumParamSWPSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantAssignment_0(), "rule__MBooleanParameterSingleExpression__ConstantAssignment_0");
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_2(), "rule__MBooleanParameterSingleExpression__NameAssignment_2");
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_4(), "rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantAssignment_0(), "rule__MStringParameterSingleExpression__ConstantAssignment_0");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_2(), "rule__MStringParameterSingleExpression__NameAssignment_2");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_4(), "rule__MStringParameterSingleExpression__DefaultValueAssignment_4");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantAssignment_0(), "rule__MIntegerParameterSingleExpression__ConstantAssignment_0");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameAssignment_2(), "rule__MIntegerParameterSingleExpression__NameAssignment_2");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueAssignment_4(), "rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeAssignment_5_1(), "rule__MIntegerParameterSingleExpression__RangeAssignment_5_1");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getNameAssignment_1(), "rule__MEnumParameterDefinition__NameAssignment_1");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_3(), "rule__MEnumParameterDefinition__LiteralsAssignment_3");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_4_1(), "rule__MEnumParameterDefinition__LiteralsAssignment_4_1");
					put(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantAssignment_0(), "rule__MEnumParameterSingleExpression__ConstantAssignment_0");
					put(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionAssignment_2(), "rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2");
					put(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameAssignment_3(), "rule__MEnumParameterSingleExpression__NameAssignment_3");
					put(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueAssignment_5(), "rule__MEnumParameterSingleExpression__DefaultValueAssignment_5");
					put(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantAssignment_0(), "rule__MRealParameterSingleExpression__ConstantAssignment_0");
					put(grammarAccess.getMRealParameterSingleExpressionAccess().getNameAssignment_2(), "rule__MRealParameterSingleExpression__NameAssignment_2");
					put(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueAssignment_4(), "rule__MRealParameterSingleExpression__DefaultValueAssignment_4");
					put(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeAssignment_5_1(), "rule__MRealParameterSingleExpression__RangeAssignment_5_1");
					put(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueAssignment_1(), "rule__MParameterValueBooleanLiteral__ValueAssignment_1");
					put(grammarAccess.getMParameterValueStringLiteralAccess().getValueAssignment_1(), "rule__MParameterValueStringLiteral__ValueAssignment_1");
					put(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueAssignment_1(), "rule__MParameterValueIntegerLiteral__ValueAssignment_1");
					put(grammarAccess.getMParameterValueRealLiteralAccess().getValueAssignment_1(), "rule__MParameterValueRealLiteral__ValueAssignment_1");
					put(grammarAccess.getMParameterValueRefObjectAccess().getObjectAssignment_1(), "rule__MParameterValueRefObject__ObjectAssignment_1");
					put(grammarAccess.getMParameterValuePARAccess().getValueAssignment_1(), "rule__MParameterValuePAR__ValueAssignment_1");
					put(grammarAccess.getMParameterValueExpressionAccess().getLeftAssignment_1(), "rule__MParameterValueExpression__LeftAssignment_1");
					put(grammarAccess.getMParameterValueExpressionAccess().getOperationAssignment_2_0(), "rule__MParameterValueExpression__OperationAssignment_2_0");
					put(grammarAccess.getMParameterValueExpressionAccess().getRightAssignment_2_1(), "rule__MParameterValueExpression__RightAssignment_2_1");
					put(grammarAccess.getMParameterValueTERMAccess().getLeftAssignment_1(), "rule__MParameterValueTERM__LeftAssignment_1");
					put(grammarAccess.getMParameterValueTERMAccess().getOperationAssignment_2_0(), "rule__MParameterValueTERM__OperationAssignment_2_0");
					put(grammarAccess.getMParameterValueTERMAccess().getRightAssignment_2_1(), "rule__MParameterValueTERM__RightAssignment_2_1");
					put(grammarAccess.getMParameterOCRAccess().getLowerValueAssignment_2(), "rule__MParameterOCR__LowerValueAssignment_2");
					put(grammarAccess.getMParameterOCRAccess().getUpperValueAssignment_4(), "rule__MParameterOCR__UpperValueAssignment_4");
					put(grammarAccess.getMParameterOORAccess().getLowerValueAssignment_2(), "rule__MParameterOOR__LowerValueAssignment_2");
					put(grammarAccess.getMParameterOORAccess().getUpperValueAssignment_4(), "rule__MParameterOOR__UpperValueAssignment_4");
					put(grammarAccess.getMParameterCORAccess().getLowerValueAssignment_2(), "rule__MParameterCOR__LowerValueAssignment_2");
					put(grammarAccess.getMParameterCORAccess().getUpperValueAssignment_4(), "rule__MParameterCOR__UpperValueAssignment_4");
					put(grammarAccess.getMParameterCCRAccess().getLowerValueAssignment_2(), "rule__MParameterCCR__LowerValueAssignment_2");
					put(grammarAccess.getMParameterCCRAccess().getUpperValueAssignment_4(), "rule__MParameterCCR__UpperValueAssignment_4");
					put(grammarAccess.getMEnumParameterLiteralAccess().getNameAssignment_1(), "rule__MEnumParameterLiteral__NameAssignment_1");
					put(grammarAccess.getMEnumParamIntegerLiteralAccess().getNameAssignment_1(), "rule__MEnumParamIntegerLiteral__NameAssignment_1");
					put(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueAssignment_3(), "rule__MEnumParamIntegerLiteral__ValueAssignment_3");
					put(grammarAccess.getMEnumParamRealLiteralAccess().getNameAssignment_1(), "rule__MEnumParamRealLiteral__NameAssignment_1");
					put(grammarAccess.getMEnumParamRealLiteralAccess().getValueAssignment_3(), "rule__MEnumParamRealLiteral__ValueAssignment_3");
					put(grammarAccess.getMEnumParamStringLiteralAccess().getNameAssignment_1(), "rule__MEnumParamStringLiteral__NameAssignment_1");
					put(grammarAccess.getMEnumParamStringLiteralAccess().getValueAssignment_3(), "rule__MEnumParamStringLiteral__ValueAssignment_3");
					put(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), "rule__MAbstractSwPackage__UnorderedGroup_5");
					put(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), "rule__MSwPackage__UnorderedGroup_5");
					put(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), "rule__MDriverSwPackage__UnorderedGroup_5");
					put(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), "rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5");
					put(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), "rule__MSwPackageSupportedPlatform__UnorderedGroup_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalSWPParser typedParser = (es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalSWPParser) parser;
			typedParser.entryRuleMMESPSWPPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SWPGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SWPGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
