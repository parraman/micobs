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
grammar InternalCMP;

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
import es.uah.aut.srg.micobs.mclev.lang.services.CMPGrammarAccess;

}

@parser::members {
 
 	private CMPGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(CMPGrammarAccess grammarAccess) {
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




// Entry rule entryRuleMMCLEVCMPPackageFile
entryRuleMMCLEVCMPPackageFile 
:
{ before(grammarAccess.getMMCLEVCMPPackageFileRule()); }
	 ruleMMCLEVCMPPackageFile
{ after(grammarAccess.getMMCLEVCMPPackageFileRule()); } 
	 EOF 
;

// Rule MMCLEVCMPPackageFile
ruleMMCLEVCMPPackageFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getGroup()); }
(rule__MMCLEVCMPPackageFile__Group__0)
{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMCLEVCMPPackageElement
entryRuleMMCLEVCMPPackageElement 
:
{ before(grammarAccess.getMMCLEVCMPPackageElementRule()); }
	 ruleMMCLEVCMPPackageElement
{ after(grammarAccess.getMMCLEVCMPPackageElementRule()); } 
	 EOF 
;

// Rule MMCLEVCMPPackageElement
ruleMMCLEVCMPPackageElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMCLEVCMPPackageElementAccess().getAlternatives()); }
(rule__MMCLEVCMPPackageElement__Alternatives)
{ after(grammarAccess.getMMCLEVCMPPackageElementAccess().getAlternatives()); }
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



// Entry rule entryRuleMPort
entryRuleMPort 
:
{ before(grammarAccess.getMPortRule()); }
	 ruleMPort
{ after(grammarAccess.getMPortRule()); } 
	 EOF 
;

// Rule MPort
ruleMPort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMPortAccess().getAlternatives()); }
(rule__MPort__Alternatives)
{ after(grammarAccess.getMPortAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMInternalConnection
entryRuleMInternalConnection 
:
{ before(grammarAccess.getMInternalConnectionRule()); }
	 ruleMInternalConnection
{ after(grammarAccess.getMInternalConnectionRule()); } 
	 EOF 
;

// Rule MInternalConnection
ruleMInternalConnection
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMInternalConnectionAccess().getAlternatives()); }
(rule__MInternalConnection__Alternatives)
{ after(grammarAccess.getMInternalConnectionAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMAbstractComponent
entryRuleMAbstractComponent 
:
{ before(grammarAccess.getMAbstractComponentRule()); }
	 ruleMAbstractComponent
{ after(grammarAccess.getMAbstractComponentRule()); } 
	 EOF 
;

// Rule MAbstractComponent
ruleMAbstractComponent
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMAbstractComponentAccess().getGroup()); }
(rule__MAbstractComponent__Group__0)
{ after(grammarAccess.getMAbstractComponentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMComponent
entryRuleMComponent 
:
{ before(grammarAccess.getMComponentRule()); }
	 ruleMComponent
{ after(grammarAccess.getMComponentRule()); } 
	 EOF 
;

// Rule MComponent
ruleMComponent
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMComponentAccess().getGroup()); }
(rule__MComponent__Group__0)
{ after(grammarAccess.getMComponentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMInternalComponentInstance
entryRuleMInternalComponentInstance 
:
{ before(grammarAccess.getMInternalComponentInstanceRule()); }
	 ruleMInternalComponentInstance
{ after(grammarAccess.getMInternalComponentInstanceRule()); } 
	 EOF 
;

// Rule MInternalComponentInstance
ruleMInternalComponentInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getGroup()); }
(rule__MInternalComponentInstance__Group__0)
{ after(grammarAccess.getMInternalComponentInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMServerPort
entryRuleMServerPort 
:
{ before(grammarAccess.getMServerPortRule()); }
	 ruleMServerPort
{ after(grammarAccess.getMServerPortRule()); } 
	 EOF 
;

// Rule MServerPort
ruleMServerPort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMServerPortAccess().getGroup()); }
(rule__MServerPort__Group__0)
{ after(grammarAccess.getMServerPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMClientPort
entryRuleMClientPort 
:
{ before(grammarAccess.getMClientPortRule()); }
	 ruleMClientPort
{ after(grammarAccess.getMClientPortRule()); } 
	 EOF 
;

// Rule MClientPort
ruleMClientPort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMClientPortAccess().getGroup()); }
(rule__MClientPort__Group__0)
{ after(grammarAccess.getMClientPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterValueAssignment
entryRuleMParameterValueAssignment 
:
{ before(grammarAccess.getMParameterValueAssignmentRule()); }
	 ruleMParameterValueAssignment
{ after(grammarAccess.getMParameterValueAssignmentRule()); } 
	 EOF 
;

// Rule MParameterValueAssignment
ruleMParameterValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterValueAssignmentAccess().getGroup()); }
(rule__MParameterValueAssignment__Group__0)
{ after(grammarAccess.getMParameterValueAssignmentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameter
entryRuleMParameter 
:
{ before(grammarAccess.getMParameterRule()); }
	 ruleMParameter
{ after(grammarAccess.getMParameterRule()); } 
	 EOF 
;

// Rule MParameter
ruleMParameter
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterAccess().getAlternatives()); }
(rule__MParameter__Alternatives)
{ after(grammarAccess.getMParameterAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMIntegerParameterSingleExpression
entryRuleMIntegerParameterSingleExpression 
:
{ before(grammarAccess.getMIntegerParameterSingleExpressionRule()); }
	 ruleMIntegerParameterSingleExpression
{ after(grammarAccess.getMIntegerParameterSingleExpressionRule()); } 
	 EOF 
;

// Rule MIntegerParameterSingleExpression
ruleMIntegerParameterSingleExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup()); }
(rule__MIntegerParameterSingleExpression__Group__0)
{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParameterDefinition
entryRuleMEnumParameterDefinition 
:
{ before(grammarAccess.getMEnumParameterDefinitionRule()); }
	 ruleMEnumParameterDefinition
{ after(grammarAccess.getMEnumParameterDefinitionRule()); } 
	 EOF 
;

// Rule MEnumParameterDefinition
ruleMEnumParameterDefinition
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getGroup()); }
(rule__MEnumParameterDefinition__Group__0)
{ after(grammarAccess.getMEnumParameterDefinitionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParameterSingleExpression
entryRuleMEnumParameterSingleExpression 
:
{ before(grammarAccess.getMEnumParameterSingleExpressionRule()); }
	 ruleMEnumParameterSingleExpression
{ after(grammarAccess.getMEnumParameterSingleExpressionRule()); } 
	 EOF 
;

// Rule MEnumParameterSingleExpression
ruleMEnumParameterSingleExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getGroup()); }
(rule__MEnumParameterSingleExpression__Group__0)
{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMRealParameterSingleExpression
entryRuleMRealParameterSingleExpression 
:
{ before(grammarAccess.getMRealParameterSingleExpressionRule()); }
	 ruleMRealParameterSingleExpression
{ after(grammarAccess.getMRealParameterSingleExpressionRule()); } 
	 EOF 
;

// Rule MRealParameterSingleExpression
ruleMRealParameterSingleExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup()); }
(rule__MRealParameterSingleExpression__Group__0)
{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParameterLiteralRule
entryRuleMEnumParameterLiteralRule 
:
{ before(grammarAccess.getMEnumParameterLiteralRuleRule()); }
	 ruleMEnumParameterLiteralRule
{ after(grammarAccess.getMEnumParameterLiteralRuleRule()); } 
	 EOF 
;

// Rule MEnumParameterLiteralRule
ruleMEnumParameterLiteralRule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives()); }
(rule__MEnumParameterLiteralRule__Alternatives)
{ after(grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives()); }
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



// Entry rule entryRuleMParameterRange
entryRuleMParameterRange 
:
{ before(grammarAccess.getMParameterRangeRule()); }
	 ruleMParameterRange
{ after(grammarAccess.getMParameterRangeRule()); } 
	 EOF 
;

// Rule MParameterRange
ruleMParameterRange
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterRangeAccess().getAlternatives()); }
(rule__MParameterRange__Alternatives)
{ after(grammarAccess.getMParameterRangeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterOCR
entryRuleMParameterOCR 
:
{ before(grammarAccess.getMParameterOCRRule()); }
	 ruleMParameterOCR
{ after(grammarAccess.getMParameterOCRRule()); } 
	 EOF 
;

// Rule MParameterOCR
ruleMParameterOCR
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterOCRAccess().getGroup()); }
(rule__MParameterOCR__Group__0)
{ after(grammarAccess.getMParameterOCRAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterOOR
entryRuleMParameterOOR 
:
{ before(grammarAccess.getMParameterOORRule()); }
	 ruleMParameterOOR
{ after(grammarAccess.getMParameterOORRule()); } 
	 EOF 
;

// Rule MParameterOOR
ruleMParameterOOR
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterOORAccess().getGroup()); }
(rule__MParameterOOR__Group__0)
{ after(grammarAccess.getMParameterOORAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterCOR
entryRuleMParameterCOR 
:
{ before(grammarAccess.getMParameterCORRule()); }
	 ruleMParameterCOR
{ after(grammarAccess.getMParameterCORRule()); } 
	 EOF 
;

// Rule MParameterCOR
ruleMParameterCOR
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterCORAccess().getGroup()); }
(rule__MParameterCOR__Group__0)
{ after(grammarAccess.getMParameterCORAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterCCR
entryRuleMParameterCCR 
:
{ before(grammarAccess.getMParameterCCRRule()); }
	 ruleMParameterCCR
{ after(grammarAccess.getMParameterCCRRule()); } 
	 EOF 
;

// Rule MParameterCCR
ruleMParameterCCR
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterCCRAccess().getGroup()); }
(rule__MParameterCCR__Group__0)
{ after(grammarAccess.getMParameterCCRAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParameterLiteral
entryRuleMEnumParameterLiteral 
:
{ before(grammarAccess.getMEnumParameterLiteralRule()); }
	 ruleMEnumParameterLiteral
{ after(grammarAccess.getMEnumParameterLiteralRule()); } 
	 EOF 
;

// Rule MEnumParameterLiteral
ruleMEnumParameterLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParameterLiteralAccess().getGroup()); }
(rule__MEnumParameterLiteral__Group__0)
{ after(grammarAccess.getMEnumParameterLiteralAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParamIntegerLiteral
entryRuleMEnumParamIntegerLiteral 
:
{ before(grammarAccess.getMEnumParamIntegerLiteralRule()); }
	 ruleMEnumParamIntegerLiteral
{ after(grammarAccess.getMEnumParamIntegerLiteralRule()); } 
	 EOF 
;

// Rule MEnumParamIntegerLiteral
ruleMEnumParamIntegerLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParamIntegerLiteralAccess().getGroup()); }
(rule__MEnumParamIntegerLiteral__Group__0)
{ after(grammarAccess.getMEnumParamIntegerLiteralAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParamRealLiteral
entryRuleMEnumParamRealLiteral 
:
{ before(grammarAccess.getMEnumParamRealLiteralRule()); }
	 ruleMEnumParamRealLiteral
{ after(grammarAccess.getMEnumParamRealLiteralRule()); } 
	 EOF 
;

// Rule MEnumParamRealLiteral
ruleMEnumParamRealLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParamRealLiteralAccess().getGroup()); }
(rule__MEnumParamRealLiteral__Group__0)
{ after(grammarAccess.getMEnumParamRealLiteralAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParamStringLiteral
entryRuleMEnumParamStringLiteral 
:
{ before(grammarAccess.getMEnumParamStringLiteralRule()); }
	 ruleMEnumParamStringLiteral
{ after(grammarAccess.getMEnumParamStringLiteralRule()); } 
	 EOF 
;

// Rule MEnumParamStringLiteral
ruleMEnumParamStringLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParamStringLiteralAccess().getGroup()); }
(rule__MEnumParamStringLiteral__Group__0)
{ after(grammarAccess.getMEnumParamStringLiteralAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMBooleanParameterSingleExpression
entryRuleMBooleanParameterSingleExpression 
:
{ before(grammarAccess.getMBooleanParameterSingleExpressionRule()); }
	 ruleMBooleanParameterSingleExpression
{ after(grammarAccess.getMBooleanParameterSingleExpressionRule()); } 
	 EOF 
;

// Rule MBooleanParameterSingleExpression
ruleMBooleanParameterSingleExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getGroup()); }
(rule__MBooleanParameterSingleExpression__Group__0)
{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMStringParameterSingleExpression
entryRuleMStringParameterSingleExpression 
:
{ before(grammarAccess.getMStringParameterSingleExpressionRule()); }
	 ruleMStringParameterSingleExpression
{ after(grammarAccess.getMStringParameterSingleExpressionRule()); } 
	 EOF 
;

// Rule MStringParameterSingleExpression
ruleMStringParameterSingleExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getGroup()); }
(rule__MStringParameterSingleExpression__Group__0)
{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMInternalComponentConnection
entryRuleMInternalComponentConnection 
:
{ before(grammarAccess.getMInternalComponentConnectionRule()); }
	 ruleMInternalComponentConnection
{ after(grammarAccess.getMInternalComponentConnectionRule()); } 
	 EOF 
;

// Rule MInternalComponentConnection
ruleMInternalComponentConnection
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getGroup()); }
(rule__MInternalComponentConnection__Group__0)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMInternalComponentPlatformSwitch
entryRuleMInternalComponentPlatformSwitch 
:
{ before(grammarAccess.getMInternalComponentPlatformSwitchRule()); }
	 ruleMInternalComponentPlatformSwitch
{ after(grammarAccess.getMInternalComponentPlatformSwitchRule()); } 
	 EOF 
;

// Rule MInternalComponentPlatformSwitch
ruleMInternalComponentPlatformSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getGroup()); }
(rule__MInternalComponentPlatformSwitch__Group__0)
{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMInternalComponentPlatformSwitchCase
entryRuleMInternalComponentPlatformSwitchCase 
:
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseRule()); }
	 ruleMInternalComponentPlatformSwitchCase
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseRule()); } 
	 EOF 
