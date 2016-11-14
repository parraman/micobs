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
grammar InternalDEP;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
	
}

@lexer::header {
package es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal; 

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
import es.uah.aut.srg.micobs.mesp.lang.services.DEPGrammarAccess;

}

@parser::members {
 
 	private DEPGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(DEPGrammarAccess grammarAccess) {
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




// Entry rule entryRuleMMESPDEPPackageFile
entryRuleMMESPDEPPackageFile 
:
{ before(grammarAccess.getMMESPDEPPackageFileRule()); }
	 ruleMMESPDEPPackageFile
{ after(grammarAccess.getMMESPDEPPackageFileRule()); } 
	 EOF 
;

// Rule MMESPDEPPackageFile
ruleMMESPDEPPackageFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getGroup()); }
(rule__MMESPDEPPackageFile__Group__0)
{ after(grammarAccess.getMMESPDEPPackageFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMESPDEPPackageElement
entryRuleMMESPDEPPackageElement 
:
{ before(grammarAccess.getMMESPDEPPackageElementRule()); }
	 ruleMMESPDEPPackageElement
{ after(grammarAccess.getMMESPDEPPackageElementRule()); } 
	 EOF 
;

// Rule MMESPDEPPackageElement
ruleMMESPDEPPackageElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPDEPPackageElementAccess().getMMESPDeploymentParserRuleCall()); }
	ruleMMESPDeployment
{ after(grammarAccess.getMMESPDEPPackageElementAccess().getMMESPDeploymentParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMESPDeployment
entryRuleMMESPDeployment 
:
{ before(grammarAccess.getMMESPDeploymentRule()); }
	 ruleMMESPDeployment
{ after(grammarAccess.getMMESPDeploymentRule()); } 
	 EOF 
;

// Rule MMESPDeployment
ruleMMESPDeployment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getGroup()); }
(rule__MMESPDeployment__Group__0)
{ after(grammarAccess.getMMESPDeploymentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMSwPackageRequiredInterface
entryRuleMSwPackageRequiredInterface 
:
{ before(grammarAccess.getMSwPackageRequiredInterfaceRule()); }
	 ruleMSwPackageRequiredInterface
{ after(grammarAccess.getMSwPackageRequiredInterfaceRule()); } 
	 EOF 
;

// Rule MSwPackageRequiredInterface
ruleMSwPackageRequiredInterface
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMSwPackageRequiredInterfaceAccess().getGroup()); }
(rule__MSwPackageRequiredInterface__Group__0)
{ after(grammarAccess.getMSwPackageRequiredInterfaceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMResourceDemand
entryRuleMResourceDemand 
:
{ before(grammarAccess.getMResourceDemandRule()); }
	 ruleMResourceDemand
{ after(grammarAccess.getMResourceDemandRule()); } 
	 EOF 
;

// Rule MResourceDemand
ruleMResourceDemand
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMResourceDemandAccess().getAlternatives()); }
(rule__MResourceDemand__Alternatives)
{ after(grammarAccess.getMResourceDemandAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMInstantiableResourceDemand
entryRuleMInstantiableResourceDemand 
:
{ before(grammarAccess.getMInstantiableResourceDemandRule()); }
	 ruleMInstantiableResourceDemand
{ after(grammarAccess.getMInstantiableResourceDemandRule()); } 
	 EOF 
;

// Rule MInstantiableResourceDemand
ruleMInstantiableResourceDemand
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getGroup()); }
(rule__MInstantiableResourceDemand__Group__0)
{ after(grammarAccess.getMInstantiableResourceDemandAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMQuantifiableResourceDemand
entryRuleMQuantifiableResourceDemand 
:
{ before(grammarAccess.getMQuantifiableResourceDemandRule()); }
	 ruleMQuantifiableResourceDemand
{ after(grammarAccess.getMQuantifiableResourceDemandRule()); } 
	 EOF 
;

// Rule MQuantifiableResourceDemand
ruleMQuantifiableResourceDemand
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMQuantifiableResourceDemandAccess().getGroup()); }
(rule__MQuantifiableResourceDemand__Group__0)
{ after(grammarAccess.getMQuantifiableResourceDemandAccess().getGroup()); }
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



// Entry rule entryRuleMMESPSwPackageDeployment
entryRuleMMESPSwPackageDeployment 
:
{ before(grammarAccess.getMMESPSwPackageDeploymentRule()); }
	 ruleMMESPSwPackageDeployment
{ after(grammarAccess.getMMESPSwPackageDeploymentRule()); } 
	 EOF 
;

// Rule MMESPSwPackageDeployment
ruleMMESPSwPackageDeployment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPSwPackageDeploymentAccess().getAlternatives()); }
(rule__MMESPSwPackageDeployment__Alternatives)
{ after(grammarAccess.getMMESPSwPackageDeploymentAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMESPRegularSwPackageDeployment
entryRuleMMESPRegularSwPackageDeployment 
:
{ before(grammarAccess.getMMESPRegularSwPackageDeploymentRule()); }
	 ruleMMESPRegularSwPackageDeployment
{ after(grammarAccess.getMMESPRegularSwPackageDeploymentRule()); } 
	 EOF 
;

// Rule MMESPRegularSwPackageDeployment
ruleMMESPRegularSwPackageDeployment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getGroup()); }
(rule__MMESPRegularSwPackageDeployment__Group__0)
{ after(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMESPDriverSwPackageDeployment
entryRuleMMESPDriverSwPackageDeployment 
:
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentRule()); }
	 ruleMMESPDriverSwPackageDeployment
{ after(grammarAccess.getMMESPDriverSwPackageDeploymentRule()); } 
	 EOF 
;

// Rule MMESPDriverSwPackageDeployment
ruleMMESPDriverSwPackageDeployment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getGroup()); }
(rule__MMESPDriverSwPackageDeployment__Group__0)
{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMESPDeviceDriverMapping
entryRuleMMESPDeviceDriverMapping 
:
{ before(grammarAccess.getMMESPDeviceDriverMappingRule()); }
	 ruleMMESPDeviceDriverMapping
{ after(grammarAccess.getMMESPDeviceDriverMappingRule()); } 
	 EOF 
;

// Rule MMESPDeviceDriverMapping
ruleMMESPDeviceDriverMapping
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getGroup()); }
(rule__MMESPDeviceDriverMapping__Group__0)
{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getGroup()); }
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



// Entry rule entryRuleMMESPDeploymentPlatform
entryRuleMMESPDeploymentPlatform 
:
{ before(grammarAccess.getMMESPDeploymentPlatformRule()); }
	 ruleMMESPDeploymentPlatform
{ after(grammarAccess.getMMESPDeploymentPlatformRule()); } 
	 EOF 
;

