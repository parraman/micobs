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
public class DOMGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMCLEVDOMPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MMCLEVDOMPackageFile");
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
		private final RuleCall cElementMMCLEVDOMPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMCLEVDOMPackageFile:
		//	'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
		//	imports+=[common::MCommonPackage|QualifiedName] ';')*
		//	element=MMCLEVDOMPackageElement;
		@Override public ParserRule getRule() { return rule; }

		//'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
		//imports+=[common::MCommonPackage|QualifiedName] ';')* element=MMCLEVDOMPackageElement
		public Group getGroup() { return cGroup; }

		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//package=[mclevlibrary::MMCLEVPackage|QualifiedName]
		public Assignment getPackageAssignment_1() { return cPackageAssignment_1; }

		//[mclevlibrary::MMCLEVPackage|QualifiedName]
		public CrossReference getPackageMMCLEVPackageCrossReference_1_0() { return cPackageMMCLEVPackageCrossReference_1_0; }

		//QualifiedName
		public RuleCall getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1() { return cPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1; }

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

		//element=MMCLEVDOMPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMCLEVDOMPackageElement
		public RuleCall getElementMMCLEVDOMPackageElementParserRuleCall_4_0() { return cElementMMCLEVDOMPackageElementParserRuleCall_4_0; }
	}

	public class MMCLEVDOMPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MMCLEVDOMPackageElement");
		private final RuleCall cMDomainParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MMCLEVDOMPackageElement:
		//	MDomain;
		@Override public ParserRule getRule() { return rule; }

		//MDomain
		public RuleCall getMDomainParserRuleCall() { return cMDomainParserRuleCall; }
	}

	public class MDomainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MDomain");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMIODomainParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMAODomainParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MDomain:
		//	MIODomain | MAODomain;
		@Override public ParserRule getRule() { return rule; }

		//MIODomain | MAODomain
		public Alternatives getAlternatives() { return cAlternatives; }

		//MIODomain
		public RuleCall getMIODomainParserRuleCall_0() { return cMIODomainParserRuleCall_0; }

		//MAODomain
		public RuleCall getMAODomainParserRuleCall_1() { return cMAODomainParserRuleCall_1; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.VersionedQualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.VersionedQualifiedReferenceName");
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

	public class MIODomainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MIODomain");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIodomainKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cInheritsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cInheritsMIODomainCrossReference_2_1_0 = (CrossReference)cInheritsAssignment_2_1.eContents().get(0);
		private final RuleCall cInheritsMIODomainVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cInheritsMIODomainCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cInheritsMIODomainCrossReference_2_2_1_0 = (CrossReference)cInheritsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cInheritsMIODomainVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cInheritsMIODomainCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cVersionKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Assignment cVersionAssignment_4_0_2 = (Assignment)cGroup_4_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_4_0_2_0 = (RuleCall)cVersionAssignment_4_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cLanguagesKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Assignment cLanguagesAssignment_4_1_2 = (Assignment)cGroup_4_1.eContents().get(2);
		private final CrossReference cLanguagesMLanguageCrossReference_4_1_2_0 = (CrossReference)cLanguagesAssignment_4_1_2.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_4_1_2_0.eContents().get(1);
		private final Group cGroup_4_1_3 = (Group)cGroup_4_1.eContents().get(3);
		private final Keyword cCommaKeyword_4_1_3_0 = (Keyword)cGroup_4_1_3.eContents().get(0);
		private final Assignment cLanguagesAssignment_4_1_3_1 = (Assignment)cGroup_4_1_3.eContents().get(1);
		private final CrossReference cLanguagesMLanguageCrossReference_4_1_3_1_0 = (CrossReference)cLanguagesAssignment_4_1_3_1.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_3_1_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_4_1_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_1_4 = (Keyword)cGroup_4_1.eContents().get(4);
		private final Group cGroup_4_2 = (Group)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cSingletonKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cInstancesKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_4_2_2 = (Keyword)cGroup_4_2.eContents().get(2);
		private final Assignment cAllowsSingletonAssignment_4_2_3 = (Assignment)cGroup_4_2.eContents().get(3);
		private final RuleCall cAllowsSingletonEBooleanParserRuleCall_4_2_3_0 = (RuleCall)cAllowsSingletonAssignment_4_2_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_2_4 = (Keyword)cGroup_4_2.eContents().get(4);
		private final Group cGroup_4_3 = (Group)cUnorderedGroup_4.eContents().get(3);
		private final Keyword cAttributesKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_3_1 = (Keyword)cGroup_4_3.eContents().get(1);
		private final Assignment cAttributesAssignment_4_3_2 = (Assignment)cGroup_4_3.eContents().get(2);
		private final RuleCall cAttributesMParameterParserRuleCall_4_3_2_0 = (RuleCall)cAttributesAssignment_4_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_3_3 = (Keyword)cGroup_4_3.eContents().get(3);
		private final Keyword cSemicolonKeyword_4_3_4 = (Keyword)cGroup_4_3.eContents().get(4);
		private final Group cGroup_4_4 = (Group)cUnorderedGroup_4.eContents().get(4);
		private final Keyword cInterfaceKeyword_4_4_0 = (Keyword)cGroup_4_4.eContents().get(0);
		private final Keyword cTypesKeyword_4_4_1 = (Keyword)cGroup_4_4.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_4_2 = (Keyword)cGroup_4_4.eContents().get(2);
		private final Assignment cInterfaceTypesAssignment_4_4_3 = (Assignment)cGroup_4_4.eContents().get(3);
		private final RuleCall cInterfaceTypesMInterfaceTypeParserRuleCall_4_4_3_0 = (RuleCall)cInterfaceTypesAssignment_4_4_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4_4 = (Keyword)cGroup_4_4.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_4_5 = (Keyword)cGroup_4_4.eContents().get(5);
		private final Group cGroup_4_5 = (Group)cUnorderedGroup_4.eContents().get(5);
		private final Keyword cPortKeyword_4_5_0 = (Keyword)cGroup_4_5.eContents().get(0);
		private final Keyword cTypesKeyword_4_5_1 = (Keyword)cGroup_4_5.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_5_2 = (Keyword)cGroup_4_5.eContents().get(2);
		private final Assignment cPortTypesAssignment_4_5_3 = (Assignment)cGroup_4_5.eContents().get(3);
		private final RuleCall cPortTypesMPortTypeParserRuleCall_4_5_3_0 = (RuleCall)cPortTypesAssignment_4_5_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_5_4 = (Keyword)cGroup_4_5.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_5_5 = (Keyword)cGroup_4_5.eContents().get(5);
		private final Group cGroup_4_6 = (Group)cUnorderedGroup_4.eContents().get(6);
		private final Keyword cConnectorsKeyword_4_6_0 = (Keyword)cGroup_4_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_6_1 = (Keyword)cGroup_4_6.eContents().get(1);
		private final Assignment cConnectorsAssignment_4_6_2 = (Assignment)cGroup_4_6.eContents().get(2);
		private final RuleCall cConnectorsMConnectorParserRuleCall_4_6_2_0 = (RuleCall)cConnectorsAssignment_4_6_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_6_3 = (Keyword)cGroup_4_6.eContents().get(3);
		private final Keyword cSemicolonKeyword_4_6_4 = (Keyword)cGroup_4_6.eContents().get(4);
		private final Group cGroup_4_7 = (Group)cUnorderedGroup_4.eContents().get(7);
		private final Keyword cExchangeKeyword_4_7_0 = (Keyword)cGroup_4_7.eContents().get(0);
		private final Keyword cModelsKeyword_4_7_1 = (Keyword)cGroup_4_7.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_7_2 = (Keyword)cGroup_4_7.eContents().get(2);
		private final Assignment cExchangeModelsAssignment_4_7_3 = (Assignment)cGroup_4_7.eContents().get(3);
		private final RuleCall cExchangeModelsMExchangeModelParserRuleCall_4_7_3_0 = (RuleCall)cExchangeModelsAssignment_4_7_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_7_4 = (Keyword)cGroup_4_7.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_7_5 = (Keyword)cGroup_4_7.eContents().get(5);
		private final Group cGroup_4_8 = (Group)cUnorderedGroup_4.eContents().get(8);
		private final Keyword cComponentKeyword_4_8_0 = (Keyword)cGroup_4_8.eContents().get(0);
		private final Keyword cTypesKeyword_4_8_1 = (Keyword)cGroup_4_8.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_8_2 = (Keyword)cGroup_4_8.eContents().get(2);
		private final Assignment cComponentTypesAssignment_4_8_3 = (Assignment)cGroup_4_8.eContents().get(3);
		private final RuleCall cComponentTypesMIODCTypeParserRuleCall_4_8_3_0 = (RuleCall)cComponentTypesAssignment_4_8_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_8_4 = (Keyword)cGroup_4_8.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_8_5 = (Keyword)cGroup_4_8.eContents().get(5);
		private final Group cGroup_4_9 = (Group)cUnorderedGroup_4.eContents().get(9);
		private final Keyword cInternalKeyword_4_9_0 = (Keyword)cGroup_4_9.eContents().get(0);
		private final Keyword cInstancesKeyword_4_9_1 = (Keyword)cGroup_4_9.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_9_2 = (Keyword)cGroup_4_9.eContents().get(2);
		private final Assignment cComponentTypeInstancesAssignment_4_9_3 = (Assignment)cGroup_4_9.eContents().get(3);
		private final RuleCall cComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_4_9_3_0 = (RuleCall)cComponentTypeInstancesAssignment_4_9_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_9_4 = (Keyword)cGroup_4_9.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_9_5 = (Keyword)cGroup_4_9.eContents().get(5);
		private final Group cGroup_4_10 = (Group)cUnorderedGroup_4.eContents().get(10);
		private final Keyword cRequiresKeyword_4_10_0 = (Keyword)cGroup_4_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_10_1 = (Keyword)cGroup_4_10.eContents().get(1);
		private final Assignment cRequiresAssignment_4_10_2 = (Assignment)cGroup_4_10.eContents().get(2);
		private final CrossReference cRequiresMSAICrossReference_4_10_2_0 = (CrossReference)cRequiresAssignment_4_10_2.eContents().get(0);
		private final RuleCall cRequiresMSAIVersionedQualifiedNameParserRuleCall_4_10_2_0_1 = (RuleCall)cRequiresMSAICrossReference_4_10_2_0.eContents().get(1);
		private final Group cGroup_4_10_3 = (Group)cGroup_4_10.eContents().get(3);
		private final Keyword cCommaKeyword_4_10_3_0 = (Keyword)cGroup_4_10_3.eContents().get(0);
		private final Assignment cRequiresAssignment_4_10_3_1 = (Assignment)cGroup_4_10_3.eContents().get(1);
		private final CrossReference cRequiresMSAICrossReference_4_10_3_1_0 = (CrossReference)cRequiresAssignment_4_10_3_1.eContents().get(0);
		private final RuleCall cRequiresMSAIVersionedQualifiedNameParserRuleCall_4_10_3_1_0_1 = (RuleCall)cRequiresMSAICrossReference_4_10_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_10_4 = (Keyword)cGroup_4_10.eContents().get(4);
		private final Group cGroup_4_11 = (Group)cUnorderedGroup_4.eContents().get(11);
		private final Keyword cSupportedKeyword_4_11_0 = (Keyword)cGroup_4_11.eContents().get(0);
		private final Keyword cPlatformsKeyword_4_11_1 = (Keyword)cGroup_4_11.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_11_2 = (Keyword)cGroup_4_11.eContents().get(2);
		private final Assignment cSupportedPlatformsAssignment_4_11_3 = (Assignment)cGroup_4_11.eContents().get(3);
		private final RuleCall cSupportedPlatformsMIODomainSupportedPlatformParserRuleCall_4_11_3_0 = (RuleCall)cSupportedPlatformsAssignment_4_11_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_11_4 = (Keyword)cGroup_4_11.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_11_5 = (Keyword)cGroup_4_11.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MIODomain:
		//	'iodomain'
		//	name=ID ('inherits' inherits+=[MIODomain|VersionedQualifiedName] ("," inherits+=[MIODomain|VersionedQualifiedName])*)?
		//	'{' ('version' ':=' version=Version ';' & ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//	languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
		//	& ('singleton' 'instances' ':=' allowsSingleton=EBoolean ';')?
		//	& ('attributes'
		//	'{'
		//	attributes+=MParameter+
		//	'}' ';')?
		//	& ('interface' 'types'
		//	'{'
		//	interfaceTypes+=MInterfaceType+
		//	'}' ';')?
		//	& ('port' 'types'
		//	'{'
		//	portTypes+=MPortType+
		//	'}' ';')?
		//	& ('connectors'
		//	'{'
		//	connectors+=MConnector+
		//	'}' ';')?
		//	& ('exchange' 'models'
		//	'{'
		//	exchangeModels+=MExchangeModel+
		//	'}' ';')?
		//	& ('component' 'types'
		//	'{'
		//	componentTypes+=MIODCType+
		//	'}' ';')?
		//	& ('internal' 'instances'
		//	'{'
		//	componentTypeInstances+=MIODComponentTypeInstance+
		//	'}' ';')?
		//	& ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
		//	requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
		//	& ('supported' 'platforms'
		//	'{'
		//	supportedPlatforms+=MIODomainSupportedPlatform+
		//	'}' ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'iodomain' name=ID ('inherits' inherits+=[MIODomain|VersionedQualifiedName] (","
		//inherits+=[MIODomain|VersionedQualifiedName])*)? '{' ('version' ':=' version=Version ';' & ('languages' ':='
		//languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//';')? & ('singleton' 'instances' ':=' allowsSingleton=EBoolean ';')? & ('attributes' '{' attributes+=MParameter+ '}'
		//';')? & ('interface' 'types' '{' interfaceTypes+=MInterfaceType+ '}' ';')? & ('port' 'types' '{' portTypes+=MPortType+
		//'}' ';')? & ('connectors' '{' connectors+=MConnector+ '}' ';')? & ('exchange' 'models' '{'
		//exchangeModels+=MExchangeModel+ '}' ';')? & ('component' 'types' '{' componentTypes+=MIODCType+ '}' ';')? & ('internal'
		//'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')? & ('requires' ':='
		//requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')? &
		//('supported' 'platforms' '{' supportedPlatforms+=MIODomainSupportedPlatform+ '}' ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//'iodomain'
		public Keyword getIodomainKeyword_0() { return cIodomainKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//('inherits' inherits+=[MIODomain|VersionedQualifiedName] ("," inherits+=[MIODomain|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//'inherits'
		public Keyword getInheritsKeyword_2_0() { return cInheritsKeyword_2_0; }

		//inherits+=[MIODomain|VersionedQualifiedName]
		public Assignment getInheritsAssignment_2_1() { return cInheritsAssignment_2_1; }

		//[MIODomain|VersionedQualifiedName]
		public CrossReference getInheritsMIODomainCrossReference_2_1_0() { return cInheritsMIODomainCrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMIODomainVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cInheritsMIODomainVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," inherits+=[MIODomain|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//inherits+=[MIODomain|VersionedQualifiedName]
		public Assignment getInheritsAssignment_2_2_1() { return cInheritsAssignment_2_2_1; }

		//[MIODomain|VersionedQualifiedName]
		public CrossReference getInheritsMIODomainCrossReference_2_2_1_0() { return cInheritsMIODomainCrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMIODomainVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cInheritsMIODomainVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('version' ':=' version=Version ';' & ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ';')? & ('singleton' 'instances' ':=' allowsSingleton=EBoolean
		//';')? & ('attributes' '{' attributes+=MParameter+ '}' ';')? & ('interface' 'types' '{' interfaceTypes+=MInterfaceType+
		//'}' ';')? & ('port' 'types' '{' portTypes+=MPortType+ '}' ';')? & ('connectors' '{' connectors+=MConnector+ '}' ';')? &
		//('exchange' 'models' '{' exchangeModels+=MExchangeModel+ '}' ';')? & ('component' 'types' '{'
		//componentTypes+=MIODCType+ '}' ';')? & ('internal' 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+
		//'}' ';')? & ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
		//requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')? & ('supported' 'platforms' '{'
		//supportedPlatforms+=MIODomainSupportedPlatform+ '}' ';')?)
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//'version' ':=' version=Version ';'
		public Group getGroup_4_0() { return cGroup_4_0; }

		//'version'
		public Keyword getVersionKeyword_4_0_0() { return cVersionKeyword_4_0_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_0_1() { return cColonEqualsSignKeyword_4_0_1; }

		//version=Version
		public Assignment getVersionAssignment_4_0_2() { return cVersionAssignment_4_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_4_0_2_0() { return cVersionVersionParserRuleCall_4_0_2_0; }

		//';'
		public Keyword getSemicolonKeyword_4_0_3() { return cSemicolonKeyword_4_0_3; }

		//('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
		public Group getGroup_4_1() { return cGroup_4_1; }

		//'languages'
		public Keyword getLanguagesKeyword_4_1_0() { return cLanguagesKeyword_4_1_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_1_1() { return cColonEqualsSignKeyword_4_1_1; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_4_1_2() { return cLanguagesAssignment_4_1_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_4_1_2_0() { return cLanguagesMLanguageCrossReference_4_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1; }

		//("," languages+=[system::MLanguage|VersionedQualifiedName])*
		public Group getGroup_4_1_3() { return cGroup_4_1_3; }

		//","
		public Keyword getCommaKeyword_4_1_3_0() { return cCommaKeyword_4_1_3_0; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_4_1_3_1() { return cLanguagesAssignment_4_1_3_1; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_4_1_3_1_0() { return cLanguagesMLanguageCrossReference_4_1_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_3_1_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_3_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_1_4() { return cSemicolonKeyword_4_1_4; }

		//('singleton' 'instances' ':=' allowsSingleton=EBoolean ';')?
		public Group getGroup_4_2() { return cGroup_4_2; }

		//'singleton'
		public Keyword getSingletonKeyword_4_2_0() { return cSingletonKeyword_4_2_0; }

		//'instances'
		public Keyword getInstancesKeyword_4_2_1() { return cInstancesKeyword_4_2_1; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_2_2() { return cColonEqualsSignKeyword_4_2_2; }

		//allowsSingleton=EBoolean
		public Assignment getAllowsSingletonAssignment_4_2_3() { return cAllowsSingletonAssignment_4_2_3; }

		//EBoolean
		public RuleCall getAllowsSingletonEBooleanParserRuleCall_4_2_3_0() { return cAllowsSingletonEBooleanParserRuleCall_4_2_3_0; }

		//';'
		public Keyword getSemicolonKeyword_4_2_4() { return cSemicolonKeyword_4_2_4; }

		//('attributes' '{' attributes+=MParameter+ '}' ';')?
		public Group getGroup_4_3() { return cGroup_4_3; }

		//'attributes'
		public Keyword getAttributesKeyword_4_3_0() { return cAttributesKeyword_4_3_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_3_1() { return cLeftCurlyBracketKeyword_4_3_1; }

		//attributes+=MParameter+
		public Assignment getAttributesAssignment_4_3_2() { return cAttributesAssignment_4_3_2; }

		//MParameter
		public RuleCall getAttributesMParameterParserRuleCall_4_3_2_0() { return cAttributesMParameterParserRuleCall_4_3_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_3_3() { return cRightCurlyBracketKeyword_4_3_3; }

		//';'
		public Keyword getSemicolonKeyword_4_3_4() { return cSemicolonKeyword_4_3_4; }

		//('interface' 'types' '{' interfaceTypes+=MInterfaceType+ '}' ';')?
		public Group getGroup_4_4() { return cGroup_4_4; }

		//'interface'
		public Keyword getInterfaceKeyword_4_4_0() { return cInterfaceKeyword_4_4_0; }

		//'types'
		public Keyword getTypesKeyword_4_4_1() { return cTypesKeyword_4_4_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_4_2() { return cLeftCurlyBracketKeyword_4_4_2; }

		//interfaceTypes+=MInterfaceType+
		public Assignment getInterfaceTypesAssignment_4_4_3() { return cInterfaceTypesAssignment_4_4_3; }

		//MInterfaceType
		public RuleCall getInterfaceTypesMInterfaceTypeParserRuleCall_4_4_3_0() { return cInterfaceTypesMInterfaceTypeParserRuleCall_4_4_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4_4() { return cRightCurlyBracketKeyword_4_4_4; }

		//';'
		public Keyword getSemicolonKeyword_4_4_5() { return cSemicolonKeyword_4_4_5; }

		//('port' 'types' '{' portTypes+=MPortType+ '}' ';')?
		public Group getGroup_4_5() { return cGroup_4_5; }

		//'port'
		public Keyword getPortKeyword_4_5_0() { return cPortKeyword_4_5_0; }

		//'types'
		public Keyword getTypesKeyword_4_5_1() { return cTypesKeyword_4_5_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_5_2() { return cLeftCurlyBracketKeyword_4_5_2; }

		//portTypes+=MPortType+
		public Assignment getPortTypesAssignment_4_5_3() { return cPortTypesAssignment_4_5_3; }

		//MPortType
		public RuleCall getPortTypesMPortTypeParserRuleCall_4_5_3_0() { return cPortTypesMPortTypeParserRuleCall_4_5_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_5_4() { return cRightCurlyBracketKeyword_4_5_4; }

		//';'
		public Keyword getSemicolonKeyword_4_5_5() { return cSemicolonKeyword_4_5_5; }

		//('connectors' '{' connectors+=MConnector+ '}' ';')?
		public Group getGroup_4_6() { return cGroup_4_6; }

		//'connectors'
		public Keyword getConnectorsKeyword_4_6_0() { return cConnectorsKeyword_4_6_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_6_1() { return cLeftCurlyBracketKeyword_4_6_1; }

		//connectors+=MConnector+
		public Assignment getConnectorsAssignment_4_6_2() { return cConnectorsAssignment_4_6_2; }

		//MConnector
		public RuleCall getConnectorsMConnectorParserRuleCall_4_6_2_0() { return cConnectorsMConnectorParserRuleCall_4_6_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_6_3() { return cRightCurlyBracketKeyword_4_6_3; }

		//';'
		public Keyword getSemicolonKeyword_4_6_4() { return cSemicolonKeyword_4_6_4; }

		//('exchange' 'models' '{' exchangeModels+=MExchangeModel+ '}' ';')?
		public Group getGroup_4_7() { return cGroup_4_7; }

		//'exchange'
		public Keyword getExchangeKeyword_4_7_0() { return cExchangeKeyword_4_7_0; }

		//'models'
		public Keyword getModelsKeyword_4_7_1() { return cModelsKeyword_4_7_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_7_2() { return cLeftCurlyBracketKeyword_4_7_2; }

		//exchangeModels+=MExchangeModel+
		public Assignment getExchangeModelsAssignment_4_7_3() { return cExchangeModelsAssignment_4_7_3; }

		//MExchangeModel
		public RuleCall getExchangeModelsMExchangeModelParserRuleCall_4_7_3_0() { return cExchangeModelsMExchangeModelParserRuleCall_4_7_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_7_4() { return cRightCurlyBracketKeyword_4_7_4; }

		//';'
		public Keyword getSemicolonKeyword_4_7_5() { return cSemicolonKeyword_4_7_5; }

		//('component' 'types' '{' componentTypes+=MIODCType+ '}' ';')?
		public Group getGroup_4_8() { return cGroup_4_8; }

		//'component'
		public Keyword getComponentKeyword_4_8_0() { return cComponentKeyword_4_8_0; }

		//'types'
		public Keyword getTypesKeyword_4_8_1() { return cTypesKeyword_4_8_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_8_2() { return cLeftCurlyBracketKeyword_4_8_2; }

		//componentTypes+=MIODCType+
		public Assignment getComponentTypesAssignment_4_8_3() { return cComponentTypesAssignment_4_8_3; }

		//MIODCType
		public RuleCall getComponentTypesMIODCTypeParserRuleCall_4_8_3_0() { return cComponentTypesMIODCTypeParserRuleCall_4_8_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_8_4() { return cRightCurlyBracketKeyword_4_8_4; }

		//';'
		public Keyword getSemicolonKeyword_4_8_5() { return cSemicolonKeyword_4_8_5; }

		//('internal' 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?
		public Group getGroup_4_9() { return cGroup_4_9; }

		//'internal'
		public Keyword getInternalKeyword_4_9_0() { return cInternalKeyword_4_9_0; }

		//'instances'
		public Keyword getInstancesKeyword_4_9_1() { return cInstancesKeyword_4_9_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_9_2() { return cLeftCurlyBracketKeyword_4_9_2; }

		//componentTypeInstances+=MIODComponentTypeInstance+
		public Assignment getComponentTypeInstancesAssignment_4_9_3() { return cComponentTypeInstancesAssignment_4_9_3; }

		//MIODComponentTypeInstance
		public RuleCall getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_4_9_3_0() { return cComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_4_9_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_9_4() { return cRightCurlyBracketKeyword_4_9_4; }

		//';'
		public Keyword getSemicolonKeyword_4_9_5() { return cSemicolonKeyword_4_9_5; }

		//('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
		//requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
		public Group getGroup_4_10() { return cGroup_4_10; }

		//'requires'
		public Keyword getRequiresKeyword_4_10_0() { return cRequiresKeyword_4_10_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_10_1() { return cColonEqualsSignKeyword_4_10_1; }

		//requires+=[mclevsai::MSAI|VersionedQualifiedName]
		public Assignment getRequiresAssignment_4_10_2() { return cRequiresAssignment_4_10_2; }

		//[mclevsai::MSAI|VersionedQualifiedName]
		public CrossReference getRequiresMSAICrossReference_4_10_2_0() { return cRequiresMSAICrossReference_4_10_2_0; }

		//VersionedQualifiedName
		public RuleCall getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_10_2_0_1() { return cRequiresMSAIVersionedQualifiedNameParserRuleCall_4_10_2_0_1; }

		//("," requires+=[mclevsai::MSAI|VersionedQualifiedName])*
		public Group getGroup_4_10_3() { return cGroup_4_10_3; }

		//","
		public Keyword getCommaKeyword_4_10_3_0() { return cCommaKeyword_4_10_3_0; }

		//requires+=[mclevsai::MSAI|VersionedQualifiedName]
		public Assignment getRequiresAssignment_4_10_3_1() { return cRequiresAssignment_4_10_3_1; }

		//[mclevsai::MSAI|VersionedQualifiedName]
		public CrossReference getRequiresMSAICrossReference_4_10_3_1_0() { return cRequiresMSAICrossReference_4_10_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_10_3_1_0_1() { return cRequiresMSAIVersionedQualifiedNameParserRuleCall_4_10_3_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_10_4() { return cSemicolonKeyword_4_10_4; }

		//('supported' 'platforms' '{' supportedPlatforms+=MIODomainSupportedPlatform+ '}' ';')?
		public Group getGroup_4_11() { return cGroup_4_11; }

		//'supported'
		public Keyword getSupportedKeyword_4_11_0() { return cSupportedKeyword_4_11_0; }

		//'platforms'
		public Keyword getPlatformsKeyword_4_11_1() { return cPlatformsKeyword_4_11_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_11_2() { return cLeftCurlyBracketKeyword_4_11_2; }

		//supportedPlatforms+=MIODomainSupportedPlatform+
		public Assignment getSupportedPlatformsAssignment_4_11_3() { return cSupportedPlatformsAssignment_4_11_3; }

		//MIODomainSupportedPlatform
		public RuleCall getSupportedPlatformsMIODomainSupportedPlatformParserRuleCall_4_11_3_0() { return cSupportedPlatformsMIODomainSupportedPlatformParserRuleCall_4_11_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_11_4() { return cRightCurlyBracketKeyword_4_11_4; }

		//';'
		public Keyword getSemicolonKeyword_4_11_5() { return cSemicolonKeyword_4_11_5; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MIODomainSupportedPlatformElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MIODomainSupportedPlatform");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSupportedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPlatformKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cOsapiKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Alternatives cAlternatives_4_0_2 = (Alternatives)cGroup_4_0.eContents().get(2);
		private final Keyword cAnyKeyword_4_0_2_0 = (Keyword)cAlternatives_4_0_2.eContents().get(0);
		private final Assignment cOsapiAssignment_4_0_2_1 = (Assignment)cAlternatives_4_0_2.eContents().get(1);
		private final CrossReference cOsapiMOperatingSystemAPICrossReference_4_0_2_1_0 = (CrossReference)cOsapiAssignment_4_0_2_1.eContents().get(0);
		private final RuleCall cOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_0_2_1_0_1 = (RuleCall)cOsapiMOperatingSystemAPICrossReference_4_0_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cOsKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Alternatives cAlternatives_4_1_2 = (Alternatives)cGroup_4_1.eContents().get(2);
		private final Keyword cAnyKeyword_4_1_2_0 = (Keyword)cAlternatives_4_1_2.eContents().get(0);
		private final Assignment cOsAssignment_4_1_2_1 = (Assignment)cAlternatives_4_1_2.eContents().get(1);
		private final CrossReference cOsMOperatingSystemCrossReference_4_1_2_1_0 = (CrossReference)cOsAssignment_4_1_2_1.eContents().get(0);
		private final RuleCall cOsMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_1_0_1 = (RuleCall)cOsMOperatingSystemCrossReference_4_1_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_1_3 = (Keyword)cGroup_4_1.eContents().get(3);
		private final Group cGroup_4_2 = (Group)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cArchitectureKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Alternatives cAlternatives_4_2_2 = (Alternatives)cGroup_4_2.eContents().get(2);
		private final Keyword cAnyKeyword_4_2_2_0 = (Keyword)cAlternatives_4_2_2.eContents().get(0);
		private final Assignment cArchitectureAssignment_4_2_2_1 = (Assignment)cAlternatives_4_2_2.eContents().get(1);
		private final CrossReference cArchitectureMArchitectureCrossReference_4_2_2_1_0 = (CrossReference)cArchitectureAssignment_4_2_2_1.eContents().get(0);
		private final RuleCall cArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_4_2_2_1_0_1 = (RuleCall)cArchitectureMArchitectureCrossReference_4_2_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_2_3 = (Keyword)cGroup_4_2.eContents().get(3);
		private final Group cGroup_4_3 = (Group)cUnorderedGroup_4.eContents().get(3);
		private final Keyword cCompilerKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_3_1 = (Keyword)cGroup_4_3.eContents().get(1);
		private final Assignment cCompilerAssignment_4_3_2 = (Assignment)cGroup_4_3.eContents().get(2);
		private final CrossReference cCompilerMCompilerCrossReference_4_3_2_0 = (CrossReference)cCompilerAssignment_4_3_2.eContents().get(0);
		private final RuleCall cCompilerMCompilerVersionedQualifiedNameParserRuleCall_4_3_2_0_1 = (RuleCall)cCompilerMCompilerCrossReference_4_3_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_3_3 = (Keyword)cGroup_4_3.eContents().get(3);
		private final Group cGroup_4_4 = (Group)cUnorderedGroup_4.eContents().get(4);
		private final Keyword cMicroprocessorKeyword_4_4_0 = (Keyword)cGroup_4_4.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_4_1 = (Keyword)cGroup_4_4.eContents().get(1);
		private final Alternatives cAlternatives_4_4_2 = (Alternatives)cGroup_4_4.eContents().get(2);
		private final Keyword cAnyKeyword_4_4_2_0 = (Keyword)cAlternatives_4_4_2.eContents().get(0);
		private final Assignment cMicroprocessorAssignment_4_4_2_1 = (Assignment)cAlternatives_4_4_2.eContents().get(1);
		private final CrossReference cMicroprocessorMMicroprocessorCrossReference_4_4_2_1_0 = (CrossReference)cMicroprocessorAssignment_4_4_2_1.eContents().get(0);
		private final RuleCall cMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_4_4_2_1_0_1 = (RuleCall)cMicroprocessorMMicroprocessorCrossReference_4_4_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_4_3 = (Keyword)cGroup_4_4.eContents().get(3);
		private final Group cGroup_4_5 = (Group)cUnorderedGroup_4.eContents().get(5);
		private final Keyword cBoardKeyword_4_5_0 = (Keyword)cGroup_4_5.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_5_1 = (Keyword)cGroup_4_5.eContents().get(1);
		private final Alternatives cAlternatives_4_5_2 = (Alternatives)cGroup_4_5.eContents().get(2);
		private final Keyword cAnyKeyword_4_5_2_0 = (Keyword)cAlternatives_4_5_2.eContents().get(0);
		private final Assignment cBoardAssignment_4_5_2_1 = (Assignment)cAlternatives_4_5_2.eContents().get(1);
		private final CrossReference cBoardMBoardCrossReference_4_5_2_1_0 = (CrossReference)cBoardAssignment_4_5_2_1.eContents().get(0);
		private final RuleCall cBoardMBoardVersionedQualifiedNameParserRuleCall_4_5_2_1_0_1 = (RuleCall)cBoardMBoardCrossReference_4_5_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_5_3 = (Keyword)cGroup_4_5.eContents().get(3);
		private final Group cGroup_4_6 = (Group)cUnorderedGroup_4.eContents().get(6);
		private final Keyword cAttributesKeyword_4_6_0 = (Keyword)cGroup_4_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_6_1 = (Keyword)cGroup_4_6.eContents().get(1);
		private final Assignment cAttributesAssignment_4_6_2 = (Assignment)cGroup_4_6.eContents().get(2);
		private final RuleCall cAttributesMParameterParserRuleCall_4_6_2_0 = (RuleCall)cAttributesAssignment_4_6_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_6_3 = (Keyword)cGroup_4_6.eContents().get(3);
		private final Keyword cSemicolonKeyword_4_6_4 = (Keyword)cGroup_4_6.eContents().get(4);
		private final Group cGroup_4_7 = (Group)cUnorderedGroup_4.eContents().get(7);
		private final Keyword cLanguagesKeyword_4_7_0 = (Keyword)cGroup_4_7.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_7_1 = (Keyword)cGroup_4_7.eContents().get(1);
		private final Assignment cLanguagesAssignment_4_7_2 = (Assignment)cGroup_4_7.eContents().get(2);
		private final CrossReference cLanguagesMLanguageCrossReference_4_7_2_0 = (CrossReference)cLanguagesAssignment_4_7_2.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_7_2_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_4_7_2_0.eContents().get(1);
		private final Group cGroup_4_7_3 = (Group)cGroup_4_7.eContents().get(3);
		private final Keyword cCommaKeyword_4_7_3_0 = (Keyword)cGroup_4_7_3.eContents().get(0);
		private final Assignment cLanguagesAssignment_4_7_3_1 = (Assignment)cGroup_4_7_3.eContents().get(1);
		private final CrossReference cLanguagesMLanguageCrossReference_4_7_3_1_0 = (CrossReference)cLanguagesAssignment_4_7_3_1.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_7_3_1_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_4_7_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_7_4 = (Keyword)cGroup_4_7.eContents().get(4);
		private final Group cGroup_4_8 = (Group)cUnorderedGroup_4.eContents().get(8);
		private final Keyword cRequiresKeyword_4_8_0 = (Keyword)cGroup_4_8.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_8_1 = (Keyword)cGroup_4_8.eContents().get(1);
		private final Assignment cRequiresAssignment_4_8_2 = (Assignment)cGroup_4_8.eContents().get(2);
		private final CrossReference cRequiresMSAICrossReference_4_8_2_0 = (CrossReference)cRequiresAssignment_4_8_2.eContents().get(0);
		private final RuleCall cRequiresMSAIVersionedQualifiedNameParserRuleCall_4_8_2_0_1 = (RuleCall)cRequiresMSAICrossReference_4_8_2_0.eContents().get(1);
		private final Group cGroup_4_8_3 = (Group)cGroup_4_8.eContents().get(3);
		private final Keyword cCommaKeyword_4_8_3_0 = (Keyword)cGroup_4_8_3.eContents().get(0);
		private final Assignment cRequiresAssignment_4_8_3_1 = (Assignment)cGroup_4_8_3.eContents().get(1);
		private final CrossReference cRequiresMSAICrossReference_4_8_3_1_0 = (CrossReference)cRequiresAssignment_4_8_3_1.eContents().get(0);
		private final RuleCall cRequiresMSAIVersionedQualifiedNameParserRuleCall_4_8_3_1_0_1 = (RuleCall)cRequiresMSAICrossReference_4_8_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_8_4 = (Keyword)cGroup_4_8.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MIODomainSupportedPlatform:
		//	'supported' 'platform'
		//	name=ID
		//	'{' ('osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';' & 'os' ':=' ('any' |
		//	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';' & 'architecture' ':=' ('any' |
		//	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';' & ('compiler' ':='
		//	compiler=[pdl::MCompiler|VersionedQualifiedName] ';')?
		//	& 'microprocessor' ':=' ('any' | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';' & 'board' ':='
		//	('any' | board=[pdl::MBoard|VersionedQualifiedName]) ';' & ('attributes'
		//	'{'
		//	attributes+=MParameter+
		//	'}' ';')?
		//	& ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//	languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
		//	& ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
		//	requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'supported' 'platform' name=ID '{' ('osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';' &
		//'os' ':=' ('any' | os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';' & 'architecture' ':=' ('any' |
		//architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';' & ('compiler' ':='
		//compiler=[pdl::MCompiler|VersionedQualifiedName] ';')? & 'microprocessor' ':=' ('any' |
		//microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';' & 'board' ':=' ('any' |
		//board=[pdl::MBoard|VersionedQualifiedName]) ';' & ('attributes' '{' attributes+=MParameter+ '}' ';')? & ('languages'
		//':=' languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//';')? & ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
		//requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//'supported'
		public Keyword getSupportedKeyword_0() { return cSupportedKeyword_0; }

		//'platform'
		public Keyword getPlatformKeyword_1() { return cPlatformKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';' & 'os' ':=' ('any' |
		//os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';' & 'architecture' ':=' ('any' |
		//architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';' & ('compiler' ':='
		//compiler=[pdl::MCompiler|VersionedQualifiedName] ';')? & 'microprocessor' ':=' ('any' |
		//microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';' & 'board' ':=' ('any' |
		//board=[pdl::MBoard|VersionedQualifiedName]) ';' & ('attributes' '{' attributes+=MParameter+ '}' ';')? & ('languages'
		//':=' languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//';')? & ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
		//requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?)
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//'osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';'
		public Group getGroup_4_0() { return cGroup_4_0; }

		//'osapi'
		public Keyword getOsapiKeyword_4_0_0() { return cOsapiKeyword_4_0_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_0_1() { return cColonEqualsSignKeyword_4_0_1; }

		//('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName])
		public Alternatives getAlternatives_4_0_2() { return cAlternatives_4_0_2; }

		//'any'
		public Keyword getAnyKeyword_4_0_2_0() { return cAnyKeyword_4_0_2_0; }

		//osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public Assignment getOsapiAssignment_4_0_2_1() { return cOsapiAssignment_4_0_2_1; }

		//[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public CrossReference getOsapiMOperatingSystemAPICrossReference_4_0_2_1_0() { return cOsapiMOperatingSystemAPICrossReference_4_0_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_0_2_1_0_1() { return cOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_0_2_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_0_3() { return cSemicolonKeyword_4_0_3; }

		//'os' ':=' ('any' | os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';'
		public Group getGroup_4_1() { return cGroup_4_1; }

		//'os'
		public Keyword getOsKeyword_4_1_0() { return cOsKeyword_4_1_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_1_1() { return cColonEqualsSignKeyword_4_1_1; }

		//('any' | os=[pdl::MOperatingSystem|VersionedQualifiedName])
		public Alternatives getAlternatives_4_1_2() { return cAlternatives_4_1_2; }

		//'any'
		public Keyword getAnyKeyword_4_1_2_0() { return cAnyKeyword_4_1_2_0; }

		//os=[pdl::MOperatingSystem|VersionedQualifiedName]
		public Assignment getOsAssignment_4_1_2_1() { return cOsAssignment_4_1_2_1; }

		//[pdl::MOperatingSystem|VersionedQualifiedName]
		public CrossReference getOsMOperatingSystemCrossReference_4_1_2_1_0() { return cOsMOperatingSystemCrossReference_4_1_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_1_0_1() { return cOsMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_1_3() { return cSemicolonKeyword_4_1_3; }

		//'architecture' ':=' ('any' | architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';'
		public Group getGroup_4_2() { return cGroup_4_2; }

		//'architecture'
		public Keyword getArchitectureKeyword_4_2_0() { return cArchitectureKeyword_4_2_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_2_1() { return cColonEqualsSignKeyword_4_2_1; }

		//('any' | architecture=[pdl::MArchitecture|VersionedQualifiedName])
		public Alternatives getAlternatives_4_2_2() { return cAlternatives_4_2_2; }

		//'any'
		public Keyword getAnyKeyword_4_2_2_0() { return cAnyKeyword_4_2_2_0; }

		//architecture=[pdl::MArchitecture|VersionedQualifiedName]
		public Assignment getArchitectureAssignment_4_2_2_1() { return cArchitectureAssignment_4_2_2_1; }

		//[pdl::MArchitecture|VersionedQualifiedName]
		public CrossReference getArchitectureMArchitectureCrossReference_4_2_2_1_0() { return cArchitectureMArchitectureCrossReference_4_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_4_2_2_1_0_1() { return cArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_4_2_2_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_2_3() { return cSemicolonKeyword_4_2_3; }

		//('compiler' ':=' compiler=[pdl::MCompiler|VersionedQualifiedName] ';')?
		public Group getGroup_4_3() { return cGroup_4_3; }

		//'compiler'
		public Keyword getCompilerKeyword_4_3_0() { return cCompilerKeyword_4_3_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_3_1() { return cColonEqualsSignKeyword_4_3_1; }

		//compiler=[pdl::MCompiler|VersionedQualifiedName]
		public Assignment getCompilerAssignment_4_3_2() { return cCompilerAssignment_4_3_2; }

		//[pdl::MCompiler|VersionedQualifiedName]
		public CrossReference getCompilerMCompilerCrossReference_4_3_2_0() { return cCompilerMCompilerCrossReference_4_3_2_0; }

		//VersionedQualifiedName
		public RuleCall getCompilerMCompilerVersionedQualifiedNameParserRuleCall_4_3_2_0_1() { return cCompilerMCompilerVersionedQualifiedNameParserRuleCall_4_3_2_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_3_3() { return cSemicolonKeyword_4_3_3; }

		//'microprocessor' ':=' ('any' | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';'
		public Group getGroup_4_4() { return cGroup_4_4; }

		//'microprocessor'
		public Keyword getMicroprocessorKeyword_4_4_0() { return cMicroprocessorKeyword_4_4_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_4_1() { return cColonEqualsSignKeyword_4_4_1; }

		//('any' | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName])
		public Alternatives getAlternatives_4_4_2() { return cAlternatives_4_4_2; }

		//'any'
		public Keyword getAnyKeyword_4_4_2_0() { return cAnyKeyword_4_4_2_0; }

		//microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
		public Assignment getMicroprocessorAssignment_4_4_2_1() { return cMicroprocessorAssignment_4_4_2_1; }

		//[pdl::MMicroprocessor|VersionedQualifiedName]
		public CrossReference getMicroprocessorMMicroprocessorCrossReference_4_4_2_1_0() { return cMicroprocessorMMicroprocessorCrossReference_4_4_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_4_4_2_1_0_1() { return cMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_4_4_2_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_4_3() { return cSemicolonKeyword_4_4_3; }

		//'board' ':=' ('any' | board=[pdl::MBoard|VersionedQualifiedName]) ';'
		public Group getGroup_4_5() { return cGroup_4_5; }

		//'board'
		public Keyword getBoardKeyword_4_5_0() { return cBoardKeyword_4_5_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_5_1() { return cColonEqualsSignKeyword_4_5_1; }

		//('any' | board=[pdl::MBoard|VersionedQualifiedName])
		public Alternatives getAlternatives_4_5_2() { return cAlternatives_4_5_2; }

		//'any'
		public Keyword getAnyKeyword_4_5_2_0() { return cAnyKeyword_4_5_2_0; }

		//board=[pdl::MBoard|VersionedQualifiedName]
		public Assignment getBoardAssignment_4_5_2_1() { return cBoardAssignment_4_5_2_1; }

		//[pdl::MBoard|VersionedQualifiedName]
		public CrossReference getBoardMBoardCrossReference_4_5_2_1_0() { return cBoardMBoardCrossReference_4_5_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getBoardMBoardVersionedQualifiedNameParserRuleCall_4_5_2_1_0_1() { return cBoardMBoardVersionedQualifiedNameParserRuleCall_4_5_2_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_5_3() { return cSemicolonKeyword_4_5_3; }

		//('attributes' '{' attributes+=MParameter+ '}' ';')?
		public Group getGroup_4_6() { return cGroup_4_6; }

		//'attributes'
		public Keyword getAttributesKeyword_4_6_0() { return cAttributesKeyword_4_6_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_6_1() { return cLeftCurlyBracketKeyword_4_6_1; }

		//attributes+=MParameter+
		public Assignment getAttributesAssignment_4_6_2() { return cAttributesAssignment_4_6_2; }

		//MParameter
		public RuleCall getAttributesMParameterParserRuleCall_4_6_2_0() { return cAttributesMParameterParserRuleCall_4_6_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_6_3() { return cRightCurlyBracketKeyword_4_6_3; }

		//';'
		public Keyword getSemicolonKeyword_4_6_4() { return cSemicolonKeyword_4_6_4; }

		//('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
		public Group getGroup_4_7() { return cGroup_4_7; }

		//'languages'
		public Keyword getLanguagesKeyword_4_7_0() { return cLanguagesKeyword_4_7_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_7_1() { return cColonEqualsSignKeyword_4_7_1; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_4_7_2() { return cLanguagesAssignment_4_7_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_4_7_2_0() { return cLanguagesMLanguageCrossReference_4_7_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_7_2_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_7_2_0_1; }

		//("," languages+=[system::MLanguage|VersionedQualifiedName])*
		public Group getGroup_4_7_3() { return cGroup_4_7_3; }

		//","
		public Keyword getCommaKeyword_4_7_3_0() { return cCommaKeyword_4_7_3_0; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_4_7_3_1() { return cLanguagesAssignment_4_7_3_1; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_4_7_3_1_0() { return cLanguagesMLanguageCrossReference_4_7_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_7_3_1_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_7_3_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_7_4() { return cSemicolonKeyword_4_7_4; }

		//('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
		//requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
		public Group getGroup_4_8() { return cGroup_4_8; }

		//'requires'
		public Keyword getRequiresKeyword_4_8_0() { return cRequiresKeyword_4_8_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_8_1() { return cColonEqualsSignKeyword_4_8_1; }

		//requires+=[mclevsai::MSAI|VersionedQualifiedName]
		public Assignment getRequiresAssignment_4_8_2() { return cRequiresAssignment_4_8_2; }

		//[mclevsai::MSAI|VersionedQualifiedName]
		public CrossReference getRequiresMSAICrossReference_4_8_2_0() { return cRequiresMSAICrossReference_4_8_2_0; }

		//VersionedQualifiedName
		public RuleCall getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_8_2_0_1() { return cRequiresMSAIVersionedQualifiedNameParserRuleCall_4_8_2_0_1; }

		//("," requires+=[mclevsai::MSAI|VersionedQualifiedName])*
		public Group getGroup_4_8_3() { return cGroup_4_8_3; }

		//","
		public Keyword getCommaKeyword_4_8_3_0() { return cCommaKeyword_4_8_3_0; }

		//requires+=[mclevsai::MSAI|VersionedQualifiedName]
		public Assignment getRequiresAssignment_4_8_3_1() { return cRequiresAssignment_4_8_3_1; }

		//[mclevsai::MSAI|VersionedQualifiedName]
		public CrossReference getRequiresMSAICrossReference_4_8_3_1_0() { return cRequiresMSAICrossReference_4_8_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_8_3_1_0_1() { return cRequiresMSAIVersionedQualifiedNameParserRuleCall_4_8_3_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_8_4() { return cSemicolonKeyword_4_8_4; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MAODomainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MAODomain");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAodomainKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cInheritsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cInheritsMAODomainCrossReference_2_1_0 = (CrossReference)cInheritsAssignment_2_1.eContents().get(0);
		private final RuleCall cInheritsMAODomainVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cInheritsMAODomainCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cInheritsMAODomainCrossReference_2_2_1_0 = (CrossReference)cInheritsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cInheritsMAODomainVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cInheritsMAODomainCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cVersionKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Assignment cVersionAssignment_4_0_2 = (Assignment)cGroup_4_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_4_0_2_0 = (RuleCall)cVersionAssignment_4_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cOutputKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cIodomainsKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_4_1_2 = (Keyword)cGroup_4_1.eContents().get(2);
		private final Assignment cOutputIODomainsAssignment_4_1_3 = (Assignment)cGroup_4_1.eContents().get(3);
		private final CrossReference cOutputIODomainsMIODomainCrossReference_4_1_3_0 = (CrossReference)cOutputIODomainsAssignment_4_1_3.eContents().get(0);
		private final RuleCall cOutputIODomainsMIODomainVersionedQualifiedNameParserRuleCall_4_1_3_0_1 = (RuleCall)cOutputIODomainsMIODomainCrossReference_4_1_3_0.eContents().get(1);
		private final Group cGroup_4_1_4 = (Group)cGroup_4_1.eContents().get(4);
		private final Keyword cCommaKeyword_4_1_4_0 = (Keyword)cGroup_4_1_4.eContents().get(0);
		private final Assignment cOutputIODomainsAssignment_4_1_4_1 = (Assignment)cGroup_4_1_4.eContents().get(1);
		private final CrossReference cOutputIODomainsMIODomainCrossReference_4_1_4_1_0 = (CrossReference)cOutputIODomainsAssignment_4_1_4_1.eContents().get(0);
		private final RuleCall cOutputIODomainsMIODomainVersionedQualifiedNameParserRuleCall_4_1_4_1_0_1 = (RuleCall)cOutputIODomainsMIODomainCrossReference_4_1_4_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_1_5 = (Keyword)cGroup_4_1.eContents().get(5);
		private final Group cGroup_4_2 = (Group)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cAttributesKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Assignment cAttributesAssignment_4_2_2 = (Assignment)cGroup_4_2.eContents().get(2);
		private final RuleCall cAttributesMParameterParserRuleCall_4_2_2_0 = (RuleCall)cAttributesAssignment_4_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_2_3 = (Keyword)cGroup_4_2.eContents().get(3);
		private final Keyword cSemicolonKeyword_4_2_4 = (Keyword)cGroup_4_2.eContents().get(4);
		private final Group cGroup_4_3 = (Group)cUnorderedGroup_4.eContents().get(3);
		private final Keyword cInterfaceKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Keyword cTypesKeyword_4_3_1 = (Keyword)cGroup_4_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_3_2 = (Keyword)cGroup_4_3.eContents().get(2);
		private final Assignment cInterfaceTypesAssignment_4_3_3 = (Assignment)cGroup_4_3.eContents().get(3);
		private final RuleCall cInterfaceTypesMInterfaceTypeParserRuleCall_4_3_3_0 = (RuleCall)cInterfaceTypesAssignment_4_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_3_4 = (Keyword)cGroup_4_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_3_5 = (Keyword)cGroup_4_3.eContents().get(5);
		private final Group cGroup_4_4 = (Group)cUnorderedGroup_4.eContents().get(4);
		private final Keyword cPortKeyword_4_4_0 = (Keyword)cGroup_4_4.eContents().get(0);
		private final Keyword cTypesKeyword_4_4_1 = (Keyword)cGroup_4_4.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_4_2 = (Keyword)cGroup_4_4.eContents().get(2);
		private final Assignment cPortTypesAssignment_4_4_3 = (Assignment)cGroup_4_4.eContents().get(3);
		private final RuleCall cPortTypesMPortTypeParserRuleCall_4_4_3_0 = (RuleCall)cPortTypesAssignment_4_4_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4_4 = (Keyword)cGroup_4_4.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_4_5 = (Keyword)cGroup_4_4.eContents().get(5);
		private final Group cGroup_4_5 = (Group)cUnorderedGroup_4.eContents().get(5);
		private final Keyword cConnectorsKeyword_4_5_0 = (Keyword)cGroup_4_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_5_1 = (Keyword)cGroup_4_5.eContents().get(1);
		private final Assignment cConnectorsAssignment_4_5_2 = (Assignment)cGroup_4_5.eContents().get(2);
		private final RuleCall cConnectorsMConnectorParserRuleCall_4_5_2_0 = (RuleCall)cConnectorsAssignment_4_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_5_3 = (Keyword)cGroup_4_5.eContents().get(3);
		private final Keyword cSemicolonKeyword_4_5_4 = (Keyword)cGroup_4_5.eContents().get(4);
		private final Group cGroup_4_6 = (Group)cUnorderedGroup_4.eContents().get(6);
		private final Keyword cComponentKeyword_4_6_0 = (Keyword)cGroup_4_6.eContents().get(0);
		private final Keyword cTypesKeyword_4_6_1 = (Keyword)cGroup_4_6.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_6_2 = (Keyword)cGroup_4_6.eContents().get(2);
		private final Assignment cComponentTypesAssignment_4_6_3 = (Assignment)cGroup_4_6.eContents().get(3);
		private final RuleCall cComponentTypesMAODComponentTypeParserRuleCall_4_6_3_0 = (RuleCall)cComponentTypesAssignment_4_6_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_6_4 = (Keyword)cGroup_4_6.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_6_5 = (Keyword)cGroup_4_6.eContents().get(5);
		private final Group cGroup_4_7 = (Group)cUnorderedGroup_4.eContents().get(7);
		private final Keyword cInternalKeyword_4_7_0 = (Keyword)cGroup_4_7.eContents().get(0);
		private final Keyword cInstancesKeyword_4_7_1 = (Keyword)cGroup_4_7.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_7_2 = (Keyword)cGroup_4_7.eContents().get(2);
		private final Assignment cComponentTypeInstancesAssignment_4_7_3 = (Assignment)cGroup_4_7.eContents().get(3);
		private final RuleCall cComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_4_7_3_0 = (RuleCall)cComponentTypeInstancesAssignment_4_7_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_7_4 = (Keyword)cGroup_4_7.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_7_5 = (Keyword)cGroup_4_7.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MAODomain:
		//	'aodomain'
		//	name=ID ('inherits' inherits+=[MAODomain|VersionedQualifiedName] ("," inherits+=[MAODomain|VersionedQualifiedName])*)?
		//	'{' ('version' ':=' version=Version ';' & ('output' 'iodomains' ':='
		//	outputIODomains+=[MIODomain|VersionedQualifiedName] ("," outputIODomains+=[MIODomain|VersionedQualifiedName])* ';')?
		//	& ('attributes'
		//	'{'
		//	attributes+=MParameter+
		//	'}' ';')?
		//	& ('interface' 'types'
		//	'{'
		//	interfaceTypes+=MInterfaceType+
		//	'}' ';')?
		//	& ('port' 'types'
		//	'{'
		//	portTypes+=MPortType+
		//	'}' ';')?
		//	& ('connectors'
		//	'{'
		//	connectors+=MConnector+
		//	'}' ';')?
		//	& ('component' 'types'
		//	'{'
		//	componentTypes+=MAODComponentType+
		//	'}' ';')?
		//	& ('internal' 'instances'
		//	'{'
		//	componentTypeInstances+=MAODComponentTypeInstance+
		//	'}' ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'aodomain' name=ID ('inherits' inherits+=[MAODomain|VersionedQualifiedName] (","
		//inherits+=[MAODomain|VersionedQualifiedName])*)? '{' ('version' ':=' version=Version ';' & ('output' 'iodomains' ':='
		//outputIODomains+=[MIODomain|VersionedQualifiedName] ("," outputIODomains+=[MIODomain|VersionedQualifiedName])* ';')? &
		//('attributes' '{' attributes+=MParameter+ '}' ';')? & ('interface' 'types' '{' interfaceTypes+=MInterfaceType+ '}'
		//';')? & ('port' 'types' '{' portTypes+=MPortType+ '}' ';')? & ('connectors' '{' connectors+=MConnector+ '}' ';')? &
		//('component' 'types' '{' componentTypes+=MAODComponentType+ '}' ';')? & ('internal' 'instances' '{'
		//componentTypeInstances+=MAODComponentTypeInstance+ '}' ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//'aodomain'
		public Keyword getAodomainKeyword_0() { return cAodomainKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//('inherits' inherits+=[MAODomain|VersionedQualifiedName] ("," inherits+=[MAODomain|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//'inherits'
		public Keyword getInheritsKeyword_2_0() { return cInheritsKeyword_2_0; }

		//inherits+=[MAODomain|VersionedQualifiedName]
		public Assignment getInheritsAssignment_2_1() { return cInheritsAssignment_2_1; }

		//[MAODomain|VersionedQualifiedName]
		public CrossReference getInheritsMAODomainCrossReference_2_1_0() { return cInheritsMAODomainCrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMAODomainVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cInheritsMAODomainVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," inherits+=[MAODomain|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//inherits+=[MAODomain|VersionedQualifiedName]
		public Assignment getInheritsAssignment_2_2_1() { return cInheritsAssignment_2_2_1; }

		//[MAODomain|VersionedQualifiedName]
		public CrossReference getInheritsMAODomainCrossReference_2_2_1_0() { return cInheritsMAODomainCrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMAODomainVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cInheritsMAODomainVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('version' ':=' version=Version ';' & ('output' 'iodomains' ':=' outputIODomains+=[MIODomain|VersionedQualifiedName]
		//("," outputIODomains+=[MIODomain|VersionedQualifiedName])* ';')? & ('attributes' '{' attributes+=MParameter+ '}' ';')?
		//& ('interface' 'types' '{' interfaceTypes+=MInterfaceType+ '}' ';')? & ('port' 'types' '{' portTypes+=MPortType+ '}'
		//';')? & ('connectors' '{' connectors+=MConnector+ '}' ';')? & ('component' 'types' '{'
		//componentTypes+=MAODComponentType+ '}' ';')? & ('internal' 'instances' '{'
		//componentTypeInstances+=MAODComponentTypeInstance+ '}' ';')?)
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//'version' ':=' version=Version ';'
		public Group getGroup_4_0() { return cGroup_4_0; }

		//'version'
		public Keyword getVersionKeyword_4_0_0() { return cVersionKeyword_4_0_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_0_1() { return cColonEqualsSignKeyword_4_0_1; }

		//version=Version
		public Assignment getVersionAssignment_4_0_2() { return cVersionAssignment_4_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_4_0_2_0() { return cVersionVersionParserRuleCall_4_0_2_0; }

		//';'
		public Keyword getSemicolonKeyword_4_0_3() { return cSemicolonKeyword_4_0_3; }

		//('output' 'iodomains' ':=' outputIODomains+=[MIODomain|VersionedQualifiedName] (","
		//outputIODomains+=[MIODomain|VersionedQualifiedName])* ';')?
		public Group getGroup_4_1() { return cGroup_4_1; }

		//'output'
		public Keyword getOutputKeyword_4_1_0() { return cOutputKeyword_4_1_0; }

		//'iodomains'
		public Keyword getIodomainsKeyword_4_1_1() { return cIodomainsKeyword_4_1_1; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_1_2() { return cColonEqualsSignKeyword_4_1_2; }

		//outputIODomains+=[MIODomain|VersionedQualifiedName]
		public Assignment getOutputIODomainsAssignment_4_1_3() { return cOutputIODomainsAssignment_4_1_3; }

		//[MIODomain|VersionedQualifiedName]
		public CrossReference getOutputIODomainsMIODomainCrossReference_4_1_3_0() { return cOutputIODomainsMIODomainCrossReference_4_1_3_0; }

		//VersionedQualifiedName
		public RuleCall getOutputIODomainsMIODomainVersionedQualifiedNameParserRuleCall_4_1_3_0_1() { return cOutputIODomainsMIODomainVersionedQualifiedNameParserRuleCall_4_1_3_0_1; }

		//("," outputIODomains+=[MIODomain|VersionedQualifiedName])*
		public Group getGroup_4_1_4() { return cGroup_4_1_4; }

		//","
		public Keyword getCommaKeyword_4_1_4_0() { return cCommaKeyword_4_1_4_0; }

		//outputIODomains+=[MIODomain|VersionedQualifiedName]
		public Assignment getOutputIODomainsAssignment_4_1_4_1() { return cOutputIODomainsAssignment_4_1_4_1; }

		//[MIODomain|VersionedQualifiedName]
		public CrossReference getOutputIODomainsMIODomainCrossReference_4_1_4_1_0() { return cOutputIODomainsMIODomainCrossReference_4_1_4_1_0; }

		//VersionedQualifiedName
		public RuleCall getOutputIODomainsMIODomainVersionedQualifiedNameParserRuleCall_4_1_4_1_0_1() { return cOutputIODomainsMIODomainVersionedQualifiedNameParserRuleCall_4_1_4_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_1_5() { return cSemicolonKeyword_4_1_5; }

		//('attributes' '{' attributes+=MParameter+ '}' ';')?
		public Group getGroup_4_2() { return cGroup_4_2; }

		//'attributes'
		public Keyword getAttributesKeyword_4_2_0() { return cAttributesKeyword_4_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_2_1() { return cLeftCurlyBracketKeyword_4_2_1; }

		//attributes+=MParameter+
		public Assignment getAttributesAssignment_4_2_2() { return cAttributesAssignment_4_2_2; }

		//MParameter
		public RuleCall getAttributesMParameterParserRuleCall_4_2_2_0() { return cAttributesMParameterParserRuleCall_4_2_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_2_3() { return cRightCurlyBracketKeyword_4_2_3; }

		//';'
		public Keyword getSemicolonKeyword_4_2_4() { return cSemicolonKeyword_4_2_4; }

		//('interface' 'types' '{' interfaceTypes+=MInterfaceType+ '}' ';')?
		public Group getGroup_4_3() { return cGroup_4_3; }

		//'interface'
		public Keyword getInterfaceKeyword_4_3_0() { return cInterfaceKeyword_4_3_0; }

		//'types'
		public Keyword getTypesKeyword_4_3_1() { return cTypesKeyword_4_3_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_3_2() { return cLeftCurlyBracketKeyword_4_3_2; }

		//interfaceTypes+=MInterfaceType+
		public Assignment getInterfaceTypesAssignment_4_3_3() { return cInterfaceTypesAssignment_4_3_3; }

		//MInterfaceType
		public RuleCall getInterfaceTypesMInterfaceTypeParserRuleCall_4_3_3_0() { return cInterfaceTypesMInterfaceTypeParserRuleCall_4_3_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_3_4() { return cRightCurlyBracketKeyword_4_3_4; }

		//';'
		public Keyword getSemicolonKeyword_4_3_5() { return cSemicolonKeyword_4_3_5; }

		//('port' 'types' '{' portTypes+=MPortType+ '}' ';')?
		public Group getGroup_4_4() { return cGroup_4_4; }

		//'port'
		public Keyword getPortKeyword_4_4_0() { return cPortKeyword_4_4_0; }

		//'types'
		public Keyword getTypesKeyword_4_4_1() { return cTypesKeyword_4_4_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_4_2() { return cLeftCurlyBracketKeyword_4_4_2; }

		//portTypes+=MPortType+
		public Assignment getPortTypesAssignment_4_4_3() { return cPortTypesAssignment_4_4_3; }

		//MPortType
		public RuleCall getPortTypesMPortTypeParserRuleCall_4_4_3_0() { return cPortTypesMPortTypeParserRuleCall_4_4_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4_4() { return cRightCurlyBracketKeyword_4_4_4; }

		//';'
		public Keyword getSemicolonKeyword_4_4_5() { return cSemicolonKeyword_4_4_5; }

		//('connectors' '{' connectors+=MConnector+ '}' ';')?
		public Group getGroup_4_5() { return cGroup_4_5; }

		//'connectors'
		public Keyword getConnectorsKeyword_4_5_0() { return cConnectorsKeyword_4_5_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_5_1() { return cLeftCurlyBracketKeyword_4_5_1; }

		//connectors+=MConnector+
		public Assignment getConnectorsAssignment_4_5_2() { return cConnectorsAssignment_4_5_2; }

		//MConnector
		public RuleCall getConnectorsMConnectorParserRuleCall_4_5_2_0() { return cConnectorsMConnectorParserRuleCall_4_5_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_5_3() { return cRightCurlyBracketKeyword_4_5_3; }

		//';'
		public Keyword getSemicolonKeyword_4_5_4() { return cSemicolonKeyword_4_5_4; }

		//('component' 'types' '{' componentTypes+=MAODComponentType+ '}' ';')?
		public Group getGroup_4_6() { return cGroup_4_6; }

		//'component'
		public Keyword getComponentKeyword_4_6_0() { return cComponentKeyword_4_6_0; }

		//'types'
		public Keyword getTypesKeyword_4_6_1() { return cTypesKeyword_4_6_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_6_2() { return cLeftCurlyBracketKeyword_4_6_2; }

		//componentTypes+=MAODComponentType+
		public Assignment getComponentTypesAssignment_4_6_3() { return cComponentTypesAssignment_4_6_3; }

		//MAODComponentType
		public RuleCall getComponentTypesMAODComponentTypeParserRuleCall_4_6_3_0() { return cComponentTypesMAODComponentTypeParserRuleCall_4_6_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_6_4() { return cRightCurlyBracketKeyword_4_6_4; }

		//';'
		public Keyword getSemicolonKeyword_4_6_5() { return cSemicolonKeyword_4_6_5; }

		//('internal' 'instances' '{' componentTypeInstances+=MAODComponentTypeInstance+ '}' ';')?
		public Group getGroup_4_7() { return cGroup_4_7; }

		//'internal'
		public Keyword getInternalKeyword_4_7_0() { return cInternalKeyword_4_7_0; }

		//'instances'
		public Keyword getInstancesKeyword_4_7_1() { return cInstancesKeyword_4_7_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_7_2() { return cLeftCurlyBracketKeyword_4_7_2; }

		//componentTypeInstances+=MAODComponentTypeInstance+
		public Assignment getComponentTypeInstancesAssignment_4_7_3() { return cComponentTypeInstancesAssignment_4_7_3; }

		//MAODComponentTypeInstance
		public RuleCall getComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_4_7_3_0() { return cComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_4_7_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_7_4() { return cRightCurlyBracketKeyword_4_7_4; }

		//';'
		public Keyword getSemicolonKeyword_4_7_5() { return cSemicolonKeyword_4_7_5; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MInterfaceTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MInterfaceType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTypeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cInheritsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInheritsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cInheritsMInterfaceTypeCrossReference_3_1_0 = (CrossReference)cInheritsAssignment_3_1.eContents().get(0);
		private final RuleCall cInheritsMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1 = (RuleCall)cInheritsMInterfaceTypeCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cInheritsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cInheritsMInterfaceTypeCrossReference_3_2_1_0 = (CrossReference)cInheritsAssignment_3_2_1.eContents().get(0);
		private final RuleCall cInheritsMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1 = (RuleCall)cInheritsMInterfaceTypeCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MInterfaceType:
		//	'interface' 'type'
		//	name=ID ('inherits' inherits+=[MInterfaceType|VersionedQualifiedReferenceName] (","
		//	inherits+=[MInterfaceType|VersionedQualifiedReferenceName])*)?
		//	'{'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'interface' 'type' name=ID ('inherits' inherits+=[MInterfaceType|VersionedQualifiedReferenceName] (","
		//inherits+=[MInterfaceType|VersionedQualifiedReferenceName])*)? '{' '}' ';'
		public Group getGroup() { return cGroup; }

		//'interface'
		public Keyword getInterfaceKeyword_0() { return cInterfaceKeyword_0; }

		//'type'
		public Keyword getTypeKeyword_1() { return cTypeKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//('inherits' inherits+=[MInterfaceType|VersionedQualifiedReferenceName] (","
		//inherits+=[MInterfaceType|VersionedQualifiedReferenceName])*)?
		public Group getGroup_3() { return cGroup_3; }

		//'inherits'
		public Keyword getInheritsKeyword_3_0() { return cInheritsKeyword_3_0; }

		//inherits+=[MInterfaceType|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_3_1() { return cInheritsAssignment_3_1; }

		//[MInterfaceType|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMInterfaceTypeCrossReference_3_1_0() { return cInheritsMInterfaceTypeCrossReference_3_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1() { return cInheritsMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1; }

		//("," inherits+=[MInterfaceType|VersionedQualifiedReferenceName])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//inherits+=[MInterfaceType|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_3_2_1() { return cInheritsAssignment_3_2_1; }

		//[MInterfaceType|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMInterfaceTypeCrossReference_3_2_1_0() { return cInheritsMInterfaceTypeCrossReference_3_2_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1() { return cInheritsMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MAODComponentTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MAODComponentType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTypeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cInheritsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInheritsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cInheritsMAODComponentTypeCrossReference_3_1_0 = (CrossReference)cInheritsAssignment_3_1.eContents().get(0);
		private final RuleCall cInheritsMAODComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1 = (RuleCall)cInheritsMAODComponentTypeCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cInheritsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cInheritsMAODComponentTypeCrossReference_3_2_1_0 = (CrossReference)cInheritsAssignment_3_2_1.eContents().get(0);
		private final RuleCall cInheritsMAODComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1 = (RuleCall)cInheritsMAODComponentTypeCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cAttributesKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cAttributesAssignment_5_0_2 = (Assignment)cGroup_5_0.eContents().get(2);
		private final RuleCall cAttributesMParameterParserRuleCall_5_0_2_0 = (RuleCall)cAttributesAssignment_5_0_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_0_3 = (Keyword)cGroup_5_0.eContents().get(3);
		private final Keyword cSemicolonKeyword_5_0_4 = (Keyword)cGroup_5_0.eContents().get(4);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cPortKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cInstancesKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_1_2 = (Keyword)cGroup_5_1.eContents().get(2);
		private final Assignment cPortTypeInstancesAssignment_5_1_3 = (Assignment)cGroup_5_1.eContents().get(3);
		private final RuleCall cPortTypeInstancesMPortTypeInstanceParserRuleCall_5_1_3_0 = (RuleCall)cPortTypeInstancesAssignment_5_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_1_4 = (Keyword)cGroup_5_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_1_5 = (Keyword)cGroup_5_1.eContents().get(5);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cInternalKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Keyword cInstancesKeyword_5_2_1 = (Keyword)cGroup_5_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_2_2 = (Keyword)cGroup_5_2.eContents().get(2);
		private final Assignment cComponentTypeInstancesAssignment_5_2_3 = (Assignment)cGroup_5_2.eContents().get(3);
		private final RuleCall cComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_5_2_3_0 = (RuleCall)cComponentTypeInstancesAssignment_5_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_2_4 = (Keyword)cGroup_5_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_2_5 = (Keyword)cGroup_5_2.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MAODComponentType:
		//	'component' 'type'
		//	name=ID ('inherits' inherits+=[MAODComponentType|VersionedQualifiedReferenceName] (","
		//	inherits+=[MAODComponentType|VersionedQualifiedReferenceName])*)?
		//	'{' (('attributes'
		//	'{'
		//	attributes+=MParameter+
		//	'}' ';')?
		//	& ('port' 'instances'
		//	'{'
		//	portTypeInstances+=MPortTypeInstance+
		//	'}' ';')?
		//	& ('internal' 'instances'
		//	'{'
		//	componentTypeInstances+=MAODComponentTypeInstance+
		//	'}' ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'component' 'type' name=ID ('inherits' inherits+=[MAODComponentType|VersionedQualifiedReferenceName] (","
		//inherits+=[MAODComponentType|VersionedQualifiedReferenceName])*)? '{' (('attributes' '{' attributes+=MParameter+ '}'
		//';')? & ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')? & ('internal' 'instances' '{'
		//componentTypeInstances+=MAODComponentTypeInstance+ '}' ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//'component'
		public Keyword getComponentKeyword_0() { return cComponentKeyword_0; }

		//'type'
		public Keyword getTypeKeyword_1() { return cTypeKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//('inherits' inherits+=[MAODComponentType|VersionedQualifiedReferenceName] (","
		//inherits+=[MAODComponentType|VersionedQualifiedReferenceName])*)?
		public Group getGroup_3() { return cGroup_3; }

		//'inherits'
		public Keyword getInheritsKeyword_3_0() { return cInheritsKeyword_3_0; }

		//inherits+=[MAODComponentType|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_3_1() { return cInheritsAssignment_3_1; }

		//[MAODComponentType|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMAODComponentTypeCrossReference_3_1_0() { return cInheritsMAODComponentTypeCrossReference_3_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMAODComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1() { return cInheritsMAODComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1; }

		//("," inherits+=[MAODComponentType|VersionedQualifiedReferenceName])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//inherits+=[MAODComponentType|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_3_2_1() { return cInheritsAssignment_3_2_1; }

		//[MAODComponentType|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMAODComponentTypeCrossReference_3_2_1_0() { return cInheritsMAODComponentTypeCrossReference_3_2_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMAODComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1() { return cInheritsMAODComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//(('attributes' '{' attributes+=MParameter+ '}' ';')? & ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}'
		//';')? & ('internal' 'instances' '{' componentTypeInstances+=MAODComponentTypeInstance+ '}' ';')?)
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }

		//('attributes' '{' attributes+=MParameter+ '}' ';')?
		public Group getGroup_5_0() { return cGroup_5_0; }

		//'attributes'
		public Keyword getAttributesKeyword_5_0_0() { return cAttributesKeyword_5_0_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_0_1() { return cLeftCurlyBracketKeyword_5_0_1; }

		//attributes+=MParameter+
		public Assignment getAttributesAssignment_5_0_2() { return cAttributesAssignment_5_0_2; }

		//MParameter
		public RuleCall getAttributesMParameterParserRuleCall_5_0_2_0() { return cAttributesMParameterParserRuleCall_5_0_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_0_3() { return cRightCurlyBracketKeyword_5_0_3; }

		//';'
		public Keyword getSemicolonKeyword_5_0_4() { return cSemicolonKeyword_5_0_4; }

		//('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')?
		public Group getGroup_5_1() { return cGroup_5_1; }

		//'port'
		public Keyword getPortKeyword_5_1_0() { return cPortKeyword_5_1_0; }

		//'instances'
		public Keyword getInstancesKeyword_5_1_1() { return cInstancesKeyword_5_1_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1_2() { return cLeftCurlyBracketKeyword_5_1_2; }

		//portTypeInstances+=MPortTypeInstance+
		public Assignment getPortTypeInstancesAssignment_5_1_3() { return cPortTypeInstancesAssignment_5_1_3; }

		//MPortTypeInstance
		public RuleCall getPortTypeInstancesMPortTypeInstanceParserRuleCall_5_1_3_0() { return cPortTypeInstancesMPortTypeInstanceParserRuleCall_5_1_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_1_4() { return cRightCurlyBracketKeyword_5_1_4; }

		//';'
		public Keyword getSemicolonKeyword_5_1_5() { return cSemicolonKeyword_5_1_5; }

		//('internal' 'instances' '{' componentTypeInstances+=MAODComponentTypeInstance+ '}' ';')?
		public Group getGroup_5_2() { return cGroup_5_2; }

		//'internal'
		public Keyword getInternalKeyword_5_2_0() { return cInternalKeyword_5_2_0; }

		//'instances'
		public Keyword getInstancesKeyword_5_2_1() { return cInstancesKeyword_5_2_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_2_2() { return cLeftCurlyBracketKeyword_5_2_2; }

		//componentTypeInstances+=MAODComponentTypeInstance+
		public Assignment getComponentTypeInstancesAssignment_5_2_3() { return cComponentTypeInstancesAssignment_5_2_3; }

		//MAODComponentTypeInstance
		public RuleCall getComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_5_2_3_0() { return cComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_5_2_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_2_4() { return cRightCurlyBracketKeyword_5_2_4; }

		//';'
		public Keyword getSemicolonKeyword_5_2_5() { return cSemicolonKeyword_5_2_5; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MIODCTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MIODCType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMIODAbstractComponentTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMIODComponentTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MIODCType MIODAbstractComponentType:
		//	MIODAbstractComponentType | MIODComponentType
		@Override public ParserRule getRule() { return rule; }

		//MIODAbstractComponentType | MIODComponentType
		public Alternatives getAlternatives() { return cAlternatives; }

		//MIODAbstractComponentType
		public RuleCall getMIODAbstractComponentTypeParserRuleCall_0() { return cMIODAbstractComponentTypeParserRuleCall_0; }

		//MIODComponentType
		public RuleCall getMIODComponentTypeParserRuleCall_1() { return cMIODComponentTypeParserRuleCall_1; }
	}

	public class MIODAbstractComponentTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MIODAbstractComponentType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAbstractKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cComponentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTypeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cInheritsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cInheritsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cInheritsMIODAbstractComponentTypeCrossReference_4_1_0 = (CrossReference)cInheritsAssignment_4_1.eContents().get(0);
		private final RuleCall cInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1 = (RuleCall)cInheritsMIODAbstractComponentTypeCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cInheritsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final CrossReference cInheritsMIODAbstractComponentTypeCrossReference_4_2_1_0 = (CrossReference)cInheritsAssignment_4_2_1.eContents().get(0);
		private final RuleCall cInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1 = (RuleCall)cInheritsMIODAbstractComponentTypeCrossReference_4_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final UnorderedGroup cUnorderedGroup_6 = (UnorderedGroup)cGroup.eContents().get(6);
		private final Group cGroup_6_0 = (Group)cUnorderedGroup_6.eContents().get(0);
		private final Keyword cAttributesKeyword_6_0_0 = (Keyword)cGroup_6_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_0_1 = (Keyword)cGroup_6_0.eContents().get(1);
		private final Assignment cAttributesAssignment_6_0_2 = (Assignment)cGroup_6_0.eContents().get(2);
		private final RuleCall cAttributesMParameterParserRuleCall_6_0_2_0 = (RuleCall)cAttributesAssignment_6_0_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_0_3 = (Keyword)cGroup_6_0.eContents().get(3);
		private final Keyword cSemicolonKeyword_6_0_4 = (Keyword)cGroup_6_0.eContents().get(4);
		private final Group cGroup_6_1 = (Group)cUnorderedGroup_6.eContents().get(1);
		private final Keyword cPortKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Keyword cInstancesKeyword_6_1_1 = (Keyword)cGroup_6_1.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_6_1_2 = (Keyword)cGroup_6_1.eContents().get(2);
		private final Assignment cPortTypeInstancesAssignment_6_1_3 = (Assignment)cGroup_6_1.eContents().get(3);
		private final RuleCall cPortTypeInstancesMPortTypeInstanceParserRuleCall_6_1_3_0 = (RuleCall)cPortTypeInstancesAssignment_6_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_1_4 = (Keyword)cGroup_6_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_6_1_5 = (Keyword)cGroup_6_1.eContents().get(5);
		private final Group cGroup_6_2 = (Group)cUnorderedGroup_6.eContents().get(2);
		private final Keyword cInternalKeyword_6_2_0 = (Keyword)cGroup_6_2.eContents().get(0);
		private final Keyword cInstancesKeyword_6_2_1 = (Keyword)cGroup_6_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_6_2_2 = (Keyword)cGroup_6_2.eContents().get(2);
		private final Assignment cComponentTypeInstancesAssignment_6_2_3 = (Assignment)cGroup_6_2.eContents().get(3);
		private final RuleCall cComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_6_2_3_0 = (RuleCall)cComponentTypeInstancesAssignment_6_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_2_4 = (Keyword)cGroup_6_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_6_2_5 = (Keyword)cGroup_6_2.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MIODAbstractComponentType:
		//	'abstract' 'component' 'type'
		//	name=ID ('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName] (","
		//	inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)?
		//	'{' (('attributes'
		//	'{'
		//	attributes+=MParameter+
		//	'}' ';')?
		//	& ('port' 'instances'
		//	'{'
		//	portTypeInstances+=MPortTypeInstance+
		//	'}' ';')?
		//	& ('internal' 'instances'
		//	'{'
		//	componentTypeInstances+=MIODComponentTypeInstance+
		//	'}' ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'abstract' 'component' 'type' name=ID ('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName]
		//("," inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)? '{' (('attributes' '{'
		//attributes+=MParameter+ '}' ';')? & ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')? &
		//('internal' 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//'abstract'
		public Keyword getAbstractKeyword_0() { return cAbstractKeyword_0; }

		//'component'
		public Keyword getComponentKeyword_1() { return cComponentKeyword_1; }

		//'type'
		public Keyword getTypeKeyword_2() { return cTypeKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName] (","
		//inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)?
		public Group getGroup_4() { return cGroup_4; }

		//'inherits'
		public Keyword getInheritsKeyword_4_0() { return cInheritsKeyword_4_0; }

		//inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_4_1() { return cInheritsAssignment_4_1; }

		//[MIODAbstractComponentType|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMIODAbstractComponentTypeCrossReference_4_1_0() { return cInheritsMIODAbstractComponentTypeCrossReference_4_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1() { return cInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1; }

		//("," inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*
		public Group getGroup_4_2() { return cGroup_4_2; }

		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }

		//inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_4_2_1() { return cInheritsAssignment_4_2_1; }

		//[MIODAbstractComponentType|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMIODAbstractComponentTypeCrossReference_4_2_1_0() { return cInheritsMIODAbstractComponentTypeCrossReference_4_2_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1() { return cInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//(('attributes' '{' attributes+=MParameter+ '}' ';')? & ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}'
		//';')? & ('internal' 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?)
		public UnorderedGroup getUnorderedGroup_6() { return cUnorderedGroup_6; }

		//('attributes' '{' attributes+=MParameter+ '}' ';')?
		public Group getGroup_6_0() { return cGroup_6_0; }

		//'attributes'
		public Keyword getAttributesKeyword_6_0_0() { return cAttributesKeyword_6_0_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_0_1() { return cLeftCurlyBracketKeyword_6_0_1; }

		//attributes+=MParameter+
		public Assignment getAttributesAssignment_6_0_2() { return cAttributesAssignment_6_0_2; }

		//MParameter
		public RuleCall getAttributesMParameterParserRuleCall_6_0_2_0() { return cAttributesMParameterParserRuleCall_6_0_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6_0_3() { return cRightCurlyBracketKeyword_6_0_3; }

		//';'
		public Keyword getSemicolonKeyword_6_0_4() { return cSemicolonKeyword_6_0_4; }

		//('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')?
		public Group getGroup_6_1() { return cGroup_6_1; }

		//'port'
		public Keyword getPortKeyword_6_1_0() { return cPortKeyword_6_1_0; }

		//'instances'
		public Keyword getInstancesKeyword_6_1_1() { return cInstancesKeyword_6_1_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_1_2() { return cLeftCurlyBracketKeyword_6_1_2; }

		//portTypeInstances+=MPortTypeInstance+
		public Assignment getPortTypeInstancesAssignment_6_1_3() { return cPortTypeInstancesAssignment_6_1_3; }

		//MPortTypeInstance
		public RuleCall getPortTypeInstancesMPortTypeInstanceParserRuleCall_6_1_3_0() { return cPortTypeInstancesMPortTypeInstanceParserRuleCall_6_1_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6_1_4() { return cRightCurlyBracketKeyword_6_1_4; }

		//';'
		public Keyword getSemicolonKeyword_6_1_5() { return cSemicolonKeyword_6_1_5; }

		//('internal' 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?
		public Group getGroup_6_2() { return cGroup_6_2; }

		//'internal'
		public Keyword getInternalKeyword_6_2_0() { return cInternalKeyword_6_2_0; }

		//'instances'
		public Keyword getInstancesKeyword_6_2_1() { return cInstancesKeyword_6_2_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_2_2() { return cLeftCurlyBracketKeyword_6_2_2; }

		//componentTypeInstances+=MIODComponentTypeInstance+
		public Assignment getComponentTypeInstancesAssignment_6_2_3() { return cComponentTypeInstancesAssignment_6_2_3; }

		//MIODComponentTypeInstance
		public RuleCall getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_6_2_3_0() { return cComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_6_2_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6_2_4() { return cRightCurlyBracketKeyword_6_2_4; }

		//';'
		public Keyword getSemicolonKeyword_6_2_5() { return cSemicolonKeyword_6_2_5; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class MIODComponentTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MIODComponentType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTypeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cInheritsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInheritsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cInheritsMIODAbstractComponentTypeCrossReference_3_1_0 = (CrossReference)cInheritsAssignment_3_1.eContents().get(0);
		private final RuleCall cInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1 = (RuleCall)cInheritsMIODAbstractComponentTypeCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cInheritsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cInheritsMIODAbstractComponentTypeCrossReference_3_2_1_0 = (CrossReference)cInheritsAssignment_3_2_1.eContents().get(0);
		private final RuleCall cInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1 = (RuleCall)cInheritsMIODAbstractComponentTypeCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cLanguageKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cLanguageAssignment_5_0_2 = (Assignment)cGroup_5_0.eContents().get(2);
		private final CrossReference cLanguageMLanguageCrossReference_5_0_2_0 = (CrossReference)cLanguageAssignment_5_0_2.eContents().get(0);
		private final RuleCall cLanguageMLanguageVersionedQualifiedNameParserRuleCall_5_0_2_0_1 = (RuleCall)cLanguageMLanguageCrossReference_5_0_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_0_3 = (Keyword)cGroup_5_0.eContents().get(3);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cAttributesKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Assignment cAttributesAssignment_5_1_2 = (Assignment)cGroup_5_1.eContents().get(2);
		private final RuleCall cAttributesMParameterParserRuleCall_5_1_2_0 = (RuleCall)cAttributesAssignment_5_1_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_1_3 = (Keyword)cGroup_5_1.eContents().get(3);
		private final Keyword cSemicolonKeyword_5_1_4 = (Keyword)cGroup_5_1.eContents().get(4);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cPortKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Keyword cInstancesKeyword_5_2_1 = (Keyword)cGroup_5_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_2_2 = (Keyword)cGroup_5_2.eContents().get(2);
		private final Assignment cPortTypeInstancesAssignment_5_2_3 = (Assignment)cGroup_5_2.eContents().get(3);
		private final RuleCall cPortTypeInstancesMPortTypeInstanceParserRuleCall_5_2_3_0 = (RuleCall)cPortTypeInstancesAssignment_5_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_2_4 = (Keyword)cGroup_5_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_2_5 = (Keyword)cGroup_5_2.eContents().get(5);
		private final Group cGroup_5_3 = (Group)cUnorderedGroup_5.eContents().get(3);
		private final Keyword cInternalKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Keyword cInstancesKeyword_5_3_1 = (Keyword)cGroup_5_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_3_2 = (Keyword)cGroup_5_3.eContents().get(2);
		private final Assignment cComponentTypeInstancesAssignment_5_3_3 = (Assignment)cGroup_5_3.eContents().get(3);
		private final RuleCall cComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_5_3_3_0 = (RuleCall)cComponentTypeInstancesAssignment_5_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3_4 = (Keyword)cGroup_5_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_3_5 = (Keyword)cGroup_5_3.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MIODComponentType:
		//	'component' 'type'
		//	name=ID ('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName] (","
		//	inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)?
		//	'{' ('language' ':=' language=[system::MLanguage|VersionedQualifiedName] ';' & ('attributes'
		//	'{'
		//	attributes+=MParameter+
		//	'}' ';')?
		//	& ('port' 'instances'
		//	'{'
		//	portTypeInstances+=MPortTypeInstance+
		//	'}' ';')?
		//	& ('internal' 'instances'
		//	'{'
		//	componentTypeInstances+=MIODComponentTypeInstance+
		//	'}' ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'component' 'type' name=ID ('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName] (","
		//inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)? '{' ('language' ':='
		//language=[system::MLanguage|VersionedQualifiedName] ';' & ('attributes' '{' attributes+=MParameter+ '}' ';')? & ('port'
		//'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')? & ('internal' 'instances' '{'
		//componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//'component'
		public Keyword getComponentKeyword_0() { return cComponentKeyword_0; }

		//'type'
		public Keyword getTypeKeyword_1() { return cTypeKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName] (","
		//inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)?
		public Group getGroup_3() { return cGroup_3; }

		//'inherits'
		public Keyword getInheritsKeyword_3_0() { return cInheritsKeyword_3_0; }

		//inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_3_1() { return cInheritsAssignment_3_1; }

		//[MIODAbstractComponentType|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMIODAbstractComponentTypeCrossReference_3_1_0() { return cInheritsMIODAbstractComponentTypeCrossReference_3_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1() { return cInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1; }

		//("," inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_3_2_1() { return cInheritsAssignment_3_2_1; }

		//[MIODAbstractComponentType|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMIODAbstractComponentTypeCrossReference_3_2_1_0() { return cInheritsMIODAbstractComponentTypeCrossReference_3_2_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1() { return cInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//('language' ':=' language=[system::MLanguage|VersionedQualifiedName] ';' & ('attributes' '{' attributes+=MParameter+ '}'
		//';')? & ('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')? & ('internal' 'instances' '{'
		//componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?)
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }

		//'language' ':=' language=[system::MLanguage|VersionedQualifiedName] ';'
		public Group getGroup_5_0() { return cGroup_5_0; }

		//'language'
		public Keyword getLanguageKeyword_5_0_0() { return cLanguageKeyword_5_0_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_5_0_1() { return cColonEqualsSignKeyword_5_0_1; }

		//language=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguageAssignment_5_0_2() { return cLanguageAssignment_5_0_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguageMLanguageCrossReference_5_0_2_0() { return cLanguageMLanguageCrossReference_5_0_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguageMLanguageVersionedQualifiedNameParserRuleCall_5_0_2_0_1() { return cLanguageMLanguageVersionedQualifiedNameParserRuleCall_5_0_2_0_1; }

		//';'
		public Keyword getSemicolonKeyword_5_0_3() { return cSemicolonKeyword_5_0_3; }

		//('attributes' '{' attributes+=MParameter+ '}' ';')?
		public Group getGroup_5_1() { return cGroup_5_1; }

		//'attributes'
		public Keyword getAttributesKeyword_5_1_0() { return cAttributesKeyword_5_1_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1_1() { return cLeftCurlyBracketKeyword_5_1_1; }

		//attributes+=MParameter+
		public Assignment getAttributesAssignment_5_1_2() { return cAttributesAssignment_5_1_2; }

		//MParameter
		public RuleCall getAttributesMParameterParserRuleCall_5_1_2_0() { return cAttributesMParameterParserRuleCall_5_1_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_1_3() { return cRightCurlyBracketKeyword_5_1_3; }

		//';'
		public Keyword getSemicolonKeyword_5_1_4() { return cSemicolonKeyword_5_1_4; }

		//('port' 'instances' '{' portTypeInstances+=MPortTypeInstance+ '}' ';')?
		public Group getGroup_5_2() { return cGroup_5_2; }

		//'port'
		public Keyword getPortKeyword_5_2_0() { return cPortKeyword_5_2_0; }

		//'instances'
		public Keyword getInstancesKeyword_5_2_1() { return cInstancesKeyword_5_2_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_2_2() { return cLeftCurlyBracketKeyword_5_2_2; }

		//portTypeInstances+=MPortTypeInstance+
		public Assignment getPortTypeInstancesAssignment_5_2_3() { return cPortTypeInstancesAssignment_5_2_3; }

		//MPortTypeInstance
		public RuleCall getPortTypeInstancesMPortTypeInstanceParserRuleCall_5_2_3_0() { return cPortTypeInstancesMPortTypeInstanceParserRuleCall_5_2_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_2_4() { return cRightCurlyBracketKeyword_5_2_4; }

		//';'
		public Keyword getSemicolonKeyword_5_2_5() { return cSemicolonKeyword_5_2_5; }

		//('internal' 'instances' '{' componentTypeInstances+=MIODComponentTypeInstance+ '}' ';')?
		public Group getGroup_5_3() { return cGroup_5_3; }

		//'internal'
		public Keyword getInternalKeyword_5_3_0() { return cInternalKeyword_5_3_0; }

		//'instances'
		public Keyword getInstancesKeyword_5_3_1() { return cInstancesKeyword_5_3_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_3_2() { return cLeftCurlyBracketKeyword_5_3_2; }

		//componentTypeInstances+=MIODComponentTypeInstance+
		public Assignment getComponentTypeInstancesAssignment_5_3_3() { return cComponentTypeInstancesAssignment_5_3_3; }

		//MIODComponentTypeInstance
		public RuleCall getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_5_3_3_0() { return cComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_5_3_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_3_4() { return cRightCurlyBracketKeyword_5_3_4; }

		//';'
		public Keyword getSemicolonKeyword_5_3_5() { return cSemicolonKeyword_5_3_5; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MIODComponentTypeInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MIODComponentTypeInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cComponentTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cComponentTypeMIODAbstractComponentTypeCrossReference_1_0 = (CrossReference)cComponentTypeAssignment_1.eContents().get(0);
		private final RuleCall cComponentTypeMIODAbstractComponentTypeIDTerminalRuleCall_1_0_1 = (RuleCall)cComponentTypeMIODAbstractComponentTypeCrossReference_1_0.eContents().get(1);
		private final Keyword cRangeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLowerBoundAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLowerBoundMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cLowerBoundAssignment_3.eContents().get(0);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cUpperBoundAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cUpperBoundMParameterValueExpressionParserRuleCall_5_0 = (RuleCall)cUpperBoundAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MIODComponentTypeInstance:
		//	'type'
		//	componentType=[MIODAbstractComponentType]
		//	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
		//	';';
		@Override public ParserRule getRule() { return rule; }

		//'type' componentType=[MIODAbstractComponentType] 'range' lowerBound=MParameterValueExpression 'to'
		//upperBound=MParameterValueExpression ';'
		public Group getGroup() { return cGroup; }

		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }

		//componentType=[MIODAbstractComponentType]
		public Assignment getComponentTypeAssignment_1() { return cComponentTypeAssignment_1; }

		//[MIODAbstractComponentType]
		public CrossReference getComponentTypeMIODAbstractComponentTypeCrossReference_1_0() { return cComponentTypeMIODAbstractComponentTypeCrossReference_1_0; }

		//ID
		public RuleCall getComponentTypeMIODAbstractComponentTypeIDTerminalRuleCall_1_0_1() { return cComponentTypeMIODAbstractComponentTypeIDTerminalRuleCall_1_0_1; }

		//'range'
		public Keyword getRangeKeyword_2() { return cRangeKeyword_2; }

		//lowerBound=MParameterValueExpression
		public Assignment getLowerBoundAssignment_3() { return cLowerBoundAssignment_3; }

		//MParameterValueExpression
		public RuleCall getLowerBoundMParameterValueExpressionParserRuleCall_3_0() { return cLowerBoundMParameterValueExpressionParserRuleCall_3_0; }

		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }

		//upperBound=MParameterValueExpression
		public Assignment getUpperBoundAssignment_5() { return cUpperBoundAssignment_5; }

		//MParameterValueExpression
		public RuleCall getUpperBoundMParameterValueExpressionParserRuleCall_5_0() { return cUpperBoundMParameterValueExpressionParserRuleCall_5_0; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MAODComponentTypeInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MAODComponentTypeInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cComponentTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cComponentTypeMAODComponentTypeCrossReference_1_0 = (CrossReference)cComponentTypeAssignment_1.eContents().get(0);
		private final RuleCall cComponentTypeMAODComponentTypeIDTerminalRuleCall_1_0_1 = (RuleCall)cComponentTypeMAODComponentTypeCrossReference_1_0.eContents().get(1);
		private final Keyword cRangeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLowerBoundAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLowerBoundMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cLowerBoundAssignment_3.eContents().get(0);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cUpperBoundAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cUpperBoundMParameterValueExpressionParserRuleCall_5_0 = (RuleCall)cUpperBoundAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MAODComponentTypeInstance:
		//	'type'
		//	componentType=[MAODComponentType]
		//	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
		//	';';
		@Override public ParserRule getRule() { return rule; }

		//'type' componentType=[MAODComponentType] 'range' lowerBound=MParameterValueExpression 'to'
		//upperBound=MParameterValueExpression ';'
		public Group getGroup() { return cGroup; }

		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }

		//componentType=[MAODComponentType]
		public Assignment getComponentTypeAssignment_1() { return cComponentTypeAssignment_1; }

		//[MAODComponentType]
		public CrossReference getComponentTypeMAODComponentTypeCrossReference_1_0() { return cComponentTypeMAODComponentTypeCrossReference_1_0; }

		//ID
		public RuleCall getComponentTypeMAODComponentTypeIDTerminalRuleCall_1_0_1() { return cComponentTypeMAODComponentTypeIDTerminalRuleCall_1_0_1; }

		//'range'
		public Keyword getRangeKeyword_2() { return cRangeKeyword_2; }

		//lowerBound=MParameterValueExpression
		public Assignment getLowerBoundAssignment_3() { return cLowerBoundAssignment_3; }

		//MParameterValueExpression
		public RuleCall getLowerBoundMParameterValueExpressionParserRuleCall_3_0() { return cLowerBoundMParameterValueExpressionParserRuleCall_3_0; }

		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }

		//upperBound=MParameterValueExpression
		public Assignment getUpperBoundAssignment_5() { return cUpperBoundAssignment_5; }

		//MParameterValueExpression
		public RuleCall getUpperBoundMParameterValueExpressionParserRuleCall_5_0() { return cUpperBoundMParameterValueExpressionParserRuleCall_5_0; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MPortTypeInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MPortTypeInstance");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMExternalPortTypeInstanceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMInternalPortTypeInstanceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MPortTypeInstance:
		//	MExternalPortTypeInstance | MInternalPortTypeInstance;
		@Override public ParserRule getRule() { return rule; }

		//MExternalPortTypeInstance | MInternalPortTypeInstance
		public Alternatives getAlternatives() { return cAlternatives; }

		//MExternalPortTypeInstance
		public RuleCall getMExternalPortTypeInstanceParserRuleCall_0() { return cMExternalPortTypeInstanceParserRuleCall_0; }

		//MInternalPortTypeInstance
		public RuleCall getMInternalPortTypeInstanceParserRuleCall_1() { return cMInternalPortTypeInstanceParserRuleCall_1; }
	}

	public class MExternalPortTypeInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MExternalPortTypeInstance");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMExternalClientPortTypeInstanceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMExternalServerPortTypeInstanceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MExternalPortTypeInstance:
		//	MExternalClientPortTypeInstance | MExternalServerPortTypeInstance;
		@Override public ParserRule getRule() { return rule; }

		//MExternalClientPortTypeInstance | MExternalServerPortTypeInstance
		public Alternatives getAlternatives() { return cAlternatives; }

		//MExternalClientPortTypeInstance
		public RuleCall getMExternalClientPortTypeInstanceParserRuleCall_0() { return cMExternalClientPortTypeInstanceParserRuleCall_0; }

		//MExternalServerPortTypeInstance
		public RuleCall getMExternalServerPortTypeInstanceParserRuleCall_1() { return cMExternalServerPortTypeInstanceParserRuleCall_1; }
	}

	public class MExternalClientPortTypeInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MExternalClientPortTypeInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExternalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cClientKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPortTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cPortTypeMPortTypeCrossReference_2_0 = (CrossReference)cPortTypeAssignment_2.eContents().get(0);
		private final RuleCall cPortTypeMPortTypeIDTerminalRuleCall_2_0_1 = (RuleCall)cPortTypeMPortTypeCrossReference_2_0.eContents().get(1);
		private final Keyword cRangeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLowerBoundAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLowerBoundMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cLowerBoundAssignment_4.eContents().get(0);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cUpperBoundAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cUpperBoundMParameterValueExpressionParserRuleCall_6_0 = (RuleCall)cUpperBoundAssignment_6.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MExternalClientPortTypeInstance:
		//	'external' 'client'
		//	portType=[MPortType]
		//	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
		//	';';
		@Override public ParserRule getRule() { return rule; }

		//'external' 'client' portType=[MPortType] 'range' lowerBound=MParameterValueExpression 'to'
		//upperBound=MParameterValueExpression ';'
		public Group getGroup() { return cGroup; }

		//'external'
		public Keyword getExternalKeyword_0() { return cExternalKeyword_0; }

		//'client'
		public Keyword getClientKeyword_1() { return cClientKeyword_1; }

		//portType=[MPortType]
		public Assignment getPortTypeAssignment_2() { return cPortTypeAssignment_2; }

		//[MPortType]
		public CrossReference getPortTypeMPortTypeCrossReference_2_0() { return cPortTypeMPortTypeCrossReference_2_0; }

		//ID
		public RuleCall getPortTypeMPortTypeIDTerminalRuleCall_2_0_1() { return cPortTypeMPortTypeIDTerminalRuleCall_2_0_1; }

		//'range'
		public Keyword getRangeKeyword_3() { return cRangeKeyword_3; }

		//lowerBound=MParameterValueExpression
		public Assignment getLowerBoundAssignment_4() { return cLowerBoundAssignment_4; }

		//MParameterValueExpression
		public RuleCall getLowerBoundMParameterValueExpressionParserRuleCall_4_0() { return cLowerBoundMParameterValueExpressionParserRuleCall_4_0; }

		//'to'
		public Keyword getToKeyword_5() { return cToKeyword_5; }

		//upperBound=MParameterValueExpression
		public Assignment getUpperBoundAssignment_6() { return cUpperBoundAssignment_6; }

		//MParameterValueExpression
		public RuleCall getUpperBoundMParameterValueExpressionParserRuleCall_6_0() { return cUpperBoundMParameterValueExpressionParserRuleCall_6_0; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MExternalServerPortTypeInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MExternalServerPortTypeInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExternalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cServerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPortTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cPortTypeMPortTypeCrossReference_2_0 = (CrossReference)cPortTypeAssignment_2.eContents().get(0);
		private final RuleCall cPortTypeMPortTypeIDTerminalRuleCall_2_0_1 = (RuleCall)cPortTypeMPortTypeCrossReference_2_0.eContents().get(1);
		private final Keyword cRangeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLowerBoundAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLowerBoundMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cLowerBoundAssignment_4.eContents().get(0);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cUpperBoundAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cUpperBoundMParameterValueExpressionParserRuleCall_6_0 = (RuleCall)cUpperBoundAssignment_6.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MExternalServerPortTypeInstance:
		//	'external' 'server'
		//	portType=[MPortType]
		//	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
		//	';';
		@Override public ParserRule getRule() { return rule; }

		//'external' 'server' portType=[MPortType] 'range' lowerBound=MParameterValueExpression 'to'
		//upperBound=MParameterValueExpression ';'
		public Group getGroup() { return cGroup; }

		//'external'
		public Keyword getExternalKeyword_0() { return cExternalKeyword_0; }

		//'server'
		public Keyword getServerKeyword_1() { return cServerKeyword_1; }

		//portType=[MPortType]
		public Assignment getPortTypeAssignment_2() { return cPortTypeAssignment_2; }

		//[MPortType]
		public CrossReference getPortTypeMPortTypeCrossReference_2_0() { return cPortTypeMPortTypeCrossReference_2_0; }

		//ID
		public RuleCall getPortTypeMPortTypeIDTerminalRuleCall_2_0_1() { return cPortTypeMPortTypeIDTerminalRuleCall_2_0_1; }

		//'range'
		public Keyword getRangeKeyword_3() { return cRangeKeyword_3; }

		//lowerBound=MParameterValueExpression
		public Assignment getLowerBoundAssignment_4() { return cLowerBoundAssignment_4; }

		//MParameterValueExpression
		public RuleCall getLowerBoundMParameterValueExpressionParserRuleCall_4_0() { return cLowerBoundMParameterValueExpressionParserRuleCall_4_0; }

		//'to'
		public Keyword getToKeyword_5() { return cToKeyword_5; }

		//upperBound=MParameterValueExpression
		public Assignment getUpperBoundAssignment_6() { return cUpperBoundAssignment_6; }

		//MParameterValueExpression
		public RuleCall getUpperBoundMParameterValueExpressionParserRuleCall_6_0() { return cUpperBoundMParameterValueExpressionParserRuleCall_6_0; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MInternalPortTypeInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MInternalPortTypeInstance");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMInternalClientPortTypeInstanceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMInternalServerPortTypeInstanceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MInternalPortTypeInstance:
		//	MInternalClientPortTypeInstance | MInternalServerPortTypeInstance;
		@Override public ParserRule getRule() { return rule; }

		//MInternalClientPortTypeInstance | MInternalServerPortTypeInstance
		public Alternatives getAlternatives() { return cAlternatives; }

		//MInternalClientPortTypeInstance
		public RuleCall getMInternalClientPortTypeInstanceParserRuleCall_0() { return cMInternalClientPortTypeInstanceParserRuleCall_0; }

		//MInternalServerPortTypeInstance
		public RuleCall getMInternalServerPortTypeInstanceParserRuleCall_1() { return cMInternalServerPortTypeInstanceParserRuleCall_1; }
	}

	public class MInternalClientPortTypeInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MInternalClientPortTypeInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInternalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cClientKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPortTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cPortTypeMPortTypeCrossReference_2_0 = (CrossReference)cPortTypeAssignment_2.eContents().get(0);
		private final RuleCall cPortTypeMPortTypeIDTerminalRuleCall_2_0_1 = (RuleCall)cPortTypeMPortTypeCrossReference_2_0.eContents().get(1);
		private final Keyword cRangeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLowerBoundAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLowerBoundMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cLowerBoundAssignment_4.eContents().get(0);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cUpperBoundAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cUpperBoundMParameterValueExpressionParserRuleCall_6_0 = (RuleCall)cUpperBoundAssignment_6.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MInternalClientPortTypeInstance:
		//	'internal' 'client'
		//	portType=[MPortType]
		//	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
		//	';';
		@Override public ParserRule getRule() { return rule; }

		//'internal' 'client' portType=[MPortType] 'range' lowerBound=MParameterValueExpression 'to'
		//upperBound=MParameterValueExpression ';'
		public Group getGroup() { return cGroup; }

		//'internal'
		public Keyword getInternalKeyword_0() { return cInternalKeyword_0; }

		//'client'
		public Keyword getClientKeyword_1() { return cClientKeyword_1; }

		//portType=[MPortType]
		public Assignment getPortTypeAssignment_2() { return cPortTypeAssignment_2; }

		//[MPortType]
		public CrossReference getPortTypeMPortTypeCrossReference_2_0() { return cPortTypeMPortTypeCrossReference_2_0; }

		//ID
		public RuleCall getPortTypeMPortTypeIDTerminalRuleCall_2_0_1() { return cPortTypeMPortTypeIDTerminalRuleCall_2_0_1; }

		//'range'
		public Keyword getRangeKeyword_3() { return cRangeKeyword_3; }

		//lowerBound=MParameterValueExpression
		public Assignment getLowerBoundAssignment_4() { return cLowerBoundAssignment_4; }

		//MParameterValueExpression
		public RuleCall getLowerBoundMParameterValueExpressionParserRuleCall_4_0() { return cLowerBoundMParameterValueExpressionParserRuleCall_4_0; }

		//'to'
		public Keyword getToKeyword_5() { return cToKeyword_5; }

		//upperBound=MParameterValueExpression
		public Assignment getUpperBoundAssignment_6() { return cUpperBoundAssignment_6; }

		//MParameterValueExpression
		public RuleCall getUpperBoundMParameterValueExpressionParserRuleCall_6_0() { return cUpperBoundMParameterValueExpressionParserRuleCall_6_0; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MInternalServerPortTypeInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MInternalServerPortTypeInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInternalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cServerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPortTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cPortTypeMPortTypeCrossReference_2_0 = (CrossReference)cPortTypeAssignment_2.eContents().get(0);
		private final RuleCall cPortTypeMPortTypeIDTerminalRuleCall_2_0_1 = (RuleCall)cPortTypeMPortTypeCrossReference_2_0.eContents().get(1);
		private final Keyword cRangeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLowerBoundAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLowerBoundMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cLowerBoundAssignment_4.eContents().get(0);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cUpperBoundAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cUpperBoundMParameterValueExpressionParserRuleCall_6_0 = (RuleCall)cUpperBoundAssignment_6.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MInternalServerPortTypeInstance:
		//	'internal' 'server'
		//	portType=[MPortType]
		//	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
		//	';';
		@Override public ParserRule getRule() { return rule; }

		//'internal' 'server' portType=[MPortType] 'range' lowerBound=MParameterValueExpression 'to'
		//upperBound=MParameterValueExpression ';'
		public Group getGroup() { return cGroup; }

		//'internal'
		public Keyword getInternalKeyword_0() { return cInternalKeyword_0; }

		//'server'
		public Keyword getServerKeyword_1() { return cServerKeyword_1; }

		//portType=[MPortType]
		public Assignment getPortTypeAssignment_2() { return cPortTypeAssignment_2; }

		//[MPortType]
		public CrossReference getPortTypeMPortTypeCrossReference_2_0() { return cPortTypeMPortTypeCrossReference_2_0; }

		//ID
		public RuleCall getPortTypeMPortTypeIDTerminalRuleCall_2_0_1() { return cPortTypeMPortTypeIDTerminalRuleCall_2_0_1; }

		//'range'
		public Keyword getRangeKeyword_3() { return cRangeKeyword_3; }

		//lowerBound=MParameterValueExpression
		public Assignment getLowerBoundAssignment_4() { return cLowerBoundAssignment_4; }

		//MParameterValueExpression
		public RuleCall getLowerBoundMParameterValueExpressionParserRuleCall_4_0() { return cLowerBoundMParameterValueExpressionParserRuleCall_4_0; }

		//'to'
		public Keyword getToKeyword_5() { return cToKeyword_5; }

		//upperBound=MParameterValueExpression
		public Assignment getUpperBoundAssignment_6() { return cUpperBoundAssignment_6; }

		//MParameterValueExpression
		public RuleCall getUpperBoundMParameterValueExpressionParserRuleCall_6_0() { return cUpperBoundMParameterValueExpressionParserRuleCall_6_0; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MPortTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MPortType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMPortTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPortKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTypeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cInheritsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cInheritsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cInheritsMPortTypeCrossReference_4_1_0 = (CrossReference)cInheritsAssignment_4_1.eContents().get(0);
		private final RuleCall cInheritsMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1 = (RuleCall)cInheritsMPortTypeCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cInheritsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final CrossReference cInheritsMPortTypeCrossReference_4_2_1_0 = (CrossReference)cInheritsAssignment_4_2_1.eContents().get(0);
		private final RuleCall cInheritsMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1 = (RuleCall)cInheritsMPortTypeCrossReference_4_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final UnorderedGroup cUnorderedGroup_6 = (UnorderedGroup)cGroup.eContents().get(6);
		private final Group cGroup_6_0 = (Group)cUnorderedGroup_6.eContents().get(0);
		private final Keyword cInterfaceKeyword_6_0_0 = (Keyword)cGroup_6_0.eContents().get(0);
		private final Keyword cTypesKeyword_6_0_1 = (Keyword)cGroup_6_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_6_0_2 = (Keyword)cGroup_6_0.eContents().get(2);
		private final Assignment cInterfaceTypesAssignment_6_0_3 = (Assignment)cGroup_6_0.eContents().get(3);
		private final CrossReference cInterfaceTypesMInterfaceTypeCrossReference_6_0_3_0 = (CrossReference)cInterfaceTypesAssignment_6_0_3.eContents().get(0);
		private final RuleCall cInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_6_0_3_0_1 = (RuleCall)cInterfaceTypesMInterfaceTypeCrossReference_6_0_3_0.eContents().get(1);
		private final Group cGroup_6_0_4 = (Group)cGroup_6_0.eContents().get(4);
		private final Keyword cCommaKeyword_6_0_4_0 = (Keyword)cGroup_6_0_4.eContents().get(0);
		private final Assignment cInterfaceTypesAssignment_6_0_4_1 = (Assignment)cGroup_6_0_4.eContents().get(1);
		private final CrossReference cInterfaceTypesMInterfaceTypeCrossReference_6_0_4_1_0 = (CrossReference)cInterfaceTypesAssignment_6_0_4_1.eContents().get(0);
		private final RuleCall cInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_6_0_4_1_0_1 = (RuleCall)cInterfaceTypesMInterfaceTypeCrossReference_6_0_4_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6_0_5 = (Keyword)cGroup_6_0.eContents().get(5);
		private final Group cGroup_6_1 = (Group)cUnorderedGroup_6.eContents().get(1);
		private final Keyword cAttributesKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1_1 = (Keyword)cGroup_6_1.eContents().get(1);
		private final Assignment cAttributesAssignment_6_1_2 = (Assignment)cGroup_6_1.eContents().get(2);
		private final RuleCall cAttributesMParameterParserRuleCall_6_1_2_0 = (RuleCall)cAttributesAssignment_6_1_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_1_3 = (Keyword)cGroup_6_1.eContents().get(3);
		private final Keyword cSemicolonKeyword_6_1_4 = (Keyword)cGroup_6_1.eContents().get(4);
		private final Group cGroup_6_2 = (Group)cUnorderedGroup_6.eContents().get(2);
		private final Keyword cClientKeyword_6_2_0 = (Keyword)cGroup_6_2.eContents().get(0);
		private final Keyword cAttributesKeyword_6_2_1 = (Keyword)cGroup_6_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_6_2_2 = (Keyword)cGroup_6_2.eContents().get(2);
		private final Assignment cClientAttributesAssignment_6_2_3 = (Assignment)cGroup_6_2.eContents().get(3);
		private final RuleCall cClientAttributesMParameterParserRuleCall_6_2_3_0 = (RuleCall)cClientAttributesAssignment_6_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_2_4 = (Keyword)cGroup_6_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_6_2_5 = (Keyword)cGroup_6_2.eContents().get(5);
		private final Group cGroup_6_3 = (Group)cUnorderedGroup_6.eContents().get(3);
		private final Keyword cServerKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Keyword cAttributesKeyword_6_3_1 = (Keyword)cGroup_6_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_6_3_2 = (Keyword)cGroup_6_3.eContents().get(2);
		private final Assignment cServerAttributesAssignment_6_3_3 = (Assignment)cGroup_6_3.eContents().get(3);
		private final RuleCall cServerAttributesMParameterParserRuleCall_6_3_3_0 = (RuleCall)cServerAttributesAssignment_6_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_3_4 = (Keyword)cGroup_6_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_6_3_5 = (Keyword)cGroup_6_3.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MPortType:
		//	{MPortType}
		//	'port' 'type'
		//	name=ID ('inherits' inherits+=[MPortType|VersionedQualifiedReferenceName] (","
		//	inherits+=[MPortType|VersionedQualifiedReferenceName])*)?
		//	'{' ('interface' 'types' ':=' interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
		//	interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';' & ('attributes'
		//	'{'
		//	attributes+=MParameter+
		//	'}' ';')?
		//	& ('client' 'attributes'
		//	'{'
		//	clientAttributes+=MParameter+
		//	'}' ';')?
		//	& ('server' 'attributes'
		//	'{'
		//	serverAttributes+=MParameter+
		//	'}' ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//{MPortType} 'port' 'type' name=ID ('inherits' inherits+=[MPortType|VersionedQualifiedReferenceName] (","
		//inherits+=[MPortType|VersionedQualifiedReferenceName])*)? '{' ('interface' 'types' ':='
		//interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
		//interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';' & ('attributes' '{' attributes+=MParameter+ '}'
		//';')? & ('client' 'attributes' '{' clientAttributes+=MParameter+ '}' ';')? & ('server' 'attributes' '{'
		//serverAttributes+=MParameter+ '}' ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//{MPortType}
		public Action getMPortTypeAction_0() { return cMPortTypeAction_0; }

		//'port'
		public Keyword getPortKeyword_1() { return cPortKeyword_1; }

		//'type'
		public Keyword getTypeKeyword_2() { return cTypeKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//('inherits' inherits+=[MPortType|VersionedQualifiedReferenceName] (","
		//inherits+=[MPortType|VersionedQualifiedReferenceName])*)?
		public Group getGroup_4() { return cGroup_4; }

		//'inherits'
		public Keyword getInheritsKeyword_4_0() { return cInheritsKeyword_4_0; }

		//inherits+=[MPortType|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_4_1() { return cInheritsAssignment_4_1; }

		//[MPortType|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMPortTypeCrossReference_4_1_0() { return cInheritsMPortTypeCrossReference_4_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1() { return cInheritsMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1; }

		//("," inherits+=[MPortType|VersionedQualifiedReferenceName])*
		public Group getGroup_4_2() { return cGroup_4_2; }

		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }

		//inherits+=[MPortType|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_4_2_1() { return cInheritsAssignment_4_2_1; }

		//[MPortType|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMPortTypeCrossReference_4_2_1_0() { return cInheritsMPortTypeCrossReference_4_2_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1() { return cInheritsMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//('interface' 'types' ':=' interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
		//interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';' & ('attributes' '{' attributes+=MParameter+ '}'
		//';')? & ('client' 'attributes' '{' clientAttributes+=MParameter+ '}' ';')? & ('server' 'attributes' '{'
		//serverAttributes+=MParameter+ '}' ';')?)
		public UnorderedGroup getUnorderedGroup_6() { return cUnorderedGroup_6; }

		//'interface' 'types' ':=' interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
		//interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';'
		public Group getGroup_6_0() { return cGroup_6_0; }

		//'interface'
		public Keyword getInterfaceKeyword_6_0_0() { return cInterfaceKeyword_6_0_0; }

		//'types'
		public Keyword getTypesKeyword_6_0_1() { return cTypesKeyword_6_0_1; }

		//':='
		public Keyword getColonEqualsSignKeyword_6_0_2() { return cColonEqualsSignKeyword_6_0_2; }

		//interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName]
		public Assignment getInterfaceTypesAssignment_6_0_3() { return cInterfaceTypesAssignment_6_0_3; }

		//[MInterfaceType|VersionedQualifiedReferenceName]
		public CrossReference getInterfaceTypesMInterfaceTypeCrossReference_6_0_3_0() { return cInterfaceTypesMInterfaceTypeCrossReference_6_0_3_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_6_0_3_0_1() { return cInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_6_0_3_0_1; }

		//("," interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])*
		public Group getGroup_6_0_4() { return cGroup_6_0_4; }

		//","
		public Keyword getCommaKeyword_6_0_4_0() { return cCommaKeyword_6_0_4_0; }

		//interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName]
		public Assignment getInterfaceTypesAssignment_6_0_4_1() { return cInterfaceTypesAssignment_6_0_4_1; }

		//[MInterfaceType|VersionedQualifiedReferenceName]
		public CrossReference getInterfaceTypesMInterfaceTypeCrossReference_6_0_4_1_0() { return cInterfaceTypesMInterfaceTypeCrossReference_6_0_4_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_6_0_4_1_0_1() { return cInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_6_0_4_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_6_0_5() { return cSemicolonKeyword_6_0_5; }

		//('attributes' '{' attributes+=MParameter+ '}' ';')?
		public Group getGroup_6_1() { return cGroup_6_1; }

		//'attributes'
		public Keyword getAttributesKeyword_6_1_0() { return cAttributesKeyword_6_1_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_1_1() { return cLeftCurlyBracketKeyword_6_1_1; }

		//attributes+=MParameter+
		public Assignment getAttributesAssignment_6_1_2() { return cAttributesAssignment_6_1_2; }

		//MParameter
		public RuleCall getAttributesMParameterParserRuleCall_6_1_2_0() { return cAttributesMParameterParserRuleCall_6_1_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6_1_3() { return cRightCurlyBracketKeyword_6_1_3; }

		//';'
		public Keyword getSemicolonKeyword_6_1_4() { return cSemicolonKeyword_6_1_4; }

		//('client' 'attributes' '{' clientAttributes+=MParameter+ '}' ';')?
		public Group getGroup_6_2() { return cGroup_6_2; }

		//'client'
		public Keyword getClientKeyword_6_2_0() { return cClientKeyword_6_2_0; }

		//'attributes'
		public Keyword getAttributesKeyword_6_2_1() { return cAttributesKeyword_6_2_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_2_2() { return cLeftCurlyBracketKeyword_6_2_2; }

		//clientAttributes+=MParameter+
		public Assignment getClientAttributesAssignment_6_2_3() { return cClientAttributesAssignment_6_2_3; }

		//MParameter
		public RuleCall getClientAttributesMParameterParserRuleCall_6_2_3_0() { return cClientAttributesMParameterParserRuleCall_6_2_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6_2_4() { return cRightCurlyBracketKeyword_6_2_4; }

		//';'
		public Keyword getSemicolonKeyword_6_2_5() { return cSemicolonKeyword_6_2_5; }

		//('server' 'attributes' '{' serverAttributes+=MParameter+ '}' ';')?
		public Group getGroup_6_3() { return cGroup_6_3; }

		//'server'
		public Keyword getServerKeyword_6_3_0() { return cServerKeyword_6_3_0; }

		//'attributes'
		public Keyword getAttributesKeyword_6_3_1() { return cAttributesKeyword_6_3_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_3_2() { return cLeftCurlyBracketKeyword_6_3_2; }

		//serverAttributes+=MParameter+
		public Assignment getServerAttributesAssignment_6_3_3() { return cServerAttributesAssignment_6_3_3; }

		//MParameter
		public RuleCall getServerAttributesMParameterParserRuleCall_6_3_3_0() { return cServerAttributesMParameterParserRuleCall_6_3_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6_3_4() { return cRightCurlyBracketKeyword_6_3_4; }

		//';'
		public Keyword getSemicolonKeyword_6_3_5() { return cSemicolonKeyword_6_3_5; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class MExchangeModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MExchangeModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMExchangeModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cExchangeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cModelKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cInheritsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cInheritsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cInheritsMExchangeModelCrossReference_4_1_0 = (CrossReference)cInheritsAssignment_4_1.eContents().get(0);
		private final RuleCall cInheritsMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1 = (RuleCall)cInheritsMExchangeModelCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cInheritsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final CrossReference cInheritsMExchangeModelCrossReference_4_2_1_0 = (CrossReference)cInheritsAssignment_4_2_1.eContents().get(0);
		private final RuleCall cInheritsMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1 = (RuleCall)cInheritsMExchangeModelCrossReference_4_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cInterfaceKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cTypesKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cColonEqualsSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cInterfaceTypesAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final CrossReference cInterfaceTypesMInterfaceTypeCrossReference_9_0 = (CrossReference)cInterfaceTypesAssignment_9.eContents().get(0);
		private final RuleCall cInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_9_0_1 = (RuleCall)cInterfaceTypesMInterfaceTypeCrossReference_9_0.eContents().get(1);
		private final Keyword cCommaKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cInterfaceTypesAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final CrossReference cInterfaceTypesMInterfaceTypeCrossReference_11_0 = (CrossReference)cInterfaceTypesAssignment_11.eContents().get(0);
		private final RuleCall cInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_11_0_1 = (RuleCall)cInterfaceTypesMInterfaceTypeCrossReference_11_0.eContents().get(1);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cCommaKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Assignment cInterfaceTypesAssignment_12_1 = (Assignment)cGroup_12.eContents().get(1);
		private final CrossReference cInterfaceTypesMInterfaceTypeCrossReference_12_1_0 = (CrossReference)cInterfaceTypesAssignment_12_1.eContents().get(0);
		private final RuleCall cInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_12_1_0_1 = (RuleCall)cInterfaceTypesMInterfaceTypeCrossReference_12_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//MExchangeModel:
		//	{MExchangeModel}
		//	'exchange' 'model'
		//	name=ID ('inherits' inherits+=[MExchangeModel|VersionedQualifiedReferenceName] (","
		//	inherits+=[MExchangeModel|VersionedQualifiedReferenceName])*)?
		//	'{'
		//	'interface' 'types' ':=' interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] ","
		//	interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
		//	interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//{MExchangeModel} 'exchange' 'model' name=ID ('inherits' inherits+=[MExchangeModel|VersionedQualifiedReferenceName] (","
		//inherits+=[MExchangeModel|VersionedQualifiedReferenceName])*)? '{' 'interface' 'types' ':='
		//interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] ","
		//interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
		//interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';' '}' ';'
		public Group getGroup() { return cGroup; }

		//{MExchangeModel}
		public Action getMExchangeModelAction_0() { return cMExchangeModelAction_0; }

		//'exchange'
		public Keyword getExchangeKeyword_1() { return cExchangeKeyword_1; }

		//'model'
		public Keyword getModelKeyword_2() { return cModelKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//('inherits' inherits+=[MExchangeModel|VersionedQualifiedReferenceName] (","
		//inherits+=[MExchangeModel|VersionedQualifiedReferenceName])*)?
		public Group getGroup_4() { return cGroup_4; }

		//'inherits'
		public Keyword getInheritsKeyword_4_0() { return cInheritsKeyword_4_0; }

		//inherits+=[MExchangeModel|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_4_1() { return cInheritsAssignment_4_1; }

		//[MExchangeModel|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMExchangeModelCrossReference_4_1_0() { return cInheritsMExchangeModelCrossReference_4_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1() { return cInheritsMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1; }

		//("," inherits+=[MExchangeModel|VersionedQualifiedReferenceName])*
		public Group getGroup_4_2() { return cGroup_4_2; }

		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }

		//inherits+=[MExchangeModel|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_4_2_1() { return cInheritsAssignment_4_2_1; }

		//[MExchangeModel|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMExchangeModelCrossReference_4_2_1_0() { return cInheritsMExchangeModelCrossReference_4_2_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1() { return cInheritsMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//'interface'
		public Keyword getInterfaceKeyword_6() { return cInterfaceKeyword_6; }

		//'types'
		public Keyword getTypesKeyword_7() { return cTypesKeyword_7; }

		//':='
		public Keyword getColonEqualsSignKeyword_8() { return cColonEqualsSignKeyword_8; }

		//interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName]
		public Assignment getInterfaceTypesAssignment_9() { return cInterfaceTypesAssignment_9; }

		//[MInterfaceType|VersionedQualifiedReferenceName]
		public CrossReference getInterfaceTypesMInterfaceTypeCrossReference_9_0() { return cInterfaceTypesMInterfaceTypeCrossReference_9_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_9_0_1() { return cInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_9_0_1; }

		//","
		public Keyword getCommaKeyword_10() { return cCommaKeyword_10; }

		//interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName]
		public Assignment getInterfaceTypesAssignment_11() { return cInterfaceTypesAssignment_11; }

		//[MInterfaceType|VersionedQualifiedReferenceName]
		public CrossReference getInterfaceTypesMInterfaceTypeCrossReference_11_0() { return cInterfaceTypesMInterfaceTypeCrossReference_11_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_11_0_1() { return cInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_11_0_1; }

		//("," interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])*
		public Group getGroup_12() { return cGroup_12; }

		//","
		public Keyword getCommaKeyword_12_0() { return cCommaKeyword_12_0; }

		//interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName]
		public Assignment getInterfaceTypesAssignment_12_1() { return cInterfaceTypesAssignment_12_1; }

		//[MInterfaceType|VersionedQualifiedReferenceName]
		public CrossReference getInterfaceTypesMInterfaceTypeCrossReference_12_1_0() { return cInterfaceTypesMInterfaceTypeCrossReference_12_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_12_1_0_1() { return cInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_12_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }

		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}

	public class MConnectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MConnector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnectorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cInheritsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cInheritsMConnectorCrossReference_2_1_0 = (CrossReference)cInheritsAssignment_2_1.eContents().get(0);
		private final RuleCall cInheritsMConnectorVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1 = (RuleCall)cInheritsMConnectorCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cInheritsMConnectorCrossReference_2_2_1_0 = (CrossReference)cInheritsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cInheritsMConnectorVersionedQualifiedReferenceNameParserRuleCall_2_2_1_0_1 = (RuleCall)cInheritsMConnectorCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cClientKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cTypesKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_4_0_2 = (Keyword)cGroup_4_0.eContents().get(2);
		private final Assignment cClientPortTypesAssignment_4_0_3 = (Assignment)cGroup_4_0.eContents().get(3);
		private final CrossReference cClientPortTypesMPortTypeCrossReference_4_0_3_0 = (CrossReference)cClientPortTypesAssignment_4_0_3.eContents().get(0);
		private final RuleCall cClientPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_3_0_1 = (RuleCall)cClientPortTypesMPortTypeCrossReference_4_0_3_0.eContents().get(1);
		private final Group cGroup_4_0_4 = (Group)cGroup_4_0.eContents().get(4);
		private final Keyword cCommaKeyword_4_0_4_0 = (Keyword)cGroup_4_0_4.eContents().get(0);
		private final Assignment cClientPortTypesAssignment_4_0_4_1 = (Assignment)cGroup_4_0_4.eContents().get(1);
		private final CrossReference cClientPortTypesMPortTypeCrossReference_4_0_4_1_0 = (CrossReference)cClientPortTypesAssignment_4_0_4_1.eContents().get(0);
		private final RuleCall cClientPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_4_1_0_1 = (RuleCall)cClientPortTypesMPortTypeCrossReference_4_0_4_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_0_5 = (Keyword)cGroup_4_0.eContents().get(5);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cServerKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cTypesKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_4_1_2 = (Keyword)cGroup_4_1.eContents().get(2);
		private final Assignment cServerPortTypesAssignment_4_1_3 = (Assignment)cGroup_4_1.eContents().get(3);
		private final CrossReference cServerPortTypesMPortTypeCrossReference_4_1_3_0 = (CrossReference)cServerPortTypesAssignment_4_1_3.eContents().get(0);
		private final RuleCall cServerPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_3_0_1 = (RuleCall)cServerPortTypesMPortTypeCrossReference_4_1_3_0.eContents().get(1);
		private final Group cGroup_4_1_4 = (Group)cGroup_4_1.eContents().get(4);
		private final Keyword cCommaKeyword_4_1_4_0 = (Keyword)cGroup_4_1_4.eContents().get(0);
		private final Assignment cServerPortTypesAssignment_4_1_4_1 = (Assignment)cGroup_4_1_4.eContents().get(1);
		private final CrossReference cServerPortTypesMPortTypeCrossReference_4_1_4_1_0 = (CrossReference)cServerPortTypesAssignment_4_1_4_1.eContents().get(0);
		private final RuleCall cServerPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_4_1_0_1 = (RuleCall)cServerPortTypesMPortTypeCrossReference_4_1_4_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_1_5 = (Keyword)cGroup_4_1.eContents().get(5);
		private final Group cGroup_4_2 = (Group)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cAttributesKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Assignment cAttributesAssignment_4_2_2 = (Assignment)cGroup_4_2.eContents().get(2);
		private final RuleCall cAttributesMParameterParserRuleCall_4_2_2_0 = (RuleCall)cAttributesAssignment_4_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_2_3 = (Keyword)cGroup_4_2.eContents().get(3);
		private final Keyword cSemicolonKeyword_4_2_4 = (Keyword)cGroup_4_2.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MConnector:
		//	'connector'
		//	name=ID ('inherits' inherits+=[MConnector|VersionedQualifiedReferenceName] (","
		//	inherits+=[MConnector|VersionedQualifiedReferenceName])*)?
		//	'{' ('client' 'types' ':=' clientPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
		//	clientPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & 'server' 'types' ':='
		//	serverPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
		//	serverPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & ('attributes'
		//	'{'
		//	attributes+=MParameter+
		//	'}' ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'connector' name=ID ('inherits' inherits+=[MConnector|VersionedQualifiedReferenceName] (","
		//inherits+=[MConnector|VersionedQualifiedReferenceName])*)? '{' ('client' 'types' ':='
		//clientPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
		//clientPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & 'server' 'types' ':='
		//serverPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
		//serverPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & ('attributes' '{' attributes+=MParameter+ '}'
		//';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//'connector'
		public Keyword getConnectorKeyword_0() { return cConnectorKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//('inherits' inherits+=[MConnector|VersionedQualifiedReferenceName] (","
		//inherits+=[MConnector|VersionedQualifiedReferenceName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//'inherits'
		public Keyword getInheritsKeyword_2_0() { return cInheritsKeyword_2_0; }

		//inherits+=[MConnector|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_2_1() { return cInheritsAssignment_2_1; }

		//[MConnector|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMConnectorCrossReference_2_1_0() { return cInheritsMConnectorCrossReference_2_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMConnectorVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1() { return cInheritsMConnectorVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1; }

		//("," inherits+=[MConnector|VersionedQualifiedReferenceName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//inherits+=[MConnector|VersionedQualifiedReferenceName]
		public Assignment getInheritsAssignment_2_2_1() { return cInheritsAssignment_2_2_1; }

		//[MConnector|VersionedQualifiedReferenceName]
		public CrossReference getInheritsMConnectorCrossReference_2_2_1_0() { return cInheritsMConnectorCrossReference_2_2_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getInheritsMConnectorVersionedQualifiedReferenceNameParserRuleCall_2_2_1_0_1() { return cInheritsMConnectorVersionedQualifiedReferenceNameParserRuleCall_2_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('client' 'types' ':=' clientPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
		//clientPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & 'server' 'types' ':='
		//serverPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
		//serverPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & ('attributes' '{' attributes+=MParameter+ '}'
		//';')?)
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//'client' 'types' ':=' clientPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
		//clientPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';'
		public Group getGroup_4_0() { return cGroup_4_0; }

		//'client'
		public Keyword getClientKeyword_4_0_0() { return cClientKeyword_4_0_0; }

		//'types'
		public Keyword getTypesKeyword_4_0_1() { return cTypesKeyword_4_0_1; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_0_2() { return cColonEqualsSignKeyword_4_0_2; }

		//clientPortTypes+=[MPortType|VersionedQualifiedReferenceName]
		public Assignment getClientPortTypesAssignment_4_0_3() { return cClientPortTypesAssignment_4_0_3; }

		//[MPortType|VersionedQualifiedReferenceName]
		public CrossReference getClientPortTypesMPortTypeCrossReference_4_0_3_0() { return cClientPortTypesMPortTypeCrossReference_4_0_3_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getClientPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_3_0_1() { return cClientPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_3_0_1; }

		//("," clientPortTypes+=[MPortType|VersionedQualifiedReferenceName])*
		public Group getGroup_4_0_4() { return cGroup_4_0_4; }

		//","
		public Keyword getCommaKeyword_4_0_4_0() { return cCommaKeyword_4_0_4_0; }

		//clientPortTypes+=[MPortType|VersionedQualifiedReferenceName]
		public Assignment getClientPortTypesAssignment_4_0_4_1() { return cClientPortTypesAssignment_4_0_4_1; }

		//[MPortType|VersionedQualifiedReferenceName]
		public CrossReference getClientPortTypesMPortTypeCrossReference_4_0_4_1_0() { return cClientPortTypesMPortTypeCrossReference_4_0_4_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getClientPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_4_1_0_1() { return cClientPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_4_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_0_5() { return cSemicolonKeyword_4_0_5; }

		//'server' 'types' ':=' serverPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
		//serverPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';'
		public Group getGroup_4_1() { return cGroup_4_1; }

		//'server'
		public Keyword getServerKeyword_4_1_0() { return cServerKeyword_4_1_0; }

		//'types'
		public Keyword getTypesKeyword_4_1_1() { return cTypesKeyword_4_1_1; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_1_2() { return cColonEqualsSignKeyword_4_1_2; }

		//serverPortTypes+=[MPortType|VersionedQualifiedReferenceName]
		public Assignment getServerPortTypesAssignment_4_1_3() { return cServerPortTypesAssignment_4_1_3; }

		//[MPortType|VersionedQualifiedReferenceName]
		public CrossReference getServerPortTypesMPortTypeCrossReference_4_1_3_0() { return cServerPortTypesMPortTypeCrossReference_4_1_3_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getServerPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_3_0_1() { return cServerPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_3_0_1; }

		//("," serverPortTypes+=[MPortType|VersionedQualifiedReferenceName])*
		public Group getGroup_4_1_4() { return cGroup_4_1_4; }

		//","
		public Keyword getCommaKeyword_4_1_4_0() { return cCommaKeyword_4_1_4_0; }

		//serverPortTypes+=[MPortType|VersionedQualifiedReferenceName]
		public Assignment getServerPortTypesAssignment_4_1_4_1() { return cServerPortTypesAssignment_4_1_4_1; }

		//[MPortType|VersionedQualifiedReferenceName]
		public CrossReference getServerPortTypesMPortTypeCrossReference_4_1_4_1_0() { return cServerPortTypesMPortTypeCrossReference_4_1_4_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getServerPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_4_1_0_1() { return cServerPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_4_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_1_5() { return cSemicolonKeyword_4_1_5; }

		//('attributes' '{' attributes+=MParameter+ '}' ';')?
		public Group getGroup_4_2() { return cGroup_4_2; }

		//'attributes'
		public Keyword getAttributesKeyword_4_2_0() { return cAttributesKeyword_4_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_2_1() { return cLeftCurlyBracketKeyword_4_2_1; }

		//attributes+=MParameter+
		public Assignment getAttributesAssignment_4_2_2() { return cAttributesAssignment_4_2_2; }

		//MParameter
		public RuleCall getAttributesMParameterParserRuleCall_4_2_2_0() { return cAttributesMParameterParserRuleCall_4_2_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_2_3() { return cRightCurlyBracketKeyword_4_2_3; }

		//';'
		public Keyword getSemicolonKeyword_4_2_4() { return cSemicolonKeyword_4_2_4; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMIntegerParameterSingleExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMEnumParameterSingleExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMBooleanParameterSingleExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMRealParameterSingleExpressionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cMStringParameterSingleExpressionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cMEnumParameterDefinitionParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//MParameter common::MParameter:
		//	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
		//	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition
		@Override public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MIntegerParameterSingleExpression");
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
		
		//MIntegerParameterSingleExpression common::MIntegerParameterSingleExpression:
		//	constant?='const'?
		//	'integer'
		//	name=ID
		//	':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)?
		//	';'
		@Override public ParserRule getRule() { return rule; }

		//constant?='const'? 'integer' name=ID ':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)? ';'
		public Group getGroup() { return cGroup; }

		//constant?='const'?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//'const'
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//'integer'
		public Keyword getIntegerKeyword_1() { return cIntegerKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_4() { return cDefaultValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_4_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_4_0; }

		//('range' range=MParameterRange)?
		public Group getGroup_5() { return cGroup_5; }

		//'range'
		public Keyword getRangeKeyword_5_0() { return cRangeKeyword_5_0; }

		//range=MParameterRange
		public Assignment getRangeAssignment_5_1() { return cRangeAssignment_5_1; }

		//MParameterRange
		public RuleCall getRangeMParameterRangeParserRuleCall_5_1_0() { return cRangeMParameterRangeParserRuleCall_5_1_0; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MEnumParameterDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MEnumParameterDefinition");
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
		
		//MEnumParameterDefinition common::MEnumParameterDefinition:
		//	{common::MEnumParameterDefinition}
		//	'enum'
		//	name=ID
		//	'{'
		//	literals+=MEnumParameterLiteralRule ("," literals+=MEnumParameterLiteralRule)*
		//	'}'
		//	';'
		@Override public ParserRule getRule() { return rule; }

		//{common::MEnumParameterDefinition} 'enum' name=ID '{' literals+=MEnumParameterLiteralRule (","
		//literals+=MEnumParameterLiteralRule)* '}' ';'
		public Group getGroup() { return cGroup; }

		//{common::MEnumParameterDefinition}
		public Action getMEnumParameterDefinitionAction_0() { return cMEnumParameterDefinitionAction_0; }

		//'enum'
		public Keyword getEnumKeyword_1() { return cEnumKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//'{'
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

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MEnumParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MEnumParameterSingleExpression");
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
		
		//MEnumParameterSingleExpression common::MEnumParameterSingleExpression:
		//	constant?='const'?
		//	'enum'
		//	enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
		//	':=' defaultValue=MParameterValueExpression
		//	';'
		@Override public ParserRule getRule() { return rule; }

		//constant?='const'? 'enum' enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID ':='
		//defaultValue=MParameterValueExpression ';'
		public Group getGroup() { return cGroup; }

		//constant?='const'?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//'const'
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//'enum'
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

		//':='
		public Keyword getColonEqualsSignKeyword_4() { return cColonEqualsSignKeyword_4; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_5() { return cDefaultValueAssignment_5; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_5_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_5_0; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MRealParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MRealParameterSingleExpression");
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
		
		//MRealParameterSingleExpression common::MRealParameterSingleExpression:
		//	constant?='const'?
		//	'real'
		//	name=ID
		//	':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)?
		//	';'
		@Override public ParserRule getRule() { return rule; }

		//constant?='const'? 'real' name=ID ':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)? ';'
		public Group getGroup() { return cGroup; }

		//constant?='const'?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//'const'
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//'real'
		public Keyword getRealKeyword_1() { return cRealKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_4() { return cDefaultValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_4_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_4_0; }

		//('range' range=MParameterRange)?
		public Group getGroup_5() { return cGroup_5; }

		//'range'
		public Keyword getRangeKeyword_5_0() { return cRangeKeyword_5_0; }

		//range=MParameterRange
		public Assignment getRangeAssignment_5_1() { return cRangeAssignment_5_1; }

		//MParameterRange
		public RuleCall getRangeMParameterRangeParserRuleCall_5_1_0() { return cRangeMParameterRangeParserRuleCall_5_1_0; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MEnumParameterLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MEnumParameterLiteralRule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMEnumParameterLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMEnumParamIntegerLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMEnumParamRealLiteralParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMEnumParamStringLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//MEnumParameterLiteralRule common::MEnumParameterLiteral:
		//	MEnumParameterLiteral | MEnumParamIntegerLiteral | MEnumParamRealLiteral | MEnumParamStringLiteral
		@Override public ParserRule getRule() { return rule; }

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

	public class MParameterValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMParameterValueLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMParameterValueRefObjectParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMParameterValuePARParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//MParameterValue common::MParameterValue:
		//	MParameterValueLiteral | MParameterValueRefObject | MParameterValuePAR
		@Override public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueLiteral");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMParameterValueBooleanLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMParameterValueStringLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMParameterValueIntegerLiteralParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMParameterValueRealLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//MParameterValueLiteral common::MParameterValueLiteral:
		//	MParameterValueBooleanLiteral | MParameterValueStringLiteral | MParameterValueIntegerLiteral |
		//	MParameterValueRealLiteral
		@Override public ParserRule getRule() { return rule; }

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

	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean ecore::EBoolean:
		//	'true' | 'false'
		@Override public ParserRule getRule() { return rule; }

		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }

		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }

		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}

	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.INTEGER");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cHEXADECIMALTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//INTEGER:
		//	'-'? INT | HEXADECIMAL;
		@Override public ParserRule getRule() { return rule; }

		//'-'? INT | HEXADECIMAL
		public Alternatives getAlternatives() { return cAlternatives; }

		//'-'? INT
		public Group getGroup_0() { return cGroup_0; }

		//'-'?
		public Keyword getHyphenMinusKeyword_0_0() { return cHyphenMinusKeyword_0_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_0_1() { return cINTTerminalRuleCall_0_1; }

		//HEXADECIMAL
		public RuleCall getHEXADECIMALTerminalRuleCall_1() { return cHEXADECIMALTerminalRuleCall_1; }
	}

	public class REALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.REAL");
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
		
		//REAL:
		//	'-'? (INT '.' INT) ('e' '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }

		//'-'? (INT '.' INT) ('e' '-'? INT)?
		public Group getGroup() { return cGroup; }

		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//(INT '.' INT)
		public Group getGroup_1() { return cGroup_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_0() { return cINTTerminalRuleCall_1_0; }

		//'.'
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_2() { return cINTTerminalRuleCall_1_2; }

		//('e' '-'? INT)?
		public Group getGroup_2() { return cGroup_2; }

		//'e'
		public Keyword getEKeyword_2_0() { return cEKeyword_2_0; }

		//'-'?
		public Keyword getHyphenMinusKeyword_2_1() { return cHyphenMinusKeyword_2_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_2_2() { return cINTTerminalRuleCall_2_2; }
	}

	public class MParameterValueBooleanLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueBooleanLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueBooleanLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueEBooleanParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//MParameterValueBooleanLiteral common::MParameterValueBooleanLiteral:
		//	{common::MParameterValueBooleanLiteral} value=EBoolean
		@Override public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueStringLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueStringLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cIsRawAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cIsRawRawKeyword_1_0 = (Keyword)cIsRawAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//MParameterValueStringLiteral common::MParameterValueStringLiteral:
		//	{common::MParameterValueStringLiteral} isRaw?='raw'?
		//	value=STRING
		@Override public ParserRule getRule() { return rule; }

		//{common::MParameterValueStringLiteral} isRaw?='raw'? value=STRING
		public Group getGroup() { return cGroup; }

		//{common::MParameterValueStringLiteral}
		public Action getMParameterValueStringLiteralAction_0() { return cMParameterValueStringLiteralAction_0; }

		//isRaw?='raw'?
		public Assignment getIsRawAssignment_1() { return cIsRawAssignment_1; }

		//'raw'
		public Keyword getIsRawRawKeyword_1_0() { return cIsRawRawKeyword_1_0; }

		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}

	public class MParameterValueIntegerLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueIntegerLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueIntegerLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTEGERParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//MParameterValueIntegerLiteral common::MParameterValueIntegerLiteral:
		//	{common::MParameterValueIntegerLiteral} value=INTEGER
		@Override public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueRealLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueRealLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueREALParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//MParameterValueRealLiteral common::MParameterValueRealLiteral:
		//	{common::MParameterValueRealLiteral} value=REAL
		@Override public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueRefObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueRefObjectAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cObjectAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cObjectMCommonReferenceableObjCrossReference_1_0 = (CrossReference)cObjectAssignment_1.eContents().get(0);
		private final RuleCall cObjectMCommonReferenceableObjVersionedQualifiedReferenceNameParserRuleCall_1_0_1 = (RuleCall)cObjectMCommonReferenceableObjCrossReference_1_0.eContents().get(1);
		
		//MParameterValueRefObject common::MParameterValueRefObject:
		//	{common::MParameterValueRefObject} object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName]
		@Override public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValuePAR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueMParameterValueExpressionParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//MParameterValuePAR common::MParameterValuePAR:
		//	'(' value=MParameterValueExpression ')'
		@Override public ParserRule getRule() { return rule; }

		//'(' value=MParameterValueExpression ')'
		public Group getGroup() { return cGroup; }

		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }

		//value=MParameterValueExpression
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//MParameterValueExpression
		public RuleCall getValueMParameterValueExpressionParserRuleCall_1_0() { return cValueMParameterValueExpressionParserRuleCall_1_0; }

		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}

	public class MParameterValueExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cLeftAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLeftMParameterValueTERMParserRuleCall_1_0 = (RuleCall)cLeftAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cOperationAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0 = (RuleCall)cOperationAssignment_2_0.eContents().get(0);
		private final Assignment cRightAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRightMParameterValueExpressionParserRuleCall_2_1_0 = (RuleCall)cRightAssignment_2_1.eContents().get(0);
		
		//MParameterValueExpression common::MParameterValueExpression:
		//	{common::MParameterValueExpression} left=MParameterValueTERM (operation=MParameterValueExpressionOperators
		//	right=MParameterValueExpression)?
		@Override public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueTERM");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterValueTERMAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cLeftAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLeftMParameterValueParserRuleCall_1_0 = (RuleCall)cLeftAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cOperationAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0 = (RuleCall)cOperationAssignment_2_0.eContents().get(0);
		private final Assignment cRightAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRightMParameterValueTERMParserRuleCall_2_1_0 = (RuleCall)cRightAssignment_2_1.eContents().get(0);
		
		//MParameterValueTERM common::MParameterValueTERM:
		//	{common::MParameterValueTERM} left=MParameterValue (operation=MParameterValueTERMOperators right=MParameterValueTERM)?
		@Override public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterRange");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMParameterOCRParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMParameterOORParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMParameterCORParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMParameterCCRParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//MParameterRange common::MParameterRange:
		//	MParameterOCR | MParameterOOR | MParameterCOR | MParameterCCR
		@Override public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterOCR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterOCRAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerValueMParameterValueExpressionParserRuleCall_2_0 = (RuleCall)cLowerValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUpperValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUpperValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cUpperValueAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MParameterOCR common::MParameterOCR:
		//	{common::MParameterOCR}
		//	'('
		//	lowerValue=MParameterValueExpression ','
		//	upperValue=MParameterValueExpression
		//	']'
		@Override public ParserRule getRule() { return rule; }

		//{common::MParameterOCR} '(' lowerValue=MParameterValueExpression ',' upperValue=MParameterValueExpression ']'
		public Group getGroup() { return cGroup; }

		//{common::MParameterOCR}
		public Action getMParameterOCRAction_0() { return cMParameterOCRAction_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//lowerValue=MParameterValueExpression
		public Assignment getLowerValueAssignment_2() { return cLowerValueAssignment_2; }

		//MParameterValueExpression
		public RuleCall getLowerValueMParameterValueExpressionParserRuleCall_2_0() { return cLowerValueMParameterValueExpressionParserRuleCall_2_0; }

		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }

		//upperValue=MParameterValueExpression
		public Assignment getUpperValueAssignment_4() { return cUpperValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getUpperValueMParameterValueExpressionParserRuleCall_4_0() { return cUpperValueMParameterValueExpressionParserRuleCall_4_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}

	public class MParameterOORElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterOOR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterOORAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerValueMParameterValueExpressionParserRuleCall_2_0 = (RuleCall)cLowerValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUpperValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUpperValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cUpperValueAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MParameterOOR common::MParameterOOR:
		//	{common::MParameterOOR}
		//	'('
		//	lowerValue=MParameterValueExpression ','
		//	upperValue=MParameterValueExpression
		//	')'
		@Override public ParserRule getRule() { return rule; }

		//{common::MParameterOOR} '(' lowerValue=MParameterValueExpression ',' upperValue=MParameterValueExpression ')'
		public Group getGroup() { return cGroup; }

		//{common::MParameterOOR}
		public Action getMParameterOORAction_0() { return cMParameterOORAction_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//lowerValue=MParameterValueExpression
		public Assignment getLowerValueAssignment_2() { return cLowerValueAssignment_2; }

		//MParameterValueExpression
		public RuleCall getLowerValueMParameterValueExpressionParserRuleCall_2_0() { return cLowerValueMParameterValueExpressionParserRuleCall_2_0; }

		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }

		//upperValue=MParameterValueExpression
		public Assignment getUpperValueAssignment_4() { return cUpperValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getUpperValueMParameterValueExpressionParserRuleCall_4_0() { return cUpperValueMParameterValueExpressionParserRuleCall_4_0; }

		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class MParameterCORElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterCOR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterCORAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerValueMParameterValueExpressionParserRuleCall_2_0 = (RuleCall)cLowerValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUpperValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUpperValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cUpperValueAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MParameterCOR common::MParameterCOR:
		//	{common::MParameterCOR}
		//	'['
		//	lowerValue=MParameterValueExpression ','
		//	upperValue=MParameterValueExpression
		//	')'
		@Override public ParserRule getRule() { return rule; }

		//{common::MParameterCOR} '[' lowerValue=MParameterValueExpression ',' upperValue=MParameterValueExpression ')'
		public Group getGroup() { return cGroup; }

		//{common::MParameterCOR}
		public Action getMParameterCORAction_0() { return cMParameterCORAction_0; }

		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }

		//lowerValue=MParameterValueExpression
		public Assignment getLowerValueAssignment_2() { return cLowerValueAssignment_2; }

		//MParameterValueExpression
		public RuleCall getLowerValueMParameterValueExpressionParserRuleCall_2_0() { return cLowerValueMParameterValueExpressionParserRuleCall_2_0; }

		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }

		//upperValue=MParameterValueExpression
		public Assignment getUpperValueAssignment_4() { return cUpperValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getUpperValueMParameterValueExpressionParserRuleCall_4_0() { return cUpperValueMParameterValueExpressionParserRuleCall_4_0; }

		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class MParameterCCRElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterCCR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterCCRAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerValueMParameterValueExpressionParserRuleCall_2_0 = (RuleCall)cLowerValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUpperValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUpperValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cUpperValueAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MParameterCCR common::MParameterCCR:
		//	{common::MParameterCCR}
		//	'['
		//	lowerValue=MParameterValueExpression ','
		//	upperValue=MParameterValueExpression
		//	']'
		@Override public ParserRule getRule() { return rule; }

		//{common::MParameterCCR} '[' lowerValue=MParameterValueExpression ',' upperValue=MParameterValueExpression ']'
		public Group getGroup() { return cGroup; }

		//{common::MParameterCCR}
		public Action getMParameterCCRAction_0() { return cMParameterCCRAction_0; }

		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }

		//lowerValue=MParameterValueExpression
		public Assignment getLowerValueAssignment_2() { return cLowerValueAssignment_2; }

		//MParameterValueExpression
		public RuleCall getLowerValueMParameterValueExpressionParserRuleCall_2_0() { return cLowerValueMParameterValueExpressionParserRuleCall_2_0; }

		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }

		//upperValue=MParameterValueExpression
		public Assignment getUpperValueAssignment_4() { return cUpperValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getUpperValueMParameterValueExpressionParserRuleCall_4_0() { return cUpperValueMParameterValueExpressionParserRuleCall_4_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}

	public class MEnumParameterLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MEnumParameterLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParameterLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//MEnumParameterLiteral common::MEnumParameterLiteral:
		//	{common::MEnumParameterLiteral} name=ID
		@Override public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MEnumParamIntegerLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParamIntegerLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueINTEGERParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//MEnumParamIntegerLiteral common::MEnumParamIntegerLiteral:
		//	{common::MEnumParamIntegerLiteral} name=ID
		//	'='
		//	value=INTEGER
		@Override public ParserRule getRule() { return rule; }

		//{common::MEnumParamIntegerLiteral} name=ID '=' value=INTEGER
		public Group getGroup() { return cGroup; }

		//{common::MEnumParamIntegerLiteral}
		public Action getMEnumParamIntegerLiteralAction_0() { return cMEnumParamIntegerLiteralAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//value=INTEGER
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//INTEGER
		public RuleCall getValueINTEGERParserRuleCall_3_0() { return cValueINTEGERParserRuleCall_3_0; }
	}

	public class MEnumParamRealLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MEnumParamRealLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParamRealLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueREALParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//MEnumParamRealLiteral common::MEnumParamRealLiteral:
		//	{common::MEnumParamRealLiteral} name=ID
		//	'='
		//	value=REAL
		@Override public ParserRule getRule() { return rule; }

		//{common::MEnumParamRealLiteral} name=ID '=' value=REAL
		public Group getGroup() { return cGroup; }

		//{common::MEnumParamRealLiteral}
		public Action getMEnumParamRealLiteralAction_0() { return cMEnumParamRealLiteralAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//value=REAL
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//REAL
		public RuleCall getValueREALParserRuleCall_3_0() { return cValueREALParserRuleCall_3_0; }
	}

	public class MEnumParamStringLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MEnumParamStringLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParamStringLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cIsRawAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cIsRawRawKeyword_3_0 = (Keyword)cIsRawAssignment_3.eContents().get(0);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueSTRINGTerminalRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		
		//MEnumParamStringLiteral common::MEnumParamStringLiteral:
		//	{common::MEnumParamStringLiteral} name=ID
		//	'='
		//	isRaw?='raw'?
		//	value=STRING
		@Override public ParserRule getRule() { return rule; }

		//{common::MEnumParamStringLiteral} name=ID '=' isRaw?='raw'? value=STRING
		public Group getGroup() { return cGroup; }

		//{common::MEnumParamStringLiteral}
		public Action getMEnumParamStringLiteralAction_0() { return cMEnumParamStringLiteralAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//isRaw?='raw'?
		public Assignment getIsRawAssignment_3() { return cIsRawAssignment_3; }

		//'raw'
		public Keyword getIsRawRawKeyword_3_0() { return cIsRawRawKeyword_3_0; }

		//value=STRING
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_4_0() { return cValueSTRINGTerminalRuleCall_4_0; }
	}

	public class MBooleanParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MBooleanParameterSingleExpression");
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
		
		//MBooleanParameterSingleExpression common::MBooleanParameterSingleExpression:
		//	constant?='const'?
		//	'boolean'
		//	name=ID
		//	':=' defaultValue=MParameterValueExpression
		//	';'
		@Override public ParserRule getRule() { return rule; }

		//constant?='const'? 'boolean' name=ID ':=' defaultValue=MParameterValueExpression ';'
		public Group getGroup() { return cGroup; }

		//constant?='const'?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//'const'
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//'boolean'
		public Keyword getBooleanKeyword_1() { return cBooleanKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_4() { return cDefaultValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_4_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_4_0; }

		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MStringParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MStringParameterSingleExpression");
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
		
		//MStringParameterSingleExpression common::MStringParameterSingleExpression:
		//	constant?='const'?
		//	'string'
		//	name=ID
		//	':=' defaultValue=MParameterValueExpression
		//	';'
		@Override public ParserRule getRule() { return rule; }

		//constant?='const'? 'string' name=ID ':=' defaultValue=MParameterValueExpression ';'
		public Group getGroup() { return cGroup; }

		//constant?='const'?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//'const'
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//'string'
		public Keyword getStringKeyword_1() { return cStringKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_4() { return cDefaultValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_4_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_4_0; }

		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	
	
	public class MParameterValueExpressionOperatorsElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpressionOperators");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPlusEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPlusPlusSignKeyword_0_0 = (Keyword)cPlusEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMinusEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMinusHyphenMinusKeyword_1_0 = (Keyword)cMinusEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum MParameterValueExpressionOperators returns common::MParameterValueExpressionOperators:
		//	plus='+' | minus='-';
		public EnumRule getRule() { return rule; }

		//plus='+' | minus='-'
		public Alternatives getAlternatives() { return cAlternatives; }

		//plus='+'
		public EnumLiteralDeclaration getPlusEnumLiteralDeclaration_0() { return cPlusEnumLiteralDeclaration_0; }

		//'+'
		public Keyword getPlusPlusSignKeyword_0_0() { return cPlusPlusSignKeyword_0_0; }

		//minus='-'
		public EnumLiteralDeclaration getMinusEnumLiteralDeclaration_1() { return cMinusEnumLiteralDeclaration_1; }

		//'-'
		public Keyword getMinusHyphenMinusKeyword_1_0() { return cMinusHyphenMinusKeyword_1_0; }
	}

	public class MParameterValueTERMOperatorsElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueTERMOperators");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMultEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMultAsteriskKeyword_0_0 = (Keyword)cMultEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDivEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDivSolidusKeyword_1_0 = (Keyword)cDivEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum MParameterValueTERMOperators returns common::MParameterValueTERMOperators:
		//	mult='*' | div='/';
		public EnumRule getRule() { return rule; }

		//mult='*' | div='/'
		public Alternatives getAlternatives() { return cAlternatives; }

		//mult='*'
		public EnumLiteralDeclaration getMultEnumLiteralDeclaration_0() { return cMultEnumLiteralDeclaration_0; }

		//'*'
		public Keyword getMultAsteriskKeyword_0_0() { return cMultAsteriskKeyword_0_0; }

		//div='/'
		public EnumLiteralDeclaration getDivEnumLiteralDeclaration_1() { return cDivEnumLiteralDeclaration_1; }

		//'/'
		public Keyword getDivSolidusKeyword_1_0() { return cDivSolidusKeyword_1_0; }
	}
	
	private final MMCLEVDOMPackageFileElements pMMCLEVDOMPackageFile;
	private final MMCLEVDOMPackageElementElements pMMCLEVDOMPackageElement;
	private final MDomainElements pMDomain;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final MIODomainElements pMIODomain;
	private final MIODomainSupportedPlatformElements pMIODomainSupportedPlatform;
	private final MAODomainElements pMAODomain;
	private final MInterfaceTypeElements pMInterfaceType;
	private final MAODComponentTypeElements pMAODComponentType;
	private final MIODCTypeElements pMIODCType;
	private final MIODAbstractComponentTypeElements pMIODAbstractComponentType;
	private final MIODComponentTypeElements pMIODComponentType;
	private final MIODComponentTypeInstanceElements pMIODComponentTypeInstance;
	private final MAODComponentTypeInstanceElements pMAODComponentTypeInstance;
	private final MPortTypeInstanceElements pMPortTypeInstance;
	private final MExternalPortTypeInstanceElements pMExternalPortTypeInstance;
	private final MExternalClientPortTypeInstanceElements pMExternalClientPortTypeInstance;
	private final MExternalServerPortTypeInstanceElements pMExternalServerPortTypeInstance;
	private final MInternalPortTypeInstanceElements pMInternalPortTypeInstance;
	private final MInternalClientPortTypeInstanceElements pMInternalClientPortTypeInstance;
	private final MInternalServerPortTypeInstanceElements pMInternalServerPortTypeInstance;
	private final MPortTypeElements pMPortType;
	private final MExchangeModelElements pMExchangeModel;
	private final MConnectorElements pMConnector;
	private final MParameterElements pMParameter;
	private final MIntegerParameterSingleExpressionElements pMIntegerParameterSingleExpression;
	private final MEnumParameterDefinitionElements pMEnumParameterDefinition;
	private final MEnumParameterSingleExpressionElements pMEnumParameterSingleExpression;
	private final MRealParameterSingleExpressionElements pMRealParameterSingleExpression;
	private final MEnumParameterLiteralRuleElements pMEnumParameterLiteralRule;
	private final MParameterValueElements pMParameterValue;
	private final MParameterValueLiteralElements pMParameterValueLiteral;
	private final EBooleanElements pEBoolean;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final REALElements pREAL;
	private final MParameterValueBooleanLiteralElements pMParameterValueBooleanLiteral;
	private final MParameterValueStringLiteralElements pMParameterValueStringLiteral;
	private final MParameterValueIntegerLiteralElements pMParameterValueIntegerLiteral;
	private final MParameterValueRealLiteralElements pMParameterValueRealLiteral;
	private final MParameterValueRefObjectElements pMParameterValueRefObject;
	private final MParameterValuePARElements pMParameterValuePAR;
	private final MParameterValueExpressionOperatorsElements eMParameterValueExpressionOperators;
	private final MParameterValueTERMOperatorsElements eMParameterValueTERMOperators;
	private final MParameterValueExpressionElements pMParameterValueExpression;
	private final MParameterValueTERMElements pMParameterValueTERM;
	private final MParameterRangeElements pMParameterRange;
	private final MParameterOCRElements pMParameterOCR;
	private final MParameterOORElements pMParameterOOR;
	private final MParameterCORElements pMParameterCOR;
	private final MParameterCCRElements pMParameterCCR;
	private final MEnumParameterLiteralElements pMEnumParameterLiteral;
	private final MEnumParamIntegerLiteralElements pMEnumParamIntegerLiteral;
	private final MEnumParamRealLiteralElements pMEnumParamRealLiteral;
	private final MEnumParamStringLiteralElements pMEnumParamStringLiteral;
	private final MBooleanParameterSingleExpressionElements pMBooleanParameterSingleExpression;
	private final MStringParameterSingleExpressionElements pMStringParameterSingleExpression;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DOMGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMMCLEVDOMPackageFile = new MMCLEVDOMPackageFileElements();
		this.pMMCLEVDOMPackageElement = new MMCLEVDOMPackageElementElements();
		this.pMDomain = new MDomainElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.pMIODomain = new MIODomainElements();
		this.pMIODomainSupportedPlatform = new MIODomainSupportedPlatformElements();
		this.pMAODomain = new MAODomainElements();
		this.pMInterfaceType = new MInterfaceTypeElements();
		this.pMAODComponentType = new MAODComponentTypeElements();
		this.pMIODCType = new MIODCTypeElements();
		this.pMIODAbstractComponentType = new MIODAbstractComponentTypeElements();
		this.pMIODComponentType = new MIODComponentTypeElements();
		this.pMIODComponentTypeInstance = new MIODComponentTypeInstanceElements();
		this.pMAODComponentTypeInstance = new MAODComponentTypeInstanceElements();
		this.pMPortTypeInstance = new MPortTypeInstanceElements();
		this.pMExternalPortTypeInstance = new MExternalPortTypeInstanceElements();
		this.pMExternalClientPortTypeInstance = new MExternalClientPortTypeInstanceElements();
		this.pMExternalServerPortTypeInstance = new MExternalServerPortTypeInstanceElements();
		this.pMInternalPortTypeInstance = new MInternalPortTypeInstanceElements();
		this.pMInternalClientPortTypeInstance = new MInternalClientPortTypeInstanceElements();
		this.pMInternalServerPortTypeInstance = new MInternalServerPortTypeInstanceElements();
		this.pMPortType = new MPortTypeElements();
		this.pMExchangeModel = new MExchangeModelElements();
		this.pMConnector = new MConnectorElements();
		this.pMParameter = new MParameterElements();
		this.pMIntegerParameterSingleExpression = new MIntegerParameterSingleExpressionElements();
		this.pMEnumParameterDefinition = new MEnumParameterDefinitionElements();
		this.pMEnumParameterSingleExpression = new MEnumParameterSingleExpressionElements();
		this.pMRealParameterSingleExpression = new MRealParameterSingleExpressionElements();
		this.pMEnumParameterLiteralRule = new MEnumParameterLiteralRuleElements();
		this.pMParameterValue = new MParameterValueElements();
		this.pMParameterValueLiteral = new MParameterValueLiteralElements();
		this.pEBoolean = new EBooleanElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.DOM.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.pREAL = new REALElements();
		this.pMParameterValueBooleanLiteral = new MParameterValueBooleanLiteralElements();
		this.pMParameterValueStringLiteral = new MParameterValueStringLiteralElements();
		this.pMParameterValueIntegerLiteral = new MParameterValueIntegerLiteralElements();
		this.pMParameterValueRealLiteral = new MParameterValueRealLiteralElements();
		this.pMParameterValueRefObject = new MParameterValueRefObjectElements();
		this.pMParameterValuePAR = new MParameterValuePARElements();
		this.eMParameterValueExpressionOperators = new MParameterValueExpressionOperatorsElements();
		this.eMParameterValueTERMOperators = new MParameterValueTERMOperatorsElements();
		this.pMParameterValueExpression = new MParameterValueExpressionElements();
		this.pMParameterValueTERM = new MParameterValueTERMElements();
		this.pMParameterRange = new MParameterRangeElements();
		this.pMParameterOCR = new MParameterOCRElements();
		this.pMParameterOOR = new MParameterOORElements();
		this.pMParameterCOR = new MParameterCORElements();
		this.pMParameterCCR = new MParameterCCRElements();
		this.pMEnumParameterLiteral = new MEnumParameterLiteralElements();
		this.pMEnumParamIntegerLiteral = new MEnumParamIntegerLiteralElements();
		this.pMEnumParamRealLiteral = new MEnumParamRealLiteralElements();
		this.pMEnumParamStringLiteral = new MEnumParamStringLiteralElements();
		this.pMBooleanParameterSingleExpression = new MBooleanParameterSingleExpressionElements();
		this.pMStringParameterSingleExpression = new MStringParameterSingleExpressionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mclev.lang.DOM".equals(grammar.getName())) {
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

	
	//MMCLEVDOMPackageFile:
	//	'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
	//	imports+=[common::MCommonPackage|QualifiedName] ';')*
	//	element=MMCLEVDOMPackageElement;
	public MMCLEVDOMPackageFileElements getMMCLEVDOMPackageFileAccess() {
		return pMMCLEVDOMPackageFile;
	}
	
	public ParserRule getMMCLEVDOMPackageFileRule() {
		return getMMCLEVDOMPackageFileAccess().getRule();
	}

	//MMCLEVDOMPackageElement:
	//	MDomain;
	public MMCLEVDOMPackageElementElements getMMCLEVDOMPackageElementAccess() {
		return pMMCLEVDOMPackageElement;
	}
	
	public ParserRule getMMCLEVDOMPackageElementRule() {
		return getMMCLEVDOMPackageElementAccess().getRule();
	}

	//MDomain:
	//	MIODomain | MAODomain;
	public MDomainElements getMDomainAccess() {
		return pMDomain;
	}
	
	public ParserRule getMDomainRule() {
		return getMDomainAccess().getRule();
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

	//MIODomain:
	//	'iodomain'
	//	name=ID ('inherits' inherits+=[MIODomain|VersionedQualifiedName] ("," inherits+=[MIODomain|VersionedQualifiedName])*)?
	//	'{' ('version' ':=' version=Version ';' & ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
	//	languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
	//	& ('singleton' 'instances' ':=' allowsSingleton=EBoolean ';')?
	//	& ('attributes'
	//	'{'
	//	attributes+=MParameter+
	//	'}' ';')?
	//	& ('interface' 'types'
	//	'{'
	//	interfaceTypes+=MInterfaceType+
	//	'}' ';')?
	//	& ('port' 'types'
	//	'{'
	//	portTypes+=MPortType+
	//	'}' ';')?
	//	& ('connectors'
	//	'{'
	//	connectors+=MConnector+
	//	'}' ';')?
	//	& ('exchange' 'models'
	//	'{'
	//	exchangeModels+=MExchangeModel+
	//	'}' ';')?
	//	& ('component' 'types'
	//	'{'
	//	componentTypes+=MIODCType+
	//	'}' ';')?
	//	& ('internal' 'instances'
	//	'{'
	//	componentTypeInstances+=MIODComponentTypeInstance+
	//	'}' ';')?
	//	& ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
	//	requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
	//	& ('supported' 'platforms'
	//	'{'
	//	supportedPlatforms+=MIODomainSupportedPlatform+
	//	'}' ';')?)
	//	'}' ';';
	public MIODomainElements getMIODomainAccess() {
		return pMIODomain;
	}
	
	public ParserRule getMIODomainRule() {
		return getMIODomainAccess().getRule();
	}

	//MIODomainSupportedPlatform:
	//	'supported' 'platform'
	//	name=ID
	//	'{' ('osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';' & 'os' ':=' ('any' |
	//	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';' & 'architecture' ':=' ('any' |
	//	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';' & ('compiler' ':='
	//	compiler=[pdl::MCompiler|VersionedQualifiedName] ';')?
	//	& 'microprocessor' ':=' ('any' | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';' & 'board' ':='
	//	('any' | board=[pdl::MBoard|VersionedQualifiedName]) ';' & ('attributes'
	//	'{'
	//	attributes+=MParameter+
	//	'}' ';')?
	//	& ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
	//	languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
	//	& ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
	//	requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?)
	//	'}' ';';
	public MIODomainSupportedPlatformElements getMIODomainSupportedPlatformAccess() {
		return pMIODomainSupportedPlatform;
	}
	
	public ParserRule getMIODomainSupportedPlatformRule() {
		return getMIODomainSupportedPlatformAccess().getRule();
	}

	//MAODomain:
	//	'aodomain'
	//	name=ID ('inherits' inherits+=[MAODomain|VersionedQualifiedName] ("," inherits+=[MAODomain|VersionedQualifiedName])*)?
	//	'{' ('version' ':=' version=Version ';' & ('output' 'iodomains' ':='
	//	outputIODomains+=[MIODomain|VersionedQualifiedName] ("," outputIODomains+=[MIODomain|VersionedQualifiedName])* ';')?
	//	& ('attributes'
	//	'{'
	//	attributes+=MParameter+
	//	'}' ';')?
	//	& ('interface' 'types'
	//	'{'
	//	interfaceTypes+=MInterfaceType+
	//	'}' ';')?
	//	& ('port' 'types'
	//	'{'
	//	portTypes+=MPortType+
	//	'}' ';')?
	//	& ('connectors'
	//	'{'
	//	connectors+=MConnector+
	//	'}' ';')?
	//	& ('component' 'types'
	//	'{'
	//	componentTypes+=MAODComponentType+
	//	'}' ';')?
	//	& ('internal' 'instances'
	//	'{'
	//	componentTypeInstances+=MAODComponentTypeInstance+
	//	'}' ';')?)
	//	'}' ';';
	public MAODomainElements getMAODomainAccess() {
		return pMAODomain;
	}
	
	public ParserRule getMAODomainRule() {
		return getMAODomainAccess().getRule();
	}

	//MInterfaceType:
	//	'interface' 'type'
	//	name=ID ('inherits' inherits+=[MInterfaceType|VersionedQualifiedReferenceName] (","
	//	inherits+=[MInterfaceType|VersionedQualifiedReferenceName])*)?
	//	'{'
	//	'}' ';';
	public MInterfaceTypeElements getMInterfaceTypeAccess() {
		return pMInterfaceType;
	}
	
	public ParserRule getMInterfaceTypeRule() {
		return getMInterfaceTypeAccess().getRule();
	}

	//MAODComponentType:
	//	'component' 'type'
	//	name=ID ('inherits' inherits+=[MAODComponentType|VersionedQualifiedReferenceName] (","
	//	inherits+=[MAODComponentType|VersionedQualifiedReferenceName])*)?
	//	'{' (('attributes'
	//	'{'
	//	attributes+=MParameter+
	//	'}' ';')?
	//	& ('port' 'instances'
	//	'{'
	//	portTypeInstances+=MPortTypeInstance+
	//	'}' ';')?
	//	& ('internal' 'instances'
	//	'{'
	//	componentTypeInstances+=MAODComponentTypeInstance+
	//	'}' ';')?)
	//	'}' ';';
	public MAODComponentTypeElements getMAODComponentTypeAccess() {
		return pMAODComponentType;
	}
	
	public ParserRule getMAODComponentTypeRule() {
		return getMAODComponentTypeAccess().getRule();
	}

	//MIODCType MIODAbstractComponentType:
	//	MIODAbstractComponentType | MIODComponentType
	public MIODCTypeElements getMIODCTypeAccess() {
		return pMIODCType;
	}
	
	public ParserRule getMIODCTypeRule() {
		return getMIODCTypeAccess().getRule();
	}

	//MIODAbstractComponentType:
	//	'abstract' 'component' 'type'
	//	name=ID ('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName] (","
	//	inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)?
	//	'{' (('attributes'
	//	'{'
	//	attributes+=MParameter+
	//	'}' ';')?
	//	& ('port' 'instances'
	//	'{'
	//	portTypeInstances+=MPortTypeInstance+
	//	'}' ';')?
	//	& ('internal' 'instances'
	//	'{'
	//	componentTypeInstances+=MIODComponentTypeInstance+
	//	'}' ';')?)
	//	'}' ';';
	public MIODAbstractComponentTypeElements getMIODAbstractComponentTypeAccess() {
		return pMIODAbstractComponentType;
	}
	
	public ParserRule getMIODAbstractComponentTypeRule() {
		return getMIODAbstractComponentTypeAccess().getRule();
	}

	//MIODComponentType:
	//	'component' 'type'
	//	name=ID ('inherits' inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName] (","
	//	inherits+=[MIODAbstractComponentType|VersionedQualifiedReferenceName])*)?
	//	'{' ('language' ':=' language=[system::MLanguage|VersionedQualifiedName] ';' & ('attributes'
	//	'{'
	//	attributes+=MParameter+
	//	'}' ';')?
	//	& ('port' 'instances'
	//	'{'
	//	portTypeInstances+=MPortTypeInstance+
	//	'}' ';')?
	//	& ('internal' 'instances'
	//	'{'
	//	componentTypeInstances+=MIODComponentTypeInstance+
	//	'}' ';')?)
	//	'}' ';';
	public MIODComponentTypeElements getMIODComponentTypeAccess() {
		return pMIODComponentType;
	}
	
	public ParserRule getMIODComponentTypeRule() {
		return getMIODComponentTypeAccess().getRule();
	}

	//MIODComponentTypeInstance:
	//	'type'
	//	componentType=[MIODAbstractComponentType]
	//	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
	//	';';
	public MIODComponentTypeInstanceElements getMIODComponentTypeInstanceAccess() {
		return pMIODComponentTypeInstance;
	}
	
	public ParserRule getMIODComponentTypeInstanceRule() {
		return getMIODComponentTypeInstanceAccess().getRule();
	}

	//MAODComponentTypeInstance:
	//	'type'
	//	componentType=[MAODComponentType]
	//	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
	//	';';
	public MAODComponentTypeInstanceElements getMAODComponentTypeInstanceAccess() {
		return pMAODComponentTypeInstance;
	}
	
	public ParserRule getMAODComponentTypeInstanceRule() {
		return getMAODComponentTypeInstanceAccess().getRule();
	}

	//MPortTypeInstance:
	//	MExternalPortTypeInstance | MInternalPortTypeInstance;
	public MPortTypeInstanceElements getMPortTypeInstanceAccess() {
		return pMPortTypeInstance;
	}
	
	public ParserRule getMPortTypeInstanceRule() {
		return getMPortTypeInstanceAccess().getRule();
	}

	//MExternalPortTypeInstance:
	//	MExternalClientPortTypeInstance | MExternalServerPortTypeInstance;
	public MExternalPortTypeInstanceElements getMExternalPortTypeInstanceAccess() {
		return pMExternalPortTypeInstance;
	}
	
	public ParserRule getMExternalPortTypeInstanceRule() {
		return getMExternalPortTypeInstanceAccess().getRule();
	}

	//MExternalClientPortTypeInstance:
	//	'external' 'client'
	//	portType=[MPortType]
	//	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
	//	';';
	public MExternalClientPortTypeInstanceElements getMExternalClientPortTypeInstanceAccess() {
		return pMExternalClientPortTypeInstance;
	}
	
	public ParserRule getMExternalClientPortTypeInstanceRule() {
		return getMExternalClientPortTypeInstanceAccess().getRule();
	}

	//MExternalServerPortTypeInstance:
	//	'external' 'server'
	//	portType=[MPortType]
	//	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
	//	';';
	public MExternalServerPortTypeInstanceElements getMExternalServerPortTypeInstanceAccess() {
		return pMExternalServerPortTypeInstance;
	}
	
	public ParserRule getMExternalServerPortTypeInstanceRule() {
		return getMExternalServerPortTypeInstanceAccess().getRule();
	}

	//MInternalPortTypeInstance:
	//	MInternalClientPortTypeInstance | MInternalServerPortTypeInstance;
	public MInternalPortTypeInstanceElements getMInternalPortTypeInstanceAccess() {
		return pMInternalPortTypeInstance;
	}
	
	public ParserRule getMInternalPortTypeInstanceRule() {
		return getMInternalPortTypeInstanceAccess().getRule();
	}

	//MInternalClientPortTypeInstance:
	//	'internal' 'client'
	//	portType=[MPortType]
	//	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
	//	';';
	public MInternalClientPortTypeInstanceElements getMInternalClientPortTypeInstanceAccess() {
		return pMInternalClientPortTypeInstance;
	}
	
	public ParserRule getMInternalClientPortTypeInstanceRule() {
		return getMInternalClientPortTypeInstanceAccess().getRule();
	}

	//MInternalServerPortTypeInstance:
	//	'internal' 'server'
	//	portType=[MPortType]
	//	'range' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
	//	';';
	public MInternalServerPortTypeInstanceElements getMInternalServerPortTypeInstanceAccess() {
		return pMInternalServerPortTypeInstance;
	}
	
	public ParserRule getMInternalServerPortTypeInstanceRule() {
		return getMInternalServerPortTypeInstanceAccess().getRule();
	}

	//MPortType:
	//	{MPortType}
	//	'port' 'type'
	//	name=ID ('inherits' inherits+=[MPortType|VersionedQualifiedReferenceName] (","
	//	inherits+=[MPortType|VersionedQualifiedReferenceName])*)?
	//	'{' ('interface' 'types' ':=' interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
	//	interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';' & ('attributes'
	//	'{'
	//	attributes+=MParameter+
	//	'}' ';')?
	//	& ('client' 'attributes'
	//	'{'
	//	clientAttributes+=MParameter+
	//	'}' ';')?
	//	& ('server' 'attributes'
	//	'{'
	//	serverAttributes+=MParameter+
	//	'}' ';')?)
	//	'}' ';';
	public MPortTypeElements getMPortTypeAccess() {
		return pMPortType;
	}
	
	public ParserRule getMPortTypeRule() {
		return getMPortTypeAccess().getRule();
	}

	//MExchangeModel:
	//	{MExchangeModel}
	//	'exchange' 'model'
	//	name=ID ('inherits' inherits+=[MExchangeModel|VersionedQualifiedReferenceName] (","
	//	inherits+=[MExchangeModel|VersionedQualifiedReferenceName])*)?
	//	'{'
	//	'interface' 'types' ':=' interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] ","
	//	interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName] (","
	//	interfaceTypes+=[MInterfaceType|VersionedQualifiedReferenceName])* ';'
	//	'}' ';';
	public MExchangeModelElements getMExchangeModelAccess() {
		return pMExchangeModel;
	}
	
	public ParserRule getMExchangeModelRule() {
		return getMExchangeModelAccess().getRule();
	}

	//MConnector:
	//	'connector'
	//	name=ID ('inherits' inherits+=[MConnector|VersionedQualifiedReferenceName] (","
	//	inherits+=[MConnector|VersionedQualifiedReferenceName])*)?
	//	'{' ('client' 'types' ':=' clientPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
	//	clientPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & 'server' 'types' ':='
	//	serverPortTypes+=[MPortType|VersionedQualifiedReferenceName] (","
	//	serverPortTypes+=[MPortType|VersionedQualifiedReferenceName])* ';' & ('attributes'
	//	'{'
	//	attributes+=MParameter+
	//	'}' ';')?)
	//	'}' ';';
	public MConnectorElements getMConnectorAccess() {
		return pMConnector;
	}
	
	public ParserRule getMConnectorRule() {
		return getMConnectorAccess().getRule();
	}

	//MParameter common::MParameter:
	//	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
	//	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition
	public MParameterElements getMParameterAccess() {
		return pMParameter;
	}
	
	public ParserRule getMParameterRule() {
		return getMParameterAccess().getRule();
	}

	//MIntegerParameterSingleExpression common::MIntegerParameterSingleExpression:
	//	constant?='const'?
	//	'integer'
	//	name=ID
	//	':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)?
	//	';'
	public MIntegerParameterSingleExpressionElements getMIntegerParameterSingleExpressionAccess() {
		return pMIntegerParameterSingleExpression;
	}
	
	public ParserRule getMIntegerParameterSingleExpressionRule() {
		return getMIntegerParameterSingleExpressionAccess().getRule();
	}

	//MEnumParameterDefinition common::MEnumParameterDefinition:
	//	{common::MEnumParameterDefinition}
	//	'enum'
	//	name=ID
	//	'{'
	//	literals+=MEnumParameterLiteralRule ("," literals+=MEnumParameterLiteralRule)*
	//	'}'
	//	';'
	public MEnumParameterDefinitionElements getMEnumParameterDefinitionAccess() {
		return pMEnumParameterDefinition;
	}
	
	public ParserRule getMEnumParameterDefinitionRule() {
		return getMEnumParameterDefinitionAccess().getRule();
	}

	//MEnumParameterSingleExpression common::MEnumParameterSingleExpression:
	//	constant?='const'?
	//	'enum'
	//	enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
	//	':=' defaultValue=MParameterValueExpression
	//	';'
	public MEnumParameterSingleExpressionElements getMEnumParameterSingleExpressionAccess() {
		return pMEnumParameterSingleExpression;
	}
	
	public ParserRule getMEnumParameterSingleExpressionRule() {
		return getMEnumParameterSingleExpressionAccess().getRule();
	}

	//MRealParameterSingleExpression common::MRealParameterSingleExpression:
	//	constant?='const'?
	//	'real'
	//	name=ID
	//	':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)?
	//	';'
	public MRealParameterSingleExpressionElements getMRealParameterSingleExpressionAccess() {
		return pMRealParameterSingleExpression;
	}
	
	public ParserRule getMRealParameterSingleExpressionRule() {
		return getMRealParameterSingleExpressionAccess().getRule();
	}

	//MEnumParameterLiteralRule common::MEnumParameterLiteral:
	//	MEnumParameterLiteral | MEnumParamIntegerLiteral | MEnumParamRealLiteral | MEnumParamStringLiteral
	public MEnumParameterLiteralRuleElements getMEnumParameterLiteralRuleAccess() {
		return pMEnumParameterLiteralRule;
	}
	
	public ParserRule getMEnumParameterLiteralRuleRule() {
		return getMEnumParameterLiteralRuleAccess().getRule();
	}

	//MParameterValue common::MParameterValue:
	//	MParameterValueLiteral | MParameterValueRefObject | MParameterValuePAR
	public MParameterValueElements getMParameterValueAccess() {
		return pMParameterValue;
	}
	
	public ParserRule getMParameterValueRule() {
		return getMParameterValueAccess().getRule();
	}

	//MParameterValueLiteral common::MParameterValueLiteral:
	//	MParameterValueBooleanLiteral | MParameterValueStringLiteral | MParameterValueIntegerLiteral |
	//	MParameterValueRealLiteral
	public MParameterValueLiteralElements getMParameterValueLiteralAccess() {
		return pMParameterValueLiteral;
	}
	
	public ParserRule getMParameterValueLiteralRule() {
		return getMParameterValueLiteralAccess().getRule();
	}

	//EBoolean ecore::EBoolean:
	//	'true' | 'false'
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}

	//terminal HEXADECIMAL:
	//	'0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+;
	public TerminalRule getHEXADECIMALRule() {
		return tHEXADECIMAL;
	} 

	//INTEGER:
	//	'-'? INT | HEXADECIMAL;
	public INTEGERElements getINTEGERAccess() {
		return pINTEGER;
	}
	
	public ParserRule getINTEGERRule() {
		return getINTEGERAccess().getRule();
	}

	//REAL:
	//	'-'? (INT '.' INT) ('e' '-'? INT)?;
	public REALElements getREALAccess() {
		return pREAL;
	}
	
	public ParserRule getREALRule() {
		return getREALAccess().getRule();
	}

	//MParameterValueBooleanLiteral common::MParameterValueBooleanLiteral:
	//	{common::MParameterValueBooleanLiteral} value=EBoolean
	public MParameterValueBooleanLiteralElements getMParameterValueBooleanLiteralAccess() {
		return pMParameterValueBooleanLiteral;
	}
	
	public ParserRule getMParameterValueBooleanLiteralRule() {
		return getMParameterValueBooleanLiteralAccess().getRule();
	}

	//MParameterValueStringLiteral common::MParameterValueStringLiteral:
	//	{common::MParameterValueStringLiteral} isRaw?='raw'?
	//	value=STRING
	public MParameterValueStringLiteralElements getMParameterValueStringLiteralAccess() {
		return pMParameterValueStringLiteral;
	}
	
	public ParserRule getMParameterValueStringLiteralRule() {
		return getMParameterValueStringLiteralAccess().getRule();
	}

	//MParameterValueIntegerLiteral common::MParameterValueIntegerLiteral:
	//	{common::MParameterValueIntegerLiteral} value=INTEGER
	public MParameterValueIntegerLiteralElements getMParameterValueIntegerLiteralAccess() {
		return pMParameterValueIntegerLiteral;
	}
	
	public ParserRule getMParameterValueIntegerLiteralRule() {
		return getMParameterValueIntegerLiteralAccess().getRule();
	}

	//MParameterValueRealLiteral common::MParameterValueRealLiteral:
	//	{common::MParameterValueRealLiteral} value=REAL
	public MParameterValueRealLiteralElements getMParameterValueRealLiteralAccess() {
		return pMParameterValueRealLiteral;
	}
	
	public ParserRule getMParameterValueRealLiteralRule() {
		return getMParameterValueRealLiteralAccess().getRule();
	}

	//MParameterValueRefObject common::MParameterValueRefObject:
	//	{common::MParameterValueRefObject} object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName]
	public MParameterValueRefObjectElements getMParameterValueRefObjectAccess() {
		return pMParameterValueRefObject;
	}
	
	public ParserRule getMParameterValueRefObjectRule() {
		return getMParameterValueRefObjectAccess().getRule();
	}

	//MParameterValuePAR common::MParameterValuePAR:
	//	'(' value=MParameterValueExpression ')'
	public MParameterValuePARElements getMParameterValuePARAccess() {
		return pMParameterValuePAR;
	}
	
	public ParserRule getMParameterValuePARRule() {
		return getMParameterValuePARAccess().getRule();
	}

	//enum MParameterValueExpressionOperators returns common::MParameterValueExpressionOperators:
	//	plus='+' | minus='-';
	public MParameterValueExpressionOperatorsElements getMParameterValueExpressionOperatorsAccess() {
		return eMParameterValueExpressionOperators;
	}
	
	public EnumRule getMParameterValueExpressionOperatorsRule() {
		return getMParameterValueExpressionOperatorsAccess().getRule();
	}

	//enum MParameterValueTERMOperators returns common::MParameterValueTERMOperators:
	//	mult='*' | div='/';
	public MParameterValueTERMOperatorsElements getMParameterValueTERMOperatorsAccess() {
		return eMParameterValueTERMOperators;
	}
	
	public EnumRule getMParameterValueTERMOperatorsRule() {
		return getMParameterValueTERMOperatorsAccess().getRule();
	}

	//MParameterValueExpression common::MParameterValueExpression:
	//	{common::MParameterValueExpression} left=MParameterValueTERM (operation=MParameterValueExpressionOperators
	//	right=MParameterValueExpression)?
	public MParameterValueExpressionElements getMParameterValueExpressionAccess() {
		return pMParameterValueExpression;
	}
	
	public ParserRule getMParameterValueExpressionRule() {
		return getMParameterValueExpressionAccess().getRule();
	}

	//MParameterValueTERM common::MParameterValueTERM:
	//	{common::MParameterValueTERM} left=MParameterValue (operation=MParameterValueTERMOperators right=MParameterValueTERM)?
	public MParameterValueTERMElements getMParameterValueTERMAccess() {
		return pMParameterValueTERM;
	}
	
	public ParserRule getMParameterValueTERMRule() {
		return getMParameterValueTERMAccess().getRule();
	}

	//MParameterRange common::MParameterRange:
	//	MParameterOCR | MParameterOOR | MParameterCOR | MParameterCCR
	public MParameterRangeElements getMParameterRangeAccess() {
		return pMParameterRange;
	}
	
	public ParserRule getMParameterRangeRule() {
		return getMParameterRangeAccess().getRule();
	}

	//MParameterOCR common::MParameterOCR:
	//	{common::MParameterOCR}
	//	'('
	//	lowerValue=MParameterValueExpression ','
	//	upperValue=MParameterValueExpression
	//	']'
	public MParameterOCRElements getMParameterOCRAccess() {
		return pMParameterOCR;
	}
	
	public ParserRule getMParameterOCRRule() {
		return getMParameterOCRAccess().getRule();
	}

	//MParameterOOR common::MParameterOOR:
	//	{common::MParameterOOR}
	//	'('
	//	lowerValue=MParameterValueExpression ','
	//	upperValue=MParameterValueExpression
	//	')'
	public MParameterOORElements getMParameterOORAccess() {
		return pMParameterOOR;
	}
	
	public ParserRule getMParameterOORRule() {
		return getMParameterOORAccess().getRule();
	}

	//MParameterCOR common::MParameterCOR:
	//	{common::MParameterCOR}
	//	'['
	//	lowerValue=MParameterValueExpression ','
	//	upperValue=MParameterValueExpression
	//	')'
	public MParameterCORElements getMParameterCORAccess() {
		return pMParameterCOR;
	}
	
	public ParserRule getMParameterCORRule() {
		return getMParameterCORAccess().getRule();
	}

	//MParameterCCR common::MParameterCCR:
	//	{common::MParameterCCR}
	//	'['
	//	lowerValue=MParameterValueExpression ','
	//	upperValue=MParameterValueExpression
	//	']'
	public MParameterCCRElements getMParameterCCRAccess() {
		return pMParameterCCR;
	}
	
	public ParserRule getMParameterCCRRule() {
		return getMParameterCCRAccess().getRule();
	}

	//MEnumParameterLiteral common::MEnumParameterLiteral:
	//	{common::MEnumParameterLiteral} name=ID
	public MEnumParameterLiteralElements getMEnumParameterLiteralAccess() {
		return pMEnumParameterLiteral;
	}
	
	public ParserRule getMEnumParameterLiteralRule() {
		return getMEnumParameterLiteralAccess().getRule();
	}

	//MEnumParamIntegerLiteral common::MEnumParamIntegerLiteral:
	//	{common::MEnumParamIntegerLiteral} name=ID
	//	'='
	//	value=INTEGER
	public MEnumParamIntegerLiteralElements getMEnumParamIntegerLiteralAccess() {
		return pMEnumParamIntegerLiteral;
	}
	
	public ParserRule getMEnumParamIntegerLiteralRule() {
		return getMEnumParamIntegerLiteralAccess().getRule();
	}

	//MEnumParamRealLiteral common::MEnumParamRealLiteral:
	//	{common::MEnumParamRealLiteral} name=ID
	//	'='
	//	value=REAL
	public MEnumParamRealLiteralElements getMEnumParamRealLiteralAccess() {
		return pMEnumParamRealLiteral;
	}
	
	public ParserRule getMEnumParamRealLiteralRule() {
		return getMEnumParamRealLiteralAccess().getRule();
	}

	//MEnumParamStringLiteral common::MEnumParamStringLiteral:
	//	{common::MEnumParamStringLiteral} name=ID
	//	'='
	//	isRaw?='raw'?
	//	value=STRING
	public MEnumParamStringLiteralElements getMEnumParamStringLiteralAccess() {
		return pMEnumParamStringLiteral;
	}
	
	public ParserRule getMEnumParamStringLiteralRule() {
		return getMEnumParamStringLiteralAccess().getRule();
	}

	//MBooleanParameterSingleExpression common::MBooleanParameterSingleExpression:
	//	constant?='const'?
	//	'boolean'
	//	name=ID
	//	':=' defaultValue=MParameterValueExpression
	//	';'
	public MBooleanParameterSingleExpressionElements getMBooleanParameterSingleExpressionAccess() {
		return pMBooleanParameterSingleExpression;
	}
	
	public ParserRule getMBooleanParameterSingleExpressionRule() {
		return getMBooleanParameterSingleExpressionAccess().getRule();
	}

	//MStringParameterSingleExpression common::MStringParameterSingleExpression:
	//	constant?='const'?
	//	'string'
	//	name=ID
	//	':=' defaultValue=MParameterValueExpression
	//	';'
	public MStringParameterSingleExpressionElements getMStringParameterSingleExpressionAccess() {
		return pMStringParameterSingleExpression;
	}
	
	public ParserRule getMStringParameterSingleExpressionRule() {
		return getMStringParameterSingleExpressionAccess().getRule();
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