;

// Rule MInternalComponentPlatformSwitchCase
ruleMInternalComponentPlatformSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup()); }
(rule__MInternalComponentPlatformSwitchCase__Group__0)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleComponentSupportedPlatform
entryRuleComponentSupportedPlatform 
:
{ before(grammarAccess.getComponentSupportedPlatformRule()); }
	 ruleComponentSupportedPlatform
{ after(grammarAccess.getComponentSupportedPlatformRule()); } 
	 EOF 
;

// Rule ComponentSupportedPlatform
ruleComponentSupportedPlatform
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup()); }
(rule__ComponentSupportedPlatform__Group__0)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup()); }
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



rule__MMCLEVCMPPackageElement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVCMPPackageElementAccess().getMAbstractComponentParserRuleCall_0()); }
	ruleMAbstractComponent
{ after(grammarAccess.getMMCLEVCMPPackageElementAccess().getMAbstractComponentParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMMCLEVCMPPackageElementAccess().getMComponentParserRuleCall_1()); }
	ruleMComponent
{ after(grammarAccess.getMMCLEVCMPPackageElementAccess().getMComponentParserRuleCall_1()); }
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

rule__MPort__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortAccess().getMServerPortParserRuleCall_0()); }
	ruleMServerPort
{ after(grammarAccess.getMPortAccess().getMServerPortParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMPortAccess().getMClientPortParserRuleCall_1()); }
	ruleMClientPort
{ after(grammarAccess.getMPortAccess().getMClientPortParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalConnection__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalConnectionAccess().getMInternalComponentConnectionParserRuleCall_0()); }
	ruleMInternalComponentConnection
{ after(grammarAccess.getMInternalConnectionAccess().getMInternalComponentConnectionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMInternalConnectionAccess().getMInternalComponentPlatformSwitchParserRuleCall_1()); }
	ruleMInternalComponentPlatformSwitch
{ after(grammarAccess.getMInternalConnectionAccess().getMInternalComponentPlatformSwitchParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameter__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); }
	ruleMIntegerParameterSingleExpression
{ after(grammarAccess.getMParameterAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); }
	ruleMEnumParameterSingleExpression
{ after(grammarAccess.getMParameterAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); }
	ruleMBooleanParameterSingleExpression
{ after(grammarAccess.getMParameterAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMRealParameterSingleExpressionParserRuleCall_3()); }
	ruleMRealParameterSingleExpression
{ after(grammarAccess.getMParameterAccess().getMRealParameterSingleExpressionParserRuleCall_3()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMStringParameterSingleExpressionParserRuleCall_4()); }
	ruleMStringParameterSingleExpression
{ after(grammarAccess.getMParameterAccess().getMStringParameterSingleExpressionParserRuleCall_4()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMEnumParameterDefinitionParserRuleCall_5()); }
	ruleMEnumParameterDefinition
{ after(grammarAccess.getMParameterAccess().getMEnumParameterDefinitionParserRuleCall_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterLiteralRule__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParameterLiteralParserRuleCall_0()); }
	ruleMEnumParameterLiteral
{ after(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParameterLiteralParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamIntegerLiteralParserRuleCall_1()); }
	ruleMEnumParamIntegerLiteral
{ after(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamIntegerLiteralParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamRealLiteralParserRuleCall_2()); }
	ruleMEnumParamRealLiteral
{ after(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamRealLiteralParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamStringLiteralParserRuleCall_3()); }
	ruleMEnumParamStringLiteral
{ after(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamStringLiteralParserRuleCall_3()); }
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

rule__MParameterRange__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterRangeAccess().getMParameterOCRParserRuleCall_0()); }
	ruleMParameterOCR
{ after(grammarAccess.getMParameterRangeAccess().getMParameterOCRParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMParameterRangeAccess().getMParameterOORParserRuleCall_1()); }
	ruleMParameterOOR
{ after(grammarAccess.getMParameterRangeAccess().getMParameterOORParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getMParameterRangeAccess().getMParameterCORParserRuleCall_2()); }
	ruleMParameterCOR
{ after(grammarAccess.getMParameterRangeAccess().getMParameterCORParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getMParameterRangeAccess().getMParameterCCRParserRuleCall_3()); }
	ruleMParameterCCR
{ after(grammarAccess.getMParameterRangeAccess().getMParameterCCRParserRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Alternatives_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getThisKeyword_2_0()); }

	'this' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getThisKeyword_2_0()); }
)

    |(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getClientInstanceAssignment_2_1()); }
(rule__MInternalComponentConnection__ClientInstanceAssignment_2_1)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getClientInstanceAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Alternatives_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getThisKeyword_6_0()); }

	'this' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getThisKeyword_6_0()); }
)

    |(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getServerInstanceAssignment_6_1()); }
(rule__MInternalComponentConnection__ServerInstanceAssignment_6_1)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getServerInstanceAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__Alternatives_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getThisKeyword_2_0()); }

	'this' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getThisKeyword_2_0()); }
)

    |(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientInstanceAssignment_2_1()); }
(rule__MInternalComponentPlatformSwitch__ClientInstanceAssignment_2_1)
{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientInstanceAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Alternatives_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getThisKeyword_3_0()); }

	'this' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getThisKeyword_3_0()); }
)

    |(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerInstanceAssignment_3_1()); }
(rule__MInternalComponentPlatformSwitchCase__ServerInstanceAssignment_3_1)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerInstanceAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Alternatives_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_0_2_0()); }

	'any' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_0_2_0()); }
)

    |(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getOsapiAssignment_5_0_2_1()); }
(rule__ComponentSupportedPlatform__OsapiAssignment_5_0_2_1)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getOsapiAssignment_5_0_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Alternatives_5_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_1_2_0()); }

	'any' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_1_2_0()); }
)

    |(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getOsAssignment_5_1_2_1()); }
(rule__ComponentSupportedPlatform__OsAssignment_5_1_2_1)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getOsAssignment_5_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Alternatives_5_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_2_2_0()); }

	'any' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_2_2_0()); }
)

    |(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1()); }
(rule__ComponentSupportedPlatform__ArchitectureAssignment_5_2_2_1)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Alternatives_5_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_4_2_0()); }

	'any' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_4_2_0()); }
)

    |(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1()); }
(rule__ComponentSupportedPlatform__MicroprocessorAssignment_5_4_2_1)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Alternatives_5_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_5_2_0()); }

	'any' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_5_2_0()); }
)

    |(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getBoardAssignment_5_5_2_1()); }
(rule__ComponentSupportedPlatform__BoardAssignment_5_5_2_1)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getBoardAssignment_5_5_2_1()); }
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



rule__MMCLEVCMPPackageFile__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVCMPPackageFile__Group__0__Impl
	rule__MMCLEVCMPPackageFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVCMPPackageFile__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVCMPPackageFile__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVCMPPackageFile__Group__1__Impl
	rule__MMCLEVCMPPackageFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVCMPPackageFile__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageAssignment_1()); }
(rule__MMCLEVCMPPackageFile__PackageAssignment_1)
{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVCMPPackageFile__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVCMPPackageFile__Group__2__Impl
	rule__MMCLEVCMPPackageFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVCMPPackageFile__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVCMPPackageFile__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVCMPPackageFile__Group__3__Impl
	rule__MMCLEVCMPPackageFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVCMPPackageFile__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getGroup_3()); }
(rule__MMCLEVCMPPackageFile__Group_3__0)*
{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVCMPPackageFile__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVCMPPackageFile__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVCMPPackageFile__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getElementAssignment_4()); }
(rule__MMCLEVCMPPackageFile__ElementAssignment_4)
{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getElementAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMCLEVCMPPackageFile__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVCMPPackageFile__Group_3__0__Impl
	rule__MMCLEVCMPPackageFile__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVCMPPackageFile__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getImportKeyword_3_0()); }

	'import' 

{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getImportKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVCMPPackageFile__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVCMPPackageFile__Group_3__1__Impl
	rule__MMCLEVCMPPackageFile__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVCMPPackageFile__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getImportsAssignment_3_1()); }
(rule__MMCLEVCMPPackageFile__ImportsAssignment_3_1)
{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getImportsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVCMPPackageFile__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVCMPPackageFile__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVCMPPackageFile__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getSemicolonKeyword_3_2()); }
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






rule__MAbstractComponent__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group__0__Impl
	rule__MAbstractComponent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getAbstractKeyword_0()); }

	'abstract' 

{ after(grammarAccess.getMAbstractComponentAccess().getAbstractKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group__1__Impl
	rule__MAbstractComponent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getComponentKeyword_1()); }

	'component' 

{ after(grammarAccess.getMAbstractComponentAccess().getComponentKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group__2__Impl
	rule__MAbstractComponent__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getDomainAssignment_2()); }
(rule__MAbstractComponent__DomainAssignment_2)
{ after(grammarAccess.getMAbstractComponentAccess().getDomainAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group__3__Impl
	rule__MAbstractComponent__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getColonColonKeyword_3()); }

	'::' 

{ after(grammarAccess.getMAbstractComponentAccess().getColonColonKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group__4__Impl
	rule__MAbstractComponent__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getTypeAssignment_4()); }
(rule__MAbstractComponent__TypeAssignment_4)
{ after(grammarAccess.getMAbstractComponentAccess().getTypeAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group__5__Impl
	rule__MAbstractComponent__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getNameAssignment_5()); }
(rule__MAbstractComponent__NameAssignment_5)
{ after(grammarAccess.getMAbstractComponentAccess().getNameAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group__6__Impl
	rule__MAbstractComponent__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getGroup_6()); }
(rule__MAbstractComponent__Group_6__0)?
{ after(grammarAccess.getMAbstractComponentAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group__7__Impl
	rule__MAbstractComponent__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_7()); }

	'{' 

{ after(grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group__8__Impl
	rule__MAbstractComponent__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8()); }
(rule__MAbstractComponent__UnorderedGroup_8)
{ after(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group__9__Impl
	rule__MAbstractComponent__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_9()); }

	'}' 

{ after(grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_10()); }

	';' 

{ after(grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}
























rule__MAbstractComponent__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_6__0__Impl
	rule__MAbstractComponent__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getInheritsKeyword_6_0()); }

	'inherits' 

{ after(grammarAccess.getMAbstractComponentAccess().getInheritsKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_6__1__Impl
	rule__MAbstractComponent__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getInheritsAssignment_6_1()); }
(rule__MAbstractComponent__InheritsAssignment_6_1)
{ after(grammarAccess.getMAbstractComponentAccess().getInheritsAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getGroup_6_2()); }
(rule__MAbstractComponent__Group_6_2__0)*
{ after(grammarAccess.getMAbstractComponentAccess().getGroup_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MAbstractComponent__Group_6_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_6_2__0__Impl
	rule__MAbstractComponent__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_6_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getCommaKeyword_6_2_0()); }

	',' 

{ after(grammarAccess.getMAbstractComponentAccess().getCommaKeyword_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_6_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_6_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_6_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getInheritsAssignment_6_2_1()); }
(rule__MAbstractComponent__InheritsAssignment_6_2_1)
{ after(grammarAccess.getMAbstractComponentAccess().getInheritsAssignment_6_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MAbstractComponent__Group_8_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_0__0__Impl
	rule__MAbstractComponent__Group_8_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getVersionKeyword_8_0_0()); }

	'version' 

{ after(grammarAccess.getMAbstractComponentAccess().getVersionKeyword_8_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_0__1__Impl
	rule__MAbstractComponent__Group_8_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getColonEqualsSignKeyword_8_0_1()); }

	':=' 

{ after(grammarAccess.getMAbstractComponentAccess().getColonEqualsSignKeyword_8_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_0__2__Impl
	rule__MAbstractComponent__Group_8_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getVersionAssignment_8_0_2()); }
(rule__MAbstractComponent__VersionAssignment_8_0_2)
{ after(grammarAccess.getMAbstractComponentAccess().getVersionAssignment_8_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_0_3()); }

	';' 

{ after(grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MAbstractComponent__Group_8_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_1__0__Impl
	rule__MAbstractComponent__Group_8_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getAttributesKeyword_8_1_0()); }

	'attributes' 

{ after(grammarAccess.getMAbstractComponentAccess().getAttributesKeyword_8_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_1__1__Impl
	rule__MAbstractComponent__Group_8_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_1_1()); }

	'{' 

{ after(grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_1__2__Impl
	rule__MAbstractComponent__Group_8_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAbstractComponentAccess().getAttributesAssignment_8_1_2()); }
