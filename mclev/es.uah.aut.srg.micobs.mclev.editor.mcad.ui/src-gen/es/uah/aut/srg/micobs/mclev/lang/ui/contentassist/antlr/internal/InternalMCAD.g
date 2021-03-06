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
grammar InternalMCAD;

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
import es.uah.aut.srg.micobs.mclev.lang.services.MCADGrammarAccess;

}

@parser::members {
 
 	private MCADGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(MCADGrammarAccess grammarAccess) {
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




// Entry rule entryRuleMMCLEVMCADPackageFile
entryRuleMMCLEVMCADPackageFile 
:
{ before(grammarAccess.getMMCLEVMCADPackageFileRule()); }
	 ruleMMCLEVMCADPackageFile
{ after(grammarAccess.getMMCLEVMCADPackageFileRule()); } 
	 EOF 
;

// Rule MMCLEVMCADPackageFile
ruleMMCLEVMCADPackageFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getGroup()); }
(rule__MMCLEVMCADPackageFile__Group__0)
{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMCLEVMCADPackageElement
entryRuleMMCLEVMCADPackageElement 
:
{ before(grammarAccess.getMMCLEVMCADPackageElementRule()); }
	 ruleMMCLEVMCADPackageElement
{ after(grammarAccess.getMMCLEVMCADPackageElementRule()); } 
	 EOF 
;

// Rule MMCLEVMCADPackageElement
ruleMMCLEVMCADPackageElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMCLEVMCADPackageElementAccess().getMMCADeploymentParserRuleCall()); }
	ruleMMCADeployment
{ after(grammarAccess.getMMCLEVMCADPackageElementAccess().getMMCADeploymentParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMCADeployment
entryRuleMMCADeployment 
:
{ before(grammarAccess.getMMCADeploymentRule()); }
	 ruleMMCADeployment
{ after(grammarAccess.getMMCADeploymentRule()); } 
	 EOF 
;

// Rule MMCADeployment
ruleMMCADeployment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMCADeploymentAccess().getGroup()); }
(rule__MMCADeployment__Group__0)
{ after(grammarAccess.getMMCADeploymentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMConnection
entryRuleMConnection 
:
{ before(grammarAccess.getMConnectionRule()); }
	 ruleMConnection
{ after(grammarAccess.getMConnectionRule()); } 
	 EOF 
;

// Rule MConnection
ruleMConnection
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMConnectionAccess().getAlternatives()); }
(rule__MConnection__Alternatives)
{ after(grammarAccess.getMConnectionAccess().getAlternatives()); }
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



// Entry rule entryRuleMCommonConnection
entryRuleMCommonConnection 
:
{ before(grammarAccess.getMCommonConnectionRule()); }
	 ruleMCommonConnection
{ after(grammarAccess.getMCommonConnectionRule()); } 
	 EOF 
;

// Rule MCommonConnection
ruleMCommonConnection
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMCommonConnectionAccess().getGroup()); }
(rule__MCommonConnection__Group__0)
{ after(grammarAccess.getMCommonConnectionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMConnectionSwitch
entryRuleMConnectionSwitch 
:
{ before(grammarAccess.getMConnectionSwitchRule()); }
	 ruleMConnectionSwitch
{ after(grammarAccess.getMConnectionSwitchRule()); } 
	 EOF 
;

// Rule MConnectionSwitch
ruleMConnectionSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getGroup()); }
(rule__MConnectionSwitch__Group__0)
{ after(grammarAccess.getMConnectionSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMConnectionSwitchCase
entryRuleMConnectionSwitchCase 
:
{ before(grammarAccess.getMConnectionSwitchCaseRule()); }
	 ruleMConnectionSwitchCase
{ after(grammarAccess.getMConnectionSwitchCaseRule()); } 
	 EOF 
;

// Rule MConnectionSwitchCase
ruleMConnectionSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getGroup()); }
(rule__MConnectionSwitchCase__Group__0)
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMComponentInstance
entryRuleMComponentInstance 
:
{ before(grammarAccess.getMComponentInstanceRule()); }
	 ruleMComponentInstance
{ after(grammarAccess.getMComponentInstanceRule()); } 
	 EOF 
;

// Rule MComponentInstance
ruleMComponentInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMComponentInstanceAccess().getGroup()); }
(rule__MComponentInstance__Group__0)
{ after(grammarAccess.getMComponentInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMServiceLibraryInstance
entryRuleMServiceLibraryInstance 
:
{ before(grammarAccess.getMServiceLibraryInstanceRule()); }
	 ruleMServiceLibraryInstance
{ after(grammarAccess.getMServiceLibraryInstanceRule()); } 
	 EOF 
;

// Rule MServiceLibraryInstance
ruleMServiceLibraryInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMServiceLibraryInstanceAccess().getAlternatives()); }
(rule__MServiceLibraryInstance__Alternatives)
{ after(grammarAccess.getMServiceLibraryInstanceAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMRegularServiceLibraryInstance
entryRuleMRegularServiceLibraryInstance 
:
{ before(grammarAccess.getMRegularServiceLibraryInstanceRule()); }
	 ruleMRegularServiceLibraryInstance
{ after(grammarAccess.getMRegularServiceLibraryInstanceRule()); } 
	 EOF 
;

// Rule MRegularServiceLibraryInstance
ruleMRegularServiceLibraryInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMRegularServiceLibraryInstanceAccess().getGroup()); }
(rule__MRegularServiceLibraryInstance__Group__0)
{ after(grammarAccess.getMRegularServiceLibraryInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDriverSLibInstance
entryRuleMDriverSLibInstance 
:
{ before(grammarAccess.getMDriverSLibInstanceRule()); }
	 ruleMDriverSLibInstance
{ after(grammarAccess.getMDriverSLibInstanceRule()); } 
	 EOF 
;

// Rule MDriverSLibInstance
ruleMDriverSLibInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getGroup()); }
(rule__MDriverSLibInstance__Group__0)
{ after(grammarAccess.getMDriverSLibInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDeviceDriverMapping
entryRuleMDeviceDriverMapping 
:
{ before(grammarAccess.getMDeviceDriverMappingRule()); }
	 ruleMDeviceDriverMapping
{ after(grammarAccess.getMDeviceDriverMappingRule()); } 
	 EOF 
;

// Rule MDeviceDriverMapping
ruleMDeviceDriverMapping
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getGroup()); }
(rule__MDeviceDriverMapping__Group__0)
{ after(grammarAccess.getMDeviceDriverMappingAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDeploymentAlternative
entryRuleMDeploymentAlternative 
:
{ before(grammarAccess.getMDeploymentAlternativeRule()); }
	 ruleMDeploymentAlternative
{ after(grammarAccess.getMDeploymentAlternativeRule()); } 
	 EOF 
;

// Rule MDeploymentAlternative
ruleMDeploymentAlternative
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getGroup()); }
(rule__MDeploymentAlternative__Group__0)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDeploymentPlatform
entryRuleMDeploymentPlatform 
:
{ before(grammarAccess.getMDeploymentPlatformRule()); }
	 ruleMDeploymentPlatform
{ after(grammarAccess.getMDeploymentPlatformRule()); } 
	 EOF 
;

// Rule MDeploymentPlatform
ruleMDeploymentPlatform
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getGroup()); }
(rule__MDeploymentPlatform__Group__0)
{ after(grammarAccess.getMDeploymentPlatformAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDeployedDevice
entryRuleMDeployedDevice 
:
{ before(grammarAccess.getMDeployedDeviceRule()); }
	 ruleMDeployedDevice
{ after(grammarAccess.getMDeployedDeviceRule()); } 
	 EOF 
;

// Rule MDeployedDevice
ruleMDeployedDevice
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDeployedDeviceAccess().getGroup()); }
(rule__MDeployedDevice__Group__0)
{ after(grammarAccess.getMDeployedDeviceAccess().getGroup()); }
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



rule__MConnection__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionAccess().getMCommonConnectionParserRuleCall_0()); }
	ruleMCommonConnection
{ after(grammarAccess.getMConnectionAccess().getMCommonConnectionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMConnectionAccess().getMConnectionSwitchParserRuleCall_1()); }
	ruleMConnectionSwitch
{ after(grammarAccess.getMConnectionAccess().getMConnectionSwitchParserRuleCall_1()); }
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

rule__MServiceLibraryInstance__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryInstanceAccess().getMRegularServiceLibraryInstanceParserRuleCall_0()); }
	ruleMRegularServiceLibraryInstance
{ after(grammarAccess.getMServiceLibraryInstanceAccess().getMRegularServiceLibraryInstanceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMServiceLibraryInstanceAccess().getMDriverSLibInstanceParserRuleCall_1()); }
	ruleMDriverSLibInstance
{ after(grammarAccess.getMServiceLibraryInstanceAccess().getMDriverSLibInstanceParserRuleCall_1()); }
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



