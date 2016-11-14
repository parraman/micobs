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
public class FLATMCADGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMCLEVFLATMCADPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MMCLEVFLATMCADPackageFile");
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
		private final RuleCall cElementMMCLEVFLATMCADPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMCLEVFLATMCADPackageFile:
		//	'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
		//	imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ';')*
		//	element=MMCLEVFLATMCADPackageElement;
		@Override public ParserRule getRule() { return rule; }

		//'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
		//imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ';')* element=MMCLEVFLATMCADPackageElement
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

		//('import' imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ';')*
		public Group getGroup_3() { return cGroup_3; }

		//'import'
		public Keyword getImportKeyword_3_0() { return cImportKeyword_3_0; }

		//imports+=[mclevlibrary::MMCLEVPackage|QualifiedName]
		public Assignment getImportsAssignment_3_1() { return cImportsAssignment_3_1; }

		//[mclevlibrary::MMCLEVPackage|QualifiedName]
		public CrossReference getImportsMMCLEVPackageCrossReference_3_1_0() { return cImportsMMCLEVPackageCrossReference_3_1_0; }

		//QualifiedName
		public RuleCall getImportsMMCLEVPackageQualifiedNameParserRuleCall_3_1_0_1() { return cImportsMMCLEVPackageQualifiedNameParserRuleCall_3_1_0_1; }

		//';'
		public Keyword getSemicolonKeyword_3_2() { return cSemicolonKeyword_3_2; }

		//element=MMCLEVFLATMCADPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMCLEVFLATMCADPackageElement
		public RuleCall getElementMMCLEVFLATMCADPackageElementParserRuleCall_4_0() { return cElementMMCLEVFLATMCADPackageElementParserRuleCall_4_0; }
	}

	public class MMCLEVFLATMCADPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MMCLEVFLATMCADPackageElement");
		private final RuleCall cMFlatMCADParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MMCLEVFLATMCADPackageElement:
		//	MFlatMCAD;
		@Override public ParserRule getRule() { return rule; }

		//MFlatMCAD
		public RuleCall getMFlatMCADParserRuleCall() { return cMFlatMCADParserRuleCall; }
	}

	public class MFlatMCADElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatMCAD");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFlatKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cMcadKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cVersionKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Assignment cVersionAssignment_4_0_2 = (Assignment)cGroup_4_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_4_0_2_0 = (RuleCall)cVersionAssignment_4_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cDeploymentKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cProjectKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_4_1_2 = (Keyword)cGroup_4_1.eContents().get(2);
		private final Assignment cReferencedElementAssignment_4_1_3 = (Assignment)cGroup_4_1.eContents().get(3);
		private final CrossReference cReferencedElementMMCADeploymentCrossReference_4_1_3_0 = (CrossReference)cReferencedElementAssignment_4_1_3.eContents().get(0);
		private final RuleCall cReferencedElementMMCADeploymentVersionedQualifiedNameParserRuleCall_4_1_3_0_1 = (RuleCall)cReferencedElementMMCADeploymentCrossReference_4_1_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_1_4 = (Keyword)cGroup_4_1.eContents().get(4);
		private final Group cGroup_4_2 = (Group)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cDeploymentKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cTargetsKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_2_2 = (Keyword)cGroup_4_2.eContents().get(2);
		private final Assignment cTargetsAssignment_4_2_3 = (Assignment)cGroup_4_2.eContents().get(3);
		private final RuleCall cTargetsMFlatMCADTargetParserRuleCall_4_2_3_0 = (RuleCall)cTargetsAssignment_4_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_2_4 = (Keyword)cGroup_4_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_2_5 = (Keyword)cGroup_4_2.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MFlatMCAD:
		//	'flat' 'mcad'
		//	name=ID
		//	'{' ('version' ':=' version=Version ';' & 'deployment' 'project' ':='
		//	referencedElement=[mclevmcad::MMCADeployment|VersionedQualifiedName] ';' & 'deployment' 'targets' '{'
		//	targets+=MFlatMCADTarget+
		//	'}' ';')
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'flat' 'mcad' name=ID '{' ('version' ':=' version=Version ';' & 'deployment' 'project' ':='
		//referencedElement=[mclevmcad::MMCADeployment|VersionedQualifiedName] ';' & 'deployment' 'targets' '{'
		//targets+=MFlatMCADTarget+ '}' ';') '}' ';'
		public Group getGroup() { return cGroup; }

		//'flat'
		public Keyword getFlatKeyword_0() { return cFlatKeyword_0; }

		//'mcad'
		public Keyword getMcadKeyword_1() { return cMcadKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//('version' ':=' version=Version ';' & 'deployment' 'project' ':='
		//referencedElement=[mclevmcad::MMCADeployment|VersionedQualifiedName] ';' & 'deployment' 'targets' '{'
		//targets+=MFlatMCADTarget+ '}' ';')
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

		//'deployment' 'project' ':=' referencedElement=[mclevmcad::MMCADeployment|VersionedQualifiedName] ';'
		public Group getGroup_4_1() { return cGroup_4_1; }

		//'deployment'
		public Keyword getDeploymentKeyword_4_1_0() { return cDeploymentKeyword_4_1_0; }

		//'project'
		public Keyword getProjectKeyword_4_1_1() { return cProjectKeyword_4_1_1; }

		//':='
		public Keyword getColonEqualsSignKeyword_4_1_2() { return cColonEqualsSignKeyword_4_1_2; }

		//referencedElement=[mclevmcad::MMCADeployment|VersionedQualifiedName]
		public Assignment getReferencedElementAssignment_4_1_3() { return cReferencedElementAssignment_4_1_3; }

		//[mclevmcad::MMCADeployment|VersionedQualifiedName]
		public CrossReference getReferencedElementMMCADeploymentCrossReference_4_1_3_0() { return cReferencedElementMMCADeploymentCrossReference_4_1_3_0; }

		//VersionedQualifiedName
		public RuleCall getReferencedElementMMCADeploymentVersionedQualifiedNameParserRuleCall_4_1_3_0_1() { return cReferencedElementMMCADeploymentVersionedQualifiedNameParserRuleCall_4_1_3_0_1; }

		//';'
		public Keyword getSemicolonKeyword_4_1_4() { return cSemicolonKeyword_4_1_4; }

		//'deployment' 'targets' '{' targets+=MFlatMCADTarget+ '}' ';'
		public Group getGroup_4_2() { return cGroup_4_2; }

		//'deployment'
		public Keyword getDeploymentKeyword_4_2_0() { return cDeploymentKeyword_4_2_0; }

		//'targets'
		public Keyword getTargetsKeyword_4_2_1() { return cTargetsKeyword_4_2_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_2_2() { return cLeftCurlyBracketKeyword_4_2_2; }

		//targets+=MFlatMCADTarget+
		public Assignment getTargetsAssignment_4_2_3() { return cTargetsAssignment_4_2_3; }

		//MFlatMCADTarget
		public RuleCall getTargetsMFlatMCADTargetParserRuleCall_4_2_3_0() { return cTargetsMFlatMCADTargetParserRuleCall_4_2_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_2_4() { return cRightCurlyBracketKeyword_4_2_4; }

		//';'
		public Keyword getSemicolonKeyword_4_2_5() { return cSemicolonKeyword_4_2_5; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MFlatMCADTargetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatMCADTarget");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTargetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1 = (UnorderedGroup)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cUnorderedGroup_1.eContents().get(0);
		private final Keyword cPlatformKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cDeploymentPlatformAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final CrossReference cDeploymentPlatformMDeploymentPlatformCrossReference_1_0_1_0 = (CrossReference)cDeploymentPlatformAssignment_1_0_1.eContents().get(0);
		private final RuleCall cDeploymentPlatformMDeploymentPlatformIDTerminalRuleCall_1_0_1_0_1 = (RuleCall)cDeploymentPlatformMDeploymentPlatformCrossReference_1_0_1_0.eContents().get(1);
		private final Group cGroup_1_1 = (Group)cUnorderedGroup_1.eContents().get(1);
		private final Keyword cAlternativeKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cLeafDeploymentAlternativeAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final CrossReference cLeafDeploymentAlternativeMDeploymentAlternativeCrossReference_1_1_1_0 = (CrossReference)cLeafDeploymentAlternativeAssignment_1_1_1.eContents().get(0);
		private final RuleCall cLeafDeploymentAlternativeMDeploymentAlternativeVersionedQualifiedReferenceNameParserRuleCall_1_1_1_0_1 = (RuleCall)cLeafDeploymentAlternativeMDeploymentAlternativeCrossReference_1_1_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cAttributeKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cValuesKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3_0_2 = (Keyword)cGroup_3_0.eContents().get(2);
		private final Assignment cAttributeValueAssignmentsAssignment_3_0_3 = (Assignment)cGroup_3_0.eContents().get(3);
		private final RuleCall cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0_3_0 = (RuleCall)cAttributeValueAssignmentsAssignment_3_0_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_0_4 = (Keyword)cGroup_3_0.eContents().get(4);
		private final Keyword cSemicolonKeyword_3_0_5 = (Keyword)cGroup_3_0.eContents().get(5);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cComponentsKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cComponentsAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cComponentsMFlatComponentInstanceParserRuleCall_3_1_2_0 = (RuleCall)cComponentsAssignment_3_1_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Keyword cSemicolonKeyword_3_1_4 = (Keyword)cGroup_3_1.eContents().get(4);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cConnectionsKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cConnectionsAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final RuleCall cConnectionsMFlatConnectionParserRuleCall_3_2_2_0 = (RuleCall)cConnectionsAssignment_3_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_2_3 = (Keyword)cGroup_3_2.eContents().get(3);
		private final Keyword cSemicolonKeyword_3_2_4 = (Keyword)cGroup_3_2.eContents().get(4);
		private final Group cGroup_3_3 = (Group)cUnorderedGroup_3.eContents().get(3);
		private final Keyword cLibrariesKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_3_1 = (Keyword)cGroup_3_3.eContents().get(1);
		private final Assignment cLibrariesAssignment_3_3_2 = (Assignment)cGroup_3_3.eContents().get(2);
		private final RuleCall cLibrariesMFlatServiceLibraryInstanceParserRuleCall_3_3_2_0 = (RuleCall)cLibrariesAssignment_3_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_3_3 = (Keyword)cGroup_3_3.eContents().get(3);
		private final Keyword cSemicolonKeyword_3_3_4 = (Keyword)cGroup_3_3.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MFlatMCADTarget:
		//	'target' ('platform' deploymentPlatform=[mclevmcad::MDeploymentPlatform] & ('alternative'
		//	leafDeploymentAlternative=[mclevmcad::MDeploymentAlternative|VersionedQualifiedReferenceName])?)
		//	'{' (('attribute' 'values'
		//	'{'
		//	attributeValueAssignments+=MAttributeValueAssignment+
		//	'}' ';')?
		//	& ('components'
		//	'{'
		//	components+=MFlatComponentInstance+
		//	'}' ';')?
		//	& ('connections'
		//	'{'
		//	connections+=MFlatConnection+
		//	'}' ';')?
		//	& ('libraries'
		//	'{'
		//	libraries+=MFlatServiceLibraryInstance+
		//	'}' ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//'target' ('platform' deploymentPlatform=[mclevmcad::MDeploymentPlatform] & ('alternative'
		//leafDeploymentAlternative=[mclevmcad::MDeploymentAlternative|VersionedQualifiedReferenceName])?) '{' (('attribute'
		//'values' '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')? & ('components' '{'
		//components+=MFlatComponentInstance+ '}' ';')? & ('connections' '{' connections+=MFlatConnection+ '}' ';')? &
		//('libraries' '{' libraries+=MFlatServiceLibraryInstance+ '}' ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//'target'
		public Keyword getTargetKeyword_0() { return cTargetKeyword_0; }

		//('platform' deploymentPlatform=[mclevmcad::MDeploymentPlatform] & ('alternative'
		//leafDeploymentAlternative=[mclevmcad::MDeploymentAlternative|VersionedQualifiedReferenceName])?)
		public UnorderedGroup getUnorderedGroup_1() { return cUnorderedGroup_1; }

		//'platform' deploymentPlatform=[mclevmcad::MDeploymentPlatform]
		public Group getGroup_1_0() { return cGroup_1_0; }

		//'platform'
		public Keyword getPlatformKeyword_1_0_0() { return cPlatformKeyword_1_0_0; }

		//deploymentPlatform=[mclevmcad::MDeploymentPlatform]
		public Assignment getDeploymentPlatformAssignment_1_0_1() { return cDeploymentPlatformAssignment_1_0_1; }

		//[mclevmcad::MDeploymentPlatform]
		public CrossReference getDeploymentPlatformMDeploymentPlatformCrossReference_1_0_1_0() { return cDeploymentPlatformMDeploymentPlatformCrossReference_1_0_1_0; }

		//ID
		public RuleCall getDeploymentPlatformMDeploymentPlatformIDTerminalRuleCall_1_0_1_0_1() { return cDeploymentPlatformMDeploymentPlatformIDTerminalRuleCall_1_0_1_0_1; }

		//('alternative' leafDeploymentAlternative=[mclevmcad::MDeploymentAlternative|VersionedQualifiedReferenceName])?
		public Group getGroup_1_1() { return cGroup_1_1; }

		//'alternative'
		public Keyword getAlternativeKeyword_1_1_0() { return cAlternativeKeyword_1_1_0; }

		//leafDeploymentAlternative=[mclevmcad::MDeploymentAlternative|VersionedQualifiedReferenceName]
		public Assignment getLeafDeploymentAlternativeAssignment_1_1_1() { return cLeafDeploymentAlternativeAssignment_1_1_1; }

		//[mclevmcad::MDeploymentAlternative|VersionedQualifiedReferenceName]
		public CrossReference getLeafDeploymentAlternativeMDeploymentAlternativeCrossReference_1_1_1_0() { return cLeafDeploymentAlternativeMDeploymentAlternativeCrossReference_1_1_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getLeafDeploymentAlternativeMDeploymentAlternativeVersionedQualifiedReferenceNameParserRuleCall_1_1_1_0_1() { return cLeafDeploymentAlternativeMDeploymentAlternativeVersionedQualifiedReferenceNameParserRuleCall_1_1_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//(('attribute' 'values' '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')? & ('components' '{'
		//components+=MFlatComponentInstance+ '}' ';')? & ('connections' '{' connections+=MFlatConnection+ '}' ';')? &
		//('libraries' '{' libraries+=MFlatServiceLibraryInstance+ '}' ';')?)
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }

		//('attribute' 'values' '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')?
		public Group getGroup_3_0() { return cGroup_3_0; }

		//'attribute'
		public Keyword getAttributeKeyword_3_0_0() { return cAttributeKeyword_3_0_0; }

		//'values'
		public Keyword getValuesKeyword_3_0_1() { return cValuesKeyword_3_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0_2() { return cLeftCurlyBracketKeyword_3_0_2; }

		//attributeValueAssignments+=MAttributeValueAssignment+
		public Assignment getAttributeValueAssignmentsAssignment_3_0_3() { return cAttributeValueAssignmentsAssignment_3_0_3; }

		//MAttributeValueAssignment
		public RuleCall getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0_3_0() { return cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_3_0_4() { return cRightCurlyBracketKeyword_3_0_4; }

		//';'
		public Keyword getSemicolonKeyword_3_0_5() { return cSemicolonKeyword_3_0_5; }

		//('components' '{' components+=MFlatComponentInstance+ '}' ';')?
		public Group getGroup_3_1() { return cGroup_3_1; }

		//'components'
		public Keyword getComponentsKeyword_3_1_0() { return cComponentsKeyword_3_1_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1_1() { return cLeftCurlyBracketKeyword_3_1_1; }

		//components+=MFlatComponentInstance+
		public Assignment getComponentsAssignment_3_1_2() { return cComponentsAssignment_3_1_2; }

		//MFlatComponentInstance
		public RuleCall getComponentsMFlatComponentInstanceParserRuleCall_3_1_2_0() { return cComponentsMFlatComponentInstanceParserRuleCall_3_1_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_3_1_3() { return cRightCurlyBracketKeyword_3_1_3; }

		//';'
		public Keyword getSemicolonKeyword_3_1_4() { return cSemicolonKeyword_3_1_4; }

		//('connections' '{' connections+=MFlatConnection+ '}' ';')?
		public Group getGroup_3_2() { return cGroup_3_2; }

		//'connections'
		public Keyword getConnectionsKeyword_3_2_0() { return cConnectionsKeyword_3_2_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_2_1() { return cLeftCurlyBracketKeyword_3_2_1; }

		//connections+=MFlatConnection+
		public Assignment getConnectionsAssignment_3_2_2() { return cConnectionsAssignment_3_2_2; }

		//MFlatConnection
		public RuleCall getConnectionsMFlatConnectionParserRuleCall_3_2_2_0() { return cConnectionsMFlatConnectionParserRuleCall_3_2_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_3_2_3() { return cRightCurlyBracketKeyword_3_2_3; }

		//';'
		public Keyword getSemicolonKeyword_3_2_4() { return cSemicolonKeyword_3_2_4; }

		//('libraries' '{' libraries+=MFlatServiceLibraryInstance+ '}' ';')?
		public Group getGroup_3_3() { return cGroup_3_3; }

		//'libraries'
		public Keyword getLibrariesKeyword_3_3_0() { return cLibrariesKeyword_3_3_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_3_1() { return cLeftCurlyBracketKeyword_3_3_1; }

		//libraries+=MFlatServiceLibraryInstance+
		public Assignment getLibrariesAssignment_3_3_2() { return cLibrariesAssignment_3_3_2; }

		//MFlatServiceLibraryInstance
		public RuleCall getLibrariesMFlatServiceLibraryInstanceParserRuleCall_3_3_2_0() { return cLibrariesMFlatServiceLibraryInstanceParserRuleCall_3_3_2_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_3_3_3() { return cRightCurlyBracketKeyword_3_3_3; }

		//';'
		public Keyword getSemicolonKeyword_3_3_4() { return cSemicolonKeyword_3_3_4; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.VersionedQualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.VersionedQualifiedReferenceName");
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

	public class MFlatConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatConnection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMFlatConnectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cConnectionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cClientInstanceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cClientInstanceMFlatComponentInstanceCrossReference_2_0 = (CrossReference)cClientInstanceAssignment_2.eContents().get(0);
		private final RuleCall cClientInstanceMFlatComponentInstanceIDTerminalRuleCall_2_0_1 = (RuleCall)cClientInstanceMFlatComponentInstanceCrossReference_2_0.eContents().get(1);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cClientPortAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cClientPortMClientPortCrossReference_4_0 = (CrossReference)cClientPortAssignment_4.eContents().get(0);
		private final RuleCall cClientPortMClientPortIDTerminalRuleCall_4_0_1 = (RuleCall)cClientPortMClientPortCrossReference_4_0.eContents().get(1);
		private final Keyword cLessThanSignHyphenMinusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cServerInstanceAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cServerInstanceMFlatComponentInstanceCrossReference_6_0 = (CrossReference)cServerInstanceAssignment_6.eContents().get(0);
		private final RuleCall cServerInstanceMFlatComponentInstanceIDTerminalRuleCall_6_0_1 = (RuleCall)cServerInstanceMFlatComponentInstanceCrossReference_6_0.eContents().get(1);
		private final Keyword cFullStopKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cServerPortAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cServerPortMServerPortCrossReference_8_0 = (CrossReference)cServerPortAssignment_8.eContents().get(0);
		private final RuleCall cServerPortMServerPortIDTerminalRuleCall_8_0_1 = (RuleCall)cServerPortMServerPortCrossReference_8_0.eContents().get(1);
		private final Keyword cUsingKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cConnectorAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final CrossReference cConnectorMConnectorCrossReference_10_0 = (CrossReference)cConnectorAssignment_10.eContents().get(0);
		private final RuleCall cConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_10_0_1 = (RuleCall)cConnectorMConnectorCrossReference_10_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cMappingKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cIfaceMappingAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final CrossReference cIfaceMappingMInterfaceMappingCrossReference_12_2_0 = (CrossReference)cIfaceMappingAssignment_12_2.eContents().get(0);
		private final RuleCall cIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_12_2_0_1 = (RuleCall)cIfaceMappingMInterfaceMappingCrossReference_12_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Assignment cAttributeValueAssignmentsAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0 = (RuleCall)cAttributeValueAssignmentsAssignment_13.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//MFlatConnection:
		//	{MFlatConnection}
		//	'connection' clientInstance=[MFlatComponentInstance] '.'
		//	clientPort=[mclevcmp::MClientPort] '<->'
		//	serverInstance=[MFlatComponentInstance] '.'
		//	serverPort=[mclevcmp::MServerPort] 'using'
		//	connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
		//	'{' ('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')?
		//	attributeValueAssignments+=MAttributeValueAssignment*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//{MFlatConnection} 'connection' clientInstance=[MFlatComponentInstance] '.' clientPort=[mclevcmp::MClientPort] '<->'
		//serverInstance=[MFlatComponentInstance] '.' serverPort=[mclevcmp::MServerPort] 'using'
		//connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] '{' ('mapping' ':='
		//ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')?
		//attributeValueAssignments+=MAttributeValueAssignment* '}' ';'
		public Group getGroup() { return cGroup; }

		//{MFlatConnection}
		public Action getMFlatConnectionAction_0() { return cMFlatConnectionAction_0; }

		//'connection'
		public Keyword getConnectionKeyword_1() { return cConnectionKeyword_1; }

		//clientInstance=[MFlatComponentInstance]
		public Assignment getClientInstanceAssignment_2() { return cClientInstanceAssignment_2; }

		//[MFlatComponentInstance]
		public CrossReference getClientInstanceMFlatComponentInstanceCrossReference_2_0() { return cClientInstanceMFlatComponentInstanceCrossReference_2_0; }

		//ID
		public RuleCall getClientInstanceMFlatComponentInstanceIDTerminalRuleCall_2_0_1() { return cClientInstanceMFlatComponentInstanceIDTerminalRuleCall_2_0_1; }

		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }

		//clientPort=[mclevcmp::MClientPort]
		public Assignment getClientPortAssignment_4() { return cClientPortAssignment_4; }

		//[mclevcmp::MClientPort]
		public CrossReference getClientPortMClientPortCrossReference_4_0() { return cClientPortMClientPortCrossReference_4_0; }

		//ID
		public RuleCall getClientPortMClientPortIDTerminalRuleCall_4_0_1() { return cClientPortMClientPortIDTerminalRuleCall_4_0_1; }

		//'<->'
		public Keyword getLessThanSignHyphenMinusGreaterThanSignKeyword_5() { return cLessThanSignHyphenMinusGreaterThanSignKeyword_5; }

		//serverInstance=[MFlatComponentInstance]
		public Assignment getServerInstanceAssignment_6() { return cServerInstanceAssignment_6; }

		//[MFlatComponentInstance]
		public CrossReference getServerInstanceMFlatComponentInstanceCrossReference_6_0() { return cServerInstanceMFlatComponentInstanceCrossReference_6_0; }

		//ID
		public RuleCall getServerInstanceMFlatComponentInstanceIDTerminalRuleCall_6_0_1() { return cServerInstanceMFlatComponentInstanceIDTerminalRuleCall_6_0_1; }

		//'.'
		public Keyword getFullStopKeyword_7() { return cFullStopKeyword_7; }

		//serverPort=[mclevcmp::MServerPort]
		public Assignment getServerPortAssignment_8() { return cServerPortAssignment_8; }

		//[mclevcmp::MServerPort]
		public CrossReference getServerPortMServerPortCrossReference_8_0() { return cServerPortMServerPortCrossReference_8_0; }

		//ID
		public RuleCall getServerPortMServerPortIDTerminalRuleCall_8_0_1() { return cServerPortMServerPortIDTerminalRuleCall_8_0_1; }

		//'using'
		public Keyword getUsingKeyword_9() { return cUsingKeyword_9; }

		//connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
		public Assignment getConnectorAssignment_10() { return cConnectorAssignment_10; }

		//[mclevdom::MConnector|VersionedQualifiedReferenceName]
		public CrossReference getConnectorMConnectorCrossReference_10_0() { return cConnectorMConnectorCrossReference_10_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_10_0_1() { return cConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_10_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_11() { return cLeftCurlyBracketKeyword_11; }

		//('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')?
		public Group getGroup_12() { return cGroup_12; }

		//'mapping'
		public Keyword getMappingKeyword_12_0() { return cMappingKeyword_12_0; }

		//':='
		public Keyword getColonEqualsSignKeyword_12_1() { return cColonEqualsSignKeyword_12_1; }

		//ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName]
		public Assignment getIfaceMappingAssignment_12_2() { return cIfaceMappingAssignment_12_2; }

		//[mclevimap::MInterfaceMapping|VersionedQualifiedName]
		public CrossReference getIfaceMappingMInterfaceMappingCrossReference_12_2_0() { return cIfaceMappingMInterfaceMappingCrossReference_12_2_0; }

		//VersionedQualifiedName
		public RuleCall getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_12_2_0_1() { return cIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_12_2_0_1; }

		//';'
		public Keyword getSemicolonKeyword_12_3() { return cSemicolonKeyword_12_3; }

		//attributeValueAssignments+=MAttributeValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_13() { return cAttributeValueAssignmentsAssignment_13; }

		//MAttributeValueAssignment
		public RuleCall getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0() { return cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }

		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}

	public class MFlatComponentInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatComponentInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMFlatComponentInstanceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInstanceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cComponentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cComponentMComponentCrossReference_2_0 = (CrossReference)cComponentAssignment_2.eContents().get(0);
		private final RuleCall cComponentMComponentVersionedQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cComponentMComponentCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAttributeValueAssignmentsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0 = (RuleCall)cAttributeValueAssignmentsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MFlatComponentInstance:
		//	{MFlatComponentInstance}
		//	'instance'
		//	component=[mclevcmp::MComponent|VersionedQualifiedName] name=ID
		//	'{'
		//	attributeValueAssignments+=MAttributeValueAssignment*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//{MFlatComponentInstance} 'instance' component=[mclevcmp::MComponent|VersionedQualifiedName] name=ID '{'
		//attributeValueAssignments+=MAttributeValueAssignment* '}' ';'
		public Group getGroup() { return cGroup; }

		//{MFlatComponentInstance}
		public Action getMFlatComponentInstanceAction_0() { return cMFlatComponentInstanceAction_0; }

		//'instance'
		public Keyword getInstanceKeyword_1() { return cInstanceKeyword_1; }

		//component=[mclevcmp::MComponent|VersionedQualifiedName]
		public Assignment getComponentAssignment_2() { return cComponentAssignment_2; }

		//[mclevcmp::MComponent|VersionedQualifiedName]
		public CrossReference getComponentMComponentCrossReference_2_0() { return cComponentMComponentCrossReference_2_0; }

		//VersionedQualifiedName
		public RuleCall getComponentMComponentVersionedQualifiedNameParserRuleCall_2_0_1() { return cComponentMComponentVersionedQualifiedNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//attributeValueAssignments+=MAttributeValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_5() { return cAttributeValueAssignmentsAssignment_5; }

		//MAttributeValueAssignment
		public RuleCall getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0() { return cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MFlatServiceLibraryInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatServiceLibraryInstance");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMRegularFlatServiceLibraryInstanceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMFlatDriverSLibInstanceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MFlatServiceLibraryInstance:
		//	MRegularFlatServiceLibraryInstance | MFlatDriverSLibInstance;
		@Override public ParserRule getRule() { return rule; }

		//MRegularFlatServiceLibraryInstance | MFlatDriverSLibInstance
		public Alternatives getAlternatives() { return cAlternatives; }

		//MRegularFlatServiceLibraryInstance
		public RuleCall getMRegularFlatServiceLibraryInstanceParserRuleCall_0() { return cMRegularFlatServiceLibraryInstanceParserRuleCall_0; }

		//MFlatDriverSLibInstance
		public RuleCall getMFlatDriverSLibInstanceParserRuleCall_1() { return cMFlatDriverSLibInstanceParserRuleCall_1; }
	}

	public class MRegularFlatServiceLibraryInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MRegularFlatServiceLibraryInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLibraryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLibraryAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cLibraryMServiceLibraryCrossReference_1_0 = (CrossReference)cLibraryAssignment_1.eContents().get(0);
		private final RuleCall cLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cLibraryMServiceLibraryCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributeValueAssignmentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0 = (RuleCall)cAttributeValueAssignmentsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MRegularFlatServiceLibraryInstance MFlatServiceLibraryInstance:
		//	'library'
		//	library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
		//	'{'
		//	attributeValueAssignments+=MAttributeValueAssignment*
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }

		//'library' library=[mclevslib::MServiceLibrary|VersionedQualifiedName] '{'
		//attributeValueAssignments+=MAttributeValueAssignment* '}' ';'
		public Group getGroup() { return cGroup; }

		//'library'
		public Keyword getLibraryKeyword_0() { return cLibraryKeyword_0; }

		//library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
		public Assignment getLibraryAssignment_1() { return cLibraryAssignment_1; }

		//[mclevslib::MServiceLibrary|VersionedQualifiedName]
		public CrossReference getLibraryMServiceLibraryCrossReference_1_0() { return cLibraryMServiceLibraryCrossReference_1_0; }

		//VersionedQualifiedName
		public RuleCall getLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_1_0_1() { return cLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//attributeValueAssignments+=MAttributeValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_3() { return cAttributeValueAssignmentsAssignment_3; }

		//MAttributeValueAssignment
		public RuleCall getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0() { return cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MFlatDriverSLibInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatDriverSLibInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMFlatDriverSLibInstanceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDriverKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLibraryAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cLibraryMServiceLibraryCrossReference_2_0 = (CrossReference)cLibraryAssignment_2.eContents().get(0);
		private final RuleCall cLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cLibraryMServiceLibraryCrossReference_2_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cAttributeKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cValuesKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_0_2 = (Keyword)cGroup_4_0.eContents().get(2);
		private final Assignment cAttributeValueAssignmentsAssignment_4_0_3 = (Assignment)cGroup_4_0.eContents().get(3);
		private final RuleCall cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0 = (RuleCall)cAttributeValueAssignmentsAssignment_4_0_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_0_4 = (Keyword)cGroup_4_0.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_0_5 = (Keyword)cGroup_4_0.eContents().get(5);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cDeviceKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cMappingsKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_1_2 = (Keyword)cGroup_4_1.eContents().get(2);
		private final Assignment cDeviceDriverMappingsAssignment_4_1_3 = (Assignment)cGroup_4_1.eContents().get(3);
		private final RuleCall cDeviceDriverMappingsMFlatDeviceDriverMappingParserRuleCall_4_1_3_0 = (RuleCall)cDeviceDriverMappingsAssignment_4_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_1_4 = (Keyword)cGroup_4_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_1_5 = (Keyword)cGroup_4_1.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MFlatDriverSLibInstance:
		//	{MFlatDriverSLibInstance}
		//	'driver'
		//	library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
		//	'{' (('attribute' 'values'
		//	'{'
		//	attributeValueAssignments+=MAttributeValueAssignment+
		//	'}' ';')?
		//	& ('device' 'mappings' '{'
		//	deviceDriverMappings+=MFlatDeviceDriverMapping+
		//	'}' ';')?)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }

		//{MFlatDriverSLibInstance} 'driver' library=[mclevslib::MServiceLibrary|VersionedQualifiedName] '{' (('attribute'
		//'values' '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')? & ('device' 'mappings' '{'
		//deviceDriverMappings+=MFlatDeviceDriverMapping+ '}' ';')?) '}' ';'
		public Group getGroup() { return cGroup; }

		//{MFlatDriverSLibInstance}
		public Action getMFlatDriverSLibInstanceAction_0() { return cMFlatDriverSLibInstanceAction_0; }

		//'driver'
		public Keyword getDriverKeyword_1() { return cDriverKeyword_1; }

		//library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
		public Assignment getLibraryAssignment_2() { return cLibraryAssignment_2; }

		//[mclevslib::MServiceLibrary|VersionedQualifiedName]
		public CrossReference getLibraryMServiceLibraryCrossReference_2_0() { return cLibraryMServiceLibraryCrossReference_2_0; }

		//VersionedQualifiedName
		public RuleCall getLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_2_0_1() { return cLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_2_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//(('attribute' 'values' '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')? & ('device' 'mappings' '{'
		//deviceDriverMappings+=MFlatDeviceDriverMapping+ '}' ';')?)
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//('attribute' 'values' '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')?
		public Group getGroup_4_0() { return cGroup_4_0; }

		//'attribute'
		public Keyword getAttributeKeyword_4_0_0() { return cAttributeKeyword_4_0_0; }

		//'values'
		public Keyword getValuesKeyword_4_0_1() { return cValuesKeyword_4_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_0_2() { return cLeftCurlyBracketKeyword_4_0_2; }

		//attributeValueAssignments+=MAttributeValueAssignment+
		public Assignment getAttributeValueAssignmentsAssignment_4_0_3() { return cAttributeValueAssignmentsAssignment_4_0_3; }

		//MAttributeValueAssignment
		public RuleCall getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0() { return cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_0_4() { return cRightCurlyBracketKeyword_4_0_4; }

		//';'
		public Keyword getSemicolonKeyword_4_0_5() { return cSemicolonKeyword_4_0_5; }

		//('device' 'mappings' '{' deviceDriverMappings+=MFlatDeviceDriverMapping+ '}' ';')?
		public Group getGroup_4_1() { return cGroup_4_1; }

		//'device'
		public Keyword getDeviceKeyword_4_1_0() { return cDeviceKeyword_4_1_0; }

		//'mappings'
		public Keyword getMappingsKeyword_4_1_1() { return cMappingsKeyword_4_1_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1_2() { return cLeftCurlyBracketKeyword_4_1_2; }

		//deviceDriverMappings+=MFlatDeviceDriverMapping+
		public Assignment getDeviceDriverMappingsAssignment_4_1_3() { return cDeviceDriverMappingsAssignment_4_1_3; }

		//MFlatDeviceDriverMapping
		public RuleCall getDeviceDriverMappingsMFlatDeviceDriverMappingParserRuleCall_4_1_3_0() { return cDeviceDriverMappingsMFlatDeviceDriverMappingParserRuleCall_4_1_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4_1_4() { return cRightCurlyBracketKeyword_4_1_4; }

		//';'
		public Keyword getSemicolonKeyword_4_1_5() { return cSemicolonKeyword_4_1_5; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MFlatDeviceDriverMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MFlatDeviceDriverMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSupportedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cDeviceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSupportedDeviceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0 = (CrossReference)cSupportedDeviceAssignment_2.eContents().get(0);
		private final RuleCall cSupportedDeviceMDriverSLibSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cDeployedKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cDeviceKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDeployedDeviceAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cDeployedDeviceMDeployedDeviceCrossReference_6_0 = (CrossReference)cDeployedDeviceAssignment_6.eContents().get(0);
		private final RuleCall cDeployedDeviceMDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1 = (RuleCall)cDeployedDeviceMDeployedDeviceCrossReference_6_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MFlatDeviceDriverMapping:
		//	'supported' 'device' supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName]
		//	'->'
		//	'deployed' 'device' deployedDevice=[mclevmcad::MDeployedDevice|VersionedQualifiedReferenceName] ';';
		@Override public ParserRule getRule() { return rule; }

		//'supported' 'device' supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName] '->'
		//'deployed' 'device' deployedDevice=[mclevmcad::MDeployedDevice|VersionedQualifiedReferenceName] ';'
		public Group getGroup() { return cGroup; }

		//'supported'
		public Keyword getSupportedKeyword_0() { return cSupportedKeyword_0; }

		//'device'
		public Keyword getDeviceKeyword_1() { return cDeviceKeyword_1; }

		//supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName]
		public Assignment getSupportedDeviceAssignment_2() { return cSupportedDeviceAssignment_2; }

		//[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName]
		public CrossReference getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0() { return cSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getSupportedDeviceMDriverSLibSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cSupportedDeviceMDriverSLibSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_3() { return cHyphenMinusGreaterThanSignKeyword_3; }

		//'deployed'
		public Keyword getDeployedKeyword_4() { return cDeployedKeyword_4; }

		//'device'
		public Keyword getDeviceKeyword_5() { return cDeviceKeyword_5; }

		//deployedDevice=[mclevmcad::MDeployedDevice|VersionedQualifiedReferenceName]
		public Assignment getDeployedDeviceAssignment_6() { return cDeployedDeviceAssignment_6; }

		//[mclevmcad::MDeployedDevice|VersionedQualifiedReferenceName]
		public CrossReference getDeployedDeviceMDeployedDeviceCrossReference_6_0() { return cDeployedDeviceMDeployedDeviceCrossReference_6_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getDeployedDeviceMDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1() { return cDeployedDeviceMDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1; }

		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MAttributeValueAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MAttributeValueAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAttributeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParameterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParameterMParameterCrossReference_1_0 = (CrossReference)cParameterAssignment_1.eContents().get(0);
		private final RuleCall cParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1 = (RuleCall)cParameterMParameterCrossReference_1_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cParameterValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MAttributeValueAssignment common::MParameterValueAssignmentSingleExpression:
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

	public class MParameterValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValue");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueBooleanLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueStringLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueIntegerLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueRealLiteral");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueRefObject");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValuePAR");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueExpression");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueTERM");
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

	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.EBoolean");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.INTEGER");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.REAL");
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
	
	
	public class MParameterValueExpressionOperatorsElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueExpressionOperators");
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
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.MParameterValueTERMOperators");
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
	
	private final MMCLEVFLATMCADPackageFileElements pMMCLEVFLATMCADPackageFile;
	private final MMCLEVFLATMCADPackageElementElements pMMCLEVFLATMCADPackageElement;
	private final MFlatMCADElements pMFlatMCAD;
	private final MFlatMCADTargetElements pMFlatMCADTarget;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final MFlatConnectionElements pMFlatConnection;
	private final MFlatComponentInstanceElements pMFlatComponentInstance;
	private final MFlatServiceLibraryInstanceElements pMFlatServiceLibraryInstance;
	private final MRegularFlatServiceLibraryInstanceElements pMRegularFlatServiceLibraryInstance;
	private final MFlatDriverSLibInstanceElements pMFlatDriverSLibInstance;
	private final MFlatDeviceDriverMappingElements pMFlatDeviceDriverMapping;
	private final MAttributeValueAssignmentElements pMAttributeValueAssignment;
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
	private final EBooleanElements pEBoolean;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	private final REALElements pREAL;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FLATMCADGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMMCLEVFLATMCADPackageFile = new MMCLEVFLATMCADPackageFileElements();
		this.pMMCLEVFLATMCADPackageElement = new MMCLEVFLATMCADPackageElementElements();
		this.pMFlatMCAD = new MFlatMCADElements();
		this.pMFlatMCADTarget = new MFlatMCADTargetElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.pMFlatConnection = new MFlatConnectionElements();
		this.pMFlatComponentInstance = new MFlatComponentInstanceElements();
		this.pMFlatServiceLibraryInstance = new MFlatServiceLibraryInstanceElements();
		this.pMRegularFlatServiceLibraryInstance = new MRegularFlatServiceLibraryInstanceElements();
		this.pMFlatDriverSLibInstance = new MFlatDriverSLibInstanceElements();
		this.pMFlatDeviceDriverMapping = new MFlatDeviceDriverMappingElements();
		this.pMAttributeValueAssignment = new MAttributeValueAssignmentElements();
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
		this.pEBoolean = new EBooleanElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.micobs.mclev.lang.FLATMCAD.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
		this.pREAL = new REALElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mclev.lang.FLATMCAD".equals(grammar.getName())) {
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

	
	//MMCLEVFLATMCADPackageFile:
	//	'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
	//	imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ';')*
	//	element=MMCLEVFLATMCADPackageElement;
	public MMCLEVFLATMCADPackageFileElements getMMCLEVFLATMCADPackageFileAccess() {
		return pMMCLEVFLATMCADPackageFile;
	}
	
	public ParserRule getMMCLEVFLATMCADPackageFileRule() {
		return getMMCLEVFLATMCADPackageFileAccess().getRule();
	}

	//MMCLEVFLATMCADPackageElement:
	//	MFlatMCAD;
	public MMCLEVFLATMCADPackageElementElements getMMCLEVFLATMCADPackageElementAccess() {
		return pMMCLEVFLATMCADPackageElement;
	}
	
	public ParserRule getMMCLEVFLATMCADPackageElementRule() {
		return getMMCLEVFLATMCADPackageElementAccess().getRule();
	}

	//MFlatMCAD:
	//	'flat' 'mcad'
	//	name=ID
	//	'{' ('version' ':=' version=Version ';' & 'deployment' 'project' ':='
	//	referencedElement=[mclevmcad::MMCADeployment|VersionedQualifiedName] ';' & 'deployment' 'targets' '{'
	//	targets+=MFlatMCADTarget+
	//	'}' ';')
	//	'}' ';';
	public MFlatMCADElements getMFlatMCADAccess() {
		return pMFlatMCAD;
	}
	
	public ParserRule getMFlatMCADRule() {
		return getMFlatMCADAccess().getRule();
	}

	//MFlatMCADTarget:
	//	'target' ('platform' deploymentPlatform=[mclevmcad::MDeploymentPlatform] & ('alternative'
	//	leafDeploymentAlternative=[mclevmcad::MDeploymentAlternative|VersionedQualifiedReferenceName])?)
	//	'{' (('attribute' 'values'
	//	'{'
	//	attributeValueAssignments+=MAttributeValueAssignment+
	//	'}' ';')?
	//	& ('components'
	//	'{'
	//	components+=MFlatComponentInstance+
	//	'}' ';')?
	//	& ('connections'
	//	'{'
	//	connections+=MFlatConnection+
	//	'}' ';')?
	//	& ('libraries'
	//	'{'
	//	libraries+=MFlatServiceLibraryInstance+
	//	'}' ';')?)
	//	'}' ';';
	public MFlatMCADTargetElements getMFlatMCADTargetAccess() {
		return pMFlatMCADTarget;
	}
	
	public ParserRule getMFlatMCADTargetRule() {
		return getMFlatMCADTargetAccess().getRule();
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

	//MFlatConnection:
	//	{MFlatConnection}
	//	'connection' clientInstance=[MFlatComponentInstance] '.'
	//	clientPort=[mclevcmp::MClientPort] '<->'
	//	serverInstance=[MFlatComponentInstance] '.'
	//	serverPort=[mclevcmp::MServerPort] 'using'
	//	connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
	//	'{' ('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')?
	//	attributeValueAssignments+=MAttributeValueAssignment*
	//	'}' ';';
	public MFlatConnectionElements getMFlatConnectionAccess() {
		return pMFlatConnection;
	}
	
	public ParserRule getMFlatConnectionRule() {
		return getMFlatConnectionAccess().getRule();
	}

	//MFlatComponentInstance:
	//	{MFlatComponentInstance}
	//	'instance'
	//	component=[mclevcmp::MComponent|VersionedQualifiedName] name=ID
	//	'{'
	//	attributeValueAssignments+=MAttributeValueAssignment*
	//	'}' ';';
	public MFlatComponentInstanceElements getMFlatComponentInstanceAccess() {
		return pMFlatComponentInstance;
	}
	
	public ParserRule getMFlatComponentInstanceRule() {
		return getMFlatComponentInstanceAccess().getRule();
	}

	//MFlatServiceLibraryInstance:
	//	MRegularFlatServiceLibraryInstance | MFlatDriverSLibInstance;
	public MFlatServiceLibraryInstanceElements getMFlatServiceLibraryInstanceAccess() {
		return pMFlatServiceLibraryInstance;
	}
	
	public ParserRule getMFlatServiceLibraryInstanceRule() {
		return getMFlatServiceLibraryInstanceAccess().getRule();
	}

	//MRegularFlatServiceLibraryInstance MFlatServiceLibraryInstance:
	//	'library'
	//	library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
	//	'{'
	//	attributeValueAssignments+=MAttributeValueAssignment*
	//	'}' ';'
	public MRegularFlatServiceLibraryInstanceElements getMRegularFlatServiceLibraryInstanceAccess() {
		return pMRegularFlatServiceLibraryInstance;
	}
	
	public ParserRule getMRegularFlatServiceLibraryInstanceRule() {
		return getMRegularFlatServiceLibraryInstanceAccess().getRule();
	}

	//MFlatDriverSLibInstance:
	//	{MFlatDriverSLibInstance}
	//	'driver'
	//	library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
	//	'{' (('attribute' 'values'
	//	'{'
	//	attributeValueAssignments+=MAttributeValueAssignment+
	//	'}' ';')?
	//	& ('device' 'mappings' '{'
	//	deviceDriverMappings+=MFlatDeviceDriverMapping+
	//	'}' ';')?)
	//	'}' ';';
	public MFlatDriverSLibInstanceElements getMFlatDriverSLibInstanceAccess() {
		return pMFlatDriverSLibInstance;
	}
	
	public ParserRule getMFlatDriverSLibInstanceRule() {
		return getMFlatDriverSLibInstanceAccess().getRule();
	}

	//MFlatDeviceDriverMapping:
	//	'supported' 'device' supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName]
	//	'->'
	//	'deployed' 'device' deployedDevice=[mclevmcad::MDeployedDevice|VersionedQualifiedReferenceName] ';';
	public MFlatDeviceDriverMappingElements getMFlatDeviceDriverMappingAccess() {
		return pMFlatDeviceDriverMapping;
	}
	
	public ParserRule getMFlatDeviceDriverMappingRule() {
		return getMFlatDeviceDriverMappingAccess().getRule();
	}

	//MAttributeValueAssignment common::MParameterValueAssignmentSingleExpression:
	//	'attribute'
	//	parameter=[common::MParameter|VersionedQualifiedReferenceName]
	//	':='
	//	parameterValue=MParameterValueExpression ';'
	public MAttributeValueAssignmentElements getMAttributeValueAssignmentAccess() {
		return pMAttributeValueAssignment;
	}
	
	public ParserRule getMAttributeValueAssignmentRule() {
		return getMAttributeValueAssignmentAccess().getRule();
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
