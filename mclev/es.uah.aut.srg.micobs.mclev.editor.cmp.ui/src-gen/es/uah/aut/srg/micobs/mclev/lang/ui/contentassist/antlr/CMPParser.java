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
package es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.mclev.lang.services.CMPGrammarAccess;

public class CMPParser extends AbstractContentAssistParser {
	
	@Inject
	private CMPGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalCMPParser createParser() {
		es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalCMPParser result = new es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalCMPParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMMCLEVCMPPackageElementAccess().getAlternatives(), "rule__MMCLEVCMPPackageElement__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getMPortAccess().getAlternatives(), "rule__MPort__Alternatives");
					put(grammarAccess.getMInternalConnectionAccess().getAlternatives(), "rule__MInternalConnection__Alternatives");
					put(grammarAccess.getMParameterAccess().getAlternatives(), "rule__MParameter__Alternatives");
					put(grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives(), "rule__MEnumParameterLiteralRule__Alternatives");
					put(grammarAccess.getMParameterValueAccess().getAlternatives(), "rule__MParameterValue__Alternatives");
					put(grammarAccess.getMParameterValueLiteralAccess().getAlternatives(), "rule__MParameterValueLiteral__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getMParameterRangeAccess().getAlternatives(), "rule__MParameterRange__Alternatives");
					put(grammarAccess.getMInternalComponentConnectionAccess().getAlternatives_2(), "rule__MInternalComponentConnection__Alternatives_2");
					put(grammarAccess.getMInternalComponentConnectionAccess().getAlternatives_6(), "rule__MInternalComponentConnection__Alternatives_6");
					put(grammarAccess.getMInternalComponentPlatformSwitchAccess().getAlternatives_2(), "rule__MInternalComponentPlatformSwitch__Alternatives_2");
					put(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAlternatives_3(), "rule__MInternalComponentPlatformSwitchCase__Alternatives_3");
					put(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_0_2(), "rule__ComponentSupportedPlatform__Alternatives_5_0_2");
					put(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_1_2(), "rule__ComponentSupportedPlatform__Alternatives_5_1_2");
					put(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_2_2(), "rule__ComponentSupportedPlatform__Alternatives_5_2_2");
					put(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_4_2(), "rule__ComponentSupportedPlatform__Alternatives_5_4_2");
					put(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_5_2(), "rule__ComponentSupportedPlatform__Alternatives_5_5_2");
					put(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives(), "rule__MParameterValueExpressionOperators__Alternatives");
					put(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives(), "rule__MParameterValueTERMOperators__Alternatives");
					put(grammarAccess.getMMCLEVCMPPackageFileAccess().getGroup(), "rule__MMCLEVCMPPackageFile__Group__0");
					put(grammarAccess.getMMCLEVCMPPackageFileAccess().getGroup_3(), "rule__MMCLEVCMPPackageFile__Group_3__0");
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
					put(grammarAccess.getMAbstractComponentAccess().getGroup(), "rule__MAbstractComponent__Group__0");
					put(grammarAccess.getMAbstractComponentAccess().getGroup_6(), "rule__MAbstractComponent__Group_6__0");
					put(grammarAccess.getMAbstractComponentAccess().getGroup_6_2(), "rule__MAbstractComponent__Group_6_2__0");
					put(grammarAccess.getMAbstractComponentAccess().getGroup_8_0(), "rule__MAbstractComponent__Group_8_0__0");
					put(grammarAccess.getMAbstractComponentAccess().getGroup_8_1(), "rule__MAbstractComponent__Group_8_1__0");
					put(grammarAccess.getMAbstractComponentAccess().getGroup_8_2(), "rule__MAbstractComponent__Group_8_2__0");
					put(grammarAccess.getMAbstractComponentAccess().getGroup_8_3(), "rule__MAbstractComponent__Group_8_3__0");
					put(grammarAccess.getMComponentAccess().getGroup(), "rule__MComponent__Group__0");
					put(grammarAccess.getMComponentAccess().getGroup_6(), "rule__MComponent__Group_6__0");
					put(grammarAccess.getMComponentAccess().getGroup_6_2(), "rule__MComponent__Group_6_2__0");
					put(grammarAccess.getMComponentAccess().getGroup_8_0(), "rule__MComponent__Group_8_0__0");
					put(grammarAccess.getMComponentAccess().getGroup_8_1(), "rule__MComponent__Group_8_1__0");
					put(grammarAccess.getMComponentAccess().getGroup_8_1_3(), "rule__MComponent__Group_8_1_3__0");
					put(grammarAccess.getMComponentAccess().getGroup_8_2(), "rule__MComponent__Group_8_2__0");
					put(grammarAccess.getMComponentAccess().getGroup_8_3(), "rule__MComponent__Group_8_3__0");
					put(grammarAccess.getMComponentAccess().getGroup_8_4(), "rule__MComponent__Group_8_4__0");
					put(grammarAccess.getMComponentAccess().getGroup_8_5(), "rule__MComponent__Group_8_5__0");
					put(grammarAccess.getMComponentAccess().getGroup_8_6(), "rule__MComponent__Group_8_6__0");
					put(grammarAccess.getMComponentAccess().getGroup_8_6_3(), "rule__MComponent__Group_8_6_3__0");
					put(grammarAccess.getMComponentAccess().getGroup_8_7(), "rule__MComponent__Group_8_7__0");
					put(grammarAccess.getMComponentAccess().getGroup_8_8(), "rule__MComponent__Group_8_8__0");
					put(grammarAccess.getMComponentAccess().getGroup_8_9(), "rule__MComponent__Group_8_9__0");
					put(grammarAccess.getMInternalComponentInstanceAccess().getGroup(), "rule__MInternalComponentInstance__Group__0");
					put(grammarAccess.getMServerPortAccess().getGroup(), "rule__MServerPort__Group__0");
					put(grammarAccess.getMClientPortAccess().getGroup(), "rule__MClientPort__Group__0");
					put(grammarAccess.getMParameterValueAssignmentAccess().getGroup(), "rule__MParameterValueAssignment__Group__0");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup(), "rule__MIntegerParameterSingleExpression__Group__0");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_5(), "rule__MIntegerParameterSingleExpression__Group_5__0");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getGroup(), "rule__MEnumParameterDefinition__Group__0");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getGroup_5(), "rule__MEnumParameterDefinition__Group_5__0");
					put(grammarAccess.getMEnumParameterSingleExpressionAccess().getGroup(), "rule__MEnumParameterSingleExpression__Group__0");
					put(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup(), "rule__MRealParameterSingleExpression__Group__0");
					put(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_5(), "rule__MRealParameterSingleExpression__Group_5__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
					put(grammarAccess.getREALAccess().getGroup_1(), "rule__REAL__Group_1__0");
					put(grammarAccess.getREALAccess().getGroup_2(), "rule__REAL__Group_2__0");
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
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getGroup(), "rule__MBooleanParameterSingleExpression__Group__0");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getGroup(), "rule__MStringParameterSingleExpression__Group__0");
					put(grammarAccess.getMInternalComponentConnectionAccess().getGroup(), "rule__MInternalComponentConnection__Group__0");
					put(grammarAccess.getMInternalComponentConnectionAccess().getGroup_9(), "rule__MInternalComponentConnection__Group_9__0");
					put(grammarAccess.getMInternalComponentConnectionAccess().getGroup_9_3(), "rule__MInternalComponentConnection__Group_9_3__0");
					put(grammarAccess.getMInternalComponentConnectionAccess().getGroup_9_4(), "rule__MInternalComponentConnection__Group_9_4__0");
					put(grammarAccess.getMInternalComponentPlatformSwitchAccess().getGroup(), "rule__MInternalComponentPlatformSwitch__Group__0");
					put(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup(), "rule__MInternalComponentPlatformSwitchCase__Group__0");
					put(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup_6(), "rule__MInternalComponentPlatformSwitchCase__Group_6__0");
					put(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup_6_3(), "rule__MInternalComponentPlatformSwitchCase__Group_6_3__0");
					put(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup_6_4(), "rule__MInternalComponentPlatformSwitchCase__Group_6_4__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup(), "rule__ComponentSupportedPlatform__Group__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_0(), "rule__ComponentSupportedPlatform__Group_5_0__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_1(), "rule__ComponentSupportedPlatform__Group_5_1__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_2(), "rule__ComponentSupportedPlatform__Group_5_2__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_3(), "rule__ComponentSupportedPlatform__Group_5_3__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_4(), "rule__ComponentSupportedPlatform__Group_5_4__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_5(), "rule__ComponentSupportedPlatform__Group_5_5__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_6(), "rule__ComponentSupportedPlatform__Group_5_6__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_6_3(), "rule__ComponentSupportedPlatform__Group_5_6_3__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_7(), "rule__ComponentSupportedPlatform__Group_5_7__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_8(), "rule__ComponentSupportedPlatform__Group_5_8__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_9(), "rule__ComponentSupportedPlatform__Group_5_9__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_9_3(), "rule__ComponentSupportedPlatform__Group_5_9_3__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_10(), "rule__ComponentSupportedPlatform__Group_5_10__0");
					put(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_11(), "rule__ComponentSupportedPlatform__Group_5_11__0");
					put(grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageAssignment_1(), "rule__MMCLEVCMPPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMCLEVCMPPackageFileAccess().getImportsAssignment_3_1(), "rule__MMCLEVCMPPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMCLEVCMPPackageFileAccess().getElementAssignment_4(), "rule__MMCLEVCMPPackageFile__ElementAssignment_4");
					put(grammarAccess.getMAbstractComponentAccess().getDomainAssignment_2(), "rule__MAbstractComponent__DomainAssignment_2");
					put(grammarAccess.getMAbstractComponentAccess().getTypeAssignment_4(), "rule__MAbstractComponent__TypeAssignment_4");
					put(grammarAccess.getMAbstractComponentAccess().getNameAssignment_5(), "rule__MAbstractComponent__NameAssignment_5");
					put(grammarAccess.getMAbstractComponentAccess().getInheritsAssignment_6_1(), "rule__MAbstractComponent__InheritsAssignment_6_1");
					put(grammarAccess.getMAbstractComponentAccess().getInheritsAssignment_6_2_1(), "rule__MAbstractComponent__InheritsAssignment_6_2_1");
					put(grammarAccess.getMAbstractComponentAccess().getVersionAssignment_8_0_2(), "rule__MAbstractComponent__VersionAssignment_8_0_2");
					put(grammarAccess.getMAbstractComponentAccess().getAttributesAssignment_8_1_2(), "rule__MAbstractComponent__AttributesAssignment_8_1_2");
					put(grammarAccess.getMAbstractComponentAccess().getAttributeValueAssignmentsAssignment_8_2_3(), "rule__MAbstractComponent__AttributeValueAssignmentsAssignment_8_2_3");
					put(grammarAccess.getMAbstractComponentAccess().getExternalPortsAssignment_8_3_3(), "rule__MAbstractComponent__ExternalPortsAssignment_8_3_3");
					put(grammarAccess.getMComponentAccess().getDomainAssignment_2(), "rule__MComponent__DomainAssignment_2");
					put(grammarAccess.getMComponentAccess().getTypeAssignment_4(), "rule__MComponent__TypeAssignment_4");
					put(grammarAccess.getMComponentAccess().getNameAssignment_5(), "rule__MComponent__NameAssignment_5");
					put(grammarAccess.getMComponentAccess().getInheritsAssignment_6_1(), "rule__MComponent__InheritsAssignment_6_1");
					put(grammarAccess.getMComponentAccess().getInheritsAssignment_6_2_1(), "rule__MComponent__InheritsAssignment_6_2_1");
					put(grammarAccess.getMComponentAccess().getVersionAssignment_8_0_2(), "rule__MComponent__VersionAssignment_8_0_2");
					put(grammarAccess.getMComponentAccess().getLanguagesAssignment_8_1_2(), "rule__MComponent__LanguagesAssignment_8_1_2");
					put(grammarAccess.getMComponentAccess().getLanguagesAssignment_8_1_3_1(), "rule__MComponent__LanguagesAssignment_8_1_3_1");
					put(grammarAccess.getMComponentAccess().getAttributesAssignment_8_2_2(), "rule__MComponent__AttributesAssignment_8_2_2");
					put(grammarAccess.getMComponentAccess().getAttributeValueAssignmentsAssignment_8_3_3(), "rule__MComponent__AttributeValueAssignmentsAssignment_8_3_3");
					put(grammarAccess.getMComponentAccess().getExternalPortsAssignment_8_4_3(), "rule__MComponent__ExternalPortsAssignment_8_4_3");
					put(grammarAccess.getMComponentAccess().getInternalPortsAssignment_8_5_3(), "rule__MComponent__InternalPortsAssignment_8_5_3");
					put(grammarAccess.getMComponentAccess().getRequiresAssignment_8_6_2(), "rule__MComponent__RequiresAssignment_8_6_2");
					put(grammarAccess.getMComponentAccess().getRequiresAssignment_8_6_3_1(), "rule__MComponent__RequiresAssignment_8_6_3_1");
					put(grammarAccess.getMComponentAccess().getSupportedPlatformsAssignment_8_7_3(), "rule__MComponent__SupportedPlatformsAssignment_8_7_3");
					put(grammarAccess.getMComponentAccess().getInternalComponentsAssignment_8_8_3(), "rule__MComponent__InternalComponentsAssignment_8_8_3");
					put(grammarAccess.getMComponentAccess().getConnectionsAssignment_8_9_2(), "rule__MComponent__ConnectionsAssignment_8_9_2");
					put(grammarAccess.getMInternalComponentInstanceAccess().getIsSingletonAssignment_0(), "rule__MInternalComponentInstance__IsSingletonAssignment_0");
					put(grammarAccess.getMInternalComponentInstanceAccess().getComponentAssignment_2(), "rule__MInternalComponentInstance__ComponentAssignment_2");
					put(grammarAccess.getMInternalComponentInstanceAccess().getNameAssignment_3(), "rule__MInternalComponentInstance__NameAssignment_3");
					put(grammarAccess.getMInternalComponentInstanceAccess().getAttributeValueAssignmentsAssignment_5(), "rule__MInternalComponentInstance__AttributeValueAssignmentsAssignment_5");
					put(grammarAccess.getMServerPortAccess().getTypeAssignment_2(), "rule__MServerPort__TypeAssignment_2");
					put(grammarAccess.getMServerPortAccess().getInterfaceAssignment_3(), "rule__MServerPort__InterfaceAssignment_3");
					put(grammarAccess.getMServerPortAccess().getNameAssignment_4(), "rule__MServerPort__NameAssignment_4");
					put(grammarAccess.getMServerPortAccess().getAttributeValueAssignmentsAssignment_6(), "rule__MServerPort__AttributeValueAssignmentsAssignment_6");
					put(grammarAccess.getMClientPortAccess().getTypeAssignment_2(), "rule__MClientPort__TypeAssignment_2");
					put(grammarAccess.getMClientPortAccess().getInterfaceAssignment_3(), "rule__MClientPort__InterfaceAssignment_3");
					put(grammarAccess.getMClientPortAccess().getNameAssignment_4(), "rule__MClientPort__NameAssignment_4");
					put(grammarAccess.getMClientPortAccess().getAttributeValueAssignmentsAssignment_6(), "rule__MClientPort__AttributeValueAssignmentsAssignment_6");
					put(grammarAccess.getMParameterValueAssignmentAccess().getParameterAssignment_1(), "rule__MParameterValueAssignment__ParameterAssignment_1");
					put(grammarAccess.getMParameterValueAssignmentAccess().getParameterValueAssignment_3(), "rule__MParameterValueAssignment__ParameterValueAssignment_3");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantAssignment_0(), "rule__MIntegerParameterSingleExpression__ConstantAssignment_0");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameAssignment_2(), "rule__MIntegerParameterSingleExpression__NameAssignment_2");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueAssignment_4(), "rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeAssignment_5_1(), "rule__MIntegerParameterSingleExpression__RangeAssignment_5_1");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getNameAssignment_2(), "rule__MEnumParameterDefinition__NameAssignment_2");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_4(), "rule__MEnumParameterDefinition__LiteralsAssignment_4");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_5_1(), "rule__MEnumParameterDefinition__LiteralsAssignment_5_1");
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
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantAssignment_0(), "rule__MBooleanParameterSingleExpression__ConstantAssignment_0");
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_2(), "rule__MBooleanParameterSingleExpression__NameAssignment_2");
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_4(), "rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantAssignment_0(), "rule__MStringParameterSingleExpression__ConstantAssignment_0");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_2(), "rule__MStringParameterSingleExpression__NameAssignment_2");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_4(), "rule__MStringParameterSingleExpression__DefaultValueAssignment_4");
					put(grammarAccess.getMInternalComponentConnectionAccess().getClientInstanceAssignment_2_1(), "rule__MInternalComponentConnection__ClientInstanceAssignment_2_1");
					put(grammarAccess.getMInternalComponentConnectionAccess().getClientPortAssignment_4(), "rule__MInternalComponentConnection__ClientPortAssignment_4");
					put(grammarAccess.getMInternalComponentConnectionAccess().getServerInstanceAssignment_6_1(), "rule__MInternalComponentConnection__ServerInstanceAssignment_6_1");
					put(grammarAccess.getMInternalComponentConnectionAccess().getServerPortAssignment_8(), "rule__MInternalComponentConnection__ServerPortAssignment_8");
					put(grammarAccess.getMInternalComponentConnectionAccess().getConnectorAssignment_9_1(), "rule__MInternalComponentConnection__ConnectorAssignment_9_1");
					put(grammarAccess.getMInternalComponentConnectionAccess().getIfaceMappingAssignment_9_3_2(), "rule__MInternalComponentConnection__IfaceMappingAssignment_9_3_2");
					put(grammarAccess.getMInternalComponentConnectionAccess().getAttributeValueAssignmentsAssignment_9_4_1(), "rule__MInternalComponentConnection__AttributeValueAssignmentsAssignment_9_4_1");
					put(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientInstanceAssignment_2_1(), "rule__MInternalComponentPlatformSwitch__ClientInstanceAssignment_2_1");
					put(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientPortAssignment_4(), "rule__MInternalComponentPlatformSwitch__ClientPortAssignment_4");
					put(grammarAccess.getMInternalComponentPlatformSwitchAccess().getCasesAssignment_8(), "rule__MInternalComponentPlatformSwitch__CasesAssignment_8");
					put(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getPlatformAssignment_1(), "rule__MInternalComponentPlatformSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerInstanceAssignment_3_1(), "rule__MInternalComponentPlatformSwitchCase__ServerInstanceAssignment_3_1");
					put(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerPortAssignment_5(), "rule__MInternalComponentPlatformSwitchCase__ServerPortAssignment_5");
					put(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getConnectorAssignment_6_1(), "rule__MInternalComponentPlatformSwitchCase__ConnectorAssignment_6_1");
					put(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getIfaceMappingAssignment_6_3_2(), "rule__MInternalComponentPlatformSwitchCase__IfaceMappingAssignment_6_3_2");
					put(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeValueAssignmentsAssignment_6_4_1(), "rule__MInternalComponentPlatformSwitchCase__AttributeValueAssignmentsAssignment_6_4_1");
					put(grammarAccess.getComponentSupportedPlatformAccess().getNameAssignment_3(), "rule__ComponentSupportedPlatform__NameAssignment_3");
					put(grammarAccess.getComponentSupportedPlatformAccess().getOsapiAssignment_5_0_2_1(), "rule__ComponentSupportedPlatform__OsapiAssignment_5_0_2_1");
					put(grammarAccess.getComponentSupportedPlatformAccess().getOsAssignment_5_1_2_1(), "rule__ComponentSupportedPlatform__OsAssignment_5_1_2_1");
					put(grammarAccess.getComponentSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1(), "rule__ComponentSupportedPlatform__ArchitectureAssignment_5_2_2_1");
					put(grammarAccess.getComponentSupportedPlatformAccess().getCompilerAssignment_5_3_2(), "rule__ComponentSupportedPlatform__CompilerAssignment_5_3_2");
					put(grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1(), "rule__ComponentSupportedPlatform__MicroprocessorAssignment_5_4_2_1");
					put(grammarAccess.getComponentSupportedPlatformAccess().getBoardAssignment_5_5_2_1(), "rule__ComponentSupportedPlatform__BoardAssignment_5_5_2_1");
					put(grammarAccess.getComponentSupportedPlatformAccess().getRequiresAssignment_5_6_2(), "rule__ComponentSupportedPlatform__RequiresAssignment_5_6_2");
					put(grammarAccess.getComponentSupportedPlatformAccess().getRequiresAssignment_5_6_3_1(), "rule__ComponentSupportedPlatform__RequiresAssignment_5_6_3_1");
					put(grammarAccess.getComponentSupportedPlatformAccess().getAttributeValueAssignmentsAssignment_5_7_3(), "rule__ComponentSupportedPlatform__AttributeValueAssignmentsAssignment_5_7_3");
					put(grammarAccess.getComponentSupportedPlatformAccess().getAttributesAssignment_5_8_2(), "rule__ComponentSupportedPlatform__AttributesAssignment_5_8_2");
					put(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesAssignment_5_9_2(), "rule__ComponentSupportedPlatform__LanguagesAssignment_5_9_2");
					put(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesAssignment_5_9_3_1(), "rule__ComponentSupportedPlatform__LanguagesAssignment_5_9_3_1");
					put(grammarAccess.getComponentSupportedPlatformAccess().getInternalComponentsAssignment_5_10_3(), "rule__ComponentSupportedPlatform__InternalComponentsAssignment_5_10_3");
					put(grammarAccess.getComponentSupportedPlatformAccess().getConnectionsAssignment_5_11_2(), "rule__ComponentSupportedPlatform__ConnectionsAssignment_5_11_2");
					put(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), "rule__MAbstractComponent__UnorderedGroup_8");
					put(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), "rule__MComponent__UnorderedGroup_8");
					put(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), "rule__ComponentSupportedPlatform__UnorderedGroup_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalCMPParser typedParser = (es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalCMPParser) parser;
			typedParser.entryRuleMMCLEVCMPPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CMPGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CMPGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
