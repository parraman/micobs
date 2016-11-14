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
grammar InternalFLATMCAD;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
	
}

@lexer::header {
package es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import es.uah.aut.srg.micobs.mclev.lang.services.FLATMCADGrammarAccess;

}

@parser::members {
 
 	private FLATMCADGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(FLATMCADGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleMMCLEVFLATMCADPackageFile
entryRuleMMCLEVFLATMCADPackageFile 
:
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileRule()); }
	 ruleMMCLEVFLATMCADPackageFile
{ after(grammarAccess.getMMCLEVFLATMCADPackageFileRule()); } 
	 EOF 
;

// Rule MMCLEVFLATMCADPackageFile
ruleMMCLEVFLATMCADPackageFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getGroup()); }
(rule__MMCLEVFLATMCADPackageFile__Group__0)
{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMCLEVFLATMCADPackageElement
entryRuleMMCLEVFLATMCADPackageElement 
:
{ before(grammarAccess.getMMCLEVFLATMCADPackageElementRule()); }
	 ruleMMCLEVFLATMCADPackageElement
{ after(grammarAccess.getMMCLEVFLATMCADPackageElementRule()); } 
	 EOF 
;

// Rule MMCLEVFLATMCADPackageElement
ruleMMCLEVFLATMCADPackageElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageElementAccess().getMFlatMCADParserRuleCall()); }
	ruleMFlatMCAD
{ after(grammarAccess.getMMCLEVFLATMCADPackageElementAccess().getMFlatMCADParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMFlatMCAD
entryRuleMFlatMCAD 
:
{ before(grammarAccess.getMFlatMCADRule()); }
	 ruleMFlatMCAD
{ after(grammarAccess.getMFlatMCADRule()); } 
	 EOF 
;

// Rule MFlatMCAD
ruleMFlatMCAD
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMFlatMCADAccess().getGroup()); }
(rule__MFlatMCAD__Group__0)
{ after(grammarAccess.getMFlatMCADAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMFlatMCADTarget
entryRuleMFlatMCADTarget 
:
{ before(grammarAccess.getMFlatMCADTargetRule()); }
	 ruleMFlatMCADTarget
{ after(grammarAccess.getMFlatMCADTargetRule()); } 
	 EOF 
;

// Rule MFlatMCADTarget
ruleMFlatMCADTarget
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getGroup()); }
(rule__MFlatMCADTarget__Group__0)
{ after(grammarAccess.getMFlatMCADTargetAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVersion
entryRuleVersion 
:
{ before(grammarAccess.getVersionRule()); }
	 ruleVersion
{ after(grammarAccess.getVersionRule()); } 
	 EOF 
;

// Rule Version
ruleVersion
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVersionAccess().getGroup()); }
(rule__Version__Group__0)
{ after(grammarAccess.getVersionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVersionedQualifiedName
entryRuleVersionedQualifiedName 
:
{ before(grammarAccess.getVersionedQualifiedNameRule()); }
	 ruleVersionedQualifiedName
{ after(grammarAccess.getVersionedQualifiedNameRule()); } 
	 EOF 
;

// Rule VersionedQualifiedName
ruleVersionedQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); }
(rule__VersionedQualifiedName__Group__0)
{ after(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVersionedQualifiedReferenceName
entryRuleVersionedQualifiedReferenceName 
:
{ before(grammarAccess.getVersionedQualifiedReferenceNameRule()); }
	 ruleVersionedQualifiedReferenceName
{ after(grammarAccess.getVersionedQualifiedReferenceNameRule()); } 
	 EOF 
;

// Rule VersionedQualifiedReferenceName
ruleVersionedQualifiedReferenceName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); }
(rule__VersionedQualifiedReferenceName__Group__0)
{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMFlatConnection
entryRuleMFlatConnection 
:
{ before(grammarAccess.getMFlatConnectionRule()); }
	 ruleMFlatConnection
{ after(grammarAccess.getMFlatConnectionRule()); } 
	 EOF 
;

// Rule MFlatConnection
ruleMFlatConnection
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMFlatConnectionAccess().getGroup()); }
(rule__MFlatConnection__Group__0)
{ after(grammarAccess.getMFlatConnectionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMFlatComponentInstance
entryRuleMFlatComponentInstance 
:
{ before(grammarAccess.getMFlatComponentInstanceRule()); }
	 ruleMFlatComponentInstance
{ after(grammarAccess.getMFlatComponentInstanceRule()); } 
	 EOF 
;

// Rule MFlatComponentInstance
ruleMFlatComponentInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getGroup()); }
(rule__MFlatComponentInstance__Group__0)
{ after(grammarAccess.getMFlatComponentInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMFlatServiceLibraryInstance
entryRuleMFlatServiceLibraryInstance 
:
{ before(grammarAccess.getMFlatServiceLibraryInstanceRule()); }
	 ruleMFlatServiceLibraryInstance
{ after(grammarAccess.getMFlatServiceLibraryInstanceRule()); } 
	 EOF 
;

// Rule MFlatServiceLibraryInstance
ruleMFlatServiceLibraryInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMFlatServiceLibraryInstanceAccess().getAlternatives()); }
(rule__MFlatServiceLibraryInstance__Alternatives)
{ after(grammarAccess.getMFlatServiceLibraryInstanceAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMRegularFlatServiceLibraryInstance
entryRuleMRegularFlatServiceLibraryInstance 
:
{ before(grammarAccess.getMRegularFlatServiceLibraryInstanceRule()); }
	 ruleMRegularFlatServiceLibraryInstance
{ after(grammarAccess.getMRegularFlatServiceLibraryInstanceRule()); } 
	 EOF 
;

// Rule MRegularFlatServiceLibraryInstance
ruleMRegularFlatServiceLibraryInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getGroup()); }
(rule__MRegularFlatServiceLibraryInstance__Group__0)
{ after(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMFlatDriverSLibInstance
entryRuleMFlatDriverSLibInstance 
:
{ before(grammarAccess.getMFlatDriverSLibInstanceRule()); }
	 ruleMFlatDriverSLibInstance
{ after(grammarAccess.getMFlatDriverSLibInstanceRule()); } 
	 EOF 
;

// Rule MFlatDriverSLibInstance
ruleMFlatDriverSLibInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getGroup()); }
(rule__MFlatDriverSLibInstance__Group__0)
{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMFlatDeviceDriverMapping
entryRuleMFlatDeviceDriverMapping 
:
{ before(grammarAccess.getMFlatDeviceDriverMappingRule()); }
	 ruleMFlatDeviceDriverMapping
{ after(grammarAccess.getMFlatDeviceDriverMappingRule()); } 
	 EOF 
;

// Rule MFlatDeviceDriverMapping
ruleMFlatDeviceDriverMapping
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getGroup()); }
(rule__MFlatDeviceDriverMapping__Group__0)
{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMAttributeValueAssignment
entryRuleMAttributeValueAssignment 
:
{ before(grammarAccess.getMAttributeValueAssignmentRule()); }
	 ruleMAttributeValueAssignment
{ after(grammarAccess.getMAttributeValueAssignmentRule()); } 
	 EOF 
;

// Rule MAttributeValueAssignment
ruleMAttributeValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMAttributeValueAssignmentAccess().getGroup()); }
(rule__MAttributeValueAssignment__Group__0)
{ after(grammarAccess.getMAttributeValueAssignmentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterValue
entryRuleMParameterValue 
:
{ before(grammarAccess.getMParameterValueRule()); }
	 ruleMParameterValue
{ after(grammarAccess.getMParameterValueRule()); } 
	 EOF 
;

// Rule MParameterValue
ruleMParameterValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterValueAccess().getAlternatives()); }
(rule__MParameterValue__Alternatives)
{ after(grammarAccess.getMParameterValueAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterValueLiteral
entryRuleMParameterValueLiteral 
:
{ before(grammarAccess.getMParameterValueLiteralRule()); }
	 ruleMParameterValueLiteral
{ after(grammarAccess.getMParameterValueLiteralRule()); } 
	 EOF 
;

// Rule MParameterValueLiteral
ruleMParameterValueLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterValueLiteralAccess().getAlternatives()); }
(rule__MParameterValueLiteral__Alternatives)
{ after(grammarAccess.getMParameterValueLiteralAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterValueBooleanLiteral
entryRuleMParameterValueBooleanLiteral 
:
{ before(grammarAccess.getMParameterValueBooleanLiteralRule()); }
	 ruleMParameterValueBooleanLiteral
{ after(grammarAccess.getMParameterValueBooleanLiteralRule()); } 
	 EOF 
;

// Rule MParameterValueBooleanLiteral
ruleMParameterValueBooleanLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterValueBooleanLiteralAccess().getGroup()); }
(rule__MParameterValueBooleanLiteral__Group__0)
{ after(grammarAccess.getMParameterValueBooleanLiteralAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterValueStringLiteral
entryRuleMParameterValueStringLiteral 
:
{ before(grammarAccess.getMParameterValueStringLiteralRule()); }
	 ruleMParameterValueStringLiteral
{ after(grammarAccess.getMParameterValueStringLiteralRule()); } 
	 EOF 
;

// Rule MParameterValueStringLiteral
ruleMParameterValueStringLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterValueStringLiteralAccess().getGroup()); }
(rule__MParameterValueStringLiteral__Group__0)
{ after(grammarAccess.getMParameterValueStringLiteralAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterValueIntegerLiteral
entryRuleMParameterValueIntegerLiteral 
:
{ before(grammarAccess.getMParameterValueIntegerLiteralRule()); }
	 ruleMParameterValueIntegerLiteral
{ after(grammarAccess.getMParameterValueIntegerLiteralRule()); } 
	 EOF 
;

// Rule MParameterValueIntegerLiteral
ruleMParameterValueIntegerLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterValueIntegerLiteralAccess().getGroup()); }
(rule__MParameterValueIntegerLiteral__Group__0)
{ after(grammarAccess.getMParameterValueIntegerLiteralAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterValueRealLiteral
entryRuleMParameterValueRealLiteral 
:
{ before(grammarAccess.getMParameterValueRealLiteralRule()); }
	 ruleMParameterValueRealLiteral
{ after(grammarAccess.getMParameterValueRealLiteralRule()); } 
	 EOF 
;

// Rule MParameterValueRealLiteral
ruleMParameterValueRealLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterValueRealLiteralAccess().getGroup()); }
(rule__MParameterValueRealLiteral__Group__0)
{ after(grammarAccess.getMParameterValueRealLiteralAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterValueRefObject
entryRuleMParameterValueRefObject 
:
{ before(grammarAccess.getMParameterValueRefObjectRule()); }
	 ruleMParameterValueRefObject
{ after(grammarAccess.getMParameterValueRefObjectRule()); } 
	 EOF 
;

// Rule MParameterValueRefObject
ruleMParameterValueRefObject
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterValueRefObjectAccess().getGroup()); }
(rule__MParameterValueRefObject__Group__0)
{ after(grammarAccess.getMParameterValueRefObjectAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterValuePAR
entryRuleMParameterValuePAR 
:
{ before(grammarAccess.getMParameterValuePARRule()); }
	 ruleMParameterValuePAR
{ after(grammarAccess.getMParameterValuePARRule()); } 
	 EOF 
;

// Rule MParameterValuePAR
ruleMParameterValuePAR
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterValuePARAccess().getGroup()); }
(rule__MParameterValuePAR__Group__0)
{ after(grammarAccess.getMParameterValuePARAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterValueExpression
entryRuleMParameterValueExpression 
:
{ before(grammarAccess.getMParameterValueExpressionRule()); }
	 ruleMParameterValueExpression
{ after(grammarAccess.getMParameterValueExpressionRule()); } 
	 EOF 
;

// Rule MParameterValueExpression
ruleMParameterValueExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterValueExpressionAccess().getGroup()); }
(rule__MParameterValueExpression__Group__0)
{ after(grammarAccess.getMParameterValueExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterValueTERM
entryRuleMParameterValueTERM 
:
{ before(grammarAccess.getMParameterValueTERMRule()); }
	 ruleMParameterValueTERM
{ after(grammarAccess.getMParameterValueTERMRule()); } 
	 EOF 
;

// Rule MParameterValueTERM
ruleMParameterValueTERM
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterValueTERMAccess().getGroup()); }
(rule__MParameterValueTERM__Group__0)
{ after(grammarAccess.getMParameterValueTERMAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEBoolean
entryRuleEBoolean 
:
{ before(grammarAccess.getEBooleanRule()); }
	 ruleEBoolean
{ after(grammarAccess.getEBooleanRule()); } 
	 EOF 
;

// Rule EBoolean
ruleEBoolean
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEBooleanAccess().getAlternatives()); }
(rule__EBoolean__Alternatives)
{ after(grammarAccess.getEBooleanAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleINTEGER
entryRuleINTEGER 
:
{ before(grammarAccess.getINTEGERRule()); }
	 ruleINTEGER
{ after(grammarAccess.getINTEGERRule()); } 
	 EOF 
;

// Rule INTEGER
ruleINTEGER
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getINTEGERAccess().getAlternatives()); }
(rule__INTEGER__Alternatives)
{ after(grammarAccess.getINTEGERAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleREAL
entryRuleREAL 
:
{ before(grammarAccess.getREALRule()); }
	 ruleREAL
{ after(grammarAccess.getREALRule()); } 
	 EOF 
;

// Rule REAL
ruleREAL
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getREALAccess().getGroup()); }
(rule__REAL__Group__0)
{ after(grammarAccess.getREALAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule MParameterValueExpressionOperators
ruleMParameterValueExpressionOperators
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives()); }
(rule__MParameterValueExpressionOperators__Alternatives)
{ after(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule MParameterValueTERMOperators
ruleMParameterValueTERMOperators
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives()); }
(rule__MParameterValueTERMOperators__Alternatives)
{ after(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Version__Alternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); }
	RULE_INT
{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); }
)

    |(
{ before(grammarAccess.getVersionAccess().getGroup_0_1()); }
(rule__Version__Group_0_1__0)
{ after(grammarAccess.getVersionAccess().getGroup_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Alternatives_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); }
	RULE_INT
{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); }
)

    |(
{ before(grammarAccess.getVersionAccess().getGroup_1_1_1()); }
(rule__Version__Group_1_1_1__0)
{ after(grammarAccess.getVersionAccess().getGroup_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatServiceLibraryInstance__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatServiceLibraryInstanceAccess().getMRegularFlatServiceLibraryInstanceParserRuleCall_0()); }
	ruleMRegularFlatServiceLibraryInstance
{ after(grammarAccess.getMFlatServiceLibraryInstanceAccess().getMRegularFlatServiceLibraryInstanceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMFlatServiceLibraryInstanceAccess().getMFlatDriverSLibInstanceParserRuleCall_1()); }
	ruleMFlatDriverSLibInstance
{ after(grammarAccess.getMFlatServiceLibraryInstanceAccess().getMFlatDriverSLibInstanceParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValue__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueAccess().getMParameterValueLiteralParserRuleCall_0()); }
	ruleMParameterValueLiteral
{ after(grammarAccess.getMParameterValueAccess().getMParameterValueLiteralParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMParameterValueAccess().getMParameterValueRefObjectParserRuleCall_1()); }
	ruleMParameterValueRefObject
{ after(grammarAccess.getMParameterValueAccess().getMParameterValueRefObjectParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getMParameterValueAccess().getMParameterValuePARParserRuleCall_2()); }
	ruleMParameterValuePAR
{ after(grammarAccess.getMParameterValueAccess().getMParameterValuePARParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueLiteral__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueBooleanLiteralParserRuleCall_0()); }
	ruleMParameterValueBooleanLiteral
{ after(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueBooleanLiteralParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueStringLiteralParserRuleCall_1()); }
	ruleMParameterValueStringLiteral
{ after(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueStringLiteralParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueIntegerLiteralParserRuleCall_2()); }
	ruleMParameterValueIntegerLiteral
{ after(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueIntegerLiteralParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueRealLiteralParserRuleCall_3()); }
	ruleMParameterValueRealLiteral
{ after(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueRealLiteralParserRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EBoolean__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }

	'true' 

{ after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); }
)

    |(
{ before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }

	'false' 

{ after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__INTEGER__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getINTEGERAccess().getGroup_0()); }
(rule__INTEGER__Group_0__0)
{ after(grammarAccess.getINTEGERAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); }
	RULE_HEXADECIMAL
{ after(grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueExpressionOperators__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); }
(	'+' 
)
{ after(grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getMParameterValueExpressionOperatorsAccess().getMinusEnumLiteralDeclaration_1()); }
(	'-' 
)
{ after(grammarAccess.getMParameterValueExpressionOperatorsAccess().getMinusEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueTERMOperators__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); }
(	'*' 
)
{ after(grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getMParameterValueTERMOperatorsAccess().getDivEnumLiteralDeclaration_1()); }
(	'/' 
)
{ after(grammarAccess.getMParameterValueTERMOperatorsAccess().getDivEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__MMCLEVFLATMCADPackageFile__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVFLATMCADPackageFile__Group__0__Impl
	rule__MMCLEVFLATMCADPackageFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVFLATMCADPackageFile__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVFLATMCADPackageFile__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVFLATMCADPackageFile__Group__1__Impl
	rule__MMCLEVFLATMCADPackageFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVFLATMCADPackageFile__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageAssignment_1()); }