// Rule MMESPDeploymentPlatform
ruleMMESPDeploymentPlatform
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup()); }
(rule__MMESPDeploymentPlatform__Group__0)
{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMESPDeployedDevice
entryRuleMMESPDeployedDevice 
:
{ before(grammarAccess.getMMESPDeployedDeviceRule()); }
	 ruleMMESPDeployedDevice
{ after(grammarAccess.getMMESPDeployedDeviceRule()); } 
	 EOF 
;

// Rule MMESPDeployedDevice
ruleMMESPDeployedDevice
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPDeployedDeviceAccess().getGroup()); }
(rule__MMESPDeployedDevice__Group__0)
{ after(grammarAccess.getMMESPDeployedDeviceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMESPDeploymentAlternative
entryRuleMMESPDeploymentAlternative 
:
{ before(grammarAccess.getMMESPDeploymentAlternativeRule()); }
	 ruleMMESPDeploymentAlternative
{ after(grammarAccess.getMMESPDeploymentAlternativeRule()); } 
	 EOF 
;

// Rule MMESPDeploymentAlternative
ruleMMESPDeploymentAlternative
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup()); }
(rule__MMESPDeploymentAlternative__Group__0)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup()); }
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



rule__MResourceDemand__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMResourceDemandAccess().getMQuantifiableResourceDemandParserRuleCall_0()); }
	ruleMQuantifiableResourceDemand
{ after(grammarAccess.getMResourceDemandAccess().getMQuantifiableResourceDemandParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMResourceDemandAccess().getMInstantiableResourceDemandParserRuleCall_1()); }
	ruleMInstantiableResourceDemand
{ after(grammarAccess.getMResourceDemandAccess().getMInstantiableResourceDemandParserRuleCall_1()); }
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

rule__MMESPSwPackageDeployment__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSwPackageDeploymentAccess().getMMESPRegularSwPackageDeploymentParserRuleCall_0()); }
	ruleMMESPRegularSwPackageDeployment
{ after(grammarAccess.getMMESPSwPackageDeploymentAccess().getMMESPRegularSwPackageDeploymentParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMMESPSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentParserRuleCall_1()); }
	ruleMMESPDriverSwPackageDeployment
{ after(grammarAccess.getMMESPSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentParserRuleCall_1()); }
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



rule__MMESPDEPPackageFile__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDEPPackageFile__Group__0__Impl
	rule__MMESPDEPPackageFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDEPPackageFile__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getMMESPDEPPackageFileAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDEPPackageFile__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDEPPackageFile__Group__1__Impl
	rule__MMESPDEPPackageFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDEPPackageFile__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getPackageAssignment_1()); }
(rule__MMESPDEPPackageFile__PackageAssignment_1)
{ after(grammarAccess.getMMESPDEPPackageFileAccess().getPackageAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDEPPackageFile__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDEPPackageFile__Group__2__Impl
	rule__MMESPDEPPackageFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDEPPackageFile__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getMMESPDEPPackageFileAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDEPPackageFile__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDEPPackageFile__Group__3__Impl
	rule__MMESPDEPPackageFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDEPPackageFile__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getGroup_3()); }
(rule__MMESPDEPPackageFile__Group_3__0)*
{ after(grammarAccess.getMMESPDEPPackageFileAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDEPPackageFile__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDEPPackageFile__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDEPPackageFile__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getElementAssignment_4()); }
(rule__MMESPDEPPackageFile__ElementAssignment_4)
{ after(grammarAccess.getMMESPDEPPackageFileAccess().getElementAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMESPDEPPackageFile__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDEPPackageFile__Group_3__0__Impl
	rule__MMESPDEPPackageFile__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDEPPackageFile__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getImportKeyword_3_0()); }

	'import' 

{ after(grammarAccess.getMMESPDEPPackageFileAccess().getImportKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDEPPackageFile__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDEPPackageFile__Group_3__1__Impl
	rule__MMESPDEPPackageFile__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDEPPackageFile__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getImportsAssignment_3_1()); }
(rule__MMESPDEPPackageFile__ImportsAssignment_3_1)
{ after(grammarAccess.getMMESPDEPPackageFileAccess().getImportsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDEPPackageFile__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDEPPackageFile__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDEPPackageFile__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getMMESPDEPPackageFileAccess().getSemicolonKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MMESPDeployment__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group__0__Impl
	rule__MMESPDeployment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getMMESPDeploymentAction_0()); }
(

)
{ after(grammarAccess.getMMESPDeploymentAccess().getMMESPDeploymentAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group__1__Impl
	rule__MMESPDeployment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_1()); }

	'deployment' 

{ after(grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group__2__Impl
	rule__MMESPDeployment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getProjectKeyword_2()); }

	'project' 

{ after(grammarAccess.getMMESPDeploymentAccess().getProjectKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group__3__Impl
	rule__MMESPDeployment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getNameAssignment_3()); }
(rule__MMESPDeployment__NameAssignment_3)
{ after(grammarAccess.getMMESPDeploymentAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group__4__Impl
	rule__MMESPDeployment__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group__5__Impl
	rule__MMESPDeployment__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5()); }
(rule__MMESPDeployment__UnorderedGroup_5)
{ after(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group__6__Impl
	rule__MMESPDeployment__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MMESPDeployment__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_0__0__Impl
	rule__MMESPDeployment__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getVersionKeyword_5_0_0()); }

	'version' 

{ after(grammarAccess.getMMESPDeploymentAccess().getVersionKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_0__1__Impl
	rule__MMESPDeployment__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_0__2__Impl
	rule__MMESPDeployment__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getVersionAssignment_5_0_2()); }
(rule__MMESPDeployment__VersionAssignment_5_0_2)
{ after(grammarAccess.getMMESPDeploymentAccess().getVersionAssignment_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MMESPDeployment__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_1__0__Impl
	rule__MMESPDeployment__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getConstructionKeyword_5_1_0()); }

	'construction' 

{ after(grammarAccess.getMMESPDeploymentAccess().getConstructionKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_1__1__Impl
	rule__MMESPDeployment__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getToolKeyword_5_1_1()); }

	'tool' 

{ after(grammarAccess.getMMESPDeploymentAccess().getToolKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_1__2__Impl
	rule__MMESPDeployment__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_1_2()); }

	':=' 

{ after(grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_1__3__Impl
	rule__MMESPDeployment__Group_5_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getCtoolAssignment_5_1_3()); }
(rule__MMESPDeployment__CtoolAssignment_5_1_3)
{ after(grammarAccess.getMMESPDeploymentAccess().getCtoolAssignment_5_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_1_4()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMESPDeployment__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_2__0__Impl
	rule__MMESPDeployment__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getLanguagesKeyword_5_2_0()); }

	'languages' 

{ after(grammarAccess.getMMESPDeploymentAccess().getLanguagesKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_2__1__Impl
	rule__MMESPDeployment__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_2_1()); }

	':=' 

{ after(grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_2__2__Impl
	rule__MMESPDeployment__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getLanguagesAssignment_5_2_2()); }
(rule__MMESPDeployment__LanguagesAssignment_5_2_2)
{ after(grammarAccess.getMMESPDeploymentAccess().getLanguagesAssignment_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_2__3__Impl
	rule__MMESPDeployment__Group_5_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getGroup_5_2_3()); }
(rule__MMESPDeployment__Group_5_2_3__0)*
{ after(grammarAccess.getMMESPDeploymentAccess().getGroup_5_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_2_4()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMESPDeployment__Group_5_2_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_2_3__0__Impl
	rule__MMESPDeployment__Group_5_2_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_2_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getCommaKeyword_5_2_3_0()); }

	',' 

