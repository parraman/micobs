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

package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.services;

import java.util.List;

import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class DCLASSGrammarAccess extends AbstractGrammarElementFinder {


	public class EDROOMDCLASSPackageFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDCLASSPackageFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPackageEDROOMPackageCrossReference_1_0 = (CrossReference)cPackageAssignment_1.eContents().get(0);
		private final RuleCall cPackageEDROOMPackageQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cPackageEDROOMPackageCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cImportKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cImportsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cImportsEDROOMPackageCrossReference_3_1_0 = (CrossReference)cImportsAssignment_3_1.eContents().get(0);
		private final RuleCall cImportsEDROOMPackageQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cImportsEDROOMPackageCrossReference_3_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cElementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementEDROOMDCLASSPackageElementParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);

		//EDROOMDCLASSPackageFile:
		//	"package" package=[edroomlibrary::EDROOMPackage|QualifiedName] ";" ("import"
		//	imports+=[edroomlibrary::EDROOMPackage|QualifiedName] ";")* element=EDROOMDCLASSPackageElement;
		public ParserRule getRule() { return rule; }

		//"package" package=[edroomlibrary::EDROOMPackage|QualifiedName] ";" ("import"
		//imports+=[edroomlibrary::EDROOMPackage|QualifiedName] ";")* element=EDROOMDCLASSPackageElement
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//package=[edroomlibrary::EDROOMPackage|QualifiedName]
		public Assignment getPackageAssignment_1() { return cPackageAssignment_1; }

		//[edroomlibrary::EDROOMPackage|QualifiedName]
		public CrossReference getPackageEDROOMPackageCrossReference_1_0() { return cPackageEDROOMPackageCrossReference_1_0; }

		//QualifiedName
		public RuleCall getPackageEDROOMPackageQualifiedNameParserRuleCall_1_0_1() { return cPackageEDROOMPackageQualifiedNameParserRuleCall_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }

		//("import" imports+=[edroomlibrary::EDROOMPackage|QualifiedName] ";")*
		public Group getGroup_3() { return cGroup_3; }

		//"import"
		public Keyword getImportKeyword_3_0() { return cImportKeyword_3_0; }

		//imports+=[edroomlibrary::EDROOMPackage|QualifiedName]
		public Assignment getImportsAssignment_3_1() { return cImportsAssignment_3_1; }

		//[edroomlibrary::EDROOMPackage|QualifiedName]
		public CrossReference getImportsEDROOMPackageCrossReference_3_1_0() { return cImportsEDROOMPackageCrossReference_3_1_0; }

		//QualifiedName
		public RuleCall getImportsEDROOMPackageQualifiedNameParserRuleCall_3_1_0_1() { return cImportsEDROOMPackageQualifiedNameParserRuleCall_3_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3_2() { return cSemicolonKeyword_3_2; }

		//element=EDROOMDCLASSPackageElement
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }

		//EDROOMDCLASSPackageElement
		public RuleCall getElementEDROOMDCLASSPackageElementParserRuleCall_4_0() { return cElementEDROOMDCLASSPackageElementParserRuleCall_4_0; }
	}

	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EInt");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);

		//EInt returns ecore::EInt:
		//	INT;
		public ParserRule getRule() { return rule; }

		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
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

	public class EDROOMDCLASSPackageElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDCLASSPackageElement");
		private final RuleCall cEDROOMDataClassParserRuleCall = (RuleCall)rule.eContents().get(1);

		//EDROOMDCLASSPackageElement:
		//	EDROOMDataClass;
		public ParserRule getRule() { return rule; }

		//EDROOMDataClass
		public RuleCall getEDROOMDataClassParserRuleCall() { return cEDROOMDataClassParserRuleCall; }
	}

	public class EDROOMDataClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDataclassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cInheritsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInheritsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cInheritsEDROOMDataClassCrossReference_3_1_0 = (CrossReference)cInheritsAssignment_3_1.eContents().get(0);
		private final RuleCall cInheritsEDROOMDataClassVersionedQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cInheritsEDROOMDataClassCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cInheritsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cInheritsEDROOMDataClassCrossReference_3_2_1_0 = (CrossReference)cInheritsAssignment_3_2_1.eContents().get(0);
		private final RuleCall cInheritsEDROOMDataClassVersionedQualifiedNameParserRuleCall_3_2_1_0_1 = (RuleCall)cInheritsEDROOMDataClassCrossReference_3_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final UnorderedGroup cUnorderedGroup_5 = (UnorderedGroup)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cUnorderedGroup_5.eContents().get(0);
		private final Keyword cVersionKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cVersionAssignment_5_0_2 = (Assignment)cGroup_5_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_5_0_2_0 = (RuleCall)cVersionAssignment_5_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_5_0_3 = (Keyword)cGroup_5_0.eContents().get(3);
		private final Alternatives cAlternatives_5_1 = (Alternatives)cUnorderedGroup_5.eContents().get(1);
		private final Assignment cDefinitionsAssignment_5_1_0 = (Assignment)cAlternatives_5_1.eContents().get(0);
		private final RuleCall cDefinitionsEDROOMDataDefinitionParserRuleCall_5_1_0_0 = (RuleCall)cDefinitionsAssignment_5_1_0.eContents().get(0);
		private final Assignment cFieldsAssignment_5_1_1 = (Assignment)cAlternatives_5_1.eContents().get(1);
		private final RuleCall cFieldsEDROOMDataFieldParserRuleCall_5_1_1_0 = (RuleCall)cFieldsAssignment_5_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);

		//EDROOMDataClass:
		//	{EDROOMDataClass} "dataclass" name=ID ("inherits" inherits+=[EDROOMDataClass|VersionedQualifiedName] (","
		//	inherits+=[EDROOMDataClass|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" &
		//	(definitions+=EDROOMDataDefinition | fields+=EDROOMDataField)*) "}" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataClass} "dataclass" name=ID ("inherits" inherits+=[EDROOMDataClass|VersionedQualifiedName] (","
		//inherits+=[EDROOMDataClass|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" &
		//(definitions+=EDROOMDataDefinition | fields+=EDROOMDataField)*) "}" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataClass}
		public Action getEDROOMDataClassAction_0() { return cEDROOMDataClassAction_0; }

		//"dataclass"
		public Keyword getDataclassKeyword_1() { return cDataclassKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//("inherits" inherits+=[EDROOMDataClass|VersionedQualifiedName] (","
		//inherits+=[EDROOMDataClass|VersionedQualifiedName])*)?
		public Group getGroup_3() { return cGroup_3; }

		//"inherits"
		public Keyword getInheritsKeyword_3_0() { return cInheritsKeyword_3_0; }

		//inherits+=[EDROOMDataClass|VersionedQualifiedName]
		public Assignment getInheritsAssignment_3_1() { return cInheritsAssignment_3_1; }

		//[EDROOMDataClass|VersionedQualifiedName]
		public CrossReference getInheritsEDROOMDataClassCrossReference_3_1_0() { return cInheritsEDROOMDataClassCrossReference_3_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsEDROOMDataClassVersionedQualifiedNameParserRuleCall_3_1_0_1() { return cInheritsEDROOMDataClassVersionedQualifiedNameParserRuleCall_3_1_0_1; }

		//("," inherits+=[EDROOMDataClass|VersionedQualifiedName])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//inherits+=[EDROOMDataClass|VersionedQualifiedName]
		public Assignment getInheritsAssignment_3_2_1() { return cInheritsAssignment_3_2_1; }

		//[EDROOMDataClass|VersionedQualifiedName]
		public CrossReference getInheritsEDROOMDataClassCrossReference_3_2_1_0() { return cInheritsEDROOMDataClassCrossReference_3_2_1_0; }

		//VersionedQualifiedName
		public RuleCall getInheritsEDROOMDataClassVersionedQualifiedNameParserRuleCall_3_2_1_0_1() { return cInheritsEDROOMDataClassVersionedQualifiedNameParserRuleCall_3_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//"version" ":=" version=Version ";" & (definitions+=EDROOMDataDefinition | fields+=EDROOMDataField)*
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

		//(definitions+=EDROOMDataDefinition | fields+=EDROOMDataField)*
		public Alternatives getAlternatives_5_1() { return cAlternatives_5_1; }

		//definitions+=EDROOMDataDefinition
		public Assignment getDefinitionsAssignment_5_1_0() { return cDefinitionsAssignment_5_1_0; }

		//EDROOMDataDefinition
		public RuleCall getDefinitionsEDROOMDataDefinitionParserRuleCall_5_1_0_0() { return cDefinitionsEDROOMDataDefinitionParserRuleCall_5_1_0_0; }

		//fields+=EDROOMDataField
		public Assignment getFieldsAssignment_5_1_1() { return cFieldsAssignment_5_1_1; }

		//EDROOMDataField
		public RuleCall getFieldsEDROOMDataFieldParserRuleCall_5_1_1_0() { return cFieldsEDROOMDataFieldParserRuleCall_5_1_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class EDROOMDataDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEDROOMDataDefinitionUnionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEDROOMDataDefinitionEnumParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);

		//EDROOMDataDefinition:
		//	EDROOMDataDefinitionUnion | EDROOMDataDefinitionEnum;
		public ParserRule getRule() { return rule; }

		//EDROOMDataDefinitionUnion | EDROOMDataDefinitionEnum
		public Alternatives getAlternatives() { return cAlternatives; }

		//EDROOMDataDefinitionUnion
		public RuleCall getEDROOMDataDefinitionUnionParserRuleCall_0() { return cEDROOMDataDefinitionUnionParserRuleCall_0; }

		//EDROOMDataDefinitionEnum
		public RuleCall getEDROOMDataDefinitionEnumParserRuleCall_1() { return cEDROOMDataDefinitionEnumParserRuleCall_1; }
	}

	public class EDROOMDataDefinitionUnionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinitionUnion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataDefinitionUnionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUnionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsEDROOMDataDefinitionUnionElementParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Assignment cElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cElementsEDROOMDataDefinitionUnionElementParserRuleCall_5_0 = (RuleCall)cElementsAssignment_5.eContents().get(0);
		private final Assignment cElementsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cElementsEDROOMDataDefinitionUnionElementParserRuleCall_6_0 = (RuleCall)cElementsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);

		//EDROOMDataDefinitionUnion:
		//	{EDROOMDataDefinitionUnion} "union" name=ID "{" elements+=EDROOMDataDefinitionUnionElement
		//	elements+=EDROOMDataDefinitionUnionElement elements+=EDROOMDataDefinitionUnionElement* "}" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataDefinitionUnion} "union" name=ID "{" elements+=EDROOMDataDefinitionUnionElement
		//elements+=EDROOMDataDefinitionUnionElement elements+=EDROOMDataDefinitionUnionElement* "}" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataDefinitionUnion}
		public Action getEDROOMDataDefinitionUnionAction_0() { return cEDROOMDataDefinitionUnionAction_0; }

		//"union"
		public Keyword getUnionKeyword_1() { return cUnionKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//elements+=EDROOMDataDefinitionUnionElement
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }

		//EDROOMDataDefinitionUnionElement
		public RuleCall getElementsEDROOMDataDefinitionUnionElementParserRuleCall_4_0() { return cElementsEDROOMDataDefinitionUnionElementParserRuleCall_4_0; }

		//elements+=EDROOMDataDefinitionUnionElement
		public Assignment getElementsAssignment_5() { return cElementsAssignment_5; }

		//EDROOMDataDefinitionUnionElement
		public RuleCall getElementsEDROOMDataDefinitionUnionElementParserRuleCall_5_0() { return cElementsEDROOMDataDefinitionUnionElementParserRuleCall_5_0; }

		//elements+=EDROOMDataDefinitionUnionElement*
		public Assignment getElementsAssignment_6() { return cElementsAssignment_6; }

		//EDROOMDataDefinitionUnionElement
		public RuleCall getElementsEDROOMDataDefinitionUnionElementParserRuleCall_6_0() { return cElementsEDROOMDataDefinitionUnionElementParserRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }

		//";"
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}

	public class EDROOMDataDefinitionEnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinitionEnum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataDefinitionEnumAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEnumKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsEDROOMDataDefinitionEnumElementParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cElementsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cElementsEDROOMDataDefinitionEnumElementParserRuleCall_5_1_0 = (RuleCall)cElementsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);

		//EDROOMDataDefinitionEnum:
		//	{EDROOMDataDefinitionEnum} "enum" name=ID "{" elements+=EDROOMDataDefinitionEnumElement (","
		//	elements+=EDROOMDataDefinitionEnumElement)* "}" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataDefinitionEnum} "enum" name=ID "{" elements+=EDROOMDataDefinitionEnumElement (","
		//elements+=EDROOMDataDefinitionEnumElement)* "}" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataDefinitionEnum}
		public Action getEDROOMDataDefinitionEnumAction_0() { return cEDROOMDataDefinitionEnumAction_0; }

		//"enum"
		public Keyword getEnumKeyword_1() { return cEnumKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//elements+=EDROOMDataDefinitionEnumElement
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }

		//EDROOMDataDefinitionEnumElement
		public RuleCall getElementsEDROOMDataDefinitionEnumElementParserRuleCall_4_0() { return cElementsEDROOMDataDefinitionEnumElementParserRuleCall_4_0; }

		//("," elements+=EDROOMDataDefinitionEnumElement)*
		public Group getGroup_5() { return cGroup_5; }

		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }

		//elements+=EDROOMDataDefinitionEnumElement
		public Assignment getElementsAssignment_5_1() { return cElementsAssignment_5_1; }

		//EDROOMDataDefinitionEnumElement
		public RuleCall getElementsEDROOMDataDefinitionEnumElementParserRuleCall_5_1_0() { return cElementsEDROOMDataDefinitionEnumElementParserRuleCall_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class EDROOMDataDefinitionEnumElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinitionEnumElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataDefinitionEnumElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEqualsSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueEIntParserRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);

		//EDROOMDataDefinitionEnumElement:
		//	{EDROOMDataDefinitionEnumElement} name=ID ("=" value=EInt)?;
		public ParserRule getRule() { return rule; }

		//{EDROOMDataDefinitionEnumElement} name=ID ("=" value=EInt)?
		public Group getGroup() { return cGroup; }

		//{EDROOMDataDefinitionEnumElement}
		public Action getEDROOMDataDefinitionEnumElementAction_0() { return cEDROOMDataDefinitionEnumElementAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("=" value=EInt)?
		public Group getGroup_2() { return cGroup_2; }

		//"="
		public Keyword getEqualsSignKeyword_2_0() { return cEqualsSignKeyword_2_0; }

		//value=EInt
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }

		//EInt
		public RuleCall getValueEIntParserRuleCall_2_1_0() { return cValueEIntParserRuleCall_2_1_0; }
	}

	public class EDROOMDataDefinitionUnionElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinitionUnionElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEDROOMDataDefinitionUnionElementBasicParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEDROOMDataDefinitionUnionElementBasicArrayParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEDROOMDataDefinitionUnionElementClassParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cEDROOMDataDefinitionUnionElementClassArrayParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cEDROOMDataDefinitionUnionElementUnionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cEDROOMDataDefinitionUnionElementUnionArrayParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cEDROOMDataDefinitionUnionElementEnumParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cEDROOMDataDefinitionUnionElementEnumArrayParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);

		//EDROOMDataDefinitionUnionElement:
		//	EDROOMDataDefinitionUnionElementBasic | EDROOMDataDefinitionUnionElementBasicArray |
		//	EDROOMDataDefinitionUnionElementClass | EDROOMDataDefinitionUnionElementClassArray |
		//	EDROOMDataDefinitionUnionElementUnion | EDROOMDataDefinitionUnionElementUnionArray |
		//	EDROOMDataDefinitionUnionElementEnum | EDROOMDataDefinitionUnionElementEnumArray;
		public ParserRule getRule() { return rule; }

		//EDROOMDataDefinitionUnionElementBasic | EDROOMDataDefinitionUnionElementBasicArray |
		//EDROOMDataDefinitionUnionElementClass | EDROOMDataDefinitionUnionElementClassArray |
		//EDROOMDataDefinitionUnionElementUnion | EDROOMDataDefinitionUnionElementUnionArray |
		//EDROOMDataDefinitionUnionElementEnum | EDROOMDataDefinitionUnionElementEnumArray
		public Alternatives getAlternatives() { return cAlternatives; }

		//EDROOMDataDefinitionUnionElementBasic
		public RuleCall getEDROOMDataDefinitionUnionElementBasicParserRuleCall_0() { return cEDROOMDataDefinitionUnionElementBasicParserRuleCall_0; }

		//EDROOMDataDefinitionUnionElementBasicArray
		public RuleCall getEDROOMDataDefinitionUnionElementBasicArrayParserRuleCall_1() { return cEDROOMDataDefinitionUnionElementBasicArrayParserRuleCall_1; }

		//EDROOMDataDefinitionUnionElementClass
		public RuleCall getEDROOMDataDefinitionUnionElementClassParserRuleCall_2() { return cEDROOMDataDefinitionUnionElementClassParserRuleCall_2; }

		//EDROOMDataDefinitionUnionElementClassArray
		public RuleCall getEDROOMDataDefinitionUnionElementClassArrayParserRuleCall_3() { return cEDROOMDataDefinitionUnionElementClassArrayParserRuleCall_3; }

		//EDROOMDataDefinitionUnionElementUnion
		public RuleCall getEDROOMDataDefinitionUnionElementUnionParserRuleCall_4() { return cEDROOMDataDefinitionUnionElementUnionParserRuleCall_4; }

		//EDROOMDataDefinitionUnionElementUnionArray
		public RuleCall getEDROOMDataDefinitionUnionElementUnionArrayParserRuleCall_5() { return cEDROOMDataDefinitionUnionElementUnionArrayParserRuleCall_5; }

		//EDROOMDataDefinitionUnionElementEnum
		public RuleCall getEDROOMDataDefinitionUnionElementEnumParserRuleCall_6() { return cEDROOMDataDefinitionUnionElementEnumParserRuleCall_6; }

		//EDROOMDataDefinitionUnionElementEnumArray
		public RuleCall getEDROOMDataDefinitionUnionElementEnumArrayParserRuleCall_7() { return cEDROOMDataDefinitionUnionElementEnumArrayParserRuleCall_7; }
	}

	public class EDROOMDataDefinitionUnionElementBasicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinitionUnionElementBasic");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataDefinitionUnionElementBasicAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeEDROOMBasicTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);

		//EDROOMDataDefinitionUnionElementBasic:
		//	{EDROOMDataDefinitionUnionElementBasic} type=EDROOMBasicType name=ID ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataDefinitionUnionElementBasic} type=EDROOMBasicType name=ID ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataDefinitionUnionElementBasic}
		public Action getEDROOMDataDefinitionUnionElementBasicAction_0() { return cEDROOMDataDefinitionUnionElementBasicAction_0; }

		//type=EDROOMBasicType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//EDROOMBasicType
		public RuleCall getTypeEDROOMBasicTypeEnumRuleCall_1_0() { return cTypeEDROOMBasicTypeEnumRuleCall_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class EDROOMDataDefinitionUnionElementBasicArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinitionUnionElementBasicArray");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataDefinitionUnionElementBasicArrayAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeEDROOMBasicTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsEIntParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);

		//EDROOMDataDefinitionUnionElementBasicArray:
		//	{EDROOMDataDefinitionUnionElementBasicArray} type=EDROOMBasicType name=ID "[" elements=EInt "]" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataDefinitionUnionElementBasicArray} type=EDROOMBasicType name=ID "[" elements=EInt "]" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataDefinitionUnionElementBasicArray}
		public Action getEDROOMDataDefinitionUnionElementBasicArrayAction_0() { return cEDROOMDataDefinitionUnionElementBasicArrayAction_0; }

		//type=EDROOMBasicType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//EDROOMBasicType
		public RuleCall getTypeEDROOMBasicTypeEnumRuleCall_1_0() { return cTypeEDROOMBasicTypeEnumRuleCall_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }

		//elements=EInt
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }

		//EInt
		public RuleCall getElementsEIntParserRuleCall_4_0() { return cElementsEIntParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class EDROOMDataDefinitionUnionElementClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinitionUnionElementClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataDefinitionUnionElementClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeEDROOMDataClassCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeEDROOMDataClassIDTerminalRuleCall_1_0_1 = (RuleCall)cTypeEDROOMDataClassCrossReference_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);

		//EDROOMDataDefinitionUnionElementClass:
		//	{EDROOMDataDefinitionUnionElementClass} type=[EDROOMDataClass] name=ID ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataDefinitionUnionElementClass} type=[EDROOMDataClass] name=ID ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataDefinitionUnionElementClass}
		public Action getEDROOMDataDefinitionUnionElementClassAction_0() { return cEDROOMDataDefinitionUnionElementClassAction_0; }

		//type=[EDROOMDataClass]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//[EDROOMDataClass]
		public CrossReference getTypeEDROOMDataClassCrossReference_1_0() { return cTypeEDROOMDataClassCrossReference_1_0; }

		//ID
		public RuleCall getTypeEDROOMDataClassIDTerminalRuleCall_1_0_1() { return cTypeEDROOMDataClassIDTerminalRuleCall_1_0_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class EDROOMDataDefinitionUnionElementClassArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinitionUnionElementClassArray");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataDefinitionUnionElementClassArrayAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeEDROOMDataClassCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeEDROOMDataClassIDTerminalRuleCall_1_0_1 = (RuleCall)cTypeEDROOMDataClassCrossReference_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsEIntParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);

		//EDROOMDataDefinitionUnionElementClassArray:
		//	{EDROOMDataDefinitionUnionElementClassArray} type=[EDROOMDataClass] name=ID "[" elements=EInt "]" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataDefinitionUnionElementClassArray} type=[EDROOMDataClass] name=ID "[" elements=EInt "]" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataDefinitionUnionElementClassArray}
		public Action getEDROOMDataDefinitionUnionElementClassArrayAction_0() { return cEDROOMDataDefinitionUnionElementClassArrayAction_0; }

		//type=[EDROOMDataClass]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//[EDROOMDataClass]
		public CrossReference getTypeEDROOMDataClassCrossReference_1_0() { return cTypeEDROOMDataClassCrossReference_1_0; }

		//ID
		public RuleCall getTypeEDROOMDataClassIDTerminalRuleCall_1_0_1() { return cTypeEDROOMDataClassIDTerminalRuleCall_1_0_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }

		//elements=EInt
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }

		//EInt
		public RuleCall getElementsEIntParserRuleCall_4_0() { return cElementsEIntParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class EDROOMDataDefinitionUnionElementUnionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinitionUnionElementUnion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataDefinitionUnionElementUnionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUnionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeEDROOMDataDefinitionUnionCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEDROOMDataDefinitionUnionVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cTypeEDROOMDataDefinitionUnionCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);

		//EDROOMDataDefinitionUnionElementUnion:
		//	{EDROOMDataDefinitionUnionElementUnion} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
		//	name=ID ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataDefinitionUnionElementUnion} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName] name=ID
		//";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataDefinitionUnionElementUnion}
		public Action getEDROOMDataDefinitionUnionElementUnionAction_0() { return cEDROOMDataDefinitionUnionElementUnionAction_0; }

		//"union"
		public Keyword getUnionKeyword_1() { return cUnionKeyword_1; }

		//type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
		public CrossReference getTypeEDROOMDataDefinitionUnionCrossReference_2_0() { return cTypeEDROOMDataDefinitionUnionCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeEDROOMDataDefinitionUnionVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cTypeEDROOMDataDefinitionUnionVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class EDROOMDataDefinitionUnionElementUnionArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinitionUnionElementUnionArray");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataDefinitionUnionElementUnionArrayAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUnionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeEDROOMDataDefinitionUnionCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEDROOMDataDefinitionUnionVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cTypeEDROOMDataDefinitionUnionCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cElementsEIntParserRuleCall_5_0 = (RuleCall)cElementsAssignment_5.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);

		//EDROOMDataDefinitionUnionElementUnionArray:
		//	{EDROOMDataDefinitionUnionElementUnionArray} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
		//	name=ID "[" elements=EInt "]" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataDefinitionUnionElementUnionArray} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
		//name=ID "[" elements=EInt "]" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataDefinitionUnionElementUnionArray}
		public Action getEDROOMDataDefinitionUnionElementUnionArrayAction_0() { return cEDROOMDataDefinitionUnionElementUnionArrayAction_0; }

		//"union"
		public Keyword getUnionKeyword_1() { return cUnionKeyword_1; }

		//type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
		public CrossReference getTypeEDROOMDataDefinitionUnionCrossReference_2_0() { return cTypeEDROOMDataDefinitionUnionCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeEDROOMDataDefinitionUnionVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cTypeEDROOMDataDefinitionUnionVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_4() { return cLeftSquareBracketKeyword_4; }

		//elements=EInt
		public Assignment getElementsAssignment_5() { return cElementsAssignment_5; }

		//EInt
		public RuleCall getElementsEIntParserRuleCall_5_0() { return cElementsEIntParserRuleCall_5_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_6() { return cRightSquareBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class EDROOMDataDefinitionUnionElementEnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinitionUnionElementEnum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataDefinitionUnionElementEnumAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUnionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeEDROOMDataDefinitionEnumCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEDROOMDataDefinitionEnumVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cTypeEDROOMDataDefinitionEnumCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);

		//EDROOMDataDefinitionUnionElementEnum:
		//	{EDROOMDataDefinitionUnionElementEnum} "union" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID
		//	";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataDefinitionUnionElementEnum} "union" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID
		//";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataDefinitionUnionElementEnum}
		public Action getEDROOMDataDefinitionUnionElementEnumAction_0() { return cEDROOMDataDefinitionUnionElementEnumAction_0; }

		//"union"
		public Keyword getUnionKeyword_1() { return cUnionKeyword_1; }

		//type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
		public CrossReference getTypeEDROOMDataDefinitionEnumCrossReference_2_0() { return cTypeEDROOMDataDefinitionEnumCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeEDROOMDataDefinitionEnumVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cTypeEDROOMDataDefinitionEnumVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class EDROOMDataDefinitionUnionElementEnumArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataDefinitionUnionElementEnumArray");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataDefinitionUnionElementEnumArrayAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUnionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeEDROOMDataDefinitionEnumCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEDROOMDataDefinitionEnumVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cTypeEDROOMDataDefinitionEnumCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cElementsEIntParserRuleCall_5_0 = (RuleCall)cElementsAssignment_5.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);

		//EDROOMDataDefinitionUnionElementEnumArray:
		//	{EDROOMDataDefinitionUnionElementEnumArray} "union" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
		//	name=ID "[" elements=EInt "]" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataDefinitionUnionElementEnumArray} "union" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
		//name=ID "[" elements=EInt "]" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataDefinitionUnionElementEnumArray}
		public Action getEDROOMDataDefinitionUnionElementEnumArrayAction_0() { return cEDROOMDataDefinitionUnionElementEnumArrayAction_0; }

		//"union"
		public Keyword getUnionKeyword_1() { return cUnionKeyword_1; }

		//type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
		public CrossReference getTypeEDROOMDataDefinitionEnumCrossReference_2_0() { return cTypeEDROOMDataDefinitionEnumCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeEDROOMDataDefinitionEnumVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cTypeEDROOMDataDefinitionEnumVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_4() { return cLeftSquareBracketKeyword_4; }

		//elements=EInt
		public Assignment getElementsAssignment_5() { return cElementsAssignment_5; }

		//EInt
		public RuleCall getElementsEIntParserRuleCall_5_0() { return cElementsEIntParserRuleCall_5_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_6() { return cRightSquareBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class EDROOMDataFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataField");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEDROOMDataFieldBasicParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEDROOMDataFieldBasicArrayParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEDROOMDataFieldClassParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cEDROOMDataFieldClassArrayParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cEDROOMDataFieldUnionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cEDROOMDataFieldUnionArrayParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cEDROOMDataFieldEnumParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cEDROOMDataFieldEnumArrayParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);

		//EDROOMDataField:
		//	EDROOMDataFieldBasic | EDROOMDataFieldBasicArray | EDROOMDataFieldClass | EDROOMDataFieldClassArray |
		//	EDROOMDataFieldUnion | EDROOMDataFieldUnionArray | EDROOMDataFieldEnum | EDROOMDataFieldEnumArray;
		public ParserRule getRule() { return rule; }

		//EDROOMDataFieldBasic | EDROOMDataFieldBasicArray | EDROOMDataFieldClass | EDROOMDataFieldClassArray |
		//EDROOMDataFieldUnion | EDROOMDataFieldUnionArray | EDROOMDataFieldEnum | EDROOMDataFieldEnumArray
		public Alternatives getAlternatives() { return cAlternatives; }

		//EDROOMDataFieldBasic
		public RuleCall getEDROOMDataFieldBasicParserRuleCall_0() { return cEDROOMDataFieldBasicParserRuleCall_0; }

		//EDROOMDataFieldBasicArray
		public RuleCall getEDROOMDataFieldBasicArrayParserRuleCall_1() { return cEDROOMDataFieldBasicArrayParserRuleCall_1; }

		//EDROOMDataFieldClass
		public RuleCall getEDROOMDataFieldClassParserRuleCall_2() { return cEDROOMDataFieldClassParserRuleCall_2; }

		//EDROOMDataFieldClassArray
		public RuleCall getEDROOMDataFieldClassArrayParserRuleCall_3() { return cEDROOMDataFieldClassArrayParserRuleCall_3; }

		//EDROOMDataFieldUnion
		public RuleCall getEDROOMDataFieldUnionParserRuleCall_4() { return cEDROOMDataFieldUnionParserRuleCall_4; }

		//EDROOMDataFieldUnionArray
		public RuleCall getEDROOMDataFieldUnionArrayParserRuleCall_5() { return cEDROOMDataFieldUnionArrayParserRuleCall_5; }

		//EDROOMDataFieldEnum
		public RuleCall getEDROOMDataFieldEnumParserRuleCall_6() { return cEDROOMDataFieldEnumParserRuleCall_6; }

		//EDROOMDataFieldEnumArray
		public RuleCall getEDROOMDataFieldEnumArrayParserRuleCall_7() { return cEDROOMDataFieldEnumArrayParserRuleCall_7; }
	}

	public class EDROOMDataFieldBasicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataFieldBasic");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataFieldBasicAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeEDROOMBasicTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);

		//EDROOMDataFieldBasic:
		//	{EDROOMDataFieldBasic} type=EDROOMBasicType name=ID ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataFieldBasic} type=EDROOMBasicType name=ID ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataFieldBasic}
		public Action getEDROOMDataFieldBasicAction_0() { return cEDROOMDataFieldBasicAction_0; }

		//type=EDROOMBasicType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//EDROOMBasicType
		public RuleCall getTypeEDROOMBasicTypeEnumRuleCall_1_0() { return cTypeEDROOMBasicTypeEnumRuleCall_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class EDROOMDataFieldBasicArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataFieldBasicArray");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataFieldBasicArrayAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeEDROOMBasicTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsEIntParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);

		//EDROOMDataFieldBasicArray:
		//	{EDROOMDataFieldBasicArray} type=EDROOMBasicType name=ID "[" elements=EInt "]" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataFieldBasicArray} type=EDROOMBasicType name=ID "[" elements=EInt "]" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataFieldBasicArray}
		public Action getEDROOMDataFieldBasicArrayAction_0() { return cEDROOMDataFieldBasicArrayAction_0; }

		//type=EDROOMBasicType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//EDROOMBasicType
		public RuleCall getTypeEDROOMBasicTypeEnumRuleCall_1_0() { return cTypeEDROOMBasicTypeEnumRuleCall_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }

		//elements=EInt
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }

		//EInt
		public RuleCall getElementsEIntParserRuleCall_4_0() { return cElementsEIntParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class EDROOMDataFieldClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataFieldClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataFieldClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeEDROOMDataClassCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeEDROOMDataClassVersionedQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cTypeEDROOMDataClassCrossReference_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);

		//EDROOMDataFieldClass:
		//	{EDROOMDataFieldClass} type=[EDROOMDataClass|VersionedQualifiedName] name=ID ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataFieldClass} type=[EDROOMDataClass|VersionedQualifiedName] name=ID ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataFieldClass}
		public Action getEDROOMDataFieldClassAction_0() { return cEDROOMDataFieldClassAction_0; }

		//type=[EDROOMDataClass|VersionedQualifiedName]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//[EDROOMDataClass|VersionedQualifiedName]
		public CrossReference getTypeEDROOMDataClassCrossReference_1_0() { return cTypeEDROOMDataClassCrossReference_1_0; }

		//VersionedQualifiedName
		public RuleCall getTypeEDROOMDataClassVersionedQualifiedNameParserRuleCall_1_0_1() { return cTypeEDROOMDataClassVersionedQualifiedNameParserRuleCall_1_0_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class EDROOMDataFieldClassArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataFieldClassArray");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataFieldClassArrayAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTypeEDROOMDataClassCrossReference_1_0 = (CrossReference)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeEDROOMDataClassVersionedQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cTypeEDROOMDataClassCrossReference_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsEIntParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);

		//EDROOMDataFieldClassArray:
		//	{EDROOMDataFieldClassArray} type=[EDROOMDataClass|VersionedQualifiedName] name=ID "[" elements=EInt "]" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataFieldClassArray} type=[EDROOMDataClass|VersionedQualifiedName] name=ID "[" elements=EInt "]" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataFieldClassArray}
		public Action getEDROOMDataFieldClassArrayAction_0() { return cEDROOMDataFieldClassArrayAction_0; }

		//type=[EDROOMDataClass|VersionedQualifiedName]
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//[EDROOMDataClass|VersionedQualifiedName]
		public CrossReference getTypeEDROOMDataClassCrossReference_1_0() { return cTypeEDROOMDataClassCrossReference_1_0; }

		//VersionedQualifiedName
		public RuleCall getTypeEDROOMDataClassVersionedQualifiedNameParserRuleCall_1_0_1() { return cTypeEDROOMDataClassVersionedQualifiedNameParserRuleCall_1_0_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }

		//elements=EInt
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }

		//EInt
		public RuleCall getElementsEIntParserRuleCall_4_0() { return cElementsEIntParserRuleCall_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}

	public class EDROOMDataFieldUnionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataFieldUnion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataFieldUnionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUnionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeEDROOMDataDefinitionUnionCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEDROOMDataDefinitionUnionVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cTypeEDROOMDataDefinitionUnionCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);

		//EDROOMDataFieldUnion:
		//	{EDROOMDataFieldUnion} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName] name=ID ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataFieldUnion} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName] name=ID ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataFieldUnion}
		public Action getEDROOMDataFieldUnionAction_0() { return cEDROOMDataFieldUnionAction_0; }

		//"union"
		public Keyword getUnionKeyword_1() { return cUnionKeyword_1; }

		//type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
		public CrossReference getTypeEDROOMDataDefinitionUnionCrossReference_2_0() { return cTypeEDROOMDataDefinitionUnionCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeEDROOMDataDefinitionUnionVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cTypeEDROOMDataDefinitionUnionVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class EDROOMDataFieldUnionArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataFieldUnionArray");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataFieldUnionArrayAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUnionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeEDROOMDataDefinitionUnionCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEDROOMDataDefinitionUnionVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cTypeEDROOMDataDefinitionUnionCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cElementsEIntParserRuleCall_5_0 = (RuleCall)cElementsAssignment_5.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);

		//EDROOMDataFieldUnionArray:
		//	{EDROOMDataFieldUnionArray} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName] name=ID "["
		//	elements=EInt "]" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataFieldUnionArray} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName] name=ID "["
		//elements=EInt "]" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataFieldUnionArray}
		public Action getEDROOMDataFieldUnionArrayAction_0() { return cEDROOMDataFieldUnionArrayAction_0; }

		//"union"
		public Keyword getUnionKeyword_1() { return cUnionKeyword_1; }

		//type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
		public CrossReference getTypeEDROOMDataDefinitionUnionCrossReference_2_0() { return cTypeEDROOMDataDefinitionUnionCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeEDROOMDataDefinitionUnionVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cTypeEDROOMDataDefinitionUnionVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_4() { return cLeftSquareBracketKeyword_4; }

		//elements=EInt
		public Assignment getElementsAssignment_5() { return cElementsAssignment_5; }

		//EInt
		public RuleCall getElementsEIntParserRuleCall_5_0() { return cElementsEIntParserRuleCall_5_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_6() { return cRightSquareBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class EDROOMDataFieldEnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataFieldEnum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataFieldEnumAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEnumKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeEDROOMDataDefinitionEnumCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEDROOMDataDefinitionEnumVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cTypeEDROOMDataDefinitionEnumCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);

		//EDROOMDataFieldEnum:
		//	{EDROOMDataFieldEnum} "enum" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataFieldEnum} "enum" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataFieldEnum}
		public Action getEDROOMDataFieldEnumAction_0() { return cEDROOMDataFieldEnumAction_0; }

		//"enum"
		public Keyword getEnumKeyword_1() { return cEnumKeyword_1; }

		//type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
		public CrossReference getTypeEDROOMDataDefinitionEnumCrossReference_2_0() { return cTypeEDROOMDataDefinitionEnumCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeEDROOMDataDefinitionEnumVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cTypeEDROOMDataDefinitionEnumVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class EDROOMDataFieldEnumArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMDataFieldEnumArray");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEDROOMDataFieldEnumArrayAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEnumKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeEDROOMDataDefinitionEnumCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEDROOMDataDefinitionEnumVersionedQualifiedReferenceNameParserRuleCall_2_0_1 = (RuleCall)cTypeEDROOMDataDefinitionEnumCrossReference_2_0.eContents().get(1);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cElementsEIntParserRuleCall_5_0 = (RuleCall)cElementsAssignment_5.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);

		//EDROOMDataFieldEnumArray:
		//	{EDROOMDataFieldEnumArray} "enum" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID "["
		//	elements=EInt "]" ";";
		public ParserRule getRule() { return rule; }

		//{EDROOMDataFieldEnumArray} "enum" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID "["
		//elements=EInt "]" ";"
		public Group getGroup() { return cGroup; }

		//{EDROOMDataFieldEnumArray}
		public Action getEDROOMDataFieldEnumArrayAction_0() { return cEDROOMDataFieldEnumArrayAction_0; }

		//"enum"
		public Keyword getEnumKeyword_1() { return cEnumKeyword_1; }

		//type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
		public CrossReference getTypeEDROOMDataDefinitionEnumCrossReference_2_0() { return cTypeEDROOMDataDefinitionEnumCrossReference_2_0; }

		//VersionedQualifiedReferenceName
		public RuleCall getTypeEDROOMDataDefinitionEnumVersionedQualifiedReferenceNameParserRuleCall_2_0_1() { return cTypeEDROOMDataDefinitionEnumVersionedQualifiedReferenceNameParserRuleCall_2_0_1; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_4() { return cLeftSquareBracketKeyword_4; }

		//elements=EInt
		public Assignment getElementsAssignment_5() { return cElementsAssignment_5; }

		//EInt
		public RuleCall getElementsEIntParserRuleCall_5_0() { return cElementsEIntParserRuleCall_5_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_6() { return cRightSquareBracketKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}


	public class EDROOMBasicTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "EDROOMBasicType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTEDROOMBoolEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTEDROOMBoolTEDROOMBoolKeyword_0_0 = (Keyword)cTEDROOMBoolEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMByteEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cTEDROOMByteTEDROOMByteKeyword_1_0 = (Keyword)cTEDROOMByteEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMDoubleEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cTEDROOMDoubleTEDROOMDoubleKeyword_2_0 = (Keyword)cTEDROOMDoubleEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMFloatEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cTEDROOMFloatTEDROOMFloatKeyword_3_0 = (Keyword)cTEDROOMFloatEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMInt16EnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cTEDROOMInt16TEDROOMInt16Keyword_4_0 = (Keyword)cTEDROOMInt16EnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMInt32EnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cTEDROOMInt32TEDROOMInt32Keyword_5_0 = (Keyword)cTEDROOMInt32EnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMInt64EnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cTEDROOMInt64TEDROOMInt64Keyword_6_0 = (Keyword)cTEDROOMInt64EnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMInt8EnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cTEDROOMInt8TEDROOMInt8Keyword_7_0 = (Keyword)cTEDROOMInt8EnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMUInt16EnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cTEDROOMUInt16TEDROOMUInt16Keyword_8_0 = (Keyword)cTEDROOMUInt16EnumLiteralDeclaration_8.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMUInt32EnumLiteralDeclaration_9 = (EnumLiteralDeclaration)cAlternatives.eContents().get(9);
		private final Keyword cTEDROOMUInt32TEDROOMUInt32Keyword_9_0 = (Keyword)cTEDROOMUInt32EnumLiteralDeclaration_9.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMUInt64EnumLiteralDeclaration_10 = (EnumLiteralDeclaration)cAlternatives.eContents().get(10);
		private final Keyword cTEDROOMUInt64TEDROOMUInt64Keyword_10_0 = (Keyword)cTEDROOMUInt64EnumLiteralDeclaration_10.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMUInt8EnumLiteralDeclaration_11 = (EnumLiteralDeclaration)cAlternatives.eContents().get(11);
		private final Keyword cTEDROOMUInt8TEDROOMUInt8Keyword_11_0 = (Keyword)cTEDROOMUInt8EnumLiteralDeclaration_11.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMWord16EnumLiteralDeclaration_12 = (EnumLiteralDeclaration)cAlternatives.eContents().get(12);
		private final Keyword cTEDROOMWord16TEDROOMWord16Keyword_12_0 = (Keyword)cTEDROOMWord16EnumLiteralDeclaration_12.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMWord32EnumLiteralDeclaration_13 = (EnumLiteralDeclaration)cAlternatives.eContents().get(13);
		private final Keyword cTEDROOMWord32TEDROOMWord32Keyword_13_0 = (Keyword)cTEDROOMWord32EnumLiteralDeclaration_13.eContents().get(0);
		private final EnumLiteralDeclaration cTEDROOMWord64EnumLiteralDeclaration_14 = (EnumLiteralDeclaration)cAlternatives.eContents().get(14);
		private final Keyword cTEDROOMWord64TEDROOMWord64Keyword_14_0 = (Keyword)cTEDROOMWord64EnumLiteralDeclaration_14.eContents().get(0);

		//enum EDROOMBasicType:
		//	TEDROOMBool | TEDROOMByte | TEDROOMDouble | TEDROOMFloat | TEDROOMInt16 | TEDROOMInt32 | TEDROOMInt64 | TEDROOMInt8 |
		//	TEDROOMUInt16 | TEDROOMUInt32 | TEDROOMUInt64 | TEDROOMUInt8 | TEDROOMWord16 | TEDROOMWord32 | TEDROOMWord64;
		public EnumRule getRule() { return rule; }

		//TEDROOMBool | TEDROOMByte | TEDROOMDouble | TEDROOMFloat | TEDROOMInt16 | TEDROOMInt32 | TEDROOMInt64 | TEDROOMInt8 |
		//TEDROOMUInt16 | TEDROOMUInt32 | TEDROOMUInt64 | TEDROOMUInt8 | TEDROOMWord16 | TEDROOMWord32 | TEDROOMWord64
		public Alternatives getAlternatives() { return cAlternatives; }

		//TEDROOMBool
		public EnumLiteralDeclaration getTEDROOMBoolEnumLiteralDeclaration_0() { return cTEDROOMBoolEnumLiteralDeclaration_0; }

		//"TEDROOMBool"
		public Keyword getTEDROOMBoolTEDROOMBoolKeyword_0_0() { return cTEDROOMBoolTEDROOMBoolKeyword_0_0; }

		//TEDROOMByte
		public EnumLiteralDeclaration getTEDROOMByteEnumLiteralDeclaration_1() { return cTEDROOMByteEnumLiteralDeclaration_1; }

		//"TEDROOMByte"
		public Keyword getTEDROOMByteTEDROOMByteKeyword_1_0() { return cTEDROOMByteTEDROOMByteKeyword_1_0; }

		//TEDROOMDouble
		public EnumLiteralDeclaration getTEDROOMDoubleEnumLiteralDeclaration_2() { return cTEDROOMDoubleEnumLiteralDeclaration_2; }

		//"TEDROOMDouble"
		public Keyword getTEDROOMDoubleTEDROOMDoubleKeyword_2_0() { return cTEDROOMDoubleTEDROOMDoubleKeyword_2_0; }

		//TEDROOMFloat
		public EnumLiteralDeclaration getTEDROOMFloatEnumLiteralDeclaration_3() { return cTEDROOMFloatEnumLiteralDeclaration_3; }

		//"TEDROOMFloat"
		public Keyword getTEDROOMFloatTEDROOMFloatKeyword_3_0() { return cTEDROOMFloatTEDROOMFloatKeyword_3_0; }

		//TEDROOMInt16
		public EnumLiteralDeclaration getTEDROOMInt16EnumLiteralDeclaration_4() { return cTEDROOMInt16EnumLiteralDeclaration_4; }

		//"TEDROOMInt16"
		public Keyword getTEDROOMInt16TEDROOMInt16Keyword_4_0() { return cTEDROOMInt16TEDROOMInt16Keyword_4_0; }

		//TEDROOMInt32
		public EnumLiteralDeclaration getTEDROOMInt32EnumLiteralDeclaration_5() { return cTEDROOMInt32EnumLiteralDeclaration_5; }

		//"TEDROOMInt32"
		public Keyword getTEDROOMInt32TEDROOMInt32Keyword_5_0() { return cTEDROOMInt32TEDROOMInt32Keyword_5_0; }

		//TEDROOMInt64
		public EnumLiteralDeclaration getTEDROOMInt64EnumLiteralDeclaration_6() { return cTEDROOMInt64EnumLiteralDeclaration_6; }

		//"TEDROOMInt64"
		public Keyword getTEDROOMInt64TEDROOMInt64Keyword_6_0() { return cTEDROOMInt64TEDROOMInt64Keyword_6_0; }

		//TEDROOMInt8
		public EnumLiteralDeclaration getTEDROOMInt8EnumLiteralDeclaration_7() { return cTEDROOMInt8EnumLiteralDeclaration_7; }

		//"TEDROOMInt8"
		public Keyword getTEDROOMInt8TEDROOMInt8Keyword_7_0() { return cTEDROOMInt8TEDROOMInt8Keyword_7_0; }

		//TEDROOMUInt16
		public EnumLiteralDeclaration getTEDROOMUInt16EnumLiteralDeclaration_8() { return cTEDROOMUInt16EnumLiteralDeclaration_8; }

		//"TEDROOMUInt16"
		public Keyword getTEDROOMUInt16TEDROOMUInt16Keyword_8_0() { return cTEDROOMUInt16TEDROOMUInt16Keyword_8_0; }

		//TEDROOMUInt32
		public EnumLiteralDeclaration getTEDROOMUInt32EnumLiteralDeclaration_9() { return cTEDROOMUInt32EnumLiteralDeclaration_9; }

		//"TEDROOMUInt32"
		public Keyword getTEDROOMUInt32TEDROOMUInt32Keyword_9_0() { return cTEDROOMUInt32TEDROOMUInt32Keyword_9_0; }

		//TEDROOMUInt64
		public EnumLiteralDeclaration getTEDROOMUInt64EnumLiteralDeclaration_10() { return cTEDROOMUInt64EnumLiteralDeclaration_10; }

		//"TEDROOMUInt64"
		public Keyword getTEDROOMUInt64TEDROOMUInt64Keyword_10_0() { return cTEDROOMUInt64TEDROOMUInt64Keyword_10_0; }

		//TEDROOMUInt8
		public EnumLiteralDeclaration getTEDROOMUInt8EnumLiteralDeclaration_11() { return cTEDROOMUInt8EnumLiteralDeclaration_11; }

		//"TEDROOMUInt8"
		public Keyword getTEDROOMUInt8TEDROOMUInt8Keyword_11_0() { return cTEDROOMUInt8TEDROOMUInt8Keyword_11_0; }

		//TEDROOMWord16
		public EnumLiteralDeclaration getTEDROOMWord16EnumLiteralDeclaration_12() { return cTEDROOMWord16EnumLiteralDeclaration_12; }

		//"TEDROOMWord16"
		public Keyword getTEDROOMWord16TEDROOMWord16Keyword_12_0() { return cTEDROOMWord16TEDROOMWord16Keyword_12_0; }

		//TEDROOMWord32
		public EnumLiteralDeclaration getTEDROOMWord32EnumLiteralDeclaration_13() { return cTEDROOMWord32EnumLiteralDeclaration_13; }

		//"TEDROOMWord32"
		public Keyword getTEDROOMWord32TEDROOMWord32Keyword_13_0() { return cTEDROOMWord32TEDROOMWord32Keyword_13_0; }

		//TEDROOMWord64
		public EnumLiteralDeclaration getTEDROOMWord64EnumLiteralDeclaration_14() { return cTEDROOMWord64EnumLiteralDeclaration_14; }

		//"TEDROOMWord64"
		public Keyword getTEDROOMWord64TEDROOMWord64Keyword_14_0() { return cTEDROOMWord64TEDROOMWord64Keyword_14_0; }
	}

	private EDROOMDCLASSPackageFileElements pEDROOMDCLASSPackageFile;
	private EIntElements pEInt;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionedQualifiedNameElements pVersionedQualifiedName;
	private VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private EDROOMDCLASSPackageElementElements pEDROOMDCLASSPackageElement;
	private EDROOMDataClassElements pEDROOMDataClass;
	private EDROOMDataDefinitionElements pEDROOMDataDefinition;
	private EDROOMDataDefinitionUnionElements pEDROOMDataDefinitionUnion;
	private EDROOMDataDefinitionEnumElements pEDROOMDataDefinitionEnum;
	private EDROOMDataDefinitionEnumElementElements pEDROOMDataDefinitionEnumElement;
	private EDROOMDataDefinitionUnionElementElements pEDROOMDataDefinitionUnionElement;
	private EDROOMDataDefinitionUnionElementBasicElements pEDROOMDataDefinitionUnionElementBasic;
	private EDROOMDataDefinitionUnionElementBasicArrayElements pEDROOMDataDefinitionUnionElementBasicArray;
	private EDROOMDataDefinitionUnionElementClassElements pEDROOMDataDefinitionUnionElementClass;
	private EDROOMDataDefinitionUnionElementClassArrayElements pEDROOMDataDefinitionUnionElementClassArray;
	private EDROOMDataDefinitionUnionElementUnionElements pEDROOMDataDefinitionUnionElementUnion;
	private EDROOMDataDefinitionUnionElementUnionArrayElements pEDROOMDataDefinitionUnionElementUnionArray;
	private EDROOMDataDefinitionUnionElementEnumElements pEDROOMDataDefinitionUnionElementEnum;
	private EDROOMDataDefinitionUnionElementEnumArrayElements pEDROOMDataDefinitionUnionElementEnumArray;
	private EDROOMDataFieldElements pEDROOMDataField;
	private EDROOMDataFieldBasicElements pEDROOMDataFieldBasic;
	private EDROOMDataFieldBasicArrayElements pEDROOMDataFieldBasicArray;
	private EDROOMDataFieldClassElements pEDROOMDataFieldClass;
	private EDROOMDataFieldClassArrayElements pEDROOMDataFieldClassArray;
	private EDROOMDataFieldUnionElements pEDROOMDataFieldUnion;
	private EDROOMDataFieldUnionArrayElements pEDROOMDataFieldUnionArray;
	private EDROOMDataFieldEnumElements pEDROOMDataFieldEnum;
	private EDROOMDataFieldEnumArrayElements pEDROOMDataFieldEnumArray;
	private EDROOMBasicTypeElements unknownRuleEDROOMBasicType;

	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public DCLASSGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}

	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.micobs.mclev.domain.edroom.lang.DCLASS".equals(grammar.getName())) {
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


	//EDROOMDCLASSPackageFile:
	//	"package" package=[edroomlibrary::EDROOMPackage|QualifiedName] ";" ("import"
	//	imports+=[edroomlibrary::EDROOMPackage|QualifiedName] ";")* element=EDROOMDCLASSPackageElement;
	public EDROOMDCLASSPackageFileElements getEDROOMDCLASSPackageFileAccess() {
		return (pEDROOMDCLASSPackageFile != null) ? pEDROOMDCLASSPackageFile : (pEDROOMDCLASSPackageFile = new EDROOMDCLASSPackageFileElements());
	}

	public ParserRule getEDROOMDCLASSPackageFileRule() {
		return getEDROOMDCLASSPackageFileAccess().getRule();
	}

	//EInt returns ecore::EInt:
	//	INT;
	public EIntElements getEIntAccess() {
		return (pEInt != null) ? pEInt : (pEInt = new EIntElements());
	}

	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
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

	//EDROOMDCLASSPackageElement:
	//	EDROOMDataClass;
	public EDROOMDCLASSPackageElementElements getEDROOMDCLASSPackageElementAccess() {
		return (pEDROOMDCLASSPackageElement != null) ? pEDROOMDCLASSPackageElement : (pEDROOMDCLASSPackageElement = new EDROOMDCLASSPackageElementElements());
	}

	public ParserRule getEDROOMDCLASSPackageElementRule() {
		return getEDROOMDCLASSPackageElementAccess().getRule();
	}

	//EDROOMDataClass:
	//	{EDROOMDataClass} "dataclass" name=ID ("inherits" inherits+=[EDROOMDataClass|VersionedQualifiedName] (","
	//	inherits+=[EDROOMDataClass|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" &
	//	(definitions+=EDROOMDataDefinition | fields+=EDROOMDataField)*) "}" ";";
	public EDROOMDataClassElements getEDROOMDataClassAccess() {
		return (pEDROOMDataClass != null) ? pEDROOMDataClass : (pEDROOMDataClass = new EDROOMDataClassElements());
	}

	public ParserRule getEDROOMDataClassRule() {
		return getEDROOMDataClassAccess().getRule();
	}

	//EDROOMDataDefinition:
	//	EDROOMDataDefinitionUnion | EDROOMDataDefinitionEnum;
	public EDROOMDataDefinitionElements getEDROOMDataDefinitionAccess() {
		return (pEDROOMDataDefinition != null) ? pEDROOMDataDefinition : (pEDROOMDataDefinition = new EDROOMDataDefinitionElements());
	}

	public ParserRule getEDROOMDataDefinitionRule() {
		return getEDROOMDataDefinitionAccess().getRule();
	}

	//EDROOMDataDefinitionUnion:
	//	{EDROOMDataDefinitionUnion} "union" name=ID "{" elements+=EDROOMDataDefinitionUnionElement
	//	elements+=EDROOMDataDefinitionUnionElement elements+=EDROOMDataDefinitionUnionElement* "}" ";";
	public EDROOMDataDefinitionUnionElements getEDROOMDataDefinitionUnionAccess() {
		return (pEDROOMDataDefinitionUnion != null) ? pEDROOMDataDefinitionUnion : (pEDROOMDataDefinitionUnion = new EDROOMDataDefinitionUnionElements());
	}

	public ParserRule getEDROOMDataDefinitionUnionRule() {
		return getEDROOMDataDefinitionUnionAccess().getRule();
	}

	//EDROOMDataDefinitionEnum:
	//	{EDROOMDataDefinitionEnum} "enum" name=ID "{" elements+=EDROOMDataDefinitionEnumElement (","
	//	elements+=EDROOMDataDefinitionEnumElement)* "}" ";";
	public EDROOMDataDefinitionEnumElements getEDROOMDataDefinitionEnumAccess() {
		return (pEDROOMDataDefinitionEnum != null) ? pEDROOMDataDefinitionEnum : (pEDROOMDataDefinitionEnum = new EDROOMDataDefinitionEnumElements());
	}

	public ParserRule getEDROOMDataDefinitionEnumRule() {
		return getEDROOMDataDefinitionEnumAccess().getRule();
	}

	//EDROOMDataDefinitionEnumElement:
	//	{EDROOMDataDefinitionEnumElement} name=ID ("=" value=EInt)?;
	public EDROOMDataDefinitionEnumElementElements getEDROOMDataDefinitionEnumElementAccess() {
		return (pEDROOMDataDefinitionEnumElement != null) ? pEDROOMDataDefinitionEnumElement : (pEDROOMDataDefinitionEnumElement = new EDROOMDataDefinitionEnumElementElements());
	}

	public ParserRule getEDROOMDataDefinitionEnumElementRule() {
		return getEDROOMDataDefinitionEnumElementAccess().getRule();
	}

	//EDROOMDataDefinitionUnionElement:
	//	EDROOMDataDefinitionUnionElementBasic | EDROOMDataDefinitionUnionElementBasicArray |
	//	EDROOMDataDefinitionUnionElementClass | EDROOMDataDefinitionUnionElementClassArray |
	//	EDROOMDataDefinitionUnionElementUnion | EDROOMDataDefinitionUnionElementUnionArray |
	//	EDROOMDataDefinitionUnionElementEnum | EDROOMDataDefinitionUnionElementEnumArray;
	public EDROOMDataDefinitionUnionElementElements getEDROOMDataDefinitionUnionElementAccess() {
		return (pEDROOMDataDefinitionUnionElement != null) ? pEDROOMDataDefinitionUnionElement : (pEDROOMDataDefinitionUnionElement = new EDROOMDataDefinitionUnionElementElements());
	}

	public ParserRule getEDROOMDataDefinitionUnionElementRule() {
		return getEDROOMDataDefinitionUnionElementAccess().getRule();
	}

	//EDROOMDataDefinitionUnionElementBasic:
	//	{EDROOMDataDefinitionUnionElementBasic} type=EDROOMBasicType name=ID ";";
	public EDROOMDataDefinitionUnionElementBasicElements getEDROOMDataDefinitionUnionElementBasicAccess() {
		return (pEDROOMDataDefinitionUnionElementBasic != null) ? pEDROOMDataDefinitionUnionElementBasic : (pEDROOMDataDefinitionUnionElementBasic = new EDROOMDataDefinitionUnionElementBasicElements());
	}

	public ParserRule getEDROOMDataDefinitionUnionElementBasicRule() {
		return getEDROOMDataDefinitionUnionElementBasicAccess().getRule();
	}

	//EDROOMDataDefinitionUnionElementBasicArray:
	//	{EDROOMDataDefinitionUnionElementBasicArray} type=EDROOMBasicType name=ID "[" elements=EInt "]" ";";
	public EDROOMDataDefinitionUnionElementBasicArrayElements getEDROOMDataDefinitionUnionElementBasicArrayAccess() {
		return (pEDROOMDataDefinitionUnionElementBasicArray != null) ? pEDROOMDataDefinitionUnionElementBasicArray : (pEDROOMDataDefinitionUnionElementBasicArray = new EDROOMDataDefinitionUnionElementBasicArrayElements());
	}

	public ParserRule getEDROOMDataDefinitionUnionElementBasicArrayRule() {
		return getEDROOMDataDefinitionUnionElementBasicArrayAccess().getRule();
	}

	//EDROOMDataDefinitionUnionElementClass:
	//	{EDROOMDataDefinitionUnionElementClass} type=[EDROOMDataClass] name=ID ";";
	public EDROOMDataDefinitionUnionElementClassElements getEDROOMDataDefinitionUnionElementClassAccess() {
		return (pEDROOMDataDefinitionUnionElementClass != null) ? pEDROOMDataDefinitionUnionElementClass : (pEDROOMDataDefinitionUnionElementClass = new EDROOMDataDefinitionUnionElementClassElements());
	}

	public ParserRule getEDROOMDataDefinitionUnionElementClassRule() {
		return getEDROOMDataDefinitionUnionElementClassAccess().getRule();
	}

	//EDROOMDataDefinitionUnionElementClassArray:
	//	{EDROOMDataDefinitionUnionElementClassArray} type=[EDROOMDataClass] name=ID "[" elements=EInt "]" ";";
	public EDROOMDataDefinitionUnionElementClassArrayElements getEDROOMDataDefinitionUnionElementClassArrayAccess() {
		return (pEDROOMDataDefinitionUnionElementClassArray != null) ? pEDROOMDataDefinitionUnionElementClassArray : (pEDROOMDataDefinitionUnionElementClassArray = new EDROOMDataDefinitionUnionElementClassArrayElements());
	}

	public ParserRule getEDROOMDataDefinitionUnionElementClassArrayRule() {
		return getEDROOMDataDefinitionUnionElementClassArrayAccess().getRule();
	}

	//EDROOMDataDefinitionUnionElementUnion:
	//	{EDROOMDataDefinitionUnionElementUnion} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
	//	name=ID ";";
	public EDROOMDataDefinitionUnionElementUnionElements getEDROOMDataDefinitionUnionElementUnionAccess() {
		return (pEDROOMDataDefinitionUnionElementUnion != null) ? pEDROOMDataDefinitionUnionElementUnion : (pEDROOMDataDefinitionUnionElementUnion = new EDROOMDataDefinitionUnionElementUnionElements());
	}

	public ParserRule getEDROOMDataDefinitionUnionElementUnionRule() {
		return getEDROOMDataDefinitionUnionElementUnionAccess().getRule();
	}

	//EDROOMDataDefinitionUnionElementUnionArray:
	//	{EDROOMDataDefinitionUnionElementUnionArray} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
	//	name=ID "[" elements=EInt "]" ";";
	public EDROOMDataDefinitionUnionElementUnionArrayElements getEDROOMDataDefinitionUnionElementUnionArrayAccess() {
		return (pEDROOMDataDefinitionUnionElementUnionArray != null) ? pEDROOMDataDefinitionUnionElementUnionArray : (pEDROOMDataDefinitionUnionElementUnionArray = new EDROOMDataDefinitionUnionElementUnionArrayElements());
	}

	public ParserRule getEDROOMDataDefinitionUnionElementUnionArrayRule() {
		return getEDROOMDataDefinitionUnionElementUnionArrayAccess().getRule();
	}

	//EDROOMDataDefinitionUnionElementEnum:
	//	{EDROOMDataDefinitionUnionElementEnum} "union" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID
	//	";";
	public EDROOMDataDefinitionUnionElementEnumElements getEDROOMDataDefinitionUnionElementEnumAccess() {
		return (pEDROOMDataDefinitionUnionElementEnum != null) ? pEDROOMDataDefinitionUnionElementEnum : (pEDROOMDataDefinitionUnionElementEnum = new EDROOMDataDefinitionUnionElementEnumElements());
	}

	public ParserRule getEDROOMDataDefinitionUnionElementEnumRule() {
		return getEDROOMDataDefinitionUnionElementEnumAccess().getRule();
	}

	//EDROOMDataDefinitionUnionElementEnumArray:
	//	{EDROOMDataDefinitionUnionElementEnumArray} "union" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
	//	name=ID "[" elements=EInt "]" ";";
	public EDROOMDataDefinitionUnionElementEnumArrayElements getEDROOMDataDefinitionUnionElementEnumArrayAccess() {
		return (pEDROOMDataDefinitionUnionElementEnumArray != null) ? pEDROOMDataDefinitionUnionElementEnumArray : (pEDROOMDataDefinitionUnionElementEnumArray = new EDROOMDataDefinitionUnionElementEnumArrayElements());
	}

	public ParserRule getEDROOMDataDefinitionUnionElementEnumArrayRule() {
		return getEDROOMDataDefinitionUnionElementEnumArrayAccess().getRule();
	}

	//EDROOMDataField:
	//	EDROOMDataFieldBasic | EDROOMDataFieldBasicArray | EDROOMDataFieldClass | EDROOMDataFieldClassArray |
	//	EDROOMDataFieldUnion | EDROOMDataFieldUnionArray | EDROOMDataFieldEnum | EDROOMDataFieldEnumArray;
	public EDROOMDataFieldElements getEDROOMDataFieldAccess() {
		return (pEDROOMDataField != null) ? pEDROOMDataField : (pEDROOMDataField = new EDROOMDataFieldElements());
	}

	public ParserRule getEDROOMDataFieldRule() {
		return getEDROOMDataFieldAccess().getRule();
	}

	//EDROOMDataFieldBasic:
	//	{EDROOMDataFieldBasic} type=EDROOMBasicType name=ID ";";
	public EDROOMDataFieldBasicElements getEDROOMDataFieldBasicAccess() {
		return (pEDROOMDataFieldBasic != null) ? pEDROOMDataFieldBasic : (pEDROOMDataFieldBasic = new EDROOMDataFieldBasicElements());
	}

	public ParserRule getEDROOMDataFieldBasicRule() {
		return getEDROOMDataFieldBasicAccess().getRule();
	}

	//EDROOMDataFieldBasicArray:
	//	{EDROOMDataFieldBasicArray} type=EDROOMBasicType name=ID "[" elements=EInt "]" ";";
	public EDROOMDataFieldBasicArrayElements getEDROOMDataFieldBasicArrayAccess() {
		return (pEDROOMDataFieldBasicArray != null) ? pEDROOMDataFieldBasicArray : (pEDROOMDataFieldBasicArray = new EDROOMDataFieldBasicArrayElements());
	}

	public ParserRule getEDROOMDataFieldBasicArrayRule() {
		return getEDROOMDataFieldBasicArrayAccess().getRule();
	}

	//EDROOMDataFieldClass:
	//	{EDROOMDataFieldClass} type=[EDROOMDataClass|VersionedQualifiedName] name=ID ";";
	public EDROOMDataFieldClassElements getEDROOMDataFieldClassAccess() {
		return (pEDROOMDataFieldClass != null) ? pEDROOMDataFieldClass : (pEDROOMDataFieldClass = new EDROOMDataFieldClassElements());
	}

	public ParserRule getEDROOMDataFieldClassRule() {
		return getEDROOMDataFieldClassAccess().getRule();
	}

	//EDROOMDataFieldClassArray:
	//	{EDROOMDataFieldClassArray} type=[EDROOMDataClass|VersionedQualifiedName] name=ID "[" elements=EInt "]" ";";
	public EDROOMDataFieldClassArrayElements getEDROOMDataFieldClassArrayAccess() {
		return (pEDROOMDataFieldClassArray != null) ? pEDROOMDataFieldClassArray : (pEDROOMDataFieldClassArray = new EDROOMDataFieldClassArrayElements());
	}

	public ParserRule getEDROOMDataFieldClassArrayRule() {
		return getEDROOMDataFieldClassArrayAccess().getRule();
	}

	//EDROOMDataFieldUnion:
	//	{EDROOMDataFieldUnion} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName] name=ID ";";
	public EDROOMDataFieldUnionElements getEDROOMDataFieldUnionAccess() {
		return (pEDROOMDataFieldUnion != null) ? pEDROOMDataFieldUnion : (pEDROOMDataFieldUnion = new EDROOMDataFieldUnionElements());
	}

	public ParserRule getEDROOMDataFieldUnionRule() {
		return getEDROOMDataFieldUnionAccess().getRule();
	}

	//EDROOMDataFieldUnionArray:
	//	{EDROOMDataFieldUnionArray} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName] name=ID "["
	//	elements=EInt "]" ";";
	public EDROOMDataFieldUnionArrayElements getEDROOMDataFieldUnionArrayAccess() {
		return (pEDROOMDataFieldUnionArray != null) ? pEDROOMDataFieldUnionArray : (pEDROOMDataFieldUnionArray = new EDROOMDataFieldUnionArrayElements());
	}

	public ParserRule getEDROOMDataFieldUnionArrayRule() {
		return getEDROOMDataFieldUnionArrayAccess().getRule();
	}

	//EDROOMDataFieldEnum:
	//	{EDROOMDataFieldEnum} "enum" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID ";";
	public EDROOMDataFieldEnumElements getEDROOMDataFieldEnumAccess() {
		return (pEDROOMDataFieldEnum != null) ? pEDROOMDataFieldEnum : (pEDROOMDataFieldEnum = new EDROOMDataFieldEnumElements());
	}

	public ParserRule getEDROOMDataFieldEnumRule() {
		return getEDROOMDataFieldEnumAccess().getRule();
	}

	//EDROOMDataFieldEnumArray:
	//	{EDROOMDataFieldEnumArray} "enum" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID "["
	//	elements=EInt "]" ";";
	public EDROOMDataFieldEnumArrayElements getEDROOMDataFieldEnumArrayAccess() {
		return (pEDROOMDataFieldEnumArray != null) ? pEDROOMDataFieldEnumArray : (pEDROOMDataFieldEnumArray = new EDROOMDataFieldEnumArrayElements());
	}

	public ParserRule getEDROOMDataFieldEnumArrayRule() {
		return getEDROOMDataFieldEnumArrayAccess().getRule();
	}

	//enum EDROOMBasicType:
	//	TEDROOMBool | TEDROOMByte | TEDROOMDouble | TEDROOMFloat | TEDROOMInt16 | TEDROOMInt32 | TEDROOMInt64 | TEDROOMInt8 |
	//	TEDROOMUInt16 | TEDROOMUInt32 | TEDROOMUInt64 | TEDROOMUInt8 | TEDROOMWord16 | TEDROOMWord32 | TEDROOMWord64;
	public EDROOMBasicTypeElements getEDROOMBasicTypeAccess() {
		return (unknownRuleEDROOMBasicType != null) ? unknownRuleEDROOMBasicType : (unknownRuleEDROOMBasicType = new EDROOMBasicTypeElements());
	}

	public EnumRule getEDROOMBasicTypeRule() {
		return getEDROOMBasicTypeAccess().getRule();
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
