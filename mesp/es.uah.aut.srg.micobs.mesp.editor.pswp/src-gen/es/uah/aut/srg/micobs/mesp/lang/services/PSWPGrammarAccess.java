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
public class PSWPGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMESPPSWPPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPPSWPPackageFile");
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
		private final RuleCall cElementMMESPPSWPPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMESPPSWPPackageFile:
		//	"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
		//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPPSWPPackageElement;
		public ParserRule getRule() { return rule; }

		//"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
		//imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPPSWPPackageElement
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

		//element=MMESPPSWPPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMESPPSWPPackageElement
		public RuleCall getElementMMESPPSWPPackageElementParserRuleCall_4_0() { return cElementMMESPPSWPPackageElementParserRuleCall_4_0; }
	}

	public class MMESPPSWPPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPPSWPPackageElement");
		private final RuleCall cMPlatformSwPackageParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MMESPPSWPPackageElement:
		//	MPlatformSwPackage;
		public ParserRule getRule() { return rule; }

		//MPlatformSwPackage
		public RuleCall getMPlatformSwPackageParserRuleCall() { return cMPlatformSwPackageParserRuleCall; }
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

	public class MPlatformSwPackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MPlatformSwPackage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPswpackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cVersionKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cVersionAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_3_0_2_0 = (RuleCall)cVersionAssignment_3_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cSupportedPlatformKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cReferencedElementAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final CrossReference cReferencedElementMPlatformCrossReference_3_1_2_0 = (CrossReference)cReferencedElementAssignment_3_1_2.eContents().get(0);
		private final RuleCall cReferencedElementMPlatformVersionedQualifiedNameParserRuleCall_3_1_2_0_1 = (RuleCall)cReferencedElementMPlatformCrossReference_3_1_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cConstructionToolsKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cCtoolsAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final CrossReference cCtoolsMConstructionToolCrossReference_3_2_2_0 = (CrossReference)cCtoolsAssignment_3_2_2.eContents().get(0);
		private final RuleCall cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_2_0_1 = (RuleCall)cCtoolsMConstructionToolCrossReference_3_2_2_0.eContents().get(1);
		private final Group cGroup_3_2_3 = (Group)cGroup_3_2.eContents().get(3);
		private final Keyword cCommaKeyword_3_2_3_0 = (Keyword)cGroup_3_2_3.eContents().get(0);
		private final Assignment cCtoolsAssignment_3_2_3_1 = (Assignment)cGroup_3_2_3.eContents().get(1);
		private final CrossReference cCtoolsMConstructionToolCrossReference_3_2_3_1_0 = (CrossReference)cCtoolsAssignment_3_2_3_1.eContents().get(0);
		private final RuleCall cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_3_1_0_1 = (RuleCall)cCtoolsMConstructionToolCrossReference_3_2_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_2_4 = (Keyword)cGroup_3_2.eContents().get(4);
		private final Group cGroup_3_3 = (Group)cUnorderedGroup_3.eContents().get(3);
		private final Keyword cOsswpackagesKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_3_1 = (Keyword)cGroup_3_3.eContents().get(1);
		private final Assignment cOsSwPackagesAssignment_3_3_2 = (Assignment)cGroup_3_3.eContents().get(2);
		private final CrossReference cOsSwPackagesMOSSwPackageCrossReference_3_3_2_0 = (CrossReference)cOsSwPackagesAssignment_3_3_2.eContents().get(0);
		private final RuleCall cOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_2_0_1 = (RuleCall)cOsSwPackagesMOSSwPackageCrossReference_3_3_2_0.eContents().get(1);
		private final Group cGroup_3_3_3 = (Group)cGroup_3_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_3_0 = (Keyword)cGroup_3_3_3.eContents().get(0);
		private final Assignment cOsSwPackagesAssignment_3_3_3_1 = (Assignment)cGroup_3_3_3.eContents().get(1);
		private final CrossReference cOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0 = (CrossReference)cOsSwPackagesAssignment_3_3_3_1.eContents().get(0);
		private final RuleCall cOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_3_1_0_1 = (RuleCall)cOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_3_4 = (Keyword)cGroup_3_3.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MPlatformSwPackage:
		//	"pswpackage" name=ID "{" ("version" ":=" version=Version ";" & "supported platform" ":="
		//	referencedElement=[pdl::MPlatform|VersionedQualifiedName] ";" & "construction tools" ":="
		//	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & "osswpackages" ":="
		//	osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName] (","
		//	osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName])* ";") "}" ";";
		public ParserRule getRule() { return rule; }

		//"pswpackage" name=ID "{" ("version" ":=" version=Version ";" & "supported platform" ":="
		//referencedElement=[pdl::MPlatform|VersionedQualifiedName] ";" & "construction tools" ":="
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & "osswpackages" ":="
		//osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName] (","
		//osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName])* ";") "}" ";"
		public Group getGroup() { return cGroup; }

		//"pswpackage"
		public Keyword getPswpackageKeyword_0() { return cPswpackageKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"version" ":=" version=Version ";" & "supported platform" ":=" referencedElement=[pdl::MPlatform|VersionedQualifiedName]
		//";" & "construction tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & "osswpackages" ":="
		//osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName] (","
		//osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName])* ";"
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }

		//"version" ":=" version=Version ";"
		public Group getGroup_3_0() { return cGroup_3_0; }

		//"version"
		public Keyword getVersionKeyword_3_0_0() { return cVersionKeyword_3_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_0_1() { return cColonEqualsSignKeyword_3_0_1; }

		//version=Version
		public Assignment getVersionAssignment_3_0_2() { return cVersionAssignment_3_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_3_0_2_0() { return cVersionVersionParserRuleCall_3_0_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3_0_3() { return cSemicolonKeyword_3_0_3; }

		//"supported platform" ":=" referencedElement=[pdl::MPlatform|VersionedQualifiedName] ";"
		public Group getGroup_3_1() { return cGroup_3_1; }

		//"supported platform"
		public Keyword getSupportedPlatformKeyword_3_1_0() { return cSupportedPlatformKeyword_3_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_1_1() { return cColonEqualsSignKeyword_3_1_1; }

		//referencedElement=[pdl::MPlatform|VersionedQualifiedName]
		public Assignment getReferencedElementAssignment_3_1_2() { return cReferencedElementAssignment_3_1_2; }

		//[pdl::MPlatform|VersionedQualifiedName]
		public CrossReference getReferencedElementMPlatformCrossReference_3_1_2_0() { return cReferencedElementMPlatformCrossReference_3_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getReferencedElementMPlatformVersionedQualifiedNameParserRuleCall_3_1_2_0_1() { return cReferencedElementMPlatformVersionedQualifiedNameParserRuleCall_3_1_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_1_3() { return cSemicolonKeyword_3_1_3; }

		//"construction tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";"
		public Group getGroup_3_2() { return cGroup_3_2; }

		//"construction tools"
		public Keyword getConstructionToolsKeyword_3_2_0() { return cConstructionToolsKeyword_3_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_2_1() { return cColonEqualsSignKeyword_3_2_1; }

		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
		public Assignment getCtoolsAssignment_3_2_2() { return cCtoolsAssignment_3_2_2; }

		//[mespctool::MConstructionTool|VersionedQualifiedName]
		public CrossReference getCtoolsMConstructionToolCrossReference_3_2_2_0() { return cCtoolsMConstructionToolCrossReference_3_2_2_0; }

		//VersionedQualifiedName
		public RuleCall getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_2_0_1() { return cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_2_0_1; }

		//("," ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])*
		public Group getGroup_3_2_3() { return cGroup_3_2_3; }

		//","
		public Keyword getCommaKeyword_3_2_3_0() { return cCommaKeyword_3_2_3_0; }

		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
		public Assignment getCtoolsAssignment_3_2_3_1() { return cCtoolsAssignment_3_2_3_1; }

		//[mespctool::MConstructionTool|VersionedQualifiedName]
		public CrossReference getCtoolsMConstructionToolCrossReference_3_2_3_1_0() { return cCtoolsMConstructionToolCrossReference_3_2_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_3_1_0_1() { return cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_2_4() { return cSemicolonKeyword_3_2_4; }

		//"osswpackages" ":=" osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName] (","
		//osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName])* ";"
		public Group getGroup_3_3() { return cGroup_3_3; }

		//"osswpackages"
		public Keyword getOsswpackagesKeyword_3_3_0() { return cOsswpackagesKeyword_3_3_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_3_1() { return cColonEqualsSignKeyword_3_3_1; }

		//osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName]
		public Assignment getOsSwPackagesAssignment_3_3_2() { return cOsSwPackagesAssignment_3_3_2; }

		//[mesposswp::MOSSwPackage|VersionedQualifiedName]
		public CrossReference getOsSwPackagesMOSSwPackageCrossReference_3_3_2_0() { return cOsSwPackagesMOSSwPackageCrossReference_3_3_2_0; }

		//VersionedQualifiedName
		public RuleCall getOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_2_0_1() { return cOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_2_0_1; }

		//("," osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName])*
		public Group getGroup_3_3_3() { return cGroup_3_3_3; }

		//","
		public Keyword getCommaKeyword_3_3_3_0() { return cCommaKeyword_3_3_3_0; }

		//osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName]
		public Assignment getOsSwPackagesAssignment_3_3_3_1() { return cOsSwPackagesAssignment_3_3_3_1; }

		//[mesposswp::MOSSwPackage|VersionedQualifiedName]
		public CrossReference getOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0() { return cOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_3_1_0_1() { return cOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_3_4() { return cSemicolonKeyword_3_3_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	
	
	private MMESPPSWPPackageFileElements pMMESPPSWPPackageFile;
	private MMESPPSWPPackageElementElements pMMESPPSWPPackageElement;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionedQualifiedNameElements pVersionedQualifiedName;
	private VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private MPlatformSwPackageElements pMPlatformSwPackage;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public PSWPGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mesp.lang.PSWP".equals(grammar.getName())) {
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

	
	//MMESPPSWPPackageFile:
	//	"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
	//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPPSWPPackageElement;
	public MMESPPSWPPackageFileElements getMMESPPSWPPackageFileAccess() {
		return (pMMESPPSWPPackageFile != null) ? pMMESPPSWPPackageFile : (pMMESPPSWPPackageFile = new MMESPPSWPPackageFileElements());
	}
	
	public ParserRule getMMESPPSWPPackageFileRule() {
		return getMMESPPSWPPackageFileAccess().getRule();
	}

	//MMESPPSWPPackageElement:
	//	MPlatformSwPackage;
	public MMESPPSWPPackageElementElements getMMESPPSWPPackageElementAccess() {
		return (pMMESPPSWPPackageElement != null) ? pMMESPPSWPPackageElement : (pMMESPPSWPPackageElement = new MMESPPSWPPackageElementElements());
	}
	
	public ParserRule getMMESPPSWPPackageElementRule() {
		return getMMESPPSWPPackageElementAccess().getRule();
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

	//MPlatformSwPackage:
	//	"pswpackage" name=ID "{" ("version" ":=" version=Version ";" & "supported platform" ":="
	//	referencedElement=[pdl::MPlatform|VersionedQualifiedName] ";" & "construction tools" ":="
	//	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
	//	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & "osswpackages" ":="
	//	osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName] (","
	//	osSwPackages+=[mesposswp::MOSSwPackage|VersionedQualifiedName])* ";") "}" ";";
	public MPlatformSwPackageElements getMPlatformSwPackageAccess() {
		return (pMPlatformSwPackage != null) ? pMPlatformSwPackage : (pMPlatformSwPackage = new MPlatformSwPackageElements());
	}
	
	public ParserRule getMPlatformSwPackageRule() {
		return getMPlatformSwPackageAccess().getRule();
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