{ after(grammarAccess.getMMESPDeploymentAccess().getCommaKeyword_5_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_2_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_2_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_2_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getLanguagesAssignment_5_2_3_1()); }
(rule__MMESPDeployment__LanguagesAssignment_5_2_3_1)
{ after(grammarAccess.getMMESPDeploymentAccess().getLanguagesAssignment_5_2_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MMESPDeployment__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_3__0__Impl
	rule__MMESPDeployment__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_5_3_0()); }

	'deployment' 

{ after(grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_3__1__Impl
	rule__MMESPDeployment__Group_5_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getPlatformsKeyword_5_3_1()); }

	'platforms' 

{ after(grammarAccess.getMMESPDeploymentAccess().getPlatformsKeyword_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_3__2__Impl
	rule__MMESPDeployment__Group_5_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_3_2()); }

	'{' 

{ after(grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_3__3__Impl
	rule__MMESPDeployment__Group_5_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMESPDeploymentAccess().getDeploymentPlatformsAssignment_5_3_3()); }
(rule__MMESPDeployment__DeploymentPlatformsAssignment_5_3_3)
{ after(grammarAccess.getMMESPDeploymentAccess().getDeploymentPlatformsAssignment_5_3_3()); }
)
(
{ before(grammarAccess.getMMESPDeploymentAccess().getDeploymentPlatformsAssignment_5_3_3()); }
(rule__MMESPDeployment__DeploymentPlatformsAssignment_5_3_3)*
{ after(grammarAccess.getMMESPDeploymentAccess().getDeploymentPlatformsAssignment_5_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_3__4__Impl
	rule__MMESPDeployment__Group_5_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_3_4()); }

	'}' 

{ after(grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_3_5()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MMESPDeployment__Group_5_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_4__0__Impl
	rule__MMESPDeployment__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getRequiredKeyword_5_4_0()); }

	'required' 

{ after(grammarAccess.getMMESPDeploymentAccess().getRequiredKeyword_5_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_4__1__Impl
	rule__MMESPDeployment__Group_5_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getInterfacesKeyword_5_4_1()); }

	'interfaces' 

{ after(grammarAccess.getMMESPDeploymentAccess().getInterfacesKeyword_5_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_4__2__Impl
	rule__MMESPDeployment__Group_5_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_4_2()); }

	'{' 

{ after(grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_4__3__Impl
	rule__MMESPDeployment__Group_5_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMESPDeploymentAccess().getRequiresAssignment_5_4_3()); }
(rule__MMESPDeployment__RequiresAssignment_5_4_3)
{ after(grammarAccess.getMMESPDeploymentAccess().getRequiresAssignment_5_4_3()); }
)
(
{ before(grammarAccess.getMMESPDeploymentAccess().getRequiresAssignment_5_4_3()); }
(rule__MMESPDeployment__RequiresAssignment_5_4_3)*
{ after(grammarAccess.getMMESPDeploymentAccess().getRequiresAssignment_5_4_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_4__4__Impl
	rule__MMESPDeployment__Group_5_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_4_4()); }

	'}' 

{ after(grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_4__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_4__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_4__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_4_5()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_4_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MMESPDeployment__Group_5_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_5__0__Impl
	rule__MMESPDeployment__Group_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getSwpackagesKeyword_5_5_0()); }

	'swpackages' 

{ after(grammarAccess.getMMESPDeploymentAccess().getSwpackagesKeyword_5_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_5__1__Impl
	rule__MMESPDeployment__Group_5_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_5_1()); }

	'{' 

{ after(grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_5__2__Impl
	rule__MMESPDeployment__Group_5_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMESPDeploymentAccess().getDeployedSwPackagesAssignment_5_5_2()); }
(rule__MMESPDeployment__DeployedSwPackagesAssignment_5_5_2)
{ after(grammarAccess.getMMESPDeploymentAccess().getDeployedSwPackagesAssignment_5_5_2()); }
)
(
{ before(grammarAccess.getMMESPDeploymentAccess().getDeployedSwPackagesAssignment_5_5_2()); }
(rule__MMESPDeployment__DeployedSwPackagesAssignment_5_5_2)*
{ after(grammarAccess.getMMESPDeploymentAccess().getDeployedSwPackagesAssignment_5_5_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_5__3__Impl
	rule__MMESPDeployment__Group_5_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_5_3()); }

	'}' 

{ after(grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_5__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_5_4()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_5_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMESPDeployment__Group_5_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_6__0__Impl
	rule__MMESPDeployment__Group_5_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_5_6_0()); }

	'deployment' 

{ after(grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_5_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_6__1__Impl
	rule__MMESPDeployment__Group_5_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getAlternativesKeyword_5_6_1()); }

	'alternatives' 

{ after(grammarAccess.getMMESPDeploymentAccess().getAlternativesKeyword_5_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_6__2__Impl
	rule__MMESPDeployment__Group_5_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_6_2()); }

	'{' 

{ after(grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_6__3__Impl
	rule__MMESPDeployment__Group_5_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMESPDeploymentAccess().getDeploymentAlternativesAssignment_5_6_3()); }
(rule__MMESPDeployment__DeploymentAlternativesAssignment_5_6_3)
{ after(grammarAccess.getMMESPDeploymentAccess().getDeploymentAlternativesAssignment_5_6_3()); }
)
(
{ before(grammarAccess.getMMESPDeploymentAccess().getDeploymentAlternativesAssignment_5_6_3()); }
(rule__MMESPDeployment__DeploymentAlternativesAssignment_5_6_3)*
{ after(grammarAccess.getMMESPDeploymentAccess().getDeploymentAlternativesAssignment_5_6_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_6__4__Impl
	rule__MMESPDeployment__Group_5_6__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_6_4()); }

	'}' 

{ after(grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__Group_5_6__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__Group_5_6__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__Group_5_6__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_6_5()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_6_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MSwPackageRequiredInterface__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageRequiredInterface__Group__0__Impl
	rule__MSwPackageRequiredInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageRequiredInterface__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageRequiredInterfaceAccess().getRequiresKeyword_0()); }

	'requires' 

{ after(grammarAccess.getMSwPackageRequiredInterfaceAccess().getRequiresKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageRequiredInterface__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageRequiredInterface__Group__1__Impl
	rule__MSwPackageRequiredInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageRequiredInterface__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceAssignment_1()); }
(rule__MSwPackageRequiredInterface__InterfaceAssignment_1)
{ after(grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageRequiredInterface__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageRequiredInterface__Group__2__Impl
	rule__MSwPackageRequiredInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageRequiredInterface__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageRequiredInterfaceAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMSwPackageRequiredInterfaceAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageRequiredInterface__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageRequiredInterface__Group__3__Impl
	rule__MSwPackageRequiredInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageRequiredInterface__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageRequiredInterfaceAccess().getResourceDemandsAssignment_3()); }
(rule__MSwPackageRequiredInterface__ResourceDemandsAssignment_3)*
{ after(grammarAccess.getMSwPackageRequiredInterfaceAccess().getResourceDemandsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageRequiredInterface__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageRequiredInterface__Group__4__Impl
	rule__MSwPackageRequiredInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageRequiredInterface__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageRequiredInterfaceAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMSwPackageRequiredInterfaceAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageRequiredInterface__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageRequiredInterface__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageRequiredInterface__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageRequiredInterfaceAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMSwPackageRequiredInterfaceAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MInstantiableResourceDemand__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResourceDemand__Group__0__Impl
	rule__MInstantiableResourceDemand__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResourceDemand__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getInstantiableKeyword_0()); }

	'instantiable' 

{ after(grammarAccess.getMInstantiableResourceDemandAccess().getInstantiableKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResourceDemand__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResourceDemand__Group__1__Impl
	rule__MInstantiableResourceDemand__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResourceDemand__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getResourceKeyword_1()); }

	'resource' 

{ after(grammarAccess.getMInstantiableResourceDemandAccess().getResourceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResourceDemand__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResourceDemand__Group__2__Impl
	rule__MInstantiableResourceDemand__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResourceDemand__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getResourceAssignment_2()); }
(rule__MInstantiableResourceDemand__ResourceAssignment_2)
{ after(grammarAccess.getMInstantiableResourceDemandAccess().getResourceAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResourceDemand__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResourceDemand__Group__3__Impl
	rule__MInstantiableResourceDemand__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResourceDemand__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getNameAssignment_3()); }
(rule__MInstantiableResourceDemand__NameAssignment_3)
{ after(grammarAccess.getMInstantiableResourceDemandAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResourceDemand__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResourceDemand__Group__4__Impl
	rule__MInstantiableResourceDemand__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResourceDemand__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMInstantiableResourceDemandAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResourceDemand__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResourceDemand__Group__5__Impl
	rule__MInstantiableResourceDemand__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResourceDemand__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getParameterValueAssignmentsAssignment_5()); }
(rule__MInstantiableResourceDemand__ParameterValueAssignmentsAssignment_5)*
{ after(grammarAccess.getMInstantiableResourceDemandAccess().getParameterValueAssignmentsAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResourceDemand__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResourceDemand__Group__6__Impl
	rule__MInstantiableResourceDemand__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResourceDemand__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMInstantiableResourceDemandAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResourceDemand__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResourceDemand__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResourceDemand__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMInstantiableResourceDemandAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MQuantifiableResourceDemand__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResourceDemand__Group__0__Impl
	rule__MQuantifiableResourceDemand__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResourceDemand__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceDemandAccess().getMQuantifiableResourceDemandAction_0()); }
(

)
{ after(grammarAccess.getMQuantifiableResourceDemandAccess().getMQuantifiableResourceDemandAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResourceDemand__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResourceDemand__Group__1__Impl
	rule__MQuantifiableResourceDemand__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResourceDemand__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceDemandAccess().getQuantifiableKeyword_1()); }

	'quantifiable' 

{ after(grammarAccess.getMQuantifiableResourceDemandAccess().getQuantifiableKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResourceDemand__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResourceDemand__Group__2__Impl
	rule__MQuantifiableResourceDemand__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResourceDemand__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceKeyword_2()); }

	'resource' 

{ after(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResourceDemand__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResourceDemand__Group__3__Impl
	rule__MQuantifiableResourceDemand__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResourceDemand__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceAssignment_3()); }
(rule__MQuantifiableResourceDemand__ResourceAssignment_3)
{ after(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResourceDemand__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResourceDemand__Group__4__Impl
	rule__MQuantifiableResourceDemand__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResourceDemand__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceDemandAccess().getColonEqualsSignKeyword_4()); }

	':=' 

{ after(grammarAccess.getMQuantifiableResourceDemandAccess().getColonEqualsSignKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResourceDemand__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResourceDemand__Group__5__Impl
	rule__MQuantifiableResourceDemand__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResourceDemand__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceValueAssignment_5()); }
(rule__MQuantifiableResourceDemand__ResourceValueAssignment_5)
{ after(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceValueAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResourceDemand__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResourceDemand__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResourceDemand__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceDemandAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMQuantifiableResourceDemandAccess().getSemicolonKeyword_6()); }
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






rule__MMESPRegularSwPackageDeployment__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPRegularSwPackageDeployment__Group__0__Impl
	rule__MMESPRegularSwPackageDeployment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPRegularSwPackageDeployment__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getMMESPSwPackageDeploymentAction_0()); }
