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
package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class PROTGrammarAccess extends AbstractGrammarElementFinder {


	public class EDROOMPROTPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMPROTPackageFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPackageEDROOMPackageCrossReference_1_0 = (CrossReference)cPackageAssignment_1.eContents().get(0);
		private final RuleCall cPackageEDROOMPackageQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cPackageEDROOMPackageCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cImportKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cImportsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cImportsMCommonPackageCrossReference_3_1_0 = (CrossReference)cImportsAssignment_3_1.eContents().get(0);
		private final RuleCall cImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cImportsMCommonPackageCrossReference_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cElementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementEDROOMPROTPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);

		//EDROOMPROTPackageFile:
		//	"package" package=[edroomlibrary::EDROOMPackage|QualifiedName] ";" ("import"
		//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=EDROOMPROTPackageElement;
		public ParserRule getRule() { return rule; }

		//"package" package=[edroomlibrary::EDROOMPackage|QualifiedName] ";" ("import"
		//imports+=[common::MCommonPackage|QualifiedName] ";")* element=EDROOMPROTPackageElement
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//package=[edroomlibrary::EDROOMPackage|QualifiedName]
		public Assignment getPackageAssignment_1() { return cPackageAssignment_1; }

		//[edroomlibrary::EDROOMPackage|QualifiedName]
		public CrossReference getPackageEDROOMPackageCrossReference_1_0() { return cPackageEDROOMPackageCrossReference_1_0; }

		//QualifiedName
		public RuleCall getPackageEDROOMPackageQualifiedNameParserRuleCall_1_0_1() { return cPackageEDROOMPackageQualifiedNameParserRuleCall_1_0_1; }

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

		//element=EDROOMPROTPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//EDROOMPROTPackageElement
		public RuleCall getElementEDROOMPROTPackageElementParserRuleCall_4_0() { return cElementEDROOMPROTPackageElementParserRuleCall_4_0; }
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

	public class EDROOMPROTPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMPROTPackageElement");
		private final RuleCall cEDROOMProtocolParserRuleCall = (RuleCall)rule.eContents().get(1);

		//EDROOMPROTPackageElement:
		//	EDROOMProtocol;
		public ParserRule getRule() { return rule; }

		//EDROOMProtocol
		public RuleCall getEDROOMProtocolParserRuleCall() { return cEDROOMProtocolParserRuleCall; }
	}

	public class EDROOMProtocolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMProtocol");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMProtocolAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cProtocolKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cExtendsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cExtendsEDROOMProtocolCrossReference_3_1_0 = (CrossReference)cExtendsAssignment_3_1.eContents().get(0);
		private final RuleCall cExtendsEDROOMProtocolVersionedQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cExtendsEDROOMProtocolCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cExtendsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cExtendsEDROOMProtocolCrossReference_3_2_1_0 = (CrossReference)cExtendsAssignment_3_2_1.eContents().get(0);
		private final RuleCall cExtendsEDROOMProtocolVersionedQualifiedNameParserRuleCall_3_2_1_0_1 = (RuleCall)cExtendsEDROOMProtocolCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cVersionKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cVersionAssignment_5_0_2 = (Assignment)cGroup_5_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_5_0_2_0 = (RuleCall)cVersionAssignment_5_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_5_0_3 = (Keyword)cGroup_5_0.eContents().get(3);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cInterfaceKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Assignment cReferencedElementAssignment_5_1_2 = (Assignment)cGroup_5_1.eContents().get(2);
		private final CrossReference cReferencedElementMInterfaceCrossReference_5_1_2_0 = (CrossReference)cReferencedElementAssignment_5_1_2.eContents().get(0);
		private final RuleCall cReferencedElementMInterfaceVersionedQualifiedNameParserRuleCall_5_1_2_0_1 = (RuleCall)cReferencedElementMInterfaceCrossReference_5_1_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_1_3 = (Keyword)cGroup_5_1.eContents().get(3);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cInputKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Keyword cMessagesKeyword_5_2_1 = (Keyword)cGroup_5_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_2_2 = (Keyword)cGroup_5_2.eContents().get(2);
		private final Assignment cInputMessagesAssignment_5_2_3 = (Assignment)cGroup_5_2.eContents().get(3);
		private final RuleCall cInputMessagesEDROOMMessageParserRuleCall_5_2_3_0 = (RuleCall)cInputMessagesAssignment_5_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_2_4 = (Keyword)cGroup_5_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_2_5 = (Keyword)cGroup_5_2.eContents().get(5);
		private final Group cGroup_5_3 = (Group)cUnorderedGroup_5.eContents().get(3);
		private final Keyword cOutputKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Keyword cMessagesKeyword_5_3_1 = (Keyword)cGroup_5_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_3_2 = (Keyword)cGroup_5_3.eContents().get(2);
		private final Assignment cOutputMessagesAssignment_5_3_3 = (Assignment)cGroup_5_3.eContents().get(3);
		private final RuleCall cOutputMessagesEDROOMMessageParserRuleCall_5_3_3_0 = (RuleCall)cOutputMessagesAssignment_5_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3_4 = (Keyword)cGroup_5_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_3_5 = (Keyword)cGroup_5_3.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);

		//EDROOMProtocol:
		//	{EDROOMProtocol} "protocol" name=ID ("extends" extends+=[EDROOMProtocol|VersionedQualifiedName] (","
		//	extends+=[EDROOMProtocol|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "interface" ":="
		//	referencedElement=[mcleviface::MInterface|VersionedQualifiedName] ";" & ("input" "messages" "{"
		//	inputMessages+=EDROOMMessage+ "}" ";")? & ("output" "messages" "{" outputMessages+=EDROOMMessage+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMProtocol} "protocol" name=ID ("extends" extends+=[EDROOMProtocol|VersionedQualifiedName] (","
		//extends+=[EDROOMProtocol|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "interface" ":="
		//referencedElement=[mcleviface::MInterface|VersionedQualifiedName] ";" & ("input" "messages" "{"
		//inputMessages+=EDROOMMessage+ "}" ";")? & ("output" "messages" "{" outputMessages+=EDROOMMessage+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMProtocol}
		public Action getEDROOMProtocolAction_0() { return cEDROOMProtocolAction_0; }

		//"protocol"
		public Keyword getProtocolKeyword_1() { return cProtocolKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//("extends" extends+=[EDROOMProtocol|VersionedQualifiedName] ("," extends+=[EDROOMProtocol|VersionedQualifiedName])*)?
		public Group getGroup_3() { return cGroup_3; }

		//"extends"
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }

		//extends+=[EDROOMProtocol|VersionedQualifiedName]
		public Assignment getExtendsAssignment_3_1() { return cExtendsAssignment_3_1; }

		//[EDROOMProtocol|VersionedQualifiedName]
		public CrossReference getExtendsEDROOMProtocolCrossReference_3_1_0() { return cExtendsEDROOMProtocolCrossReference_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsEDROOMProtocolVersionedQualifiedNameParserRuleCall_3_1_0_1() { return cExtendsEDROOMProtocolVersionedQualifiedNameParserRuleCall_3_1_0_1; }

		//("," extends+=[EDROOMProtocol|VersionedQualifiedName])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//extends+=[EDROOMProtocol|VersionedQualifiedName]
		public Assignment getExtendsAssignment_3_2_1() { return cExtendsAssignment_3_2_1; }

		//[EDROOMProtocol|VersionedQualifiedName]
		public CrossReference getExtendsEDROOMProtocolCrossReference_3_2_1_0() { return cExtendsEDROOMProtocolCrossReference_3_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsEDROOMProtocolVersionedQualifiedNameParserRuleCall_3_2_1_0_1() { return cExtendsEDROOMProtocolVersionedQualifiedNameParserRuleCall_3_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//"version" ":=" version=Version ";" & "interface" ":=" referencedElement=[mcleviface::MInterface|VersionedQualifiedName]
		//";" & ("input" "messages" "{" inputMessages+=EDROOMMessage+ "}" ";")? & ("output" "messages" "{"
		//outputMessages+=EDROOMMessage+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }

		//"version" ":=" version=Version ";"
		public Group getGroup_5_0() { return cGroup_5_0; }

		//"version"
		public Keyword getVersionKeyword_5_0_0() { return cVersionKeyword_5_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_0_1() { return cColonEqualsSignKeyword_5_0_1; }

		//version=Version
		public Assignment getVersionAssignment_5_0_2() { return cVersionAssignment_5_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_5_0_2_0() { return cVersionVersionParserRuleCall_5_0_2_0; }

		//";"
		public Keyword getSemicolonKeyword_5_0_3() { return cSemicolonKeyword_5_0_3; }

		//"interface" ":=" referencedElement=[mcleviface::MInterface|VersionedQualifiedName] ";"
		public Group getGroup_5_1() { return cGroup_5_1; }

		//"interface"
		public Keyword getInterfaceKeyword_5_1_0() { return cInterfaceKeyword_5_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_1_1() { return cColonEqualsSignKeyword_5_1_1; }

		//referencedElement=[mcleviface::MInterface|VersionedQualifiedName]
		public Assignment getReferencedElementAssignment_5_1_2() { return cReferencedElementAssignment_5_1_2; }

		//[mcleviface::MInterface|VersionedQualifiedName]
		public CrossReference getReferencedElementMInterfaceCrossReference_5_1_2_0() { return cReferencedElementMInterfaceCrossReference_5_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getReferencedElementMInterfaceVersionedQualifiedNameParserRuleCall_5_1_2_0_1() { return cReferencedElementMInterfaceVersionedQualifiedNameParserRuleCall_5_1_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_1_3() { return cSemicolonKeyword_5_1_3; }

		//("input" "messages" "{" inputMessages+=EDROOMMessage+ "}" ";")?
		public Group getGroup_5_2() { return cGroup_5_2; }

		//"input"
		public Keyword getInputKeyword_5_2_0() { return cInputKeyword_5_2_0; }

		//"messages"
		public Keyword getMessagesKeyword_5_2_1() { return cMessagesKeyword_5_2_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_2_2() { return cLeftCurlyBracketKeyword_5_2_2; }

		//inputMessages+=EDROOMMessage+
		public Assignment getInputMessagesAssignment_5_2_3() { return cInputMessagesAssignment_5_2_3; }

		//EDROOMMessage
		public RuleCall getInputMessagesEDROOMMessageParserRuleCall_5_2_3_0() { return cInputMessagesEDROOMMessageParserRuleCall_5_2_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_2_4() { return cRightCurlyBracketKeyword_5_2_4; }

		//";"
		public Keyword getSemicolonKeyword_5_2_5() { return cSemicolonKeyword_5_2_5; }

		//("output" "messages" "{" outputMessages+=EDROOMMessage+ "}" ";")?
		public Group getGroup_5_3() { return cGroup_5_3; }

		//"output"
		public Keyword getOutputKeyword_5_3_0() { return cOutputKeyword_5_3_0; }

		//"messages"
		public Keyword getMessagesKeyword_5_3_1() { return cMessagesKeyword_5_3_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_3_2() { return cLeftCurlyBracketKeyword_5_3_2; }

		//outputMessages+=EDROOMMessage+
		public Assignment getOutputMessagesAssignment_5_3_3() { return cOutputMessagesAssignment_5_3_3; }

		//EDROOMMessage
		public RuleCall getOutputMessagesEDROOMMessageParserRuleCall_5_3_3_0() { return cOutputMessagesEDROOMMessageParserRuleCall_5_3_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_3_4() { return cRightCurlyBracketKeyword_5_3_4; }

		//";"
		public Keyword getSemicolonKeyword_5_3_5() { return cSemicolonKeyword_5_3_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class EDROOMMessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMMessage");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEDROOMSendMessageParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEDROOMInvokeMessageParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEDROOMReplyMessageParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);

		//EDROOMMessage:
		//	EDROOMSendMessage | EDROOMInvokeMessage | EDROOMReplyMessage;
		public ParserRule getRule() { return rule; }

		//EDROOMSendMessage | EDROOMInvokeMessage | EDROOMReplyMessage
		public Alternatives getAlternatives() { return cAlternatives; }

		//EDROOMSendMessage
		public RuleCall getEDROOMSendMessageParserRuleCall_0() { return cEDROOMSendMessageParserRuleCall_0; }

		//EDROOMInvokeMessage
		public RuleCall getEDROOMInvokeMessageParserRuleCall_1() { return cEDROOMInvokeMessageParserRuleCall_1; }

		//EDROOMReplyMessage
		public RuleCall getEDROOMReplyMessageParserRuleCall_2() { return cEDROOMReplyMessageParserRuleCall_2; }
	}

	public class EDROOMSendMessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMSendMessage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMSendMessageAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSendKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDataClassAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDataClassEDROOMDataClassCrossReference_4_0 = (CrossReference)cDataClassAssignment_4.eContents().get(0);
		private final RuleCall cDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1 = (RuleCall)cDataClassEDROOMDataClassCrossReference_4_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);

		//EDROOMSendMessage:
		//	{EDROOMSendMessage} "send" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMSendMessage} "send" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMSendMessage}
		public Action getEDROOMSendMessageAction_0() { return cEDROOMSendMessageAction_0; }

		//"send"
		public Keyword getSendKeyword_1() { return cSendKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }

		//dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]?
		public Assignment getDataClassAssignment_4() { return cDataClassAssignment_4; }

		//[edroomdclass::EDROOMDataClass|VersionedQualifiedName]
		public CrossReference getDataClassEDROOMDataClassCrossReference_4_0() { return cDataClassEDROOMDataClassCrossReference_4_0; }

		//VersionedQualifiedName
		public RuleCall getDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1() { return cDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class EDROOMInvokeMessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMInvokeMessage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMInvokeMessageAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInvokeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDataClassAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDataClassEDROOMDataClassCrossReference_4_0 = (CrossReference)cDataClassAssignment_4.eContents().get(0);
		private final RuleCall cDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1 = (RuleCall)cDataClassEDROOMDataClassCrossReference_4_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRepliesKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cRepliesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cRepliesEDROOMReplyMessageCrossReference_7_0 = (CrossReference)cRepliesAssignment_7.eContents().get(0);
		private final RuleCall cRepliesEDROOMReplyMessageVersionedQualifiedReferenceNameParserRuleCall_7_0_1 = (RuleCall)cRepliesEDROOMReplyMessageCrossReference_7_0.eContents().get(1);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cCommaKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cRepliesAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final CrossReference cRepliesEDROOMReplyMessageCrossReference_8_1_0 = (CrossReference)cRepliesAssignment_8_1.eContents().get(0);
		private final RuleCall cRepliesEDROOMReplyMessageVersionedQualifiedReferenceNameParserRuleCall_8_1_0_1 = (RuleCall)cRepliesEDROOMReplyMessageCrossReference_8_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);

		//EDROOMInvokeMessage:
		//	{EDROOMInvokeMessage} "invoke" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")"
		//	"replies" replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName] (","
		//	replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName])* ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMInvokeMessage} "invoke" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")"
		//"replies" replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName] (","
		//replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName])* ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMInvokeMessage}
		public Action getEDROOMInvokeMessageAction_0() { return cEDROOMInvokeMessageAction_0; }

		//"invoke"
		public Keyword getInvokeKeyword_1() { return cInvokeKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }

		//dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]?
		public Assignment getDataClassAssignment_4() { return cDataClassAssignment_4; }

		//[edroomdclass::EDROOMDataClass|VersionedQualifiedName]
		public CrossReference getDataClassEDROOMDataClassCrossReference_4_0() { return cDataClassEDROOMDataClassCrossReference_4_0; }

		//VersionedQualifiedName
		public RuleCall getDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1() { return cDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }

		//"replies"
		public Keyword getRepliesKeyword_6() { return cRepliesKeyword_6; }

		//replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName]
		public Assignment getRepliesAssignment_7() { return cRepliesAssignment_7; }

		//[EDROOMReplyMessage|VersionedQualifiedReferenceName]
		public CrossReference getRepliesEDROOMReplyMessageCrossReference_7_0() { return cRepliesEDROOMReplyMessageCrossReference_7_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getRepliesEDROOMReplyMessageVersionedQualifiedReferenceNameParserRuleCall_7_0_1() { return cRepliesEDROOMReplyMessageVersionedQualifiedReferenceNameParserRuleCall_7_0_1; }

		//("," replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName])*
		public Group getGroup_8() { return cGroup_8; }

		//","
		public Keyword getCommaKeyword_8_0() { return cCommaKeyword_8_0; }

		//replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName]
		public Assignment getRepliesAssignment_8_1() { return cRepliesAssignment_8_1; }

		//[EDROOMReplyMessage|VersionedQualifiedReferenceName]
		public CrossReference getRepliesEDROOMReplyMessageCrossReference_8_1_0() { return cRepliesEDROOMReplyMessageCrossReference_8_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getRepliesEDROOMReplyMessageVersionedQualifiedReferenceNameParserRuleCall_8_1_0_1() { return cRepliesEDROOMReplyMessageVersionedQualifiedReferenceNameParserRuleCall_8_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
	}

	public class EDROOMReplyMessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMReplyMessage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMReplyMessageAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReplyKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDataClassAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDataClassEDROOMDataClassCrossReference_4_0 = (CrossReference)cDataClassAssignment_4.eContents().get(0);
		private final RuleCall cDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1 = (RuleCall)cDataClassEDROOMDataClassCrossReference_4_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);

		//EDROOMReplyMessage:
		//	{EDROOMReplyMessage} "reply" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMReplyMessage} "reply" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMReplyMessage}
		public Action getEDROOMReplyMessageAction_0() { return cEDROOMReplyMessageAction_0; }

		//"reply"
		public Keyword getReplyKeyword_1() { return cReplyKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }

		//dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]?
		public Assignment getDataClassAssignment_4() { return cDataClassAssignment_4; }

		//[edroomdclass::EDROOMDataClass|VersionedQualifiedName]
		public CrossReference getDataClassEDROOMDataClassCrossReference_4_0() { return cDataClassEDROOMDataClassCrossReference_4_0; }

		//VersionedQualifiedName
		public RuleCall getDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1() { return cDataClassEDROOMDataClassVersionedQualifiedNameParserRuleCall_4_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}


	private EDROOMPROTPackageFileElements pEDROOMPROTPackageFile;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionedQualifiedNameElements pVersionedQualifiedName;
	private VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private EDROOMPROTPackageElementElements pEDROOMPROTPackageElement;
	private EDROOMProtocolElements pEDROOMProtocol;
	private EDROOMMessageElements pEDROOMMessage;
	private EDROOMSendMessageElements pEDROOMSendMessage;
	private EDROOMInvokeMessageElements pEDROOMInvokeMessage;
	private EDROOMReplyMessageElements pEDROOMReplyMessage;

	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public PROTGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}

	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mclev.domain.edroom.lang.PROT".equals(grammar.getName())) {
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


	//EDROOMPROTPackageFile:
	//	"package" package=[edroomlibrary::EDROOMPackage|QualifiedName] ";" ("import"
	//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=EDROOMPROTPackageElement;
	public EDROOMPROTPackageFileElements getEDROOMPROTPackageFileAccess() {
		return (pEDROOMPROTPackageFile != null) ? pEDROOMPROTPackageFile : (pEDROOMPROTPackageFile = new EDROOMPROTPackageFileElements());
	}

	public ParserRule getEDROOMPROTPackageFileRule() {
		return getEDROOMPROTPackageFileAccess().getRule();
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

	//EDROOMPROTPackageElement:
	//	EDROOMProtocol;
	public EDROOMPROTPackageElementElements getEDROOMPROTPackageElementAccess() {
		return (pEDROOMPROTPackageElement != null) ? pEDROOMPROTPackageElement : (pEDROOMPROTPackageElement = new EDROOMPROTPackageElementElements());
	}

	public ParserRule getEDROOMPROTPackageElementRule() {
		return getEDROOMPROTPackageElementAccess().getRule();
	}

	//EDROOMProtocol:
	//	{EDROOMProtocol} "protocol" name=ID ("extends" extends+=[EDROOMProtocol|VersionedQualifiedName] (","
	//	extends+=[EDROOMProtocol|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "interface" ":="
	//	referencedElement=[mcleviface::MInterface|VersionedQualifiedName] ";" & ("input" "messages" "{"
	//	inputMessages+=EDROOMMessage+ "}" ";")? & ("output" "messages" "{" outputMessages+=EDROOMMessage+ "}" ";")?) "}" ";";
	public EDROOMProtocolElements getEDROOMProtocolAccess() {
		return (pEDROOMProtocol != null) ? pEDROOMProtocol : (pEDROOMProtocol = new EDROOMProtocolElements());
	}

	public ParserRule getEDROOMProtocolRule() {
		return getEDROOMProtocolAccess().getRule();
	}

	//EDROOMMessage:
	//	EDROOMSendMessage | EDROOMInvokeMessage | EDROOMReplyMessage;
	public EDROOMMessageElements getEDROOMMessageAccess() {
		return (pEDROOMMessage != null) ? pEDROOMMessage : (pEDROOMMessage = new EDROOMMessageElements());
	}

	public ParserRule getEDROOMMessageRule() {
		return getEDROOMMessageAccess().getRule();
	}

	//EDROOMSendMessage:
	//	{EDROOMSendMessage} "send" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")" ";";
	public EDROOMSendMessageElements getEDROOMSendMessageAccess() {
		return (pEDROOMSendMessage != null) ? pEDROOMSendMessage : (pEDROOMSendMessage = new EDROOMSendMessageElements());
	}

	public ParserRule getEDROOMSendMessageRule() {
		return getEDROOMSendMessageAccess().getRule();
	}

	//EDROOMInvokeMessage:
	//	{EDROOMInvokeMessage} "invoke" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")"
	//	"replies" replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName] (","
	//	replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName])* ";";
	public EDROOMInvokeMessageElements getEDROOMInvokeMessageAccess() {
		return (pEDROOMInvokeMessage != null) ? pEDROOMInvokeMessage : (pEDROOMInvokeMessage = new EDROOMInvokeMessageElements());
	}

	public ParserRule getEDROOMInvokeMessageRule() {
		return getEDROOMInvokeMessageAccess().getRule();
	}

	//EDROOMReplyMessage:
	//	{EDROOMReplyMessage} "reply" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")" ";";
	public EDROOMReplyMessageElements getEDROOMReplyMessageAccess() {
		return (pEDROOMReplyMessage != null) ? pEDROOMReplyMessage : (pEDROOMReplyMessage = new EDROOMReplyMessageElements());
	}

	public ParserRule getEDROOMReplyMessageRule() {
		return getEDROOMReplyMessageAccess().getRule();
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