(rule__MMCLEVFLATMCADPackageFile__PackageAssignment_1)
{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVFLATMCADPackageFile__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVFLATMCADPackageFile__Group__2__Impl
	rule__MMCLEVFLATMCADPackageFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVFLATMCADPackageFile__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVFLATMCADPackageFile__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVFLATMCADPackageFile__Group__3__Impl
	rule__MMCLEVFLATMCADPackageFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVFLATMCADPackageFile__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getGroup_3()); }
(rule__MMCLEVFLATMCADPackageFile__Group_3__0)*
{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVFLATMCADPackageFile__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVFLATMCADPackageFile__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVFLATMCADPackageFile__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getElementAssignment_4()); }
(rule__MMCLEVFLATMCADPackageFile__ElementAssignment_4)
{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getElementAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMCLEVFLATMCADPackageFile__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVFLATMCADPackageFile__Group_3__0__Impl
	rule__MMCLEVFLATMCADPackageFile__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVFLATMCADPackageFile__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportKeyword_3_0()); }

	'import' 

{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVFLATMCADPackageFile__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVFLATMCADPackageFile__Group_3__1__Impl
	rule__MMCLEVFLATMCADPackageFile__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVFLATMCADPackageFile__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportsAssignment_3_1()); }
(rule__MMCLEVFLATMCADPackageFile__ImportsAssignment_3_1)
{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVFLATMCADPackageFile__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVFLATMCADPackageFile__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVFLATMCADPackageFile__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getSemicolonKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MFlatMCAD__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group__0__Impl
	rule__MFlatMCAD__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getFlatKeyword_0()); }

	'flat' 