rule__MMCLEVMCADPackageFile__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVMCADPackageFile__Group__0__Impl
	rule__MMCLEVMCADPackageFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVMCADPackageFile__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVMCADPackageFile__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVMCADPackageFile__Group__1__Impl
	rule__MMCLEVMCADPackageFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVMCADPackageFile__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageAssignment_1()); }
(rule__MMCLEVMCADPackageFile__PackageAssignment_1)
{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVMCADPackageFile__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVMCADPackageFile__Group__2__Impl
	rule__MMCLEVMCADPackageFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVMCADPackageFile__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVMCADPackageFile__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVMCADPackageFile__Group__3__Impl
	rule__MMCLEVMCADPackageFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVMCADPackageFile__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getGroup_3()); }
(rule__MMCLEVMCADPackageFile__Group_3__0)*
{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVMCADPackageFile__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVMCADPackageFile__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVMCADPackageFile__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getElementAssignment_4()); }
(rule__MMCLEVMCADPackageFile__ElementAssignment_4)
{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getElementAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMCLEVMCADPackageFile__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVMCADPackageFile__Group_3__0__Impl
	rule__MMCLEVMCADPackageFile__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVMCADPackageFile__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getImportKeyword_3_0()); }

	'import' 

{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getImportKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVMCADPackageFile__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVMCADPackageFile__Group_3__1__Impl
	rule__MMCLEVMCADPackageFile__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVMCADPackageFile__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getImportsAssignment_3_1()); }
(rule__MMCLEVMCADPackageFile__ImportsAssignment_3_1)
{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getImportsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVMCADPackageFile__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVMCADPackageFile__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVMCADPackageFile__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getSemicolonKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MMCADeployment__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group__0__Impl
	rule__MMCADeployment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_0()); }

	'deployment' 

{ after(grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group__1__Impl
	rule__MMCADeployment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getProjectKeyword_1()); }

	'project' 

{ after(grammarAccess.getMMCADeploymentAccess().getProjectKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group__2__Impl
	rule__MMCADeployment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getDomainAssignment_2()); }
(rule__MMCADeployment__DomainAssignment_2)
{ after(grammarAccess.getMMCADeploymentAccess().getDomainAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group__3__Impl
	rule__MMCADeployment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getNameAssignment_3()); }
(rule__MMCADeployment__NameAssignment_3)
{ after(grammarAccess.getMMCADeploymentAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group__4__Impl
	rule__MMCADeployment__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group__5__Impl
	rule__MMCADeployment__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5()); }
(rule__MMCADeployment__UnorderedGroup_5)
{ after(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group__6__Impl
	rule__MMCADeployment__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MMCADeployment__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_0__0__Impl
	rule__MMCADeployment__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getVersionKeyword_5_0_0()); }

	'version' 

{ after(grammarAccess.getMMCADeploymentAccess().getVersionKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_0__1__Impl
	rule__MMCADeployment__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getMMCADeploymentAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_0__2__Impl
	rule__MMCADeployment__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getVersionAssignment_5_0_2()); }
(rule__MMCADeployment__VersionAssignment_5_0_2)
{ after(grammarAccess.getMMCADeploymentAccess().getVersionAssignment_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MMCADeployment__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_1__0__Impl
	rule__MMCADeployment__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getAttributeKeyword_5_1_0()); }

	'attribute' 

{ after(grammarAccess.getMMCADeploymentAccess().getAttributeKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_1__1__Impl
	rule__MMCADeployment__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getValuesKeyword_5_1_1()); }

	'values' 

{ after(grammarAccess.getMMCADeploymentAccess().getValuesKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_1__2__Impl
	rule__MMCADeployment__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_1_2()); }

	'{' 

{ after(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_1__3__Impl
	rule__MMCADeployment__Group_5_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMCADeploymentAccess().getAttributeValueAssignmentsAssignment_5_1_3()); }
(rule__MMCADeployment__AttributeValueAssignmentsAssignment_5_1_3)
{ after(grammarAccess.getMMCADeploymentAccess().getAttributeValueAssignmentsAssignment_5_1_3()); }
)
(
{ before(grammarAccess.getMMCADeploymentAccess().getAttributeValueAssignmentsAssignment_5_1_3()); }
(rule__MMCADeployment__AttributeValueAssignmentsAssignment_5_1_3)*
{ after(grammarAccess.getMMCADeploymentAccess().getAttributeValueAssignmentsAssignment_5_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_1__4__Impl
	rule__MMCADeployment__Group_5_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_1_4()); }

	'}' 

{ after(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_1_5()); }

	';' 

{ after(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MMCADeployment__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_2__0__Impl
	rule__MMCADeployment__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_5_2_0()); }

	'deployment' 

{ after(grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_2__1__Impl
	rule__MMCADeployment__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getPlatformsKeyword_5_2_1()); }

	'platforms' 

{ after(grammarAccess.getMMCADeploymentAccess().getPlatformsKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_2__2__Impl
	rule__MMCADeployment__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_2_2()); }

	'{' 

{ after(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_2__3__Impl
	rule__MMCADeployment__Group_5_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMCADeploymentAccess().getDeploymentPlatformsAssignment_5_2_3()); }
(rule__MMCADeployment__DeploymentPlatformsAssignment_5_2_3)
{ after(grammarAccess.getMMCADeploymentAccess().getDeploymentPlatformsAssignment_5_2_3()); }
)
(
{ before(grammarAccess.getMMCADeploymentAccess().getDeploymentPlatformsAssignment_5_2_3()); }
(rule__MMCADeployment__DeploymentPlatformsAssignment_5_2_3)*
{ after(grammarAccess.getMMCADeploymentAccess().getDeploymentPlatformsAssignment_5_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_2__4__Impl
	rule__MMCADeployment__Group_5_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_2_4()); }

	'}' 

{ after(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_2_5()); }

	';' 

{ after(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MMCADeployment__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_3__0__Impl
	rule__MMCADeployment__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_5_3_0()); }

	'deployment' 

{ after(grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_3__1__Impl
	rule__MMCADeployment__Group_5_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getAlternativesKeyword_5_3_1()); }

	'alternatives' 

{ after(grammarAccess.getMMCADeploymentAccess().getAlternativesKeyword_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_3__2__Impl
	rule__MMCADeployment__Group_5_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_3_2()); }

	'{' 

{ after(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_3__3__Impl
	rule__MMCADeployment__Group_5_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMCADeploymentAccess().getDeploymentAlternativesAssignment_5_3_3()); }
(rule__MMCADeployment__DeploymentAlternativesAssignment_5_3_3)
{ after(grammarAccess.getMMCADeploymentAccess().getDeploymentAlternativesAssignment_5_3_3()); }
)
(
{ before(grammarAccess.getMMCADeploymentAccess().getDeploymentAlternativesAssignment_5_3_3()); }
(rule__MMCADeployment__DeploymentAlternativesAssignment_5_3_3)*
{ after(grammarAccess.getMMCADeploymentAccess().getDeploymentAlternativesAssignment_5_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_3__4__Impl
	rule__MMCADeployment__Group_5_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_3_4()); }

	'}' 

{ after(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_3_5()); }

	';' 

{ after(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MMCADeployment__Group_5_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_4__0__Impl
	rule__MMCADeployment__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getComponentsKeyword_5_4_0()); }

	'components' 

{ after(grammarAccess.getMMCADeploymentAccess().getComponentsKeyword_5_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_4__1__Impl
	rule__MMCADeployment__Group_5_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_4_1()); }

	'{' 

{ after(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_4__2__Impl
	rule__MMCADeployment__Group_5_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMCADeploymentAccess().getComponentsAssignment_5_4_2()); }
(rule__MMCADeployment__ComponentsAssignment_5_4_2)
{ after(grammarAccess.getMMCADeploymentAccess().getComponentsAssignment_5_4_2()); }
)
(
{ before(grammarAccess.getMMCADeploymentAccess().getComponentsAssignment_5_4_2()); }
(rule__MMCADeployment__ComponentsAssignment_5_4_2)*
{ after(grammarAccess.getMMCADeploymentAccess().getComponentsAssignment_5_4_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_4__3__Impl
	rule__MMCADeployment__Group_5_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_4_3()); }

	'}' 

{ after(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_4_4()); }

	';' 

{ after(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMCADeployment__Group_5_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_5__0__Impl
	rule__MMCADeployment__Group_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getConnectionsKeyword_5_5_0()); }

	'connections' 

{ after(grammarAccess.getMMCADeploymentAccess().getConnectionsKeyword_5_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_5__1__Impl
	rule__MMCADeployment__Group_5_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_5_1()); }

	'{' 

{ after(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_5__2__Impl
	rule__MMCADeployment__Group_5_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMCADeploymentAccess().getConnectionsAssignment_5_5_2()); }
(rule__MMCADeployment__ConnectionsAssignment_5_5_2)
{ after(grammarAccess.getMMCADeploymentAccess().getConnectionsAssignment_5_5_2()); }
)
(
{ before(grammarAccess.getMMCADeploymentAccess().getConnectionsAssignment_5_5_2()); }
(rule__MMCADeployment__ConnectionsAssignment_5_5_2)*
{ after(grammarAccess.getMMCADeploymentAccess().getConnectionsAssignment_5_5_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_5__3__Impl
	rule__MMCADeployment__Group_5_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_5_3()); }

	'}' 

{ after(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_5__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_5_4()); }

	';' 

{ after(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_5_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMCADeployment__Group_5_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_6__0__Impl
	rule__MMCADeployment__Group_5_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getLibrariesKeyword_5_6_0()); }

	'libraries' 

{ after(grammarAccess.getMMCADeploymentAccess().getLibrariesKeyword_5_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_6__1__Impl
	rule__MMCADeployment__Group_5_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_6_1()); }

	'{' 

{ after(grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_6__2__Impl
	rule__MMCADeployment__Group_5_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMCADeploymentAccess().getLibrariesAssignment_5_6_2()); }
(rule__MMCADeployment__LibrariesAssignment_5_6_2)
{ after(grammarAccess.getMMCADeploymentAccess().getLibrariesAssignment_5_6_2()); }
)
(
{ before(grammarAccess.getMMCADeploymentAccess().getLibrariesAssignment_5_6_2()); }
(rule__MMCADeployment__LibrariesAssignment_5_6_2)*
{ after(grammarAccess.getMMCADeploymentAccess().getLibrariesAssignment_5_6_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_6__3__Impl
	rule__MMCADeployment__Group_5_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_6_3()); }

	'}' 

{ after(grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__Group_5_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__Group_5_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__Group_5_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_6_4()); }

	';' 

{ after(grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_6_4()); }
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






rule__MCommonConnection__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__0__Impl
	rule__MCommonConnection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getMCommonConnectionAction_0()); }