(

)
{ after(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getMMESPSwPackageDeploymentAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPRegularSwPackageDeployment__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPRegularSwPackageDeployment__Group__1__Impl
	rule__MMESPRegularSwPackageDeployment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPRegularSwPackageDeployment__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwpackageKeyword_1()); }

	'swpackage' 

{ after(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwpackageKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPRegularSwPackageDeployment__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPRegularSwPackageDeployment__Group__2__Impl
	rule__MMESPRegularSwPackageDeployment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPRegularSwPackageDeployment__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwPackageAssignment_2()); }
(rule__MMESPRegularSwPackageDeployment__SwPackageAssignment_2)
{ after(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwPackageAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPRegularSwPackageDeployment__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPRegularSwPackageDeployment__Group__3__Impl
	rule__MMESPRegularSwPackageDeployment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPRegularSwPackageDeployment__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPRegularSwPackageDeployment__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPRegularSwPackageDeployment__Group__4__Impl
	rule__MMESPRegularSwPackageDeployment__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPRegularSwPackageDeployment__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getParameterValueAssignmentsAssignment_4()); }
(rule__MMESPRegularSwPackageDeployment__ParameterValueAssignmentsAssignment_4)*
{ after(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getParameterValueAssignmentsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPRegularSwPackageDeployment__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPRegularSwPackageDeployment__Group__5__Impl
	rule__MMESPRegularSwPackageDeployment__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPRegularSwPackageDeployment__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPRegularSwPackageDeployment__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPRegularSwPackageDeployment__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPRegularSwPackageDeployment__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MMESPDriverSwPackageDeployment__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group__0__Impl
	rule__MMESPDriverSwPackageDeployment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentAction_0()); }
(

)
{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group__1__Impl
	rule__MMESPDriverSwPackageDeployment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDriverKeyword_1()); }

	'driver' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDriverKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group__2__Impl
	rule__MMESPDriverSwPackageDeployment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSwPackageAssignment_2()); }
(rule__MMESPDriverSwPackageDeployment__SwPackageAssignment_2)
{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSwPackageAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group__3__Impl
	rule__MMESPDriverSwPackageDeployment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group__4__Impl
	rule__MMESPDriverSwPackageDeployment__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4()); }
(rule__MMESPDriverSwPackageDeployment__UnorderedGroup_4)
{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group__5__Impl
	rule__MMESPDriverSwPackageDeployment__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MMESPDriverSwPackageDeployment__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group_4_0__0__Impl
	rule__MMESPDriverSwPackageDeployment__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterKeyword_4_0_0()); }

	'parameter' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group_4_0__1__Impl
	rule__MMESPDriverSwPackageDeployment__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getValuesKeyword_4_0_1()); }

	'values' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getValuesKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group_4_0__2__Impl
	rule__MMESPDriverSwPackageDeployment__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_4_0_2()); }

	'{' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group_4_0__3__Impl
	rule__MMESPDriverSwPackageDeployment__Group_4_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterValueAssignmentsAssignment_4_0_3()); }
