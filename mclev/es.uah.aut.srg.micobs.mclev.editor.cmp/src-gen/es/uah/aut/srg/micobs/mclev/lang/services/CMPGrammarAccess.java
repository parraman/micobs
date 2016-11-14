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
public class CMPGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMCLEVCMPPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MMCLEVCMPPackageFile");
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
		private final RuleCall cElementMMCLEVCMPPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMCLEVCMPPackageFile:
		//	'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
		//	imports+=[common::MCommonPackage|QualifiedName] ';')*
		//	element=MMCLEVCMPPackageElement;
		@Override public ParserRule getRule() { return rule; }

		//'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
		//imports+=[common::MCommonPackage|QualifiedName] ';')* element=MMCLEVCMPPackageElement
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

		//element=MMCLEVCMPPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMCLEVCMPPackageElement
		public RuleCall getElementMMCLEVCMPPackageElementParserRuleCall_4_0() { return cElementMMCLEVCMPPackageElementParserRuleCall_4_0; }
	}

	public class MMCLEVCMPPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MMCLEVCMPPackageElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMAbstractComponentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMComponentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MMCLEVCMPPackageElement:
		//	MAbstractComponent | MComponent;
		@Override public ParserRule getRule() { return rule; }

		//MAbstractComponent | MComponent
		public Alternatives getAlternatives() { return cAlternatives; }

		//MAbstractComponent
		public RuleCall getMAbstractComponentParserRuleCall_0() { return cMAbstractComponentParserRuleCall_0; }

		//MComponent
		public RuleCall getMComponentParserRuleCall_1() { return cMComponentParserRuleCall_1; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.VersionedQualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.VersionedQualifiedReferenceName");
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

	public class MPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MPort");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMServerPortParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMClientPortParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MPort:
		//	MServerPort | MClientPort;
		@Override public ParserRule getRule() { return rule; }

		//MServerPort | MClientPort
		public Alternatives getAlternatives() { return cAlternatives; }

		//MServerPort
		public RuleCall getMServerPortParserRuleCall_0() { return cMServerPortParserRuleCall_0; }

		//MClientPort
		public RuleCall getMClientPortParserRuleCall_1() { return cMClientPortParserRuleCall_1; }
	}

	public class MInternalConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalConnection");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMInternalComponentConnectionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMInternalComponentPlatformSwitchParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MInternalConnection:
		//	MInternalComponentConnection | MInternalComponentPlatformSwitch;
		@Override public ParserRule getRule() { return rule; }

		//MInternalComponentConnection | MInternalComponentPlatformSwitch
		public Alternatives getAlternatives() { return cAlternatives; }

		//MInternalComponentConnection
		public RuleCall getMInternalComponentConnectionParserRuleCall_0() { return cMInternalComponentConnectionParserRuleCall_0; }

		//MInternalComponentPlatformSwitch
		public RuleCall getMInternalComponentPlatformSwitchParserRuleCall_1() { return cMInternalComponentPlatformSwitchParserRuleCall_1; }
	}

	public class MAbstractComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MAbstractComponent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAbstractKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cComponentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDomainAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cDomainMDomainCrossReference_2_0 = (CrossReference)cDomainAssignment_2.eContents().get(0);
		private final RuleCall cDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cDomainMDomainCrossReference_2_0.eContents().get(1);
		private final Keyword cColonColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTypeMComponentTypeCrossReference_4_0 = (CrossReference)cTypeAssignment_4.eContents().get(0);
		private final RuleCall cTypeMComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_1 = (RuleCall)cTypeMComponentTypeCrossReference_4_0.eContents().get(1);
		private final Assignment cNameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNameIDTerminalRuleCall_5_0 = (RuleCall)cNameAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cInheritsKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cInheritsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cInheritsMAbstractComponentCrossReference_6_1_0 = (CrossReference)cInheritsAssignment_6_1.eContents().get(0);
		private final RuleCall cInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_1_0_1 = (RuleCall)cInheritsMAbstractComponentCrossReference_6_1_0.eContents().get(1);
		private final Group cGroup_6_2 = (Group)cGroup_6.eContents().get(2);
		private final Keyword cCommaKeyword_6_2_0 = (Keyword)cGroup_6_2.eContents().get(0);
		private final Assignment cInheritsAssignment_6_2_1 = (Assignment)cGroup_6_2.eContents().get(1);
		private final CrossReference cInheritsMAbstractComponentCrossReference_6_2_1_0 = (CrossReference)cInheritsAssignment_6_2_1.eContents().get(0);
		private final RuleCall cInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_2_1_0_1 = (RuleCall)cInheritsMAbstractComponentCrossReference_6_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final UnorderedGroup cUnorderedGroup_8 = (UnorderedGroup)cGroup.eContents().get(8);
		private final Group cGroup_8_0 = (Group)cUnorderedGroup_8.eContents().get(0);
		private final Keyword cVersionKeyword_8_0_0 = (Keyword)cGroup_8_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_8_0_1 = (Keyword)cGroup_8_0.eContents().get(1);
		private final Assignment cVersionAssignment_8_0_2 = (Assignment)cGroup_8_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_8_0_2_0 = (RuleCall)cVersionAssignment_8_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_8_0_3 = (Keyword)cGroup_8_0.eContents().get(3);
		private final Group cGroup_8_1 = (Group)cUnorderedGroup_8.eContents().get(1);
		private final Keyword cAttributesKeyword_8_1_0 = (Keyword)cGroup_8_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_8_1_1 = (Keyword)cGroup_8_1.eContents().get(1);
		private final Assignment cAttributesAssignment_8_1_2 = (Assignment)cGroup_8_1.eContents().get(2);
		private final RuleCall cAttributesMParameterParserRuleCall_8_1_2_0 = (RuleCall)cAttributesAssignment_8_1_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_1_3 = (Keyword)cGroup_8_1.eContents().get(3);
		private final Keyword cSemicolonKeyword_8_1_4 = (Keyword)cGroup_8_1.eContents().get(4);
		private final Group cGroup_8_2 = (Group)cUnorderedGroup_8.eContents().get(2);
		private final Keyword cAttributeKeyword_8_2_0 = (Keyword)cGroup_8_2.eContents().get(0);
		private final Keyword cValuesKeyword_8_2_1 = (Keyword)cGroup_8_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_8_2_2 = (Keyword)cGroup_8_2.eContents().get(2);
		private final Assignment cAttributeValueAssignmentsAssignment_8_2_3 = (Assignment)cGroup_8_2.eContents().get(3);
		private final RuleCall cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_2_3_0 = (RuleCall)cAttributeValueAssignmentsAssignment_8_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_2_4 = (Keyword)cGroup_8_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_8_2_5 = (Keyword)cGroup_8_2.eContents().get(5);
		private final Group cGroup_8_3 = (Group)cUnorderedGroup_8.eContents().get(3);
		private final Keyword cExternalKeyword_8_3_0 = (Keyword)cGroup_8_3.eContents().get(0);
		private final Keyword cPortsKeyword_8_3_1 = (Keyword)cGroup_8_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_8_3_2 = (Keyword)cGroup_8_3.eContents().get(2);
		private final Assignment cExternalPortsAssignment_8_3_3 = (Assignment)cGroup_8_3.eContents().get(3);
		private final RuleCall cExternalPortsMPortParserRuleCall_8_3_3_0 = (RuleCall)cExternalPortsAssignment_8_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_3_4 = (Keyword)cGroup_8_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_8_3_5 = (Keyword)cGroup_8_3.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//MAbstractComponent:
		//	'abstract' 'component'
		//	domain=[mclevdom::MDomain|VersionedQualifiedName] '::'
		//	type=[mclevdom::MComponentType|VersionedQualifiedReferenceName] name=ID ('inherits'
		//	inherits+=[MAbstractComponent|VersionedQualifiedName] ("," inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
		//	'{' ('version' ':=' version=Version ';' & ('attributes'
		//	'{'
		//	attributes+=MParameter+
		//	'}' ';')?
		//	& ('attribute' 'values'
		//	'{'
		//	attributeValueAssignments+=MParameterValueAssignment*
		//	'}' ';')?
		//	& ('external' 'ports'
		//	'{'
		//	externalPorts+=MPort+
		//	'}' ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'abstract' 'component' domain=[mclevdom::MDomain|VersionedQualifiedName] '::'
		//type=[mclevdom::MComponentType|VersionedQualifiedReferenceName] name=ID ('inherits'
		//inherits+=[MAbstractComponent|VersionedQualifiedName] ("," inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
		//'{' ('version' ':=' version=Version ';' & ('attributes' '{' attributes+=MParameter+ '}' ';')? & ('attribute' 'values'
		//'{' attributeValueAssignments+=MParameterValueAssignment* '}' ';')? & ('external' 'ports' '{' externalPorts+=MPort+ '}'
		//';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//'abstract'
		public Keyword getAbstractKeyword_0() { return cAbstractKeyword_0; }

		//'component'
		public Keyword getComponentKeyword_1() { return cComponentKeyword_1; }

		//domain=[mclevdom::MDomain|VersionedQualifiedName]
		public Assignment getDomainAssignment_2() { return cDomainAssignment_2; }

		//[mclevdom::MDomain|VersionedQualifiedName]
		public CrossReference getDomainMDomainCrossReference_2_0() { return cDomainMDomainCrossReference_2_0; }

		//VersionedQualifiedName
		public RuleCall getDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1() { return cDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1; }

		//'::'
		public Keyword getColonColonKeyword_3() { return cColonColonKeyword_3; }

		//type=[mclevdom::MComponentType|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }

		//[mclevdom::MComponentType|VersionedQualifiedReferenceName]
		public CrossReference getTypeMComponentTypeCrossReference_4_0() { return cTypeMComponentTypeCrossReference_4_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeMComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_1() { return cTypeMComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_1; }

		//name=ID
		public Assignment getNameAssignment_5() { return cNameAssignment_5; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_5_0() { return cNameIDTerminalRuleCall_5_0; }

		//('inherits' inherits+=[MAbstractComponent|VersionedQualifiedName] (","
		//inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
		public Group getGroup_6() { return cGroup_6; }

		//'inherits'
		public Keyword getInheritsKeyword_6_0() { return cInheritsKeyword_6_0; }

		//inherits+=[MAbstractComponent|VersionedQualifiedName]
		public Assignment getInheritsAssignment_6_1() { return cInheritsAssignment_6_1; }

		//[MAbstractComponent|VersionedQualifiedName]
		public CrossReference getInheritsMAbstractComponentCrossReference_6_1_0() { return cInheritsMAbstractComponentCrossReference_6_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_1_0_1() { return cInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_1_0_1; }

		//("," inherits+=[MAbstractComponent|VersionedQualifiedName])*
		public Group getGroup_6_2() { return cGroup_6_2; }

		//","
		public Keyword getCommaKeyword_6_2_0() { return cCommaKeyword_6_2_0; }

		//inherits+=[MAbstractComponent|VersionedQualifiedName]
		public Assignment getInheritsAssignment_6_2_1() { return cInheritsAssignment_6_2_1; }

		//[MAbstractComponent|VersionedQualifiedName]
		public CrossReference getInheritsMAbstractComponentCrossReference_6_2_1_0() { return cInheritsMAbstractComponentCrossReference_6_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_2_1_0_1() { return cInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_7() { return cLeftCurlyBracketKeyword_7; }

		//('version' ':=' version=Version ';' & ('attributes' '{' attributes+=MParameter+ '}' ';')? & ('attribute' 'values' '{'
		//attributeValueAssignments+=MParameterValueAssignment* '}' ';')? & ('external' 'ports' '{' externalPorts+=MPort+ '}'
		//';')?)
		public UnorderedGroup getUnorderedGroup_8() { return cUnorderedGroup_8; }

		//'version' ':=' version=Version ';'
		public Group getGroup_8_0() { return cGroup_8_0; }

		//'version'
		public Keyword getVersionKeyword_8_0_0() { return cVersionKeyword_8_0_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_8_0_1() { return cColonEqualsSignKeyword_8_0_1; }

		//version=Version
		public Assignment getVersionAssignment_8_0_2() { return cVersionAssignment_8_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_8_0_2_0() { return cVersionVersionParserRuleCall_8_0_2_0; }

		//';'
		public Keyword getSemicolonKeyword_8_0_3() { return cSemicolonKeyword_8_0_3; }

		//('attributes' '{' attributes+=MParameter+ '}' ';')?
		public Group getGroup_8_1() { return cGroup_8_1; }

		//'attributes'
		public Keyword getAttributesKeyword_8_1_0() { return cAttributesKeyword_8_1_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_1_1() { return cLeftCurlyBracketKeyword_8_1_1; }

		//attributes+=MParameter+
		public Assignment getAttributesAssignment_8_1_2() { return cAttributesAssignment_8_1_2; }

		//MParameter
		public RuleCall getAttributesMParameterParserRuleCall_8_1_2_0() { return cAttributesMParameterParserRuleCall_8_1_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8_1_3() { return cRightCurlyBracketKeyword_8_1_3; }

		//';'
		public Keyword getSemicolonKeyword_8_1_4() { return cSemicolonKeyword_8_1_4; }

		//('attribute' 'values' '{' attributeValueAssignments+=MParameterValueAssignment* '}' ';')?
		public Group getGroup_8_2() { return cGroup_8_2; }

		//'attribute'
		public Keyword getAttributeKeyword_8_2_0() { return cAttributeKeyword_8_2_0; }

		//'values'
		public Keyword getValuesKeyword_8_2_1() { return cValuesKeyword_8_2_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_2_2() { return cLeftCurlyBracketKeyword_8_2_2; }

		//attributeValueAssignments+=MParameterValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_8_2_3() { return cAttributeValueAssignmentsAssignment_8_2_3; }

		//MParameterValueAssignment
		public RuleCall getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_2_3_0() { return cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_2_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8_2_4() { return cRightCurlyBracketKeyword_8_2_4; }

		//';'
		public Keyword getSemicolonKeyword_8_2_5() { return cSemicolonKeyword_8_2_5; }

		//('external' 'ports' '{' externalPorts+=MPort+ '}' ';')?
		public Group getGroup_8_3() { return cGroup_8_3; }

		//'external'
		public Keyword getExternalKeyword_8_3_0() { return cExternalKeyword_8_3_0; }

		//'ports'
		public Keyword getPortsKeyword_8_3_1() { return cPortsKeyword_8_3_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_3_2() { return cLeftCurlyBracketKeyword_8_3_2; }

		//externalPorts+=MPort+
		public Assignment getExternalPortsAssignment_8_3_3() { return cExternalPortsAssignment_8_3_3; }

		//MPort
		public RuleCall getExternalPortsMPortParserRuleCall_8_3_3_0() { return cExternalPortsMPortParserRuleCall_8_3_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8_3_4() { return cRightCurlyBracketKeyword_8_3_4; }

		//';'
		public Keyword getSemicolonKeyword_8_3_5() { return cSemicolonKeyword_8_3_5; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }

		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}

	public class MComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MComponent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMComponentAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cComponentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDomainAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cDomainMDomainCrossReference_2_0 = (CrossReference)cDomainAssignment_2.eContents().get(0);
		private final RuleCall cDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cDomainMDomainCrossReference_2_0.eContents().get(1);
		private final Keyword cColonColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTypeMComponentTypeCrossReference_4_0 = (CrossReference)cTypeAssignment_4.eContents().get(0);
		private final RuleCall cTypeMComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_1 = (RuleCall)cTypeMComponentTypeCrossReference_4_0.eContents().get(1);
		private final Assignment cNameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNameIDTerminalRuleCall_5_0 = (RuleCall)cNameAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cInheritsKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cInheritsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cInheritsMAbstractComponentCrossReference_6_1_0 = (CrossReference)cInheritsAssignment_6_1.eContents().get(0);
		private final RuleCall cInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_1_0_1 = (RuleCall)cInheritsMAbstractComponentCrossReference_6_1_0.eContents().get(1);
		private final Group cGroup_6_2 = (Group)cGroup_6.eContents().get(2);
		private final Keyword cCommaKeyword_6_2_0 = (Keyword)cGroup_6_2.eContents().get(0);
		private final Assignment cInheritsAssignment_6_2_1 = (Assignment)cGroup_6_2.eContents().get(1);
		private final CrossReference cInheritsMAbstractComponentCrossReference_6_2_1_0 = (CrossReference)cInheritsAssignment_6_2_1.eContents().get(0);
		private final RuleCall cInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_2_1_0_1 = (RuleCall)cInheritsMAbstractComponentCrossReference_6_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final UnorderedGroup cUnorderedGroup_8 = (UnorderedGroup)cGroup.eContents().get(8);
		private final Group cGroup_8_0 = (Group)cUnorderedGroup_8.eContents().get(0);
		private final Keyword cVersionKeyword_8_0_0 = (Keyword)cGroup_8_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_8_0_1 = (Keyword)cGroup_8_0.eContents().get(1);
		private final Assignment cVersionAssignment_8_0_2 = (Assignment)cGroup_8_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_8_0_2_0 = (RuleCall)cVersionAssignment_8_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_8_0_3 = (Keyword)cGroup_8_0.eContents().get(3);
		private final Group cGroup_8_1 = (Group)cUnorderedGroup_8.eContents().get(1);
		private final Keyword cLanguagesKeyword_8_1_0 = (Keyword)cGroup_8_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_8_1_1 = (Keyword)cGroup_8_1.eContents().get(1);
		private final Assignment cLanguagesAssignment_8_1_2 = (Assignment)cGroup_8_1.eContents().get(2);
		private final CrossReference cLanguagesMLanguageCrossReference_8_1_2_0 = (CrossReference)cLanguagesAssignment_8_1_2.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_8_1_2_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_8_1_2_0.eContents().get(1);
		private final Group cGroup_8_1_3 = (Group)cGroup_8_1.eContents().get(3);
		private final Keyword cCommaKeyword_8_1_3_0 = (Keyword)cGroup_8_1_3.eContents().get(0);
		private final Assignment cLanguagesAssignment_8_1_3_1 = (Assignment)cGroup_8_1_3.eContents().get(1);
		private final CrossReference cLanguagesMLanguageCrossReference_8_1_3_1_0 = (CrossReference)cLanguagesAssignment_8_1_3_1.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_8_1_3_1_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_8_1_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_8_1_4 = (Keyword)cGroup_8_1.eContents().get(4);
		private final Group cGroup_8_2 = (Group)cUnorderedGroup_8.eContents().get(2);
		private final Keyword cAttributesKeyword_8_2_0 = (Keyword)cGroup_8_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_8_2_1 = (Keyword)cGroup_8_2.eContents().get(1);
		private final Assignment cAttributesAssignment_8_2_2 = (Assignment)cGroup_8_2.eContents().get(2);
		private final RuleCall cAttributesMParameterParserRuleCall_8_2_2_0 = (RuleCall)cAttributesAssignment_8_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_2_3 = (Keyword)cGroup_8_2.eContents().get(3);
		private final Keyword cSemicolonKeyword_8_2_4 = (Keyword)cGroup_8_2.eContents().get(4);
		private final Group cGroup_8_3 = (Group)cUnorderedGroup_8.eContents().get(3);
		private final Keyword cAttributeKeyword_8_3_0 = (Keyword)cGroup_8_3.eContents().get(0);
		private final Keyword cValuesKeyword_8_3_1 = (Keyword)cGroup_8_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_8_3_2 = (Keyword)cGroup_8_3.eContents().get(2);
		private final Assignment cAttributeValueAssignmentsAssignment_8_3_3 = (Assignment)cGroup_8_3.eContents().get(3);
		private final RuleCall cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_3_3_0 = (RuleCall)cAttributeValueAssignmentsAssignment_8_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_3_4 = (Keyword)cGroup_8_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_8_3_5 = (Keyword)cGroup_8_3.eContents().get(5);
		private final Group cGroup_8_4 = (Group)cUnorderedGroup_8.eContents().get(4);
		private final Keyword cExternalKeyword_8_4_0 = (Keyword)cGroup_8_4.eContents().get(0);
		private final Keyword cPortsKeyword_8_4_1 = (Keyword)cGroup_8_4.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_8_4_2 = (Keyword)cGroup_8_4.eContents().get(2);
		private final Assignment cExternalPortsAssignment_8_4_3 = (Assignment)cGroup_8_4.eContents().get(3);
		private final RuleCall cExternalPortsMPortParserRuleCall_8_4_3_0 = (RuleCall)cExternalPortsAssignment_8_4_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_4_4 = (Keyword)cGroup_8_4.eContents().get(4);
		private final Keyword cSemicolonKeyword_8_4_5 = (Keyword)cGroup_8_4.eContents().get(5);
		private final Group cGroup_8_5 = (Group)cUnorderedGroup_8.eContents().get(5);
		private final Keyword cInternalKeyword_8_5_0 = (Keyword)cGroup_8_5.eContents().get(0);
		private final Keyword cPortsKeyword_8_5_1 = (Keyword)cGroup_8_5.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_8_5_2 = (Keyword)cGroup_8_5.eContents().get(2);
		private final Assignment cInternalPortsAssignment_8_5_3 = (Assignment)cGroup_8_5.eContents().get(3);
		private final RuleCall cInternalPortsMPortParserRuleCall_8_5_3_0 = (RuleCall)cInternalPortsAssignment_8_5_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_5_4 = (Keyword)cGroup_8_5.eContents().get(4);
		private final Keyword cSemicolonKeyword_8_5_5 = (Keyword)cGroup_8_5.eContents().get(5);
		private final Group cGroup_8_6 = (Group)cUnorderedGroup_8.eContents().get(6);
		private final Keyword cRequiresKeyword_8_6_0 = (Keyword)cGroup_8_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_8_6_1 = (Keyword)cGroup_8_6.eContents().get(1);
		private final Assignment cRequiresAssignment_8_6_2 = (Assignment)cGroup_8_6.eContents().get(2);
		private final CrossReference cRequiresMSAICrossReference_8_6_2_0 = (CrossReference)cRequiresAssignment_8_6_2.eContents().get(0);
		private final RuleCall cRequiresMSAIVersionedQualifiedNameParserRuleCall_8_6_2_0_1 = (RuleCall)cRequiresMSAICrossReference_8_6_2_0.eContents().get(1);
		private final Group cGroup_8_6_3 = (Group)cGroup_8_6.eContents().get(3);
		private final Keyword cCommaKeyword_8_6_3_0 = (Keyword)cGroup_8_6_3.eContents().get(0);
		private final Assignment cRequiresAssignment_8_6_3_1 = (Assignment)cGroup_8_6_3.eContents().get(1);
		private final CrossReference cRequiresMSAICrossReference_8_6_3_1_0 = (CrossReference)cRequiresAssignment_8_6_3_1.eContents().get(0);
		private final RuleCall cRequiresMSAIVersionedQualifiedNameParserRuleCall_8_6_3_1_0_1 = (RuleCall)cRequiresMSAICrossReference_8_6_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_8_6_4 = (Keyword)cGroup_8_6.eContents().get(4);
		private final Group cGroup_8_7 = (Group)cUnorderedGroup_8.eContents().get(7);
		private final Keyword cSupportedKeyword_8_7_0 = (Keyword)cGroup_8_7.eContents().get(0);
		private final Keyword cPlatformsKeyword_8_7_1 = (Keyword)cGroup_8_7.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_8_7_2 = (Keyword)cGroup_8_7.eContents().get(2);
		private final Assignment cSupportedPlatformsAssignment_8_7_3 = (Assignment)cGroup_8_7.eContents().get(3);
		private final RuleCall cSupportedPlatformsComponentSupportedPlatformParserRuleCall_8_7_3_0 = (RuleCall)cSupportedPlatformsAssignment_8_7_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_7_4 = (Keyword)cGroup_8_7.eContents().get(4);
		private final Keyword cSemicolonKeyword_8_7_5 = (Keyword)cGroup_8_7.eContents().get(5);
		private final Group cGroup_8_8 = (Group)cUnorderedGroup_8.eContents().get(8);
		private final Keyword cSubcomponentKeyword_8_8_0 = (Keyword)cGroup_8_8.eContents().get(0);
		private final Keyword cInstancesKeyword_8_8_1 = (Keyword)cGroup_8_8.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_8_8_2 = (Keyword)cGroup_8_8.eContents().get(2);
		private final Assignment cInternalComponentsAssignment_8_8_3 = (Assignment)cGroup_8_8.eContents().get(3);
		private final RuleCall cInternalComponentsMInternalComponentInstanceParserRuleCall_8_8_3_0 = (RuleCall)cInternalComponentsAssignment_8_8_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_8_4 = (Keyword)cGroup_8_8.eContents().get(4);
		private final Keyword cSemicolonKeyword_8_8_5 = (Keyword)cGroup_8_8.eContents().get(5);
		private final Group cGroup_8_9 = (Group)cUnorderedGroup_8.eContents().get(9);
		private final Keyword cConnectionsKeyword_8_9_0 = (Keyword)cGroup_8_9.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_8_9_1 = (Keyword)cGroup_8_9.eContents().get(1);
		private final Assignment cConnectionsAssignment_8_9_2 = (Assignment)cGroup_8_9.eContents().get(2);
		private final RuleCall cConnectionsMInternalConnectionParserRuleCall_8_9_2_0 = (RuleCall)cConnectionsAssignment_8_9_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8_9_3 = (Keyword)cGroup_8_9.eContents().get(3);
		private final Keyword cSemicolonKeyword_8_9_4 = (Keyword)cGroup_8_9.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//MComponent:
		//	{MComponent}
		//	'component'
		//	domain=[mclevdom::MDomain|VersionedQualifiedName] '::'
		//	type=[mclevdom::MComponentType|VersionedQualifiedReferenceName] name=ID ('inherits'
		//	inherits+=[MAbstractComponent|VersionedQualifiedName] ("," inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
		//	'{' ('version' ':=' version=Version ';' & ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//	languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
		//	& ('attributes'
		//	'{'
		//	attributes+=MParameter+
		//	'}' ';')?
		//	& ('attribute' 'values'
		//	'{'
		//	attributeValueAssignments+=MParameterValueAssignment*
		//	'}' ';')?
		//	& ('external' 'ports'
		//	'{'
		//	externalPorts+=MPort+
		//	'}' ';')?
		//	& ('internal' 'ports'
		//	'{'
		//	internalPorts+=MPort+
		//	'}' ';')?
		//	& ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
		//	requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
		//	& ('supported' 'platforms'
		//	'{'
		//	supportedPlatforms+=ComponentSupportedPlatform+
		//	'}' ';')?
		//	& ('subcomponent' 'instances'
		//	'{'
		//	internalComponents+=MInternalComponentInstance+
		//	'}' ';')?
		//	& ('connections'
		//	'{'
		//	connections+=MInternalConnection+
		//	'}' ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//{MComponent} 'component' domain=[mclevdom::MDomain|VersionedQualifiedName] '::'
		//type=[mclevdom::MComponentType|VersionedQualifiedReferenceName] name=ID ('inherits'
		//inherits+=[MAbstractComponent|VersionedQualifiedName] ("," inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
		//'{' ('version' ':=' version=Version ';' & ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ';')? & ('attributes' '{' attributes+=MParameter+ '}' ';')? &
		//('attribute' 'values' '{' attributeValueAssignments+=MParameterValueAssignment* '}' ';')? & ('external' 'ports' '{'
		//externalPorts+=MPort+ '}' ';')? & ('internal' 'ports' '{' internalPorts+=MPort+ '}' ';')? & ('requires' ':='
		//requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')? &
		//('supported' 'platforms' '{' supportedPlatforms+=ComponentSupportedPlatform+ '}' ';')? & ('subcomponent' 'instances'
		//'{' internalComponents+=MInternalComponentInstance+ '}' ';')? & ('connections' '{' connections+=MInternalConnection+
		//'}' ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//{MComponent}
		public Action getMComponentAction_0() { return cMComponentAction_0; }

		//'component'
		public Keyword getComponentKeyword_1() { return cComponentKeyword_1; }

		//domain=[mclevdom::MDomain|VersionedQualifiedName]
		public Assignment getDomainAssignment_2() { return cDomainAssignment_2; }

		//[mclevdom::MDomain|VersionedQualifiedName]
		public CrossReference getDomainMDomainCrossReference_2_0() { return cDomainMDomainCrossReference_2_0; }

		//VersionedQualifiedName
		public RuleCall getDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1() { return cDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1; }

		//'::'
		public Keyword getColonColonKeyword_3() { return cColonColonKeyword_3; }

		//type=[mclevdom::MComponentType|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }

		//[mclevdom::MComponentType|VersionedQualifiedReferenceName]
		public CrossReference getTypeMComponentTypeCrossReference_4_0() { return cTypeMComponentTypeCrossReference_4_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeMComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_1() { return cTypeMComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_1; }

		//name=ID
		public Assignment getNameAssignment_5() { return cNameAssignment_5; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_5_0() { return cNameIDTerminalRuleCall_5_0; }

		//('inherits' inherits+=[MAbstractComponent|VersionedQualifiedName] (","
		//inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
		public Group getGroup_6() { return cGroup_6; }

		//'inherits'
		public Keyword getInheritsKeyword_6_0() { return cInheritsKeyword_6_0; }

		//inherits+=[MAbstractComponent|VersionedQualifiedName]
		public Assignment getInheritsAssignment_6_1() { return cInheritsAssignment_6_1; }

		//[MAbstractComponent|VersionedQualifiedName]
		public CrossReference getInheritsMAbstractComponentCrossReference_6_1_0() { return cInheritsMAbstractComponentCrossReference_6_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_1_0_1() { return cInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_1_0_1; }

		//("," inherits+=[MAbstractComponent|VersionedQualifiedName])*
		public Group getGroup_6_2() { return cGroup_6_2; }

		//","
		public Keyword getCommaKeyword_6_2_0() { return cCommaKeyword_6_2_0; }

		//inherits+=[MAbstractComponent|VersionedQualifiedName]
		public Assignment getInheritsAssignment_6_2_1() { return cInheritsAssignment_6_2_1; }

		//[MAbstractComponent|VersionedQualifiedName]
		public CrossReference getInheritsMAbstractComponentCrossReference_6_2_1_0() { return cInheritsMAbstractComponentCrossReference_6_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_2_1_0_1() { return cInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_7() { return cLeftCurlyBracketKeyword_7; }

		//('version' ':=' version=Version ';' & ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ';')? & ('attributes' '{' attributes+=MParameter+ '}' ';')? &
		//('attribute' 'values' '{' attributeValueAssignments+=MParameterValueAssignment* '}' ';')? & ('external' 'ports' '{'
		//externalPorts+=MPort+ '}' ';')? & ('internal' 'ports' '{' internalPorts+=MPort+ '}' ';')? & ('requires' ':='
		//requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')? &
		//('supported' 'platforms' '{' supportedPlatforms+=ComponentSupportedPlatform+ '}' ';')? & ('subcomponent' 'instances'
		//'{' internalComponents+=MInternalComponentInstance+ '}' ';')? & ('connections' '{' connections+=MInternalConnection+
		//'}' ';')?)
		public UnorderedGroup getUnorderedGroup_8() { return cUnorderedGroup_8; }

		//'version' ':=' version=Version ';'
		public Group getGroup_8_0() { return cGroup_8_0; }

		//'version'
		public Keyword getVersionKeyword_8_0_0() { return cVersionKeyword_8_0_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_8_0_1() { return cColonEqualsSignKeyword_8_0_1; }

		//version=Version
		public Assignment getVersionAssignment_8_0_2() { return cVersionAssignment_8_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_8_0_2_0() { return cVersionVersionParserRuleCall_8_0_2_0; }

		//';'
		public Keyword getSemicolonKeyword_8_0_3() { return cSemicolonKeyword_8_0_3; }

		//('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
		public Group getGroup_8_1() { return cGroup_8_1; }

		//'languages'
		public Keyword getLanguagesKeyword_8_1_0() { return cLanguagesKeyword_8_1_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_8_1_1() { return cColonEqualsSignKeyword_8_1_1; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_8_1_2() { return cLanguagesAssignment_8_1_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_8_1_2_0() { return cLanguagesMLanguageCrossReference_8_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_8_1_2_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_8_1_2_0_1; }

		//("," languages+=[system::MLanguage|VersionedQualifiedName])*
		public Group getGroup_8_1_3() { return cGroup_8_1_3; }

		//","
		public Keyword getCommaKeyword_8_1_3_0() { return cCommaKeyword_8_1_3_0; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_8_1_3_1() { return cLanguagesAssignment_8_1_3_1; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_8_1_3_1_0() { return cLanguagesMLanguageCrossReference_8_1_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_8_1_3_1_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_8_1_3_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_8_1_4() { return cSemicolonKeyword_8_1_4; }

		//('attributes' '{' attributes+=MParameter+ '}' ';')?
		public Group getGroup_8_2() { return cGroup_8_2; }

		//'attributes'
		public Keyword getAttributesKeyword_8_2_0() { return cAttributesKeyword_8_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_2_1() { return cLeftCurlyBracketKeyword_8_2_1; }

		//attributes+=MParameter+
		public Assignment getAttributesAssignment_8_2_2() { return cAttributesAssignment_8_2_2; }

		//MParameter
		public RuleCall getAttributesMParameterParserRuleCall_8_2_2_0() { return cAttributesMParameterParserRuleCall_8_2_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8_2_3() { return cRightCurlyBracketKeyword_8_2_3; }

		//';'
		public Keyword getSemicolonKeyword_8_2_4() { return cSemicolonKeyword_8_2_4; }

		//('attribute' 'values' '{' attributeValueAssignments+=MParameterValueAssignment* '}' ';')?
		public Group getGroup_8_3() { return cGroup_8_3; }

		//'attribute'
		public Keyword getAttributeKeyword_8_3_0() { return cAttributeKeyword_8_3_0; }

		//'values'
		public Keyword getValuesKeyword_8_3_1() { return cValuesKeyword_8_3_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_3_2() { return cLeftCurlyBracketKeyword_8_3_2; }

		//attributeValueAssignments+=MParameterValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_8_3_3() { return cAttributeValueAssignmentsAssignment_8_3_3; }

		//MParameterValueAssignment
		public RuleCall getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_3_3_0() { return cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_3_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8_3_4() { return cRightCurlyBracketKeyword_8_3_4; }

		//';'
		public Keyword getSemicolonKeyword_8_3_5() { return cSemicolonKeyword_8_3_5; }

		//('external' 'ports' '{' externalPorts+=MPort+ '}' ';')?
		public Group getGroup_8_4() { return cGroup_8_4; }

		//'external'
		public Keyword getExternalKeyword_8_4_0() { return cExternalKeyword_8_4_0; }

		//'ports'
		public Keyword getPortsKeyword_8_4_1() { return cPortsKeyword_8_4_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_4_2() { return cLeftCurlyBracketKeyword_8_4_2; }

		//externalPorts+=MPort+
		public Assignment getExternalPortsAssignment_8_4_3() { return cExternalPortsAssignment_8_4_3; }

		//MPort
		public RuleCall getExternalPortsMPortParserRuleCall_8_4_3_0() { return cExternalPortsMPortParserRuleCall_8_4_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8_4_4() { return cRightCurlyBracketKeyword_8_4_4; }

		//';'
		public Keyword getSemicolonKeyword_8_4_5() { return cSemicolonKeyword_8_4_5; }

		//('internal' 'ports' '{' internalPorts+=MPort+ '}' ';')?
		public Group getGroup_8_5() { return cGroup_8_5; }

		//'internal'
		public Keyword getInternalKeyword_8_5_0() { return cInternalKeyword_8_5_0; }

		//'ports'
		public Keyword getPortsKeyword_8_5_1() { return cPortsKeyword_8_5_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_5_2() { return cLeftCurlyBracketKeyword_8_5_2; }

		//internalPorts+=MPort+
		public Assignment getInternalPortsAssignment_8_5_3() { return cInternalPortsAssignment_8_5_3; }

		//MPort
		public RuleCall getInternalPortsMPortParserRuleCall_8_5_3_0() { return cInternalPortsMPortParserRuleCall_8_5_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8_5_4() { return cRightCurlyBracketKeyword_8_5_4; }

		//';'
		public Keyword getSemicolonKeyword_8_5_5() { return cSemicolonKeyword_8_5_5; }

		//('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
		//requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
		public Group getGroup_8_6() { return cGroup_8_6; }

		//'requires'
		public Keyword getRequiresKeyword_8_6_0() { return cRequiresKeyword_8_6_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_8_6_1() { return cColonEqualsSignKeyword_8_6_1; }

		//requires+=[mclevsai::MSAI|VersionedQualifiedName]
		public Assignment getRequiresAssignment_8_6_2() { return cRequiresAssignment_8_6_2; }

		//[mclevsai::MSAI|VersionedQualifiedName]
		public CrossReference getRequiresMSAICrossReference_8_6_2_0() { return cRequiresMSAICrossReference_8_6_2_0; }

		//VersionedQualifiedName
		public RuleCall getRequiresMSAIVersionedQualifiedNameParserRuleCall_8_6_2_0_1() { return cRequiresMSAIVersionedQualifiedNameParserRuleCall_8_6_2_0_1; }

		//("," requires+=[mclevsai::MSAI|VersionedQualifiedName])*
		public Group getGroup_8_6_3() { return cGroup_8_6_3; }

		//","
		public Keyword getCommaKeyword_8_6_3_0() { return cCommaKeyword_8_6_3_0; }

		//requires+=[mclevsai::MSAI|VersionedQualifiedName]
		public Assignment getRequiresAssignment_8_6_3_1() { return cRequiresAssignment_8_6_3_1; }

		//[mclevsai::MSAI|VersionedQualifiedName]
		public CrossReference getRequiresMSAICrossReference_8_6_3_1_0() { return cRequiresMSAICrossReference_8_6_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getRequiresMSAIVersionedQualifiedNameParserRuleCall_8_6_3_1_0_1() { return cRequiresMSAIVersionedQualifiedNameParserRuleCall_8_6_3_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_8_6_4() { return cSemicolonKeyword_8_6_4; }

		//('supported' 'platforms' '{' supportedPlatforms+=ComponentSupportedPlatform+ '}' ';')?
		public Group getGroup_8_7() { return cGroup_8_7; }

		//'supported'
		public Keyword getSupportedKeyword_8_7_0() { return cSupportedKeyword_8_7_0; }

		//'platforms'
		public Keyword getPlatformsKeyword_8_7_1() { return cPlatformsKeyword_8_7_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_7_2() { return cLeftCurlyBracketKeyword_8_7_2; }

		//supportedPlatforms+=ComponentSupportedPlatform+
		public Assignment getSupportedPlatformsAssignment_8_7_3() { return cSupportedPlatformsAssignment_8_7_3; }

		//ComponentSupportedPlatform
		public RuleCall getSupportedPlatformsComponentSupportedPlatformParserRuleCall_8_7_3_0() { return cSupportedPlatformsComponentSupportedPlatformParserRuleCall_8_7_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8_7_4() { return cRightCurlyBracketKeyword_8_7_4; }

		//';'
		public Keyword getSemicolonKeyword_8_7_5() { return cSemicolonKeyword_8_7_5; }

		//('subcomponent' 'instances' '{' internalComponents+=MInternalComponentInstance+ '}' ';')?
		public Group getGroup_8_8() { return cGroup_8_8; }

		//'subcomponent'
		public Keyword getSubcomponentKeyword_8_8_0() { return cSubcomponentKeyword_8_8_0; }

		//'instances'
		public Keyword getInstancesKeyword_8_8_1() { return cInstancesKeyword_8_8_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_8_2() { return cLeftCurlyBracketKeyword_8_8_2; }

		//internalComponents+=MInternalComponentInstance+
		public Assignment getInternalComponentsAssignment_8_8_3() { return cInternalComponentsAssignment_8_8_3; }

		//MInternalComponentInstance
		public RuleCall getInternalComponentsMInternalComponentInstanceParserRuleCall_8_8_3_0() { return cInternalComponentsMInternalComponentInstanceParserRuleCall_8_8_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8_8_4() { return cRightCurlyBracketKeyword_8_8_4; }

		//';'
		public Keyword getSemicolonKeyword_8_8_5() { return cSemicolonKeyword_8_8_5; }

		//('connections' '{' connections+=MInternalConnection+ '}' ';')?
		public Group getGroup_8_9() { return cGroup_8_9; }

		//'connections'
		public Keyword getConnectionsKeyword_8_9_0() { return cConnectionsKeyword_8_9_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_8_9_1() { return cLeftCurlyBracketKeyword_8_9_1; }

		//connections+=MInternalConnection+
		public Assignment getConnectionsAssignment_8_9_2() { return cConnectionsAssignment_8_9_2; }

		//MInternalConnection
		public RuleCall getConnectionsMInternalConnectionParserRuleCall_8_9_2_0() { return cConnectionsMInternalConnectionParserRuleCall_8_9_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_8_9_3() { return cRightCurlyBracketKeyword_8_9_3; }

		//';'
		public Keyword getSemicolonKeyword_8_9_4() { return cSemicolonKeyword_8_9_4; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }

		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}

	public class MInternalComponentInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalComponentInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsSingletonAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsSingletonSingletonKeyword_0_0 = (Keyword)cIsSingletonAssignment_0.eContents().get(0);
		private final Keyword cInstanceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cComponentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cComponentMComponentCrossReference_2_0 = (CrossReference)cComponentAssignment_2.eContents().get(0);
		private final RuleCall cComponentMComponentVersionedQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cComponentMComponentCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAttributeValueAssignmentsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0 = (RuleCall)cAttributeValueAssignmentsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MInternalComponentInstance:
		//	isSingleton?='singleton'?
		//	'instance'
		//	component=[MComponent|VersionedQualifiedName] name=ID
		//	'{'
		//	attributeValueAssignments+=MParameterValueAssignment*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//isSingleton?='singleton'? 'instance' component=[MComponent|VersionedQualifiedName] name=ID '{'
		//attributeValueAssignments+=MParameterValueAssignment* '}' ';'
		public Group getGroup() { return cGroup; }

		//isSingleton?='singleton'?
		public Assignment getIsSingletonAssignment_0() { return cIsSingletonAssignment_0; }

		//'singleton'
		public Keyword getIsSingletonSingletonKeyword_0_0() { return cIsSingletonSingletonKeyword_0_0; }

		//'instance'
		public Keyword getInstanceKeyword_1() { return cInstanceKeyword_1; }

		//component=[MComponent|VersionedQualifiedName]
		public Assignment getComponentAssignment_2() { return cComponentAssignment_2; }

		//[MComponent|VersionedQualifiedName]
		public CrossReference getComponentMComponentCrossReference_2_0() { return cComponentMComponentCrossReference_2_0; }

		//VersionedQualifiedName
		public RuleCall getComponentMComponentVersionedQualifiedNameParserRuleCall_2_0_1() { return cComponentMComponentVersionedQualifiedNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//attributeValueAssignments+=MParameterValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_5() { return cAttributeValueAssignmentsAssignment_5; }

		//MParameterValueAssignment
		public RuleCall getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0() { return cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MServerPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MServerPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMServerPortAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cServerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeMPortTypeCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeMPortTypeVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cTypeMPortTypeCrossReference_2_0.eContents().get(1);
		private final Assignment cInterfaceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cInterfaceMInterfaceCrossReference_3_0 = (CrossReference)cInterfaceAssignment_3.eContents().get(0);
		private final RuleCall cInterfaceMInterfaceVersionedQualifiedNameParserRuleCall_3_0_1 = (RuleCall)cInterfaceMInterfaceCrossReference_3_0.eContents().get(1);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cAttributeValueAssignmentsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0 = (RuleCall)cAttributeValueAssignmentsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MServerPort:
		//	{MServerPort}
		//	'server'
		//	type=[mclevdom::MPortType|VersionedQualifiedReferenceName] interface=[mcleviface::MInterface|VersionedQualifiedName]
		//	name=ID
		//	'{'
		//	attributeValueAssignments+=MParameterValueAssignment*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//{MServerPort} 'server' type=[mclevdom::MPortType|VersionedQualifiedReferenceName]
		//interface=[mcleviface::MInterface|VersionedQualifiedName] name=ID '{'
		//attributeValueAssignments+=MParameterValueAssignment* '}' ';'
		public Group getGroup() { return cGroup; }

		//{MServerPort}
		public Action getMServerPortAction_0() { return cMServerPortAction_0; }

		//'server'
		public Keyword getServerKeyword_1() { return cServerKeyword_1; }

		//type=[mclevdom::MPortType|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[mclevdom::MPortType|VersionedQualifiedReferenceName]
		public CrossReference getTypeMPortTypeCrossReference_2_0() { return cTypeMPortTypeCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeMPortTypeVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cTypeMPortTypeVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//interface=[mcleviface::MInterface|VersionedQualifiedName]
		public Assignment getInterfaceAssignment_3() { return cInterfaceAssignment_3; }

		//[mcleviface::MInterface|VersionedQualifiedName]
		public CrossReference getInterfaceMInterfaceCrossReference_3_0() { return cInterfaceMInterfaceCrossReference_3_0; }

		//VersionedQualifiedName
		public RuleCall getInterfaceMInterfaceVersionedQualifiedNameParserRuleCall_3_0_1() { return cInterfaceMInterfaceVersionedQualifiedNameParserRuleCall_3_0_1; }

		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//attributeValueAssignments+=MParameterValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_6() { return cAttributeValueAssignmentsAssignment_6; }

		//MParameterValueAssignment
		public RuleCall getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0() { return cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class MClientPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MClientPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMClientPortAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cClientKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeMPortTypeCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeMPortTypeVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cTypeMPortTypeCrossReference_2_0.eContents().get(1);
		private final Assignment cInterfaceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cInterfaceMInterfaceCrossReference_3_0 = (CrossReference)cInterfaceAssignment_3.eContents().get(0);
		private final RuleCall cInterfaceMInterfaceVersionedQualifiedNameParserRuleCall_3_0_1 = (RuleCall)cInterfaceMInterfaceCrossReference_3_0.eContents().get(1);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cAttributeValueAssignmentsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0 = (RuleCall)cAttributeValueAssignmentsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MClientPort:
		//	{MClientPort}
		//	'client'
		//	type=[mclevdom::MPortType|VersionedQualifiedReferenceName] interface=[mcleviface::MInterface|VersionedQualifiedName]
		//	name=ID
		//	'{'
		//	attributeValueAssignments+=MParameterValueAssignment*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//{MClientPort} 'client' type=[mclevdom::MPortType|VersionedQualifiedReferenceName]
		//interface=[mcleviface::MInterface|VersionedQualifiedName] name=ID '{'
		//attributeValueAssignments+=MParameterValueAssignment* '}' ';'
		public Group getGroup() { return cGroup; }

		//{MClientPort}
		public Action getMClientPortAction_0() { return cMClientPortAction_0; }

		//'client'
		public Keyword getClientKeyword_1() { return cClientKeyword_1; }

		//type=[mclevdom::MPortType|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[mclevdom::MPortType|VersionedQualifiedReferenceName]
		public CrossReference getTypeMPortTypeCrossReference_2_0() { return cTypeMPortTypeCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeMPortTypeVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cTypeMPortTypeVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//interface=[mcleviface::MInterface|VersionedQualifiedName]
		public Assignment getInterfaceAssignment_3() { return cInterfaceAssignment_3; }

		//[mcleviface::MInterface|VersionedQualifiedName]
		public CrossReference getInterfaceMInterfaceCrossReference_3_0() { return cInterfaceMInterfaceCrossReference_3_0; }

		//VersionedQualifiedName
		public RuleCall getInterfaceMInterfaceVersionedQualifiedNameParserRuleCall_3_0_1() { return cInterfaceMInterfaceVersionedQualifiedNameParserRuleCall_3_0_1; }

		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//attributeValueAssignments+=MParameterValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_6() { return cAttributeValueAssignmentsAssignment_6; }

		//MParameterValueAssignment
		public RuleCall getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0() { return cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class MParameterValueAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAttributeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParameterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParameterMParameterCrossReference_1_0 = (CrossReference)cParameterAssignment_1.eContents().get(0);
		private final RuleCall cParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1 = (RuleCall)cParameterMParameterCrossReference_1_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cParameterValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MParameterValueAssignment common::MParameterValueAssignmentSingleExpression:
		//	'attribute'
		//	parameter=[common::MParameter|VersionedQualifiedReferenceName]
		//	':='
		//	parameterValue=MParameterValueExpression ';'
		@Override public ParserRule getRule() { return rule; }

		//'attribute' parameter=[common::MParameter|VersionedQualifiedReferenceName] ':=' parameterValue=MParameterValueExpression
		//';'
		public Group getGroup() { return cGroup; }

		//'attribute'
		public Keyword getAttributeKeyword_0() { return cAttributeKeyword_0; }

		//parameter=[common::MParameter|VersionedQualifiedReferenceName]
		public Assignment getParameterAssignment_1() { return cParameterAssignment_1; }

		//[common::MParameter|VersionedQualifiedReferenceName]
		public CrossReference getParameterMParameterCrossReference_1_0() { return cParameterMParameterCrossReference_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1() { return cParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1; }

		//':='
		public Keyword getColonEqualsSignKeyword_2() { return cColonEqualsSignKeyword_2; }

		//parameterValue=MParameterValueExpression
		public Assignment getParameterValueAssignment_3() { return cParameterValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getParameterValueMParameterValueExpressionParserRuleCall_3_0() { return cParameterValueMParameterValueExpressionParserRuleCall_3_0; }

		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class MParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameter");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MIntegerParameterSingleExpression");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MEnumParameterDefinition");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MEnumParameterSingleExpression");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MRealParameterSingleExpression");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MEnumParameterLiteralRule");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValue");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.EBoolean");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.INTEGER");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.REAL");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueBooleanLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueStringLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueIntegerLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueRealLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueRefObject");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValuePAR");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueTERM");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterRange");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterOCR");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterOOR");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterCOR");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterCCR");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MEnumParameterLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MEnumParamIntegerLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MEnumParamRealLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MEnumParamStringLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MBooleanParameterSingleExpression");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MStringParameterSingleExpression");
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

	public class MInternalComponentConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalComponentConnection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMInternalComponentConnectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cConnectionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Keyword cThisKeyword_2_0 = (Keyword)cAlternatives_2.eContents().get(0);
		private final Assignment cClientInstanceAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final CrossReference cClientInstanceMInternalComponentInstanceCrossReference_2_1_0 = (CrossReference)cClientInstanceAssignment_2_1.eContents().get(0);
		private final RuleCall cClientInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1 = (RuleCall)cClientInstanceMInternalComponentInstanceCrossReference_2_1_0.eContents().get(1);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cClientPortAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cClientPortMClientPortCrossReference_4_0 = (CrossReference)cClientPortAssignment_4.eContents().get(0);
		private final RuleCall cClientPortMClientPortIDTerminalRuleCall_4_0_1 = (RuleCall)cClientPortMClientPortCrossReference_4_0.eContents().get(1);
		private final Keyword cLessThanSignHyphenMinusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Alternatives cAlternatives_6 = (Alternatives)cGroup.eContents().get(6);
		private final Keyword cThisKeyword_6_0 = (Keyword)cAlternatives_6.eContents().get(0);
		private final Assignment cServerInstanceAssignment_6_1 = (Assignment)cAlternatives_6.eContents().get(1);
		private final CrossReference cServerInstanceMInternalComponentInstanceCrossReference_6_1_0 = (CrossReference)cServerInstanceAssignment_6_1.eContents().get(0);
		private final RuleCall cServerInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_6_1_0_1 = (RuleCall)cServerInstanceMInternalComponentInstanceCrossReference_6_1_0.eContents().get(1);
		private final Keyword cFullStopKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cServerPortAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cServerPortMServerPortCrossReference_8_0 = (CrossReference)cServerPortAssignment_8.eContents().get(0);
		private final RuleCall cServerPortMServerPortIDTerminalRuleCall_8_0_1 = (RuleCall)cServerPortMServerPortCrossReference_8_0.eContents().get(1);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cUsingKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cConnectorAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final CrossReference cConnectorMConnectorCrossReference_9_1_0 = (CrossReference)cConnectorAssignment_9_1.eContents().get(0);
		private final RuleCall cConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_9_1_0_1 = (RuleCall)cConnectorMConnectorCrossReference_9_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_9_2 = (Keyword)cGroup_9.eContents().get(2);
		private final Group cGroup_9_3 = (Group)cGroup_9.eContents().get(3);
		private final Keyword cMappingKeyword_9_3_0 = (Keyword)cGroup_9_3.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_9_3_1 = (Keyword)cGroup_9_3.eContents().get(1);
		private final Assignment cIfaceMappingAssignment_9_3_2 = (Assignment)cGroup_9_3.eContents().get(2);
		private final CrossReference cIfaceMappingMInterfaceMappingCrossReference_9_3_2_0 = (CrossReference)cIfaceMappingAssignment_9_3_2.eContents().get(0);
		private final RuleCall cIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_9_3_2_0_1 = (RuleCall)cIfaceMappingMInterfaceMappingCrossReference_9_3_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_9_3_3 = (Keyword)cGroup_9_3.eContents().get(3);
		private final Group cGroup_9_4 = (Group)cGroup_9.eContents().get(4);
		private final Keyword cAttributeKeyword_9_4_0 = (Keyword)cGroup_9_4.eContents().get(0);
		private final Assignment cAttributeValueAssignmentsAssignment_9_4_1 = (Assignment)cGroup_9_4.eContents().get(1);
		private final RuleCall cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_9_4_1_0 = (RuleCall)cAttributeValueAssignmentsAssignment_9_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9_5 = (Keyword)cGroup_9.eContents().get(5);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//MInternalComponentConnection:
		//	{MInternalComponentConnection}
		//	'connection' ('this' | clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) '.'
		//	clientPort=[MClientPort] '<->' ('this' | serverInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName])
		//	'.'
		//	serverPort=[MServerPort] ('using'
		//	connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
		//	'{' ('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')? ('attribute'
		//	attributeValueAssignments+=MParameterValueAssignment)*
		//	'}')? ';';
		@Override public ParserRule getRule() { return rule; }

		//{MInternalComponentConnection} 'connection' ('this' |
		//clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) '.' clientPort=[MClientPort] '<->' ('this'
		//| serverInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) '.' serverPort=[MServerPort] ('using'
		//connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] '{' ('mapping' ':='
		//ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')? ('attribute'
		//attributeValueAssignments+=MParameterValueAssignment)* '}')? ';'
		public Group getGroup() { return cGroup; }

		//{MInternalComponentConnection}
		public Action getMInternalComponentConnectionAction_0() { return cMInternalComponentConnectionAction_0; }

		//'connection'
		public Keyword getConnectionKeyword_1() { return cConnectionKeyword_1; }

		//('this' | clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName])
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//'this'
		public Keyword getThisKeyword_2_0() { return cThisKeyword_2_0; }

		//clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]
		public Assignment getClientInstanceAssignment_2_1() { return cClientInstanceAssignment_2_1; }

		//[MInternalComponentInstance|VersionedQualifiedReferenceName]
		public CrossReference getClientInstanceMInternalComponentInstanceCrossReference_2_1_0() { return cClientInstanceMInternalComponentInstanceCrossReference_2_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getClientInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1() { return cClientInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1; }

		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }

		//clientPort=[MClientPort]
		public Assignment getClientPortAssignment_4() { return cClientPortAssignment_4; }

		//[MClientPort]
		public CrossReference getClientPortMClientPortCrossReference_4_0() { return cClientPortMClientPortCrossReference_4_0; }

		//ID
		public RuleCall getClientPortMClientPortIDTerminalRuleCall_4_0_1() { return cClientPortMClientPortIDTerminalRuleCall_4_0_1; }

		//'<->'
		public Keyword getLessThanSignHyphenMinusGreaterThanSignKeyword_5() { return cLessThanSignHyphenMinusGreaterThanSignKeyword_5; }

		//('this' | serverInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName])
		public Alternatives getAlternatives_6() { return cAlternatives_6; }

		//'this'
		public Keyword getThisKeyword_6_0() { return cThisKeyword_6_0; }

		//serverInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]
		public Assignment getServerInstanceAssignment_6_1() { return cServerInstanceAssignment_6_1; }

		//[MInternalComponentInstance|VersionedQualifiedReferenceName]
		public CrossReference getServerInstanceMInternalComponentInstanceCrossReference_6_1_0() { return cServerInstanceMInternalComponentInstanceCrossReference_6_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getServerInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_6_1_0_1() { return cServerInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_6_1_0_1; }

		//'.'
		public Keyword getFullStopKeyword_7() { return cFullStopKeyword_7; }

		//serverPort=[MServerPort]
		public Assignment getServerPortAssignment_8() { return cServerPortAssignment_8; }

		//[MServerPort]
		public CrossReference getServerPortMServerPortCrossReference_8_0() { return cServerPortMServerPortCrossReference_8_0; }

		//ID
		public RuleCall getServerPortMServerPortIDTerminalRuleCall_8_0_1() { return cServerPortMServerPortIDTerminalRuleCall_8_0_1; }

		//('using' connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] '{' ('mapping' ':='
		//ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')? ('attribute'
		//attributeValueAssignments+=MParameterValueAssignment)* '}')?
		public Group getGroup_9() { return cGroup_9; }

		//'using'
		public Keyword getUsingKeyword_9_0() { return cUsingKeyword_9_0; }

		//connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
		public Assignment getConnectorAssignment_9_1() { return cConnectorAssignment_9_1; }

		//[mclevdom::MConnector|VersionedQualifiedReferenceName]
		public CrossReference getConnectorMConnectorCrossReference_9_1_0() { return cConnectorMConnectorCrossReference_9_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_9_1_0_1() { return cConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_9_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_9_2() { return cLeftCurlyBracketKeyword_9_2; }

		//('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')?
		public Group getGroup_9_3() { return cGroup_9_3; }

		//'mapping'
		public Keyword getMappingKeyword_9_3_0() { return cMappingKeyword_9_3_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_9_3_1() { return cColonEqualsSignKeyword_9_3_1; }

		//ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName]
		public Assignment getIfaceMappingAssignment_9_3_2() { return cIfaceMappingAssignment_9_3_2; }

		//[mclevimap::MInterfaceMapping|VersionedQualifiedName]
		public CrossReference getIfaceMappingMInterfaceMappingCrossReference_9_3_2_0() { return cIfaceMappingMInterfaceMappingCrossReference_9_3_2_0; }

		//VersionedQualifiedName
		public RuleCall getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_9_3_2_0_1() { return cIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_9_3_2_0_1; }

		//';'
		public Keyword getSemicolonKeyword_9_3_3() { return cSemicolonKeyword_9_3_3; }

		//('attribute' attributeValueAssignments+=MParameterValueAssignment)*
		public Group getGroup_9_4() { return cGroup_9_4; }

		//'attribute'
		public Keyword getAttributeKeyword_9_4_0() { return cAttributeKeyword_9_4_0; }

		//attributeValueAssignments+=MParameterValueAssignment
		public Assignment getAttributeValueAssignmentsAssignment_9_4_1() { return cAttributeValueAssignmentsAssignment_9_4_1; }

		//MParameterValueAssignment
		public RuleCall getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_9_4_1_0() { return cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_9_4_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_9_5() { return cRightCurlyBracketKeyword_9_5; }

		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}

	public class MInternalComponentPlatformSwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalComponentPlatformSwitch");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMInternalComponentPlatformSwitchAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cConnectionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Keyword cThisKeyword_2_0 = (Keyword)cAlternatives_2.eContents().get(0);
		private final Assignment cClientInstanceAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final CrossReference cClientInstanceMInternalComponentInstanceCrossReference_2_1_0 = (CrossReference)cClientInstanceAssignment_2_1.eContents().get(0);
		private final RuleCall cClientInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1 = (RuleCall)cClientInstanceMInternalComponentInstanceCrossReference_2_1_0.eContents().get(1);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cClientPortAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cClientPortMClientPortCrossReference_4_0 = (CrossReference)cClientPortAssignment_4.eContents().get(0);
		private final RuleCall cClientPortMClientPortIDTerminalRuleCall_4_0_1 = (RuleCall)cClientPortMClientPortCrossReference_4_0.eContents().get(1);
		private final Keyword cLessThanSignHyphenMinusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSwitchKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cCasesAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cCasesMInternalComponentPlatformSwitchCaseParserRuleCall_8_0 = (RuleCall)cCasesAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//MInternalComponentPlatformSwitch:
		//	{MInternalComponentPlatformSwitch}
		//	'connection' ('this' | clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) '.'
		//	clientPort=[MClientPort] '<->'
		//	'switch'
		//	'{'
		//	cases+=MInternalComponentPlatformSwitchCase+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//{MInternalComponentPlatformSwitch} 'connection' ('this' |
		//clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) '.' clientPort=[MClientPort] '<->'
		//'switch' '{' cases+=MInternalComponentPlatformSwitchCase+ '}' ';'
		public Group getGroup() { return cGroup; }

		//{MInternalComponentPlatformSwitch}
		public Action getMInternalComponentPlatformSwitchAction_0() { return cMInternalComponentPlatformSwitchAction_0; }

		//'connection'
		public Keyword getConnectionKeyword_1() { return cConnectionKeyword_1; }

		//('this' | clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName])
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//'this'
		public Keyword getThisKeyword_2_0() { return cThisKeyword_2_0; }

		//clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]
		public Assignment getClientInstanceAssignment_2_1() { return cClientInstanceAssignment_2_1; }

		//[MInternalComponentInstance|VersionedQualifiedReferenceName]
		public CrossReference getClientInstanceMInternalComponentInstanceCrossReference_2_1_0() { return cClientInstanceMInternalComponentInstanceCrossReference_2_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getClientInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1() { return cClientInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1; }

		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }

		//clientPort=[MClientPort]
		public Assignment getClientPortAssignment_4() { return cClientPortAssignment_4; }

		//[MClientPort]
		public CrossReference getClientPortMClientPortCrossReference_4_0() { return cClientPortMClientPortCrossReference_4_0; }

		//ID
		public RuleCall getClientPortMClientPortIDTerminalRuleCall_4_0_1() { return cClientPortMClientPortIDTerminalRuleCall_4_0_1; }

		//'<->'
		public Keyword getLessThanSignHyphenMinusGreaterThanSignKeyword_5() { return cLessThanSignHyphenMinusGreaterThanSignKeyword_5; }

		//'switch'
		public Keyword getSwitchKeyword_6() { return cSwitchKeyword_6; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_7() { return cLeftCurlyBracketKeyword_7; }

		//cases+=MInternalComponentPlatformSwitchCase+
		public Assignment getCasesAssignment_8() { return cCasesAssignment_8; }

		//MInternalComponentPlatformSwitchCase
		public RuleCall getCasesMInternalComponentPlatformSwitchCaseParserRuleCall_8_0() { return cCasesMInternalComponentPlatformSwitchCaseParserRuleCall_8_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }

		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}

	public class MInternalComponentPlatformSwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalComponentPlatformSwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMComponentSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMComponentSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMComponentSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Keyword cThisKeyword_3_0 = (Keyword)cAlternatives_3.eContents().get(0);
		private final Assignment cServerInstanceAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final CrossReference cServerInstanceMInternalComponentInstanceCrossReference_3_1_0 = (CrossReference)cServerInstanceAssignment_3_1.eContents().get(0);
		private final RuleCall cServerInstanceMInternalComponentInstanceIDTerminalRuleCall_3_1_0_1 = (RuleCall)cServerInstanceMInternalComponentInstanceCrossReference_3_1_0.eContents().get(1);
		private final Keyword cFullStopKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cServerPortAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cServerPortMServerPortCrossReference_5_0 = (CrossReference)cServerPortAssignment_5.eContents().get(0);
		private final RuleCall cServerPortMServerPortIDTerminalRuleCall_5_0_1 = (RuleCall)cServerPortMServerPortCrossReference_5_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cUsingKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cConnectorAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cConnectorMConnectorCrossReference_6_1_0 = (CrossReference)cConnectorAssignment_6_1.eContents().get(0);
		private final RuleCall cConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_6_1_0_1 = (RuleCall)cConnectorMConnectorCrossReference_6_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_6_2 = (Keyword)cGroup_6.eContents().get(2);
		private final Group cGroup_6_3 = (Group)cGroup_6.eContents().get(3);
		private final Keyword cMappingKeyword_6_3_0 = (Keyword)cGroup_6_3.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_3_1 = (Keyword)cGroup_6_3.eContents().get(1);
		private final Assignment cIfaceMappingAssignment_6_3_2 = (Assignment)cGroup_6_3.eContents().get(2);
		private final CrossReference cIfaceMappingMInterfaceMappingCrossReference_6_3_2_0 = (CrossReference)cIfaceMappingAssignment_6_3_2.eContents().get(0);
		private final RuleCall cIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_6_3_2_0_1 = (RuleCall)cIfaceMappingMInterfaceMappingCrossReference_6_3_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6_3_3 = (Keyword)cGroup_6_3.eContents().get(3);
		private final Group cGroup_6_4 = (Group)cGroup_6.eContents().get(4);
		private final Keyword cAttributeKeyword_6_4_0 = (Keyword)cGroup_6_4.eContents().get(0);
		private final Assignment cAttributeValueAssignmentsAssignment_6_4_1 = (Assignment)cGroup_6_4.eContents().get(1);
		private final RuleCall cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_4_1_0 = (RuleCall)cAttributeValueAssignmentsAssignment_6_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_5 = (Keyword)cGroup_6.eContents().get(5);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MInternalComponentPlatformSwitchCase:
		//	'case' platform=[MComponentSupportedPlatform] ':' ('this' | serverInstance=[MInternalComponentInstance]) '.'
		//	serverPort=[MServerPort] ('using'
		//	connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
		//	'{' ('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')? ('attribute'
		//	attributeValueAssignments+=MParameterValueAssignment)*
		//	'}')? ';';
		@Override public ParserRule getRule() { return rule; }

		//'case' platform=[MComponentSupportedPlatform] ':' ('this' | serverInstance=[MInternalComponentInstance]) '.'
		//serverPort=[MServerPort] ('using' connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] '{' ('mapping' ':='
		//ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')? ('attribute'
		//attributeValueAssignments+=MParameterValueAssignment)* '}')? ';'
		public Group getGroup() { return cGroup; }

		//'case'
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MComponentSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MComponentSupportedPlatform]
		public CrossReference getPlatformMComponentSupportedPlatformCrossReference_1_0() { return cPlatformMComponentSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMComponentSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMComponentSupportedPlatformIDTerminalRuleCall_1_0_1; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//('this' | serverInstance=[MInternalComponentInstance])
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//'this'
		public Keyword getThisKeyword_3_0() { return cThisKeyword_3_0; }

		//serverInstance=[MInternalComponentInstance]
		public Assignment getServerInstanceAssignment_3_1() { return cServerInstanceAssignment_3_1; }

		//[MInternalComponentInstance]
		public CrossReference getServerInstanceMInternalComponentInstanceCrossReference_3_1_0() { return cServerInstanceMInternalComponentInstanceCrossReference_3_1_0; }

		//ID
		public RuleCall getServerInstanceMInternalComponentInstanceIDTerminalRuleCall_3_1_0_1() { return cServerInstanceMInternalComponentInstanceIDTerminalRuleCall_3_1_0_1; }

		//'.'
		public Keyword getFullStopKeyword_4() { return cFullStopKeyword_4; }

		//serverPort=[MServerPort]
		public Assignment getServerPortAssignment_5() { return cServerPortAssignment_5; }

		//[MServerPort]
		public CrossReference getServerPortMServerPortCrossReference_5_0() { return cServerPortMServerPortCrossReference_5_0; }

		//ID
		public RuleCall getServerPortMServerPortIDTerminalRuleCall_5_0_1() { return cServerPortMServerPortIDTerminalRuleCall_5_0_1; }

		//('using' connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] '{' ('mapping' ':='
		//ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')? ('attribute'
		//attributeValueAssignments+=MParameterValueAssignment)* '}')?
		public Group getGroup_6() { return cGroup_6; }

		//'using'
		public Keyword getUsingKeyword_6_0() { return cUsingKeyword_6_0; }

		//connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
		public Assignment getConnectorAssignment_6_1() { return cConnectorAssignment_6_1; }

		//[mclevdom::MConnector|VersionedQualifiedReferenceName]
		public CrossReference getConnectorMConnectorCrossReference_6_1_0() { return cConnectorMConnectorCrossReference_6_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_6_1_0_1() { return cConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_6_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_2() { return cLeftCurlyBracketKeyword_6_2; }

		//('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')?
		public Group getGroup_6_3() { return cGroup_6_3; }

		//'mapping'
		public Keyword getMappingKeyword_6_3_0() { return cMappingKeyword_6_3_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_6_3_1() { return cColonEqualsSignKeyword_6_3_1; }

		//ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName]
		public Assignment getIfaceMappingAssignment_6_3_2() { return cIfaceMappingAssignment_6_3_2; }

		//[mclevimap::MInterfaceMapping|VersionedQualifiedName]
		public CrossReference getIfaceMappingMInterfaceMappingCrossReference_6_3_2_0() { return cIfaceMappingMInterfaceMappingCrossReference_6_3_2_0; }

		//VersionedQualifiedName
		public RuleCall getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_6_3_2_0_1() { return cIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_6_3_2_0_1; }

		//';'
		public Keyword getSemicolonKeyword_6_3_3() { return cSemicolonKeyword_6_3_3; }

		//('attribute' attributeValueAssignments+=MParameterValueAssignment)*
		public Group getGroup_6_4() { return cGroup_6_4; }

		//'attribute'
		public Keyword getAttributeKeyword_6_4_0() { return cAttributeKeyword_6_4_0; }

		//attributeValueAssignments+=MParameterValueAssignment
		public Assignment getAttributeValueAssignmentsAssignment_6_4_1() { return cAttributeValueAssignmentsAssignment_6_4_1; }

		//MParameterValueAssignment
		public RuleCall getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_4_1_0() { return cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_4_1_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6_5() { return cRightCurlyBracketKeyword_6_5; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class ComponentSupportedPlatformElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.ComponentSupportedPlatform");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMComponentSupportedPlatformAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSupportedKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPlatformKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cOsapiKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Alternatives cAlternatives_5_0_2 = (Alternatives)cGroup_5_0.eContents().get(2);
		private final Keyword cAnyKeyword_5_0_2_0 = (Keyword)cAlternatives_5_0_2.eContents().get(0);
		private final Assignment cOsapiAssignment_5_0_2_1 = (Assignment)cAlternatives_5_0_2.eContents().get(1);
		private final CrossReference cOsapiMOperatingSystemAPICrossReference_5_0_2_1_0 = (CrossReference)cOsapiAssignment_5_0_2_1.eContents().get(0);
		private final RuleCall cOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1 = (RuleCall)cOsapiMOperatingSystemAPICrossReference_5_0_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_0_3 = (Keyword)cGroup_5_0.eContents().get(3);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cOsKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Alternatives cAlternatives_5_1_2 = (Alternatives)cGroup_5_1.eContents().get(2);
		private final Keyword cAnyKeyword_5_1_2_0 = (Keyword)cAlternatives_5_1_2.eContents().get(0);
		private final Assignment cOsAssignment_5_1_2_1 = (Assignment)cAlternatives_5_1_2.eContents().get(1);
		private final CrossReference cOsMOperatingSystemCrossReference_5_1_2_1_0 = (CrossReference)cOsAssignment_5_1_2_1.eContents().get(0);
		private final RuleCall cOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1 = (RuleCall)cOsMOperatingSystemCrossReference_5_1_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_1_3 = (Keyword)cGroup_5_1.eContents().get(3);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cArchitectureKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_2_1 = (Keyword)cGroup_5_2.eContents().get(1);
		private final Alternatives cAlternatives_5_2_2 = (Alternatives)cGroup_5_2.eContents().get(2);
		private final Keyword cAnyKeyword_5_2_2_0 = (Keyword)cAlternatives_5_2_2.eContents().get(0);
		private final Assignment cArchitectureAssignment_5_2_2_1 = (Assignment)cAlternatives_5_2_2.eContents().get(1);
		private final CrossReference cArchitectureMArchitectureCrossReference_5_2_2_1_0 = (CrossReference)cArchitectureAssignment_5_2_2_1.eContents().get(0);
		private final RuleCall cArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1 = (RuleCall)cArchitectureMArchitectureCrossReference_5_2_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_2_3 = (Keyword)cGroup_5_2.eContents().get(3);
		private final Group cGroup_5_3 = (Group)cUnorderedGroup_5.eContents().get(3);
		private final Keyword cCompilerKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_3_1 = (Keyword)cGroup_5_3.eContents().get(1);
		private final Assignment cCompilerAssignment_5_3_2 = (Assignment)cGroup_5_3.eContents().get(2);
		private final CrossReference cCompilerMCompilerCrossReference_5_3_2_0 = (CrossReference)cCompilerAssignment_5_3_2.eContents().get(0);
		private final RuleCall cCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1 = (RuleCall)cCompilerMCompilerCrossReference_5_3_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_3_3 = (Keyword)cGroup_5_3.eContents().get(3);
		private final Group cGroup_5_4 = (Group)cUnorderedGroup_5.eContents().get(4);
		private final Keyword cMicroprocessorKeyword_5_4_0 = (Keyword)cGroup_5_4.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_4_1 = (Keyword)cGroup_5_4.eContents().get(1);
		private final Alternatives cAlternatives_5_4_2 = (Alternatives)cGroup_5_4.eContents().get(2);
		private final Keyword cAnyKeyword_5_4_2_0 = (Keyword)cAlternatives_5_4_2.eContents().get(0);
		private final Assignment cMicroprocessorAssignment_5_4_2_1 = (Assignment)cAlternatives_5_4_2.eContents().get(1);
		private final CrossReference cMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0 = (CrossReference)cMicroprocessorAssignment_5_4_2_1.eContents().get(0);
		private final RuleCall cMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1 = (RuleCall)cMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_4_3 = (Keyword)cGroup_5_4.eContents().get(3);
		private final Group cGroup_5_5 = (Group)cUnorderedGroup_5.eContents().get(5);
		private final Keyword cBoardKeyword_5_5_0 = (Keyword)cGroup_5_5.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_5_1 = (Keyword)cGroup_5_5.eContents().get(1);
		private final Alternatives cAlternatives_5_5_2 = (Alternatives)cGroup_5_5.eContents().get(2);
		private final Keyword cAnyKeyword_5_5_2_0 = (Keyword)cAlternatives_5_5_2.eContents().get(0);
		private final Assignment cBoardAssignment_5_5_2_1 = (Assignment)cAlternatives_5_5_2.eContents().get(1);
		private final CrossReference cBoardMBoardCrossReference_5_5_2_1_0 = (CrossReference)cBoardAssignment_5_5_2_1.eContents().get(0);
		private final RuleCall cBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1 = (RuleCall)cBoardMBoardCrossReference_5_5_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_5_3 = (Keyword)cGroup_5_5.eContents().get(3);
		private final Group cGroup_5_6 = (Group)cUnorderedGroup_5.eContents().get(6);
		private final Keyword cRequiresKeyword_5_6_0 = (Keyword)cGroup_5_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_6_1 = (Keyword)cGroup_5_6.eContents().get(1);
		private final Assignment cRequiresAssignment_5_6_2 = (Assignment)cGroup_5_6.eContents().get(2);
		private final CrossReference cRequiresMSAICrossReference_5_6_2_0 = (CrossReference)cRequiresAssignment_5_6_2.eContents().get(0);
		private final RuleCall cRequiresMSAIVersionedQualifiedNameParserRuleCall_5_6_2_0_1 = (RuleCall)cRequiresMSAICrossReference_5_6_2_0.eContents().get(1);
		private final Group cGroup_5_6_3 = (Group)cGroup_5_6.eContents().get(3);
		private final Keyword cCommaKeyword_5_6_3_0 = (Keyword)cGroup_5_6_3.eContents().get(0);
		private final Assignment cRequiresAssignment_5_6_3_1 = (Assignment)cGroup_5_6_3.eContents().get(1);
		private final CrossReference cRequiresMSAICrossReference_5_6_3_1_0 = (CrossReference)cRequiresAssignment_5_6_3_1.eContents().get(0);
		private final RuleCall cRequiresMSAIVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1 = (RuleCall)cRequiresMSAICrossReference_5_6_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_6_4 = (Keyword)cGroup_5_6.eContents().get(4);
		private final Group cGroup_5_7 = (Group)cUnorderedGroup_5.eContents().get(7);
		private final Keyword cAttributeKeyword_5_7_0 = (Keyword)cGroup_5_7.eContents().get(0);
		private final Keyword cValuesKeyword_5_7_1 = (Keyword)cGroup_5_7.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_7_2 = (Keyword)cGroup_5_7.eContents().get(2);
		private final Assignment cAttributeValueAssignmentsAssignment_5_7_3 = (Assignment)cGroup_5_7.eContents().get(3);
		private final RuleCall cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_7_3_0 = (RuleCall)cAttributeValueAssignmentsAssignment_5_7_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_7_4 = (Keyword)cGroup_5_7.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_7_5 = (Keyword)cGroup_5_7.eContents().get(5);
		private final Group cGroup_5_8 = (Group)cUnorderedGroup_5.eContents().get(8);
		private final Keyword cAttributesKeyword_5_8_0 = (Keyword)cGroup_5_8.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_8_1 = (Keyword)cGroup_5_8.eContents().get(1);
		private final Assignment cAttributesAssignment_5_8_2 = (Assignment)cGroup_5_8.eContents().get(2);
		private final RuleCall cAttributesMParameterParserRuleCall_5_8_2_0 = (RuleCall)cAttributesAssignment_5_8_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_8_3 = (Keyword)cGroup_5_8.eContents().get(3);
		private final Keyword cSemicolonKeyword_5_8_4 = (Keyword)cGroup_5_8.eContents().get(4);
		private final Group cGroup_5_9 = (Group)cUnorderedGroup_5.eContents().get(9);
		private final Keyword cLanguagesKeyword_5_9_0 = (Keyword)cGroup_5_9.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_9_1 = (Keyword)cGroup_5_9.eContents().get(1);
		private final Assignment cLanguagesAssignment_5_9_2 = (Assignment)cGroup_5_9.eContents().get(2);
		private final CrossReference cLanguagesMLanguageCrossReference_5_9_2_0 = (CrossReference)cLanguagesAssignment_5_9_2.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_9_2_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_9_2_0.eContents().get(1);
		private final Group cGroup_5_9_3 = (Group)cGroup_5_9.eContents().get(3);
		private final Keyword cCommaKeyword_5_9_3_0 = (Keyword)cGroup_5_9_3.eContents().get(0);
		private final Assignment cLanguagesAssignment_5_9_3_1 = (Assignment)cGroup_5_9_3.eContents().get(1);
		private final CrossReference cLanguagesMLanguageCrossReference_5_9_3_1_0 = (CrossReference)cLanguagesAssignment_5_9_3_1.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_9_3_1_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_9_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_9_4 = (Keyword)cGroup_5_9.eContents().get(4);
		private final Group cGroup_5_10 = (Group)cUnorderedGroup_5.eContents().get(10);
		private final Keyword cSubcomponentKeyword_5_10_0 = (Keyword)cGroup_5_10.eContents().get(0);
		private final Keyword cInstancesKeyword_5_10_1 = (Keyword)cGroup_5_10.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_10_2 = (Keyword)cGroup_5_10.eContents().get(2);
		private final Assignment cInternalComponentsAssignment_5_10_3 = (Assignment)cGroup_5_10.eContents().get(3);
		private final RuleCall cInternalComponentsMInternalComponentInstanceParserRuleCall_5_10_3_0 = (RuleCall)cInternalComponentsAssignment_5_10_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_10_4 = (Keyword)cGroup_5_10.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_10_5 = (Keyword)cGroup_5_10.eContents().get(5);
		private final Group cGroup_5_11 = (Group)cUnorderedGroup_5.eContents().get(11);
		private final Keyword cConnectionsKeyword_5_11_0 = (Keyword)cGroup_5_11.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_11_1 = (Keyword)cGroup_5_11.eContents().get(1);
		private final Assignment cConnectionsAssignment_5_11_2 = (Assignment)cGroup_5_11.eContents().get(2);
		private final RuleCall cConnectionsMInternalComponentConnectionParserRuleCall_5_11_2_0 = (RuleCall)cConnectionsAssignment_5_11_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_11_3 = (Keyword)cGroup_5_11.eContents().get(3);
		private final Keyword cSemicolonKeyword_5_11_4 = (Keyword)cGroup_5_11.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//ComponentSupportedPlatform MComponentSupportedPlatform:
		//	{MComponentSupportedPlatform}
		//	'supported' 'platform'
		//	name=ID
		//	'{' ('osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';' & 'os' ':=' ('any' |
		//	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';' & 'architecture' ':=' ('any' |
		//	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';' & ('compiler' ':='
		//	compiler=[pdl::MCompiler|VersionedQualifiedName] ';')?
		//	& 'microprocessor' ':=' ('any' | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';' & 'board' ':='
		//	('any' | board=[pdl::MBoard|VersionedQualifiedName]) ';' & ('requires' ':='
		//	requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
		//	& ('attribute' 'values'
		//	'{'
		//	attributeValueAssignments+=MParameterValueAssignment*
		//	'}' ';')?
		//	& ('attributes'
		//	'{'
		//	attributes+=MParameter+
		//	'}' ';')?
		//	& ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//	languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
		//	& ('subcomponent' 'instances'
		//	'{'
		//	internalComponents+=MInternalComponentInstance+
		//	'}' ';')?
		//	& ('connections'
		//	'{'
		//	connections+=MInternalComponentConnection+
		//	'}' ';')?)
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }

		//{MComponentSupportedPlatform} 'supported' 'platform' name=ID '{' ('osapi' ':=' ('any' |
		//osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';' & 'os' ':=' ('any' |
		//os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';' & 'architecture' ':=' ('any' |
		//architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';' & ('compiler' ':='
		//compiler=[pdl::MCompiler|VersionedQualifiedName] ';')? & 'microprocessor' ':=' ('any' |
		//microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';' & 'board' ':=' ('any' |
		//board=[pdl::MBoard|VersionedQualifiedName]) ';' & ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName]
		//("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')? & ('attribute' 'values' '{'
		//attributeValueAssignments+=MParameterValueAssignment* '}' ';')? & ('attributes' '{' attributes+=MParameter+ '}' ';')? &
		//('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ';')? & ('subcomponent' 'instances' '{'
		//internalComponents+=MInternalComponentInstance+ '}' ';')? & ('connections' '{'
		//connections+=MInternalComponentConnection+ '}' ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//{MComponentSupportedPlatform}
		public Action getMComponentSupportedPlatformAction_0() { return cMComponentSupportedPlatformAction_0; }

		//'supported'
		public Keyword getSupportedKeyword_1() { return cSupportedKeyword_1; }

		//'platform'
		public Keyword getPlatformKeyword_2() { return cPlatformKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//('osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';' & 'os' ':=' ('any' |
		//os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';' & 'architecture' ':=' ('any' |
		//architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';' & ('compiler' ':='
		//compiler=[pdl::MCompiler|VersionedQualifiedName] ';')? & 'microprocessor' ':=' ('any' |
		//microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';' & 'board' ':=' ('any' |
		//board=[pdl::MBoard|VersionedQualifiedName]) ';' & ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName]
		//("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')? & ('attribute' 'values' '{'
		//attributeValueAssignments+=MParameterValueAssignment* '}' ';')? & ('attributes' '{' attributes+=MParameter+ '}' ';')? &
		//('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ';')? & ('subcomponent' 'instances' '{'
		//internalComponents+=MInternalComponentInstance+ '}' ';')? & ('connections' '{'
		//connections+=MInternalComponentConnection+ '}' ';')?)
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }

		//'osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';'
		public Group getGroup_5_0() { return cGroup_5_0; }

		//'osapi'
		public Keyword getOsapiKeyword_5_0_0() { return cOsapiKeyword_5_0_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_5_0_1() { return cColonEqualsSignKeyword_5_0_1; }

		//('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName])
		public Alternatives getAlternatives_5_0_2() { return cAlternatives_5_0_2; }

		//'any'
		public Keyword getAnyKeyword_5_0_2_0() { return cAnyKeyword_5_0_2_0; }

		//osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public Assignment getOsapiAssignment_5_0_2_1() { return cOsapiAssignment_5_0_2_1; }

		//[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public CrossReference getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0() { return cOsapiMOperatingSystemAPICrossReference_5_0_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1() { return cOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_5_0_3() { return cSemicolonKeyword_5_0_3; }

		//'os' ':=' ('any' | os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';'
		public Group getGroup_5_1() { return cGroup_5_1; }

		//'os'
		public Keyword getOsKeyword_5_1_0() { return cOsKeyword_5_1_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_5_1_1() { return cColonEqualsSignKeyword_5_1_1; }

		//('any' | os=[pdl::MOperatingSystem|VersionedQualifiedName])
		public Alternatives getAlternatives_5_1_2() { return cAlternatives_5_1_2; }

		//'any'
		public Keyword getAnyKeyword_5_1_2_0() { return cAnyKeyword_5_1_2_0; }

		//os=[pdl::MOperatingSystem|VersionedQualifiedName]
		public Assignment getOsAssignment_5_1_2_1() { return cOsAssignment_5_1_2_1; }

		//[pdl::MOperatingSystem|VersionedQualifiedName]
		public CrossReference getOsMOperatingSystemCrossReference_5_1_2_1_0() { return cOsMOperatingSystemCrossReference_5_1_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1() { return cOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_5_1_3() { return cSemicolonKeyword_5_1_3; }

		//'architecture' ':=' ('any' | architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';'
		public Group getGroup_5_2() { return cGroup_5_2; }

		//'architecture'
		public Keyword getArchitectureKeyword_5_2_0() { return cArchitectureKeyword_5_2_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_5_2_1() { return cColonEqualsSignKeyword_5_2_1; }

		//('any' | architecture=[pdl::MArchitecture|VersionedQualifiedName])
		public Alternatives getAlternatives_5_2_2() { return cAlternatives_5_2_2; }

		//'any'
		public Keyword getAnyKeyword_5_2_2_0() { return cAnyKeyword_5_2_2_0; }

		//architecture=[pdl::MArchitecture|VersionedQualifiedName]
		public Assignment getArchitectureAssignment_5_2_2_1() { return cArchitectureAssignment_5_2_2_1; }

		//[pdl::MArchitecture|VersionedQualifiedName]
		public CrossReference getArchitectureMArchitectureCrossReference_5_2_2_1_0() { return cArchitectureMArchitectureCrossReference_5_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1() { return cArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_5_2_3() { return cSemicolonKeyword_5_2_3; }

		//('compiler' ':=' compiler=[pdl::MCompiler|VersionedQualifiedName] ';')?
		public Group getGroup_5_3() { return cGroup_5_3; }

		//'compiler'
		public Keyword getCompilerKeyword_5_3_0() { return cCompilerKeyword_5_3_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_5_3_1() { return cColonEqualsSignKeyword_5_3_1; }

		//compiler=[pdl::MCompiler|VersionedQualifiedName]
		public Assignment getCompilerAssignment_5_3_2() { return cCompilerAssignment_5_3_2; }

		//[pdl::MCompiler|VersionedQualifiedName]
		public CrossReference getCompilerMCompilerCrossReference_5_3_2_0() { return cCompilerMCompilerCrossReference_5_3_2_0; }

		//VersionedQualifiedName
		public RuleCall getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1() { return cCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1; }

		//';'
		public Keyword getSemicolonKeyword_5_3_3() { return cSemicolonKeyword_5_3_3; }

		//'microprocessor' ':=' ('any' | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';'
		public Group getGroup_5_4() { return cGroup_5_4; }

		//'microprocessor'
		public Keyword getMicroprocessorKeyword_5_4_0() { return cMicroprocessorKeyword_5_4_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_5_4_1() { return cColonEqualsSignKeyword_5_4_1; }

		//('any' | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName])
		public Alternatives getAlternatives_5_4_2() { return cAlternatives_5_4_2; }

		//'any'
		public Keyword getAnyKeyword_5_4_2_0() { return cAnyKeyword_5_4_2_0; }

		//microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
		public Assignment getMicroprocessorAssignment_5_4_2_1() { return cMicroprocessorAssignment_5_4_2_1; }

		//[pdl::MMicroprocessor|VersionedQualifiedName]
		public CrossReference getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0() { return cMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1() { return cMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_5_4_3() { return cSemicolonKeyword_5_4_3; }

		//'board' ':=' ('any' | board=[pdl::MBoard|VersionedQualifiedName]) ';'
		public Group getGroup_5_5() { return cGroup_5_5; }

		//'board'
		public Keyword getBoardKeyword_5_5_0() { return cBoardKeyword_5_5_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_5_5_1() { return cColonEqualsSignKeyword_5_5_1; }

		//('any' | board=[pdl::MBoard|VersionedQualifiedName])
		public Alternatives getAlternatives_5_5_2() { return cAlternatives_5_5_2; }

		//'any'
		public Keyword getAnyKeyword_5_5_2_0() { return cAnyKeyword_5_5_2_0; }

		//board=[pdl::MBoard|VersionedQualifiedName]
		public Assignment getBoardAssignment_5_5_2_1() { return cBoardAssignment_5_5_2_1; }

		//[pdl::MBoard|VersionedQualifiedName]
		public CrossReference getBoardMBoardCrossReference_5_5_2_1_0() { return cBoardMBoardCrossReference_5_5_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1() { return cBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_5_5_3() { return cSemicolonKeyword_5_5_3; }

		//('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
		//requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
		public Group getGroup_5_6() { return cGroup_5_6; }

		//'requires'
		public Keyword getRequiresKeyword_5_6_0() { return cRequiresKeyword_5_6_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_5_6_1() { return cColonEqualsSignKeyword_5_6_1; }

		//requires+=[mclevsai::MSAI|VersionedQualifiedName]
		public Assignment getRequiresAssignment_5_6_2() { return cRequiresAssignment_5_6_2; }

		//[mclevsai::MSAI|VersionedQualifiedName]
		public CrossReference getRequiresMSAICrossReference_5_6_2_0() { return cRequiresMSAICrossReference_5_6_2_0; }

		//VersionedQualifiedName
		public RuleCall getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_6_2_0_1() { return cRequiresMSAIVersionedQualifiedNameParserRuleCall_5_6_2_0_1; }

		//("," requires+=[mclevsai::MSAI|VersionedQualifiedName])*
		public Group getGroup_5_6_3() { return cGroup_5_6_3; }

		//","
		public Keyword getCommaKeyword_5_6_3_0() { return cCommaKeyword_5_6_3_0; }

		//requires+=[mclevsai::MSAI|VersionedQualifiedName]
		public Assignment getRequiresAssignment_5_6_3_1() { return cRequiresAssignment_5_6_3_1; }

		//[mclevsai::MSAI|VersionedQualifiedName]
		public CrossReference getRequiresMSAICrossReference_5_6_3_1_0() { return cRequiresMSAICrossReference_5_6_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1() { return cRequiresMSAIVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_5_6_4() { return cSemicolonKeyword_5_6_4; }

		//('attribute' 'values' '{' attributeValueAssignments+=MParameterValueAssignment* '}' ';')?
		public Group getGroup_5_7() { return cGroup_5_7; }

		//'attribute'
		public Keyword getAttributeKeyword_5_7_0() { return cAttributeKeyword_5_7_0; }

		//'values'
		public Keyword getValuesKeyword_5_7_1() { return cValuesKeyword_5_7_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_7_2() { return cLeftCurlyBracketKeyword_5_7_2; }

		//attributeValueAssignments+=MParameterValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_5_7_3() { return cAttributeValueAssignmentsAssignment_5_7_3; }

		//MParameterValueAssignment
		public RuleCall getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_7_3_0() { return cAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_7_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_7_4() { return cRightCurlyBracketKeyword_5_7_4; }

		//';'
		public Keyword getSemicolonKeyword_5_7_5() { return cSemicolonKeyword_5_7_5; }

		//('attributes' '{' attributes+=MParameter+ '}' ';')?
		public Group getGroup_5_8() { return cGroup_5_8; }

		//'attributes'
		public Keyword getAttributesKeyword_5_8_0() { return cAttributesKeyword_5_8_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_8_1() { return cLeftCurlyBracketKeyword_5_8_1; }

		//attributes+=MParameter+
		public Assignment getAttributesAssignment_5_8_2() { return cAttributesAssignment_5_8_2; }

		//MParameter
		public RuleCall getAttributesMParameterParserRuleCall_5_8_2_0() { return cAttributesMParameterParserRuleCall_5_8_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_8_3() { return cRightCurlyBracketKeyword_5_8_3; }

		//';'
		public Keyword getSemicolonKeyword_5_8_4() { return cSemicolonKeyword_5_8_4; }

		//('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
		public Group getGroup_5_9() { return cGroup_5_9; }

		//'languages'
		public Keyword getLanguagesKeyword_5_9_0() { return cLanguagesKeyword_5_9_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_5_9_1() { return cColonEqualsSignKeyword_5_9_1; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_9_2() { return cLanguagesAssignment_5_9_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_9_2_0() { return cLanguagesMLanguageCrossReference_5_9_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_9_2_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_9_2_0_1; }

		//("," languages+=[system::MLanguage|VersionedQualifiedName])*
		public Group getGroup_5_9_3() { return cGroup_5_9_3; }

		//","
		public Keyword getCommaKeyword_5_9_3_0() { return cCommaKeyword_5_9_3_0; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_9_3_1() { return cLanguagesAssignment_5_9_3_1; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_9_3_1_0() { return cLanguagesMLanguageCrossReference_5_9_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_9_3_1_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_9_3_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_5_9_4() { return cSemicolonKeyword_5_9_4; }

		//('subcomponent' 'instances' '{' internalComponents+=MInternalComponentInstance+ '}' ';')?
		public Group getGroup_5_10() { return cGroup_5_10; }

		//'subcomponent'
		public Keyword getSubcomponentKeyword_5_10_0() { return cSubcomponentKeyword_5_10_0; }

		//'instances'
		public Keyword getInstancesKeyword_5_10_1() { return cInstancesKeyword_5_10_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_10_2() { return cLeftCurlyBracketKeyword_5_10_2; }

		//internalComponents+=MInternalComponentInstance+
		public Assignment getInternalComponentsAssignment_5_10_3() { return cInternalComponentsAssignment_5_10_3; }

		//MInternalComponentInstance
		public RuleCall getInternalComponentsMInternalComponentInstanceParserRuleCall_5_10_3_0() { return cInternalComponentsMInternalComponentInstanceParserRuleCall_5_10_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_10_4() { return cRightCurlyBracketKeyword_5_10_4; }

		//';'
		public Keyword getSemicolonKeyword_5_10_5() { return cSemicolonKeyword_5_10_5; }

		//('connections' '{' connections+=MInternalComponentConnection+ '}' ';')?
		public Group getGroup_5_11() { return cGroup_5_11; }

		//'connections'
		public Keyword getConnectionsKeyword_5_11_0() { return cConnectionsKeyword_5_11_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_11_1() { return cLeftCurlyBracketKeyword_5_11_1; }

		//connections+=MInternalComponentConnection+
		public Assignment getConnectionsAssignment_5_11_2() { return cConnectionsAssignment_5_11_2; }

		//MInternalComponentConnection
		public RuleCall getConnectionsMInternalComponentConnectionParserRuleCall_5_11_2_0() { return cConnectionsMInternalComponentConnectionParserRuleCall_5_11_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5_11_3() { return cRightCurlyBracketKeyword_5_11_3; }

		//';'
		public Keyword getSemicolonKeyword_5_11_4() { return cSemicolonKeyword_5_11_4; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	
	
	public class MParameterValueExpressionOperatorsElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpressionOperators");
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
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueTERMOperators");
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
	
	private final MMCLEVCMPPackageFileElements pMMCLEVCMPPackageFile;
	private final MMCLEVCMPPackageElementElements pMMCLEVCMPPackageElement;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final MPortElements pMPort;
	private final MInternalConnectionElements pMInternalConnection;
	private final MAbstractComponentElements pMAbstractComponent;
	private final MComponentElements pMComponent;
	private final MInternalComponentInstanceElements pMInternalComponentInstance;
	private final MServerPortElements pMServerPort;
	private final MClientPortElements pMClientPort;
	private final MParameterValueAssignmentElements pMParameterValueAssignment;
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
	private final MInternalComponentConnectionElements pMInternalComponentConnection;
	private final MInternalComponentPlatformSwitchElements pMInternalComponentPlatformSwitch;
	private final MInternalComponentPlatformSwitchCaseElements pMInternalComponentPlatformSwitchCase;
	private final ComponentSupportedPlatformElements pComponentSupportedPlatform;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CMPGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMMCLEVCMPPackageFile = new MMCLEVCMPPackageFileElements();
		this.pMMCLEVCMPPackageElement = new MMCLEVCMPPackageElementElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.pMPort = new MPortElements();
		this.pMInternalConnection = new MInternalConnectionElements();
		this.pMAbstractComponent = new MAbstractComponentElements();
		this.pMComponent = new MComponentElements();
		this.pMInternalComponentInstance = new MInternalComponentInstanceElements();
		this.pMServerPort = new MServerPortElements();
		this.pMClientPort = new MClientPortElements();
		this.pMParameterValueAssignment = new MParameterValueAssignmentElements();
		this.pMParameter = new MParameterElements();
		this.pMIntegerParameterSingleExpression = new MIntegerParameterSingleExpressionElements();
		this.pMEnumParameterDefinition = new MEnumParameterDefinitionElements();
		this.pMEnumParameterSingleExpression = new MEnumParameterSingleExpressionElements();
		this.pMRealParameterSingleExpression = new MRealParameterSingleExpressionElements();
		this.pMEnumParameterLiteralRule = new MEnumParameterLiteralRuleElements();
		this.pMParameterValue = new MParameterValueElements();
		this.pMParameterValueLiteral = new MParameterValueLiteralElements();
		this.pEBoolean = new EBooleanElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.CMP.HEXADECIMAL");
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
		this.pMInternalComponentConnection = new MInternalComponentConnectionElements();
		this.pMInternalComponentPlatformSwitch = new MInternalComponentPlatformSwitchElements();
		this.pMInternalComponentPlatformSwitchCase = new MInternalComponentPlatformSwitchCaseElements();
		this.pComponentSupportedPlatform = new ComponentSupportedPlatformElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mclev.lang.CMP".equals(grammar.getName())) {
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

	
	//MMCLEVCMPPackageFile:
	//	'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
	//	imports+=[common::MCommonPackage|QualifiedName] ';')*
	//	element=MMCLEVCMPPackageElement;
	public MMCLEVCMPPackageFileElements getMMCLEVCMPPackageFileAccess() {
		return pMMCLEVCMPPackageFile;
	}
	
	public ParserRule getMMCLEVCMPPackageFileRule() {
		return getMMCLEVCMPPackageFileAccess().getRule();
	}

	//MMCLEVCMPPackageElement:
	//	MAbstractComponent | MComponent;
	public MMCLEVCMPPackageElementElements getMMCLEVCMPPackageElementAccess() {
		return pMMCLEVCMPPackageElement;
	}
	
	public ParserRule getMMCLEVCMPPackageElementRule() {
		return getMMCLEVCMPPackageElementAccess().getRule();
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

	//MPort:
	//	MServerPort | MClientPort;
	public MPortElements getMPortAccess() {
		return pMPort;
	}
	
	public ParserRule getMPortRule() {
		return getMPortAccess().getRule();
	}

	//MInternalConnection:
	//	MInternalComponentConnection | MInternalComponentPlatformSwitch;
	public MInternalConnectionElements getMInternalConnectionAccess() {
		return pMInternalConnection;
	}
	
	public ParserRule getMInternalConnectionRule() {
		return getMInternalConnectionAccess().getRule();
	}

	//MAbstractComponent:
	//	'abstract' 'component'
	//	domain=[mclevdom::MDomain|VersionedQualifiedName] '::'
	//	type=[mclevdom::MComponentType|VersionedQualifiedReferenceName] name=ID ('inherits'
	//	inherits+=[MAbstractComponent|VersionedQualifiedName] ("," inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
	//	'{' ('version' ':=' version=Version ';' & ('attributes'
	//	'{'
	//	attributes+=MParameter+
	//	'}' ';')?
	//	& ('attribute' 'values'
	//	'{'
	//	attributeValueAssignments+=MParameterValueAssignment*
	//	'}' ';')?
	//	& ('external' 'ports'
	//	'{'
	//	externalPorts+=MPort+
	//	'}' ';')?)
	//	'}' ';';
	public MAbstractComponentElements getMAbstractComponentAccess() {
		return pMAbstractComponent;
	}
	
	public ParserRule getMAbstractComponentRule() {
		return getMAbstractComponentAccess().getRule();
	}

	//MComponent:
	//	{MComponent}
	//	'component'
	//	domain=[mclevdom::MDomain|VersionedQualifiedName] '::'
	//	type=[mclevdom::MComponentType|VersionedQualifiedReferenceName] name=ID ('inherits'
	//	inherits+=[MAbstractComponent|VersionedQualifiedName] ("," inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
	//	'{' ('version' ':=' version=Version ';' & ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
	//	languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
	//	& ('attributes'
	//	'{'
	//	attributes+=MParameter+
	//	'}' ';')?
	//	& ('attribute' 'values'
	//	'{'
	//	attributeValueAssignments+=MParameterValueAssignment*
	//	'}' ';')?
	//	& ('external' 'ports'
	//	'{'
	//	externalPorts+=MPort+
	//	'}' ';')?
	//	& ('internal' 'ports'
	//	'{'
	//	internalPorts+=MPort+
	//	'}' ';')?
	//	& ('requires' ':=' requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
	//	requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
	//	& ('supported' 'platforms'
	//	'{'
	//	supportedPlatforms+=ComponentSupportedPlatform+
	//	'}' ';')?
	//	& ('subcomponent' 'instances'
	//	'{'
	//	internalComponents+=MInternalComponentInstance+
	//	'}' ';')?
	//	& ('connections'
	//	'{'
	//	connections+=MInternalConnection+
	//	'}' ';')?)
	//	'}' ';';
	public MComponentElements getMComponentAccess() {
		return pMComponent;
	}
	
	public ParserRule getMComponentRule() {
		return getMComponentAccess().getRule();
	}

	//MInternalComponentInstance:
	//	isSingleton?='singleton'?
	//	'instance'
	//	component=[MComponent|VersionedQualifiedName] name=ID
	//	'{'
	//	attributeValueAssignments+=MParameterValueAssignment*
	//	'}' ';';
	public MInternalComponentInstanceElements getMInternalComponentInstanceAccess() {
		return pMInternalComponentInstance;
	}
	
	public ParserRule getMInternalComponentInstanceRule() {
		return getMInternalComponentInstanceAccess().getRule();
	}

	//MServerPort:
	//	{MServerPort}
	//	'server'
	//	type=[mclevdom::MPortType|VersionedQualifiedReferenceName] interface=[mcleviface::MInterface|VersionedQualifiedName]
	//	name=ID
	//	'{'
	//	attributeValueAssignments+=MParameterValueAssignment*
	//	'}' ';';
	public MServerPortElements getMServerPortAccess() {
		return pMServerPort;
	}
	
	public ParserRule getMServerPortRule() {
		return getMServerPortAccess().getRule();
	}

	//MClientPort:
	//	{MClientPort}
	//	'client'
	//	type=[mclevdom::MPortType|VersionedQualifiedReferenceName] interface=[mcleviface::MInterface|VersionedQualifiedName]
	//	name=ID
	//	'{'
	//	attributeValueAssignments+=MParameterValueAssignment*
	//	'}' ';';
	public MClientPortElements getMClientPortAccess() {
		return pMClientPort;
	}
	
	public ParserRule getMClientPortRule() {
		return getMClientPortAccess().getRule();
	}

	//MParameterValueAssignment common::MParameterValueAssignmentSingleExpression:
	//	'attribute'
	//	parameter=[common::MParameter|VersionedQualifiedReferenceName]
	//	':='
	//	parameterValue=MParameterValueExpression ';'
	public MParameterValueAssignmentElements getMParameterValueAssignmentAccess() {
		return pMParameterValueAssignment;
	}
	
	public ParserRule getMParameterValueAssignmentRule() {
		return getMParameterValueAssignmentAccess().getRule();
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

	//MInternalComponentConnection:
	//	{MInternalComponentConnection}
	//	'connection' ('this' | clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) '.'
	//	clientPort=[MClientPort] '<->' ('this' | serverInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName])
	//	'.'
	//	serverPort=[MServerPort] ('using'
	//	connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
	//	'{' ('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')? ('attribute'
	//	attributeValueAssignments+=MParameterValueAssignment)*
	//	'}')? ';';
	public MInternalComponentConnectionElements getMInternalComponentConnectionAccess() {
		return pMInternalComponentConnection;
	}
	
	public ParserRule getMInternalComponentConnectionRule() {
		return getMInternalComponentConnectionAccess().getRule();
	}

	//MInternalComponentPlatformSwitch:
	//	{MInternalComponentPlatformSwitch}
	//	'connection' ('this' | clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) '.'
	//	clientPort=[MClientPort] '<->'
	//	'switch'
	//	'{'
	//	cases+=MInternalComponentPlatformSwitchCase+
	//	'}' ';';
	public MInternalComponentPlatformSwitchElements getMInternalComponentPlatformSwitchAccess() {
		return pMInternalComponentPlatformSwitch;
	}
	
	public ParserRule getMInternalComponentPlatformSwitchRule() {
		return getMInternalComponentPlatformSwitchAccess().getRule();
	}

	//MInternalComponentPlatformSwitchCase:
	//	'case' platform=[MComponentSupportedPlatform] ':' ('this' | serverInstance=[MInternalComponentInstance]) '.'
	//	serverPort=[MServerPort] ('using'
	//	connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
	//	'{' ('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')? ('attribute'
	//	attributeValueAssignments+=MParameterValueAssignment)*
	//	'}')? ';';
	public MInternalComponentPlatformSwitchCaseElements getMInternalComponentPlatformSwitchCaseAccess() {
		return pMInternalComponentPlatformSwitchCase;
	}
	
	public ParserRule getMInternalComponentPlatformSwitchCaseRule() {
		return getMInternalComponentPlatformSwitchCaseAccess().getRule();
	}

	//ComponentSupportedPlatform MComponentSupportedPlatform:
	//	{MComponentSupportedPlatform}
	//	'supported' 'platform'
	//	name=ID
	//	'{' ('osapi' ':=' ('any' | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ';' & 'os' ':=' ('any' |
	//	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ';' & 'architecture' ':=' ('any' |
	//	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ';' & ('compiler' ':='
	//	compiler=[pdl::MCompiler|VersionedQualifiedName] ';')?
	//	& 'microprocessor' ':=' ('any' | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ';' & 'board' ':='
	//	('any' | board=[pdl::MBoard|VersionedQualifiedName]) ';' & ('requires' ':='
	//	requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ';')?
	//	& ('attribute' 'values'
	//	'{'
	//	attributeValueAssignments+=MParameterValueAssignment*
	//	'}' ';')?
	//	& ('attributes'
	//	'{'
	//	attributes+=MParameter+
	//	'}' ';')?
	//	& ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
	//	languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
	//	& ('subcomponent' 'instances'
	//	'{'
	//	internalComponents+=MInternalComponentInstance+
	//	'}' ';')?
	//	& ('connections'
	//	'{'
	//	connections+=MInternalComponentConnection+
	//	'}' ';')?)
	//	'}' ';'
	public ComponentSupportedPlatformElements getComponentSupportedPlatformAccess() {
		return pComponentSupportedPlatform;
	}
	
	public ParserRule getComponentSupportedPlatformRule() {
		return getComponentSupportedPlatformAccess().getRule();
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