{ after(grammarAccess.getMFlatMCADAccess().getFlatKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group__1__Impl
	rule__MFlatMCAD__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getMcadKeyword_1()); }

	'mcad' 

{ after(grammarAccess.getMFlatMCADAccess().getMcadKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group__2__Impl
	rule__MFlatMCAD__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getNameAssignment_2()); }
(rule__MFlatMCAD__NameAssignment_2)
{ after(grammarAccess.getMFlatMCADAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group__3__Impl
	rule__MFlatMCAD__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMFlatMCADAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group__4__Impl
	rule__MFlatMCAD__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4()); }
(rule__MFlatMCAD__UnorderedGroup_4)
{ after(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group__5__Impl
	rule__MFlatMCAD__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMFlatMCADAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MFlatMCAD__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_0__0__Impl
	rule__MFlatMCAD__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getVersionKeyword_4_0_0()); }

	'version' 

{ after(grammarAccess.getMFlatMCADAccess().getVersionKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_0__1__Impl
	rule__MFlatMCAD__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getColonEqualsSignKeyword_4_0_1()); }

	':=' 

{ after(grammarAccess.getMFlatMCADAccess().getColonEqualsSignKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_0__2__Impl
	rule__MFlatMCAD__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getVersionAssignment_4_0_2()); }
(rule__MFlatMCAD__VersionAssignment_4_0_2)
{ after(grammarAccess.getMFlatMCADAccess().getVersionAssignment_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_4_0_3()); }

	';' 

{ after(grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MFlatMCAD__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_1__0__Impl
	rule__MFlatMCAD__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getDeploymentKeyword_4_1_0()); }

	'deployment' 

{ after(grammarAccess.getMFlatMCADAccess().getDeploymentKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_1__1__Impl
	rule__MFlatMCAD__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getProjectKeyword_4_1_1()); }

	'project' 

{ after(grammarAccess.getMFlatMCADAccess().getProjectKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_1__2__Impl
	rule__MFlatMCAD__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getColonEqualsSignKeyword_4_1_2()); }

	':=' 

{ after(grammarAccess.getMFlatMCADAccess().getColonEqualsSignKeyword_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_1__3__Impl
	rule__MFlatMCAD__Group_4_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getReferencedElementAssignment_4_1_3()); }
(rule__MFlatMCAD__ReferencedElementAssignment_4_1_3)
{ after(grammarAccess.getMFlatMCADAccess().getReferencedElementAssignment_4_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group_4_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_4_1_4()); }

	';' 

{ after(grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_4_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MFlatMCAD__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_2__0__Impl
	rule__MFlatMCAD__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getDeploymentKeyword_4_2_0()); }

	'deployment' 

{ after(grammarAccess.getMFlatMCADAccess().getDeploymentKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_2__1__Impl
	rule__MFlatMCAD__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getTargetsKeyword_4_2_1()); }

	'targets' 

{ after(grammarAccess.getMFlatMCADAccess().getTargetsKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_2__2__Impl
	rule__MFlatMCAD__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getLeftCurlyBracketKeyword_4_2_2()); }

	'{' 

{ after(grammarAccess.getMFlatMCADAccess().getLeftCurlyBracketKeyword_4_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_2__3__Impl
	rule__MFlatMCAD__Group_4_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMFlatMCADAccess().getTargetsAssignment_4_2_3()); }
(rule__MFlatMCAD__TargetsAssignment_4_2_3)
{ after(grammarAccess.getMFlatMCADAccess().getTargetsAssignment_4_2_3()); }
)
(
{ before(grammarAccess.getMFlatMCADAccess().getTargetsAssignment_4_2_3()); }
(rule__MFlatMCAD__TargetsAssignment_4_2_3)*
{ after(grammarAccess.getMFlatMCADAccess().getTargetsAssignment_4_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group_4_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_2__4__Impl
	rule__MFlatMCAD__Group_4_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getRightCurlyBracketKeyword_4_2_4()); }

	'}' 

{ after(grammarAccess.getMFlatMCADAccess().getRightCurlyBracketKeyword_4_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__Group_4_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__Group_4_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__Group_4_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_4_2_5()); }

	';' 

{ after(grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_4_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MFlatMCADTarget__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group__0__Impl
	rule__MFlatMCADTarget__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getTargetKeyword_0()); }

	'target' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getTargetKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group__1__Impl
	rule__MFlatMCADTarget__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1()); }
(rule__MFlatMCADTarget__UnorderedGroup_1)
{ after(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group__2__Impl
	rule__MFlatMCADTarget__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group__3__Impl
	rule__MFlatMCADTarget__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3()); }
(rule__MFlatMCADTarget__UnorderedGroup_3)
{ after(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group__4__Impl
	rule__MFlatMCADTarget__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MFlatMCADTarget__Group_1_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_1_0__0__Impl
	rule__MFlatMCADTarget__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_1_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getPlatformKeyword_1_0_0()); }

	'platform' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getPlatformKeyword_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_1_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_1_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getDeploymentPlatformAssignment_1_0_1()); }
(rule__MFlatMCADTarget__DeploymentPlatformAssignment_1_0_1)
{ after(grammarAccess.getMFlatMCADTargetAccess().getDeploymentPlatformAssignment_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MFlatMCADTarget__Group_1_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_1_1__0__Impl
	rule__MFlatMCADTarget__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_1_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getAlternativeKeyword_1_1_0()); }

	'alternative' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getAlternativeKeyword_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_1_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_1_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getLeafDeploymentAlternativeAssignment_1_1_1()); }
(rule__MFlatMCADTarget__LeafDeploymentAlternativeAssignment_1_1_1)
{ after(grammarAccess.getMFlatMCADTargetAccess().getLeafDeploymentAlternativeAssignment_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MFlatMCADTarget__Group_3_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_0__0__Impl
	rule__MFlatMCADTarget__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getAttributeKeyword_3_0_0()); }

	'attribute' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getAttributeKeyword_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_0__1__Impl
	rule__MFlatMCADTarget__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getValuesKeyword_3_0_1()); }

	'values' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getValuesKeyword_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_0__2__Impl
	rule__MFlatMCADTarget__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_0_2()); }

	'{' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_0__3__Impl
	rule__MFlatMCADTarget__Group_3_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getAttributeValueAssignmentsAssignment_3_0_3()); }
