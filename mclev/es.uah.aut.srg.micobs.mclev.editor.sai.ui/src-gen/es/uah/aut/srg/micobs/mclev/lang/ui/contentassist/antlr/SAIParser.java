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

import es.uah.aut.srg.micobs.mclev.lang.services.SAIGrammarAccess;

public class SAIParser extends AbstractContentAssistParser {
	
	@Inject
	private SAIGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalSAIParser createParser() {
		es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalSAIParser result = new es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalSAIParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getMParameterAccess().getAlternatives(), "rule__MParameter__Alternatives");
					put(grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives(), "rule__MEnumParameterLiteralRule__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getMParameterValueAccess().getAlternatives(), "rule__MParameterValue__Alternatives");
					put(grammarAccess.getMParameterValueLiteralAccess().getAlternatives(), "rule__MParameterValueLiteral__Alternatives");
					put(grammarAccess.getMParameterRangeAccess().getAlternatives(), "rule__MParameterRange__Alternatives");
					put(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives(), "rule__MParameterValueExpressionOperators__Alternatives");
					put(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives(), "rule__MParameterValueTERMOperators__Alternatives");
					put(grammarAccess.getMMCLEVSAIPackageFileAccess().getGroup(), "rule__MMCLEVSAIPackageFile__Group__0");
					put(grammarAccess.getMMCLEVSAIPackageFileAccess().getGroup_3(), "rule__MMCLEVSAIPackageFile__Group_3__0");
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
					put(grammarAccess.getMSAIAccess().getGroup(), "rule__MSAI__Group__0");
					put(grammarAccess.getMSAIAccess().getGroup_2(), "rule__MSAI__Group_2__0");
					put(grammarAccess.getMSAIAccess().getGroup_2_2(), "rule__MSAI__Group_2_2__0");
					put(grammarAccess.getMSAIAccess().getGroup_4_0(), "rule__MSAI__Group_4_0__0");
					put(grammarAccess.getMSAIAccess().getGroup_4_1(), "rule__MSAI__Group_4_1__0");
					put(grammarAccess.getMSAIAccess().getGroup_4_2(), "rule__MSAI__Group_4_2__0");
					put(grammarAccess.getMSAIAccess().getGroup_4_3(), "rule__MSAI__Group_4_3__0");
					put(grammarAccess.getMSAIAccess().getGroup_4_3_3(), "rule__MSAI__Group_4_3_3__0");
					put(grammarAccess.getMSAIAccess().getGroup_4_4(), "rule__MSAI__Group_4_4__0");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup(), "rule__MIntegerParameterSingleExpression__Group__0");
					put(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_5(), "rule__MIntegerParameterSingleExpression__Group_5__0");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getGroup(), "rule__MEnumParameterDefinition__Group__0");
					put(grammarAccess.getMEnumParameterDefinitionAccess().getGroup_5(), "rule__MEnumParameterDefinition__Group_5__0");
					put(grammarAccess.getMEnumParameterSingleExpressionAccess().getGroup(), "rule__MEnumParameterSingleExpression__Group__0");
					put(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup(), "rule__MRealParameterSingleExpression__Group__0");
					put(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_5(), "rule__MRealParameterSingleExpression__Group_5__0");
					put(grammarAccess.getMEnumParameterLiteralAccess().getGroup(), "rule__MEnumParameterLiteral__Group__0");
					put(grammarAccess.getMEnumParamIntegerLiteralAccess().getGroup(), "rule__MEnumParamIntegerLiteral__Group__0");
					put(grammarAccess.getMEnumParamRealLiteralAccess().getGroup(), "rule__MEnumParamRealLiteral__Group__0");
					put(grammarAccess.getMEnumParamStringLiteralAccess().getGroup(), "rule__MEnumParamStringLiteral__Group__0");
					put(grammarAccess.getMBooleanParameterSingleExpressionAccess().getGroup(), "rule__MBooleanParameterSingleExpression__Group__0");
					put(grammarAccess.getMStringParameterSingleExpressionAccess().getGroup(), "rule__MStringParameterSingleExpression__Group__0");
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
					put(grammarAccess.getMMCLEVSAIPackageFileAccess().getPackageAssignment_1(), "rule__MMCLEVSAIPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMCLEVSAIPackageFileAccess().getImportsAssignment_3_1(), "rule__MMCLEVSAIPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMCLEVSAIPackageFileAccess().getElementAssignment_4(), "rule__MMCLEVSAIPackageFile__ElementAssignment_4");
					put(grammarAccess.getMSAIAccess().getNameAssignment_1(), "rule__MSAI__NameAssignment_1");
					put(grammarAccess.getMSAIAccess().getExtendsAssignment_2_1(), "rule__MSAI__ExtendsAssignment_2_1");
					put(grammarAccess.getMSAIAccess().getExtendsAssignment_2_2_1(), "rule__MSAI__ExtendsAssignment_2_2_1");
					put(grammarAccess.getMSAIAccess().getVersionAssignment_4_0_2(), "rule__MSAI__VersionAssignment_4_0_2");
					put(grammarAccess.getMSAIAccess().getLanguageAssignment_4_1_2(), "rule__MSAI__LanguageAssignment_4_1_2");
					put(grammarAccess.getMSAIAccess().getAttributesAssignment_4_2_2(), "rule__MSAI__AttributesAssignment_4_2_2");
					put(grammarAccess.getMSAIAccess().getRequiresAssignment_4_3_2(), "rule__MSAI__RequiresAssignment_4_3_2");
					put(grammarAccess.getMSAIAccess().getRequiresAssignment_4_3_3_1(), "rule__MSAI__RequiresAssignment_4_3_3_1");
					put(grammarAccess.getMSAIAccess().getRequiredOSAPIAssignment_4_4_3(), "rule__MSAI__RequiredOSAPIAssignment_4_4_3");
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
					put(grammarAccess.getMSAIAccess().getUnorderedGroup_4(), "rule__MSAI__UnorderedGroup_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalSAIParser typedParser = (es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalSAIParser) parser;
			typedParser.entryRuleMMCLEVSAIPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SAIGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SAIGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