(

)
{ after(grammarAccess.getMCommonConnectionAccess().getMCommonConnectionAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__1__Impl
	rule__MCommonConnection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getConnectionKeyword_1()); }

	'connection' 

{ after(grammarAccess.getMCommonConnectionAccess().getConnectionKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__2__Impl
	rule__MCommonConnection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getClientInstanceAssignment_2()); }
(rule__MCommonConnection__ClientInstanceAssignment_2)
{ after(grammarAccess.getMCommonConnectionAccess().getClientInstanceAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__3__Impl
	rule__MCommonConnection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getFullStopKeyword_3()); }

	'.' 

{ after(grammarAccess.getMCommonConnectionAccess().getFullStopKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__4__Impl
	rule__MCommonConnection__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getClientPortAssignment_4()); }
(rule__MCommonConnection__ClientPortAssignment_4)
{ after(grammarAccess.getMCommonConnectionAccess().getClientPortAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__5__Impl
	rule__MCommonConnection__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5()); }

	'<->' 

{ after(grammarAccess.getMCommonConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__6__Impl
	rule__MCommonConnection__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getServerInstanceAssignment_6()); }
(rule__MCommonConnection__ServerInstanceAssignment_6)
{ after(grammarAccess.getMCommonConnectionAccess().getServerInstanceAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__7__Impl
	rule__MCommonConnection__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getFullStopKeyword_7()); }

	'.' 

{ after(grammarAccess.getMCommonConnectionAccess().getFullStopKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__8__Impl
	rule__MCommonConnection__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getServerPortAssignment_8()); }
(rule__MCommonConnection__ServerPortAssignment_8)
{ after(grammarAccess.getMCommonConnectionAccess().getServerPortAssignment_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__9__Impl
	rule__MCommonConnection__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getUsingKeyword_9()); }

	'using' 

{ after(grammarAccess.getMCommonConnectionAccess().getUsingKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__10__Impl
	rule__MCommonConnection__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getConnectorAssignment_10()); }
(rule__MCommonConnection__ConnectorAssignment_10)
{ after(grammarAccess.getMCommonConnectionAccess().getConnectorAssignment_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__11__Impl
	rule__MCommonConnection__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getLeftCurlyBracketKeyword_11()); }

	'{' 

{ after(grammarAccess.getMCommonConnectionAccess().getLeftCurlyBracketKeyword_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__12__Impl
	rule__MCommonConnection__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getGroup_12()); }
(rule__MCommonConnection__Group_12__0)?
{ after(grammarAccess.getMCommonConnectionAccess().getGroup_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__13
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__13__Impl
	rule__MCommonConnection__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__13__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getAttributeValueAssignmentsAssignment_13()); }
(rule__MCommonConnection__AttributeValueAssignmentsAssignment_13)*
{ after(grammarAccess.getMCommonConnectionAccess().getAttributeValueAssignmentsAssignment_13()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__14
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__14__Impl
	rule__MCommonConnection__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__14__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getRightCurlyBracketKeyword_14()); }

	'}' 

{ after(grammarAccess.getMCommonConnectionAccess().getRightCurlyBracketKeyword_14()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group__15
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group__15__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getSemicolonKeyword_15()); }

	';' 

{ after(grammarAccess.getMCommonConnectionAccess().getSemicolonKeyword_15()); }
)

;
finally {
	restoreStackSize(stackSize);
}


































rule__MCommonConnection__Group_12__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group_12__0__Impl
	rule__MCommonConnection__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group_12__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getMappingKeyword_12_0()); }

	'mapping' 

{ after(grammarAccess.getMCommonConnectionAccess().getMappingKeyword_12_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group_12__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group_12__1__Impl
	rule__MCommonConnection__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group_12__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getColonEqualsSignKeyword_12_1()); }

	':=' 

{ after(grammarAccess.getMCommonConnectionAccess().getColonEqualsSignKeyword_12_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group_12__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group_12__2__Impl
	rule__MCommonConnection__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group_12__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getIfaceMappingAssignment_12_2()); }
(rule__MCommonConnection__IfaceMappingAssignment_12_2)
{ after(grammarAccess.getMCommonConnectionAccess().getIfaceMappingAssignment_12_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCommonConnection__Group_12__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCommonConnection__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__Group_12__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getSemicolonKeyword_12_3()); }

	';' 

{ after(grammarAccess.getMCommonConnectionAccess().getSemicolonKeyword_12_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MConnectionSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitch__Group__0__Impl
	rule__MConnectionSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getMConnectionSwitchAction_0()); }
(

)
{ after(grammarAccess.getMConnectionSwitchAccess().getMConnectionSwitchAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitch__Group__1__Impl
	rule__MConnectionSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getSwitchKeyword_1()); }

	'switch' 

{ after(grammarAccess.getMConnectionSwitchAccess().getSwitchKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitch__Group__2__Impl
	rule__MConnectionSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getLeftParenthesisKeyword_2()); }

	'(' 

{ after(grammarAccess.getMConnectionSwitchAccess().getLeftParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitch__Group__3__Impl
	rule__MConnectionSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getClientInstanceAssignment_3()); }
(rule__MConnectionSwitch__ClientInstanceAssignment_3)
{ after(grammarAccess.getMConnectionSwitchAccess().getClientInstanceAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitch__Group__4__Impl
	rule__MConnectionSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getFullStopKeyword_4()); }

	'.' 

{ after(grammarAccess.getMConnectionSwitchAccess().getFullStopKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitch__Group__5__Impl
	rule__MConnectionSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getClientPortAssignment_5()); }
(rule__MConnectionSwitch__ClientPortAssignment_5)
{ after(grammarAccess.getMConnectionSwitchAccess().getClientPortAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitch__Group__6__Impl
	rule__MConnectionSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getRightParenthesisKeyword_6()); }

	')' 

{ after(grammarAccess.getMConnectionSwitchAccess().getRightParenthesisKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitch__Group__7__Impl
	rule__MConnectionSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getLeftCurlyBracketKeyword_7()); }

	'{' 

{ after(grammarAccess.getMConnectionSwitchAccess().getLeftCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitch__Group__8__Impl
	rule__MConnectionSwitch__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMConnectionSwitchAccess().getCasesAssignment_8()); }
(rule__MConnectionSwitch__CasesAssignment_8)
{ after(grammarAccess.getMConnectionSwitchAccess().getCasesAssignment_8()); }
)
(
{ before(grammarAccess.getMConnectionSwitchAccess().getCasesAssignment_8()); }
(rule__MConnectionSwitch__CasesAssignment_8)*
{ after(grammarAccess.getMConnectionSwitchAccess().getCasesAssignment_8()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitch__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitch__Group__9__Impl
	rule__MConnectionSwitch__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getRightCurlyBracketKeyword_9()); }

	'}' 

{ after(grammarAccess.getMConnectionSwitchAccess().getRightCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitch__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitch__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getSemicolonKeyword_10()); }

	';' 

{ after(grammarAccess.getMConnectionSwitchAccess().getSemicolonKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}
























rule__MConnectionSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__0__Impl
	rule__MConnectionSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getMConnectionSwitchCaseAction_0()); }