(rule__MFlatMCADTarget__AttributeValueAssignmentsAssignment_3_0_3)
{ after(grammarAccess.getMFlatMCADTargetAccess().getAttributeValueAssignmentsAssignment_3_0_3()); }
)
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getAttributeValueAssignmentsAssignment_3_0_3()); }
(rule__MFlatMCADTarget__AttributeValueAssignmentsAssignment_3_0_3)*
{ after(grammarAccess.getMFlatMCADTargetAccess().getAttributeValueAssignmentsAssignment_3_0_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_0__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_0__4__Impl
	rule__MFlatMCADTarget__Group_3_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_0__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_0_4()); }

	'}' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_0_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_0__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_0__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_0__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_0_5()); }

	';' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_0_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MFlatMCADTarget__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_1__0__Impl
	rule__MFlatMCADTarget__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getComponentsKeyword_3_1_0()); }

	'components' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getComponentsKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_1__1__Impl
	rule__MFlatMCADTarget__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_1_1()); }

	'{' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_1__2__Impl
	rule__MFlatMCADTarget__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getComponentsAssignment_3_1_2()); }
(rule__MFlatMCADTarget__ComponentsAssignment_3_1_2)
{ after(grammarAccess.getMFlatMCADTargetAccess().getComponentsAssignment_3_1_2()); }
)
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getComponentsAssignment_3_1_2()); }
(rule__MFlatMCADTarget__ComponentsAssignment_3_1_2)*
{ after(grammarAccess.getMFlatMCADTargetAccess().getComponentsAssignment_3_1_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_1__3__Impl
	rule__MFlatMCADTarget__Group_3_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_1_3()); }

	'}' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_1_4()); }

	';' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MFlatMCADTarget__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_2__0__Impl
	rule__MFlatMCADTarget__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getConnectionsKeyword_3_2_0()); }

	'connections' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getConnectionsKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_2__1__Impl
	rule__MFlatMCADTarget__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_2_1()); }

	'{' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_2__2__Impl
	rule__MFlatMCADTarget__Group_3_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getConnectionsAssignment_3_2_2()); }
(rule__MFlatMCADTarget__ConnectionsAssignment_3_2_2)
{ after(grammarAccess.getMFlatMCADTargetAccess().getConnectionsAssignment_3_2_2()); }
)
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getConnectionsAssignment_3_2_2()); }
(rule__MFlatMCADTarget__ConnectionsAssignment_3_2_2)*
{ after(grammarAccess.getMFlatMCADTargetAccess().getConnectionsAssignment_3_2_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_2__3__Impl
	rule__MFlatMCADTarget__Group_3_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_2_3()); }

	'}' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_2_4()); }

	';' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MFlatMCADTarget__Group_3_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_3__0__Impl
	rule__MFlatMCADTarget__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getLibrariesKeyword_3_3_0()); }

	'libraries' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getLibrariesKeyword_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_3__1__Impl
	rule__MFlatMCADTarget__Group_3_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_3_1()); }

	'{' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_3__2__Impl
	rule__MFlatMCADTarget__Group_3_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getLibrariesAssignment_3_3_2()); }
(rule__MFlatMCADTarget__LibrariesAssignment_3_3_2)
{ after(grammarAccess.getMFlatMCADTargetAccess().getLibrariesAssignment_3_3_2()); }
)
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getLibrariesAssignment_3_3_2()); }
(rule__MFlatMCADTarget__LibrariesAssignment_3_3_2)*
{ after(grammarAccess.getMFlatMCADTargetAccess().getLibrariesAssignment_3_3_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_3__3__Impl
	rule__MFlatMCADTarget__Group_3_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_3_3()); }

	'}' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__Group_3_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__Group_3_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__Group_3_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_3_4()); }

	';' 

{ after(grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
(rule__QualifiedName__Group_1__0)*
{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Version__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Version__Group__0__Impl
	rule__Version__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionAccess().getAlternatives_0()); }
(rule__Version__Alternatives_0)
{ after(grammarAccess.getVersionAccess().getAlternatives_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Version__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionAccess().getGroup_1()); }
(rule__Version__Group_1__0)*
{ after(grammarAccess.getVersionAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Version__Group_0_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Version__Group_0_1__0__Impl
	rule__Version__Group_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_0_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); }
(	RULE_INT)?
{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_0_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Version__Group_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_0_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); }
	RULE_ID
{ after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Version__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Version__Group_1__0__Impl
	rule__Version__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Version__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionAccess().getAlternatives_1_1()); }
(rule__Version__Alternatives_1_1)
{ after(grammarAccess.getVersionAccess().getAlternatives_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Version__Group_1_1_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Version__Group_1_1_1__0__Impl
	rule__Version__Group_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1_1_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); }
(	RULE_INT)?
{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_1_1_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Version__Group_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1_1_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); }
	RULE_ID
{ after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__VersionedQualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VersionedQualifiedName__Group__0__Impl
	rule__VersionedQualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
{ after(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VersionedQualifiedName__Group__1__Impl
	rule__VersionedQualifiedName__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedName__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VersionedQualifiedName__Group__2__Impl
	rule__VersionedQualifiedName__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); }
	ruleVersion
{ after(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedName__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VersionedQualifiedName__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__VersionedQualifiedReferenceName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VersionedQualifiedReferenceName__Group__0__Impl
	rule__VersionedQualifiedReferenceName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); }
(rule__VersionedQualifiedReferenceName__Group_0__0)?
{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedReferenceName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VersionedQualifiedReferenceName__Group__1__Impl
	rule__VersionedQualifiedReferenceName__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedReferenceName__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VersionedQualifiedReferenceName__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); }
(rule__VersionedQualifiedReferenceName__Group_2__0)*
{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__VersionedQualifiedReferenceName__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VersionedQualifiedReferenceName__Group_0__0__Impl
	rule__VersionedQualifiedReferenceName__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); }
	ruleVersionedQualifiedName
{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedReferenceName__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VersionedQualifiedReferenceName__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); }

	'::' 

{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__VersionedQualifiedReferenceName__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VersionedQualifiedReferenceName__Group_2__0__Impl
	rule__VersionedQualifiedReferenceName__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); }

	'::' 

{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedReferenceName__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VersionedQualifiedReferenceName__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MFlatConnection__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__0__Impl
	rule__MFlatConnection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getMFlatConnectionAction_0()); }
(

)
{ after(grammarAccess.getMFlatConnectionAccess().getMFlatConnectionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__1__Impl
	rule__MFlatConnection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getConnectionKeyword_1()); }

	'connection' 

{ after(grammarAccess.getMFlatConnectionAccess().getConnectionKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__2__Impl
	rule__MFlatConnection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getClientInstanceAssignment_2()); }
(rule__MFlatConnection__ClientInstanceAssignment_2)
{ after(grammarAccess.getMFlatConnectionAccess().getClientInstanceAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__3__Impl
	rule__MFlatConnection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getFullStopKeyword_3()); }

	'.' 

{ after(grammarAccess.getMFlatConnectionAccess().getFullStopKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__4__Impl
	rule__MFlatConnection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getClientPortAssignment_4()); }
(rule__MFlatConnection__ClientPortAssignment_4)
{ after(grammarAccess.getMFlatConnectionAccess().getClientPortAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__5__Impl
	rule__MFlatConnection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5()); }

	'<->' 

{ after(grammarAccess.getMFlatConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__6__Impl
	rule__MFlatConnection__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getServerInstanceAssignment_6()); }
(rule__MFlatConnection__ServerInstanceAssignment_6)
{ after(grammarAccess.getMFlatConnectionAccess().getServerInstanceAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__7__Impl
	rule__MFlatConnection__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getFullStopKeyword_7()); }

	'.' 

{ after(grammarAccess.getMFlatConnectionAccess().getFullStopKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__8__Impl
	rule__MFlatConnection__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getServerPortAssignment_8()); }
(rule__MFlatConnection__ServerPortAssignment_8)
{ after(grammarAccess.getMFlatConnectionAccess().getServerPortAssignment_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__9__Impl
	rule__MFlatConnection__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getUsingKeyword_9()); }

	'using' 

