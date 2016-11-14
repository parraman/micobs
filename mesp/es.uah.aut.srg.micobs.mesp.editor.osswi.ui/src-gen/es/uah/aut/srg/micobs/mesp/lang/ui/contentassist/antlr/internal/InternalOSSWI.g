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
grammar InternalOSSWI;

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
import es.uah.aut.srg.micobs.mesp.lang.services.OSSWIGrammarAccess;

}

@parser::members {
 
 	private OSSWIGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(OSSWIGrammarAccess grammarAccess) {
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




// Entry rule entryRuleMMESPOSSWIPackageFile
entryRuleMMESPOSSWIPackageFile 
:
{ before(grammarAccess.getMMESPOSSWIPackageFileRule()); }
	 ruleMMESPOSSWIPackageFile
{ after(grammarAccess.getMMESPOSSWIPackageFileRule()); } 
	 EOF 
;

// Rule MMESPOSSWIPackageFile
ruleMMESPOSSWIPackageFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getGroup()); }
(rule__MMESPOSSWIPackageFile__Group__0)
{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMESPOSSWIPackageElement
entryRuleMMESPOSSWIPackageElement 
:
{ before(grammarAccess.getMMESPOSSWIPackageElementRule()); }
	 ruleMMESPOSSWIPackageElement
{ after(grammarAccess.getMMESPOSSWIPackageElementRule()); } 
	 EOF 
;

// Rule MMESPOSSWIPackageElement
ruleMMESPOSSWIPackageElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPOSSWIPackageElementAccess().getMOSSwInterfaceParserRuleCall()); }
	ruleMOSSwInterface
{ after(grammarAccess.getMMESPOSSWIPackageElementAccess().getMOSSwInterfaceParserRuleCall()); }
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



// Entry rule entryRuleMOSSwInterface
entryRuleMOSSwInterface 
:
{ before(grammarAccess.getMOSSwInterfaceRule()); }
	 ruleMOSSwInterface
{ after(grammarAccess.getMOSSwInterfaceRule()); } 
	 EOF 
;

// Rule MOSSwInterface
ruleMOSSwInterface
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getGroup()); }
(rule__MOSSwInterface__Group__0)
{ after(grammarAccess.getMOSSwInterfaceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMProvidedResource
entryRuleMProvidedResource 
:
{ before(grammarAccess.getMProvidedResourceRule()); }
	 ruleMProvidedResource
{ after(grammarAccess.getMProvidedResourceRule()); } 
	 EOF 
;

// Rule MProvidedResource
ruleMProvidedResource
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMProvidedResourceAccess().getAlternatives()); }
(rule__MProvidedResource__Alternatives)
{ after(grammarAccess.getMProvidedResourceAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMQuantifiableResource
entryRuleMQuantifiableResource 
:
{ before(grammarAccess.getMQuantifiableResourceRule()); }
	 ruleMQuantifiableResource
{ after(grammarAccess.getMQuantifiableResourceRule()); } 
	 EOF 
;

// Rule MQuantifiableResource
ruleMQuantifiableResource
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMQuantifiableResourceAccess().getGroup()); }
(rule__MQuantifiableResource__Group__0)
{ after(grammarAccess.getMQuantifiableResourceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMInstantiableResource
entryRuleMInstantiableResource 
:
{ before(grammarAccess.getMInstantiableResourceRule()); }
	 ruleMInstantiableResource
{ after(grammarAccess.getMInstantiableResourceRule()); } 
	 EOF 
;

// Rule MInstantiableResource
ruleMInstantiableResource
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMInstantiableResourceAccess().getGroup()); }
(rule__MInstantiableResource__Group__0)
{ after(grammarAccess.getMInstantiableResourceAccess().getGroup()); }
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

rule__MProvidedResource__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMProvidedResourceAccess().getMQuantifiableResourceParserRuleCall_0()); }
	ruleMQuantifiableResource
{ after(grammarAccess.getMProvidedResourceAccess().getMQuantifiableResourceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMProvidedResourceAccess().getMInstantiableResourceParserRuleCall_1()); }
	ruleMInstantiableResource
{ after(grammarAccess.getMProvidedResourceAccess().getMInstantiableResourceParserRuleCall_1()); }
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



rule__MMESPOSSWIPackageFile__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWIPackageFile__Group__0__Impl
	rule__MMESPOSSWIPackageFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWIPackageFile__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPOSSWIPackageFile__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWIPackageFile__Group__1__Impl
	rule__MMESPOSSWIPackageFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWIPackageFile__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageAssignment_1()); }
