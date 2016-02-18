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
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class IMAPGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMCLEVIMAPPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMCLEVIMAPPackageFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPackageMMCLEVPackageCrossReference_1_0 = (CrossReference)cPackageAssignment_1.eContents().get(0);
		private final RuleCall cPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cPackageMMCLEVPackageCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cImportKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cImportsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cImportsMMCLEVPackageCrossReference_3_1_0 = (CrossReference)cImportsAssignment_3_1.eContents().get(0);
		private final RuleCall cImportsMMCLEVPackageQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cImportsMMCLEVPackageCrossReference_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cElementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementMMCLEVIMAPPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMCLEVIMAPPackageFile:
		//	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
		//	imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ";")* element=MMCLEVIMAPPackageElement;
		public ParserRule getRule() { return rule; }

		//"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
		//imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ";")* element=MMCLEVIMAPPackageElement
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

		//("import" imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ";")*
		public Group getGroup_3() { return cGroup_3; }

		//"import"
		public Keyword getImportKeyword_3_0() { return cImportKeyword_3_0; }

		//imports+=[mclevlibrary::MMCLEVPackage|QualifiedName]
		public Assignment getImportsAssignment_3_1() { return cImportsAssignment_3_1; }

		//[mclevlibrary::MMCLEVPackage|QualifiedName]
		public CrossReference getImportsMMCLEVPackageCrossReference_3_1_0() { return cImportsMMCLEVPackageCrossReference_3_1_0; }

		//QualifiedName
		public RuleCall getImportsMMCLEVPackageQualifiedNameParserRuleCall_3_1_0_1() { return cImportsMMCLEVPackageQualifiedNameParserRuleCall_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_2() { return cSemicolonKeyword_3_2; }

		//element=MMCLEVIMAPPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMCLEVIMAPPackageElement
		public RuleCall getElementMMCLEVIMAPPackageElementParserRuleCall_4_0() { return cElementMMCLEVIMAPPackageElementParserRuleCall_4_0; }
	}

	public class MMCLEVIMAPPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMCLEVIMAPPackageElement");
		private final RuleCall cMInterfaceMappingParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MMCLEVIMAPPackageElement:
		//	MInterfaceMapping;
		public ParserRule getRule() { return rule; }

		//MInterfaceMapping
		public RuleCall getMInterfaceMappingParserRuleCall() { return cMInterfaceMappingParserRuleCall; }
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

	public class MInterfaceMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MInterfaceMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMappingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDomainAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDomainMIODomainCrossReference_1_0 = (CrossReference)cDomainAssignment_1.eContents().get(0);
		private final RuleCall cDomainMIODomainVersionedQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cDomainMIODomainCrossReference_1_0.eContents().get(1);
		private final Keyword cColonColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTypeMExchangeModelCrossReference_3_0 = (CrossReference)cTypeAssignment_3.eContents().get(0);
		private final RuleCall cTypeMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_3_0_1 = (RuleCall)cTypeMExchangeModelCrossReference_3_0.eContents().get(1);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final UnorderedGroup cUnorderedGroup_6 = (UnorderedGroup)cGroup.eContents().get(6);
		private final Group cGroup_6_0 = (Group)cUnorderedGroup_6.eContents().get(0);
		private final Keyword cVersionKeyword_6_0_0 = (Keyword)cGroup_6_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_0_1 = (Keyword)cGroup_6_0.eContents().get(1);
		private final Assignment cVersionAssignment_6_0_2 = (Assignment)cGroup_6_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_6_0_2_0 = (RuleCall)cVersionAssignment_6_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_6_0_3 = (Keyword)cGroup_6_0.eContents().get(3);
		private final Group cGroup_6_1 = (Group)cUnorderedGroup_6.eContents().get(1);
		private final Keyword cInterfacesKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_1_1 = (Keyword)cGroup_6_1.eContents().get(1);
		private final Assignment cInterfacesAssignment_6_1_2 = (Assignment)cGroup_6_1.eContents().get(2);
		private final CrossReference cInterfacesMInterfaceCrossReference_6_1_2_0 = (CrossReference)cInterfacesAssignment_6_1_2.eContents().get(0);
		private final RuleCall cInterfacesMInterfaceVersionedQualifiedNameParserRuleCall_6_1_2_0_1 = (RuleCall)cInterfacesMInterfaceCrossReference_6_1_2_0.eContents().get(1);
		private final Keyword cCommaKeyword_6_1_3 = (Keyword)cGroup_6_1.eContents().get(3);
		private final Assignment cInterfacesAssignment_6_1_4 = (Assignment)cGroup_6_1.eContents().get(4);
		private final CrossReference cInterfacesMInterfaceCrossReference_6_1_4_0 = (CrossReference)cInterfacesAssignment_6_1_4.eContents().get(0);
		private final RuleCall cInterfacesMInterfaceVersionedQualifiedNameParserRuleCall_6_1_4_0_1 = (RuleCall)cInterfacesMInterfaceCrossReference_6_1_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6_1_5 = (Keyword)cGroup_6_1.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MInterfaceMapping:
		//	"mapping" domain=[mclevdom::MIODomain|VersionedQualifiedName] "::"
		//	type=[mclevdom::MExchangeModel|VersionedQualifiedReferenceName] name=ID "{" ("version" ":=" version=Version ";" &
		//	"interfaces" ":=" interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ","
		//	interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ";") "}" ";";
		public ParserRule getRule() { return rule; }

		//"mapping" domain=[mclevdom::MIODomain|VersionedQualifiedName] "::"
		//type=[mclevdom::MExchangeModel|VersionedQualifiedReferenceName] name=ID "{" ("version" ":=" version=Version ";" &
		//"interfaces" ":=" interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ","
		//interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ";") "}" ";"
		public Group getGroup() { return cGroup; }

		//"mapping"
		public Keyword getMappingKeyword_0() { return cMappingKeyword_0; }

		//domain=[mclevdom::MIODomain|VersionedQualifiedName]
		public Assignment getDomainAssignment_1() { return cDomainAssignment_1; }

		//[mclevdom::MIODomain|VersionedQualifiedName]
		public CrossReference getDomainMIODomainCrossReference_1_0() { return cDomainMIODomainCrossReference_1_0; }

		//VersionedQualifiedName
		public RuleCall getDomainMIODomainVersionedQualifiedNameParserRuleCall_1_0_1() { return cDomainMIODomainVersionedQualifiedNameParserRuleCall_1_0_1; }

		//"::"
		public Keyword getColonColonKeyword_2() { return cColonColonKeyword_2; }

		//type=[mclevdom::MExchangeModel|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//[mclevdom::MExchangeModel|VersionedQualifiedReferenceName]
		public CrossReference getTypeMExchangeModelCrossReference_3_0() { return cTypeMExchangeModelCrossReference_3_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_3_0_1() { return cTypeMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_3_0_1; }

		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//"version" ":=" version=Version ";" & "interfaces" ":=" interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ","
		//interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ";"
		public UnorderedGroup getUnorderedGroup_6() { return cUnorderedGroup_6; }

		//"version" ":=" version=Version ";"
		public Group getGroup_6_0() { return cGroup_6_0; }

		//"version"
		public Keyword getVersionKeyword_6_0_0() { return cVersionKeyword_6_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_6_0_1() { return cColonEqualsSignKeyword_6_0_1; }

		//version=Version
		public Assignment getVersionAssignment_6_0_2() { return cVersionAssignment_6_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_6_0_2_0() { return cVersionVersionParserRuleCall_6_0_2_0; }

		//";"
		public Keyword getSemicolonKeyword_6_0_3() { return cSemicolonKeyword_6_0_3; }

		//"interfaces" ":=" interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ","
		//interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ";"
		public Group getGroup_6_1() { return cGroup_6_1; }

		//"interfaces"
		public Keyword getInterfacesKeyword_6_1_0() { return cInterfacesKeyword_6_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_6_1_1() { return cColonEqualsSignKeyword_6_1_1; }

		//interfaces+=[mcleviface::MInterface|VersionedQualifiedName]
		public Assignment getInterfacesAssignment_6_1_2() { return cInterfacesAssignment_6_1_2; }

		//[mcleviface::MInterface|VersionedQualifiedName]
		public CrossReference getInterfacesMInterfaceCrossReference_6_1_2_0() { return cInterfacesMInterfaceCrossReference_6_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getInterfacesMInterfaceVersionedQualifiedNameParserRuleCall_6_1_2_0_1() { return cInterfacesMInterfaceVersionedQualifiedNameParserRuleCall_6_1_2_0_1; }

		//","
		public Keyword getCommaKeyword_6_1_3() { return cCommaKeyword_6_1_3; }

		//interfaces+=[mcleviface::MInterface|VersionedQualifiedName]
		public Assignment getInterfacesAssignment_6_1_4() { return cInterfacesAssignment_6_1_4; }

		//[mcleviface::MInterface|VersionedQualifiedName]
		public CrossReference getInterfacesMInterfaceCrossReference_6_1_4_0() { return cInterfacesMInterfaceCrossReference_6_1_4_0; }

		//VersionedQualifiedName
		public RuleCall getInterfacesMInterfaceVersionedQualifiedNameParserRuleCall_6_1_4_0_1() { return cInterfacesMInterfaceVersionedQualifiedNameParserRuleCall_6_1_4_0_1; }

		//";"
		public Keyword getSemicolonKeyword_6_1_5() { return cSemicolonKeyword_6_1_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//";"
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	
	
	private MMCLEVIMAPPackageFileElements pMMCLEVIMAPPackageFile;
	private MMCLEVIMAPPackageElementElements pMMCLEVIMAPPackageElement;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionedQualifiedNameElements pVersionedQualifiedName;
	private VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private MInterfaceMappingElements pMInterfaceMapping;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public IMAPGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mclev.lang.IMAP".equals(grammar.getName())) {
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

	
	//MMCLEVIMAPPackageFile:
	//	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
	//	imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ";")* element=MMCLEVIMAPPackageElement;
	public MMCLEVIMAPPackageFileElements getMMCLEVIMAPPackageFileAccess() {
		return (pMMCLEVIMAPPackageFile != null) ? pMMCLEVIMAPPackageFile : (pMMCLEVIMAPPackageFile = new MMCLEVIMAPPackageFileElements());
	}
	
	public ParserRule getMMCLEVIMAPPackageFileRule() {
		return getMMCLEVIMAPPackageFileAccess().getRule();
	}

	//MMCLEVIMAPPackageElement:
	//	MInterfaceMapping;
	public MMCLEVIMAPPackageElementElements getMMCLEVIMAPPackageElementAccess() {
		return (pMMCLEVIMAPPackageElement != null) ? pMMCLEVIMAPPackageElement : (pMMCLEVIMAPPackageElement = new MMCLEVIMAPPackageElementElements());
	}
	
	public ParserRule getMMCLEVIMAPPackageElementRule() {
		return getMMCLEVIMAPPackageElementAccess().getRule();
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

	//MInterfaceMapping:
	//	"mapping" domain=[mclevdom::MIODomain|VersionedQualifiedName] "::"
	//	type=[mclevdom::MExchangeModel|VersionedQualifiedReferenceName] name=ID "{" ("version" ":=" version=Version ";" &
	//	"interfaces" ":=" interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ","
	//	interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ";") "}" ";";
	public MInterfaceMappingElements getMInterfaceMappingAccess() {
		return (pMInterfaceMapping != null) ? pMInterfaceMapping : (pMInterfaceMapping = new MInterfaceMappingElements());
	}
	
	public ParserRule getMInterfaceMappingRule() {
		return getMInterfaceMappingAccess().getRule();
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
