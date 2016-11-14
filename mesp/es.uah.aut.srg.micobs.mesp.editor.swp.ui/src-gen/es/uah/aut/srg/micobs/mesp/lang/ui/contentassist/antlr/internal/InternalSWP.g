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
grammar InternalSWP;

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
import es.uah.aut.srg.micobs.mesp.lang.services.SWPGrammarAccess;

}

@parser::members {
 
 	private SWPGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(SWPGrammarAccess grammarAccess) {
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




// Entry rule entryRuleMMESPSWPPackageFile
entryRuleMMESPSWPPackageFile 
:
{ before(grammarAccess.getMMESPSWPPackageFileRule()); }
	 ruleMMESPSWPPackageFile
{ after(grammarAccess.getMMESPSWPPackageFileRule()); } 
	 EOF 
;

// Rule MMESPSWPPackageFile
ruleMMESPSWPPackageFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getGroup()); }
(rule__MMESPSWPPackageFile__Group__0)
{ after(grammarAccess.getMMESPSWPPackageFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMESPSWPPackageElement
entryRuleMMESPSWPPackageElement 
:
{ before(grammarAccess.getMMESPSWPPackageElementRule()); }
	 ruleMMESPSWPPackageElement
{ after(grammarAccess.getMMESPSWPPackageElementRule()); } 
	 EOF 
;

// Rule MMESPSWPPackageElement
ruleMMESPSWPPackageElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPSWPPackageElementAccess().getAlternatives()); }
(rule__MMESPSWPPackageElement__Alternatives)
{ after(grammarAccess.getMMESPSWPPackageElementAccess().getAlternatives()); }
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



// Entry rule entryRuleMAbstractSwPackage
entryRuleMAbstractSwPackage 
:
{ before(grammarAccess.getMAbstractSwPackageRule()); }
	 ruleMAbstractSwPackage
{ after(grammarAccess.getMAbstractSwPackageRule()); } 
	 EOF 
;

// Rule MAbstractSwPackage
ruleMAbstractSwPackage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getGroup()); }
(rule__MAbstractSwPackage__Group__0)
{ after(grammarAccess.getMAbstractSwPackageAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMSwPackageProvidedInterface
entryRuleMSwPackageProvidedInterface 
:
{ before(grammarAccess.getMSwPackageProvidedInterfaceRule()); }
	 ruleMSwPackageProvidedInterface
{ after(grammarAccess.getMSwPackageProvidedInterfaceRule()); } 
	 EOF 
;

// Rule MSwPackageProvidedInterface
ruleMSwPackageProvidedInterface
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMSwPackageProvidedInterfaceAccess().getGroup()); }
(rule__MSwPackageProvidedInterface__Group__0)
{ after(grammarAccess.getMSwPackageProvidedInterfaceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMSwPackageProvidedInterfacePVA
entryRuleMSwPackageProvidedInterfacePVA 
:
{ before(grammarAccess.getMSwPackageProvidedInterfacePVARule()); }
	 ruleMSwPackageProvidedInterfacePVA
{ after(grammarAccess.getMSwPackageProvidedInterfacePVARule()); } 
	 EOF 
;

// Rule MSwPackageProvidedInterfacePVA
ruleMSwPackageProvidedInterfacePVA
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAAccess().getAlternatives()); }
(rule__MSwPackageProvidedInterfacePVA__Alternatives)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVAAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMSwPackageProvidedInterfacePVAExpression
entryRuleMSwPackageProvidedInterfacePVAExpression 
:
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionRule()); }
	 ruleMSwPackageProvidedInterfacePVAExpression
{ after(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionRule()); } 
	 EOF 
;

// Rule MSwPackageProvidedInterfacePVAExpression
ruleMSwPackageProvidedInterfacePVAExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getGroup()); }
(rule__MSwPackageProvidedInterfacePVAExpression__Group__0)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMSwPackageProvidedInterfacePVASwitch
entryRuleMSwPackageProvidedInterfacePVASwitch 
:
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchRule()); }
	 ruleMSwPackageProvidedInterfacePVASwitch
{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchRule()); } 
	 EOF 
;

// Rule MSwPackageProvidedInterfacePVASwitch
ruleMSwPackageProvidedInterfacePVASwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getGroup()); }
(rule__MSwPackageProvidedInterfacePVASwitch__Group__0)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMSwPackageProvidedInterfacePVASwitchCase
entryRuleMSwPackageProvidedInterfacePVASwitchCase 
:
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseRule()); }
	 ruleMSwPackageProvidedInterfacePVASwitchCase
{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseRule()); } 
	 EOF 
;

// Rule MSwPackageProvidedInterfacePVASwitchCase
ruleMSwPackageProvidedInterfacePVASwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getGroup()); }
(rule__MSwPackageProvidedInterfacePVASwitchCase__Group__0)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getGroup()); }
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



// Entry rule entryRuleMSwPackage
entryRuleMSwPackage 
:
{ before(grammarAccess.getMSwPackageRule()); }
	 ruleMSwPackage
{ after(grammarAccess.getMSwPackageRule()); } 
	 EOF 
;

// Rule MSwPackage
ruleMSwPackage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMSwPackageAccess().getGroup()); }
(rule__MSwPackage__Group__0)
{ after(grammarAccess.getMSwPackageAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDriverSwPackage
entryRuleMDriverSwPackage 
:
{ before(grammarAccess.getMDriverSwPackageRule()); }
	 ruleMDriverSwPackage
{ after(grammarAccess.getMDriverSwPackageRule()); } 
	 EOF 
;

// Rule MDriverSwPackage
ruleMDriverSwPackage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getGroup()); }
(rule__MDriverSwPackage__Group__0)
{ after(grammarAccess.getMDriverSwPackageAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDriverSwPackageSupportedPlatform
entryRuleMDriverSwPackageSupportedPlatform 
:
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformRule()); }
	 ruleMDriverSwPackageSupportedPlatform
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformRule()); } 
	 EOF 
;

// Rule MDriverSwPackageSupportedPlatform
ruleMDriverSwPackageSupportedPlatform
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup()); }
(rule__MDriverSwPackageSupportedPlatform__Group__0)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDriverSwPackageSupportedDevice
entryRuleMDriverSwPackageSupportedDevice 
:
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceRule()); }
	 ruleMDriverSwPackageSupportedDevice
{ after(grammarAccess.getMDriverSwPackageSupportedDeviceRule()); } 
	 EOF 
;

// Rule MDriverSwPackageSupportedDevice
ruleMDriverSwPackageSupportedDevice
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getGroup()); }
(rule__MDriverSwPackageSupportedDevice__Group__0)
{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMSwPackageSupportedPlatform
entryRuleMSwPackageSupportedPlatform 
:
{ before(grammarAccess.getMSwPackageSupportedPlatformRule()); }
	 ruleMSwPackageSupportedPlatform
{ after(grammarAccess.getMSwPackageSupportedPlatformRule()); } 
	 EOF 
;

// Rule MSwPackageSupportedPlatform
ruleMSwPackageSupportedPlatform
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup()); }
(rule__MSwPackageSupportedPlatform__Group__0)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup()); }
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



// Entry rule entryRuleMParameterWithoutSWPSP
entryRuleMParameterWithoutSWPSP 
:
{ before(grammarAccess.getMParameterWithoutSWPSPRule()); }
	 ruleMParameterWithoutSWPSP
{ after(grammarAccess.getMParameterWithoutSWPSPRule()); } 
	 EOF 
;

// Rule MParameterWithoutSWPSP
ruleMParameterWithoutSWPSP
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterWithoutSWPSPAccess().getAlternatives()); }
(rule__MParameterWithoutSWPSP__Alternatives)
{ after(grammarAccess.getMParameterWithoutSWPSPAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMBooleanParamSWPSPSwitch
entryRuleMBooleanParamSWPSPSwitch 
:
{ before(grammarAccess.getMBooleanParamSWPSPSwitchRule()); }
	 ruleMBooleanParamSWPSPSwitch
{ after(grammarAccess.getMBooleanParamSWPSPSwitchRule()); } 
	 EOF 
;

// Rule MBooleanParamSWPSPSwitch
ruleMBooleanParamSWPSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getGroup()); }
(rule__MBooleanParamSWPSPSwitch__Group__0)
{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMBooleanParamSWPSPSwitchCase
entryRuleMBooleanParamSWPSPSwitchCase 
:
{ before(grammarAccess.getMBooleanParamSWPSPSwitchCaseRule()); }
	 ruleMBooleanParamSWPSPSwitchCase
{ after(grammarAccess.getMBooleanParamSWPSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MBooleanParamSWPSPSwitchCase
ruleMBooleanParamSWPSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getGroup()); }
(rule__MBooleanParamSWPSPSwitchCase__Group__0)
{ after(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMStringParamSWPSPSwitch
entryRuleMStringParamSWPSPSwitch 
:
{ before(grammarAccess.getMStringParamSWPSPSwitchRule()); }
	 ruleMStringParamSWPSPSwitch
{ after(grammarAccess.getMStringParamSWPSPSwitchRule()); } 
	 EOF 
;

// Rule MStringParamSWPSPSwitch
ruleMStringParamSWPSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getGroup()); }
(rule__MStringParamSWPSPSwitch__Group__0)
{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMStringParamSWPSPSwitchCase
entryRuleMStringParamSWPSPSwitchCase 
:
{ before(grammarAccess.getMStringParamSWPSPSwitchCaseRule()); }
	 ruleMStringParamSWPSPSwitchCase
{ after(grammarAccess.getMStringParamSWPSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MStringParamSWPSPSwitchCase
ruleMStringParamSWPSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getGroup()); }
(rule__MStringParamSWPSPSwitchCase__Group__0)
{ after(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMIntegerParamSWPSPSwitch
entryRuleMIntegerParamSWPSPSwitch 
:
{ before(grammarAccess.getMIntegerParamSWPSPSwitchRule()); }
	 ruleMIntegerParamSWPSPSwitch
{ after(grammarAccess.getMIntegerParamSWPSPSwitchRule()); } 
	 EOF 
;

// Rule MIntegerParamSWPSPSwitch
ruleMIntegerParamSWPSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getGroup()); }
(rule__MIntegerParamSWPSPSwitch__Group__0)
{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMIntegerParamSWPSPSwitchCase
entryRuleMIntegerParamSWPSPSwitchCase 
:
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseRule()); }
	 ruleMIntegerParamSWPSPSwitchCase
{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MIntegerParamSWPSPSwitchCase
ruleMIntegerParamSWPSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getGroup()); }
(rule__MIntegerParamSWPSPSwitchCase__Group__0)
{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMRealParamSWPSPSwitch
entryRuleMRealParamSWPSPSwitch 
:
{ before(grammarAccess.getMRealParamSWPSPSwitchRule()); }
	 ruleMRealParamSWPSPSwitch
{ after(grammarAccess.getMRealParamSWPSPSwitchRule()); } 
	 EOF 
;

// Rule MRealParamSWPSPSwitch
ruleMRealParamSWPSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getGroup()); }
(rule__MRealParamSWPSPSwitch__Group__0)
{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMRealParamSWPSPSwitchCase
entryRuleMRealParamSWPSPSwitchCase 
:
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseRule()); }
	 ruleMRealParamSWPSPSwitchCase
{ after(grammarAccess.getMRealParamSWPSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MRealParamSWPSPSwitchCase
ruleMRealParamSWPSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getGroup()); }
(rule__MRealParamSWPSPSwitchCase__Group__0)
{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParamSWPSPSwitch
entryRuleMEnumParamSWPSPSwitch 
:
{ before(grammarAccess.getMEnumParamSWPSPSwitchRule()); }
	 ruleMEnumParamSWPSPSwitch
{ after(grammarAccess.getMEnumParamSWPSPSwitchRule()); } 
	 EOF 
;

// Rule MEnumParamSWPSPSwitch
ruleMEnumParamSWPSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getGroup()); }
(rule__MEnumParamSWPSPSwitch__Group__0)
{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParamSWPSPSwitchCase
entryRuleMEnumParamSWPSPSwitchCase 
:
{ before(grammarAccess.getMEnumParamSWPSPSwitchCaseRule()); }
	 ruleMEnumParamSWPSPSwitchCase
{ after(grammarAccess.getMEnumParamSWPSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MEnumParamSWPSPSwitchCase
ruleMEnumParamSWPSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getGroup()); }
(rule__MEnumParamSWPSPSwitchCase__Group__0)
{ after(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getGroup()); }
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



rule__MMESPSWPPackageElement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSWPPackageElementAccess().getMDriverSwPackageParserRuleCall_0()); }
	ruleMDriverSwPackage
{ after(grammarAccess.getMMESPSWPPackageElementAccess().getMDriverSwPackageParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMMESPSWPPackageElementAccess().getMSwPackageParserRuleCall_1()); }
	ruleMSwPackage
{ after(grammarAccess.getMMESPSWPPackageElementAccess().getMSwPackageParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getMMESPSWPPackageElementAccess().getMAbstractSwPackageParserRuleCall_2()); }
	ruleMAbstractSwPackage
{ after(grammarAccess.getMMESPSWPPackageElementAccess().getMAbstractSwPackageParserRuleCall_2()); }
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