{ after(grammarAccess.getMFlatConnectionAccess().getUsingKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__10__Impl
	rule__MFlatConnection__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getConnectorAssignment_10()); }
(rule__MFlatConnection__ConnectorAssignment_10)
{ after(grammarAccess.getMFlatConnectionAccess().getConnectorAssignment_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__11__Impl
	rule__MFlatConnection__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getLeftCurlyBracketKeyword_11()); }

	'{' 

{ after(grammarAccess.getMFlatConnectionAccess().getLeftCurlyBracketKeyword_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__12__Impl
	rule__MFlatConnection__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getGroup_12()); }
(rule__MFlatConnection__Group_12__0)?
{ after(grammarAccess.getMFlatConnectionAccess().getGroup_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__13
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__13__Impl
	rule__MFlatConnection__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__13__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getAttributeValueAssignmentsAssignment_13()); }
(rule__MFlatConnection__AttributeValueAssignmentsAssignment_13)*
{ after(grammarAccess.getMFlatConnectionAccess().getAttributeValueAssignmentsAssignment_13()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__14
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__14__Impl
	rule__MFlatConnection__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__14__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getRightCurlyBracketKeyword_14()); }

	'}' 

{ after(grammarAccess.getMFlatConnectionAccess().getRightCurlyBracketKeyword_14()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group__15
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group__15__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getSemicolonKeyword_15()); }

	';' 

{ after(grammarAccess.getMFlatConnectionAccess().getSemicolonKeyword_15()); }
)

;
finally {
	restoreStackSize(stackSize);
}


































rule__MFlatConnection__Group_12__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group_12__0__Impl
	rule__MFlatConnection__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group_12__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getMappingKeyword_12_0()); }

	'mapping' 

{ after(grammarAccess.getMFlatConnectionAccess().getMappingKeyword_12_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group_12__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group_12__1__Impl
	rule__MFlatConnection__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group_12__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getColonEqualsSignKeyword_12_1()); }

	':=' 

{ after(grammarAccess.getMFlatConnectionAccess().getColonEqualsSignKeyword_12_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group_12__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group_12__2__Impl
	rule__MFlatConnection__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group_12__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getIfaceMappingAssignment_12_2()); }
(rule__MFlatConnection__IfaceMappingAssignment_12_2)
{ after(grammarAccess.getMFlatConnectionAccess().getIfaceMappingAssignment_12_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatConnection__Group_12__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatConnection__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__Group_12__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getSemicolonKeyword_12_3()); }

	';' 

{ after(grammarAccess.getMFlatConnectionAccess().getSemicolonKeyword_12_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MFlatComponentInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatComponentInstance__Group__0__Impl
	rule__MFlatComponentInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatComponentInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getMFlatComponentInstanceAction_0()); }
(

)
{ after(grammarAccess.getMFlatComponentInstanceAccess().getMFlatComponentInstanceAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatComponentInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatComponentInstance__Group__1__Impl
	rule__MFlatComponentInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatComponentInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getInstanceKeyword_1()); }

	'instance' 

{ after(grammarAccess.getMFlatComponentInstanceAccess().getInstanceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatComponentInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatComponentInstance__Group__2__Impl
	rule__MFlatComponentInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatComponentInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getComponentAssignment_2()); }
(rule__MFlatComponentInstance__ComponentAssignment_2)
{ after(grammarAccess.getMFlatComponentInstanceAccess().getComponentAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatComponentInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatComponentInstance__Group__3__Impl
	rule__MFlatComponentInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatComponentInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getNameAssignment_3()); }
(rule__MFlatComponentInstance__NameAssignment_3)
{ after(grammarAccess.getMFlatComponentInstanceAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatComponentInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatComponentInstance__Group__4__Impl
	rule__MFlatComponentInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatComponentInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMFlatComponentInstanceAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatComponentInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatComponentInstance__Group__5__Impl
	rule__MFlatComponentInstance__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatComponentInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getAttributeValueAssignmentsAssignment_5()); }
(rule__MFlatComponentInstance__AttributeValueAssignmentsAssignment_5)*
{ after(grammarAccess.getMFlatComponentInstanceAccess().getAttributeValueAssignmentsAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatComponentInstance__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatComponentInstance__Group__6__Impl
	rule__MFlatComponentInstance__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatComponentInstance__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMFlatComponentInstanceAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatComponentInstance__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatComponentInstance__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatComponentInstance__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMFlatComponentInstanceAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MRegularFlatServiceLibraryInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRegularFlatServiceLibraryInstance__Group__0__Impl
	rule__MRegularFlatServiceLibraryInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularFlatServiceLibraryInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryKeyword_0()); }

	'library' 

{ after(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRegularFlatServiceLibraryInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRegularFlatServiceLibraryInstance__Group__1__Impl
	rule__MRegularFlatServiceLibraryInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularFlatServiceLibraryInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryAssignment_1()); }
(rule__MRegularFlatServiceLibraryInstance__LibraryAssignment_1)
{ after(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRegularFlatServiceLibraryInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRegularFlatServiceLibraryInstance__Group__2__Impl
	rule__MRegularFlatServiceLibraryInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularFlatServiceLibraryInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRegularFlatServiceLibraryInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRegularFlatServiceLibraryInstance__Group__3__Impl
	rule__MRegularFlatServiceLibraryInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularFlatServiceLibraryInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getAttributeValueAssignmentsAssignment_3()); }
(rule__MRegularFlatServiceLibraryInstance__AttributeValueAssignmentsAssignment_3)*
{ after(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getAttributeValueAssignmentsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRegularFlatServiceLibraryInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRegularFlatServiceLibraryInstance__Group__4__Impl
	rule__MRegularFlatServiceLibraryInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularFlatServiceLibraryInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRegularFlatServiceLibraryInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRegularFlatServiceLibraryInstance__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularFlatServiceLibraryInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MFlatDriverSLibInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group__0__Impl
	rule__MFlatDriverSLibInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getMFlatDriverSLibInstanceAction_0()); }
(

)
{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getMFlatDriverSLibInstanceAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group__1__Impl
	rule__MFlatDriverSLibInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getDriverKeyword_1()); }

	'driver' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getDriverKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group__2__Impl
	rule__MFlatDriverSLibInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getLibraryAssignment_2()); }
(rule__MFlatDriverSLibInstance__LibraryAssignment_2)
{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getLibraryAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group__3__Impl
	rule__MFlatDriverSLibInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group__4__Impl
	rule__MFlatDriverSLibInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4()); }
(rule__MFlatDriverSLibInstance__UnorderedGroup_4)
{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group__5__Impl
	rule__MFlatDriverSLibInstance__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MFlatDriverSLibInstance__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group_4_0__0__Impl
	rule__MFlatDriverSLibInstance__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeKeyword_4_0_0()); }

	'attribute' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group_4_0__1__Impl
	rule__MFlatDriverSLibInstance__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getValuesKeyword_4_0_1()); }

	'values' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getValuesKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group_4_0__2__Impl
	rule__MFlatDriverSLibInstance__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_0_2()); }

	'{' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group_4_0__3__Impl
	rule__MFlatDriverSLibInstance__Group_4_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeValueAssignmentsAssignment_4_0_3()); }
(rule__MFlatDriverSLibInstance__AttributeValueAssignmentsAssignment_4_0_3)
{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeValueAssignmentsAssignment_4_0_3()); }
)
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeValueAssignmentsAssignment_4_0_3()); }
(rule__MFlatDriverSLibInstance__AttributeValueAssignmentsAssignment_4_0_3)*
{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeValueAssignmentsAssignment_4_0_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group_4_0__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group_4_0__4__Impl
	rule__MFlatDriverSLibInstance__Group_4_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group_4_0__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_0_4()); }

	'}' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_0_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group_4_0__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group_4_0__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group_4_0__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_4_0_5()); }

	';' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_4_0_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MFlatDriverSLibInstance__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group_4_1__0__Impl
	rule__MFlatDriverSLibInstance__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceKeyword_4_1_0()); }

	'device' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group_4_1__1__Impl
	rule__MFlatDriverSLibInstance__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getMappingsKeyword_4_1_1()); }

	'mappings' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getMappingsKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group_4_1__2__Impl
	rule__MFlatDriverSLibInstance__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_1_2()); }

	'{' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group_4_1__3__Impl
	rule__MFlatDriverSLibInstance__Group_4_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceDriverMappingsAssignment_4_1_3()); }