(rule__MAbstractComponent__AttributesAssignment_8_1_2)
{ after(grammarAccess.getMAbstractComponentAccess().getAttributesAssignment_8_1_2()); }
)
(
{ before(grammarAccess.getMAbstractComponentAccess().getAttributesAssignment_8_1_2()); }
(rule__MAbstractComponent__AttributesAssignment_8_1_2)*
{ after(grammarAccess.getMAbstractComponentAccess().getAttributesAssignment_8_1_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_1__3__Impl
	rule__MAbstractComponent__Group_8_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_1_3()); }

	'}' 

{ after(grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_1_4()); }

	';' 

{ after(grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MAbstractComponent__Group_8_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_2__0__Impl
	rule__MAbstractComponent__Group_8_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getAttributeKeyword_8_2_0()); }

	'attribute' 

{ after(grammarAccess.getMAbstractComponentAccess().getAttributeKeyword_8_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_2__1__Impl
	rule__MAbstractComponent__Group_8_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getValuesKeyword_8_2_1()); }

	'values' 

{ after(grammarAccess.getMAbstractComponentAccess().getValuesKeyword_8_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_2__2__Impl
	rule__MAbstractComponent__Group_8_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_2_2()); }

	'{' 

{ after(grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_2__3__Impl
	rule__MAbstractComponent__Group_8_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getAttributeValueAssignmentsAssignment_8_2_3()); }
(rule__MAbstractComponent__AttributeValueAssignmentsAssignment_8_2_3)*
{ after(grammarAccess.getMAbstractComponentAccess().getAttributeValueAssignmentsAssignment_8_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_2__4__Impl
	rule__MAbstractComponent__Group_8_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_2_4()); }

	'}' 

{ after(grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_2_5()); }

	';' 

{ after(grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MAbstractComponent__Group_8_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_3__0__Impl
	rule__MAbstractComponent__Group_8_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getExternalKeyword_8_3_0()); }

	'external' 

{ after(grammarAccess.getMAbstractComponentAccess().getExternalKeyword_8_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_3__1__Impl
	rule__MAbstractComponent__Group_8_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getPortsKeyword_8_3_1()); }

	'ports' 

{ after(grammarAccess.getMAbstractComponentAccess().getPortsKeyword_8_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_3__2__Impl
	rule__MAbstractComponent__Group_8_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_3_2()); }

	'{' 

{ after(grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_3__3__Impl
	rule__MAbstractComponent__Group_8_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAbstractComponentAccess().getExternalPortsAssignment_8_3_3()); }
(rule__MAbstractComponent__ExternalPortsAssignment_8_3_3)
{ after(grammarAccess.getMAbstractComponentAccess().getExternalPortsAssignment_8_3_3()); }
)
(
{ before(grammarAccess.getMAbstractComponentAccess().getExternalPortsAssignment_8_3_3()); }
(rule__MAbstractComponent__ExternalPortsAssignment_8_3_3)*
{ after(grammarAccess.getMAbstractComponentAccess().getExternalPortsAssignment_8_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_3__4__Impl
	rule__MAbstractComponent__Group_8_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_3_4()); }

	'}' 

{ after(grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__Group_8_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__Group_8_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__Group_8_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_3_5()); }

	';' 

{ after(grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MComponent__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group__0__Impl
	rule__MComponent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getMComponentAction_0()); }
(

)
{ after(grammarAccess.getMComponentAccess().getMComponentAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group__1__Impl
	rule__MComponent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getComponentKeyword_1()); }

	'component' 

{ after(grammarAccess.getMComponentAccess().getComponentKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group__2__Impl
	rule__MComponent__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getDomainAssignment_2()); }
(rule__MComponent__DomainAssignment_2)
{ after(grammarAccess.getMComponentAccess().getDomainAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group__3__Impl
	rule__MComponent__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getColonColonKeyword_3()); }

	'::' 

{ after(grammarAccess.getMComponentAccess().getColonColonKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group__4__Impl
	rule__MComponent__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getTypeAssignment_4()); }
(rule__MComponent__TypeAssignment_4)
{ after(grammarAccess.getMComponentAccess().getTypeAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group__5__Impl
	rule__MComponent__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getNameAssignment_5()); }
(rule__MComponent__NameAssignment_5)
{ after(grammarAccess.getMComponentAccess().getNameAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group__6__Impl
	rule__MComponent__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getGroup_6()); }
(rule__MComponent__Group_6__0)?
{ after(grammarAccess.getMComponentAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group__7__Impl
	rule__MComponent__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_7()); }

	'{' 

{ after(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group__8__Impl
	rule__MComponent__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getUnorderedGroup_8()); }
(rule__MComponent__UnorderedGroup_8)
{ after(grammarAccess.getMComponentAccess().getUnorderedGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group__9__Impl
	rule__MComponent__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_9()); }

	'}' 

{ after(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSemicolonKeyword_10()); }

	';' 

{ after(grammarAccess.getMComponentAccess().getSemicolonKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}
























rule__MComponent__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_6__0__Impl
	rule__MComponent__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getInheritsKeyword_6_0()); }

	'inherits' 

{ after(grammarAccess.getMComponentAccess().getInheritsKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_6__1__Impl
	rule__MComponent__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getInheritsAssignment_6_1()); }
(rule__MComponent__InheritsAssignment_6_1)
{ after(grammarAccess.getMComponentAccess().getInheritsAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getGroup_6_2()); }
(rule__MComponent__Group_6_2__0)*
{ after(grammarAccess.getMComponentAccess().getGroup_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MComponent__Group_6_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_6_2__0__Impl
	rule__MComponent__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_6_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getCommaKeyword_6_2_0()); }

	',' 

{ after(grammarAccess.getMComponentAccess().getCommaKeyword_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_6_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_6_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_6_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getInheritsAssignment_6_2_1()); }
(rule__MComponent__InheritsAssignment_6_2_1)
{ after(grammarAccess.getMComponentAccess().getInheritsAssignment_6_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MComponent__Group_8_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_0__0__Impl
	rule__MComponent__Group_8_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getVersionKeyword_8_0_0()); }

	'version' 

{ after(grammarAccess.getMComponentAccess().getVersionKeyword_8_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_0__1__Impl
	rule__MComponent__Group_8_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_0_1()); }

	':=' 

{ after(grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_0__2__Impl
	rule__MComponent__Group_8_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getVersionAssignment_8_0_2()); }
(rule__MComponent__VersionAssignment_8_0_2)
{ after(grammarAccess.getMComponentAccess().getVersionAssignment_8_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_0_3()); }

	';' 

{ after(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MComponent__Group_8_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_1__0__Impl
	rule__MComponent__Group_8_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLanguagesKeyword_8_1_0()); }

	'languages' 

{ after(grammarAccess.getMComponentAccess().getLanguagesKeyword_8_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_1__1__Impl
	rule__MComponent__Group_8_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_1_1()); }

	':=' 

{ after(grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_1__2__Impl
	rule__MComponent__Group_8_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLanguagesAssignment_8_1_2()); }
(rule__MComponent__LanguagesAssignment_8_1_2)
{ after(grammarAccess.getMComponentAccess().getLanguagesAssignment_8_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_1__3__Impl
	rule__MComponent__Group_8_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getGroup_8_1_3()); }
(rule__MComponent__Group_8_1_3__0)*
{ after(grammarAccess.getMComponentAccess().getGroup_8_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_1_4()); }

	';' 

{ after(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MComponent__Group_8_1_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_1_3__0__Impl
	rule__MComponent__Group_8_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_1_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getCommaKeyword_8_1_3_0()); }

	',' 

{ after(grammarAccess.getMComponentAccess().getCommaKeyword_8_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_1_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_1_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLanguagesAssignment_8_1_3_1()); }
(rule__MComponent__LanguagesAssignment_8_1_3_1)
{ after(grammarAccess.getMComponentAccess().getLanguagesAssignment_8_1_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MComponent__Group_8_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_2__0__Impl
	rule__MComponent__Group_8_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getAttributesKeyword_8_2_0()); }

	'attributes' 

{ after(grammarAccess.getMComponentAccess().getAttributesKeyword_8_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_2__1__Impl
	rule__MComponent__Group_8_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_2_1()); }

	'{' 

{ after(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_2__2__Impl
	rule__MComponent__Group_8_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMComponentAccess().getAttributesAssignment_8_2_2()); }
