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
package es.uah.aut.srg.micobs.lang.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class LANGGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MSYSTEMPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MSYSTEMPackageFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPackageMSystemPackageCrossReference_1_0 = (CrossReference)cPackageAssignment_1.eContents().get(0);
		private final RuleCall cPackageMSystemPackageQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cPackageMSystemPackageCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cImportKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cImportsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cImportsMSystemPackageCrossReference_3_1_0 = (CrossReference)cImportsAssignment_3_1.eContents().get(0);
		private final RuleCall cImportsMSystemPackageQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cImportsMSystemPackageCrossReference_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cElementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementMSYSTEMPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MSYSTEMPackageFile:
		//	"package" package=[systemlibrary::MSystemPackage|QualifiedName] ";" ("import"
		//	imports+=[systemlibrary::MSystemPackage|QualifiedName] ";")* element=MSYSTEMPackageElement;
		public ParserRule getRule() { return rule; }

		//"package" package=[systemlibrary::MSystemPackage|QualifiedName] ";" ("import"
		//imports+=[systemlibrary::MSystemPackage|QualifiedName] ";")* element=MSYSTEMPackageElement
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//package=[systemlibrary::MSystemPackage|QualifiedName]
		public Assignment getPackageAssignment_1() { return cPackageAssignment_1; }

		//[systemlibrary::MSystemPackage|QualifiedName]
		public CrossReference getPackageMSystemPackageCrossReference_1_0() { return cPackageMSystemPackageCrossReference_1_0; }

		//QualifiedName
		public RuleCall getPackageMSystemPackageQualifiedNameParserRuleCall_1_0_1() { return cPackageMSystemPackageQualifiedNameParserRuleCall_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }

		//("import" imports+=[systemlibrary::MSystemPackage|QualifiedName] ";")*
		public Group getGroup_3() { return cGroup_3; }

		//"import"
		public Keyword getImportKeyword_3_0() { return cImportKeyword_3_0; }

		//imports+=[systemlibrary::MSystemPackage|QualifiedName]
		public Assignment getImportsAssignment_3_1() { return cImportsAssignment_3_1; }

		//[systemlibrary::MSystemPackage|QualifiedName]
		public CrossReference getImportsMSystemPackageCrossReference_3_1_0() { return cImportsMSystemPackageCrossReference_3_1_0; }

		//QualifiedName
		public RuleCall getImportsMSystemPackageQualifiedNameParserRuleCall_3_1_0_1() { return cImportsMSystemPackageQualifiedNameParserRuleCall_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_2() { return cSemicolonKeyword_3_2; }

		//element=MSYSTEMPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MSYSTEMPackageElement
		public RuleCall getElementMSYSTEMPackageElementParserRuleCall_4_0() { return cElementMSYSTEMPackageElementParserRuleCall_4_0; }
	}

	public class MSYSTEMPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MSYSTEMPackageElement");
		private final RuleCall cMLanguageParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MSYSTEMPackageElement:
		//	MLanguage;
		public ParserRule getRule() { return rule; }

		//MLanguage
		public RuleCall getMLanguageParserRuleCall() { return cMLanguageParserRuleCall; }
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

	public class MLanguageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MLanguage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLanguageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cExtendsMLanguageCrossReference_2_1_0 = (CrossReference)cExtendsAssignment_2_1.eContents().get(0);
		private final RuleCall cExtendsMLanguageVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cExtendsMLanguageCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cExtendsMLanguageCrossReference_2_2_1_0 = (CrossReference)cExtendsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cExtendsMLanguageVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cExtendsMLanguageCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cVersionKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonEqualsSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cVersionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cVersionVersionParserRuleCall_6_0 = (RuleCall)cVersionAssignment_6.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//MLanguage:
		//	"language" name=ID ("extends" extends+=[MLanguage|VersionedQualifiedName] (","
		//	extends+=[MLanguage|VersionedQualifiedName])*)? "{" "version" ":=" version=Version ";" "}" ";";
		public ParserRule getRule() { return rule; }

		//"language" name=ID ("extends" extends+=[MLanguage|VersionedQualifiedName] (","
		//extends+=[MLanguage|VersionedQualifiedName])*)? "{" "version" ":=" version=Version ";" "}" ";"
		public Group getGroup() { return cGroup; }

		//"language"
		public Keyword getLanguageKeyword_0() { return cLanguageKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("extends" extends+=[MLanguage|VersionedQualifiedName] ("," extends+=[MLanguage|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//"extends"
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//extends+=[MLanguage|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_1() { return cExtendsAssignment_2_1; }

		//[MLanguage|VersionedQualifiedName]
		public CrossReference getExtendsMLanguageCrossReference_2_1_0() { return cExtendsMLanguageCrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMLanguageVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cExtendsMLanguageVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," extends+=[MLanguage|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//extends+=[MLanguage|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_2_1() { return cExtendsAssignment_2_2_1; }

		//[MLanguage|VersionedQualifiedName]
		public CrossReference getExtendsMLanguageCrossReference_2_2_1_0() { return cExtendsMLanguageCrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMLanguageVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cExtendsMLanguageVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//"version"
		public Keyword getVersionKeyword_4() { return cVersionKeyword_4; }

		//":="
		public Keyword getColonEqualsSignKeyword_5() { return cColonEqualsSignKeyword_5; }

		//version=Version
		public Assignment getVersionAssignment_6() { return cVersionAssignment_6; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_6_0() { return cVersionVersionParserRuleCall_6_0; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }

		//";"
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
	}
	
	
	private MSYSTEMPackageFileElements pMSYSTEMPackageFile;
	private MSYSTEMPackageElementElements pMSYSTEMPackageElement;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionedQualifiedNameElements pVersionedQualifiedName;
	private MLanguageElements pMLanguage;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public LANGGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.lang.LANG".equals(grammar.getName())) {
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

	
	//MSYSTEMPackageFile:
	//	"package" package=[systemlibrary::MSystemPackage|QualifiedName] ";" ("import"
	//	imports+=[systemlibrary::MSystemPackage|QualifiedName] ";")* element=MSYSTEMPackageElement;
	public MSYSTEMPackageFileElements getMSYSTEMPackageFileAccess() {
		return (pMSYSTEMPackageFile != null) ? pMSYSTEMPackageFile : (pMSYSTEMPackageFile = new MSYSTEMPackageFileElements());
	}
	
	public ParserRule getMSYSTEMPackageFileRule() {
		return getMSYSTEMPackageFileAccess().getRule();
	}

	//MSYSTEMPackageElement:
	//	MLanguage;
	public MSYSTEMPackageElementElements getMSYSTEMPackageElementAccess() {
		return (pMSYSTEMPackageElement != null) ? pMSYSTEMPackageElement : (pMSYSTEMPackageElement = new MSYSTEMPackageElementElements());
	}
	
	public ParserRule getMSYSTEMPackageElementRule() {
		return getMSYSTEMPackageElementAccess().getRule();
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

	//MLanguage:
	//	"language" name=ID ("extends" extends+=[MLanguage|VersionedQualifiedName] (","
	//	extends+=[MLanguage|VersionedQualifiedName])*)? "{" "version" ":=" version=Version ";" "}" ";";
	public MLanguageElements getMLanguageAccess() {
		return (pMLanguage != null) ? pMLanguage : (pMLanguage = new MLanguageElements());
	}
	
	public ParserRule getMLanguageRule() {
		return getMLanguageAccess().getRule();
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