(rule__MFlatDriverSLibInstance__DeviceDriverMappingsAssignment_4_1_3)
{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceDriverMappingsAssignment_4_1_3()); }
)
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceDriverMappingsAssignment_4_1_3()); }
(rule__MFlatDriverSLibInstance__DeviceDriverMappingsAssignment_4_1_3)*
{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceDriverMappingsAssignment_4_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group_4_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group_4_1__4__Impl
	rule__MFlatDriverSLibInstance__Group_4_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group_4_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_1_4()); }

	'}' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__Group_4_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__Group_4_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__Group_4_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_4_1_5()); }

	';' 

{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_4_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MFlatDeviceDriverMapping__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDeviceDriverMapping__Group__0__Impl
	rule__MFlatDeviceDriverMapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDeviceDriverMapping__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedKeyword_0()); }

	'supported' 

{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDeviceDriverMapping__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDeviceDriverMapping__Group__1__Impl
	rule__MFlatDeviceDriverMapping__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDeviceDriverMapping__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeviceKeyword_1()); }

	'device' 

{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeviceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDeviceDriverMapping__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDeviceDriverMapping__Group__2__Impl
	rule__MFlatDeviceDriverMapping__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDeviceDriverMapping__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedDeviceAssignment_2()); }
(rule__MFlatDeviceDriverMapping__SupportedDeviceAssignment_2)
{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedDeviceAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDeviceDriverMapping__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDeviceDriverMapping__Group__3__Impl
	rule__MFlatDeviceDriverMapping__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDeviceDriverMapping__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3()); }

	'->' 

{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDeviceDriverMapping__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDeviceDriverMapping__Group__4__Impl
	rule__MFlatDeviceDriverMapping__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDeviceDriverMapping__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedKeyword_4()); }

	'deployed' 

{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDeviceDriverMapping__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDeviceDriverMapping__Group__5__Impl
	rule__MFlatDeviceDriverMapping__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDeviceDriverMapping__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeviceKeyword_5()); }

	'device' 

{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeviceKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDeviceDriverMapping__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDeviceDriverMapping__Group__6__Impl
	rule__MFlatDeviceDriverMapping__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDeviceDriverMapping__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedDeviceAssignment_6()); }
(rule__MFlatDeviceDriverMapping__DeployedDeviceAssignment_6)
{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedDeviceAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDeviceDriverMapping__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDeviceDriverMapping__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDeviceDriverMapping__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MAttributeValueAssignment__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAttributeValueAssignment__Group__0__Impl
	rule__MAttributeValueAssignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAttributeValueAssignment__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAttributeValueAssignmentAccess().getAttributeKeyword_0()); }

	'attribute' 

{ after(grammarAccess.getMAttributeValueAssignmentAccess().getAttributeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAttributeValueAssignment__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAttributeValueAssignment__Group__1__Impl
	rule__MAttributeValueAssignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAttributeValueAssignment__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAttributeValueAssignmentAccess().getParameterAssignment_1()); }
(rule__MAttributeValueAssignment__ParameterAssignment_1)
{ after(grammarAccess.getMAttributeValueAssignmentAccess().getParameterAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAttributeValueAssignment__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAttributeValueAssignment__Group__2__Impl
	rule__MAttributeValueAssignment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAttributeValueAssignment__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAttributeValueAssignmentAccess().getColonEqualsSignKeyword_2()); }

	':=' 

{ after(grammarAccess.getMAttributeValueAssignmentAccess().getColonEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAttributeValueAssignment__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAttributeValueAssignment__Group__3__Impl
	rule__MAttributeValueAssignment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAttributeValueAssignment__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAttributeValueAssignmentAccess().getParameterValueAssignment_3()); }
(rule__MAttributeValueAssignment__ParameterValueAssignment_3)
{ after(grammarAccess.getMAttributeValueAssignmentAccess().getParameterValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAttributeValueAssignment__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAttributeValueAssignment__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAttributeValueAssignment__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAttributeValueAssignmentAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMAttributeValueAssignmentAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MParameterValueBooleanLiteral__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueBooleanLiteral__Group__0__Impl
	rule__MParameterValueBooleanLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueBooleanLiteral__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0()); }
(

)
{ after(grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueBooleanLiteral__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueBooleanLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueBooleanLiteral__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueAssignment_1()); }
(rule__MParameterValueBooleanLiteral__ValueAssignment_1)
{ after(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MParameterValueStringLiteral__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueStringLiteral__Group__0__Impl
	rule__MParameterValueStringLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueStringLiteral__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0()); }
(

)
{ after(grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueStringLiteral__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueStringLiteral__Group__1__Impl
	rule__MParameterValueStringLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueStringLiteral__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawAssignment_1()); }
(rule__MParameterValueStringLiteral__IsRawAssignment_1)?
{ after(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueStringLiteral__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueStringLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueStringLiteral__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueStringLiteralAccess().getValueAssignment_2()); }
(rule__MParameterValueStringLiteral__ValueAssignment_2)
{ after(grammarAccess.getMParameterValueStringLiteralAccess().getValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MParameterValueIntegerLiteral__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueIntegerLiteral__Group__0__Impl
	rule__MParameterValueIntegerLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueIntegerLiteral__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0()); }
(

)
{ after(grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueIntegerLiteral__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueIntegerLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueIntegerLiteral__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueAssignment_1()); }
(rule__MParameterValueIntegerLiteral__ValueAssignment_1)
{ after(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MParameterValueRealLiteral__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueRealLiteral__Group__0__Impl
	rule__MParameterValueRealLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueRealLiteral__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0()); }
(

)
{ after(grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueRealLiteral__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueRealLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueRealLiteral__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueRealLiteralAccess().getValueAssignment_1()); }
(rule__MParameterValueRealLiteral__ValueAssignment_1)
{ after(grammarAccess.getMParameterValueRealLiteralAccess().getValueAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MParameterValueRefObject__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueRefObject__Group__0__Impl
	rule__MParameterValueRefObject__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueRefObject__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0()); }
(

)
{ after(grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueRefObject__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueRefObject__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueRefObject__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueRefObjectAccess().getObjectAssignment_1()); }
(rule__MParameterValueRefObject__ObjectAssignment_1)
{ after(grammarAccess.getMParameterValueRefObjectAccess().getObjectAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MParameterValuePAR__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValuePAR__Group__0__Impl
	rule__MParameterValuePAR__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValuePAR__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0()); }

	'(' 

{ after(grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValuePAR__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValuePAR__Group__1__Impl
	rule__MParameterValuePAR__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValuePAR__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValuePARAccess().getValueAssignment_1()); }
(rule__MParameterValuePAR__ValueAssignment_1)
{ after(grammarAccess.getMParameterValuePARAccess().getValueAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValuePAR__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValuePAR__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValuePAR__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValuePARAccess().getRightParenthesisKeyword_2()); }

	')' 

{ after(grammarAccess.getMParameterValuePARAccess().getRightParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MParameterValueExpression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueExpression__Group__0__Impl
	rule__MParameterValueExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueExpression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueExpressionAccess().getMParameterValueExpressionAction_0()); }
(

)
{ after(grammarAccess.getMParameterValueExpressionAccess().getMParameterValueExpressionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueExpression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueExpression__Group__1__Impl
	rule__MParameterValueExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueExpression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueExpressionAccess().getLeftAssignment_1()); }
(rule__MParameterValueExpression__LeftAssignment_1)
{ after(grammarAccess.getMParameterValueExpressionAccess().getLeftAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueExpression__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueExpression__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueExpression__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueExpressionAccess().getGroup_2()); }
(rule__MParameterValueExpression__Group_2__0)?
{ after(grammarAccess.getMParameterValueExpressionAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MParameterValueExpression__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueExpression__Group_2__0__Impl
	rule__MParameterValueExpression__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueExpression__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueExpressionAccess().getOperationAssignment_2_0()); }
(rule__MParameterValueExpression__OperationAssignment_2_0)
{ after(grammarAccess.getMParameterValueExpressionAccess().getOperationAssignment_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueExpression__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueExpression__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueExpression__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueExpressionAccess().getRightAssignment_2_1()); }
(rule__MParameterValueExpression__RightAssignment_2_1)
{ after(grammarAccess.getMParameterValueExpressionAccess().getRightAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MParameterValueTERM__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueTERM__Group__0__Impl
	rule__MParameterValueTERM__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueTERM__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueTERMAccess().getMParameterValueTERMAction_0()); }