(rule__MComponent__AttributesAssignment_8_2_2)
{ after(grammarAccess.getMComponentAccess().getAttributesAssignment_8_2_2()); }
)
(
{ before(grammarAccess.getMComponentAccess().getAttributesAssignment_8_2_2()); }
(rule__MComponent__AttributesAssignment_8_2_2)*
{ after(grammarAccess.getMComponentAccess().getAttributesAssignment_8_2_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_2__3__Impl
	rule__MComponent__Group_8_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_2_3()); }

	'}' 

{ after(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_2_4()); }

	';' 

{ after(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MComponent__Group_8_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_3__0__Impl
	rule__MComponent__Group_8_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getAttributeKeyword_8_3_0()); }

	'attribute' 

{ after(grammarAccess.getMComponentAccess().getAttributeKeyword_8_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_3__1__Impl
	rule__MComponent__Group_8_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getValuesKeyword_8_3_1()); }

	'values' 

{ after(grammarAccess.getMComponentAccess().getValuesKeyword_8_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_3__2__Impl
	rule__MComponent__Group_8_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_3_2()); }

	'{' 

{ after(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_3__3__Impl
	rule__MComponent__Group_8_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getAttributeValueAssignmentsAssignment_8_3_3()); }
(rule__MComponent__AttributeValueAssignmentsAssignment_8_3_3)*
{ after(grammarAccess.getMComponentAccess().getAttributeValueAssignmentsAssignment_8_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_3__4__Impl
	rule__MComponent__Group_8_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_3_4()); }

	'}' 

{ after(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_3_5()); }

	';' 

{ after(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MComponent__Group_8_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_4__0__Impl
	rule__MComponent__Group_8_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getExternalKeyword_8_4_0()); }

	'external' 

{ after(grammarAccess.getMComponentAccess().getExternalKeyword_8_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_4__1__Impl
	rule__MComponent__Group_8_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getPortsKeyword_8_4_1()); }

	'ports' 

{ after(grammarAccess.getMComponentAccess().getPortsKeyword_8_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_4__2__Impl
	rule__MComponent__Group_8_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_4_2()); }

	'{' 

{ after(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_4__3__Impl
	rule__MComponent__Group_8_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMComponentAccess().getExternalPortsAssignment_8_4_3()); }
(rule__MComponent__ExternalPortsAssignment_8_4_3)
{ after(grammarAccess.getMComponentAccess().getExternalPortsAssignment_8_4_3()); }
)
(
{ before(grammarAccess.getMComponentAccess().getExternalPortsAssignment_8_4_3()); }
(rule__MComponent__ExternalPortsAssignment_8_4_3)*
{ after(grammarAccess.getMComponentAccess().getExternalPortsAssignment_8_4_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_4__4__Impl
	rule__MComponent__Group_8_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_4_4()); }

	'}' 

{ after(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_4__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_4__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_4__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_4_5()); }

	';' 

{ after(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_4_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MComponent__Group_8_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_5__0__Impl
	rule__MComponent__Group_8_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getInternalKeyword_8_5_0()); }

	'internal' 

{ after(grammarAccess.getMComponentAccess().getInternalKeyword_8_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_5__1__Impl
	rule__MComponent__Group_8_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getPortsKeyword_8_5_1()); }

	'ports' 

{ after(grammarAccess.getMComponentAccess().getPortsKeyword_8_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_5__2__Impl
	rule__MComponent__Group_8_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_5_2()); }

	'{' 

{ after(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_5__3__Impl
	rule__MComponent__Group_8_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMComponentAccess().getInternalPortsAssignment_8_5_3()); }
(rule__MComponent__InternalPortsAssignment_8_5_3)
{ after(grammarAccess.getMComponentAccess().getInternalPortsAssignment_8_5_3()); }
)
(
{ before(grammarAccess.getMComponentAccess().getInternalPortsAssignment_8_5_3()); }
(rule__MComponent__InternalPortsAssignment_8_5_3)*
{ after(grammarAccess.getMComponentAccess().getInternalPortsAssignment_8_5_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_5__4__Impl
	rule__MComponent__Group_8_5__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_5__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_5_4()); }

	'}' 

{ after(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_5_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_5__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_5__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_5_5()); }

	';' 

{ after(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_5_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MComponent__Group_8_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_6__0__Impl
	rule__MComponent__Group_8_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRequiresKeyword_8_6_0()); }

	'requires' 

{ after(grammarAccess.getMComponentAccess().getRequiresKeyword_8_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_6__1__Impl
	rule__MComponent__Group_8_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_6_1()); }

	':=' 

{ after(grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_6__2__Impl
	rule__MComponent__Group_8_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRequiresAssignment_8_6_2()); }
(rule__MComponent__RequiresAssignment_8_6_2)
{ after(grammarAccess.getMComponentAccess().getRequiresAssignment_8_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_6__3__Impl
	rule__MComponent__Group_8_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getGroup_8_6_3()); }
(rule__MComponent__Group_8_6_3__0)*
{ after(grammarAccess.getMComponentAccess().getGroup_8_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_6_4()); }

	';' 

{ after(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MComponent__Group_8_6_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_6_3__0__Impl
	rule__MComponent__Group_8_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_6_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getCommaKeyword_8_6_3_0()); }

	',' 

{ after(grammarAccess.getMComponentAccess().getCommaKeyword_8_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_6_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_6_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_6_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRequiresAssignment_8_6_3_1()); }
(rule__MComponent__RequiresAssignment_8_6_3_1)
{ after(grammarAccess.getMComponentAccess().getRequiresAssignment_8_6_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MComponent__Group_8_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_7__0__Impl
	rule__MComponent__Group_8_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSupportedKeyword_8_7_0()); }

	'supported' 

{ after(grammarAccess.getMComponentAccess().getSupportedKeyword_8_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_7__1__Impl
	rule__MComponent__Group_8_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getPlatformsKeyword_8_7_1()); }

	'platforms' 

{ after(grammarAccess.getMComponentAccess().getPlatformsKeyword_8_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_7__2__Impl
	rule__MComponent__Group_8_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_7_2()); }

	'{' 

{ after(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_7__3__Impl
	rule__MComponent__Group_8_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_7__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMComponentAccess().getSupportedPlatformsAssignment_8_7_3()); }
(rule__MComponent__SupportedPlatformsAssignment_8_7_3)
{ after(grammarAccess.getMComponentAccess().getSupportedPlatformsAssignment_8_7_3()); }
)
(
{ before(grammarAccess.getMComponentAccess().getSupportedPlatformsAssignment_8_7_3()); }
(rule__MComponent__SupportedPlatformsAssignment_8_7_3)*
{ after(grammarAccess.getMComponentAccess().getSupportedPlatformsAssignment_8_7_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_7__4__Impl
	rule__MComponent__Group_8_7__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_7__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_7_4()); }

	'}' 

{ after(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_7_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_7__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_7__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_7__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_7_5()); }

	';' 

{ after(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_7_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MComponent__Group_8_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_8__0__Impl
	rule__MComponent__Group_8_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSubcomponentKeyword_8_8_0()); }

	'subcomponent' 

{ after(grammarAccess.getMComponentAccess().getSubcomponentKeyword_8_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_8__1__Impl
	rule__MComponent__Group_8_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getInstancesKeyword_8_8_1()); }

	'instances' 

{ after(grammarAccess.getMComponentAccess().getInstancesKeyword_8_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_8__2__Impl
	rule__MComponent__Group_8_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_8_2()); }

	'{' 

{ after(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_8_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_8__3__Impl
	rule__MComponent__Group_8_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_8__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMComponentAccess().getInternalComponentsAssignment_8_8_3()); }
(rule__MComponent__InternalComponentsAssignment_8_8_3)
{ after(grammarAccess.getMComponentAccess().getInternalComponentsAssignment_8_8_3()); }
)
(
{ before(grammarAccess.getMComponentAccess().getInternalComponentsAssignment_8_8_3()); }
(rule__MComponent__InternalComponentsAssignment_8_8_3)*
{ after(grammarAccess.getMComponentAccess().getInternalComponentsAssignment_8_8_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_8__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_8__4__Impl
	rule__MComponent__Group_8_8__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_8__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_8_4()); }

	'}' 

{ after(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_8_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_8__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_8__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_8__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_8_5()); }

	';' 

{ after(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_8_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MComponent__Group_8_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_9__0__Impl
	rule__MComponent__Group_8_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getConnectionsKeyword_8_9_0()); }

	'connections' 

{ after(grammarAccess.getMComponentAccess().getConnectionsKeyword_8_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_9__1__Impl
	rule__MComponent__Group_8_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_9_1()); }

	'{' 

{ after(grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_9__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_9__2__Impl
	rule__MComponent__Group_8_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_9__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMComponentAccess().getConnectionsAssignment_8_9_2()); }
(rule__MComponent__ConnectionsAssignment_8_9_2)
{ after(grammarAccess.getMComponentAccess().getConnectionsAssignment_8_9_2()); }
)
(
{ before(grammarAccess.getMComponentAccess().getConnectionsAssignment_8_9_2()); }
(rule__MComponent__ConnectionsAssignment_8_9_2)*
{ after(grammarAccess.getMComponentAccess().getConnectionsAssignment_8_9_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_9__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_9__3__Impl
	rule__MComponent__Group_8_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_9__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_9_3()); }

	'}' 

{ after(grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_9_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__Group_8_9__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__Group_8_9__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__Group_8_9__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_9_4()); }

	';' 

{ after(grammarAccess.getMComponentAccess().getSemicolonKeyword_8_9_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MInternalComponentInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentInstance__Group__0__Impl
	rule__MInternalComponentInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getIsSingletonAssignment_0()); }
(rule__MInternalComponentInstance__IsSingletonAssignment_0)?
{ after(grammarAccess.getMInternalComponentInstanceAccess().getIsSingletonAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentInstance__Group__1__Impl
	rule__MInternalComponentInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getInstanceKeyword_1()); }

	'instance' 

{ after(grammarAccess.getMInternalComponentInstanceAccess().getInstanceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentInstance__Group__2__Impl
	rule__MInternalComponentInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getComponentAssignment_2()); }
(rule__MInternalComponentInstance__ComponentAssignment_2)
{ after(grammarAccess.getMInternalComponentInstanceAccess().getComponentAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentInstance__Group__3__Impl
	rule__MInternalComponentInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getNameAssignment_3()); }
(rule__MInternalComponentInstance__NameAssignment_3)
{ after(grammarAccess.getMInternalComponentInstanceAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentInstance__Group__4__Impl
	rule__MInternalComponentInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMInternalComponentInstanceAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentInstance__Group__5__Impl
	rule__MInternalComponentInstance__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getAttributeValueAssignmentsAssignment_5()); }
(rule__MInternalComponentInstance__AttributeValueAssignmentsAssignment_5)*
{ after(grammarAccess.getMInternalComponentInstanceAccess().getAttributeValueAssignmentsAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentInstance__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentInstance__Group__6__Impl
	rule__MInternalComponentInstance__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentInstance__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMInternalComponentInstanceAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentInstance__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentInstance__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentInstance__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMInternalComponentInstanceAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MServerPort__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServerPort__Group__0__Impl
	rule__MServerPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getMServerPortAction_0()); }
(

)
{ after(grammarAccess.getMServerPortAccess().getMServerPortAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServerPort__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServerPort__Group__1__Impl
	rule__MServerPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getServerKeyword_1()); }

	'server' 

{ after(grammarAccess.getMServerPortAccess().getServerKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServerPort__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServerPort__Group__2__Impl
	rule__MServerPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getTypeAssignment_2()); }
(rule__MServerPort__TypeAssignment_2)
{ after(grammarAccess.getMServerPortAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServerPort__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServerPort__Group__3__Impl
	rule__MServerPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getInterfaceAssignment_3()); }
(rule__MServerPort__InterfaceAssignment_3)
{ after(grammarAccess.getMServerPortAccess().getInterfaceAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServerPort__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServerPort__Group__4__Impl
	rule__MServerPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getNameAssignment_4()); }
(rule__MServerPort__NameAssignment_4)
{ after(grammarAccess.getMServerPortAccess().getNameAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServerPort__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServerPort__Group__5__Impl
	rule__MServerPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMServerPortAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServerPort__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServerPort__Group__6__Impl
	rule__MServerPort__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getAttributeValueAssignmentsAssignment_6()); }
(rule__MServerPort__AttributeValueAssignmentsAssignment_6)*
{ after(grammarAccess.getMServerPortAccess().getAttributeValueAssignmentsAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServerPort__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServerPort__Group__7__Impl
	rule__MServerPort__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMServerPortAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServerPort__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServerPort__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMServerPortAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MClientPort__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MClientPort__Group__0__Impl
	rule__MClientPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getMClientPortAction_0()); }
(

)
{ after(grammarAccess.getMClientPortAccess().getMClientPortAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MClientPort__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MClientPort__Group__1__Impl
	rule__MClientPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getClientKeyword_1()); }

	'client' 

{ after(grammarAccess.getMClientPortAccess().getClientKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MClientPort__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MClientPort__Group__2__Impl
	rule__MClientPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getTypeAssignment_2()); }
(rule__MClientPort__TypeAssignment_2)
{ after(grammarAccess.getMClientPortAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MClientPort__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MClientPort__Group__3__Impl
	rule__MClientPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getInterfaceAssignment_3()); }
(rule__MClientPort__InterfaceAssignment_3)
{ after(grammarAccess.getMClientPortAccess().getInterfaceAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MClientPort__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MClientPort__Group__4__Impl
	rule__MClientPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getNameAssignment_4()); }
(rule__MClientPort__NameAssignment_4)
{ after(grammarAccess.getMClientPortAccess().getNameAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MClientPort__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MClientPort__Group__5__Impl
	rule__MClientPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMClientPortAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MClientPort__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MClientPort__Group__6__Impl
	rule__MClientPort__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getAttributeValueAssignmentsAssignment_6()); }
(rule__MClientPort__AttributeValueAssignmentsAssignment_6)*
{ after(grammarAccess.getMClientPortAccess().getAttributeValueAssignmentsAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MClientPort__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MClientPort__Group__7__Impl
	rule__MClientPort__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMClientPortAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MClientPort__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MClientPort__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMClientPortAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MParameterValueAssignment__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueAssignment__Group__0__Impl
	rule__MParameterValueAssignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueAssignment__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueAssignmentAccess().getAttributeKeyword_0()); }

	'attribute' 

{ after(grammarAccess.getMParameterValueAssignmentAccess().getAttributeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueAssignment__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueAssignment__Group__1__Impl
	rule__MParameterValueAssignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueAssignment__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueAssignmentAccess().getParameterAssignment_1()); }
(rule__MParameterValueAssignment__ParameterAssignment_1)
{ after(grammarAccess.getMParameterValueAssignmentAccess().getParameterAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueAssignment__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueAssignment__Group__2__Impl
	rule__MParameterValueAssignment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueAssignment__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueAssignmentAccess().getColonEqualsSignKeyword_2()); }

	':=' 

{ after(grammarAccess.getMParameterValueAssignmentAccess().getColonEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueAssignment__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueAssignment__Group__3__Impl
	rule__MParameterValueAssignment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueAssignment__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueAssignmentAccess().getParameterValueAssignment_3()); }
(rule__MParameterValueAssignment__ParameterValueAssignment_3)
{ after(grammarAccess.getMParameterValueAssignmentAccess().getParameterValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterValueAssignment__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterValueAssignment__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueAssignment__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueAssignmentAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMParameterValueAssignmentAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIntegerParameterSingleExpression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParameterSingleExpression__Group__0__Impl
	rule__MIntegerParameterSingleExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantAssignment_0()); }
(rule__MIntegerParameterSingleExpression__ConstantAssignment_0)?
{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParameterSingleExpression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParameterSingleExpression__Group__1__Impl
	rule__MIntegerParameterSingleExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_1()); }

	'integer' 

{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParameterSingleExpression__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParameterSingleExpression__Group__2__Impl
	rule__MIntegerParameterSingleExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameAssignment_2()); }
(rule__MIntegerParameterSingleExpression__NameAssignment_2)
{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParameterSingleExpression__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParameterSingleExpression__Group__3__Impl
	rule__MIntegerParameterSingleExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParameterSingleExpression__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParameterSingleExpression__Group__4__Impl
	rule__MIntegerParameterSingleExpression__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueAssignment_4()); }
(rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4)
{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParameterSingleExpression__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParameterSingleExpression__Group__5__Impl
	rule__MIntegerParameterSingleExpression__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_5()); }
(rule__MIntegerParameterSingleExpression__Group_5__0)?
{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParameterSingleExpression__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParameterSingleExpression__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MIntegerParameterSingleExpression__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParameterSingleExpression__Group_5__0__Impl
	rule__MIntegerParameterSingleExpression__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_5_0()); }

	'range' 

{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParameterSingleExpression__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParameterSingleExpression__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeAssignment_5_1()); }
(rule__MIntegerParameterSingleExpression__RangeAssignment_5_1)
{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MEnumParameterDefinition__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterDefinition__Group__0__Impl
	rule__MEnumParameterDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0()); }
(

)
{ after(grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterDefinition__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterDefinition__Group__1__Impl
	rule__MEnumParameterDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_1()); }

	'enum' 

{ after(grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterDefinition__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterDefinition__Group__2__Impl
	rule__MEnumParameterDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getNameAssignment_2()); }
(rule__MEnumParameterDefinition__NameAssignment_2)
{ after(grammarAccess.getMEnumParameterDefinitionAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterDefinition__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterDefinition__Group__3__Impl
	rule__MEnumParameterDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterDefinition__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterDefinition__Group__4__Impl
	rule__MEnumParameterDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_4()); }
(rule__MEnumParameterDefinition__LiteralsAssignment_4)
{ after(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterDefinition__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterDefinition__Group__5__Impl
	rule__MEnumParameterDefinition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getGroup_5()); }
(rule__MEnumParameterDefinition__Group_5__0)*
{ after(grammarAccess.getMEnumParameterDefinitionAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterDefinition__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterDefinition__Group__6__Impl
	rule__MEnumParameterDefinition__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterDefinition__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterDefinition__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMEnumParameterDefinitionAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MEnumParameterDefinition__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterDefinition__Group_5__0__Impl
	rule__MEnumParameterDefinition__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_5_0()); }

	',' 

{ after(grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterDefinition__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterDefinition__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_5_1()); }
(rule__MEnumParameterDefinition__LiteralsAssignment_5_1)
{ after(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MEnumParameterSingleExpression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterSingleExpression__Group__0__Impl
	rule__MEnumParameterSingleExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantAssignment_0()); }
(rule__MEnumParameterSingleExpression__ConstantAssignment_0)?
{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterSingleExpression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterSingleExpression__Group__1__Impl
	rule__MEnumParameterSingleExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_1()); }

	'enum' 

{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterSingleExpression__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterSingleExpression__Group__2__Impl
	rule__MEnumParameterSingleExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionAssignment_2()); }
(rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2)
{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterSingleExpression__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterSingleExpression__Group__3__Impl
	rule__MEnumParameterSingleExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameAssignment_3()); }
(rule__MEnumParameterSingleExpression__NameAssignment_3)
{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterSingleExpression__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterSingleExpression__Group__4__Impl
	rule__MEnumParameterSingleExpression__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_4()); }

	':=' 

{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterSingleExpression__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterSingleExpression__Group__5__Impl
	rule__MEnumParameterSingleExpression__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueAssignment_5()); }
(rule__MEnumParameterSingleExpression__DefaultValueAssignment_5)
{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterSingleExpression__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterSingleExpression__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MRealParameterSingleExpression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParameterSingleExpression__Group__0__Impl
	rule__MRealParameterSingleExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantAssignment_0()); }
(rule__MRealParameterSingleExpression__ConstantAssignment_0)?
{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParameterSingleExpression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParameterSingleExpression__Group__1__Impl
	rule__MRealParameterSingleExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_1()); }

	'real' 

{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParameterSingleExpression__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParameterSingleExpression__Group__2__Impl
	rule__MRealParameterSingleExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getNameAssignment_2()); }
(rule__MRealParameterSingleExpression__NameAssignment_2)
{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParameterSingleExpression__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParameterSingleExpression__Group__3__Impl
	rule__MRealParameterSingleExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParameterSingleExpression__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParameterSingleExpression__Group__4__Impl
	rule__MRealParameterSingleExpression__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueAssignment_4()); }
(rule__MRealParameterSingleExpression__DefaultValueAssignment_4)
{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParameterSingleExpression__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParameterSingleExpression__Group__5__Impl
	rule__MRealParameterSingleExpression__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_5()); }
(rule__MRealParameterSingleExpression__Group_5__0)?
{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParameterSingleExpression__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParameterSingleExpression__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MRealParameterSingleExpression__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParameterSingleExpression__Group_5__0__Impl
	rule__MRealParameterSingleExpression__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_5_0()); }

	'range' 

