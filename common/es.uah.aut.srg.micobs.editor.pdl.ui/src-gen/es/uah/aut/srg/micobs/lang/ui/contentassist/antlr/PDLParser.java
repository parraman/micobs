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
package es.uah.aut.srg.micobs.lang.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.lang.services.PDLGrammarAccess;

public class PDLParser extends AbstractContentAssistParser {
	
	@Inject
	private PDLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal.InternalPDLParser createParser() {
		es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal.InternalPDLParser result = new es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal.InternalPDLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMPDLPackageElementAccess().getAlternatives(), "rule__MPDLPackageElement__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getMOSSupportedOSAPIPVAAccess().getAlternatives(), "rule__MOSSupportedOSAPIPVA__Alternatives");
					put(grammarAccess.getMParameterAccess().getAlternatives(), "rule__MParameter__Alternatives");
					put(grammarAccess.getMParameterWithoutOSSPAccess().getAlternatives(), "rule__MParameterWithoutOSSP__Alternatives");
					put(grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives(), "rule__MEnumParameterLiteralRule__Alternatives");
					put(grammarAccess.getMParameterValueAccess().getAlternatives(), "rule__MParameterValue__Alternatives");
					put(grammarAccess.getMParameterValueLiteralAccess().getAlternatives(), "rule__MParameterValueLiteral__Alternatives");
					put(grammarAccess.getMParameterRangeAccess().getAlternatives(), "rule__MParameterRange__Alternatives");
					put(grammarAccess.getMOSSupportedPlatformAccess().getAlternatives_5_2_2(), "rule__MOSSupportedPlatform__Alternatives_5_2_2");
					put(grammarAccess.getMOSSupportedPlatformAccess().getAlternatives_5_3_2(), "rule__MOSSupportedPlatform__Alternatives_5_3_2");
					put(grammarAccess.getMPlatformAccess().getAlternatives_3_5_2(), "rule__MPlatform__Alternatives_3_5_2");
					put(grammarAccess.getMPlatformAccess().getAlternatives_3_6_2(), "rule__MPlatform__Alternatives_3_6_2");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives(), "rule__MParameterValueExpressionOperators__Alternatives");
					put(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives(), "rule__MParameterValueTERMOperators__Alternatives");
					put(grammarAccess.getMPDLPackageFileAccess().getGroup(), "rule__MPDLPackageFile__Group__0");
					put(grammarAccess.getMPDLPackageFileAccess().getGroup_3(), "rule__MPDLPackageFile__Group_3__0");
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
					put(grammarAccess.getMCompilerAccess().getGroup(), "rule__MCompiler__Group__0");
					put(grammarAccess.getMCompilerAccess().getGroup_2(), "rule__MCompiler__Group_2__0");
					put(grammarAccess.getMCompilerAccess().getGroup_2_2(), "rule__MCompiler__Group_2_2__0");
					put(grammarAccess.getMCompilerAccess().getGroup_4_0(), "rule__MCompiler__Group_4_0__0");
					put(grammarAccess.getMCompilerAccess().getGroup_4_1(), "rule__MCompiler__Group_4_1__0");
					put(grammarAccess.getMCompilerAccess().getGroup_4_2(), "rule__MCompiler__Group_4_2__0");
					put(grammarAccess.getMCompilerFrontendAccess().getGroup(), "rule__MCompilerFrontend__Group__0");
					put(grammarAccess.getMCompilerFrontendAccess().getGroup_3_0(), "rule__MCompilerFrontend__Group_3_0__0");
					put(grammarAccess.getMCompilerFrontendAccess().getGroup_3_1(), "rule__MCompilerFrontend__Group_3_1__0");
					put(grammarAccess.getMCompilerFrontendAccess().getGroup_3_1_3(), "rule__MCompilerFrontend__Group_3_1_3__0");
					put(grammarAccess.getMCompilerFrontendAccess().getGroup_3_2(), "rule__MCompilerFrontend__Group_3_2__0");
					put(grammarAccess.getMBoardAccess().getGroup(), "rule__MBoard__Group__0");
					put(grammarAccess.getMBoardAccess().getGroup_3_0(), "rule__MBoard__Group_3_0__0");
					put(grammarAccess.getMBoardAccess().getGroup_3_1(), "rule__MBoard__Group_3_1__0");
					put(grammarAccess.getMBoardAccess().getGroup_3_2(), "rule__MBoard__Group_3_2__0");
					put(grammarAccess.getMBoardAccess().getGroup_3_3(), "rule__MBoard__Group_3_3__0");
					put(grammarAccess.getMBoardSupportedDeviceAccess().getGroup(), "rule__MBoardSupportedDevice__Group__0");
					put(grammarAccess.getMMicroprocessorAccess().getGroup(), "rule__MMicroprocessor__Group__0");
					put(grammarAccess.getMMicroprocessorAccess().getGroup_3_0(), "rule__MMicroprocessor__Group_3_0__0");
					put(grammarAccess.getMMicroprocessorAccess().getGroup_3_1(), "rule__MMicroprocessor__Group_3_1__0");
					put(grammarAccess.getMMicroprocessorAccess().getGroup_3_2(), "rule__MMicroprocessor__Group_3_2__0");
					put(grammarAccess.getMOperatingSystemAccess().getGroup(), "rule__MOperatingSystem__Group__0");
					put(grammarAccess.getMOperatingSystemAccess().getGroup_2(), "rule__MOperatingSystem__Group_2__0");
					put(grammarAccess.getMOperatingSystemAccess().getGroup_2_2(), "rule__MOperatingSystem__Group_2_2__0");
					put(grammarAccess.getMOperatingSystemAccess().getGroup_4_0(), "rule__MOperatingSystem__Group_4_0__0");
					put(grammarAccess.getMOperatingSystemAccess().getGroup_4_1(), "rule__MOperatingSystem__Group_4_1__0");
					put(grammarAccess.getMOperatingSystemAccess().getGroup_4_1_3(), "rule__MOperatingSystem__Group_4_1_3__0");
					put(grammarAccess.getMOperatingSystemAccess().getGroup_4_2(), "rule__MOperatingSystem__Group_4_2__0");
					put(grammarAccess.getMOperatingSystemAccess().getGroup_4_3(), "rule__MOperatingSystem__Group_4_3__0");
					put(grammarAccess.getMOperatingSystemAccess().getGroup_4_4(), "rule__MOperatingSystem__Group_4_4__0");
					put(grammarAccess.getMOSSupportedOSAPIAccess().getGroup(), "rule__MOSSupportedOSAPI__Group__0");
					put(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getGroup(), "rule__MOSSupportedOSAPIPVAExpression__Group__0");
					put(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getGroup(), "rule__MOSSupportedOSAPIPVASwitch__Group__0");
					put(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getGroup(), "rule__MOSSupportedOSAPIPVASwitchCase__Group__0");
					put(grammarAccess.getMBooleanParamOSSPSwitchAccess().getGroup(), "rule__MBooleanParamOSSPSwitch__Group__0");
					put(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getGroup(), "rule__MBooleanParamOSSPSwitchCase__Group__0");
					put(grammarAccess.getMStringParamOSSPSwitchAccess().getGroup(), "rule__MStringParamOSSPSwitch__Group__0");
					put(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getGroup(), "rule__MStringParamOSSPSwitchCase__Group__0");
					put(grammarAccess.getMIntegerParamOSSPSwitchAccess().getGroup(), "rule__MIntegerParamOSSPSwitch__Group__0");
					put(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getGroup(), "rule__MIntegerParamOSSPSwitchCase__Group__0");
					put(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getGroup_4(), "rule__MIntegerParamOSSPSwitchCase__Group_4__0");
					put(grammarAccess.getMRealParamOSSPSwitchAccess().getGroup(), "rule__MRealParamOSSPSwitch__Group__0");
					put(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getGroup(), "rule__MRealParamOSSPSwitchCase__Group__0");
					put(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getGroup_4(), "rule__MRealParamOSSPSwitchCase__Group_4__0");
					put(grammarAccess.getMEnumParamOSSPSwitchAccess().getGroup(), "rule__MEnumParamOSSPSwitch__Group__0");
					put(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getGroup(), "rule__MEnumParamOSSPSwitchCase__Group__0");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup(), "rule__MIntegerParameterSingleExpression__Group__0");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_5(), "rule__MIntegerParameterSingleExpression__Group_5__0");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getGroup(), "rule__MEnumParameterDefinition__Group__0");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getGroup_4(), "rule__MEnumParameterDefinition__Group_4__0");
					put(grammarAccess.getMEnumParameterSingleExpressionAccess().getGroup(), "rule__MEnumParameterSingleExpression__Group__0");
					put(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup(), "rule__MRealParameterSingleExpression__Group__0");
					put(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_5(), "rule__MRealParameterSingleExpression__Group_5__0");
					put(grammarAccess.getMEnumParameterLiteralAccess().getGroup(), "rule__MEnumParameterLiteral__Group__0");
					put(grammarAccess.getMEnumParamIntegerLiteralAccess().getGroup(), "rule__MEnumParamIntegerLiteral__Group__0");
					put(grammarAccess.getMEnumParamRealLiteralAccess().getGroup(), "rule__MEnumParamRealLiteral__Group__0");
					put(grammarAccess.getMEnumParamStringLiteralAccess().getGroup(), "rule__MEnumParamStringLiteral__Group__0");
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getGroup(), "rule__MBooleanParameterSingleExpression__Group__0");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getGroup(), "rule__MStringParameterSingleExpression__Group__0");
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
					put(grammarAccess.getMOperatingSystemAPIAccess().getGroup(), "rule__MOperatingSystemAPI__Group__0");
					put(grammarAccess.getMOperatingSystemAPIAccess().getGroup_2(), "rule__MOperatingSystemAPI__Group_2__0");
					put(grammarAccess.getMOperatingSystemAPIAccess().getGroup_2_2(), "rule__MOperatingSystemAPI__Group_2_2__0");
					put(grammarAccess.getMOperatingSystemAPIAccess().getGroup_4_0(), "rule__MOperatingSystemAPI__Group_4_0__0");
					put(grammarAccess.getMOperatingSystemAPIAccess().getGroup_4_1(), "rule__MOperatingSystemAPI__Group_4_1__0");
					put(grammarAccess.getMOperatingSystemAPIAccess().getGroup_4_2(), "rule__MOperatingSystemAPI__Group_4_2__0");
					put(grammarAccess.getMDeviceAccess().getGroup(), "rule__MDevice__Group__0");
					put(grammarAccess.getMDeviceAccess().getGroup_3_0(), "rule__MDevice__Group_3_0__0");
					put(grammarAccess.getMDeviceAccess().getGroup_3_1(), "rule__MDevice__Group_3_1__0");
					put(grammarAccess.getMArchitectureAccess().getGroup(), "rule__MArchitecture__Group__0");
					put(grammarAccess.getMArchitectureAccess().getGroup_2(), "rule__MArchitecture__Group_2__0");
					put(grammarAccess.getMArchitectureAccess().getGroup_2_2(), "rule__MArchitecture__Group_2_2__0");
					put(grammarAccess.getMArchitectureAccess().getGroup_4_0(), "rule__MArchitecture__Group_4_0__0");
					put(grammarAccess.getMArchitectureAccess().getGroup_4_1(), "rule__MArchitecture__Group_4_1__0");
					put(grammarAccess.getMOSSupportedPlatformAccess().getGroup(), "rule__MOSSupportedPlatform__Group__0");
					put(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_0(), "rule__MOSSupportedPlatform__Group_5_0__0");
					put(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_1(), "rule__MOSSupportedPlatform__Group_5_1__0");
					put(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_2(), "rule__MOSSupportedPlatform__Group_5_2__0");
					put(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_3(), "rule__MOSSupportedPlatform__Group_5_3__0");
					put(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_4(), "rule__MOSSupportedPlatform__Group_5_4__0");
					put(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_4_3(), "rule__MOSSupportedPlatform__Group_5_4_3__0");
					put(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_5(), "rule__MOSSupportedPlatform__Group_5_5__0");
					put(grammarAccess.getMPlatformAccess().getGroup(), "rule__MPlatform__Group__0");
					put(grammarAccess.getMPlatformAccess().getGroup_3_0(), "rule__MPlatform__Group_3_0__0");
					put(grammarAccess.getMPlatformAccess().getGroup_3_1(), "rule__MPlatform__Group_3_1__0");
					put(grammarAccess.getMPlatformAccess().getGroup_3_2(), "rule__MPlatform__Group_3_2__0");
					put(grammarAccess.getMPlatformAccess().getGroup_3_3(), "rule__MPlatform__Group_3_3__0");
					put(grammarAccess.getMPlatformAccess().getGroup_3_4(), "rule__MPlatform__Group_3_4__0");
					put(grammarAccess.getMPlatformAccess().getGroup_3_5(), "rule__MPlatform__Group_3_5__0");
					put(grammarAccess.getMPlatformAccess().getGroup_3_6(), "rule__MPlatform__Group_3_6__0");
					put(grammarAccess.getMPlatformAccess().getGroup_3_7(), "rule__MPlatform__Group_3_7__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
					put(grammarAccess.getREALAccess().getGroup_1(), "rule__REAL__Group_1__0");
					put(grammarAccess.getREALAccess().getGroup_2(), "rule__REAL__Group_2__0");
					put(grammarAccess.getMPDLPackageFileAccess().getPackageAssignment_1(), "rule__MPDLPackageFile__PackageAssignment_1");
					put(grammarAccess.getMPDLPackageFileAccess().getImportsAssignment_3_1(), "rule__MPDLPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMPDLPackageFileAccess().getElementAssignment_4(), "rule__MPDLPackageFile__ElementAssignment_4");
					put(grammarAccess.getMCompilerAccess().getNameAssignment_1(), "rule__MCompiler__NameAssignment_1");
					put(grammarAccess.getMCompilerAccess().getExtendsAssignment_2_1(), "rule__MCompiler__ExtendsAssignment_2_1");
					put(grammarAccess.getMCompilerAccess().getExtendsAssignment_2_2_1(), "rule__MCompiler__ExtendsAssignment_2_2_1");
					put(grammarAccess.getMCompilerAccess().getVersionAssignment_4_0_2(), "rule__MCompiler__VersionAssignment_4_0_2");
					put(grammarAccess.getMCompilerAccess().getFrontendsAssignment_4_1_2(), "rule__MCompiler__FrontendsAssignment_4_1_2");
					put(grammarAccess.getMCompilerAccess().getParametersAssignment_4_2_3(), "rule__MCompiler__ParametersAssignment_4_2_3");
					put(grammarAccess.getMCompilerFrontendAccess().getNameAssignment_1(), "rule__MCompilerFrontend__NameAssignment_1");
					put(grammarAccess.getMCompilerFrontendAccess().getLanguageAssignment_3_0_2(), "rule__MCompilerFrontend__LanguageAssignment_3_0_2");
					put(grammarAccess.getMCompilerFrontendAccess().getArchitecturesAssignment_3_1_2(), "rule__MCompilerFrontend__ArchitecturesAssignment_3_1_2");
					put(grammarAccess.getMCompilerFrontendAccess().getArchitecturesAssignment_3_1_3_1(), "rule__MCompilerFrontend__ArchitecturesAssignment_3_1_3_1");
					put(grammarAccess.getMCompilerFrontendAccess().getParametersAssignment_3_2_3(), "rule__MCompilerFrontend__ParametersAssignment_3_2_3");
					put(grammarAccess.getMBoardAccess().getNameAssignment_1(), "rule__MBoard__NameAssignment_1");
					put(grammarAccess.getMBoardAccess().getVersionAssignment_3_0_2(), "rule__MBoard__VersionAssignment_3_0_2");
					put(grammarAccess.getMBoardAccess().getSupportedDevicesAssignment_3_1_3(), "rule__MBoard__SupportedDevicesAssignment_3_1_3");
					put(grammarAccess.getMBoardAccess().getMicroprocessorAssignment_3_2_2(), "rule__MBoard__MicroprocessorAssignment_3_2_2");
					put(grammarAccess.getMBoardAccess().getParametersAssignment_3_3_3(), "rule__MBoard__ParametersAssignment_3_3_3");
					put(grammarAccess.getMBoardSupportedDeviceAccess().getDeviceAssignment_1(), "rule__MBoardSupportedDevice__DeviceAssignment_1");
					put(grammarAccess.getMBoardSupportedDeviceAccess().getLowerBoundAssignment_3(), "rule__MBoardSupportedDevice__LowerBoundAssignment_3");
					put(grammarAccess.getMBoardSupportedDeviceAccess().getUpperBoundAssignment_5(), "rule__MBoardSupportedDevice__UpperBoundAssignment_5");
					put(grammarAccess.getMMicroprocessorAccess().getNameAssignment_1(), "rule__MMicroprocessor__NameAssignment_1");
					put(grammarAccess.getMMicroprocessorAccess().getVersionAssignment_3_0_2(), "rule__MMicroprocessor__VersionAssignment_3_0_2");
					put(grammarAccess.getMMicroprocessorAccess().getArchitectureAssignment_3_1_2(), "rule__MMicroprocessor__ArchitectureAssignment_3_1_2");
					put(grammarAccess.getMMicroprocessorAccess().getParametersAssignment_3_2_3(), "rule__MMicroprocessor__ParametersAssignment_3_2_3");
					put(grammarAccess.getMOperatingSystemAccess().getNameAssignment_1(), "rule__MOperatingSystem__NameAssignment_1");
					put(grammarAccess.getMOperatingSystemAccess().getInheritsAssignment_2_1(), "rule__MOperatingSystem__InheritsAssignment_2_1");
					put(grammarAccess.getMOperatingSystemAccess().getInheritsAssignment_2_2_1(), "rule__MOperatingSystem__InheritsAssignment_2_2_1");
					put(grammarAccess.getMOperatingSystemAccess().getVersionAssignment_4_0_2(), "rule__MOperatingSystem__VersionAssignment_4_0_2");
					put(grammarAccess.getMOperatingSystemAccess().getLanguagesAssignment_4_1_2(), "rule__MOperatingSystem__LanguagesAssignment_4_1_2");
					put(grammarAccess.getMOperatingSystemAccess().getLanguagesAssignment_4_1_3_1(), "rule__MOperatingSystem__LanguagesAssignment_4_1_3_1");
					put(grammarAccess.getMOperatingSystemAccess().getSupportedOSAPIsAssignment_4_2_3(), "rule__MOperatingSystem__SupportedOSAPIsAssignment_4_2_3");
					put(grammarAccess.getMOperatingSystemAccess().getSupportedPlatformsAssignment_4_3_3(), "rule__MOperatingSystem__SupportedPlatformsAssignment_4_3_3");
					put(grammarAccess.getMOperatingSystemAccess().getParametersAssignment_4_4_3(), "rule__MOperatingSystem__ParametersAssignment_4_4_3");
					put(grammarAccess.getMOSSupportedOSAPIAccess().getOsapiAssignment_1(), "rule__MOSSupportedOSAPI__OsapiAssignment_1");
					put(grammarAccess.getMOSSupportedOSAPIAccess().getParameterValueAssignmentsAssignment_3(), "rule__MOSSupportedOSAPI__ParameterValueAssignmentsAssignment_3");
					put(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterAssignment_1(), "rule__MOSSupportedOSAPIPVAExpression__ParameterAssignment_1");
					put(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterValueAssignment_3(), "rule__MOSSupportedOSAPIPVAExpression__ParameterValueAssignment_3");
					put(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getParameterAssignment_2(), "rule__MOSSupportedOSAPIPVASwitch__ParameterAssignment_2");
					put(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getCasesAssignment_5(), "rule__MOSSupportedOSAPIPVASwitch__CasesAssignment_5");
					put(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getPlatformAssignment_1(), "rule__MOSSupportedOSAPIPVASwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getParameterValueAssignment_3(), "rule__MOSSupportedOSAPIPVASwitchCase__ParameterValueAssignment_3");
					put(grammarAccess.getMBooleanParamOSSPSwitchAccess().getConstantAssignment_0(), "rule__MBooleanParamOSSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMBooleanParamOSSPSwitchAccess().getNameAssignment_2(), "rule__MBooleanParamOSSPSwitch__NameAssignment_2");
					put(grammarAccess.getMBooleanParamOSSPSwitchAccess().getCasesAssignment_6(), "rule__MBooleanParamOSSPSwitch__CasesAssignment_6");
					put(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MBooleanParamOSSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MBooleanParamOSSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMStringParamOSSPSwitchAccess().getConstantAssignment_0(), "rule__MStringParamOSSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMStringParamOSSPSwitchAccess().getNameAssignment_2(), "rule__MStringParamOSSPSwitch__NameAssignment_2");
					put(grammarAccess.getMStringParamOSSPSwitchAccess().getCasesAssignment_6(), "rule__MStringParamOSSPSwitch__CasesAssignment_6");
					put(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MStringParamOSSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MStringParamOSSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMIntegerParamOSSPSwitchAccess().getConstantAssignment_0(), "rule__MIntegerParamOSSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMIntegerParamOSSPSwitchAccess().getNameAssignment_2(), "rule__MIntegerParamOSSPSwitch__NameAssignment_2");
					put(grammarAccess.getMIntegerParamOSSPSwitchAccess().getCasesAssignment_6(), "rule__MIntegerParamOSSPSwitch__CasesAssignment_6");
					put(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MIntegerParamOSSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MIntegerParamOSSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getRangeAssignment_4_1(), "rule__MIntegerParamOSSPSwitchCase__RangeAssignment_4_1");
					put(grammarAccess.getMRealParamOSSPSwitchAccess().getConstantAssignment_0(), "rule__MRealParamOSSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMRealParamOSSPSwitchAccess().getNameAssignment_2(), "rule__MRealParamOSSPSwitch__NameAssignment_2");
					put(grammarAccess.getMRealParamOSSPSwitchAccess().getCasesAssignment_6(), "rule__MRealParamOSSPSwitch__CasesAssignment_6");
					put(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MRealParamOSSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MRealParamOSSPSwitchCase__DefaultValueAssignment_3");
					put(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getRangeAssignment_4_1(), "rule__MRealParamOSSPSwitchCase__RangeAssignment_4_1");
					put(grammarAccess.getMEnumParamOSSPSwitchAccess().getConstantAssignment_0(), "rule__MEnumParamOSSPSwitch__ConstantAssignment_0");
					put(grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumDefinitionAssignment_2(), "rule__MEnumParamOSSPSwitch__EnumDefinitionAssignment_2");
					put(grammarAccess.getMEnumParamOSSPSwitchAccess().getNameAssignment_3(), "rule__MEnumParamOSSPSwitch__NameAssignment_3");
					put(grammarAccess.getMEnumParamOSSPSwitchAccess().getCasesAssignment_7(), "rule__MEnumParamOSSPSwitch__CasesAssignment_7");
					put(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getPlatformAssignment_1(), "rule__MEnumParamOSSPSwitchCase__PlatformAssignment_1");
					put(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3(), "rule__MEnumParamOSSPSwitchCase__DefaultValueAssignment_3");
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
					put(grammarAccess.getMOperatingSystemAPIAccess().getNameAssignment_1(), "rule__MOperatingSystemAPI__NameAssignment_1");
					put(grammarAccess.getMOperatingSystemAPIAccess().getInheritsAssignment_2_1(), "rule__MOperatingSystemAPI__InheritsAssignment_2_1");
					put(grammarAccess.getMOperatingSystemAPIAccess().getInheritsAssignment_2_2_1(), "rule__MOperatingSystemAPI__InheritsAssignment_2_2_1");
					put(grammarAccess.getMOperatingSystemAPIAccess().getVersionAssignment_4_0_2(), "rule__MOperatingSystemAPI__VersionAssignment_4_0_2");
					put(grammarAccess.getMOperatingSystemAPIAccess().getLanguageAssignment_4_1_2(), "rule__MOperatingSystemAPI__LanguageAssignment_4_1_2");
					put(grammarAccess.getMOperatingSystemAPIAccess().getParametersAssignment_4_2_3(), "rule__MOperatingSystemAPI__ParametersAssignment_4_2_3");
					put(grammarAccess.getMDeviceAccess().getNameAssignment_1(), "rule__MDevice__NameAssignment_1");
					put(grammarAccess.getMDeviceAccess().getVersionAssignment_3_0_2(), "rule__MDevice__VersionAssignment_3_0_2");
					put(grammarAccess.getMDeviceAccess().getParametersAssignment_3_1_3(), "rule__MDevice__ParametersAssignment_3_1_3");
					put(grammarAccess.getMArchitectureAccess().getNameAssignment_1(), "rule__MArchitecture__NameAssignment_1");
					put(grammarAccess.getMArchitectureAccess().getExtendsAssignment_2_1(), "rule__MArchitecture__ExtendsAssignment_2_1");
					put(grammarAccess.getMArchitectureAccess().getExtendsAssignment_2_2_1(), "rule__MArchitecture__ExtendsAssignment_2_2_1");
					put(grammarAccess.getMArchitectureAccess().getVersionAssignment_4_0_2(), "rule__MArchitecture__VersionAssignment_4_0_2");
					put(grammarAccess.getMArchitectureAccess().getParametersAssignment_4_1_3(), "rule__MArchitecture__ParametersAssignment_4_1_3");
					put(grammarAccess.getMOSSupportedPlatformAccess().getNameAssignment_3(), "rule__MOSSupportedPlatform__NameAssignment_3");
					put(grammarAccess.getMOSSupportedPlatformAccess().getArchitectureAssignment_5_0_2(), "rule__MOSSupportedPlatform__ArchitectureAssignment_5_0_2");
					put(grammarAccess.getMOSSupportedPlatformAccess().getCompilerAssignment_5_1_2(), "rule__MOSSupportedPlatform__CompilerAssignment_5_1_2");
					put(grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorAssignment_5_2_2_1(), "rule__MOSSupportedPlatform__MicroprocessorAssignment_5_2_2_1");
					put(grammarAccess.getMOSSupportedPlatformAccess().getBoardAssignment_5_3_2_1(), "rule__MOSSupportedPlatform__BoardAssignment_5_3_2_1");
					put(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesAssignment_5_4_2(), "rule__MOSSupportedPlatform__LanguagesAssignment_5_4_2");
					put(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesAssignment_5_4_3_1(), "rule__MOSSupportedPlatform__LanguagesAssignment_5_4_3_1");
					put(grammarAccess.getMOSSupportedPlatformAccess().getParametersAssignment_5_5_3(), "rule__MOSSupportedPlatform__ParametersAssignment_5_5_3");
					put(grammarAccess.getMPlatformAccess().getNameAssignment_1(), "rule__MPlatform__NameAssignment_1");
					put(grammarAccess.getMPlatformAccess().getVersionAssignment_3_0_2(), "rule__MPlatform__VersionAssignment_3_0_2");
					put(grammarAccess.getMPlatformAccess().getOsapiAssignment_3_1_2(), "rule__MPlatform__OsapiAssignment_3_1_2");
					put(grammarAccess.getMPlatformAccess().getOsAssignment_3_2_2(), "rule__MPlatform__OsAssignment_3_2_2");
					put(grammarAccess.getMPlatformAccess().getArchitectureAssignment_3_3_2(), "rule__MPlatform__ArchitectureAssignment_3_3_2");
					put(grammarAccess.getMPlatformAccess().getCompilerAssignment_3_4_2(), "rule__MPlatform__CompilerAssignment_3_4_2");
					put(grammarAccess.getMPlatformAccess().getMicroprocessorAssignment_3_5_2_1(), "rule__MPlatform__MicroprocessorAssignment_3_5_2_1");
					put(grammarAccess.getMPlatformAccess().getBoardAssignment_3_6_2_1(), "rule__MPlatform__BoardAssignment_3_6_2_1");
					put(grammarAccess.getMPlatformAccess().getParametersAssignment_3_7_3(), "rule__MPlatform__ParametersAssignment_3_7_3");
					put(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), "rule__MCompiler__UnorderedGroup_4");
					put(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), "rule__MCompilerFrontend__UnorderedGroup_3");
					put(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), "rule__MBoard__UnorderedGroup_3");
					put(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), "rule__MMicroprocessor__UnorderedGroup_3");
					put(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), "rule__MOperatingSystem__UnorderedGroup_4");
					put(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), "rule__MOperatingSystemAPI__UnorderedGroup_4");
					put(grammarAccess.getMDeviceAccess().getUnorderedGroup_3(), "rule__MDevice__UnorderedGroup_3");
					put(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4(), "rule__MArchitecture__UnorderedGroup_4");
					put(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), "rule__MOSSupportedPlatform__UnorderedGroup_5");
					put(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), "rule__MPlatform__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal.InternalPDLParser typedParser = (es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal.InternalPDLParser) parser;
			typedParser.entryRuleMPDLPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