(

)
{ after(grammarAccess.getMParameterValueTERMAccess().getMParameterValueTERMAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueTERM__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueTERM__Group__1__Impl
	rule__MParameterValueTERM__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueTERM__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueTERMAccess().getLeftAssignment_1()); }
(rule__MParameterValueTERM__LeftAssignment_1)
{ after(grammarAccess.getMParameterValueTERMAccess().getLeftAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueTERM__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueTERM__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueTERM__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueTERMAccess().getGroup_2()); }
(rule__MParameterValueTERM__Group_2__0)?
{ after(grammarAccess.getMParameterValueTERMAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MParameterValueTERM__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueTERM__Group_2__0__Impl
	rule__MParameterValueTERM__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueTERM__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueTERMAccess().getOperationAssignment_2_0()); }
(rule__MParameterValueTERM__OperationAssignment_2_0)
{ after(grammarAccess.getMParameterValueTERMAccess().getOperationAssignment_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueTERM__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueTERM__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueTERM__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueTERMAccess().getRightAssignment_2_1()); }
(rule__MParameterValueTERM__RightAssignment_2_1)
{ after(grammarAccess.getMParameterValueTERMAccess().getRightAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__INTEGER__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__INTEGER__Group_0__0__Impl
	rule__INTEGER__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__INTEGER__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); }
(
	'-' 
)?
{ after(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__INTEGER__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__INTEGER__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__INTEGER__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); }
	RULE_INT
{ after(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__REAL__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__REAL__Group__0__Impl
	rule__REAL__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); }
(
	'-' 
)?
{ after(grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__REAL__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__REAL__Group__1__Impl
	rule__REAL__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getREALAccess().getGroup_1()); }
(rule__REAL__Group_1__0)
{ after(grammarAccess.getREALAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__REAL__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__REAL__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getREALAccess().getGroup_2()); }
(rule__REAL__Group_2__0)?
{ after(grammarAccess.getREALAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__REAL__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__REAL__Group_1__0__Impl
	rule__REAL__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); }
	RULE_INT
{ after(grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__REAL__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__REAL__Group_1__1__Impl
	rule__REAL__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getREALAccess().getFullStopKeyword_1_1()); }

	'.' 

{ after(grammarAccess.getREALAccess().getFullStopKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__REAL__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__REAL__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); }
	RULE_INT
{ after(grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__REAL__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__REAL__Group_2__0__Impl
	rule__REAL__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getREALAccess().getEKeyword_2_0()); }

	'e' 

{ after(grammarAccess.getREALAccess().getEKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__REAL__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__REAL__Group_2__1__Impl
	rule__REAL__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1()); }
(
	'-' 
)?
{ after(grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__REAL__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__REAL__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__REAL__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2_2()); }
	RULE_INT
{ after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__MFlatMCAD__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());
    }
:
	rule__MFlatMCAD__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMFlatMCADAccess().getGroup_4_0()); }
						(rule__MFlatMCAD__Group_4_0__0)
						{ after(grammarAccess.getMFlatMCADAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMFlatMCADAccess().getGroup_4_1()); }
						(rule__MFlatMCAD__Group_4_1__0)
						{ after(grammarAccess.getMFlatMCADAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMFlatMCADAccess().getGroup_4_2()); }
						(rule__MFlatMCAD__Group_4_2__0)
						{ after(grammarAccess.getMFlatMCADAccess().getGroup_4_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__UnorderedGroup_4__Impl
	rule__MFlatMCAD__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__UnorderedGroup_4__Impl
	rule__MFlatMCAD__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCAD__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCAD__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__MFlatMCADTarget__UnorderedGroup_1
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1());
    }
:
	rule__MFlatMCADTarget__UnorderedGroup_1__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1());
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__UnorderedGroup_1__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMFlatMCADTargetAccess().getGroup_1_0()); }
						(rule__MFlatMCADTarget__Group_1_0__0)
						{ after(grammarAccess.getMFlatMCADTargetAccess().getGroup_1_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMFlatMCADTargetAccess().getGroup_1_1()); }
						(rule__MFlatMCADTarget__Group_1_1__0)
						{ after(grammarAccess.getMFlatMCADTargetAccess().getGroup_1_1()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1());
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__UnorderedGroup_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__UnorderedGroup_1__Impl
	rule__MFlatMCADTarget__UnorderedGroup_1__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__UnorderedGroup_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__UnorderedGroup_1__Impl
;
finally {
	restoreStackSize(stackSize);
}






rule__MFlatMCADTarget__UnorderedGroup_3
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());
    }
:
	rule__MFlatMCADTarget__UnorderedGroup_3__0
	?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMFlatMCADTargetAccess().getGroup_3_0()); }
						(rule__MFlatMCADTarget__Group_3_0__0)
						{ after(grammarAccess.getMFlatMCADTargetAccess().getGroup_3_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMFlatMCADTargetAccess().getGroup_3_1()); }
						(rule__MFlatMCADTarget__Group_3_1__0)
						{ after(grammarAccess.getMFlatMCADTargetAccess().getGroup_3_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMFlatMCADTargetAccess().getGroup_3_2()); }
						(rule__MFlatMCADTarget__Group_3_2__0)
						{ after(grammarAccess.getMFlatMCADTargetAccess().getGroup_3_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMFlatMCADTargetAccess().getGroup_3_3()); }
						(rule__MFlatMCADTarget__Group_3_3__0)
						{ after(grammarAccess.getMFlatMCADTargetAccess().getGroup_3_3()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__UnorderedGroup_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__UnorderedGroup_3__Impl
	rule__MFlatMCADTarget__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__UnorderedGroup_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__UnorderedGroup_3__Impl
	rule__MFlatMCADTarget__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__UnorderedGroup_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__UnorderedGroup_3__Impl
	rule__MFlatMCADTarget__UnorderedGroup_3__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatMCADTarget__UnorderedGroup_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatMCADTarget__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}










rule__MFlatDriverSLibInstance__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4());
    }
:
	rule__MFlatDriverSLibInstance__UnorderedGroup_4__0
	?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getGroup_4_0()); }
						(rule__MFlatDriverSLibInstance__Group_4_0__0)
						{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getGroup_4_1()); }
						(rule__MFlatDriverSLibInstance__Group_4_1__0)
						{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getGroup_4_1()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__UnorderedGroup_4__Impl
	rule__MFlatDriverSLibInstance__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MFlatDriverSLibInstance__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MFlatDriverSLibInstance__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}






rule__MMCLEVFLATMCADPackageFile__PackageAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); }
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVFLATMCADPackageFile__ImportsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportsMMCLEVPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportsMMCLEVPackageQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportsMMCLEVPackageQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportsMMCLEVPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVFLATMCADPackageFile__ElementAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getElementMMCLEVFLATMCADPackageElementParserRuleCall_4_0()); }
	ruleMMCLEVFLATMCADPackageElement{ after(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getElementMMCLEVFLATMCADPackageElementParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMFlatMCADAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__VersionAssignment_4_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMFlatMCADAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__ReferencedElementAssignment_4_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getReferencedElementMMCADeploymentCrossReference_4_1_3_0()); }