(rule__MMESPDriverSwPackageDeployment__ParameterValueAssignmentsAssignment_4_0_3)
{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterValueAssignmentsAssignment_4_0_3()); }
)
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterValueAssignmentsAssignment_4_0_3()); }
(rule__MMESPDriverSwPackageDeployment__ParameterValueAssignmentsAssignment_4_0_3)*
{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterValueAssignmentsAssignment_4_0_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group_4_0__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group_4_0__4__Impl
	rule__MMESPDriverSwPackageDeployment__Group_4_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group_4_0__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_4_0_4()); }

	'}' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_4_0_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group_4_0__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group_4_0__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group_4_0__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_4_0_5()); }

	';' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_4_0_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MMESPDriverSwPackageDeployment__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group_4_1__0__Impl
	rule__MMESPDriverSwPackageDeployment__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceKeyword_4_1_0()); }

	'device' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group_4_1__1__Impl
	rule__MMESPDriverSwPackageDeployment__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMappingsKeyword_4_1_1()); }

	'mappings' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMappingsKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group_4_1__2__Impl
	rule__MMESPDriverSwPackageDeployment__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_4_1_2()); }

	'{' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group_4_1__3__Impl
	rule__MMESPDriverSwPackageDeployment__Group_4_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceDriverMappingsAssignment_4_1_3()); }
(rule__MMESPDriverSwPackageDeployment__DeviceDriverMappingsAssignment_4_1_3)
{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceDriverMappingsAssignment_4_1_3()); }
)
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceDriverMappingsAssignment_4_1_3()); }
(rule__MMESPDriverSwPackageDeployment__DeviceDriverMappingsAssignment_4_1_3)*
{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceDriverMappingsAssignment_4_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group_4_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group_4_1__4__Impl
	rule__MMESPDriverSwPackageDeployment__Group_4_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group_4_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_4_1_4()); }

	'}' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_4_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__Group_4_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__Group_4_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__Group_4_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_4_1_5()); }

	';' 

{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_4_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MMESPDeviceDriverMapping__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeviceDriverMapping__Group__0__Impl
	rule__MMESPDeviceDriverMapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeviceDriverMapping__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedKeyword_0()); }

	'supported' 

{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeviceDriverMapping__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeviceDriverMapping__Group__1__Impl
	rule__MMESPDeviceDriverMapping__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeviceDriverMapping__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeviceKeyword_1()); }

	'device' 

{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeviceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeviceDriverMapping__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeviceDriverMapping__Group__2__Impl
	rule__MMESPDeviceDriverMapping__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeviceDriverMapping__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedDeviceAssignment_2()); }
(rule__MMESPDeviceDriverMapping__SupportedDeviceAssignment_2)
{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedDeviceAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeviceDriverMapping__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeviceDriverMapping__Group__3__Impl
	rule__MMESPDeviceDriverMapping__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeviceDriverMapping__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3()); }

	'->' 

{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeviceDriverMapping__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeviceDriverMapping__Group__4__Impl
	rule__MMESPDeviceDriverMapping__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeviceDriverMapping__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedKeyword_4()); }

	'deployed' 

{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeviceDriverMapping__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeviceDriverMapping__Group__5__Impl
	rule__MMESPDeviceDriverMapping__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeviceDriverMapping__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeviceKeyword_5()); }

	'device' 

{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeviceKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeviceDriverMapping__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeviceDriverMapping__Group__6__Impl
	rule__MMESPDeviceDriverMapping__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeviceDriverMapping__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedDeviceAssignment_6()); }
(rule__MMESPDeviceDriverMapping__DeployedDeviceAssignment_6)
{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedDeviceAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeviceDriverMapping__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeviceDriverMapping__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeviceDriverMapping__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getSemicolonKeyword_7()); }
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
{ before(grammarAccess.getMParameterValueAssignmentAccess().getParameterKeyword_0()); }

	'parameter' 

{ after(grammarAccess.getMParameterValueAssignmentAccess().getParameterKeyword_0()); }
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






rule__MMESPDeploymentPlatform__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group__0__Impl
	rule__MMESPDeploymentPlatform__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getDeploymentKeyword_0()); }

	'deployment' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getDeploymentKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group__1__Impl
	rule__MMESPDeploymentPlatform__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformKeyword_1()); }

	'platform' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group__2__Impl
	rule__MMESPDeploymentPlatform__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getNameAssignment_2()); }
(rule__MMESPDeploymentPlatform__NameAssignment_2)
{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group__3__Impl
	rule__MMESPDeploymentPlatform__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group__4__Impl
	rule__MMESPDeploymentPlatform__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4()); }
(rule__MMESPDeploymentPlatform__UnorderedGroup_4)
{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group__5__Impl
	rule__MMESPDeploymentPlatform__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MMESPDeploymentPlatform__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_0__0__Impl
	rule__MMESPDeploymentPlatform__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformKeyword_4_0_0()); }

	'platform' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_0__1__Impl
	rule__MMESPDeploymentPlatform__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getColonEqualsSignKeyword_4_0_1()); }

	':=' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getColonEqualsSignKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_0__2__Impl
	rule__MMESPDeploymentPlatform__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformAssignment_4_0_2()); }
(rule__MMESPDeploymentPlatform__PlatformAssignment_4_0_2)
{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformAssignment_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_0_3()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MMESPDeploymentPlatform__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_1__0__Impl
	rule__MMESPDeploymentPlatform__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getPswpackageKeyword_4_1_0()); }

	'pswpackage' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getPswpackageKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_1__1__Impl
	rule__MMESPDeploymentPlatform__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getColonEqualsSignKeyword_4_1_1()); }

	':=' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getColonEqualsSignKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_1__2__Impl
	rule__MMESPDeploymentPlatform__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformSwPackageAssignment_4_1_2()); }
(rule__MMESPDeploymentPlatform__PlatformSwPackageAssignment_4_1_2)
{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformSwPackageAssignment_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_1_3()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MMESPDeploymentPlatform__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_2__0__Impl
	rule__MMESPDeploymentPlatform__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedKeyword_4_2_0()); }

	'deployed' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_2__1__Impl
	rule__MMESPDeploymentPlatform__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getDevicesKeyword_4_2_1()); }

	'devices' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getDevicesKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_2__2__Impl
	rule__MMESPDeploymentPlatform__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_2_2()); }

	'{' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_2__3__Impl
	rule__MMESPDeploymentPlatform__Group_4_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedDevicesAssignment_4_2_3()); }
(rule__MMESPDeploymentPlatform__DeployedDevicesAssignment_4_2_3)
{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedDevicesAssignment_4_2_3()); }
)
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedDevicesAssignment_4_2_3()); }
(rule__MMESPDeploymentPlatform__DeployedDevicesAssignment_4_2_3)*
{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedDevicesAssignment_4_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_2__4__Impl
	rule__MMESPDeploymentPlatform__Group_4_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_2_4()); }

	'}' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_2_5()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MMESPDeploymentPlatform__Group_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_3__0__Impl
	rule__MMESPDeploymentPlatform__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getParameterKeyword_4_3_0()); }

	'parameter' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getParameterKeyword_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_3__1__Impl
	rule__MMESPDeploymentPlatform__Group_4_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getValuesKeyword_4_3_1()); }

	'values' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getValuesKeyword_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_3__2__Impl
	rule__MMESPDeploymentPlatform__Group_4_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_3_2()); }

	'{' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_3__3__Impl
	rule__MMESPDeploymentPlatform__Group_4_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getParameterValueAssignmentsAssignment_4_3_3()); }
