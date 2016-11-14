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
public class OSSWPGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMESPOSSWPPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWP.MMESPOSSWPPackageFile");
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
		private final RuleCall cElementMMESPOSSWPPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMESPOSSWPPackageFile:
		//	'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
		//	imports+=[common::MCommonPackage|QualifiedName] ';')*
		//	element=MMESPOSSWPPackageElement;
		@Override public ParserRule getRule() { return rule; }

		//'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
		//imports+=[common::MCommonPackage|QualifiedName] ';')* element=MMESPOSSWPPackageElement
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

		//element=MMESPOSSWPPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMESPOSSWPPackageElement
		public RuleCall getElementMMESPOSSWPPackageElementParserRuleCall_4_0() { return cElementMMESPOSSWPPackageElementParserRuleCall_4_0; }
	}

	public class MMESPOSSWPPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWP.MMESPOSSWPPackageElement");
		private final RuleCall cMOSSwPackageParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MMESPOSSWPPackageElement:
		//	MOSSwPackage;
		@Override public ParserRule getRule() { return rule; }

		//MOSSwPackage
		public RuleCall getMOSSwPackageParserRuleCall() { return cMOSSwPackageParserRuleCall; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWP.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWP.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWP.VersionedQualifiedName");
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

	public class MOSSwPackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWP.MOSSwPackage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOsswpackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cExtendsMOSSwPackageCrossReference_2_1_0 = (CrossReference)cExtendsAssignment_2_1.eContents().get(0);
		private final RuleCall cExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cExtendsMOSSwPackageCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cExtendsMOSSwPackageCrossReference_2_2_1_0 = (CrossReference)cExtendsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cExtendsMOSSwPackageCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cVersionKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Assignment cVersionAssignment_4_0_2 = (Assignment)cGroup_4_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_4_0_2_0 = (RuleCall)cVersionAssignment_4_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cOsKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Assignment cReferencedElementAssignment_4_1_2 = (Assignment)cGroup_4_1.eContents().get(2);
		private final CrossReference cReferencedElementMOperatingSystemCrossReference_4_1_2_0 = (CrossReference)cReferencedElementAssignment_4_1_2.eContents().get(0);
		private final RuleCall cReferencedElementMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_0_1 = (RuleCall)cReferencedElementMOperatingSystemCrossReference_4_1_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_1_3 = (Keyword)cGroup_4_1.eContents().get(3);
		private final Group cGroup_4_2 = (Group)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cConstructionKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cToolsKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_4_2_2 = (Keyword)cGroup_4_2.eContents().get(2);
		private final Assignment cCtoolsAssignment_4_2_3 = (Assignment)cGroup_4_2.eContents().get(3);
		private final CrossReference cCtoolsMConstructionToolCrossReference_4_2_3_0 = (CrossReference)cCtoolsAssignment_4_2_3.eContents().get(0);
		private final RuleCall cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_3_0_1 = (RuleCall)cCtoolsMConstructionToolCrossReference_4_2_3_0.eContents().get(1);
		private final Group cGroup_4_2_4 = (Group)cGroup_4_2.eContents().get(4);
		private final Keyword cCommaKeyword_4_2_4_0 = (Keyword)cGroup_4_2_4.eContents().get(0);
		private final Assignment cCtoolsAssignment_4_2_4_1 = (Assignment)cGroup_4_2_4.eContents().get(1);
		private final CrossReference cCtoolsMConstructionToolCrossReference_4_2_4_1_0 = (CrossReference)cCtoolsAssignment_4_2_4_1.eContents().get(0);
		private final RuleCall cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_4_1_0_1 = (RuleCall)cCtoolsMConstructionToolCrossReference_4_2_4_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_2_5 = (Keyword)cGroup_4_2.eContents().get(5);
		private final Group cGroup_4_3 = (Group)cUnorderedGroup_4.eContents().get(3);
		private final Keyword cProvidedKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Keyword cOsswisKeyword_4_3_1 = (Keyword)cGroup_4_3.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_4_3_2 = (Keyword)cGroup_4_3.eContents().get(2);
		private final Assignment cProvidedOSSWIsAssignment_4_3_3 = (Assignment)cGroup_4_3.eContents().get(3);
		private final CrossReference cProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_0 = (CrossReference)cProvidedOSSWIsAssignment_4_3_3.eContents().get(0);
		private final RuleCall cProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_3_0_1 = (RuleCall)cProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_0.eContents().get(1);
		private final Group cGroup_4_3_4 = (Group)cGroup_4_3.eContents().get(4);
		private final Keyword cCommaKeyword_4_3_4_0 = (Keyword)cGroup_4_3_4.eContents().get(0);
		private final Assignment cProvidedOSSWIsAssignment_4_3_4_1 = (Assignment)cGroup_4_3_4.eContents().get(1);
		private final CrossReference cProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_4_1_0 = (CrossReference)cProvidedOSSWIsAssignment_4_3_4_1.eContents().get(0);
		private final RuleCall cProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_4_1_0_1 = (RuleCall)cProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_4_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_3_5 = (Keyword)cGroup_4_3.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MOSSwPackage:
		//	'osswpackage'
		//	name=ID ('extends' extends+=[MOSSwPackage|VersionedQualifiedName] (","
		//	extends+=[MOSSwPackage|VersionedQualifiedName])*)?
		//	'{' ('version' ':=' version=Version ';' & 'os' ':=' referencedElement=[pdl::MOperatingSystem|VersionedQualifiedName]
		//	';' & 'construction' 'tools' ':=' ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';' & ('provided' 'osswis' ':='
		//	providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName] (","
		//	providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName])* ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'osswpackage' name=ID ('extends' extends+=[MOSSwPackage|VersionedQualifiedName] (","
		//extends+=[MOSSwPackage|VersionedQualifiedName])*)? '{' ('version' ':=' version=Version ';' & 'os' ':='
		//referencedElement=[pdl::MOperatingSystem|VersionedQualifiedName] ';' & 'construction' 'tools' ':='
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';' & ('provided' 'osswis' ':='
		//providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName] (","
		//providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName])* ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//'osswpackage'
		public Keyword getOsswpackageKeyword_0() { return cOsswpackageKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//('extends' extends+=[MOSSwPackage|VersionedQualifiedName] ("," extends+=[MOSSwPackage|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//extends+=[MOSSwPackage|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_1() { return cExtendsAssignment_2_1; }

		//[MOSSwPackage|VersionedQualifiedName]
		public CrossReference getExtendsMOSSwPackageCrossReference_2_1_0() { return cExtendsMOSSwPackageCrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," extends+=[MOSSwPackage|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//extends+=[MOSSwPackage|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_2_1() { return cExtendsAssignment_2_2_1; }

		//[MOSSwPackage|VersionedQualifiedName]
		public CrossReference getExtendsMOSSwPackageCrossReference_2_2_1_0() { return cExtendsMOSSwPackageCrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('version' ':=' version=Version ';' & 'os' ':=' referencedElement=[pdl::MOperatingSystem|VersionedQualifiedName] ';' &
		//'construction' 'tools' ':=' ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';' & ('provided' 'osswis' ':='
		//providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName] (","
		//providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName])* ';')?)
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

		//'os' ':=' referencedElement=[pdl::MOperatingSystem|VersionedQualifiedName] ';'
		public Group getGroup_4_1() { return cGroup_4_1; }

		//'os'
		public Keyword getOsKeyword_4_1_0() { return cOsKeyword_4_1_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_1_1() { return cColonEqualsSignKeyword_4_1_1; }

		//referencedElement=[pdl::MOperatingSystem|VersionedQualifiedName]
		public Assignment getReferencedElementAssignment_4_1_2() { return cReferencedElementAssignment_4_1_2; }

		//[pdl::MOperatingSystem|VersionedQualifiedName]
		public CrossReference getReferencedElementMOperatingSystemCrossReference_4_1_2_0() { return cReferencedElementMOperatingSystemCrossReference_4_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getReferencedElementMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_0_1() { return cReferencedElementMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_1_3() { return cSemicolonKeyword_4_1_3; }

		//'construction' 'tools' ':=' ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';'
		public Group getGroup_4_2() { return cGroup_4_2; }

		//'construction'
		public Keyword getConstructionKeyword_4_2_0() { return cConstructionKeyword_4_2_0; }

		//'tools'
		public Keyword getToolsKeyword_4_2_1() { return cToolsKeyword_4_2_1; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_2_2() { return cColonEqualsSignKeyword_4_2_2; }

		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
		public Assignment getCtoolsAssignment_4_2_3() { return cCtoolsAssignment_4_2_3; }

		//[mespctool::MConstructionTool|VersionedQualifiedName]
		public CrossReference getCtoolsMConstructionToolCrossReference_4_2_3_0() { return cCtoolsMConstructionToolCrossReference_4_2_3_0; }

		//VersionedQualifiedName
		public RuleCall getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_3_0_1() { return cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_3_0_1; }

		//("," ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])*
		public Group getGroup_4_2_4() { return cGroup_4_2_4; }

		//","
		public Keyword getCommaKeyword_4_2_4_0() { return cCommaKeyword_4_2_4_0; }

		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
		public Assignment getCtoolsAssignment_4_2_4_1() { return cCtoolsAssignment_4_2_4_1; }

		//[mespctool::MConstructionTool|VersionedQualifiedName]
		public CrossReference getCtoolsMConstructionToolCrossReference_4_2_4_1_0() { return cCtoolsMConstructionToolCrossReference_4_2_4_1_0; }

		//VersionedQualifiedName
		public RuleCall getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_4_1_0_1() { return cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_4_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_2_5() { return cSemicolonKeyword_4_2_5; }

		//('provided' 'osswis' ':=' providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName] (","
		//providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName])* ';')?
		public Group getGroup_4_3() { return cGroup_4_3; }

		//'provided'
		public Keyword getProvidedKeyword_4_3_0() { return cProvidedKeyword_4_3_0; }

		//'osswis'
		public Keyword getOsswisKeyword_4_3_1() { return cOsswisKeyword_4_3_1; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_3_2() { return cColonEqualsSignKeyword_4_3_2; }

		//providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName]
		public Assignment getProvidedOSSWIsAssignment_4_3_3() { return cProvidedOSSWIsAssignment_4_3_3; }

		//[mesposswi::MOSSwInterface|VersionedQualifiedName]
		public CrossReference getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_0() { return cProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_0; }

		//VersionedQualifiedName
		public RuleCall getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_3_0_1() { return cProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_3_0_1; }

		//("," providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName])*
		public Group getGroup_4_3_4() { return cGroup_4_3_4; }

		//","
		public Keyword getCommaKeyword_4_3_4_0() { return cCommaKeyword_4_3_4_0; }

		//providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName]
		public Assignment getProvidedOSSWIsAssignment_4_3_4_1() { return cProvidedOSSWIsAssignment_4_3_4_1; }

		//[mesposswi::MOSSwInterface|VersionedQualifiedName]
		public CrossReference getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_4_1_0() { return cProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_4_1_0; }

		//VersionedQualifiedName
		public RuleCall getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_4_1_0_1() { return cProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_4_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_3_5() { return cSemicolonKeyword_4_3_5; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	
	
	private final MMESPOSSWPPackageFileElements pMMESPOSSWPPackageFile;
	private final MMESPOSSWPPackageElementElements pMMESPOSSWPPackageElement;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final MOSSwPackageElements pMOSSwPackage;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public OSSWPGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMMESPOSSWPPackageFile = new MMESPOSSWPPackageFileElements();
		this.pMMESPOSSWPPackageElement = new MMESPOSSWPPackageElementElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pMOSSwPackage = new MOSSwPackageElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mesp.lang.OSSWP".equals(grammar.getName())) {
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

	
	//MMESPOSSWPPackageFile:
	//	'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
	//	imports+=[common::MCommonPackage|QualifiedName] ';')*
	//	element=MMESPOSSWPPackageElement;
	public MMESPOSSWPPackageFileElements getMMESPOSSWPPackageFileAccess() {
		return pMMESPOSSWPPackageFile;
	}
	
	public ParserRule getMMESPOSSWPPackageFileRule() {
		return getMMESPOSSWPPackageFileAccess().getRule();
	}

	//MMESPOSSWPPackageElement:
	//	MOSSwPackage;
	public MMESPOSSWPPackageElementElements getMMESPOSSWPPackageElementAccess() {
		return pMMESPOSSWPPackageElement;
	}
	
	public ParserRule getMMESPOSSWPPackageElementRule() {
		return getMMESPOSSWPPackageElementAccess().getRule();
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

	//MOSSwPackage:
	//	'osswpackage'
	//	name=ID ('extends' extends+=[MOSSwPackage|VersionedQualifiedName] (","
	//	extends+=[MOSSwPackage|VersionedQualifiedName])*)?
	//	'{' ('version' ':=' version=Version ';' & 'os' ':=' referencedElement=[pdl::MOperatingSystem|VersionedQualifiedName]
	//	';' & 'construction' 'tools' ':=' ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
	//	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';' & ('provided' 'osswis' ':='
	//	providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName] (","
	//	providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName])* ';')?)
	//	'}' ';';
	public MOSSwPackageElements getMOSSwPackageAccess() {
		return pMOSSwPackage;
	}
	
	public ParserRule getMOSSwPackageRule() {
		return getMOSSwPackageAccess().getRule();
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
