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
public class OSSWIGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMESPOSSWIPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MMESPOSSWIPackageFile");
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
		private final RuleCall cElementMMESPOSSWIPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMESPOSSWIPackageFile:
		//	'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
		//	imports+=[common::MCommonPackage|QualifiedName] ';')*
		//	element=MMESPOSSWIPackageElement;
		@Override public ParserRule getRule() { return rule; }

		//'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
		//imports+=[common::MCommonPackage|QualifiedName] ';')* element=MMESPOSSWIPackageElement
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

		//element=MMESPOSSWIPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMESPOSSWIPackageElement
		public RuleCall getElementMMESPOSSWIPackageElementParserRuleCall_4_0() { return cElementMMESPOSSWIPackageElementParserRuleCall_4_0; }
	}

	public class MMESPOSSWIPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MMESPOSSWIPackageElement");
		private final RuleCall cMOSSwInterfaceParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MMESPOSSWIPackageElement:
		//	MOSSwInterface;
		@Override public ParserRule getRule() { return rule; }

		//MOSSwInterface
		public RuleCall getMOSSwInterfaceParserRuleCall() { return cMOSSwInterfaceParserRuleCall; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.VersionedQualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.VersionedQualifiedReferenceName");
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

	public class MOSSwInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MOSSwInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOsswinterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cExtendsMOSSwInterfaceCrossReference_2_1_0 = (CrossReference)cExtendsAssignment_2_1.eContents().get(0);
		private final RuleCall cExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cExtendsMOSSwInterfaceCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cExtendsMOSSwInterfaceCrossReference_2_2_1_0 = (CrossReference)cExtendsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cExtendsMOSSwInterfaceCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cVersionKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Assignment cVersionAssignment_4_0_2 = (Assignment)cGroup_4_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_4_0_2_0 = (RuleCall)cVersionAssignment_4_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cOsapiKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Assignment cReferencedElementAssignment_4_1_2 = (Assignment)cGroup_4_1.eContents().get(2);
		private final CrossReference cReferencedElementMOperatingSystemAPICrossReference_4_1_2_0 = (CrossReference)cReferencedElementAssignment_4_1_2.eContents().get(0);
		private final RuleCall cReferencedElementMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_1_2_0_1 = (RuleCall)cReferencedElementMOperatingSystemAPICrossReference_4_1_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_1_3 = (Keyword)cGroup_4_1.eContents().get(3);
		private final Group cGroup_4_2 = (Group)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cProvidedKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cResourcesKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_2_2 = (Keyword)cGroup_4_2.eContents().get(2);
		private final Assignment cProvidedResourcesAssignment_4_2_3 = (Assignment)cGroup_4_2.eContents().get(3);
		private final RuleCall cProvidedResourcesMProvidedResourceParserRuleCall_4_2_3_0 = (RuleCall)cProvidedResourcesAssignment_4_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_2_4 = (Keyword)cGroup_4_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_2_5 = (Keyword)cGroup_4_2.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MOSSwInterface:
		//	'osswinterface'
		//	name=ID ('extends' extends+=[MOSSwInterface|VersionedQualifiedName] (","
		//	extends+=[MOSSwInterface|VersionedQualifiedName])*)?
		//	'{' ('version' ':=' version=Version ';' & 'osapi' ':='
		//	referencedElement=[pdl::MOperatingSystemAPI|VersionedQualifiedName] ';' & ('provided' 'resources'
		//	'{'
		//	providedResources+=MProvidedResource+
		//	'}' ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'osswinterface' name=ID ('extends' extends+=[MOSSwInterface|VersionedQualifiedName] (","
		//extends+=[MOSSwInterface|VersionedQualifiedName])*)? '{' ('version' ':=' version=Version ';' & 'osapi' ':='
		//referencedElement=[pdl::MOperatingSystemAPI|VersionedQualifiedName] ';' & ('provided' 'resources' '{'
		//providedResources+=MProvidedResource+ '}' ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//'osswinterface'
		public Keyword getOsswinterfaceKeyword_0() { return cOsswinterfaceKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//('extends' extends+=[MOSSwInterface|VersionedQualifiedName] ("," extends+=[MOSSwInterface|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//extends+=[MOSSwInterface|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_1() { return cExtendsAssignment_2_1; }

		//[MOSSwInterface|VersionedQualifiedName]
		public CrossReference getExtendsMOSSwInterfaceCrossReference_2_1_0() { return cExtendsMOSSwInterfaceCrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," extends+=[MOSSwInterface|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//extends+=[MOSSwInterface|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_2_1() { return cExtendsAssignment_2_2_1; }

		//[MOSSwInterface|VersionedQualifiedName]
		public CrossReference getExtendsMOSSwInterfaceCrossReference_2_2_1_0() { return cExtendsMOSSwInterfaceCrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('version' ':=' version=Version ';' & 'osapi' ':=' referencedElement=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		//';' & ('provided' 'resources' '{' providedResources+=MProvidedResource+ '}' ';')?)
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

		//'osapi' ':=' referencedElement=[pdl::MOperatingSystemAPI|VersionedQualifiedName] ';'
		public Group getGroup_4_1() { return cGroup_4_1; }

		//'osapi'
		public Keyword getOsapiKeyword_4_1_0() { return cOsapiKeyword_4_1_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_1_1() { return cColonEqualsSignKeyword_4_1_1; }

		//referencedElement=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public Assignment getReferencedElementAssignment_4_1_2() { return cReferencedElementAssignment_4_1_2; }

		//[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public CrossReference getReferencedElementMOperatingSystemAPICrossReference_4_1_2_0() { return cReferencedElementMOperatingSystemAPICrossReference_4_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getReferencedElementMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_1_2_0_1() { return cReferencedElementMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_1_2_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_1_3() { return cSemicolonKeyword_4_1_3; }

		//('provided' 'resources' '{' providedResources+=MProvidedResource+ '}' ';')?
		public Group getGroup_4_2() { return cGroup_4_2; }

		//'provided'
		public Keyword getProvidedKeyword_4_2_0() { return cProvidedKeyword_4_2_0; }

		//'resources'
		public Keyword getResourcesKeyword_4_2_1() { return cResourcesKeyword_4_2_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_2_2() { return cLeftCurlyBracketKeyword_4_2_2; }

		//providedResources+=MProvidedResource+
		public Assignment getProvidedResourcesAssignment_4_2_3() { return cProvidedResourcesAssignment_4_2_3; }

		//MProvidedResource
		public RuleCall getProvidedResourcesMProvidedResourceParserRuleCall_4_2_3_0() { return cProvidedResourcesMProvidedResourceParserRuleCall_4_2_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_2_4() { return cRightCurlyBracketKeyword_4_2_4; }

		//';'
		public Keyword getSemicolonKeyword_4_2_5() { return cSemicolonKeyword_4_2_5; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MProvidedResourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MProvidedResource");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMQuantifiableResourceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMInstantiableResourceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MProvidedResource mespcommon::MProvidedResource:
		//	MQuantifiableResource | MInstantiableResource
		@Override public ParserRule getRule() { return rule; }

		//MQuantifiableResource | MInstantiableResource
		public Alternatives getAlternatives() { return cAlternatives; }

		//MQuantifiableResource
		public RuleCall getMQuantifiableResourceParserRuleCall_0() { return cMQuantifiableResourceParserRuleCall_0; }

		//MInstantiableResource
		public RuleCall getMInstantiableResourceParserRuleCall_1() { return cMInstantiableResourceParserRuleCall_1; }
	}

	public class MQuantifiableResourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MQuantifiableResource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuantifiableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cResourceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cStepKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLowerBoundAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLowerBoundMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cLowerBoundAssignment_4.eContents().get(0);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cUpperBoundAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cUpperBoundMParameterValueExpressionParserRuleCall_6_0 = (RuleCall)cUpperBoundAssignment_6.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MQuantifiableResource mespcommon::MQuantifiableResource:
		//	'quantifiable' 'resource'
		//	name=ID
		//	'step' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
		//	';'
		@Override public ParserRule getRule() { return rule; }

		//'quantifiable' 'resource' name=ID 'step' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
		//';'
		public Group getGroup() { return cGroup; }

		//'quantifiable'
		public Keyword getQuantifiableKeyword_0() { return cQuantifiableKeyword_0; }

		//'resource'
		public Keyword getResourceKeyword_1() { return cResourceKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//'step'
		public Keyword getStepKeyword_3() { return cStepKeyword_3; }

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

	public class MInstantiableResourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MInstantiableResource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInstantiableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cResourceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParametersMParameterParserRuleCall_4_0 = (RuleCall)cParametersAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MInstantiableResource mespcommon::MInstantiableResource:
		//	'instantiable' 'resource'
		//	name=ID
		//	'{'
		//	parameters+=MParameter*
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }

		//'instantiable' 'resource' name=ID '{' parameters+=MParameter* '}' ';'
		public Group getGroup() { return cGroup; }

		//'instantiable'
		public Keyword getInstantiableKeyword_0() { return cInstantiableKeyword_0; }

		//'resource'
		public Keyword getResourceKeyword_1() { return cResourceKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//parameters+=MParameter*
		public Assignment getParametersAssignment_4() { return cParametersAssignment_4; }

		//MParameter
		public RuleCall getParametersMParameterParserRuleCall_4_0() { return cParametersMParameterParserRuleCall_4_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameter");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MIntegerParameterSingleExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIntegerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cRangeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRangeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cRangeMParameterRangeParserRuleCall_4_1_0 = (RuleCall)cRangeAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MIntegerParameterSingleExpression common::MIntegerParameterSingleExpression:
		//	'integer'
		//	name=ID
		//	':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)?
		//	';'
		@Override public ParserRule getRule() { return rule; }

		//'integer' name=ID ':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)? ';'
		public Group getGroup() { return cGroup; }

		//'integer'
		public Keyword getIntegerKeyword_0() { return cIntegerKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_2() { return cColonEqualsSignKeyword_2; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_3() { return cDefaultValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_3_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_3_0; }

		//('range' range=MParameterRange)?
		public Group getGroup_4() { return cGroup_4; }

		//'range'
		public Keyword getRangeKeyword_4_0() { return cRangeKeyword_4_0; }

		//range=MParameterRange
		public Assignment getRangeAssignment_4_1() { return cRangeAssignment_4_1; }

		//MParameterRange
		public RuleCall getRangeMParameterRangeParserRuleCall_4_1_0() { return cRangeMParameterRangeParserRuleCall_4_1_0; }

		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MEnumParameterDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MEnumParameterDefinition");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MEnumParameterSingleExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEnumDefinitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cEnumDefinitionMEnumParameterDefinitionCrossReference_1_0 = (CrossReference)cEnumDefinitionAssignment_1.eContents().get(0);
		private final RuleCall cEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_1_0_1 = (RuleCall)cEnumDefinitionMEnumParameterDefinitionCrossReference_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDefaultValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cDefaultValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MEnumParameterSingleExpression common::MEnumParameterSingleExpression:
		//	'enum'
		//	enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
		//	':=' defaultValue=MParameterValueExpression
		//	';'
		@Override public ParserRule getRule() { return rule; }

		//'enum' enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID ':='
		//defaultValue=MParameterValueExpression ';'
		public Group getGroup() { return cGroup; }

		//'enum'
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }

		//enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName]
		public Assignment getEnumDefinitionAssignment_1() { return cEnumDefinitionAssignment_1; }

		//[common::MEnumParameterDefinition|VersionedQualifiedReferenceName]
		public CrossReference getEnumDefinitionMEnumParameterDefinitionCrossReference_1_0() { return cEnumDefinitionMEnumParameterDefinitionCrossReference_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_1_0_1() { return cEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_1_0_1; }

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

	public class MRealParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MRealParameterSingleExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRealKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cRangeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRangeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cRangeMParameterRangeParserRuleCall_4_1_0 = (RuleCall)cRangeAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MRealParameterSingleExpression common::MRealParameterSingleExpression:
		//	'real'
		//	name=ID
		//	':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)?
		//	';'
		@Override public ParserRule getRule() { return rule; }

		//'real' name=ID ':=' defaultValue=MParameterValueExpression ('range' range=MParameterRange)? ';'
		public Group getGroup() { return cGroup; }

		//'real'
		public Keyword getRealKeyword_0() { return cRealKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_2() { return cColonEqualsSignKeyword_2; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_3() { return cDefaultValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_3_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_3_0; }

		//('range' range=MParameterRange)?
		public Group getGroup_4() { return cGroup_4; }

		//'range'
		public Keyword getRangeKeyword_4_0() { return cRangeKeyword_4_0; }

		//range=MParameterRange
		public Assignment getRangeAssignment_4_1() { return cRangeAssignment_4_1; }

		//MParameterRange
		public RuleCall getRangeMParameterRangeParserRuleCall_4_1_0() { return cRangeMParameterRangeParserRuleCall_4_1_0; }

		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MEnumParameterLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MEnumParameterLiteralRule");
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

	public class MEnumParameterLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MEnumParameterLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MEnumParamIntegerLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MEnumParamRealLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MEnumParamStringLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MBooleanParameterSingleExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBooleanKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MBooleanParameterSingleExpression common::MBooleanParameterSingleExpression:
		//	'boolean'
		//	name=ID
		//	':=' defaultValue=MParameterValueExpression
		//	';'
		@Override public ParserRule getRule() { return rule; }

		//'boolean' name=ID ':=' defaultValue=MParameterValueExpression ';'
		public Group getGroup() { return cGroup; }

		//'boolean'
		public Keyword getBooleanKeyword_0() { return cBooleanKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_2() { return cColonEqualsSignKeyword_2; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_3() { return cDefaultValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_3_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_3_0; }

		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class MStringParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MStringParameterSingleExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStringKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MStringParameterSingleExpression common::MStringParameterSingleExpression:
		//	'string'
		//	name=ID
		//	':=' defaultValue=MParameterValueExpression
		//	';'
		@Override public ParserRule getRule() { return rule; }

		//'string' name=ID ':=' defaultValue=MParameterValueExpression ';'
		public Group getGroup() { return cGroup; }

		//'string'
		public Keyword getStringKeyword_0() { return cStringKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_2() { return cColonEqualsSignKeyword_2; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_3() { return cDefaultValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_3_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_3_0; }

		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.EBoolean");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.INTEGER");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.REAL");
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

	public class MParameterValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValue");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueLiteral");
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

	public class MParameterValueBooleanLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueBooleanLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueStringLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueIntegerLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueRealLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueRefObject");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValuePAR");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpression");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueTERM");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterRange");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterOCR");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterOOR");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterCOR");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterCCR");
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
	
	
	public class MParameterValueExpressionOperatorsElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueExpressionOperators");
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
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.MParameterValueTERMOperators");
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
	
	private final MMESPOSSWIPackageFileElements pMMESPOSSWIPackageFile;
	private final MMESPOSSWIPackageElementElements pMMESPOSSWIPackageElement;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final MOSSwInterfaceElements pMOSSwInterface;
	private final MProvidedResourceElements pMProvidedResource;
	private final MQuantifiableResourceElements pMQuantifiableResource;
	private final MInstantiableResourceElements pMInstantiableResource;
	private final MParameterElements pMParameter;
	private final MIntegerParameterSingleExpressionElements pMIntegerParameterSingleExpression;
	private final MEnumParameterDefinitionElements pMEnumParameterDefinition;
	private final MEnumParameterSingleExpressionElements pMEnumParameterSingleExpression;
	private final MRealParameterSingleExpressionElements pMRealParameterSingleExpression;
	private final MEnumParameterLiteralRuleElements pMEnumParameterLiteralRule;
	private final MEnumParameterLiteralElements pMEnumParameterLiteral;
	private final MEnumParamIntegerLiteralElements pMEnumParamIntegerLiteral;
	private final MEnumParamRealLiteralElements pMEnumParamRealLiteral;
	private final MEnumParamStringLiteralElements pMEnumParamStringLiteral;
	private final MBooleanParameterSingleExpressionElements pMBooleanParameterSingleExpression;
	private final MStringParameterSingleExpressionElements pMStringParameterSingleExpression;
	private final EBooleanElements pEBoolean;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final REALElements pREAL;
	private final MParameterValueElements pMParameterValue;
	private final MParameterValueLiteralElements pMParameterValueLiteral;
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
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public OSSWIGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMMESPOSSWIPackageFile = new MMESPOSSWIPackageFileElements();
		this.pMMESPOSSWIPackageElement = new MMESPOSSWIPackageElementElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.pMOSSwInterface = new MOSSwInterfaceElements();
		this.pMProvidedResource = new MProvidedResourceElements();
		this.pMQuantifiableResource = new MQuantifiableResourceElements();
		this.pMInstantiableResource = new MInstantiableResourceElements();
		this.pMParameter = new MParameterElements();
		this.pMIntegerParameterSingleExpression = new MIntegerParameterSingleExpressionElements();
		this.pMEnumParameterDefinition = new MEnumParameterDefinitionElements();
		this.pMEnumParameterSingleExpression = new MEnumParameterSingleExpressionElements();
		this.pMRealParameterSingleExpression = new MRealParameterSingleExpressionElements();
		this.pMEnumParameterLiteralRule = new MEnumParameterLiteralRuleElements();
		this.pMEnumParameterLiteral = new MEnumParameterLiteralElements();
		this.pMEnumParamIntegerLiteral = new MEnumParamIntegerLiteralElements();
		this.pMEnumParamRealLiteral = new MEnumParamRealLiteralElements();
		this.pMEnumParamStringLiteral = new MEnumParamStringLiteralElements();
		this.pMBooleanParameterSingleExpression = new MBooleanParameterSingleExpressionElements();
		this.pMStringParameterSingleExpression = new MStringParameterSingleExpressionElements();
		this.pEBoolean = new EBooleanElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mesp.lang.OSSWI.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.pREAL = new REALElements();
		this.pMParameterValue = new MParameterValueElements();
		this.pMParameterValueLiteral = new MParameterValueLiteralElements();
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
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mesp.lang.OSSWI".equals(grammar.getName())) {
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

	
	//MMESPOSSWIPackageFile:
	//	'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
	//	imports+=[common::MCommonPackage|QualifiedName] ';')*
	//	element=MMESPOSSWIPackageElement;
	public MMESPOSSWIPackageFileElements getMMESPOSSWIPackageFileAccess() {
		return pMMESPOSSWIPackageFile;
	}
	
	public ParserRule getMMESPOSSWIPackageFileRule() {
		return getMMESPOSSWIPackageFileAccess().getRule();
	}

	//MMESPOSSWIPackageElement:
	//	MOSSwInterface;
	public MMESPOSSWIPackageElementElements getMMESPOSSWIPackageElementAccess() {
		return pMMESPOSSWIPackageElement;
	}
	
	public ParserRule getMMESPOSSWIPackageElementRule() {
		return getMMESPOSSWIPackageElementAccess().getRule();
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

	//MOSSwInterface:
	//	'osswinterface'
	//	name=ID ('extends' extends+=[MOSSwInterface|VersionedQualifiedName] (","
	//	extends+=[MOSSwInterface|VersionedQualifiedName])*)?
	//	'{' ('version' ':=' version=Version ';' & 'osapi' ':='
	//	referencedElement=[pdl::MOperatingSystemAPI|VersionedQualifiedName] ';' & ('provided' 'resources'
	//	'{'
	//	providedResources+=MProvidedResource+
	//	'}' ';')?)
	//	'}' ';';
	public MOSSwInterfaceElements getMOSSwInterfaceAccess() {
		return pMOSSwInterface;
	}
	
	public ParserRule getMOSSwInterfaceRule() {
		return getMOSSwInterfaceAccess().getRule();
	}

	//MProvidedResource mespcommon::MProvidedResource:
	//	MQuantifiableResource | MInstantiableResource
	public MProvidedResourceElements getMProvidedResourceAccess() {
		return pMProvidedResource;
	}
	
	public ParserRule getMProvidedResourceRule() {
		return getMProvidedResourceAccess().getRule();
	}

	//MQuantifiableResource mespcommon::MQuantifiableResource:
	//	'quantifiable' 'resource'
	//	name=ID
	//	'step' lowerBound=MParameterValueExpression 'to' upperBound=MParameterValueExpression
	//	';'
	public MQuantifiableResourceElements getMQuantifiableResourceAccess() {
		return pMQuantifiableResource;
	}
	
	public ParserRule getMQuantifiableResourceRule() {
		return getMQuantifiableResourceAccess().getRule();
	}

	//MInstantiableResource mespcommon::MInstantiableResource:
	//	'instantiable' 'resource'
	//	name=ID
	//	'{'
	//	parameters+=MParameter*
	//	'}' ';'
	public MInstantiableResourceElements getMInstantiableResourceAccess() {
		return pMInstantiableResource;
	}
	
	public ParserRule getMInstantiableResourceRule() {
		return getMInstantiableResourceAccess().getRule();
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