(

)
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getMConnectionSwitchCaseAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__1__Impl
	rule__MConnectionSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getCaseKeyword_1()); }

	'case' 

{ after(grammarAccess.getMConnectionSwitchCaseAccess().getCaseKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__2__Impl
	rule__MConnectionSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getAlternativeAssignment_2()); }
(rule__MConnectionSwitchCase__AlternativeAssignment_2)
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getAlternativeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__3__Impl
	rule__MConnectionSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getColonKeyword_3()); }

	':' 

{ after(grammarAccess.getMConnectionSwitchCaseAccess().getColonKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__4__Impl
	rule__MConnectionSwitchCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getServerInstanceAssignment_4()); }
(rule__MConnectionSwitchCase__ServerInstanceAssignment_4)
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getServerInstanceAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__5__Impl
	rule__MConnectionSwitchCase__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getFullStopKeyword_5()); }

	'.' 

{ after(grammarAccess.getMConnectionSwitchCaseAccess().getFullStopKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__6__Impl
	rule__MConnectionSwitchCase__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getServerPortAssignment_6()); }
(rule__MConnectionSwitchCase__ServerPortAssignment_6)
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getServerPortAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__7__Impl
	rule__MConnectionSwitchCase__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getUsingKeyword_7()); }

	'using' 

{ after(grammarAccess.getMConnectionSwitchCaseAccess().getUsingKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__8__Impl
	rule__MConnectionSwitchCase__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getConnectorAssignment_8()); }
(rule__MConnectionSwitchCase__ConnectorAssignment_8)
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getConnectorAssignment_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__9__Impl
	rule__MConnectionSwitchCase__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getLeftCurlyBracketKeyword_9()); }

	'{' 

{ after(grammarAccess.getMConnectionSwitchCaseAccess().getLeftCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__10__Impl
	rule__MConnectionSwitchCase__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getGroup_10()); }
(rule__MConnectionSwitchCase__Group_10__0)?
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getGroup_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__11__Impl
	rule__MConnectionSwitchCase__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getAttributeValueAssignmentsAssignment_11()); }
(rule__MConnectionSwitchCase__AttributeValueAssignmentsAssignment_11)*
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getAttributeValueAssignmentsAssignment_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__12__Impl
	rule__MConnectionSwitchCase__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getRightCurlyBracketKeyword_12()); }

	'}' 

{ after(grammarAccess.getMConnectionSwitchCaseAccess().getRightCurlyBracketKeyword_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group__13
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group__13__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getSemicolonKeyword_13()); }

	';' 

{ after(grammarAccess.getMConnectionSwitchCaseAccess().getSemicolonKeyword_13()); }
)

;
finally {
	restoreStackSize(stackSize);
}






























rule__MConnectionSwitchCase__Group_10__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group_10__0__Impl
	rule__MConnectionSwitchCase__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group_10__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getMappingKeyword_10_0()); }

	'mapping' 

{ after(grammarAccess.getMConnectionSwitchCaseAccess().getMappingKeyword_10_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group_10__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group_10__1__Impl
	rule__MConnectionSwitchCase__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group_10__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getColonEqualsSignKeyword_10_1()); }

	':=' 

{ after(grammarAccess.getMConnectionSwitchCaseAccess().getColonEqualsSignKeyword_10_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group_10__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group_10__2__Impl
	rule__MConnectionSwitchCase__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group_10__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getIfaceMappingAssignment_10_2()); }
(rule__MConnectionSwitchCase__IfaceMappingAssignment_10_2)
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getIfaceMappingAssignment_10_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnectionSwitchCase__Group_10__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnectionSwitchCase__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__Group_10__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getSemicolonKeyword_10_3()); }

	';' 

{ after(grammarAccess.getMConnectionSwitchCaseAccess().getSemicolonKeyword_10_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MComponentInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponentInstance__Group__0__Impl
	rule__MComponentInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponentInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentInstanceAccess().getMComponentInstanceAction_0()); }
(

)
{ after(grammarAccess.getMComponentInstanceAccess().getMComponentInstanceAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponentInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponentInstance__Group__1__Impl
	rule__MComponentInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponentInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentInstanceAccess().getInstanceKeyword_1()); }

	'instance' 

{ after(grammarAccess.getMComponentInstanceAccess().getInstanceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponentInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponentInstance__Group__2__Impl
	rule__MComponentInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponentInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentInstanceAccess().getComponentAssignment_2()); }
(rule__MComponentInstance__ComponentAssignment_2)
{ after(grammarAccess.getMComponentInstanceAccess().getComponentAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponentInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponentInstance__Group__3__Impl
	rule__MComponentInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponentInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentInstanceAccess().getNameAssignment_3()); }
(rule__MComponentInstance__NameAssignment_3)
{ after(grammarAccess.getMComponentInstanceAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponentInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponentInstance__Group__4__Impl
	rule__MComponentInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponentInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentInstanceAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMComponentInstanceAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponentInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponentInstance__Group__5__Impl
	rule__MComponentInstance__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponentInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentInstanceAccess().getAttributeValueAssignmentsAssignment_5()); }
(rule__MComponentInstance__AttributeValueAssignmentsAssignment_5)*
{ after(grammarAccess.getMComponentInstanceAccess().getAttributeValueAssignmentsAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponentInstance__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponentInstance__Group__6__Impl
	rule__MComponentInstance__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponentInstance__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentInstanceAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMComponentInstanceAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MComponentInstance__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MComponentInstance__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MComponentInstance__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentInstanceAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMComponentInstanceAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MRegularServiceLibraryInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRegularServiceLibraryInstance__Group__0__Impl
	rule__MRegularServiceLibraryInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularServiceLibraryInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryKeyword_0()); }

	'library' 

{ after(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRegularServiceLibraryInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRegularServiceLibraryInstance__Group__1__Impl
	rule__MRegularServiceLibraryInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularServiceLibraryInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryAssignment_1()); }
(rule__MRegularServiceLibraryInstance__LibraryAssignment_1)
{ after(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRegularServiceLibraryInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRegularServiceLibraryInstance__Group__2__Impl
	rule__MRegularServiceLibraryInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularServiceLibraryInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRegularServiceLibraryInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRegularServiceLibraryInstance__Group__3__Impl
	rule__MRegularServiceLibraryInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularServiceLibraryInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularServiceLibraryInstanceAccess().getAttributeValueAssignmentsAssignment_3()); }
(rule__MRegularServiceLibraryInstance__AttributeValueAssignmentsAssignment_3)*
{ after(grammarAccess.getMRegularServiceLibraryInstanceAccess().getAttributeValueAssignmentsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRegularServiceLibraryInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRegularServiceLibraryInstance__Group__4__Impl
	rule__MRegularServiceLibraryInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularServiceLibraryInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularServiceLibraryInstanceAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMRegularServiceLibraryInstanceAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRegularServiceLibraryInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRegularServiceLibraryInstance__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularServiceLibraryInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularServiceLibraryInstanceAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMRegularServiceLibraryInstanceAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverSLibInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group__0__Impl
	rule__MDriverSLibInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getMDriverSLibInstanceAction_0()); }
(

)
{ after(grammarAccess.getMDriverSLibInstanceAccess().getMDriverSLibInstanceAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group__1__Impl
	rule__MDriverSLibInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getDriverKeyword_1()); }

	'driver' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getDriverKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group__2__Impl
	rule__MDriverSLibInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getLibraryAssignment_2()); }
(rule__MDriverSLibInstance__LibraryAssignment_2)
{ after(grammarAccess.getMDriverSLibInstanceAccess().getLibraryAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group__3__Impl
	rule__MDriverSLibInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group__4__Impl
	rule__MDriverSLibInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4()); }
(rule__MDriverSLibInstance__UnorderedGroup_4)
{ after(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group__5__Impl
	rule__MDriverSLibInstance__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MDriverSLibInstance__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group_4_0__0__Impl
	rule__MDriverSLibInstance__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getAttributeKeyword_4_0_0()); }

	'attribute' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getAttributeKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group_4_0__1__Impl
	rule__MDriverSLibInstance__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getValuesKeyword_4_0_1()); }

	'values' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getValuesKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group_4_0__2__Impl
	rule__MDriverSLibInstance__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_0_2()); }

	'{' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group_4_0__3__Impl
	rule__MDriverSLibInstance__Group_4_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getAttributeValueAssignmentsAssignment_4_0_3()); }