(rule__MMESPOSSWIPackageFile__PackageAssignment_1)
{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPOSSWIPackageFile__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWIPackageFile__Group__2__Impl
	rule__MMESPOSSWIPackageFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWIPackageFile__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPOSSWIPackageFile__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWIPackageFile__Group__3__Impl
	rule__MMESPOSSWIPackageFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWIPackageFile__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getGroup_3()); }
(rule__MMESPOSSWIPackageFile__Group_3__0)*
{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPOSSWIPackageFile__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWIPackageFile__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWIPackageFile__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getElementAssignment_4()); }
(rule__MMESPOSSWIPackageFile__ElementAssignment_4)
{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getElementAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMESPOSSWIPackageFile__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWIPackageFile__Group_3__0__Impl
	rule__MMESPOSSWIPackageFile__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWIPackageFile__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportKeyword_3_0()); }

	'import' 

{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPOSSWIPackageFile__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWIPackageFile__Group_3__1__Impl
	rule__MMESPOSSWIPackageFile__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWIPackageFile__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsAssignment_3_1()); }
(rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1)
{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPOSSWIPackageFile__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWIPackageFile__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWIPackageFile__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getSemicolonKeyword_3_2()); }
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






rule__MOSSwInterface__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group__0__Impl
	rule__MOSSwInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getOsswinterfaceKeyword_0()); }

	'osswinterface' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getOsswinterfaceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group__1__Impl
	rule__MOSSwInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getNameAssignment_1()); }
(rule__MOSSwInterface__NameAssignment_1)
{ after(grammarAccess.getMOSSwInterfaceAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group__2__Impl
	rule__MOSSwInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getGroup_2()); }
(rule__MOSSwInterface__Group_2__0)?
{ after(grammarAccess.getMOSSwInterfaceAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group__3__Impl
	rule__MOSSwInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group__4__Impl
	rule__MOSSwInterface__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4()); }
(rule__MOSSwInterface__UnorderedGroup_4)
{ after(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group__5__Impl
	rule__MOSSwInterface__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MOSSwInterface__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_2__0__Impl
	rule__MOSSwInterface__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getExtendsKeyword_2_0()); }

	'extends' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getExtendsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_2__1__Impl
	rule__MOSSwInterface__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getExtendsAssignment_2_1()); }
(rule__MOSSwInterface__ExtendsAssignment_2_1)
{ after(grammarAccess.getMOSSwInterfaceAccess().getExtendsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getGroup_2_2()); }
(rule__MOSSwInterface__Group_2_2__0)*
{ after(grammarAccess.getMOSSwInterfaceAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MOSSwInterface__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_2_2__0__Impl
	rule__MOSSwInterface__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getExtendsAssignment_2_2_1()); }
(rule__MOSSwInterface__ExtendsAssignment_2_2_1)
{ after(grammarAccess.getMOSSwInterfaceAccess().getExtendsAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MOSSwInterface__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_0__0__Impl
	rule__MOSSwInterface__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getVersionKeyword_4_0_0()); }

	'version' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getVersionKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_0__1__Impl
	rule__MOSSwInterface__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getColonEqualsSignKeyword_4_0_1()); }

	':=' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getColonEqualsSignKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_0__2__Impl
	rule__MOSSwInterface__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getVersionAssignment_4_0_2()); }
(rule__MOSSwInterface__VersionAssignment_4_0_2)
{ after(grammarAccess.getMOSSwInterfaceAccess().getVersionAssignment_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_0_3()); }

	';' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MOSSwInterface__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_1__0__Impl
	rule__MOSSwInterface__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getOsapiKeyword_4_1_0()); }

	'osapi' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getOsapiKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_1__1__Impl
	rule__MOSSwInterface__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getColonEqualsSignKeyword_4_1_1()); }

	':=' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getColonEqualsSignKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_1__2__Impl
	rule__MOSSwInterface__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementAssignment_4_1_2()); }
(rule__MOSSwInterface__ReferencedElementAssignment_4_1_2)
{ after(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementAssignment_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_1_3()); }

	';' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MOSSwInterface__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_2__0__Impl
	rule__MOSSwInterface__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getProvidedKeyword_4_2_0()); }

	'provided' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getProvidedKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_2__1__Impl
	rule__MOSSwInterface__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getResourcesKeyword_4_2_1()); }

	'resources' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getResourcesKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_2__2__Impl
	rule__MOSSwInterface__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getLeftCurlyBracketKeyword_4_2_2()); }

	'{' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getLeftCurlyBracketKeyword_4_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_2__3__Impl
	rule__MOSSwInterface__Group_4_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesAssignment_4_2_3()); }
(rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3)
{ after(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesAssignment_4_2_3()); }
)
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesAssignment_4_2_3()); }
(rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3)*
{ after(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesAssignment_4_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_4_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_2__4__Impl
	rule__MOSSwInterface__Group_4_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getRightCurlyBracketKeyword_4_2_4()); }

	'}' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getRightCurlyBracketKeyword_4_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__Group_4_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__Group_4_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__Group_4_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_2_5()); }

	';' 