{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParameterSingleExpression__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParameterSingleExpression__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeAssignment_5_1()); }
(rule__MRealParameterSingleExpression__RangeAssignment_5_1)
{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeAssignment_5_1()); }
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






rule__MParameterOCR__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterOCR__Group__0__Impl
	rule__MParameterOCR__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOCR__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0()); }
(

)
{ after(grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterOCR__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterOCR__Group__1__Impl
	rule__MParameterOCR__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOCR__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOCRAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getMParameterOCRAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterOCR__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterOCR__Group__2__Impl
	rule__MParameterOCR__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOCR__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOCRAccess().getLowerValueAssignment_2()); }
(rule__MParameterOCR__LowerValueAssignment_2)
{ after(grammarAccess.getMParameterOCRAccess().getLowerValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterOCR__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterOCR__Group__3__Impl
	rule__MParameterOCR__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOCR__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOCRAccess().getCommaKeyword_3()); }

	',' 

{ after(grammarAccess.getMParameterOCRAccess().getCommaKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterOCR__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterOCR__Group__4__Impl
	rule__MParameterOCR__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOCR__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOCRAccess().getUpperValueAssignment_4()); }
(rule__MParameterOCR__UpperValueAssignment_4)
{ after(grammarAccess.getMParameterOCRAccess().getUpperValueAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterOCR__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterOCR__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOCR__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOCRAccess().getRightSquareBracketKeyword_5()); }

	']' 

{ after(grammarAccess.getMParameterOCRAccess().getRightSquareBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MParameterOOR__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterOOR__Group__0__Impl
	rule__MParameterOOR__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOOR__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOORAccess().getMParameterOORAction_0()); }
(

)
{ after(grammarAccess.getMParameterOORAccess().getMParameterOORAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterOOR__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterOOR__Group__1__Impl
	rule__MParameterOOR__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOOR__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOORAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getMParameterOORAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterOOR__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterOOR__Group__2__Impl
	rule__MParameterOOR__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOOR__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOORAccess().getLowerValueAssignment_2()); }
(rule__MParameterOOR__LowerValueAssignment_2)
{ after(grammarAccess.getMParameterOORAccess().getLowerValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterOOR__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterOOR__Group__3__Impl
	rule__MParameterOOR__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOOR__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOORAccess().getCommaKeyword_3()); }

	',' 

{ after(grammarAccess.getMParameterOORAccess().getCommaKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterOOR__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterOOR__Group__4__Impl
	rule__MParameterOOR__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOOR__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOORAccess().getUpperValueAssignment_4()); }
(rule__MParameterOOR__UpperValueAssignment_4)
{ after(grammarAccess.getMParameterOORAccess().getUpperValueAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterOOR__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterOOR__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOOR__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOORAccess().getRightParenthesisKeyword_5()); }

	')' 

{ after(grammarAccess.getMParameterOORAccess().getRightParenthesisKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MParameterCOR__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterCOR__Group__0__Impl
	rule__MParameterCOR__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCOR__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCORAccess().getMParameterCORAction_0()); }
(

)
{ after(grammarAccess.getMParameterCORAccess().getMParameterCORAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterCOR__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterCOR__Group__1__Impl
	rule__MParameterCOR__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCOR__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCORAccess().getLeftSquareBracketKeyword_1()); }

	'[' 

{ after(grammarAccess.getMParameterCORAccess().getLeftSquareBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterCOR__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterCOR__Group__2__Impl
	rule__MParameterCOR__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCOR__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCORAccess().getLowerValueAssignment_2()); }
(rule__MParameterCOR__LowerValueAssignment_2)
{ after(grammarAccess.getMParameterCORAccess().getLowerValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterCOR__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterCOR__Group__3__Impl
	rule__MParameterCOR__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCOR__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCORAccess().getCommaKeyword_3()); }

	',' 

{ after(grammarAccess.getMParameterCORAccess().getCommaKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterCOR__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterCOR__Group__4__Impl
	rule__MParameterCOR__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCOR__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCORAccess().getUpperValueAssignment_4()); }
(rule__MParameterCOR__UpperValueAssignment_4)
{ after(grammarAccess.getMParameterCORAccess().getUpperValueAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterCOR__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterCOR__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCOR__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCORAccess().getRightParenthesisKeyword_5()); }

	')' 

{ after(grammarAccess.getMParameterCORAccess().getRightParenthesisKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MParameterCCR__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterCCR__Group__0__Impl
	rule__MParameterCCR__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCCR__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0()); }
(

)
{ after(grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterCCR__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterCCR__Group__1__Impl
	rule__MParameterCCR__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCCR__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCCRAccess().getLeftSquareBracketKeyword_1()); }

	'[' 

{ after(grammarAccess.getMParameterCCRAccess().getLeftSquareBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterCCR__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterCCR__Group__2__Impl
	rule__MParameterCCR__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCCR__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCCRAccess().getLowerValueAssignment_2()); }
(rule__MParameterCCR__LowerValueAssignment_2)
{ after(grammarAccess.getMParameterCCRAccess().getLowerValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterCCR__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterCCR__Group__3__Impl
	rule__MParameterCCR__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCCR__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCCRAccess().getCommaKeyword_3()); }

	',' 

{ after(grammarAccess.getMParameterCCRAccess().getCommaKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterCCR__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterCCR__Group__4__Impl
	rule__MParameterCCR__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCCR__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCCRAccess().getUpperValueAssignment_4()); }
(rule__MParameterCCR__UpperValueAssignment_4)
{ after(grammarAccess.getMParameterCCRAccess().getUpperValueAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MParameterCCR__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MParameterCCR__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCCR__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCCRAccess().getRightSquareBracketKeyword_5()); }

	']' 

{ after(grammarAccess.getMParameterCCRAccess().getRightSquareBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MEnumParameterLiteral__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterLiteral__Group__0__Impl
	rule__MEnumParameterLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterLiteral__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0()); }
(

)
{ after(grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterLiteral__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterLiteral__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterLiteral__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterLiteralAccess().getNameAssignment_1()); }
(rule__MEnumParameterLiteral__NameAssignment_1)
{ after(grammarAccess.getMEnumParameterLiteralAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MEnumParamIntegerLiteral__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamIntegerLiteral__Group__0__Impl
	rule__MEnumParamIntegerLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamIntegerLiteral__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0()); }
(

)
{ after(grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamIntegerLiteral__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamIntegerLiteral__Group__1__Impl
	rule__MEnumParamIntegerLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamIntegerLiteral__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamIntegerLiteralAccess().getNameAssignment_1()); }
(rule__MEnumParamIntegerLiteral__NameAssignment_1)
{ after(grammarAccess.getMEnumParamIntegerLiteralAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamIntegerLiteral__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamIntegerLiteral__Group__2__Impl
	rule__MEnumParamIntegerLiteral__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamIntegerLiteral__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamIntegerLiteralAccess().getEqualsSignKeyword_2()); }

	'=' 

{ after(grammarAccess.getMEnumParamIntegerLiteralAccess().getEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamIntegerLiteral__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamIntegerLiteral__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamIntegerLiteral__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueAssignment_3()); }
(rule__MEnumParamIntegerLiteral__ValueAssignment_3)
{ after(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MEnumParamRealLiteral__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamRealLiteral__Group__0__Impl
	rule__MEnumParamRealLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamRealLiteral__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0()); }
(

)
{ after(grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamRealLiteral__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamRealLiteral__Group__1__Impl
	rule__MEnumParamRealLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamRealLiteral__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamRealLiteralAccess().getNameAssignment_1()); }
(rule__MEnumParamRealLiteral__NameAssignment_1)
{ after(grammarAccess.getMEnumParamRealLiteralAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamRealLiteral__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamRealLiteral__Group__2__Impl
	rule__MEnumParamRealLiteral__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamRealLiteral__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamRealLiteralAccess().getEqualsSignKeyword_2()); }

	'=' 

{ after(grammarAccess.getMEnumParamRealLiteralAccess().getEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamRealLiteral__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamRealLiteral__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamRealLiteral__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamRealLiteralAccess().getValueAssignment_3()); }
(rule__MEnumParamRealLiteral__ValueAssignment_3)
{ after(grammarAccess.getMEnumParamRealLiteralAccess().getValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MEnumParamStringLiteral__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamStringLiteral__Group__0__Impl
	rule__MEnumParamStringLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteral__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0()); }
(

)
{ after(grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamStringLiteral__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamStringLiteral__Group__1__Impl
	rule__MEnumParamStringLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteral__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralAccess().getNameAssignment_1()); }
(rule__MEnumParamStringLiteral__NameAssignment_1)
{ after(grammarAccess.getMEnumParamStringLiteralAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamStringLiteral__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamStringLiteral__Group__2__Impl
	rule__MEnumParamStringLiteral__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteral__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralAccess().getEqualsSignKeyword_2()); }

	'=' 

{ after(grammarAccess.getMEnumParamStringLiteralAccess().getEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamStringLiteral__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamStringLiteral__Group__3__Impl
	rule__MEnumParamStringLiteral__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteral__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawAssignment_3()); }
(rule__MEnumParamStringLiteral__IsRawAssignment_3)?
{ after(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamStringLiteral__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamStringLiteral__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteral__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralAccess().getValueAssignment_4()); }
(rule__MEnumParamStringLiteral__ValueAssignment_4)
{ after(grammarAccess.getMEnumParamStringLiteralAccess().getValueAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MBooleanParameterSingleExpression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParameterSingleExpression__Group__0__Impl
	rule__MBooleanParameterSingleExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParameterSingleExpression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantAssignment_0()); }
(rule__MBooleanParameterSingleExpression__ConstantAssignment_0)?
{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParameterSingleExpression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParameterSingleExpression__Group__1__Impl
	rule__MBooleanParameterSingleExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParameterSingleExpression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_1()); }

	'boolean' 

{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParameterSingleExpression__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParameterSingleExpression__Group__2__Impl
	rule__MBooleanParameterSingleExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParameterSingleExpression__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_2()); }
(rule__MBooleanParameterSingleExpression__NameAssignment_2)
{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParameterSingleExpression__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParameterSingleExpression__Group__3__Impl
	rule__MBooleanParameterSingleExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParameterSingleExpression__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParameterSingleExpression__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParameterSingleExpression__Group__4__Impl
	rule__MBooleanParameterSingleExpression__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParameterSingleExpression__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_4()); }
(rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4)
{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParameterSingleExpression__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParameterSingleExpression__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParameterSingleExpression__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MStringParameterSingleExpression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParameterSingleExpression__Group__0__Impl
	rule__MStringParameterSingleExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParameterSingleExpression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantAssignment_0()); }
(rule__MStringParameterSingleExpression__ConstantAssignment_0)?
{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParameterSingleExpression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParameterSingleExpression__Group__1__Impl
	rule__MStringParameterSingleExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParameterSingleExpression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_1()); }

	'string' 

{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParameterSingleExpression__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParameterSingleExpression__Group__2__Impl
	rule__MStringParameterSingleExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParameterSingleExpression__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_2()); }
(rule__MStringParameterSingleExpression__NameAssignment_2)
{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParameterSingleExpression__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParameterSingleExpression__Group__3__Impl
	rule__MStringParameterSingleExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParameterSingleExpression__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParameterSingleExpression__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParameterSingleExpression__Group__4__Impl
	rule__MStringParameterSingleExpression__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParameterSingleExpression__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_4()); }
(rule__MStringParameterSingleExpression__DefaultValueAssignment_4)
{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParameterSingleExpression__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParameterSingleExpression__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParameterSingleExpression__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MInternalComponentConnection__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group__0__Impl
	rule__MInternalComponentConnection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getMInternalComponentConnectionAction_0()); }
(

)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getMInternalComponentConnectionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group__1__Impl
	rule__MInternalComponentConnection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getConnectionKeyword_1()); }

	'connection' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getConnectionKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group__2__Impl
	rule__MInternalComponentConnection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getAlternatives_2()); }
(rule__MInternalComponentConnection__Alternatives_2)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getAlternatives_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group__3__Impl
	rule__MInternalComponentConnection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getFullStopKeyword_3()); }

	'.' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getFullStopKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group__4__Impl
	rule__MInternalComponentConnection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getClientPortAssignment_4()); }
(rule__MInternalComponentConnection__ClientPortAssignment_4)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getClientPortAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group__5__Impl
	rule__MInternalComponentConnection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5()); }

	'<->' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group__6__Impl
	rule__MInternalComponentConnection__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getAlternatives_6()); }
(rule__MInternalComponentConnection__Alternatives_6)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getAlternatives_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group__7__Impl
	rule__MInternalComponentConnection__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getFullStopKeyword_7()); }

	'.' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getFullStopKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group__8__Impl
	rule__MInternalComponentConnection__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getServerPortAssignment_8()); }
(rule__MInternalComponentConnection__ServerPortAssignment_8)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getServerPortAssignment_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group__9__Impl
	rule__MInternalComponentConnection__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getGroup_9()); }
(rule__MInternalComponentConnection__Group_9__0)?
{ after(grammarAccess.getMInternalComponentConnectionAccess().getGroup_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getSemicolonKeyword_10()); }

	';' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getSemicolonKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}
























rule__MInternalComponentConnection__Group_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group_9__0__Impl
	rule__MInternalComponentConnection__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getUsingKeyword_9_0()); }

	'using' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getUsingKeyword_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group_9__1__Impl
	rule__MInternalComponentConnection__Group_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getConnectorAssignment_9_1()); }
(rule__MInternalComponentConnection__ConnectorAssignment_9_1)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getConnectorAssignment_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group_9__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group_9__2__Impl
	rule__MInternalComponentConnection__Group_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group_9__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getLeftCurlyBracketKeyword_9_2()); }

	'{' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getLeftCurlyBracketKeyword_9_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group_9__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group_9__3__Impl
	rule__MInternalComponentConnection__Group_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group_9__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getGroup_9_3()); }