(rule__MDriverSLibInstance__AttributeValueAssignmentsAssignment_4_0_3)
{ after(grammarAccess.getMDriverSLibInstanceAccess().getAttributeValueAssignmentsAssignment_4_0_3()); }
)
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getAttributeValueAssignmentsAssignment_4_0_3()); }
(rule__MDriverSLibInstance__AttributeValueAssignmentsAssignment_4_0_3)*
{ after(grammarAccess.getMDriverSLibInstanceAccess().getAttributeValueAssignmentsAssignment_4_0_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group_4_0__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group_4_0__4__Impl
	rule__MDriverSLibInstance__Group_4_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group_4_0__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_0_4()); }

	'}' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_0_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group_4_0__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group_4_0__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group_4_0__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_4_0_5()); }

	';' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_4_0_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverSLibInstance__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group_4_1__0__Impl
	rule__MDriverSLibInstance__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getDeviceKeyword_4_1_0()); }

	'device' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getDeviceKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group_4_1__1__Impl
	rule__MDriverSLibInstance__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getMappingsKeyword_4_1_1()); }

	'mappings' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getMappingsKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group_4_1__2__Impl
	rule__MDriverSLibInstance__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_1_2()); }

	'{' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group_4_1__3__Impl
	rule__MDriverSLibInstance__Group_4_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getDeviceDriverMappingsAssignment_4_1_3()); }
(rule__MDriverSLibInstance__DeviceDriverMappingsAssignment_4_1_3)
{ after(grammarAccess.getMDriverSLibInstanceAccess().getDeviceDriverMappingsAssignment_4_1_3()); }
)
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getDeviceDriverMappingsAssignment_4_1_3()); }
(rule__MDriverSLibInstance__DeviceDriverMappingsAssignment_4_1_3)*
{ after(grammarAccess.getMDriverSLibInstanceAccess().getDeviceDriverMappingsAssignment_4_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group_4_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group_4_1__4__Impl
	rule__MDriverSLibInstance__Group_4_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group_4_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_1_4()); }

	'}' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__Group_4_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__Group_4_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__Group_4_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_4_1_5()); }

	';' 

{ after(grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_4_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDeviceDriverMapping__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeviceDriverMapping__Group__0__Impl
	rule__MDeviceDriverMapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeviceDriverMapping__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getSupportedKeyword_0()); }

	'supported' 

{ after(grammarAccess.getMDeviceDriverMappingAccess().getSupportedKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeviceDriverMapping__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeviceDriverMapping__Group__1__Impl
	rule__MDeviceDriverMapping__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeviceDriverMapping__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getDeviceKeyword_1()); }

	'device' 

{ after(grammarAccess.getMDeviceDriverMappingAccess().getDeviceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeviceDriverMapping__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeviceDriverMapping__Group__2__Impl
	rule__MDeviceDriverMapping__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeviceDriverMapping__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getSupportedDeviceAssignment_2()); }
(rule__MDeviceDriverMapping__SupportedDeviceAssignment_2)
{ after(grammarAccess.getMDeviceDriverMappingAccess().getSupportedDeviceAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeviceDriverMapping__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeviceDriverMapping__Group__3__Impl
	rule__MDeviceDriverMapping__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeviceDriverMapping__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3()); }

	'->' 

{ after(grammarAccess.getMDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeviceDriverMapping__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeviceDriverMapping__Group__4__Impl
	rule__MDeviceDriverMapping__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeviceDriverMapping__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getDeployedKeyword_4()); }

	'deployed' 

{ after(grammarAccess.getMDeviceDriverMappingAccess().getDeployedKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeviceDriverMapping__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeviceDriverMapping__Group__5__Impl
	rule__MDeviceDriverMapping__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeviceDriverMapping__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getDeviceKeyword_5()); }

	'device' 

{ after(grammarAccess.getMDeviceDriverMappingAccess().getDeviceKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeviceDriverMapping__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeviceDriverMapping__Group__6__Impl
	rule__MDeviceDriverMapping__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeviceDriverMapping__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getDeployedDeviceAssignment_6()); }
(rule__MDeviceDriverMapping__DeployedDeviceAssignment_6)
{ after(grammarAccess.getMDeviceDriverMappingAccess().getDeployedDeviceAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeviceDriverMapping__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeviceDriverMapping__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeviceDriverMapping__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMDeviceDriverMappingAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MDeploymentAlternative__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group__0__Impl
	rule__MDeploymentAlternative__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getMDeploymentAlternativeAction_0()); }
(

)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getMDeploymentAlternativeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group__1__Impl
	rule__MDeploymentAlternative__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_1()); }

	'deployment' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group__2__Impl
	rule__MDeploymentAlternative__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getAlternativeKeyword_2()); }

	'alternative' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getAlternativeKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group__3__Impl
	rule__MDeploymentAlternative__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getNameAssignment_3()); }
(rule__MDeploymentAlternative__NameAssignment_3)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group__4__Impl
	rule__MDeploymentAlternative__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group__5__Impl
	rule__MDeploymentAlternative__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5()); }
(rule__MDeploymentAlternative__UnorderedGroup_5)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group__6__Impl
	rule__MDeploymentAlternative__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MDeploymentAlternative__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_0__0__Impl
	rule__MDeploymentAlternative__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_5_0_0()); }

	'deployment' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_0__1__Impl
	rule__MDeploymentAlternative__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getPlatformsKeyword_5_0_1()); }

	'platforms' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getPlatformsKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_0__2__Impl
	rule__MDeploymentAlternative__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getColonEqualsSignKeyword_5_0_2()); }

	':=' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getColonEqualsSignKeyword_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_0__3__Impl
	rule__MDeploymentAlternative__Group_5_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_5_0_3()); }
(rule__MDeploymentAlternative__DeploymentPlatformsAssignment_5_0_3)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_0__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_0__4__Impl
	rule__MDeploymentAlternative__Group_5_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_0__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_0_4()); }
(rule__MDeploymentAlternative__Group_5_0_4__0)*
{ after(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_0_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_0__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_0__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_0__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_0_5()); }

	';' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_0_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDeploymentAlternative__Group_5_0_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_0_4__0__Impl
	rule__MDeploymentAlternative__Group_5_0_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_0_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getCommaKeyword_5_0_4_0()); }

	',' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getCommaKeyword_5_0_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_0_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_0_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_0_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_5_0_4_1()); }
(rule__MDeploymentAlternative__DeploymentPlatformsAssignment_5_0_4_1)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_5_0_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDeploymentAlternative__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_1__0__Impl
	rule__MDeploymentAlternative__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getAttributeKeyword_5_1_0()); }

	'attribute' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getAttributeKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_1__1__Impl
	rule__MDeploymentAlternative__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getValuesKeyword_5_1_1()); }

	'values' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getValuesKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_1__2__Impl
	rule__MDeploymentAlternative__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_1_2()); }

	'{' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_1__3__Impl
	rule__MDeploymentAlternative__Group_5_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getAttributeValueAssignmentsAssignment_5_1_3()); }
(rule__MDeploymentAlternative__AttributeValueAssignmentsAssignment_5_1_3)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getAttributeValueAssignmentsAssignment_5_1_3()); }
)
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getAttributeValueAssignmentsAssignment_5_1_3()); }
(rule__MDeploymentAlternative__AttributeValueAssignmentsAssignment_5_1_3)*
{ after(grammarAccess.getMDeploymentAlternativeAccess().getAttributeValueAssignmentsAssignment_5_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_1__4__Impl
	rule__MDeploymentAlternative__Group_5_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_1_4()); }

	'}' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_1_5()); }

	';' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDeploymentAlternative__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_2__0__Impl
	rule__MDeploymentAlternative__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_5_2_0()); }

	'deployment' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_2__1__Impl
	rule__MDeploymentAlternative__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getAlternativesKeyword_5_2_1()); }

	'alternatives' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getAlternativesKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_2__2__Impl
	rule__MDeploymentAlternative__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_2_2()); }

	'{' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_2__3__Impl
	rule__MDeploymentAlternative__Group_5_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentAlternativesAssignment_5_2_3()); }
(rule__MDeploymentAlternative__DeploymentAlternativesAssignment_5_2_3)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentAlternativesAssignment_5_2_3()); }
)
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentAlternativesAssignment_5_2_3()); }
(rule__MDeploymentAlternative__DeploymentAlternativesAssignment_5_2_3)*
{ after(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentAlternativesAssignment_5_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_2__4__Impl
	rule__MDeploymentAlternative__Group_5_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_2_4()); }

	'}' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_2_5()); }

	';' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDeploymentAlternative__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_3__0__Impl
	rule__MDeploymentAlternative__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getComponentsKeyword_5_3_0()); }

	'components' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getComponentsKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_3__1__Impl
	rule__MDeploymentAlternative__Group_5_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_3_1()); }

	'{' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_3__2__Impl
	rule__MDeploymentAlternative__Group_5_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getComponentsAssignment_5_3_2()); }
