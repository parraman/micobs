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

import es.uah.aut.srg.micobs.mclev.lang.services.SLIBGrammarAccess;

public class SLIBParser extends AbstractContentAssistParser {
	
	@Inject
	private SLIBGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalSLIBParser createParser() {
		es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalSLIBParser result = new es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalSLIBParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMMCLEVSLIBPackageElementAccess().getAlternatives(), "rule__MMCLEVSLIBPackageElement__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getMSLibProvidedSAIAVAAccess().getAlternatives(), "rule__MSLibProvidedSAIAVA__Alternatives");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_0_2(), "rule__MServiceLibrarySupportedPlatform__Alternatives_5_0_2");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_1_2(), "rule__MServiceLibrarySupportedPlatform__Alternatives_5_1_2");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_2_2(), "rule__MServiceLibrarySupportedPlatform__Alternatives_5_2_2");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_4_2(), "rule__MServiceLibrarySupportedPlatform__Alternatives_5_4_2");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_5_2(), "rule__MServiceLibrarySupportedPlatform__Alternatives_5_5_2");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_0_2(), "rule__MDriverSLibSupportedPlatform__Alternatives_5_0_2");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_1_2(), "rule__MDriverSLibSupportedPlatform__Alternatives_5_1_2");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_2_2(), "rule__MDriverSLibSupportedPlatform__Alternatives_5_2_2");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_4_2(), "rule__MDriverSLibSupportedPlatform__Alternatives_5_4_2");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_5_2(), "rule__MDriverSLibSupportedPlatform__Alternatives_5_5_2");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getMParameterAccess().getAlternatives(), "rule__MParameter__Alternatives");
					put(grammarAccess.getMParameterWithoutSLSPAccess().getAlternatives(), "rule__MParameterWithoutSLSP__Alternatives");
					put(grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives(), "rule__MEnumParameterLiteralRule__Alternatives");
					put(grammarAccess.getMParameterValueAccess().getAlternatives(), "rule__MParameterValue__Alternatives");
					put(grammarAccess.getMParameterValueLiteralAccess().getAlternatives(), "rule__MParameterValueLiteral__Alternatives");
					put(grammarAccess.getMParameterRangeAccess().getAlternatives(), "rule__MParameterRange__Alternatives");
					put(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives(), "rule__MParameterValueExpressionOperators__Alternatives");
					put(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives(), "rule__MParameterValueTERMOperators__Alternatives");
					put(grammarAccess.getMMCLEVSLIBPackageFileAccess().getGroup(), "rule__MMCLEVSLIBPackageFile__Group__0");
					put(grammarAccess.getMMCLEVSLIBPackageFileAccess().getGroup_3(), "rule__MMCLEVSLIBPackageFile__Group_3__0");
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
					put(grammarAccess.getMAbstractServiceLibraryAccess().getGroup(), "rule__MAbstractServiceLibrary__Group__0");
					put(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_4(), "rule__MAbstractServiceLibrary__Group_4__0");
					put(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_4_2(), "rule__MAbstractServiceLibrary__Group_4_2__0");
					put(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_6_0(), "rule__MAbstractServiceLibrary__Group_6_0__0");
					put(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_6_1(), "rule__MAbstractServiceLibrary__Group_6_1__0");
					put(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_6_2(), "rule__MAbstractServiceLibrary__Group_6_2__0");
					put(grammarAccess.getMServiceLibraryProvidedSAIAccess().getGroup(), "rule__MServiceLibraryProvidedSAI__Group__0");
					put(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getGroup(), "rule__MSLibProvidedSAIAVAExpression__Group__0");
					put(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getGroup(), "rule__MSLibProvidedSAIAVASwitch__Group__0");
					put(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getGroup(), "rule__MSLibProvidedSAIAVASwitchCase__Group__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup(), "rule__MServiceLibrary__Group__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup_3(), "rule__MServiceLibrary__Group_3__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup_3_2(), "rule__MServiceLibrary__Group_3_2__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup_4(), "rule__MServiceLibrary__Group_4__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup_4_2(), "rule__MServiceLibrary__Group_4_2__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup_6_0(), "rule__MServiceLibrary__Group_6_0__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup_6_1(), "rule__MServiceLibrary__Group_6_1__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup_6_1_3(), "rule__MServiceLibrary__Group_6_1_3__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup_6_2(), "rule__MServiceLibrary__Group_6_2__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup_6_3(), "rule__MServiceLibrary__Group_6_3__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup_6_4(), "rule__MServiceLibrary__Group_6_4__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup_6_4_3(), "rule__MServiceLibrary__Group_6_4_3__0");
					put(grammarAccess.getMServiceLibraryAccess().getGroup_6_5(), "rule__MServiceLibrary__Group_6_5__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup(), "rule__MDriverServiceLibrary__Group__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup_4(), "rule__MDriverServiceLibrary__Group_4__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup_4_2(), "rule__MDriverServiceLibrary__Group_4_2__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup_5(), "rule__MDriverServiceLibrary__Group_5__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup_5_2(), "rule__MDriverServiceLibrary__Group_5_2__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_0(), "rule__MDriverServiceLibrary__Group_7_0__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_1(), "rule__MDriverServiceLibrary__Group_7_1__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_1_3(), "rule__MDriverServiceLibrary__Group_7_1_3__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_2(), "rule__MDriverServiceLibrary__Group_7_2__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_3(), "rule__MDriverServiceLibrary__Group_7_3__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_4(), "rule__MDriverServiceLibrary__Group_7_4__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_4_3(), "rule__MDriverServiceLibrary__Group_7_4_3__0");
					put(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_5(), "rule__MDriverServiceLibrary__Group_7_5__0");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup(), "rule__MServiceLibrarySupportedPlatform__Group__0");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_0(), "rule__MServiceLibrarySupportedPlatform__Group_5_0__0");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_1(), "rule__MServiceLibrarySupportedPlatform__Group_5_1__0");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_2(), "rule__MServiceLibrarySupportedPlatform__Group_5_2__0");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_3(), "rule__MServiceLibrarySupportedPlatform__Group_5_3__0");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_4(), "rule__MServiceLibrarySupportedPlatform__Group_5_4__0");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_5(), "rule__MServiceLibrarySupportedPlatform__Group_5_5__0");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_6(), "rule__MServiceLibrarySupportedPlatform__Group_5_6__0");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_7(), "rule__MServiceLibrarySupportedPlatform__Group_5_7__0");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_7_3(), "rule__MServiceLibrarySupportedPlatform__Group_5_7_3__0");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_8(), "rule__MServiceLibrarySupportedPlatform__Group_5_8__0");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_8_3(), "rule__MServiceLibrarySupportedPlatform__Group_5_8_3__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup(), "rule__MDriverSLibSupportedPlatform__Group__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_0(), "rule__MDriverSLibSupportedPlatform__Group_5_0__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_1(), "rule__MDriverSLibSupportedPlatform__Group_5_1__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_2(), "rule__MDriverSLibSupportedPlatform__Group_5_2__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_3(), "rule__MDriverSLibSupportedPlatform__Group_5_3__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_4(), "rule__MDriverSLibSupportedPlatform__Group_5_4__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_5(), "rule__MDriverSLibSupportedPlatform__Group_5_5__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_6(), "rule__MDriverSLibSupportedPlatform__Group_5_6__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_7(), "rule__MDriverSLibSupportedPlatform__Group_5_7__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_8(), "rule__MDriverSLibSupportedPlatform__Group_5_8__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_8_3(), "rule__MDriverSLibSupportedPlatform__Group_5_8_3__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_9(), "rule__MDriverSLibSupportedPlatform__Group_5_9__0");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_9_3(), "rule__MDriverSLibSupportedPlatform__Group_5_9_3__0");
					put(grammarAccess.getMDriverSLibSupportedDeviceAccess().getGroup(), "rule__MDriverSLibSupportedDevice__Group__0");
					put(grammarAccess.getMDriverSLibSupportedDeviceAccess().getGroup_4(), "rule__MDriverSLibSupportedDevice__Group_4__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
					put(grammarAccess.getREALAccess().getGroup_1(), "rule__REAL__Group_1__0");
					put(grammarAccess.getREALAccess().getGroup_2(), "rule__REAL__Group_2__0");
					put(grammarAccess.getMBooleanParamSLSPSwitchAccess().getGroup(), "rule__MBooleanParamSLSPSwitch__Group__0");
					put(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getGroup(), "rule__MBooleanParamSLSPSwitchCase__Group__0");
					put(grammarAccess.getMStringParamSLSPSwitchAccess().getGroup(), "rule__MStringParamSLSPSwitch__Group__0");
					put(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getGroup(), "rule__MStringParamSLSPSwitchCase__Group__0");
					put(grammarAccess.getMIntegerParamSLSPSwitchAccess().getGroup(), "rule__MIntegerParamSLSPSwitch__Group__0");
					put(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getGroup(), "rule__MIntegerParamSLSPSwitchCase__Group__0");
					put(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getGroup_4(), "rule__MIntegerParamSLSPSwitchCase__Group_4__0");
					put(grammarAccess.getMRealParamSLSPSwitchAccess().getGroup(), "rule__MRealParamSLSPSwitch__Group__0");
					put(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getGroup(), "rule__MRealParamSLSPSwitchCase__Group__0");
					put(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getGroup_4(), "rule__MRealParamSLSPSwitchCase__Group_4__0");
					put(grammarAccess.getMEnumParamSLSPSwitchAccess().getGroup(), "rule__MEnumParamSLSPSwitch__Group__0");
					put(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getGroup(), "rule__MEnumParamSLSPSwitchCase__Group__0");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup(), "rule__MIntegerParameterSingleExpression__Group__0");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_5(), "rule__MIntegerParameterSingleExpression__Group_5__0");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getGroup(), "rule__MEnumParameterDefinition__Group__0");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getGroup_5(), "rule__MEnumParameterDefinition__Group_5__0");
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
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getGroup(), "rule__MBooleanParameterSingleExpression__Group__0");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getGroup(), "rule__MStringParameterSingleExpression__Group__0");
					put(grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageAssignment_1(), "rule__MMCLEVSLIBPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportsAssignment_3_1(), "rule__MMCLEVSLIBPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMCLEVSLIBPackageFileAccess().getElementAssignment_4(), "rule__MMCLEVSLIBPackageFile__ElementAssignment_4");
					put(grammarAccess.getMAbstractServiceLibraryAccess().getNameAssignment_3(), "rule__MAbstractServiceLibrary__NameAssignment_3");
					put(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsAssignment_4_1(), "rule__MAbstractServiceLibrary__InheritsAssignment_4_1");
					put(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsAssignment_4_2_1(), "rule__MAbstractServiceLibrary__InheritsAssignment_4_2_1");
					put(grammarAccess.getMAbstractServiceLibraryAccess().getVersionAssignment_6_0_2(), "rule__MAbstractServiceLibrary__VersionAssignment_6_0_2");
					put(grammarAccess.getMAbstractServiceLibraryAccess().getAttributesAssignment_6_1_2(), "rule__MAbstractServiceLibrary__AttributesAssignment_6_1_2");
					put(grammarAccess.getMAbstractServiceLibraryAccess().getProvidesAssignment_6_2_3(), "rule__MAbstractServiceLibrary__ProvidesAssignment_6_2_3");
					put(grammarAccess.getMServiceLibraryProvidedSAIAccess().getSaiAssignment_1(), "rule__MServiceLibraryProvidedSAI__SaiAssignment_1");
					put(grammarAccess.getMServiceLibraryProvidedSAIAccess().getAttributeValueAssignmentsAssignment_3(), "rule__MServiceLibraryProvidedSAI__AttributeValueAssignmentsAssignment_3");
					put(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getParameterAssignment_1(), "rule__MSLibProvidedSAIAVAExpression__ParameterAssignment_1");
					put(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getAttributeValueAssignment_3(), "rule__MSLibProvidedSAIAVAExpression__AttributeValueAssignment_3");
					put(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getParameterAssignment_1(), "rule__MSLibProvidedSAIAVASwitch__ParameterAssignment_1");
					put(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getCasesAssignment_5(), "rule__MSLibProvidedSAIAVASwitch__CasesAssignment_5");
					put(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getPlatformAssignment_1(), "rule__MSLibProvidedSAIAVASwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getAttributeValueAssignment_3(), "rule__MSLibProvidedSAIAVASwitchCase__AttributeValueAssignment_3");
					put(grammarAccess.getMServiceLibraryAccess().getNameAssignment_2(), "rule__MServiceLibrary__NameAssignment_2");
					put(grammarAccess.getMServiceLibraryAccess().getInheritsAssignment_3_1(), "rule__MServiceLibrary__InheritsAssignment_3_1");
					put(grammarAccess.getMServiceLibraryAccess().getInheritsAssignment_3_2_1(), "rule__MServiceLibrary__InheritsAssignment_3_2_1");
					put(grammarAccess.getMServiceLibraryAccess().getExtendsAssignment_4_1(), "rule__MServiceLibrary__ExtendsAssignment_4_1");
					put(grammarAccess.getMServiceLibraryAccess().getExtendsAssignment_4_2_1(), "rule__MServiceLibrary__ExtendsAssignment_4_2_1");
					put(grammarAccess.getMServiceLibraryAccess().getVersionAssignment_6_0_2(), "rule__MServiceLibrary__VersionAssignment_6_0_2");
					put(grammarAccess.getMServiceLibraryAccess().getLanguagesAssignment_6_1_2(), "rule__MServiceLibrary__LanguagesAssignment_6_1_2");
					put(grammarAccess.getMServiceLibraryAccess().getLanguagesAssignment_6_1_3_1(), "rule__MServiceLibrary__LanguagesAssignment_6_1_3_1");
					put(grammarAccess.getMServiceLibraryAccess().getAttributesAssignment_6_2_2(), "rule__MServiceLibrary__AttributesAssignment_6_2_2");
					put(grammarAccess.getMServiceLibraryAccess().getProvidesAssignment_6_3_3(), "rule__MServiceLibrary__ProvidesAssignment_6_3_3");
					put(grammarAccess.getMServiceLibraryAccess().getRequiresAssignment_6_4_2(), "rule__MServiceLibrary__RequiresAssignment_6_4_2");
					put(grammarAccess.getMServiceLibraryAccess().getRequiresAssignment_6_4_3_1(), "rule__MServiceLibrary__RequiresAssignment_6_4_3_1");
					put(grammarAccess.getMServiceLibraryAccess().getSupportedPlatformsAssignment_6_5_3(), "rule__MServiceLibrary__SupportedPlatformsAssignment_6_5_3");
					put(grammarAccess.getMDriverServiceLibraryAccess().getNameAssignment_3(), "rule__MDriverServiceLibrary__NameAssignment_3");
					put(grammarAccess.getMDriverServiceLibraryAccess().getInheritsAssignment_4_1(), "rule__MDriverServiceLibrary__InheritsAssignment_4_1");
					put(grammarAccess.getMDriverServiceLibraryAccess().getInheritsAssignment_4_2_1(), "rule__MDriverServiceLibrary__InheritsAssignment_4_2_1");
					put(grammarAccess.getMDriverServiceLibraryAccess().getExtendsAssignment_5_1(), "rule__MDriverServiceLibrary__ExtendsAssignment_5_1");
					put(grammarAccess.getMDriverServiceLibraryAccess().getExtendsAssignment_5_2_1(), "rule__MDriverServiceLibrary__ExtendsAssignment_5_2_1");
					put(grammarAccess.getMDriverServiceLibraryAccess().getVersionAssignment_7_0_2(), "rule__MDriverServiceLibrary__VersionAssignment_7_0_2");
					put(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesAssignment_7_1_2(), "rule__MDriverServiceLibrary__LanguagesAssignment_7_1_2");
					put(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesAssignment_7_1_3_1(), "rule__MDriverServiceLibrary__LanguagesAssignment_7_1_3_1");
					put(grammarAccess.getMDriverServiceLibraryAccess().getAttributesAssignment_7_2_2(), "rule__MDriverServiceLibrary__AttributesAssignment_7_2_2");
					put(grammarAccess.getMDriverServiceLibraryAccess().getProvidesAssignment_7_3_3(), "rule__MDriverServiceLibrary__ProvidesAssignment_7_3_3");
					put(grammarAccess.getMDriverServiceLibraryAccess().getRequiresAssignment_7_4_2(), "rule__MDriverServiceLibrary__RequiresAssignment_7_4_2");
					put(grammarAccess.getMDriverServiceLibraryAccess().getRequiresAssignment_7_4_3_1(), "rule__MDriverServiceLibrary__RequiresAssignment_7_4_3_1");
					put(grammarAccess.getMDriverServiceLibraryAccess().getSupportedPlatformsAssignment_7_5_3(), "rule__MDriverServiceLibrary__SupportedPlatformsAssignment_7_5_3");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getNameAssignment_3(), "rule__MServiceLibrarySupportedPlatform__NameAssignment_3");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiAssignment_5_0_2_1(), "rule__MServiceLibrarySupportedPlatform__OsapiAssignment_5_0_2_1");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsAssignment_5_1_2_1(), "rule__MServiceLibrarySupportedPlatform__OsAssignment_5_1_2_1");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureAssignment_5_2_2_1(), "rule__MServiceLibrarySupportedPlatform__ArchitectureAssignment_5_2_2_1");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerAssignment_5_3_2(), "rule__MServiceLibrarySupportedPlatform__CompilerAssignment_5_3_2");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1(), "rule__MServiceLibrarySupportedPlatform__MicroprocessorAssignment_5_4_2_1");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardAssignment_5_5_2_1(), "rule__MServiceLibrarySupportedPlatform__BoardAssignment_5_5_2_1");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesAssignment_5_6_2(), "rule__MServiceLibrarySupportedPlatform__AttributesAssignment_5_6_2");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesAssignment_5_7_2(), "rule__MServiceLibrarySupportedPlatform__LanguagesAssignment_5_7_2");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesAssignment_5_7_3_1(), "rule__MServiceLibrarySupportedPlatform__LanguagesAssignment_5_7_3_1");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresAssignment_5_8_2(), "rule__MServiceLibrarySupportedPlatform__RequiresAssignment_5_8_2");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresAssignment_5_8_3_1(), "rule__MServiceLibrarySupportedPlatform__RequiresAssignment_5_8_3_1");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getNameAssignment_3(), "rule__MDriverSLibSupportedPlatform__NameAssignment_3");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiAssignment_5_0_2_1(), "rule__MDriverSLibSupportedPlatform__OsapiAssignment_5_0_2_1");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsAssignment_5_1_2_1(), "rule__MDriverSLibSupportedPlatform__OsAssignment_5_1_2_1");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1(), "rule__MDriverSLibSupportedPlatform__ArchitectureAssignment_5_2_2_1");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerAssignment_5_3_2(), "rule__MDriverSLibSupportedPlatform__CompilerAssignment_5_3_2");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1(), "rule__MDriverSLibSupportedPlatform__MicroprocessorAssignment_5_4_2_1");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardAssignment_5_5_2_1(), "rule__MDriverSLibSupportedPlatform__BoardAssignment_5_5_2_1");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesAssignment_5_6_2(), "rule__MDriverSLibSupportedPlatform__AttributesAssignment_5_6_2");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedDevicesAssignment_5_7_3(), "rule__MDriverSLibSupportedPlatform__SupportedDevicesAssignment_5_7_3");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesAssignment_5_8_2(), "rule__MDriverSLibSupportedPlatform__LanguagesAssignment_5_8_2");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesAssignment_5_8_3_1(), "rule__MDriverSLibSupportedPlatform__LanguagesAssignment_5_8_3_1");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresAssignment_5_9_2(), "rule__MDriverSLibSupportedPlatform__RequiresAssignment_5_9_2");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresAssignment_5_9_3_1(), "rule__MDriverSLibSupportedPlatform__RequiresAssignment_5_9_3_1");
					put(grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceAssignment_1(), "rule__MDriverSLibSupportedDevice__DeviceAssignment_1");
					put(grammarAccess.getMDriverSLibSupportedDeviceAccess().getNameAssignment_2(), "rule__MDriverSLibSupportedDevice__NameAssignment_2");
					put(grammarAccess.getMDriverSLibSupportedDeviceAccess().getRequiredAssignment_4_2(), "rule__MDriverSLibSupportedDevice__RequiredAssignment_4_2");
					put(grammarAccess.getMBooleanParamSLSPSwitchAccess().getConstantAssignment_0(), "rule__MBooleanParamSLSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMBooleanParamSLSPSwitchAccess().getNameAssignment_2(), "rule__MBooleanParamSLSPSwitch__NameAssignment_2");
					put(grammarAccess.getMBooleanParamSLSPSwitchAccess().getCasesAssignment_6(), "rule__MBooleanParamSLSPSwitch__CasesAssignment_6");
					put(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MBooleanParamSLSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MBooleanParamSLSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMStringParamSLSPSwitchAccess().getConstantAssignment_0(), "rule__MStringParamSLSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMStringParamSLSPSwitchAccess().getNameAssignment_2(), "rule__MStringParamSLSPSwitch__NameAssignment_2");
					put(grammarAccess.getMStringParamSLSPSwitchAccess().getCasesAssignment_6(), "rule__MStringParamSLSPSwitch__CasesAssignment_6");
					put(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MStringParamSLSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MStringParamSLSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMIntegerParamSLSPSwitchAccess().getConstantAssignment_0(), "rule__MIntegerParamSLSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMIntegerParamSLSPSwitchAccess().getNameAssignment_2(), "rule__MIntegerParamSLSPSwitch__NameAssignment_2");
					put(grammarAccess.getMIntegerParamSLSPSwitchAccess().getCasesAssignment_6(), "rule__MIntegerParamSLSPSwitch__CasesAssignment_6");
					put(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MIntegerParamSLSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MIntegerParamSLSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getRangeAssignment_4_1(), "rule__MIntegerParamSLSPSwitchCase__RangeAssignment_4_1");
					put(grammarAccess.getMRealParamSLSPSwitchAccess().getConstantAssignment_0(), "rule__MRealParamSLSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMRealParamSLSPSwitchAccess().getNameAssignment_2(), "rule__MRealParamSLSPSwitch__NameAssignment_2");
					put(grammarAccess.getMRealParamSLSPSwitchAccess().getCasesAssignment_6(), "rule__MRealParamSLSPSwitch__CasesAssignment_6");
					put(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MRealParamSLSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MRealParamSLSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getRangeAssignment_4_1(), "rule__MRealParamSLSPSwitchCase__RangeAssignment_4_1");
					put(grammarAccess.getMEnumParamSLSPSwitchAccess().getConstantAssignment_0(), "rule__MEnumParamSLSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumDefinitionAssignment_2(), "rule__MEnumParamSLSPSwitch__EnumDefinitionAssignment_2");
					put(grammarAccess.getMEnumParamSLSPSwitchAccess().getNameAssignment_3(), "rule__MEnumParamSLSPSwitch__NameAssignment_3");
					put(grammarAccess.getMEnumParamSLSPSwitchAccess().getCasesAssignment_7(), "rule__MEnumParamSLSPSwitch__CasesAssignment_7");
					put(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MEnumParamSLSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MEnumParamSLSPSwitchCase__DefaultValueAssignment_3");
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
					put(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), "rule__MAbstractServiceLibrary__UnorderedGroup_6");
					put(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), "rule__MServiceLibrary__UnorderedGroup_6");
					put(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), "rule__MDriverServiceLibrary__UnorderedGroup_7");
					put(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), "rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5");
					put(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), "rule__MDriverSLibSupportedPlatform__UnorderedGroup_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalSLIBParser typedParser = (es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalSLIBParser) parser;
			typedParser.entryRuleMMCLEVSLIBPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SLIBGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SLIBGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