(rule__MMESPDeploymentPlatform__ParameterValueAssignmentsAssignment_4_3_3)
{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getParameterValueAssignmentsAssignment_4_3_3()); }
)
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getParameterValueAssignmentsAssignment_4_3_3()); }
(rule__MMESPDeploymentPlatform__ParameterValueAssignmentsAssignment_4_3_3)*
{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getParameterValueAssignmentsAssignment_4_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_3__4__Impl
	rule__MMESPDeploymentPlatform__Group_4_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_3_4()); }

	'}' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__Group_4_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__Group_4_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__Group_4_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_3_5()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MMESPDeployedDevice__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployedDevice__Group__0__Impl
	rule__MMESPDeployedDevice__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployedDevice__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeployedDeviceAccess().getDeviceKeyword_0()); }

	'device' 

{ after(grammarAccess.getMMESPDeployedDeviceAccess().getDeviceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployedDevice__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployedDevice__Group__1__Impl
	rule__MMESPDeployedDevice__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployedDevice__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeployedDeviceAccess().getDeviceAssignment_1()); }
(rule__MMESPDeployedDevice__DeviceAssignment_1)
{ after(grammarAccess.getMMESPDeployedDeviceAccess().getDeviceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployedDevice__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployedDevice__Group__2__Impl
	rule__MMESPDeployedDevice__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployedDevice__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeployedDeviceAccess().getNameAssignment_2()); }
(rule__MMESPDeployedDevice__NameAssignment_2)
{ after(grammarAccess.getMMESPDeployedDeviceAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployedDevice__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployedDevice__Group__3__Impl
	rule__MMESPDeployedDevice__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployedDevice__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeployedDeviceAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMMESPDeployedDeviceAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployedDevice__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployedDevice__Group__4__Impl
	rule__MMESPDeployedDevice__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployedDevice__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeployedDeviceAccess().getParameterValueAssignmentsAssignment_4()); }
(rule__MMESPDeployedDevice__ParameterValueAssignmentsAssignment_4)*
{ after(grammarAccess.getMMESPDeployedDeviceAccess().getParameterValueAssignmentsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployedDevice__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployedDevice__Group__5__Impl
	rule__MMESPDeployedDevice__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployedDevice__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeployedDeviceAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMMESPDeployedDeviceAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployedDevice__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployedDevice__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployedDevice__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeployedDeviceAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMMESPDeployedDeviceAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MMESPDeploymentAlternative__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group__0__Impl
	rule__MMESPDeploymentAlternative__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_0()); }

	'deployment' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group__1__Impl
	rule__MMESPDeploymentAlternative__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getAlternativeKeyword_1()); }

	'alternative' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getAlternativeKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group__2__Impl
	rule__MMESPDeploymentAlternative__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getNameAssignment_2()); }
(rule__MMESPDeploymentAlternative__NameAssignment_2)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group__3__Impl
	rule__MMESPDeploymentAlternative__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group__4__Impl
	rule__MMESPDeploymentAlternative__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4()); }
(rule__MMESPDeploymentAlternative__UnorderedGroup_4)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group__5__Impl
	rule__MMESPDeploymentAlternative__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MMESPDeploymentAlternative__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_0__0__Impl
	rule__MMESPDeploymentAlternative__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_4_0_0()); }

	'deployment' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_0__1__Impl
	rule__MMESPDeploymentAlternative__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getPlatformsKeyword_4_0_1()); }

	'platforms' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getPlatformsKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_0__2__Impl
	rule__MMESPDeploymentAlternative__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getColonEqualsSignKeyword_4_0_2()); }

	':=' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getColonEqualsSignKeyword_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_0__3__Impl
	rule__MMESPDeploymentAlternative__Group_4_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_4_0_3()); }
(rule__MMESPDeploymentAlternative__DeploymentPlatformsAssignment_4_0_3)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_0__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_0__4__Impl
	rule__MMESPDeploymentAlternative__Group_4_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_0__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_0_4()); }
(rule__MMESPDeploymentAlternative__Group_4_0_4__0)*
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_0_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_0__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_0__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_0__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_0_5()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_0_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MMESPDeploymentAlternative__Group_4_0_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_0_4__0__Impl
	rule__MMESPDeploymentAlternative__Group_4_0_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_0_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getCommaKeyword_4_0_4_0()); }

	',' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getCommaKeyword_4_0_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_0_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_0_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_0_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_4_0_4_1()); }
(rule__MMESPDeploymentAlternative__DeploymentPlatformsAssignment_4_0_4_1)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_4_0_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MMESPDeploymentAlternative__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_1__0__Impl
	rule__MMESPDeploymentAlternative__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesKeyword_4_1_0()); }

	'languages' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_1__1__Impl
	rule__MMESPDeploymentAlternative__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getColonEqualsSignKeyword_4_1_1()); }

	':=' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getColonEqualsSignKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_1__2__Impl
	rule__MMESPDeploymentAlternative__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesAssignment_4_1_2()); }
(rule__MMESPDeploymentAlternative__LanguagesAssignment_4_1_2)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesAssignment_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_1__3__Impl
	rule__MMESPDeploymentAlternative__Group_4_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_1_3()); }
(rule__MMESPDeploymentAlternative__Group_4_1_3__0)*
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_1_4()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMESPDeploymentAlternative__Group_4_1_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_1_3__0__Impl
	rule__MMESPDeploymentAlternative__Group_4_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_1_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getCommaKeyword_4_1_3_0()); }

	',' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getCommaKeyword_4_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_1_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_1_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesAssignment_4_1_3_1()); }
(rule__MMESPDeploymentAlternative__LanguagesAssignment_4_1_3_1)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesAssignment_4_1_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MMESPDeploymentAlternative__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_2__0__Impl
	rule__MMESPDeploymentAlternative__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getSwpackagesKeyword_4_2_0()); }

	'swpackages' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getSwpackagesKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_2__1__Impl
	rule__MMESPDeploymentAlternative__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_2_1()); }

	'{' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_2__2__Impl
	rule__MMESPDeploymentAlternative__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeployedSwPackagesAssignment_4_2_2()); }
(rule__MMESPDeploymentAlternative__DeployedSwPackagesAssignment_4_2_2)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeployedSwPackagesAssignment_4_2_2()); }
)
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeployedSwPackagesAssignment_4_2_2()); }
(rule__MMESPDeploymentAlternative__DeployedSwPackagesAssignment_4_2_2)*
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeployedSwPackagesAssignment_4_2_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_2__3__Impl
	rule__MMESPDeploymentAlternative__Group_4_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_2_3()); }

	'}' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_2_4()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMESPDeploymentAlternative__Group_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_3__0__Impl
	rule__MMESPDeploymentAlternative__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiredKeyword_4_3_0()); }

	'required' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiredKeyword_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_3__1__Impl
	rule__MMESPDeploymentAlternative__Group_4_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getInterfacesKeyword_4_3_1()); }

	'interfaces' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getInterfacesKeyword_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_3__2__Impl
	rule__MMESPDeploymentAlternative__Group_4_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_3_2()); }

	'{' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_3__3__Impl
	rule__MMESPDeploymentAlternative__Group_4_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiresAssignment_4_3_3()); }