rule__MSwPackageProvidedInterfacePVA__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAAccess().getMSwPackageProvidedInterfacePVAExpressionParserRuleCall_0()); }
	ruleMSwPackageProvidedInterfacePVAExpression
{ after(grammarAccess.getMSwPackageProvidedInterfacePVAAccess().getMSwPackageProvidedInterfacePVAExpressionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAAccess().getMSwPackageProvidedInterfacePVASwitchParserRuleCall_1()); }
	ruleMSwPackageProvidedInterfacePVASwitch
{ after(grammarAccess.getMSwPackageProvidedInterfacePVAAccess().getMSwPackageProvidedInterfacePVASwitchParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Alternatives_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_0_2_0()); }

	'any' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_0_2_0()); }
)

    |(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiAssignment_5_0_2_1()); }
(rule__MDriverSwPackageSupportedPlatform__OsapiAssignment_5_0_2_1)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiAssignment_5_0_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Alternatives_5_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_1_2_0()); }

	'any' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_1_2_0()); }
)

    |(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsAssignment_5_1_2_1()); }
(rule__MDriverSwPackageSupportedPlatform__OsAssignment_5_1_2_1)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsAssignment_5_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Alternatives_5_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_2_2_0()); }

	'any' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_2_2_0()); }
)

    |(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1()); }
(rule__MDriverSwPackageSupportedPlatform__ArchitectureAssignment_5_2_2_1)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Alternatives_5_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_4_2_0()); }

	'any' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_4_2_0()); }
)

    |(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1()); }
(rule__MDriverSwPackageSupportedPlatform__MicroprocessorAssignment_5_4_2_1)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Alternatives_5_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_5_2_0()); }

	'any' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_5_2_0()); }
)

    |(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardAssignment_5_5_2_1()); }
(rule__MDriverSwPackageSupportedPlatform__BoardAssignment_5_5_2_1)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardAssignment_5_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Alternatives_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_0_2_0()); }

	'any' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_0_2_0()); }
)

    |(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiAssignment_5_0_2_1()); }
(rule__MSwPackageSupportedPlatform__OsapiAssignment_5_0_2_1)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiAssignment_5_0_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Alternatives_5_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_1_2_0()); }

	'any' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_1_2_0()); }
)

    |(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsAssignment_5_1_2_1()); }
(rule__MSwPackageSupportedPlatform__OsAssignment_5_1_2_1)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsAssignment_5_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Alternatives_5_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_2_2_0()); }

	'any' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_2_2_0()); }
)

    |(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1()); }
(rule__MSwPackageSupportedPlatform__ArchitectureAssignment_5_2_2_1)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Alternatives_5_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_4_2_0()); }

	'any' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_4_2_0()); }
)

    |(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1()); }
(rule__MSwPackageSupportedPlatform__MicroprocessorAssignment_5_4_2_1)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Alternatives_5_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_5_2_0()); }

	'any' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_5_2_0()); }
)

    |(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardAssignment_5_5_2_1()); }
(rule__MSwPackageSupportedPlatform__BoardAssignment_5_5_2_1)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardAssignment_5_5_2_1()); }
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

    |(
{ before(grammarAccess.getMParameterAccess().getMBooleanParamSWPSPSwitchParserRuleCall_6()); }
	ruleMBooleanParamSWPSPSwitch
{ after(grammarAccess.getMParameterAccess().getMBooleanParamSWPSPSwitchParserRuleCall_6()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMStringParamSWPSPSwitchParserRuleCall_7()); }
	ruleMStringParamSWPSPSwitch
{ after(grammarAccess.getMParameterAccess().getMStringParamSWPSPSwitchParserRuleCall_7()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMIntegerParamSWPSPSwitchParserRuleCall_8()); }
	ruleMIntegerParamSWPSPSwitch
{ after(grammarAccess.getMParameterAccess().getMIntegerParamSWPSPSwitchParserRuleCall_8()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMRealParamSWPSPSwitchParserRuleCall_9()); }
	ruleMRealParamSWPSPSwitch
{ after(grammarAccess.getMParameterAccess().getMRealParamSWPSPSwitchParserRuleCall_9()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMEnumParamSWPSPSwitchParserRuleCall_10()); }
	ruleMEnumParamSWPSPSwitch
{ after(grammarAccess.getMParameterAccess().getMEnumParamSWPSPSwitchParserRuleCall_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterWithoutSWPSP__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterWithoutSWPSPAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); }
	ruleMIntegerParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutSWPSPAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutSWPSPAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); }
	ruleMEnumParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutSWPSPAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutSWPSPAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); }
	ruleMBooleanParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutSWPSPAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutSWPSPAccess().getMRealParameterSingleExpressionParserRuleCall_3()); }
	ruleMRealParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutSWPSPAccess().getMRealParameterSingleExpressionParserRuleCall_3()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutSWPSPAccess().getMStringParameterSingleExpressionParserRuleCall_4()); }
	ruleMStringParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutSWPSPAccess().getMStringParameterSingleExpressionParserRuleCall_4()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutSWPSPAccess().getMEnumParameterDefinitionParserRuleCall_5()); }
	ruleMEnumParameterDefinition
{ after(grammarAccess.getMParameterWithoutSWPSPAccess().getMEnumParameterDefinitionParserRuleCall_5()); }
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



rule__MMESPSWPPackageFile__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPSWPPackageFile__Group__0__Impl
	rule__MMESPSWPPackageFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPSWPPackageFile__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getMMESPSWPPackageFileAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPSWPPackageFile__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPSWPPackageFile__Group__1__Impl
	rule__MMESPSWPPackageFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPSWPPackageFile__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getPackageAssignment_1()); }
(rule__MMESPSWPPackageFile__PackageAssignment_1)
{ after(grammarAccess.getMMESPSWPPackageFileAccess().getPackageAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPSWPPackageFile__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPSWPPackageFile__Group__2__Impl
	rule__MMESPSWPPackageFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPSWPPackageFile__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getMMESPSWPPackageFileAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPSWPPackageFile__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPSWPPackageFile__Group__3__Impl
	rule__MMESPSWPPackageFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPSWPPackageFile__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getGroup_3()); }
(rule__MMESPSWPPackageFile__Group_3__0)*
{ after(grammarAccess.getMMESPSWPPackageFileAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPSWPPackageFile__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPSWPPackageFile__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPSWPPackageFile__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getElementAssignment_4()); }
(rule__MMESPSWPPackageFile__ElementAssignment_4)
{ after(grammarAccess.getMMESPSWPPackageFileAccess().getElementAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMESPSWPPackageFile__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPSWPPackageFile__Group_3__0__Impl
	rule__MMESPSWPPackageFile__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPSWPPackageFile__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getImportKeyword_3_0()); }

	'import' 

{ after(grammarAccess.getMMESPSWPPackageFileAccess().getImportKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPSWPPackageFile__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPSWPPackageFile__Group_3__1__Impl
	rule__MMESPSWPPackageFile__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPSWPPackageFile__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getImportsAssignment_3_1()); }
(rule__MMESPSWPPackageFile__ImportsAssignment_3_1)
{ after(grammarAccess.getMMESPSWPPackageFileAccess().getImportsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPSWPPackageFile__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPSWPPackageFile__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPSWPPackageFile__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getMMESPSWPPackageFileAccess().getSemicolonKeyword_3_2()); }
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






rule__MAbstractSwPackage__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group__0__Impl
	rule__MAbstractSwPackage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getAbstractKeyword_0()); }

	'abstract' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getAbstractKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group__1__Impl
	rule__MAbstractSwPackage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getSwpackageKeyword_1()); }

	'swpackage' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getSwpackageKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group__2__Impl
	rule__MAbstractSwPackage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getNameAssignment_2()); }
(rule__MAbstractSwPackage__NameAssignment_2)
{ after(grammarAccess.getMAbstractSwPackageAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group__3__Impl
	rule__MAbstractSwPackage__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getGroup_3()); }
(rule__MAbstractSwPackage__Group_3__0)?
{ after(grammarAccess.getMAbstractSwPackageAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group__4__Impl
	rule__MAbstractSwPackage__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group__5__Impl
	rule__MAbstractSwPackage__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5()); }
(rule__MAbstractSwPackage__UnorderedGroup_5)
{ after(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group__6__Impl
	rule__MAbstractSwPackage__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MAbstractSwPackage__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_3__0__Impl
	rule__MAbstractSwPackage__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getInheritsKeyword_3_0()); }

	'inherits' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getInheritsKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_3__1__Impl
	rule__MAbstractSwPackage__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getInheritsAssignment_3_1()); }
(rule__MAbstractSwPackage__InheritsAssignment_3_1)
{ after(grammarAccess.getMAbstractSwPackageAccess().getInheritsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getGroup_3_2()); }
(rule__MAbstractSwPackage__Group_3_2__0)*
{ after(grammarAccess.getMAbstractSwPackageAccess().getGroup_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MAbstractSwPackage__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_3_2__0__Impl
	rule__MAbstractSwPackage__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getCommaKeyword_3_2_0()); }

	',' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getCommaKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getInheritsAssignment_3_2_1()); }
(rule__MAbstractSwPackage__InheritsAssignment_3_2_1)
{ after(grammarAccess.getMAbstractSwPackageAccess().getInheritsAssignment_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MAbstractSwPackage__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_0__0__Impl
	rule__MAbstractSwPackage__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getVersionKeyword_5_0_0()); }

	'version' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getVersionKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_0__1__Impl
	rule__MAbstractSwPackage__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_0__2__Impl
	rule__MAbstractSwPackage__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getVersionAssignment_5_0_2()); }
(rule__MAbstractSwPackage__VersionAssignment_5_0_2)
{ after(grammarAccess.getMAbstractSwPackageAccess().getVersionAssignment_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MAbstractSwPackage__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_1__0__Impl
	rule__MAbstractSwPackage__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getConfigurationKeyword_5_1_0()); }

	'configuration' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getConfigurationKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_1__1__Impl
	rule__MAbstractSwPackage__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getParametersKeyword_5_1_1()); }

	'parameters' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getParametersKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_1__2__Impl
	rule__MAbstractSwPackage__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getLeftCurlyBracketKeyword_5_1_2()); }

	'{' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getLeftCurlyBracketKeyword_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_1__3__Impl
	rule__MAbstractSwPackage__Group_5_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getParametersAssignment_5_1_3()); }
(rule__MAbstractSwPackage__ParametersAssignment_5_1_3)
{ after(grammarAccess.getMAbstractSwPackageAccess().getParametersAssignment_5_1_3()); }
)
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getParametersAssignment_5_1_3()); }
(rule__MAbstractSwPackage__ParametersAssignment_5_1_3)*
{ after(grammarAccess.getMAbstractSwPackageAccess().getParametersAssignment_5_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_1__4__Impl
	rule__MAbstractSwPackage__Group_5_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getRightCurlyBracketKeyword_5_1_4()); }

	'}' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getRightCurlyBracketKeyword_5_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_5_1_5()); }

	';' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_5_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MAbstractSwPackage__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_2__0__Impl
	rule__MAbstractSwPackage__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getProvidedKeyword_5_2_0()); }

	'provided' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getProvidedKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_2__1__Impl
	rule__MAbstractSwPackage__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getInterfacesKeyword_5_2_1()); }

	'interfaces' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getInterfacesKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_2__2__Impl
	rule__MAbstractSwPackage__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getLeftCurlyBracketKeyword_5_2_2()); }

	'{' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getLeftCurlyBracketKeyword_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_2__3__Impl
	rule__MAbstractSwPackage__Group_5_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getProvidesAssignment_5_2_3()); }