{ after(grammarAccess.getMOSSwInterfaceAccess().getSemicolonKeyword_4_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MQuantifiableResource__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResource__Group__0__Impl
	rule__MQuantifiableResource__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResource__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceAccess().getQuantifiableKeyword_0()); }

	'quantifiable' 

{ after(grammarAccess.getMQuantifiableResourceAccess().getQuantifiableKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResource__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResource__Group__1__Impl
	rule__MQuantifiableResource__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResource__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceAccess().getResourceKeyword_1()); }

	'resource' 

{ after(grammarAccess.getMQuantifiableResourceAccess().getResourceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResource__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResource__Group__2__Impl
	rule__MQuantifiableResource__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResource__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceAccess().getNameAssignment_2()); }
(rule__MQuantifiableResource__NameAssignment_2)
{ after(grammarAccess.getMQuantifiableResourceAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResource__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResource__Group__3__Impl
	rule__MQuantifiableResource__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResource__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceAccess().getStepKeyword_3()); }

	'step' 

{ after(grammarAccess.getMQuantifiableResourceAccess().getStepKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResource__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResource__Group__4__Impl
	rule__MQuantifiableResource__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResource__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceAccess().getLowerBoundAssignment_4()); }
(rule__MQuantifiableResource__LowerBoundAssignment_4)
{ after(grammarAccess.getMQuantifiableResourceAccess().getLowerBoundAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResource__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResource__Group__5__Impl
	rule__MQuantifiableResource__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResource__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceAccess().getToKeyword_5()); }

	'to' 

{ after(grammarAccess.getMQuantifiableResourceAccess().getToKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResource__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResource__Group__6__Impl
	rule__MQuantifiableResource__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResource__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceAccess().getUpperBoundAssignment_6()); }
(rule__MQuantifiableResource__UpperBoundAssignment_6)
{ after(grammarAccess.getMQuantifiableResourceAccess().getUpperBoundAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MQuantifiableResource__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MQuantifiableResource__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResource__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMQuantifiableResourceAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MInstantiableResource__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResource__Group__0__Impl
	rule__MInstantiableResource__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResource__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceAccess().getInstantiableKeyword_0()); }

	'instantiable' 

{ after(grammarAccess.getMInstantiableResourceAccess().getInstantiableKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResource__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResource__Group__1__Impl
	rule__MInstantiableResource__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResource__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceAccess().getResourceKeyword_1()); }

	'resource' 

{ after(grammarAccess.getMInstantiableResourceAccess().getResourceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResource__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResource__Group__2__Impl
	rule__MInstantiableResource__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResource__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceAccess().getNameAssignment_2()); }
(rule__MInstantiableResource__NameAssignment_2)
{ after(grammarAccess.getMInstantiableResourceAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResource__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResource__Group__3__Impl
	rule__MInstantiableResource__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResource__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMInstantiableResourceAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResource__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResource__Group__4__Impl
	rule__MInstantiableResource__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResource__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceAccess().getParametersAssignment_4()); }
(rule__MInstantiableResource__ParametersAssignment_4)*
{ after(grammarAccess.getMInstantiableResourceAccess().getParametersAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResource__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResource__Group__5__Impl
	rule__MInstantiableResource__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResource__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMInstantiableResourceAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInstantiableResource__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInstantiableResource__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResource__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMInstantiableResourceAccess().getSemicolonKeyword_6()); }
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
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_0()); }

	'integer' 

{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_0()); }
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
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameAssignment_1()); }
(rule__MIntegerParameterSingleExpression__NameAssignment_1)
{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameAssignment_1()); }
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
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); }

	':=' 

{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); }
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
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueAssignment_3()); }
(rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3)
{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueAssignment_3()); }
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
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_4()); }
(rule__MIntegerParameterSingleExpression__Group_4__0)?
{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_4()); }
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
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIntegerParameterSingleExpression__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParameterSingleExpression__Group_4__0__Impl
	rule__MIntegerParameterSingleExpression__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_4_0()); }

	'range' 

{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParameterSingleExpression__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParameterSingleExpression__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeAssignment_4_1()); }
(rule__MIntegerParameterSingleExpression__RangeAssignment_4_1)
{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeAssignment_4_1()); }
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
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_0()); }

	'enum' 