(rule__MMESPDeploymentAlternative__RequiresAssignment_4_3_3)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiresAssignment_4_3_3()); }
)
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiresAssignment_4_3_3()); }
(rule__MMESPDeploymentAlternative__RequiresAssignment_4_3_3)*
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiresAssignment_4_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_3__4__Impl
	rule__MMESPDeploymentAlternative__Group_4_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_3_4()); }

	'}' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_3_5()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MMESPDeploymentAlternative__Group_4_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_4__0__Impl
	rule__MMESPDeploymentAlternative__Group_4_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_4_4_0()); }

	'deployment' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_4_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_4__1__Impl
	rule__MMESPDeploymentAlternative__Group_4_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getAlternativesKeyword_4_4_1()); }

	'alternatives' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getAlternativesKeyword_4_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_4__2__Impl
	rule__MMESPDeploymentAlternative__Group_4_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_4_2()); }

	'{' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_4__3__Impl
	rule__MMESPDeploymentAlternative__Group_4_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentAlternativesAssignment_4_4_3()); }
(rule__MMESPDeploymentAlternative__DeploymentAlternativesAssignment_4_4_3)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentAlternativesAssignment_4_4_3()); }
)
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentAlternativesAssignment_4_4_3()); }
(rule__MMESPDeploymentAlternative__DeploymentAlternativesAssignment_4_4_3)*
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentAlternativesAssignment_4_4_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_4__4__Impl
	rule__MMESPDeploymentAlternative__Group_4_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_4_4()); }

	'}' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__Group_4_4__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__Group_4_4__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__Group_4_4__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_4_5()); }

	';' 

{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_4_5()); }
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









rule__MMESPDeployment__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
    }
:
	rule__MMESPDeployment__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentAccess().getGroup_5_0()); }
						(rule__MMESPDeployment__Group_5_0__0)
						{ after(grammarAccess.getMMESPDeploymentAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentAccess().getGroup_5_1()); }
						(rule__MMESPDeployment__Group_5_1__0)
						{ after(grammarAccess.getMMESPDeploymentAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentAccess().getGroup_5_2()); }
						(rule__MMESPDeployment__Group_5_2__0)
						{ after(grammarAccess.getMMESPDeploymentAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentAccess().getGroup_5_3()); }
						(rule__MMESPDeployment__Group_5_3__0)
						{ after(grammarAccess.getMMESPDeploymentAccess().getGroup_5_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentAccess().getGroup_5_4()); }
						(rule__MMESPDeployment__Group_5_4__0)
						{ after(grammarAccess.getMMESPDeploymentAccess().getGroup_5_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentAccess().getGroup_5_5()); }
						(rule__MMESPDeployment__Group_5_5__0)
						{ after(grammarAccess.getMMESPDeploymentAccess().getGroup_5_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentAccess().getGroup_5_6()); }
						(rule__MMESPDeployment__Group_5_6__0)
						{ after(grammarAccess.getMMESPDeploymentAccess().getGroup_5_6()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__UnorderedGroup_5__Impl
	rule__MMESPDeployment__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__UnorderedGroup_5__Impl
	rule__MMESPDeployment__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__UnorderedGroup_5__Impl
	rule__MMESPDeployment__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__UnorderedGroup_5__Impl
	rule__MMESPDeployment__UnorderedGroup_5__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__UnorderedGroup_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__UnorderedGroup_5__Impl
	rule__MMESPDeployment__UnorderedGroup_5__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__UnorderedGroup_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__UnorderedGroup_5__Impl
	rule__MMESPDeployment__UnorderedGroup_5__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeployment__UnorderedGroup_5__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeployment__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}
















rule__MMESPDriverSwPackageDeployment__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4());
    }
:
	rule__MMESPDriverSwPackageDeployment__UnorderedGroup_4__0
	?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getGroup_4_0()); }
						(rule__MMESPDriverSwPackageDeployment__Group_4_0__0)
						{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getGroup_4_1()); }
						(rule__MMESPDriverSwPackageDeployment__Group_4_1__0)
						{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getGroup_4_1()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__UnorderedGroup_4__Impl
	rule__MMESPDriverSwPackageDeployment__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDriverSwPackageDeployment__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDriverSwPackageDeployment__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}






rule__MMESPDeploymentPlatform__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());
    }
:
	rule__MMESPDeploymentPlatform__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_0()); }
						(rule__MMESPDeploymentPlatform__Group_4_0__0)
						{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_1()); }
						(rule__MMESPDeploymentPlatform__Group_4_1__0)
						{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_2()); }
						(rule__MMESPDeploymentPlatform__Group_4_2__0)
						{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_3()); }
						(rule__MMESPDeploymentPlatform__Group_4_3__0)
						{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_3()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__UnorderedGroup_4__Impl
	rule__MMESPDeploymentPlatform__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__UnorderedGroup_4__Impl
	rule__MMESPDeploymentPlatform__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__UnorderedGroup_4__Impl
	rule__MMESPDeploymentPlatform__UnorderedGroup_4__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentPlatform__UnorderedGroup_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentPlatform__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}










rule__MMESPDeploymentAlternative__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());
    }
:
	rule__MMESPDeploymentAlternative__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_0()); }
						(rule__MMESPDeploymentAlternative__Group_4_0__0)
						{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_1()); }
						(rule__MMESPDeploymentAlternative__Group_4_1__0)
						{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_2()); }
						(rule__MMESPDeploymentAlternative__Group_4_2__0)
						{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_3()); }
						(rule__MMESPDeploymentAlternative__Group_4_3__0)
						{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_4()); }
						(rule__MMESPDeploymentAlternative__Group_4_4__0)
						{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_4()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__UnorderedGroup_4__Impl
	rule__MMESPDeploymentAlternative__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__UnorderedGroup_4__Impl
	rule__MMESPDeploymentAlternative__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__UnorderedGroup_4__Impl
	rule__MMESPDeploymentAlternative__UnorderedGroup_4__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__UnorderedGroup_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__UnorderedGroup_4__Impl
	rule__MMESPDeploymentAlternative__UnorderedGroup_4__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPDeploymentAlternative__UnorderedGroup_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPDeploymentAlternative__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}












rule__MMESPDEPPackageFile__PackageAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); }
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMESPDEPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMMESPDEPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDEPPackageFile__ImportsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMESPDEPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMMESPDEPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDEPPackageFile__ElementAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDEPPackageFileAccess().getElementMMESPDEPPackageElementParserRuleCall_4_0()); }
	ruleMMESPDEPPackageElement{ after(grammarAccess.getMMESPDEPPackageFileAccess().getElementMMESPDEPPackageElementParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMMESPDeploymentAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__VersionAssignment_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMMESPDeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__CtoolAssignment_5_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getCtoolMConstructionToolCrossReference_5_1_3_0()); }