(rule__MAbstractSwPackage__ProvidesAssignment_5_2_3)
{ after(grammarAccess.getMAbstractSwPackageAccess().getProvidesAssignment_5_2_3()); }
)
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getProvidesAssignment_5_2_3()); }
(rule__MAbstractSwPackage__ProvidesAssignment_5_2_3)*
{ after(grammarAccess.getMAbstractSwPackageAccess().getProvidesAssignment_5_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_2__4__Impl
	rule__MAbstractSwPackage__Group_5_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getRightCurlyBracketKeyword_5_2_4()); }

	'}' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getRightCurlyBracketKeyword_5_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__Group_5_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__Group_5_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__Group_5_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_5_2_5()); }

	';' 

{ after(grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_5_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MSwPackageProvidedInterface__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterface__Group__0__Impl
	rule__MSwPackageProvidedInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterface__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfaceAccess().getProvidesKeyword_0()); }

	'provides' 

{ after(grammarAccess.getMSwPackageProvidedInterfaceAccess().getProvidesKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterface__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterface__Group__1__Impl
	rule__MSwPackageProvidedInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterface__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfaceAccess().getSwinterfaceAssignment_1()); }
(rule__MSwPackageProvidedInterface__SwinterfaceAssignment_1)
{ after(grammarAccess.getMSwPackageProvidedInterfaceAccess().getSwinterfaceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterface__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterface__Group__2__Impl
	rule__MSwPackageProvidedInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterface__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfaceAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMSwPackageProvidedInterfaceAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterface__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterface__Group__3__Impl
	rule__MSwPackageProvidedInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterface__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfaceAccess().getParameterValueAssignmentsAssignment_3()); }
(rule__MSwPackageProvidedInterface__ParameterValueAssignmentsAssignment_3)*
{ after(grammarAccess.getMSwPackageProvidedInterfaceAccess().getParameterValueAssignmentsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterface__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterface__Group__4__Impl
	rule__MSwPackageProvidedInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterface__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfaceAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMSwPackageProvidedInterfaceAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterface__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterface__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterface__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfaceAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMSwPackageProvidedInterfaceAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MSwPackageProvidedInterfacePVAExpression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVAExpression__Group__0__Impl
	rule__MSwPackageProvidedInterfacePVAExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVAExpression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterKeyword_0()); }

	'parameter' 

{ after(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVAExpression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVAExpression__Group__1__Impl
	rule__MSwPackageProvidedInterfacePVAExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVAExpression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterAssignment_1()); }
(rule__MSwPackageProvidedInterfacePVAExpression__ParameterAssignment_1)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVAExpression__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVAExpression__Group__2__Impl
	rule__MSwPackageProvidedInterfacePVAExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVAExpression__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getColonEqualsSignKeyword_2()); }

	':=' 

{ after(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getColonEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVAExpression__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVAExpression__Group__3__Impl
	rule__MSwPackageProvidedInterfacePVAExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVAExpression__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterValueAssignment_3()); }
(rule__MSwPackageProvidedInterfacePVAExpression__ParameterValueAssignment_3)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVAExpression__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVAExpression__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVAExpression__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MSwPackageProvidedInterfacePVASwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitch__Group__0__Impl
	rule__MSwPackageProvidedInterfacePVASwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterKeyword_0()); }

	'parameter' 

{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVASwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitch__Group__1__Impl
	rule__MSwPackageProvidedInterfacePVASwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterAssignment_1()); }
(rule__MSwPackageProvidedInterfacePVASwitch__ParameterAssignment_1)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVASwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitch__Group__2__Impl
	rule__MSwPackageProvidedInterfacePVASwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getColonEqualsSignKeyword_2()); }

	':=' 

{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getColonEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVASwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitch__Group__3__Impl
	rule__MSwPackageProvidedInterfacePVASwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getSwitchKeyword_3()); }

	'switch' 

{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getSwitchKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVASwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitch__Group__4__Impl
	rule__MSwPackageProvidedInterfacePVASwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVASwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitch__Group__5__Impl
	rule__MSwPackageProvidedInterfacePVASwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getCasesAssignment_5()); }
(rule__MSwPackageProvidedInterfacePVASwitch__CasesAssignment_5)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getCasesAssignment_5()); }
)
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getCasesAssignment_5()); }
(rule__MSwPackageProvidedInterfacePVASwitch__CasesAssignment_5)*
{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getCasesAssignment_5()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVASwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitch__Group__6__Impl
	rule__MSwPackageProvidedInterfacePVASwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVASwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitch__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MSwPackageProvidedInterfacePVASwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitchCase__Group__0__Impl
	rule__MSwPackageProvidedInterfacePVASwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVASwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitchCase__Group__1__Impl
	rule__MSwPackageProvidedInterfacePVASwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MSwPackageProvidedInterfacePVASwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVASwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitchCase__Group__2__Impl
	rule__MSwPackageProvidedInterfacePVASwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVASwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitchCase__Group__3__Impl
	rule__MSwPackageProvidedInterfacePVASwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getParameterValueAssignment_3()); }
(rule__MSwPackageProvidedInterfacePVASwitchCase__ParameterValueAssignment_3)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getParameterValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageProvidedInterfacePVASwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageProvidedInterfacePVASwitchCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getSemicolonKeyword_4()); }
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














rule__MSwPackage__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group__0__Impl
	rule__MSwPackage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getSwpackageKeyword_0()); }

	'swpackage' 

{ after(grammarAccess.getMSwPackageAccess().getSwpackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group__1__Impl
	rule__MSwPackage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getNameAssignment_1()); }
(rule__MSwPackage__NameAssignment_1)
{ after(grammarAccess.getMSwPackageAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group__2__Impl
	rule__MSwPackage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getGroup_2()); }
(rule__MSwPackage__Group_2__0)?
{ after(grammarAccess.getMSwPackageAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group__3__Impl
	rule__MSwPackage__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getGroup_3()); }
(rule__MSwPackage__Group_3__0)?
{ after(grammarAccess.getMSwPackageAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group__4__Impl
	rule__MSwPackage__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group__5__Impl
	rule__MSwPackage__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5()); }
(rule__MSwPackage__UnorderedGroup_5)
{ after(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group__6__Impl
	rule__MSwPackage__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MSwPackage__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_2__0__Impl
	rule__MSwPackage__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getInheritsKeyword_2_0()); }

	'inherits' 

{ after(grammarAccess.getMSwPackageAccess().getInheritsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_2__1__Impl
	rule__MSwPackage__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getInheritsAssignment_2_1()); }
(rule__MSwPackage__InheritsAssignment_2_1)
{ after(grammarAccess.getMSwPackageAccess().getInheritsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getGroup_2_2()); }
(rule__MSwPackage__Group_2_2__0)*
{ after(grammarAccess.getMSwPackageAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MSwPackage__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_2_2__0__Impl
	rule__MSwPackage__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getMSwPackageAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getInheritsAssignment_2_2_1()); }
(rule__MSwPackage__InheritsAssignment_2_2_1)
{ after(grammarAccess.getMSwPackageAccess().getInheritsAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MSwPackage__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_3__0__Impl
	rule__MSwPackage__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getExtendsKeyword_3_0()); }

	'extends' 

{ after(grammarAccess.getMSwPackageAccess().getExtendsKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_3__1__Impl
	rule__MSwPackage__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getExtendsAssignment_3_1()); }
(rule__MSwPackage__ExtendsAssignment_3_1)
{ after(grammarAccess.getMSwPackageAccess().getExtendsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getGroup_3_2()); }
(rule__MSwPackage__Group_3_2__0)*
{ after(grammarAccess.getMSwPackageAccess().getGroup_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MSwPackage__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_3_2__0__Impl
	rule__MSwPackage__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getCommaKeyword_3_2_0()); }

	',' 

{ after(grammarAccess.getMSwPackageAccess().getCommaKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getExtendsAssignment_3_2_1()); }
(rule__MSwPackage__ExtendsAssignment_3_2_1)
{ after(grammarAccess.getMSwPackageAccess().getExtendsAssignment_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MSwPackage__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_0__0__Impl
	rule__MSwPackage__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getVersionKeyword_5_0_0()); }

	'version' 

{ after(grammarAccess.getMSwPackageAccess().getVersionKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_0__1__Impl
	rule__MSwPackage__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getMSwPackageAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_0__2__Impl
	rule__MSwPackage__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getVersionAssignment_5_0_2()); }
(rule__MSwPackage__VersionAssignment_5_0_2)
{ after(grammarAccess.getMSwPackageAccess().getVersionAssignment_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MSwPackage__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_1__0__Impl
	rule__MSwPackage__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getLanguagesKeyword_5_1_0()); }

	'languages' 

{ after(grammarAccess.getMSwPackageAccess().getLanguagesKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_1__1__Impl
	rule__MSwPackage__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getColonEqualsSignKeyword_5_1_1()); }

	':=' 

{ after(grammarAccess.getMSwPackageAccess().getColonEqualsSignKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_1__2__Impl
	rule__MSwPackage__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getLanguagesAssignment_5_1_2()); }
(rule__MSwPackage__LanguagesAssignment_5_1_2)
{ after(grammarAccess.getMSwPackageAccess().getLanguagesAssignment_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_1__3__Impl
	rule__MSwPackage__Group_5_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getGroup_5_1_3()); }
(rule__MSwPackage__Group_5_1_3__0)*
{ after(grammarAccess.getMSwPackageAccess().getGroup_5_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_1_4()); }

	';' 

{ after(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MSwPackage__Group_5_1_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_1_3__0__Impl
	rule__MSwPackage__Group_5_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_1_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getCommaKeyword_5_1_3_0()); }

	',' 

{ after(grammarAccess.getMSwPackageAccess().getCommaKeyword_5_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_1_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_1_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getLanguagesAssignment_5_1_3_1()); }
(rule__MSwPackage__LanguagesAssignment_5_1_3_1)
{ after(grammarAccess.getMSwPackageAccess().getLanguagesAssignment_5_1_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MSwPackage__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_2__0__Impl
	rule__MSwPackage__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getConstructionKeyword_5_2_0()); }

	'construction' 

{ after(grammarAccess.getMSwPackageAccess().getConstructionKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_2__1__Impl
	rule__MSwPackage__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getToolsKeyword_5_2_1()); }

	'tools' 

{ after(grammarAccess.getMSwPackageAccess().getToolsKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_2__2__Impl
	rule__MSwPackage__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getColonEqualsSignKeyword_5_2_2()); }

	':=' 

{ after(grammarAccess.getMSwPackageAccess().getColonEqualsSignKeyword_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_2__3__Impl
	rule__MSwPackage__Group_5_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getCtoolsAssignment_5_2_3()); }
(rule__MSwPackage__CtoolsAssignment_5_2_3)
{ after(grammarAccess.getMSwPackageAccess().getCtoolsAssignment_5_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_2__4__Impl
	rule__MSwPackage__Group_5_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getGroup_5_2_4()); }
(rule__MSwPackage__Group_5_2_4__0)*
{ after(grammarAccess.getMSwPackageAccess().getGroup_5_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_2_5()); }

	';' 

{ after(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MSwPackage__Group_5_2_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_2_4__0__Impl
	rule__MSwPackage__Group_5_2_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_2_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getCommaKeyword_5_2_4_0()); }

	',' 