{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_0()); }
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
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionAssignment_1()); }
(rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1)
{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionAssignment_1()); }
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
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameAssignment_2()); }
(rule__MEnumParameterSingleExpression__NameAssignment_2)
{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameAssignment_2()); }
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
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_3()); }
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
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueAssignment_4()); }
(rule__MEnumParameterSingleExpression__DefaultValueAssignment_4)
{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueAssignment_4()); }
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
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_5()); }
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
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_0()); }

	'real' 

{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_0()); }
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
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getNameAssignment_1()); }
(rule__MRealParameterSingleExpression__NameAssignment_1)
{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getNameAssignment_1()); }
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
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); }

	':=' 

{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); }
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
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueAssignment_3()); }
(rule__MRealParameterSingleExpression__DefaultValueAssignment_3)
{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueAssignment_3()); }
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
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_4()); }
(rule__MRealParameterSingleExpression__Group_4__0)?
{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_4()); }
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
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MRealParameterSingleExpression__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParameterSingleExpression__Group_4__0__Impl
	rule__MRealParameterSingleExpression__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_4_0()); }

	'range' 

{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParameterSingleExpression__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParameterSingleExpression__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeAssignment_4_1()); }
(rule__MRealParameterSingleExpression__RangeAssignment_4_1)
{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeAssignment_4_1()); }
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
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_0()); }

	'boolean' 

{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_0()); }
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
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_1()); }
(rule__MBooleanParameterSingleExpression__NameAssignment_1)
{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_1()); }
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
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); }

	':=' 

{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); }
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
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_3()); }
(rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3)
{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_3()); }
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
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_4()); }
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
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_0()); }

	'string' 

{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_0()); }
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
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_1()); }
(rule__MStringParameterSingleExpression__NameAssignment_1)
{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_1()); }
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
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); }

	':=' 

{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_2()); }
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
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_3()); }
(rule__MStringParameterSingleExpression__DefaultValueAssignment_3)
{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_3()); }
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
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_4()); }
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















rule__MOSSwInterface__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4());
    }
:
	rule__MOSSwInterface__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_0()); }
						(rule__MOSSwInterface__Group_4_0__0)
						{ after(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_1()); }
						(rule__MOSSwInterface__Group_4_1__0)
						{ after(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_2()); }
						(rule__MOSSwInterface__Group_4_2__0)
						{ after(grammarAccess.getMOSSwInterfaceAccess().getGroup_4_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSwInterfaceAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__UnorderedGroup_4__Impl
	rule__MOSSwInterface__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__UnorderedGroup_4__Impl
	rule__MOSSwInterface__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwInterface__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwInterface__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__MMESPOSSWIPackageFile__PackageAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); }
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWIPackageFile__ImportsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWIPackageFile__ElementAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWIPackageFileAccess().getElementMMESPOSSWIPackageElementParserRuleCall_4_0()); }
	ruleMMESPOSSWIPackageElement{ after(grammarAccess.getMMESPOSSWIPackageFileAccess().getElementMMESPOSSWIPackageElementParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMOSSwInterfaceAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__ExtendsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceCrossReference_2_1_0()); }
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__ExtendsAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceCrossReference_2_2_1_0()); }
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
)
{ after(grammarAccess.getMOSSwInterfaceAccess().getExtendsMOSSwInterfaceCrossReference_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__VersionAssignment_4_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMOSSwInterfaceAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__ReferencedElementAssignment_4_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementMOperatingSystemAPICrossReference_4_1_2_0()); }
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
)
{ after(grammarAccess.getMOSSwInterfaceAccess().getReferencedElementMOperatingSystemAPICrossReference_4_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwInterface__ProvidedResourcesAssignment_4_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesMProvidedResourceParserRuleCall_4_2_3_0()); }
	ruleMProvidedResource{ after(grammarAccess.getMOSSwInterfaceAccess().getProvidedResourcesMProvidedResourceParserRuleCall_4_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResource__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMQuantifiableResourceAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResource__LowerBoundAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMQuantifiableResourceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MQuantifiableResource__UpperBoundAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMQuantifiableResourceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMQuantifiableResourceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResource__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMInstantiableResourceAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInstantiableResource__ParametersAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInstantiableResourceAccess().getParametersMParameterParserRuleCall_4_0()); }
	ruleMParameter{ after(grammarAccess.getMInstantiableResourceAccess().getParametersMParameterParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParameterSingleExpression__RangeAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
	ruleMParameterRange{ after(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
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

rule__MEnumParameterSingleExpression__EnumDefinitionAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_1_0()); }
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParameterSingleExpression__DefaultValueAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParameterSingleExpression__RangeAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
	ruleMParameterRange{ after(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
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

rule__MBooleanParameterSingleExpression__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParameterSingleExpression__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParameterSingleExpression__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParameterSingleExpression__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
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


RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


