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

import java.util.List;

import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class CTOOLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMESPCTOOLPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPCTOOLPackageFile");
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
		//	"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
		//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPCTOOLPackageElement;
		public ParserRule getRule() { return rule; }

		//"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
		//imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPCTOOLPackageElement
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//package=[mesplibrary::MMESPPackage|QualifiedName]
		public Assignment getPackageAssignment_1() { return cPackageAssignment_1; }

		//[mesplibrary::MMESPPackage|QualifiedName]
		public CrossReference getPackageMMESPPackageCrossReference_1_0() { return cPackageMMESPPackageCrossReference_1_0; }

		//QualifiedName
		public RuleCall getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1() { return cPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }

		//("import" imports+=[common::MCommonPackage|QualifiedName] ";")*
		public Group getGroup_3() { return cGroup_3; }

		//"import"
		public Keyword getImportKeyword_3_0() { return cImportKeyword_3_0; }

		//imports+=[common::MCommonPackage|QualifiedName]
		public Assignment getImportsAssignment_3_1() { return cImportsAssignment_3_1; }

		//[common::MCommonPackage|QualifiedName]
		public CrossReference getImportsMCommonPackageCrossReference_3_1_0() { return cImportsMCommonPackageCrossReference_3_1_0; }

		//QualifiedName
		public RuleCall getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1() { return cImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_2() { return cSemicolonKeyword_3_2; }

		//element=MMESPCTOOLPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMESPCTOOLPackageElement
		public RuleCall getElementMMESPCTOOLPackageElementParserRuleCall_4_0() { return cElementMMESPCTOOLPackageElementParserRuleCall_4_0; }
	}

	public class MMESPCTOOLPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPCTOOLPackageElement");
		private final RuleCall cMConstructionToolParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MMESPCTOOLPackageElement:
		//	MConstructionTool;
		public ParserRule getRule() { return rule; }

		//MConstructionTool
		public RuleCall getMConstructionToolParserRuleCall() { return cMConstructionToolParserRuleCall; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName returns ecore::EString:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Version");
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
		
		//Version returns ecore::EString:
		//	(INT | INT? ID) ("." (INT | INT? ID))*;
		public ParserRule getRule() { return rule; }

		//(INT | INT? ID) ("." (INT | INT? ID))*
		public Group getGroup() { return cGroup; }

		//INT | INT? ID
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_0_0() { return cINTTerminalRuleCall_0_0; }

		//INT? ID
		public Group getGroup_0_1() { return cGroup_0_1; }

		//INT?
		public RuleCall getINTTerminalRuleCall_0_1_0() { return cINTTerminalRuleCall_0_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_0_1_1() { return cIDTerminalRuleCall_0_1_1; }

		//("." (INT | INT? ID))*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//INT | INT? ID
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VersionedQualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cVersionParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VersionedQualifiedName returns ecore::EString:
		//	QualifiedName "(" Version ")";
		public ParserRule getRule() { return rule; }

		//QualifiedName "(" Version ")"
		public Group getGroup() { return cGroup; }

		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//Version
		public RuleCall getVersionParserRuleCall_2() { return cVersionParserRuleCall_2; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class VersionedQualifiedReferenceNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VersionedQualifiedReferenceName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cVersionedQualifiedNameParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//VersionedQualifiedReferenceName returns ecore::EString:
		//	(VersionedQualifiedName "::")? ID ("::" ID)*;
		public ParserRule getRule() { return rule; }

		//(VersionedQualifiedName "::")? ID ("::" ID)*
		public Group getGroup() { return cGroup; }

		//(VersionedQualifiedName "::")?
		public Group getGroup_0() { return cGroup_0; }

		//VersionedQualifiedName
		public RuleCall getVersionedQualifiedNameParserRuleCall_0_0() { return cVersionedQualifiedNameParserRuleCall_0_0; }

		//"::"
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }

		//("::" ID)*
		public Group getGroup_2() { return cGroup_2; }

		//"::"
		public Keyword getColonColonKeyword_2_0() { return cColonColonKeyword_2_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}

	public class MConstructionToolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MConstructionTool");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConstructionToolKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cExtendsMConstructionToolCrossReference_2_1_0 = (CrossReference)cExtendsAssignment_2_1.eContents().get(0);
		private final RuleCall cExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cExtendsMConstructionToolCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cExtendsMConstructionToolCrossReference_2_2_1_0 = (CrossReference)cExtendsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cExtendsMConstructionToolCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cVersionKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Assignment cVersionAssignment_4_0_2 = (Assignment)cGroup_4_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_4_0_2_0 = (RuleCall)cVersionAssignment_4_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cSupportedLanguagesKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Assignment cSupportedLanguagesAssignment_4_1_2 = (Assignment)cGroup_4_1.eContents().get(2);
		private final CrossReference cSupportedLanguagesMLanguageCrossReference_4_1_2_0 = (CrossReference)cSupportedLanguagesAssignment_4_1_2.eContents().get(0);
		private final RuleCall cSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1 = (RuleCall)cSupportedLanguagesMLanguageCrossReference_4_1_2_0.eContents().get(1);
		private final Group cGroup_4_1_3 = (Group)cGroup_4_1.eContents().get(3);
		private final Keyword cCommaKeyword_4_1_3_0 = (Keyword)cGroup_4_1_3.eContents().get(0);
		private final Assignment cSupportedLanguagesAssignment_4_1_3_1 = (Assignment)cGroup_4_1_3.eContents().get(1);
		private final CrossReference cSupportedLanguagesMLanguageCrossReference_4_1_3_1_0 = (CrossReference)cSupportedLanguagesAssignment_4_1_3_1.eContents().get(0);
		private final RuleCall cSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_3_1_0_1 = (RuleCall)cSupportedLanguagesMLanguageCrossReference_4_1_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_1_4 = (Keyword)cGroup_4_1.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MConstructionTool:
		//	"construction tool" name=ID ("extends" extends+=[MConstructionTool|VersionedQualifiedName] (","
		//	extends+=[MConstructionTool|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" &
		//	"supported languages" ":=" supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
		//	supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ";") "}" ";";
		public ParserRule getRule() { return rule; }

		//"construction tool" name=ID ("extends" extends+=[MConstructionTool|VersionedQualifiedName] (","
		//extends+=[MConstructionTool|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "supported languages"
		//":=" supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
		//supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ";") "}" ";"
		public Group getGroup() { return cGroup; }

		//"construction tool"
		public Keyword getConstructionToolKeyword_0() { return cConstructionToolKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("extends" extends+=[MConstructionTool|VersionedQualifiedName] (","
		//extends+=[MConstructionTool|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//"extends"
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//extends+=[MConstructionTool|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_1() { return cExtendsAssignment_2_1; }

		//[MConstructionTool|VersionedQualifiedName]
		public CrossReference getExtendsMConstructionToolCrossReference_2_1_0() { return cExtendsMConstructionToolCrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," extends+=[MConstructionTool|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//extends+=[MConstructionTool|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_2_1() { return cExtendsAssignment_2_2_1; }

		//[MConstructionTool|VersionedQualifiedName]
		public CrossReference getExtendsMConstructionToolCrossReference_2_2_1_0() { return cExtendsMConstructionToolCrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//"version" ":=" version=Version ";" & "supported languages" ":="
		//supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
		//supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ";"
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//"version" ":=" version=Version ";"
		public Group getGroup_4_0() { return cGroup_4_0; }

		//"version"
		public Keyword getVersionKeyword_4_0_0() { return cVersionKeyword_4_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_0_1() { return cColonEqualsSignKeyword_4_0_1; }

		//version=Version
		public Assignment getVersionAssignment_4_0_2() { return cVersionAssignment_4_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_4_0_2_0() { return cVersionVersionParserRuleCall_4_0_2_0; }

		//";"
		public Keyword getSemicolonKeyword_4_0_3() { return cSemicolonKeyword_4_0_3; }

		//"supported languages" ":=" supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
		//supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ";"
		public Group getGroup_4_1() { return cGroup_4_1; }

		//"supported languages"
		public Keyword getSupportedLanguagesKeyword_4_1_0() { return cSupportedLanguagesKeyword_4_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_1_1() { return cColonEqualsSignKeyword_4_1_1; }

		//supportedLanguages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getSupportedLanguagesAssignment_4_1_2() { return cSupportedLanguagesAssignment_4_1_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getSupportedLanguagesMLanguageCrossReference_4_1_2_0() { return cSupportedLanguagesMLanguageCrossReference_4_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1() { return cSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1; }

		//("," supportedLanguages+=[system::MLanguage|VersionedQualifiedName])*
		public Group getGroup_4_1_3() { return cGroup_4_1_3; }

		//","
		public Keyword getCommaKeyword_4_1_3_0() { return cCommaKeyword_4_1_3_0; }

		//supportedLanguages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getSupportedLanguagesAssignment_4_1_3_1() { return cSupportedLanguagesAssignment_4_1_3_1; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getSupportedLanguagesMLanguageCrossReference_4_1_3_1_0() { return cSupportedLanguagesMLanguageCrossReference_4_1_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_3_1_0_1() { return cSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_4_1_4() { return cSemicolonKeyword_4_1_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	
	
	private MMESPCTOOLPackageFileElements pMMESPCTOOLPackageFile;
	private MMESPCTOOLPackageElementElements pMMESPCTOOLPackageElement;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionedQualifiedNameElements pVersionedQualifiedName;
	private VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private MConstructionToolElements pMConstructionTool;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public CTOOLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MMESPCTOOLPackageFile:
	//	"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
	//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPCTOOLPackageElement;
	public MMESPCTOOLPackageFileElements getMMESPCTOOLPackageFileAccess() {
		return (pMMESPCTOOLPackageFile != null) ? pMMESPCTOOLPackageFile : (pMMESPCTOOLPackageFile = new MMESPCTOOLPackageFileElements());
	}
	
	public ParserRule getMMESPCTOOLPackageFileRule() {
		return getMMESPCTOOLPackageFileAccess().getRule();
	}

	//MMESPCTOOLPackageElement:
	//	MConstructionTool;
	public MMESPCTOOLPackageElementElements getMMESPCTOOLPackageElementAccess() {
		return (pMMESPCTOOLPackageElement != null) ? pMMESPCTOOLPackageElement : (pMMESPCTOOLPackageElement = new MMESPCTOOLPackageElementElements());
	}
	
	public ParserRule getMMESPCTOOLPackageElementRule() {
		return getMMESPCTOOLPackageElementAccess().getRule();
	}

	//QualifiedName returns ecore::EString:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//Version returns ecore::EString:
	//	(INT | INT? ID) ("." (INT | INT? ID))*;
	public VersionElements getVersionAccess() {
		return (pVersion != null) ? pVersion : (pVersion = new VersionElements());
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}

	//VersionedQualifiedName returns ecore::EString:
	//	QualifiedName "(" Version ")";
	public VersionedQualifiedNameElements getVersionedQualifiedNameAccess() {
		return (pVersionedQualifiedName != null) ? pVersionedQualifiedName : (pVersionedQualifiedName = new VersionedQualifiedNameElements());
	}
	
	public ParserRule getVersionedQualifiedNameRule() {
		return getVersionedQualifiedNameAccess().getRule();
	}

	//VersionedQualifiedReferenceName returns ecore::EString:
	//	(VersionedQualifiedName "::")? ID ("::" ID)*;
	public VersionedQualifiedReferenceNameElements getVersionedQualifiedReferenceNameAccess() {
		return (pVersionedQualifiedReferenceName != null) ? pVersionedQualifiedReferenceName : (pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements());
	}
	
	public ParserRule getVersionedQualifiedReferenceNameRule() {
		return getVersionedQualifiedReferenceNameAccess().getRule();
	}

	//MConstructionTool:
	//	"construction tool" name=ID ("extends" extends+=[MConstructionTool|VersionedQualifiedName] (","
	//	extends+=[MConstructionTool|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" &
	//	"supported languages" ":=" supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
	//	supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ";") "}" ";";
	public MConstructionToolElements getMConstructionToolAccess() {
		return (pMConstructionTool != null) ? pMConstructionTool : (pMConstructionTool = new MConstructionToolElements());
	}
	
	public ParserRule getMConstructionToolRule() {
		return getMConstructionToolAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