{ after(grammarAccess.getMSwPackageAccess().getCommaKeyword_5_2_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_2_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_2_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_2_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getCtoolsAssignment_5_2_4_1()); }
(rule__MSwPackage__CtoolsAssignment_5_2_4_1)
{ after(grammarAccess.getMSwPackageAccess().getCtoolsAssignment_5_2_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MSwPackage__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_3__0__Impl
	rule__MSwPackage__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getConfigurationKeyword_5_3_0()); }

	'configuration' 

{ after(grammarAccess.getMSwPackageAccess().getConfigurationKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_3__1__Impl
	rule__MSwPackage__Group_5_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getParametersKeyword_5_3_1()); }

	'parameters' 

{ after(grammarAccess.getMSwPackageAccess().getParametersKeyword_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_3__2__Impl
	rule__MSwPackage__Group_5_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_3_2()); }

	'{' 

{ after(grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_3__3__Impl
	rule__MSwPackage__Group_5_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMSwPackageAccess().getParametersAssignment_5_3_3()); }
(rule__MSwPackage__ParametersAssignment_5_3_3)
{ after(grammarAccess.getMSwPackageAccess().getParametersAssignment_5_3_3()); }
)
(
{ before(grammarAccess.getMSwPackageAccess().getParametersAssignment_5_3_3()); }
(rule__MSwPackage__ParametersAssignment_5_3_3)*
{ after(grammarAccess.getMSwPackageAccess().getParametersAssignment_5_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_3__4__Impl
	rule__MSwPackage__Group_5_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_3_4()); }

	'}' 

{ after(grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_3_5()); }

	';' 

{ after(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MSwPackage__Group_5_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_4__0__Impl
	rule__MSwPackage__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getProvidedKeyword_5_4_0()); }

	'provided' 

{ after(grammarAccess.getMSwPackageAccess().getProvidedKeyword_5_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_4__1__Impl
	rule__MSwPackage__Group_5_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getInterfacesKeyword_5_4_1()); }

	'interfaces' 

{ after(grammarAccess.getMSwPackageAccess().getInterfacesKeyword_5_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_4__2__Impl
	rule__MSwPackage__Group_5_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_4_2()); }

	'{' 

{ after(grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_4__3__Impl
	rule__MSwPackage__Group_5_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMSwPackageAccess().getProvidesAssignment_5_4_3()); }
(rule__MSwPackage__ProvidesAssignment_5_4_3)
{ after(grammarAccess.getMSwPackageAccess().getProvidesAssignment_5_4_3()); }
)
(
{ before(grammarAccess.getMSwPackageAccess().getProvidesAssignment_5_4_3()); }
(rule__MSwPackage__ProvidesAssignment_5_4_3)*
{ after(grammarAccess.getMSwPackageAccess().getProvidesAssignment_5_4_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_4__4__Impl
	rule__MSwPackage__Group_5_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_4_4()); }

	'}' 

{ after(grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_4__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_4__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_4__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_4_5()); }

	';' 

{ after(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_4_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MSwPackage__Group_5_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_5__0__Impl
	rule__MSwPackage__Group_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getRequiredKeyword_5_5_0()); }

	'required' 

{ after(grammarAccess.getMSwPackageAccess().getRequiredKeyword_5_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_5__1__Impl
	rule__MSwPackage__Group_5_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getInterfacesKeyword_5_5_1()); }

	'interfaces' 

{ after(grammarAccess.getMSwPackageAccess().getInterfacesKeyword_5_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_5__2__Impl
	rule__MSwPackage__Group_5_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_5_2()); }

	'{' 

{ after(grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_5__3__Impl
	rule__MSwPackage__Group_5_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMSwPackageAccess().getRequiresAssignment_5_5_3()); }
(rule__MSwPackage__RequiresAssignment_5_5_3)
{ after(grammarAccess.getMSwPackageAccess().getRequiresAssignment_5_5_3()); }
)
(
{ before(grammarAccess.getMSwPackageAccess().getRequiresAssignment_5_5_3()); }
(rule__MSwPackage__RequiresAssignment_5_5_3)*
{ after(grammarAccess.getMSwPackageAccess().getRequiresAssignment_5_5_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_5__4__Impl
	rule__MSwPackage__Group_5_5__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_5__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_5_4()); }

	'}' 

{ after(grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_5_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_5__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_5__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_5_5()); }

	';' 

{ after(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_5_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MSwPackage__Group_5_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_6__0__Impl
	rule__MSwPackage__Group_5_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getSupportedKeyword_5_6_0()); }

	'supported' 

{ after(grammarAccess.getMSwPackageAccess().getSupportedKeyword_5_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_6__1__Impl
	rule__MSwPackage__Group_5_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getPlatformsKeyword_5_6_1()); }

	'platforms' 

{ after(grammarAccess.getMSwPackageAccess().getPlatformsKeyword_5_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_6__2__Impl
	rule__MSwPackage__Group_5_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_6_2()); }

	'{' 

{ after(grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_6__3__Impl
	rule__MSwPackage__Group_5_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMSwPackageAccess().getSupportedPlatformsAssignment_5_6_3()); }
(rule__MSwPackage__SupportedPlatformsAssignment_5_6_3)
{ after(grammarAccess.getMSwPackageAccess().getSupportedPlatformsAssignment_5_6_3()); }
)
(
{ before(grammarAccess.getMSwPackageAccess().getSupportedPlatformsAssignment_5_6_3()); }
(rule__MSwPackage__SupportedPlatformsAssignment_5_6_3)*
{ after(grammarAccess.getMSwPackageAccess().getSupportedPlatformsAssignment_5_6_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_6__4__Impl
	rule__MSwPackage__Group_5_6__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_6_4()); }

	'}' 

{ after(grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__Group_5_6__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__Group_5_6__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__Group_5_6__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_6_5()); }

	';' 

{ after(grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_6_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverSwPackage__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group__0__Impl
	rule__MDriverSwPackage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getDriverKeyword_0()); }

	'driver' 

{ after(grammarAccess.getMDriverSwPackageAccess().getDriverKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group__1__Impl
	rule__MDriverSwPackage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getNameAssignment_1()); }
(rule__MDriverSwPackage__NameAssignment_1)
{ after(grammarAccess.getMDriverSwPackageAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group__2__Impl
	rule__MDriverSwPackage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_2()); }
(rule__MDriverSwPackage__Group_2__0)?
{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group__3__Impl
	rule__MDriverSwPackage__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_3()); }
(rule__MDriverSwPackage__Group_3__0)?
{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group__4__Impl
	rule__MDriverSwPackage__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group__5__Impl
	rule__MDriverSwPackage__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5()); }
(rule__MDriverSwPackage__UnorderedGroup_5)
{ after(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group__6__Impl
	rule__MDriverSwPackage__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MDriverSwPackage__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_2__0__Impl
	rule__MDriverSwPackage__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getInheritsKeyword_2_0()); }

	'inherits' 

{ after(grammarAccess.getMDriverSwPackageAccess().getInheritsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_2__1__Impl
	rule__MDriverSwPackage__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getInheritsAssignment_2_1()); }
(rule__MDriverSwPackage__InheritsAssignment_2_1)
{ after(grammarAccess.getMDriverSwPackageAccess().getInheritsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_2_2()); }
(rule__MDriverSwPackage__Group_2_2__0)*
{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MDriverSwPackage__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_2_2__0__Impl
	rule__MDriverSwPackage__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getInheritsAssignment_2_2_1()); }
(rule__MDriverSwPackage__InheritsAssignment_2_2_1)
{ after(grammarAccess.getMDriverSwPackageAccess().getInheritsAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDriverSwPackage__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_3__0__Impl
	rule__MDriverSwPackage__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getExtendsKeyword_3_0()); }

	'extends' 

{ after(grammarAccess.getMDriverSwPackageAccess().getExtendsKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_3__1__Impl
	rule__MDriverSwPackage__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getExtendsAssignment_3_1()); }
(rule__MDriverSwPackage__ExtendsAssignment_3_1)
{ after(grammarAccess.getMDriverSwPackageAccess().getExtendsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_3_2()); }
(rule__MDriverSwPackage__Group_3_2__0)*
{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MDriverSwPackage__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_3_2__0__Impl
	rule__MDriverSwPackage__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_3_2_0()); }

	',' 

{ after(grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getExtendsAssignment_3_2_1()); }
(rule__MDriverSwPackage__ExtendsAssignment_3_2_1)
{ after(grammarAccess.getMDriverSwPackageAccess().getExtendsAssignment_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDriverSwPackage__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_0__0__Impl
	rule__MDriverSwPackage__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getVersionKeyword_5_0_0()); }

	'version' 

{ after(grammarAccess.getMDriverSwPackageAccess().getVersionKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_0__1__Impl
	rule__MDriverSwPackage__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getMDriverSwPackageAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_0__2__Impl
	rule__MDriverSwPackage__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getVersionAssignment_5_0_2()); }
(rule__MDriverSwPackage__VersionAssignment_5_0_2)
{ after(grammarAccess.getMDriverSwPackageAccess().getVersionAssignment_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSwPackage__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_1__0__Impl
	rule__MDriverSwPackage__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getLanguagesKeyword_5_1_0()); }

	'languages' 

{ after(grammarAccess.getMDriverSwPackageAccess().getLanguagesKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_1__1__Impl
	rule__MDriverSwPackage__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getColonEqualsSignKeyword_5_1_1()); }

	':=' 

{ after(grammarAccess.getMDriverSwPackageAccess().getColonEqualsSignKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_1__2__Impl
	rule__MDriverSwPackage__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getLanguagesAssignment_5_1_2()); }
(rule__MDriverSwPackage__LanguagesAssignment_5_1_2)
{ after(grammarAccess.getMDriverSwPackageAccess().getLanguagesAssignment_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_1__3__Impl
	rule__MDriverSwPackage__Group_5_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_5_1_3()); }
(rule__MDriverSwPackage__Group_5_1_3__0)*
{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_5_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_1_4()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MDriverSwPackage__Group_5_1_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_1_3__0__Impl
	rule__MDriverSwPackage__Group_5_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_1_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_5_1_3_0()); }

	',' 

{ after(grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_5_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_1_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_1_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getLanguagesAssignment_5_1_3_1()); }
(rule__MDriverSwPackage__LanguagesAssignment_5_1_3_1)
{ after(grammarAccess.getMDriverSwPackageAccess().getLanguagesAssignment_5_1_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDriverSwPackage__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_2__0__Impl
	rule__MDriverSwPackage__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getConstructionKeyword_5_2_0()); }

	'construction' 

{ after(grammarAccess.getMDriverSwPackageAccess().getConstructionKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_2__1__Impl
	rule__MDriverSwPackage__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getToolsKeyword_5_2_1()); }

	'tools' 

{ after(grammarAccess.getMDriverSwPackageAccess().getToolsKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_2__2__Impl
	rule__MDriverSwPackage__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getColonEqualsSignKeyword_5_2_2()); }

	':=' 

{ after(grammarAccess.getMDriverSwPackageAccess().getColonEqualsSignKeyword_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_2__3__Impl
	rule__MDriverSwPackage__Group_5_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getCtoolsAssignment_5_2_3()); }
(rule__MDriverSwPackage__CtoolsAssignment_5_2_3)
{ after(grammarAccess.getMDriverSwPackageAccess().getCtoolsAssignment_5_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_2__4__Impl
	rule__MDriverSwPackage__Group_5_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_5_2_4()); }
(rule__MDriverSwPackage__Group_5_2_4__0)*
{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_5_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_2_5()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverSwPackage__Group_5_2_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_2_4__0__Impl
	rule__MDriverSwPackage__Group_5_2_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_2_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_5_2_4_0()); }

	',' 

{ after(grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_5_2_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_2_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_2_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_2_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getCtoolsAssignment_5_2_4_1()); }
(rule__MDriverSwPackage__CtoolsAssignment_5_2_4_1)
{ after(grammarAccess.getMDriverSwPackageAccess().getCtoolsAssignment_5_2_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDriverSwPackage__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_3__0__Impl
	rule__MDriverSwPackage__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getConfigurationKeyword_5_3_0()); }

	'configuration' 

{ after(grammarAccess.getMDriverSwPackageAccess().getConfigurationKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_3__1__Impl
	rule__MDriverSwPackage__Group_5_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getParametersKeyword_5_3_1()); }

	'parameters' 

