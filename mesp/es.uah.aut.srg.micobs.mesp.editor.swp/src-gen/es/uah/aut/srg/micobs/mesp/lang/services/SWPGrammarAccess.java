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
public class SWPGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MMESPSWPPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPSWPPackageFile");
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
		private final RuleCall cElementMMESPSWPPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		
		//MMESPSWPPackageFile:
		//	"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
		//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPSWPPackageElement;
		public ParserRule getRule() { return rule; }

		//"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
		//imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPSWPPackageElement
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

		//element=MMESPSWPPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//MMESPSWPPackageElement
		public RuleCall getElementMMESPSWPPackageElementParserRuleCall_4_0() { return cElementMMESPSWPPackageElementParserRuleCall_4_0; }
	}

	public class MMESPSWPPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MMESPSWPPackageElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMDriverSwPackageParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMSwPackageParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMAbstractSwPackageParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//MMESPSWPPackageElement:
		//	MDriverSwPackage | MSwPackage | MAbstractSwPackage;
		public ParserRule getRule() { return rule; }

		//MDriverSwPackage | MSwPackage | MAbstractSwPackage
		public Alternatives getAlternatives() { return cAlternatives; }

		//MDriverSwPackage
		public RuleCall getMDriverSwPackageParserRuleCall_0() { return cMDriverSwPackageParserRuleCall_0; }

		//MSwPackage
		public RuleCall getMSwPackageParserRuleCall_1() { return cMSwPackageParserRuleCall_1; }

		//MAbstractSwPackage
		public RuleCall getMAbstractSwPackageParserRuleCall_2() { return cMAbstractSwPackageParserRuleCall_2; }
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

	public class MAbstractSwPackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MAbstractSwPackage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAbstractKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSwpackageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cInheritsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInheritsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cInheritsMAbstractSwPackageCrossReference_3_1_0 = (CrossReference)cInheritsAssignment_3_1.eContents().get(0);
		private final RuleCall cInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cInheritsMAbstractSwPackageCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cInheritsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cInheritsMAbstractSwPackageCrossReference_3_2_1_0 = (CrossReference)cInheritsAssignment_3_2_1.eContents().get(0);
		private final RuleCall cInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1 = (RuleCall)cInheritsMAbstractSwPackageCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cVersionKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cVersionAssignment_5_0_2 = (Assignment)cGroup_5_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_5_0_2_0 = (RuleCall)cVersionAssignment_5_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_5_0_3 = (Keyword)cGroup_5_0.eContents().get(3);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cConfigurationKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cParametersKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_1_2 = (Keyword)cGroup_5_1.eContents().get(2);
		private final Assignment cParametersAssignment_5_1_3 = (Assignment)cGroup_5_1.eContents().get(3);
		private final RuleCall cParametersMParameterWithoutSWPSPParserRuleCall_5_1_3_0 = (RuleCall)cParametersAssignment_5_1_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_1_4 = (Keyword)cGroup_5_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_1_5 = (Keyword)cGroup_5_1.eContents().get(5);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cProvidedKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Keyword cInterfacesKeyword_5_2_1 = (Keyword)cGroup_5_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_2_2 = (Keyword)cGroup_5_2.eContents().get(2);
		private final Assignment cProvidesAssignment_5_2_3 = (Assignment)cGroup_5_2.eContents().get(3);
		private final RuleCall cProvidesMSwPackageProvidedInterfaceParserRuleCall_5_2_3_0 = (RuleCall)cProvidesAssignment_5_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_2_4 = (Keyword)cGroup_5_2.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_2_5 = (Keyword)cGroup_5_2.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MAbstractSwPackage:
		//	"abstract" "swpackage" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
		//	inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("configuration"
		//	"parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? & ("provided" "interfaces" "{"
		//	provides+=MSwPackageProvidedInterface+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//"abstract" "swpackage" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
		//inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("configuration"
		//"parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? & ("provided" "interfaces" "{"
		//provides+=MSwPackageProvidedInterface+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//"abstract"
		public Keyword getAbstractKeyword_0() { return cAbstractKeyword_0; }

		//"swpackage"
		public Keyword getSwpackageKeyword_1() { return cSwpackageKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
		//inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)?
		public Group getGroup_3() { return cGroup_3; }

		//"inherits"
		public Keyword getInheritsKeyword_3_0() { return cInheritsKeyword_3_0; }

		//inherits+=[MAbstractSwPackage|VersionedQualifiedName]
		public Assignment getInheritsAssignment_3_1() { return cInheritsAssignment_3_1; }

		//[MAbstractSwPackage|VersionedQualifiedName]
		public CrossReference getInheritsMAbstractSwPackageCrossReference_3_1_0() { return cInheritsMAbstractSwPackageCrossReference_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1() { return cInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1; }

		//("," inherits+=[MAbstractSwPackage|VersionedQualifiedName])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//inherits+=[MAbstractSwPackage|VersionedQualifiedName]
		public Assignment getInheritsAssignment_3_2_1() { return cInheritsAssignment_3_2_1; }

		//[MAbstractSwPackage|VersionedQualifiedName]
		public CrossReference getInheritsMAbstractSwPackageCrossReference_3_2_1_0() { return cInheritsMAbstractSwPackageCrossReference_3_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1() { return cInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//"version" ":=" version=Version ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? &
		//("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")?
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

		//("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")?
		public Group getGroup_5_1() { return cGroup_5_1; }

		//"configuration"
		public Keyword getConfigurationKeyword_5_1_0() { return cConfigurationKeyword_5_1_0; }

		//"parameters"
		public Keyword getParametersKeyword_5_1_1() { return cParametersKeyword_5_1_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_1_2() { return cLeftCurlyBracketKeyword_5_1_2; }

		//parameters+=MParameterWithoutSWPSP+
		public Assignment getParametersAssignment_5_1_3() { return cParametersAssignment_5_1_3; }

		//MParameterWithoutSWPSP
		public RuleCall getParametersMParameterWithoutSWPSPParserRuleCall_5_1_3_0() { return cParametersMParameterWithoutSWPSPParserRuleCall_5_1_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_1_4() { return cRightCurlyBracketKeyword_5_1_4; }

		//";"
		public Keyword getSemicolonKeyword_5_1_5() { return cSemicolonKeyword_5_1_5; }

		//("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")?
		public Group getGroup_5_2() { return cGroup_5_2; }

		//"provided"
		public Keyword getProvidedKeyword_5_2_0() { return cProvidedKeyword_5_2_0; }

		//"interfaces"
		public Keyword getInterfacesKeyword_5_2_1() { return cInterfacesKeyword_5_2_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_2_2() { return cLeftCurlyBracketKeyword_5_2_2; }

		//provides+=MSwPackageProvidedInterface+
		public Assignment getProvidesAssignment_5_2_3() { return cProvidesAssignment_5_2_3; }

		//MSwPackageProvidedInterface
		public RuleCall getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_2_3_0() { return cProvidesMSwPackageProvidedInterfaceParserRuleCall_5_2_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_2_4() { return cRightCurlyBracketKeyword_5_2_4; }

		//";"
		public Keyword getSemicolonKeyword_5_2_5() { return cSemicolonKeyword_5_2_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MSwPackageProvidedInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MSwPackageProvidedInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProvidesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSwinterfaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSwinterfaceMSwInterfaceCrossReference_1_0 = (CrossReference)cSwinterfaceAssignment_1.eContents().get(0);
		private final RuleCall cSwinterfaceMSwInterfaceVersionedQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cSwinterfaceMSwInterfaceCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterValueAssignmentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterValueAssignmentsMSwPackageProvidedInterfacePVAParserRuleCall_3_0 = (RuleCall)cParameterValueAssignmentsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MSwPackageProvidedInterface:
		//	"provides" swinterface=[mespswi::MSwInterface|VersionedQualifiedName] "{"
		//	parameterValueAssignments+=MSwPackageProvidedInterfacePVA* "}" ";";
		public ParserRule getRule() { return rule; }

		//"provides" swinterface=[mespswi::MSwInterface|VersionedQualifiedName] "{"
		//parameterValueAssignments+=MSwPackageProvidedInterfacePVA* "}" ";"
		public Group getGroup() { return cGroup; }

		//"provides"
		public Keyword getProvidesKeyword_0() { return cProvidesKeyword_0; }

		//swinterface=[mespswi::MSwInterface|VersionedQualifiedName]
		public Assignment getSwinterfaceAssignment_1() { return cSwinterfaceAssignment_1; }

		//[mespswi::MSwInterface|VersionedQualifiedName]
		public CrossReference getSwinterfaceMSwInterfaceCrossReference_1_0() { return cSwinterfaceMSwInterfaceCrossReference_1_0; }

		//VersionedQualifiedName
		public RuleCall getSwinterfaceMSwInterfaceVersionedQualifiedNameParserRuleCall_1_0_1() { return cSwinterfaceMSwInterfaceVersionedQualifiedNameParserRuleCall_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//parameterValueAssignments+=MSwPackageProvidedInterfacePVA*
		public Assignment getParameterValueAssignmentsAssignment_3() { return cParameterValueAssignmentsAssignment_3; }

		//MSwPackageProvidedInterfacePVA
		public RuleCall getParameterValueAssignmentsMSwPackageProvidedInterfacePVAParserRuleCall_3_0() { return cParameterValueAssignmentsMSwPackageProvidedInterfacePVAParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class MSwPackageProvidedInterfacePVAElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MSwPackageProvidedInterfacePVA");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMSwPackageProvidedInterfacePVAExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMSwPackageProvidedInterfacePVASwitchParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MSwPackageProvidedInterfacePVA:
		//	MSwPackageProvidedInterfacePVAExpression | MSwPackageProvidedInterfacePVASwitch;
		public ParserRule getRule() { return rule; }

		//MSwPackageProvidedInterfacePVAExpression | MSwPackageProvidedInterfacePVASwitch
		public Alternatives getAlternatives() { return cAlternatives; }

		//MSwPackageProvidedInterfacePVAExpression
		public RuleCall getMSwPackageProvidedInterfacePVAExpressionParserRuleCall_0() { return cMSwPackageProvidedInterfacePVAExpressionParserRuleCall_0; }

		//MSwPackageProvidedInterfacePVASwitch
		public RuleCall getMSwPackageProvidedInterfacePVASwitchParserRuleCall_1() { return cMSwPackageProvidedInterfacePVASwitchParserRuleCall_1; }
	}

	public class MSwPackageProvidedInterfacePVAExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MSwPackageProvidedInterfacePVAExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParameterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParameterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParameterMParameterCrossReference_1_0 = (CrossReference)cParameterAssignment_1.eContents().get(0);
		private final RuleCall cParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1 = (RuleCall)cParameterMParameterCrossReference_1_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cParameterValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MSwPackageProvidedInterfacePVAExpression:
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

	public class MSwPackageProvidedInterfacePVASwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MSwPackageProvidedInterfacePVASwitch");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParameterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParameterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cParameterMParameterCrossReference_1_0 = (CrossReference)cParameterAssignment_1.eContents().get(0);
		private final RuleCall cParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1 = (RuleCall)cParameterMParameterCrossReference_1_0.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cSwitchKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cCasesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCasesMSwPackageProvidedInterfacePVASwitchCaseParserRuleCall_5_0 = (RuleCall)cCasesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MSwPackageProvidedInterfacePVASwitch:
		//	"parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" "switch" "{"
		//	cases+=MSwPackageProvidedInterfacePVASwitchCase+ "}" ";";
		public ParserRule getRule() { return rule; }

		//"parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" "switch" "{"
		//cases+=MSwPackageProvidedInterfacePVASwitchCase+ "}" ";"
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

		//"switch"
		public Keyword getSwitchKeyword_3() { return cSwitchKeyword_3; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//cases+=MSwPackageProvidedInterfacePVASwitchCase+
		public Assignment getCasesAssignment_5() { return cCasesAssignment_5; }

		//MSwPackageProvidedInterfacePVASwitchCase
		public RuleCall getCasesMSwPackageProvidedInterfacePVASwitchCaseParserRuleCall_5_0() { return cCasesMSwPackageProvidedInterfacePVASwitchCaseParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MSwPackageProvidedInterfacePVASwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MSwPackageProvidedInterfacePVASwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMSwPackageSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMSwPackageSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParameterValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParameterValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cParameterValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MSwPackageProvidedInterfacePVASwitchCase:
		//	"case" platform=[MSwPackageSupportedPlatform] ":" parameterValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//"case" platform=[MSwPackageSupportedPlatform] ":" parameterValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MSwPackageSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MSwPackageSupportedPlatform]
		public CrossReference getPlatformMSwPackageSupportedPlatformCrossReference_1_0() { return cPlatformMSwPackageSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//parameterValue=MParameterValueExpression
		public Assignment getParameterValueAssignment_3() { return cParameterValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getParameterValueMParameterValueExpressionParserRuleCall_3_0() { return cParameterValueMParameterValueExpressionParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
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
		
		//MSwPackageRequiredInterface:
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

	public class MSwPackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MSwPackage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSwpackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cInheritsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cInheritsMAbstractSwPackageCrossReference_2_1_0 = (CrossReference)cInheritsAssignment_2_1.eContents().get(0);
		private final RuleCall cInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cInheritsMAbstractSwPackageCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cInheritsMAbstractSwPackageCrossReference_2_2_1_0 = (CrossReference)cInheritsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cInheritsMAbstractSwPackageCrossReference_2_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cExtendsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cExtendsMSwPackageCrossReference_3_1_0 = (CrossReference)cExtendsAssignment_3_1.eContents().get(0);
		private final RuleCall cExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cExtendsMSwPackageCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cExtendsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cExtendsMSwPackageCrossReference_3_2_1_0 = (CrossReference)cExtendsAssignment_3_2_1.eContents().get(0);
		private final RuleCall cExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1 = (RuleCall)cExtendsMSwPackageCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cVersionKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cVersionAssignment_5_0_2 = (Assignment)cGroup_5_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_5_0_2_0 = (RuleCall)cVersionAssignment_5_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_5_0_3 = (Keyword)cGroup_5_0.eContents().get(3);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cLanguagesKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Assignment cLanguagesAssignment_5_1_2 = (Assignment)cGroup_5_1.eContents().get(2);
		private final CrossReference cLanguagesMLanguageCrossReference_5_1_2_0 = (CrossReference)cLanguagesAssignment_5_1_2.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_2_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_1_2_0.eContents().get(1);
		private final Group cGroup_5_1_3 = (Group)cGroup_5_1.eContents().get(3);
		private final Keyword cCommaKeyword_5_1_3_0 = (Keyword)cGroup_5_1_3.eContents().get(0);
		private final Assignment cLanguagesAssignment_5_1_3_1 = (Assignment)cGroup_5_1_3.eContents().get(1);
		private final CrossReference cLanguagesMLanguageCrossReference_5_1_3_1_0 = (CrossReference)cLanguagesAssignment_5_1_3_1.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_1_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_1_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_1_4 = (Keyword)cGroup_5_1.eContents().get(4);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cConstructionKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Keyword cToolsKeyword_5_2_1 = (Keyword)cGroup_5_2.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_5_2_2 = (Keyword)cGroup_5_2.eContents().get(2);
		private final Assignment cCtoolsAssignment_5_2_3 = (Assignment)cGroup_5_2.eContents().get(3);
		private final CrossReference cCtoolsMConstructionToolCrossReference_5_2_3_0 = (CrossReference)cCtoolsAssignment_5_2_3.eContents().get(0);
		private final RuleCall cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_3_0_1 = (RuleCall)cCtoolsMConstructionToolCrossReference_5_2_3_0.eContents().get(1);
		private final Group cGroup_5_2_4 = (Group)cGroup_5_2.eContents().get(4);
		private final Keyword cCommaKeyword_5_2_4_0 = (Keyword)cGroup_5_2_4.eContents().get(0);
		private final Assignment cCtoolsAssignment_5_2_4_1 = (Assignment)cGroup_5_2_4.eContents().get(1);
		private final CrossReference cCtoolsMConstructionToolCrossReference_5_2_4_1_0 = (CrossReference)cCtoolsAssignment_5_2_4_1.eContents().get(0);
		private final RuleCall cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_4_1_0_1 = (RuleCall)cCtoolsMConstructionToolCrossReference_5_2_4_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_2_5 = (Keyword)cGroup_5_2.eContents().get(5);
		private final Group cGroup_5_3 = (Group)cUnorderedGroup_5.eContents().get(3);
		private final Keyword cConfigurationKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Keyword cParametersKeyword_5_3_1 = (Keyword)cGroup_5_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_3_2 = (Keyword)cGroup_5_3.eContents().get(2);
		private final Assignment cParametersAssignment_5_3_3 = (Assignment)cGroup_5_3.eContents().get(3);
		private final RuleCall cParametersMParameterParserRuleCall_5_3_3_0 = (RuleCall)cParametersAssignment_5_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3_4 = (Keyword)cGroup_5_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_3_5 = (Keyword)cGroup_5_3.eContents().get(5);
		private final Group cGroup_5_4 = (Group)cUnorderedGroup_5.eContents().get(4);
		private final Keyword cProvidedKeyword_5_4_0 = (Keyword)cGroup_5_4.eContents().get(0);
		private final Keyword cInterfacesKeyword_5_4_1 = (Keyword)cGroup_5_4.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_4_2 = (Keyword)cGroup_5_4.eContents().get(2);
		private final Assignment cProvidesAssignment_5_4_3 = (Assignment)cGroup_5_4.eContents().get(3);
		private final RuleCall cProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0 = (RuleCall)cProvidesAssignment_5_4_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4_4 = (Keyword)cGroup_5_4.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_4_5 = (Keyword)cGroup_5_4.eContents().get(5);
		private final Group cGroup_5_5 = (Group)cUnorderedGroup_5.eContents().get(5);
		private final Keyword cRequiredKeyword_5_5_0 = (Keyword)cGroup_5_5.eContents().get(0);
		private final Keyword cInterfacesKeyword_5_5_1 = (Keyword)cGroup_5_5.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_5_2 = (Keyword)cGroup_5_5.eContents().get(2);
		private final Assignment cRequiresAssignment_5_5_3 = (Assignment)cGroup_5_5.eContents().get(3);
		private final RuleCall cRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0 = (RuleCall)cRequiresAssignment_5_5_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_5_4 = (Keyword)cGroup_5_5.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_5_5 = (Keyword)cGroup_5_5.eContents().get(5);
		private final Group cGroup_5_6 = (Group)cUnorderedGroup_5.eContents().get(6);
		private final Keyword cSupportedKeyword_5_6_0 = (Keyword)cGroup_5_6.eContents().get(0);
		private final Keyword cPlatformsKeyword_5_6_1 = (Keyword)cGroup_5_6.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_6_2 = (Keyword)cGroup_5_6.eContents().get(2);
		private final Assignment cSupportedPlatformsAssignment_5_6_3 = (Assignment)cGroup_5_6.eContents().get(3);
		private final RuleCall cSupportedPlatformsMSwPackageSupportedPlatformParserRuleCall_5_6_3_0 = (RuleCall)cSupportedPlatformsAssignment_5_6_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_6_4 = (Keyword)cGroup_5_6.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_6_5 = (Keyword)cGroup_5_6.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MSwPackage:
		//	"swpackage" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
		//	inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? ("extends" extends+=[MSwPackage|VersionedQualifiedName] (","
		//	extends+=[MSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
		//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
		//	& "construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
		//	parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
		//	("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
		//	supportedPlatforms+=MSwPackageSupportedPlatform+ "}" ";") "}" ";";
		public ParserRule getRule() { return rule; }

		//"swpackage" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
		//inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? ("extends" extends+=[MSwPackage|VersionedQualifiedName] (","
		//extends+=[MSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
		//languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
		//& "construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
		//parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
		//("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
		//supportedPlatforms+=MSwPackageSupportedPlatform+ "}" ";") "}" ";"
		public Group getGroup() { return cGroup; }

		//"swpackage"
		public Keyword getSwpackageKeyword_0() { return cSwpackageKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
		//inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//"inherits"
		public Keyword getInheritsKeyword_2_0() { return cInheritsKeyword_2_0; }

		//inherits+=[MAbstractSwPackage|VersionedQualifiedName]
		public Assignment getInheritsAssignment_2_1() { return cInheritsAssignment_2_1; }

		//[MAbstractSwPackage|VersionedQualifiedName]
		public CrossReference getInheritsMAbstractSwPackageCrossReference_2_1_0() { return cInheritsMAbstractSwPackageCrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," inherits+=[MAbstractSwPackage|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//inherits+=[MAbstractSwPackage|VersionedQualifiedName]
		public Assignment getInheritsAssignment_2_2_1() { return cInheritsAssignment_2_2_1; }

		//[MAbstractSwPackage|VersionedQualifiedName]
		public CrossReference getInheritsMAbstractSwPackageCrossReference_2_2_1_0() { return cInheritsMAbstractSwPackageCrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//("extends" extends+=[MSwPackage|VersionedQualifiedName] ("," extends+=[MSwPackage|VersionedQualifiedName])*)?
		public Group getGroup_3() { return cGroup_3; }

		//"extends"
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }

		//extends+=[MSwPackage|VersionedQualifiedName]
		public Assignment getExtendsAssignment_3_1() { return cExtendsAssignment_3_1; }

		//[MSwPackage|VersionedQualifiedName]
		public CrossReference getExtendsMSwPackageCrossReference_3_1_0() { return cExtendsMSwPackageCrossReference_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1() { return cExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1; }

		//("," extends+=[MSwPackage|VersionedQualifiedName])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//extends+=[MSwPackage|VersionedQualifiedName]
		public Assignment getExtendsAssignment_3_2_1() { return cExtendsAssignment_3_2_1; }

		//[MSwPackage|VersionedQualifiedName]
		public CrossReference getExtendsMSwPackageCrossReference_3_2_1_0() { return cExtendsMSwPackageCrossReference_3_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1() { return cExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//"version" ":=" version=Version ";" & "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ";" & "construction" "tools" ":="
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
		//parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
		//("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
		//supportedPlatforms+=MSwPackageSupportedPlatform+ "}" ";"
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

		//"languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ";"
		public Group getGroup_5_1() { return cGroup_5_1; }

		//"languages"
		public Keyword getLanguagesKeyword_5_1_0() { return cLanguagesKeyword_5_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_1_1() { return cColonEqualsSignKeyword_5_1_1; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_1_2() { return cLanguagesAssignment_5_1_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_1_2_0() { return cLanguagesMLanguageCrossReference_5_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_2_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_2_0_1; }

		//("," languages+=[system::MLanguage|VersionedQualifiedName])*
		public Group getGroup_5_1_3() { return cGroup_5_1_3; }

		//","
		public Keyword getCommaKeyword_5_1_3_0() { return cCommaKeyword_5_1_3_0; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_1_3_1() { return cLanguagesAssignment_5_1_3_1; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_1_3_1_0() { return cLanguagesMLanguageCrossReference_5_1_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_1_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_1_4() { return cSemicolonKeyword_5_1_4; }

		//"construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";"
		public Group getGroup_5_2() { return cGroup_5_2; }

		//"construction"
		public Keyword getConstructionKeyword_5_2_0() { return cConstructionKeyword_5_2_0; }

		//"tools"
		public Keyword getToolsKeyword_5_2_1() { return cToolsKeyword_5_2_1; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_2_2() { return cColonEqualsSignKeyword_5_2_2; }

		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
		public Assignment getCtoolsAssignment_5_2_3() { return cCtoolsAssignment_5_2_3; }

		//[mespctool::MConstructionTool|VersionedQualifiedName]
		public CrossReference getCtoolsMConstructionToolCrossReference_5_2_3_0() { return cCtoolsMConstructionToolCrossReference_5_2_3_0; }

		//VersionedQualifiedName
		public RuleCall getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_3_0_1() { return cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_3_0_1; }

		//("," ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])*
		public Group getGroup_5_2_4() { return cGroup_5_2_4; }

		//","
		public Keyword getCommaKeyword_5_2_4_0() { return cCommaKeyword_5_2_4_0; }

		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
		public Assignment getCtoolsAssignment_5_2_4_1() { return cCtoolsAssignment_5_2_4_1; }

		//[mespctool::MConstructionTool|VersionedQualifiedName]
		public CrossReference getCtoolsMConstructionToolCrossReference_5_2_4_1_0() { return cCtoolsMConstructionToolCrossReference_5_2_4_1_0; }

		//VersionedQualifiedName
		public RuleCall getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_4_1_0_1() { return cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_4_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_2_5() { return cSemicolonKeyword_5_2_5; }

		//("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")?
		public Group getGroup_5_3() { return cGroup_5_3; }

		//"configuration"
		public Keyword getConfigurationKeyword_5_3_0() { return cConfigurationKeyword_5_3_0; }

		//"parameters"
		public Keyword getParametersKeyword_5_3_1() { return cParametersKeyword_5_3_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_3_2() { return cLeftCurlyBracketKeyword_5_3_2; }

		//parameters+=MParameter+
		public Assignment getParametersAssignment_5_3_3() { return cParametersAssignment_5_3_3; }

		//MParameter
		public RuleCall getParametersMParameterParserRuleCall_5_3_3_0() { return cParametersMParameterParserRuleCall_5_3_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_3_4() { return cRightCurlyBracketKeyword_5_3_4; }

		//";"
		public Keyword getSemicolonKeyword_5_3_5() { return cSemicolonKeyword_5_3_5; }

		//("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")?
		public Group getGroup_5_4() { return cGroup_5_4; }

		//"provided"
		public Keyword getProvidedKeyword_5_4_0() { return cProvidedKeyword_5_4_0; }

		//"interfaces"
		public Keyword getInterfacesKeyword_5_4_1() { return cInterfacesKeyword_5_4_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_4_2() { return cLeftCurlyBracketKeyword_5_4_2; }

		//provides+=MSwPackageProvidedInterface+
		public Assignment getProvidesAssignment_5_4_3() { return cProvidesAssignment_5_4_3; }

		//MSwPackageProvidedInterface
		public RuleCall getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0() { return cProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_4_4() { return cRightCurlyBracketKeyword_5_4_4; }

		//";"
		public Keyword getSemicolonKeyword_5_4_5() { return cSemicolonKeyword_5_4_5; }

		//("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")?
		public Group getGroup_5_5() { return cGroup_5_5; }

		//"required"
		public Keyword getRequiredKeyword_5_5_0() { return cRequiredKeyword_5_5_0; }

		//"interfaces"
		public Keyword getInterfacesKeyword_5_5_1() { return cInterfacesKeyword_5_5_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_5_2() { return cLeftCurlyBracketKeyword_5_5_2; }

		//requires+=MSwPackageRequiredInterface+
		public Assignment getRequiresAssignment_5_5_3() { return cRequiresAssignment_5_5_3; }

		//MSwPackageRequiredInterface
		public RuleCall getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0() { return cRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_5_4() { return cRightCurlyBracketKeyword_5_5_4; }

		//";"
		public Keyword getSemicolonKeyword_5_5_5() { return cSemicolonKeyword_5_5_5; }

		//"supported" "platforms" "{" supportedPlatforms+=MSwPackageSupportedPlatform+ "}" ";"
		public Group getGroup_5_6() { return cGroup_5_6; }

		//"supported"
		public Keyword getSupportedKeyword_5_6_0() { return cSupportedKeyword_5_6_0; }

		//"platforms"
		public Keyword getPlatformsKeyword_5_6_1() { return cPlatformsKeyword_5_6_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_6_2() { return cLeftCurlyBracketKeyword_5_6_2; }

		//supportedPlatforms+=MSwPackageSupportedPlatform+
		public Assignment getSupportedPlatformsAssignment_5_6_3() { return cSupportedPlatformsAssignment_5_6_3; }

		//MSwPackageSupportedPlatform
		public RuleCall getSupportedPlatformsMSwPackageSupportedPlatformParserRuleCall_5_6_3_0() { return cSupportedPlatformsMSwPackageSupportedPlatformParserRuleCall_5_6_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_6_4() { return cRightCurlyBracketKeyword_5_6_4; }

		//";"
		public Keyword getSemicolonKeyword_5_6_5() { return cSemicolonKeyword_5_6_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MDriverSwPackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MDriverSwPackage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDriverKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cInheritsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cInheritsMAbstractSwPackageCrossReference_2_1_0 = (CrossReference)cInheritsAssignment_2_1.eContents().get(0);
		private final RuleCall cInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cInheritsMAbstractSwPackageCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cInheritsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cInheritsMAbstractSwPackageCrossReference_2_2_1_0 = (CrossReference)cInheritsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1 = (RuleCall)cInheritsMAbstractSwPackageCrossReference_2_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cExtendsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cExtendsMSwPackageCrossReference_3_1_0 = (CrossReference)cExtendsAssignment_3_1.eContents().get(0);
		private final RuleCall cExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cExtendsMSwPackageCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cExtendsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cExtendsMSwPackageCrossReference_3_2_1_0 = (CrossReference)cExtendsAssignment_3_2_1.eContents().get(0);
		private final RuleCall cExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1 = (RuleCall)cExtendsMSwPackageCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cVersionKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cVersionAssignment_5_0_2 = (Assignment)cGroup_5_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_5_0_2_0 = (RuleCall)cVersionAssignment_5_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_5_0_3 = (Keyword)cGroup_5_0.eContents().get(3);
		private final Group cGroup_5_1 = (Group)cUnorderedGroup_5.eContents().get(1);
		private final Keyword cLanguagesKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Assignment cLanguagesAssignment_5_1_2 = (Assignment)cGroup_5_1.eContents().get(2);
		private final CrossReference cLanguagesMLanguageCrossReference_5_1_2_0 = (CrossReference)cLanguagesAssignment_5_1_2.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_2_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_1_2_0.eContents().get(1);
		private final Group cGroup_5_1_3 = (Group)cGroup_5_1.eContents().get(3);
		private final Keyword cCommaKeyword_5_1_3_0 = (Keyword)cGroup_5_1_3.eContents().get(0);
		private final Assignment cLanguagesAssignment_5_1_3_1 = (Assignment)cGroup_5_1_3.eContents().get(1);
		private final CrossReference cLanguagesMLanguageCrossReference_5_1_3_1_0 = (CrossReference)cLanguagesAssignment_5_1_3_1.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_1_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_1_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_1_4 = (Keyword)cGroup_5_1.eContents().get(4);
		private final Group cGroup_5_2 = (Group)cUnorderedGroup_5.eContents().get(2);
		private final Keyword cConstructionKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Keyword cToolsKeyword_5_2_1 = (Keyword)cGroup_5_2.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_5_2_2 = (Keyword)cGroup_5_2.eContents().get(2);
		private final Assignment cCtoolsAssignment_5_2_3 = (Assignment)cGroup_5_2.eContents().get(3);
		private final CrossReference cCtoolsMConstructionToolCrossReference_5_2_3_0 = (CrossReference)cCtoolsAssignment_5_2_3.eContents().get(0);
		private final RuleCall cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_3_0_1 = (RuleCall)cCtoolsMConstructionToolCrossReference_5_2_3_0.eContents().get(1);
		private final Group cGroup_5_2_4 = (Group)cGroup_5_2.eContents().get(4);
		private final Keyword cCommaKeyword_5_2_4_0 = (Keyword)cGroup_5_2_4.eContents().get(0);
		private final Assignment cCtoolsAssignment_5_2_4_1 = (Assignment)cGroup_5_2_4.eContents().get(1);
		private final CrossReference cCtoolsMConstructionToolCrossReference_5_2_4_1_0 = (CrossReference)cCtoolsAssignment_5_2_4_1.eContents().get(0);
		private final RuleCall cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_4_1_0_1 = (RuleCall)cCtoolsMConstructionToolCrossReference_5_2_4_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_2_5 = (Keyword)cGroup_5_2.eContents().get(5);
		private final Group cGroup_5_3 = (Group)cUnorderedGroup_5.eContents().get(3);
		private final Keyword cConfigurationKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Keyword cParametersKeyword_5_3_1 = (Keyword)cGroup_5_3.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_3_2 = (Keyword)cGroup_5_3.eContents().get(2);
		private final Assignment cParametersAssignment_5_3_3 = (Assignment)cGroup_5_3.eContents().get(3);
		private final RuleCall cParametersMParameterParserRuleCall_5_3_3_0 = (RuleCall)cParametersAssignment_5_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3_4 = (Keyword)cGroup_5_3.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_3_5 = (Keyword)cGroup_5_3.eContents().get(5);
		private final Group cGroup_5_4 = (Group)cUnorderedGroup_5.eContents().get(4);
		private final Keyword cProvidedKeyword_5_4_0 = (Keyword)cGroup_5_4.eContents().get(0);
		private final Keyword cInterfacesKeyword_5_4_1 = (Keyword)cGroup_5_4.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_4_2 = (Keyword)cGroup_5_4.eContents().get(2);
		private final Assignment cProvidesAssignment_5_4_3 = (Assignment)cGroup_5_4.eContents().get(3);
		private final RuleCall cProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0 = (RuleCall)cProvidesAssignment_5_4_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4_4 = (Keyword)cGroup_5_4.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_4_5 = (Keyword)cGroup_5_4.eContents().get(5);
		private final Group cGroup_5_5 = (Group)cUnorderedGroup_5.eContents().get(5);
		private final Keyword cRequiredKeyword_5_5_0 = (Keyword)cGroup_5_5.eContents().get(0);
		private final Keyword cInterfacesKeyword_5_5_1 = (Keyword)cGroup_5_5.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_5_2 = (Keyword)cGroup_5_5.eContents().get(2);
		private final Assignment cRequiresAssignment_5_5_3 = (Assignment)cGroup_5_5.eContents().get(3);
		private final RuleCall cRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0 = (RuleCall)cRequiresAssignment_5_5_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_5_4 = (Keyword)cGroup_5_5.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_5_5 = (Keyword)cGroup_5_5.eContents().get(5);
		private final Group cGroup_5_6 = (Group)cUnorderedGroup_5.eContents().get(6);
		private final Keyword cSupportedKeyword_5_6_0 = (Keyword)cGroup_5_6.eContents().get(0);
		private final Keyword cPlatformsKeyword_5_6_1 = (Keyword)cGroup_5_6.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_6_2 = (Keyword)cGroup_5_6.eContents().get(2);
		private final Assignment cSupportedPlatformsAssignment_5_6_3 = (Assignment)cGroup_5_6.eContents().get(3);
		private final RuleCall cSupportedPlatformsMDriverSwPackageSupportedPlatformParserRuleCall_5_6_3_0 = (RuleCall)cSupportedPlatformsAssignment_5_6_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_6_4 = (Keyword)cGroup_5_6.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_6_5 = (Keyword)cGroup_5_6.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MDriverSwPackage:
		//	"driver" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
		//	inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? ("extends" extends+=[MSwPackage|VersionedQualifiedName] (","
		//	extends+=[MSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
		//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
		//	& "construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
		//	parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
		//	("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
		//	supportedPlatforms+=MDriverSwPackageSupportedPlatform+ "}" ";") "}" ";";
		public ParserRule getRule() { return rule; }

		//"driver" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
		//inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? ("extends" extends+=[MSwPackage|VersionedQualifiedName] (","
		//extends+=[MSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
		//languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
		//& "construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
		//parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
		//("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
		//supportedPlatforms+=MDriverSwPackageSupportedPlatform+ "}" ";") "}" ";"
		public Group getGroup() { return cGroup; }

		//"driver"
		public Keyword getDriverKeyword_0() { return cDriverKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
		//inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)?
		public Group getGroup_2() { return cGroup_2; }

		//"inherits"
		public Keyword getInheritsKeyword_2_0() { return cInheritsKeyword_2_0; }

		//inherits+=[MAbstractSwPackage|VersionedQualifiedName]
		public Assignment getInheritsAssignment_2_1() { return cInheritsAssignment_2_1; }

		//[MAbstractSwPackage|VersionedQualifiedName]
		public CrossReference getInheritsMAbstractSwPackageCrossReference_2_1_0() { return cInheritsMAbstractSwPackageCrossReference_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1() { return cInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1; }

		//("," inherits+=[MAbstractSwPackage|VersionedQualifiedName])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//inherits+=[MAbstractSwPackage|VersionedQualifiedName]
		public Assignment getInheritsAssignment_2_2_1() { return cInheritsAssignment_2_2_1; }

		//[MAbstractSwPackage|VersionedQualifiedName]
		public CrossReference getInheritsMAbstractSwPackageCrossReference_2_2_1_0() { return cInheritsMAbstractSwPackageCrossReference_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1() { return cInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1; }

		//("extends" extends+=[MSwPackage|VersionedQualifiedName] ("," extends+=[MSwPackage|VersionedQualifiedName])*)?
		public Group getGroup_3() { return cGroup_3; }

		//"extends"
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }

		//extends+=[MSwPackage|VersionedQualifiedName]
		public Assignment getExtendsAssignment_3_1() { return cExtendsAssignment_3_1; }

		//[MSwPackage|VersionedQualifiedName]
		public CrossReference getExtendsMSwPackageCrossReference_3_1_0() { return cExtendsMSwPackageCrossReference_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1() { return cExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1; }

		//("," extends+=[MSwPackage|VersionedQualifiedName])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//extends+=[MSwPackage|VersionedQualifiedName]
		public Assignment getExtendsAssignment_3_2_1() { return cExtendsAssignment_3_2_1; }

		//[MSwPackage|VersionedQualifiedName]
		public CrossReference getExtendsMSwPackageCrossReference_3_2_1_0() { return cExtendsMSwPackageCrossReference_3_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1() { return cExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//"version" ":=" version=Version ";" & "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ";" & "construction" "tools" ":="
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
		//parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
		//("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
		//supportedPlatforms+=MDriverSwPackageSupportedPlatform+ "}" ";"
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

		//"languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ";"
		public Group getGroup_5_1() { return cGroup_5_1; }

		//"languages"
		public Keyword getLanguagesKeyword_5_1_0() { return cLanguagesKeyword_5_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_1_1() { return cColonEqualsSignKeyword_5_1_1; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_1_2() { return cLanguagesAssignment_5_1_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_1_2_0() { return cLanguagesMLanguageCrossReference_5_1_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_2_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_2_0_1; }

		//("," languages+=[system::MLanguage|VersionedQualifiedName])*
		public Group getGroup_5_1_3() { return cGroup_5_1_3; }

		//","
		public Keyword getCommaKeyword_5_1_3_0() { return cCommaKeyword_5_1_3_0; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_1_3_1() { return cLanguagesAssignment_5_1_3_1; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_1_3_1_0() { return cLanguagesMLanguageCrossReference_5_1_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_1_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_1_4() { return cSemicolonKeyword_5_1_4; }

		//"construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";"
		public Group getGroup_5_2() { return cGroup_5_2; }

		//"construction"
		public Keyword getConstructionKeyword_5_2_0() { return cConstructionKeyword_5_2_0; }

		//"tools"
		public Keyword getToolsKeyword_5_2_1() { return cToolsKeyword_5_2_1; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_2_2() { return cColonEqualsSignKeyword_5_2_2; }

		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
		public Assignment getCtoolsAssignment_5_2_3() { return cCtoolsAssignment_5_2_3; }

		//[mespctool::MConstructionTool|VersionedQualifiedName]
		public CrossReference getCtoolsMConstructionToolCrossReference_5_2_3_0() { return cCtoolsMConstructionToolCrossReference_5_2_3_0; }

		//VersionedQualifiedName
		public RuleCall getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_3_0_1() { return cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_3_0_1; }

		//("," ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])*
		public Group getGroup_5_2_4() { return cGroup_5_2_4; }

		//","
		public Keyword getCommaKeyword_5_2_4_0() { return cCommaKeyword_5_2_4_0; }

		//ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
		public Assignment getCtoolsAssignment_5_2_4_1() { return cCtoolsAssignment_5_2_4_1; }

		//[mespctool::MConstructionTool|VersionedQualifiedName]
		public CrossReference getCtoolsMConstructionToolCrossReference_5_2_4_1_0() { return cCtoolsMConstructionToolCrossReference_5_2_4_1_0; }

		//VersionedQualifiedName
		public RuleCall getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_4_1_0_1() { return cCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_4_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_2_5() { return cSemicolonKeyword_5_2_5; }

		//("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")?
		public Group getGroup_5_3() { return cGroup_5_3; }

		//"configuration"
		public Keyword getConfigurationKeyword_5_3_0() { return cConfigurationKeyword_5_3_0; }

		//"parameters"
		public Keyword getParametersKeyword_5_3_1() { return cParametersKeyword_5_3_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_3_2() { return cLeftCurlyBracketKeyword_5_3_2; }

		//parameters+=MParameter+
		public Assignment getParametersAssignment_5_3_3() { return cParametersAssignment_5_3_3; }

		//MParameter
		public RuleCall getParametersMParameterParserRuleCall_5_3_3_0() { return cParametersMParameterParserRuleCall_5_3_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_3_4() { return cRightCurlyBracketKeyword_5_3_4; }

		//";"
		public Keyword getSemicolonKeyword_5_3_5() { return cSemicolonKeyword_5_3_5; }

		//("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")?
		public Group getGroup_5_4() { return cGroup_5_4; }

		//"provided"
		public Keyword getProvidedKeyword_5_4_0() { return cProvidedKeyword_5_4_0; }

		//"interfaces"
		public Keyword getInterfacesKeyword_5_4_1() { return cInterfacesKeyword_5_4_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_4_2() { return cLeftCurlyBracketKeyword_5_4_2; }

		//provides+=MSwPackageProvidedInterface+
		public Assignment getProvidesAssignment_5_4_3() { return cProvidesAssignment_5_4_3; }

		//MSwPackageProvidedInterface
		public RuleCall getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0() { return cProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_4_4() { return cRightCurlyBracketKeyword_5_4_4; }

		//";"
		public Keyword getSemicolonKeyword_5_4_5() { return cSemicolonKeyword_5_4_5; }

		//("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")?
		public Group getGroup_5_5() { return cGroup_5_5; }

		//"required"
		public Keyword getRequiredKeyword_5_5_0() { return cRequiredKeyword_5_5_0; }

		//"interfaces"
		public Keyword getInterfacesKeyword_5_5_1() { return cInterfacesKeyword_5_5_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_5_2() { return cLeftCurlyBracketKeyword_5_5_2; }

		//requires+=MSwPackageRequiredInterface+
		public Assignment getRequiresAssignment_5_5_3() { return cRequiresAssignment_5_5_3; }

		//MSwPackageRequiredInterface
		public RuleCall getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0() { return cRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_5_4() { return cRightCurlyBracketKeyword_5_5_4; }

		//";"
		public Keyword getSemicolonKeyword_5_5_5() { return cSemicolonKeyword_5_5_5; }

		//"supported" "platforms" "{" supportedPlatforms+=MDriverSwPackageSupportedPlatform+ "}" ";"
		public Group getGroup_5_6() { return cGroup_5_6; }

		//"supported"
		public Keyword getSupportedKeyword_5_6_0() { return cSupportedKeyword_5_6_0; }

		//"platforms"
		public Keyword getPlatformsKeyword_5_6_1() { return cPlatformsKeyword_5_6_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_6_2() { return cLeftCurlyBracketKeyword_5_6_2; }

		//supportedPlatforms+=MDriverSwPackageSupportedPlatform+
		public Assignment getSupportedPlatformsAssignment_5_6_3() { return cSupportedPlatformsAssignment_5_6_3; }

		//MDriverSwPackageSupportedPlatform
		public RuleCall getSupportedPlatformsMDriverSwPackageSupportedPlatformParserRuleCall_5_6_3_0() { return cSupportedPlatformsMDriverSwPackageSupportedPlatformParserRuleCall_5_6_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_6_4() { return cRightCurlyBracketKeyword_5_6_4; }

		//";"
		public Keyword getSemicolonKeyword_5_6_5() { return cSemicolonKeyword_5_6_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MDriverSwPackageSupportedPlatformElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MDriverSwPackageSupportedPlatform");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMDriverSwPackageSupportedPlatformAction_0 = (Action)cGroup.eContents().get(0);
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
		private final Keyword cLanguagesKeyword_5_6_0 = (Keyword)cGroup_5_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_6_1 = (Keyword)cGroup_5_6.eContents().get(1);
		private final Assignment cLanguagesAssignment_5_6_2 = (Assignment)cGroup_5_6.eContents().get(2);
		private final CrossReference cLanguagesMLanguageCrossReference_5_6_2_0 = (CrossReference)cLanguagesAssignment_5_6_2.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_2_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_6_2_0.eContents().get(1);
		private final Group cGroup_5_6_3 = (Group)cGroup_5_6.eContents().get(3);
		private final Keyword cCommaKeyword_5_6_3_0 = (Keyword)cGroup_5_6_3.eContents().get(0);
		private final Assignment cLanguagesAssignment_5_6_3_1 = (Assignment)cGroup_5_6_3.eContents().get(1);
		private final CrossReference cLanguagesMLanguageCrossReference_5_6_3_1_0 = (CrossReference)cLanguagesAssignment_5_6_3_1.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_6_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_6_4 = (Keyword)cGroup_5_6.eContents().get(4);
		private final Group cGroup_5_7 = (Group)cUnorderedGroup_5.eContents().get(7);
		private final Keyword cConfigurationKeyword_5_7_0 = (Keyword)cGroup_5_7.eContents().get(0);
		private final Keyword cParametersKeyword_5_7_1 = (Keyword)cGroup_5_7.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_7_2 = (Keyword)cGroup_5_7.eContents().get(2);
		private final Assignment cParametersAssignment_5_7_3 = (Assignment)cGroup_5_7.eContents().get(3);
		private final RuleCall cParametersMParameterParserRuleCall_5_7_3_0 = (RuleCall)cParametersAssignment_5_7_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_7_4 = (Keyword)cGroup_5_7.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_7_5 = (Keyword)cGroup_5_7.eContents().get(5);
		private final Group cGroup_5_8 = (Group)cUnorderedGroup_5.eContents().get(8);
		private final Keyword cRequiredKeyword_5_8_0 = (Keyword)cGroup_5_8.eContents().get(0);
		private final Keyword cInterfacesKeyword_5_8_1 = (Keyword)cGroup_5_8.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_8_2 = (Keyword)cGroup_5_8.eContents().get(2);
		private final Assignment cRequiresAssignment_5_8_3 = (Assignment)cGroup_5_8.eContents().get(3);
		private final RuleCall cRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0 = (RuleCall)cRequiresAssignment_5_8_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_8_4 = (Keyword)cGroup_5_8.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_8_5 = (Keyword)cGroup_5_8.eContents().get(5);
		private final Group cGroup_5_9 = (Group)cUnorderedGroup_5.eContents().get(9);
		private final Keyword cSupportedKeyword_5_9_0 = (Keyword)cGroup_5_9.eContents().get(0);
		private final Keyword cDevicesKeyword_5_9_1 = (Keyword)cGroup_5_9.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_9_2 = (Keyword)cGroup_5_9.eContents().get(2);
		private final Assignment cSupportedDevicesAssignment_5_9_3 = (Assignment)cGroup_5_9.eContents().get(3);
		private final RuleCall cSupportedDevicesMDriverSwPackageSupportedDeviceParserRuleCall_5_9_3_0 = (RuleCall)cSupportedDevicesAssignment_5_9_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_9_4 = (Keyword)cGroup_5_9.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_9_5 = (Keyword)cGroup_5_9.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MDriverSwPackageSupportedPlatform:
		//	{MDriverSwPackageSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
		//	osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
		//	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
		//	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
		//	compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
		//	microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
		//	board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
		//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//	";")? & ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")? & ("required" "interfaces" "{"
		//	requires+=MSwPackageRequiredInterface+ "}" ";")? & ("supported" "devices" "{"
		//	supportedDevices+=MDriverSwPackageSupportedDevice+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//{MDriverSwPackageSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
		//osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
		//os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
		//architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
		//compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
		//microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
		//board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
		//languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//";")? & ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")? & ("required" "interfaces" "{"
		//requires+=MSwPackageRequiredInterface+ "}" ";")? & ("supported" "devices" "{"
		//supportedDevices+=MDriverSwPackageSupportedDevice+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//{MDriverSwPackageSupportedPlatform}
		public Action getMDriverSwPackageSupportedPlatformAction_0() { return cMDriverSwPackageSupportedPlatformAction_0; }

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

		//"osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
		//os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
		//architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
		//compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
		//microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
		//board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
		//languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//";")? & ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")? & ("required" "interfaces" "{"
		//requires+=MSwPackageRequiredInterface+ "}" ";")? & ("supported" "devices" "{"
		//supportedDevices+=MDriverSwPackageSupportedDevice+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }

		//"osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";"
		public Group getGroup_5_0() { return cGroup_5_0; }

		//"osapi"
		public Keyword getOsapiKeyword_5_0_0() { return cOsapiKeyword_5_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_0_1() { return cColonEqualsSignKeyword_5_0_1; }

		//"any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public Alternatives getAlternatives_5_0_2() { return cAlternatives_5_0_2; }

		//"any"
		public Keyword getAnyKeyword_5_0_2_0() { return cAnyKeyword_5_0_2_0; }

		//osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public Assignment getOsapiAssignment_5_0_2_1() { return cOsapiAssignment_5_0_2_1; }

		//[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public CrossReference getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0() { return cOsapiMOperatingSystemAPICrossReference_5_0_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1() { return cOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_0_3() { return cSemicolonKeyword_5_0_3; }

		//"os" ":=" ("any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";"
		public Group getGroup_5_1() { return cGroup_5_1; }

		//"os"
		public Keyword getOsKeyword_5_1_0() { return cOsKeyword_5_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_1_1() { return cColonEqualsSignKeyword_5_1_1; }

		//"any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]
		public Alternatives getAlternatives_5_1_2() { return cAlternatives_5_1_2; }

		//"any"
		public Keyword getAnyKeyword_5_1_2_0() { return cAnyKeyword_5_1_2_0; }

		//os=[pdl::MOperatingSystem|VersionedQualifiedName]
		public Assignment getOsAssignment_5_1_2_1() { return cOsAssignment_5_1_2_1; }

		//[pdl::MOperatingSystem|VersionedQualifiedName]
		public CrossReference getOsMOperatingSystemCrossReference_5_1_2_1_0() { return cOsMOperatingSystemCrossReference_5_1_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1() { return cOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_1_3() { return cSemicolonKeyword_5_1_3; }

		//"architecture" ":=" ("any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";"
		public Group getGroup_5_2() { return cGroup_5_2; }

		//"architecture"
		public Keyword getArchitectureKeyword_5_2_0() { return cArchitectureKeyword_5_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_2_1() { return cColonEqualsSignKeyword_5_2_1; }

		//"any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]
		public Alternatives getAlternatives_5_2_2() { return cAlternatives_5_2_2; }

		//"any"
		public Keyword getAnyKeyword_5_2_2_0() { return cAnyKeyword_5_2_2_0; }

		//architecture=[pdl::MArchitecture|VersionedQualifiedName]
		public Assignment getArchitectureAssignment_5_2_2_1() { return cArchitectureAssignment_5_2_2_1; }

		//[pdl::MArchitecture|VersionedQualifiedName]
		public CrossReference getArchitectureMArchitectureCrossReference_5_2_2_1_0() { return cArchitectureMArchitectureCrossReference_5_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1() { return cArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_2_3() { return cSemicolonKeyword_5_2_3; }

		//("compiler" ":=" compiler=[pdl::MCompiler|VersionedQualifiedName] ";")?
		public Group getGroup_5_3() { return cGroup_5_3; }

		//"compiler"
		public Keyword getCompilerKeyword_5_3_0() { return cCompilerKeyword_5_3_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_3_1() { return cColonEqualsSignKeyword_5_3_1; }

		//compiler=[pdl::MCompiler|VersionedQualifiedName]
		public Assignment getCompilerAssignment_5_3_2() { return cCompilerAssignment_5_3_2; }

		//[pdl::MCompiler|VersionedQualifiedName]
		public CrossReference getCompilerMCompilerCrossReference_5_3_2_0() { return cCompilerMCompilerCrossReference_5_3_2_0; }

		//VersionedQualifiedName
		public RuleCall getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1() { return cCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_3_3() { return cSemicolonKeyword_5_3_3; }

		//"microprocessor" ":=" ("any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";"
		public Group getGroup_5_4() { return cGroup_5_4; }

		//"microprocessor"
		public Keyword getMicroprocessorKeyword_5_4_0() { return cMicroprocessorKeyword_5_4_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_4_1() { return cColonEqualsSignKeyword_5_4_1; }

		//"any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
		public Alternatives getAlternatives_5_4_2() { return cAlternatives_5_4_2; }

		//"any"
		public Keyword getAnyKeyword_5_4_2_0() { return cAnyKeyword_5_4_2_0; }

		//microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
		public Assignment getMicroprocessorAssignment_5_4_2_1() { return cMicroprocessorAssignment_5_4_2_1; }

		//[pdl::MMicroprocessor|VersionedQualifiedName]
		public CrossReference getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0() { return cMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1() { return cMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_4_3() { return cSemicolonKeyword_5_4_3; }

		//"board" ":=" ("any" | board=[pdl::MBoard|VersionedQualifiedName]) ";"
		public Group getGroup_5_5() { return cGroup_5_5; }

		//"board"
		public Keyword getBoardKeyword_5_5_0() { return cBoardKeyword_5_5_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_5_1() { return cColonEqualsSignKeyword_5_5_1; }

		//"any" | board=[pdl::MBoard|VersionedQualifiedName]
		public Alternatives getAlternatives_5_5_2() { return cAlternatives_5_5_2; }

		//"any"
		public Keyword getAnyKeyword_5_5_2_0() { return cAnyKeyword_5_5_2_0; }

		//board=[pdl::MBoard|VersionedQualifiedName]
		public Assignment getBoardAssignment_5_5_2_1() { return cBoardAssignment_5_5_2_1; }

		//[pdl::MBoard|VersionedQualifiedName]
		public CrossReference getBoardMBoardCrossReference_5_5_2_1_0() { return cBoardMBoardCrossReference_5_5_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1() { return cBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_5_3() { return cSemicolonKeyword_5_5_3; }

		//("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ";")?
		public Group getGroup_5_6() { return cGroup_5_6; }

		//"languages"
		public Keyword getLanguagesKeyword_5_6_0() { return cLanguagesKeyword_5_6_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_6_1() { return cColonEqualsSignKeyword_5_6_1; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_6_2() { return cLanguagesAssignment_5_6_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_6_2_0() { return cLanguagesMLanguageCrossReference_5_6_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_2_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_2_0_1; }

		//("," languages+=[system::MLanguage|VersionedQualifiedName])*
		public Group getGroup_5_6_3() { return cGroup_5_6_3; }

		//","
		public Keyword getCommaKeyword_5_6_3_0() { return cCommaKeyword_5_6_3_0; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_6_3_1() { return cLanguagesAssignment_5_6_3_1; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_6_3_1_0() { return cLanguagesMLanguageCrossReference_5_6_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_6_4() { return cSemicolonKeyword_5_6_4; }

		//("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")?
		public Group getGroup_5_7() { return cGroup_5_7; }

		//"configuration"
		public Keyword getConfigurationKeyword_5_7_0() { return cConfigurationKeyword_5_7_0; }

		//"parameters"
		public Keyword getParametersKeyword_5_7_1() { return cParametersKeyword_5_7_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_7_2() { return cLeftCurlyBracketKeyword_5_7_2; }

		//parameters+=MParameter+
		public Assignment getParametersAssignment_5_7_3() { return cParametersAssignment_5_7_3; }

		//MParameter
		public RuleCall getParametersMParameterParserRuleCall_5_7_3_0() { return cParametersMParameterParserRuleCall_5_7_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_7_4() { return cRightCurlyBracketKeyword_5_7_4; }

		//";"
		public Keyword getSemicolonKeyword_5_7_5() { return cSemicolonKeyword_5_7_5; }

		//("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")?
		public Group getGroup_5_8() { return cGroup_5_8; }

		//"required"
		public Keyword getRequiredKeyword_5_8_0() { return cRequiredKeyword_5_8_0; }

		//"interfaces"
		public Keyword getInterfacesKeyword_5_8_1() { return cInterfacesKeyword_5_8_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_8_2() { return cLeftCurlyBracketKeyword_5_8_2; }

		//requires+=MSwPackageRequiredInterface+
		public Assignment getRequiresAssignment_5_8_3() { return cRequiresAssignment_5_8_3; }

		//MSwPackageRequiredInterface
		public RuleCall getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0() { return cRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_8_4() { return cRightCurlyBracketKeyword_5_8_4; }

		//";"
		public Keyword getSemicolonKeyword_5_8_5() { return cSemicolonKeyword_5_8_5; }

		//("supported" "devices" "{" supportedDevices+=MDriverSwPackageSupportedDevice+ "}" ";")?
		public Group getGroup_5_9() { return cGroup_5_9; }

		//"supported"
		public Keyword getSupportedKeyword_5_9_0() { return cSupportedKeyword_5_9_0; }

		//"devices"
		public Keyword getDevicesKeyword_5_9_1() { return cDevicesKeyword_5_9_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_9_2() { return cLeftCurlyBracketKeyword_5_9_2; }

		//supportedDevices+=MDriverSwPackageSupportedDevice+
		public Assignment getSupportedDevicesAssignment_5_9_3() { return cSupportedDevicesAssignment_5_9_3; }

		//MDriverSwPackageSupportedDevice
		public RuleCall getSupportedDevicesMDriverSwPackageSupportedDeviceParserRuleCall_5_9_3_0() { return cSupportedDevicesMDriverSwPackageSupportedDeviceParserRuleCall_5_9_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_9_4() { return cRightCurlyBracketKeyword_5_9_4; }

		//";"
		public Keyword getSemicolonKeyword_5_9_5() { return cSemicolonKeyword_5_9_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class MDriverSwPackageSupportedDeviceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MDriverSwPackageSupportedDevice");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeviceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDeviceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDeviceMDeviceCrossReference_1_0 = (CrossReference)cDeviceAssignment_1.eContents().get(0);
		private final RuleCall cDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cDeviceMDeviceCrossReference_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cRequiredKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cRequiredAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cRequiredMParameterValueExpressionParserRuleCall_4_2_0 = (RuleCall)cRequiredAssignment_4_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//MDriverSwPackageSupportedDevice:
		//	"device" device=[pdl::MDevice|VersionedQualifiedName] name=ID "{" ("required" ":=" required=MParameterValueExpression
		//	";")? "}" ";";
		public ParserRule getRule() { return rule; }

		//"device" device=[pdl::MDevice|VersionedQualifiedName] name=ID "{" ("required" ":=" required=MParameterValueExpression
		//";")? "}" ";"
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

		//("required" ":=" required=MParameterValueExpression ";")?
		public Group getGroup_4() { return cGroup_4; }

		//"required"
		public Keyword getRequiredKeyword_4_0() { return cRequiredKeyword_4_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_4_1() { return cColonEqualsSignKeyword_4_1; }

		//required=MParameterValueExpression
		public Assignment getRequiredAssignment_4_2() { return cRequiredAssignment_4_2; }

		//MParameterValueExpression
		public RuleCall getRequiredMParameterValueExpressionParserRuleCall_4_2_0() { return cRequiredMParameterValueExpressionParserRuleCall_4_2_0; }

		//";"
		public Keyword getSemicolonKeyword_4_3() { return cSemicolonKeyword_4_3; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class MSwPackageSupportedPlatformElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MSwPackageSupportedPlatform");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMSwPackageSupportedPlatformAction_0 = (Action)cGroup.eContents().get(0);
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
		private final Keyword cLanguagesKeyword_5_6_0 = (Keyword)cGroup_5_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_6_1 = (Keyword)cGroup_5_6.eContents().get(1);
		private final Assignment cLanguagesAssignment_5_6_2 = (Assignment)cGroup_5_6.eContents().get(2);
		private final CrossReference cLanguagesMLanguageCrossReference_5_6_2_0 = (CrossReference)cLanguagesAssignment_5_6_2.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_2_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_6_2_0.eContents().get(1);
		private final Group cGroup_5_6_3 = (Group)cGroup_5_6.eContents().get(3);
		private final Keyword cCommaKeyword_5_6_3_0 = (Keyword)cGroup_5_6_3.eContents().get(0);
		private final Assignment cLanguagesAssignment_5_6_3_1 = (Assignment)cGroup_5_6_3.eContents().get(1);
		private final CrossReference cLanguagesMLanguageCrossReference_5_6_3_1_0 = (CrossReference)cLanguagesAssignment_5_6_3_1.eContents().get(0);
		private final RuleCall cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1 = (RuleCall)cLanguagesMLanguageCrossReference_5_6_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5_6_4 = (Keyword)cGroup_5_6.eContents().get(4);
		private final Group cGroup_5_7 = (Group)cUnorderedGroup_5.eContents().get(7);
		private final Keyword cConfigurationKeyword_5_7_0 = (Keyword)cGroup_5_7.eContents().get(0);
		private final Keyword cParametersKeyword_5_7_1 = (Keyword)cGroup_5_7.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_7_2 = (Keyword)cGroup_5_7.eContents().get(2);
		private final Assignment cParametersAssignment_5_7_3 = (Assignment)cGroup_5_7.eContents().get(3);
		private final RuleCall cParametersMParameterWithoutSWPSPParserRuleCall_5_7_3_0 = (RuleCall)cParametersAssignment_5_7_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_7_4 = (Keyword)cGroup_5_7.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_7_5 = (Keyword)cGroup_5_7.eContents().get(5);
		private final Group cGroup_5_8 = (Group)cUnorderedGroup_5.eContents().get(8);
		private final Keyword cRequiredKeyword_5_8_0 = (Keyword)cGroup_5_8.eContents().get(0);
		private final Keyword cInterfacesKeyword_5_8_1 = (Keyword)cGroup_5_8.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5_8_2 = (Keyword)cGroup_5_8.eContents().get(2);
		private final Assignment cRequiresAssignment_5_8_3 = (Assignment)cGroup_5_8.eContents().get(3);
		private final RuleCall cRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0 = (RuleCall)cRequiresAssignment_5_8_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_8_4 = (Keyword)cGroup_5_8.eContents().get(4);
		private final Keyword cSemicolonKeyword_5_8_5 = (Keyword)cGroup_5_8.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//MSwPackageSupportedPlatform:
		//	{MSwPackageSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
		//	osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
		//	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
		//	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
		//	compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
		//	microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
		//	board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
		//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//	";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? & ("required" "interfaces" "{"
		//	requires+=MSwPackageRequiredInterface+ "}" ";")?) "}" ";";
		public ParserRule getRule() { return rule; }

		//{MSwPackageSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
		//osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
		//os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
		//architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
		//compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
		//microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
		//board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
		//languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? & ("required" "interfaces" "{"
		//requires+=MSwPackageRequiredInterface+ "}" ";")?) "}" ";"
		public Group getGroup() { return cGroup; }

		//{MSwPackageSupportedPlatform}
		public Action getMSwPackageSupportedPlatformAction_0() { return cMSwPackageSupportedPlatformAction_0; }

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

		//"osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
		//os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
		//architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
		//compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
		//microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
		//board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
		//languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
		//";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? & ("required" "interfaces" "{"
		//requires+=MSwPackageRequiredInterface+ "}" ";")?
		public UnorderedGroup getUnorderedGroup_5() { return cUnorderedGroup_5; }

		//"osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";"
		public Group getGroup_5_0() { return cGroup_5_0; }

		//"osapi"
		public Keyword getOsapiKeyword_5_0_0() { return cOsapiKeyword_5_0_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_0_1() { return cColonEqualsSignKeyword_5_0_1; }

		//"any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public Alternatives getAlternatives_5_0_2() { return cAlternatives_5_0_2; }

		//"any"
		public Keyword getAnyKeyword_5_0_2_0() { return cAnyKeyword_5_0_2_0; }

		//osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public Assignment getOsapiAssignment_5_0_2_1() { return cOsapiAssignment_5_0_2_1; }

		//[pdl::MOperatingSystemAPI|VersionedQualifiedName]
		public CrossReference getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0() { return cOsapiMOperatingSystemAPICrossReference_5_0_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1() { return cOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_0_3() { return cSemicolonKeyword_5_0_3; }

		//"os" ":=" ("any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";"
		public Group getGroup_5_1() { return cGroup_5_1; }

		//"os"
		public Keyword getOsKeyword_5_1_0() { return cOsKeyword_5_1_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_1_1() { return cColonEqualsSignKeyword_5_1_1; }

		//"any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]
		public Alternatives getAlternatives_5_1_2() { return cAlternatives_5_1_2; }

		//"any"
		public Keyword getAnyKeyword_5_1_2_0() { return cAnyKeyword_5_1_2_0; }

		//os=[pdl::MOperatingSystem|VersionedQualifiedName]
		public Assignment getOsAssignment_5_1_2_1() { return cOsAssignment_5_1_2_1; }

		//[pdl::MOperatingSystem|VersionedQualifiedName]
		public CrossReference getOsMOperatingSystemCrossReference_5_1_2_1_0() { return cOsMOperatingSystemCrossReference_5_1_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1() { return cOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_1_3() { return cSemicolonKeyword_5_1_3; }

		//"architecture" ":=" ("any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";"
		public Group getGroup_5_2() { return cGroup_5_2; }

		//"architecture"
		public Keyword getArchitectureKeyword_5_2_0() { return cArchitectureKeyword_5_2_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_2_1() { return cColonEqualsSignKeyword_5_2_1; }

		//"any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]
		public Alternatives getAlternatives_5_2_2() { return cAlternatives_5_2_2; }

		//"any"
		public Keyword getAnyKeyword_5_2_2_0() { return cAnyKeyword_5_2_2_0; }

		//architecture=[pdl::MArchitecture|VersionedQualifiedName]
		public Assignment getArchitectureAssignment_5_2_2_1() { return cArchitectureAssignment_5_2_2_1; }

		//[pdl::MArchitecture|VersionedQualifiedName]
		public CrossReference getArchitectureMArchitectureCrossReference_5_2_2_1_0() { return cArchitectureMArchitectureCrossReference_5_2_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1() { return cArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_2_3() { return cSemicolonKeyword_5_2_3; }

		//("compiler" ":=" compiler=[pdl::MCompiler|VersionedQualifiedName] ";")?
		public Group getGroup_5_3() { return cGroup_5_3; }

		//"compiler"
		public Keyword getCompilerKeyword_5_3_0() { return cCompilerKeyword_5_3_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_3_1() { return cColonEqualsSignKeyword_5_3_1; }

		//compiler=[pdl::MCompiler|VersionedQualifiedName]
		public Assignment getCompilerAssignment_5_3_2() { return cCompilerAssignment_5_3_2; }

		//[pdl::MCompiler|VersionedQualifiedName]
		public CrossReference getCompilerMCompilerCrossReference_5_3_2_0() { return cCompilerMCompilerCrossReference_5_3_2_0; }

		//VersionedQualifiedName
		public RuleCall getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1() { return cCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_3_3() { return cSemicolonKeyword_5_3_3; }

		//"microprocessor" ":=" ("any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";"
		public Group getGroup_5_4() { return cGroup_5_4; }

		//"microprocessor"
		public Keyword getMicroprocessorKeyword_5_4_0() { return cMicroprocessorKeyword_5_4_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_4_1() { return cColonEqualsSignKeyword_5_4_1; }

		//"any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
		public Alternatives getAlternatives_5_4_2() { return cAlternatives_5_4_2; }

		//"any"
		public Keyword getAnyKeyword_5_4_2_0() { return cAnyKeyword_5_4_2_0; }

		//microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
		public Assignment getMicroprocessorAssignment_5_4_2_1() { return cMicroprocessorAssignment_5_4_2_1; }

		//[pdl::MMicroprocessor|VersionedQualifiedName]
		public CrossReference getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0() { return cMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1() { return cMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_4_3() { return cSemicolonKeyword_5_4_3; }

		//"board" ":=" ("any" | board=[pdl::MBoard|VersionedQualifiedName]) ";"
		public Group getGroup_5_5() { return cGroup_5_5; }

		//"board"
		public Keyword getBoardKeyword_5_5_0() { return cBoardKeyword_5_5_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_5_1() { return cColonEqualsSignKeyword_5_5_1; }

		//"any" | board=[pdl::MBoard|VersionedQualifiedName]
		public Alternatives getAlternatives_5_5_2() { return cAlternatives_5_5_2; }

		//"any"
		public Keyword getAnyKeyword_5_5_2_0() { return cAnyKeyword_5_5_2_0; }

		//board=[pdl::MBoard|VersionedQualifiedName]
		public Assignment getBoardAssignment_5_5_2_1() { return cBoardAssignment_5_5_2_1; }

		//[pdl::MBoard|VersionedQualifiedName]
		public CrossReference getBoardMBoardCrossReference_5_5_2_1_0() { return cBoardMBoardCrossReference_5_5_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1() { return cBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_5_3() { return cSemicolonKeyword_5_5_3; }

		//("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
		//languages+=[system::MLanguage|VersionedQualifiedName])* ";")?
		public Group getGroup_5_6() { return cGroup_5_6; }

		//"languages"
		public Keyword getLanguagesKeyword_5_6_0() { return cLanguagesKeyword_5_6_0; }

		//":="
		public Keyword getColonEqualsSignKeyword_5_6_1() { return cColonEqualsSignKeyword_5_6_1; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_6_2() { return cLanguagesAssignment_5_6_2; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_6_2_0() { return cLanguagesMLanguageCrossReference_5_6_2_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_2_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_2_0_1; }

		//("," languages+=[system::MLanguage|VersionedQualifiedName])*
		public Group getGroup_5_6_3() { return cGroup_5_6_3; }

		//","
		public Keyword getCommaKeyword_5_6_3_0() { return cCommaKeyword_5_6_3_0; }

		//languages+=[system::MLanguage|VersionedQualifiedName]
		public Assignment getLanguagesAssignment_5_6_3_1() { return cLanguagesAssignment_5_6_3_1; }

		//[system::MLanguage|VersionedQualifiedName]
		public CrossReference getLanguagesMLanguageCrossReference_5_6_3_1_0() { return cLanguagesMLanguageCrossReference_5_6_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1() { return cLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_5_6_4() { return cSemicolonKeyword_5_6_4; }

		//("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")?
		public Group getGroup_5_7() { return cGroup_5_7; }

		//"configuration"
		public Keyword getConfigurationKeyword_5_7_0() { return cConfigurationKeyword_5_7_0; }

		//"parameters"
		public Keyword getParametersKeyword_5_7_1() { return cParametersKeyword_5_7_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_7_2() { return cLeftCurlyBracketKeyword_5_7_2; }

		//parameters+=MParameterWithoutSWPSP+
		public Assignment getParametersAssignment_5_7_3() { return cParametersAssignment_5_7_3; }

		//MParameterWithoutSWPSP
		public RuleCall getParametersMParameterWithoutSWPSPParserRuleCall_5_7_3_0() { return cParametersMParameterWithoutSWPSPParserRuleCall_5_7_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_7_4() { return cRightCurlyBracketKeyword_5_7_4; }

		//";"
		public Keyword getSemicolonKeyword_5_7_5() { return cSemicolonKeyword_5_7_5; }

		//("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")?
		public Group getGroup_5_8() { return cGroup_5_8; }

		//"required"
		public Keyword getRequiredKeyword_5_8_0() { return cRequiredKeyword_5_8_0; }

		//"interfaces"
		public Keyword getInterfacesKeyword_5_8_1() { return cInterfacesKeyword_5_8_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_8_2() { return cLeftCurlyBracketKeyword_5_8_2; }

		//requires+=MSwPackageRequiredInterface+
		public Assignment getRequiresAssignment_5_8_3() { return cRequiresAssignment_5_8_3; }

		//MSwPackageRequiredInterface
		public RuleCall getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0() { return cRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_8_4() { return cRightCurlyBracketKeyword_5_8_4; }

		//";"
		public Keyword getSemicolonKeyword_5_8_5() { return cSemicolonKeyword_5_8_5; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

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

	public class MResourceDemandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MResourceDemand");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMQuantifiableResourceDemandParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMInstantiableResourceDemandParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MResourceDemand:
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
		
		//MInstantiableResourceDemand:
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
		
		//MQuantifiableResourceDemand:
		//	{MQuantifiableResourceDemand} "quantifiable" "resource"
		//	resource=[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName] ":="
		//	resourceValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//{MQuantifiableResourceDemand} "quantifiable" "resource"
		//resource=[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName] ":="
		//resourceValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//{MQuantifiableResourceDemand}
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

	public class MParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMIntegerParameterSingleExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMEnumParameterSingleExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMBooleanParameterSingleExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMRealParameterSingleExpressionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cMStringParameterSingleExpressionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cMEnumParameterDefinitionParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cMBooleanParamSWPSPSwitchParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cMStringParamSWPSPSwitchParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cMIntegerParamSWPSPSwitchParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cMRealParamSWPSPSwitchParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cMEnumParamSWPSPSwitchParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		
		//MParameter returns common::MParameter:
		//	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
		//	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition |
		//	MBooleanParamSWPSPSwitch | MStringParamSWPSPSwitch | MIntegerParamSWPSPSwitch | MRealParamSWPSPSwitch |
		//	MEnumParamSWPSPSwitch;
		public ParserRule getRule() { return rule; }

		//MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
		//MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition | MBooleanParamSWPSPSwitch
		//| MStringParamSWPSPSwitch | MIntegerParamSWPSPSwitch | MRealParamSWPSPSwitch | MEnumParamSWPSPSwitch
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

		//MBooleanParamSWPSPSwitch
		public RuleCall getMBooleanParamSWPSPSwitchParserRuleCall_6() { return cMBooleanParamSWPSPSwitchParserRuleCall_6; }

		//MStringParamSWPSPSwitch
		public RuleCall getMStringParamSWPSPSwitchParserRuleCall_7() { return cMStringParamSWPSPSwitchParserRuleCall_7; }

		//MIntegerParamSWPSPSwitch
		public RuleCall getMIntegerParamSWPSPSwitchParserRuleCall_8() { return cMIntegerParamSWPSPSwitchParserRuleCall_8; }

		//MRealParamSWPSPSwitch
		public RuleCall getMRealParamSWPSPSwitchParserRuleCall_9() { return cMRealParamSWPSPSwitchParserRuleCall_9; }

		//MEnumParamSWPSPSwitch
		public RuleCall getMEnumParamSWPSPSwitchParserRuleCall_10() { return cMEnumParamSWPSPSwitchParserRuleCall_10; }
	}

	public class MParameterWithoutSWPSPElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MParameterWithoutSWPSP");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMIntegerParameterSingleExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMEnumParameterSingleExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMBooleanParameterSingleExpressionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMRealParameterSingleExpressionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cMStringParameterSingleExpressionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cMEnumParameterDefinitionParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//MParameterWithoutSWPSP returns common::MParameter:
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

	public class MBooleanParamSWPSPSwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MBooleanParamSWPSPSwitch");
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
		private final RuleCall cCasesMBooleanParamSWPSPSwitchCaseParserRuleCall_6_0 = (RuleCall)cCasesAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MBooleanParamSWPSPSwitch:
		//	constant?="const"? "boolean" name=ID ":=" "switch" "{" cases+=MBooleanParamSWPSPSwitchCase+ "}" ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "boolean" name=ID ":=" "switch" "{" cases+=MBooleanParamSWPSPSwitchCase+ "}" ";"
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

		//cases+=MBooleanParamSWPSPSwitchCase+
		public Assignment getCasesAssignment_6() { return cCasesAssignment_6; }

		//MBooleanParamSWPSPSwitchCase
		public RuleCall getCasesMBooleanParamSWPSPSwitchCaseParserRuleCall_6_0() { return cCasesMBooleanParamSWPSPSwitchCaseParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//";"
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class MBooleanParamSWPSPSwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MBooleanParamSWPSPSwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMSwPackageSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMSwPackageSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MBooleanParamSWPSPSwitchCase:
		//	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MSwPackageSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MSwPackageSupportedPlatform]
		public CrossReference getPlatformMSwPackageSupportedPlatformCrossReference_1_0() { return cPlatformMSwPackageSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_3() { return cDefaultValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_3_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class MStringParamSWPSPSwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MStringParamSWPSPSwitch");
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
		private final RuleCall cCasesMStringParamSWPSPSwitchCaseParserRuleCall_6_0 = (RuleCall)cCasesAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MStringParamSWPSPSwitch:
		//	constant?="const"? "string" name=ID ":=" "switch" "{" cases+=MStringParamSWPSPSwitchCase+ "}" ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "string" name=ID ":=" "switch" "{" cases+=MStringParamSWPSPSwitchCase+ "}" ";"
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

		//cases+=MStringParamSWPSPSwitchCase+
		public Assignment getCasesAssignment_6() { return cCasesAssignment_6; }

		//MStringParamSWPSPSwitchCase
		public RuleCall getCasesMStringParamSWPSPSwitchCaseParserRuleCall_6_0() { return cCasesMStringParamSWPSPSwitchCaseParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//";"
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class MStringParamSWPSPSwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MStringParamSWPSPSwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMSwPackageSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMSwPackageSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MStringParamSWPSPSwitchCase:
		//	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MSwPackageSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MSwPackageSupportedPlatform]
		public CrossReference getPlatformMSwPackageSupportedPlatformCrossReference_1_0() { return cPlatformMSwPackageSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_3() { return cDefaultValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_3_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class MIntegerParamSWPSPSwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MIntegerParamSWPSPSwitch");
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
		private final RuleCall cCasesMIntegerParamSWPSPSwitchCaseParserRuleCall_6_0 = (RuleCall)cCasesAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MIntegerParamSWPSPSwitch:
		//	constant?="const"? "integer" name=ID ":=" "switch" "{" cases+=MIntegerParamSWPSPSwitchCase+ "}" ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "integer" name=ID ":=" "switch" "{" cases+=MIntegerParamSWPSPSwitchCase+ "}" ";"
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

		//cases+=MIntegerParamSWPSPSwitchCase+
		public Assignment getCasesAssignment_6() { return cCasesAssignment_6; }

		//MIntegerParamSWPSPSwitchCase
		public RuleCall getCasesMIntegerParamSWPSPSwitchCaseParserRuleCall_6_0() { return cCasesMIntegerParamSWPSPSwitchCaseParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//";"
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class MIntegerParamSWPSPSwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MIntegerParamSWPSPSwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMSwPackageSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMSwPackageSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cRangeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRangeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cRangeMParameterRangeParserRuleCall_4_1_0 = (RuleCall)cRangeAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MIntegerParamSWPSPSwitchCase:
		//	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
		//	range=MParameterRange)? ";";
		public ParserRule getRule() { return rule; }

		//"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
		//range=MParameterRange)? ";"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MSwPackageSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MSwPackageSupportedPlatform]
		public CrossReference getPlatformMSwPackageSupportedPlatformCrossReference_1_0() { return cPlatformMSwPackageSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1; }

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

	public class MRealParamSWPSPSwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MRealParamSWPSPSwitch");
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
		private final RuleCall cCasesMRealParamSWPSPSwitchCaseParserRuleCall_6_0 = (RuleCall)cCasesAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//MRealParamSWPSPSwitch:
		//	constant?="const"? "real" name=ID ":=" "switch" "{" cases+=MRealParamSWPSPSwitchCase+ "}" ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "real" name=ID ":=" "switch" "{" cases+=MRealParamSWPSPSwitchCase+ "}" ";"
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

		//cases+=MRealParamSWPSPSwitchCase+
		public Assignment getCasesAssignment_6() { return cCasesAssignment_6; }

		//MRealParamSWPSPSwitchCase
		public RuleCall getCasesMRealParamSWPSPSwitchCaseParserRuleCall_6_0() { return cCasesMRealParamSWPSPSwitchCaseParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//";"
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class MRealParamSWPSPSwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MRealParamSWPSPSwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMSwPackageSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMSwPackageSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cRangeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRangeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cRangeMParameterRangeParserRuleCall_4_1_0 = (RuleCall)cRangeAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MRealParamSWPSPSwitchCase:
		//	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
		//	range=MParameterRange)? ";";
		public ParserRule getRule() { return rule; }

		//"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
		//range=MParameterRange)? ";"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MSwPackageSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MSwPackageSupportedPlatform]
		public CrossReference getPlatformMSwPackageSupportedPlatformCrossReference_1_0() { return cPlatformMSwPackageSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1; }

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

	public class MEnumParamSWPSPSwitchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParamSWPSPSwitch");
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
		private final RuleCall cCasesMEnumParamSWPSPSwitchCaseParserRuleCall_7_0 = (RuleCall)cCasesAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//MEnumParamSWPSPSwitch:
		//	constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
		//	":=" "switch" "{" cases+=MEnumParamSWPSPSwitchCase+ "}" ";";
		public ParserRule getRule() { return rule; }

		//constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID ":="
		//"switch" "{" cases+=MEnumParamSWPSPSwitchCase+ "}" ";"
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

		//cases+=MEnumParamSWPSPSwitchCase+
		public Assignment getCasesAssignment_7() { return cCasesAssignment_7; }

		//MEnumParamSWPSPSwitchCase
		public RuleCall getCasesMEnumParamSWPSPSwitchCaseParserRuleCall_7_0() { return cCasesMEnumParamSWPSPSwitchCaseParserRuleCall_7_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }

		//";"
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
	}

	public class MEnumParamSWPSPSwitchCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MEnumParamSWPSPSwitchCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPlatformAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPlatformMSwPackageSupportedPlatformCrossReference_1_0 = (CrossReference)cPlatformAssignment_1.eContents().get(0);
		private final RuleCall cPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1 = (RuleCall)cPlatformMSwPackageSupportedPlatformCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefaultValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefaultValueMParameterValueExpressionParserRuleCall_3_0 = (RuleCall)cDefaultValueAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//MEnumParamSWPSPSwitchCase:
		//	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
		public ParserRule getRule() { return rule; }

		//"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
		public Group getGroup() { return cGroup; }

		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }

		//platform=[MSwPackageSupportedPlatform]
		public Assignment getPlatformAssignment_1() { return cPlatformAssignment_1; }

		//[MSwPackageSupportedPlatform]
		public CrossReference getPlatformMSwPackageSupportedPlatformCrossReference_1_0() { return cPlatformMSwPackageSupportedPlatformCrossReference_1_0; }

		//ID
		public RuleCall getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1() { return cPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//defaultValue=MParameterValueExpression
		public Assignment getDefaultValueAssignment_3() { return cDefaultValueAssignment_3; }

		//MParameterValueExpression
		public RuleCall getDefaultValueMParameterValueExpressionParserRuleCall_3_0() { return cDefaultValueMParameterValueExpressionParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
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
	
	private MMESPSWPPackageFileElements pMMESPSWPPackageFile;
	private MMESPSWPPackageElementElements pMMESPSWPPackageElement;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionedQualifiedNameElements pVersionedQualifiedName;
	private VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private MAbstractSwPackageElements pMAbstractSwPackage;
	private MSwPackageProvidedInterfaceElements pMSwPackageProvidedInterface;
	private MSwPackageProvidedInterfacePVAElements pMSwPackageProvidedInterfacePVA;
	private MSwPackageProvidedInterfacePVAExpressionElements pMSwPackageProvidedInterfacePVAExpression;
	private MSwPackageProvidedInterfacePVASwitchElements pMSwPackageProvidedInterfacePVASwitch;
	private MSwPackageProvidedInterfacePVASwitchCaseElements pMSwPackageProvidedInterfacePVASwitchCase;
	private MSwPackageRequiredInterfaceElements pMSwPackageRequiredInterface;
	private MSwPackageElements pMSwPackage;
	private MDriverSwPackageElements pMDriverSwPackage;
	private MDriverSwPackageSupportedPlatformElements pMDriverSwPackageSupportedPlatform;
	private MDriverSwPackageSupportedDeviceElements pMDriverSwPackageSupportedDevice;
	private MSwPackageSupportedPlatformElements pMSwPackageSupportedPlatform;
	private MParameterValueAssignmentElements pMParameterValueAssignment;
	private EBooleanElements pEBoolean;
	private TerminalRule tHEXADECIMAL;
	private INTEGERElements pINTEGER;
	private REALElements pREAL;
	private MResourceDemandElements pMResourceDemand;
	private MInstantiableResourceDemandElements pMInstantiableResourceDemand;
	private MQuantifiableResourceDemandElements pMQuantifiableResourceDemand;
	private MParameterElements pMParameter;
	private MParameterWithoutSWPSPElements pMParameterWithoutSWPSP;
	private MBooleanParamSWPSPSwitchElements pMBooleanParamSWPSPSwitch;
	private MBooleanParamSWPSPSwitchCaseElements pMBooleanParamSWPSPSwitchCase;
	private MStringParamSWPSPSwitchElements pMStringParamSWPSPSwitch;
	private MStringParamSWPSPSwitchCaseElements pMStringParamSWPSPSwitchCase;
	private MIntegerParamSWPSPSwitchElements pMIntegerParamSWPSPSwitch;
	private MIntegerParamSWPSPSwitchCaseElements pMIntegerParamSWPSPSwitchCase;
	private MRealParamSWPSPSwitchElements pMRealParamSWPSPSwitch;
	private MRealParamSWPSPSwitchCaseElements pMRealParamSWPSPSwitchCase;
	private MEnumParamSWPSPSwitchElements pMEnumParamSWPSPSwitch;
	private MEnumParamSWPSPSwitchCaseElements pMEnumParamSWPSPSwitchCase;
	private MBooleanParameterSingleExpressionElements pMBooleanParameterSingleExpression;
	private MStringParameterSingleExpressionElements pMStringParameterSingleExpression;
	private MIntegerParameterSingleExpressionElements pMIntegerParameterSingleExpression;
	private MEnumParameterDefinitionElements pMEnumParameterDefinition;
	private MEnumParameterSingleExpressionElements pMEnumParameterSingleExpression;
	private MRealParameterSingleExpressionElements pMRealParameterSingleExpression;
	private MEnumParameterLiteralRuleElements pMEnumParameterLiteralRule;
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
	private MEnumParameterLiteralElements pMEnumParameterLiteral;
	private MEnumParamIntegerLiteralElements pMEnumParamIntegerLiteral;
	private MEnumParamRealLiteralElements pMEnumParamRealLiteral;
	private MEnumParamStringLiteralElements pMEnumParamStringLiteral;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SWPGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mesp.lang.SWP".equals(grammar.getName())) {
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

	
	//MMESPSWPPackageFile:
	//	"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
	//	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPSWPPackageElement;
	public MMESPSWPPackageFileElements getMMESPSWPPackageFileAccess() {
		return (pMMESPSWPPackageFile != null) ? pMMESPSWPPackageFile : (pMMESPSWPPackageFile = new MMESPSWPPackageFileElements());
	}
	
	public ParserRule getMMESPSWPPackageFileRule() {
		return getMMESPSWPPackageFileAccess().getRule();
	}

	//MMESPSWPPackageElement:
	//	MDriverSwPackage | MSwPackage | MAbstractSwPackage;
	public MMESPSWPPackageElementElements getMMESPSWPPackageElementAccess() {
		return (pMMESPSWPPackageElement != null) ? pMMESPSWPPackageElement : (pMMESPSWPPackageElement = new MMESPSWPPackageElementElements());
	}
	
	public ParserRule getMMESPSWPPackageElementRule() {
		return getMMESPSWPPackageElementAccess().getRule();
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

	//MAbstractSwPackage:
	//	"abstract" "swpackage" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
	//	inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("configuration"
	//	"parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? & ("provided" "interfaces" "{"
	//	provides+=MSwPackageProvidedInterface+ "}" ";")?) "}" ";";
	public MAbstractSwPackageElements getMAbstractSwPackageAccess() {
		return (pMAbstractSwPackage != null) ? pMAbstractSwPackage : (pMAbstractSwPackage = new MAbstractSwPackageElements());
	}
	
	public ParserRule getMAbstractSwPackageRule() {
		return getMAbstractSwPackageAccess().getRule();
	}

	//MSwPackageProvidedInterface:
	//	"provides" swinterface=[mespswi::MSwInterface|VersionedQualifiedName] "{"
	//	parameterValueAssignments+=MSwPackageProvidedInterfacePVA* "}" ";";
	public MSwPackageProvidedInterfaceElements getMSwPackageProvidedInterfaceAccess() {
		return (pMSwPackageProvidedInterface != null) ? pMSwPackageProvidedInterface : (pMSwPackageProvidedInterface = new MSwPackageProvidedInterfaceElements());
	}
	
	public ParserRule getMSwPackageProvidedInterfaceRule() {
		return getMSwPackageProvidedInterfaceAccess().getRule();
	}

	//MSwPackageProvidedInterfacePVA:
	//	MSwPackageProvidedInterfacePVAExpression | MSwPackageProvidedInterfacePVASwitch;
	public MSwPackageProvidedInterfacePVAElements getMSwPackageProvidedInterfacePVAAccess() {
		return (pMSwPackageProvidedInterfacePVA != null) ? pMSwPackageProvidedInterfacePVA : (pMSwPackageProvidedInterfacePVA = new MSwPackageProvidedInterfacePVAElements());
	}
	
	public ParserRule getMSwPackageProvidedInterfacePVARule() {
		return getMSwPackageProvidedInterfacePVAAccess().getRule();
	}

	//MSwPackageProvidedInterfacePVAExpression:
	//	"parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":="
	//	parameterValue=MParameterValueExpression ";";
	public MSwPackageProvidedInterfacePVAExpressionElements getMSwPackageProvidedInterfacePVAExpressionAccess() {
		return (pMSwPackageProvidedInterfacePVAExpression != null) ? pMSwPackageProvidedInterfacePVAExpression : (pMSwPackageProvidedInterfacePVAExpression = new MSwPackageProvidedInterfacePVAExpressionElements());
	}
	
	public ParserRule getMSwPackageProvidedInterfacePVAExpressionRule() {
		return getMSwPackageProvidedInterfacePVAExpressionAccess().getRule();
	}

	//MSwPackageProvidedInterfacePVASwitch:
	//	"parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" "switch" "{"
	//	cases+=MSwPackageProvidedInterfacePVASwitchCase+ "}" ";";
	public MSwPackageProvidedInterfacePVASwitchElements getMSwPackageProvidedInterfacePVASwitchAccess() {
		return (pMSwPackageProvidedInterfacePVASwitch != null) ? pMSwPackageProvidedInterfacePVASwitch : (pMSwPackageProvidedInterfacePVASwitch = new MSwPackageProvidedInterfacePVASwitchElements());
	}
	
	public ParserRule getMSwPackageProvidedInterfacePVASwitchRule() {
		return getMSwPackageProvidedInterfacePVASwitchAccess().getRule();
	}

	//MSwPackageProvidedInterfacePVASwitchCase:
	//	"case" platform=[MSwPackageSupportedPlatform] ":" parameterValue=MParameterValueExpression ";";
	public MSwPackageProvidedInterfacePVASwitchCaseElements getMSwPackageProvidedInterfacePVASwitchCaseAccess() {
		return (pMSwPackageProvidedInterfacePVASwitchCase != null) ? pMSwPackageProvidedInterfacePVASwitchCase : (pMSwPackageProvidedInterfacePVASwitchCase = new MSwPackageProvidedInterfacePVASwitchCaseElements());
	}
	
	public ParserRule getMSwPackageProvidedInterfacePVASwitchCaseRule() {
		return getMSwPackageProvidedInterfacePVASwitchCaseAccess().getRule();
	}

	//MSwPackageRequiredInterface:
	//	"requires" interface=[common::MCommonPackageElement|VersionedQualifiedName] "{" resourceDemands+=MResourceDemand* "}"
	//	";";
	public MSwPackageRequiredInterfaceElements getMSwPackageRequiredInterfaceAccess() {
		return (pMSwPackageRequiredInterface != null) ? pMSwPackageRequiredInterface : (pMSwPackageRequiredInterface = new MSwPackageRequiredInterfaceElements());
	}
	
	public ParserRule getMSwPackageRequiredInterfaceRule() {
		return getMSwPackageRequiredInterfaceAccess().getRule();
	}

	//MSwPackage:
	//	"swpackage" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
	//	inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? ("extends" extends+=[MSwPackage|VersionedQualifiedName] (","
	//	extends+=[MSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
	//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
	//	& "construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
	//	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
	//	parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
	//	("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
	//	supportedPlatforms+=MSwPackageSupportedPlatform+ "}" ";") "}" ";";
	public MSwPackageElements getMSwPackageAccess() {
		return (pMSwPackage != null) ? pMSwPackage : (pMSwPackage = new MSwPackageElements());
	}
	
	public ParserRule getMSwPackageRule() {
		return getMSwPackageAccess().getRule();
	}

	//MDriverSwPackage:
	//	"driver" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
	//	inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? ("extends" extends+=[MSwPackage|VersionedQualifiedName] (","
	//	extends+=[MSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
	//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
	//	& "construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
	//	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
	//	parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
	//	("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
	//	supportedPlatforms+=MDriverSwPackageSupportedPlatform+ "}" ";") "}" ";";
	public MDriverSwPackageElements getMDriverSwPackageAccess() {
		return (pMDriverSwPackage != null) ? pMDriverSwPackage : (pMDriverSwPackage = new MDriverSwPackageElements());
	}
	
	public ParserRule getMDriverSwPackageRule() {
		return getMDriverSwPackageAccess().getRule();
	}

	//MDriverSwPackageSupportedPlatform:
	//	{MDriverSwPackageSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
	//	osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
	//	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
	//	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
	//	compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
	//	microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
	//	board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
	//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
	//	";")? & ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")? & ("required" "interfaces" "{"
	//	requires+=MSwPackageRequiredInterface+ "}" ";")? & ("supported" "devices" "{"
	//	supportedDevices+=MDriverSwPackageSupportedDevice+ "}" ";")?) "}" ";";
	public MDriverSwPackageSupportedPlatformElements getMDriverSwPackageSupportedPlatformAccess() {
		return (pMDriverSwPackageSupportedPlatform != null) ? pMDriverSwPackageSupportedPlatform : (pMDriverSwPackageSupportedPlatform = new MDriverSwPackageSupportedPlatformElements());
	}
	
	public ParserRule getMDriverSwPackageSupportedPlatformRule() {
		return getMDriverSwPackageSupportedPlatformAccess().getRule();
	}

	//MDriverSwPackageSupportedDevice:
	//	"device" device=[pdl::MDevice|VersionedQualifiedName] name=ID "{" ("required" ":=" required=MParameterValueExpression
	//	";")? "}" ";";
	public MDriverSwPackageSupportedDeviceElements getMDriverSwPackageSupportedDeviceAccess() {
		return (pMDriverSwPackageSupportedDevice != null) ? pMDriverSwPackageSupportedDevice : (pMDriverSwPackageSupportedDevice = new MDriverSwPackageSupportedDeviceElements());
	}
	
	public ParserRule getMDriverSwPackageSupportedDeviceRule() {
		return getMDriverSwPackageSupportedDeviceAccess().getRule();
	}

	//MSwPackageSupportedPlatform:
	//	{MSwPackageSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
	//	osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
	//	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
	//	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
	//	compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
	//	microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
	//	board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
	//	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
	//	";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? & ("required" "interfaces" "{"
	//	requires+=MSwPackageRequiredInterface+ "}" ";")?) "}" ";";
	public MSwPackageSupportedPlatformElements getMSwPackageSupportedPlatformAccess() {
		return (pMSwPackageSupportedPlatform != null) ? pMSwPackageSupportedPlatform : (pMSwPackageSupportedPlatform = new MSwPackageSupportedPlatformElements());
	}
	
	public ParserRule getMSwPackageSupportedPlatformRule() {
		return getMSwPackageSupportedPlatformAccess().getRule();
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

	//MResourceDemand:
	//	MQuantifiableResourceDemand | MInstantiableResourceDemand;
	public MResourceDemandElements getMResourceDemandAccess() {
		return (pMResourceDemand != null) ? pMResourceDemand : (pMResourceDemand = new MResourceDemandElements());
	}
	
	public ParserRule getMResourceDemandRule() {
		return getMResourceDemandAccess().getRule();
	}

	//MInstantiableResourceDemand:
	//	"instantiable" "resource" resource=[mespcommon::MInstantiableResource|VersionedQualifiedReferenceName] name=ID "{"
	//	parameterValueAssignments+=MParameterValueAssignment* "}" ";";
	public MInstantiableResourceDemandElements getMInstantiableResourceDemandAccess() {
		return (pMInstantiableResourceDemand != null) ? pMInstantiableResourceDemand : (pMInstantiableResourceDemand = new MInstantiableResourceDemandElements());
	}
	
	public ParserRule getMInstantiableResourceDemandRule() {
		return getMInstantiableResourceDemandAccess().getRule();
	}

	//MQuantifiableResourceDemand:
	//	{MQuantifiableResourceDemand} "quantifiable" "resource"
	//	resource=[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName] ":="
	//	resourceValue=MParameterValueExpression ";";
	public MQuantifiableResourceDemandElements getMQuantifiableResourceDemandAccess() {
		return (pMQuantifiableResourceDemand != null) ? pMQuantifiableResourceDemand : (pMQuantifiableResourceDemand = new MQuantifiableResourceDemandElements());
	}
	
	public ParserRule getMQuantifiableResourceDemandRule() {
		return getMQuantifiableResourceDemandAccess().getRule();
	}

	//MParameter returns common::MParameter:
	//	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
	//	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition |
	//	MBooleanParamSWPSPSwitch | MStringParamSWPSPSwitch | MIntegerParamSWPSPSwitch | MRealParamSWPSPSwitch |
	//	MEnumParamSWPSPSwitch;
	public MParameterElements getMParameterAccess() {
		return (pMParameter != null) ? pMParameter : (pMParameter = new MParameterElements());
	}
	
	public ParserRule getMParameterRule() {
		return getMParameterAccess().getRule();
	}

	//MParameterWithoutSWPSP returns common::MParameter:
	//	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
	//	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition;
	public MParameterWithoutSWPSPElements getMParameterWithoutSWPSPAccess() {
		return (pMParameterWithoutSWPSP != null) ? pMParameterWithoutSWPSP : (pMParameterWithoutSWPSP = new MParameterWithoutSWPSPElements());
	}
	
	public ParserRule getMParameterWithoutSWPSPRule() {
		return getMParameterWithoutSWPSPAccess().getRule();
	}

	//MBooleanParamSWPSPSwitch:
	//	constant?="const"? "boolean" name=ID ":=" "switch" "{" cases+=MBooleanParamSWPSPSwitchCase+ "}" ";";
	public MBooleanParamSWPSPSwitchElements getMBooleanParamSWPSPSwitchAccess() {
		return (pMBooleanParamSWPSPSwitch != null) ? pMBooleanParamSWPSPSwitch : (pMBooleanParamSWPSPSwitch = new MBooleanParamSWPSPSwitchElements());
	}
	
	public ParserRule getMBooleanParamSWPSPSwitchRule() {
		return getMBooleanParamSWPSPSwitchAccess().getRule();
	}

	//MBooleanParamSWPSPSwitchCase:
	//	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
	public MBooleanParamSWPSPSwitchCaseElements getMBooleanParamSWPSPSwitchCaseAccess() {
		return (pMBooleanParamSWPSPSwitchCase != null) ? pMBooleanParamSWPSPSwitchCase : (pMBooleanParamSWPSPSwitchCase = new MBooleanParamSWPSPSwitchCaseElements());
	}
	
	public ParserRule getMBooleanParamSWPSPSwitchCaseRule() {
		return getMBooleanParamSWPSPSwitchCaseAccess().getRule();
	}

	//MStringParamSWPSPSwitch:
	//	constant?="const"? "string" name=ID ":=" "switch" "{" cases+=MStringParamSWPSPSwitchCase+ "}" ";";
	public MStringParamSWPSPSwitchElements getMStringParamSWPSPSwitchAccess() {
		return (pMStringParamSWPSPSwitch != null) ? pMStringParamSWPSPSwitch : (pMStringParamSWPSPSwitch = new MStringParamSWPSPSwitchElements());
	}
	
	public ParserRule getMStringParamSWPSPSwitchRule() {
		return getMStringParamSWPSPSwitchAccess().getRule();
	}

	//MStringParamSWPSPSwitchCase:
	//	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
	public MStringParamSWPSPSwitchCaseElements getMStringParamSWPSPSwitchCaseAccess() {
		return (pMStringParamSWPSPSwitchCase != null) ? pMStringParamSWPSPSwitchCase : (pMStringParamSWPSPSwitchCase = new MStringParamSWPSPSwitchCaseElements());
	}
	
	public ParserRule getMStringParamSWPSPSwitchCaseRule() {
		return getMStringParamSWPSPSwitchCaseAccess().getRule();
	}

	//MIntegerParamSWPSPSwitch:
	//	constant?="const"? "integer" name=ID ":=" "switch" "{" cases+=MIntegerParamSWPSPSwitchCase+ "}" ";";
	public MIntegerParamSWPSPSwitchElements getMIntegerParamSWPSPSwitchAccess() {
		return (pMIntegerParamSWPSPSwitch != null) ? pMIntegerParamSWPSPSwitch : (pMIntegerParamSWPSPSwitch = new MIntegerParamSWPSPSwitchElements());
	}
	
	public ParserRule getMIntegerParamSWPSPSwitchRule() {
		return getMIntegerParamSWPSPSwitchAccess().getRule();
	}

	//MIntegerParamSWPSPSwitchCase:
	//	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
	//	range=MParameterRange)? ";";
	public MIntegerParamSWPSPSwitchCaseElements getMIntegerParamSWPSPSwitchCaseAccess() {
		return (pMIntegerParamSWPSPSwitchCase != null) ? pMIntegerParamSWPSPSwitchCase : (pMIntegerParamSWPSPSwitchCase = new MIntegerParamSWPSPSwitchCaseElements());
	}
	
	public ParserRule getMIntegerParamSWPSPSwitchCaseRule() {
		return getMIntegerParamSWPSPSwitchCaseAccess().getRule();
	}

	//MRealParamSWPSPSwitch:
	//	constant?="const"? "real" name=ID ":=" "switch" "{" cases+=MRealParamSWPSPSwitchCase+ "}" ";";
	public MRealParamSWPSPSwitchElements getMRealParamSWPSPSwitchAccess() {
		return (pMRealParamSWPSPSwitch != null) ? pMRealParamSWPSPSwitch : (pMRealParamSWPSPSwitch = new MRealParamSWPSPSwitchElements());
	}
	
	public ParserRule getMRealParamSWPSPSwitchRule() {
		return getMRealParamSWPSPSwitchAccess().getRule();
	}

	//MRealParamSWPSPSwitchCase:
	//	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
	//	range=MParameterRange)? ";";
	public MRealParamSWPSPSwitchCaseElements getMRealParamSWPSPSwitchCaseAccess() {
		return (pMRealParamSWPSPSwitchCase != null) ? pMRealParamSWPSPSwitchCase : (pMRealParamSWPSPSwitchCase = new MRealParamSWPSPSwitchCaseElements());
	}
	
	public ParserRule getMRealParamSWPSPSwitchCaseRule() {
		return getMRealParamSWPSPSwitchCaseAccess().getRule();
	}

	//MEnumParamSWPSPSwitch:
	//	constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
	//	":=" "switch" "{" cases+=MEnumParamSWPSPSwitchCase+ "}" ";";
	public MEnumParamSWPSPSwitchElements getMEnumParamSWPSPSwitchAccess() {
		return (pMEnumParamSWPSPSwitch != null) ? pMEnumParamSWPSPSwitch : (pMEnumParamSWPSPSwitch = new MEnumParamSWPSPSwitchElements());
	}
	
	public ParserRule getMEnumParamSWPSPSwitchRule() {
		return getMEnumParamSWPSPSwitchAccess().getRule();
	}

	//MEnumParamSWPSPSwitchCase:
	//	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
	public MEnumParamSWPSPSwitchCaseElements getMEnumParamSWPSPSwitchCaseAccess() {
		return (pMEnumParamSWPSPSwitchCase != null) ? pMEnumParamSWPSPSwitchCase : (pMEnumParamSWPSPSwitchCase = new MEnumParamSWPSPSwitchCaseElements());
	}
	
	public ParserRule getMEnumParamSWPSPSwitchCaseRule() {
		return getMEnumParamSWPSPSwitchCaseAccess().getRule();
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