(rule__MDeploymentAlternative__ComponentsAssignment_5_3_2)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getComponentsAssignment_5_3_2()); }
)
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getComponentsAssignment_5_3_2()); }
(rule__MDeploymentAlternative__ComponentsAssignment_5_3_2)*
{ after(grammarAccess.getMDeploymentAlternativeAccess().getComponentsAssignment_5_3_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_3__3__Impl
	rule__MDeploymentAlternative__Group_5_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_3_3()); }

	'}' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_3_4()); }

	';' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MDeploymentAlternative__Group_5_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_4__0__Impl
	rule__MDeploymentAlternative__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getConnectionsKeyword_5_4_0()); }

	'connections' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getConnectionsKeyword_5_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_4__1__Impl
	rule__MDeploymentAlternative__Group_5_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_4_1()); }

	'{' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_4__2__Impl
	rule__MDeploymentAlternative__Group_5_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getConnectionsAssignment_5_4_2()); }
(rule__MDeploymentAlternative__ConnectionsAssignment_5_4_2)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getConnectionsAssignment_5_4_2()); }
)
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getConnectionsAssignment_5_4_2()); }
(rule__MDeploymentAlternative__ConnectionsAssignment_5_4_2)*
{ after(grammarAccess.getMDeploymentAlternativeAccess().getConnectionsAssignment_5_4_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_4__3__Impl
	rule__MDeploymentAlternative__Group_5_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_4_3()); }

	'}' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_4_4()); }

	';' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MDeploymentAlternative__Group_5_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_5__0__Impl
	rule__MDeploymentAlternative__Group_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getLibrariesKeyword_5_5_0()); }

	'libraries' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getLibrariesKeyword_5_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_5__1__Impl
	rule__MDeploymentAlternative__Group_5_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_5_1()); }

	'{' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_5__2__Impl
	rule__MDeploymentAlternative__Group_5_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getLibrariesAssignment_5_5_2()); }
(rule__MDeploymentAlternative__LibrariesAssignment_5_5_2)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getLibrariesAssignment_5_5_2()); }
)
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getLibrariesAssignment_5_5_2()); }
(rule__MDeploymentAlternative__LibrariesAssignment_5_5_2)*
{ after(grammarAccess.getMDeploymentAlternativeAccess().getLibrariesAssignment_5_5_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_5__3__Impl
	rule__MDeploymentAlternative__Group_5_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_5_3()); }

	'}' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__Group_5_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__Group_5_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__Group_5_5__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_5_4()); }

	';' 

{ after(grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_5_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MDeploymentPlatform__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group__0__Impl
	rule__MDeploymentPlatform__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getDeploymentKeyword_0()); }

	'deployment' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getDeploymentKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group__1__Impl
	rule__MDeploymentPlatform__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getPlatformKeyword_1()); }

	'platform' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getPlatformKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group__2__Impl
	rule__MDeploymentPlatform__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getNameAssignment_2()); }
(rule__MDeploymentPlatform__NameAssignment_2)
{ after(grammarAccess.getMDeploymentPlatformAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group__3__Impl
	rule__MDeploymentPlatform__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group__4__Impl
	rule__MDeploymentPlatform__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4()); }
(rule__MDeploymentPlatform__UnorderedGroup_4)
{ after(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group__5__Impl
	rule__MDeploymentPlatform__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MDeploymentPlatform__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_0__0__Impl
	rule__MDeploymentPlatform__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getPlatformKeyword_4_0_0()); }

	'platform' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getPlatformKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_0__1__Impl
	rule__MDeploymentPlatform__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getColonEqualsSignKeyword_4_0_1()); }

	':=' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getColonEqualsSignKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_0__2__Impl
	rule__MDeploymentPlatform__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getPlatformAssignment_4_0_2()); }
(rule__MDeploymentPlatform__PlatformAssignment_4_0_2)
{ after(grammarAccess.getMDeploymentPlatformAccess().getPlatformAssignment_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_0_3()); }

	';' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDeploymentPlatform__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_1__0__Impl
	rule__MDeploymentPlatform__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getDeployedKeyword_4_1_0()); }

	'deployed' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getDeployedKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_1__1__Impl
	rule__MDeploymentPlatform__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getDevicesKeyword_4_1_1()); }

	'devices' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getDevicesKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_1__2__Impl
	rule__MDeploymentPlatform__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_1_2()); }

	'{' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_1__3__Impl
	rule__MDeploymentPlatform__Group_4_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getDeployedDevicesAssignment_4_1_3()); }
(rule__MDeploymentPlatform__DeployedDevicesAssignment_4_1_3)
{ after(grammarAccess.getMDeploymentPlatformAccess().getDeployedDevicesAssignment_4_1_3()); }
)
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getDeployedDevicesAssignment_4_1_3()); }
(rule__MDeploymentPlatform__DeployedDevicesAssignment_4_1_3)*
{ after(grammarAccess.getMDeploymentPlatformAccess().getDeployedDevicesAssignment_4_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_1__4__Impl
	rule__MDeploymentPlatform__Group_4_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_1_4()); }

	'}' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_1_5()); }

	';' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDeploymentPlatform__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_2__0__Impl
	rule__MDeploymentPlatform__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getParameterKeyword_4_2_0()); }

	'parameter' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getParameterKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_2__1__Impl
	rule__MDeploymentPlatform__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getValuesKeyword_4_2_1()); }

	'values' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getValuesKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_2__2__Impl
	rule__MDeploymentPlatform__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_2_2()); }

	'{' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_2__3__Impl
	rule__MDeploymentPlatform__Group_4_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getParameterValueAssignmentsAssignment_4_2_3()); }
(rule__MDeploymentPlatform__ParameterValueAssignmentsAssignment_4_2_3)
{ after(grammarAccess.getMDeploymentPlatformAccess().getParameterValueAssignmentsAssignment_4_2_3()); }
)
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getParameterValueAssignmentsAssignment_4_2_3()); }
(rule__MDeploymentPlatform__ParameterValueAssignmentsAssignment_4_2_3)*
{ after(grammarAccess.getMDeploymentPlatformAccess().getParameterValueAssignmentsAssignment_4_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_2__4__Impl
	rule__MDeploymentPlatform__Group_4_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_2_4()); }

	'}' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__Group_4_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__Group_4_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__Group_4_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_2_5()); }

	';' 

{ after(grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDeployedDevice__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeployedDevice__Group__0__Impl
	rule__MDeployedDevice__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeployedDevice__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeployedDeviceAccess().getDeviceKeyword_0()); }

	'device' 

{ after(grammarAccess.getMDeployedDeviceAccess().getDeviceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeployedDevice__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeployedDevice__Group__1__Impl
	rule__MDeployedDevice__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeployedDevice__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeployedDeviceAccess().getDeviceAssignment_1()); }
(rule__MDeployedDevice__DeviceAssignment_1)
{ after(grammarAccess.getMDeployedDeviceAccess().getDeviceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeployedDevice__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeployedDevice__Group__2__Impl
	rule__MDeployedDevice__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeployedDevice__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeployedDeviceAccess().getNameAssignment_2()); }
(rule__MDeployedDevice__NameAssignment_2)
{ after(grammarAccess.getMDeployedDeviceAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeployedDevice__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeployedDevice__Group__3__Impl
	rule__MDeployedDevice__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeployedDevice__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeployedDeviceAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMDeployedDeviceAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeployedDevice__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeployedDevice__Group__4__Impl
	rule__MDeployedDevice__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeployedDevice__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeployedDeviceAccess().getParameterValueAssignmentsAssignment_4()); }
(rule__MDeployedDevice__ParameterValueAssignmentsAssignment_4)*
{ after(grammarAccess.getMDeployedDeviceAccess().getParameterValueAssignmentsAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeployedDevice__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeployedDevice__Group__5__Impl
	rule__MDeployedDevice__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeployedDevice__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeployedDeviceAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMDeployedDeviceAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDeployedDevice__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeployedDevice__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDeployedDevice__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeployedDeviceAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMDeployedDeviceAccess().getSemicolonKeyword_6()); }
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









rule__MMCADeployment__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
    }
