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
package es.uah.aut.srg.micobs.mclev.lang.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SAIGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMCLEVSAIPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMCLEVSAIPackageFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPackageMMCLEVPackageCrossReference_1_0 = (CrossReference)cPackageAssignment_1.eContents().get(0);
		private final RuleCall cPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cPackageMMCLEVPackageCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cImportKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cImportsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cImportsMCommonPackageCrossReference_3_1_0 = (CrossReference)cImportsAssignment_3_1.eContents().get(0);
		private final RuleCall cImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cImportsMCommonPackageCrossReference_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cElementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementMMCLEVSAIPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMCLEVSAIPackageFile:
		//	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
		//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVSAIPackageElement;
		public ParserRule getRule() { return rule; }

		//"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
		//imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVSAIPackageElement
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//package=[mclevlibrary::MMCLEVPackage|QualifiedName]
		public Assignment getPackageAssignment_1() { return cPackageAssignment_1; }

		//[mclevlibrary::MMCLEVPackage|QualifiedName]
		public CrossReference getPackageMMCLEVPackageCrossReference_1_0() { return cPackageMMCLEVPackageCrossReference_1_0; }

		//QualifiedName
		public RuleCall getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1() { return cPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1; }

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

		//element=MMCLEVSAIPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMCLEVSAIPackageElement
		public RuleCall getElementMMCLEVSAIPackageElementParserRuleCall_4_0() { return cElementMMCLEVSAIPackageElementParserRuleCall_4_0; }
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

	public class MMCLEVSAIPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMCLEVSAIPackageElement");
		private final RuleCall cMSAIParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MMCLEVSAIPackageElement:
		//	MSAI;
		public ParserRule getRule() { return rule; }

		//MSAI
		public RuleCall getMSAIParserRuleCall() { return cMSAIParserRuleCall; }
	}

	public class MSAIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MSAI");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSaiKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cExtendsMSAICrossReference_2_1_0 = (CrossReference)cExtendsAssignment_2_1.eContents().get(0);
		private final RuleCall cExtendsMSAIVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cExtendsMSAICrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cExtendsMSAICrossReference_2_2_1_0 = (CrossReference)cExtendsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cExtendsMSAIVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cExtendsMSAICrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cVersionKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Assignment cVersionAssignment_4_0_2 = (Assignment)cGroup_4_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_4_0_2_0 = (RuleCall)cVersionAssignment_4_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cLanguageKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Assignment cLanguageAssignment_4_1_2 = (Assignment)cGroup_4_1.eContents().get(2);
		private final CrossReference cLanguageMLanguageCrossReference_4_1_2_0 = (CrossReference)cLanguageAssignment_4_1_2.eContents().get(0);
		private final RuleCall cLanguageMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1 = (RuleCall)cLanguageMLanguageCrossReference_4_1_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_1_3 = (Keyword)cGroup_4_1.eContents().get(3);
		private final Group cGroup_4_2 = (Group)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cAttributesKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Assignment cAttributesAssignment_4_2_2 = (Assignment)cGroup_4_2.eContents().get(2);
		private final RuleCall cAttributesMParameterParserRuleCall_4_2_2_0 = (RuleCall)cAttributesAssignment_4_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_2_3 = (Keyword)cGroup_4_2.eContents().get(3);
		private final Keyword cSemicolonKeyword_4_2_4 = (Keyword)cGroup_4_2.eContents().get(4);
		private final Group cGroup_4_3 = (Group)cUnorderedGroup_4.eContents().get(3);
		private final Keyword cRequiresKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_3_1 = (Keyword)cGroup_4_3.eContents().get(1);
		private final Assignment cRequiresAssignment_4_3_2 = (Assignment)cGroup_4_3.eContents().get(2);
		private final CrossReference cRequiresMSAICrossReference_4_3_2_0 = (CrossReference)cRequiresAssignment_4_3_2.eContents().get(0);
		private final RuleCall cRequiresMSAIVersionedQualifiedNameParserRuleCall_4_3_2_0_1 = (RuleCall)cRequiresMSAICrossReference_4_3_2_0.eContents().get(1);
		private final Group cGroup_4_3_3 = (Group)cGroup_4_3.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_3_0 = (Keyword)cGroup_4_3_3.eContents().get(0);
		private final Assignment cRequiresAssignment_4_3_3_1 = (Assignment)cGroup_4_3_3.eContents().get(1);
		private final CrossReference cRequiresMSAICrossReference_4_3_3_1_0 = (CrossReference)cRequiresAssignment_4_3_3_1.eContents().get(0);
		private final RuleCall cRequiresMSAIVersionedQualifiedNameParserRuleCall_4_3_3_1_0_1 = (RuleCall)cRequiresMSAICrossReference_4_3_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_3_4 = (Keyword)cGroup_4_3.eContents().get(4);
		private final Group cGroup_4_4 = (Group)cUnorderedGroup_4.eContents().get(4);
		private final Keyword cRequiredKeyword_4_4_0 = (Keyword)cGroup_4_4.eContents().get(0);
		private final Keyword cOsapiKeyword_4_4_1 = (Keyword)cGroup_4_4.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_4_4_2 = (Keyword)cGroup_4_4.eContents().get(2);
		private final Assignment cRequiredOSAPIAssignment_4_4_3 = (Assignment)cGroup_4_4.eContents().get(3);
		private final CrossReference cRequiredOSAPIMOperatingSystemAPICrossReference_4_4_3_0 = (CrossReference)cRequiredOSAPIAssignment_4_4_3.eContents().get(0);
		private final RuleCall cRequiredOSAPIMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_4_3_0_1 = (RuleCall)cRequiredOSAPIMOperatingSystemAPICrossReference_4_4_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_4_4 = (Keyword)cGroup_4_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MSAI:
		//	"sai" name=ID ("extends" extends+=[MSAI|VersionedQualifiedName] ("," extends+=[MSAI|VersionedQualifiedName])*)? "{"
		//	("version" ":=" version=Version ";" & "language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" &
		//	("attributes" "{" attributes+=MParameter+ "}" ";")? & ("requires" ":=" requires+=[MSAI|VersionedQualifiedName] (","
		//	requires+=[MSAI|VersionedQualifiedName])* ";")? & ("required" "osapi" ":="
		//	requiredOSAPI=[pdl::MOperatingSystemAPI|VersionedQualifiedName] ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"sai" name=ID ("extends" extends+=[MSAI|VersionedQualifiedName] ("," extends+=[MSAI|VersionedQualifiedName])*)? "{"
		//("version" ":=" version=Version ";" & "language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" &
		//("attributes" "{" attributes+=MParameter+ "}" ";")? & ("requires" ":=" requires+=[MSAI|VersionedQualifiedName] (","
		//requires+=[MSAI|VersionedQualifiedName])* ";")? & ("required" "osapi" ":="
		//requiredOSAPI=[pdl::MOperatingSystemAPI|VersionedQualifiedName] ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"sai"
		public Keyword getSaiKeyword_0() { return cSaiKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("extends" extends+=[MSAI|VersionedQualifiedName] ("," extends+=[MSAI|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//"extends"
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//extends+=[MSAI|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_1() { return cExtendsAssignment_2_1; }

		//[MSAI|VersionedQualifiedName]
		public CrossReference getExtendsMSAICrossReference_2_1_0() { return cExtendsMSAICrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMSAIVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cExtendsMSAIVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," extends+=[MSAI|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//extends+=[MSAI|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_2_1() { return cExtendsAssignment_2_2_1; }

		//[MSAI|VersionedQualifiedName]
		public CrossReference getExtendsMSAICrossReference_2_2_1_0() { return cExtendsMSAICrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMSAIVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cExtendsMSAIVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//"version" ":=" version=Version ";" & "language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" &
		//("attributes" "{" attributes+=MParameter+ "}" ";")? & ("requires" ":=" requires+=[MSAI|VersionedQualifiedName] (","
		//requires+=[MSAI|VersionedQualifiedName])* ";")? & ("required" "osapi" ":="
		//requiredOSAPI=[pdl::MOperatingSystemAPI|VersionedQualifiedName] ";")?
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

		//"language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";"
		public Group getGroup_4_1() { return cGroup_4_1; }

		//"language"
		public Keyword getLanguageKeyword_4_1_0() { return cLanguageKeyword_4_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_1_1() { return cColonEqualsSignKeyword_4_1_1; }

		//language=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguageAssignment_4_1_2() { return cLanguageAssignment_4_1_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguageMLanguageCrossReference_4_1_2_0() { return cLanguageMLanguageCrossReference_4_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguageMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1() { return cLanguageMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_4_1_3() { return cSemicolonKeyword_4_1_3; }

		//("attributes" "{" attributes+=MParameter+ "}" ";")?
		public Group getGroup_4_2() { return cGroup_4_2; }

		//"attributes"
		public Keyword getAttributesKeyword_4_2_0() { return cAttributesKeyword_4_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_2_1() { return cLeftCurlyBracketKeyword_4_2_1; }

		//attributes+=MParameter+
		public Assignment getAttributesAssignment_4_2_2() { return cAttributesAssignment_4_2_2; }

		//MParameter
		public RuleCall getAttributesMParameterParserRuleCall_4_2_2_0() { return cAttributesMParameterParserRuleCall_4_2_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_2_3() { return cRightCurlyBracketKeyword_4_2_3; }

		//";"
		public Keyword getSemicolonKeyword_4_2_4() { return cSemicolonKeyword_4_2_4; }

		//("requires" ":=" requires+=[MSAI|VersionedQualifiedName] ("," requires+=[MSAI|VersionedQualifiedName])* ";")?
		public Group getGroup_4_3() { return cGroup_4_3; }

		//"requires"
		public Keyword getRequiresKeyword_4_3_0() { return cRequiresKeyword_4_3_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_3_1() { return cColonEqualsSignKeyword_4_3_1; }

		//requires+=[MSAI|VersionedQualifiedName]
		public Assignment getRequiresAssignment_4_3_2() { return cRequiresAssignment_4_3_2; }

		//[MSAI|VersionedQualifiedName]
		public CrossReference getRequiresMSAICrossReference_4_3_2_0() { return cRequiresMSAICrossReference_4_3_2_0; }

		//VersionedQualifiedName
		public RuleCall getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_3_2_0_1() { return cRequiresMSAIVersionedQualifiedNameParserRuleCall_4_3_2_0_1; }

		//("," requires+=[MSAI|VersionedQualifiedName])*
		public Group getGroup_4_3_3() { return cGroup_4_3_3; }

		//","
		public Keyword getCommaKeyword_4_3_3_0() { return cCommaKeyword_4_3_3_0; }

		//requires+=[MSAI|VersionedQualifiedName]
		public Assignment getRequiresAssignment_4_3_3_1() { return cRequiresAssignment_4_3_3_1; }

		//[MSAI|VersionedQualifiedName]
		public CrossReference getRequiresMSAICrossReference_4_3_3_1_0() { return cRequiresMSAICrossReference_4_3_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_3_3_1_0_1() { return cRequiresMSAIVersionedQualifiedNameParserRuleCall_4_3_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_4_3_4() { return cSemicolonKeyword_4_3_4; }

		//("required" "osapi" ":=" requiredOSAPI=[pdl::MOperatingSystemAPI|VersionedQualifiedName] ";")?
		public Group getGroup_4_4() { return cGroup_4_4; }

		//"required"
		public Keyword getRequiredKeyword_4_4_0() { return cRequiredKeyword_4_4_0; }

		//"osapi"
		public Keyword getOsapiKeyword_4_4_1() { return cOsapiKeyword_4_4_1; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_4_2() { return cColonEqualsSignKeyword_4_4_2; }

		//requiredOSAPI=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public Assignment getRequiredOSAPIAssignment_4_4_3() { return cRequiredOSAPIAssignment_4_4_3; }

		//[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public CrossReference getRequiredOSAPIMOperatingSystemAPICrossReference_4_4_3_0() { return cRequiredOSAPIMOperatingSystemAPICrossReference_4_4_3_0; }

		//VersionedQualifiedName
		public RuleCall getRequiredOSAPIMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_4_3_0_1() { return cRequiredOSAPIMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_4_3_0_1; }

		//";"
		public Keyword getSemicolonKeyword_4_4_4() { return cSemicolonKeyword_4_4_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMIntegerParameterSingleExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMEnumParameterSingleExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMBooleanParameterSingleExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMRealParameterSingleExpressionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cMStringParameterSingleExpressionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cMEnumParameterDefinitionParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//MParameter returns common::MParameter:
		//	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
		//	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition;
		public ParserRule getRule() { return rule; }

		//MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
		//MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition
		public Alternatives getAlternatives() { return cAlternatives; }

		//MIntegerParameterSingleExpression
		public RuleCall getMIntegerParameterSingleExpressionParserRuleCall_0() { return cMIntegerParameterSingleExpressionParserRuleCall_0; }

		//MEnumParameterSingleExpression
		public RuleCall getMEnumParameterSingleExpressionParserRuleCall_1() { return cMEnumParameterSingleExpressionParserRuleCall_1; }

		//MBooleanParameterSingleExpression
		public RuleCall getMBooleanParameterSingleExpressionParserRuleCall_2() { return cMBooleanParameterSingleExpressionParserRuleCall_2; }

		//MRealParameterSingleExpression
		public RuleCall getMRealParameterSingleExpressionParserRuleCall_3() { return cMRealParameterSingleExpressionParserRuleCall_3; }

		//MStringParameterSingleExpression
		public RuleCall getMStringParameterSingleExpressionParserRuleCall_4() { return cMStringParameterSingleExpressionParserRuleCall_4; }

		//MEnumParameterDefinition
		public RuleCall getMEnumParameterDefinitionParserRuleCall_5() { return cMEnumParameterDefinitionParserRuleCall_5; }
	}

	public class MIntegerParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MIntegerParameterSingleExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConstantAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cConstantConstKeyword_0_0 = (Keyword)cConstantAssignment_0.eContents().get(0);
		private final Keyword cIntegerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDefaultValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cDefaultValueAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cRangeKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cRangeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cRangeMParameterRangeParserRuleCall_5_1_0 = (RuleCall)cRangeAssignment_5_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MIntegerParameterSingleExpression returns common::MIntegerParameterSingleExpression:
		//	constant?="const"? "integer" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "integer" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"integer"
		public Keyword getIntegerKeyword_1() { return cIntegerKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_4() { return cDefaultValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_4_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_4_0; }

		//("range" range=MParameterRange)?
		public Group getGroup_5() { return cGroup_5; }

		//"range"
		public Keyword getRangeKeyword_5_0() { return cRangeKeyword_5_0; }

		//range=MParameterRange
		public Assignment getRangeAssignment_5_1() { return cRangeAssignment_5_1; }

		//MParameterRange
		public RuleCall getRangeMParameterRangeParserRuleCall_5_1_0() { return cRangeMParameterRangeParserRuleCall_5_1_0; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MEnumParameterDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParameterDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParameterDefinitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEnumKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLiteralsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0 = (RuleCall)cLiteralsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cLiteralsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0 = (RuleCall)cLiteralsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MEnumParameterDefinition returns common::MEnumParameterDefinition:
		//	{common::MEnumParameterDefinition} "enum" name=ID "{" literals+=MEnumParameterLiteralRule (","
		//	literals+=MEnumParameterLiteralRule)* "}" ";";
		public ParserRule getRule() { return rule; }

		//{common::MEnumParameterDefinition} "enum" name=ID "{" literals+=MEnumParameterLiteralRule (","
		//literals+=MEnumParameterLiteralRule)* "}" ";"
		public Group getGroup() { return cGroup; }

		//{common::MEnumParameterDefinition}
		public Action getMEnumParameterDefinitionAction_0() { return cMEnumParameterDefinitionAction_0; }

		//"enum"
		public Keyword getEnumKeyword_1() { return cEnumKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//literals+=MEnumParameterLiteralRule
		public Assignment getLiteralsAssignment_4() { return cLiteralsAssignment_4; }

		//MEnumParameterLiteralRule
		public RuleCall getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0() { return cLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0; }

		//("," literals+=MEnumParameterLiteralRule)*
		public Group getGroup_5() { return cGroup_5; }

		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }

		//literals+=MEnumParameterLiteralRule
		public Assignment getLiteralsAssignment_5_1() { return cLiteralsAssignment_5_1; }

		//MEnumParameterLiteralRule
		public RuleCall getLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0() { return cLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MEnumParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParameterSingleExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConstantAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cConstantConstKeyword_0_0 = (Keyword)cConstantAssignment_0.eContents().get(0);
		private final Keyword cEnumKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEnumDefinitionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cEnumDefinitionMEnumParameterDefinitionCrossReference_2_0 = (CrossReference)cEnumDefinitionAssignment_2.eContents().get(0);
		private final RuleCall cEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cEnumDefinitionMEnumParameterDefinitionCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDefaultValueAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_5_0 = (RuleCall)cDefaultValueAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MEnumParameterSingleExpression returns common::MEnumParameterSingleExpression:
		//	constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
		//	":=" defaultValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID ":="
		//defaultValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"enum"
		public Keyword getEnumKeyword_1() { return cEnumKeyword_1; }

		//enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName]
		public Assignment getEnumDefinitionAssignment_2() { return cEnumDefinitionAssignment_2; }

		//[common::MEnumParameterDefinition|VersionedQualifiedReferenceName]
		public CrossReference getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0() { return cEnumDefinitionMEnumParameterDefinitionCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4() { return cColonEqualsSignKeyword_4; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_5() { return cDefaultValueAssignment_5; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_5_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_5_0; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MRealParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MRealParameterSingleExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConstantAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cConstantConstKeyword_0_0 = (Keyword)cConstantAssignment_0.eContents().get(0);
		private final Keyword cRealKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDefaultValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cDefaultValueAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cRangeKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cRangeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cRangeMParameterRangeParserRuleCall_5_1_0 = (RuleCall)cRangeAssignment_5_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MRealParameterSingleExpression returns common::MRealParameterSingleExpression:
		//	constant?="const"? "real" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "real" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"real"
		public Keyword getRealKeyword_1() { return cRealKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_4() { return cDefaultValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_4_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_4_0; }

		//("range" range=MParameterRange)?
		public Group getGroup_5() { return cGroup_5; }

		//"range"
		public Keyword getRangeKeyword_5_0() { return cRangeKeyword_5_0; }

		//range=MParameterRange
		public Assignment getRangeAssignment_5_1() { return cRangeAssignment_5_1; }

		//MParameterRange
		public RuleCall getRangeMParameterRangeParserRuleCall_5_1_0() { return cRangeMParameterRangeParserRuleCall_5_1_0; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MEnumParameterLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParameterLiteralRule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMEnumParameterLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMEnumParamIntegerLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMEnumParamRealLiteralParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMEnumParamStringLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//MEnumParameterLiteralRule returns common::MEnumParameterLiteral:
		//	MEnumParameterLiteral | MEnumParamIntegerLiteral | MEnumParamRealLiteral | MEnumParamStringLiteral;
		public ParserRule getRule() { return rule; }

		//MEnumParameterLiteral | MEnumParamIntegerLiteral | MEnumParamRealLiteral | MEnumParamStringLiteral
		public Alternatives getAlternatives() { return cAlternatives; }

		//MEnumParameterLiteral
		public RuleCall getMEnumParameterLiteralParserRuleCall_0() { return cMEnumParameterLiteralParserRuleCall_0; }

		//MEnumParamIntegerLiteral
		public RuleCall getMEnumParamIntegerLiteralParserRuleCall_1() { return cMEnumParamIntegerLiteralParserRuleCall_1; }

		//MEnumParamRealLiteral
		public RuleCall getMEnumParamRealLiteralParserRuleCall_2() { return cMEnumParamRealLiteralParserRuleCall_2; }

		//MEnumParamStringLiteral
		public RuleCall getMEnumParamStringLiteralParserRuleCall_3() { return cMEnumParamStringLiteralParserRuleCall_3; }
	}

	public class MEnumParameterLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParameterLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParameterLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//MEnumParameterLiteral returns common::MEnumParameterLiteral:
		//	{common::MEnumParameterLiteral} name=ID;
		public ParserRule getRule() { return rule; }

		//{common::MEnumParameterLiteral} name=ID
		public Group getGroup() { return cGroup; }

		//{common::MEnumParameterLiteral}
		public Action getMEnumParameterLiteralAction_0() { return cMEnumParameterLiteralAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class MEnumParamIntegerLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParamIntegerLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParamIntegerLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueINTEGERParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//MEnumParamIntegerLiteral returns common::MEnumParamIntegerLiteral:
		//	{common::MEnumParamIntegerLiteral} name=ID "=" value=INTEGER;
		public ParserRule getRule() { return rule; }

		//{common::MEnumParamIntegerLiteral} name=ID "=" value=INTEGER
		public Group getGroup() { return cGroup; }

		//{common::MEnumParamIntegerLiteral}
		public Action getMEnumParamIntegerLiteralAction_0() { return cMEnumParamIntegerLiteralAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//value=INTEGER
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//INTEGER
		public RuleCall getValueINTEGERParserRuleCall_3_0() { return cValueINTEGERParserRuleCall_3_0; }
	}

	public class MEnumParamRealLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParamRealLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParamRealLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueREALParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//MEnumParamRealLiteral returns common::MEnumParamRealLiteral:
		//	{common::MEnumParamRealLiteral} name=ID "=" value=REAL;
		public ParserRule getRule() { return rule; }

		//{common::MEnumParamRealLiteral} name=ID "=" value=REAL
		public Group getGroup() { return cGroup; }

		//{common::MEnumParamRealLiteral}
		public Action getMEnumParamRealLiteralAction_0() { return cMEnumParamRealLiteralAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//value=REAL
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//REAL
		public RuleCall getValueREALParserRuleCall_3_0() { return cValueREALParserRuleCall_3_0; }
	}

	public class MEnumParamStringLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParamStringLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParamStringLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//MEnumParamStringLiteral returns common::MEnumParamStringLiteral:
		//	{common::MEnumParamStringLiteral} name=ID "=" value=STRING;
		public ParserRule getRule() { return rule; }

		//{common::MEnumParamStringLiteral} name=ID "=" value=STRING
		public Group getGroup() { return cGroup; }

		//{common::MEnumParamStringLiteral}
		public Action getMEnumParamStringLiteralAction_0() { return cMEnumParamStringLiteralAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//value=STRING
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_0() { return cValueSTRINGTerminalRuleCall_3_0; }
	}

	public class MBooleanParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MBooleanParameterSingleExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConstantAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cConstantConstKeyword_0_0 = (Keyword)cConstantAssignment_0.eContents().get(0);
		private final Keyword cBooleanKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDefaultValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cDefaultValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MBooleanParameterSingleExpression returns common::MBooleanParameterSingleExpression:
		//	constant?="const"? "boolean" name=ID ":=" defaultValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "boolean" name=ID ":=" defaultValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"boolean"
		public Keyword getBooleanKeyword_1() { return cBooleanKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_4() { return cDefaultValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_4_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_4_0; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MStringParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MStringParameterSingleExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConstantAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cConstantConstKeyword_0_0 = (Keyword)cConstantAssignment_0.eContents().get(0);
		private final Keyword cStringKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDefaultValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cDefaultValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MStringParameterSingleExpression returns common::MStringParameterSingleExpression:
		//	constant?="const"? "string" name=ID ":=" defaultValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "string" name=ID ":=" defaultValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"string"
		public Keyword getStringKeyword_1() { return cStringKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_4() { return cDefaultValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_4_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_4_0; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean returns ecore::EBoolean:
		//	"true" | "false";
		public ParserRule getRule() { return rule; }

		//"true" | "false"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"true"
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }

		//"false"
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}

	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "INTEGER");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cHEXADECIMALTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//INTEGER returns ecore::EString:
		//	"-"? INT | HEXADECIMAL;
		public ParserRule getRule() { return rule; }

		//"-"? INT | HEXADECIMAL
		public Alternatives getAlternatives() { return cAlternatives; }

		//"-"? INT
		public Group getGroup_0() { return cGroup_0; }

		//"-"?
		public Keyword getHyphenMinusKeyword_0_0() { return cHyphenMinusKeyword_0_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_0_1() { return cINTTerminalRuleCall_0_1; }

		//HEXADECIMAL
		public RuleCall getHEXADECIMALTerminalRuleCall_1() { return cHEXADECIMALTerminalRuleCall_1; }
	}

	public class REALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "REAL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2_2 = (RuleCall)cGroup_2.eContents().get(2);
		
		//REAL returns ecore::EString:
		//	"-"? (INT "." INT) ("e" "-"? INT)?;
		public ParserRule getRule() { return rule; }

		//"-"? (INT "." INT) ("e" "-"? INT)?
		public Group getGroup() { return cGroup; }

		//"-"?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//INT "." INT
		public Group getGroup_1() { return cGroup_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_0() { return cINTTerminalRuleCall_1_0; }

		//"."
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_2() { return cINTTerminalRuleCall_1_2; }

		//("e" "-"? INT)?
		public Group getGroup_2() { return cGroup_2; }

		//"e"
		public Keyword getEKeyword_2_0() { return cEKeyword_2_0; }

		//"-"?
		public Keyword getHyphenMinusKeyword_2_1() { return cHyphenMinusKeyword_2_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_2_2() { return cINTTerminalRuleCall_2_2; }
	}

	public class MParameterValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMParameterValueLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMParameterValueRefObjectParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMParameterValuePARParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//MParameterValue returns common::MParameterValue:
		//	MParameterValueLiteral | MParameterValueRefObject | MParameterValuePAR;
		public ParserRule getRule() { return rule; }

		//MParameterValueLiteral | MParameterValueRefObject | MParameterValuePAR
		public Alternatives getAlternatives() { return cAlternatives; }

		//MParameterValueLiteral
		public RuleCall getMParameterValueLiteralParserRuleCall_0() { return cMParameterValueLiteralParserRuleCall_0; }

		//MParameterValueRefObject
		public RuleCall getMParameterValueRefObjectParserRuleCall_1() { return cMParameterValueRefObjectParserRuleCall_1; }

		//MParameterValuePAR
		public RuleCall getMParameterValuePARParserRuleCall_2() { return cMParameterValuePARParserRuleCall_2; }
	}

	public class MParameterValueLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValueLiteral");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMParameterValueBooleanLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMParameterValueStringLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMParameterValueIntegerLiteralParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMParameterValueRealLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//MParameterValueLiteral returns common::MParameterValueLiteral:
		//	MParameterValueBooleanLiteral | MParameterValueStringLiteral | MParameterValueIntegerLiteral |
		//	MParameterValueRealLiteral;
		public ParserRule getRule() { return rule; }

		//MParameterValueBooleanLiteral | MParameterValueStringLiteral | MParameterValueIntegerLiteral |
		//MParameterValueRealLiteral
		public Alternatives getAlternatives() { return cAlternatives; }

		//MParameterValueBooleanLiteral
		public RuleCall getMParameterValueBooleanLiteralParserRuleCall_0() { return cMParameterValueBooleanLiteralParserRuleCall_0; }

		//MParameterValueStringLiteral
		public RuleCall getMParameterValueStringLiteralParserRuleCall_1() { return cMParameterValueStringLiteralParserRuleCall_1; }

		//MParameterValueIntegerLiteral
		public RuleCall getMParameterValueIntegerLiteralParserRuleCall_2() { return cMParameterValueIntegerLiteralParserRuleCall_2; }

		//MParameterValueRealLiteral
		public RuleCall getMParameterValueRealLiteralParserRuleCall_3() { return cMParameterValueRealLiteralParserRuleCall_3; }
	}

	public class MParameterValueBooleanLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValueBooleanLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueBooleanLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueEBooleanParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//MParameterValueBooleanLiteral returns common::MParameterValueBooleanLiteral:
		//	{common::MParameterValueBooleanLiteral} value=EBoolean;
		public ParserRule getRule() { return rule; }

		//{common::MParameterValueBooleanLiteral} value=EBoolean
		public Group getGroup() { return cGroup; }

		//{common::MParameterValueBooleanLiteral}
		public Action getMParameterValueBooleanLiteralAction_0() { return cMParameterValueBooleanLiteralAction_0; }

		//value=EBoolean
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//EBoolean
		public RuleCall getValueEBooleanParserRuleCall_1_0() { return cValueEBooleanParserRuleCall_1_0; }
	}

	public class MParameterValueStringLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValueStringLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueStringLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//MParameterValueStringLiteral returns common::MParameterValueStringLiteral:
		//	{common::MParameterValueStringLiteral} value=STRING;
		public ParserRule getRule() { return rule; }

		//{common::MParameterValueStringLiteral} value=STRING
		public Group getGroup() { return cGroup; }

		//{common::MParameterValueStringLiteral}
		public Action getMParameterValueStringLiteralAction_0() { return cMParameterValueStringLiteralAction_0; }

		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}

	public class MParameterValueIntegerLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValueIntegerLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueIntegerLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTEGERParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//MParameterValueIntegerLiteral returns common::MParameterValueIntegerLiteral:
		//	{common::MParameterValueIntegerLiteral} value=INTEGER;
		public ParserRule getRule() { return rule; }

		//{common::MParameterValueIntegerLiteral} value=INTEGER
		public Group getGroup() { return cGroup; }

		//{common::MParameterValueIntegerLiteral}
		public Action getMParameterValueIntegerLiteralAction_0() { return cMParameterValueIntegerLiteralAction_0; }

		//value=INTEGER
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//INTEGER
		public RuleCall getValueINTEGERParserRuleCall_1_0() { return cValueINTEGERParserRuleCall_1_0; }
	}

	public class MParameterValueRealLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValueRealLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueRealLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueREALParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//MParameterValueRealLiteral returns common::MParameterValueRealLiteral:
		//	{common::MParameterValueRealLiteral} value=REAL;
		public ParserRule getRule() { return rule; }

		//{common::MParameterValueRealLiteral} value=REAL
		public Group getGroup() { return cGroup; }

		//{common::MParameterValueRealLiteral}
		public Action getMParameterValueRealLiteralAction_0() { return cMParameterValueRealLiteralAction_0; }

		//value=REAL
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//REAL
		public RuleCall getValueREALParserRuleCall_1_0() { return cValueREALParserRuleCall_1_0; }
	}

	public class MParameterValueRefObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValueRefObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueRefObjectAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cObjectAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cObjectMCommonReferenceableObjCrossReference_1_0 = (CrossReference)cObjectAssignment_1.eContents().get(0);
		private final RuleCall cObjectMCommonReferenceableObjVersionedQualifiedReferenceNameParserRuleCall_1_0_1 = (RuleCall)cObjectMCommonReferenceableObjCrossReference_1_0.eContents().get(1);
		
		//MParameterValueRefObject returns common::MParameterValueRefObject:
		//	{common::MParameterValueRefObject} object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName];
		public ParserRule getRule() { return rule; }

		//{common::MParameterValueRefObject} object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName]
		public Group getGroup() { return cGroup; }

		//{common::MParameterValueRefObject}
		public Action getMParameterValueRefObjectAction_0() { return cMParameterValueRefObjectAction_0; }

		//object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName]
		public Assignment getObjectAssignment_1() { return cObjectAssignment_1; }

		//[common::MCommonReferenceableObj|VersionedQualifiedReferenceName]
		public CrossReference getObjectMCommonReferenceableObjCrossReference_1_0() { return cObjectMCommonReferenceableObjCrossReference_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getObjectMCommonReferenceableObjVersionedQualifiedReferenceNameParserRuleCall_1_0_1() { return cObjectMCommonReferenceableObjVersionedQualifiedReferenceNameParserRuleCall_1_0_1; }
	}

	public class MParameterValuePARElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValuePAR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueMParameterValueExpressionParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//MParameterValuePAR returns common::MParameterValuePAR:
		//	"(" value=MParameterValueExpression ")";
		public ParserRule getRule() { return rule; }

		//"(" value=MParameterValueExpression ")"
		public Group getGroup() { return cGroup; }

		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }

		//value=MParameterValueExpression
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//MParameterValueExpression
		public RuleCall getValueMParameterValueExpressionParserRuleCall_1_0() { return cValueMParameterValueExpressionParserRuleCall_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}

	public class MParameterValueExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValueExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cLeftAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLeftMParameterValueTERMParserRuleCall_1_0 = (RuleCall)cLeftAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cOperationAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0 = (RuleCall)cOperationAssignment_2_0.eContents().get(0);
		private final Assignment cRightAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRightMParameterValueExpressionParserRuleCall_2_1_0 = (RuleCall)cRightAssignment_2_1.eContents().get(0);
		
		//MParameterValueExpression returns common::MParameterValueExpression:
		//	{common::MParameterValueExpression} left=MParameterValueTERM (operation=MParameterValueExpressionOperators
		//	right=MParameterValueExpression)?;
		public ParserRule getRule() { return rule; }

		//{common::MParameterValueExpression} left=MParameterValueTERM (operation=MParameterValueExpressionOperators
		//right=MParameterValueExpression)?
		public Group getGroup() { return cGroup; }

		//{common::MParameterValueExpression}
		public Action getMParameterValueExpressionAction_0() { return cMParameterValueExpressionAction_0; }

		//left=MParameterValueTERM
		public Assignment getLeftAssignment_1() { return cLeftAssignment_1; }

		//MParameterValueTERM
		public RuleCall getLeftMParameterValueTERMParserRuleCall_1_0() { return cLeftMParameterValueTERMParserRuleCall_1_0; }

		//(operation=MParameterValueExpressionOperators right=MParameterValueExpression)?
		public Group getGroup_2() { return cGroup_2; }

		//operation=MParameterValueExpressionOperators
		public Assignment getOperationAssignment_2_0() { return cOperationAssignment_2_0; }

		//MParameterValueExpressionOperators
		public RuleCall getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0() { return cOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0; }

		//right=MParameterValueExpression
		public Assignment getRightAssignment_2_1() { return cRightAssignment_2_1; }

		//MParameterValueExpression
		public RuleCall getRightMParameterValueExpressionParserRuleCall_2_1_0() { return cRightMParameterValueExpressionParserRuleCall_2_1_0; }
	}

	public class MParameterValueTERMElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValueTERM");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueTERMAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cLeftAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLeftMParameterValueParserRuleCall_1_0 = (RuleCall)cLeftAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cOperationAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0 = (RuleCall)cOperationAssignment_2_0.eContents().get(0);
		private final Assignment cRightAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRightMParameterValueTERMParserRuleCall_2_1_0 = (RuleCall)cRightAssignment_2_1.eContents().get(0);
		
		//MParameterValueTERM returns common::MParameterValueTERM:
		//	{common::MParameterValueTERM} left=MParameterValue (operation=MParameterValueTERMOperators
		//	right=MParameterValueTERM)?;
		public ParserRule getRule() { return rule; }

		//{common::MParameterValueTERM} left=MParameterValue (operation=MParameterValueTERMOperators right=MParameterValueTERM)?
		public Group getGroup() { return cGroup; }

		//{common::MParameterValueTERM}
		public Action getMParameterValueTERMAction_0() { return cMParameterValueTERMAction_0; }

		//left=MParameterValue
		public Assignment getLeftAssignment_1() { return cLeftAssignment_1; }

		//MParameterValue
		public RuleCall getLeftMParameterValueParserRuleCall_1_0() { return cLeftMParameterValueParserRuleCall_1_0; }

		//(operation=MParameterValueTERMOperators right=MParameterValueTERM)?
		public Group getGroup_2() { return cGroup_2; }

		//operation=MParameterValueTERMOperators
		public Assignment getOperationAssignment_2_0() { return cOperationAssignment_2_0; }

		//MParameterValueTERMOperators
		public RuleCall getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0() { return cOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0; }

		//right=MParameterValueTERM
		public Assignment getRightAssignment_2_1() { return cRightAssignment_2_1; }

		//MParameterValueTERM
		public RuleCall getRightMParameterValueTERMParserRuleCall_2_1_0() { return cRightMParameterValueTERMParserRuleCall_2_1_0; }
	}

	public class MParameterRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterRange");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMParameterOCRParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMParameterOORParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMParameterCORParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMParameterCCRParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//MParameterRange returns common::MParameterRange:
		//	MParameterOCR | MParameterOOR | MParameterCOR | MParameterCCR;
		public ParserRule getRule() { return rule; }

		//MParameterOCR | MParameterOOR | MParameterCOR | MParameterCCR
		public Alternatives getAlternatives() { return cAlternatives; }

		//MParameterOCR
		public RuleCall getMParameterOCRParserRuleCall_0() { return cMParameterOCRParserRuleCall_0; }

		//MParameterOOR
		public RuleCall getMParameterOORParserRuleCall_1() { return cMParameterOORParserRuleCall_1; }

		//MParameterCOR
		public RuleCall getMParameterCORParserRuleCall_2() { return cMParameterCORParserRuleCall_2; }

		//MParameterCCR
		public RuleCall getMParameterCCRParserRuleCall_3() { return cMParameterCCRParserRuleCall_3; }
	}

	public class MParameterOCRElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterOCR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterOCRAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerValueMParameterValueExpressionParserRuleCall_2_0 = (RuleCall)cLowerValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUpperValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUpperValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cUpperValueAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MParameterOCR returns common::MParameterOCR:
		//	{common::MParameterOCR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]";
		public ParserRule getRule() { return rule; }

		//{common::MParameterOCR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]"
		public Group getGroup() { return cGroup; }

		//{common::MParameterOCR}
		public Action getMParameterOCRAction_0() { return cMParameterOCRAction_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//lowerValue=MParameterValueExpression
		public Assignment getLowerValueAssignment_2() { return cLowerValueAssignment_2; }

		//MParameterValueExpression
		public RuleCall getLowerValueMParameterValueExpressionParserRuleCall_2_0() { return cLowerValueMParameterValueExpressionParserRuleCall_2_0; }

		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }

		//upperValue=MParameterValueExpression
		public Assignment getUpperValueAssignment_4() { return cUpperValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getUpperValueMParameterValueExpressionParserRuleCall_4_0() { return cUpperValueMParameterValueExpressionParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}

	public class MParameterOORElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterOOR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterOORAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerValueMParameterValueExpressionParserRuleCall_2_0 = (RuleCall)cLowerValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUpperValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUpperValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cUpperValueAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MParameterOOR returns common::MParameterOOR:
		//	{common::MParameterOOR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")";
		public ParserRule getRule() { return rule; }

		//{common::MParameterOOR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")"
		public Group getGroup() { return cGroup; }

		//{common::MParameterOOR}
		public Action getMParameterOORAction_0() { return cMParameterOORAction_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//lowerValue=MParameterValueExpression
		public Assignment getLowerValueAssignment_2() { return cLowerValueAssignment_2; }

		//MParameterValueExpression
		public RuleCall getLowerValueMParameterValueExpressionParserRuleCall_2_0() { return cLowerValueMParameterValueExpressionParserRuleCall_2_0; }

		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }

		//upperValue=MParameterValueExpression
		public Assignment getUpperValueAssignment_4() { return cUpperValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getUpperValueMParameterValueExpressionParserRuleCall_4_0() { return cUpperValueMParameterValueExpressionParserRuleCall_4_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class MParameterCORElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterCOR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterCORAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerValueMParameterValueExpressionParserRuleCall_2_0 = (RuleCall)cLowerValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUpperValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUpperValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cUpperValueAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MParameterCOR returns common::MParameterCOR:
		//	{common::MParameterCOR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")";
		public ParserRule getRule() { return rule; }

		//{common::MParameterCOR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")"
		public Group getGroup() { return cGroup; }

		//{common::MParameterCOR}
		public Action getMParameterCORAction_0() { return cMParameterCORAction_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }

		//lowerValue=MParameterValueExpression
		public Assignment getLowerValueAssignment_2() { return cLowerValueAssignment_2; }

		//MParameterValueExpression
		public RuleCall getLowerValueMParameterValueExpressionParserRuleCall_2_0() { return cLowerValueMParameterValueExpressionParserRuleCall_2_0; }

		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }

		//upperValue=MParameterValueExpression
		public Assignment getUpperValueAssignment_4() { return cUpperValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getUpperValueMParameterValueExpressionParserRuleCall_4_0() { return cUpperValueMParameterValueExpressionParserRuleCall_4_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class MParameterCCRElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterCCR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterCORAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerValueMParameterValueExpressionParserRuleCall_2_0 = (RuleCall)cLowerValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUpperValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUpperValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cUpperValueAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MParameterCCR returns common::MParameterCOR:
		//	{common::MParameterCOR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]";
		public ParserRule getRule() { return rule; }

		//{common::MParameterCOR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]"
		public Group getGroup() { return cGroup; }

		//{common::MParameterCOR}
		public Action getMParameterCORAction_0() { return cMParameterCORAction_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }

		//lowerValue=MParameterValueExpression
		public Assignment getLowerValueAssignment_2() { return cLowerValueAssignment_2; }

		//MParameterValueExpression
		public RuleCall getLowerValueMParameterValueExpressionParserRuleCall_2_0() { return cLowerValueMParameterValueExpressionParserRuleCall_2_0; }

		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }

		//upperValue=MParameterValueExpression
		public Assignment getUpperValueAssignment_4() { return cUpperValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getUpperValueMParameterValueExpressionParserRuleCall_4_0() { return cUpperValueMParameterValueExpressionParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}
	
	
	public class MParameterValueExpressionOperatorsElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValueExpressionOperators");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPlusEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPlusPlusSignKeyword_0_0 = (Keyword)cPlusEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMinusEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMinusHyphenMinusKeyword_1_0 = (Keyword)cMinusEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum MParameterValueExpressionOperators returns common::MParameterValueExpressionOperators:
		//	plus="+" | minus="-";
		public EnumRule getRule() { return rule; }

		//plus="+" | minus="-"
		public Alternatives getAlternatives() { return cAlternatives; }

		//plus="+"
		public EnumLiteralDeclaration getPlusEnumLiteralDeclaration_0() { return cPlusEnumLiteralDeclaration_0; }

		//"+"
		public Keyword getPlusPlusSignKeyword_0_0() { return cPlusPlusSignKeyword_0_0; }

		//minus="-"
		public EnumLiteralDeclaration getMinusEnumLiteralDeclaration_1() { return cMinusEnumLiteralDeclaration_1; }

		//"-"
		public Keyword getMinusHyphenMinusKeyword_1_0() { return cMinusHyphenMinusKeyword_1_0; }
	}

	public class MParameterValueTERMOperatorsElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValueTERMOperators");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMultEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMultAsteriskKeyword_0_0 = (Keyword)cMultEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDivEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDivSolidusKeyword_1_0 = (Keyword)cDivEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum MParameterValueTERMOperators returns common::MParameterValueTERMOperators:
		//	mult="*" | div="/";
		public EnumRule getRule() { return rule; }

		//mult="*" | div="/"
		public Alternatives getAlternatives() { return cAlternatives; }

		//mult="*"
		public EnumLiteralDeclaration getMultEnumLiteralDeclaration_0() { return cMultEnumLiteralDeclaration_0; }

		//"*"
		public Keyword getMultAsteriskKeyword_0_0() { return cMultAsteriskKeyword_0_0; }

		//div="/"
		public EnumLiteralDeclaration getDivEnumLiteralDeclaration_1() { return cDivEnumLiteralDeclaration_1; }

		//"/"
		public Keyword getDivSolidusKeyword_1_0() { return cDivSolidusKeyword_1_0; }
	}
	
	private MMCLEVSAIPackageFileElements pMMCLEVSAIPackageFile;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionedQualifiedNameElements pVersionedQualifiedName;
	private VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private MMCLEVSAIPackageElementElements pMMCLEVSAIPackageElement;
	private MSAIElements pMSAI;
	private MParameterElements pMParameter;
	private MIntegerParameterSingleExpressionElements pMIntegerParameterSingleExpression;
	private MEnumParameterDefinitionElements pMEnumParameterDefinition;
	private MEnumParameterSingleExpressionElements pMEnumParameterSingleExpression;
	private MRealParameterSingleExpressionElements pMRealParameterSingleExpression;
	private MEnumParameterLiteralRuleElements pMEnumParameterLiteralRule;
	private MEnumParameterLiteralElements pMEnumParameterLiteral;
	private MEnumParamIntegerLiteralElements pMEnumParamIntegerLiteral;
	private MEnumParamRealLiteralElements pMEnumParamRealLiteral;
	private MEnumParamStringLiteralElements pMEnumParamStringLiteral;
	private MBooleanParameterSingleExpressionElements pMBooleanParameterSingleExpression;
	private MStringParameterSingleExpressionElements pMStringParameterSingleExpression;
	private EBooleanElements pEBoolean;
	private TerminalRule tHEXADECIMAL;
	private INTEGERElements pINTEGER;
	private REALElements pREAL;
	private MParameterValueElements pMParameterValue;
	private MParameterValueLiteralElements pMParameterValueLiteral;
	private MParameterValueBooleanLiteralElements pMParameterValueBooleanLiteral;
	private MParameterValueStringLiteralElements pMParameterValueStringLiteral;
	private MParameterValueIntegerLiteralElements pMParameterValueIntegerLiteral;
	private MParameterValueRealLiteralElements pMParameterValueRealLiteral;
	private MParameterValueRefObjectElements pMParameterValueRefObject;
	private MParameterValuePARElements pMParameterValuePAR;
	private MParameterValueExpressionOperatorsElements unknownRuleMParameterValueExpressionOperators;
	private MParameterValueTERMOperatorsElements unknownRuleMParameterValueTERMOperators;
	private MParameterValueExpressionElements pMParameterValueExpression;
	private MParameterValueTERMElements pMParameterValueTERM;
	private MParameterRangeElements pMParameterRange;
	private MParameterOCRElements pMParameterOCR;
	private MParameterOORElements pMParameterOOR;
	private MParameterCORElements pMParameterCOR;
	private MParameterCCRElements pMParameterCCR;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SAIGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mclev.lang.SAI".equals(grammar.getName())) {
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

	
	//MMCLEVSAIPackageFile:
	//	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
	//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVSAIPackageElement;
	public MMCLEVSAIPackageFileElements getMMCLEVSAIPackageFileAccess() {
		return (pMMCLEVSAIPackageFile != null) ? pMMCLEVSAIPackageFile : (pMMCLEVSAIPackageFile = new MMCLEVSAIPackageFileElements());
	}
	
	public ParserRule getMMCLEVSAIPackageFileRule() {
		return getMMCLEVSAIPackageFileAccess().getRule();
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

	//MMCLEVSAIPackageElement:
	//	MSAI;
	public MMCLEVSAIPackageElementElements getMMCLEVSAIPackageElementAccess() {
		return (pMMCLEVSAIPackageElement != null) ? pMMCLEVSAIPackageElement : (pMMCLEVSAIPackageElement = new MMCLEVSAIPackageElementElements());
	}
	
	public ParserRule getMMCLEVSAIPackageElementRule() {
		return getMMCLEVSAIPackageElementAccess().getRule();
	}

	//MSAI:
	//	"sai" name=ID ("extends" extends+=[MSAI|VersionedQualifiedName] ("," extends+=[MSAI|VersionedQualifiedName])*)? "{"
	//	("version" ":=" version=Version ";" & "language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" &
	//	("attributes" "{" attributes+=MParameter+ "}" ";")? & ("requires" ":=" requires+=[MSAI|VersionedQualifiedName] (","
	//	requires+=[MSAI|VersionedQualifiedName])* ";")? & ("required" "osapi" ":="
	//	requiredOSAPI=[pdl::MOperatingSystemAPI|VersionedQualifiedName] ";")?) "}" ";";
	public MSAIElements getMSAIAccess() {
		return (pMSAI != null) ? pMSAI : (pMSAI = new MSAIElements());
	}
	
	public ParserRule getMSAIRule() {
		return getMSAIAccess().getRule();
	}

	//MParameter returns common::MParameter:
	//	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
	//	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition;
	public MParameterElements getMParameterAccess() {
		return (pMParameter != null) ? pMParameter : (pMParameter = new MParameterElements());
	}
	
	public ParserRule getMParameterRule() {
		return getMParameterAccess().getRule();
	}

	//MIntegerParameterSingleExpression returns common::MIntegerParameterSingleExpression:
	//	constant?="const"? "integer" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";";
	public MIntegerParameterSingleExpressionElements getMIntegerParameterSingleExpressionAccess() {
		return (pMIntegerParameterSingleExpression != null) ? pMIntegerParameterSingleExpression : (pMIntegerParameterSingleExpression = new MIntegerParameterSingleExpressionElements());
	}
	
	public ParserRule getMIntegerParameterSingleExpressionRule() {
		return getMIntegerParameterSingleExpressionAccess().getRule();
	}

	//MEnumParameterDefinition returns common::MEnumParameterDefinition:
	//	{common::MEnumParameterDefinition} "enum" name=ID "{" literals+=MEnumParameterLiteralRule (","
	//	literals+=MEnumParameterLiteralRule)* "}" ";";
	public MEnumParameterDefinitionElements getMEnumParameterDefinitionAccess() {
		return (pMEnumParameterDefinition != null) ? pMEnumParameterDefinition : (pMEnumParameterDefinition = new MEnumParameterDefinitionElements());
	}
	
	public ParserRule getMEnumParameterDefinitionRule() {
		return getMEnumParameterDefinitionAccess().getRule();
	}

	//MEnumParameterSingleExpression returns common::MEnumParameterSingleExpression:
	//	constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
	//	":=" defaultValue=MParameterValueExpression ";";
	public MEnumParameterSingleExpressionElements getMEnumParameterSingleExpressionAccess() {
		return (pMEnumParameterSingleExpression != null) ? pMEnumParameterSingleExpression : (pMEnumParameterSingleExpression = new MEnumParameterSingleExpressionElements());
	}
	
	public ParserRule getMEnumParameterSingleExpressionRule() {
		return getMEnumParameterSingleExpressionAccess().getRule();
	}

	//MRealParameterSingleExpression returns common::MRealParameterSingleExpression:
	//	constant?="const"? "real" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";";
	public MRealParameterSingleExpressionElements getMRealParameterSingleExpressionAccess() {
		return (pMRealParameterSingleExpression != null) ? pMRealParameterSingleExpression : (pMRealParameterSingleExpression = new MRealParameterSingleExpressionElements());
	}
	
	public ParserRule getMRealParameterSingleExpressionRule() {
		return getMRealParameterSingleExpressionAccess().getRule();
	}

	//MEnumParameterLiteralRule returns common::MEnumParameterLiteral:
	//	MEnumParameterLiteral | MEnumParamIntegerLiteral | MEnumParamRealLiteral | MEnumParamStringLiteral;
	public MEnumParameterLiteralRuleElements getMEnumParameterLiteralRuleAccess() {
		return (pMEnumParameterLiteralRule != null) ? pMEnumParameterLiteralRule : (pMEnumParameterLiteralRule = new MEnumParameterLiteralRuleElements());
	}
	
	public ParserRule getMEnumParameterLiteralRuleRule() {
		return getMEnumParameterLiteralRuleAccess().getRule();
	}

	//MEnumParameterLiteral returns common::MEnumParameterLiteral:
	//	{common::MEnumParameterLiteral} name=ID;
	public MEnumParameterLiteralElements getMEnumParameterLiteralAccess() {
		return (pMEnumParameterLiteral != null) ? pMEnumParameterLiteral : (pMEnumParameterLiteral = new MEnumParameterLiteralElements());
	}
	
	public ParserRule getMEnumParameterLiteralRule() {
		return getMEnumParameterLiteralAccess().getRule();
	}

	//MEnumParamIntegerLiteral returns common::MEnumParamIntegerLiteral:
	//	{common::MEnumParamIntegerLiteral} name=ID "=" value=INTEGER;
	public MEnumParamIntegerLiteralElements getMEnumParamIntegerLiteralAccess() {
		return (pMEnumParamIntegerLiteral != null) ? pMEnumParamIntegerLiteral : (pMEnumParamIntegerLiteral = new MEnumParamIntegerLiteralElements());
	}
	
	public ParserRule getMEnumParamIntegerLiteralRule() {
		return getMEnumParamIntegerLiteralAccess().getRule();
	}

	//MEnumParamRealLiteral returns common::MEnumParamRealLiteral:
	//	{common::MEnumParamRealLiteral} name=ID "=" value=REAL;
	public MEnumParamRealLiteralElements getMEnumParamRealLiteralAccess() {
		return (pMEnumParamRealLiteral != null) ? pMEnumParamRealLiteral : (pMEnumParamRealLiteral = new MEnumParamRealLiteralElements());
	}
	
	public ParserRule getMEnumParamRealLiteralRule() {
		return getMEnumParamRealLiteralAccess().getRule();
	}

	//MEnumParamStringLiteral returns common::MEnumParamStringLiteral:
	//	{common::MEnumParamStringLiteral} name=ID "=" value=STRING;
	public MEnumParamStringLiteralElements getMEnumParamStringLiteralAccess() {
		return (pMEnumParamStringLiteral != null) ? pMEnumParamStringLiteral : (pMEnumParamStringLiteral = new MEnumParamStringLiteralElements());
	}
	
	public ParserRule getMEnumParamStringLiteralRule() {
		return getMEnumParamStringLiteralAccess().getRule();
	}

	//MBooleanParameterSingleExpression returns common::MBooleanParameterSingleExpression:
	//	constant?="const"? "boolean" name=ID ":=" defaultValue=MParameterValueExpression ";";
	public MBooleanParameterSingleExpressionElements getMBooleanParameterSingleExpressionAccess() {
		return (pMBooleanParameterSingleExpression != null) ? pMBooleanParameterSingleExpression : (pMBooleanParameterSingleExpression = new MBooleanParameterSingleExpressionElements());
	}
	
	public ParserRule getMBooleanParameterSingleExpressionRule() {
		return getMBooleanParameterSingleExpressionAccess().getRule();
	}

	//MStringParameterSingleExpression returns common::MStringParameterSingleExpression:
	//	constant?="const"? "string" name=ID ":=" defaultValue=MParameterValueExpression ";";
	public MStringParameterSingleExpressionElements getMStringParameterSingleExpressionAccess() {
		return (pMStringParameterSingleExpression != null) ? pMStringParameterSingleExpression : (pMStringParameterSingleExpression = new MStringParameterSingleExpressionElements());
	}
	
	public ParserRule getMStringParameterSingleExpressionRule() {
		return getMStringParameterSingleExpressionAccess().getRule();
	}

	//EBoolean returns ecore::EBoolean:
	//	"true" | "false";
	public EBooleanElements getEBooleanAccess() {
		return (pEBoolean != null) ? pEBoolean : (pEBoolean = new EBooleanElements());
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}

	//terminal HEXADECIMAL:
	//	"0x" ("0".."9" | "a".."f" | "A".."F")+;
	public TerminalRule getHEXADECIMALRule() {
		return (tHEXADECIMAL != null) ? tHEXADECIMAL : (tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "HEXADECIMAL"));
	} 

	//INTEGER returns ecore::EString:
	//	"-"? INT | HEXADECIMAL;
	public INTEGERElements getINTEGERAccess() {
		return (pINTEGER != null) ? pINTEGER : (pINTEGER = new INTEGERElements());
	}
	
	public ParserRule getINTEGERRule() {
		return getINTEGERAccess().getRule();
	}

	//REAL returns ecore::EString:
	//	"-"? (INT "." INT) ("e" "-"? INT)?;
	public REALElements getREALAccess() {
		return (pREAL != null) ? pREAL : (pREAL = new REALElements());
	}
	
	public ParserRule getREALRule() {
		return getREALAccess().getRule();
	}

	//MParameterValue returns common::MParameterValue:
	//	MParameterValueLiteral | MParameterValueRefObject | MParameterValuePAR;
	public MParameterValueElements getMParameterValueAccess() {
		return (pMParameterValue != null) ? pMParameterValue : (pMParameterValue = new MParameterValueElements());
	}
	
	public ParserRule getMParameterValueRule() {
		return getMParameterValueAccess().getRule();
	}

	//MParameterValueLiteral returns common::MParameterValueLiteral:
	//	MParameterValueBooleanLiteral | MParameterValueStringLiteral | MParameterValueIntegerLiteral |
	//	MParameterValueRealLiteral;
	public MParameterValueLiteralElements getMParameterValueLiteralAccess() {
		return (pMParameterValueLiteral != null) ? pMParameterValueLiteral : (pMParameterValueLiteral = new MParameterValueLiteralElements());
	}
	
	public ParserRule getMParameterValueLiteralRule() {
		return getMParameterValueLiteralAccess().getRule();
	}

	//MParameterValueBooleanLiteral returns common::MParameterValueBooleanLiteral:
	//	{common::MParameterValueBooleanLiteral} value=EBoolean;
	public MParameterValueBooleanLiteralElements getMParameterValueBooleanLiteralAccess() {
		return (pMParameterValueBooleanLiteral != null) ? pMParameterValueBooleanLiteral : (pMParameterValueBooleanLiteral = new MParameterValueBooleanLiteralElements());
	}
	
	public ParserRule getMParameterValueBooleanLiteralRule() {
		return getMParameterValueBooleanLiteralAccess().getRule();
	}

	//MParameterValueStringLiteral returns common::MParameterValueStringLiteral:
	//	{common::MParameterValueStringLiteral} value=STRING;
	public MParameterValueStringLiteralElements getMParameterValueStringLiteralAccess() {
		return (pMParameterValueStringLiteral != null) ? pMParameterValueStringLiteral : (pMParameterValueStringLiteral = new MParameterValueStringLiteralElements());
	}
	
	public ParserRule getMParameterValueStringLiteralRule() {
		return getMParameterValueStringLiteralAccess().getRule();
	}

	//MParameterValueIntegerLiteral returns common::MParameterValueIntegerLiteral:
	//	{common::MParameterValueIntegerLiteral} value=INTEGER;
	public MParameterValueIntegerLiteralElements getMParameterValueIntegerLiteralAccess() {
		return (pMParameterValueIntegerLiteral != null) ? pMParameterValueIntegerLiteral : (pMParameterValueIntegerLiteral = new MParameterValueIntegerLiteralElements());
	}
	
	public ParserRule getMParameterValueIntegerLiteralRule() {
		return getMParameterValueIntegerLiteralAccess().getRule();
	}

	//MParameterValueRealLiteral returns common::MParameterValueRealLiteral:
	//	{common::MParameterValueRealLiteral} value=REAL;
	public MParameterValueRealLiteralElements getMParameterValueRealLiteralAccess() {
		return (pMParameterValueRealLiteral != null) ? pMParameterValueRealLiteral : (pMParameterValueRealLiteral = new MParameterValueRealLiteralElements());
	}
	
	public ParserRule getMParameterValueRealLiteralRule() {
		return getMParameterValueRealLiteralAccess().getRule();
	}

	//MParameterValueRefObject returns common::MParameterValueRefObject:
	//	{common::MParameterValueRefObject} object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName];
	public MParameterValueRefObjectElements getMParameterValueRefObjectAccess() {
		return (pMParameterValueRefObject != null) ? pMParameterValueRefObject : (pMParameterValueRefObject = new MParameterValueRefObjectElements());
	}
	
	public ParserRule getMParameterValueRefObjectRule() {
		return getMParameterValueRefObjectAccess().getRule();
	}

	//MParameterValuePAR returns common::MParameterValuePAR:
	//	"(" value=MParameterValueExpression ")";
	public MParameterValuePARElements getMParameterValuePARAccess() {
		return (pMParameterValuePAR != null) ? pMParameterValuePAR : (pMParameterValuePAR = new MParameterValuePARElements());
	}
	
	public ParserRule getMParameterValuePARRule() {
		return getMParameterValuePARAccess().getRule();
	}

	//enum MParameterValueExpressionOperators returns common::MParameterValueExpressionOperators:
	//	plus="+" | minus="-";
	public MParameterValueExpressionOperatorsElements getMParameterValueExpressionOperatorsAccess() {
		return (unknownRuleMParameterValueExpressionOperators != null) ? unknownRuleMParameterValueExpressionOperators : (unknownRuleMParameterValueExpressionOperators = new MParameterValueExpressionOperatorsElements());
	}
	
	public EnumRule getMParameterValueExpressionOperatorsRule() {
		return getMParameterValueExpressionOperatorsAccess().getRule();
	}

	//enum MParameterValueTERMOperators returns common::MParameterValueTERMOperators:
	//	mult="*" | div="/";
	public MParameterValueTERMOperatorsElements getMParameterValueTERMOperatorsAccess() {
		return (unknownRuleMParameterValueTERMOperators != null) ? unknownRuleMParameterValueTERMOperators : (unknownRuleMParameterValueTERMOperators = new MParameterValueTERMOperatorsElements());
	}
	
	public EnumRule getMParameterValueTERMOperatorsRule() {
		return getMParameterValueTERMOperatorsAccess().getRule();
	}

	//MParameterValueExpression returns common::MParameterValueExpression:
	//	{common::MParameterValueExpression} left=MParameterValueTERM (operation=MParameterValueExpressionOperators
	//	right=MParameterValueExpression)?;
	public MParameterValueExpressionElements getMParameterValueExpressionAccess() {
		return (pMParameterValueExpression != null) ? pMParameterValueExpression : (pMParameterValueExpression = new MParameterValueExpressionElements());
	}
	
	public ParserRule getMParameterValueExpressionRule() {
		return getMParameterValueExpressionAccess().getRule();
	}

	//MParameterValueTERM returns common::MParameterValueTERM:
	//	{common::MParameterValueTERM} left=MParameterValue (operation=MParameterValueTERMOperators
	//	right=MParameterValueTERM)?;
	public MParameterValueTERMElements getMParameterValueTERMAccess() {
		return (pMParameterValueTERM != null) ? pMParameterValueTERM : (pMParameterValueTERM = new MParameterValueTERMElements());
	}
	
	public ParserRule getMParameterValueTERMRule() {
		return getMParameterValueTERMAccess().getRule();
	}

	//MParameterRange returns common::MParameterRange:
	//	MParameterOCR | MParameterOOR | MParameterCOR | MParameterCCR;
	public MParameterRangeElements getMParameterRangeAccess() {
		return (pMParameterRange != null) ? pMParameterRange : (pMParameterRange = new MParameterRangeElements());
	}
	
	public ParserRule getMParameterRangeRule() {
		return getMParameterRangeAccess().getRule();
	}

	//MParameterOCR returns common::MParameterOCR:
	//	{common::MParameterOCR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]";
	public MParameterOCRElements getMParameterOCRAccess() {
		return (pMParameterOCR != null) ? pMParameterOCR : (pMParameterOCR = new MParameterOCRElements());
	}
	
	public ParserRule getMParameterOCRRule() {
		return getMParameterOCRAccess().getRule();
	}

	//MParameterOOR returns common::MParameterOOR:
	//	{common::MParameterOOR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")";
	public MParameterOORElements getMParameterOORAccess() {
		return (pMParameterOOR != null) ? pMParameterOOR : (pMParameterOOR = new MParameterOORElements());
	}
	
	public ParserRule getMParameterOORRule() {
		return getMParameterOORAccess().getRule();
	}

	//MParameterCOR returns common::MParameterCOR:
	//	{common::MParameterCOR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")";
	public MParameterCORElements getMParameterCORAccess() {
		return (pMParameterCOR != null) ? pMParameterCOR : (pMParameterCOR = new MParameterCORElements());
	}
	
	public ParserRule getMParameterCORRule() {
		return getMParameterCORAccess().getRule();
	}

	//MParameterCCR returns common::MParameterCOR:
	//	{common::MParameterCOR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]";
	public MParameterCCRElements getMParameterCCRAccess() {
		return (pMParameterCCR != null) ? pMParameterCCR : (pMParameterCCR = new MParameterCCRElements());
	}
	
	public ParserRule getMParameterCCRRule() {
		return getMParameterCCRAccess().getRule();
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
