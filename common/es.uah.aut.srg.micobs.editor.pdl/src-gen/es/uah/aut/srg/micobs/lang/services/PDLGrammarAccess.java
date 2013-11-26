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
package es.uah.aut.srg.micobs.lang.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class PDLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MPDLPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MPDLPackageFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPackageMPDLPackageCrossReference_1_0 = (CrossReference)cPackageAssignment_1.eContents().get(0);
		private final RuleCall cPackageMPDLPackageQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cPackageMPDLPackageCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cImportKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cImportsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cImportsMCommonPackageCrossReference_3_1_0 = (CrossReference)cImportsAssignment_3_1.eContents().get(0);
		private final RuleCall cImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cImportsMCommonPackageCrossReference_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cElementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementMPDLPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MPDLPackageFile:
		//	"package" package=[pdllibrary::MPDLPackage|QualifiedName] ";" ("import"
		//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MPDLPackageElement;
		public ParserRule getRule() { return rule; }

		//"package" package=[pdllibrary::MPDLPackage|QualifiedName] ";" ("import" imports+=[common::MCommonPackage|QualifiedName]
		//";")* element=MPDLPackageElement
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//package=[pdllibrary::MPDLPackage|QualifiedName]
		public Assignment getPackageAssignment_1() { return cPackageAssignment_1; }

		//[pdllibrary::MPDLPackage|QualifiedName]
		public CrossReference getPackageMPDLPackageCrossReference_1_0() { return cPackageMPDLPackageCrossReference_1_0; }

		//QualifiedName
		public RuleCall getPackageMPDLPackageQualifiedNameParserRuleCall_1_0_1() { return cPackageMPDLPackageQualifiedNameParserRuleCall_1_0_1; }

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

		//element=MPDLPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MPDLPackageElement
		public RuleCall getElementMPDLPackageElementParserRuleCall_4_0() { return cElementMPDLPackageElementParserRuleCall_4_0; }
	}

	public class MPDLPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MPDLPackageElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMBoardParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMMicroprocessorParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMOperatingSystemParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMOperatingSystemAPIParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cMArchitectureParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cMPlatformParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cMCompilerParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cMDeviceParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		
		//MPDLPackageElement:
		//	MBoard | MMicroprocessor | MOperatingSystem | MOperatingSystemAPI | MArchitecture | MPlatform | MCompiler | MDevice;
		public ParserRule getRule() { return rule; }

		//MBoard | MMicroprocessor | MOperatingSystem | MOperatingSystemAPI | MArchitecture | MPlatform | MCompiler | MDevice
		public Alternatives getAlternatives() { return cAlternatives; }

		//MBoard
		public RuleCall getMBoardParserRuleCall_0() { return cMBoardParserRuleCall_0; }

		//MMicroprocessor
		public RuleCall getMMicroprocessorParserRuleCall_1() { return cMMicroprocessorParserRuleCall_1; }

		//MOperatingSystem
		public RuleCall getMOperatingSystemParserRuleCall_2() { return cMOperatingSystemParserRuleCall_2; }

		//MOperatingSystemAPI
		public RuleCall getMOperatingSystemAPIParserRuleCall_3() { return cMOperatingSystemAPIParserRuleCall_3; }

		//MArchitecture
		public RuleCall getMArchitectureParserRuleCall_4() { return cMArchitectureParserRuleCall_4; }

		//MPlatform
		public RuleCall getMPlatformParserRuleCall_5() { return cMPlatformParserRuleCall_5; }

		//MCompiler
		public RuleCall getMCompilerParserRuleCall_6() { return cMCompilerParserRuleCall_6; }

		//MDevice
		public RuleCall getMDeviceParserRuleCall_7() { return cMDeviceParserRuleCall_7; }
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

	public class MCompilerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MCompiler");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCompilerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cExtendsMCompilerCrossReference_2_1_0 = (CrossReference)cExtendsAssignment_2_1.eContents().get(0);
		private final RuleCall cExtendsMCompilerVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cExtendsMCompilerCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cExtendsMCompilerCrossReference_2_2_1_0 = (CrossReference)cExtendsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cExtendsMCompilerVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cExtendsMCompilerCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cVersionKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Assignment cVersionAssignment_4_0_2 = (Assignment)cGroup_4_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_4_0_2_0 = (RuleCall)cVersionAssignment_4_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cFrontendsKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Assignment cFrontendsAssignment_4_1_2 = (Assignment)cGroup_4_1.eContents().get(2);
		private final RuleCall cFrontendsMCompilerFrontendParserRuleCall_4_1_2_0 = (RuleCall)cFrontendsAssignment_4_1_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_1_3 = (Keyword)cGroup_4_1.eContents().get(3);
		private final Keyword cSemicolonKeyword_4_1_4 = (Keyword)cGroup_4_1.eContents().get(4);
		private final Group cGroup_4_2 = (Group)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cConfigurationKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cParametersKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_2_2 = (Keyword)cGroup_4_2.eContents().get(2);
		private final Assignment cParametersAssignment_4_2_3 = (Assignment)cGroup_4_2.eContents().get(3);
		private final RuleCall cParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0 = (RuleCall)cParametersAssignment_4_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_2_4 = (Keyword)cGroup_4_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_2_5 = (Keyword)cGroup_4_2.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MCompiler:
		//	"compiler" name=ID ("extends" extends+=[MCompiler|VersionedQualifiedName] (","
		//	extends+=[MCompiler|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("frontends" "{"
		//	frontends+=MCompilerFrontend+ "}" ";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}"
		//	";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"compiler" name=ID ("extends" extends+=[MCompiler|VersionedQualifiedName] (","
		//extends+=[MCompiler|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("frontends" "{"
		//frontends+=MCompilerFrontend+ "}" ";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}"
		//";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"compiler"
		public Keyword getCompilerKeyword_0() { return cCompilerKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("extends" extends+=[MCompiler|VersionedQualifiedName] ("," extends+=[MCompiler|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//"extends"
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//extends+=[MCompiler|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_1() { return cExtendsAssignment_2_1; }

		//[MCompiler|VersionedQualifiedName]
		public CrossReference getExtendsMCompilerCrossReference_2_1_0() { return cExtendsMCompilerCrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMCompilerVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cExtendsMCompilerVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," extends+=[MCompiler|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//extends+=[MCompiler|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_2_1() { return cExtendsAssignment_2_2_1; }

		//[MCompiler|VersionedQualifiedName]
		public CrossReference getExtendsMCompilerCrossReference_2_2_1_0() { return cExtendsMCompilerCrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMCompilerVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cExtendsMCompilerVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//"version" ":=" version=Version ";" & ("frontends" "{" frontends+=MCompilerFrontend+ "}" ";")? & ("configuration"
		//"parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//"version" ":=" version=Version ";"
		public Group getGroup_4_0() { return cGroup_4_0; }

		//"version"
		public Keyword getVersionKeyword_4_0_0() { return cVersionKeyword_4_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_0_1() { return cColonEqualsSignKeyword_4_0_1; }

		//version=Version
		public Assignment getVersionAssignment_4_0_2() { return cVersionAssignment_4_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_4_0_2_0() { return cVersionVersionParserRuleCall_4_0_2_0; }

		//";"
		public Keyword getSemicolonKeyword_4_0_3() { return cSemicolonKeyword_4_0_3; }

		//("frontends" "{" frontends+=MCompilerFrontend+ "}" ";")?
		public Group getGroup_4_1() { return cGroup_4_1; }

		//"frontends"
		public Keyword getFrontendsKeyword_4_1_0() { return cFrontendsKeyword_4_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1_1() { return cLeftCurlyBracketKeyword_4_1_1; }

		//frontends+=MCompilerFrontend+
		public Assignment getFrontendsAssignment_4_1_2() { return cFrontendsAssignment_4_1_2; }

		//MCompilerFrontend
		public RuleCall getFrontendsMCompilerFrontendParserRuleCall_4_1_2_0() { return cFrontendsMCompilerFrontendParserRuleCall_4_1_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_1_3() { return cRightCurlyBracketKeyword_4_1_3; }

		//";"
		public Keyword getSemicolonKeyword_4_1_4() { return cSemicolonKeyword_4_1_4; }

		//("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public Group getGroup_4_2() { return cGroup_4_2; }

		//"configuration"
		public Keyword getConfigurationKeyword_4_2_0() { return cConfigurationKeyword_4_2_0; }

		//"parameters"
		public Keyword getParametersKeyword_4_2_1() { return cParametersKeyword_4_2_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_2_2() { return cLeftCurlyBracketKeyword_4_2_2; }

		//parameters+=MParameterWithoutOSSP+
		public Assignment getParametersAssignment_4_2_3() { return cParametersAssignment_4_2_3; }

		//MParameterWithoutOSSP
		public RuleCall getParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0() { return cParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_2_4() { return cRightCurlyBracketKeyword_4_2_4; }

		//";"
		public Keyword getSemicolonKeyword_4_2_5() { return cSemicolonKeyword_4_2_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MCompilerFrontendElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MCompilerFrontend");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFrontendKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cLanguageKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cLanguageAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final CrossReference cLanguageMLanguageCrossReference_3_0_2_0 = (CrossReference)cLanguageAssignment_3_0_2.eContents().get(0);
		private final RuleCall cLanguageMLanguageVersionedQualifiedNameParserRuleCall_3_0_2_0_1 = (RuleCall)cLanguageMLanguageCrossReference_3_0_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cArchitecturesKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cArchitecturesAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final CrossReference cArchitecturesMArchitectureCrossReference_3_1_2_0 = (CrossReference)cArchitecturesAssignment_3_1_2.eContents().get(0);
		private final RuleCall cArchitecturesMArchitectureVersionedQualifiedNameParserRuleCall_3_1_2_0_1 = (RuleCall)cArchitecturesMArchitectureCrossReference_3_1_2_0.eContents().get(1);
		private final Group cGroup_3_1_3 = (Group)cGroup_3_1.eContents().get(3);
		private final Keyword cCommaKeyword_3_1_3_0 = (Keyword)cGroup_3_1_3.eContents().get(0);
		private final Assignment cArchitecturesAssignment_3_1_3_1 = (Assignment)cGroup_3_1_3.eContents().get(1);
		private final CrossReference cArchitecturesMArchitectureCrossReference_3_1_3_1_0 = (CrossReference)cArchitecturesAssignment_3_1_3_1.eContents().get(0);
		private final RuleCall cArchitecturesMArchitectureVersionedQualifiedNameParserRuleCall_3_1_3_1_0_1 = (RuleCall)cArchitecturesMArchitectureCrossReference_3_1_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_1_4 = (Keyword)cGroup_3_1.eContents().get(4);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cConfigurationKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cParametersKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3_2_2 = (Keyword)cGroup_3_2.eContents().get(2);
		private final Assignment cParametersAssignment_3_2_3 = (Assignment)cGroup_3_2.eContents().get(3);
		private final RuleCall cParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0 = (RuleCall)cParametersAssignment_3_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_2_4 = (Keyword)cGroup_3_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_3_2_5 = (Keyword)cGroup_3_2.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MCompilerFrontend:
		//	"frontend" name=ID "{" ("language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" & "architectures" ":="
		//	architectures+=[MArchitecture|VersionedQualifiedName] ("," architectures+=[MArchitecture|VersionedQualifiedName])* ";"
		//	& ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"frontend" name=ID "{" ("language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" & "architectures" ":="
		//architectures+=[MArchitecture|VersionedQualifiedName] ("," architectures+=[MArchitecture|VersionedQualifiedName])* ";"
		//& ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"frontend"
		public Keyword getFrontendKeyword_0() { return cFrontendKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" & "architectures" ":="
		//architectures+=[MArchitecture|VersionedQualifiedName] ("," architectures+=[MArchitecture|VersionedQualifiedName])* ";"
		//& ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }

		//"language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";"
		public Group getGroup_3_0() { return cGroup_3_0; }

		//"language"
		public Keyword getLanguageKeyword_3_0_0() { return cLanguageKeyword_3_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_0_1() { return cColonEqualsSignKeyword_3_0_1; }

		//language=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguageAssignment_3_0_2() { return cLanguageAssignment_3_0_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguageMLanguageCrossReference_3_0_2_0() { return cLanguageMLanguageCrossReference_3_0_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguageMLanguageVersionedQualifiedNameParserRuleCall_3_0_2_0_1() { return cLanguageMLanguageVersionedQualifiedNameParserRuleCall_3_0_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_0_3() { return cSemicolonKeyword_3_0_3; }

		//"architectures" ":=" architectures+=[MArchitecture|VersionedQualifiedName] (","
		//architectures+=[MArchitecture|VersionedQualifiedName])* ";"
		public Group getGroup_3_1() { return cGroup_3_1; }

		//"architectures"
		public Keyword getArchitecturesKeyword_3_1_0() { return cArchitecturesKeyword_3_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_1_1() { return cColonEqualsSignKeyword_3_1_1; }

		//architectures+=[MArchitecture|VersionedQualifiedName]
		public Assignment getArchitecturesAssignment_3_1_2() { return cArchitecturesAssignment_3_1_2; }

		//[MArchitecture|VersionedQualifiedName]
		public CrossReference getArchitecturesMArchitectureCrossReference_3_1_2_0() { return cArchitecturesMArchitectureCrossReference_3_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getArchitecturesMArchitectureVersionedQualifiedNameParserRuleCall_3_1_2_0_1() { return cArchitecturesMArchitectureVersionedQualifiedNameParserRuleCall_3_1_2_0_1; }

		//("," architectures+=[MArchitecture|VersionedQualifiedName])*
		public Group getGroup_3_1_3() { return cGroup_3_1_3; }

		//","
		public Keyword getCommaKeyword_3_1_3_0() { return cCommaKeyword_3_1_3_0; }

		//architectures+=[MArchitecture|VersionedQualifiedName]
		public Assignment getArchitecturesAssignment_3_1_3_1() { return cArchitecturesAssignment_3_1_3_1; }

		//[MArchitecture|VersionedQualifiedName]
		public CrossReference getArchitecturesMArchitectureCrossReference_3_1_3_1_0() { return cArchitecturesMArchitectureCrossReference_3_1_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getArchitecturesMArchitectureVersionedQualifiedNameParserRuleCall_3_1_3_1_0_1() { return cArchitecturesMArchitectureVersionedQualifiedNameParserRuleCall_3_1_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_1_4() { return cSemicolonKeyword_3_1_4; }

		//("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public Group getGroup_3_2() { return cGroup_3_2; }

		//"configuration"
		public Keyword getConfigurationKeyword_3_2_0() { return cConfigurationKeyword_3_2_0; }

		//"parameters"
		public Keyword getParametersKeyword_3_2_1() { return cParametersKeyword_3_2_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_2_2() { return cLeftCurlyBracketKeyword_3_2_2; }

		//parameters+=MParameterWithoutOSSP+
		public Assignment getParametersAssignment_3_2_3() { return cParametersAssignment_3_2_3; }

		//MParameterWithoutOSSP
		public RuleCall getParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0() { return cParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_2_4() { return cRightCurlyBracketKeyword_3_2_4; }

		//";"
		public Keyword getSemicolonKeyword_3_2_5() { return cSemicolonKeyword_3_2_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MBoardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MBoard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBoardKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Keyword cSupportedKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cDevicesKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3_1_2 = (Keyword)cGroup_3_1.eContents().get(2);
		private final Assignment cSupportedDevicesAssignment_3_1_3 = (Assignment)cGroup_3_1.eContents().get(3);
		private final RuleCall cSupportedDevicesMBoardSupportedDeviceParserRuleCall_3_1_3_0 = (RuleCall)cSupportedDevicesAssignment_3_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_1_4 = (Keyword)cGroup_3_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_3_1_5 = (Keyword)cGroup_3_1.eContents().get(5);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cMicroprocessorKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cMicroprocessorAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final CrossReference cMicroprocessorMMicroprocessorCrossReference_3_2_2_0 = (CrossReference)cMicroprocessorAssignment_3_2_2.eContents().get(0);
		private final RuleCall cMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_3_2_2_0_1 = (RuleCall)cMicroprocessorMMicroprocessorCrossReference_3_2_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_2_3 = (Keyword)cGroup_3_2.eContents().get(3);
		private final Group cGroup_3_3 = (Group)cUnorderedGroup_3.eContents().get(3);
		private final Keyword cConfigurationKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Keyword cParametersKeyword_3_3_1 = (Keyword)cGroup_3_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3_3_2 = (Keyword)cGroup_3_3.eContents().get(2);
		private final Assignment cParametersAssignment_3_3_3 = (Assignment)cGroup_3_3.eContents().get(3);
		private final RuleCall cParametersMParameterWithoutOSSPParserRuleCall_3_3_3_0 = (RuleCall)cParametersAssignment_3_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_3_4 = (Keyword)cGroup_3_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_3_3_5 = (Keyword)cGroup_3_3.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MBoard:
		//	"board" name=ID "{" ("version" ":=" version=Version ";" & ("supported" "devices" "{"
		//	supportedDevices+=MBoardSupportedDevice+ "}" ";")? & "microprocessor" ":="
		//	microprocessor=[MMicroprocessor|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
		//	parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"board" name=ID "{" ("version" ":=" version=Version ";" & ("supported" "devices" "{"
		//supportedDevices+=MBoardSupportedDevice+ "}" ";")? & "microprocessor" ":="
		//microprocessor=[MMicroprocessor|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
		//parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"board"
		public Keyword getBoardKeyword_0() { return cBoardKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"version" ":=" version=Version ";" & ("supported" "devices" "{" supportedDevices+=MBoardSupportedDevice+ "}" ";")? &
		//"microprocessor" ":=" microprocessor=[MMicroprocessor|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
		//parameters+=MParameterWithoutOSSP+ "}" ";")?
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

		//("supported" "devices" "{" supportedDevices+=MBoardSupportedDevice+ "}" ";")?
		public Group getGroup_3_1() { return cGroup_3_1; }

		//"supported"
		public Keyword getSupportedKeyword_3_1_0() { return cSupportedKeyword_3_1_0; }

		//"devices"
		public Keyword getDevicesKeyword_3_1_1() { return cDevicesKeyword_3_1_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_1_2() { return cLeftCurlyBracketKeyword_3_1_2; }

		//supportedDevices+=MBoardSupportedDevice+
		public Assignment getSupportedDevicesAssignment_3_1_3() { return cSupportedDevicesAssignment_3_1_3; }

		//MBoardSupportedDevice
		public RuleCall getSupportedDevicesMBoardSupportedDeviceParserRuleCall_3_1_3_0() { return cSupportedDevicesMBoardSupportedDeviceParserRuleCall_3_1_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_1_4() { return cRightCurlyBracketKeyword_3_1_4; }

		//";"
		public Keyword getSemicolonKeyword_3_1_5() { return cSemicolonKeyword_3_1_5; }

		//"microprocessor" ":=" microprocessor=[MMicroprocessor|VersionedQualifiedName] ";"
		public Group getGroup_3_2() { return cGroup_3_2; }

		//"microprocessor"
		public Keyword getMicroprocessorKeyword_3_2_0() { return cMicroprocessorKeyword_3_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_2_1() { return cColonEqualsSignKeyword_3_2_1; }

		//microprocessor=[MMicroprocessor|VersionedQualifiedName]
		public Assignment getMicroprocessorAssignment_3_2_2() { return cMicroprocessorAssignment_3_2_2; }

		//[MMicroprocessor|VersionedQualifiedName]
		public CrossReference getMicroprocessorMMicroprocessorCrossReference_3_2_2_0() { return cMicroprocessorMMicroprocessorCrossReference_3_2_2_0; }

		//VersionedQualifiedName
		public RuleCall getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_3_2_2_0_1() { return cMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_3_2_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_2_3() { return cSemicolonKeyword_3_2_3; }

		//("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public Group getGroup_3_3() { return cGroup_3_3; }

		//"configuration"
		public Keyword getConfigurationKeyword_3_3_0() { return cConfigurationKeyword_3_3_0; }

		//"parameters"
		public Keyword getParametersKeyword_3_3_1() { return cParametersKeyword_3_3_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_3_2() { return cLeftCurlyBracketKeyword_3_3_2; }

		//parameters+=MParameterWithoutOSSP+
		public Assignment getParametersAssignment_3_3_3() { return cParametersAssignment_3_3_3; }

		//MParameterWithoutOSSP
		public RuleCall getParametersMParameterWithoutOSSPParserRuleCall_3_3_3_0() { return cParametersMParameterWithoutOSSPParserRuleCall_3_3_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_3_4() { return cRightCurlyBracketKeyword_3_3_4; }

		//";"
		public Keyword getSemicolonKeyword_3_3_5() { return cSemicolonKeyword_3_3_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MBoardSupportedDeviceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MBoardSupportedDevice");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeviceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDeviceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDeviceMDeviceCrossReference_1_0 = (CrossReference)cDeviceAssignment_1.eContents().get(0);
		private final RuleCall cDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cDeviceMDeviceCrossReference_1_0.eContents().get(1);
		private final Keyword cRangeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLowerBoundAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLowerBoundMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cLowerBoundAssignment_3.eContents().get(0);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cUpperBoundAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cUpperBoundMParameterValueExpressionParserRuleCall_5_0 = (RuleCall)cUpperBoundAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MBoardSupportedDevice:
		//	"device" device=[MDevice|VersionedQualifiedName] "range" lowerBound=MParameterValueExpression "to"
		//	upperBound=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//"device" device=[MDevice|VersionedQualifiedName] "range" lowerBound=MParameterValueExpression "to"
		//upperBound=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//"device"
		public Keyword getDeviceKeyword_0() { return cDeviceKeyword_0; }

		//device=[MDevice|VersionedQualifiedName]
		public Assignment getDeviceAssignment_1() { return cDeviceAssignment_1; }

		//[MDevice|VersionedQualifiedName]
		public CrossReference getDeviceMDeviceCrossReference_1_0() { return cDeviceMDeviceCrossReference_1_0; }

		//VersionedQualifiedName
		public RuleCall getDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1() { return cDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1; }

		//"range"
		public Keyword getRangeKeyword_2() { return cRangeKeyword_2; }

		//lowerBound=MParameterValueExpression
		public Assignment getLowerBoundAssignment_3() { return cLowerBoundAssignment_3; }

		//MParameterValueExpression
		public RuleCall getLowerBoundMParameterValueExpressionParserRuleCall_3_0() { return cLowerBoundMParameterValueExpressionParserRuleCall_3_0; }

		//"to"
		public Keyword getToKeyword_4() { return cToKeyword_4; }

		//upperBound=MParameterValueExpression
		public Assignment getUpperBoundAssignment_5() { return cUpperBoundAssignment_5; }

		//MParameterValueExpression
		public RuleCall getUpperBoundMParameterValueExpressionParserRuleCall_5_0() { return cUpperBoundMParameterValueExpressionParserRuleCall_5_0; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MMicroprocessorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMicroprocessor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMicroprocessorKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Keyword cArchitectureKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cArchitectureAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final CrossReference cArchitectureMArchitectureCrossReference_3_1_2_0 = (CrossReference)cArchitectureAssignment_3_1_2.eContents().get(0);
		private final RuleCall cArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_3_1_2_0_1 = (RuleCall)cArchitectureMArchitectureCrossReference_3_1_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cConfigurationKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cParametersKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3_2_2 = (Keyword)cGroup_3_2.eContents().get(2);
		private final Assignment cParametersAssignment_3_2_3 = (Assignment)cGroup_3_2.eContents().get(3);
		private final RuleCall cParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0 = (RuleCall)cParametersAssignment_3_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_2_4 = (Keyword)cGroup_3_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_3_2_5 = (Keyword)cGroup_3_2.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MMicroprocessor:
		//	"microprocessor" name=ID "{" ("version" ":=" version=Version ";" & "architecture" ":="
		//	architecture=[MArchitecture|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
		//	parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"microprocessor" name=ID "{" ("version" ":=" version=Version ";" & "architecture" ":="
		//architecture=[MArchitecture|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
		//parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"microprocessor"
		public Keyword getMicroprocessorKeyword_0() { return cMicroprocessorKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"version" ":=" version=Version ";" & "architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";" &
		//("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
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

		//"architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";"
		public Group getGroup_3_1() { return cGroup_3_1; }

		//"architecture"
		public Keyword getArchitectureKeyword_3_1_0() { return cArchitectureKeyword_3_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_1_1() { return cColonEqualsSignKeyword_3_1_1; }

		//architecture=[MArchitecture|VersionedQualifiedName]
		public Assignment getArchitectureAssignment_3_1_2() { return cArchitectureAssignment_3_1_2; }

		//[MArchitecture|VersionedQualifiedName]
		public CrossReference getArchitectureMArchitectureCrossReference_3_1_2_0() { return cArchitectureMArchitectureCrossReference_3_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_3_1_2_0_1() { return cArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_3_1_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_1_3() { return cSemicolonKeyword_3_1_3; }

		//("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public Group getGroup_3_2() { return cGroup_3_2; }

		//"configuration"
		public Keyword getConfigurationKeyword_3_2_0() { return cConfigurationKeyword_3_2_0; }

		//"parameters"
		public Keyword getParametersKeyword_3_2_1() { return cParametersKeyword_3_2_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_2_2() { return cLeftCurlyBracketKeyword_3_2_2; }

		//parameters+=MParameterWithoutOSSP+
		public Assignment getParametersAssignment_3_2_3() { return cParametersAssignment_3_2_3; }

		//MParameterWithoutOSSP
		public RuleCall getParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0() { return cParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_2_4() { return cRightCurlyBracketKeyword_3_2_4; }

		//";"
		public Keyword getSemicolonKeyword_3_2_5() { return cSemicolonKeyword_3_2_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MOperatingSystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MOperatingSystem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cInheritsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cInheritsMOperatingSystemCrossReference_2_1_0 = (CrossReference)cInheritsAssignment_2_1.eContents().get(0);
		private final RuleCall cInheritsMOperatingSystemVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cInheritsMOperatingSystemCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cInheritsMOperatingSystemCrossReference_2_2_1_0 = (CrossReference)cInheritsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cInheritsMOperatingSystemVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cInheritsMOperatingSystemCrossReference_2_2_1_0.eContents().get(1);
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
		private final Keyword cSupportedKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cOsapisKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_2_2 = (Keyword)cGroup_4_2.eContents().get(2);
		private final Assignment cSupportedOSAPIsAssignment_4_2_3 = (Assignment)cGroup_4_2.eContents().get(3);
		private final RuleCall cSupportedOSAPIsMOSSupportedOSAPIParserRuleCall_4_2_3_0 = (RuleCall)cSupportedOSAPIsAssignment_4_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_2_4 = (Keyword)cGroup_4_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_2_5 = (Keyword)cGroup_4_2.eContents().get(5);
		private final Group cGroup_4_3 = (Group)cUnorderedGroup_4.eContents().get(3);
		private final Keyword cSupportedKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Keyword cPlatformsKeyword_4_3_1 = (Keyword)cGroup_4_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_3_2 = (Keyword)cGroup_4_3.eContents().get(2);
		private final Assignment cSupportedPlatformsAssignment_4_3_3 = (Assignment)cGroup_4_3.eContents().get(3);
		private final RuleCall cSupportedPlatformsMOSSupportedPlatformParserRuleCall_4_3_3_0 = (RuleCall)cSupportedPlatformsAssignment_4_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_3_4 = (Keyword)cGroup_4_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_3_5 = (Keyword)cGroup_4_3.eContents().get(5);
		private final Group cGroup_4_4 = (Group)cUnorderedGroup_4.eContents().get(4);
		private final Keyword cConfigurationKeyword_4_4_0 = (Keyword)cGroup_4_4.eContents().get(0);
		private final Keyword cParametersKeyword_4_4_1 = (Keyword)cGroup_4_4.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_4_2 = (Keyword)cGroup_4_4.eContents().get(2);
		private final Assignment cParametersAssignment_4_4_3 = (Assignment)cGroup_4_4.eContents().get(3);
		private final RuleCall cParametersMParameterParserRuleCall_4_4_3_0 = (RuleCall)cParametersAssignment_4_4_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4_4 = (Keyword)cGroup_4_4.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_4_5 = (Keyword)cGroup_4_4.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MOperatingSystem:
		//	"os" name=ID ("inherits" inherits+=[MOperatingSystem|VersionedQualifiedName] (","
		//	inherits+=[MOperatingSystem|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
		//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
		//	& ("supported" "osapis" "{" supportedOSAPIs+=MOSSupportedOSAPI+ "}" ";")? & "supported" "platforms" "{"
		//	supportedPlatforms+=MOSSupportedPlatform+ "}" ";" & ("configuration" "parameters" "{" parameters+=MParameter+ "}"
		//	";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"os" name=ID ("inherits" inherits+=[MOperatingSystem|VersionedQualifiedName] (","
		//inherits+=[MOperatingSystem|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
		//languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
		//& ("supported" "osapis" "{" supportedOSAPIs+=MOSSupportedOSAPI+ "}" ";")? & "supported" "platforms" "{"
		//supportedPlatforms+=MOSSupportedPlatform+ "}" ";" & ("configuration" "parameters" "{" parameters+=MParameter+ "}"
		//";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"os"
		public Keyword getOsKeyword_0() { return cOsKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("inherits" inherits+=[MOperatingSystem|VersionedQualifiedName] (","
		//inherits+=[MOperatingSystem|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//"inherits"
		public Keyword getInheritsKeyword_2_0() { return cInheritsKeyword_2_0; }

		//inherits+=[MOperatingSystem|VersionedQualifiedName]
		public Assignment getInheritsAssignment_2_1() { return cInheritsAssignment_2_1; }

		//[MOperatingSystem|VersionedQualifiedName]
		public CrossReference getInheritsMOperatingSystemCrossReference_2_1_0() { return cInheritsMOperatingSystemCrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMOperatingSystemVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cInheritsMOperatingSystemVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," inherits+=[MOperatingSystem|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//inherits+=[MOperatingSystem|VersionedQualifiedName]
		public Assignment getInheritsAssignment_2_2_1() { return cInheritsAssignment_2_2_1; }

		//[MOperatingSystem|VersionedQualifiedName]
		public CrossReference getInheritsMOperatingSystemCrossReference_2_2_1_0() { return cInheritsMOperatingSystemCrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMOperatingSystemVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cInheritsMOperatingSystemVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//"version" ":=" version=Version ";" & "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ";" & ("supported" "osapis" "{"
		//supportedOSAPIs+=MOSSupportedOSAPI+ "}" ";")? & "supported" "platforms" "{" supportedPlatforms+=MOSSupportedPlatform+
		//"}" ";" & ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//"version" ":=" version=Version ";"
		public Group getGroup_4_0() { return cGroup_4_0; }

		//"version"
		public Keyword getVersionKeyword_4_0_0() { return cVersionKeyword_4_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_0_1() { return cColonEqualsSignKeyword_4_0_1; }

		//version=Version
		public Assignment getVersionAssignment_4_0_2() { return cVersionAssignment_4_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_4_0_2_0() { return cVersionVersionParserRuleCall_4_0_2_0; }

		//";"
		public Keyword getSemicolonKeyword_4_0_3() { return cSemicolonKeyword_4_0_3; }

		//"languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ";"
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

		//("supported" "osapis" "{" supportedOSAPIs+=MOSSupportedOSAPI+ "}" ";")?
		public Group getGroup_4_2() { return cGroup_4_2; }

		//"supported"
		public Keyword getSupportedKeyword_4_2_0() { return cSupportedKeyword_4_2_0; }

		//"osapis"
		public Keyword getOsapisKeyword_4_2_1() { return cOsapisKeyword_4_2_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_2_2() { return cLeftCurlyBracketKeyword_4_2_2; }

		//supportedOSAPIs+=MOSSupportedOSAPI+
		public Assignment getSupportedOSAPIsAssignment_4_2_3() { return cSupportedOSAPIsAssignment_4_2_3; }

		//MOSSupportedOSAPI
		public RuleCall getSupportedOSAPIsMOSSupportedOSAPIParserRuleCall_4_2_3_0() { return cSupportedOSAPIsMOSSupportedOSAPIParserRuleCall_4_2_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_2_4() { return cRightCurlyBracketKeyword_4_2_4; }

		//";"
		public Keyword getSemicolonKeyword_4_2_5() { return cSemicolonKeyword_4_2_5; }

		//"supported" "platforms" "{" supportedPlatforms+=MOSSupportedPlatform+ "}" ";"
		public Group getGroup_4_3() { return cGroup_4_3; }

		//"supported"
		public Keyword getSupportedKeyword_4_3_0() { return cSupportedKeyword_4_3_0; }

		//"platforms"
		public Keyword getPlatformsKeyword_4_3_1() { return cPlatformsKeyword_4_3_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_3_2() { return cLeftCurlyBracketKeyword_4_3_2; }

		//supportedPlatforms+=MOSSupportedPlatform+
		public Assignment getSupportedPlatformsAssignment_4_3_3() { return cSupportedPlatformsAssignment_4_3_3; }

		//MOSSupportedPlatform
		public RuleCall getSupportedPlatformsMOSSupportedPlatformParserRuleCall_4_3_3_0() { return cSupportedPlatformsMOSSupportedPlatformParserRuleCall_4_3_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_3_4() { return cRightCurlyBracketKeyword_4_3_4; }

		//";"
		public Keyword getSemicolonKeyword_4_3_5() { return cSemicolonKeyword_4_3_5; }

		//("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")?
		public Group getGroup_4_4() { return cGroup_4_4; }

		//"configuration"
		public Keyword getConfigurationKeyword_4_4_0() { return cConfigurationKeyword_4_4_0; }

		//"parameters"
		public Keyword getParametersKeyword_4_4_1() { return cParametersKeyword_4_4_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_4_2() { return cLeftCurlyBracketKeyword_4_4_2; }

		//parameters+=MParameter+
		public Assignment getParametersAssignment_4_4_3() { return cParametersAssignment_4_4_3; }

		//MParameter
		public RuleCall getParametersMParameterParserRuleCall_4_4_3_0() { return cParametersMParameterParserRuleCall_4_4_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4_4() { return cRightCurlyBracketKeyword_4_4_4; }

		//";"
		public Keyword getSemicolonKeyword_4_4_5() { return cSemicolonKeyword_4_4_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MOSSupportedOSAPIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MOSSupportedOSAPI");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSupportsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOsapiAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cOsapiMOperatingSystemAPICrossReference_1_0 = (CrossReference)cOsapiAssignment_1.eContents().get(0);
		private final RuleCall cOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cOsapiMOperatingSystemAPICrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterValueAssignmentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterValueAssignmentsMOSSupportedOSAPIPVAParserRuleCall_3_0 = (RuleCall)cParameterValueAssignmentsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MOSSupportedOSAPI:
		//	"supports" osapi=[MOperatingSystemAPI|VersionedQualifiedName] "{" parameterValueAssignments+=MOSSupportedOSAPIPVA* "}"
		//	";";
		public ParserRule getRule() { return rule; }

		//"supports" osapi=[MOperatingSystemAPI|VersionedQualifiedName] "{" parameterValueAssignments+=MOSSupportedOSAPIPVA* "}"
		//";"
		public Group getGroup() { return cGroup; }

		//"supports"
		public Keyword getSupportsKeyword_0() { return cSupportsKeyword_0; }

		//osapi=[MOperatingSystemAPI|VersionedQualifiedName]
		public Assignment getOsapiAssignment_1() { return cOsapiAssignment_1; }

		//[MOperatingSystemAPI|VersionedQualifiedName]
		public CrossReference getOsapiMOperatingSystemAPICrossReference_1_0() { return cOsapiMOperatingSystemAPICrossReference_1_0; }

		//VersionedQualifiedName
		public RuleCall getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_1_0_1() { return cOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//parameterValueAssignments+=MOSSupportedOSAPIPVA*
		public Assignment getParameterValueAssignmentsAssignment_3() { return cParameterValueAssignmentsAssignment_3; }

		//MOSSupportedOSAPIPVA
		public RuleCall getParameterValueAssignmentsMOSSupportedOSAPIPVAParserRuleCall_3_0() { return cParameterValueAssignmentsMOSSupportedOSAPIPVAParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MOSSupportedOSAPIPVAElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MOSSupportedOSAPIPVA");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMOSSupportedOSAPIPVAExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMOSSupportedOSAPIPVASwitchParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MOSSupportedOSAPIPVA:
		//	MOSSupportedOSAPIPVAExpression | MOSSupportedOSAPIPVASwitch;
		public ParserRule getRule() { return rule; }

		//MOSSupportedOSAPIPVAExpression | MOSSupportedOSAPIPVASwitch
		public Alternatives getAlternatives() { return cAlternatives; }

		//MOSSupportedOSAPIPVAExpression
		public RuleCall getMOSSupportedOSAPIPVAExpressionParserRuleCall_0() { return cMOSSupportedOSAPIPVAExpressionParserRuleCall_0; }

		//MOSSupportedOSAPIPVASwitch
		public RuleCall getMOSSupportedOSAPIPVASwitchParserRuleCall_1() { return cMOSSupportedOSAPIPVASwitchParserRuleCall_1; }
	}

	public class MOSSupportedOSAPIPVAExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MOSSupportedOSAPIPVAExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParameterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParameterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParameterMParameterCrossReference_1_0 = (CrossReference)cParameterAssignment_1.eContents().get(0);
		private final RuleCall cParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1 = (RuleCall)cParameterMParameterCrossReference_1_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cParameterValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MOSSupportedOSAPIPVAExpression:
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

	public class MOSSupportedOSAPIPVASwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MOSSupportedOSAPIPVASwitch");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSwitchKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cParameterAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cParameterMParameterCrossReference_2_0 = (CrossReference)cParameterAssignment_2.eContents().get(0);
		private final RuleCall cParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cParameterMParameterCrossReference_2_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cCasesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCasesMOSSupportedOSAPIPVASwitchCaseParserRuleCall_5_0 = (RuleCall)cCasesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MOSSupportedOSAPIPVASwitch:
		//	"switch" "(" parameter=[common::MParameter|VersionedQualifiedReferenceName] ")" "{"
		//	cases+=MOSSupportedOSAPIPVASwitchCase "}" ";";
		public ParserRule getRule() { return rule; }

		//"switch" "(" parameter=[common::MParameter|VersionedQualifiedReferenceName] ")" "{"
		//cases+=MOSSupportedOSAPIPVASwitchCase "}" ";"
		public Group getGroup() { return cGroup; }

		//"switch"
		public Keyword getSwitchKeyword_0() { return cSwitchKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//parameter=[common::MParameter|VersionedQualifiedReferenceName]
		public Assignment getParameterAssignment_2() { return cParameterAssignment_2; }

		//[common::MParameter|VersionedQualifiedReferenceName]
		public CrossReference getParameterMParameterCrossReference_2_0() { return cParameterMParameterCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//cases+=MOSSupportedOSAPIPVASwitchCase
		public Assignment getCasesAssignment_5() { return cCasesAssignment_5; }

		//MOSSupportedOSAPIPVASwitchCase
		public RuleCall getCasesMOSSupportedOSAPIPVASwitchCaseParserRuleCall_5_0() { return cCasesMOSSupportedOSAPIPVASwitchCaseParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MOSSupportedOSAPIPVASwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MOSSupportedOSAPIPVASwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMOSSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMOSSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cParameterValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MOSSupportedOSAPIPVASwitchCase:
		//	"case" platform=[MOSSupportedPlatform] ":" parameterValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//"case" platform=[MOSSupportedPlatform] ":" parameterValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MOSSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MOSSupportedPlatform]
		public CrossReference getPlatformMOSSupportedPlatformCrossReference_1_0() { return cPlatformMOSSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//parameterValue=MParameterValueExpression
		public Assignment getParameterValueAssignment_3() { return cParameterValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getParameterValueMParameterValueExpressionParserRuleCall_3_0() { return cParameterValueMParameterValueExpressionParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class MParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMIntegerParameterSingleExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMEnumParameterSingleExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMBooleanParameterSingleExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMRealParameterSingleExpressionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cMStringParameterSingleExpressionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cMEnumParameterDefinitionParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cMBooleanParamOSSPSwitchParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cMStringParamOSSPSwitchParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cMIntegerParamOSSPSwitchParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cMRealParamOSSPSwitchParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cMEnumParamOSSPSwitchParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		
		//MParameter returns common::MParameter:
		//	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
		//	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition | MBooleanParamOSSPSwitch
		//	| MStringParamOSSPSwitch | MIntegerParamOSSPSwitch | MRealParamOSSPSwitch | MEnumParamOSSPSwitch;
		public ParserRule getRule() { return rule; }

		//MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
		//MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition | MBooleanParamOSSPSwitch
		//| MStringParamOSSPSwitch | MIntegerParamOSSPSwitch | MRealParamOSSPSwitch | MEnumParamOSSPSwitch
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

		//MBooleanParamOSSPSwitch
		public RuleCall getMBooleanParamOSSPSwitchParserRuleCall_6() { return cMBooleanParamOSSPSwitchParserRuleCall_6; }

		//MStringParamOSSPSwitch
		public RuleCall getMStringParamOSSPSwitchParserRuleCall_7() { return cMStringParamOSSPSwitchParserRuleCall_7; }

		//MIntegerParamOSSPSwitch
		public RuleCall getMIntegerParamOSSPSwitchParserRuleCall_8() { return cMIntegerParamOSSPSwitchParserRuleCall_8; }

		//MRealParamOSSPSwitch
		public RuleCall getMRealParamOSSPSwitchParserRuleCall_9() { return cMRealParamOSSPSwitchParserRuleCall_9; }

		//MEnumParamOSSPSwitch
		public RuleCall getMEnumParamOSSPSwitchParserRuleCall_10() { return cMEnumParamOSSPSwitchParserRuleCall_10; }
	}

	public class MBooleanParamOSSPSwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MBooleanParamOSSPSwitch");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConstantAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cConstantConstKeyword_0_0 = (Keyword)cConstantAssignment_0.eContents().get(0);
		private final Keyword cBooleanKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSwitchKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCasesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCasesMBooleanParamOSSPSwitchCaseParserRuleCall_6_0 = (RuleCall)cCasesAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MBooleanParamOSSPSwitch:
		//	constant?="const"? "boolean" name=ID ":=" "switch" "{" cases+=MBooleanParamOSSPSwitchCase+ "}" ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "boolean" name=ID ":=" "switch" "{" cases+=MBooleanParamOSSPSwitchCase+ "}" ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"boolean"
		public Keyword getBooleanKeyword_1() { return cBooleanKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//"switch"
		public Keyword getSwitchKeyword_4() { return cSwitchKeyword_4; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//cases+=MBooleanParamOSSPSwitchCase+
		public Assignment getCasesAssignment_6() { return cCasesAssignment_6; }

		//MBooleanParamOSSPSwitchCase
		public RuleCall getCasesMBooleanParamOSSPSwitchCaseParserRuleCall_6_0() { return cCasesMBooleanParamOSSPSwitchCaseParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//";"
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class MBooleanParamOSSPSwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MBooleanParamOSSPSwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMOSSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMOSSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MBooleanParamOSSPSwitchCase:
		//	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MOSSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MOSSupportedPlatform]
		public CrossReference getPlatformMOSSupportedPlatformCrossReference_1_0() { return cPlatformMOSSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_3() { return cDefaultValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_3_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class MStringParamOSSPSwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MStringParamOSSPSwitch");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConstantAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cConstantConstKeyword_0_0 = (Keyword)cConstantAssignment_0.eContents().get(0);
		private final Keyword cStringKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSwitchKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCasesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCasesMStringParamOSSPSwitchCaseParserRuleCall_6_0 = (RuleCall)cCasesAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MStringParamOSSPSwitch:
		//	constant?="const"? "string" name=ID ":=" "switch" "{" cases+=MStringParamOSSPSwitchCase+ "}" ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "string" name=ID ":=" "switch" "{" cases+=MStringParamOSSPSwitchCase+ "}" ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"string"
		public Keyword getStringKeyword_1() { return cStringKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//"switch"
		public Keyword getSwitchKeyword_4() { return cSwitchKeyword_4; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//cases+=MStringParamOSSPSwitchCase+
		public Assignment getCasesAssignment_6() { return cCasesAssignment_6; }

		//MStringParamOSSPSwitchCase
		public RuleCall getCasesMStringParamOSSPSwitchCaseParserRuleCall_6_0() { return cCasesMStringParamOSSPSwitchCaseParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//";"
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class MStringParamOSSPSwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MStringParamOSSPSwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMOSSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMOSSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MStringParamOSSPSwitchCase:
		//	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MOSSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MOSSupportedPlatform]
		public CrossReference getPlatformMOSSupportedPlatformCrossReference_1_0() { return cPlatformMOSSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_3() { return cDefaultValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_3_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class MIntegerParamOSSPSwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MIntegerParamOSSPSwitch");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConstantAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cConstantConstKeyword_0_0 = (Keyword)cConstantAssignment_0.eContents().get(0);
		private final Keyword cIntegerKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSwitchKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCasesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCasesMIntegerParamOSSPSwitchCaseParserRuleCall_6_0 = (RuleCall)cCasesAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MIntegerParamOSSPSwitch:
		//	constant?="const"? "integer" name=ID ":=" "switch" "{" cases+=MIntegerParamOSSPSwitchCase+ "}" ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "integer" name=ID ":=" "switch" "{" cases+=MIntegerParamOSSPSwitchCase+ "}" ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"integer"
		public Keyword getIntegerKeyword_1() { return cIntegerKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//"switch"
		public Keyword getSwitchKeyword_4() { return cSwitchKeyword_4; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//cases+=MIntegerParamOSSPSwitchCase+
		public Assignment getCasesAssignment_6() { return cCasesAssignment_6; }

		//MIntegerParamOSSPSwitchCase
		public RuleCall getCasesMIntegerParamOSSPSwitchCaseParserRuleCall_6_0() { return cCasesMIntegerParamOSSPSwitchCaseParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//";"
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class MIntegerParamOSSPSwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MIntegerParamOSSPSwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMOSSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMOSSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cRangeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRangeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cRangeMParameterRangeParserRuleCall_4_1_0 = (RuleCall)cRangeAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MIntegerParamOSSPSwitchCase:
		//	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range" range=MParameterRange)?
		//	";";
		public ParserRule getRule() { return rule; }

		//"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MOSSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MOSSupportedPlatform]
		public CrossReference getPlatformMOSSupportedPlatformCrossReference_1_0() { return cPlatformMOSSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_3() { return cDefaultValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_3_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_3_0; }

		//("range" range=MParameterRange)?
		public Group getGroup_4() { return cGroup_4; }

		//"range"
		public Keyword getRangeKeyword_4_0() { return cRangeKeyword_4_0; }

		//range=MParameterRange
		public Assignment getRangeAssignment_4_1() { return cRangeAssignment_4_1; }

		//MParameterRange
		public RuleCall getRangeMParameterRangeParserRuleCall_4_1_0() { return cRangeMParameterRangeParserRuleCall_4_1_0; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MRealParamOSSPSwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MRealParamOSSPSwitch");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConstantAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cConstantConstKeyword_0_0 = (Keyword)cConstantAssignment_0.eContents().get(0);
		private final Keyword cRealKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cSwitchKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCasesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCasesMRealParamOSSPSwitchCaseParserRuleCall_6_0 = (RuleCall)cCasesAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MRealParamOSSPSwitch:
		//	constant?="const"? "real" name=ID ":=" "switch" "{" cases+=MRealParamOSSPSwitchCase+ "}" ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "real" name=ID ":=" "switch" "{" cases+=MRealParamOSSPSwitchCase+ "}" ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"real"
		public Keyword getRealKeyword_1() { return cRealKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//"switch"
		public Keyword getSwitchKeyword_4() { return cSwitchKeyword_4; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		//cases+=MRealParamOSSPSwitchCase+
		public Assignment getCasesAssignment_6() { return cCasesAssignment_6; }

		//MRealParamOSSPSwitchCase
		public RuleCall getCasesMRealParamOSSPSwitchCaseParserRuleCall_6_0() { return cCasesMRealParamOSSPSwitchCaseParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//";"
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class MRealParamOSSPSwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MRealParamOSSPSwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMOSSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMOSSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cRangeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRangeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cRangeMParameterRangeParserRuleCall_4_1_0 = (RuleCall)cRangeAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MRealParamOSSPSwitchCase:
		//	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range" range=MParameterRange)?
		//	";";
		public ParserRule getRule() { return rule; }

		//"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MOSSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MOSSupportedPlatform]
		public CrossReference getPlatformMOSSupportedPlatformCrossReference_1_0() { return cPlatformMOSSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_3() { return cDefaultValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_3_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_3_0; }

		//("range" range=MParameterRange)?
		public Group getGroup_4() { return cGroup_4; }

		//"range"
		public Keyword getRangeKeyword_4_0() { return cRangeKeyword_4_0; }

		//range=MParameterRange
		public Assignment getRangeAssignment_4_1() { return cRangeAssignment_4_1; }

		//MParameterRange
		public RuleCall getRangeMParameterRangeParserRuleCall_4_1_0() { return cRangeMParameterRangeParserRuleCall_4_1_0; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MEnumParamOSSPSwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParamOSSPSwitch");
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
		private final Keyword cSwitchKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cCasesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cCasesMEnumParamOSSPSwitchCaseParserRuleCall_7_0 = (RuleCall)cCasesAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//MEnumParamOSSPSwitch:
		//	constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
		//	":=" "switch" "{" cases+=MEnumParamOSSPSwitchCase+ "}" ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID ":="
		//"switch" "{" cases+=MEnumParamOSSPSwitchCase+ "}" ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"enum"
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

		//":="
		public Keyword getColonEqualsSignKeyword_4() { return cColonEqualsSignKeyword_4; }

		//"switch"
		public Keyword getSwitchKeyword_5() { return cSwitchKeyword_5; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }

		//cases+=MEnumParamOSSPSwitchCase+
		public Assignment getCasesAssignment_7() { return cCasesAssignment_7; }

		//MEnumParamOSSPSwitchCase
		public RuleCall getCasesMEnumParamOSSPSwitchCaseParserRuleCall_7_0() { return cCasesMEnumParamOSSPSwitchCaseParserRuleCall_7_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }

		//";"
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
	}

	public class MEnumParamOSSPSwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParamOSSPSwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMOSSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMOSSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MEnumParamOSSPSwitchCase:
		//	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MOSSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MOSSupportedPlatform]
		public CrossReference getPlatformMOSSupportedPlatformCrossReference_1_0() { return cPlatformMOSSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_3() { return cDefaultValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_3_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class MParameterWithoutOSSPElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterWithoutOSSP");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMIntegerParameterSingleExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMEnumParameterSingleExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMBooleanParameterSingleExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMRealParameterSingleExpressionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cMStringParameterSingleExpressionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cMEnumParameterDefinitionParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//MParameterWithoutOSSP returns common::MParameter:
		//	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
		//	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition;
		public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MIntegerParameterSingleExpression");
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
		
		//MIntegerParameterSingleExpression returns common::MIntegerParameterSingleExpression:
		//	constant?="const"? "integer" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "integer" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"integer"
		public Keyword getIntegerKeyword_1() { return cIntegerKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_4() { return cDefaultValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_4_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_4_0; }

		//("range" range=MParameterRange)?
		public Group getGroup_5() { return cGroup_5; }

		//"range"
		public Keyword getRangeKeyword_5_0() { return cRangeKeyword_5_0; }

		//range=MParameterRange
		public Assignment getRangeAssignment_5_1() { return cRangeAssignment_5_1; }

		//MParameterRange
		public RuleCall getRangeMParameterRangeParserRuleCall_5_1_0() { return cRangeMParameterRangeParserRuleCall_5_1_0; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MEnumParameterDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParameterDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLiteralsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLiteralsMEnumParameterLiteralRuleParserRuleCall_3_0 = (RuleCall)cLiteralsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cLiteralsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cLiteralsMEnumParameterLiteralRuleParserRuleCall_4_1_0 = (RuleCall)cLiteralsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MEnumParameterDefinition returns common::MEnumParameterDefinition:
		//	"enum" name=ID "{" literals+=MEnumParameterLiteralRule ("," literals+=MEnumParameterLiteralRule)* "}" ";";
		public ParserRule getRule() { return rule; }

		//"enum" name=ID "{" literals+=MEnumParameterLiteralRule ("," literals+=MEnumParameterLiteralRule)* "}" ";"
		public Group getGroup() { return cGroup; }

		//"enum"
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//literals+=MEnumParameterLiteralRule
		public Assignment getLiteralsAssignment_3() { return cLiteralsAssignment_3; }

		//MEnumParameterLiteralRule
		public RuleCall getLiteralsMEnumParameterLiteralRuleParserRuleCall_3_0() { return cLiteralsMEnumParameterLiteralRuleParserRuleCall_3_0; }

		//("," literals+=MEnumParameterLiteralRule)*
		public Group getGroup_4() { return cGroup_4; }

		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }

		//literals+=MEnumParameterLiteralRule
		public Assignment getLiteralsAssignment_4_1() { return cLiteralsAssignment_4_1; }

		//MEnumParameterLiteralRule
		public RuleCall getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_1_0() { return cLiteralsMEnumParameterLiteralRuleParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MEnumParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParameterSingleExpression");
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
		
		//MEnumParameterSingleExpression returns common::MEnumParameterSingleExpression:
		//	constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
		//	":=" defaultValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID ":="
		//defaultValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"enum"
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

		//":="
		public Keyword getColonEqualsSignKeyword_4() { return cColonEqualsSignKeyword_4; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_5() { return cDefaultValueAssignment_5; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_5_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_5_0; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MRealParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MRealParameterSingleExpression");
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
		
		//MRealParameterSingleExpression returns common::MRealParameterSingleExpression:
		//	constant?="const"? "real" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "real" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"real"
		public Keyword getRealKeyword_1() { return cRealKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_4() { return cDefaultValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_4_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_4_0; }

		//("range" range=MParameterRange)?
		public Group getGroup_5() { return cGroup_5; }

		//"range"
		public Keyword getRangeKeyword_5_0() { return cRangeKeyword_5_0; }

		//range=MParameterRange
		public Assignment getRangeAssignment_5_1() { return cRangeAssignment_5_1; }

		//MParameterRange
		public RuleCall getRangeMParameterRangeParserRuleCall_5_1_0() { return cRangeMParameterRangeParserRuleCall_5_1_0; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MEnumParameterLiteralRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParameterLiteralRule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMEnumParameterLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMEnumParamIntegerLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMEnumParamRealLiteralParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMEnumParamStringLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//MEnumParameterLiteralRule returns common::MEnumParameterLiteral:
		//	MEnumParameterLiteral | MEnumParamIntegerLiteral | MEnumParamRealLiteral | MEnumParamStringLiteral;
		public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParameterLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParameterLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//MEnumParameterLiteral returns common::MEnumParameterLiteral:
		//	{common::MEnumParameterLiteral} name=ID;
		public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParamIntegerLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParamIntegerLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueINTEGERParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//MEnumParamIntegerLiteral returns common::MEnumParamIntegerLiteral:
		//	{common::MEnumParamIntegerLiteral} name=ID "=" value=INTEGER;
		public ParserRule getRule() { return rule; }

		//{common::MEnumParamIntegerLiteral} name=ID "=" value=INTEGER
		public Group getGroup() { return cGroup; }

		//{common::MEnumParamIntegerLiteral}
		public Action getMEnumParamIntegerLiteralAction_0() { return cMEnumParamIntegerLiteralAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//value=INTEGER
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//INTEGER
		public RuleCall getValueINTEGERParserRuleCall_3_0() { return cValueINTEGERParserRuleCall_3_0; }
	}

	public class MEnumParamRealLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParamRealLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParamRealLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueREALParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//MEnumParamRealLiteral returns common::MEnumParamRealLiteral:
		//	{common::MEnumParamRealLiteral} name=ID "=" value=REAL;
		public ParserRule getRule() { return rule; }

		//{common::MEnumParamRealLiteral} name=ID "=" value=REAL
		public Group getGroup() { return cGroup; }

		//{common::MEnumParamRealLiteral}
		public Action getMEnumParamRealLiteralAction_0() { return cMEnumParamRealLiteralAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//value=REAL
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//REAL
		public RuleCall getValueREALParserRuleCall_3_0() { return cValueREALParserRuleCall_3_0; }
	}

	public class MEnumParamStringLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParamStringLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMEnumParamStringLiteralAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//MEnumParamStringLiteral returns common::MEnumParamStringLiteral:
		//	{common::MEnumParamStringLiteral} name=ID "=" value=STRING;
		public ParserRule getRule() { return rule; }

		//{common::MEnumParamStringLiteral} name=ID "=" value=STRING
		public Group getGroup() { return cGroup; }

		//{common::MEnumParamStringLiteral}
		public Action getMEnumParamStringLiteralAction_0() { return cMEnumParamStringLiteralAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//value=STRING
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_0() { return cValueSTRINGTerminalRuleCall_3_0; }
	}

	public class MBooleanParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MBooleanParameterSingleExpression");
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
		
		//MBooleanParameterSingleExpression returns common::MBooleanParameterSingleExpression:
		//	constant?="const"? "boolean" name=ID ":=" defaultValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "boolean" name=ID ":=" defaultValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"boolean"
		public Keyword getBooleanKeyword_1() { return cBooleanKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_4() { return cDefaultValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_4_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_4_0; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MStringParameterSingleExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MStringParameterSingleExpression");
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
		
		//MStringParameterSingleExpression returns common::MStringParameterSingleExpression:
		//	constant?="const"? "string" name=ID ":=" defaultValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "string" name=ID ":=" defaultValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//constant?="const"?
		public Assignment getConstantAssignment_0() { return cConstantAssignment_0; }

		//"const"
		public Keyword getConstantConstKeyword_0_0() { return cConstantConstKeyword_0_0; }

		//"string"
		public Keyword getStringKeyword_1() { return cStringKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_4() { return cDefaultValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_4_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_4_0; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
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

	public class MParameterRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterRange");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMParameterOCRParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMParameterOORParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMParameterCORParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMParameterCCRParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//MParameterRange returns common::MParameterRange:
		//	MParameterOCR | MParameterOOR | MParameterCOR | MParameterCCR;
		public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterOCR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterOCRAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerValueMParameterValueExpressionParserRuleCall_2_0 = (RuleCall)cLowerValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUpperValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUpperValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cUpperValueAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MParameterOCR returns common::MParameterOCR:
		//	{common::MParameterOCR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]";
		public ParserRule getRule() { return rule; }

		//{common::MParameterOCR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]"
		public Group getGroup() { return cGroup; }

		//{common::MParameterOCR}
		public Action getMParameterOCRAction_0() { return cMParameterOCRAction_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//lowerValue=MParameterValueExpression
		public Assignment getLowerValueAssignment_2() { return cLowerValueAssignment_2; }

		//MParameterValueExpression
		public RuleCall getLowerValueMParameterValueExpressionParserRuleCall_2_0() { return cLowerValueMParameterValueExpressionParserRuleCall_2_0; }

		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }

		//upperValue=MParameterValueExpression
		public Assignment getUpperValueAssignment_4() { return cUpperValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getUpperValueMParameterValueExpressionParserRuleCall_4_0() { return cUpperValueMParameterValueExpressionParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}

	public class MParameterOORElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterOOR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterOORAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerValueMParameterValueExpressionParserRuleCall_2_0 = (RuleCall)cLowerValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUpperValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUpperValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cUpperValueAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MParameterOOR returns common::MParameterOOR:
		//	{common::MParameterOOR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")";
		public ParserRule getRule() { return rule; }

		//{common::MParameterOOR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")"
		public Group getGroup() { return cGroup; }

		//{common::MParameterOOR}
		public Action getMParameterOORAction_0() { return cMParameterOORAction_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//lowerValue=MParameterValueExpression
		public Assignment getLowerValueAssignment_2() { return cLowerValueAssignment_2; }

		//MParameterValueExpression
		public RuleCall getLowerValueMParameterValueExpressionParserRuleCall_2_0() { return cLowerValueMParameterValueExpressionParserRuleCall_2_0; }

		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }

		//upperValue=MParameterValueExpression
		public Assignment getUpperValueAssignment_4() { return cUpperValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getUpperValueMParameterValueExpressionParserRuleCall_4_0() { return cUpperValueMParameterValueExpressionParserRuleCall_4_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class MParameterCORElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterCOR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterCORAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerValueMParameterValueExpressionParserRuleCall_2_0 = (RuleCall)cLowerValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUpperValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUpperValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cUpperValueAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MParameterCOR returns common::MParameterCOR:
		//	{common::MParameterCOR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")";
		public ParserRule getRule() { return rule; }

		//{common::MParameterCOR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")"
		public Group getGroup() { return cGroup; }

		//{common::MParameterCOR}
		public Action getMParameterCORAction_0() { return cMParameterCORAction_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }

		//lowerValue=MParameterValueExpression
		public Assignment getLowerValueAssignment_2() { return cLowerValueAssignment_2; }

		//MParameterValueExpression
		public RuleCall getLowerValueMParameterValueExpressionParserRuleCall_2_0() { return cLowerValueMParameterValueExpressionParserRuleCall_2_0; }

		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }

		//upperValue=MParameterValueExpression
		public Assignment getUpperValueAssignment_4() { return cUpperValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getUpperValueMParameterValueExpressionParserRuleCall_4_0() { return cUpperValueMParameterValueExpressionParserRuleCall_4_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class MParameterCCRElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterCCR");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMParameterCCRAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLowerValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLowerValueMParameterValueExpressionParserRuleCall_2_0 = (RuleCall)cLowerValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cUpperValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cUpperValueMParameterValueExpressionParserRuleCall_4_0 = (RuleCall)cUpperValueAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MParameterCCR returns common::MParameterCCR:
		//	{common::MParameterCCR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]";
		public ParserRule getRule() { return rule; }

		//{common::MParameterCCR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]"
		public Group getGroup() { return cGroup; }

		//{common::MParameterCCR}
		public Action getMParameterCCRAction_0() { return cMParameterCCRAction_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }

		//lowerValue=MParameterValueExpression
		public Assignment getLowerValueAssignment_2() { return cLowerValueAssignment_2; }

		//MParameterValueExpression
		public RuleCall getLowerValueMParameterValueExpressionParserRuleCall_2_0() { return cLowerValueMParameterValueExpressionParserRuleCall_2_0; }

		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }

		//upperValue=MParameterValueExpression
		public Assignment getUpperValueAssignment_4() { return cUpperValueAssignment_4; }

		//MParameterValueExpression
		public RuleCall getUpperValueMParameterValueExpressionParserRuleCall_4_0() { return cUpperValueMParameterValueExpressionParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
	}

	public class MOperatingSystemAPIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MOperatingSystemAPI");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOsapiKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cInheritsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cInheritsMOperatingSystemAPICrossReference_2_1_0 = (CrossReference)cInheritsAssignment_2_1.eContents().get(0);
		private final RuleCall cInheritsMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cInheritsMOperatingSystemAPICrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cInheritsMOperatingSystemAPICrossReference_2_2_1_0 = (CrossReference)cInheritsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cInheritsMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cInheritsMOperatingSystemAPICrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cVersionKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Assignment cVersionAssignment_4_0_2 = (Assignment)cGroup_4_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_4_0_2_0 = (RuleCall)cVersionAssignment_4_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cLanguageKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Assignment cLanguageAssignment_4_1_2 = (Assignment)cGroup_4_1.eContents().get(2);
		private final CrossReference cLanguageMLanguageCrossReference_4_1_2_0 = (CrossReference)cLanguageAssignment_4_1_2.eContents().get(0);
		private final RuleCall cLanguageMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1 = (RuleCall)cLanguageMLanguageCrossReference_4_1_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4_1_3 = (Keyword)cGroup_4_1.eContents().get(3);
		private final Group cGroup_4_2 = (Group)cUnorderedGroup_4.eContents().get(2);
		private final Keyword cConfigurationKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Keyword cParametersKeyword_4_2_1 = (Keyword)cGroup_4_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_2_2 = (Keyword)cGroup_4_2.eContents().get(2);
		private final Assignment cParametersAssignment_4_2_3 = (Assignment)cGroup_4_2.eContents().get(3);
		private final RuleCall cParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0 = (RuleCall)cParametersAssignment_4_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_2_4 = (Keyword)cGroup_4_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_2_5 = (Keyword)cGroup_4_2.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MOperatingSystemAPI:
		//	"osapi" name=ID ("inherits" inherits+=[MOperatingSystemAPI|VersionedQualifiedName] (","
		//	inherits+=[MOperatingSystemAPI|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "language" ":="
		//	language=[system::MLanguage|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
		//	parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"osapi" name=ID ("inherits" inherits+=[MOperatingSystemAPI|VersionedQualifiedName] (","
		//inherits+=[MOperatingSystemAPI|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "language" ":="
		//language=[system::MLanguage|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
		//parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"osapi"
		public Keyword getOsapiKeyword_0() { return cOsapiKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("inherits" inherits+=[MOperatingSystemAPI|VersionedQualifiedName] (","
		//inherits+=[MOperatingSystemAPI|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//"inherits"
		public Keyword getInheritsKeyword_2_0() { return cInheritsKeyword_2_0; }

		//inherits+=[MOperatingSystemAPI|VersionedQualifiedName]
		public Assignment getInheritsAssignment_2_1() { return cInheritsAssignment_2_1; }

		//[MOperatingSystemAPI|VersionedQualifiedName]
		public CrossReference getInheritsMOperatingSystemAPICrossReference_2_1_0() { return cInheritsMOperatingSystemAPICrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cInheritsMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," inherits+=[MOperatingSystemAPI|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//inherits+=[MOperatingSystemAPI|VersionedQualifiedName]
		public Assignment getInheritsAssignment_2_2_1() { return cInheritsAssignment_2_2_1; }

		//[MOperatingSystemAPI|VersionedQualifiedName]
		public CrossReference getInheritsMOperatingSystemAPICrossReference_2_2_1_0() { return cInheritsMOperatingSystemAPICrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cInheritsMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//"version" ":=" version=Version ";" & "language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" &
		//("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//"version" ":=" version=Version ";"
		public Group getGroup_4_0() { return cGroup_4_0; }

		//"version"
		public Keyword getVersionKeyword_4_0_0() { return cVersionKeyword_4_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_0_1() { return cColonEqualsSignKeyword_4_0_1; }

		//version=Version
		public Assignment getVersionAssignment_4_0_2() { return cVersionAssignment_4_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_4_0_2_0() { return cVersionVersionParserRuleCall_4_0_2_0; }

		//";"
		public Keyword getSemicolonKeyword_4_0_3() { return cSemicolonKeyword_4_0_3; }

		//"language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";"
		public Group getGroup_4_1() { return cGroup_4_1; }

		//"language"
		public Keyword getLanguageKeyword_4_1_0() { return cLanguageKeyword_4_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_1_1() { return cColonEqualsSignKeyword_4_1_1; }

		//language=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguageAssignment_4_1_2() { return cLanguageAssignment_4_1_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguageMLanguageCrossReference_4_1_2_0() { return cLanguageMLanguageCrossReference_4_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguageMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1() { return cLanguageMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_4_1_3() { return cSemicolonKeyword_4_1_3; }

		//("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public Group getGroup_4_2() { return cGroup_4_2; }

		//"configuration"
		public Keyword getConfigurationKeyword_4_2_0() { return cConfigurationKeyword_4_2_0; }

		//"parameters"
		public Keyword getParametersKeyword_4_2_1() { return cParametersKeyword_4_2_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_2_2() { return cLeftCurlyBracketKeyword_4_2_2; }

		//parameters+=MParameterWithoutOSSP+
		public Assignment getParametersAssignment_4_2_3() { return cParametersAssignment_4_2_3; }

		//MParameterWithoutOSSP
		public RuleCall getParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0() { return cParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_2_4() { return cRightCurlyBracketKeyword_4_2_4; }

		//";"
		public Keyword getSemicolonKeyword_4_2_5() { return cSemicolonKeyword_4_2_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MDeviceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MDevice");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeviceKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Keyword cConfigurationKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cParametersKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3_1_2 = (Keyword)cGroup_3_1.eContents().get(2);
		private final Assignment cParametersAssignment_3_1_3 = (Assignment)cGroup_3_1.eContents().get(3);
		private final RuleCall cParametersMParameterWithoutOSSPParserRuleCall_3_1_3_0 = (RuleCall)cParametersAssignment_3_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_1_4 = (Keyword)cGroup_3_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_3_1_5 = (Keyword)cGroup_3_1.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MDevice:
		//	"device" name=ID "{" ("version" ":=" version=Version ";" & ("configuration" "parameters" "{"
		//	parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"device" name=ID "{" ("version" ":=" version=Version ";" & ("configuration" "parameters" "{"
		//parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"device"
		public Keyword getDeviceKeyword_0() { return cDeviceKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"version" ":=" version=Version ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
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

		//("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public Group getGroup_3_1() { return cGroup_3_1; }

		//"configuration"
		public Keyword getConfigurationKeyword_3_1_0() { return cConfigurationKeyword_3_1_0; }

		//"parameters"
		public Keyword getParametersKeyword_3_1_1() { return cParametersKeyword_3_1_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_1_2() { return cLeftCurlyBracketKeyword_3_1_2; }

		//parameters+=MParameterWithoutOSSP+
		public Assignment getParametersAssignment_3_1_3() { return cParametersAssignment_3_1_3; }

		//MParameterWithoutOSSP
		public RuleCall getParametersMParameterWithoutOSSPParserRuleCall_3_1_3_0() { return cParametersMParameterWithoutOSSPParserRuleCall_3_1_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_1_4() { return cRightCurlyBracketKeyword_3_1_4; }

		//";"
		public Keyword getSemicolonKeyword_3_1_5() { return cSemicolonKeyword_3_1_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MArchitectureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MArchitecture");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cArchitectureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cExtendsMArchitectureCrossReference_2_1_0 = (CrossReference)cExtendsAssignment_2_1.eContents().get(0);
		private final RuleCall cExtendsMArchitectureVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cExtendsMArchitectureCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cExtendsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cExtendsMArchitectureCrossReference_2_2_1_0 = (CrossReference)cExtendsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cExtendsMArchitectureVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cExtendsMArchitectureCrossReference_2_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cUnorderedGroup_4.eContents().get(0);
		private final Keyword cVersionKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_0_1 = (Keyword)cGroup_4_0.eContents().get(1);
		private final Assignment cVersionAssignment_4_0_2 = (Assignment)cGroup_4_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_4_0_2_0 = (RuleCall)cVersionAssignment_4_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Group cGroup_4_1 = (Group)cUnorderedGroup_4.eContents().get(1);
		private final Keyword cConfigurationKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Keyword cParametersKeyword_4_1_1 = (Keyword)cGroup_4_1.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4_1_2 = (Keyword)cGroup_4_1.eContents().get(2);
		private final Assignment cParametersAssignment_4_1_3 = (Assignment)cGroup_4_1.eContents().get(3);
		private final RuleCall cParametersMParameterWithoutOSSPParserRuleCall_4_1_3_0 = (RuleCall)cParametersAssignment_4_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_1_4 = (Keyword)cGroup_4_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_4_1_5 = (Keyword)cGroup_4_1.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MArchitecture:
		//	"architecture" name=ID ("extends" extends+=[MArchitecture|VersionedQualifiedName] (","
		//	extends+=[MArchitecture|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("configuration"
		//	"parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"architecture" name=ID ("extends" extends+=[MArchitecture|VersionedQualifiedName] (","
		//extends+=[MArchitecture|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("configuration"
		//"parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"architecture"
		public Keyword getArchitectureKeyword_0() { return cArchitectureKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("extends" extends+=[MArchitecture|VersionedQualifiedName] ("," extends+=[MArchitecture|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//"extends"
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//extends+=[MArchitecture|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_1() { return cExtendsAssignment_2_1; }

		//[MArchitecture|VersionedQualifiedName]
		public CrossReference getExtendsMArchitectureCrossReference_2_1_0() { return cExtendsMArchitectureCrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMArchitectureVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cExtendsMArchitectureVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," extends+=[MArchitecture|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//extends+=[MArchitecture|VersionedQualifiedName]
		public Assignment getExtendsAssignment_2_2_1() { return cExtendsAssignment_2_2_1; }

		//[MArchitecture|VersionedQualifiedName]
		public CrossReference getExtendsMArchitectureCrossReference_2_2_1_0() { return cExtendsMArchitectureCrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMArchitectureVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cExtendsMArchitectureVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//"version" ":=" version=Version ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }

		//"version" ":=" version=Version ";"
		public Group getGroup_4_0() { return cGroup_4_0; }

		//"version"
		public Keyword getVersionKeyword_4_0_0() { return cVersionKeyword_4_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_0_1() { return cColonEqualsSignKeyword_4_0_1; }

		//version=Version
		public Assignment getVersionAssignment_4_0_2() { return cVersionAssignment_4_0_2; }

		//Version
		public RuleCall getVersionVersionParserRuleCall_4_0_2_0() { return cVersionVersionParserRuleCall_4_0_2_0; }

		//";"
		public Keyword getSemicolonKeyword_4_0_3() { return cSemicolonKeyword_4_0_3; }

		//("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public Group getGroup_4_1() { return cGroup_4_1; }

		//"configuration"
		public Keyword getConfigurationKeyword_4_1_0() { return cConfigurationKeyword_4_1_0; }

		//"parameters"
		public Keyword getParametersKeyword_4_1_1() { return cParametersKeyword_4_1_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1_2() { return cLeftCurlyBracketKeyword_4_1_2; }

		//parameters+=MParameterWithoutOSSP+
		public Assignment getParametersAssignment_4_1_3() { return cParametersAssignment_4_1_3; }

		//MParameterWithoutOSSP
		public RuleCall getParametersMParameterWithoutOSSPParserRuleCall_4_1_3_0() { return cParametersMParameterWithoutOSSPParserRuleCall_4_1_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_1_4() { return cRightCurlyBracketKeyword_4_1_4; }

		//";"
		public Keyword getSemicolonKeyword_4_1_5() { return cSemicolonKeyword_4_1_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MOSSupportedPlatformElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MOSSupportedPlatform");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMOSSupportedPlatformAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSupportedKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPlatformKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cArchitectureKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cArchitectureAssignment_5_0_2 = (Assignment)cGroup_5_0.eContents().get(2);
		private final CrossReference cArchitectureMArchitectureCrossReference_5_0_2_0 = (CrossReference)cArchitectureAssignment_5_0_2.eContents().get(0);
		private final RuleCall cArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_0_2_0_1 = (RuleCall)cArchitectureMArchitectureCrossReference_5_0_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_0_3 = (Keyword)cGroup_5_0.eContents().get(3);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cCompilerKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Assignment cCompilerAssignment_5_1_2 = (Assignment)cGroup_5_1.eContents().get(2);
		private final CrossReference cCompilerMCompilerCrossReference_5_1_2_0 = (CrossReference)cCompilerAssignment_5_1_2.eContents().get(0);
		private final RuleCall cCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_1_2_0_1 = (RuleCall)cCompilerMCompilerCrossReference_5_1_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_1_3 = (Keyword)cGroup_5_1.eContents().get(3);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cMicroprocessorKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_2_1 = (Keyword)cGroup_5_2.eContents().get(1);
		private final Alternatives cAlternatives_5_2_2 = (Alternatives)cGroup_5_2.eContents().get(2);
		private final Keyword cAnyKeyword_5_2_2_0 = (Keyword)cAlternatives_5_2_2.eContents().get(0);
		private final Assignment cMicroprocessorAssignment_5_2_2_1 = (Assignment)cAlternatives_5_2_2.eContents().get(1);
		private final CrossReference cMicroprocessorMMicroprocessorCrossReference_5_2_2_1_0 = (CrossReference)cMicroprocessorAssignment_5_2_2_1.eContents().get(0);
		private final RuleCall cMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1 = (RuleCall)cMicroprocessorMMicroprocessorCrossReference_5_2_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_2_3 = (Keyword)cGroup_5_2.eContents().get(3);
		private final Group cGroup_5_3 = (Group)cUnorderedGroup_5.eContents().get(3);
		private final Keyword cBoardKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_3_1 = (Keyword)cGroup_5_3.eContents().get(1);
		private final Alternatives cAlternatives_5_3_2 = (Alternatives)cGroup_5_3.eContents().get(2);
		private final Keyword cAnyKeyword_5_3_2_0 = (Keyword)cAlternatives_5_3_2.eContents().get(0);
		private final Assignment cBoardAssignment_5_3_2_1 = (Assignment)cAlternatives_5_3_2.eContents().get(1);
		private final CrossReference cBoardMBoardCrossReference_5_3_2_1_0 = (CrossReference)cBoardAssignment_5_3_2_1.eContents().get(0);
		private final RuleCall cBoardMBoardVersionedQualifiedNameParserRuleCall_5_3_2_1_0_1 = (RuleCall)cBoardMBoardCrossReference_5_3_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_3_3 = (Keyword)cGroup_5_3.eContents().get(3);
		private final Group cGroup_5_4 = (Group)cUnorderedGroup_5.eContents().get(4);
		private final Keyword cLanguagesKeyword_5_4_0 = (Keyword)cGroup_5_4.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_4_1 = (Keyword)cGroup_5_4.eContents().get(1);
		private final Assignment cLanguagesAssignment_5_4_2 = (Assignment)cGroup_5_4.eContents().get(2);
		private final CrossReference cLanguagesMLanguageCrossReference_5_4_2_0 = (CrossReference)cLanguagesAssignment_5_4_2.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_4_2_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_4_2_0.eContents().get(1);
		private final Group cGroup_5_4_3 = (Group)cGroup_5_4.eContents().get(3);
		private final Keyword cCommaKeyword_5_4_3_0 = (Keyword)cGroup_5_4_3.eContents().get(0);
		private final Assignment cLanguagesAssignment_5_4_3_1 = (Assignment)cGroup_5_4_3.eContents().get(1);
		private final CrossReference cLanguagesMLanguageCrossReference_5_4_3_1_0 = (CrossReference)cLanguagesAssignment_5_4_3_1.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_4_3_1_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_4_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_4_4 = (Keyword)cGroup_5_4.eContents().get(4);
		private final Group cGroup_5_5 = (Group)cUnorderedGroup_5.eContents().get(5);
		private final Keyword cConfigurationKeyword_5_5_0 = (Keyword)cGroup_5_5.eContents().get(0);
		private final Keyword cParametersKeyword_5_5_1 = (Keyword)cGroup_5_5.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_5_2 = (Keyword)cGroup_5_5.eContents().get(2);
		private final Assignment cParametersAssignment_5_5_3 = (Assignment)cGroup_5_5.eContents().get(3);
		private final RuleCall cParametersMParameterWithoutOSSPParserRuleCall_5_5_3_0 = (RuleCall)cParametersAssignment_5_5_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_5_4 = (Keyword)cGroup_5_5.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_5_5 = (Keyword)cGroup_5_5.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MOSSupportedPlatform:
		//	{MOSSupportedPlatform} "supported" "platform" name=ID "{" ("architecture" ":="
		//	architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":=" compiler=[MCompiler|VersionedQualifiedName]
		//	";" & "microprocessor" ":=" ("any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":="
		//	("any" | board=[MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
		//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//	";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//{MOSSupportedPlatform} "supported" "platform" name=ID "{" ("architecture" ":="
		//architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":=" compiler=[MCompiler|VersionedQualifiedName]
		//";" & "microprocessor" ":=" ("any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any"
		//| board=[MBoard|VersionedQualifiedName]) ";" & ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName]
		//("," languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("configuration" "parameters" "{"
		//parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//{MOSSupportedPlatform}
		public Action getMOSSupportedPlatformAction_0() { return cMOSSupportedPlatformAction_0; }

		//"supported"
		public Keyword getSupportedKeyword_1() { return cSupportedKeyword_1; }

		//"platform"
		public Keyword getPlatformKeyword_2() { return cPlatformKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//"architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":="
		//compiler=[MCompiler|VersionedQualifiedName] ";" & "microprocessor" ":=" ("any" |
		//microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
		//board=[MBoard|VersionedQualifiedName]) ";" & ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName]
		//("," languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("configuration" "parameters" "{"
		//parameters+=MParameterWithoutOSSP+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }

		//"architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";"
		public Group getGroup_5_0() { return cGroup_5_0; }

		//"architecture"
		public Keyword getArchitectureKeyword_5_0_0() { return cArchitectureKeyword_5_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_0_1() { return cColonEqualsSignKeyword_5_0_1; }

		//architecture=[MArchitecture|VersionedQualifiedName]
		public Assignment getArchitectureAssignment_5_0_2() { return cArchitectureAssignment_5_0_2; }

		//[MArchitecture|VersionedQualifiedName]
		public CrossReference getArchitectureMArchitectureCrossReference_5_0_2_0() { return cArchitectureMArchitectureCrossReference_5_0_2_0; }

		//VersionedQualifiedName
		public RuleCall getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_0_2_0_1() { return cArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_0_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_0_3() { return cSemicolonKeyword_5_0_3; }

		//"compiler" ":=" compiler=[MCompiler|VersionedQualifiedName] ";"
		public Group getGroup_5_1() { return cGroup_5_1; }

		//"compiler"
		public Keyword getCompilerKeyword_5_1_0() { return cCompilerKeyword_5_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_1_1() { return cColonEqualsSignKeyword_5_1_1; }

		//compiler=[MCompiler|VersionedQualifiedName]
		public Assignment getCompilerAssignment_5_1_2() { return cCompilerAssignment_5_1_2; }

		//[MCompiler|VersionedQualifiedName]
		public CrossReference getCompilerMCompilerCrossReference_5_1_2_0() { return cCompilerMCompilerCrossReference_5_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_1_2_0_1() { return cCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_1_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_1_3() { return cSemicolonKeyword_5_1_3; }

		//"microprocessor" ":=" ("any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";"
		public Group getGroup_5_2() { return cGroup_5_2; }

		//"microprocessor"
		public Keyword getMicroprocessorKeyword_5_2_0() { return cMicroprocessorKeyword_5_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_2_1() { return cColonEqualsSignKeyword_5_2_1; }

		//"any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]
		public Alternatives getAlternatives_5_2_2() { return cAlternatives_5_2_2; }

		//"any"
		public Keyword getAnyKeyword_5_2_2_0() { return cAnyKeyword_5_2_2_0; }

		//microprocessor=[MMicroprocessor|VersionedQualifiedName]
		public Assignment getMicroprocessorAssignment_5_2_2_1() { return cMicroprocessorAssignment_5_2_2_1; }

		//[MMicroprocessor|VersionedQualifiedName]
		public CrossReference getMicroprocessorMMicroprocessorCrossReference_5_2_2_1_0() { return cMicroprocessorMMicroprocessorCrossReference_5_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1() { return cMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_2_3() { return cSemicolonKeyword_5_2_3; }

		//"board" ":=" ("any" | board=[MBoard|VersionedQualifiedName]) ";"
		public Group getGroup_5_3() { return cGroup_5_3; }

		//"board"
		public Keyword getBoardKeyword_5_3_0() { return cBoardKeyword_5_3_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_3_1() { return cColonEqualsSignKeyword_5_3_1; }

		//"any" | board=[MBoard|VersionedQualifiedName]
		public Alternatives getAlternatives_5_3_2() { return cAlternatives_5_3_2; }

		//"any"
		public Keyword getAnyKeyword_5_3_2_0() { return cAnyKeyword_5_3_2_0; }

		//board=[MBoard|VersionedQualifiedName]
		public Assignment getBoardAssignment_5_3_2_1() { return cBoardAssignment_5_3_2_1; }

		//[MBoard|VersionedQualifiedName]
		public CrossReference getBoardMBoardCrossReference_5_3_2_1_0() { return cBoardMBoardCrossReference_5_3_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getBoardMBoardVersionedQualifiedNameParserRuleCall_5_3_2_1_0_1() { return cBoardMBoardVersionedQualifiedNameParserRuleCall_5_3_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_3_3() { return cSemicolonKeyword_5_3_3; }

		//("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ";")?
		public Group getGroup_5_4() { return cGroup_5_4; }

		//"languages"
		public Keyword getLanguagesKeyword_5_4_0() { return cLanguagesKeyword_5_4_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_4_1() { return cColonEqualsSignKeyword_5_4_1; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_4_2() { return cLanguagesAssignment_5_4_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_4_2_0() { return cLanguagesMLanguageCrossReference_5_4_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_4_2_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_4_2_0_1; }

		//("," languages+=[system::MLanguage|VersionedQualifiedName])*
		public Group getGroup_5_4_3() { return cGroup_5_4_3; }

		//","
		public Keyword getCommaKeyword_5_4_3_0() { return cCommaKeyword_5_4_3_0; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_4_3_1() { return cLanguagesAssignment_5_4_3_1; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_4_3_1_0() { return cLanguagesMLanguageCrossReference_5_4_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_4_3_1_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_4_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_4_4() { return cSemicolonKeyword_5_4_4; }

		//("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public Group getGroup_5_5() { return cGroup_5_5; }

		//"configuration"
		public Keyword getConfigurationKeyword_5_5_0() { return cConfigurationKeyword_5_5_0; }

		//"parameters"
		public Keyword getParametersKeyword_5_5_1() { return cParametersKeyword_5_5_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_5_2() { return cLeftCurlyBracketKeyword_5_5_2; }

		//parameters+=MParameterWithoutOSSP+
		public Assignment getParametersAssignment_5_5_3() { return cParametersAssignment_5_5_3; }

		//MParameterWithoutOSSP
		public RuleCall getParametersMParameterWithoutOSSPParserRuleCall_5_5_3_0() { return cParametersMParameterWithoutOSSPParserRuleCall_5_5_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_5_4() { return cRightCurlyBracketKeyword_5_5_4; }

		//";"
		public Keyword getSemicolonKeyword_5_5_5() { return cSemicolonKeyword_5_5_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MPlatformElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MPlatform");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPlatformKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Keyword cOsapiKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cOsapiAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final CrossReference cOsapiMOperatingSystemAPICrossReference_3_1_2_0 = (CrossReference)cOsapiAssignment_3_1_2.eContents().get(0);
		private final RuleCall cOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_3_1_2_0_1 = (RuleCall)cOsapiMOperatingSystemAPICrossReference_3_1_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cOsKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cOsAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final CrossReference cOsMOperatingSystemCrossReference_3_2_2_0 = (CrossReference)cOsAssignment_3_2_2.eContents().get(0);
		private final RuleCall cOsMOperatingSystemVersionedQualifiedNameParserRuleCall_3_2_2_0_1 = (RuleCall)cOsMOperatingSystemCrossReference_3_2_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_2_3 = (Keyword)cGroup_3_2.eContents().get(3);
		private final Group cGroup_3_3 = (Group)cUnorderedGroup_3.eContents().get(3);
		private final Keyword cArchitectureKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_3_1 = (Keyword)cGroup_3_3.eContents().get(1);
		private final Assignment cArchitectureAssignment_3_3_2 = (Assignment)cGroup_3_3.eContents().get(2);
		private final CrossReference cArchitectureMArchitectureCrossReference_3_3_2_0 = (CrossReference)cArchitectureAssignment_3_3_2.eContents().get(0);
		private final RuleCall cArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_3_3_2_0_1 = (RuleCall)cArchitectureMArchitectureCrossReference_3_3_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_3_3 = (Keyword)cGroup_3_3.eContents().get(3);
		private final Group cGroup_3_4 = (Group)cUnorderedGroup_3.eContents().get(4);
		private final Keyword cCompilerKeyword_3_4_0 = (Keyword)cGroup_3_4.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_4_1 = (Keyword)cGroup_3_4.eContents().get(1);
		private final Assignment cCompilerAssignment_3_4_2 = (Assignment)cGroup_3_4.eContents().get(2);
		private final CrossReference cCompilerMCompilerCrossReference_3_4_2_0 = (CrossReference)cCompilerAssignment_3_4_2.eContents().get(0);
		private final RuleCall cCompilerMCompilerVersionedQualifiedNameParserRuleCall_3_4_2_0_1 = (RuleCall)cCompilerMCompilerCrossReference_3_4_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_4_3 = (Keyword)cGroup_3_4.eContents().get(3);
		private final Group cGroup_3_5 = (Group)cUnorderedGroup_3.eContents().get(5);
		private final Keyword cMicroprocessorKeyword_3_5_0 = (Keyword)cGroup_3_5.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_5_1 = (Keyword)cGroup_3_5.eContents().get(1);
		private final Alternatives cAlternatives_3_5_2 = (Alternatives)cGroup_3_5.eContents().get(2);
		private final Keyword cAnyKeyword_3_5_2_0 = (Keyword)cAlternatives_3_5_2.eContents().get(0);
		private final Assignment cMicroprocessorAssignment_3_5_2_1 = (Assignment)cAlternatives_3_5_2.eContents().get(1);
		private final CrossReference cMicroprocessorMMicroprocessorCrossReference_3_5_2_1_0 = (CrossReference)cMicroprocessorAssignment_3_5_2_1.eContents().get(0);
		private final RuleCall cMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_3_5_2_1_0_1 = (RuleCall)cMicroprocessorMMicroprocessorCrossReference_3_5_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_5_3 = (Keyword)cGroup_3_5.eContents().get(3);
		private final Group cGroup_3_6 = (Group)cUnorderedGroup_3.eContents().get(6);
		private final Keyword cBoardKeyword_3_6_0 = (Keyword)cGroup_3_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_6_1 = (Keyword)cGroup_3_6.eContents().get(1);
		private final Alternatives cAlternatives_3_6_2 = (Alternatives)cGroup_3_6.eContents().get(2);
		private final Keyword cAnyKeyword_3_6_2_0 = (Keyword)cAlternatives_3_6_2.eContents().get(0);
		private final Assignment cBoardAssignment_3_6_2_1 = (Assignment)cAlternatives_3_6_2.eContents().get(1);
		private final CrossReference cBoardMBoardCrossReference_3_6_2_1_0 = (CrossReference)cBoardAssignment_3_6_2_1.eContents().get(0);
		private final RuleCall cBoardMBoardVersionedQualifiedNameParserRuleCall_3_6_2_1_0_1 = (RuleCall)cBoardMBoardCrossReference_3_6_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_6_3 = (Keyword)cGroup_3_6.eContents().get(3);
		private final Group cGroup_3_7 = (Group)cUnorderedGroup_3.eContents().get(7);
		private final Keyword cConfigurationKeyword_3_7_0 = (Keyword)cGroup_3_7.eContents().get(0);
		private final Keyword cParametersKeyword_3_7_1 = (Keyword)cGroup_3_7.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3_7_2 = (Keyword)cGroup_3_7.eContents().get(2);
		private final Assignment cParametersAssignment_3_7_3 = (Assignment)cGroup_3_7.eContents().get(3);
		private final RuleCall cParametersMParameterWithoutOSSPParserRuleCall_3_7_3_0 = (RuleCall)cParametersAssignment_3_7_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_7_4 = (Keyword)cGroup_3_7.eContents().get(4);
		private final Keyword cSemicolonKeyword_3_7_5 = (Keyword)cGroup_3_7.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MPlatform:
		//	"platform" name=ID "{" ("version" ":=" version=Version ";" & "osapi" ":="
		//	osapi=[MOperatingSystemAPI|VersionedQualifiedName] ";" & "os" ":=" os=[MOperatingSystem|VersionedQualifiedName] ";" &
		//	"architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":="
		//	compiler=[MCompiler|VersionedQualifiedName] ";" & "microprocessor" ":=" ("any" |
		//	microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
		//	board=[MBoard|VersionedQualifiedName]) ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}"
		//	";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"platform" name=ID "{" ("version" ":=" version=Version ";" & "osapi" ":="
		//osapi=[MOperatingSystemAPI|VersionedQualifiedName] ";" & "os" ":=" os=[MOperatingSystem|VersionedQualifiedName] ";" &
		//"architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":="
		//compiler=[MCompiler|VersionedQualifiedName] ";" & "microprocessor" ":=" ("any" |
		//microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
		//board=[MBoard|VersionedQualifiedName]) ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}"
		//";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"platform"
		public Keyword getPlatformKeyword_0() { return cPlatformKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"version" ":=" version=Version ";" & "osapi" ":=" osapi=[MOperatingSystemAPI|VersionedQualifiedName] ";" & "os" ":="
		//os=[MOperatingSystem|VersionedQualifiedName] ";" & "architecture" ":="
		//architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":=" compiler=[MCompiler|VersionedQualifiedName]
		//";" & "microprocessor" ":=" ("any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any"
		//| board=[MBoard|VersionedQualifiedName]) ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}"
		//";")?
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

		//"osapi" ":=" osapi=[MOperatingSystemAPI|VersionedQualifiedName] ";"
		public Group getGroup_3_1() { return cGroup_3_1; }

		//"osapi"
		public Keyword getOsapiKeyword_3_1_0() { return cOsapiKeyword_3_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_1_1() { return cColonEqualsSignKeyword_3_1_1; }

		//osapi=[MOperatingSystemAPI|VersionedQualifiedName]
		public Assignment getOsapiAssignment_3_1_2() { return cOsapiAssignment_3_1_2; }

		//[MOperatingSystemAPI|VersionedQualifiedName]
		public CrossReference getOsapiMOperatingSystemAPICrossReference_3_1_2_0() { return cOsapiMOperatingSystemAPICrossReference_3_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_3_1_2_0_1() { return cOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_3_1_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_1_3() { return cSemicolonKeyword_3_1_3; }

		//"os" ":=" os=[MOperatingSystem|VersionedQualifiedName] ";"
		public Group getGroup_3_2() { return cGroup_3_2; }

		//"os"
		public Keyword getOsKeyword_3_2_0() { return cOsKeyword_3_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_2_1() { return cColonEqualsSignKeyword_3_2_1; }

		//os=[MOperatingSystem|VersionedQualifiedName]
		public Assignment getOsAssignment_3_2_2() { return cOsAssignment_3_2_2; }

		//[MOperatingSystem|VersionedQualifiedName]
		public CrossReference getOsMOperatingSystemCrossReference_3_2_2_0() { return cOsMOperatingSystemCrossReference_3_2_2_0; }

		//VersionedQualifiedName
		public RuleCall getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_3_2_2_0_1() { return cOsMOperatingSystemVersionedQualifiedNameParserRuleCall_3_2_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_2_3() { return cSemicolonKeyword_3_2_3; }

		//"architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";"
		public Group getGroup_3_3() { return cGroup_3_3; }

		//"architecture"
		public Keyword getArchitectureKeyword_3_3_0() { return cArchitectureKeyword_3_3_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_3_1() { return cColonEqualsSignKeyword_3_3_1; }

		//architecture=[MArchitecture|VersionedQualifiedName]
		public Assignment getArchitectureAssignment_3_3_2() { return cArchitectureAssignment_3_3_2; }

		//[MArchitecture|VersionedQualifiedName]
		public CrossReference getArchitectureMArchitectureCrossReference_3_3_2_0() { return cArchitectureMArchitectureCrossReference_3_3_2_0; }

		//VersionedQualifiedName
		public RuleCall getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_3_3_2_0_1() { return cArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_3_3_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_3_3() { return cSemicolonKeyword_3_3_3; }

		//"compiler" ":=" compiler=[MCompiler|VersionedQualifiedName] ";"
		public Group getGroup_3_4() { return cGroup_3_4; }

		//"compiler"
		public Keyword getCompilerKeyword_3_4_0() { return cCompilerKeyword_3_4_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_4_1() { return cColonEqualsSignKeyword_3_4_1; }

		//compiler=[MCompiler|VersionedQualifiedName]
		public Assignment getCompilerAssignment_3_4_2() { return cCompilerAssignment_3_4_2; }

		//[MCompiler|VersionedQualifiedName]
		public CrossReference getCompilerMCompilerCrossReference_3_4_2_0() { return cCompilerMCompilerCrossReference_3_4_2_0; }

		//VersionedQualifiedName
		public RuleCall getCompilerMCompilerVersionedQualifiedNameParserRuleCall_3_4_2_0_1() { return cCompilerMCompilerVersionedQualifiedNameParserRuleCall_3_4_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_4_3() { return cSemicolonKeyword_3_4_3; }

		//"microprocessor" ":=" ("any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";"
		public Group getGroup_3_5() { return cGroup_3_5; }

		//"microprocessor"
		public Keyword getMicroprocessorKeyword_3_5_0() { return cMicroprocessorKeyword_3_5_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_5_1() { return cColonEqualsSignKeyword_3_5_1; }

		//"any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]
		public Alternatives getAlternatives_3_5_2() { return cAlternatives_3_5_2; }

		//"any"
		public Keyword getAnyKeyword_3_5_2_0() { return cAnyKeyword_3_5_2_0; }

		//microprocessor=[MMicroprocessor|VersionedQualifiedName]
		public Assignment getMicroprocessorAssignment_3_5_2_1() { return cMicroprocessorAssignment_3_5_2_1; }

		//[MMicroprocessor|VersionedQualifiedName]
		public CrossReference getMicroprocessorMMicroprocessorCrossReference_3_5_2_1_0() { return cMicroprocessorMMicroprocessorCrossReference_3_5_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_3_5_2_1_0_1() { return cMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_3_5_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_5_3() { return cSemicolonKeyword_3_5_3; }

		//"board" ":=" ("any" | board=[MBoard|VersionedQualifiedName]) ";"
		public Group getGroup_3_6() { return cGroup_3_6; }

		//"board"
		public Keyword getBoardKeyword_3_6_0() { return cBoardKeyword_3_6_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_3_6_1() { return cColonEqualsSignKeyword_3_6_1; }

		//"any" | board=[MBoard|VersionedQualifiedName]
		public Alternatives getAlternatives_3_6_2() { return cAlternatives_3_6_2; }

		//"any"
		public Keyword getAnyKeyword_3_6_2_0() { return cAnyKeyword_3_6_2_0; }

		//board=[MBoard|VersionedQualifiedName]
		public Assignment getBoardAssignment_3_6_2_1() { return cBoardAssignment_3_6_2_1; }

		//[MBoard|VersionedQualifiedName]
		public CrossReference getBoardMBoardCrossReference_3_6_2_1_0() { return cBoardMBoardCrossReference_3_6_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getBoardMBoardVersionedQualifiedNameParserRuleCall_3_6_2_1_0_1() { return cBoardMBoardVersionedQualifiedNameParserRuleCall_3_6_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_6_3() { return cSemicolonKeyword_3_6_3; }

		//("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
		public Group getGroup_3_7() { return cGroup_3_7; }

		//"configuration"
		public Keyword getConfigurationKeyword_3_7_0() { return cConfigurationKeyword_3_7_0; }

		//"parameters"
		public Keyword getParametersKeyword_3_7_1() { return cParametersKeyword_3_7_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_7_2() { return cLeftCurlyBracketKeyword_3_7_2; }

		//parameters+=MParameterWithoutOSSP+
		public Assignment getParametersAssignment_3_7_3() { return cParametersAssignment_3_7_3; }

		//MParameterWithoutOSSP
		public RuleCall getParametersMParameterWithoutOSSPParserRuleCall_3_7_3_0() { return cParametersMParameterWithoutOSSPParserRuleCall_3_7_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_7_4() { return cRightCurlyBracketKeyword_3_7_4; }

		//";"
		public Keyword getSemicolonKeyword_3_7_5() { return cSemicolonKeyword_3_7_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
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
	
	private MPDLPackageFileElements pMPDLPackageFile;
	private MPDLPackageElementElements pMPDLPackageElement;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionedQualifiedNameElements pVersionedQualifiedName;
	private VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private MCompilerElements pMCompiler;
	private MCompilerFrontendElements pMCompilerFrontend;
	private MBoardElements pMBoard;
	private MBoardSupportedDeviceElements pMBoardSupportedDevice;
	private MMicroprocessorElements pMMicroprocessor;
	private MOperatingSystemElements pMOperatingSystem;
	private MOSSupportedOSAPIElements pMOSSupportedOSAPI;
	private MOSSupportedOSAPIPVAElements pMOSSupportedOSAPIPVA;
	private MOSSupportedOSAPIPVAExpressionElements pMOSSupportedOSAPIPVAExpression;
	private MOSSupportedOSAPIPVASwitchElements pMOSSupportedOSAPIPVASwitch;
	private MOSSupportedOSAPIPVASwitchCaseElements pMOSSupportedOSAPIPVASwitchCase;
	private MParameterElements pMParameter;
	private MBooleanParamOSSPSwitchElements pMBooleanParamOSSPSwitch;
	private MBooleanParamOSSPSwitchCaseElements pMBooleanParamOSSPSwitchCase;
	private MStringParamOSSPSwitchElements pMStringParamOSSPSwitch;
	private MStringParamOSSPSwitchCaseElements pMStringParamOSSPSwitchCase;
	private MIntegerParamOSSPSwitchElements pMIntegerParamOSSPSwitch;
	private MIntegerParamOSSPSwitchCaseElements pMIntegerParamOSSPSwitchCase;
	private MRealParamOSSPSwitchElements pMRealParamOSSPSwitch;
	private MRealParamOSSPSwitchCaseElements pMRealParamOSSPSwitchCase;
	private MEnumParamOSSPSwitchElements pMEnumParamOSSPSwitch;
	private MEnumParamOSSPSwitchCaseElements pMEnumParamOSSPSwitchCase;
	private MParameterWithoutOSSPElements pMParameterWithoutOSSP;
	private MIntegerParameterSingleExpressionElements pMIntegerParameterSingleExpression;
	private MEnumParameterDefinitionElements pMEnumParameterDefinition;
	private MEnumParameterSingleExpressionElements pMEnumParameterSingleExpression;
	private MRealParameterSingleExpressionElements pMRealParameterSingleExpression;
	private MEnumParameterLiteralRuleElements pMEnumParameterLiteralRule;
	private MEnumParameterLiteralElements pMEnumParameterLiteral;
	private MEnumParamIntegerLiteralElements pMEnumParamIntegerLiteral;
	private MEnumParamRealLiteralElements pMEnumParamRealLiteral;
	private MEnumParamStringLiteralElements pMEnumParamStringLiteral;
	private MBooleanParameterSingleExpressionElements pMBooleanParameterSingleExpression;
	private MStringParameterSingleExpressionElements pMStringParameterSingleExpression;
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
	private MParameterRangeElements pMParameterRange;
	private MParameterOCRElements pMParameterOCR;
	private MParameterOORElements pMParameterOOR;
	private MParameterCORElements pMParameterCOR;
	private MParameterCCRElements pMParameterCCR;
	private MOperatingSystemAPIElements pMOperatingSystemAPI;
	private MDeviceElements pMDevice;
	private MArchitectureElements pMArchitecture;
	private MOSSupportedPlatformElements pMOSSupportedPlatform;
	private MPlatformElements pMPlatform;
	private EBooleanElements pEBoolean;
	private TerminalRule tHEXADECIMAL;
	private INTEGERElements pINTEGER;
	private REALElements pREAL;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public PDLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.lang.PDL".equals(grammar.getName())) {
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

	
	//MPDLPackageFile:
	//	"package" package=[pdllibrary::MPDLPackage|QualifiedName] ";" ("import"
	//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MPDLPackageElement;
	public MPDLPackageFileElements getMPDLPackageFileAccess() {
		return (pMPDLPackageFile != null) ? pMPDLPackageFile : (pMPDLPackageFile = new MPDLPackageFileElements());
	}
	
	public ParserRule getMPDLPackageFileRule() {
		return getMPDLPackageFileAccess().getRule();
	}

	//MPDLPackageElement:
	//	MBoard | MMicroprocessor | MOperatingSystem | MOperatingSystemAPI | MArchitecture | MPlatform | MCompiler | MDevice;
	public MPDLPackageElementElements getMPDLPackageElementAccess() {
		return (pMPDLPackageElement != null) ? pMPDLPackageElement : (pMPDLPackageElement = new MPDLPackageElementElements());
	}
	
	public ParserRule getMPDLPackageElementRule() {
		return getMPDLPackageElementAccess().getRule();
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

	//MCompiler:
	//	"compiler" name=ID ("extends" extends+=[MCompiler|VersionedQualifiedName] (","
	//	extends+=[MCompiler|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("frontends" "{"
	//	frontends+=MCompilerFrontend+ "}" ";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}"
	//	";")?) "}" ";";
	public MCompilerElements getMCompilerAccess() {
		return (pMCompiler != null) ? pMCompiler : (pMCompiler = new MCompilerElements());
	}
	
	public ParserRule getMCompilerRule() {
		return getMCompilerAccess().getRule();
	}

	//MCompilerFrontend:
	//	"frontend" name=ID "{" ("language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" & "architectures" ":="
	//	architectures+=[MArchitecture|VersionedQualifiedName] ("," architectures+=[MArchitecture|VersionedQualifiedName])* ";"
	//	& ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
	public MCompilerFrontendElements getMCompilerFrontendAccess() {
		return (pMCompilerFrontend != null) ? pMCompilerFrontend : (pMCompilerFrontend = new MCompilerFrontendElements());
	}
	
	public ParserRule getMCompilerFrontendRule() {
		return getMCompilerFrontendAccess().getRule();
	}

	//MBoard:
	//	"board" name=ID "{" ("version" ":=" version=Version ";" & ("supported" "devices" "{"
	//	supportedDevices+=MBoardSupportedDevice+ "}" ";")? & "microprocessor" ":="
	//	microprocessor=[MMicroprocessor|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
	//	parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
	public MBoardElements getMBoardAccess() {
		return (pMBoard != null) ? pMBoard : (pMBoard = new MBoardElements());
	}
	
	public ParserRule getMBoardRule() {
		return getMBoardAccess().getRule();
	}

	//MBoardSupportedDevice:
	//	"device" device=[MDevice|VersionedQualifiedName] "range" lowerBound=MParameterValueExpression "to"
	//	upperBound=MParameterValueExpression ";";
	public MBoardSupportedDeviceElements getMBoardSupportedDeviceAccess() {
		return (pMBoardSupportedDevice != null) ? pMBoardSupportedDevice : (pMBoardSupportedDevice = new MBoardSupportedDeviceElements());
	}
	
	public ParserRule getMBoardSupportedDeviceRule() {
		return getMBoardSupportedDeviceAccess().getRule();
	}

	//MMicroprocessor:
	//	"microprocessor" name=ID "{" ("version" ":=" version=Version ";" & "architecture" ":="
	//	architecture=[MArchitecture|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
	//	parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
	public MMicroprocessorElements getMMicroprocessorAccess() {
		return (pMMicroprocessor != null) ? pMMicroprocessor : (pMMicroprocessor = new MMicroprocessorElements());
	}
	
	public ParserRule getMMicroprocessorRule() {
		return getMMicroprocessorAccess().getRule();
	}

	//MOperatingSystem:
	//	"os" name=ID ("inherits" inherits+=[MOperatingSystem|VersionedQualifiedName] (","
	//	inherits+=[MOperatingSystem|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
	//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
	//	& ("supported" "osapis" "{" supportedOSAPIs+=MOSSupportedOSAPI+ "}" ";")? & "supported" "platforms" "{"
	//	supportedPlatforms+=MOSSupportedPlatform+ "}" ";" & ("configuration" "parameters" "{" parameters+=MParameter+ "}"
	//	";")?) "}" ";";
	public MOperatingSystemElements getMOperatingSystemAccess() {
		return (pMOperatingSystem != null) ? pMOperatingSystem : (pMOperatingSystem = new MOperatingSystemElements());
	}
	
	public ParserRule getMOperatingSystemRule() {
		return getMOperatingSystemAccess().getRule();
	}

	//MOSSupportedOSAPI:
	//	"supports" osapi=[MOperatingSystemAPI|VersionedQualifiedName] "{" parameterValueAssignments+=MOSSupportedOSAPIPVA* "}"
	//	";";
	public MOSSupportedOSAPIElements getMOSSupportedOSAPIAccess() {
		return (pMOSSupportedOSAPI != null) ? pMOSSupportedOSAPI : (pMOSSupportedOSAPI = new MOSSupportedOSAPIElements());
	}
	
	public ParserRule getMOSSupportedOSAPIRule() {
		return getMOSSupportedOSAPIAccess().getRule();
	}

	//MOSSupportedOSAPIPVA:
	//	MOSSupportedOSAPIPVAExpression | MOSSupportedOSAPIPVASwitch;
	public MOSSupportedOSAPIPVAElements getMOSSupportedOSAPIPVAAccess() {
		return (pMOSSupportedOSAPIPVA != null) ? pMOSSupportedOSAPIPVA : (pMOSSupportedOSAPIPVA = new MOSSupportedOSAPIPVAElements());
	}
	
	public ParserRule getMOSSupportedOSAPIPVARule() {
		return getMOSSupportedOSAPIPVAAccess().getRule();
	}

	//MOSSupportedOSAPIPVAExpression:
	//	"parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":="
	//	parameterValue=MParameterValueExpression ";";
	public MOSSupportedOSAPIPVAExpressionElements getMOSSupportedOSAPIPVAExpressionAccess() {
		return (pMOSSupportedOSAPIPVAExpression != null) ? pMOSSupportedOSAPIPVAExpression : (pMOSSupportedOSAPIPVAExpression = new MOSSupportedOSAPIPVAExpressionElements());
	}
	
	public ParserRule getMOSSupportedOSAPIPVAExpressionRule() {
		return getMOSSupportedOSAPIPVAExpressionAccess().getRule();
	}

	//MOSSupportedOSAPIPVASwitch:
	//	"switch" "(" parameter=[common::MParameter|VersionedQualifiedReferenceName] ")" "{"
	//	cases+=MOSSupportedOSAPIPVASwitchCase "}" ";";
	public MOSSupportedOSAPIPVASwitchElements getMOSSupportedOSAPIPVASwitchAccess() {
		return (pMOSSupportedOSAPIPVASwitch != null) ? pMOSSupportedOSAPIPVASwitch : (pMOSSupportedOSAPIPVASwitch = new MOSSupportedOSAPIPVASwitchElements());
	}
	
	public ParserRule getMOSSupportedOSAPIPVASwitchRule() {
		return getMOSSupportedOSAPIPVASwitchAccess().getRule();
	}

	//MOSSupportedOSAPIPVASwitchCase:
	//	"case" platform=[MOSSupportedPlatform] ":" parameterValue=MParameterValueExpression ";";
	public MOSSupportedOSAPIPVASwitchCaseElements getMOSSupportedOSAPIPVASwitchCaseAccess() {
		return (pMOSSupportedOSAPIPVASwitchCase != null) ? pMOSSupportedOSAPIPVASwitchCase : (pMOSSupportedOSAPIPVASwitchCase = new MOSSupportedOSAPIPVASwitchCaseElements());
	}
	
	public ParserRule getMOSSupportedOSAPIPVASwitchCaseRule() {
		return getMOSSupportedOSAPIPVASwitchCaseAccess().getRule();
	}

	//MParameter returns common::MParameter:
	//	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
	//	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition | MBooleanParamOSSPSwitch
	//	| MStringParamOSSPSwitch | MIntegerParamOSSPSwitch | MRealParamOSSPSwitch | MEnumParamOSSPSwitch;
	public MParameterElements getMParameterAccess() {
		return (pMParameter != null) ? pMParameter : (pMParameter = new MParameterElements());
	}
	
	public ParserRule getMParameterRule() {
		return getMParameterAccess().getRule();
	}

	//MBooleanParamOSSPSwitch:
	//	constant?="const"? "boolean" name=ID ":=" "switch" "{" cases+=MBooleanParamOSSPSwitchCase+ "}" ";";
	public MBooleanParamOSSPSwitchElements getMBooleanParamOSSPSwitchAccess() {
		return (pMBooleanParamOSSPSwitch != null) ? pMBooleanParamOSSPSwitch : (pMBooleanParamOSSPSwitch = new MBooleanParamOSSPSwitchElements());
	}
	
	public ParserRule getMBooleanParamOSSPSwitchRule() {
		return getMBooleanParamOSSPSwitchAccess().getRule();
	}

	//MBooleanParamOSSPSwitchCase:
	//	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
	public MBooleanParamOSSPSwitchCaseElements getMBooleanParamOSSPSwitchCaseAccess() {
		return (pMBooleanParamOSSPSwitchCase != null) ? pMBooleanParamOSSPSwitchCase : (pMBooleanParamOSSPSwitchCase = new MBooleanParamOSSPSwitchCaseElements());
	}
	
	public ParserRule getMBooleanParamOSSPSwitchCaseRule() {
		return getMBooleanParamOSSPSwitchCaseAccess().getRule();
	}

	//MStringParamOSSPSwitch:
	//	constant?="const"? "string" name=ID ":=" "switch" "{" cases+=MStringParamOSSPSwitchCase+ "}" ";";
	public MStringParamOSSPSwitchElements getMStringParamOSSPSwitchAccess() {
		return (pMStringParamOSSPSwitch != null) ? pMStringParamOSSPSwitch : (pMStringParamOSSPSwitch = new MStringParamOSSPSwitchElements());
	}
	
	public ParserRule getMStringParamOSSPSwitchRule() {
		return getMStringParamOSSPSwitchAccess().getRule();
	}

	//MStringParamOSSPSwitchCase:
	//	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
	public MStringParamOSSPSwitchCaseElements getMStringParamOSSPSwitchCaseAccess() {
		return (pMStringParamOSSPSwitchCase != null) ? pMStringParamOSSPSwitchCase : (pMStringParamOSSPSwitchCase = new MStringParamOSSPSwitchCaseElements());
	}
	
	public ParserRule getMStringParamOSSPSwitchCaseRule() {
		return getMStringParamOSSPSwitchCaseAccess().getRule();
	}

	//MIntegerParamOSSPSwitch:
	//	constant?="const"? "integer" name=ID ":=" "switch" "{" cases+=MIntegerParamOSSPSwitchCase+ "}" ";";
	public MIntegerParamOSSPSwitchElements getMIntegerParamOSSPSwitchAccess() {
		return (pMIntegerParamOSSPSwitch != null) ? pMIntegerParamOSSPSwitch : (pMIntegerParamOSSPSwitch = new MIntegerParamOSSPSwitchElements());
	}
	
	public ParserRule getMIntegerParamOSSPSwitchRule() {
		return getMIntegerParamOSSPSwitchAccess().getRule();
	}

	//MIntegerParamOSSPSwitchCase:
	//	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range" range=MParameterRange)?
	//	";";
	public MIntegerParamOSSPSwitchCaseElements getMIntegerParamOSSPSwitchCaseAccess() {
		return (pMIntegerParamOSSPSwitchCase != null) ? pMIntegerParamOSSPSwitchCase : (pMIntegerParamOSSPSwitchCase = new MIntegerParamOSSPSwitchCaseElements());
	}
	
	public ParserRule getMIntegerParamOSSPSwitchCaseRule() {
		return getMIntegerParamOSSPSwitchCaseAccess().getRule();
	}

	//MRealParamOSSPSwitch:
	//	constant?="const"? "real" name=ID ":=" "switch" "{" cases+=MRealParamOSSPSwitchCase+ "}" ";";
	public MRealParamOSSPSwitchElements getMRealParamOSSPSwitchAccess() {
		return (pMRealParamOSSPSwitch != null) ? pMRealParamOSSPSwitch : (pMRealParamOSSPSwitch = new MRealParamOSSPSwitchElements());
	}
	
	public ParserRule getMRealParamOSSPSwitchRule() {
		return getMRealParamOSSPSwitchAccess().getRule();
	}

	//MRealParamOSSPSwitchCase:
	//	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range" range=MParameterRange)?
	//	";";
	public MRealParamOSSPSwitchCaseElements getMRealParamOSSPSwitchCaseAccess() {
		return (pMRealParamOSSPSwitchCase != null) ? pMRealParamOSSPSwitchCase : (pMRealParamOSSPSwitchCase = new MRealParamOSSPSwitchCaseElements());
	}
	
	public ParserRule getMRealParamOSSPSwitchCaseRule() {
		return getMRealParamOSSPSwitchCaseAccess().getRule();
	}

	//MEnumParamOSSPSwitch:
	//	constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
	//	":=" "switch" "{" cases+=MEnumParamOSSPSwitchCase+ "}" ";";
	public MEnumParamOSSPSwitchElements getMEnumParamOSSPSwitchAccess() {
		return (pMEnumParamOSSPSwitch != null) ? pMEnumParamOSSPSwitch : (pMEnumParamOSSPSwitch = new MEnumParamOSSPSwitchElements());
	}
	
	public ParserRule getMEnumParamOSSPSwitchRule() {
		return getMEnumParamOSSPSwitchAccess().getRule();
	}

	//MEnumParamOSSPSwitchCase:
	//	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
	public MEnumParamOSSPSwitchCaseElements getMEnumParamOSSPSwitchCaseAccess() {
		return (pMEnumParamOSSPSwitchCase != null) ? pMEnumParamOSSPSwitchCase : (pMEnumParamOSSPSwitchCase = new MEnumParamOSSPSwitchCaseElements());
	}
	
	public ParserRule getMEnumParamOSSPSwitchCaseRule() {
		return getMEnumParamOSSPSwitchCaseAccess().getRule();
	}

	//MParameterWithoutOSSP returns common::MParameter:
	//	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
	//	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition;
	public MParameterWithoutOSSPElements getMParameterWithoutOSSPAccess() {
		return (pMParameterWithoutOSSP != null) ? pMParameterWithoutOSSP : (pMParameterWithoutOSSP = new MParameterWithoutOSSPElements());
	}
	
	public ParserRule getMParameterWithoutOSSPRule() {
		return getMParameterWithoutOSSPAccess().getRule();
	}

	//MIntegerParameterSingleExpression returns common::MIntegerParameterSingleExpression:
	//	constant?="const"? "integer" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";";
	public MIntegerParameterSingleExpressionElements getMIntegerParameterSingleExpressionAccess() {
		return (pMIntegerParameterSingleExpression != null) ? pMIntegerParameterSingleExpression : (pMIntegerParameterSingleExpression = new MIntegerParameterSingleExpressionElements());
	}
	
	public ParserRule getMIntegerParameterSingleExpressionRule() {
		return getMIntegerParameterSingleExpressionAccess().getRule();
	}

	//MEnumParameterDefinition returns common::MEnumParameterDefinition:
	//	"enum" name=ID "{" literals+=MEnumParameterLiteralRule ("," literals+=MEnumParameterLiteralRule)* "}" ";";
	public MEnumParameterDefinitionElements getMEnumParameterDefinitionAccess() {
		return (pMEnumParameterDefinition != null) ? pMEnumParameterDefinition : (pMEnumParameterDefinition = new MEnumParameterDefinitionElements());
	}
	
	public ParserRule getMEnumParameterDefinitionRule() {
		return getMEnumParameterDefinitionAccess().getRule();
	}

	//MEnumParameterSingleExpression returns common::MEnumParameterSingleExpression:
	//	constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
	//	":=" defaultValue=MParameterValueExpression ";";
	public MEnumParameterSingleExpressionElements getMEnumParameterSingleExpressionAccess() {
		return (pMEnumParameterSingleExpression != null) ? pMEnumParameterSingleExpression : (pMEnumParameterSingleExpression = new MEnumParameterSingleExpressionElements());
	}
	
	public ParserRule getMEnumParameterSingleExpressionRule() {
		return getMEnumParameterSingleExpressionAccess().getRule();
	}

	//MRealParameterSingleExpression returns common::MRealParameterSingleExpression:
	//	constant?="const"? "real" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";";
	public MRealParameterSingleExpressionElements getMRealParameterSingleExpressionAccess() {
		return (pMRealParameterSingleExpression != null) ? pMRealParameterSingleExpression : (pMRealParameterSingleExpression = new MRealParameterSingleExpressionElements());
	}
	
	public ParserRule getMRealParameterSingleExpressionRule() {
		return getMRealParameterSingleExpressionAccess().getRule();
	}

	//MEnumParameterLiteralRule returns common::MEnumParameterLiteral:
	//	MEnumParameterLiteral | MEnumParamIntegerLiteral | MEnumParamRealLiteral | MEnumParamStringLiteral;
	public MEnumParameterLiteralRuleElements getMEnumParameterLiteralRuleAccess() {
		return (pMEnumParameterLiteralRule != null) ? pMEnumParameterLiteralRule : (pMEnumParameterLiteralRule = new MEnumParameterLiteralRuleElements());
	}
	
	public ParserRule getMEnumParameterLiteralRuleRule() {
		return getMEnumParameterLiteralRuleAccess().getRule();
	}

	//MEnumParameterLiteral returns common::MEnumParameterLiteral:
	//	{common::MEnumParameterLiteral} name=ID;
	public MEnumParameterLiteralElements getMEnumParameterLiteralAccess() {
		return (pMEnumParameterLiteral != null) ? pMEnumParameterLiteral : (pMEnumParameterLiteral = new MEnumParameterLiteralElements());
	}
	
	public ParserRule getMEnumParameterLiteralRule() {
		return getMEnumParameterLiteralAccess().getRule();
	}

	//MEnumParamIntegerLiteral returns common::MEnumParamIntegerLiteral:
	//	{common::MEnumParamIntegerLiteral} name=ID "=" value=INTEGER;
	public MEnumParamIntegerLiteralElements getMEnumParamIntegerLiteralAccess() {
		return (pMEnumParamIntegerLiteral != null) ? pMEnumParamIntegerLiteral : (pMEnumParamIntegerLiteral = new MEnumParamIntegerLiteralElements());
	}
	
	public ParserRule getMEnumParamIntegerLiteralRule() {
		return getMEnumParamIntegerLiteralAccess().getRule();
	}

	//MEnumParamRealLiteral returns common::MEnumParamRealLiteral:
	//	{common::MEnumParamRealLiteral} name=ID "=" value=REAL;
	public MEnumParamRealLiteralElements getMEnumParamRealLiteralAccess() {
		return (pMEnumParamRealLiteral != null) ? pMEnumParamRealLiteral : (pMEnumParamRealLiteral = new MEnumParamRealLiteralElements());
	}
	
	public ParserRule getMEnumParamRealLiteralRule() {
		return getMEnumParamRealLiteralAccess().getRule();
	}

	//MEnumParamStringLiteral returns common::MEnumParamStringLiteral:
	//	{common::MEnumParamStringLiteral} name=ID "=" value=STRING;
	public MEnumParamStringLiteralElements getMEnumParamStringLiteralAccess() {
		return (pMEnumParamStringLiteral != null) ? pMEnumParamStringLiteral : (pMEnumParamStringLiteral = new MEnumParamStringLiteralElements());
	}
	
	public ParserRule getMEnumParamStringLiteralRule() {
		return getMEnumParamStringLiteralAccess().getRule();
	}

	//MBooleanParameterSingleExpression returns common::MBooleanParameterSingleExpression:
	//	constant?="const"? "boolean" name=ID ":=" defaultValue=MParameterValueExpression ";";
	public MBooleanParameterSingleExpressionElements getMBooleanParameterSingleExpressionAccess() {
		return (pMBooleanParameterSingleExpression != null) ? pMBooleanParameterSingleExpression : (pMBooleanParameterSingleExpression = new MBooleanParameterSingleExpressionElements());
	}
	
	public ParserRule getMBooleanParameterSingleExpressionRule() {
		return getMBooleanParameterSingleExpressionAccess().getRule();
	}

	//MStringParameterSingleExpression returns common::MStringParameterSingleExpression:
	//	constant?="const"? "string" name=ID ":=" defaultValue=MParameterValueExpression ";";
	public MStringParameterSingleExpressionElements getMStringParameterSingleExpressionAccess() {
		return (pMStringParameterSingleExpression != null) ? pMStringParameterSingleExpression : (pMStringParameterSingleExpression = new MStringParameterSingleExpressionElements());
	}
	
	public ParserRule getMStringParameterSingleExpressionRule() {
		return getMStringParameterSingleExpressionAccess().getRule();
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

	//MParameterRange returns common::MParameterRange:
	//	MParameterOCR | MParameterOOR | MParameterCOR | MParameterCCR;
	public MParameterRangeElements getMParameterRangeAccess() {
		return (pMParameterRange != null) ? pMParameterRange : (pMParameterRange = new MParameterRangeElements());
	}
	
	public ParserRule getMParameterRangeRule() {
		return getMParameterRangeAccess().getRule();
	}

	//MParameterOCR returns common::MParameterOCR:
	//	{common::MParameterOCR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]";
	public MParameterOCRElements getMParameterOCRAccess() {
		return (pMParameterOCR != null) ? pMParameterOCR : (pMParameterOCR = new MParameterOCRElements());
	}
	
	public ParserRule getMParameterOCRRule() {
		return getMParameterOCRAccess().getRule();
	}

	//MParameterOOR returns common::MParameterOOR:
	//	{common::MParameterOOR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")";
	public MParameterOORElements getMParameterOORAccess() {
		return (pMParameterOOR != null) ? pMParameterOOR : (pMParameterOOR = new MParameterOORElements());
	}
	
	public ParserRule getMParameterOORRule() {
		return getMParameterOORAccess().getRule();
	}

	//MParameterCOR returns common::MParameterCOR:
	//	{common::MParameterCOR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")";
	public MParameterCORElements getMParameterCORAccess() {
		return (pMParameterCOR != null) ? pMParameterCOR : (pMParameterCOR = new MParameterCORElements());
	}
	
	public ParserRule getMParameterCORRule() {
		return getMParameterCORAccess().getRule();
	}

	//MParameterCCR returns common::MParameterCCR:
	//	{common::MParameterCCR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]";
	public MParameterCCRElements getMParameterCCRAccess() {
		return (pMParameterCCR != null) ? pMParameterCCR : (pMParameterCCR = new MParameterCCRElements());
	}
	
	public ParserRule getMParameterCCRRule() {
		return getMParameterCCRAccess().getRule();
	}

	//MOperatingSystemAPI:
	//	"osapi" name=ID ("inherits" inherits+=[MOperatingSystemAPI|VersionedQualifiedName] (","
	//	inherits+=[MOperatingSystemAPI|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "language" ":="
	//	language=[system::MLanguage|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
	//	parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
	public MOperatingSystemAPIElements getMOperatingSystemAPIAccess() {
		return (pMOperatingSystemAPI != null) ? pMOperatingSystemAPI : (pMOperatingSystemAPI = new MOperatingSystemAPIElements());
	}
	
	public ParserRule getMOperatingSystemAPIRule() {
		return getMOperatingSystemAPIAccess().getRule();
	}

	//MDevice:
	//	"device" name=ID "{" ("version" ":=" version=Version ";" & ("configuration" "parameters" "{"
	//	parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
	public MDeviceElements getMDeviceAccess() {
		return (pMDevice != null) ? pMDevice : (pMDevice = new MDeviceElements());
	}
	
	public ParserRule getMDeviceRule() {
		return getMDeviceAccess().getRule();
	}

	//MArchitecture:
	//	"architecture" name=ID ("extends" extends+=[MArchitecture|VersionedQualifiedName] (","
	//	extends+=[MArchitecture|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("configuration"
	//	"parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
	public MArchitectureElements getMArchitectureAccess() {
		return (pMArchitecture != null) ? pMArchitecture : (pMArchitecture = new MArchitectureElements());
	}
	
	public ParserRule getMArchitectureRule() {
		return getMArchitectureAccess().getRule();
	}

	//MOSSupportedPlatform:
	//	{MOSSupportedPlatform} "supported" "platform" name=ID "{" ("architecture" ":="
	//	architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":=" compiler=[MCompiler|VersionedQualifiedName]
	//	";" & "microprocessor" ":=" ("any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":="
	//	("any" | board=[MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
	//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
	//	";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
	public MOSSupportedPlatformElements getMOSSupportedPlatformAccess() {
		return (pMOSSupportedPlatform != null) ? pMOSSupportedPlatform : (pMOSSupportedPlatform = new MOSSupportedPlatformElements());
	}
	
	public ParserRule getMOSSupportedPlatformRule() {
		return getMOSSupportedPlatformAccess().getRule();
	}

	//MPlatform:
	//	"platform" name=ID "{" ("version" ":=" version=Version ";" & "osapi" ":="
	//	osapi=[MOperatingSystemAPI|VersionedQualifiedName] ";" & "os" ":=" os=[MOperatingSystem|VersionedQualifiedName] ";" &
	//	"architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":="
	//	compiler=[MCompiler|VersionedQualifiedName] ";" & "microprocessor" ":=" ("any" |
	//	microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
	//	board=[MBoard|VersionedQualifiedName]) ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}"
	//	";")?) "}" ";";
	public MPlatformElements getMPlatformAccess() {
		return (pMPlatform != null) ? pMPlatform : (pMPlatform = new MPlatformElements());
	}
	
	public ParserRule getMPlatformRule() {
		return getMPlatformAccess().getRule();
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
