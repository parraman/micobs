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
public class MCADGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMCLEVMCADPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMCLEVMCADPackageFile");
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
		private final RuleCall cElementMMCLEVMCADPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMCLEVMCADPackageFile:
		//	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
		//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVMCADPackageElement;
		public ParserRule getRule() { return rule; }

		//"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
		//imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVMCADPackageElement
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

		//element=MMCLEVMCADPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMCLEVMCADPackageElement
		public RuleCall getElementMMCLEVMCADPackageElementParserRuleCall_4_0() { return cElementMMCLEVMCADPackageElementParserRuleCall_4_0; }
	}

	public class MMCLEVMCADPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMCLEVMCADPackageElement");
		private final RuleCall cMMCADeploymentParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MMCLEVMCADPackageElement:
		//	MMCADeployment;
		public ParserRule getRule() { return rule; }

		//MMCADeployment
		public RuleCall getMMCADeploymentParserRuleCall() { return cMMCADeploymentParserRuleCall; }
	}

	public class MMCADeploymentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMCADeployment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeploymentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cProjectKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDomainAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cDomainMDomainCrossReference_2_0 = (CrossReference)cDomainAssignment_2.eContents().get(0);
		private final RuleCall cDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cDomainMDomainCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cVersionKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cVersionAssignment_5_0_2 = (Assignment)cGroup_5_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_5_0_2_0 = (RuleCall)cVersionAssignment_5_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_5_0_3 = (Keyword)cGroup_5_0.eContents().get(3);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cAttributeKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cValuesKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_1_2 = (Keyword)cGroup_5_1.eContents().get(2);
		private final Assignment cAttributeValueAssignmentsAssignment_5_1_3 = (Assignment)cGroup_5_1.eContents().get(3);
		private final RuleCall cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0 = (RuleCall)cAttributeValueAssignmentsAssignment_5_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_1_4 = (Keyword)cGroup_5_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_1_5 = (Keyword)cGroup_5_1.eContents().get(5);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cDeploymentKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Keyword cPlatformsKeyword_5_2_1 = (Keyword)cGroup_5_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_2_2 = (Keyword)cGroup_5_2.eContents().get(2);
		private final Assignment cDeploymentPlatformsAssignment_5_2_3 = (Assignment)cGroup_5_2.eContents().get(3);
		private final RuleCall cDeploymentPlatformsMDeploymentPlatformParserRuleCall_5_2_3_0 = (RuleCall)cDeploymentPlatformsAssignment_5_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_2_4 = (Keyword)cGroup_5_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_2_5 = (Keyword)cGroup_5_2.eContents().get(5);
		private final Group cGroup_5_3 = (Group)cUnorderedGroup_5.eContents().get(3);
		private final Keyword cDeploymentKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Keyword cAlternativesKeyword_5_3_1 = (Keyword)cGroup_5_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_3_2 = (Keyword)cGroup_5_3.eContents().get(2);
		private final Assignment cDeploymentAlternativesAssignment_5_3_3 = (Assignment)cGroup_5_3.eContents().get(3);
		private final RuleCall cDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_3_3_0 = (RuleCall)cDeploymentAlternativesAssignment_5_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3_4 = (Keyword)cGroup_5_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_3_5 = (Keyword)cGroup_5_3.eContents().get(5);
		private final Group cGroup_5_4 = (Group)cUnorderedGroup_5.eContents().get(4);
		private final Keyword cComponentsKeyword_5_4_0 = (Keyword)cGroup_5_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_4_1 = (Keyword)cGroup_5_4.eContents().get(1);
		private final Assignment cComponentsAssignment_5_4_2 = (Assignment)cGroup_5_4.eContents().get(2);
		private final RuleCall cComponentsMComponentInstanceParserRuleCall_5_4_2_0 = (RuleCall)cComponentsAssignment_5_4_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4_3 = (Keyword)cGroup_5_4.eContents().get(3);
		private final Keyword cSemicolonKeyword_5_4_4 = (Keyword)cGroup_5_4.eContents().get(4);
		private final Group cGroup_5_5 = (Group)cUnorderedGroup_5.eContents().get(5);
		private final Keyword cConnectionsKeyword_5_5_0 = (Keyword)cGroup_5_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_5_1 = (Keyword)cGroup_5_5.eContents().get(1);
		private final Assignment cConnectionsAssignment_5_5_2 = (Assignment)cGroup_5_5.eContents().get(2);
		private final RuleCall cConnectionsMConnectionParserRuleCall_5_5_2_0 = (RuleCall)cConnectionsAssignment_5_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_5_3 = (Keyword)cGroup_5_5.eContents().get(3);
		private final Keyword cSemicolonKeyword_5_5_4 = (Keyword)cGroup_5_5.eContents().get(4);
		private final Group cGroup_5_6 = (Group)cUnorderedGroup_5.eContents().get(6);
		private final Keyword cLibrariesKeyword_5_6_0 = (Keyword)cGroup_5_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_6_1 = (Keyword)cGroup_5_6.eContents().get(1);
		private final Assignment cLibrariesAssignment_5_6_2 = (Assignment)cGroup_5_6.eContents().get(2);
		private final RuleCall cLibrariesMServiceLibraryInstanceParserRuleCall_5_6_2_0 = (RuleCall)cLibrariesAssignment_5_6_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_6_3 = (Keyword)cGroup_5_6.eContents().get(3);
		private final Keyword cSemicolonKeyword_5_6_4 = (Keyword)cGroup_5_6.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MMCADeployment:
		//	"deployment" "project" domain=[mclevdom::MDomain|VersionedQualifiedName] name=ID "{" ("version" ":=" version=Version
		//	";" & ("attribute" "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("deployment"
		//	"platforms" "{" deploymentPlatforms+=MDeploymentPlatform+ "}" ";")? & ("deployment" "alternatives" "{"
		//	deploymentAlternatives+=MDeploymentAlternative+ "}" ";")? & ("components" "{" components+=MComponentInstance+ "}"
		//	";")? & ("connections" "{" connections+=MConnection+ "}" ";")? & ("libraries" "{" libraries+=MServiceLibraryInstance+
		//	"}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"deployment" "project" domain=[mclevdom::MDomain|VersionedQualifiedName] name=ID "{" ("version" ":=" version=Version ";"
		//& ("attribute" "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("deployment" "platforms"
		//"{" deploymentPlatforms+=MDeploymentPlatform+ "}" ";")? & ("deployment" "alternatives" "{"
		//deploymentAlternatives+=MDeploymentAlternative+ "}" ";")? & ("components" "{" components+=MComponentInstance+ "}" ";")?
		//& ("connections" "{" connections+=MConnection+ "}" ";")? & ("libraries" "{" libraries+=MServiceLibraryInstance+ "}"
		//";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"deployment"
		public Keyword getDeploymentKeyword_0() { return cDeploymentKeyword_0; }

		//"project"
		public Keyword getProjectKeyword_1() { return cProjectKeyword_1; }

		//domain=[mclevdom::MDomain|VersionedQualifiedName]
		public Assignment getDomainAssignment_2() { return cDomainAssignment_2; }

		//[mclevdom::MDomain|VersionedQualifiedName]
		public CrossReference getDomainMDomainCrossReference_2_0() { return cDomainMDomainCrossReference_2_0; }

		//VersionedQualifiedName
		public RuleCall getDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1() { return cDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//"version" ":=" version=Version ";" & ("attribute" "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}"
		//";")? & ("deployment" "platforms" "{" deploymentPlatforms+=MDeploymentPlatform+ "}" ";")? & ("deployment"
		//"alternatives" "{" deploymentAlternatives+=MDeploymentAlternative+ "}" ";")? & ("components" "{"
		//components+=MComponentInstance+ "}" ";")? & ("connections" "{" connections+=MConnection+ "}" ";")? & ("libraries" "{"
		//libraries+=MServiceLibraryInstance+ "}" ";")?
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

		//("attribute" "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")?
		public Group getGroup_5_1() { return cGroup_5_1; }

		//"attribute"
		public Keyword getAttributeKeyword_5_1_0() { return cAttributeKeyword_5_1_0; }

		//"values"
		public Keyword getValuesKeyword_5_1_1() { return cValuesKeyword_5_1_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_1_2() { return cLeftCurlyBracketKeyword_5_1_2; }

		//attributeValueAssignments+=MAttributeValueAssignment+
		public Assignment getAttributeValueAssignmentsAssignment_5_1_3() { return cAttributeValueAssignmentsAssignment_5_1_3; }

		//MAttributeValueAssignment
		public RuleCall getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0() { return cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_1_4() { return cRightCurlyBracketKeyword_5_1_4; }

		//";"
		public Keyword getSemicolonKeyword_5_1_5() { return cSemicolonKeyword_5_1_5; }

		//("deployment" "platforms" "{" deploymentPlatforms+=MDeploymentPlatform+ "}" ";")?
		public Group getGroup_5_2() { return cGroup_5_2; }

		//"deployment"
		public Keyword getDeploymentKeyword_5_2_0() { return cDeploymentKeyword_5_2_0; }

		//"platforms"
		public Keyword getPlatformsKeyword_5_2_1() { return cPlatformsKeyword_5_2_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_2_2() { return cLeftCurlyBracketKeyword_5_2_2; }

		//deploymentPlatforms+=MDeploymentPlatform+
		public Assignment getDeploymentPlatformsAssignment_5_2_3() { return cDeploymentPlatformsAssignment_5_2_3; }

		//MDeploymentPlatform
		public RuleCall getDeploymentPlatformsMDeploymentPlatformParserRuleCall_5_2_3_0() { return cDeploymentPlatformsMDeploymentPlatformParserRuleCall_5_2_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_2_4() { return cRightCurlyBracketKeyword_5_2_4; }

		//";"
		public Keyword getSemicolonKeyword_5_2_5() { return cSemicolonKeyword_5_2_5; }

		//("deployment" "alternatives" "{" deploymentAlternatives+=MDeploymentAlternative+ "}" ";")?
		public Group getGroup_5_3() { return cGroup_5_3; }

		//"deployment"
		public Keyword getDeploymentKeyword_5_3_0() { return cDeploymentKeyword_5_3_0; }

		//"alternatives"
		public Keyword getAlternativesKeyword_5_3_1() { return cAlternativesKeyword_5_3_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_3_2() { return cLeftCurlyBracketKeyword_5_3_2; }

		//deploymentAlternatives+=MDeploymentAlternative+
		public Assignment getDeploymentAlternativesAssignment_5_3_3() { return cDeploymentAlternativesAssignment_5_3_3; }

		//MDeploymentAlternative
		public RuleCall getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_3_3_0() { return cDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_3_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_3_4() { return cRightCurlyBracketKeyword_5_3_4; }

		//";"
		public Keyword getSemicolonKeyword_5_3_5() { return cSemicolonKeyword_5_3_5; }

		//("components" "{" components+=MComponentInstance+ "}" ";")?
		public Group getGroup_5_4() { return cGroup_5_4; }

		//"components"
		public Keyword getComponentsKeyword_5_4_0() { return cComponentsKeyword_5_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_4_1() { return cLeftCurlyBracketKeyword_5_4_1; }

		//components+=MComponentInstance+
		public Assignment getComponentsAssignment_5_4_2() { return cComponentsAssignment_5_4_2; }

		//MComponentInstance
		public RuleCall getComponentsMComponentInstanceParserRuleCall_5_4_2_0() { return cComponentsMComponentInstanceParserRuleCall_5_4_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_4_3() { return cRightCurlyBracketKeyword_5_4_3; }

		//";"
		public Keyword getSemicolonKeyword_5_4_4() { return cSemicolonKeyword_5_4_4; }

		//("connections" "{" connections+=MConnection+ "}" ";")?
		public Group getGroup_5_5() { return cGroup_5_5; }

		//"connections"
		public Keyword getConnectionsKeyword_5_5_0() { return cConnectionsKeyword_5_5_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_5_1() { return cLeftCurlyBracketKeyword_5_5_1; }

		//connections+=MConnection+
		public Assignment getConnectionsAssignment_5_5_2() { return cConnectionsAssignment_5_5_2; }

		//MConnection
		public RuleCall getConnectionsMConnectionParserRuleCall_5_5_2_0() { return cConnectionsMConnectionParserRuleCall_5_5_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_5_3() { return cRightCurlyBracketKeyword_5_5_3; }

		//";"
		public Keyword getSemicolonKeyword_5_5_4() { return cSemicolonKeyword_5_5_4; }

		//("libraries" "{" libraries+=MServiceLibraryInstance+ "}" ";")?
		public Group getGroup_5_6() { return cGroup_5_6; }

		//"libraries"
		public Keyword getLibrariesKeyword_5_6_0() { return cLibrariesKeyword_5_6_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_6_1() { return cLeftCurlyBracketKeyword_5_6_1; }

		//libraries+=MServiceLibraryInstance+
		public Assignment getLibrariesAssignment_5_6_2() { return cLibrariesAssignment_5_6_2; }

		//MServiceLibraryInstance
		public RuleCall getLibrariesMServiceLibraryInstanceParserRuleCall_5_6_2_0() { return cLibrariesMServiceLibraryInstanceParserRuleCall_5_6_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_6_3() { return cRightCurlyBracketKeyword_5_6_3; }

		//";"
		public Keyword getSemicolonKeyword_5_6_4() { return cSemicolonKeyword_5_6_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MConnection");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMCommonConnectionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMConnectionSwitchParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MConnection:
		//	MCommonConnection | MConnectionSwitch;
		public ParserRule getRule() { return rule; }

		//MCommonConnection | MConnectionSwitch
		public Alternatives getAlternatives() { return cAlternatives; }

		//MCommonConnection
		public RuleCall getMCommonConnectionParserRuleCall_0() { return cMCommonConnectionParserRuleCall_0; }

		//MConnectionSwitch
		public RuleCall getMConnectionSwitchParserRuleCall_1() { return cMConnectionSwitchParserRuleCall_1; }
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

	public class MCommonConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MCommonConnection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMCommonConnectionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cConnectionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cClientInstanceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cClientInstanceMComponentInstanceCrossReference_2_0 = (CrossReference)cClientInstanceAssignment_2.eContents().get(0);
		private final RuleCall cClientInstanceMComponentInstanceIDTerminalRuleCall_2_0_1 = (RuleCall)cClientInstanceMComponentInstanceCrossReference_2_0.eContents().get(1);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cClientPortAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cClientPortMClientPortCrossReference_4_0 = (CrossReference)cClientPortAssignment_4.eContents().get(0);
		private final RuleCall cClientPortMClientPortIDTerminalRuleCall_4_0_1 = (RuleCall)cClientPortMClientPortCrossReference_4_0.eContents().get(1);
		private final Keyword cLessThanSignHyphenMinusGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cServerInstanceAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cServerInstanceMComponentInstanceCrossReference_6_0 = (CrossReference)cServerInstanceAssignment_6.eContents().get(0);
		private final RuleCall cServerInstanceMComponentInstanceIDTerminalRuleCall_6_0_1 = (RuleCall)cServerInstanceMComponentInstanceCrossReference_6_0.eContents().get(1);
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
		
		//MCommonConnection:
		//	{MCommonConnection} "connection" clientInstance=[MComponentInstance] "." clientPort=[mclevcmp::MClientPort] "<->"
		//	serverInstance=[MComponentInstance] "." serverPort=[mclevcmp::MServerPort] "using"
		//	connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{" ("mapping" ":="
		//	ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
		//	attributeValueAssignments+=MAttributeValueAssignment* "}" ";";
		public ParserRule getRule() { return rule; }

		//{MCommonConnection} "connection" clientInstance=[MComponentInstance] "." clientPort=[mclevcmp::MClientPort] "<->"
		//serverInstance=[MComponentInstance] "." serverPort=[mclevcmp::MServerPort] "using"
		//connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{" ("mapping" ":="
		//ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
		//attributeValueAssignments+=MAttributeValueAssignment* "}" ";"
		public Group getGroup() { return cGroup; }

		//{MCommonConnection}
		public Action getMCommonConnectionAction_0() { return cMCommonConnectionAction_0; }

		//"connection"
		public Keyword getConnectionKeyword_1() { return cConnectionKeyword_1; }

		//clientInstance=[MComponentInstance]
		public Assignment getClientInstanceAssignment_2() { return cClientInstanceAssignment_2; }

		//[MComponentInstance]
		public CrossReference getClientInstanceMComponentInstanceCrossReference_2_0() { return cClientInstanceMComponentInstanceCrossReference_2_0; }

		//ID
		public RuleCall getClientInstanceMComponentInstanceIDTerminalRuleCall_2_0_1() { return cClientInstanceMComponentInstanceIDTerminalRuleCall_2_0_1; }

		//"."
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }

		//clientPort=[mclevcmp::MClientPort]
		public Assignment getClientPortAssignment_4() { return cClientPortAssignment_4; }

		//[mclevcmp::MClientPort]
		public CrossReference getClientPortMClientPortCrossReference_4_0() { return cClientPortMClientPortCrossReference_4_0; }

		//ID
		public RuleCall getClientPortMClientPortIDTerminalRuleCall_4_0_1() { return cClientPortMClientPortIDTerminalRuleCall_4_0_1; }

		//"<->"
		public Keyword getLessThanSignHyphenMinusGreaterThanSignKeyword_5() { return cLessThanSignHyphenMinusGreaterThanSignKeyword_5; }

		//serverInstance=[MComponentInstance]
		public Assignment getServerInstanceAssignment_6() { return cServerInstanceAssignment_6; }

		//[MComponentInstance]
		public CrossReference getServerInstanceMComponentInstanceCrossReference_6_0() { return cServerInstanceMComponentInstanceCrossReference_6_0; }

		//ID
		public RuleCall getServerInstanceMComponentInstanceIDTerminalRuleCall_6_0_1() { return cServerInstanceMComponentInstanceIDTerminalRuleCall_6_0_1; }

		//"."
		public Keyword getFullStopKeyword_7() { return cFullStopKeyword_7; }

		//serverPort=[mclevcmp::MServerPort]
		public Assignment getServerPortAssignment_8() { return cServerPortAssignment_8; }

		//[mclevcmp::MServerPort]
		public CrossReference getServerPortMServerPortCrossReference_8_0() { return cServerPortMServerPortCrossReference_8_0; }

		//ID
		public RuleCall getServerPortMServerPortIDTerminalRuleCall_8_0_1() { return cServerPortMServerPortIDTerminalRuleCall_8_0_1; }

		//"using"
		public Keyword getUsingKeyword_9() { return cUsingKeyword_9; }

		//connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
		public Assignment getConnectorAssignment_10() { return cConnectorAssignment_10; }

		//[mclevdom::MConnector|VersionedQualifiedReferenceName]
		public CrossReference getConnectorMConnectorCrossReference_10_0() { return cConnectorMConnectorCrossReference_10_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_10_0_1() { return cConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_10_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_11() { return cLeftCurlyBracketKeyword_11; }

		//("mapping" ":=" ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
		public Group getGroup_12() { return cGroup_12; }

		//"mapping"
		public Keyword getMappingKeyword_12_0() { return cMappingKeyword_12_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_12_1() { return cColonEqualsSignKeyword_12_1; }

		//ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName]
		public Assignment getIfaceMappingAssignment_12_2() { return cIfaceMappingAssignment_12_2; }

		//[mclevimap::MInterfaceMapping|VersionedQualifiedName]
		public CrossReference getIfaceMappingMInterfaceMappingCrossReference_12_2_0() { return cIfaceMappingMInterfaceMappingCrossReference_12_2_0; }

		//VersionedQualifiedName
		public RuleCall getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_12_2_0_1() { return cIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_12_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_12_3() { return cSemicolonKeyword_12_3; }

		//attributeValueAssignments+=MAttributeValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_13() { return cAttributeValueAssignmentsAssignment_13; }

		//MAttributeValueAssignment
		public RuleCall getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0() { return cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }

		//";"
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}

	public class MConnectionSwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MConnectionSwitch");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMConnectionSwitchAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSwitchKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cClientInstanceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cClientInstanceMComponentInstanceCrossReference_3_0 = (CrossReference)cClientInstanceAssignment_3.eContents().get(0);
		private final RuleCall cClientInstanceMComponentInstanceIDTerminalRuleCall_3_0_1 = (RuleCall)cClientInstanceMComponentInstanceCrossReference_3_0.eContents().get(1);
		private final Keyword cFullStopKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cClientPortAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cClientPortMClientPortCrossReference_5_0 = (CrossReference)cClientPortAssignment_5.eContents().get(0);
		private final RuleCall cClientPortMClientPortIDTerminalRuleCall_5_0_1 = (RuleCall)cClientPortMClientPortCrossReference_5_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cCasesAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cCasesMConnectionSwitchCaseParserRuleCall_8_0 = (RuleCall)cCasesAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//MConnectionSwitch:
		//	{MConnectionSwitch} "switch" "(" clientInstance=[MComponentInstance] "." clientPort=[mclevcmp::MClientPort] ")" "{"
		//	cases+=MConnectionSwitchCase+ "}" ";";
		public ParserRule getRule() { return rule; }

		//{MConnectionSwitch} "switch" "(" clientInstance=[MComponentInstance] "." clientPort=[mclevcmp::MClientPort] ")" "{"
		//cases+=MConnectionSwitchCase+ "}" ";"
		public Group getGroup() { return cGroup; }

		//{MConnectionSwitch}
		public Action getMConnectionSwitchAction_0() { return cMConnectionSwitchAction_0; }

		//"switch"
		public Keyword getSwitchKeyword_1() { return cSwitchKeyword_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//clientInstance=[MComponentInstance]
		public Assignment getClientInstanceAssignment_3() { return cClientInstanceAssignment_3; }

		//[MComponentInstance]
		public CrossReference getClientInstanceMComponentInstanceCrossReference_3_0() { return cClientInstanceMComponentInstanceCrossReference_3_0; }

		//ID
		public RuleCall getClientInstanceMComponentInstanceIDTerminalRuleCall_3_0_1() { return cClientInstanceMComponentInstanceIDTerminalRuleCall_3_0_1; }

		//"."
		public Keyword getFullStopKeyword_4() { return cFullStopKeyword_4; }

		//clientPort=[mclevcmp::MClientPort]
		public Assignment getClientPortAssignment_5() { return cClientPortAssignment_5; }

		//[mclevcmp::MClientPort]
		public CrossReference getClientPortMClientPortCrossReference_5_0() { return cClientPortMClientPortCrossReference_5_0; }

		//ID
		public RuleCall getClientPortMClientPortIDTerminalRuleCall_5_0_1() { return cClientPortMClientPortIDTerminalRuleCall_5_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_7() { return cLeftCurlyBracketKeyword_7; }

		//cases+=MConnectionSwitchCase+
		public Assignment getCasesAssignment_8() { return cCasesAssignment_8; }

		//MConnectionSwitchCase
		public RuleCall getCasesMConnectionSwitchCaseParserRuleCall_8_0() { return cCasesMConnectionSwitchCaseParserRuleCall_8_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }

		//";"
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
	}

	public class MConnectionSwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MConnectionSwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMConnectionSwitchCaseAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCaseKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAlternativeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cAlternativeMDeploymentAlternativeCrossReference_2_0 = (CrossReference)cAlternativeAssignment_2.eContents().get(0);
		private final RuleCall cAlternativeMDeploymentAlternativeIDTerminalRuleCall_2_0_1 = (RuleCall)cAlternativeMDeploymentAlternativeCrossReference_2_0.eContents().get(1);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cServerInstanceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cServerInstanceMComponentInstanceCrossReference_4_0 = (CrossReference)cServerInstanceAssignment_4.eContents().get(0);
		private final RuleCall cServerInstanceMComponentInstanceIDTerminalRuleCall_4_0_1 = (RuleCall)cServerInstanceMComponentInstanceCrossReference_4_0.eContents().get(1);
		private final Keyword cFullStopKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cServerPortAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cServerPortMServerPortCrossReference_6_0 = (CrossReference)cServerPortAssignment_6.eContents().get(0);
		private final RuleCall cServerPortMServerPortIDTerminalRuleCall_6_0_1 = (RuleCall)cServerPortMServerPortCrossReference_6_0.eContents().get(1);
		private final Keyword cUsingKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cConnectorAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cConnectorMConnectorCrossReference_8_0 = (CrossReference)cConnectorAssignment_8.eContents().get(0);
		private final RuleCall cConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_8_0_1 = (RuleCall)cConnectorMConnectorCrossReference_8_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cMappingKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cIfaceMappingAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final CrossReference cIfaceMappingMInterfaceMappingCrossReference_10_2_0 = (CrossReference)cIfaceMappingAssignment_10_2.eContents().get(0);
		private final RuleCall cIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_10_2_0_1 = (RuleCall)cIfaceMappingMInterfaceMappingCrossReference_10_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Assignment cAttributeValueAssignmentsAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_11_0 = (RuleCall)cAttributeValueAssignmentsAssignment_11.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//MConnectionSwitchCase:
		//	{MConnectionSwitchCase} "case" alternative=[MDeploymentAlternative] ":" serverInstance=[MComponentInstance] "."
		//	serverPort=[mclevcmp::MServerPort] "using" connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{"
		//	("mapping" ":=" ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
		//	attributeValueAssignments+=MAttributeValueAssignment* "}" ";";
		public ParserRule getRule() { return rule; }

		//{MConnectionSwitchCase} "case" alternative=[MDeploymentAlternative] ":" serverInstance=[MComponentInstance] "."
		//serverPort=[mclevcmp::MServerPort] "using" connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{"
		//("mapping" ":=" ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
		//attributeValueAssignments+=MAttributeValueAssignment* "}" ";"
		public Group getGroup() { return cGroup; }

		//{MConnectionSwitchCase}
		public Action getMConnectionSwitchCaseAction_0() { return cMConnectionSwitchCaseAction_0; }

		//"case"
		public Keyword getCaseKeyword_1() { return cCaseKeyword_1; }

		//alternative=[MDeploymentAlternative]
		public Assignment getAlternativeAssignment_2() { return cAlternativeAssignment_2; }

		//[MDeploymentAlternative]
		public CrossReference getAlternativeMDeploymentAlternativeCrossReference_2_0() { return cAlternativeMDeploymentAlternativeCrossReference_2_0; }

		//ID
		public RuleCall getAlternativeMDeploymentAlternativeIDTerminalRuleCall_2_0_1() { return cAlternativeMDeploymentAlternativeIDTerminalRuleCall_2_0_1; }

		//":"
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }

		//serverInstance=[MComponentInstance]
		public Assignment getServerInstanceAssignment_4() { return cServerInstanceAssignment_4; }

		//[MComponentInstance]
		public CrossReference getServerInstanceMComponentInstanceCrossReference_4_0() { return cServerInstanceMComponentInstanceCrossReference_4_0; }

		//ID
		public RuleCall getServerInstanceMComponentInstanceIDTerminalRuleCall_4_0_1() { return cServerInstanceMComponentInstanceIDTerminalRuleCall_4_0_1; }

		//"."
		public Keyword getFullStopKeyword_5() { return cFullStopKeyword_5; }

		//serverPort=[mclevcmp::MServerPort]
		public Assignment getServerPortAssignment_6() { return cServerPortAssignment_6; }

		//[mclevcmp::MServerPort]
		public CrossReference getServerPortMServerPortCrossReference_6_0() { return cServerPortMServerPortCrossReference_6_0; }

		//ID
		public RuleCall getServerPortMServerPortIDTerminalRuleCall_6_0_1() { return cServerPortMServerPortIDTerminalRuleCall_6_0_1; }

		//"using"
		public Keyword getUsingKeyword_7() { return cUsingKeyword_7; }

		//connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
		public Assignment getConnectorAssignment_8() { return cConnectorAssignment_8; }

		//[mclevdom::MConnector|VersionedQualifiedReferenceName]
		public CrossReference getConnectorMConnectorCrossReference_8_0() { return cConnectorMConnectorCrossReference_8_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_8_0_1() { return cConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_8_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_9() { return cLeftCurlyBracketKeyword_9; }

		//("mapping" ":=" ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
		public Group getGroup_10() { return cGroup_10; }

		//"mapping"
		public Keyword getMappingKeyword_10_0() { return cMappingKeyword_10_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_10_1() { return cColonEqualsSignKeyword_10_1; }

		//ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName]
		public Assignment getIfaceMappingAssignment_10_2() { return cIfaceMappingAssignment_10_2; }

		//[mclevimap::MInterfaceMapping|VersionedQualifiedName]
		public CrossReference getIfaceMappingMInterfaceMappingCrossReference_10_2_0() { return cIfaceMappingMInterfaceMappingCrossReference_10_2_0; }

		//VersionedQualifiedName
		public RuleCall getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_10_2_0_1() { return cIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_10_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_10_3() { return cSemicolonKeyword_10_3; }

		//attributeValueAssignments+=MAttributeValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_11() { return cAttributeValueAssignmentsAssignment_11; }

		//MAttributeValueAssignment
		public RuleCall getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_11_0() { return cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_11_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }

		//";"
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
	}

	public class MComponentInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MComponentInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMComponentInstanceAction_0 = (Action)cGroup.eContents().get(0);
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
		
		//MComponentInstance:
		//	{MComponentInstance} "instance" component=[mclevcmp::MComponent|VersionedQualifiedName] name=ID "{"
		//	attributeValueAssignments+=MAttributeValueAssignment* "}" ";";
		public ParserRule getRule() { return rule; }

		//{MComponentInstance} "instance" component=[mclevcmp::MComponent|VersionedQualifiedName] name=ID "{"
		//attributeValueAssignments+=MAttributeValueAssignment* "}" ";"
		public Group getGroup() { return cGroup; }

		//{MComponentInstance}
		public Action getMComponentInstanceAction_0() { return cMComponentInstanceAction_0; }

		//"instance"
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

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//attributeValueAssignments+=MAttributeValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_5() { return cAttributeValueAssignmentsAssignment_5; }

		//MAttributeValueAssignment
		public RuleCall getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0() { return cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MServiceLibraryInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MServiceLibraryInstance");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMRegularServiceLibraryInstanceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMDriverSLibInstanceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MServiceLibraryInstance:
		//	MRegularServiceLibraryInstance | MDriverSLibInstance;
		public ParserRule getRule() { return rule; }

		//MRegularServiceLibraryInstance | MDriverSLibInstance
		public Alternatives getAlternatives() { return cAlternatives; }

		//MRegularServiceLibraryInstance
		public RuleCall getMRegularServiceLibraryInstanceParserRuleCall_0() { return cMRegularServiceLibraryInstanceParserRuleCall_0; }

		//MDriverSLibInstance
		public RuleCall getMDriverSLibInstanceParserRuleCall_1() { return cMDriverSLibInstanceParserRuleCall_1; }
	}

	public class MRegularServiceLibraryInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MRegularServiceLibraryInstance");
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
		
		//MRegularServiceLibraryInstance returns MServiceLibraryInstance:
		//	"library" library=[mclevslib::MServiceLibrary|VersionedQualifiedName] "{"
		//	attributeValueAssignments+=MAttributeValueAssignment* "}" ";";
		public ParserRule getRule() { return rule; }

		//"library" library=[mclevslib::MServiceLibrary|VersionedQualifiedName] "{"
		//attributeValueAssignments+=MAttributeValueAssignment* "}" ";"
		public Group getGroup() { return cGroup; }

		//"library"
		public Keyword getLibraryKeyword_0() { return cLibraryKeyword_0; }

		//library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
		public Assignment getLibraryAssignment_1() { return cLibraryAssignment_1; }

		//[mclevslib::MServiceLibrary|VersionedQualifiedName]
		public CrossReference getLibraryMServiceLibraryCrossReference_1_0() { return cLibraryMServiceLibraryCrossReference_1_0; }

		//VersionedQualifiedName
		public RuleCall getLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_1_0_1() { return cLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//attributeValueAssignments+=MAttributeValueAssignment*
		public Assignment getAttributeValueAssignmentsAssignment_3() { return cAttributeValueAssignmentsAssignment_3; }

		//MAttributeValueAssignment
		public RuleCall getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0() { return cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MDriverSLibInstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MDriverSLibInstance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMDriverSLibInstanceAction_0 = (Action)cGroup.eContents().get(0);
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
		private final RuleCall cDeviceDriverMappingsMDeviceDriverMappingParserRuleCall_4_1_3_0 = (RuleCall)cDeviceDriverMappingsAssignment_4_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_1_4 = (Keyword)cGroup_4_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_1_5 = (Keyword)cGroup_4_1.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MDriverSLibInstance:
		//	{MDriverSLibInstance} "driver" library=[mclevslib::MServiceLibrary|VersionedQualifiedName] "{" (("attribute" "values"
		//	"{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("device" "mappings" "{"
		//	deviceDriverMappings+=MDeviceDriverMapping+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//{MDriverSLibInstance} "driver" library=[mclevslib::MServiceLibrary|VersionedQualifiedName] "{" (("attribute" "values"
		//"{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("device" "mappings" "{"
		//deviceDriverMappings+=MDeviceDriverMapping+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//{MDriverSLibInstance}
		public Action getMDriverSLibInstanceAction_0() { return cMDriverSLibInstanceAction_0; }

		//"driver"
		public Keyword getDriverKeyword_1() { return cDriverKeyword_1; }

		//library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
		public Assignment getLibraryAssignment_2() { return cLibraryAssignment_2; }

		//[mclevslib::MServiceLibrary|VersionedQualifiedName]
		public CrossReference getLibraryMServiceLibraryCrossReference_2_0() { return cLibraryMServiceLibraryCrossReference_2_0; }

		//VersionedQualifiedName
		public RuleCall getLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_2_0_1() { return cLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_2_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("attribute" "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("device" "mappings" "{"
		//deviceDriverMappings+=MDeviceDriverMapping+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//("attribute" "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")?
		public Group getGroup_4_0() { return cGroup_4_0; }

		//"attribute"
		public Keyword getAttributeKeyword_4_0_0() { return cAttributeKeyword_4_0_0; }

		//"values"
		public Keyword getValuesKeyword_4_0_1() { return cValuesKeyword_4_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_0_2() { return cLeftCurlyBracketKeyword_4_0_2; }

		//attributeValueAssignments+=MAttributeValueAssignment+
		public Assignment getAttributeValueAssignmentsAssignment_4_0_3() { return cAttributeValueAssignmentsAssignment_4_0_3; }

		//MAttributeValueAssignment
		public RuleCall getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0() { return cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_0_4() { return cRightCurlyBracketKeyword_4_0_4; }

		//";"
		public Keyword getSemicolonKeyword_4_0_5() { return cSemicolonKeyword_4_0_5; }

		//("device" "mappings" "{" deviceDriverMappings+=MDeviceDriverMapping+ "}" ";")?
		public Group getGroup_4_1() { return cGroup_4_1; }

		//"device"
		public Keyword getDeviceKeyword_4_1_0() { return cDeviceKeyword_4_1_0; }

		//"mappings"
		public Keyword getMappingsKeyword_4_1_1() { return cMappingsKeyword_4_1_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1_2() { return cLeftCurlyBracketKeyword_4_1_2; }

		//deviceDriverMappings+=MDeviceDriverMapping+
		public Assignment getDeviceDriverMappingsAssignment_4_1_3() { return cDeviceDriverMappingsAssignment_4_1_3; }

		//MDeviceDriverMapping
		public RuleCall getDeviceDriverMappingsMDeviceDriverMappingParserRuleCall_4_1_3_0() { return cDeviceDriverMappingsMDeviceDriverMappingParserRuleCall_4_1_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_1_4() { return cRightCurlyBracketKeyword_4_1_4; }

		//";"
		public Keyword getSemicolonKeyword_4_1_5() { return cSemicolonKeyword_4_1_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MDeviceDriverMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MDeviceDriverMapping");
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
		
		//MDeviceDriverMapping:
		//	"supported" "device" supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName] "->"
		//	"deployed" "device" deployedDevice=[MDeployedDevice|VersionedQualifiedReferenceName] ";";
		public ParserRule getRule() { return rule; }

		//"supported" "device" supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName] "->"
		//"deployed" "device" deployedDevice=[MDeployedDevice|VersionedQualifiedReferenceName] ";"
		public Group getGroup() { return cGroup; }

		//"supported"
		public Keyword getSupportedKeyword_0() { return cSupportedKeyword_0; }

		//"device"
		public Keyword getDeviceKeyword_1() { return cDeviceKeyword_1; }

		//supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName]
		public Assignment getSupportedDeviceAssignment_2() { return cSupportedDeviceAssignment_2; }

		//[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName]
		public CrossReference getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0() { return cSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getSupportedDeviceMDriverSLibSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cSupportedDeviceMDriverSLibSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_3() { return cHyphenMinusGreaterThanSignKeyword_3; }

		//"deployed"
		public Keyword getDeployedKeyword_4() { return cDeployedKeyword_4; }

		//"device"
		public Keyword getDeviceKeyword_5() { return cDeviceKeyword_5; }

		//deployedDevice=[MDeployedDevice|VersionedQualifiedReferenceName]
		public Assignment getDeployedDeviceAssignment_6() { return cDeployedDeviceAssignment_6; }

		//[MDeployedDevice|VersionedQualifiedReferenceName]
		public CrossReference getDeployedDeviceMDeployedDeviceCrossReference_6_0() { return cDeployedDeviceMDeployedDeviceCrossReference_6_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getDeployedDeviceMDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1() { return cDeployedDeviceMDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MDeploymentAlternativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MDeploymentAlternative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMDeploymentAlternativeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDeploymentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAlternativeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cDeploymentKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cPlatformsKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_5_0_2 = (Keyword)cGroup_5_0.eContents().get(2);
		private final Assignment cDeploymentPlatformsAssignment_5_0_3 = (Assignment)cGroup_5_0.eContents().get(3);
		private final CrossReference cDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_3_0 = (CrossReference)cDeploymentPlatformsAssignment_5_0_3.eContents().get(0);
		private final RuleCall cDeploymentPlatformsMDeploymentPlatformIDTerminalRuleCall_5_0_3_0_1 = (RuleCall)cDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_3_0.eContents().get(1);
		private final Group cGroup_5_0_4 = (Group)cGroup_5_0.eContents().get(4);
		private final Keyword cCommaKeyword_5_0_4_0 = (Keyword)cGroup_5_0_4.eContents().get(0);
		private final Assignment cDeploymentPlatformsAssignment_5_0_4_1 = (Assignment)cGroup_5_0_4.eContents().get(1);
		private final CrossReference cDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_4_1_0 = (CrossReference)cDeploymentPlatformsAssignment_5_0_4_1.eContents().get(0);
		private final RuleCall cDeploymentPlatformsMDeploymentPlatformIDTerminalRuleCall_5_0_4_1_0_1 = (RuleCall)cDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_4_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_0_5 = (Keyword)cGroup_5_0.eContents().get(5);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cAttributeKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cValuesKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_1_2 = (Keyword)cGroup_5_1.eContents().get(2);
		private final Assignment cAttributeValueAssignmentsAssignment_5_1_3 = (Assignment)cGroup_5_1.eContents().get(3);
		private final RuleCall cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0 = (RuleCall)cAttributeValueAssignmentsAssignment_5_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_1_4 = (Keyword)cGroup_5_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_1_5 = (Keyword)cGroup_5_1.eContents().get(5);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cDeploymentKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Keyword cAlternativesKeyword_5_2_1 = (Keyword)cGroup_5_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_2_2 = (Keyword)cGroup_5_2.eContents().get(2);
		private final Assignment cDeploymentAlternativesAssignment_5_2_3 = (Assignment)cGroup_5_2.eContents().get(3);
		private final RuleCall cDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_2_3_0 = (RuleCall)cDeploymentAlternativesAssignment_5_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_2_4 = (Keyword)cGroup_5_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_2_5 = (Keyword)cGroup_5_2.eContents().get(5);
		private final Group cGroup_5_3 = (Group)cUnorderedGroup_5.eContents().get(3);
		private final Keyword cComponentsKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_3_1 = (Keyword)cGroup_5_3.eContents().get(1);
		private final Assignment cComponentsAssignment_5_3_2 = (Assignment)cGroup_5_3.eContents().get(2);
		private final RuleCall cComponentsMComponentInstanceParserRuleCall_5_3_2_0 = (RuleCall)cComponentsAssignment_5_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3_3 = (Keyword)cGroup_5_3.eContents().get(3);
		private final Keyword cSemicolonKeyword_5_3_4 = (Keyword)cGroup_5_3.eContents().get(4);
		private final Group cGroup_5_4 = (Group)cUnorderedGroup_5.eContents().get(4);
		private final Keyword cConnectionsKeyword_5_4_0 = (Keyword)cGroup_5_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_4_1 = (Keyword)cGroup_5_4.eContents().get(1);
		private final Assignment cConnectionsAssignment_5_4_2 = (Assignment)cGroup_5_4.eContents().get(2);
		private final RuleCall cConnectionsMConnectionParserRuleCall_5_4_2_0 = (RuleCall)cConnectionsAssignment_5_4_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4_3 = (Keyword)cGroup_5_4.eContents().get(3);
		private final Keyword cSemicolonKeyword_5_4_4 = (Keyword)cGroup_5_4.eContents().get(4);
		private final Group cGroup_5_5 = (Group)cUnorderedGroup_5.eContents().get(5);
		private final Keyword cLibrariesKeyword_5_5_0 = (Keyword)cGroup_5_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_5_1 = (Keyword)cGroup_5_5.eContents().get(1);
		private final Assignment cLibrariesAssignment_5_5_2 = (Assignment)cGroup_5_5.eContents().get(2);
		private final RuleCall cLibrariesMServiceLibraryInstanceParserRuleCall_5_5_2_0 = (RuleCall)cLibrariesAssignment_5_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_5_3 = (Keyword)cGroup_5_5.eContents().get(3);
		private final Keyword cSemicolonKeyword_5_5_4 = (Keyword)cGroup_5_5.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MDeploymentAlternative:
		//	{MDeploymentAlternative} "deployment" "alternative" name=ID "{" ("deployment" "platforms" ":="
		//	deploymentPlatforms+=[MDeploymentPlatform] ("," deploymentPlatforms+=[MDeploymentPlatform])* ";" & ("attribute"
		//	"values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("deployment" "alternatives" "{"
		//	deploymentAlternatives+=MDeploymentAlternative+ "}" ";")? & ("components" "{" components+=MComponentInstance+ "}"
		//	";")? & ("connections" "{" connections+=MConnection+ "}" ";")? & ("libraries" "{" libraries+=MServiceLibraryInstance+
		//	"}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//{MDeploymentAlternative} "deployment" "alternative" name=ID "{" ("deployment" "platforms" ":="
		//deploymentPlatforms+=[MDeploymentPlatform] ("," deploymentPlatforms+=[MDeploymentPlatform])* ";" & ("attribute"
		//"values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("deployment" "alternatives" "{"
		//deploymentAlternatives+=MDeploymentAlternative+ "}" ";")? & ("components" "{" components+=MComponentInstance+ "}" ";")?
		//& ("connections" "{" connections+=MConnection+ "}" ";")? & ("libraries" "{" libraries+=MServiceLibraryInstance+ "}"
		//";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//{MDeploymentAlternative}
		public Action getMDeploymentAlternativeAction_0() { return cMDeploymentAlternativeAction_0; }

		//"deployment"
		public Keyword getDeploymentKeyword_1() { return cDeploymentKeyword_1; }

		//"alternative"
		public Keyword getAlternativeKeyword_2() { return cAlternativeKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//"deployment" "platforms" ":=" deploymentPlatforms+=[MDeploymentPlatform] (","
		//deploymentPlatforms+=[MDeploymentPlatform])* ";" & ("attribute" "values" "{"
		//attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("deployment" "alternatives" "{"
		//deploymentAlternatives+=MDeploymentAlternative+ "}" ";")? & ("components" "{" components+=MComponentInstance+ "}" ";")?
		//& ("connections" "{" connections+=MConnection+ "}" ";")? & ("libraries" "{" libraries+=MServiceLibraryInstance+ "}"
		//";")?
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }

		//"deployment" "platforms" ":=" deploymentPlatforms+=[MDeploymentPlatform] (","
		//deploymentPlatforms+=[MDeploymentPlatform])* ";"
		public Group getGroup_5_0() { return cGroup_5_0; }

		//"deployment"
		public Keyword getDeploymentKeyword_5_0_0() { return cDeploymentKeyword_5_0_0; }

		//"platforms"
		public Keyword getPlatformsKeyword_5_0_1() { return cPlatformsKeyword_5_0_1; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_0_2() { return cColonEqualsSignKeyword_5_0_2; }

		//deploymentPlatforms+=[MDeploymentPlatform]
		public Assignment getDeploymentPlatformsAssignment_5_0_3() { return cDeploymentPlatformsAssignment_5_0_3; }

		//[MDeploymentPlatform]
		public CrossReference getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_3_0() { return cDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_3_0; }

		//ID
		public RuleCall getDeploymentPlatformsMDeploymentPlatformIDTerminalRuleCall_5_0_3_0_1() { return cDeploymentPlatformsMDeploymentPlatformIDTerminalRuleCall_5_0_3_0_1; }

		//("," deploymentPlatforms+=[MDeploymentPlatform])*
		public Group getGroup_5_0_4() { return cGroup_5_0_4; }

		//","
		public Keyword getCommaKeyword_5_0_4_0() { return cCommaKeyword_5_0_4_0; }

		//deploymentPlatforms+=[MDeploymentPlatform]
		public Assignment getDeploymentPlatformsAssignment_5_0_4_1() { return cDeploymentPlatformsAssignment_5_0_4_1; }

		//[MDeploymentPlatform]
		public CrossReference getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_4_1_0() { return cDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_4_1_0; }

		//ID
		public RuleCall getDeploymentPlatformsMDeploymentPlatformIDTerminalRuleCall_5_0_4_1_0_1() { return cDeploymentPlatformsMDeploymentPlatformIDTerminalRuleCall_5_0_4_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_0_5() { return cSemicolonKeyword_5_0_5; }

		//("attribute" "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")?
		public Group getGroup_5_1() { return cGroup_5_1; }

		//"attribute"
		public Keyword getAttributeKeyword_5_1_0() { return cAttributeKeyword_5_1_0; }

		//"values"
		public Keyword getValuesKeyword_5_1_1() { return cValuesKeyword_5_1_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_1_2() { return cLeftCurlyBracketKeyword_5_1_2; }

		//attributeValueAssignments+=MAttributeValueAssignment+
		public Assignment getAttributeValueAssignmentsAssignment_5_1_3() { return cAttributeValueAssignmentsAssignment_5_1_3; }

		//MAttributeValueAssignment
		public RuleCall getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0() { return cAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_1_4() { return cRightCurlyBracketKeyword_5_1_4; }

		//";"
		public Keyword getSemicolonKeyword_5_1_5() { return cSemicolonKeyword_5_1_5; }

		//("deployment" "alternatives" "{" deploymentAlternatives+=MDeploymentAlternative+ "}" ";")?
		public Group getGroup_5_2() { return cGroup_5_2; }

		//"deployment"
		public Keyword getDeploymentKeyword_5_2_0() { return cDeploymentKeyword_5_2_0; }

		//"alternatives"
		public Keyword getAlternativesKeyword_5_2_1() { return cAlternativesKeyword_5_2_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_2_2() { return cLeftCurlyBracketKeyword_5_2_2; }

		//deploymentAlternatives+=MDeploymentAlternative+
		public Assignment getDeploymentAlternativesAssignment_5_2_3() { return cDeploymentAlternativesAssignment_5_2_3; }

		//MDeploymentAlternative
		public RuleCall getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_2_3_0() { return cDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_2_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_2_4() { return cRightCurlyBracketKeyword_5_2_4; }

		//";"
		public Keyword getSemicolonKeyword_5_2_5() { return cSemicolonKeyword_5_2_5; }

		//("components" "{" components+=MComponentInstance+ "}" ";")?
		public Group getGroup_5_3() { return cGroup_5_3; }

		//"components"
		public Keyword getComponentsKeyword_5_3_0() { return cComponentsKeyword_5_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_3_1() { return cLeftCurlyBracketKeyword_5_3_1; }

		//components+=MComponentInstance+
		public Assignment getComponentsAssignment_5_3_2() { return cComponentsAssignment_5_3_2; }

		//MComponentInstance
		public RuleCall getComponentsMComponentInstanceParserRuleCall_5_3_2_0() { return cComponentsMComponentInstanceParserRuleCall_5_3_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_3_3() { return cRightCurlyBracketKeyword_5_3_3; }

		//";"
		public Keyword getSemicolonKeyword_5_3_4() { return cSemicolonKeyword_5_3_4; }

		//("connections" "{" connections+=MConnection+ "}" ";")?
		public Group getGroup_5_4() { return cGroup_5_4; }

		//"connections"
		public Keyword getConnectionsKeyword_5_4_0() { return cConnectionsKeyword_5_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_4_1() { return cLeftCurlyBracketKeyword_5_4_1; }

		//connections+=MConnection+
		public Assignment getConnectionsAssignment_5_4_2() { return cConnectionsAssignment_5_4_2; }

		//MConnection
		public RuleCall getConnectionsMConnectionParserRuleCall_5_4_2_0() { return cConnectionsMConnectionParserRuleCall_5_4_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_4_3() { return cRightCurlyBracketKeyword_5_4_3; }

		//";"
		public Keyword getSemicolonKeyword_5_4_4() { return cSemicolonKeyword_5_4_4; }

		//("libraries" "{" libraries+=MServiceLibraryInstance+ "}" ";")?
		public Group getGroup_5_5() { return cGroup_5_5; }

		//"libraries"
		public Keyword getLibrariesKeyword_5_5_0() { return cLibrariesKeyword_5_5_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_5_1() { return cLeftCurlyBracketKeyword_5_5_1; }

		//libraries+=MServiceLibraryInstance+
		public Assignment getLibrariesAssignment_5_5_2() { return cLibrariesAssignment_5_5_2; }

		//MServiceLibraryInstance
		public RuleCall getLibrariesMServiceLibraryInstanceParserRuleCall_5_5_2_0() { return cLibrariesMServiceLibraryInstanceParserRuleCall_5_5_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_5_3() { return cRightCurlyBracketKeyword_5_5_3; }

		//";"
		public Keyword getSemicolonKeyword_5_5_4() { return cSemicolonKeyword_5_5_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MDeploymentPlatformElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MDeploymentPlatform");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeploymentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPlatformKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cPlatformKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Assignment cPlatformAssignment_4_0_2 = (Assignment)cGroup_4_0.eContents().get(2);
		private final CrossReference cPlatformMPlatformCrossReference_4_0_2_0 = (CrossReference)cPlatformAssignment_4_0_2.eContents().get(0);
		private final RuleCall cPlatformMPlatformVersionedQualifiedNameParserRuleCall_4_0_2_0_1 = (RuleCall)cPlatformMPlatformCrossReference_4_0_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cDeployedKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cDevicesKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_1_2 = (Keyword)cGroup_4_1.eContents().get(2);
		private final Assignment cDeployedDevicesAssignment_4_1_3 = (Assignment)cGroup_4_1.eContents().get(3);
		private final RuleCall cDeployedDevicesMDeployedDeviceParserRuleCall_4_1_3_0 = (RuleCall)cDeployedDevicesAssignment_4_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_1_4 = (Keyword)cGroup_4_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_1_5 = (Keyword)cGroup_4_1.eContents().get(5);
		private final Group cGroup_4_2 = (Group)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cParameterKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cValuesKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_2_2 = (Keyword)cGroup_4_2.eContents().get(2);
		private final Assignment cParameterValueAssignmentsAssignment_4_2_3 = (Assignment)cGroup_4_2.eContents().get(3);
		private final RuleCall cParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_2_3_0 = (RuleCall)cParameterValueAssignmentsAssignment_4_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_2_4 = (Keyword)cGroup_4_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_2_5 = (Keyword)cGroup_4_2.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MDeploymentPlatform:
		//	"deployment" "platform" name=ID "{" ("platform" ":=" platform=[pdl::MPlatform|VersionedQualifiedName] ";" &
		//	("deployed" "devices" "{" deployedDevices+=MDeployedDevice+ "}" ";")? & ("parameter" "values" "{"
		//	parameterValueAssignments+=MParameterValueAssignment+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"deployment" "platform" name=ID "{" ("platform" ":=" platform=[pdl::MPlatform|VersionedQualifiedName] ";" & ("deployed"
		//"devices" "{" deployedDevices+=MDeployedDevice+ "}" ";")? & ("parameter" "values" "{"
		//parameterValueAssignments+=MParameterValueAssignment+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"deployment"
		public Keyword getDeploymentKeyword_0() { return cDeploymentKeyword_0; }

		//"platform"
		public Keyword getPlatformKeyword_1() { return cPlatformKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//"platform" ":=" platform=[pdl::MPlatform|VersionedQualifiedName] ";" & ("deployed" "devices" "{"
		//deployedDevices+=MDeployedDevice+ "}" ";")? & ("parameter" "values" "{"
		//parameterValueAssignments+=MParameterValueAssignment+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//"platform" ":=" platform=[pdl::MPlatform|VersionedQualifiedName] ";"
		public Group getGroup_4_0() { return cGroup_4_0; }

		//"platform"
		public Keyword getPlatformKeyword_4_0_0() { return cPlatformKeyword_4_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_0_1() { return cColonEqualsSignKeyword_4_0_1; }

		//platform=[pdl::MPlatform|VersionedQualifiedName]
		public Assignment getPlatformAssignment_4_0_2() { return cPlatformAssignment_4_0_2; }

		//[pdl::MPlatform|VersionedQualifiedName]
		public CrossReference getPlatformMPlatformCrossReference_4_0_2_0() { return cPlatformMPlatformCrossReference_4_0_2_0; }

		//VersionedQualifiedName
		public RuleCall getPlatformMPlatformVersionedQualifiedNameParserRuleCall_4_0_2_0_1() { return cPlatformMPlatformVersionedQualifiedNameParserRuleCall_4_0_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_4_0_3() { return cSemicolonKeyword_4_0_3; }

		//("deployed" "devices" "{" deployedDevices+=MDeployedDevice+ "}" ";")?
		public Group getGroup_4_1() { return cGroup_4_1; }

		//"deployed"
		public Keyword getDeployedKeyword_4_1_0() { return cDeployedKeyword_4_1_0; }

		//"devices"
		public Keyword getDevicesKeyword_4_1_1() { return cDevicesKeyword_4_1_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1_2() { return cLeftCurlyBracketKeyword_4_1_2; }

		//deployedDevices+=MDeployedDevice+
		public Assignment getDeployedDevicesAssignment_4_1_3() { return cDeployedDevicesAssignment_4_1_3; }

		//MDeployedDevice
		public RuleCall getDeployedDevicesMDeployedDeviceParserRuleCall_4_1_3_0() { return cDeployedDevicesMDeployedDeviceParserRuleCall_4_1_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_1_4() { return cRightCurlyBracketKeyword_4_1_4; }

		//";"
		public Keyword getSemicolonKeyword_4_1_5() { return cSemicolonKeyword_4_1_5; }

		//("parameter" "values" "{" parameterValueAssignments+=MParameterValueAssignment+ "}" ";")?
		public Group getGroup_4_2() { return cGroup_4_2; }

		//"parameter"
		public Keyword getParameterKeyword_4_2_0() { return cParameterKeyword_4_2_0; }

		//"values"
		public Keyword getValuesKeyword_4_2_1() { return cValuesKeyword_4_2_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_2_2() { return cLeftCurlyBracketKeyword_4_2_2; }

		//parameterValueAssignments+=MParameterValueAssignment+
		public Assignment getParameterValueAssignmentsAssignment_4_2_3() { return cParameterValueAssignmentsAssignment_4_2_3; }

		//MParameterValueAssignment
		public RuleCall getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_2_3_0() { return cParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_2_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_2_4() { return cRightCurlyBracketKeyword_4_2_4; }

		//";"
		public Keyword getSemicolonKeyword_4_2_5() { return cSemicolonKeyword_4_2_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MDeployedDeviceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MDeployedDevice");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeviceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDeviceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDeviceMDeviceCrossReference_1_0 = (CrossReference)cDeviceAssignment_1.eContents().get(0);
		private final RuleCall cDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cDeviceMDeviceCrossReference_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParameterValueAssignmentsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0 = (RuleCall)cParameterValueAssignmentsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MDeployedDevice:
		//	"device" device=[pdl::MDevice|VersionedQualifiedName] name=ID "{"
		//	parameterValueAssignments+=MParameterValueAssignment* "}" ";";
		public ParserRule getRule() { return rule; }

		//"device" device=[pdl::MDevice|VersionedQualifiedName] name=ID "{" parameterValueAssignments+=MParameterValueAssignment*
		//"}" ";"
		public Group getGroup() { return cGroup; }

		//"device"
		public Keyword getDeviceKeyword_0() { return cDeviceKeyword_0; }

		//device=[pdl::MDevice|VersionedQualifiedName]
		public Assignment getDeviceAssignment_1() { return cDeviceAssignment_1; }

		//[pdl::MDevice|VersionedQualifiedName]
		public CrossReference getDeviceMDeviceCrossReference_1_0() { return cDeviceMDeviceCrossReference_1_0; }

		//VersionedQualifiedName
		public RuleCall getDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1() { return cDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//parameterValueAssignments+=MParameterValueAssignment*
		public Assignment getParameterValueAssignmentsAssignment_4() { return cParameterValueAssignmentsAssignment_4; }

		//MParameterValueAssignment
		public RuleCall getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0() { return cParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MAttributeValueAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MAttributeValueAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAttributeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParameterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParameterMParameterCrossReference_1_0 = (CrossReference)cParameterAssignment_1.eContents().get(0);
		private final RuleCall cParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1 = (RuleCall)cParameterMParameterCrossReference_1_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cParameterValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MAttributeValueAssignment returns common::MParameterValueAssignmentSingleExpression:
		//	"attribute" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":="
		//	parameterValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//"attribute" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" parameterValue=MParameterValueExpression
		//";"
		public Group getGroup() { return cGroup; }

		//"attribute"
		public Keyword getAttributeKeyword_0() { return cAttributeKeyword_0; }

		//parameter=[common::MParameter|VersionedQualifiedReferenceName]
		public Assignment getParameterAssignment_1() { return cParameterAssignment_1; }

		//[common::MParameter|VersionedQualifiedReferenceName]
		public CrossReference getParameterMParameterCrossReference_1_0() { return cParameterMParameterCrossReference_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1() { return cParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1; }

		//":="
		public Keyword getColonEqualsSignKeyword_2() { return cColonEqualsSignKeyword_2; }

		//parameterValue=MParameterValueExpression
		public Assignment getParameterValueAssignment_3() { return cParameterValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getParameterValueMParameterValueExpressionParserRuleCall_3_0() { return cParameterValueMParameterValueExpressionParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class MParameterValueAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterValueAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParameterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParameterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParameterMParameterCrossReference_1_0 = (CrossReference)cParameterAssignment_1.eContents().get(0);
		private final RuleCall cParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1 = (RuleCall)cParameterMParameterCrossReference_1_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cParameterValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MParameterValueAssignment returns common::MParameterValueAssignmentSingleExpression:
		//	"parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":="
		//	parameterValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//"parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" parameterValue=MParameterValueExpression
		//";"
		public Group getGroup() { return cGroup; }

		//"parameter"
		public Keyword getParameterKeyword_0() { return cParameterKeyword_0; }

		//parameter=[common::MParameter|VersionedQualifiedReferenceName]
		public Assignment getParameterAssignment_1() { return cParameterAssignment_1; }

		//[common::MParameter|VersionedQualifiedReferenceName]
		public CrossReference getParameterMParameterCrossReference_1_0() { return cParameterMParameterCrossReference_1_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1() { return cParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1; }

		//":="
		public Keyword getColonEqualsSignKeyword_2() { return cColonEqualsSignKeyword_2; }

		//parameterValue=MParameterValueExpression
		public Assignment getParameterValueAssignment_3() { return cParameterValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getParameterValueMParameterValueExpressionParserRuleCall_3_0() { return cParameterValueMParameterValueExpressionParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
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
	
	private MMCLEVMCADPackageFileElements pMMCLEVMCADPackageFile;
	private MMCLEVMCADPackageElementElements pMMCLEVMCADPackageElement;
	private MMCADeploymentElements pMMCADeployment;
	private MConnectionElements pMConnection;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionedQualifiedNameElements pVersionedQualifiedName;
	private VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private MCommonConnectionElements pMCommonConnection;
	private MConnectionSwitchElements pMConnectionSwitch;
	private MConnectionSwitchCaseElements pMConnectionSwitchCase;
	private MComponentInstanceElements pMComponentInstance;
	private MServiceLibraryInstanceElements pMServiceLibraryInstance;
	private MRegularServiceLibraryInstanceElements pMRegularServiceLibraryInstance;
	private MDriverSLibInstanceElements pMDriverSLibInstance;
	private MDeviceDriverMappingElements pMDeviceDriverMapping;
	private MDeploymentAlternativeElements pMDeploymentAlternative;
	private MDeploymentPlatformElements pMDeploymentPlatform;
	private MDeployedDeviceElements pMDeployedDevice;
	private MAttributeValueAssignmentElements pMAttributeValueAssignment;
	private MParameterValueAssignmentElements pMParameterValueAssignment;
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
	private EBooleanElements pEBoolean;
	private TerminalRule tHEXADECIMAL;
	private INTEGERElements pINTEGER;
	private REALElements pREAL;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public MCADGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mclev.lang.MCAD".equals(grammar.getName())) {
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

	
	//MMCLEVMCADPackageFile:
	//	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
	//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVMCADPackageElement;
	public MMCLEVMCADPackageFileElements getMMCLEVMCADPackageFileAccess() {
		return (pMMCLEVMCADPackageFile != null) ? pMMCLEVMCADPackageFile : (pMMCLEVMCADPackageFile = new MMCLEVMCADPackageFileElements());
	}
	
	public ParserRule getMMCLEVMCADPackageFileRule() {
		return getMMCLEVMCADPackageFileAccess().getRule();
	}

	//MMCLEVMCADPackageElement:
	//	MMCADeployment;
	public MMCLEVMCADPackageElementElements getMMCLEVMCADPackageElementAccess() {
		return (pMMCLEVMCADPackageElement != null) ? pMMCLEVMCADPackageElement : (pMMCLEVMCADPackageElement = new MMCLEVMCADPackageElementElements());
	}
	
	public ParserRule getMMCLEVMCADPackageElementRule() {
		return getMMCLEVMCADPackageElementAccess().getRule();
	}

	//MMCADeployment:
	//	"deployment" "project" domain=[mclevdom::MDomain|VersionedQualifiedName] name=ID "{" ("version" ":=" version=Version
	//	";" & ("attribute" "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("deployment"
	//	"platforms" "{" deploymentPlatforms+=MDeploymentPlatform+ "}" ";")? & ("deployment" "alternatives" "{"
	//	deploymentAlternatives+=MDeploymentAlternative+ "}" ";")? & ("components" "{" components+=MComponentInstance+ "}"
	//	";")? & ("connections" "{" connections+=MConnection+ "}" ";")? & ("libraries" "{" libraries+=MServiceLibraryInstance+
	//	"}" ";")?) "}" ";";
	public MMCADeploymentElements getMMCADeploymentAccess() {
		return (pMMCADeployment != null) ? pMMCADeployment : (pMMCADeployment = new MMCADeploymentElements());
	}
	
	public ParserRule getMMCADeploymentRule() {
		return getMMCADeploymentAccess().getRule();
	}

	//MConnection:
	//	MCommonConnection | MConnectionSwitch;
	public MConnectionElements getMConnectionAccess() {
		return (pMConnection != null) ? pMConnection : (pMConnection = new MConnectionElements());
	}
	
	public ParserRule getMConnectionRule() {
		return getMConnectionAccess().getRule();
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

	//MCommonConnection:
	//	{MCommonConnection} "connection" clientInstance=[MComponentInstance] "." clientPort=[mclevcmp::MClientPort] "<->"
	//	serverInstance=[MComponentInstance] "." serverPort=[mclevcmp::MServerPort] "using"
	//	connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{" ("mapping" ":="
	//	ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
	//	attributeValueAssignments+=MAttributeValueAssignment* "}" ";";
	public MCommonConnectionElements getMCommonConnectionAccess() {
		return (pMCommonConnection != null) ? pMCommonConnection : (pMCommonConnection = new MCommonConnectionElements());
	}
	
	public ParserRule getMCommonConnectionRule() {
		return getMCommonConnectionAccess().getRule();
	}

	//MConnectionSwitch:
	//	{MConnectionSwitch} "switch" "(" clientInstance=[MComponentInstance] "." clientPort=[mclevcmp::MClientPort] ")" "{"
	//	cases+=MConnectionSwitchCase+ "}" ";";
	public MConnectionSwitchElements getMConnectionSwitchAccess() {
		return (pMConnectionSwitch != null) ? pMConnectionSwitch : (pMConnectionSwitch = new MConnectionSwitchElements());
	}
	
	public ParserRule getMConnectionSwitchRule() {
		return getMConnectionSwitchAccess().getRule();
	}

	//MConnectionSwitchCase:
	//	{MConnectionSwitchCase} "case" alternative=[MDeploymentAlternative] ":" serverInstance=[MComponentInstance] "."
	//	serverPort=[mclevcmp::MServerPort] "using" connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{"
	//	("mapping" ":=" ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
	//	attributeValueAssignments+=MAttributeValueAssignment* "}" ";";
	public MConnectionSwitchCaseElements getMConnectionSwitchCaseAccess() {
		return (pMConnectionSwitchCase != null) ? pMConnectionSwitchCase : (pMConnectionSwitchCase = new MConnectionSwitchCaseElements());
	}
	
	public ParserRule getMConnectionSwitchCaseRule() {
		return getMConnectionSwitchCaseAccess().getRule();
	}

	//MComponentInstance:
	//	{MComponentInstance} "instance" component=[mclevcmp::MComponent|VersionedQualifiedName] name=ID "{"
	//	attributeValueAssignments+=MAttributeValueAssignment* "}" ";";
	public MComponentInstanceElements getMComponentInstanceAccess() {
		return (pMComponentInstance != null) ? pMComponentInstance : (pMComponentInstance = new MComponentInstanceElements());
	}
	
	public ParserRule getMComponentInstanceRule() {
		return getMComponentInstanceAccess().getRule();
	}

	//MServiceLibraryInstance:
	//	MRegularServiceLibraryInstance | MDriverSLibInstance;
	public MServiceLibraryInstanceElements getMServiceLibraryInstanceAccess() {
		return (pMServiceLibraryInstance != null) ? pMServiceLibraryInstance : (pMServiceLibraryInstance = new MServiceLibraryInstanceElements());
	}
	
	public ParserRule getMServiceLibraryInstanceRule() {
		return getMServiceLibraryInstanceAccess().getRule();
	}

	//MRegularServiceLibraryInstance returns MServiceLibraryInstance:
	//	"library" library=[mclevslib::MServiceLibrary|VersionedQualifiedName] "{"
	//	attributeValueAssignments+=MAttributeValueAssignment* "}" ";";
	public MRegularServiceLibraryInstanceElements getMRegularServiceLibraryInstanceAccess() {
		return (pMRegularServiceLibraryInstance != null) ? pMRegularServiceLibraryInstance : (pMRegularServiceLibraryInstance = new MRegularServiceLibraryInstanceElements());
	}
	
	public ParserRule getMRegularServiceLibraryInstanceRule() {
		return getMRegularServiceLibraryInstanceAccess().getRule();
	}

	//MDriverSLibInstance:
	//	{MDriverSLibInstance} "driver" library=[mclevslib::MServiceLibrary|VersionedQualifiedName] "{" (("attribute" "values"
	//	"{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("device" "mappings" "{"
	//	deviceDriverMappings+=MDeviceDriverMapping+ "}" ";")?) "}" ";";
	public MDriverSLibInstanceElements getMDriverSLibInstanceAccess() {
		return (pMDriverSLibInstance != null) ? pMDriverSLibInstance : (pMDriverSLibInstance = new MDriverSLibInstanceElements());
	}
	
	public ParserRule getMDriverSLibInstanceRule() {
		return getMDriverSLibInstanceAccess().getRule();
	}

	//MDeviceDriverMapping:
	//	"supported" "device" supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName] "->"
	//	"deployed" "device" deployedDevice=[MDeployedDevice|VersionedQualifiedReferenceName] ";";
	public MDeviceDriverMappingElements getMDeviceDriverMappingAccess() {
		return (pMDeviceDriverMapping != null) ? pMDeviceDriverMapping : (pMDeviceDriverMapping = new MDeviceDriverMappingElements());
	}
	
	public ParserRule getMDeviceDriverMappingRule() {
		return getMDeviceDriverMappingAccess().getRule();
	}

	//MDeploymentAlternative:
	//	{MDeploymentAlternative} "deployment" "alternative" name=ID "{" ("deployment" "platforms" ":="
	//	deploymentPlatforms+=[MDeploymentPlatform] ("," deploymentPlatforms+=[MDeploymentPlatform])* ";" & ("attribute"
	//	"values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("deployment" "alternatives" "{"
	//	deploymentAlternatives+=MDeploymentAlternative+ "}" ";")? & ("components" "{" components+=MComponentInstance+ "}"
	//	";")? & ("connections" "{" connections+=MConnection+ "}" ";")? & ("libraries" "{" libraries+=MServiceLibraryInstance+
	//	"}" ";")?) "}" ";";
	public MDeploymentAlternativeElements getMDeploymentAlternativeAccess() {
		return (pMDeploymentAlternative != null) ? pMDeploymentAlternative : (pMDeploymentAlternative = new MDeploymentAlternativeElements());
	}
	
	public ParserRule getMDeploymentAlternativeRule() {
		return getMDeploymentAlternativeAccess().getRule();
	}

	//MDeploymentPlatform:
	//	"deployment" "platform" name=ID "{" ("platform" ":=" platform=[pdl::MPlatform|VersionedQualifiedName] ";" &
	//	("deployed" "devices" "{" deployedDevices+=MDeployedDevice+ "}" ";")? & ("parameter" "values" "{"
	//	parameterValueAssignments+=MParameterValueAssignment+ "}" ";")?) "}" ";";
	public MDeploymentPlatformElements getMDeploymentPlatformAccess() {
		return (pMDeploymentPlatform != null) ? pMDeploymentPlatform : (pMDeploymentPlatform = new MDeploymentPlatformElements());
	}
	
	public ParserRule getMDeploymentPlatformRule() {
		return getMDeploymentPlatformAccess().getRule();
	}

	//MDeployedDevice:
	//	"device" device=[pdl::MDevice|VersionedQualifiedName] name=ID "{"
	//	parameterValueAssignments+=MParameterValueAssignment* "}" ";";
	public MDeployedDeviceElements getMDeployedDeviceAccess() {
		return (pMDeployedDevice != null) ? pMDeployedDevice : (pMDeployedDevice = new MDeployedDeviceElements());
	}
	
	public ParserRule getMDeployedDeviceRule() {
		return getMDeployedDeviceAccess().getRule();
	}

	//MAttributeValueAssignment returns common::MParameterValueAssignmentSingleExpression:
	//	"attribute" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":="
	//	parameterValue=MParameterValueExpression ";";
	public MAttributeValueAssignmentElements getMAttributeValueAssignmentAccess() {
		return (pMAttributeValueAssignment != null) ? pMAttributeValueAssignment : (pMAttributeValueAssignment = new MAttributeValueAssignmentElements());
	}
	
	public ParserRule getMAttributeValueAssignmentRule() {
		return getMAttributeValueAssignmentAccess().getRule();
	}

	//MParameterValueAssignment returns common::MParameterValueAssignmentSingleExpression:
	//	"parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":="
	//	parameterValue=MParameterValueExpression ";";
	public MParameterValueAssignmentElements getMParameterValueAssignmentAccess() {
		return (pMParameterValueAssignment != null) ? pMParameterValueAssignment : (pMParameterValueAssignment = new MParameterValueAssignmentElements());
	}
	
	public ParserRule getMParameterValueAssignmentRule() {
		return getMParameterValueAssignmentAccess().getRule();
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