:
	rule__MMCADeployment__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MMCADeployment__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMCADeploymentAccess().getGroup_5_0()); }
						(rule__MMCADeployment__Group_5_0__0)
						{ after(grammarAccess.getMMCADeploymentAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMCADeploymentAccess().getGroup_5_1()); }
						(rule__MMCADeployment__Group_5_1__0)
						{ after(grammarAccess.getMMCADeploymentAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMCADeploymentAccess().getGroup_5_2()); }
						(rule__MMCADeployment__Group_5_2__0)
						{ after(grammarAccess.getMMCADeploymentAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMCADeploymentAccess().getGroup_5_3()); }
						(rule__MMCADeployment__Group_5_3__0)
						{ after(grammarAccess.getMMCADeploymentAccess().getGroup_5_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMCADeploymentAccess().getGroup_5_4()); }
						(rule__MMCADeployment__Group_5_4__0)
						{ after(grammarAccess.getMMCADeploymentAccess().getGroup_5_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMCADeploymentAccess().getGroup_5_5()); }
						(rule__MMCADeployment__Group_5_5__0)
						{ after(grammarAccess.getMMCADeploymentAccess().getGroup_5_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMCADeploymentAccess().getGroup_5_6()); }
						(rule__MMCADeployment__Group_5_6__0)
						{ after(grammarAccess.getMMCADeploymentAccess().getGroup_5_6()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MMCADeployment__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__UnorderedGroup_5__Impl
	rule__MMCADeployment__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__UnorderedGroup_5__Impl
	rule__MMCADeployment__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__UnorderedGroup_5__Impl
	rule__MMCADeployment__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__UnorderedGroup_5__Impl
	rule__MMCADeployment__UnorderedGroup_5__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__UnorderedGroup_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__UnorderedGroup_5__Impl
	rule__MMCADeployment__UnorderedGroup_5__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__UnorderedGroup_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__UnorderedGroup_5__Impl
	rule__MMCADeployment__UnorderedGroup_5__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMCADeployment__UnorderedGroup_5__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCADeployment__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}
















rule__MDriverSLibInstance__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4());
    }
:
	rule__MDriverSLibInstance__UnorderedGroup_4__0
	?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSLibInstanceAccess().getGroup_4_0()); }
						(rule__MDriverSLibInstance__Group_4_0__0)
						{ after(grammarAccess.getMDriverSLibInstanceAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSLibInstanceAccess().getGroup_4_1()); }
						(rule__MDriverSLibInstance__Group_4_1__0)
						{ after(grammarAccess.getMDriverSLibInstanceAccess().getGroup_4_1()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__UnorderedGroup_4__Impl
	rule__MDriverSLibInstance__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibInstance__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibInstance__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}






rule__MDeploymentAlternative__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());
    }
:
	rule__MDeploymentAlternative__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_0()); }
						(rule__MDeploymentAlternative__Group_5_0__0)
						{ after(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_1()); }
						(rule__MDeploymentAlternative__Group_5_1__0)
						{ after(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_2()); }
						(rule__MDeploymentAlternative__Group_5_2__0)
						{ after(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_3()); }
						(rule__MDeploymentAlternative__Group_5_3__0)
						{ after(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_4()); }
						(rule__MDeploymentAlternative__Group_5_4__0)
						{ after(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_5()); }
						(rule__MDeploymentAlternative__Group_5_5__0)
						{ after(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_5()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__UnorderedGroup_5__Impl
	rule__MDeploymentAlternative__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__UnorderedGroup_5__Impl
	rule__MDeploymentAlternative__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__UnorderedGroup_5__Impl
	rule__MDeploymentAlternative__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__UnorderedGroup_5__Impl
	rule__MDeploymentAlternative__UnorderedGroup_5__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__UnorderedGroup_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__UnorderedGroup_5__Impl
	rule__MDeploymentAlternative__UnorderedGroup_5__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentAlternative__UnorderedGroup_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentAlternative__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}














rule__MDeploymentPlatform__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());
    }
:
	rule__MDeploymentPlatform__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDeploymentPlatformAccess().getGroup_4_0()); }
						(rule__MDeploymentPlatform__Group_4_0__0)
						{ after(grammarAccess.getMDeploymentPlatformAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDeploymentPlatformAccess().getGroup_4_1()); }
						(rule__MDeploymentPlatform__Group_4_1__0)
						{ after(grammarAccess.getMDeploymentPlatformAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDeploymentPlatformAccess().getGroup_4_2()); }
						(rule__MDeploymentPlatform__Group_4_2__0)
						{ after(grammarAccess.getMDeploymentPlatformAccess().getGroup_4_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__UnorderedGroup_4__Impl
	rule__MDeploymentPlatform__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__UnorderedGroup_4__Impl
	rule__MDeploymentPlatform__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDeploymentPlatform__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDeploymentPlatform__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__MMCLEVMCADPackageFile__PackageAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); }
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVMCADPackageFile__ImportsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVMCADPackageFile__ElementAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVMCADPackageFileAccess().getElementMMCLEVMCADPackageElementParserRuleCall_4_0()); }
	ruleMMCLEVMCADPackageElement{ after(grammarAccess.getMMCLEVMCADPackageFileAccess().getElementMMCLEVMCADPackageElementParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__DomainAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getDomainMDomainCrossReference_2_0()); }
(
{ before(grammarAccess.getMMCADeploymentAccess().getDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMMCADeploymentAccess().getDomainMDomainVersionedQualifiedNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMMCADeploymentAccess().getDomainMDomainCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMMCADeploymentAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__VersionAssignment_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMMCADeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__AttributeValueAssignmentsAssignment_5_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0()); }
	ruleMAttributeValueAssignment{ after(grammarAccess.getMMCADeploymentAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__DeploymentPlatformsAssignment_5_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getDeploymentPlatformsMDeploymentPlatformParserRuleCall_5_2_3_0()); }
	ruleMDeploymentPlatform{ after(grammarAccess.getMMCADeploymentAccess().getDeploymentPlatformsMDeploymentPlatformParserRuleCall_5_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__DeploymentAlternativesAssignment_5_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_3_3_0()); }
	ruleMDeploymentAlternative{ after(grammarAccess.getMMCADeploymentAccess().getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__ComponentsAssignment_5_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getComponentsMComponentInstanceParserRuleCall_5_4_2_0()); }
	ruleMComponentInstance{ after(grammarAccess.getMMCADeploymentAccess().getComponentsMComponentInstanceParserRuleCall_5_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__ConnectionsAssignment_5_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getConnectionsMConnectionParserRuleCall_5_5_2_0()); }
	ruleMConnection{ after(grammarAccess.getMMCADeploymentAccess().getConnectionsMConnectionParserRuleCall_5_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCADeployment__LibrariesAssignment_5_6_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCADeploymentAccess().getLibrariesMServiceLibraryInstanceParserRuleCall_5_6_2_0()); }
	ruleMServiceLibraryInstance{ after(grammarAccess.getMMCADeploymentAccess().getLibrariesMServiceLibraryInstanceParserRuleCall_5_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__ClientInstanceAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getClientInstanceMComponentInstanceCrossReference_2_0()); }
(
{ before(grammarAccess.getMCommonConnectionAccess().getClientInstanceMComponentInstanceIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getMCommonConnectionAccess().getClientInstanceMComponentInstanceIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMCommonConnectionAccess().getClientInstanceMComponentInstanceCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__ClientPortAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getClientPortMClientPortCrossReference_4_0()); }
(
{ before(grammarAccess.getMCommonConnectionAccess().getClientPortMClientPortIDTerminalRuleCall_4_0_1()); }
	RULE_ID{ after(grammarAccess.getMCommonConnectionAccess().getClientPortMClientPortIDTerminalRuleCall_4_0_1()); }
)
{ after(grammarAccess.getMCommonConnectionAccess().getClientPortMClientPortCrossReference_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__ServerInstanceAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getServerInstanceMComponentInstanceCrossReference_6_0()); }
(
{ before(grammarAccess.getMCommonConnectionAccess().getServerInstanceMComponentInstanceIDTerminalRuleCall_6_0_1()); }
	RULE_ID{ after(grammarAccess.getMCommonConnectionAccess().getServerInstanceMComponentInstanceIDTerminalRuleCall_6_0_1()); }
)
{ after(grammarAccess.getMCommonConnectionAccess().getServerInstanceMComponentInstanceCrossReference_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__ServerPortAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getServerPortMServerPortCrossReference_8_0()); }
(
{ before(grammarAccess.getMCommonConnectionAccess().getServerPortMServerPortIDTerminalRuleCall_8_0_1()); }
	RULE_ID{ after(grammarAccess.getMCommonConnectionAccess().getServerPortMServerPortIDTerminalRuleCall_8_0_1()); }
)
{ after(grammarAccess.getMCommonConnectionAccess().getServerPortMServerPortCrossReference_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__ConnectorAssignment_10
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getConnectorMConnectorCrossReference_10_0()); }
(
{ before(grammarAccess.getMCommonConnectionAccess().getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_10_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMCommonConnectionAccess().getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_10_0_1()); }
)
{ after(grammarAccess.getMCommonConnectionAccess().getConnectorMConnectorCrossReference_10_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__IfaceMappingAssignment_12_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_12_2_0()); }
(
{ before(grammarAccess.getMCommonConnectionAccess().getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_12_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMCommonConnectionAccess().getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_12_2_0_1()); }
)
{ after(grammarAccess.getMCommonConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_12_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCommonConnection__AttributeValueAssignmentsAssignment_13
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCommonConnectionAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0()); }
	ruleMAttributeValueAssignment{ after(grammarAccess.getMCommonConnectionAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__ClientInstanceAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getClientInstanceMComponentInstanceCrossReference_3_0()); }
(
{ before(grammarAccess.getMConnectionSwitchAccess().getClientInstanceMComponentInstanceIDTerminalRuleCall_3_0_1()); }
	RULE_ID{ after(grammarAccess.getMConnectionSwitchAccess().getClientInstanceMComponentInstanceIDTerminalRuleCall_3_0_1()); }
)
{ after(grammarAccess.getMConnectionSwitchAccess().getClientInstanceMComponentInstanceCrossReference_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__ClientPortAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getClientPortMClientPortCrossReference_5_0()); }
(
{ before(grammarAccess.getMConnectionSwitchAccess().getClientPortMClientPortIDTerminalRuleCall_5_0_1()); }
	RULE_ID{ after(grammarAccess.getMConnectionSwitchAccess().getClientPortMClientPortIDTerminalRuleCall_5_0_1()); }
)
{ after(grammarAccess.getMConnectionSwitchAccess().getClientPortMClientPortCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitch__CasesAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchAccess().getCasesMConnectionSwitchCaseParserRuleCall_8_0()); }
	ruleMConnectionSwitchCase{ after(grammarAccess.getMConnectionSwitchAccess().getCasesMConnectionSwitchCaseParserRuleCall_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__AlternativeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getAlternativeMDeploymentAlternativeCrossReference_2_0()); }
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getAlternativeMDeploymentAlternativeIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getMConnectionSwitchCaseAccess().getAlternativeMDeploymentAlternativeIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getAlternativeMDeploymentAlternativeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__ServerInstanceAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getServerInstanceMComponentInstanceCrossReference_4_0()); }
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getServerInstanceMComponentInstanceIDTerminalRuleCall_4_0_1()); }
	RULE_ID{ after(grammarAccess.getMConnectionSwitchCaseAccess().getServerInstanceMComponentInstanceIDTerminalRuleCall_4_0_1()); }
)
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getServerInstanceMComponentInstanceCrossReference_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__ServerPortAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getServerPortMServerPortCrossReference_6_0()); }
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getServerPortMServerPortIDTerminalRuleCall_6_0_1()); }
	RULE_ID{ after(grammarAccess.getMConnectionSwitchCaseAccess().getServerPortMServerPortIDTerminalRuleCall_6_0_1()); }
)
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getServerPortMServerPortCrossReference_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__ConnectorAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getConnectorMConnectorCrossReference_8_0()); }
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMConnectionSwitchCaseAccess().getConnectorMConnectorVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
)
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getConnectorMConnectorCrossReference_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__IfaceMappingAssignment_10_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getIfaceMappingMInterfaceMappingCrossReference_10_2_0()); }
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_10_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMConnectionSwitchCaseAccess().getIfaceMappingMInterfaceMappingVersionedQualifiedNameParserRuleCall_10_2_0_1()); }
)
{ after(grammarAccess.getMConnectionSwitchCaseAccess().getIfaceMappingMInterfaceMappingCrossReference_10_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnectionSwitchCase__AttributeValueAssignmentsAssignment_11
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectionSwitchCaseAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_11_0()); }
	ruleMAttributeValueAssignment{ after(grammarAccess.getMConnectionSwitchCaseAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_11_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponentInstance__ComponentAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentInstanceAccess().getComponentMComponentCrossReference_2_0()); }