{ after(grammarAccess.getMDriverSwPackageAccess().getParametersKeyword_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_3__2__Impl
	rule__MDriverSwPackage__Group_5_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_3_2()); }

	'{' 

{ after(grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_3__3__Impl
	rule__MDriverSwPackage__Group_5_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverSwPackageAccess().getParametersAssignment_5_3_3()); }
(rule__MDriverSwPackage__ParametersAssignment_5_3_3)
{ after(grammarAccess.getMDriverSwPackageAccess().getParametersAssignment_5_3_3()); }
)
(
{ before(grammarAccess.getMDriverSwPackageAccess().getParametersAssignment_5_3_3()); }
(rule__MDriverSwPackage__ParametersAssignment_5_3_3)*
{ after(grammarAccess.getMDriverSwPackageAccess().getParametersAssignment_5_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_3__4__Impl
	rule__MDriverSwPackage__Group_5_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_3_4()); }

	'}' 

{ after(grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_3_5()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverSwPackage__Group_5_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_4__0__Impl
	rule__MDriverSwPackage__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getProvidedKeyword_5_4_0()); }

	'provided' 

{ after(grammarAccess.getMDriverSwPackageAccess().getProvidedKeyword_5_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_4__1__Impl
	rule__MDriverSwPackage__Group_5_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getInterfacesKeyword_5_4_1()); }

	'interfaces' 

{ after(grammarAccess.getMDriverSwPackageAccess().getInterfacesKeyword_5_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_4__2__Impl
	rule__MDriverSwPackage__Group_5_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_4_2()); }

	'{' 

{ after(grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_4__3__Impl
	rule__MDriverSwPackage__Group_5_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverSwPackageAccess().getProvidesAssignment_5_4_3()); }
(rule__MDriverSwPackage__ProvidesAssignment_5_4_3)
{ after(grammarAccess.getMDriverSwPackageAccess().getProvidesAssignment_5_4_3()); }
)
(
{ before(grammarAccess.getMDriverSwPackageAccess().getProvidesAssignment_5_4_3()); }
(rule__MDriverSwPackage__ProvidesAssignment_5_4_3)*
{ after(grammarAccess.getMDriverSwPackageAccess().getProvidesAssignment_5_4_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_4__4__Impl
	rule__MDriverSwPackage__Group_5_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_4_4()); }

	'}' 

{ after(grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_4__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_4__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_4__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_4_5()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_4_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverSwPackage__Group_5_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_5__0__Impl
	rule__MDriverSwPackage__Group_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getRequiredKeyword_5_5_0()); }

	'required' 

{ after(grammarAccess.getMDriverSwPackageAccess().getRequiredKeyword_5_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_5__1__Impl
	rule__MDriverSwPackage__Group_5_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getInterfacesKeyword_5_5_1()); }

	'interfaces' 

{ after(grammarAccess.getMDriverSwPackageAccess().getInterfacesKeyword_5_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_5__2__Impl
	rule__MDriverSwPackage__Group_5_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_5_2()); }

	'{' 

{ after(grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_5__3__Impl
	rule__MDriverSwPackage__Group_5_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverSwPackageAccess().getRequiresAssignment_5_5_3()); }
(rule__MDriverSwPackage__RequiresAssignment_5_5_3)
{ after(grammarAccess.getMDriverSwPackageAccess().getRequiresAssignment_5_5_3()); }
)
(
{ before(grammarAccess.getMDriverSwPackageAccess().getRequiresAssignment_5_5_3()); }
(rule__MDriverSwPackage__RequiresAssignment_5_5_3)*
{ after(grammarAccess.getMDriverSwPackageAccess().getRequiresAssignment_5_5_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_5__4__Impl
	rule__MDriverSwPackage__Group_5_5__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_5__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_5_4()); }

	'}' 

{ after(grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_5_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_5__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_5__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_5_5()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_5_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverSwPackage__Group_5_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_6__0__Impl
	rule__MDriverSwPackage__Group_5_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getSupportedKeyword_5_6_0()); }

	'supported' 

{ after(grammarAccess.getMDriverSwPackageAccess().getSupportedKeyword_5_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_6__1__Impl
	rule__MDriverSwPackage__Group_5_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getPlatformsKeyword_5_6_1()); }

	'platforms' 

{ after(grammarAccess.getMDriverSwPackageAccess().getPlatformsKeyword_5_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_6__2__Impl
	rule__MDriverSwPackage__Group_5_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_6_2()); }

	'{' 

{ after(grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_6__3__Impl
	rule__MDriverSwPackage__Group_5_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverSwPackageAccess().getSupportedPlatformsAssignment_5_6_3()); }
(rule__MDriverSwPackage__SupportedPlatformsAssignment_5_6_3)
{ after(grammarAccess.getMDriverSwPackageAccess().getSupportedPlatformsAssignment_5_6_3()); }
)
(
{ before(grammarAccess.getMDriverSwPackageAccess().getSupportedPlatformsAssignment_5_6_3()); }
(rule__MDriverSwPackage__SupportedPlatformsAssignment_5_6_3)*
{ after(grammarAccess.getMDriverSwPackageAccess().getSupportedPlatformsAssignment_5_6_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_6__4__Impl
	rule__MDriverSwPackage__Group_5_6__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_6_4()); }

	'}' 

{ after(grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__Group_5_6__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__Group_5_6__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__Group_5_6__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_6_5()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_6_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverSwPackageSupportedPlatform__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group__0__Impl
	rule__MDriverSwPackageSupportedPlatform__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMDriverSwPackageSupportedPlatformAction_0()); }
(

)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMDriverSwPackageSupportedPlatformAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group__1__Impl
	rule__MDriverSwPackageSupportedPlatform__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedKeyword_1()); }

	'supported' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group__2__Impl
	rule__MDriverSwPackageSupportedPlatform__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getPlatformKeyword_2()); }

	'platform' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getPlatformKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group__3__Impl
	rule__MDriverSwPackageSupportedPlatform__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getNameAssignment_3()); }
(rule__MDriverSwPackageSupportedPlatform__NameAssignment_3)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group__4__Impl
	rule__MDriverSwPackageSupportedPlatform__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group__5__Impl
	rule__MDriverSwPackageSupportedPlatform__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5()); }
(rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group__6__Impl
	rule__MDriverSwPackageSupportedPlatform__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MDriverSwPackageSupportedPlatform__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_0__0__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiKeyword_5_0_0()); }

	'osapi' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_0__1__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_0__2__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_0_2()); }
(rule__MDriverSwPackageSupportedPlatform__Alternatives_5_0_2)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSwPackageSupportedPlatform__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_1__0__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsKeyword_5_1_0()); }

	'os' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_1__1__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1()); }

	':=' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_1__2__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_1_2()); }
(rule__MDriverSwPackageSupportedPlatform__Alternatives_5_1_2)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_1_3()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSwPackageSupportedPlatform__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_2__0__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureKeyword_5_2_0()); }

	'architecture' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_2__1__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1()); }

	':=' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_2__2__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_2_2()); }
(rule__MDriverSwPackageSupportedPlatform__Alternatives_5_2_2)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_2_3()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSwPackageSupportedPlatform__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_3__0__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerKeyword_5_3_0()); }

	'compiler' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_3__1__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1()); }

	':=' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_3__2__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerAssignment_5_3_2()); }
(rule__MDriverSwPackageSupportedPlatform__CompilerAssignment_5_3_2)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerAssignment_5_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_3_3()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSwPackageSupportedPlatform__Group_5_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_4__0__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0()); }

	'microprocessor' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_4__1__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1()); }

	':=' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_4__2__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_4_2()); }
(rule__MDriverSwPackageSupportedPlatform__Alternatives_5_4_2)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_4_3()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSwPackageSupportedPlatform__Group_5_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_5__0__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardKeyword_5_5_0()); }

	'board' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardKeyword_5_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_5__1__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1()); }

	':=' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_5__2__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_5_2()); }
(rule__MDriverSwPackageSupportedPlatform__Alternatives_5_5_2)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_5_3()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSwPackageSupportedPlatform__Group_5_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_6__0__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesKeyword_5_6_0()); }

	'languages' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesKeyword_5_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_6__1__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1()); }

	':=' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_6__2__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_2()); }
(rule__MDriverSwPackageSupportedPlatform__LanguagesAssignment_5_6_2)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_6__3__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_6_3()); }
(rule__MDriverSwPackageSupportedPlatform__Group_5_6_3__0)*
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_6_4()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MDriverSwPackageSupportedPlatform__Group_5_6_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_6_3__0__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_6_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCommaKeyword_5_6_3_0()); }

	',' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCommaKeyword_5_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_6_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_6_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_6_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_3_1()); }
(rule__MDriverSwPackageSupportedPlatform__LanguagesAssignment_5_6_3_1)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDriverSwPackageSupportedPlatform__Group_5_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_7__0__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getConfigurationKeyword_5_7_0()); }

	'configuration' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getConfigurationKeyword_5_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_7__1__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersKeyword_5_7_1()); }

	'parameters' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersKeyword_5_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_7__2__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2()); }

	'{' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_7__3__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_7__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersAssignment_5_7_3()); }
(rule__MDriverSwPackageSupportedPlatform__ParametersAssignment_5_7_3)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersAssignment_5_7_3()); }
)
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersAssignment_5_7_3()); }
(rule__MDriverSwPackageSupportedPlatform__ParametersAssignment_5_7_3)*
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersAssignment_5_7_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_7__4__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_7__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_7__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4()); }

	'}' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_7__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_7__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_7__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_7_5()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_7_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverSwPackageSupportedPlatform__Group_5_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_8__0__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiredKeyword_5_8_0()); }

	'required' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiredKeyword_5_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_8__1__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getInterfacesKeyword_5_8_1()); }

	'interfaces' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getInterfacesKeyword_5_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_8__2__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_2()); }

	'{' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_8__3__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_8__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiresAssignment_5_8_3()); }
(rule__MDriverSwPackageSupportedPlatform__RequiresAssignment_5_8_3)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiresAssignment_5_8_3()); }
)
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiresAssignment_5_8_3()); }
(rule__MDriverSwPackageSupportedPlatform__RequiresAssignment_5_8_3)*
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiresAssignment_5_8_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_8__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_8__4__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_8__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_8__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_4()); }

	'}' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_8__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_8__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_8__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_8_5()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_8_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverSwPackageSupportedPlatform__Group_5_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_9__0__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedKeyword_5_9_0()); }

	'supported' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedKeyword_5_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_9__1__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getDevicesKeyword_5_9_1()); }

	'devices' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getDevicesKeyword_5_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_9__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_9__2__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_9__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_9_2()); }

	'{' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_9_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_9__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_9__3__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_9__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedDevicesAssignment_5_9_3()); }
(rule__MDriverSwPackageSupportedPlatform__SupportedDevicesAssignment_5_9_3)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedDevicesAssignment_5_9_3()); }
)
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedDevicesAssignment_5_9_3()); }
(rule__MDriverSwPackageSupportedPlatform__SupportedDevicesAssignment_5_9_3)*
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedDevicesAssignment_5_9_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_9__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_9__4__Impl
	rule__MDriverSwPackageSupportedPlatform__Group_5_9__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_9__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_9_4()); }

	'}' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_9_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__Group_5_9__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__Group_5_9__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__Group_5_9__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_9_5()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_9_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverSwPackageSupportedDevice__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedDevice__Group__0__Impl
	rule__MDriverSwPackageSupportedDevice__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceKeyword_0()); }

	'device' 

{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedDevice__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedDevice__Group__1__Impl
	rule__MDriverSwPackageSupportedDevice__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceAssignment_1()); }
(rule__MDriverSwPackageSupportedDevice__DeviceAssignment_1)
{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedDevice__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedDevice__Group__2__Impl
	rule__MDriverSwPackageSupportedDevice__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getNameAssignment_2()); }
(rule__MDriverSwPackageSupportedDevice__NameAssignment_2)
{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedDevice__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedDevice__Group__3__Impl
	rule__MDriverSwPackageSupportedDevice__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedDevice__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedDevice__Group__4__Impl
	rule__MDriverSwPackageSupportedDevice__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getGroup_4()); }
