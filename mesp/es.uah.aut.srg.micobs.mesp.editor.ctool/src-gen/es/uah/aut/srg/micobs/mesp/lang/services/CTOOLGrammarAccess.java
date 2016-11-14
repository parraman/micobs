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
package es.uah.aut.srg.micobs.mesp.lang.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class CTOOLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMESPCTOOLPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.CTOOL.MMESPCTOOLPackageFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPackageMMESPPackageCrossReference_1_0 = (CrossReference)cPackageAssignment_1.eContents().get(0);
		private final RuleCall cPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cPackageMMESPPackageCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cImportKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cImportsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cImportsMCommonPackageCrossReference_3_1_0 = (CrossReference)cImportsAssignment_3_1.eContents().get(0);
		private final RuleCall cImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cImportsMCommonPackageCrossReference_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cElementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementMMESPCTOOLPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMESPCTOOLPackageFile:
		//	'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
		//	imports+=[common::MCommonPackage|QualifiedName] ';')*
		//	element=MMESPCTOOLPackageElement;
		@Override public ParserRule getRule() { return rule; }

		//'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
		//imports+=[common::MCommonPackage|QualifiedName] ';')* element=MMESPCTOOLPackageElement
		public Group getGroup() { return cGroup; }

		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//package=[mesplibrary::MMESPPackage|QualifiedName]
		public Assignment getPackageAssignment_1() { return cPackageAssignment_1; }

		//[mesplibrary::MMESPPackage|QualifiedName]
		public CrossReference getPackageMMESPPackageCrossReference_1_0() { return cPackageMMESPPackageCrossReference_1_0; }

		//QualifiedName
		public RuleCall getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1() { return cPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }

		//('import' imports+=[common::MCommonPackage|QualifiedName] ';')*
		public Group getGroup_3() { return cGroup_3; }

		//'import'
		public Keyword getImportKeyword_3_0() { return cImportKeyword_3_0; }

		//imports+=[common::MCommonPackage|QualifiedName]
		public Assignment getImportsAssignment_3_1() { return cImportsAssignment_3_1; }

		//[common::MCommonPackage|QualifiedName]
		public CrossReference getImportsMCommonPackageCrossReference_3_1_0() { return cImportsMCommonPackageCrossReference_3_1_0; }

		//QualifiedName
		public RuleCall getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1() { return cImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_3_2() { return cSemicolonKeyword_3_2; }

		//element=MMESPCTOOLPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMESPCTOOLPackageElement
		public RuleCall getElementMMESPCTOOLPackageElementParserRuleCall_4_0() { return cElementMMESPCTOOLPackageElementParserRuleCall_4_0; }
	}

	public class MMESPCTOOLPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.CTOOL.MMESPCTOOLPackageElement");
		private final RuleCall cMConstructionToolParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MMESPCTOOLPackageElement:
		//	MConstructionTool;
		@Override public ParserRule getRule() { return rule; }

		//MConstructionTool
		public RuleCall getMConstructionToolParserRuleCall() { return cMConstructionToolParserRuleCall; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.CTOOL.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }

		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }

		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.CTOOL.Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0_1_0 = (RuleCall)cGroup_0_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1_1 = (RuleCall)cGroup_0_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cAlternatives_1_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_1_0 = (RuleCall)cGroup_1_1_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1_1_1 = (RuleCall)cGroup_1_1_1.eContents().get(1);
		
		//Version:
		//	(INT | INT? ID) ('.' (INT | INT? ID))*;
		@Override public ParserRule getRule() { return rule; }

		//(INT | INT? ID) ('.' (INT | INT? ID))*
		public Group getGroup() { return cGroup; }

		//(INT | INT? ID)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_0_0() { return cINTTerminalRuleCall_0_0; }

		//INT? ID
		public Group getGroup_0_1() { return cGroup_0_1; }

		//INT?
		public RuleCall getINTTerminalRuleCall_0_1_0() { return cINTTerminalRuleCall_0_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_0_1_1() { return cIDTerminalRuleCall_0_1_1; }

		//('.' (INT | INT? ID))*
		public Group getGroup_1() { return cGroup_1; }

		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//(INT | INT? ID)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_1_0() { return cINTTerminalRuleCall_1_1_0; }

		//INT? ID
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }

		//INT?
		public RuleCall getINTTerminalRuleCall_1_1_1_0() { return cINTTerminalRuleCall_1_1_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1_1_1() { return cIDTerminalRuleCall_1_1_1_1; }
	}

	public class VersionedQualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.CTOOL.VersionedQualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cVersionParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VersionedQualifiedName:
		//	QualifiedName '(' Version ')';
		@Override public ParserRule getRule() { return rule; }

		//QualifiedName '(' Version ')'
		public Group getGroup() { return cGroup; }

		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//Version
		public RuleCall getVersionParserRuleCall_2() { return cVersionParserRuleCall_2; }

		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class VersionedQualifiedReferenceNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.CTOOL.VersionedQualifiedReferenceName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cVersionedQualifiedNameParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//VersionedQualifiedReferenceName:
		//	(VersionedQualifiedName '::')? ID ('::' ID)*;
		@Override public ParserRule getRule() { return rule; }

		//(VersionedQualifiedName '::')? ID ('::' ID)*
		public Group getGroup() { return cGroup; }

		//(VersionedQualifiedName '::')?
		public Group getGroup_0() { return cGroup_0; }

		//VersionedQualifiedName
		public RuleCall getVersionedQualifiedNameParserRuleCall_0_0() { return cVersionedQualifiedNameParserRuleCall_0_0; }

		//'::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }

		//('::' ID)*
		public Group getGroup_2() { return cGroup_2; }

		//'::'
		public Keyword getColonColonKeyword_2_0() { return cColonColonKeyword_2_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}

	public class MConstructionToolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.CTOOL.MConstructionTool");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConstructionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cToolKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cExtendsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cExtendsMConstructionToolCrossReference_3_1_0 = (CrossReference)cExtendsAssignment_3_1.eContents().get(0);
		private final RuleCall cExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cExtendsMConstructionToolCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cExtendsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cExtendsMConstructionToolCrossReference_3_2_1_0 = (CrossReference)cExtendsAssignment_3_2_1.eContents().get(0);
		private final RuleCall cExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_1_0_1 = (RuleCall)cExtendsMConstructionToolCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cVersionKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cVersionAssignment_5_0_2 = (Assignment)cGroup_5_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_5_0_2_0 = (RuleCall)cVersionAssignment_5_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_5_0_3 = (Keyword)cGroup_5_0.eContents().get(3);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cSupportedKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cLanguagesKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_5_1_2 = (Keyword)cGroup_5_1.eContents().get(2);
		private final Assignment cSupportedLanguagesAssignment_5_1_3 = (Assignment)cGroup_5_1.eContents().get(3);
		private final CrossReference cSupportedLanguagesMLanguageCrossReference_5_1_3_0 = (CrossReference)cSupportedLanguagesAssignment_5_1_3.eContents().get(0);
		private final RuleCall cSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_0_1 = (RuleCall)cSupportedLanguagesMLanguageCrossReference_5_1_3_0.eContents().get(1);
		private final Group cGroup_5_1_4 = (Group)cGroup_5_1.eContents().get(4);
		private final Keyword cCommaKeyword_5_1_4_0 = (Keyword)cGroup_5_1_4.eContents().get(0);
		private final Assignment cSupportedLanguagesAssignment_5_1_4_1 = (Assignment)cGroup_5_1_4.eContents().get(1);
		private final CrossReference cSupportedLanguagesMLanguageCrossReference_5_1_4_1_0 = (CrossReference)cSupportedLanguagesAssignment_5_1_4_1.eContents().get(0);
		private final RuleCall cSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_4_1_0_1 = (RuleCall)cSupportedLanguagesMLanguageCrossReference_5_1_4_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_1_5 = (Keyword)cGroup_5_1.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MConstructionTool:
		//	'construction' 'tool'
		//	name=ID ('extends' extends+=[MConstructionTool|VersionedQualifiedName] (","
		//	extends+=[MConstructionTool|VersionedQualifiedName])*)?
		//	'{' ('version' ':=' version=Version ';' & 'supported' 'languages' ':='
		//	supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
		//	supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ';')
		//	'}'
		//	';';
		@Override public ParserRule getRule() { return rule; }

		//'construction' 'tool' name=ID ('extends' extends+=[MConstructionTool|VersionedQualifiedName] (","
		//extends+=[MConstructionTool|VersionedQualifiedName])*)? '{' ('version' ':=' version=Version ';' & 'supported'
		//'languages' ':=' supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
		//supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ';') '}' ';'
		public Group getGroup() { return cGroup; }

		//'construction'
		public Keyword getConstructionKeyword_0() { return cConstructionKeyword_0; }

		//'tool'
		public Keyword getToolKeyword_1() { return cToolKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//('extends' extends+=[MConstructionTool|VersionedQualifiedName] (","
		//extends+=[MConstructionTool|VersionedQualifiedName])*)?
		public Group getGroup_3() { return cGroup_3; }

		//'extends'
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }

		//extends+=[MConstructionTool|VersionedQualifiedName]
		public Assignment getExtendsAssignment_3_1() { return cExtendsAssignment_3_1; }

		//[MConstructionTool|VersionedQualifiedName]
		public CrossReference getExtendsMConstructionToolCrossReference_3_1_0() { return cExtendsMConstructionToolCrossReference_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_3_1_0_1() { return cExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_3_1_0_1; }

		//("," extends+=[MConstructionTool|VersionedQualifiedName])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//extends+=[MConstructionTool|VersionedQualifiedName]
		public Assignment getExtendsAssignment_3_2_1() { return cExtendsAssignment_3_2_1; }

		//[MConstructionTool|VersionedQualifiedName]
		public CrossReference getExtendsMConstructionToolCrossReference_3_2_1_0() { return cExtendsMConstructionToolCrossReference_3_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_1_0_1() { return cExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//('version' ':=' version=Version ';' & 'supported' 'languages' ':='
		//supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
		//supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ';')
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }

		//'version' ':=' version=Version ';'
		public Group getGroup_5_0() { return cGroup_5_0; }

		//'version'
		public Keyword getVersionKeyword_5_0_0() { return cVersionKeyword_5_0_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_5_0_1() { return cColonEqualsSignKeyword_5_0_1; }

		//version=Version
		public Assignment getVersionAssignment_5_0_2() { return cVersionAssignment_5_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_5_0_2_0() { return cVersionVersionParserRuleCall_5_0_2_0; }

		//';'
		public Keyword getSemicolonKeyword_5_0_3() { return cSemicolonKeyword_5_0_3; }

		//'supported' 'languages' ':=' supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
		//supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ';'
		public Group getGroup_5_1() { return cGroup_5_1; }

		//'supported'
		public Keyword getSupportedKeyword_5_1_0() { return cSupportedKeyword_5_1_0; }

		//'languages'
		public Keyword getLanguagesKeyword_5_1_1() { return cLanguagesKeyword_5_1_1; }

		//':='
		public Keyword getColonEqualsSignKeyword_5_1_2() { return cColonEqualsSignKeyword_5_1_2; }

		//supportedLanguages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getSupportedLanguagesAssignment_5_1_3() { return cSupportedLanguagesAssignment_5_1_3; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getSupportedLanguagesMLanguageCrossReference_5_1_3_0() { return cSupportedLanguagesMLanguageCrossReference_5_1_3_0; }

		//VersionedQualifiedName
		public RuleCall getSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_0_1() { return cSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_0_1; }

		//("," supportedLanguages+=[system::MLanguage|VersionedQualifiedName])*
		public Group getGroup_5_1_4() { return cGroup_5_1_4; }

		//","
		public Keyword getCommaKeyword_5_1_4_0() { return cCommaKeyword_5_1_4_0; }

		//supportedLanguages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getSupportedLanguagesAssignment_5_1_4_1() { return cSupportedLanguagesAssignment_5_1_4_1; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getSupportedLanguagesMLanguageCrossReference_5_1_4_1_0() { return cSupportedLanguagesMLanguageCrossReference_5_1_4_1_0; }

		//VersionedQualifiedName
		public RuleCall getSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_4_1_0_1() { return cSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_4_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_5_1_5() { return cSemicolonKeyword_5_1_5; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	
	
	private final MMESPCTOOLPackageFileElements pMMESPCTOOLPackageFile;
	private final MMESPCTOOLPackageElementElements pMMESPCTOOLPackageElement;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final MConstructionToolElements pMConstructionTool;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CTOOLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMMESPCTOOLPackageFile = new MMESPCTOOLPackageFileElements();
		this.pMMESPCTOOLPackageElement = new MMESPCTOOLPackageElementElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.pMConstructionTool = new MConstructionToolElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mesp.lang.CTOOL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MMESPCTOOLPackageFile:
	//	'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
	//	imports+=[common::MCommonPackage|QualifiedName] ';')*
	//	element=MMESPCTOOLPackageElement;
	public MMESPCTOOLPackageFileElements getMMESPCTOOLPackageFileAccess() {
		return pMMESPCTOOLPackageFile;
	}
	
	public ParserRule getMMESPCTOOLPackageFileRule() {
		return getMMESPCTOOLPackageFileAccess().getRule();
	}

	//MMESPCTOOLPackageElement:
	//	MConstructionTool;
	public MMESPCTOOLPackageElementElements getMMESPCTOOLPackageElementAccess() {
		return pMMESPCTOOLPackageElement;
	}
	
	public ParserRule getMMESPCTOOLPackageElementRule() {
		return getMMESPCTOOLPackageElementAccess().getRule();
	}

	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//Version:
	//	(INT | INT? ID) ('.' (INT | INT? ID))*;
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}

	//VersionedQualifiedName:
	//	QualifiedName '(' Version ')';
	public VersionedQualifiedNameElements getVersionedQualifiedNameAccess() {
		return pVersionedQualifiedName;
	}
	
	public ParserRule getVersionedQualifiedNameRule() {
		return getVersionedQualifiedNameAccess().getRule();
	}

	//VersionedQualifiedReferenceName:
	//	(VersionedQualifiedName '::')? ID ('::' ID)*;
	public VersionedQualifiedReferenceNameElements getVersionedQualifiedReferenceNameAccess() {
		return pVersionedQualifiedReferenceName;
	}
	
	public ParserRule getVersionedQualifiedReferenceNameRule() {
		return getVersionedQualifiedReferenceNameAccess().getRule();
	}

	//MConstructionTool:
	//	'construction' 'tool'
	//	name=ID ('extends' extends+=[MConstructionTool|VersionedQualifiedName] (","
	//	extends+=[MConstructionTool|VersionedQualifiedName])*)?
	//	'{' ('version' ':=' version=Version ';' & 'supported' 'languages' ':='
	//	supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
	//	supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ';')
	//	'}'
	//	';';
	public MConstructionToolElements getMConstructionToolAccess() {
		return pMConstructionTool;
	}
	
	public ParserRule getMConstructionToolRule() {
		return getMConstructionToolAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