(
{ before(grammarAccess.getMFlatMCADAccess().getReferencedElementMMCADeploymentVersionedQualifiedNameParserRuleCall_4_1_3_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMFlatMCADAccess().getReferencedElementMMCADeploymentVersionedQualifiedNameParserRuleCall_4_1_3_0_1()); }
)
{ after(grammarAccess.getMFlatMCADAccess().getReferencedElementMMCADeploymentCrossReference_4_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCAD__TargetsAssignment_4_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADAccess().getTargetsMFlatMCADTargetParserRuleCall_4_2_3_0()); }
	ruleMFlatMCADTarget{ after(grammarAccess.getMFlatMCADAccess().getTargetsMFlatMCADTargetParserRuleCall_4_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__DeploymentPlatformAssignment_1_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getDeploymentPlatformMDeploymentPlatformCrossReference_1_0_1_0()); }
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getDeploymentPlatformMDeploymentPlatformIDTerminalRuleCall_1_0_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMFlatMCADTargetAccess().getDeploymentPlatformMDeploymentPlatformIDTerminalRuleCall_1_0_1_0_1()); }
)
{ after(grammarAccess.getMFlatMCADTargetAccess().getDeploymentPlatformMDeploymentPlatformCrossReference_1_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__LeafDeploymentAlternativeAssignment_1_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getLeafDeploymentAlternativeMDeploymentAlternativeCrossReference_1_1_1_0()); }
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getLeafDeploymentAlternativeMDeploymentAlternativeVersionedQualifiedReferenceNameParserRuleCall_1_1_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMFlatMCADTargetAccess().getLeafDeploymentAlternativeMDeploymentAlternativeVersionedQualifiedReferenceNameParserRuleCall_1_1_1_0_1()); }
)
{ after(grammarAccess.getMFlatMCADTargetAccess().getLeafDeploymentAlternativeMDeploymentAlternativeCrossReference_1_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__AttributeValueAssignmentsAssignment_3_0_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0_3_0()); }
	ruleMAttributeValueAssignment{ after(grammarAccess.getMFlatMCADTargetAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__ComponentsAssignment_3_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getComponentsMFlatComponentInstanceParserRuleCall_3_1_2_0()); }
	ruleMFlatComponentInstance{ after(grammarAccess.getMFlatMCADTargetAccess().getComponentsMFlatComponentInstanceParserRuleCall_3_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__ConnectionsAssignment_3_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getConnectionsMFlatConnectionParserRuleCall_3_2_2_0()); }
	ruleMFlatConnection{ after(grammarAccess.getMFlatMCADTargetAccess().getConnectionsMFlatConnectionParserRuleCall_3_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatMCADTarget__LibrariesAssignment_3_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatMCADTargetAccess().getLibrariesMFlatServiceLibraryInstanceParserRuleCall_3_3_2_0()); }
	ruleMFlatServiceLibraryInstance{ after(grammarAccess.getMFlatMCADTargetAccess().getLibrariesMFlatServiceLibraryInstanceParserRuleCall_3_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__ClientInstanceAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getClientInstanceMFlatComponentInstanceCrossReference_2_0()); }
(
{ before(grammarAccess.getMFlatConnectionAccess().getClientInstanceMFlatComponentInstanceIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getMFlatConnectionAccess().getClientInstanceMFlatComponentInstanceIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMFlatConnectionAccess().getClientInstanceMFlatComponentInstanceCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__ClientPortAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getClientPortMClientPortCrossReference_4_0()); }
(
{ before(grammarAccess.getMFlatConnectionAccess().getClientPortMClientPortIDTerminalRuleCall_4_0_1()); }
	RULE_ID{ after(grammarAccess.getMFlatConnectionAccess().getClientPortMClientPortIDTerminalRuleCall_4_0_1()); }
)
{ after(grammarAccess.getMFlatConnectionAccess().getClientPortMClientPortCrossReference_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__ServerInstanceAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getServerInstanceMFlatComponentInstanceCrossReference_6_0()); }
(
{ before(grammarAccess.getMFlatConnectionAccess().getServerInstanceMFlatComponentInstanceIDTerminalRuleCall_6_0_1()); }
	RULE_ID{ after(grammarAccess.getMFlatConnectionAccess().getServerInstanceMFlatComponentInstanceIDTerminalRuleCall_6_0_1()); }
)
{ after(grammarAccess.getMFlatConnectionAccess().getServerInstanceMFlatComponentInstanceCrossReference_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__ServerPortAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getServerPortMServerPortCrossReference_8_0()); }
(
{ before(grammarAccess.getMFlatConnectionAccess().getServerPortMServerPortIDTerminalRuleCall_8_0_1()); }
	RULE_ID{ after(grammarAccess.getMFlatConnectionAccess().getServerPortMServerPortIDTerminalRuleCall_8_0_1()); }
)
{ after(grammarAccess.getMFlatConnectionAccess().getServerPortMServerPortCrossReference_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__ConnectorAssignment_10
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getConnectorMConnectorCrossReference_10_0()); }
(
{ before(grammarAccess.getMFlatConnectionAccess().getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_10_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMFlatConnectionAccess().getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_10_0_1()); }
)
{ after(grammarAccess.getMFlatConnectionAccess().getConnectorMConnectorCrossReference_10_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__IfaceMappingAssignment_12_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_12_2_0()); }
(
{ before(grammarAccess.getMFlatConnectionAccess().getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_12_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMFlatConnectionAccess().getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_12_2_0_1()); }
)
{ after(grammarAccess.getMFlatConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_12_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatConnection__AttributeValueAssignmentsAssignment_13
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatConnectionAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0()); }
	ruleMAttributeValueAssignment{ after(grammarAccess.getMFlatConnectionAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatComponentInstance__ComponentAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getComponentMComponentCrossReference_2_0()); }
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getComponentMComponentVersionedQualifiedNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMFlatComponentInstanceAccess().getComponentMComponentVersionedQualifiedNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMFlatComponentInstanceAccess().getComponentMComponentCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatComponentInstance__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMFlatComponentInstanceAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatComponentInstance__AttributeValueAssignmentsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatComponentInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0()); }
	ruleMAttributeValueAssignment{ after(grammarAccess.getMFlatComponentInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularFlatServiceLibraryInstance__LibraryAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryMServiceLibraryCrossReference_1_0()); }
(
{ before(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryMServiceLibraryCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularFlatServiceLibraryInstance__AttributeValueAssignmentsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0()); }
	ruleMAttributeValueAssignment{ after(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__LibraryAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getLibraryMServiceLibraryCrossReference_2_0()); }
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getLibraryMServiceLibraryCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__AttributeValueAssignmentsAssignment_4_0_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0()); }
	ruleMAttributeValueAssignment{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDriverSLibInstance__DeviceDriverMappingsAssignment_4_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceDriverMappingsMFlatDeviceDriverMappingParserRuleCall_4_1_3_0()); }
	ruleMFlatDeviceDriverMapping{ after(grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceDriverMappingsMFlatDeviceDriverMappingParserRuleCall_4_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDeviceDriverMapping__SupportedDeviceAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0()); }
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MFlatDeviceDriverMapping__DeployedDeviceAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceCrossReference_6_0()); }
(
{ before(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1()); }
)
{ after(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceCrossReference_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAttributeValueAssignment__ParameterAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAttributeValueAssignmentAccess().getParameterMParameterCrossReference_1_0()); }
(
{ before(grammarAccess.getMAttributeValueAssignmentAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMAttributeValueAssignmentAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMAttributeValueAssignmentAccess().getParameterMParameterCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAttributeValueAssignment__ParameterValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAttributeValueAssignmentAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMAttributeValueAssignmentAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueBooleanLiteral__ValueAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueEBooleanParserRuleCall_1_0()); }
	ruleEBoolean{ after(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueEBooleanParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueStringLiteral__IsRawAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0()); }
(
{ before(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0()); }

	'raw' 

{ after(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0()); }
)

{ after(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueStringLiteral__ValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueIntegerLiteral__ValueAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueINTEGERParserRuleCall_1_0()); }
	ruleINTEGER{ after(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueINTEGERParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueRealLiteral__ValueAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueRealLiteralAccess().getValueREALParserRuleCall_1_0()); }
	ruleREAL{ after(grammarAccess.getMParameterValueRealLiteralAccess().getValueREALParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueRefObject__ObjectAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjCrossReference_1_0()); }
(
{ before(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValuePAR__ValueAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValuePARAccess().getValueMParameterValueExpressionParserRuleCall_1_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMParameterValuePARAccess().getValueMParameterValueExpressionParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueExpression__LeftAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0()); }
	ruleMParameterValueTERM{ after(grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueExpression__OperationAssignment_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0()); }
	ruleMParameterValueExpressionOperators{ after(grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueExpression__RightAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueExpressionAccess().getRightMParameterValueExpressionParserRuleCall_2_1_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMParameterValueExpressionAccess().getRightMParameterValueExpressionParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueTERM__LeftAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0()); }
	ruleMParameterValue{ after(grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueTERM__OperationAssignment_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0()); }
	ruleMParameterValueTERMOperators{ after(grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueTERM__RightAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueTERMAccess().getRightMParameterValueTERMParserRuleCall_2_1_0()); }
	ruleMParameterValueTERM{ after(grammarAccess.getMParameterValueTERMAccess().getRightMParameterValueTERMParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


