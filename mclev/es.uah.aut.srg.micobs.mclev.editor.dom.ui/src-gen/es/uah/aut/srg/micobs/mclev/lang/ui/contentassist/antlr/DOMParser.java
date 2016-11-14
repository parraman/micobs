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

import es.uah.aut.srg.micobs.mclev.lang.services.DOMGrammarAccess;

public class DOMParser extends AbstractContentAssistParser {
	
	@Inject
	private DOMGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalDOMParser createParser() {
		es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalDOMParser result = new es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalDOMParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMDomainAccess().getAlternatives(), "rule__MDomain__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_0_2(), "rule__MIODomainSupportedPlatform__Alternatives_4_0_2");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_1_2(), "rule__MIODomainSupportedPlatform__Alternatives_4_1_2");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_2_2(), "rule__MIODomainSupportedPlatform__Alternatives_4_2_2");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_4_2(), "rule__MIODomainSupportedPlatform__Alternatives_4_4_2");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_5_2(), "rule__MIODomainSupportedPlatform__Alternatives_4_5_2");
					put(grammarAccess.getMIODCTypeAccess().getAlternatives(), "rule__MIODCType__Alternatives");
					put(grammarAccess.getMPortTypeInstanceAccess().getAlternatives(), "rule__MPortTypeInstance__Alternatives");
					put(grammarAccess.getMExternalPortTypeInstanceAccess().getAlternatives(), "rule__MExternalPortTypeInstance__Alternatives");
					put(grammarAccess.getMInternalPortTypeInstanceAccess().getAlternatives(), "rule__MInternalPortTypeInstance__Alternatives");
					put(grammarAccess.getMParameterAccess().getAlternatives(), "rule__MParameter__Alternatives");
					put(grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives(), "rule__MEnumParameterLiteralRule__Alternatives");
					put(grammarAccess.getMParameterValueAccess().getAlternatives(), "rule__MParameterValue__Alternatives");
					put(grammarAccess.getMParameterValueLiteralAccess().getAlternatives(), "rule__MParameterValueLiteral__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getMParameterRangeAccess().getAlternatives(), "rule__MParameterRange__Alternatives");
					put(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives(), "rule__MParameterValueExpressionOperators__Alternatives");
					put(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives(), "rule__MParameterValueTERMOperators__Alternatives");
					put(grammarAccess.getMMCLEVDOMPackageFileAccess().getGroup(), "rule__MMCLEVDOMPackageFile__Group__0");
					put(grammarAccess.getMMCLEVDOMPackageFileAccess().getGroup_3(), "rule__MMCLEVDOMPackageFile__Group_3__0");
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
					put(grammarAccess.getMIODomainAccess().getGroup(), "rule__MIODomain__Group__0");
					put(grammarAccess.getMIODomainAccess().getGroup_2(), "rule__MIODomain__Group_2__0");
					put(grammarAccess.getMIODomainAccess().getGroup_2_2(), "rule__MIODomain__Group_2_2__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_0(), "rule__MIODomain__Group_4_0__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_1(), "rule__MIODomain__Group_4_1__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_1_3(), "rule__MIODomain__Group_4_1_3__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_2(), "rule__MIODomain__Group_4_2__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_3(), "rule__MIODomain__Group_4_3__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_4(), "rule__MIODomain__Group_4_4__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_5(), "rule__MIODomain__Group_4_5__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_6(), "rule__MIODomain__Group_4_6__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_7(), "rule__MIODomain__Group_4_7__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_8(), "rule__MIODomain__Group_4_8__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_9(), "rule__MIODomain__Group_4_9__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_10(), "rule__MIODomain__Group_4_10__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_10_3(), "rule__MIODomain__Group_4_10_3__0");
					put(grammarAccess.getMIODomainAccess().getGroup_4_11(), "rule__MIODomain__Group_4_11__0");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup(), "rule__MIODomainSupportedPlatform__Group__0");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_0(), "rule__MIODomainSupportedPlatform__Group_4_0__0");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_1(), "rule__MIODomainSupportedPlatform__Group_4_1__0");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_2(), "rule__MIODomainSupportedPlatform__Group_4_2__0");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_3(), "rule__MIODomainSupportedPlatform__Group_4_3__0");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_4(), "rule__MIODomainSupportedPlatform__Group_4_4__0");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_5(), "rule__MIODomainSupportedPlatform__Group_4_5__0");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_6(), "rule__MIODomainSupportedPlatform__Group_4_6__0");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_7(), "rule__MIODomainSupportedPlatform__Group_4_7__0");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_7_3(), "rule__MIODomainSupportedPlatform__Group_4_7_3__0");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_8(), "rule__MIODomainSupportedPlatform__Group_4_8__0");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_8_3(), "rule__MIODomainSupportedPlatform__Group_4_8_3__0");
					put(grammarAccess.getMAODomainAccess().getGroup(), "rule__MAODomain__Group__0");
					put(grammarAccess.getMAODomainAccess().getGroup_2(), "rule__MAODomain__Group_2__0");
					put(grammarAccess.getMAODomainAccess().getGroup_2_2(), "rule__MAODomain__Group_2_2__0");
					put(grammarAccess.getMAODomainAccess().getGroup_4_0(), "rule__MAODomain__Group_4_0__0");
					put(grammarAccess.getMAODomainAccess().getGroup_4_1(), "rule__MAODomain__Group_4_1__0");
					put(grammarAccess.getMAODomainAccess().getGroup_4_1_4(), "rule__MAODomain__Group_4_1_4__0");
					put(grammarAccess.getMAODomainAccess().getGroup_4_2(), "rule__MAODomain__Group_4_2__0");
					put(grammarAccess.getMAODomainAccess().getGroup_4_3(), "rule__MAODomain__Group_4_3__0");
					put(grammarAccess.getMAODomainAccess().getGroup_4_4(), "rule__MAODomain__Group_4_4__0");
					put(grammarAccess.getMAODomainAccess().getGroup_4_5(), "rule__MAODomain__Group_4_5__0");
					put(grammarAccess.getMAODomainAccess().getGroup_4_6(), "rule__MAODomain__Group_4_6__0");
					put(grammarAccess.getMAODomainAccess().getGroup_4_7(), "rule__MAODomain__Group_4_7__0");
					put(grammarAccess.getMInterfaceTypeAccess().getGroup(), "rule__MInterfaceType__Group__0");
					put(grammarAccess.getMInterfaceTypeAccess().getGroup_3(), "rule__MInterfaceType__Group_3__0");
					put(grammarAccess.getMInterfaceTypeAccess().getGroup_3_2(), "rule__MInterfaceType__Group_3_2__0");
					put(grammarAccess.getMAODComponentTypeAccess().getGroup(), "rule__MAODComponentType__Group__0");
					put(grammarAccess.getMAODComponentTypeAccess().getGroup_3(), "rule__MAODComponentType__Group_3__0");
					put(grammarAccess.getMAODComponentTypeAccess().getGroup_3_2(), "rule__MAODComponentType__Group_3_2__0");
					put(grammarAccess.getMAODComponentTypeAccess().getGroup_5_0(), "rule__MAODComponentType__Group_5_0__0");
					put(grammarAccess.getMAODComponentTypeAccess().getGroup_5_1(), "rule__MAODComponentType__Group_5_1__0");
					put(grammarAccess.getMAODComponentTypeAccess().getGroup_5_2(), "rule__MAODComponentType__Group_5_2__0");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup(), "rule__MIODAbstractComponentType__Group__0");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_4(), "rule__MIODAbstractComponentType__Group_4__0");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_4_2(), "rule__MIODAbstractComponentType__Group_4_2__0");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_6_0(), "rule__MIODAbstractComponentType__Group_6_0__0");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_6_1(), "rule__MIODAbstractComponentType__Group_6_1__0");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_6_2(), "rule__MIODAbstractComponentType__Group_6_2__0");
					put(grammarAccess.getMIODComponentTypeAccess().getGroup(), "rule__MIODComponentType__Group__0");
					put(grammarAccess.getMIODComponentTypeAccess().getGroup_3(), "rule__MIODComponentType__Group_3__0");
					put(grammarAccess.getMIODComponentTypeAccess().getGroup_3_2(), "rule__MIODComponentType__Group_3_2__0");
					put(grammarAccess.getMIODComponentTypeAccess().getGroup_5_0(), "rule__MIODComponentType__Group_5_0__0");
					put(grammarAccess.getMIODComponentTypeAccess().getGroup_5_1(), "rule__MIODComponentType__Group_5_1__0");
					put(grammarAccess.getMIODComponentTypeAccess().getGroup_5_2(), "rule__MIODComponentType__Group_5_2__0");
					put(grammarAccess.getMIODComponentTypeAccess().getGroup_5_3(), "rule__MIODComponentType__Group_5_3__0");
					put(grammarAccess.getMIODComponentTypeInstanceAccess().getGroup(), "rule__MIODComponentTypeInstance__Group__0");
					put(grammarAccess.getMAODComponentTypeInstanceAccess().getGroup(), "rule__MAODComponentTypeInstance__Group__0");
					put(grammarAccess.getMExternalClientPortTypeInstanceAccess().getGroup(), "rule__MExternalClientPortTypeInstance__Group__0");
					put(grammarAccess.getMExternalServerPortTypeInstanceAccess().getGroup(), "rule__MExternalServerPortTypeInstance__Group__0");
					put(grammarAccess.getMInternalClientPortTypeInstanceAccess().getGroup(), "rule__MInternalClientPortTypeInstance__Group__0");
					put(grammarAccess.getMInternalServerPortTypeInstanceAccess().getGroup(), "rule__MInternalServerPortTypeInstance__Group__0");
					put(grammarAccess.getMPortTypeAccess().getGroup(), "rule__MPortType__Group__0");
					put(grammarAccess.getMPortTypeAccess().getGroup_4(), "rule__MPortType__Group_4__0");
					put(grammarAccess.getMPortTypeAccess().getGroup_4_2(), "rule__MPortType__Group_4_2__0");
					put(grammarAccess.getMPortTypeAccess().getGroup_6_0(), "rule__MPortType__Group_6_0__0");
					put(grammarAccess.getMPortTypeAccess().getGroup_6_0_4(), "rule__MPortType__Group_6_0_4__0");
					put(grammarAccess.getMPortTypeAccess().getGroup_6_1(), "rule__MPortType__Group_6_1__0");
					put(grammarAccess.getMPortTypeAccess().getGroup_6_2(), "rule__MPortType__Group_6_2__0");
					put(grammarAccess.getMPortTypeAccess().getGroup_6_3(), "rule__MPortType__Group_6_3__0");
					put(grammarAccess.getMExchangeModelAccess().getGroup(), "rule__MExchangeModel__Group__0");
					put(grammarAccess.getMExchangeModelAccess().getGroup_4(), "rule__MExchangeModel__Group_4__0");
					put(grammarAccess.getMExchangeModelAccess().getGroup_4_2(), "rule__MExchangeModel__Group_4_2__0");
					put(grammarAccess.getMExchangeModelAccess().getGroup_12(), "rule__MExchangeModel__Group_12__0");
					put(grammarAccess.getMConnectorAccess().getGroup(), "rule__MConnector__Group__0");
					put(grammarAccess.getMConnectorAccess().getGroup_2(), "rule__MConnector__Group_2__0");
					put(grammarAccess.getMConnectorAccess().getGroup_2_2(), "rule__MConnector__Group_2_2__0");
					put(grammarAccess.getMConnectorAccess().getGroup_4_0(), "rule__MConnector__Group_4_0__0");
					put(grammarAccess.getMConnectorAccess().getGroup_4_0_4(), "rule__MConnector__Group_4_0_4__0");
					put(grammarAccess.getMConnectorAccess().getGroup_4_1(), "rule__MConnector__Group_4_1__0");
					put(grammarAccess.getMConnectorAccess().getGroup_4_1_4(), "rule__MConnector__Group_4_1_4__0");
					put(grammarAccess.getMConnectorAccess().getGroup_4_2(), "rule__MConnector__Group_4_2__0");
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
					put(grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageAssignment_1(), "rule__MMCLEVDOMPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMCLEVDOMPackageFileAccess().getImportsAssignment_3_1(), "rule__MMCLEVDOMPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMCLEVDOMPackageFileAccess().getElementAssignment_4(), "rule__MMCLEVDOMPackageFile__ElementAssignment_4");
					put(grammarAccess.getMIODomainAccess().getNameAssignment_1(), "rule__MIODomain__NameAssignment_1");
					put(grammarAccess.getMIODomainAccess().getInheritsAssignment_2_1(), "rule__MIODomain__InheritsAssignment_2_1");
					put(grammarAccess.getMIODomainAccess().getInheritsAssignment_2_2_1(), "rule__MIODomain__InheritsAssignment_2_2_1");
					put(grammarAccess.getMIODomainAccess().getVersionAssignment_4_0_2(), "rule__MIODomain__VersionAssignment_4_0_2");
					put(grammarAccess.getMIODomainAccess().getLanguagesAssignment_4_1_2(), "rule__MIODomain__LanguagesAssignment_4_1_2");
					put(grammarAccess.getMIODomainAccess().getLanguagesAssignment_4_1_3_1(), "rule__MIODomain__LanguagesAssignment_4_1_3_1");
					put(grammarAccess.getMIODomainAccess().getAllowsSingletonAssignment_4_2_3(), "rule__MIODomain__AllowsSingletonAssignment_4_2_3");
					put(grammarAccess.getMIODomainAccess().getAttributesAssignment_4_3_2(), "rule__MIODomain__AttributesAssignment_4_3_2");
					put(grammarAccess.getMIODomainAccess().getInterfaceTypesAssignment_4_4_3(), "rule__MIODomain__InterfaceTypesAssignment_4_4_3");
					put(grammarAccess.getMIODomainAccess().getPortTypesAssignment_4_5_3(), "rule__MIODomain__PortTypesAssignment_4_5_3");
					put(grammarAccess.getMIODomainAccess().getConnectorsAssignment_4_6_2(), "rule__MIODomain__ConnectorsAssignment_4_6_2");
					put(grammarAccess.getMIODomainAccess().getExchangeModelsAssignment_4_7_3(), "rule__MIODomain__ExchangeModelsAssignment_4_7_3");
					put(grammarAccess.getMIODomainAccess().getComponentTypesAssignment_4_8_3(), "rule__MIODomain__ComponentTypesAssignment_4_8_3");
					put(grammarAccess.getMIODomainAccess().getComponentTypeInstancesAssignment_4_9_3(), "rule__MIODomain__ComponentTypeInstancesAssignment_4_9_3");
					put(grammarAccess.getMIODomainAccess().getRequiresAssignment_4_10_2(), "rule__MIODomain__RequiresAssignment_4_10_2");
					put(grammarAccess.getMIODomainAccess().getRequiresAssignment_4_10_3_1(), "rule__MIODomain__RequiresAssignment_4_10_3_1");
					put(grammarAccess.getMIODomainAccess().getSupportedPlatformsAssignment_4_11_3(), "rule__MIODomain__SupportedPlatformsAssignment_4_11_3");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getNameAssignment_2(), "rule__MIODomainSupportedPlatform__NameAssignment_2");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiAssignment_4_0_2_1(), "rule__MIODomainSupportedPlatform__OsapiAssignment_4_0_2_1");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getOsAssignment_4_1_2_1(), "rule__MIODomainSupportedPlatform__OsAssignment_4_1_2_1");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureAssignment_4_2_2_1(), "rule__MIODomainSupportedPlatform__ArchitectureAssignment_4_2_2_1");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerAssignment_4_3_2(), "rule__MIODomainSupportedPlatform__CompilerAssignment_4_3_2");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorAssignment_4_4_2_1(), "rule__MIODomainSupportedPlatform__MicroprocessorAssignment_4_4_2_1");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getBoardAssignment_4_5_2_1(), "rule__MIODomainSupportedPlatform__BoardAssignment_4_5_2_1");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesAssignment_4_6_2(), "rule__MIODomainSupportedPlatform__AttributesAssignment_4_6_2");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesAssignment_4_7_2(), "rule__MIODomainSupportedPlatform__LanguagesAssignment_4_7_2");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesAssignment_4_7_3_1(), "rule__MIODomainSupportedPlatform__LanguagesAssignment_4_7_3_1");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresAssignment_4_8_2(), "rule__MIODomainSupportedPlatform__RequiresAssignment_4_8_2");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresAssignment_4_8_3_1(), "rule__MIODomainSupportedPlatform__RequiresAssignment_4_8_3_1");
					put(grammarAccess.getMAODomainAccess().getNameAssignment_1(), "rule__MAODomain__NameAssignment_1");
					put(grammarAccess.getMAODomainAccess().getInheritsAssignment_2_1(), "rule__MAODomain__InheritsAssignment_2_1");
					put(grammarAccess.getMAODomainAccess().getInheritsAssignment_2_2_1(), "rule__MAODomain__InheritsAssignment_2_2_1");
					put(grammarAccess.getMAODomainAccess().getVersionAssignment_4_0_2(), "rule__MAODomain__VersionAssignment_4_0_2");
					put(grammarAccess.getMAODomainAccess().getOutputIODomainsAssignment_4_1_3(), "rule__MAODomain__OutputIODomainsAssignment_4_1_3");
					put(grammarAccess.getMAODomainAccess().getOutputIODomainsAssignment_4_1_4_1(), "rule__MAODomain__OutputIODomainsAssignment_4_1_4_1");
					put(grammarAccess.getMAODomainAccess().getAttributesAssignment_4_2_2(), "rule__MAODomain__AttributesAssignment_4_2_2");
					put(grammarAccess.getMAODomainAccess().getInterfaceTypesAssignment_4_3_3(), "rule__MAODomain__InterfaceTypesAssignment_4_3_3");
					put(grammarAccess.getMAODomainAccess().getPortTypesAssignment_4_4_3(), "rule__MAODomain__PortTypesAssignment_4_4_3");
					put(grammarAccess.getMAODomainAccess().getConnectorsAssignment_4_5_2(), "rule__MAODomain__ConnectorsAssignment_4_5_2");
					put(grammarAccess.getMAODomainAccess().getComponentTypesAssignment_4_6_3(), "rule__MAODomain__ComponentTypesAssignment_4_6_3");
					put(grammarAccess.getMAODomainAccess().getComponentTypeInstancesAssignment_4_7_3(), "rule__MAODomain__ComponentTypeInstancesAssignment_4_7_3");
					put(grammarAccess.getMInterfaceTypeAccess().getNameAssignment_2(), "rule__MInterfaceType__NameAssignment_2");
					put(grammarAccess.getMInterfaceTypeAccess().getInheritsAssignment_3_1(), "rule__MInterfaceType__InheritsAssignment_3_1");
					put(grammarAccess.getMInterfaceTypeAccess().getInheritsAssignment_3_2_1(), "rule__MInterfaceType__InheritsAssignment_3_2_1");
					put(grammarAccess.getMAODComponentTypeAccess().getNameAssignment_2(), "rule__MAODComponentType__NameAssignment_2");
					put(grammarAccess.getMAODComponentTypeAccess().getInheritsAssignment_3_1(), "rule__MAODComponentType__InheritsAssignment_3_1");
					put(grammarAccess.getMAODComponentTypeAccess().getInheritsAssignment_3_2_1(), "rule__MAODComponentType__InheritsAssignment_3_2_1");
					put(grammarAccess.getMAODComponentTypeAccess().getAttributesAssignment_5_0_2(), "rule__MAODComponentType__AttributesAssignment_5_0_2");
					put(grammarAccess.getMAODComponentTypeAccess().getPortTypeInstancesAssignment_5_1_3(), "rule__MAODComponentType__PortTypeInstancesAssignment_5_1_3");
					put(grammarAccess.getMAODComponentTypeAccess().getComponentTypeInstancesAssignment_5_2_3(), "rule__MAODComponentType__ComponentTypeInstancesAssignment_5_2_3");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getNameAssignment_3(), "rule__MIODAbstractComponentType__NameAssignment_3");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsAssignment_4_1(), "rule__MIODAbstractComponentType__InheritsAssignment_4_1");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsAssignment_4_2_1(), "rule__MIODAbstractComponentType__InheritsAssignment_4_2_1");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesAssignment_6_0_2(), "rule__MIODAbstractComponentType__AttributesAssignment_6_0_2");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getPortTypeInstancesAssignment_6_1_3(), "rule__MIODAbstractComponentType__PortTypeInstancesAssignment_6_1_3");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getComponentTypeInstancesAssignment_6_2_3(), "rule__MIODAbstractComponentType__ComponentTypeInstancesAssignment_6_2_3");
					put(grammarAccess.getMIODComponentTypeAccess().getNameAssignment_2(), "rule__MIODComponentType__NameAssignment_2");
					put(grammarAccess.getMIODComponentTypeAccess().getInheritsAssignment_3_1(), "rule__MIODComponentType__InheritsAssignment_3_1");
					put(grammarAccess.getMIODComponentTypeAccess().getInheritsAssignment_3_2_1(), "rule__MIODComponentType__InheritsAssignment_3_2_1");
					put(grammarAccess.getMIODComponentTypeAccess().getLanguageAssignment_5_0_2(), "rule__MIODComponentType__LanguageAssignment_5_0_2");
					put(grammarAccess.getMIODComponentTypeAccess().getAttributesAssignment_5_1_2(), "rule__MIODComponentType__AttributesAssignment_5_1_2");
					put(grammarAccess.getMIODComponentTypeAccess().getPortTypeInstancesAssignment_5_2_3(), "rule__MIODComponentType__PortTypeInstancesAssignment_5_2_3");
					put(grammarAccess.getMIODComponentTypeAccess().getComponentTypeInstancesAssignment_5_3_3(), "rule__MIODComponentType__ComponentTypeInstancesAssignment_5_3_3");
					put(grammarAccess.getMIODComponentTypeInstanceAccess().getComponentTypeAssignment_1(), "rule__MIODComponentTypeInstance__ComponentTypeAssignment_1");
					put(grammarAccess.getMIODComponentTypeInstanceAccess().getLowerBoundAssignment_3(), "rule__MIODComponentTypeInstance__LowerBoundAssignment_3");
					put(grammarAccess.getMIODComponentTypeInstanceAccess().getUpperBoundAssignment_5(), "rule__MIODComponentTypeInstance__UpperBoundAssignment_5");
					put(grammarAccess.getMAODComponentTypeInstanceAccess().getComponentTypeAssignment_1(), "rule__MAODComponentTypeInstance__ComponentTypeAssignment_1");
					put(grammarAccess.getMAODComponentTypeInstanceAccess().getLowerBoundAssignment_3(), "rule__MAODComponentTypeInstance__LowerBoundAssignment_3");
					put(grammarAccess.getMAODComponentTypeInstanceAccess().getUpperBoundAssignment_5(), "rule__MAODComponentTypeInstance__UpperBoundAssignment_5");
					put(grammarAccess.getMExternalClientPortTypeInstanceAccess().getPortTypeAssignment_2(), "rule__MExternalClientPortTypeInstance__PortTypeAssignment_2");
					put(grammarAccess.getMExternalClientPortTypeInstanceAccess().getLowerBoundAssignment_4(), "rule__MExternalClientPortTypeInstance__LowerBoundAssignment_4");
					put(grammarAccess.getMExternalClientPortTypeInstanceAccess().getUpperBoundAssignment_6(), "rule__MExternalClientPortTypeInstance__UpperBoundAssignment_6");
					put(grammarAccess.getMExternalServerPortTypeInstanceAccess().getPortTypeAssignment_2(), "rule__MExternalServerPortTypeInstance__PortTypeAssignment_2");
					put(grammarAccess.getMExternalServerPortTypeInstanceAccess().getLowerBoundAssignment_4(), "rule__MExternalServerPortTypeInstance__LowerBoundAssignment_4");
					put(grammarAccess.getMExternalServerPortTypeInstanceAccess().getUpperBoundAssignment_6(), "rule__MExternalServerPortTypeInstance__UpperBoundAssignment_6");
					put(grammarAccess.getMInternalClientPortTypeInstanceAccess().getPortTypeAssignment_2(), "rule__MInternalClientPortTypeInstance__PortTypeAssignment_2");
					put(grammarAccess.getMInternalClientPortTypeInstanceAccess().getLowerBoundAssignment_4(), "rule__MInternalClientPortTypeInstance__LowerBoundAssignment_4");
					put(grammarAccess.getMInternalClientPortTypeInstanceAccess().getUpperBoundAssignment_6(), "rule__MInternalClientPortTypeInstance__UpperBoundAssignment_6");
					put(grammarAccess.getMInternalServerPortTypeInstanceAccess().getPortTypeAssignment_2(), "rule__MInternalServerPortTypeInstance__PortTypeAssignment_2");
					put(grammarAccess.getMInternalServerPortTypeInstanceAccess().getLowerBoundAssignment_4(), "rule__MInternalServerPortTypeInstance__LowerBoundAssignment_4");
					put(grammarAccess.getMInternalServerPortTypeInstanceAccess().getUpperBoundAssignment_6(), "rule__MInternalServerPortTypeInstance__UpperBoundAssignment_6");
					put(grammarAccess.getMPortTypeAccess().getNameAssignment_3(), "rule__MPortType__NameAssignment_3");
					put(grammarAccess.getMPortTypeAccess().getInheritsAssignment_4_1(), "rule__MPortType__InheritsAssignment_4_1");
					put(grammarAccess.getMPortTypeAccess().getInheritsAssignment_4_2_1(), "rule__MPortType__InheritsAssignment_4_2_1");
					put(grammarAccess.getMPortTypeAccess().getInterfaceTypesAssignment_6_0_3(), "rule__MPortType__InterfaceTypesAssignment_6_0_3");
					put(grammarAccess.getMPortTypeAccess().getInterfaceTypesAssignment_6_0_4_1(), "rule__MPortType__InterfaceTypesAssignment_6_0_4_1");
					put(grammarAccess.getMPortTypeAccess().getAttributesAssignment_6_1_2(), "rule__MPortType__AttributesAssignment_6_1_2");
					put(grammarAccess.getMPortTypeAccess().getClientAttributesAssignment_6_2_3(), "rule__MPortType__ClientAttributesAssignment_6_2_3");
					put(grammarAccess.getMPortTypeAccess().getServerAttributesAssignment_6_3_3(), "rule__MPortType__ServerAttributesAssignment_6_3_3");
					put(grammarAccess.getMExchangeModelAccess().getNameAssignment_3(), "rule__MExchangeModel__NameAssignment_3");
					put(grammarAccess.getMExchangeModelAccess().getInheritsAssignment_4_1(), "rule__MExchangeModel__InheritsAssignment_4_1");
					put(grammarAccess.getMExchangeModelAccess().getInheritsAssignment_4_2_1(), "rule__MExchangeModel__InheritsAssignment_4_2_1");
					put(grammarAccess.getMExchangeModelAccess().getInterfaceTypesAssignment_9(), "rule__MExchangeModel__InterfaceTypesAssignment_9");
					put(grammarAccess.getMExchangeModelAccess().getInterfaceTypesAssignment_11(), "rule__MExchangeModel__InterfaceTypesAssignment_11");
					put(grammarAccess.getMExchangeModelAccess().getInterfaceTypesAssignment_12_1(), "rule__MExchangeModel__InterfaceTypesAssignment_12_1");
					put(grammarAccess.getMConnectorAccess().getNameAssignment_1(), "rule__MConnector__NameAssignment_1");
					put(grammarAccess.getMConnectorAccess().getInheritsAssignment_2_1(), "rule__MConnector__InheritsAssignment_2_1");
					put(grammarAccess.getMConnectorAccess().getInheritsAssignment_2_2_1(), "rule__MConnector__InheritsAssignment_2_2_1");
					put(grammarAccess.getMConnectorAccess().getClientPortTypesAssignment_4_0_3(), "rule__MConnector__ClientPortTypesAssignment_4_0_3");
					put(grammarAccess.getMConnectorAccess().getClientPortTypesAssignment_4_0_4_1(), "rule__MConnector__ClientPortTypesAssignment_4_0_4_1");
					put(grammarAccess.getMConnectorAccess().getServerPortTypesAssignment_4_1_3(), "rule__MConnector__ServerPortTypesAssignment_4_1_3");
					put(grammarAccess.getMConnectorAccess().getServerPortTypesAssignment_4_1_4_1(), "rule__MConnector__ServerPortTypesAssignment_4_1_4_1");
					put(grammarAccess.getMConnectorAccess().getAttributesAssignment_4_2_2(), "rule__MConnector__AttributesAssignment_4_2_2");
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
					put(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawAssignment_1(), "rule__MParameterValueStringLiteral__IsRawAssignment_1");
					put(grammarAccess.getMParameterValueStringLiteralAccess().getValueAssignment_2(), "rule__MParameterValueStringLiteral__ValueAssignment_2");
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
					put(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawAssignment_3(), "rule__MEnumParamStringLiteral__IsRawAssignment_3");
					put(grammarAccess.getMEnumParamStringLiteralAccess().getValueAssignment_4(), "rule__MEnumParamStringLiteral__ValueAssignment_4");
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantAssignment_0(), "rule__MBooleanParameterSingleExpression__ConstantAssignment_0");
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_2(), "rule__MBooleanParameterSingleExpression__NameAssignment_2");
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_4(), "rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantAssignment_0(), "rule__MStringParameterSingleExpression__ConstantAssignment_0");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_2(), "rule__MStringParameterSingleExpression__NameAssignment_2");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_4(), "rule__MStringParameterSingleExpression__DefaultValueAssignment_4");
					put(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), "rule__MIODomain__UnorderedGroup_4");
					put(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), "rule__MIODomainSupportedPlatform__UnorderedGroup_4");
					put(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), "rule__MAODomain__UnorderedGroup_4");
					put(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), "rule__MAODComponentType__UnorderedGroup_5");
					put(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), "rule__MIODAbstractComponentType__UnorderedGroup_6");
					put(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), "rule__MIODComponentType__UnorderedGroup_5");
					put(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), "rule__MPortType__UnorderedGroup_6");
					put(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), "rule__MConnector__UnorderedGroup_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalDOMParser typedParser = (es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalDOMParser) parser;
			typedParser.entryRuleMMCLEVDOMPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DOMGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DOMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
