/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
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
public class DEPGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMESPDEPPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPDEPPackageFile");
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
		private final RuleCall cElementMMESPDEPPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMESPDEPPackageFile:
		//	"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
		//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPDEPPackageElement;
		public ParserRule getRule() { return rule; }

		//"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
		//imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPDEPPackageElement
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//package=[mesplibrary::MMESPPackage|QualifiedName]
		public Assignment getPackageAssignment_1() { return cPackageAssignment_1; }

		//[mesplibrary::MMESPPackage|QualifiedName]
		public CrossReference getPackageMMESPPackageCrossReference_1_0() { return cPackageMMESPPackageCrossReference_1_0; }

		//QualifiedName
		public RuleCall getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1() { return cPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1; }

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

		//element=MMESPDEPPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMESPDEPPackageElement
		public RuleCall getElementMMESPDEPPackageElementParserRuleCall_4_0() { return cElementMMESPDEPPackageElementParserRuleCall_4_0; }
	}

	public class MMESPDEPPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPDEPPackageElement");
		private final RuleCall cMMESPDeploymentParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MMESPDEPPackageElement:
		//	MMESPDeployment;
		public ParserRule getRule() { return rule; }

		//MMESPDeployment
		public RuleCall getMMESPDeploymentParserRuleCall() { return cMMESPDeploymentParserRuleCall; }
	}

	public class MMESPDeploymentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPDeployment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMMESPDeploymentAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDeploymentKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cProjectKeyword_2 = (Keyword)cGroup.eContents().get(2);
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
		private final Keyword cConstructionKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cToolKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_5_1_2 = (Keyword)cGroup_5_1.eContents().get(2);
		private final Assignment cCtoolAssignment_5_1_3 = (Assignment)cGroup_5_1.eContents().get(3);
		private final CrossReference cCtoolMConstructionToolCrossReference_5_1_3_0 = (CrossReference)cCtoolAssignment_5_1_3.eContents().get(0);
		private final RuleCall cCtoolMConstructionToolVersionedQualifiedNameParserRuleCall_5_1_3_0_1 = (RuleCall)cCtoolMConstructionToolCrossReference_5_1_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_1_4 = (Keyword)cGroup_5_1.eContents().get(4);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cLanguagesKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_2_1 = (Keyword)cGroup_5_2.eContents().get(1);
		private final Assignment cLanguagesAssignment_5_2_2 = (Assignment)cGroup_5_2.eContents().get(2);
		private final CrossReference cLanguagesMLanguageCrossReference_5_2_2_0 = (CrossReference)cLanguagesAssignment_5_2_2.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_2_2_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_2_2_0.eContents().get(1);
		private final Group cGroup_5_2_3 = (Group)cGroup_5_2.eContents().get(3);
		private final Keyword cCommaKeyword_5_2_3_0 = (Keyword)cGroup_5_2_3.eContents().get(0);
		private final Assignment cLanguagesAssignment_5_2_3_1 = (Assignment)cGroup_5_2_3.eContents().get(1);
		private final CrossReference cLanguagesMLanguageCrossReference_5_2_3_1_0 = (CrossReference)cLanguagesAssignment_5_2_3_1.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_2_3_1_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_2_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_2_4 = (Keyword)cGroup_5_2.eContents().get(4);
		private final Group cGroup_5_3 = (Group)cUnorderedGroup_5.eContents().get(3);
		private final Keyword cDeploymentKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Keyword cPlatformsKeyword_5_3_1 = (Keyword)cGroup_5_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_3_2 = (Keyword)cGroup_5_3.eContents().get(2);
		private final Assignment cDeploymentPlatformsAssignment_5_3_3 = (Assignment)cGroup_5_3.eContents().get(3);
		private final RuleCall cDeploymentPlatformsMMESPDeploymentPlatformParserRuleCall_5_3_3_0 = (RuleCall)cDeploymentPlatformsAssignment_5_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3_4 = (Keyword)cGroup_5_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_3_5 = (Keyword)cGroup_5_3.eContents().get(5);
		private final Group cGroup_5_4 = (Group)cUnorderedGroup_5.eContents().get(4);
		private final Keyword cRequiredKeyword_5_4_0 = (Keyword)cGroup_5_4.eContents().get(0);
		private final Keyword cInterfacesKeyword_5_4_1 = (Keyword)cGroup_5_4.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_4_2 = (Keyword)cGroup_5_4.eContents().get(2);
		private final Assignment cRequiresAssignment_5_4_3 = (Assignment)cGroup_5_4.eContents().get(3);
		private final RuleCall cRequiresMSwPackageRequiredInterfaceParserRuleCall_5_4_3_0 = (RuleCall)cRequiresAssignment_5_4_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4_4 = (Keyword)cGroup_5_4.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_4_5 = (Keyword)cGroup_5_4.eContents().get(5);
		private final Group cGroup_5_5 = (Group)cUnorderedGroup_5.eContents().get(5);
		private final Keyword cSwpackagesKeyword_5_5_0 = (Keyword)cGroup_5_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_5_1 = (Keyword)cGroup_5_5.eContents().get(1);
		private final Assignment cDeployedSwPackagesAssignment_5_5_2 = (Assignment)cGroup_5_5.eContents().get(2);
		private final RuleCall cDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_5_5_2_0 = (RuleCall)cDeployedSwPackagesAssignment_5_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_5_3 = (Keyword)cGroup_5_5.eContents().get(3);
		private final Keyword cSemicolonKeyword_5_5_4 = (Keyword)cGroup_5_5.eContents().get(4);
		private final Group cGroup_5_6 = (Group)cUnorderedGroup_5.eContents().get(6);
		private final Keyword cDeploymentKeyword_5_6_0 = (Keyword)cGroup_5_6.eContents().get(0);
		private final Keyword cAlternativesKeyword_5_6_1 = (Keyword)cGroup_5_6.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_6_2 = (Keyword)cGroup_5_6.eContents().get(2);
		private final Assignment cDeploymentAlternativesAssignment_5_6_3 = (Assignment)cGroup_5_6.eContents().get(3);
		private final RuleCall cDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_5_6_3_0 = (RuleCall)cDeploymentAlternativesAssignment_5_6_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_6_4 = (Keyword)cGroup_5_6.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_6_5 = (Keyword)cGroup_5_6.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MMESPDeployment:
		//	{MMESPDeployment} "deployment" "project" name=ID "{" ("version" ":=" version=Version ";" & "construction" "tool" ":="
		//	ctool=[mespctool::MConstructionTool|VersionedQualifiedName] ";" & ("languages" ":="
		//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//	";")? & "deployment" "platforms" "{" deploymentPlatforms+=MMESPDeploymentPlatform+ "}" ";" & ("required" "interfaces"
		//	"{" requires+=MSwPackageRequiredInterface+ "}" ";")? & ("swpackages" "{" deployedSwPackages+=MMESPSwPackageDeployment+
		//	"}" ";")? & ("deployment" "alternatives" "{" deploymentAlternatives+=MMESPDeploymentAlternative+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//{MMESPDeployment} "deployment" "project" name=ID "{" ("version" ":=" version=Version ";" & "construction" "tool" ":="
		//ctool=[mespctool::MConstructionTool|VersionedQualifiedName] ";" & ("languages" ":="
		//languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//";")? & "deployment" "platforms" "{" deploymentPlatforms+=MMESPDeploymentPlatform+ "}" ";" & ("required" "interfaces"
		//"{" requires+=MSwPackageRequiredInterface+ "}" ";")? & ("swpackages" "{" deployedSwPackages+=MMESPSwPackageDeployment+
		//"}" ";")? & ("deployment" "alternatives" "{" deploymentAlternatives+=MMESPDeploymentAlternative+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//{MMESPDeployment}
		public Action getMMESPDeploymentAction_0() { return cMMESPDeploymentAction_0; }

		//"deployment"
		public Keyword getDeploymentKeyword_1() { return cDeploymentKeyword_1; }

		//"project"
		public Keyword getProjectKeyword_2() { return cProjectKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//"version" ":=" version=Version ";" & "construction" "tool" ":="
		//ctool=[mespctool::MConstructionTool|VersionedQualifiedName] ";" & ("languages" ":="
		//languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//";")? & "deployment" "platforms" "{" deploymentPlatforms+=MMESPDeploymentPlatform+ "}" ";" & ("required" "interfaces"
		//"{" requires+=MSwPackageRequiredInterface+ "}" ";")? & ("swpackages" "{" deployedSwPackages+=MMESPSwPackageDeployment+
		//"}" ";")? & ("deployment" "alternatives" "{" deploymentAlternatives+=MMESPDeploymentAlternative+ "}" ";")?
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

		//"construction" "tool" ":=" ctool=[mespctool::MConstructionTool|VersionedQualifiedName] ";"
		public Group getGroup_5_1() { return cGroup_5_1; }

		//"construction"
		public Keyword getConstructionKeyword_5_1_0() { return cConstructionKeyword_5_1_0; }

		//"tool"
		public Keyword getToolKeyword_5_1_1() { return cToolKeyword_5_1_1; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_1_2() { return cColonEqualsSignKeyword_5_1_2; }

		//ctool=[mespctool::MConstructionTool|VersionedQualifiedName]
		public Assignment getCtoolAssignment_5_1_3() { return cCtoolAssignment_5_1_3; }

		//[mespctool::MConstructionTool|VersionedQualifiedName]
		public CrossReference getCtoolMConstructionToolCrossReference_5_1_3_0() { return cCtoolMConstructionToolCrossReference_5_1_3_0; }

		//VersionedQualifiedName
		public RuleCall getCtoolMConstructionToolVersionedQualifiedNameParserRuleCall_5_1_3_0_1() { return cCtoolMConstructionToolVersionedQualifiedNameParserRuleCall_5_1_3_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_1_4() { return cSemicolonKeyword_5_1_4; }

		//("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ";")?
		public Group getGroup_5_2() { return cGroup_5_2; }

		//"languages"
		public Keyword getLanguagesKeyword_5_2_0() { return cLanguagesKeyword_5_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_2_1() { return cColonEqualsSignKeyword_5_2_1; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_2_2() { return cLanguagesAssignment_5_2_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_2_2_0() { return cLanguagesMLanguageCrossReference_5_2_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_2_2_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_2_2_0_1; }

		//("," languages+=[system::MLanguage|VersionedQualifiedName])*
		public Group getGroup_5_2_3() { return cGroup_5_2_3; }

		//","
		public Keyword getCommaKeyword_5_2_3_0() { return cCommaKeyword_5_2_3_0; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_2_3_1() { return cLanguagesAssignment_5_2_3_1; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_2_3_1_0() { return cLanguagesMLanguageCrossReference_5_2_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_2_3_1_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_2_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_2_4() { return cSemicolonKeyword_5_2_4; }

		//"deployment" "platforms" "{" deploymentPlatforms+=MMESPDeploymentPlatform+ "}" ";"
		public Group getGroup_5_3() { return cGroup_5_3; }

		//"deployment"
		public Keyword getDeploymentKeyword_5_3_0() { return cDeploymentKeyword_5_3_0; }

		//"platforms"
		public Keyword getPlatformsKeyword_5_3_1() { return cPlatformsKeyword_5_3_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_3_2() { return cLeftCurlyBracketKeyword_5_3_2; }

		//deploymentPlatforms+=MMESPDeploymentPlatform+
		public Assignment getDeploymentPlatformsAssignment_5_3_3() { return cDeploymentPlatformsAssignment_5_3_3; }

		//MMESPDeploymentPlatform
		public RuleCall getDeploymentPlatformsMMESPDeploymentPlatformParserRuleCall_5_3_3_0() { return cDeploymentPlatformsMMESPDeploymentPlatformParserRuleCall_5_3_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_3_4() { return cRightCurlyBracketKeyword_5_3_4; }

		//";"
		public Keyword getSemicolonKeyword_5_3_5() { return cSemicolonKeyword_5_3_5; }

		//("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")?
		public Group getGroup_5_4() { return cGroup_5_4; }

		//"required"
		public Keyword getRequiredKeyword_5_4_0() { return cRequiredKeyword_5_4_0; }

		//"interfaces"
		public Keyword getInterfacesKeyword_5_4_1() { return cInterfacesKeyword_5_4_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_4_2() { return cLeftCurlyBracketKeyword_5_4_2; }

		//requires+=MSwPackageRequiredInterface+
		public Assignment getRequiresAssignment_5_4_3() { return cRequiresAssignment_5_4_3; }

		//MSwPackageRequiredInterface
		public RuleCall getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_4_3_0() { return cRequiresMSwPackageRequiredInterfaceParserRuleCall_5_4_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_4_4() { return cRightCurlyBracketKeyword_5_4_4; }

		//";"
		public Keyword getSemicolonKeyword_5_4_5() { return cSemicolonKeyword_5_4_5; }

		//("swpackages" "{" deployedSwPackages+=MMESPSwPackageDeployment+ "}" ";")?
		public Group getGroup_5_5() { return cGroup_5_5; }

		//"swpackages"
		public Keyword getSwpackagesKeyword_5_5_0() { return cSwpackagesKeyword_5_5_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_5_1() { return cLeftCurlyBracketKeyword_5_5_1; }

		//deployedSwPackages+=MMESPSwPackageDeployment+
		public Assignment getDeployedSwPackagesAssignment_5_5_2() { return cDeployedSwPackagesAssignment_5_5_2; }

		//MMESPSwPackageDeployment
		public RuleCall getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_5_5_2_0() { return cDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_5_5_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_5_3() { return cRightCurlyBracketKeyword_5_5_3; }

		//";"
		public Keyword getSemicolonKeyword_5_5_4() { return cSemicolonKeyword_5_5_4; }

		//("deployment" "alternatives" "{" deploymentAlternatives+=MMESPDeploymentAlternative+ "}" ";")?
		public Group getGroup_5_6() { return cGroup_5_6; }

		//"deployment"
		public Keyword getDeploymentKeyword_5_6_0() { return cDeploymentKeyword_5_6_0; }

		//"alternatives"
		public Keyword getAlternativesKeyword_5_6_1() { return cAlternativesKeyword_5_6_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_6_2() { return cLeftCurlyBracketKeyword_5_6_2; }

		//deploymentAlternatives+=MMESPDeploymentAlternative+
		public Assignment getDeploymentAlternativesAssignment_5_6_3() { return cDeploymentAlternativesAssignment_5_6_3; }

		//MMESPDeploymentAlternative
		public RuleCall getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_5_6_3_0() { return cDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_5_6_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_6_4() { return cRightCurlyBracketKeyword_5_6_4; }

		//";"
		public Keyword getSemicolonKeyword_5_6_5() { return cSemicolonKeyword_5_6_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MSwPackageRequiredInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MSwPackageRequiredInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRequiresKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cInterfaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cInterfaceMCommonPackageElementCrossReference_1_0 = (CrossReference)cInterfaceAssignment_1.eContents().get(0);
		private final RuleCall cInterfaceMCommonPackageElementVersionedQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cInterfaceMCommonPackageElementCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cResourceDemandsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cResourceDemandsMResourceDemandParserRuleCall_3_0 = (RuleCall)cResourceDemandsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MSwPackageRequiredInterface returns mespswp::MSwPackageRequiredInterface:
		//	"requires" interface=[common::MCommonPackageElement|VersionedQualifiedName] "{" resourceDemands+=MResourceDemand* "}"
		//	";";
		public ParserRule getRule() { return rule; }

		//"requires" interface=[common::MCommonPackageElement|VersionedQualifiedName] "{" resourceDemands+=MResourceDemand* "}"
		//";"
		public Group getGroup() { return cGroup; }

		//"requires"
		public Keyword getRequiresKeyword_0() { return cRequiresKeyword_0; }

		//interface=[common::MCommonPackageElement|VersionedQualifiedName]
		public Assignment getInterfaceAssignment_1() { return cInterfaceAssignment_1; }

		//[common::MCommonPackageElement|VersionedQualifiedName]
		public CrossReference getInterfaceMCommonPackageElementCrossReference_1_0() { return cInterfaceMCommonPackageElementCrossReference_1_0; }

		//VersionedQualifiedName
		public RuleCall getInterfaceMCommonPackageElementVersionedQualifiedNameParserRuleCall_1_0_1() { return cInterfaceMCommonPackageElementVersionedQualifiedNameParserRuleCall_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//resourceDemands+=MResourceDemand*
		public Assignment getResourceDemandsAssignment_3() { return cResourceDemandsAssignment_3; }

		//MResourceDemand
		public RuleCall getResourceDemandsMResourceDemandParserRuleCall_3_0() { return cResourceDemandsMResourceDemandParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MResourceDemandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MResourceDemand");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMQuantifiableResourceDemandParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMInstantiableResourceDemandParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MResourceDemand returns mespswp::MResourceDemand:
		//	MQuantifiableResourceDemand | MInstantiableResourceDemand;
		public ParserRule getRule() { return rule; }

		//MQuantifiableResourceDemand | MInstantiableResourceDemand
		public Alternatives getAlternatives() { return cAlternatives; }

		//MQuantifiableResourceDemand
		public RuleCall getMQuantifiableResourceDemandParserRuleCall_0() { return cMQuantifiableResourceDemandParserRuleCall_0; }

		//MInstantiableResourceDemand
		public RuleCall getMInstantiableResourceDemandParserRuleCall_1() { return cMInstantiableResourceDemandParserRuleCall_1; }
	}

	public class MInstantiableResourceDemandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MInstantiableResourceDemand");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInstantiableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cResourceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cResourceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cResourceMInstantiableResourceCrossReference_2_0 = (CrossReference)cResourceAssignment_2.eContents().get(0);
		private final RuleCall cResourceMInstantiableResourceVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cResourceMInstantiableResourceCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cParameterValueAssignmentsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0 = (RuleCall)cParameterValueAssignmentsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MInstantiableResourceDemand returns mespswp::MInstantiableResourceDemand:
		//	"instantiable" "resource" resource=[mespcommon::MInstantiableResource|VersionedQualifiedReferenceName] name=ID "{"
		//	parameterValueAssignments+=MParameterValueAssignment* "}" ";";
		public ParserRule getRule() { return rule; }

		//"instantiable" "resource" resource=[mespcommon::MInstantiableResource|VersionedQualifiedReferenceName] name=ID "{"
		//parameterValueAssignments+=MParameterValueAssignment* "}" ";"
		public Group getGroup() { return cGroup; }

		//"instantiable"
		public Keyword getInstantiableKeyword_0() { return cInstantiableKeyword_0; }

		//"resource"
		public Keyword getResourceKeyword_1() { return cResourceKeyword_1; }

		//resource=[mespcommon::MInstantiableResource|VersionedQualifiedReferenceName]
		public Assignment getResourceAssignment_2() { return cResourceAssignment_2; }

		//[mespcommon::MInstantiableResource|VersionedQualifiedReferenceName]
		public CrossReference getResourceMInstantiableResourceCrossReference_2_0() { return cResourceMInstantiableResourceCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getResourceMInstantiableResourceVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cResourceMInstantiableResourceVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//parameterValueAssignments+=MParameterValueAssignment*
		public Assignment getParameterValueAssignmentsAssignment_5() { return cParameterValueAssignmentsAssignment_5; }

		//MParameterValueAssignment
		public RuleCall getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0() { return cParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MQuantifiableResourceDemandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MQuantifiableResourceDemand");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMQuantifiableResourceDemandAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cQuantifiableKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cResourceKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cResourceAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cResourceMQuantifiableResourceCrossReference_3_0 = (CrossReference)cResourceAssignment_3.eContents().get(0);
		private final RuleCall cResourceMQuantifiableResourceVersionedQualifiedReferenceNameParserRuleCall_3_0_1 = (RuleCall)cResourceMQuantifiableResourceCrossReference_3_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cResourceValueAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cResourceValueMParameterValueExpressionParserRuleCall_5_0 = (RuleCall)cResourceValueAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MQuantifiableResourceDemand returns mespswp::MQuantifiableResourceDemand:
		//	{mespswp::MQuantifiableResourceDemand} "quantifiable" "resource"
		//	resource=[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName] ":="
		//	resourceValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//{mespswp::MQuantifiableResourceDemand} "quantifiable" "resource"
		//resource=[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName] ":="
		//resourceValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//{mespswp::MQuantifiableResourceDemand}
		public Action getMQuantifiableResourceDemandAction_0() { return cMQuantifiableResourceDemandAction_0; }

		//"quantifiable"
		public Keyword getQuantifiableKeyword_1() { return cQuantifiableKeyword_1; }

		//"resource"
		public Keyword getResourceKeyword_2() { return cResourceKeyword_2; }

		//resource=[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName]
		public Assignment getResourceAssignment_3() { return cResourceAssignment_3; }

		//[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName]
		public CrossReference getResourceMQuantifiableResourceCrossReference_3_0() { return cResourceMQuantifiableResourceCrossReference_3_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getResourceMQuantifiableResourceVersionedQualifiedReferenceNameParserRuleCall_3_0_1() { return cResourceMQuantifiableResourceVersionedQualifiedReferenceNameParserRuleCall_3_0_1; }

		//":="
		public Keyword getColonEqualsSignKeyword_4() { return cColonEqualsSignKeyword_4; }

		//resourceValue=MParameterValueExpression
		public Assignment getResourceValueAssignment_5() { return cResourceValueAssignment_5; }

		//MParameterValueExpression
		public RuleCall getResourceValueMParameterValueExpressionParserRuleCall_5_0() { return cResourceValueMParameterValueExpressionParserRuleCall_5_0; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
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

	public class MMESPSwPackageDeploymentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPSwPackageDeployment");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMMESPRegularSwPackageDeploymentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMMESPDriverSwPackageDeploymentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MMESPSwPackageDeployment:
		//	MMESPRegularSwPackageDeployment | MMESPDriverSwPackageDeployment;
		public ParserRule getRule() { return rule; }

		//MMESPRegularSwPackageDeployment | MMESPDriverSwPackageDeployment
		public Alternatives getAlternatives() { return cAlternatives; }

		//MMESPRegularSwPackageDeployment
		public RuleCall getMMESPRegularSwPackageDeploymentParserRuleCall_0() { return cMMESPRegularSwPackageDeploymentParserRuleCall_0; }

		//MMESPDriverSwPackageDeployment
		public RuleCall getMMESPDriverSwPackageDeploymentParserRuleCall_1() { return cMMESPDriverSwPackageDeploymentParserRuleCall_1; }
	}

	public class MMESPRegularSwPackageDeploymentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPRegularSwPackageDeployment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMMESPSwPackageDeploymentAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSwpackageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSwPackageAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cSwPackageMSwPackageCrossReference_2_0 = (CrossReference)cSwPackageAssignment_2.eContents().get(0);
		private final RuleCall cSwPackageMSwPackageVersionedQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cSwPackageMSwPackageCrossReference_2_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParameterValueAssignmentsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0 = (RuleCall)cParameterValueAssignmentsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MMESPRegularSwPackageDeployment returns MMESPSwPackageDeployment:
		//	{MMESPSwPackageDeployment} "swpackage" swPackage=[mespswp::MSwPackage|VersionedQualifiedName] "{"
		//	parameterValueAssignments+=MParameterValueAssignment* "}" ";";
		public ParserRule getRule() { return rule; }

		//{MMESPSwPackageDeployment} "swpackage" swPackage=[mespswp::MSwPackage|VersionedQualifiedName] "{"
		//parameterValueAssignments+=MParameterValueAssignment* "}" ";"
		public Group getGroup() { return cGroup; }

		//{MMESPSwPackageDeployment}
		public Action getMMESPSwPackageDeploymentAction_0() { return cMMESPSwPackageDeploymentAction_0; }

		//"swpackage"
		public Keyword getSwpackageKeyword_1() { return cSwpackageKeyword_1; }

		//swPackage=[mespswp::MSwPackage|VersionedQualifiedName]
		public Assignment getSwPackageAssignment_2() { return cSwPackageAssignment_2; }

		//[mespswp::MSwPackage|VersionedQualifiedName]
		public CrossReference getSwPackageMSwPackageCrossReference_2_0() { return cSwPackageMSwPackageCrossReference_2_0; }

		//VersionedQualifiedName
		public RuleCall getSwPackageMSwPackageVersionedQualifiedNameParserRuleCall_2_0_1() { return cSwPackageMSwPackageVersionedQualifiedNameParserRuleCall_2_0_1; }

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

	public class MMESPDriverSwPackageDeploymentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPDriverSwPackageDeployment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMMESPDriverSwPackageDeploymentAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDriverKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSwPackageAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cSwPackageMDriverSwPackageCrossReference_2_0 = (CrossReference)cSwPackageAssignment_2.eContents().get(0);
		private final RuleCall cSwPackageMDriverSwPackageVersionedQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cSwPackageMDriverSwPackageCrossReference_2_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cParameterKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cValuesKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_0_2 = (Keyword)cGroup_4_0.eContents().get(2);
		private final Assignment cParameterValueAssignmentsAssignment_4_0_3 = (Assignment)cGroup_4_0.eContents().get(3);
		private final RuleCall cParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0_3_0 = (RuleCall)cParameterValueAssignmentsAssignment_4_0_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_0_4 = (Keyword)cGroup_4_0.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_0_5 = (Keyword)cGroup_4_0.eContents().get(5);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cDeviceKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cMappingsKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_1_2 = (Keyword)cGroup_4_1.eContents().get(2);
		private final Assignment cDeviceDriverMappingsAssignment_4_1_3 = (Assignment)cGroup_4_1.eContents().get(3);
		private final RuleCall cDeviceDriverMappingsMMESPDeviceDriverMappingParserRuleCall_4_1_3_0 = (RuleCall)cDeviceDriverMappingsAssignment_4_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_1_4 = (Keyword)cGroup_4_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_1_5 = (Keyword)cGroup_4_1.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MMESPDriverSwPackageDeployment:
		//	{MMESPDriverSwPackageDeployment} "driver" swPackage=[mespswp::MDriverSwPackage|VersionedQualifiedName] "{"
		//	(("parameter" "values" "{" parameterValueAssignments+=MParameterValueAssignment+ "}" ";")? & ("device" "mappings" "{"
		//	deviceDriverMappings+=MMESPDeviceDriverMapping+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//{MMESPDriverSwPackageDeployment} "driver" swPackage=[mespswp::MDriverSwPackage|VersionedQualifiedName] "{" (("parameter"
		//"values" "{" parameterValueAssignments+=MParameterValueAssignment+ "}" ";")? & ("device" "mappings" "{"
		//deviceDriverMappings+=MMESPDeviceDriverMapping+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//{MMESPDriverSwPackageDeployment}
		public Action getMMESPDriverSwPackageDeploymentAction_0() { return cMMESPDriverSwPackageDeploymentAction_0; }

		//"driver"
		public Keyword getDriverKeyword_1() { return cDriverKeyword_1; }

		//swPackage=[mespswp::MDriverSwPackage|VersionedQualifiedName]
		public Assignment getSwPackageAssignment_2() { return cSwPackageAssignment_2; }

		//[mespswp::MDriverSwPackage|VersionedQualifiedName]
		public CrossReference getSwPackageMDriverSwPackageCrossReference_2_0() { return cSwPackageMDriverSwPackageCrossReference_2_0; }

		//VersionedQualifiedName
		public RuleCall getSwPackageMDriverSwPackageVersionedQualifiedNameParserRuleCall_2_0_1() { return cSwPackageMDriverSwPackageVersionedQualifiedNameParserRuleCall_2_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("parameter" "values" "{" parameterValueAssignments+=MParameterValueAssignment+ "}" ";")? & ("device" "mappings" "{"
		//deviceDriverMappings+=MMESPDeviceDriverMapping+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//("parameter" "values" "{" parameterValueAssignments+=MParameterValueAssignment+ "}" ";")?
		public Group getGroup_4_0() { return cGroup_4_0; }

		//"parameter"
		public Keyword getParameterKeyword_4_0_0() { return cParameterKeyword_4_0_0; }

		//"values"
		public Keyword getValuesKeyword_4_0_1() { return cValuesKeyword_4_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_0_2() { return cLeftCurlyBracketKeyword_4_0_2; }

		//parameterValueAssignments+=MParameterValueAssignment+
		public Assignment getParameterValueAssignmentsAssignment_4_0_3() { return cParameterValueAssignmentsAssignment_4_0_3; }

		//MParameterValueAssignment
		public RuleCall getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0_3_0() { return cParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_0_4() { return cRightCurlyBracketKeyword_4_0_4; }

		//";"
		public Keyword getSemicolonKeyword_4_0_5() { return cSemicolonKeyword_4_0_5; }

		//("device" "mappings" "{" deviceDriverMappings+=MMESPDeviceDriverMapping+ "}" ";")?
		public Group getGroup_4_1() { return cGroup_4_1; }

		//"device"
		public Keyword getDeviceKeyword_4_1_0() { return cDeviceKeyword_4_1_0; }

		//"mappings"
		public Keyword getMappingsKeyword_4_1_1() { return cMappingsKeyword_4_1_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1_2() { return cLeftCurlyBracketKeyword_4_1_2; }

		//deviceDriverMappings+=MMESPDeviceDriverMapping+
		public Assignment getDeviceDriverMappingsAssignment_4_1_3() { return cDeviceDriverMappingsAssignment_4_1_3; }

		//MMESPDeviceDriverMapping
		public RuleCall getDeviceDriverMappingsMMESPDeviceDriverMappingParserRuleCall_4_1_3_0() { return cDeviceDriverMappingsMMESPDeviceDriverMappingParserRuleCall_4_1_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_1_4() { return cRightCurlyBracketKeyword_4_1_4; }

		//";"
		public Keyword getSemicolonKeyword_4_1_5() { return cSemicolonKeyword_4_1_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MMESPDeviceDriverMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPDeviceDriverMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSupportedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cDeviceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSupportedDeviceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cSupportedDeviceMDriverSwPackageSupportedDeviceCrossReference_2_0 = (CrossReference)cSupportedDeviceAssignment_2.eContents().get(0);
		private final RuleCall cSupportedDeviceMDriverSwPackageSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cSupportedDeviceMDriverSwPackageSupportedDeviceCrossReference_2_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cDeployedKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cDeviceKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDeployedDeviceAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cDeployedDeviceMMESPDeployedDeviceCrossReference_6_0 = (CrossReference)cDeployedDeviceAssignment_6.eContents().get(0);
		private final RuleCall cDeployedDeviceMMESPDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1 = (RuleCall)cDeployedDeviceMMESPDeployedDeviceCrossReference_6_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MMESPDeviceDriverMapping:
		//	"supported" "device" supportedDevice=[mespswp::MDriverSwPackageSupportedDevice|VersionedQualifiedReferenceName] "->"
		//	"deployed" "device" deployedDevice=[MMESPDeployedDevice|VersionedQualifiedReferenceName] ";";
		public ParserRule getRule() { return rule; }

		//"supported" "device" supportedDevice=[mespswp::MDriverSwPackageSupportedDevice|VersionedQualifiedReferenceName] "->"
		//"deployed" "device" deployedDevice=[MMESPDeployedDevice|VersionedQualifiedReferenceName] ";"
		public Group getGroup() { return cGroup; }

		//"supported"
		public Keyword getSupportedKeyword_0() { return cSupportedKeyword_0; }

		//"device"
		public Keyword getDeviceKeyword_1() { return cDeviceKeyword_1; }

		//supportedDevice=[mespswp::MDriverSwPackageSupportedDevice|VersionedQualifiedReferenceName]
		public Assignment getSupportedDeviceAssignment_2() { return cSupportedDeviceAssignment_2; }

		//[mespswp::MDriverSwPackageSupportedDevice|VersionedQualifiedReferenceName]
		public CrossReference getSupportedDeviceMDriverSwPackageSupportedDeviceCrossReference_2_0() { return cSupportedDeviceMDriverSwPackageSupportedDeviceCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getSupportedDeviceMDriverSwPackageSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cSupportedDeviceMDriverSwPackageSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_3() { return cHyphenMinusGreaterThanSignKeyword_3; }

		//"deployed"
		public Keyword getDeployedKeyword_4() { return cDeployedKeyword_4; }

		//"device"
		public Keyword getDeviceKeyword_5() { return cDeviceKeyword_5; }

		//deployedDevice=[MMESPDeployedDevice|VersionedQualifiedReferenceName]
		public Assignment getDeployedDeviceAssignment_6() { return cDeployedDeviceAssignment_6; }

		//[MMESPDeployedDevice|VersionedQualifiedReferenceName]
		public CrossReference getDeployedDeviceMMESPDeployedDeviceCrossReference_6_0() { return cDeployedDeviceMMESPDeployedDeviceCrossReference_6_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getDeployedDeviceMMESPDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1() { return cDeployedDeviceMMESPDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
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

	public class MMESPDeploymentPlatformElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPDeploymentPlatform");
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
		private final Keyword cPswpackageKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Assignment cPlatformSwPackageAssignment_4_1_2 = (Assignment)cGroup_4_1.eContents().get(2);
		private final CrossReference cPlatformSwPackageMPlatformSwPackageCrossReference_4_1_2_0 = (CrossReference)cPlatformSwPackageAssignment_4_1_2.eContents().get(0);
		private final RuleCall cPlatformSwPackageMPlatformSwPackageVersionedQualifiedNameParserRuleCall_4_1_2_0_1 = (RuleCall)cPlatformSwPackageMPlatformSwPackageCrossReference_4_1_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_1_3 = (Keyword)cGroup_4_1.eContents().get(3);
		private final Group cGroup_4_2 = (Group)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cDeployedKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cDevicesKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_2_2 = (Keyword)cGroup_4_2.eContents().get(2);
		private final Assignment cDeployedDevicesAssignment_4_2_3 = (Assignment)cGroup_4_2.eContents().get(3);
		private final RuleCall cDeployedDevicesMMESPDeployedDeviceParserRuleCall_4_2_3_0 = (RuleCall)cDeployedDevicesAssignment_4_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_2_4 = (Keyword)cGroup_4_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_2_5 = (Keyword)cGroup_4_2.eContents().get(5);
		private final Group cGroup_4_3 = (Group)cUnorderedGroup_4.eContents().get(3);
		private final Keyword cParameterKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Keyword cValuesKeyword_4_3_1 = (Keyword)cGroup_4_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_3_2 = (Keyword)cGroup_4_3.eContents().get(2);
		private final Assignment cParameterValueAssignmentsAssignment_4_3_3 = (Assignment)cGroup_4_3.eContents().get(3);
		private final RuleCall cParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_3_3_0 = (RuleCall)cParameterValueAssignmentsAssignment_4_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_3_4 = (Keyword)cGroup_4_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_3_5 = (Keyword)cGroup_4_3.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MMESPDeploymentPlatform:
		//	"deployment" "platform" name=ID "{" ("platform" ":=" platform=[pdl::MPlatform|VersionedQualifiedName] ";" &
		//	"pswpackage" ":=" platformSwPackage=[mesppswp::MPlatformSwPackage|VersionedQualifiedName] ";" & ("deployed" "devices"
		//	"{" deployedDevices+=MMESPDeployedDevice+ "}" ";")? & ("parameter" "values" "{"
		//	parameterValueAssignments+=MParameterValueAssignment+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"deployment" "platform" name=ID "{" ("platform" ":=" platform=[pdl::MPlatform|VersionedQualifiedName] ";" & "pswpackage"
		//":=" platformSwPackage=[mesppswp::MPlatformSwPackage|VersionedQualifiedName] ";" & ("deployed" "devices" "{"
		//deployedDevices+=MMESPDeployedDevice+ "}" ";")? & ("parameter" "values" "{"
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

		//"platform" ":=" platform=[pdl::MPlatform|VersionedQualifiedName] ";" & "pswpackage" ":="
		//platformSwPackage=[mesppswp::MPlatformSwPackage|VersionedQualifiedName] ";" & ("deployed" "devices" "{"
		//deployedDevices+=MMESPDeployedDevice+ "}" ";")? & ("parameter" "values" "{"
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

		//"pswpackage" ":=" platformSwPackage=[mesppswp::MPlatformSwPackage|VersionedQualifiedName] ";"
		public Group getGroup_4_1() { return cGroup_4_1; }

		//"pswpackage"
		public Keyword getPswpackageKeyword_4_1_0() { return cPswpackageKeyword_4_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_1_1() { return cColonEqualsSignKeyword_4_1_1; }

		//platformSwPackage=[mesppswp::MPlatformSwPackage|VersionedQualifiedName]
		public Assignment getPlatformSwPackageAssignment_4_1_2() { return cPlatformSwPackageAssignment_4_1_2; }

		//[mesppswp::MPlatformSwPackage|VersionedQualifiedName]
		public CrossReference getPlatformSwPackageMPlatformSwPackageCrossReference_4_1_2_0() { return cPlatformSwPackageMPlatformSwPackageCrossReference_4_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getPlatformSwPackageMPlatformSwPackageVersionedQualifiedNameParserRuleCall_4_1_2_0_1() { return cPlatformSwPackageMPlatformSwPackageVersionedQualifiedNameParserRuleCall_4_1_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_4_1_3() { return cSemicolonKeyword_4_1_3; }

		//("deployed" "devices" "{" deployedDevices+=MMESPDeployedDevice+ "}" ";")?
		public Group getGroup_4_2() { return cGroup_4_2; }

		//"deployed"
		public Keyword getDeployedKeyword_4_2_0() { return cDeployedKeyword_4_2_0; }

		//"devices"
		public Keyword getDevicesKeyword_4_2_1() { return cDevicesKeyword_4_2_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_2_2() { return cLeftCurlyBracketKeyword_4_2_2; }

		//deployedDevices+=MMESPDeployedDevice+
		public Assignment getDeployedDevicesAssignment_4_2_3() { return cDeployedDevicesAssignment_4_2_3; }

		//MMESPDeployedDevice
		public RuleCall getDeployedDevicesMMESPDeployedDeviceParserRuleCall_4_2_3_0() { return cDeployedDevicesMMESPDeployedDeviceParserRuleCall_4_2_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_2_4() { return cRightCurlyBracketKeyword_4_2_4; }

		//";"
		public Keyword getSemicolonKeyword_4_2_5() { return cSemicolonKeyword_4_2_5; }

		//("parameter" "values" "{" parameterValueAssignments+=MParameterValueAssignment+ "}" ";")?
		public Group getGroup_4_3() { return cGroup_4_3; }

		//"parameter"
		public Keyword getParameterKeyword_4_3_0() { return cParameterKeyword_4_3_0; }

		//"values"
		public Keyword getValuesKeyword_4_3_1() { return cValuesKeyword_4_3_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_3_2() { return cLeftCurlyBracketKeyword_4_3_2; }

		//parameterValueAssignments+=MParameterValueAssignment+
		public Assignment getParameterValueAssignmentsAssignment_4_3_3() { return cParameterValueAssignmentsAssignment_4_3_3; }

		//MParameterValueAssignment
		public RuleCall getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_3_3_0() { return cParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_3_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_3_4() { return cRightCurlyBracketKeyword_4_3_4; }

		//";"
		public Keyword getSemicolonKeyword_4_3_5() { return cSemicolonKeyword_4_3_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MMESPDeployedDeviceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPDeployedDevice");
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
		
		//MMESPDeployedDevice:
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

	public class MMESPDeploymentAlternativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPDeploymentAlternative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeploymentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAlternativeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cDeploymentKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cPlatformsKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_4_0_2 = (Keyword)cGroup_4_0.eContents().get(2);
		private final Assignment cDeploymentPlatformsAssignment_4_0_3 = (Assignment)cGroup_4_0.eContents().get(3);
		private final CrossReference cDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_3_0 = (CrossReference)cDeploymentPlatformsAssignment_4_0_3.eContents().get(0);
		private final RuleCall cDeploymentPlatformsMMESPDeploymentPlatformIDTerminalRuleCall_4_0_3_0_1 = (RuleCall)cDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_3_0.eContents().get(1);
		private final Group cGroup_4_0_4 = (Group)cGroup_4_0.eContents().get(4);
		private final Keyword cCommaKeyword_4_0_4_0 = (Keyword)cGroup_4_0_4.eContents().get(0);
		private final Assignment cDeploymentPlatformsAssignment_4_0_4_1 = (Assignment)cGroup_4_0_4.eContents().get(1);
		private final CrossReference cDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_4_1_0 = (CrossReference)cDeploymentPlatformsAssignment_4_0_4_1.eContents().get(0);
		private final RuleCall cDeploymentPlatformsMMESPDeploymentPlatformIDTerminalRuleCall_4_0_4_1_0_1 = (RuleCall)cDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_4_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_0_5 = (Keyword)cGroup_4_0.eContents().get(5);
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
		private final Keyword cSwpackagesKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Assignment cDeployedSwPackagesAssignment_4_2_2 = (Assignment)cGroup_4_2.eContents().get(2);
		private final RuleCall cDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_4_2_2_0 = (RuleCall)cDeployedSwPackagesAssignment_4_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_2_3 = (Keyword)cGroup_4_2.eContents().get(3);
		private final Keyword cSemicolonKeyword_4_2_4 = (Keyword)cGroup_4_2.eContents().get(4);
		private final Group cGroup_4_3 = (Group)cUnorderedGroup_4.eContents().get(3);
		private final Keyword cRequiredKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Keyword cInterfacesKeyword_4_3_1 = (Keyword)cGroup_4_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_3_2 = (Keyword)cGroup_4_3.eContents().get(2);
		private final Assignment cRequiresAssignment_4_3_3 = (Assignment)cGroup_4_3.eContents().get(3);
		private final RuleCall cRequiresMSwPackageRequiredInterfaceParserRuleCall_4_3_3_0 = (RuleCall)cRequiresAssignment_4_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_3_4 = (Keyword)cGroup_4_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_3_5 = (Keyword)cGroup_4_3.eContents().get(5);
		private final Group cGroup_4_4 = (Group)cUnorderedGroup_4.eContents().get(4);
		private final Keyword cDeploymentKeyword_4_4_0 = (Keyword)cGroup_4_4.eContents().get(0);
		private final Keyword cAlternativesKeyword_4_4_1 = (Keyword)cGroup_4_4.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_4_2 = (Keyword)cGroup_4_4.eContents().get(2);
		private final Assignment cDeploymentAlternativesAssignment_4_4_3 = (Assignment)cGroup_4_4.eContents().get(3);
		private final RuleCall cDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_4_4_3_0 = (RuleCall)cDeploymentAlternativesAssignment_4_4_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4_4 = (Keyword)cGroup_4_4.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_4_5 = (Keyword)cGroup_4_4.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MMESPDeploymentAlternative:
		//	"deployment" "alternative" name=ID "{" ("deployment" "platforms" ":=" deploymentPlatforms+=[MMESPDeploymentPlatform]
		//	("," deploymentPlatforms+=[MMESPDeploymentPlatform])* ";" & ("languages" ":="
		//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//	";")? & ("swpackages" "{" deployedSwPackages+=MMESPSwPackageDeployment+ "}" ";")? & ("required" "interfaces" "{"
		//	requires+=MSwPackageRequiredInterface+ "}" ";")? & ("deployment" "alternatives" "{"
		//	deploymentAlternatives+=MMESPDeploymentAlternative+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"deployment" "alternative" name=ID "{" ("deployment" "platforms" ":=" deploymentPlatforms+=[MMESPDeploymentPlatform]
		//("," deploymentPlatforms+=[MMESPDeploymentPlatform])* ";" & ("languages" ":="
		//languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//";")? & ("swpackages" "{" deployedSwPackages+=MMESPSwPackageDeployment+ "}" ";")? & ("required" "interfaces" "{"
		//requires+=MSwPackageRequiredInterface+ "}" ";")? & ("deployment" "alternatives" "{"
		//deploymentAlternatives+=MMESPDeploymentAlternative+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"deployment"
		public Keyword getDeploymentKeyword_0() { return cDeploymentKeyword_0; }

		//"alternative"
		public Keyword getAlternativeKeyword_1() { return cAlternativeKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//"deployment" "platforms" ":=" deploymentPlatforms+=[MMESPDeploymentPlatform] (","
		//deploymentPlatforms+=[MMESPDeploymentPlatform])* ";" & ("languages" ":="
		//languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//";")? & ("swpackages" "{" deployedSwPackages+=MMESPSwPackageDeployment+ "}" ";")? & ("required" "interfaces" "{"
		//requires+=MSwPackageRequiredInterface+ "}" ";")? & ("deployment" "alternatives" "{"
		//deploymentAlternatives+=MMESPDeploymentAlternative+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//"deployment" "platforms" ":=" deploymentPlatforms+=[MMESPDeploymentPlatform] (","
		//deploymentPlatforms+=[MMESPDeploymentPlatform])* ";"
		public Group getGroup_4_0() { return cGroup_4_0; }

		//"deployment"
		public Keyword getDeploymentKeyword_4_0_0() { return cDeploymentKeyword_4_0_0; }

		//"platforms"
		public Keyword getPlatformsKeyword_4_0_1() { return cPlatformsKeyword_4_0_1; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_0_2() { return cColonEqualsSignKeyword_4_0_2; }

		//deploymentPlatforms+=[MMESPDeploymentPlatform]
		public Assignment getDeploymentPlatformsAssignment_4_0_3() { return cDeploymentPlatformsAssignment_4_0_3; }

		//[MMESPDeploymentPlatform]
		public CrossReference getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_3_0() { return cDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_3_0; }

		//ID
		public RuleCall getDeploymentPlatformsMMESPDeploymentPlatformIDTerminalRuleCall_4_0_3_0_1() { return cDeploymentPlatformsMMESPDeploymentPlatformIDTerminalRuleCall_4_0_3_0_1; }

		//("," deploymentPlatforms+=[MMESPDeploymentPlatform])*
		public Group getGroup_4_0_4() { return cGroup_4_0_4; }

		//","
		public Keyword getCommaKeyword_4_0_4_0() { return cCommaKeyword_4_0_4_0; }

		//deploymentPlatforms+=[MMESPDeploymentPlatform]
		public Assignment getDeploymentPlatformsAssignment_4_0_4_1() { return cDeploymentPlatformsAssignment_4_0_4_1; }

		//[MMESPDeploymentPlatform]
		public CrossReference getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_4_1_0() { return cDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_4_1_0; }

		//ID
		public RuleCall getDeploymentPlatformsMMESPDeploymentPlatformIDTerminalRuleCall_4_0_4_1_0_1() { return cDeploymentPlatformsMMESPDeploymentPlatformIDTerminalRuleCall_4_0_4_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_4_0_5() { return cSemicolonKeyword_4_0_5; }

		//("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ";")?
		public Group getGroup_4_1() { return cGroup_4_1; }

		//"languages"
		public Keyword getLanguagesKeyword_4_1_0() { return cLanguagesKeyword_4_1_0; }

		//":="
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

		//";"
		public Keyword getSemicolonKeyword_4_1_4() { return cSemicolonKeyword_4_1_4; }

		//("swpackages" "{" deployedSwPackages+=MMESPSwPackageDeployment+ "}" ";")?
		public Group getGroup_4_2() { return cGroup_4_2; }

		//"swpackages"
		public Keyword getSwpackagesKeyword_4_2_0() { return cSwpackagesKeyword_4_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_2_1() { return cLeftCurlyBracketKeyword_4_2_1; }

		//deployedSwPackages+=MMESPSwPackageDeployment+
		public Assignment getDeployedSwPackagesAssignment_4_2_2() { return cDeployedSwPackagesAssignment_4_2_2; }

		//MMESPSwPackageDeployment
		public RuleCall getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_4_2_2_0() { return cDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_4_2_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_2_3() { return cRightCurlyBracketKeyword_4_2_3; }

		//";"
		public Keyword getSemicolonKeyword_4_2_4() { return cSemicolonKeyword_4_2_4; }

		//("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")?
		public Group getGroup_4_3() { return cGroup_4_3; }

		//"required"
		public Keyword getRequiredKeyword_4_3_0() { return cRequiredKeyword_4_3_0; }

		//"interfaces"
		public Keyword getInterfacesKeyword_4_3_1() { return cInterfacesKeyword_4_3_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_3_2() { return cLeftCurlyBracketKeyword_4_3_2; }

		//requires+=MSwPackageRequiredInterface+
		public Assignment getRequiresAssignment_4_3_3() { return cRequiresAssignment_4_3_3; }

		//MSwPackageRequiredInterface
		public RuleCall getRequiresMSwPackageRequiredInterfaceParserRuleCall_4_3_3_0() { return cRequiresMSwPackageRequiredInterfaceParserRuleCall_4_3_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_3_4() { return cRightCurlyBracketKeyword_4_3_4; }

		//";"
		public Keyword getSemicolonKeyword_4_3_5() { return cSemicolonKeyword_4_3_5; }

		//("deployment" "alternatives" "{" deploymentAlternatives+=MMESPDeploymentAlternative+ "}" ";")?
		public Group getGroup_4_4() { return cGroup_4_4; }

		//"deployment"
		public Keyword getDeploymentKeyword_4_4_0() { return cDeploymentKeyword_4_4_0; }

		//"alternatives"
		public Keyword getAlternativesKeyword_4_4_1() { return cAlternativesKeyword_4_4_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_4_2() { return cLeftCurlyBracketKeyword_4_4_2; }

		//deploymentAlternatives+=MMESPDeploymentAlternative+
		public Assignment getDeploymentAlternativesAssignment_4_4_3() { return cDeploymentAlternativesAssignment_4_4_3; }

		//MMESPDeploymentAlternative
		public RuleCall getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_4_4_3_0() { return cDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_4_4_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4_4() { return cRightCurlyBracketKeyword_4_4_4; }

		//";"
		public Keyword getSemicolonKeyword_4_4_5() { return cSemicolonKeyword_4_4_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
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
	
	private MMESPDEPPackageFileElements pMMESPDEPPackageFile;
	private MMESPDEPPackageElementElements pMMESPDEPPackageElement;
	private MMESPDeploymentElements pMMESPDeployment;
	private MSwPackageRequiredInterfaceElements pMSwPackageRequiredInterface;
	private MResourceDemandElements pMResourceDemand;
	private MInstantiableResourceDemandElements pMInstantiableResourceDemand;
	private MQuantifiableResourceDemandElements pMQuantifiableResourceDemand;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionedQualifiedNameElements pVersionedQualifiedName;
	private VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private MMESPSwPackageDeploymentElements pMMESPSwPackageDeployment;
	private MMESPRegularSwPackageDeploymentElements pMMESPRegularSwPackageDeployment;
	private MMESPDriverSwPackageDeploymentElements pMMESPDriverSwPackageDeployment;
	private MMESPDeviceDriverMappingElements pMMESPDeviceDriverMapping;
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
	private MMESPDeploymentPlatformElements pMMESPDeploymentPlatform;
	private MMESPDeployedDeviceElements pMMESPDeployedDevice;
	private MMESPDeploymentAlternativeElements pMMESPDeploymentAlternative;
	private EBooleanElements pEBoolean;
	private TerminalRule tHEXADECIMAL;
	private INTEGERElements pINTEGER;
	private REALElements pREAL;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public DEPGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mesp.lang.DEP".equals(grammar.getName())) {
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

	
	//MMESPDEPPackageFile:
	//	"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
	//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPDEPPackageElement;
	public MMESPDEPPackageFileElements getMMESPDEPPackageFileAccess() {
		return (pMMESPDEPPackageFile != null) ? pMMESPDEPPackageFile : (pMMESPDEPPackageFile = new MMESPDEPPackageFileElements());
	}
	
	public ParserRule getMMESPDEPPackageFileRule() {
		return getMMESPDEPPackageFileAccess().getRule();
	}

	//MMESPDEPPackageElement:
	//	MMESPDeployment;
	public MMESPDEPPackageElementElements getMMESPDEPPackageElementAccess() {
		return (pMMESPDEPPackageElement != null) ? pMMESPDEPPackageElement : (pMMESPDEPPackageElement = new MMESPDEPPackageElementElements());
	}
	
	public ParserRule getMMESPDEPPackageElementRule() {
		return getMMESPDEPPackageElementAccess().getRule();
	}

	//MMESPDeployment:
	//	{MMESPDeployment} "deployment" "project" name=ID "{" ("version" ":=" version=Version ";" & "construction" "tool" ":="
	//	ctool=[mespctool::MConstructionTool|VersionedQualifiedName] ";" & ("languages" ":="
	//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
	//	";")? & "deployment" "platforms" "{" deploymentPlatforms+=MMESPDeploymentPlatform+ "}" ";" & ("required" "interfaces"
	//	"{" requires+=MSwPackageRequiredInterface+ "}" ";")? & ("swpackages" "{" deployedSwPackages+=MMESPSwPackageDeployment+
	//	"}" ";")? & ("deployment" "alternatives" "{" deploymentAlternatives+=MMESPDeploymentAlternative+ "}" ";")?) "}" ";";
	public MMESPDeploymentElements getMMESPDeploymentAccess() {
		return (pMMESPDeployment != null) ? pMMESPDeployment : (pMMESPDeployment = new MMESPDeploymentElements());
	}
	
	public ParserRule getMMESPDeploymentRule() {
		return getMMESPDeploymentAccess().getRule();
	}

	//MSwPackageRequiredInterface returns mespswp::MSwPackageRequiredInterface:
	//	"requires" interface=[common::MCommonPackageElement|VersionedQualifiedName] "{" resourceDemands+=MResourceDemand* "}"
	//	";";
	public MSwPackageRequiredInterfaceElements getMSwPackageRequiredInterfaceAccess() {
		return (pMSwPackageRequiredInterface != null) ? pMSwPackageRequiredInterface : (pMSwPackageRequiredInterface = new MSwPackageRequiredInterfaceElements());
	}
	
	public ParserRule getMSwPackageRequiredInterfaceRule() {
		return getMSwPackageRequiredInterfaceAccess().getRule();
	}

	//MResourceDemand returns mespswp::MResourceDemand:
	//	MQuantifiableResourceDemand | MInstantiableResourceDemand;
	public MResourceDemandElements getMResourceDemandAccess() {
		return (pMResourceDemand != null) ? pMResourceDemand : (pMResourceDemand = new MResourceDemandElements());
	}
	
	public ParserRule getMResourceDemandRule() {
		return getMResourceDemandAccess().getRule();
	}

	//MInstantiableResourceDemand returns mespswp::MInstantiableResourceDemand:
	//	"instantiable" "resource" resource=[mespcommon::MInstantiableResource|VersionedQualifiedReferenceName] name=ID "{"
	//	parameterValueAssignments+=MParameterValueAssignment* "}" ";";
	public MInstantiableResourceDemandElements getMInstantiableResourceDemandAccess() {
		return (pMInstantiableResourceDemand != null) ? pMInstantiableResourceDemand : (pMInstantiableResourceDemand = new MInstantiableResourceDemandElements());
	}
	
	public ParserRule getMInstantiableResourceDemandRule() {
		return getMInstantiableResourceDemandAccess().getRule();
	}

	//MQuantifiableResourceDemand returns mespswp::MQuantifiableResourceDemand:
	//	{mespswp::MQuantifiableResourceDemand} "quantifiable" "resource"
	//	resource=[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName] ":="
	//	resourceValue=MParameterValueExpression ";";
	public MQuantifiableResourceDemandElements getMQuantifiableResourceDemandAccess() {
		return (pMQuantifiableResourceDemand != null) ? pMQuantifiableResourceDemand : (pMQuantifiableResourceDemand = new MQuantifiableResourceDemandElements());
	}
	
	public ParserRule getMQuantifiableResourceDemandRule() {
		return getMQuantifiableResourceDemandAccess().getRule();
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

	//MMESPSwPackageDeployment:
	//	MMESPRegularSwPackageDeployment | MMESPDriverSwPackageDeployment;
	public MMESPSwPackageDeploymentElements getMMESPSwPackageDeploymentAccess() {
		return (pMMESPSwPackageDeployment != null) ? pMMESPSwPackageDeployment : (pMMESPSwPackageDeployment = new MMESPSwPackageDeploymentElements());
	}
	
	public ParserRule getMMESPSwPackageDeploymentRule() {
		return getMMESPSwPackageDeploymentAccess().getRule();
	}

	//MMESPRegularSwPackageDeployment returns MMESPSwPackageDeployment:
	//	{MMESPSwPackageDeployment} "swpackage" swPackage=[mespswp::MSwPackage|VersionedQualifiedName] "{"
	//	parameterValueAssignments+=MParameterValueAssignment* "}" ";";
	public MMESPRegularSwPackageDeploymentElements getMMESPRegularSwPackageDeploymentAccess() {
		return (pMMESPRegularSwPackageDeployment != null) ? pMMESPRegularSwPackageDeployment : (pMMESPRegularSwPackageDeployment = new MMESPRegularSwPackageDeploymentElements());
	}
	
	public ParserRule getMMESPRegularSwPackageDeploymentRule() {
		return getMMESPRegularSwPackageDeploymentAccess().getRule();
	}

	//MMESPDriverSwPackageDeployment:
	//	{MMESPDriverSwPackageDeployment} "driver" swPackage=[mespswp::MDriverSwPackage|VersionedQualifiedName] "{"
	//	(("parameter" "values" "{" parameterValueAssignments+=MParameterValueAssignment+ "}" ";")? & ("device" "mappings" "{"
	//	deviceDriverMappings+=MMESPDeviceDriverMapping+ "}" ";")?) "}" ";";
	public MMESPDriverSwPackageDeploymentElements getMMESPDriverSwPackageDeploymentAccess() {
		return (pMMESPDriverSwPackageDeployment != null) ? pMMESPDriverSwPackageDeployment : (pMMESPDriverSwPackageDeployment = new MMESPDriverSwPackageDeploymentElements());
	}
	
	public ParserRule getMMESPDriverSwPackageDeploymentRule() {
		return getMMESPDriverSwPackageDeploymentAccess().getRule();
	}

	//MMESPDeviceDriverMapping:
	//	"supported" "device" supportedDevice=[mespswp::MDriverSwPackageSupportedDevice|VersionedQualifiedReferenceName] "->"
	//	"deployed" "device" deployedDevice=[MMESPDeployedDevice|VersionedQualifiedReferenceName] ";";
	public MMESPDeviceDriverMappingElements getMMESPDeviceDriverMappingAccess() {
		return (pMMESPDeviceDriverMapping != null) ? pMMESPDeviceDriverMapping : (pMMESPDeviceDriverMapping = new MMESPDeviceDriverMappingElements());
	}
	
	public ParserRule getMMESPDeviceDriverMappingRule() {
		return getMMESPDeviceDriverMappingAccess().getRule();
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

	//MMESPDeploymentPlatform:
	//	"deployment" "platform" name=ID "{" ("platform" ":=" platform=[pdl::MPlatform|VersionedQualifiedName] ";" &
	//	"pswpackage" ":=" platformSwPackage=[mesppswp::MPlatformSwPackage|VersionedQualifiedName] ";" & ("deployed" "devices"
	//	"{" deployedDevices+=MMESPDeployedDevice+ "}" ";")? & ("parameter" "values" "{"
	//	parameterValueAssignments+=MParameterValueAssignment+ "}" ";")?) "}" ";";
	public MMESPDeploymentPlatformElements getMMESPDeploymentPlatformAccess() {
		return (pMMESPDeploymentPlatform != null) ? pMMESPDeploymentPlatform : (pMMESPDeploymentPlatform = new MMESPDeploymentPlatformElements());
	}
	
	public ParserRule getMMESPDeploymentPlatformRule() {
		return getMMESPDeploymentPlatformAccess().getRule();
	}

	//MMESPDeployedDevice:
	//	"device" device=[pdl::MDevice|VersionedQualifiedName] name=ID "{"
	//	parameterValueAssignments+=MParameterValueAssignment* "}" ";";
	public MMESPDeployedDeviceElements getMMESPDeployedDeviceAccess() {
		return (pMMESPDeployedDevice != null) ? pMMESPDeployedDevice : (pMMESPDeployedDevice = new MMESPDeployedDeviceElements());
	}
	
	public ParserRule getMMESPDeployedDeviceRule() {
		return getMMESPDeployedDeviceAccess().getRule();
	}

	//MMESPDeploymentAlternative:
	//	"deployment" "alternative" name=ID "{" ("deployment" "platforms" ":=" deploymentPlatforms+=[MMESPDeploymentPlatform]
	//	("," deploymentPlatforms+=[MMESPDeploymentPlatform])* ";" & ("languages" ":="
	//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
	//	";")? & ("swpackages" "{" deployedSwPackages+=MMESPSwPackageDeployment+ "}" ";")? & ("required" "interfaces" "{"
	//	requires+=MSwPackageRequiredInterface+ "}" ";")? & ("deployment" "alternatives" "{"
	//	deploymentAlternatives+=MMESPDeploymentAlternative+ "}" ";")?) "}" ";";
	public MMESPDeploymentAlternativeElements getMMESPDeploymentAlternativeAccess() {
		return (pMMESPDeploymentAlternative != null) ? pMMESPDeploymentAlternative : (pMMESPDeploymentAlternative = new MMESPDeploymentAlternativeElements());
	}
	
	public ParserRule getMMESPDeploymentAlternativeRule() {
		return getMMESPDeploymentAlternativeAccess().getRule();
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