(rule__MInternalComponentConnection__Group_9_3__0)?
{ after(grammarAccess.getMInternalComponentConnectionAccess().getGroup_9_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group_9__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group_9__4__Impl
	rule__MInternalComponentConnection__Group_9__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group_9__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getGroup_9_4()); }
(rule__MInternalComponentConnection__Group_9_4__0)*
{ after(grammarAccess.getMInternalComponentConnectionAccess().getGroup_9_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group_9__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group_9__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group_9__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getRightCurlyBracketKeyword_9_5()); }

	'}' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getRightCurlyBracketKeyword_9_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MInternalComponentConnection__Group_9_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group_9_3__0__Impl
	rule__MInternalComponentConnection__Group_9_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group_9_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getMappingKeyword_9_3_0()); }

	'mapping' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getMappingKeyword_9_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group_9_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group_9_3__1__Impl
	rule__MInternalComponentConnection__Group_9_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group_9_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getColonEqualsSignKeyword_9_3_1()); }

	':=' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getColonEqualsSignKeyword_9_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group_9_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group_9_3__2__Impl
	rule__MInternalComponentConnection__Group_9_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group_9_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getIfaceMappingAssignment_9_3_2()); }
(rule__MInternalComponentConnection__IfaceMappingAssignment_9_3_2)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getIfaceMappingAssignment_9_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group_9_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group_9_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group_9_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getSemicolonKeyword_9_3_3()); }

	';' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getSemicolonKeyword_9_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MInternalComponentConnection__Group_9_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group_9_4__0__Impl
	rule__MInternalComponentConnection__Group_9_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group_9_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getAttributeKeyword_9_4_0()); }

	'attribute' 

{ after(grammarAccess.getMInternalComponentConnectionAccess().getAttributeKeyword_9_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentConnection__Group_9_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentConnection__Group_9_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__Group_9_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getAttributeValueAssignmentsAssignment_9_4_1()); }
(rule__MInternalComponentConnection__AttributeValueAssignmentsAssignment_9_4_1)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getAttributeValueAssignmentsAssignment_9_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MInternalComponentPlatformSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitch__Group__0__Impl
	rule__MInternalComponentPlatformSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getMInternalComponentPlatformSwitchAction_0()); }
(

)
{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getMInternalComponentPlatformSwitchAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitch__Group__1__Impl
	rule__MInternalComponentPlatformSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getConnectionKeyword_1()); }

	'connection' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getConnectionKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitch__Group__2__Impl
	rule__MInternalComponentPlatformSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getAlternatives_2()); }
(rule__MInternalComponentPlatformSwitch__Alternatives_2)
{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getAlternatives_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitch__Group__3__Impl
	rule__MInternalComponentPlatformSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getFullStopKeyword_3()); }

	'.' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getFullStopKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitch__Group__4__Impl
	rule__MInternalComponentPlatformSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientPortAssignment_4()); }
(rule__MInternalComponentPlatformSwitch__ClientPortAssignment_4)
{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientPortAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitch__Group__5__Impl
	rule__MInternalComponentPlatformSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5()); }

	'<->' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitch__Group__6__Impl
	rule__MInternalComponentPlatformSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getSwitchKeyword_6()); }

	'switch' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getSwitchKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitch__Group__7__Impl
	rule__MInternalComponentPlatformSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getLeftCurlyBracketKeyword_7()); }

	'{' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getLeftCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitch__Group__8__Impl
	rule__MInternalComponentPlatformSwitch__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getCasesAssignment_8()); }
(rule__MInternalComponentPlatformSwitch__CasesAssignment_8)
{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getCasesAssignment_8()); }
)
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getCasesAssignment_8()); }
(rule__MInternalComponentPlatformSwitch__CasesAssignment_8)*
{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getCasesAssignment_8()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitch__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitch__Group__9__Impl
	rule__MInternalComponentPlatformSwitch__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getRightCurlyBracketKeyword_9()); }

	'}' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getRightCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitch__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitch__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getSemicolonKeyword_10()); }

	';' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getSemicolonKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}
























rule__MInternalComponentPlatformSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group__0__Impl
	rule__MInternalComponentPlatformSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group__1__Impl
	rule__MInternalComponentPlatformSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MInternalComponentPlatformSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group__2__Impl
	rule__MInternalComponentPlatformSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group__3__Impl
	rule__MInternalComponentPlatformSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAlternatives_3()); }
(rule__MInternalComponentPlatformSwitchCase__Alternatives_3)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAlternatives_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group__4__Impl
	rule__MInternalComponentPlatformSwitchCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getFullStopKeyword_4()); }

	'.' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getFullStopKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group__5__Impl
	rule__MInternalComponentPlatformSwitchCase__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerPortAssignment_5()); }
(rule__MInternalComponentPlatformSwitchCase__ServerPortAssignment_5)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerPortAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group__6__Impl
	rule__MInternalComponentPlatformSwitchCase__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup_6()); }
(rule__MInternalComponentPlatformSwitchCase__Group_6__0)?
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MInternalComponentPlatformSwitchCase__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group_6__0__Impl
	rule__MInternalComponentPlatformSwitchCase__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getUsingKeyword_6_0()); }

	'using' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getUsingKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group_6__1__Impl
	rule__MInternalComponentPlatformSwitchCase__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getConnectorAssignment_6_1()); }
(rule__MInternalComponentPlatformSwitchCase__ConnectorAssignment_6_1)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getConnectorAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group_6__2__Impl
	rule__MInternalComponentPlatformSwitchCase__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getLeftCurlyBracketKeyword_6_2()); }

	'{' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getLeftCurlyBracketKeyword_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group_6__3__Impl
	rule__MInternalComponentPlatformSwitchCase__Group_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup_6_3()); }
(rule__MInternalComponentPlatformSwitchCase__Group_6_3__0)?
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group_6__4__Impl
	rule__MInternalComponentPlatformSwitchCase__Group_6__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup_6_4()); }
(rule__MInternalComponentPlatformSwitchCase__Group_6_4__0)*
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group_6__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group_6__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group_6__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getRightCurlyBracketKeyword_6_5()); }

	'}' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getRightCurlyBracketKeyword_6_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MInternalComponentPlatformSwitchCase__Group_6_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group_6_3__0__Impl
	rule__MInternalComponentPlatformSwitchCase__Group_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group_6_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getMappingKeyword_6_3_0()); }

	'mapping' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getMappingKeyword_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group_6_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group_6_3__1__Impl
	rule__MInternalComponentPlatformSwitchCase__Group_6_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group_6_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getColonEqualsSignKeyword_6_3_1()); }

	':=' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getColonEqualsSignKeyword_6_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group_6_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group_6_3__2__Impl
	rule__MInternalComponentPlatformSwitchCase__Group_6_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group_6_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getIfaceMappingAssignment_6_3_2()); }
(rule__MInternalComponentPlatformSwitchCase__IfaceMappingAssignment_6_3_2)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getIfaceMappingAssignment_6_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group_6_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group_6_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group_6_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getSemicolonKeyword_6_3_3()); }

	';' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getSemicolonKeyword_6_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MInternalComponentPlatformSwitchCase__Group_6_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group_6_4__0__Impl
	rule__MInternalComponentPlatformSwitchCase__Group_6_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group_6_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeKeyword_6_4_0()); }

	'attribute' 

{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeKeyword_6_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalComponentPlatformSwitchCase__Group_6_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalComponentPlatformSwitchCase__Group_6_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__Group_6_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeValueAssignmentsAssignment_6_4_1()); }
(rule__MInternalComponentPlatformSwitchCase__AttributeValueAssignmentsAssignment_6_4_1)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeValueAssignmentsAssignment_6_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ComponentSupportedPlatform__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group__0__Impl
	rule__ComponentSupportedPlatform__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getMComponentSupportedPlatformAction_0()); }
(

)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getMComponentSupportedPlatformAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group__1__Impl
	rule__ComponentSupportedPlatform__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSupportedKeyword_1()); }

	'supported' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSupportedKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group__2__Impl
	rule__ComponentSupportedPlatform__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getPlatformKeyword_2()); }

	'platform' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getPlatformKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group__3__Impl
	rule__ComponentSupportedPlatform__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getNameAssignment_3()); }
(rule__ComponentSupportedPlatform__NameAssignment_3)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group__4__Impl
	rule__ComponentSupportedPlatform__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group__5__Impl
	rule__ComponentSupportedPlatform__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5()); }
(rule__ComponentSupportedPlatform__UnorderedGroup_5)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group__6__Impl
	rule__ComponentSupportedPlatform__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__ComponentSupportedPlatform__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_0__0__Impl
	rule__ComponentSupportedPlatform__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getOsapiKeyword_5_0_0()); }

	'osapi' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getOsapiKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_0__1__Impl
	rule__ComponentSupportedPlatform__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_0__2__Impl
	rule__ComponentSupportedPlatform__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_0_2()); }
(rule__ComponentSupportedPlatform__Alternatives_5_0_2)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__ComponentSupportedPlatform__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_1__0__Impl
	rule__ComponentSupportedPlatform__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getOsKeyword_5_1_0()); }

	'os' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getOsKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_1__1__Impl
	rule__ComponentSupportedPlatform__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1()); }

	':=' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_1__2__Impl
	rule__ComponentSupportedPlatform__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_1_2()); }
(rule__ComponentSupportedPlatform__Alternatives_5_1_2)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_1_3()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__ComponentSupportedPlatform__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_2__0__Impl
	rule__ComponentSupportedPlatform__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getArchitectureKeyword_5_2_0()); }

	'architecture' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getArchitectureKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_2__1__Impl
	rule__ComponentSupportedPlatform__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1()); }

	':=' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_2__2__Impl
	rule__ComponentSupportedPlatform__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_2_2()); }
(rule__ComponentSupportedPlatform__Alternatives_5_2_2)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_2_3()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__ComponentSupportedPlatform__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_3__0__Impl
	rule__ComponentSupportedPlatform__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getCompilerKeyword_5_3_0()); }

	'compiler' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getCompilerKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_3__1__Impl
	rule__ComponentSupportedPlatform__Group_5_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1()); }

	':=' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_3__2__Impl
	rule__ComponentSupportedPlatform__Group_5_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getCompilerAssignment_5_3_2()); }
(rule__ComponentSupportedPlatform__CompilerAssignment_5_3_2)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getCompilerAssignment_5_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_3_3()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__ComponentSupportedPlatform__Group_5_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_4__0__Impl
	rule__ComponentSupportedPlatform__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0()); }

	'microprocessor' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_4__1__Impl
	rule__ComponentSupportedPlatform__Group_5_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1()); }

	':=' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_4__2__Impl
	rule__ComponentSupportedPlatform__Group_5_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_4_2()); }
(rule__ComponentSupportedPlatform__Alternatives_5_4_2)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_4_3()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__ComponentSupportedPlatform__Group_5_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_5__0__Impl
	rule__ComponentSupportedPlatform__Group_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getBoardKeyword_5_5_0()); }

	'board' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getBoardKeyword_5_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_5__1__Impl
	rule__ComponentSupportedPlatform__Group_5_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1()); }

	':=' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_5__2__Impl
	rule__ComponentSupportedPlatform__Group_5_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_5_2()); }
(rule__ComponentSupportedPlatform__Alternatives_5_5_2)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_5_3()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__ComponentSupportedPlatform__Group_5_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_6__0__Impl
	rule__ComponentSupportedPlatform__Group_5_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getRequiresKeyword_5_6_0()); }

	'requires' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getRequiresKeyword_5_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_6__1__Impl
	rule__ComponentSupportedPlatform__Group_5_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1()); }

	':=' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_6__2__Impl
	rule__ComponentSupportedPlatform__Group_5_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getRequiresAssignment_5_6_2()); }
(rule__ComponentSupportedPlatform__RequiresAssignment_5_6_2)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getRequiresAssignment_5_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_6__3__Impl
	rule__ComponentSupportedPlatform__Group_5_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_6_3()); }
(rule__ComponentSupportedPlatform__Group_5_6_3__0)*
{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_6_4()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__ComponentSupportedPlatform__Group_5_6_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_6_3__0__Impl
	rule__ComponentSupportedPlatform__Group_5_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_6_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getCommaKeyword_5_6_3_0()); }

	',' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getCommaKeyword_5_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_6_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_6_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_6_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getRequiresAssignment_5_6_3_1()); }
(rule__ComponentSupportedPlatform__RequiresAssignment_5_6_3_1)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getRequiresAssignment_5_6_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ComponentSupportedPlatform__Group_5_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_7__0__Impl
	rule__ComponentSupportedPlatform__Group_5_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAttributeKeyword_5_7_0()); }

	'attribute' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getAttributeKeyword_5_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_7__1__Impl
	rule__ComponentSupportedPlatform__Group_5_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getValuesKeyword_5_7_1()); }

	'values' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getValuesKeyword_5_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_7__2__Impl
	rule__ComponentSupportedPlatform__Group_5_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2()); }

	'{' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_7__3__Impl
	rule__ComponentSupportedPlatform__Group_5_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_7__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAttributeValueAssignmentsAssignment_5_7_3()); }
(rule__ComponentSupportedPlatform__AttributeValueAssignmentsAssignment_5_7_3)*
{ after(grammarAccess.getComponentSupportedPlatformAccess().getAttributeValueAssignmentsAssignment_5_7_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_7__4__Impl
	rule__ComponentSupportedPlatform__Group_5_7__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_7__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4()); }

	'}' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_7__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_7__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_7__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_7_5()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_7_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__ComponentSupportedPlatform__Group_5_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_8__0__Impl
	rule__ComponentSupportedPlatform__Group_5_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAttributesKeyword_5_8_0()); }

	'attributes' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getAttributesKeyword_5_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_8__1__Impl
	rule__ComponentSupportedPlatform__Group_5_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_1()); }

	'{' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_8__2__Impl
	rule__ComponentSupportedPlatform__Group_5_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAttributesAssignment_5_8_2()); }