(rule__MDriverSwPackageSupportedDevice__Group_4__0)?
{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedDevice__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedDevice__Group__5__Impl
	rule__MDriverSwPackageSupportedDevice__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedDevice__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedDevice__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MDriverSwPackageSupportedDevice__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedDevice__Group_4__0__Impl
	rule__MDriverSwPackageSupportedDevice__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRequiredKeyword_4_0()); }

	'required' 

{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRequiredKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedDevice__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedDevice__Group_4__1__Impl
	rule__MDriverSwPackageSupportedDevice__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getColonEqualsSignKeyword_4_1()); }

	':=' 

{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getColonEqualsSignKeyword_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedDevice__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedDevice__Group_4__2__Impl
	rule__MDriverSwPackageSupportedDevice__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRequiredAssignment_4_2()); }
(rule__MDriverSwPackageSupportedDevice__RequiredAssignment_4_2)
{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRequiredAssignment_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedDevice__Group_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedDevice__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__Group_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getSemicolonKeyword_4_3()); }

	';' 

{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getSemicolonKeyword_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MSwPackageSupportedPlatform__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group__0__Impl
	rule__MSwPackageSupportedPlatform__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getMSwPackageSupportedPlatformAction_0()); }
(

)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getMSwPackageSupportedPlatformAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group__1__Impl
	rule__MSwPackageSupportedPlatform__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getSupportedKeyword_1()); }

	'supported' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getSupportedKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group__2__Impl
	rule__MSwPackageSupportedPlatform__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getPlatformKeyword_2()); }

	'platform' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getPlatformKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group__3__Impl
	rule__MSwPackageSupportedPlatform__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getNameAssignment_3()); }
(rule__MSwPackageSupportedPlatform__NameAssignment_3)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group__4__Impl
	rule__MSwPackageSupportedPlatform__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group__5__Impl
	rule__MSwPackageSupportedPlatform__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5()); }
(rule__MSwPackageSupportedPlatform__UnorderedGroup_5)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group__6__Impl
	rule__MSwPackageSupportedPlatform__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MSwPackageSupportedPlatform__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_0__0__Impl
	rule__MSwPackageSupportedPlatform__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiKeyword_5_0_0()); }

	'osapi' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_0__1__Impl
	rule__MSwPackageSupportedPlatform__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_0__2__Impl
	rule__MSwPackageSupportedPlatform__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_0_2()); }
(rule__MSwPackageSupportedPlatform__Alternatives_5_0_2)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MSwPackageSupportedPlatform__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_1__0__Impl
	rule__MSwPackageSupportedPlatform__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsKeyword_5_1_0()); }

	'os' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_1__1__Impl
	rule__MSwPackageSupportedPlatform__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1()); }

	':=' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_1__2__Impl
	rule__MSwPackageSupportedPlatform__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_1_2()); }
(rule__MSwPackageSupportedPlatform__Alternatives_5_1_2)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_1_3()); }

	';' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MSwPackageSupportedPlatform__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_2__0__Impl
	rule__MSwPackageSupportedPlatform__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureKeyword_5_2_0()); }

	'architecture' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_2__1__Impl
	rule__MSwPackageSupportedPlatform__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1()); }

	':=' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_2__2__Impl
	rule__MSwPackageSupportedPlatform__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_2_2()); }
(rule__MSwPackageSupportedPlatform__Alternatives_5_2_2)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_2_3()); }

	';' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MSwPackageSupportedPlatform__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_3__0__Impl
	rule__MSwPackageSupportedPlatform__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerKeyword_5_3_0()); }

	'compiler' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_3__1__Impl
	rule__MSwPackageSupportedPlatform__Group_5_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1()); }

	':=' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_3__2__Impl
	rule__MSwPackageSupportedPlatform__Group_5_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerAssignment_5_3_2()); }
(rule__MSwPackageSupportedPlatform__CompilerAssignment_5_3_2)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerAssignment_5_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_3_3()); }

	';' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MSwPackageSupportedPlatform__Group_5_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_4__0__Impl
	rule__MSwPackageSupportedPlatform__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0()); }

	'microprocessor' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_4__1__Impl
	rule__MSwPackageSupportedPlatform__Group_5_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1()); }

	':=' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_4__2__Impl
	rule__MSwPackageSupportedPlatform__Group_5_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_4_2()); }
(rule__MSwPackageSupportedPlatform__Alternatives_5_4_2)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_4_3()); }

	';' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MSwPackageSupportedPlatform__Group_5_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_5__0__Impl
	rule__MSwPackageSupportedPlatform__Group_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardKeyword_5_5_0()); }

	'board' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardKeyword_5_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_5__1__Impl
	rule__MSwPackageSupportedPlatform__Group_5_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1()); }

	':=' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_5__2__Impl
	rule__MSwPackageSupportedPlatform__Group_5_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_5_2()); }
(rule__MSwPackageSupportedPlatform__Alternatives_5_5_2)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_5_3()); }

	';' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MSwPackageSupportedPlatform__Group_5_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_6__0__Impl
	rule__MSwPackageSupportedPlatform__Group_5_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesKeyword_5_6_0()); }

	'languages' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesKeyword_5_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_6__1__Impl
	rule__MSwPackageSupportedPlatform__Group_5_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1()); }

	':=' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_6__2__Impl
	rule__MSwPackageSupportedPlatform__Group_5_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_2()); }
(rule__MSwPackageSupportedPlatform__LanguagesAssignment_5_6_2)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_6__3__Impl
	rule__MSwPackageSupportedPlatform__Group_5_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_6_3()); }
(rule__MSwPackageSupportedPlatform__Group_5_6_3__0)*
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_6_4()); }

	';' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MSwPackageSupportedPlatform__Group_5_6_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_6_3__0__Impl
	rule__MSwPackageSupportedPlatform__Group_5_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_6_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getCommaKeyword_5_6_3_0()); }

	',' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getCommaKeyword_5_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_6_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_6_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_6_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_3_1()); }
(rule__MSwPackageSupportedPlatform__LanguagesAssignment_5_6_3_1)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MSwPackageSupportedPlatform__Group_5_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_7__0__Impl
	rule__MSwPackageSupportedPlatform__Group_5_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getConfigurationKeyword_5_7_0()); }

	'configuration' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getConfigurationKeyword_5_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_7__1__Impl
	rule__MSwPackageSupportedPlatform__Group_5_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersKeyword_5_7_1()); }

	'parameters' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersKeyword_5_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_7__2__Impl
	rule__MSwPackageSupportedPlatform__Group_5_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2()); }

	'{' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_7__3__Impl
	rule__MSwPackageSupportedPlatform__Group_5_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_7__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersAssignment_5_7_3()); }
(rule__MSwPackageSupportedPlatform__ParametersAssignment_5_7_3)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersAssignment_5_7_3()); }
)
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersAssignment_5_7_3()); }
(rule__MSwPackageSupportedPlatform__ParametersAssignment_5_7_3)*
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersAssignment_5_7_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_7__4__Impl
	rule__MSwPackageSupportedPlatform__Group_5_7__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_7__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4()); }

	'}' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_7__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_7__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_7__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_7_5()); }

	';' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_7_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MSwPackageSupportedPlatform__Group_5_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_8__0__Impl
	rule__MSwPackageSupportedPlatform__Group_5_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiredKeyword_5_8_0()); }

	'required' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiredKeyword_5_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_8__1__Impl
	rule__MSwPackageSupportedPlatform__Group_5_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getInterfacesKeyword_5_8_1()); }

	'interfaces' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getInterfacesKeyword_5_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_8__2__Impl
	rule__MSwPackageSupportedPlatform__Group_5_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_2()); }

	'{' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_8__3__Impl
	rule__MSwPackageSupportedPlatform__Group_5_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_8__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiresAssignment_5_8_3()); }
(rule__MSwPackageSupportedPlatform__RequiresAssignment_5_8_3)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiresAssignment_5_8_3()); }
)
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiresAssignment_5_8_3()); }
(rule__MSwPackageSupportedPlatform__RequiresAssignment_5_8_3)*
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiresAssignment_5_8_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_8__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_8__4__Impl
	rule__MSwPackageSupportedPlatform__Group_5_8__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_8__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_4()); }

	'}' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__Group_5_8__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__Group_5_8__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__Group_5_8__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_8_5()); }

	';' 

{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_8_5()); }
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
















rule__MBooleanParamSWPSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitch__Group__0__Impl
	rule__MBooleanParamSWPSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getConstantAssignment_0()); }
(rule__MBooleanParamSWPSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSWPSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitch__Group__1__Impl
	rule__MBooleanParamSWPSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getBooleanKeyword_1()); }

	'boolean' 

{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getBooleanKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSWPSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitch__Group__2__Impl
	rule__MBooleanParamSWPSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getNameAssignment_2()); }
(rule__MBooleanParamSWPSPSwitch__NameAssignment_2)
{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSWPSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitch__Group__3__Impl
	rule__MBooleanParamSWPSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSWPSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitch__Group__4__Impl
	rule__MBooleanParamSWPSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getSwitchKeyword_4()); }

	'switch' 

{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getSwitchKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSWPSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitch__Group__5__Impl
	rule__MBooleanParamSWPSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSWPSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitch__Group__6__Impl
	rule__MBooleanParamSWPSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getCasesAssignment_6()); }
(rule__MBooleanParamSWPSPSwitch__CasesAssignment_6)
{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getCasesAssignment_6()); }
)
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getCasesAssignment_6()); }
(rule__MBooleanParamSWPSPSwitch__CasesAssignment_6)*
{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getCasesAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSWPSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitch__Group__7__Impl
	rule__MBooleanParamSWPSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSWPSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitch__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MBooleanParamSWPSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitchCase__Group__0__Impl
	rule__MBooleanParamSWPSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSWPSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitchCase__Group__1__Impl
	rule__MBooleanParamSWPSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MBooleanParamSWPSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSWPSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitchCase__Group__2__Impl
	rule__MBooleanParamSWPSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSWPSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitchCase__Group__3__Impl
	rule__MBooleanParamSWPSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MBooleanParamSWPSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSWPSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSWPSPSwitchCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MStringParamSWPSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitch__Group__0__Impl
	rule__MStringParamSWPSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getConstantAssignment_0()); }
(rule__MStringParamSWPSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSWPSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitch__Group__1__Impl
	rule__MStringParamSWPSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getStringKeyword_1()); }

	'string' 

{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getStringKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSWPSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitch__Group__2__Impl
	rule__MStringParamSWPSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getNameAssignment_2()); }
(rule__MStringParamSWPSPSwitch__NameAssignment_2)
{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSWPSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitch__Group__3__Impl
	rule__MStringParamSWPSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSWPSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitch__Group__4__Impl
	rule__MStringParamSWPSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getSwitchKeyword_4()); }

	'switch' 

{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getSwitchKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSWPSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitch__Group__5__Impl
	rule__MStringParamSWPSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSWPSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitch__Group__6__Impl
	rule__MStringParamSWPSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getCasesAssignment_6()); }
(rule__MStringParamSWPSPSwitch__CasesAssignment_6)
{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getCasesAssignment_6()); }
)
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getCasesAssignment_6()); }
(rule__MStringParamSWPSPSwitch__CasesAssignment_6)*
{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getCasesAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSWPSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitch__Group__7__Impl
	rule__MStringParamSWPSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSWPSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitch__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MStringParamSWPSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitchCase__Group__0__Impl
	rule__MStringParamSWPSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSWPSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitchCase__Group__1__Impl
	rule__MStringParamSWPSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MStringParamSWPSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSWPSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitchCase__Group__2__Impl
	rule__MStringParamSWPSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSWPSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitchCase__Group__3__Impl
	rule__MStringParamSWPSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MStringParamSWPSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSWPSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSWPSPSwitchCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIntegerParamSWPSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitch__Group__0__Impl
	rule__MIntegerParamSWPSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getConstantAssignment_0()); }