(
{ before(grammarAccess.getMMESPDeploymentAccess().getCtoolMConstructionToolVersionedQualifiedNameParserRuleCall_5_1_3_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMMESPDeploymentAccess().getCtoolMConstructionToolVersionedQualifiedNameParserRuleCall_5_1_3_0_1()); }
)
{ after(grammarAccess.getMMESPDeploymentAccess().getCtoolMConstructionToolCrossReference_5_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__LanguagesAssignment_5_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageCrossReference_5_2_2_0()); }
(
{ before(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_2_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_2_2_0_1()); }
)
{ after(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageCrossReference_5_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__LanguagesAssignment_5_2_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageCrossReference_5_2_3_1_0()); }
(
{ before(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_2_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_2_3_1_0_1()); }
)
{ after(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageCrossReference_5_2_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__DeploymentPlatformsAssignment_5_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getDeploymentPlatformsMMESPDeploymentPlatformParserRuleCall_5_3_3_0()); }
	ruleMMESPDeploymentPlatform{ after(grammarAccess.getMMESPDeploymentAccess().getDeploymentPlatformsMMESPDeploymentPlatformParserRuleCall_5_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__RequiresAssignment_5_4_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_4_3_0()); }
	ruleMSwPackageRequiredInterface{ after(grammarAccess.getMMESPDeploymentAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__DeployedSwPackagesAssignment_5_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_5_5_2_0()); }
	ruleMMESPSwPackageDeployment{ after(grammarAccess.getMMESPDeploymentAccess().getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_5_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployment__DeploymentAlternativesAssignment_5_6_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAccess().getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_5_6_3_0()); }
	ruleMMESPDeploymentAlternative{ after(grammarAccess.getMMESPDeploymentAccess().getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_5_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageRequiredInterface__InterfaceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceMCommonPackageElementCrossReference_1_0()); }
(
{ before(grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceMCommonPackageElementVersionedQualifiedNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceMCommonPackageElementVersionedQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceMCommonPackageElementCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageRequiredInterface__ResourceDemandsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageRequiredInterfaceAccess().getResourceDemandsMResourceDemandParserRuleCall_3_0()); }
	ruleMResourceDemand{ after(grammarAccess.getMSwPackageRequiredInterfaceAccess().getResourceDemandsMResourceDemandParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResourceDemand__ResourceAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getResourceMInstantiableResourceCrossReference_2_0()); }
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getResourceMInstantiableResourceVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMInstantiableResourceDemandAccess().getResourceMInstantiableResourceVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMInstantiableResourceDemandAccess().getResourceMInstantiableResourceCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResourceDemand__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMInstantiableResourceDemandAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResourceDemand__ParameterValueAssignmentsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceDemandAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMInstantiableResourceDemandAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResourceDemand__ResourceAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceMQuantifiableResourceCrossReference_3_0()); }
(
{ before(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceMQuantifiableResourceVersionedQualifiedReferenceNameParserRuleCall_3_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceMQuantifiableResourceVersionedQualifiedReferenceNameParserRuleCall_3_0_1()); }
)
{ after(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceMQuantifiableResourceCrossReference_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResourceDemand__ResourceValueAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceValueMParameterValueExpressionParserRuleCall_5_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceValueMParameterValueExpressionParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPRegularSwPackageDeployment__SwPackageAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwPackageMSwPackageCrossReference_2_0()); }
(
{ before(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwPackageMSwPackageVersionedQualifiedNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwPackageMSwPackageVersionedQualifiedNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwPackageMSwPackageCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPRegularSwPackageDeployment__ParameterValueAssignmentsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__SwPackageAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSwPackageMDriverSwPackageCrossReference_2_0()); }
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSwPackageMDriverSwPackageVersionedQualifiedNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSwPackageMDriverSwPackageVersionedQualifiedNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSwPackageMDriverSwPackageCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__ParameterValueAssignmentsAssignment_4_0_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0_3_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDriverSwPackageDeployment__DeviceDriverMappingsAssignment_4_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceDriverMappingsMMESPDeviceDriverMappingParserRuleCall_4_1_3_0()); }
	ruleMMESPDeviceDriverMapping{ after(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceDriverMappingsMMESPDeviceDriverMappingParserRuleCall_4_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeviceDriverMapping__SupportedDeviceAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedDeviceMDriverSwPackageSupportedDeviceCrossReference_2_0()); }
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedDeviceMDriverSwPackageSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedDeviceMDriverSwPackageSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedDeviceMDriverSwPackageSupportedDeviceCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeviceDriverMapping__DeployedDeviceAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedDeviceMMESPDeployedDeviceCrossReference_6_0()); }
(
{ before(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedDeviceMMESPDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedDeviceMMESPDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1()); }
)
{ after(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedDeviceMMESPDeployedDeviceCrossReference_6_0()); }
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

rule__MMESPDeploymentPlatform__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__PlatformAssignment_4_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformMPlatformCrossReference_4_0_2_0()); }
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformMPlatformVersionedQualifiedNameParserRuleCall_4_0_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformMPlatformVersionedQualifiedNameParserRuleCall_4_0_2_0_1()); }
)
{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformMPlatformCrossReference_4_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__PlatformSwPackageAssignment_4_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformSwPackageMPlatformSwPackageCrossReference_4_1_2_0()); }
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformSwPackageMPlatformSwPackageVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformSwPackageMPlatformSwPackageVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
)
{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformSwPackageMPlatformSwPackageCrossReference_4_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__DeployedDevicesAssignment_4_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedDevicesMMESPDeployedDeviceParserRuleCall_4_2_3_0()); }
	ruleMMESPDeployedDevice{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedDevicesMMESPDeployedDeviceParserRuleCall_4_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentPlatform__ParameterValueAssignmentsAssignment_4_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentPlatformAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_3_3_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMMESPDeploymentPlatformAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployedDevice__DeviceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeployedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); }
(
{ before(grammarAccess.getMMESPDeployedDeviceAccess().getDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMMESPDeployedDeviceAccess().getDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMMESPDeployedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployedDevice__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeployedDeviceAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMMESPDeployedDeviceAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeployedDevice__ParameterValueAssignmentsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeployedDeviceAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMMESPDeployedDeviceAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__DeploymentPlatformsAssignment_4_0_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_3_0()); }
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformIDTerminalRuleCall_4_0_3_0_1()); }
	RULE_ID{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformIDTerminalRuleCall_4_0_3_0_1()); }
)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__DeploymentPlatformsAssignment_4_0_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_4_1_0()); }
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformIDTerminalRuleCall_4_0_4_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformIDTerminalRuleCall_4_0_4_1_0_1()); }
)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__LanguagesAssignment_4_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageCrossReference_4_1_2_0()); }
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageCrossReference_4_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__LanguagesAssignment_4_1_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0()); }
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_3_1_0_1()); }
)
{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__DeployedSwPackagesAssignment_4_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_4_2_2_0()); }
	ruleMMESPSwPackageDeployment{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_4_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__RequiresAssignment_4_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_4_3_3_0()); }
	ruleMSwPackageRequiredInterface{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_4_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPDeploymentAlternative__DeploymentAlternativesAssignment_4_4_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_4_4_3_0()); }
	ruleMMESPDeploymentAlternative{ after(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_4_4_3_0()); }
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