(
{ before(grammarAccess.getMComponentInstanceAccess().getComponentMComponentVersionedQualifiedNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMComponentInstanceAccess().getComponentMComponentVersionedQualifiedNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMComponentInstanceAccess().getComponentMComponentCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponentInstance__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentInstanceAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMComponentInstanceAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MComponentInstance__AttributeValueAssignmentsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMComponentInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0()); }
	ruleMAttributeValueAssignment{ after(grammarAccess.getMComponentInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularServiceLibraryInstance__LibraryAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryMServiceLibraryCrossReference_1_0()); }
(
{ before(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryMServiceLibraryCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRegularServiceLibraryInstance__AttributeValueAssignmentsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRegularServiceLibraryInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0()); }
	ruleMAttributeValueAssignment{ after(grammarAccess.getMRegularServiceLibraryInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__LibraryAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getLibraryMServiceLibraryCrossReference_2_0()); }
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSLibInstanceAccess().getLibraryMServiceLibraryVersionedQualifiedNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMDriverSLibInstanceAccess().getLibraryMServiceLibraryCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__AttributeValueAssignmentsAssignment_4_0_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0()); }
	ruleMAttributeValueAssignment{ after(grammarAccess.getMDriverSLibInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibInstance__DeviceDriverMappingsAssignment_4_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibInstanceAccess().getDeviceDriverMappingsMDeviceDriverMappingParserRuleCall_4_1_3_0()); }
	ruleMDeviceDriverMapping{ after(grammarAccess.getMDriverSLibInstanceAccess().getDeviceDriverMappingsMDeviceDriverMappingParserRuleCall_4_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeviceDriverMapping__SupportedDeviceAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0()); }
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeviceDriverMapping__DeployedDeviceAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceCrossReference_6_0()); }
(
{ before(grammarAccess.getMDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceVersionedQualifiedReferenceNameParserRuleCall_6_0_1()); }
)
{ after(grammarAccess.getMDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceCrossReference_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMDeploymentAlternativeAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__DeploymentPlatformsAssignment_5_0_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_3_0()); }
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformIDTerminalRuleCall_5_0_3_0_1()); }
	RULE_ID{ after(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformIDTerminalRuleCall_5_0_3_0_1()); }
)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__DeploymentPlatformsAssignment_5_0_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_4_1_0()); }
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformIDTerminalRuleCall_5_0_4_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformIDTerminalRuleCall_5_0_4_1_0_1()); }
)
{ after(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__AttributeValueAssignmentsAssignment_5_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0()); }
	ruleMAttributeValueAssignment{ after(grammarAccess.getMDeploymentAlternativeAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__DeploymentAlternativesAssignment_5_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_2_3_0()); }
	ruleMDeploymentAlternative{ after(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__ComponentsAssignment_5_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getComponentsMComponentInstanceParserRuleCall_5_3_2_0()); }
	ruleMComponentInstance{ after(grammarAccess.getMDeploymentAlternativeAccess().getComponentsMComponentInstanceParserRuleCall_5_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__ConnectionsAssignment_5_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getConnectionsMConnectionParserRuleCall_5_4_2_0()); }
	ruleMConnection{ after(grammarAccess.getMDeploymentAlternativeAccess().getConnectionsMConnectionParserRuleCall_5_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentAlternative__LibrariesAssignment_5_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentAlternativeAccess().getLibrariesMServiceLibraryInstanceParserRuleCall_5_5_2_0()); }
	ruleMServiceLibraryInstance{ after(grammarAccess.getMDeploymentAlternativeAccess().getLibrariesMServiceLibraryInstanceParserRuleCall_5_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMDeploymentPlatformAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__PlatformAssignment_4_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getPlatformMPlatformCrossReference_4_0_2_0()); }
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getPlatformMPlatformVersionedQualifiedNameParserRuleCall_4_0_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDeploymentPlatformAccess().getPlatformMPlatformVersionedQualifiedNameParserRuleCall_4_0_2_0_1()); }
)
{ after(grammarAccess.getMDeploymentPlatformAccess().getPlatformMPlatformCrossReference_4_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__DeployedDevicesAssignment_4_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getDeployedDevicesMDeployedDeviceParserRuleCall_4_1_3_0()); }
	ruleMDeployedDevice{ after(grammarAccess.getMDeploymentPlatformAccess().getDeployedDevicesMDeployedDeviceParserRuleCall_4_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeploymentPlatform__ParameterValueAssignmentsAssignment_4_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeploymentPlatformAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_2_3_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMDeploymentPlatformAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeployedDevice__DeviceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeployedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); }
(
{ before(grammarAccess.getMDeployedDeviceAccess().getDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDeployedDeviceAccess().getDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMDeployedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeployedDevice__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeployedDeviceAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMDeployedDeviceAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDeployedDevice__ParameterValueAssignmentsAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeployedDeviceAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0()); }
	ruleMParameterValueAssignment{ after(grammarAccess.getMDeployedDeviceAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0()); }
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


RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