(rule__ComponentSupportedPlatform__AttributesAssignment_5_8_2)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getAttributesAssignment_5_8_2()); }
)
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAttributesAssignment_5_8_2()); }
(rule__ComponentSupportedPlatform__AttributesAssignment_5_8_2)*
{ after(grammarAccess.getComponentSupportedPlatformAccess().getAttributesAssignment_5_8_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_8__3__Impl
	rule__ComponentSupportedPlatform__Group_5_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_8__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_3()); }

	'}' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_8__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_8__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_8__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_8_4()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_8_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__ComponentSupportedPlatform__Group_5_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_9__0__Impl
	rule__ComponentSupportedPlatform__Group_5_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesKeyword_5_9_0()); }

	'languages' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesKeyword_5_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_9__1__Impl
	rule__ComponentSupportedPlatform__Group_5_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_9_1()); }

	':=' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_9__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_9__2__Impl
	rule__ComponentSupportedPlatform__Group_5_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_9__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesAssignment_5_9_2()); }
(rule__ComponentSupportedPlatform__LanguagesAssignment_5_9_2)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesAssignment_5_9_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_9__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_9__3__Impl
	rule__ComponentSupportedPlatform__Group_5_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_9__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_9_3()); }
(rule__ComponentSupportedPlatform__Group_5_9_3__0)*
{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_9_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_9__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_9__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_9__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_9_4()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_9_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__ComponentSupportedPlatform__Group_5_9_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_9_3__0__Impl
	rule__ComponentSupportedPlatform__Group_5_9_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_9_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getCommaKeyword_5_9_3_0()); }

	',' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getCommaKeyword_5_9_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_9_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_9_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_9_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesAssignment_5_9_3_1()); }
(rule__ComponentSupportedPlatform__LanguagesAssignment_5_9_3_1)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesAssignment_5_9_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ComponentSupportedPlatform__Group_5_10__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_10__0__Impl
	rule__ComponentSupportedPlatform__Group_5_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_10__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSubcomponentKeyword_5_10_0()); }

	'subcomponent' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSubcomponentKeyword_5_10_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_10__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_10__1__Impl
	rule__ComponentSupportedPlatform__Group_5_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_10__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getInstancesKeyword_5_10_1()); }

	'instances' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getInstancesKeyword_5_10_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_10__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_10__2__Impl
	rule__ComponentSupportedPlatform__Group_5_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_10__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_10_2()); }

	'{' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_10_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_10__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_10__3__Impl
	rule__ComponentSupportedPlatform__Group_5_10__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_10__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getInternalComponentsAssignment_5_10_3()); }
(rule__ComponentSupportedPlatform__InternalComponentsAssignment_5_10_3)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getInternalComponentsAssignment_5_10_3()); }
)
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getInternalComponentsAssignment_5_10_3()); }
(rule__ComponentSupportedPlatform__InternalComponentsAssignment_5_10_3)*
{ after(grammarAccess.getComponentSupportedPlatformAccess().getInternalComponentsAssignment_5_10_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_10__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_10__4__Impl
	rule__ComponentSupportedPlatform__Group_5_10__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_10__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_10_4()); }

	'}' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_10_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_10__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_10__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_10__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_10_5()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_10_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__ComponentSupportedPlatform__Group_5_11__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_11__0__Impl
	rule__ComponentSupportedPlatform__Group_5_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_11__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getConnectionsKeyword_5_11_0()); }

	'connections' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getConnectionsKeyword_5_11_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_11__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_11__1__Impl
	rule__ComponentSupportedPlatform__Group_5_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_11__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_11_1()); }

	'{' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_11_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_11__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_11__2__Impl
	rule__ComponentSupportedPlatform__Group_5_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_11__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getConnectionsAssignment_5_11_2()); }
(rule__ComponentSupportedPlatform__ConnectionsAssignment_5_11_2)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getConnectionsAssignment_5_11_2()); }
)
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getConnectionsAssignment_5_11_2()); }
(rule__ComponentSupportedPlatform__ConnectionsAssignment_5_11_2)*
{ after(grammarAccess.getComponentSupportedPlatformAccess().getConnectionsAssignment_5_11_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_11__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_11__3__Impl
	rule__ComponentSupportedPlatform__Group_5_11__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_11__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_11_3()); }

	'}' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_11_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__Group_5_11__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__Group_5_11__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__Group_5_11__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_11_4()); }

	';' 

{ after(grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_11_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}













rule__MAbstractComponent__UnorderedGroup_8
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());
    }
:
	rule__MAbstractComponent__UnorderedGroup_8__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__UnorderedGroup_8__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAbstractComponentAccess().getGroup_8_0()); }
						(rule__MAbstractComponent__Group_8_0__0)
						{ after(grammarAccess.getMAbstractComponentAccess().getGroup_8_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAbstractComponentAccess().getGroup_8_1()); }
						(rule__MAbstractComponent__Group_8_1__0)
						{ after(grammarAccess.getMAbstractComponentAccess().getGroup_8_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAbstractComponentAccess().getGroup_8_2()); }
						(rule__MAbstractComponent__Group_8_2__0)
						{ after(grammarAccess.getMAbstractComponentAccess().getGroup_8_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAbstractComponentAccess().getGroup_8_3()); }
						(rule__MAbstractComponent__Group_8_3__0)
						{ after(grammarAccess.getMAbstractComponentAccess().getGroup_8_3()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__UnorderedGroup_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__UnorderedGroup_8__Impl
	rule__MAbstractComponent__UnorderedGroup_8__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__UnorderedGroup_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__UnorderedGroup_8__Impl
	rule__MAbstractComponent__UnorderedGroup_8__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__UnorderedGroup_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__UnorderedGroup_8__Impl
	rule__MAbstractComponent__UnorderedGroup_8__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractComponent__UnorderedGroup_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractComponent__UnorderedGroup_8__Impl
;
finally {
	restoreStackSize(stackSize);
}










rule__MComponent__UnorderedGroup_8
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
    }
:
	rule__MComponent__UnorderedGroup_8__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMComponentAccess().getUnorderedGroup_8())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	restoreStackSize(stackSize);
}


rule__MComponent__UnorderedGroup_8__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMComponentAccess().getGroup_8_0()); }
						(rule__MComponent__Group_8_0__0)
						{ after(grammarAccess.getMComponentAccess().getGroup_8_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMComponentAccess().getGroup_8_1()); }
						(rule__MComponent__Group_8_1__0)
						{ after(grammarAccess.getMComponentAccess().getGroup_8_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMComponentAccess().getGroup_8_2()); }
						(rule__MComponent__Group_8_2__0)
						{ after(grammarAccess.getMComponentAccess().getGroup_8_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMComponentAccess().getGroup_8_3()); }
						(rule__MComponent__Group_8_3__0)
						{ after(grammarAccess.getMComponentAccess().getGroup_8_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMComponentAccess().getGroup_8_4()); }
						(rule__MComponent__Group_8_4__0)
						{ after(grammarAccess.getMComponentAccess().getGroup_8_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMComponentAccess().getGroup_8_5()); }
						(rule__MComponent__Group_8_5__0)
						{ after(grammarAccess.getMComponentAccess().getGroup_8_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMComponentAccess().getGroup_8_6()); }
						(rule__MComponent__Group_8_6__0)
						{ after(grammarAccess.getMComponentAccess().getGroup_8_6()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 7);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMComponentAccess().getGroup_8_7()); }
						(rule__MComponent__Group_8_7__0)
						{ after(grammarAccess.getMComponentAccess().getGroup_8_7()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 8);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMComponentAccess().getGroup_8_8()); }
						(rule__MComponent__Group_8_8__0)
						{ after(grammarAccess.getMComponentAccess().getGroup_8_8()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 9)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 9);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMComponentAccess().getGroup_8_9()); }
						(rule__MComponent__Group_8_9__0)
						{ after(grammarAccess.getMComponentAccess().getGroup_8_9()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	restoreStackSize(stackSize);
}


rule__MComponent__UnorderedGroup_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__UnorderedGroup_8__Impl
	rule__MComponent__UnorderedGroup_8__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__UnorderedGroup_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__UnorderedGroup_8__Impl
	rule__MComponent__UnorderedGroup_8__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__UnorderedGroup_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__UnorderedGroup_8__Impl
	rule__MComponent__UnorderedGroup_8__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__UnorderedGroup_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__UnorderedGroup_8__Impl
	rule__MComponent__UnorderedGroup_8__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__UnorderedGroup_8__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__UnorderedGroup_8__Impl
	rule__MComponent__UnorderedGroup_8__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__UnorderedGroup_8__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__UnorderedGroup_8__Impl
	rule__MComponent__UnorderedGroup_8__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__UnorderedGroup_8__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__UnorderedGroup_8__Impl
	rule__MComponent__UnorderedGroup_8__7?
;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__UnorderedGroup_8__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__UnorderedGroup_8__Impl
	rule__MComponent__UnorderedGroup_8__8?
;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__UnorderedGroup_8__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__UnorderedGroup_8__Impl
	rule__MComponent__UnorderedGroup_8__9?
;
finally {
	restoreStackSize(stackSize);
}


rule__MComponent__UnorderedGroup_8__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponent__UnorderedGroup_8__Impl
;
finally {
	restoreStackSize(stackSize);
}






















rule__ComponentSupportedPlatform__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_0()); }
						(rule__ComponentSupportedPlatform__Group_5_0__0)
						{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_1()); }
						(rule__ComponentSupportedPlatform__Group_5_1__0)
						{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_2()); }
						(rule__ComponentSupportedPlatform__Group_5_2__0)
						{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_3()); }
						(rule__ComponentSupportedPlatform__Group_5_3__0)
						{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_4()); }
						(rule__ComponentSupportedPlatform__Group_5_4__0)
						{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_5()); }
						(rule__ComponentSupportedPlatform__Group_5_5__0)
						{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_6()); }
						(rule__ComponentSupportedPlatform__Group_5_6__0)
						{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_6()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 7);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_7()); }
						(rule__ComponentSupportedPlatform__Group_5_7__0)
						{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_7()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 8);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_8()); }
						(rule__ComponentSupportedPlatform__Group_5_8__0)
						{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_8()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 9)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 9);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_9()); }
						(rule__ComponentSupportedPlatform__Group_5_9__0)
						{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_9()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 10)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 10);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_10()); }
						(rule__ComponentSupportedPlatform__Group_5_10__0)
						{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_10()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 11)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 11);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_11()); }
						(rule__ComponentSupportedPlatform__Group_5_11__0)
						{ after(grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_11()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
	rule__ComponentSupportedPlatform__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
	rule__ComponentSupportedPlatform__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
	rule__ComponentSupportedPlatform__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
	rule__ComponentSupportedPlatform__UnorderedGroup_5__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
	rule__ComponentSupportedPlatform__UnorderedGroup_5__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
	rule__ComponentSupportedPlatform__UnorderedGroup_5__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
	rule__ComponentSupportedPlatform__UnorderedGroup_5__7?
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
	rule__ComponentSupportedPlatform__UnorderedGroup_5__8?
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
	rule__ComponentSupportedPlatform__UnorderedGroup_5__9?
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
	rule__ComponentSupportedPlatform__UnorderedGroup_5__10?
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
	rule__ComponentSupportedPlatform__UnorderedGroup_5__11?
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentSupportedPlatform__UnorderedGroup_5__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComponentSupportedPlatform__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}


























rule__MMCLEVCMPPackageFile__PackageAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); }
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVCMPPackageFile__ImportsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVCMPPackageFile__ElementAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVCMPPackageFileAccess().getElementMMCLEVCMPPackageElementParserRuleCall_4_0()); }
	ruleMMCLEVCMPPackageElement{ after(grammarAccess.getMMCLEVCMPPackageFileAccess().getElementMMCLEVCMPPackageElementParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__DomainAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getDomainMDomainCrossReference_2_0()); }