(rule__MIntegerParamSWPSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitch__Group__1__Impl
	rule__MIntegerParamSWPSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getIntegerKeyword_1()); }

	'integer' 

{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getIntegerKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitch__Group__2__Impl
	rule__MIntegerParamSWPSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getNameAssignment_2()); }
(rule__MIntegerParamSWPSPSwitch__NameAssignment_2)
{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitch__Group__3__Impl
	rule__MIntegerParamSWPSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitch__Group__4__Impl
	rule__MIntegerParamSWPSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getSwitchKeyword_4()); }

	'switch' 

{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getSwitchKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitch__Group__5__Impl
	rule__MIntegerParamSWPSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitch__Group__6__Impl
	rule__MIntegerParamSWPSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getCasesAssignment_6()); }
(rule__MIntegerParamSWPSPSwitch__CasesAssignment_6)
{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getCasesAssignment_6()); }
)
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getCasesAssignment_6()); }
(rule__MIntegerParamSWPSPSwitch__CasesAssignment_6)*
{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getCasesAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitch__Group__7__Impl
	rule__MIntegerParamSWPSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitch__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MIntegerParamSWPSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitchCase__Group__0__Impl
	rule__MIntegerParamSWPSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitchCase__Group__1__Impl
	rule__MIntegerParamSWPSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MIntegerParamSWPSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitchCase__Group__2__Impl
	rule__MIntegerParamSWPSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitchCase__Group__3__Impl
	rule__MIntegerParamSWPSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MIntegerParamSWPSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitchCase__Group__4__Impl
	rule__MIntegerParamSWPSPSwitchCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getGroup_4()); }
(rule__MIntegerParamSWPSPSwitchCase__Group_4__0)?
{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitchCase__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitchCase__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitchCase__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIntegerParamSWPSPSwitchCase__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitchCase__Group_4__0__Impl
	rule__MIntegerParamSWPSPSwitchCase__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitchCase__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getRangeKeyword_4_0()); }

	'range' 

{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getRangeKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSWPSPSwitchCase__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSWPSPSwitchCase__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitchCase__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getRangeAssignment_4_1()); }
(rule__MIntegerParamSWPSPSwitchCase__RangeAssignment_4_1)
{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getRangeAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MRealParamSWPSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitch__Group__0__Impl
	rule__MRealParamSWPSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getConstantAssignment_0()); }
(rule__MRealParamSWPSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitch__Group__1__Impl
	rule__MRealParamSWPSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getRealKeyword_1()); }

	'real' 

{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getRealKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitch__Group__2__Impl
	rule__MRealParamSWPSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getNameAssignment_2()); }
(rule__MRealParamSWPSPSwitch__NameAssignment_2)
{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitch__Group__3__Impl
	rule__MRealParamSWPSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitch__Group__4__Impl
	rule__MRealParamSWPSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getSwitchKeyword_4()); }

	'switch' 

{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getSwitchKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitch__Group__5__Impl
	rule__MRealParamSWPSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitch__Group__6__Impl
	rule__MRealParamSWPSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getCasesAssignment_6()); }
(rule__MRealParamSWPSPSwitch__CasesAssignment_6)
{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getCasesAssignment_6()); }
)
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getCasesAssignment_6()); }
(rule__MRealParamSWPSPSwitch__CasesAssignment_6)*
{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getCasesAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitch__Group__7__Impl
	rule__MRealParamSWPSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitch__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MRealParamSWPSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitchCase__Group__0__Impl
	rule__MRealParamSWPSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitchCase__Group__1__Impl
	rule__MRealParamSWPSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MRealParamSWPSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitchCase__Group__2__Impl
	rule__MRealParamSWPSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitchCase__Group__3__Impl
	rule__MRealParamSWPSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MRealParamSWPSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitchCase__Group__4__Impl
	rule__MRealParamSWPSPSwitchCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getGroup_4()); }
(rule__MRealParamSWPSPSwitchCase__Group_4__0)?
{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitchCase__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitchCase__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitchCase__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MRealParamSWPSPSwitchCase__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitchCase__Group_4__0__Impl
	rule__MRealParamSWPSPSwitchCase__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitchCase__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getRangeKeyword_4_0()); }

	'range' 

{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getRangeKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSWPSPSwitchCase__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSWPSPSwitchCase__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitchCase__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getRangeAssignment_4_1()); }
(rule__MRealParamSWPSPSwitchCase__RangeAssignment_4_1)
{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getRangeAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MEnumParamSWPSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitch__Group__0__Impl
	rule__MEnumParamSWPSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getConstantAssignment_0()); }
(rule__MEnumParamSWPSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitch__Group__1__Impl
	rule__MEnumParamSWPSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumKeyword_1()); }

	'enum' 

{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitch__Group__2__Impl
	rule__MEnumParamSWPSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumDefinitionAssignment_2()); }
(rule__MEnumParamSWPSPSwitch__EnumDefinitionAssignment_2)
{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumDefinitionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitch__Group__3__Impl
	rule__MEnumParamSWPSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getNameAssignment_3()); }
(rule__MEnumParamSWPSPSwitch__NameAssignment_3)
{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitch__Group__4__Impl
	rule__MEnumParamSWPSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getColonEqualsSignKeyword_4()); }

	':=' 

{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getColonEqualsSignKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitch__Group__5__Impl
	rule__MEnumParamSWPSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getSwitchKeyword_5()); }

	'switch' 

{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getSwitchKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitch__Group__6__Impl
	rule__MEnumParamSWPSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_6()); }

	'{' 

{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitch__Group__7__Impl
	rule__MEnumParamSWPSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getCasesAssignment_7()); }
(rule__MEnumParamSWPSPSwitch__CasesAssignment_7)
{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getCasesAssignment_7()); }
)
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getCasesAssignment_7()); }
(rule__MEnumParamSWPSPSwitch__CasesAssignment_7)*
{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getCasesAssignment_7()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitch__Group__8__Impl
	rule__MEnumParamSWPSPSwitch__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitch__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitch__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getSemicolonKeyword_9()); }

	';' 

{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getSemicolonKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__MEnumParamSWPSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitchCase__Group__0__Impl
	rule__MEnumParamSWPSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitchCase__Group__1__Impl
	rule__MEnumParamSWPSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MEnumParamSWPSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitchCase__Group__2__Impl
	rule__MEnumParamSWPSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitchCase__Group__3__Impl
	rule__MEnumParamSWPSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MEnumParamSWPSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSWPSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSWPSPSwitchCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getSemicolonKeyword_4()); }
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
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_0()); }

	'enum' 

{ after(grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_0()); }
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
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getNameAssignment_1()); }
(rule__MEnumParameterDefinition__NameAssignment_1)
{ after(grammarAccess.getMEnumParameterDefinitionAccess().getNameAssignment_1()); }
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
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
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
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_3()); }
(rule__MEnumParameterDefinition__LiteralsAssignment_3)
{ after(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_3()); }
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
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getGroup_4()); }
(rule__MEnumParameterDefinition__Group_4__0)*
{ after(grammarAccess.getMEnumParameterDefinitionAccess().getGroup_4()); }
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
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_5()); }
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
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMEnumParameterDefinitionAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MEnumParameterDefinition__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterDefinition__Group_4__0__Impl
	rule__MEnumParameterDefinition__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_4_0()); }

	',' 

{ after(grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParameterDefinition__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParameterDefinition__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_4_1()); }
(rule__MEnumParameterDefinition__LiteralsAssignment_4_1)
{ after(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_4_1()); }
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













rule__MAbstractSwPackage__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5());
    }
:
	rule__MAbstractSwPackage__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAbstractSwPackageAccess().getGroup_5_0()); }
						(rule__MAbstractSwPackage__Group_5_0__0)
						{ after(grammarAccess.getMAbstractSwPackageAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAbstractSwPackageAccess().getGroup_5_1()); }
						(rule__MAbstractSwPackage__Group_5_1__0)
						{ after(grammarAccess.getMAbstractSwPackageAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAbstractSwPackageAccess().getGroup_5_2()); }
						(rule__MAbstractSwPackage__Group_5_2__0)
						{ after(grammarAccess.getMAbstractSwPackageAccess().getGroup_5_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__UnorderedGroup_5__Impl
	rule__MAbstractSwPackage__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__UnorderedGroup_5__Impl
	rule__MAbstractSwPackage__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractSwPackage__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractSwPackage__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__MSwPackage__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5());
    }
:
	rule__MSwPackage__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MSwPackage__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageAccess().getGroup_5_0()); }
						(rule__MSwPackage__Group_5_0__0)
						{ after(grammarAccess.getMSwPackageAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageAccess().getGroup_5_1()); }
						(rule__MSwPackage__Group_5_1__0)
						{ after(grammarAccess.getMSwPackageAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageAccess().getGroup_5_2()); }
						(rule__MSwPackage__Group_5_2__0)
						{ after(grammarAccess.getMSwPackageAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageAccess().getGroup_5_3()); }
						(rule__MSwPackage__Group_5_3__0)
						{ after(grammarAccess.getMSwPackageAccess().getGroup_5_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageAccess().getGroup_5_4()); }
						(rule__MSwPackage__Group_5_4__0)
						{ after(grammarAccess.getMSwPackageAccess().getGroup_5_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageAccess().getGroup_5_5()); }
						(rule__MSwPackage__Group_5_5__0)
						{ after(grammarAccess.getMSwPackageAccess().getGroup_5_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageAccess().getGroup_5_6()); }
						(rule__MSwPackage__Group_5_6__0)
						{ after(grammarAccess.getMSwPackageAccess().getGroup_5_6()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MSwPackage__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__UnorderedGroup_5__Impl
	rule__MSwPackage__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__UnorderedGroup_5__Impl
	rule__MSwPackage__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__UnorderedGroup_5__Impl
	rule__MSwPackage__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__UnorderedGroup_5__Impl
	rule__MSwPackage__UnorderedGroup_5__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__UnorderedGroup_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__UnorderedGroup_5__Impl
	rule__MSwPackage__UnorderedGroup_5__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__UnorderedGroup_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__UnorderedGroup_5__Impl
	rule__MSwPackage__UnorderedGroup_5__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackage__UnorderedGroup_5__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackage__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}
















rule__MDriverSwPackage__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5());
    }
:
	rule__MDriverSwPackage__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_5_0()); }
						(rule__MDriverSwPackage__Group_5_0__0)
						{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_5_1()); }
						(rule__MDriverSwPackage__Group_5_1__0)
						{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_5_2()); }
						(rule__MDriverSwPackage__Group_5_2__0)
						{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_5_3()); }
						(rule__MDriverSwPackage__Group_5_3__0)
						{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_5_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_5_4()); }
						(rule__MDriverSwPackage__Group_5_4__0)
						{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_5_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_5_5()); }
						(rule__MDriverSwPackage__Group_5_5__0)
						{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_5_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageAccess().getGroup_5_6()); }
						(rule__MDriverSwPackage__Group_5_6__0)
						{ after(grammarAccess.getMDriverSwPackageAccess().getGroup_5_6()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__UnorderedGroup_5__Impl
	rule__MDriverSwPackage__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__UnorderedGroup_5__Impl
	rule__MDriverSwPackage__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__UnorderedGroup_5__Impl
	rule__MDriverSwPackage__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__UnorderedGroup_5__Impl
	rule__MDriverSwPackage__UnorderedGroup_5__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__UnorderedGroup_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__UnorderedGroup_5__Impl
	rule__MDriverSwPackage__UnorderedGroup_5__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__UnorderedGroup_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__UnorderedGroup_5__Impl
	rule__MDriverSwPackage__UnorderedGroup_5__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackage__UnorderedGroup_5__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackage__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}
















rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
    }
