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
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class IFACEGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMCLEVIFACEPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMCLEVIFACEPackageFile");
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
		private final RuleCall cElementMMCLEVIFACEPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMCLEVIFACEPackageFile:
		//	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
		//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVIFACEPackageElement;
		public ParserRule getRule() { return rule; }

		//"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
		//imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVIFACEPackageElement
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

		//element=MMCLEVIFACEPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMCLEVIFACEPackageElement
		public RuleCall getElementMMCLEVIFACEPackageElementParserRuleCall_4_0() { return cElementMMCLEVIFACEPackageElementParserRuleCall_4_0; }
	}

	public class MMCLEVIFACEPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMCLEVIFACEPackageElement");
		private final RuleCall cMInterfaceParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MMCLEVIFACEPackageElement:
		//	MInterface;
		public ParserRule getRule() { return rule; }

		//MInterface
		public RuleCall getMInterfaceParserRuleCall() { return cMInterfaceParserRuleCall; }
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

	public class MInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDomainAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDomainMDomainCrossReference_1_0 = (CrossReference)cDomainAssignment_1.eContents().get(0);
		private final RuleCall cDomainMDomainVersionedQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cDomainMDomainCrossReference_1_0.eContents().get(1);
		private final Keyword cColonColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTypeMInterfaceTypeCrossReference_3_0 = (CrossReference)cTypeAssignment_3.eContents().get(0);
		private final RuleCall cTypeMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_0_1 = (RuleCall)cTypeMInterfaceTypeCrossReference_3_0.eContents().get(1);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cExtendsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cExtendsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cExtendsMInterfaceCrossReference_5_1_0 = (CrossReference)cExtendsAssignment_5_1.eContents().get(0);
		private final RuleCall cExtendsMInterfaceVersionedQualifiedNameParserRuleCall_5_1_0_1 = (RuleCall)cExtendsMInterfaceCrossReference_5_1_0.eContents().get(1);
		private final Group cGroup_5_2 = (Group)cGroup_5.eContents().get(2);
		private final Keyword cCommaKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Assignment cExtendsAssignment_5_2_1 = (Assignment)cGroup_5_2.eContents().get(1);
		private final CrossReference cExtendsMInterfaceCrossReference_5_2_1_0 = (CrossReference)cExtendsAssignment_5_2_1.eContents().get(0);
		private final RuleCall cExtendsMInterfaceVersionedQualifiedNameParserRuleCall_5_2_1_0_1 = (RuleCall)cExtendsMInterfaceCrossReference_5_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cVersionKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cColonEqualsSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cVersionAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cVersionVersionParserRuleCall_9_0 = (RuleCall)cVersionAssignment_9.eContents().get(0);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//MInterface:
		//	"interface" domain=[mclevdom::MDomain|VersionedQualifiedName] "::"
		//	type=[mclevdom::MInterfaceType|VersionedQualifiedReferenceName] name=ID ("extends"
		//	extends+=[MInterface|VersionedQualifiedName] ("," extends+=[MInterface|VersionedQualifiedName])*)? "{" "version" ":="
		//	version=Version ";" "}" ";";
		public ParserRule getRule() { return rule; }

		//"interface" domain=[mclevdom::MDomain|VersionedQualifiedName] "::"
		//type=[mclevdom::MInterfaceType|VersionedQualifiedReferenceName] name=ID ("extends"
		//extends+=[MInterface|VersionedQualifiedName] ("," extends+=[MInterface|VersionedQualifiedName])*)? "{" "version" ":="
		//version=Version ";" "}" ";"
		public Group getGroup() { return cGroup; }

		//"interface"
		public Keyword getInterfaceKeyword_0() { return cInterfaceKeyword_0; }

		//domain=[mclevdom::MDomain|VersionedQualifiedName]
		public Assignment getDomainAssignment_1() { return cDomainAssignment_1; }

		//[mclevdom::MDomain|VersionedQualifiedName]
		public CrossReference getDomainMDomainCrossReference_1_0() { return cDomainMDomainCrossReference_1_0; }

		//VersionedQualifiedName
		public RuleCall getDomainMDomainVersionedQualifiedNameParserRuleCall_1_0_1() { return cDomainMDomainVersionedQualifiedNameParserRuleCall_1_0_1; }

		//"::"
		public Keyword getColonColonKeyword_2() { return cColonColonKeyword_2; }

		//type=[mclevdom::MInterfaceType|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//[mclevdom::MInterfaceType|VersionedQualifiedReferenceName]
		public CrossReference getTypeMInterfaceTypeCrossReference_3_0() { return cTypeMInterfaceTypeCrossReference_3_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_0_1() { return cTypeMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_0_1; }

		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }

		//("extends" extends+=[MInterface|VersionedQualifiedName] ("," extends+=[MInterface|VersionedQualifiedName])*)?
		public Group getGroup_5() { return cGroup_5; }

		//"extends"
		public Keyword getExtendsKeyword_5_0() { return cExtendsKeyword_5_0; }

		//extends+=[MInterface|VersionedQualifiedName]
		public Assignment getExtendsAssignment_5_1() { return cExtendsAssignment_5_1; }

		//[MInterface|VersionedQualifiedName]
		public CrossReference getExtendsMInterfaceCrossReference_5_1_0() { return cExtendsMInterfaceCrossReference_5_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMInterfaceVersionedQualifiedNameParserRuleCall_5_1_0_1() { return cExtendsMInterfaceVersionedQualifiedNameParserRuleCall_5_1_0_1; }

		//("," extends+=[MInterface|VersionedQualifiedName])*
		public Group getGroup_5_2() { return cGroup_5_2; }

		//","
		public Keyword getCommaKeyword_5_2_0() { return cCommaKeyword_5_2_0; }

		//extends+=[MInterface|VersionedQualifiedName]
		public Assignment getExtendsAssignment_5_2_1() { return cExtendsAssignment_5_2_1; }

		//[MInterface|VersionedQualifiedName]
		public CrossReference getExtendsMInterfaceCrossReference_5_2_1_0() { return cExtendsMInterfaceCrossReference_5_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMInterfaceVersionedQualifiedNameParserRuleCall_5_2_1_0_1() { return cExtendsMInterfaceVersionedQualifiedNameParserRuleCall_5_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }

		//"version"
		public Keyword getVersionKeyword_7() { return cVersionKeyword_7; }

		//":="
		public Keyword getColonEqualsSignKeyword_8() { return cColonEqualsSignKeyword_8; }

		//version=Version
		public Assignment getVersionAssignment_9() { return cVersionAssignment_9; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_9_0() { return cVersionVersionParserRuleCall_9_0; }

		//";"
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }

		//";"
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }
	}
	
	
	private MMCLEVIFACEPackageFileElements pMMCLEVIFACEPackageFile;
	private MMCLEVIFACEPackageElementElements pMMCLEVIFACEPackageElement;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionedQualifiedNameElements pVersionedQualifiedName;
	private VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private MInterfaceElements pMInterface;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public IFACEGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mclev.lang.IFACE".equals(grammar.getName())) {
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

	
	//MMCLEVIFACEPackageFile:
	//	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
	//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVIFACEPackageElement;
	public MMCLEVIFACEPackageFileElements getMMCLEVIFACEPackageFileAccess() {
		return (pMMCLEVIFACEPackageFile != null) ? pMMCLEVIFACEPackageFile : (pMMCLEVIFACEPackageFile = new MMCLEVIFACEPackageFileElements());
	}
	
	public ParserRule getMMCLEVIFACEPackageFileRule() {
		return getMMCLEVIFACEPackageFileAccess().getRule();
	}

	//MMCLEVIFACEPackageElement:
	//	MInterface;
	public MMCLEVIFACEPackageElementElements getMMCLEVIFACEPackageElementAccess() {
		return (pMMCLEVIFACEPackageElement != null) ? pMMCLEVIFACEPackageElement : (pMMCLEVIFACEPackageElement = new MMCLEVIFACEPackageElementElements());
	}
	
	public ParserRule getMMCLEVIFACEPackageElementRule() {
		return getMMCLEVIFACEPackageElementAccess().getRule();
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

	//MInterface:
	//	"interface" domain=[mclevdom::MDomain|VersionedQualifiedName] "::"
	//	type=[mclevdom::MInterfaceType|VersionedQualifiedReferenceName] name=ID ("extends"
	//	extends+=[MInterface|VersionedQualifiedName] ("," extends+=[MInterface|VersionedQualifiedName])*)? "{" "version" ":="
	//	version=Version ";" "}" ";";
	public MInterfaceElements getMInterfaceAccess() {
		return (pMInterface != null) ? pMInterface : (pMInterface = new MInterfaceElements());
	}
	
	public ParserRule getMInterfaceRule() {
		return getMInterfaceAccess().getRule();
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