(
{ before(grammarAccess.getMAbstractComponentAccess().getDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMAbstractComponentAccess().getDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMAbstractComponentAccess().getDomainMDomainCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__TypeAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getTypeMComponentTypeCrossReference_4_0()); }
(
{ before(grammarAccess.getMAbstractComponentAccess().getTypeMComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMAbstractComponentAccess().getTypeMComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); }
)
{ after(grammarAccess.getMAbstractComponentAccess().getTypeMComponentTypeCrossReference_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__NameAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getNameIDTerminalRuleCall_5_0()); }
	RULE_ID{ after(grammarAccess.getMAbstractComponentAccess().getNameIDTerminalRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__InheritsAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentCrossReference_6_1_0()); }
(
{ before(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__InheritsAssignment_6_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentCrossReference_6_2_1_0()); }
(
{ before(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_2_1_0_1()); }
)
{ after(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentCrossReference_6_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__VersionAssignment_8_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getVersionVersionParserRuleCall_8_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMAbstractComponentAccess().getVersionVersionParserRuleCall_8_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__AttributesAssignment_8_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getAttributesMParameterParserRuleCall_8_1_2_0()); }
	ruleMParameter{ after(grammarAccess.getMAbstractComponentAccess().getAttributesMParameterParserRuleCall_8_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__AttributeValueAssignmentsAssignment_8_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_2_3_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMAbstractComponentAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractComponent__ExternalPortsAssignment_8_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractComponentAccess().getExternalPortsMPortParserRuleCall_8_3_3_0()); }
	ruleMPort{ after(grammarAccess.getMAbstractComponentAccess().getExternalPortsMPortParserRuleCall_8_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__DomainAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getDomainMDomainCrossReference_2_0()); }
(
{ before(grammarAccess.getMComponentAccess().getDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMComponentAccess().getDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMComponentAccess().getDomainMDomainCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__TypeAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getTypeMComponentTypeCrossReference_4_0()); }
(
{ before(grammarAccess.getMComponentAccess().getTypeMComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMComponentAccess().getTypeMComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); }
)
{ after(grammarAccess.getMComponentAccess().getTypeMComponentTypeCrossReference_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__NameAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getNameIDTerminalRuleCall_5_0()); }
	RULE_ID{ after(grammarAccess.getMComponentAccess().getNameIDTerminalRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__InheritsAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentCrossReference_6_1_0()); }
(
{ before(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__InheritsAssignment_6_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentCrossReference_6_2_1_0()); }
(
{ before(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentVersionedQualifiedNameParserRuleCall_6_2_1_0_1()); }
)
{ after(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentCrossReference_6_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__VersionAssignment_8_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getVersionVersionParserRuleCall_8_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMComponentAccess().getVersionVersionParserRuleCall_8_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__LanguagesAssignment_8_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLanguagesMLanguageCrossReference_8_1_2_0()); }
(
{ before(grammarAccess.getMComponentAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_8_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMComponentAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_8_1_2_0_1()); }
)
{ after(grammarAccess.getMComponentAccess().getLanguagesMLanguageCrossReference_8_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__LanguagesAssignment_8_1_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getLanguagesMLanguageCrossReference_8_1_3_1_0()); }
(
{ before(grammarAccess.getMComponentAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_8_1_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMComponentAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_8_1_3_1_0_1()); }
)
{ after(grammarAccess.getMComponentAccess().getLanguagesMLanguageCrossReference_8_1_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__AttributesAssignment_8_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getAttributesMParameterParserRuleCall_8_2_2_0()); }
	ruleMParameter{ after(grammarAccess.getMComponentAccess().getAttributesMParameterParserRuleCall_8_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__AttributeValueAssignmentsAssignment_8_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_3_3_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMComponentAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__ExternalPortsAssignment_8_4_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getExternalPortsMPortParserRuleCall_8_4_3_0()); }
	ruleMPort{ after(grammarAccess.getMComponentAccess().getExternalPortsMPortParserRuleCall_8_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__InternalPortsAssignment_8_5_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getInternalPortsMPortParserRuleCall_8_5_3_0()); }
	ruleMPort{ after(grammarAccess.getMComponentAccess().getInternalPortsMPortParserRuleCall_8_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__RequiresAssignment_8_6_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRequiresMSAICrossReference_8_6_2_0()); }
(
{ before(grammarAccess.getMComponentAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_8_6_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMComponentAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_8_6_2_0_1()); }
)
{ after(grammarAccess.getMComponentAccess().getRequiresMSAICrossReference_8_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__RequiresAssignment_8_6_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getRequiresMSAICrossReference_8_6_3_1_0()); }
(
{ before(grammarAccess.getMComponentAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_8_6_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMComponentAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_8_6_3_1_0_1()); }
)
{ after(grammarAccess.getMComponentAccess().getRequiresMSAICrossReference_8_6_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__SupportedPlatformsAssignment_8_7_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getSupportedPlatformsComponentSupportedPlatformParserRuleCall_8_7_3_0()); }
	ruleComponentSupportedPlatform{ after(grammarAccess.getMComponentAccess().getSupportedPlatformsComponentSupportedPlatformParserRuleCall_8_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__InternalComponentsAssignment_8_8_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getInternalComponentsMInternalComponentInstanceParserRuleCall_8_8_3_0()); }
	ruleMInternalComponentInstance{ after(grammarAccess.getMComponentAccess().getInternalComponentsMInternalComponentInstanceParserRuleCall_8_8_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponent__ConnectionsAssignment_8_9_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentAccess().getConnectionsMInternalConnectionParserRuleCall_8_9_2_0()); }
	ruleMInternalConnection{ after(grammarAccess.getMComponentAccess().getConnectionsMInternalConnectionParserRuleCall_8_9_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentInstance__IsSingletonAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getIsSingletonSingletonKeyword_0_0()); }
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getIsSingletonSingletonKeyword_0_0()); }

	'singleton' 

{ after(grammarAccess.getMInternalComponentInstanceAccess().getIsSingletonSingletonKeyword_0_0()); }
)

{ after(grammarAccess.getMInternalComponentInstanceAccess().getIsSingletonSingletonKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentInstance__ComponentAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getComponentMComponentCrossReference_2_0()); }
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getComponentMComponentVersionedQualifiedNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMInternalComponentInstanceAccess().getComponentMComponentVersionedQualifiedNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMInternalComponentInstanceAccess().getComponentMComponentCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentInstance__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMInternalComponentInstanceAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentInstance__AttributeValueAssignmentsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentInstanceAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMInternalComponentInstanceAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getTypeMPortTypeCrossReference_2_0()); }
(
{ before(grammarAccess.getMServerPortAccess().getTypeMPortTypeVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMServerPortAccess().getTypeMPortTypeVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMServerPortAccess().getTypeMPortTypeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__InterfaceAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getInterfaceMInterfaceCrossReference_3_0()); }
(
{ before(grammarAccess.getMServerPortAccess().getInterfaceMInterfaceVersionedQualifiedNameParserRuleCall_3_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServerPortAccess().getInterfaceMInterfaceVersionedQualifiedNameParserRuleCall_3_0_1()); }
)
{ after(grammarAccess.getMServerPortAccess().getInterfaceMInterfaceCrossReference_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__NameAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getNameIDTerminalRuleCall_4_0()); }
	RULE_ID{ after(grammarAccess.getMServerPortAccess().getNameIDTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServerPort__AttributeValueAssignmentsAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServerPortAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMServerPortAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getTypeMPortTypeCrossReference_2_0()); }
(
{ before(grammarAccess.getMClientPortAccess().getTypeMPortTypeVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMClientPortAccess().getTypeMPortTypeVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMClientPortAccess().getTypeMPortTypeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__InterfaceAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getInterfaceMInterfaceCrossReference_3_0()); }
(
{ before(grammarAccess.getMClientPortAccess().getInterfaceMInterfaceVersionedQualifiedNameParserRuleCall_3_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMClientPortAccess().getInterfaceMInterfaceVersionedQualifiedNameParserRuleCall_3_0_1()); }
)
{ after(grammarAccess.getMClientPortAccess().getInterfaceMInterfaceCrossReference_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__NameAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getNameIDTerminalRuleCall_4_0()); }
	RULE_ID{ after(grammarAccess.getMClientPortAccess().getNameIDTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MClientPort__AttributeValueAssignmentsAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMClientPortAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMClientPortAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueAssignment__ParameterAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueAssignmentAccess().getParameterMParameterCrossReference_1_0()); }
(
{ before(grammarAccess.getMParameterValueAssignmentAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMParameterValueAssignmentAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMParameterValueAssignmentAccess().getParameterMParameterCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterValueAssignment__ParameterValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterValueAssignmentAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMParameterValueAssignmentAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__DefaultValueAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__RangeAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); }
	ruleMParameterRange{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__LiteralsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0()); }
	ruleMEnumParameterLiteralRule{ after(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__LiteralsAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0()); }
	ruleMEnumParameterLiteralRule{ after(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); }
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__DefaultValueAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_5_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__DefaultValueAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__RangeAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); }
	ruleMParameterRange{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); }
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

rule__MParameterOCR__LowerValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMParameterOCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOCR__UpperValueAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMParameterOCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOOR__LowerValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMParameterOORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterOOR__UpperValueAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterOORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMParameterOORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCOR__LowerValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMParameterCORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCOR__UpperValueAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMParameterCORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCCR__LowerValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMParameterCCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterCCR__UpperValueAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterCCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMParameterCCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterLiteral__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterLiteralAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMEnumParameterLiteralAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamIntegerLiteral__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamIntegerLiteralAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMEnumParamIntegerLiteralAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamIntegerLiteral__ValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueINTEGERParserRuleCall_3_0()); }
	ruleINTEGER{ after(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueINTEGERParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamRealLiteral__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamRealLiteralAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMEnumParamRealLiteralAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamRealLiteral__ValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamRealLiteralAccess().getValueREALParserRuleCall_3_0()); }
	ruleREAL{ after(grammarAccess.getMEnumParamRealLiteralAccess().getValueREALParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteral__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMEnumParamStringLiteralAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteral__IsRawAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0()); }
(
{ before(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0()); }

	'raw' 

{ after(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0()); }
)

{ after(grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteral__ValueAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralAccess().getValueSTRINGTerminalRuleCall_4_0()); }
	RULE_STRING{ after(grammarAccess.getMEnumParamStringLiteralAccess().getValueSTRINGTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParameterSingleExpression__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParameterSingleExpression__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParameterSingleExpression__DefaultValueAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParameterSingleExpression__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParameterSingleExpression__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParameterSingleExpression__DefaultValueAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__ClientInstanceAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getClientInstanceMInternalComponentInstanceCrossReference_2_1_0()); }
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getClientInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMInternalComponentConnectionAccess().getClientInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getClientInstanceMInternalComponentInstanceCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__ClientPortAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getClientPortMClientPortCrossReference_4_0()); }
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getClientPortMClientPortIDTerminalRuleCall_4_0_1()); }
	RULE_ID{ after(grammarAccess.getMInternalComponentConnectionAccess().getClientPortMClientPortIDTerminalRuleCall_4_0_1()); }
)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getClientPortMClientPortCrossReference_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__ServerInstanceAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getServerInstanceMInternalComponentInstanceCrossReference_6_1_0()); }
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getServerInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_6_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMInternalComponentConnectionAccess().getServerInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getServerInstanceMInternalComponentInstanceCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__ServerPortAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getServerPortMServerPortCrossReference_8_0()); }
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getServerPortMServerPortIDTerminalRuleCall_8_0_1()); }
	RULE_ID{ after(grammarAccess.getMInternalComponentConnectionAccess().getServerPortMServerPortIDTerminalRuleCall_8_0_1()); }
)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getServerPortMServerPortCrossReference_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__ConnectorAssignment_9_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getConnectorMConnectorCrossReference_9_1_0()); }
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_9_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMInternalComponentConnectionAccess().getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_9_1_0_1()); }
)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getConnectorMConnectorCrossReference_9_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__IfaceMappingAssignment_9_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_9_3_2_0()); }
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_9_3_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMInternalComponentConnectionAccess().getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_9_3_2_0_1()); }
)
{ after(grammarAccess.getMInternalComponentConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_9_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentConnection__AttributeValueAssignmentsAssignment_9_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentConnectionAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_9_4_1_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMInternalComponentConnectionAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_9_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__ClientInstanceAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientInstanceMInternalComponentInstanceCrossReference_2_1_0()); }
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientInstanceMInternalComponentInstanceVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientInstanceMInternalComponentInstanceCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__ClientPortAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientPortMClientPortCrossReference_4_0()); }
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientPortMClientPortIDTerminalRuleCall_4_0_1()); }
	RULE_ID{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientPortMClientPortIDTerminalRuleCall_4_0_1()); }
)
{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientPortMClientPortCrossReference_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitch__CasesAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchAccess().getCasesMInternalComponentPlatformSwitchCaseParserRuleCall_8_0()); }
	ruleMInternalComponentPlatformSwitchCase{ after(grammarAccess.getMInternalComponentPlatformSwitchAccess().getCasesMInternalComponentPlatformSwitchCaseParserRuleCall_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getPlatformMComponentSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getPlatformMComponentSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getPlatformMComponentSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getPlatformMComponentSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__ServerInstanceAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerInstanceMInternalComponentInstanceCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerInstanceMInternalComponentInstanceIDTerminalRuleCall_3_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerInstanceMInternalComponentInstanceIDTerminalRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerInstanceMInternalComponentInstanceCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__ServerPortAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerPortMServerPortCrossReference_5_0()); }
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerPortMServerPortIDTerminalRuleCall_5_0_1()); }
	RULE_ID{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerPortMServerPortIDTerminalRuleCall_5_0_1()); }
)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerPortMServerPortCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__ConnectorAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getConnectorMConnectorCrossReference_6_1_0()); }
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_6_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getConnectorMConnectorCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__IfaceMappingAssignment_6_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getIfaceMappingMInterfaceMappingCrossReference_6_3_2_0()); }
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_6_3_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_6_3_2_0_1()); }
)
{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getIfaceMappingMInterfaceMappingCrossReference_6_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalComponentPlatformSwitchCase__AttributeValueAssignmentsAssignment_6_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_4_1_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getComponentSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__OsapiAssignment_5_0_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); }
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getComponentSupportedPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1()); }
)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__OsAssignment_5_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); }
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getComponentSupportedPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1()); }
)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__ArchitectureAssignment_5_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); }
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getComponentSupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1()); }
)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__CompilerAssignment_5_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); }
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getComponentSupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1()); }
)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__MicroprocessorAssignment_5_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); }
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1()); }
)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__BoardAssignment_5_5_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); }
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getComponentSupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1()); }
)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__RequiresAssignment_5_6_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAICrossReference_5_6_2_0()); }
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_6_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_6_2_0_1()); }
)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAICrossReference_5_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__RequiresAssignment_5_6_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAICrossReference_5_6_3_1_0()); }
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1()); }
)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAICrossReference_5_6_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__AttributeValueAssignmentsAssignment_5_7_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_7_3_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getComponentSupportedPlatformAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__AttributesAssignment_5_8_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getAttributesMParameterParserRuleCall_5_8_2_0()); }
	ruleMParameter{ after(grammarAccess.getComponentSupportedPlatformAccess().getAttributesMParameterParserRuleCall_5_8_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__LanguagesAssignment_5_9_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_9_2_0()); }
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_9_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_9_2_0_1()); }
)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_9_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__LanguagesAssignment_5_9_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_9_3_1_0()); }
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_9_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_9_3_1_0_1()); }
)
{ after(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_9_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__InternalComponentsAssignment_5_10_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getInternalComponentsMInternalComponentInstanceParserRuleCall_5_10_3_0()); }
	ruleMInternalComponentInstance{ after(grammarAccess.getComponentSupportedPlatformAccess().getInternalComponentsMInternalComponentInstanceParserRuleCall_5_10_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentSupportedPlatform__ConnectionsAssignment_5_11_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentSupportedPlatformAccess().getConnectionsMInternalComponentConnectionParserRuleCall_5_11_2_0()); }
	ruleMInternalComponentConnection{ after(grammarAccess.getComponentSupportedPlatformAccess().getConnectionsMInternalComponentConnectionParserRuleCall_5_11_2_0()); }
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