:
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_0()); }
						(rule__MDriverSwPackageSupportedPlatform__Group_5_0__0)
						{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_1()); }
						(rule__MDriverSwPackageSupportedPlatform__Group_5_1__0)
						{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_2()); }
						(rule__MDriverSwPackageSupportedPlatform__Group_5_2__0)
						{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_3()); }
						(rule__MDriverSwPackageSupportedPlatform__Group_5_3__0)
						{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_4()); }
						(rule__MDriverSwPackageSupportedPlatform__Group_5_4__0)
						{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_5()); }
						(rule__MDriverSwPackageSupportedPlatform__Group_5_5__0)
						{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_6()); }
						(rule__MDriverSwPackageSupportedPlatform__Group_5_6__0)
						{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_6()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 7);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_7()); }
						(rule__MDriverSwPackageSupportedPlatform__Group_5_7__0)
						{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_7()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 8);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_8()); }
						(rule__MDriverSwPackageSupportedPlatform__Group_5_8__0)
						{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_8()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 9)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 9);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_9()); }
						(rule__MDriverSwPackageSupportedPlatform__Group_5_9__0)
						{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_9()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__7?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__8?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__9?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSwPackageSupportedPlatform__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}






















rule__MSwPackageSupportedPlatform__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
    }
:
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_0()); }
						(rule__MSwPackageSupportedPlatform__Group_5_0__0)
						{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_1()); }
						(rule__MSwPackageSupportedPlatform__Group_5_1__0)
						{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_2()); }
						(rule__MSwPackageSupportedPlatform__Group_5_2__0)
						{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_3()); }
						(rule__MSwPackageSupportedPlatform__Group_5_3__0)
						{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_4()); }
						(rule__MSwPackageSupportedPlatform__Group_5_4__0)
						{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_5()); }
						(rule__MSwPackageSupportedPlatform__Group_5_5__0)
						{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_6()); }
						(rule__MSwPackageSupportedPlatform__Group_5_6__0)
						{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_6()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 7);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_7()); }
						(rule__MSwPackageSupportedPlatform__Group_5_7__0)
						{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_7()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5(), 8);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_8()); }
						(rule__MSwPackageSupportedPlatform__Group_5_8__0)
						{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_8()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__UnorderedGroup_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__UnorderedGroup_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__UnorderedGroup_5__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__7?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__UnorderedGroup_5__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__Impl
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__8?
;
finally {
	restoreStackSize(stackSize);
}


rule__MSwPackageSupportedPlatform__UnorderedGroup_5__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSwPackageSupportedPlatform__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}




















rule__MMESPSWPPackageFile__PackageAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); }
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMESPSWPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMMESPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPSWPPackageFile__ImportsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMESPSWPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMMESPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPSWPPackageFile__ElementAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPSWPPackageFileAccess().getElementMMESPSWPPackageElementParserRuleCall_4_0()); }
	ruleMMESPSWPPackageElement{ after(grammarAccess.getMMESPSWPPackageFileAccess().getElementMMESPSWPPackageElementParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMAbstractSwPackageAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__InheritsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__InheritsAssignment_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_3_2_1_0()); }
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1()); }
)
{ after(grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__VersionAssignment_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMAbstractSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__ParametersAssignment_5_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getParametersMParameterWithoutSWPSPParserRuleCall_5_1_3_0()); }
	ruleMParameterWithoutSWPSP{ after(grammarAccess.getMAbstractSwPackageAccess().getParametersMParameterWithoutSWPSPParserRuleCall_5_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractSwPackage__ProvidesAssignment_5_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractSwPackageAccess().getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_2_3_0()); }
	ruleMSwPackageProvidedInterface{ after(grammarAccess.getMAbstractSwPackageAccess().getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterface__SwinterfaceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfaceAccess().getSwinterfaceMSwInterfaceCrossReference_1_0()); }
(
{ before(grammarAccess.getMSwPackageProvidedInterfaceAccess().getSwinterfaceMSwInterfaceVersionedQualifiedNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageProvidedInterfaceAccess().getSwinterfaceMSwInterfaceVersionedQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageProvidedInterfaceAccess().getSwinterfaceMSwInterfaceCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterface__ParameterValueAssignmentsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfaceAccess().getParameterValueAssignmentsMSwPackageProvidedInterfacePVAParserRuleCall_3_0()); }
	ruleMSwPackageProvidedInterfacePVA{ after(grammarAccess.getMSwPackageProvidedInterfaceAccess().getParameterValueAssignmentsMSwPackageProvidedInterfacePVAParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVAExpression__ParameterAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterMParameterCrossReference_1_0()); }
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterMParameterCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVAExpression__ParameterValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitch__ParameterAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterMParameterCrossReference_1_0()); }
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterMParameterCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitch__CasesAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getCasesMSwPackageProvidedInterfacePVASwitchCaseParserRuleCall_5_0()); }
	ruleMSwPackageProvidedInterfacePVASwitchCase{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getCasesMSwPackageProvidedInterfacePVASwitchCaseParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageProvidedInterfacePVASwitchCase__ParameterValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); }
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

rule__MSwPackage__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMSwPackageAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__InheritsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_1_0()); }
(
{ before(grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__InheritsAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_2_1_0()); }
(
{ before(grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__ExtendsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getExtendsMSwPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMSwPackageAccess().getExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageAccess().getExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageAccess().getExtendsMSwPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__ExtendsAssignment_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getExtendsMSwPackageCrossReference_3_2_1_0()); }
(
{ before(grammarAccess.getMSwPackageAccess().getExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageAccess().getExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageAccess().getExtendsMSwPackageCrossReference_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__VersionAssignment_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__LanguagesAssignment_5_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_2_0()); }
(
{ before(grammarAccess.getMSwPackageAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_2_0_1()); }
)
{ after(grammarAccess.getMSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__LanguagesAssignment_5_1_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_3_1_0()); }
(
{ before(grammarAccess.getMSwPackageAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__CtoolsAssignment_5_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_3_0()); }
(
{ before(grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_3_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_3_0_1()); }
)
{ after(grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__CtoolsAssignment_5_2_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_4_1_0()); }
(
{ before(grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_4_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_4_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__ParametersAssignment_5_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getParametersMParameterParserRuleCall_5_3_3_0()); }
	ruleMParameter{ after(grammarAccess.getMSwPackageAccess().getParametersMParameterParserRuleCall_5_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__ProvidesAssignment_5_4_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0()); }
	ruleMSwPackageProvidedInterface{ after(grammarAccess.getMSwPackageAccess().getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__RequiresAssignment_5_5_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0()); }
	ruleMSwPackageRequiredInterface{ after(grammarAccess.getMSwPackageAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackage__SupportedPlatformsAssignment_5_6_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageAccess().getSupportedPlatformsMSwPackageSupportedPlatformParserRuleCall_5_6_3_0()); }
	ruleMSwPackageSupportedPlatform{ after(grammarAccess.getMSwPackageAccess().getSupportedPlatformsMSwPackageSupportedPlatformParserRuleCall_5_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMDriverSwPackageAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__InheritsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__InheritsAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_2_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__ExtendsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__ExtendsAssignment_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageCrossReference_3_2_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageVersionedQualifiedNameParserRuleCall_3_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageCrossReference_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__VersionAssignment_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMDriverSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__LanguagesAssignment_5_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_2_0()); }
(
{ before(grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_2_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__LanguagesAssignment_5_1_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_3_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__CtoolsAssignment_5_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_3_0()); }
(
{ before(grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_3_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_3_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__CtoolsAssignment_5_2_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_4_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_4_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_5_2_4_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__ParametersAssignment_5_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getParametersMParameterParserRuleCall_5_3_3_0()); }
	ruleMParameter{ after(grammarAccess.getMDriverSwPackageAccess().getParametersMParameterParserRuleCall_5_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__ProvidesAssignment_5_4_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0()); }
	ruleMSwPackageProvidedInterface{ after(grammarAccess.getMDriverSwPackageAccess().getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__RequiresAssignment_5_5_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0()); }
	ruleMSwPackageRequiredInterface{ after(grammarAccess.getMDriverSwPackageAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackage__SupportedPlatformsAssignment_5_6_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageAccess().getSupportedPlatformsMDriverSwPackageSupportedPlatformParserRuleCall_5_6_3_0()); }
	ruleMDriverSwPackageSupportedPlatform{ after(grammarAccess.getMDriverSwPackageAccess().getSupportedPlatformsMDriverSwPackageSupportedPlatformParserRuleCall_5_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__OsapiAssignment_5_0_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__OsAssignment_5_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__ArchitectureAssignment_5_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__CompilerAssignment_5_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); }
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__MicroprocessorAssignment_5_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__BoardAssignment_5_5_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__LanguagesAssignment_5_6_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_2_0()); }
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_2_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__LanguagesAssignment_5_6_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_3_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__ParametersAssignment_5_7_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersMParameterParserRuleCall_5_7_3_0()); }
	ruleMParameter{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersMParameterParserRuleCall_5_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__RequiresAssignment_5_8_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0()); }
	ruleMSwPackageRequiredInterface{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedPlatform__SupportedDevicesAssignment_5_9_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedDevicesMDriverSwPackageSupportedDeviceParserRuleCall_5_9_3_0()); }
	ruleMDriverSwPackageSupportedDevice{ after(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedDevicesMDriverSwPackageSupportedDeviceParserRuleCall_5_9_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__DeviceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); }
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSwPackageSupportedDevice__RequiredAssignment_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRequiredMParameterValueExpressionParserRuleCall_4_2_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRequiredMParameterValueExpressionParserRuleCall_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__OsapiAssignment_5_0_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); }
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__OsAssignment_5_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); }
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__ArchitectureAssignment_5_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); }
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__CompilerAssignment_5_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); }
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1()); }
)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__MicroprocessorAssignment_5_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); }
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__BoardAssignment_5_5_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); }
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__LanguagesAssignment_5_6_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_2_0()); }
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_2_0_1()); }
)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__LanguagesAssignment_5_6_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_3_1_0()); }
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_6_3_1_0_1()); }
)
{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__ParametersAssignment_5_7_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersMParameterWithoutSWPSPParserRuleCall_5_7_3_0()); }
	ruleMParameterWithoutSWPSP{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersMParameterWithoutSWPSPParserRuleCall_5_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSwPackageSupportedPlatform__RequiresAssignment_5_8_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0()); }
	ruleMSwPackageRequiredInterface{ after(grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0()); }
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

rule__MBooleanParamSWPSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitch__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitch__CasesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getCasesMBooleanParamSWPSPSwitchCaseParserRuleCall_6_0()); }
	ruleMBooleanParamSWPSPSwitchCase{ after(grammarAccess.getMBooleanParamSWPSPSwitchAccess().getCasesMBooleanParamSWPSPSwitchCaseParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSWPSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitch__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitch__CasesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchAccess().getCasesMStringParamSWPSPSwitchCaseParserRuleCall_6_0()); }
	ruleMStringParamSWPSPSwitchCase{ after(grammarAccess.getMStringParamSWPSPSwitchAccess().getCasesMStringParamSWPSPSwitchCaseParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSWPSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitch__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitch__CasesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getCasesMIntegerParamSWPSPSwitchCaseParserRuleCall_6_0()); }
	ruleMIntegerParamSWPSPSwitchCase{ after(grammarAccess.getMIntegerParamSWPSPSwitchAccess().getCasesMIntegerParamSWPSPSwitchCaseParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSWPSPSwitchCase__RangeAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
	ruleMParameterRange{ after(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitch__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitch__CasesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchAccess().getCasesMRealParamSWPSPSwitchCaseParserRuleCall_6_0()); }
	ruleMRealParamSWPSPSwitchCase{ after(grammarAccess.getMRealParamSWPSPSwitchAccess().getCasesMRealParamSWPSPSwitchCaseParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSWPSPSwitchCase__RangeAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
	ruleMParameterRange{ after(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__EnumDefinitionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); }
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitch__CasesAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchAccess().getCasesMEnumParamSWPSPSwitchCaseParserRuleCall_7_0()); }
	ruleMEnumParamSWPSPSwitchCase{ after(grammarAccess.getMEnumParamSWPSPSwitchAccess().getCasesMEnumParamSWPSPSwitchCaseParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSWPSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
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

rule__MEnumParameterDefinition__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__LiteralsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_3_0()); }
	ruleMEnumParameterLiteralRule{ after(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterDefinition__LiteralsAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_1_0()); }
	ruleMEnumParameterLiteralRule{ after(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_1_0()); }
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


RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


