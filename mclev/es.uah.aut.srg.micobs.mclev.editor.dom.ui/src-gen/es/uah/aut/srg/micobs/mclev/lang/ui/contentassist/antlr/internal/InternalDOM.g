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
grammar InternalDOM;

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
import es.uah.aut.srg.micobs.mclev.lang.services.DOMGrammarAccess;

}

@parser::members {
 
 	private DOMGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(DOMGrammarAccess grammarAccess) {
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




// Entry rule entryRuleMMCLEVDOMPackageFile
entryRuleMMCLEVDOMPackageFile 
:
{ before(grammarAccess.getMMCLEVDOMPackageFileRule()); }
	 ruleMMCLEVDOMPackageFile
{ after(grammarAccess.getMMCLEVDOMPackageFileRule()); } 
	 EOF 
;

// Rule MMCLEVDOMPackageFile
ruleMMCLEVDOMPackageFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getGroup()); }
(rule__MMCLEVDOMPackageFile__Group__0)
{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMCLEVDOMPackageElement
entryRuleMMCLEVDOMPackageElement 
:
{ before(grammarAccess.getMMCLEVDOMPackageElementRule()); }
	 ruleMMCLEVDOMPackageElement
{ after(grammarAccess.getMMCLEVDOMPackageElementRule()); } 
	 EOF 
;

// Rule MMCLEVDOMPackageElement
ruleMMCLEVDOMPackageElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMCLEVDOMPackageElementAccess().getMDomainParserRuleCall()); }
	ruleMDomain
{ after(grammarAccess.getMMCLEVDOMPackageElementAccess().getMDomainParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDomain
entryRuleMDomain 
:
{ before(grammarAccess.getMDomainRule()); }
	 ruleMDomain
{ after(grammarAccess.getMDomainRule()); } 
	 EOF 
;

// Rule MDomain
ruleMDomain
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDomainAccess().getAlternatives()); }
(rule__MDomain__Alternatives)
{ after(grammarAccess.getMDomainAccess().getAlternatives()); }
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



// Entry rule entryRuleMIODomain
entryRuleMIODomain 
:
{ before(grammarAccess.getMIODomainRule()); }
	 ruleMIODomain
{ after(grammarAccess.getMIODomainRule()); } 
	 EOF 
;

// Rule MIODomain
ruleMIODomain
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIODomainAccess().getGroup()); }
(rule__MIODomain__Group__0)
{ after(grammarAccess.getMIODomainAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMIODomainSupportedPlatform
entryRuleMIODomainSupportedPlatform 
:
{ before(grammarAccess.getMIODomainSupportedPlatformRule()); }
	 ruleMIODomainSupportedPlatform
{ after(grammarAccess.getMIODomainSupportedPlatformRule()); } 
	 EOF 
;

// Rule MIODomainSupportedPlatform
ruleMIODomainSupportedPlatform
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup()); }
(rule__MIODomainSupportedPlatform__Group__0)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMAODomain
entryRuleMAODomain 
:
{ before(grammarAccess.getMAODomainRule()); }
	 ruleMAODomain
{ after(grammarAccess.getMAODomainRule()); } 
	 EOF 
;

// Rule MAODomain
ruleMAODomain
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMAODomainAccess().getGroup()); }
(rule__MAODomain__Group__0)
{ after(grammarAccess.getMAODomainAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMInterfaceType
entryRuleMInterfaceType 
:
{ before(grammarAccess.getMInterfaceTypeRule()); }
	 ruleMInterfaceType
{ after(grammarAccess.getMInterfaceTypeRule()); } 
	 EOF 
;

// Rule MInterfaceType
ruleMInterfaceType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getGroup()); }
(rule__MInterfaceType__Group__0)
{ after(grammarAccess.getMInterfaceTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMAODComponentType
entryRuleMAODComponentType 
:
{ before(grammarAccess.getMAODComponentTypeRule()); }
	 ruleMAODComponentType
{ after(grammarAccess.getMAODComponentTypeRule()); } 
	 EOF 
;

// Rule MAODComponentType
ruleMAODComponentType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getGroup()); }
(rule__MAODComponentType__Group__0)
{ after(grammarAccess.getMAODComponentTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMIODCType
entryRuleMIODCType 
:
{ before(grammarAccess.getMIODCTypeRule()); }
	 ruleMIODCType
{ after(grammarAccess.getMIODCTypeRule()); } 
	 EOF 
;

// Rule MIODCType
ruleMIODCType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIODCTypeAccess().getAlternatives()); }
(rule__MIODCType__Alternatives)
{ after(grammarAccess.getMIODCTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMIODAbstractComponentType
entryRuleMIODAbstractComponentType 
:
{ before(grammarAccess.getMIODAbstractComponentTypeRule()); }
	 ruleMIODAbstractComponentType
{ after(grammarAccess.getMIODAbstractComponentTypeRule()); } 
	 EOF 
;

// Rule MIODAbstractComponentType
ruleMIODAbstractComponentType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup()); }
(rule__MIODAbstractComponentType__Group__0)
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMIODComponentType
entryRuleMIODComponentType 
:
{ before(grammarAccess.getMIODComponentTypeRule()); }
	 ruleMIODComponentType
{ after(grammarAccess.getMIODComponentTypeRule()); } 
	 EOF 
;

// Rule MIODComponentType
ruleMIODComponentType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getGroup()); }
(rule__MIODComponentType__Group__0)
{ after(grammarAccess.getMIODComponentTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMIODComponentTypeInstance
entryRuleMIODComponentTypeInstance 
:
{ before(grammarAccess.getMIODComponentTypeInstanceRule()); }
	 ruleMIODComponentTypeInstance
{ after(grammarAccess.getMIODComponentTypeInstanceRule()); } 
	 EOF 
;

// Rule MIODComponentTypeInstance
ruleMIODComponentTypeInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIODComponentTypeInstanceAccess().getGroup()); }
(rule__MIODComponentTypeInstance__Group__0)
{ after(grammarAccess.getMIODComponentTypeInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMAODComponentTypeInstance
entryRuleMAODComponentTypeInstance 
:
{ before(grammarAccess.getMAODComponentTypeInstanceRule()); }
	 ruleMAODComponentTypeInstance
{ after(grammarAccess.getMAODComponentTypeInstanceRule()); } 
	 EOF 
;

// Rule MAODComponentTypeInstance
ruleMAODComponentTypeInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMAODComponentTypeInstanceAccess().getGroup()); }
(rule__MAODComponentTypeInstance__Group__0)
{ after(grammarAccess.getMAODComponentTypeInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMPortTypeInstance
entryRuleMPortTypeInstance 
:
{ before(grammarAccess.getMPortTypeInstanceRule()); }
	 ruleMPortTypeInstance
{ after(grammarAccess.getMPortTypeInstanceRule()); } 
	 EOF 
;

// Rule MPortTypeInstance
ruleMPortTypeInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMPortTypeInstanceAccess().getAlternatives()); }
(rule__MPortTypeInstance__Alternatives)
{ after(grammarAccess.getMPortTypeInstanceAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMExternalPortTypeInstance
entryRuleMExternalPortTypeInstance 
:
{ before(grammarAccess.getMExternalPortTypeInstanceRule()); }
	 ruleMExternalPortTypeInstance
{ after(grammarAccess.getMExternalPortTypeInstanceRule()); } 
	 EOF 
;

// Rule MExternalPortTypeInstance
ruleMExternalPortTypeInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMExternalPortTypeInstanceAccess().getAlternatives()); }
(rule__MExternalPortTypeInstance__Alternatives)
{ after(grammarAccess.getMExternalPortTypeInstanceAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMExternalClientPortTypeInstance
entryRuleMExternalClientPortTypeInstance 
:
{ before(grammarAccess.getMExternalClientPortTypeInstanceRule()); }
	 ruleMExternalClientPortTypeInstance
{ after(grammarAccess.getMExternalClientPortTypeInstanceRule()); } 
	 EOF 
;

// Rule MExternalClientPortTypeInstance
ruleMExternalClientPortTypeInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getGroup()); }
(rule__MExternalClientPortTypeInstance__Group__0)
{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMExternalServerPortTypeInstance
entryRuleMExternalServerPortTypeInstance 
:
{ before(grammarAccess.getMExternalServerPortTypeInstanceRule()); }
	 ruleMExternalServerPortTypeInstance
{ after(grammarAccess.getMExternalServerPortTypeInstanceRule()); } 
	 EOF 
;

// Rule MExternalServerPortTypeInstance
ruleMExternalServerPortTypeInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getGroup()); }
(rule__MExternalServerPortTypeInstance__Group__0)
{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMInternalPortTypeInstance
entryRuleMInternalPortTypeInstance 
:
{ before(grammarAccess.getMInternalPortTypeInstanceRule()); }
	 ruleMInternalPortTypeInstance
{ after(grammarAccess.getMInternalPortTypeInstanceRule()); } 
	 EOF 
;

// Rule MInternalPortTypeInstance
ruleMInternalPortTypeInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMInternalPortTypeInstanceAccess().getAlternatives()); }
(rule__MInternalPortTypeInstance__Alternatives)
{ after(grammarAccess.getMInternalPortTypeInstanceAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMInternalClientPortTypeInstance
entryRuleMInternalClientPortTypeInstance 
:
{ before(grammarAccess.getMInternalClientPortTypeInstanceRule()); }
	 ruleMInternalClientPortTypeInstance
{ after(grammarAccess.getMInternalClientPortTypeInstanceRule()); } 
	 EOF 
;

// Rule MInternalClientPortTypeInstance
ruleMInternalClientPortTypeInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getGroup()); }
(rule__MInternalClientPortTypeInstance__Group__0)
{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMInternalServerPortTypeInstance
entryRuleMInternalServerPortTypeInstance 
:
{ before(grammarAccess.getMInternalServerPortTypeInstanceRule()); }
	 ruleMInternalServerPortTypeInstance
{ after(grammarAccess.getMInternalServerPortTypeInstanceRule()); } 
	 EOF 
;

// Rule MInternalServerPortTypeInstance
ruleMInternalServerPortTypeInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getGroup()); }
(rule__MInternalServerPortTypeInstance__Group__0)
{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMPortType
entryRuleMPortType 
:
{ before(grammarAccess.getMPortTypeRule()); }
	 ruleMPortType
{ after(grammarAccess.getMPortTypeRule()); } 
	 EOF 
;

// Rule MPortType
ruleMPortType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMPortTypeAccess().getGroup()); }
(rule__MPortType__Group__0)
{ after(grammarAccess.getMPortTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMExchangeModel
entryRuleMExchangeModel 
:
{ before(grammarAccess.getMExchangeModelRule()); }
	 ruleMExchangeModel
{ after(grammarAccess.getMExchangeModelRule()); } 
	 EOF 
;

// Rule MExchangeModel
ruleMExchangeModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMExchangeModelAccess().getGroup()); }
(rule__MExchangeModel__Group__0)
{ after(grammarAccess.getMExchangeModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMConnector
entryRuleMConnector 
:
{ before(grammarAccess.getMConnectorRule()); }
	 ruleMConnector
{ after(grammarAccess.getMConnectorRule()); } 
	 EOF 
;

// Rule MConnector
ruleMConnector
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMConnectorAccess().getGroup()); }
(rule__MConnector__Group__0)
{ after(grammarAccess.getMConnectorAccess().getGroup()); }
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



rule__MDomain__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDomainAccess().getMIODomainParserRuleCall_0()); }
	ruleMIODomain
{ after(grammarAccess.getMDomainAccess().getMIODomainParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMDomainAccess().getMAODomainParserRuleCall_1()); }
	ruleMAODomain
{ after(grammarAccess.getMDomainAccess().getMAODomainParserRuleCall_1()); }
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

rule__MIODomainSupportedPlatform__Alternatives_4_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_0_2_0()); }

	'any' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_0_2_0()); }
)

    |(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiAssignment_4_0_2_1()); }
(rule__MIODomainSupportedPlatform__OsapiAssignment_4_0_2_1)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiAssignment_4_0_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Alternatives_4_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_1_2_0()); }

	'any' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_1_2_0()); }
)

    |(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getOsAssignment_4_1_2_1()); }
(rule__MIODomainSupportedPlatform__OsAssignment_4_1_2_1)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getOsAssignment_4_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Alternatives_4_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_2_2_0()); }

	'any' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_2_2_0()); }
)

    |(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureAssignment_4_2_2_1()); }
(rule__MIODomainSupportedPlatform__ArchitectureAssignment_4_2_2_1)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureAssignment_4_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Alternatives_4_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_4_2_0()); }

	'any' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_4_2_0()); }
)

    |(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorAssignment_4_4_2_1()); }
(rule__MIODomainSupportedPlatform__MicroprocessorAssignment_4_4_2_1)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorAssignment_4_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Alternatives_4_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_5_2_0()); }

	'any' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_5_2_0()); }
)

    |(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getBoardAssignment_4_5_2_1()); }
(rule__MIODomainSupportedPlatform__BoardAssignment_4_5_2_1)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getBoardAssignment_4_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODCType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODCTypeAccess().getMIODAbstractComponentTypeParserRuleCall_0()); }
	ruleMIODAbstractComponentType
{ after(grammarAccess.getMIODCTypeAccess().getMIODAbstractComponentTypeParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMIODCTypeAccess().getMIODComponentTypeParserRuleCall_1()); }
	ruleMIODComponentType
{ after(grammarAccess.getMIODCTypeAccess().getMIODComponentTypeParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPortTypeInstance__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeInstanceAccess().getMExternalPortTypeInstanceParserRuleCall_0()); }
	ruleMExternalPortTypeInstance
{ after(grammarAccess.getMPortTypeInstanceAccess().getMExternalPortTypeInstanceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMPortTypeInstanceAccess().getMInternalPortTypeInstanceParserRuleCall_1()); }
	ruleMInternalPortTypeInstance
{ after(grammarAccess.getMPortTypeInstanceAccess().getMInternalPortTypeInstanceParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalPortTypeInstance__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalPortTypeInstanceAccess().getMExternalClientPortTypeInstanceParserRuleCall_0()); }
	ruleMExternalClientPortTypeInstance
{ after(grammarAccess.getMExternalPortTypeInstanceAccess().getMExternalClientPortTypeInstanceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMExternalPortTypeInstanceAccess().getMExternalServerPortTypeInstanceParserRuleCall_1()); }
	ruleMExternalServerPortTypeInstance
{ after(grammarAccess.getMExternalPortTypeInstanceAccess().getMExternalServerPortTypeInstanceParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalPortTypeInstance__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalPortTypeInstanceAccess().getMInternalClientPortTypeInstanceParserRuleCall_0()); }
	ruleMInternalClientPortTypeInstance
{ after(grammarAccess.getMInternalPortTypeInstanceAccess().getMInternalClientPortTypeInstanceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMInternalPortTypeInstanceAccess().getMInternalServerPortTypeInstanceParserRuleCall_1()); }
	ruleMInternalServerPortTypeInstance
{ after(grammarAccess.getMInternalPortTypeInstanceAccess().getMInternalServerPortTypeInstanceParserRuleCall_1()); }
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



rule__MMCLEVDOMPackageFile__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVDOMPackageFile__Group__0__Impl
	rule__MMCLEVDOMPackageFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVDOMPackageFile__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVDOMPackageFile__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVDOMPackageFile__Group__1__Impl
	rule__MMCLEVDOMPackageFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVDOMPackageFile__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageAssignment_1()); }
(rule__MMCLEVDOMPackageFile__PackageAssignment_1)
{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVDOMPackageFile__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVDOMPackageFile__Group__2__Impl
	rule__MMCLEVDOMPackageFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVDOMPackageFile__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVDOMPackageFile__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVDOMPackageFile__Group__3__Impl
	rule__MMCLEVDOMPackageFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVDOMPackageFile__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getGroup_3()); }
(rule__MMCLEVDOMPackageFile__Group_3__0)*
{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVDOMPackageFile__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVDOMPackageFile__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVDOMPackageFile__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getElementAssignment_4()); }
(rule__MMCLEVDOMPackageFile__ElementAssignment_4)
{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getElementAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMCLEVDOMPackageFile__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVDOMPackageFile__Group_3__0__Impl
	rule__MMCLEVDOMPackageFile__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVDOMPackageFile__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getImportKeyword_3_0()); }

	'import' 

{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getImportKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVDOMPackageFile__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVDOMPackageFile__Group_3__1__Impl
	rule__MMCLEVDOMPackageFile__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVDOMPackageFile__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getImportsAssignment_3_1()); }
(rule__MMCLEVDOMPackageFile__ImportsAssignment_3_1)
{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getImportsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVDOMPackageFile__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVDOMPackageFile__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVDOMPackageFile__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getSemicolonKeyword_3_2()); }
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






rule__MIODomain__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group__0__Impl
	rule__MIODomain__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getIodomainKeyword_0()); }

	'iodomain' 

{ after(grammarAccess.getMIODomainAccess().getIodomainKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group__1__Impl
	rule__MIODomain__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getNameAssignment_1()); }
(rule__MIODomain__NameAssignment_1)
{ after(grammarAccess.getMIODomainAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group__2__Impl
	rule__MIODomain__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getGroup_2()); }
(rule__MIODomain__Group_2__0)?
{ after(grammarAccess.getMIODomainAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group__3__Impl
	rule__MIODomain__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group__4__Impl
	rule__MIODomain__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getUnorderedGroup_4()); }
(rule__MIODomain__UnorderedGroup_4)
{ after(grammarAccess.getMIODomainAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group__5__Impl
	rule__MIODomain__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MIODomain__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_2__0__Impl
	rule__MIODomain__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getInheritsKeyword_2_0()); }

	'inherits' 

{ after(grammarAccess.getMIODomainAccess().getInheritsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_2__1__Impl
	rule__MIODomain__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getInheritsAssignment_2_1()); }
(rule__MIODomain__InheritsAssignment_2_1)
{ after(grammarAccess.getMIODomainAccess().getInheritsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getGroup_2_2()); }
(rule__MIODomain__Group_2_2__0)*
{ after(grammarAccess.getMIODomainAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MIODomain__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_2_2__0__Impl
	rule__MIODomain__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getMIODomainAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getInheritsAssignment_2_2_1()); }
(rule__MIODomain__InheritsAssignment_2_2_1)
{ after(grammarAccess.getMIODomainAccess().getInheritsAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MIODomain__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_0__0__Impl
	rule__MIODomain__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getVersionKeyword_4_0_0()); }

	'version' 

{ after(grammarAccess.getMIODomainAccess().getVersionKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_0__1__Impl
	rule__MIODomain__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_0_1()); }

	':=' 

{ after(grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_0__2__Impl
	rule__MIODomain__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getVersionAssignment_4_0_2()); }
(rule__MIODomain__VersionAssignment_4_0_2)
{ after(grammarAccess.getMIODomainAccess().getVersionAssignment_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_0_3()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MIODomain__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_1__0__Impl
	rule__MIODomain__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLanguagesKeyword_4_1_0()); }

	'languages' 

{ after(grammarAccess.getMIODomainAccess().getLanguagesKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_1__1__Impl
	rule__MIODomain__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_1_1()); }

	':=' 

{ after(grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_1__2__Impl
	rule__MIODomain__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLanguagesAssignment_4_1_2()); }
(rule__MIODomain__LanguagesAssignment_4_1_2)
{ after(grammarAccess.getMIODomainAccess().getLanguagesAssignment_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_1__3__Impl
	rule__MIODomain__Group_4_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getGroup_4_1_3()); }
(rule__MIODomain__Group_4_1_3__0)*
{ after(grammarAccess.getMIODomainAccess().getGroup_4_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_1_4()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIODomain__Group_4_1_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_1_3__0__Impl
	rule__MIODomain__Group_4_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_1_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getCommaKeyword_4_1_3_0()); }

	',' 

{ after(grammarAccess.getMIODomainAccess().getCommaKeyword_4_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_1_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_1_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLanguagesAssignment_4_1_3_1()); }
(rule__MIODomain__LanguagesAssignment_4_1_3_1)
{ after(grammarAccess.getMIODomainAccess().getLanguagesAssignment_4_1_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MIODomain__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_2__0__Impl
	rule__MIODomain__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSingletonKeyword_4_2_0()); }

	'singleton' 

{ after(grammarAccess.getMIODomainAccess().getSingletonKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_2__1__Impl
	rule__MIODomain__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getInstancesKeyword_4_2_1()); }

	'instances' 

{ after(grammarAccess.getMIODomainAccess().getInstancesKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_2__2__Impl
	rule__MIODomain__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_2_2()); }

	':=' 

{ after(grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_2__3__Impl
	rule__MIODomain__Group_4_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getAllowsSingletonAssignment_4_2_3()); }
(rule__MIODomain__AllowsSingletonAssignment_4_2_3)
{ after(grammarAccess.getMIODomainAccess().getAllowsSingletonAssignment_4_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_2_4()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIODomain__Group_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_3__0__Impl
	rule__MIODomain__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getAttributesKeyword_4_3_0()); }

	'attributes' 

{ after(grammarAccess.getMIODomainAccess().getAttributesKeyword_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_3__1__Impl
	rule__MIODomain__Group_4_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_3_1()); }

	'{' 

{ after(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_3__2__Impl
	rule__MIODomain__Group_4_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODomainAccess().getAttributesAssignment_4_3_2()); }
(rule__MIODomain__AttributesAssignment_4_3_2)
{ after(grammarAccess.getMIODomainAccess().getAttributesAssignment_4_3_2()); }
)
(
{ before(grammarAccess.getMIODomainAccess().getAttributesAssignment_4_3_2()); }
(rule__MIODomain__AttributesAssignment_4_3_2)*
{ after(grammarAccess.getMIODomainAccess().getAttributesAssignment_4_3_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_3__3__Impl
	rule__MIODomain__Group_4_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_3_3()); }

	'}' 

{ after(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_3_4()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIODomain__Group_4_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_4__0__Impl
	rule__MIODomain__Group_4_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getInterfaceKeyword_4_4_0()); }

	'interface' 

{ after(grammarAccess.getMIODomainAccess().getInterfaceKeyword_4_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_4__1__Impl
	rule__MIODomain__Group_4_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getTypesKeyword_4_4_1()); }

	'types' 

{ after(grammarAccess.getMIODomainAccess().getTypesKeyword_4_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_4__2__Impl
	rule__MIODomain__Group_4_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_4_2()); }

	'{' 

{ after(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_4__3__Impl
	rule__MIODomain__Group_4_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODomainAccess().getInterfaceTypesAssignment_4_4_3()); }
(rule__MIODomain__InterfaceTypesAssignment_4_4_3)
{ after(grammarAccess.getMIODomainAccess().getInterfaceTypesAssignment_4_4_3()); }
)
(
{ before(grammarAccess.getMIODomainAccess().getInterfaceTypesAssignment_4_4_3()); }
(rule__MIODomain__InterfaceTypesAssignment_4_4_3)*
{ after(grammarAccess.getMIODomainAccess().getInterfaceTypesAssignment_4_4_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_4__4__Impl
	rule__MIODomain__Group_4_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_4_4()); }

	'}' 

{ after(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_4__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_4__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_4__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_4_5()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_4_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIODomain__Group_4_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_5__0__Impl
	rule__MIODomain__Group_4_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getPortKeyword_4_5_0()); }

	'port' 

{ after(grammarAccess.getMIODomainAccess().getPortKeyword_4_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_5__1__Impl
	rule__MIODomain__Group_4_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getTypesKeyword_4_5_1()); }

	'types' 

{ after(grammarAccess.getMIODomainAccess().getTypesKeyword_4_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_5__2__Impl
	rule__MIODomain__Group_4_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_5_2()); }

	'{' 

{ after(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_5__3__Impl
	rule__MIODomain__Group_4_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODomainAccess().getPortTypesAssignment_4_5_3()); }
(rule__MIODomain__PortTypesAssignment_4_5_3)
{ after(grammarAccess.getMIODomainAccess().getPortTypesAssignment_4_5_3()); }
)
(
{ before(grammarAccess.getMIODomainAccess().getPortTypesAssignment_4_5_3()); }
(rule__MIODomain__PortTypesAssignment_4_5_3)*
{ after(grammarAccess.getMIODomainAccess().getPortTypesAssignment_4_5_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_5__4__Impl
	rule__MIODomain__Group_4_5__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_5__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_5_4()); }

	'}' 

{ after(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_5_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_5__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_5__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_5_5()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_5_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIODomain__Group_4_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_6__0__Impl
	rule__MIODomain__Group_4_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getConnectorsKeyword_4_6_0()); }

	'connectors' 

{ after(grammarAccess.getMIODomainAccess().getConnectorsKeyword_4_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_6__1__Impl
	rule__MIODomain__Group_4_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_6_1()); }

	'{' 

{ after(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_6__2__Impl
	rule__MIODomain__Group_4_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODomainAccess().getConnectorsAssignment_4_6_2()); }
(rule__MIODomain__ConnectorsAssignment_4_6_2)
{ after(grammarAccess.getMIODomainAccess().getConnectorsAssignment_4_6_2()); }
)
(
{ before(grammarAccess.getMIODomainAccess().getConnectorsAssignment_4_6_2()); }
(rule__MIODomain__ConnectorsAssignment_4_6_2)*
{ after(grammarAccess.getMIODomainAccess().getConnectorsAssignment_4_6_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_6__3__Impl
	rule__MIODomain__Group_4_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_6_3()); }

	'}' 

{ after(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_6_4()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIODomain__Group_4_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_7__0__Impl
	rule__MIODomain__Group_4_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getExchangeKeyword_4_7_0()); }

	'exchange' 

{ after(grammarAccess.getMIODomainAccess().getExchangeKeyword_4_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_7__1__Impl
	rule__MIODomain__Group_4_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getModelsKeyword_4_7_1()); }

	'models' 

{ after(grammarAccess.getMIODomainAccess().getModelsKeyword_4_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_7__2__Impl
	rule__MIODomain__Group_4_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_7_2()); }

	'{' 

{ after(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_7__3__Impl
	rule__MIODomain__Group_4_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_7__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODomainAccess().getExchangeModelsAssignment_4_7_3()); }
(rule__MIODomain__ExchangeModelsAssignment_4_7_3)
{ after(grammarAccess.getMIODomainAccess().getExchangeModelsAssignment_4_7_3()); }
)
(
{ before(grammarAccess.getMIODomainAccess().getExchangeModelsAssignment_4_7_3()); }
(rule__MIODomain__ExchangeModelsAssignment_4_7_3)*
{ after(grammarAccess.getMIODomainAccess().getExchangeModelsAssignment_4_7_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_7__4__Impl
	rule__MIODomain__Group_4_7__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_7__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_7_4()); }

	'}' 

{ after(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_7_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_7__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_7__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_7__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_7_5()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_7_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIODomain__Group_4_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_8__0__Impl
	rule__MIODomain__Group_4_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getComponentKeyword_4_8_0()); }

	'component' 

{ after(grammarAccess.getMIODomainAccess().getComponentKeyword_4_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_8__1__Impl
	rule__MIODomain__Group_4_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getTypesKeyword_4_8_1()); }

	'types' 

{ after(grammarAccess.getMIODomainAccess().getTypesKeyword_4_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_8__2__Impl
	rule__MIODomain__Group_4_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_8_2()); }

	'{' 

{ after(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_8_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_8__3__Impl
	rule__MIODomain__Group_4_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_8__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODomainAccess().getComponentTypesAssignment_4_8_3()); }
(rule__MIODomain__ComponentTypesAssignment_4_8_3)
{ after(grammarAccess.getMIODomainAccess().getComponentTypesAssignment_4_8_3()); }
)
(
{ before(grammarAccess.getMIODomainAccess().getComponentTypesAssignment_4_8_3()); }
(rule__MIODomain__ComponentTypesAssignment_4_8_3)*
{ after(grammarAccess.getMIODomainAccess().getComponentTypesAssignment_4_8_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_8__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_8__4__Impl
	rule__MIODomain__Group_4_8__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_8__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_8_4()); }

	'}' 

{ after(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_8_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_8__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_8__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_8__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_8_5()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_8_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIODomain__Group_4_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_9__0__Impl
	rule__MIODomain__Group_4_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getInternalKeyword_4_9_0()); }

	'internal' 

{ after(grammarAccess.getMIODomainAccess().getInternalKeyword_4_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_9__1__Impl
	rule__MIODomain__Group_4_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getInstancesKeyword_4_9_1()); }

	'instances' 

{ after(grammarAccess.getMIODomainAccess().getInstancesKeyword_4_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_9__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_9__2__Impl
	rule__MIODomain__Group_4_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_9__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_9_2()); }

	'{' 

{ after(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_9_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_9__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_9__3__Impl
	rule__MIODomain__Group_4_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_9__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODomainAccess().getComponentTypeInstancesAssignment_4_9_3()); }
(rule__MIODomain__ComponentTypeInstancesAssignment_4_9_3)
{ after(grammarAccess.getMIODomainAccess().getComponentTypeInstancesAssignment_4_9_3()); }
)
(
{ before(grammarAccess.getMIODomainAccess().getComponentTypeInstancesAssignment_4_9_3()); }
(rule__MIODomain__ComponentTypeInstancesAssignment_4_9_3)*
{ after(grammarAccess.getMIODomainAccess().getComponentTypeInstancesAssignment_4_9_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_9__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_9__4__Impl
	rule__MIODomain__Group_4_9__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_9__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_9_4()); }

	'}' 

{ after(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_9_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_9__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_9__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_9__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_9_5()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_9_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIODomain__Group_4_10__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_10__0__Impl
	rule__MIODomain__Group_4_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_10__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRequiresKeyword_4_10_0()); }

	'requires' 

{ after(grammarAccess.getMIODomainAccess().getRequiresKeyword_4_10_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_10__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_10__1__Impl
	rule__MIODomain__Group_4_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_10__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_10_1()); }

	':=' 

{ after(grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_10_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_10__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_10__2__Impl
	rule__MIODomain__Group_4_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_10__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRequiresAssignment_4_10_2()); }
(rule__MIODomain__RequiresAssignment_4_10_2)
{ after(grammarAccess.getMIODomainAccess().getRequiresAssignment_4_10_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_10__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_10__3__Impl
	rule__MIODomain__Group_4_10__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_10__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getGroup_4_10_3()); }
(rule__MIODomain__Group_4_10_3__0)*
{ after(grammarAccess.getMIODomainAccess().getGroup_4_10_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_10__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_10__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_10__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_10_4()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_10_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIODomain__Group_4_10_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_10_3__0__Impl
	rule__MIODomain__Group_4_10_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_10_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getCommaKeyword_4_10_3_0()); }

	',' 

{ after(grammarAccess.getMIODomainAccess().getCommaKeyword_4_10_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_10_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_10_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_10_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRequiresAssignment_4_10_3_1()); }
(rule__MIODomain__RequiresAssignment_4_10_3_1)
{ after(grammarAccess.getMIODomainAccess().getRequiresAssignment_4_10_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MIODomain__Group_4_11__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_11__0__Impl
	rule__MIODomain__Group_4_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_11__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSupportedKeyword_4_11_0()); }

	'supported' 

{ after(grammarAccess.getMIODomainAccess().getSupportedKeyword_4_11_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_11__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_11__1__Impl
	rule__MIODomain__Group_4_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_11__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getPlatformsKeyword_4_11_1()); }

	'platforms' 

{ after(grammarAccess.getMIODomainAccess().getPlatformsKeyword_4_11_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_11__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_11__2__Impl
	rule__MIODomain__Group_4_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_11__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_11_2()); }

	'{' 

{ after(grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_11_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_11__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_11__3__Impl
	rule__MIODomain__Group_4_11__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_11__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODomainAccess().getSupportedPlatformsAssignment_4_11_3()); }
(rule__MIODomain__SupportedPlatformsAssignment_4_11_3)
{ after(grammarAccess.getMIODomainAccess().getSupportedPlatformsAssignment_4_11_3()); }
)
(
{ before(grammarAccess.getMIODomainAccess().getSupportedPlatformsAssignment_4_11_3()); }
(rule__MIODomain__SupportedPlatformsAssignment_4_11_3)*
{ after(grammarAccess.getMIODomainAccess().getSupportedPlatformsAssignment_4_11_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_11__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_11__4__Impl
	rule__MIODomain__Group_4_11__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_11__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_11_4()); }

	'}' 

{ after(grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_11_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__Group_4_11__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__Group_4_11__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__Group_4_11__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_11_5()); }

	';' 

{ after(grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_11_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIODomainSupportedPlatform__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group__0__Impl
	rule__MIODomainSupportedPlatform__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getSupportedKeyword_0()); }

	'supported' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getSupportedKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group__1__Impl
	rule__MIODomainSupportedPlatform__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getPlatformKeyword_1()); }

	'platform' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getPlatformKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group__2__Impl
	rule__MIODomainSupportedPlatform__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getNameAssignment_2()); }
(rule__MIODomainSupportedPlatform__NameAssignment_2)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group__3__Impl
	rule__MIODomainSupportedPlatform__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group__4__Impl
	rule__MIODomainSupportedPlatform__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4()); }
(rule__MIODomainSupportedPlatform__UnorderedGroup_4)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group__5__Impl
	rule__MIODomainSupportedPlatform__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MIODomainSupportedPlatform__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_0__0__Impl
	rule__MIODomainSupportedPlatform__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiKeyword_4_0_0()); }

	'osapi' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_0__1__Impl
	rule__MIODomainSupportedPlatform__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_0_1()); }

	':=' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_0__2__Impl
	rule__MIODomainSupportedPlatform__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_0_2()); }
(rule__MIODomainSupportedPlatform__Alternatives_4_0_2)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_0_3()); }

	';' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MIODomainSupportedPlatform__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_1__0__Impl
	rule__MIODomainSupportedPlatform__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getOsKeyword_4_1_0()); }

	'os' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getOsKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_1__1__Impl
	rule__MIODomainSupportedPlatform__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_1_1()); }

	':=' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_1__2__Impl
	rule__MIODomainSupportedPlatform__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_1_2()); }
(rule__MIODomainSupportedPlatform__Alternatives_4_1_2)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_1_3()); }

	';' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MIODomainSupportedPlatform__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_2__0__Impl
	rule__MIODomainSupportedPlatform__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureKeyword_4_2_0()); }

	'architecture' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_2__1__Impl
	rule__MIODomainSupportedPlatform__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_2_1()); }

	':=' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_2__2__Impl
	rule__MIODomainSupportedPlatform__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_2_2()); }
(rule__MIODomainSupportedPlatform__Alternatives_4_2_2)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_2_3()); }

	';' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MIODomainSupportedPlatform__Group_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_3__0__Impl
	rule__MIODomainSupportedPlatform__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerKeyword_4_3_0()); }

	'compiler' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerKeyword_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_3__1__Impl
	rule__MIODomainSupportedPlatform__Group_4_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_3_1()); }

	':=' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_3__2__Impl
	rule__MIODomainSupportedPlatform__Group_4_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerAssignment_4_3_2()); }
(rule__MIODomainSupportedPlatform__CompilerAssignment_4_3_2)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerAssignment_4_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_3_3()); }

	';' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MIODomainSupportedPlatform__Group_4_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_4__0__Impl
	rule__MIODomainSupportedPlatform__Group_4_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorKeyword_4_4_0()); }

	'microprocessor' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorKeyword_4_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_4__1__Impl
	rule__MIODomainSupportedPlatform__Group_4_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_4_1()); }

	':=' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_4__2__Impl
	rule__MIODomainSupportedPlatform__Group_4_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_4_2()); }
(rule__MIODomainSupportedPlatform__Alternatives_4_4_2)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_4_3()); }

	';' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MIODomainSupportedPlatform__Group_4_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_5__0__Impl
	rule__MIODomainSupportedPlatform__Group_4_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getBoardKeyword_4_5_0()); }

	'board' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getBoardKeyword_4_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_5__1__Impl
	rule__MIODomainSupportedPlatform__Group_4_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_5_1()); }

	':=' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_5__2__Impl
	rule__MIODomainSupportedPlatform__Group_4_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_5_2()); }
(rule__MIODomainSupportedPlatform__Alternatives_4_5_2)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAlternatives_4_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_5_3()); }

	';' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MIODomainSupportedPlatform__Group_4_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_6__0__Impl
	rule__MIODomainSupportedPlatform__Group_4_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesKeyword_4_6_0()); }

	'attributes' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesKeyword_4_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_6__1__Impl
	rule__MIODomainSupportedPlatform__Group_4_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getLeftCurlyBracketKeyword_4_6_1()); }

	'{' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getLeftCurlyBracketKeyword_4_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_6__2__Impl
	rule__MIODomainSupportedPlatform__Group_4_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesAssignment_4_6_2()); }
(rule__MIODomainSupportedPlatform__AttributesAssignment_4_6_2)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesAssignment_4_6_2()); }
)
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesAssignment_4_6_2()); }
(rule__MIODomainSupportedPlatform__AttributesAssignment_4_6_2)*
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesAssignment_4_6_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_6__3__Impl
	rule__MIODomainSupportedPlatform__Group_4_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getRightCurlyBracketKeyword_4_6_3()); }

	'}' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getRightCurlyBracketKeyword_4_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_6_4()); }

	';' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIODomainSupportedPlatform__Group_4_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_7__0__Impl
	rule__MIODomainSupportedPlatform__Group_4_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesKeyword_4_7_0()); }

	'languages' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesKeyword_4_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_7__1__Impl
	rule__MIODomainSupportedPlatform__Group_4_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_7_1()); }

	':=' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_7__2__Impl
	rule__MIODomainSupportedPlatform__Group_4_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesAssignment_4_7_2()); }
(rule__MIODomainSupportedPlatform__LanguagesAssignment_4_7_2)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesAssignment_4_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_7__3__Impl
	rule__MIODomainSupportedPlatform__Group_4_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_7__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_7_3()); }
(rule__MIODomainSupportedPlatform__Group_4_7_3__0)*
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_7_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_7__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_7__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_7_4()); }

	';' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_7_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIODomainSupportedPlatform__Group_4_7_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_7_3__0__Impl
	rule__MIODomainSupportedPlatform__Group_4_7_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_7_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getCommaKeyword_4_7_3_0()); }

	',' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getCommaKeyword_4_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_7_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_7_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_7_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesAssignment_4_7_3_1()); }
(rule__MIODomainSupportedPlatform__LanguagesAssignment_4_7_3_1)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesAssignment_4_7_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MIODomainSupportedPlatform__Group_4_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_8__0__Impl
	rule__MIODomainSupportedPlatform__Group_4_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresKeyword_4_8_0()); }

	'requires' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresKeyword_4_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_8__1__Impl
	rule__MIODomainSupportedPlatform__Group_4_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_8_1()); }

	':=' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_8__2__Impl
	rule__MIODomainSupportedPlatform__Group_4_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresAssignment_4_8_2()); }
(rule__MIODomainSupportedPlatform__RequiresAssignment_4_8_2)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresAssignment_4_8_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_8__3__Impl
	rule__MIODomainSupportedPlatform__Group_4_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_8__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_8_3()); }
(rule__MIODomainSupportedPlatform__Group_4_8_3__0)*
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_8_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_8__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_8__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_8__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_8_4()); }

	';' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_8_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIODomainSupportedPlatform__Group_4_8_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_8_3__0__Impl
	rule__MIODomainSupportedPlatform__Group_4_8_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_8_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getCommaKeyword_4_8_3_0()); }

	',' 

{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getCommaKeyword_4_8_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__Group_4_8_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__Group_4_8_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__Group_4_8_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresAssignment_4_8_3_1()); }
(rule__MIODomainSupportedPlatform__RequiresAssignment_4_8_3_1)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresAssignment_4_8_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MAODomain__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group__0__Impl
	rule__MAODomain__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getAodomainKeyword_0()); }

	'aodomain' 

{ after(grammarAccess.getMAODomainAccess().getAodomainKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group__1__Impl
	rule__MAODomain__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getNameAssignment_1()); }
(rule__MAODomain__NameAssignment_1)
{ after(grammarAccess.getMAODomainAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group__2__Impl
	rule__MAODomain__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getGroup_2()); }
(rule__MAODomain__Group_2__0)?
{ after(grammarAccess.getMAODomainAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group__3__Impl
	rule__MAODomain__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group__4__Impl
	rule__MAODomain__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getUnorderedGroup_4()); }
(rule__MAODomain__UnorderedGroup_4)
{ after(grammarAccess.getMAODomainAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group__5__Impl
	rule__MAODomain__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMAODomainAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MAODomain__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_2__0__Impl
	rule__MAODomain__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getInheritsKeyword_2_0()); }

	'inherits' 

{ after(grammarAccess.getMAODomainAccess().getInheritsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_2__1__Impl
	rule__MAODomain__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getInheritsAssignment_2_1()); }
(rule__MAODomain__InheritsAssignment_2_1)
{ after(grammarAccess.getMAODomainAccess().getInheritsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getGroup_2_2()); }
(rule__MAODomain__Group_2_2__0)*
{ after(grammarAccess.getMAODomainAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MAODomain__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_2_2__0__Impl
	rule__MAODomain__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getMAODomainAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getInheritsAssignment_2_2_1()); }
(rule__MAODomain__InheritsAssignment_2_2_1)
{ after(grammarAccess.getMAODomainAccess().getInheritsAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MAODomain__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_0__0__Impl
	rule__MAODomain__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getVersionKeyword_4_0_0()); }

	'version' 

{ after(grammarAccess.getMAODomainAccess().getVersionKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_0__1__Impl
	rule__MAODomain__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getColonEqualsSignKeyword_4_0_1()); }

	':=' 

{ after(grammarAccess.getMAODomainAccess().getColonEqualsSignKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_0__2__Impl
	rule__MAODomain__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getVersionAssignment_4_0_2()); }
(rule__MAODomain__VersionAssignment_4_0_2)
{ after(grammarAccess.getMAODomainAccess().getVersionAssignment_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_0_3()); }

	';' 

{ after(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MAODomain__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_1__0__Impl
	rule__MAODomain__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getOutputKeyword_4_1_0()); }

	'output' 

{ after(grammarAccess.getMAODomainAccess().getOutputKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_1__1__Impl
	rule__MAODomain__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getIodomainsKeyword_4_1_1()); }

	'iodomains' 

{ after(grammarAccess.getMAODomainAccess().getIodomainsKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_1__2__Impl
	rule__MAODomain__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getColonEqualsSignKeyword_4_1_2()); }

	':=' 

{ after(grammarAccess.getMAODomainAccess().getColonEqualsSignKeyword_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_1__3__Impl
	rule__MAODomain__Group_4_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getOutputIODomainsAssignment_4_1_3()); }
(rule__MAODomain__OutputIODomainsAssignment_4_1_3)
{ after(grammarAccess.getMAODomainAccess().getOutputIODomainsAssignment_4_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_1__4__Impl
	rule__MAODomain__Group_4_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getGroup_4_1_4()); }
(rule__MAODomain__Group_4_1_4__0)*
{ after(grammarAccess.getMAODomainAccess().getGroup_4_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_1_5()); }

	';' 

{ after(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MAODomain__Group_4_1_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_1_4__0__Impl
	rule__MAODomain__Group_4_1_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_1_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getCommaKeyword_4_1_4_0()); }

	',' 

{ after(grammarAccess.getMAODomainAccess().getCommaKeyword_4_1_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_1_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_1_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_1_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getOutputIODomainsAssignment_4_1_4_1()); }
(rule__MAODomain__OutputIODomainsAssignment_4_1_4_1)
{ after(grammarAccess.getMAODomainAccess().getOutputIODomainsAssignment_4_1_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MAODomain__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_2__0__Impl
	rule__MAODomain__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getAttributesKeyword_4_2_0()); }

	'attributes' 

{ after(grammarAccess.getMAODomainAccess().getAttributesKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_2__1__Impl
	rule__MAODomain__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_2_1()); }

	'{' 

{ after(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_2__2__Impl
	rule__MAODomain__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAODomainAccess().getAttributesAssignment_4_2_2()); }
(rule__MAODomain__AttributesAssignment_4_2_2)
{ after(grammarAccess.getMAODomainAccess().getAttributesAssignment_4_2_2()); }
)
(
{ before(grammarAccess.getMAODomainAccess().getAttributesAssignment_4_2_2()); }
(rule__MAODomain__AttributesAssignment_4_2_2)*
{ after(grammarAccess.getMAODomainAccess().getAttributesAssignment_4_2_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_2__3__Impl
	rule__MAODomain__Group_4_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_2_3()); }

	'}' 

{ after(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_2_4()); }

	';' 

{ after(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MAODomain__Group_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_3__0__Impl
	rule__MAODomain__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getInterfaceKeyword_4_3_0()); }

	'interface' 

{ after(grammarAccess.getMAODomainAccess().getInterfaceKeyword_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_3__1__Impl
	rule__MAODomain__Group_4_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getTypesKeyword_4_3_1()); }

	'types' 

{ after(grammarAccess.getMAODomainAccess().getTypesKeyword_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_3__2__Impl
	rule__MAODomain__Group_4_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_3_2()); }

	'{' 

{ after(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_3__3__Impl
	rule__MAODomain__Group_4_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAODomainAccess().getInterfaceTypesAssignment_4_3_3()); }
(rule__MAODomain__InterfaceTypesAssignment_4_3_3)
{ after(grammarAccess.getMAODomainAccess().getInterfaceTypesAssignment_4_3_3()); }
)
(
{ before(grammarAccess.getMAODomainAccess().getInterfaceTypesAssignment_4_3_3()); }
(rule__MAODomain__InterfaceTypesAssignment_4_3_3)*
{ after(grammarAccess.getMAODomainAccess().getInterfaceTypesAssignment_4_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_3__4__Impl
	rule__MAODomain__Group_4_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_3_4()); }

	'}' 

{ after(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_3_5()); }

	';' 

{ after(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MAODomain__Group_4_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_4__0__Impl
	rule__MAODomain__Group_4_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getPortKeyword_4_4_0()); }

	'port' 

{ after(grammarAccess.getMAODomainAccess().getPortKeyword_4_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_4__1__Impl
	rule__MAODomain__Group_4_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getTypesKeyword_4_4_1()); }

	'types' 

{ after(grammarAccess.getMAODomainAccess().getTypesKeyword_4_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_4__2__Impl
	rule__MAODomain__Group_4_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_4_2()); }

	'{' 

{ after(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_4__3__Impl
	rule__MAODomain__Group_4_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAODomainAccess().getPortTypesAssignment_4_4_3()); }
(rule__MAODomain__PortTypesAssignment_4_4_3)
{ after(grammarAccess.getMAODomainAccess().getPortTypesAssignment_4_4_3()); }
)
(
{ before(grammarAccess.getMAODomainAccess().getPortTypesAssignment_4_4_3()); }
(rule__MAODomain__PortTypesAssignment_4_4_3)*
{ after(grammarAccess.getMAODomainAccess().getPortTypesAssignment_4_4_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_4__4__Impl
	rule__MAODomain__Group_4_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_4_4()); }

	'}' 

{ after(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_4__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_4__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_4__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_4_5()); }

	';' 

{ after(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_4_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MAODomain__Group_4_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_5__0__Impl
	rule__MAODomain__Group_4_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getConnectorsKeyword_4_5_0()); }

	'connectors' 

{ after(grammarAccess.getMAODomainAccess().getConnectorsKeyword_4_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_5__1__Impl
	rule__MAODomain__Group_4_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_5_1()); }

	'{' 

{ after(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_5__2__Impl
	rule__MAODomain__Group_4_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAODomainAccess().getConnectorsAssignment_4_5_2()); }
(rule__MAODomain__ConnectorsAssignment_4_5_2)
{ after(grammarAccess.getMAODomainAccess().getConnectorsAssignment_4_5_2()); }
)
(
{ before(grammarAccess.getMAODomainAccess().getConnectorsAssignment_4_5_2()); }
(rule__MAODomain__ConnectorsAssignment_4_5_2)*
{ after(grammarAccess.getMAODomainAccess().getConnectorsAssignment_4_5_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_5__3__Impl
	rule__MAODomain__Group_4_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_5_3()); }

	'}' 

{ after(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_5__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_5_4()); }

	';' 

{ after(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_5_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MAODomain__Group_4_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_6__0__Impl
	rule__MAODomain__Group_4_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getComponentKeyword_4_6_0()); }

	'component' 

{ after(grammarAccess.getMAODomainAccess().getComponentKeyword_4_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_6__1__Impl
	rule__MAODomain__Group_4_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getTypesKeyword_4_6_1()); }

	'types' 

{ after(grammarAccess.getMAODomainAccess().getTypesKeyword_4_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_6__2__Impl
	rule__MAODomain__Group_4_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_6_2()); }

	'{' 

{ after(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_6__3__Impl
	rule__MAODomain__Group_4_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAODomainAccess().getComponentTypesAssignment_4_6_3()); }
(rule__MAODomain__ComponentTypesAssignment_4_6_3)
{ after(grammarAccess.getMAODomainAccess().getComponentTypesAssignment_4_6_3()); }
)
(
{ before(grammarAccess.getMAODomainAccess().getComponentTypesAssignment_4_6_3()); }
(rule__MAODomain__ComponentTypesAssignment_4_6_3)*
{ after(grammarAccess.getMAODomainAccess().getComponentTypesAssignment_4_6_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_6__4__Impl
	rule__MAODomain__Group_4_6__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_6_4()); }

	'}' 

{ after(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_6__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_6__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_6__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_6_5()); }

	';' 

{ after(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_6_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MAODomain__Group_4_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_7__0__Impl
	rule__MAODomain__Group_4_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getInternalKeyword_4_7_0()); }

	'internal' 

{ after(grammarAccess.getMAODomainAccess().getInternalKeyword_4_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_7__1__Impl
	rule__MAODomain__Group_4_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getInstancesKeyword_4_7_1()); }

	'instances' 

{ after(grammarAccess.getMAODomainAccess().getInstancesKeyword_4_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_7__2__Impl
	rule__MAODomain__Group_4_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_7_2()); }

	'{' 

{ after(grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_7__3__Impl
	rule__MAODomain__Group_4_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_7__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAODomainAccess().getComponentTypeInstancesAssignment_4_7_3()); }
(rule__MAODomain__ComponentTypeInstancesAssignment_4_7_3)
{ after(grammarAccess.getMAODomainAccess().getComponentTypeInstancesAssignment_4_7_3()); }
)
(
{ before(grammarAccess.getMAODomainAccess().getComponentTypeInstancesAssignment_4_7_3()); }
(rule__MAODomain__ComponentTypeInstancesAssignment_4_7_3)*
{ after(grammarAccess.getMAODomainAccess().getComponentTypeInstancesAssignment_4_7_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_7__4__Impl
	rule__MAODomain__Group_4_7__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_7__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_7_4()); }

	'}' 

{ after(grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_7_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__Group_4_7__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__Group_4_7__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__Group_4_7__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_7_5()); }

	';' 

{ after(grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_7_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MInterfaceType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInterfaceType__Group__0__Impl
	rule__MInterfaceType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getInterfaceKeyword_0()); }

	'interface' 

{ after(grammarAccess.getMInterfaceTypeAccess().getInterfaceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInterfaceType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInterfaceType__Group__1__Impl
	rule__MInterfaceType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getTypeKeyword_1()); }

	'type' 

{ after(grammarAccess.getMInterfaceTypeAccess().getTypeKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInterfaceType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInterfaceType__Group__2__Impl
	rule__MInterfaceType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getNameAssignment_2()); }
(rule__MInterfaceType__NameAssignment_2)
{ after(grammarAccess.getMInterfaceTypeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInterfaceType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInterfaceType__Group__3__Impl
	rule__MInterfaceType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getGroup_3()); }
(rule__MInterfaceType__Group_3__0)?
{ after(grammarAccess.getMInterfaceTypeAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInterfaceType__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInterfaceType__Group__4__Impl
	rule__MInterfaceType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMInterfaceTypeAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInterfaceType__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInterfaceType__Group__5__Impl
	rule__MInterfaceType__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMInterfaceTypeAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInterfaceType__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInterfaceType__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMInterfaceTypeAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MInterfaceType__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInterfaceType__Group_3__0__Impl
	rule__MInterfaceType__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getInheritsKeyword_3_0()); }

	'inherits' 

{ after(grammarAccess.getMInterfaceTypeAccess().getInheritsKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInterfaceType__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInterfaceType__Group_3__1__Impl
	rule__MInterfaceType__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getInheritsAssignment_3_1()); }
(rule__MInterfaceType__InheritsAssignment_3_1)
{ after(grammarAccess.getMInterfaceTypeAccess().getInheritsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInterfaceType__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInterfaceType__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getGroup_3_2()); }
(rule__MInterfaceType__Group_3_2__0)*
{ after(grammarAccess.getMInterfaceTypeAccess().getGroup_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MInterfaceType__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInterfaceType__Group_3_2__0__Impl
	rule__MInterfaceType__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getCommaKeyword_3_2_0()); }

	',' 

{ after(grammarAccess.getMInterfaceTypeAccess().getCommaKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInterfaceType__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInterfaceType__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getInheritsAssignment_3_2_1()); }
(rule__MInterfaceType__InheritsAssignment_3_2_1)
{ after(grammarAccess.getMInterfaceTypeAccess().getInheritsAssignment_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MAODComponentType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group__0__Impl
	rule__MAODComponentType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getComponentKeyword_0()); }

	'component' 

{ after(grammarAccess.getMAODComponentTypeAccess().getComponentKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group__1__Impl
	rule__MAODComponentType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getTypeKeyword_1()); }

	'type' 

{ after(grammarAccess.getMAODComponentTypeAccess().getTypeKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group__2__Impl
	rule__MAODComponentType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getNameAssignment_2()); }
(rule__MAODComponentType__NameAssignment_2)
{ after(grammarAccess.getMAODComponentTypeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group__3__Impl
	rule__MAODComponentType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getGroup_3()); }
(rule__MAODComponentType__Group_3__0)?
{ after(grammarAccess.getMAODComponentTypeAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group__4__Impl
	rule__MAODComponentType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group__5__Impl
	rule__MAODComponentType__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5()); }
(rule__MAODComponentType__UnorderedGroup_5)
{ after(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group__6__Impl
	rule__MAODComponentType__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MAODComponentType__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_3__0__Impl
	rule__MAODComponentType__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getInheritsKeyword_3_0()); }

	'inherits' 

{ after(grammarAccess.getMAODComponentTypeAccess().getInheritsKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_3__1__Impl
	rule__MAODComponentType__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getInheritsAssignment_3_1()); }
(rule__MAODComponentType__InheritsAssignment_3_1)
{ after(grammarAccess.getMAODComponentTypeAccess().getInheritsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getGroup_3_2()); }
(rule__MAODComponentType__Group_3_2__0)*
{ after(grammarAccess.getMAODComponentTypeAccess().getGroup_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MAODComponentType__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_3_2__0__Impl
	rule__MAODComponentType__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getCommaKeyword_3_2_0()); }

	',' 

{ after(grammarAccess.getMAODComponentTypeAccess().getCommaKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getInheritsAssignment_3_2_1()); }
(rule__MAODComponentType__InheritsAssignment_3_2_1)
{ after(grammarAccess.getMAODComponentTypeAccess().getInheritsAssignment_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MAODComponentType__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_0__0__Impl
	rule__MAODComponentType__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getAttributesKeyword_5_0_0()); }

	'attributes' 

{ after(grammarAccess.getMAODComponentTypeAccess().getAttributesKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_0__1__Impl
	rule__MAODComponentType__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_5_0_1()); }

	'{' 

{ after(grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_0__2__Impl
	rule__MAODComponentType__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAODComponentTypeAccess().getAttributesAssignment_5_0_2()); }
(rule__MAODComponentType__AttributesAssignment_5_0_2)
{ after(grammarAccess.getMAODComponentTypeAccess().getAttributesAssignment_5_0_2()); }
)
(
{ before(grammarAccess.getMAODComponentTypeAccess().getAttributesAssignment_5_0_2()); }
(rule__MAODComponentType__AttributesAssignment_5_0_2)*
{ after(grammarAccess.getMAODComponentTypeAccess().getAttributesAssignment_5_0_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_0__3__Impl
	rule__MAODComponentType__Group_5_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_5_0_3()); }

	'}' 

{ after(grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_0__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_0__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_0__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_5_0_4()); }

	';' 

{ after(grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_5_0_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MAODComponentType__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_1__0__Impl
	rule__MAODComponentType__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getPortKeyword_5_1_0()); }

	'port' 

{ after(grammarAccess.getMAODComponentTypeAccess().getPortKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_1__1__Impl
	rule__MAODComponentType__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getInstancesKeyword_5_1_1()); }

	'instances' 

{ after(grammarAccess.getMAODComponentTypeAccess().getInstancesKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_1__2__Impl
	rule__MAODComponentType__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_5_1_2()); }

	'{' 

{ after(grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_1__3__Impl
	rule__MAODComponentType__Group_5_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAODComponentTypeAccess().getPortTypeInstancesAssignment_5_1_3()); }
(rule__MAODComponentType__PortTypeInstancesAssignment_5_1_3)
{ after(grammarAccess.getMAODComponentTypeAccess().getPortTypeInstancesAssignment_5_1_3()); }
)
(
{ before(grammarAccess.getMAODComponentTypeAccess().getPortTypeInstancesAssignment_5_1_3()); }
(rule__MAODComponentType__PortTypeInstancesAssignment_5_1_3)*
{ after(grammarAccess.getMAODComponentTypeAccess().getPortTypeInstancesAssignment_5_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_1__4__Impl
	rule__MAODComponentType__Group_5_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_5_1_4()); }

	'}' 

{ after(grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_5_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_5_1_5()); }

	';' 

{ after(grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_5_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MAODComponentType__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_2__0__Impl
	rule__MAODComponentType__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getInternalKeyword_5_2_0()); }

	'internal' 

{ after(grammarAccess.getMAODComponentTypeAccess().getInternalKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_2__1__Impl
	rule__MAODComponentType__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getInstancesKeyword_5_2_1()); }

	'instances' 

{ after(grammarAccess.getMAODComponentTypeAccess().getInstancesKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_2__2__Impl
	rule__MAODComponentType__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_5_2_2()); }

	'{' 

{ after(grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_2__3__Impl
	rule__MAODComponentType__Group_5_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAODComponentTypeAccess().getComponentTypeInstancesAssignment_5_2_3()); }
(rule__MAODComponentType__ComponentTypeInstancesAssignment_5_2_3)
{ after(grammarAccess.getMAODComponentTypeAccess().getComponentTypeInstancesAssignment_5_2_3()); }
)
(
{ before(grammarAccess.getMAODComponentTypeAccess().getComponentTypeInstancesAssignment_5_2_3()); }
(rule__MAODComponentType__ComponentTypeInstancesAssignment_5_2_3)*
{ after(grammarAccess.getMAODComponentTypeAccess().getComponentTypeInstancesAssignment_5_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_2__4__Impl
	rule__MAODComponentType__Group_5_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_5_2_4()); }

	'}' 

{ after(grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_5_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__Group_5_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__Group_5_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__Group_5_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_5_2_5()); }

	';' 

{ after(grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_5_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIODAbstractComponentType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group__0__Impl
	rule__MIODAbstractComponentType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getAbstractKeyword_0()); }

	'abstract' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getAbstractKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group__1__Impl
	rule__MIODAbstractComponentType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getComponentKeyword_1()); }

	'component' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getComponentKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group__2__Impl
	rule__MIODAbstractComponentType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getTypeKeyword_2()); }

	'type' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getTypeKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group__3__Impl
	rule__MIODAbstractComponentType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getNameAssignment_3()); }
(rule__MIODAbstractComponentType__NameAssignment_3)
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group__4__Impl
	rule__MIODAbstractComponentType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_4()); }
(rule__MIODAbstractComponentType__Group_4__0)?
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group__5__Impl
	rule__MIODAbstractComponentType__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group__6__Impl
	rule__MIODAbstractComponentType__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6()); }
(rule__MIODAbstractComponentType__UnorderedGroup_6)
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group__7__Impl
	rule__MIODAbstractComponentType__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MIODAbstractComponentType__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_4__0__Impl
	rule__MIODAbstractComponentType__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsKeyword_4_0()); }

	'inherits' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_4__1__Impl
	rule__MIODAbstractComponentType__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsAssignment_4_1()); }
(rule__MIODAbstractComponentType__InheritsAssignment_4_1)
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_4_2()); }
(rule__MIODAbstractComponentType__Group_4_2__0)*
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MIODAbstractComponentType__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_4_2__0__Impl
	rule__MIODAbstractComponentType__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getCommaKeyword_4_2_0()); }

	',' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getCommaKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsAssignment_4_2_1()); }
(rule__MIODAbstractComponentType__InheritsAssignment_4_2_1)
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsAssignment_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MIODAbstractComponentType__Group_6_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_0__0__Impl
	rule__MIODAbstractComponentType__Group_6_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesKeyword_6_0_0()); }

	'attributes' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesKeyword_6_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_0__1__Impl
	rule__MIODAbstractComponentType__Group_6_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_6_0_1()); }

	'{' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_6_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_0__2__Impl
	rule__MIODAbstractComponentType__Group_6_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesAssignment_6_0_2()); }
(rule__MIODAbstractComponentType__AttributesAssignment_6_0_2)
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesAssignment_6_0_2()); }
)
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesAssignment_6_0_2()); }
(rule__MIODAbstractComponentType__AttributesAssignment_6_0_2)*
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesAssignment_6_0_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_0__3__Impl
	rule__MIODAbstractComponentType__Group_6_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_6_0_3()); }

	'}' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_6_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_0__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_0__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_0__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_6_0_4()); }

	';' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_6_0_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIODAbstractComponentType__Group_6_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_1__0__Impl
	rule__MIODAbstractComponentType__Group_6_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getPortKeyword_6_1_0()); }

	'port' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getPortKeyword_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_1__1__Impl
	rule__MIODAbstractComponentType__Group_6_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getInstancesKeyword_6_1_1()); }

	'instances' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getInstancesKeyword_6_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_1__2__Impl
	rule__MIODAbstractComponentType__Group_6_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_6_1_2()); }

	'{' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_6_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_1__3__Impl
	rule__MIODAbstractComponentType__Group_6_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getPortTypeInstancesAssignment_6_1_3()); }
(rule__MIODAbstractComponentType__PortTypeInstancesAssignment_6_1_3)
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getPortTypeInstancesAssignment_6_1_3()); }
)
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getPortTypeInstancesAssignment_6_1_3()); }
(rule__MIODAbstractComponentType__PortTypeInstancesAssignment_6_1_3)*
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getPortTypeInstancesAssignment_6_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_1__4__Impl
	rule__MIODAbstractComponentType__Group_6_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_6_1_4()); }

	'}' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_6_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_6_1_5()); }

	';' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_6_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIODAbstractComponentType__Group_6_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_2__0__Impl
	rule__MIODAbstractComponentType__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getInternalKeyword_6_2_0()); }

	'internal' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getInternalKeyword_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_2__1__Impl
	rule__MIODAbstractComponentType__Group_6_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getInstancesKeyword_6_2_1()); }

	'instances' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getInstancesKeyword_6_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_2__2__Impl
	rule__MIODAbstractComponentType__Group_6_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_6_2_2()); }

	'{' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_6_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_2__3__Impl
	rule__MIODAbstractComponentType__Group_6_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getComponentTypeInstancesAssignment_6_2_3()); }
(rule__MIODAbstractComponentType__ComponentTypeInstancesAssignment_6_2_3)
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getComponentTypeInstancesAssignment_6_2_3()); }
)
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getComponentTypeInstancesAssignment_6_2_3()); }
(rule__MIODAbstractComponentType__ComponentTypeInstancesAssignment_6_2_3)*
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getComponentTypeInstancesAssignment_6_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_2__4__Impl
	rule__MIODAbstractComponentType__Group_6_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_6_2_4()); }

	'}' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_6_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__Group_6_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__Group_6_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__Group_6_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_6_2_5()); }

	';' 

{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_6_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIODComponentType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group__0__Impl
	rule__MIODComponentType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getComponentKeyword_0()); }

	'component' 

{ after(grammarAccess.getMIODComponentTypeAccess().getComponentKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group__1__Impl
	rule__MIODComponentType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getTypeKeyword_1()); }

	'type' 

{ after(grammarAccess.getMIODComponentTypeAccess().getTypeKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group__2__Impl
	rule__MIODComponentType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getNameAssignment_2()); }
(rule__MIODComponentType__NameAssignment_2)
{ after(grammarAccess.getMIODComponentTypeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group__3__Impl
	rule__MIODComponentType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getGroup_3()); }
(rule__MIODComponentType__Group_3__0)?
{ after(grammarAccess.getMIODComponentTypeAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group__4__Impl
	rule__MIODComponentType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group__5__Impl
	rule__MIODComponentType__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5()); }
(rule__MIODComponentType__UnorderedGroup_5)
{ after(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group__6__Impl
	rule__MIODComponentType__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MIODComponentType__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_3__0__Impl
	rule__MIODComponentType__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getInheritsKeyword_3_0()); }

	'inherits' 

{ after(grammarAccess.getMIODComponentTypeAccess().getInheritsKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_3__1__Impl
	rule__MIODComponentType__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getInheritsAssignment_3_1()); }
(rule__MIODComponentType__InheritsAssignment_3_1)
{ after(grammarAccess.getMIODComponentTypeAccess().getInheritsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getGroup_3_2()); }
(rule__MIODComponentType__Group_3_2__0)*
{ after(grammarAccess.getMIODComponentTypeAccess().getGroup_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MIODComponentType__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_3_2__0__Impl
	rule__MIODComponentType__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getCommaKeyword_3_2_0()); }

	',' 

{ after(grammarAccess.getMIODComponentTypeAccess().getCommaKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getInheritsAssignment_3_2_1()); }
(rule__MIODComponentType__InheritsAssignment_3_2_1)
{ after(grammarAccess.getMIODComponentTypeAccess().getInheritsAssignment_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MIODComponentType__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_0__0__Impl
	rule__MIODComponentType__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getLanguageKeyword_5_0_0()); }

	'language' 

{ after(grammarAccess.getMIODComponentTypeAccess().getLanguageKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_0__1__Impl
	rule__MIODComponentType__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getMIODComponentTypeAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_0__2__Impl
	rule__MIODComponentType__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getLanguageAssignment_5_0_2()); }
(rule__MIODComponentType__LanguageAssignment_5_0_2)
{ after(grammarAccess.getMIODComponentTypeAccess().getLanguageAssignment_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MIODComponentType__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_1__0__Impl
	rule__MIODComponentType__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getAttributesKeyword_5_1_0()); }

	'attributes' 

{ after(grammarAccess.getMIODComponentTypeAccess().getAttributesKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_1__1__Impl
	rule__MIODComponentType__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_5_1_1()); }

	'{' 

{ after(grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_1__2__Impl
	rule__MIODComponentType__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODComponentTypeAccess().getAttributesAssignment_5_1_2()); }
(rule__MIODComponentType__AttributesAssignment_5_1_2)
{ after(grammarAccess.getMIODComponentTypeAccess().getAttributesAssignment_5_1_2()); }
)
(
{ before(grammarAccess.getMIODComponentTypeAccess().getAttributesAssignment_5_1_2()); }
(rule__MIODComponentType__AttributesAssignment_5_1_2)*
{ after(grammarAccess.getMIODComponentTypeAccess().getAttributesAssignment_5_1_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_1__3__Impl
	rule__MIODComponentType__Group_5_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_5_1_3()); }

	'}' 

{ after(grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_5_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_1_4()); }

	';' 

{ after(grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIODComponentType__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_2__0__Impl
	rule__MIODComponentType__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getPortKeyword_5_2_0()); }

	'port' 

{ after(grammarAccess.getMIODComponentTypeAccess().getPortKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_2__1__Impl
	rule__MIODComponentType__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getInstancesKeyword_5_2_1()); }

	'instances' 

{ after(grammarAccess.getMIODComponentTypeAccess().getInstancesKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_2__2__Impl
	rule__MIODComponentType__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_5_2_2()); }

	'{' 

{ after(grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_2__3__Impl
	rule__MIODComponentType__Group_5_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODComponentTypeAccess().getPortTypeInstancesAssignment_5_2_3()); }
(rule__MIODComponentType__PortTypeInstancesAssignment_5_2_3)
{ after(grammarAccess.getMIODComponentTypeAccess().getPortTypeInstancesAssignment_5_2_3()); }
)
(
{ before(grammarAccess.getMIODComponentTypeAccess().getPortTypeInstancesAssignment_5_2_3()); }
(rule__MIODComponentType__PortTypeInstancesAssignment_5_2_3)*
{ after(grammarAccess.getMIODComponentTypeAccess().getPortTypeInstancesAssignment_5_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_2__4__Impl
	rule__MIODComponentType__Group_5_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_5_2_4()); }

	'}' 

{ after(grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_5_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_2_5()); }

	';' 

{ after(grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIODComponentType__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_3__0__Impl
	rule__MIODComponentType__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getInternalKeyword_5_3_0()); }

	'internal' 

{ after(grammarAccess.getMIODComponentTypeAccess().getInternalKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_3__1__Impl
	rule__MIODComponentType__Group_5_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getInstancesKeyword_5_3_1()); }

	'instances' 

{ after(grammarAccess.getMIODComponentTypeAccess().getInstancesKeyword_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_3__2__Impl
	rule__MIODComponentType__Group_5_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_5_3_2()); }

	'{' 

{ after(grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_5_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_3__3__Impl
	rule__MIODComponentType__Group_5_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIODComponentTypeAccess().getComponentTypeInstancesAssignment_5_3_3()); }
(rule__MIODComponentType__ComponentTypeInstancesAssignment_5_3_3)
{ after(grammarAccess.getMIODComponentTypeAccess().getComponentTypeInstancesAssignment_5_3_3()); }
)
(
{ before(grammarAccess.getMIODComponentTypeAccess().getComponentTypeInstancesAssignment_5_3_3()); }
(rule__MIODComponentType__ComponentTypeInstancesAssignment_5_3_3)*
{ after(grammarAccess.getMIODComponentTypeAccess().getComponentTypeInstancesAssignment_5_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_3__4__Impl
	rule__MIODComponentType__Group_5_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_5_3_4()); }

	'}' 

{ after(grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_5_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__Group_5_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__Group_5_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__Group_5_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_3_5()); }

	';' 

{ after(grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIODComponentTypeInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentTypeInstance__Group__0__Impl
	rule__MIODComponentTypeInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentTypeInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeInstanceAccess().getTypeKeyword_0()); }

	'type' 

{ after(grammarAccess.getMIODComponentTypeInstanceAccess().getTypeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentTypeInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentTypeInstance__Group__1__Impl
	rule__MIODComponentTypeInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentTypeInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeInstanceAccess().getComponentTypeAssignment_1()); }
(rule__MIODComponentTypeInstance__ComponentTypeAssignment_1)
{ after(grammarAccess.getMIODComponentTypeInstanceAccess().getComponentTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentTypeInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentTypeInstance__Group__2__Impl
	rule__MIODComponentTypeInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentTypeInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeInstanceAccess().getRangeKeyword_2()); }

	'range' 

{ after(grammarAccess.getMIODComponentTypeInstanceAccess().getRangeKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentTypeInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentTypeInstance__Group__3__Impl
	rule__MIODComponentTypeInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentTypeInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeInstanceAccess().getLowerBoundAssignment_3()); }
(rule__MIODComponentTypeInstance__LowerBoundAssignment_3)
{ after(grammarAccess.getMIODComponentTypeInstanceAccess().getLowerBoundAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentTypeInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentTypeInstance__Group__4__Impl
	rule__MIODComponentTypeInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentTypeInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeInstanceAccess().getToKeyword_4()); }

	'to' 

{ after(grammarAccess.getMIODComponentTypeInstanceAccess().getToKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentTypeInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentTypeInstance__Group__5__Impl
	rule__MIODComponentTypeInstance__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentTypeInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeInstanceAccess().getUpperBoundAssignment_5()); }
(rule__MIODComponentTypeInstance__UpperBoundAssignment_5)
{ after(grammarAccess.getMIODComponentTypeInstanceAccess().getUpperBoundAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentTypeInstance__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentTypeInstance__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentTypeInstance__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeInstanceAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMIODComponentTypeInstanceAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MAODComponentTypeInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentTypeInstance__Group__0__Impl
	rule__MAODComponentTypeInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentTypeInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeInstanceAccess().getTypeKeyword_0()); }

	'type' 

{ after(grammarAccess.getMAODComponentTypeInstanceAccess().getTypeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentTypeInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentTypeInstance__Group__1__Impl
	rule__MAODComponentTypeInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentTypeInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeInstanceAccess().getComponentTypeAssignment_1()); }
(rule__MAODComponentTypeInstance__ComponentTypeAssignment_1)
{ after(grammarAccess.getMAODComponentTypeInstanceAccess().getComponentTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentTypeInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentTypeInstance__Group__2__Impl
	rule__MAODComponentTypeInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentTypeInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeInstanceAccess().getRangeKeyword_2()); }

	'range' 

{ after(grammarAccess.getMAODComponentTypeInstanceAccess().getRangeKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentTypeInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentTypeInstance__Group__3__Impl
	rule__MAODComponentTypeInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentTypeInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeInstanceAccess().getLowerBoundAssignment_3()); }
(rule__MAODComponentTypeInstance__LowerBoundAssignment_3)
{ after(grammarAccess.getMAODComponentTypeInstanceAccess().getLowerBoundAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentTypeInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentTypeInstance__Group__4__Impl
	rule__MAODComponentTypeInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentTypeInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeInstanceAccess().getToKeyword_4()); }

	'to' 

{ after(grammarAccess.getMAODComponentTypeInstanceAccess().getToKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentTypeInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentTypeInstance__Group__5__Impl
	rule__MAODComponentTypeInstance__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentTypeInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeInstanceAccess().getUpperBoundAssignment_5()); }
(rule__MAODComponentTypeInstance__UpperBoundAssignment_5)
{ after(grammarAccess.getMAODComponentTypeInstanceAccess().getUpperBoundAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentTypeInstance__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentTypeInstance__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentTypeInstance__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeInstanceAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMAODComponentTypeInstanceAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MExternalClientPortTypeInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalClientPortTypeInstance__Group__0__Impl
	rule__MExternalClientPortTypeInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalClientPortTypeInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getExternalKeyword_0()); }

	'external' 

{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getExternalKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalClientPortTypeInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalClientPortTypeInstance__Group__1__Impl
	rule__MExternalClientPortTypeInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalClientPortTypeInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getClientKeyword_1()); }

	'client' 

{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getClientKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalClientPortTypeInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalClientPortTypeInstance__Group__2__Impl
	rule__MExternalClientPortTypeInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalClientPortTypeInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getPortTypeAssignment_2()); }
(rule__MExternalClientPortTypeInstance__PortTypeAssignment_2)
{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getPortTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalClientPortTypeInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalClientPortTypeInstance__Group__3__Impl
	rule__MExternalClientPortTypeInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalClientPortTypeInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getRangeKeyword_3()); }

	'range' 

{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getRangeKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalClientPortTypeInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalClientPortTypeInstance__Group__4__Impl
	rule__MExternalClientPortTypeInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalClientPortTypeInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getLowerBoundAssignment_4()); }
(rule__MExternalClientPortTypeInstance__LowerBoundAssignment_4)
{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getLowerBoundAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalClientPortTypeInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalClientPortTypeInstance__Group__5__Impl
	rule__MExternalClientPortTypeInstance__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalClientPortTypeInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getToKeyword_5()); }

	'to' 

{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getToKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalClientPortTypeInstance__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalClientPortTypeInstance__Group__6__Impl
	rule__MExternalClientPortTypeInstance__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalClientPortTypeInstance__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getUpperBoundAssignment_6()); }
(rule__MExternalClientPortTypeInstance__UpperBoundAssignment_6)
{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getUpperBoundAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalClientPortTypeInstance__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalClientPortTypeInstance__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalClientPortTypeInstance__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MExternalServerPortTypeInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalServerPortTypeInstance__Group__0__Impl
	rule__MExternalServerPortTypeInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalServerPortTypeInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getExternalKeyword_0()); }

	'external' 

{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getExternalKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalServerPortTypeInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalServerPortTypeInstance__Group__1__Impl
	rule__MExternalServerPortTypeInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalServerPortTypeInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getServerKeyword_1()); }

	'server' 

{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getServerKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalServerPortTypeInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalServerPortTypeInstance__Group__2__Impl
	rule__MExternalServerPortTypeInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalServerPortTypeInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getPortTypeAssignment_2()); }
(rule__MExternalServerPortTypeInstance__PortTypeAssignment_2)
{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getPortTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalServerPortTypeInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalServerPortTypeInstance__Group__3__Impl
	rule__MExternalServerPortTypeInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalServerPortTypeInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getRangeKeyword_3()); }

	'range' 

{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getRangeKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalServerPortTypeInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalServerPortTypeInstance__Group__4__Impl
	rule__MExternalServerPortTypeInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalServerPortTypeInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getLowerBoundAssignment_4()); }
(rule__MExternalServerPortTypeInstance__LowerBoundAssignment_4)
{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getLowerBoundAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalServerPortTypeInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalServerPortTypeInstance__Group__5__Impl
	rule__MExternalServerPortTypeInstance__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalServerPortTypeInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getToKeyword_5()); }

	'to' 

{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getToKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalServerPortTypeInstance__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalServerPortTypeInstance__Group__6__Impl
	rule__MExternalServerPortTypeInstance__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalServerPortTypeInstance__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getUpperBoundAssignment_6()); }
(rule__MExternalServerPortTypeInstance__UpperBoundAssignment_6)
{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getUpperBoundAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExternalServerPortTypeInstance__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExternalServerPortTypeInstance__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalServerPortTypeInstance__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MInternalClientPortTypeInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalClientPortTypeInstance__Group__0__Impl
	rule__MInternalClientPortTypeInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalClientPortTypeInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getInternalKeyword_0()); }

	'internal' 

{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getInternalKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalClientPortTypeInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalClientPortTypeInstance__Group__1__Impl
	rule__MInternalClientPortTypeInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalClientPortTypeInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getClientKeyword_1()); }

	'client' 

{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getClientKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalClientPortTypeInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalClientPortTypeInstance__Group__2__Impl
	rule__MInternalClientPortTypeInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalClientPortTypeInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getPortTypeAssignment_2()); }
(rule__MInternalClientPortTypeInstance__PortTypeAssignment_2)
{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getPortTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalClientPortTypeInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalClientPortTypeInstance__Group__3__Impl
	rule__MInternalClientPortTypeInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalClientPortTypeInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getRangeKeyword_3()); }

	'range' 

{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getRangeKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalClientPortTypeInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalClientPortTypeInstance__Group__4__Impl
	rule__MInternalClientPortTypeInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalClientPortTypeInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getLowerBoundAssignment_4()); }
(rule__MInternalClientPortTypeInstance__LowerBoundAssignment_4)
{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getLowerBoundAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalClientPortTypeInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalClientPortTypeInstance__Group__5__Impl
	rule__MInternalClientPortTypeInstance__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalClientPortTypeInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getToKeyword_5()); }

	'to' 

{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getToKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalClientPortTypeInstance__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalClientPortTypeInstance__Group__6__Impl
	rule__MInternalClientPortTypeInstance__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalClientPortTypeInstance__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getUpperBoundAssignment_6()); }
(rule__MInternalClientPortTypeInstance__UpperBoundAssignment_6)
{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getUpperBoundAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalClientPortTypeInstance__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalClientPortTypeInstance__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalClientPortTypeInstance__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MInternalServerPortTypeInstance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalServerPortTypeInstance__Group__0__Impl
	rule__MInternalServerPortTypeInstance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalServerPortTypeInstance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getInternalKeyword_0()); }

	'internal' 

{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getInternalKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalServerPortTypeInstance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalServerPortTypeInstance__Group__1__Impl
	rule__MInternalServerPortTypeInstance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalServerPortTypeInstance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getServerKeyword_1()); }

	'server' 

{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getServerKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalServerPortTypeInstance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalServerPortTypeInstance__Group__2__Impl
	rule__MInternalServerPortTypeInstance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalServerPortTypeInstance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getPortTypeAssignment_2()); }
(rule__MInternalServerPortTypeInstance__PortTypeAssignment_2)
{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getPortTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalServerPortTypeInstance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalServerPortTypeInstance__Group__3__Impl
	rule__MInternalServerPortTypeInstance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalServerPortTypeInstance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getRangeKeyword_3()); }

	'range' 

{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getRangeKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalServerPortTypeInstance__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalServerPortTypeInstance__Group__4__Impl
	rule__MInternalServerPortTypeInstance__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalServerPortTypeInstance__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getLowerBoundAssignment_4()); }
(rule__MInternalServerPortTypeInstance__LowerBoundAssignment_4)
{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getLowerBoundAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalServerPortTypeInstance__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalServerPortTypeInstance__Group__5__Impl
	rule__MInternalServerPortTypeInstance__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalServerPortTypeInstance__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getToKeyword_5()); }

	'to' 

{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getToKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalServerPortTypeInstance__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalServerPortTypeInstance__Group__6__Impl
	rule__MInternalServerPortTypeInstance__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalServerPortTypeInstance__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getUpperBoundAssignment_6()); }
(rule__MInternalServerPortTypeInstance__UpperBoundAssignment_6)
{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getUpperBoundAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MInternalServerPortTypeInstance__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MInternalServerPortTypeInstance__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalServerPortTypeInstance__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MPortType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group__0__Impl
	rule__MPortType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getMPortTypeAction_0()); }
(

)
{ after(grammarAccess.getMPortTypeAccess().getMPortTypeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group__1__Impl
	rule__MPortType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getPortKeyword_1()); }

	'port' 

{ after(grammarAccess.getMPortTypeAccess().getPortKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group__2__Impl
	rule__MPortType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getTypeKeyword_2()); }

	'type' 

{ after(grammarAccess.getMPortTypeAccess().getTypeKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group__3__Impl
	rule__MPortType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getNameAssignment_3()); }
(rule__MPortType__NameAssignment_3)
{ after(grammarAccess.getMPortTypeAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group__4__Impl
	rule__MPortType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getGroup_4()); }
(rule__MPortType__Group_4__0)?
{ after(grammarAccess.getMPortTypeAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group__5__Impl
	rule__MPortType__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group__6__Impl
	rule__MPortType__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6()); }
(rule__MPortType__UnorderedGroup_6)
{ after(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group__7__Impl
	rule__MPortType__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMPortTypeAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MPortType__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_4__0__Impl
	rule__MPortType__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getInheritsKeyword_4_0()); }

	'inherits' 

{ after(grammarAccess.getMPortTypeAccess().getInheritsKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_4__1__Impl
	rule__MPortType__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getInheritsAssignment_4_1()); }
(rule__MPortType__InheritsAssignment_4_1)
{ after(grammarAccess.getMPortTypeAccess().getInheritsAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getGroup_4_2()); }
(rule__MPortType__Group_4_2__0)*
{ after(grammarAccess.getMPortTypeAccess().getGroup_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MPortType__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_4_2__0__Impl
	rule__MPortType__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getCommaKeyword_4_2_0()); }

	',' 

{ after(grammarAccess.getMPortTypeAccess().getCommaKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getInheritsAssignment_4_2_1()); }
(rule__MPortType__InheritsAssignment_4_2_1)
{ after(grammarAccess.getMPortTypeAccess().getInheritsAssignment_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MPortType__Group_6_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_0__0__Impl
	rule__MPortType__Group_6_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getInterfaceKeyword_6_0_0()); }

	'interface' 

{ after(grammarAccess.getMPortTypeAccess().getInterfaceKeyword_6_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_0__1__Impl
	rule__MPortType__Group_6_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getTypesKeyword_6_0_1()); }

	'types' 

{ after(grammarAccess.getMPortTypeAccess().getTypesKeyword_6_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_0__2__Impl
	rule__MPortType__Group_6_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getColonEqualsSignKeyword_6_0_2()); }

	':=' 

{ after(grammarAccess.getMPortTypeAccess().getColonEqualsSignKeyword_6_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_0__3__Impl
	rule__MPortType__Group_6_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getInterfaceTypesAssignment_6_0_3()); }
(rule__MPortType__InterfaceTypesAssignment_6_0_3)
{ after(grammarAccess.getMPortTypeAccess().getInterfaceTypesAssignment_6_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_0__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_0__4__Impl
	rule__MPortType__Group_6_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_0__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getGroup_6_0_4()); }
(rule__MPortType__Group_6_0_4__0)*
{ after(grammarAccess.getMPortTypeAccess().getGroup_6_0_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_0__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_0__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_0__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_0_5()); }

	';' 

{ after(grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_0_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MPortType__Group_6_0_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_0_4__0__Impl
	rule__MPortType__Group_6_0_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_0_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getCommaKeyword_6_0_4_0()); }

	',' 

{ after(grammarAccess.getMPortTypeAccess().getCommaKeyword_6_0_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_0_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_0_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_0_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getInterfaceTypesAssignment_6_0_4_1()); }
(rule__MPortType__InterfaceTypesAssignment_6_0_4_1)
{ after(grammarAccess.getMPortTypeAccess().getInterfaceTypesAssignment_6_0_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MPortType__Group_6_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_1__0__Impl
	rule__MPortType__Group_6_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getAttributesKeyword_6_1_0()); }

	'attributes' 

{ after(grammarAccess.getMPortTypeAccess().getAttributesKeyword_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_1__1__Impl
	rule__MPortType__Group_6_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_6_1_1()); }

	'{' 

{ after(grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_6_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_1__2__Impl
	rule__MPortType__Group_6_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMPortTypeAccess().getAttributesAssignment_6_1_2()); }
(rule__MPortType__AttributesAssignment_6_1_2)
{ after(grammarAccess.getMPortTypeAccess().getAttributesAssignment_6_1_2()); }
)
(
{ before(grammarAccess.getMPortTypeAccess().getAttributesAssignment_6_1_2()); }
(rule__MPortType__AttributesAssignment_6_1_2)*
{ after(grammarAccess.getMPortTypeAccess().getAttributesAssignment_6_1_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_1__3__Impl
	rule__MPortType__Group_6_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_6_1_3()); }

	'}' 

{ after(grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_6_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_1_4()); }

	';' 

{ after(grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MPortType__Group_6_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_2__0__Impl
	rule__MPortType__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getClientKeyword_6_2_0()); }

	'client' 

{ after(grammarAccess.getMPortTypeAccess().getClientKeyword_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_2__1__Impl
	rule__MPortType__Group_6_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getAttributesKeyword_6_2_1()); }

	'attributes' 

{ after(grammarAccess.getMPortTypeAccess().getAttributesKeyword_6_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_2__2__Impl
	rule__MPortType__Group_6_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_6_2_2()); }

	'{' 

{ after(grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_6_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_2__3__Impl
	rule__MPortType__Group_6_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMPortTypeAccess().getClientAttributesAssignment_6_2_3()); }
(rule__MPortType__ClientAttributesAssignment_6_2_3)
{ after(grammarAccess.getMPortTypeAccess().getClientAttributesAssignment_6_2_3()); }
)
(
{ before(grammarAccess.getMPortTypeAccess().getClientAttributesAssignment_6_2_3()); }
(rule__MPortType__ClientAttributesAssignment_6_2_3)*
{ after(grammarAccess.getMPortTypeAccess().getClientAttributesAssignment_6_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_2__4__Impl
	rule__MPortType__Group_6_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_6_2_4()); }

	'}' 

{ after(grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_6_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_2_5()); }

	';' 

{ after(grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MPortType__Group_6_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_3__0__Impl
	rule__MPortType__Group_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getServerKeyword_6_3_0()); }

	'server' 

{ after(grammarAccess.getMPortTypeAccess().getServerKeyword_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_3__1__Impl
	rule__MPortType__Group_6_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getAttributesKeyword_6_3_1()); }

	'attributes' 

{ after(grammarAccess.getMPortTypeAccess().getAttributesKeyword_6_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_3__2__Impl
	rule__MPortType__Group_6_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_6_3_2()); }

	'{' 

{ after(grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_6_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_3__3__Impl
	rule__MPortType__Group_6_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMPortTypeAccess().getServerAttributesAssignment_6_3_3()); }
(rule__MPortType__ServerAttributesAssignment_6_3_3)
{ after(grammarAccess.getMPortTypeAccess().getServerAttributesAssignment_6_3_3()); }
)
(
{ before(grammarAccess.getMPortTypeAccess().getServerAttributesAssignment_6_3_3()); }
(rule__MPortType__ServerAttributesAssignment_6_3_3)*
{ after(grammarAccess.getMPortTypeAccess().getServerAttributesAssignment_6_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_3__4__Impl
	rule__MPortType__Group_6_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_6_3_4()); }

	'}' 

{ after(grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_6_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__Group_6_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__Group_6_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__Group_6_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_3_5()); }

	';' 

{ after(grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MExchangeModel__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__0__Impl
	rule__MExchangeModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getMExchangeModelAction_0()); }
(

)
{ after(grammarAccess.getMExchangeModelAccess().getMExchangeModelAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__1__Impl
	rule__MExchangeModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getExchangeKeyword_1()); }

	'exchange' 

{ after(grammarAccess.getMExchangeModelAccess().getExchangeKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__2__Impl
	rule__MExchangeModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getModelKeyword_2()); }

	'model' 

{ after(grammarAccess.getMExchangeModelAccess().getModelKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__3__Impl
	rule__MExchangeModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getNameAssignment_3()); }
(rule__MExchangeModel__NameAssignment_3)
{ after(grammarAccess.getMExchangeModelAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__4__Impl
	rule__MExchangeModel__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getGroup_4()); }
(rule__MExchangeModel__Group_4__0)?
{ after(grammarAccess.getMExchangeModelAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__5__Impl
	rule__MExchangeModel__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMExchangeModelAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__6__Impl
	rule__MExchangeModel__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getInterfaceKeyword_6()); }

	'interface' 

{ after(grammarAccess.getMExchangeModelAccess().getInterfaceKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__7__Impl
	rule__MExchangeModel__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getTypesKeyword_7()); }

	'types' 

{ after(grammarAccess.getMExchangeModelAccess().getTypesKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__8__Impl
	rule__MExchangeModel__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getColonEqualsSignKeyword_8()); }

	':=' 

{ after(grammarAccess.getMExchangeModelAccess().getColonEqualsSignKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__9__Impl
	rule__MExchangeModel__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getInterfaceTypesAssignment_9()); }
(rule__MExchangeModel__InterfaceTypesAssignment_9)
{ after(grammarAccess.getMExchangeModelAccess().getInterfaceTypesAssignment_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__10__Impl
	rule__MExchangeModel__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getCommaKeyword_10()); }

	',' 

{ after(grammarAccess.getMExchangeModelAccess().getCommaKeyword_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__11__Impl
	rule__MExchangeModel__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getInterfaceTypesAssignment_11()); }
(rule__MExchangeModel__InterfaceTypesAssignment_11)
{ after(grammarAccess.getMExchangeModelAccess().getInterfaceTypesAssignment_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__12__Impl
	rule__MExchangeModel__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getGroup_12()); }
(rule__MExchangeModel__Group_12__0)*
{ after(grammarAccess.getMExchangeModelAccess().getGroup_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__13
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__13__Impl
	rule__MExchangeModel__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__13__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getSemicolonKeyword_13()); }

	';' 

{ after(grammarAccess.getMExchangeModelAccess().getSemicolonKeyword_13()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__14
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__14__Impl
	rule__MExchangeModel__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__14__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getRightCurlyBracketKeyword_14()); }

	'}' 

{ after(grammarAccess.getMExchangeModelAccess().getRightCurlyBracketKeyword_14()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group__15
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group__15__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getSemicolonKeyword_15()); }

	';' 

{ after(grammarAccess.getMExchangeModelAccess().getSemicolonKeyword_15()); }
)

;
finally {
	restoreStackSize(stackSize);
}


































rule__MExchangeModel__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group_4__0__Impl
	rule__MExchangeModel__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getInheritsKeyword_4_0()); }

	'inherits' 

{ after(grammarAccess.getMExchangeModelAccess().getInheritsKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group_4__1__Impl
	rule__MExchangeModel__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getInheritsAssignment_4_1()); }
(rule__MExchangeModel__InheritsAssignment_4_1)
{ after(grammarAccess.getMExchangeModelAccess().getInheritsAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getGroup_4_2()); }
(rule__MExchangeModel__Group_4_2__0)*
{ after(grammarAccess.getMExchangeModelAccess().getGroup_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MExchangeModel__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group_4_2__0__Impl
	rule__MExchangeModel__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getCommaKeyword_4_2_0()); }

	',' 

{ after(grammarAccess.getMExchangeModelAccess().getCommaKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getInheritsAssignment_4_2_1()); }
(rule__MExchangeModel__InheritsAssignment_4_2_1)
{ after(grammarAccess.getMExchangeModelAccess().getInheritsAssignment_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MExchangeModel__Group_12__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group_12__0__Impl
	rule__MExchangeModel__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group_12__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getCommaKeyword_12_0()); }

	',' 

{ after(grammarAccess.getMExchangeModelAccess().getCommaKeyword_12_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MExchangeModel__Group_12__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MExchangeModel__Group_12__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__Group_12__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getInterfaceTypesAssignment_12_1()); }
(rule__MExchangeModel__InterfaceTypesAssignment_12_1)
{ after(grammarAccess.getMExchangeModelAccess().getInterfaceTypesAssignment_12_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MConnector__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group__0__Impl
	rule__MConnector__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getConnectorKeyword_0()); }

	'connector' 

{ after(grammarAccess.getMConnectorAccess().getConnectorKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group__1__Impl
	rule__MConnector__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getNameAssignment_1()); }
(rule__MConnector__NameAssignment_1)
{ after(grammarAccess.getMConnectorAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group__2__Impl
	rule__MConnector__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getGroup_2()); }
(rule__MConnector__Group_2__0)?
{ after(grammarAccess.getMConnectorAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group__3__Impl
	rule__MConnector__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMConnectorAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group__4__Impl
	rule__MConnector__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getUnorderedGroup_4()); }
(rule__MConnector__UnorderedGroup_4)
{ after(grammarAccess.getMConnectorAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group__5__Impl
	rule__MConnector__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMConnectorAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMConnectorAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MConnector__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_2__0__Impl
	rule__MConnector__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getInheritsKeyword_2_0()); }

	'inherits' 

{ after(grammarAccess.getMConnectorAccess().getInheritsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_2__1__Impl
	rule__MConnector__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getInheritsAssignment_2_1()); }
(rule__MConnector__InheritsAssignment_2_1)
{ after(grammarAccess.getMConnectorAccess().getInheritsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getGroup_2_2()); }
(rule__MConnector__Group_2_2__0)*
{ after(grammarAccess.getMConnectorAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MConnector__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_2_2__0__Impl
	rule__MConnector__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getMConnectorAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getInheritsAssignment_2_2_1()); }
(rule__MConnector__InheritsAssignment_2_2_1)
{ after(grammarAccess.getMConnectorAccess().getInheritsAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MConnector__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_0__0__Impl
	rule__MConnector__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getClientKeyword_4_0_0()); }

	'client' 

{ after(grammarAccess.getMConnectorAccess().getClientKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_0__1__Impl
	rule__MConnector__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getTypesKeyword_4_0_1()); }

	'types' 

{ after(grammarAccess.getMConnectorAccess().getTypesKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_0__2__Impl
	rule__MConnector__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getColonEqualsSignKeyword_4_0_2()); }

	':=' 

{ after(grammarAccess.getMConnectorAccess().getColonEqualsSignKeyword_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_0__3__Impl
	rule__MConnector__Group_4_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getClientPortTypesAssignment_4_0_3()); }
(rule__MConnector__ClientPortTypesAssignment_4_0_3)
{ after(grammarAccess.getMConnectorAccess().getClientPortTypesAssignment_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_0__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_0__4__Impl
	rule__MConnector__Group_4_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_0__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getGroup_4_0_4()); }
(rule__MConnector__Group_4_0_4__0)*
{ after(grammarAccess.getMConnectorAccess().getGroup_4_0_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_0__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_0__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_0__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getSemicolonKeyword_4_0_5()); }

	';' 

{ after(grammarAccess.getMConnectorAccess().getSemicolonKeyword_4_0_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MConnector__Group_4_0_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_0_4__0__Impl
	rule__MConnector__Group_4_0_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_0_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getCommaKeyword_4_0_4_0()); }

	',' 

{ after(grammarAccess.getMConnectorAccess().getCommaKeyword_4_0_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_0_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_0_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_0_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getClientPortTypesAssignment_4_0_4_1()); }
(rule__MConnector__ClientPortTypesAssignment_4_0_4_1)
{ after(grammarAccess.getMConnectorAccess().getClientPortTypesAssignment_4_0_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MConnector__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_1__0__Impl
	rule__MConnector__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getServerKeyword_4_1_0()); }

	'server' 

{ after(grammarAccess.getMConnectorAccess().getServerKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_1__1__Impl
	rule__MConnector__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getTypesKeyword_4_1_1()); }

	'types' 

{ after(grammarAccess.getMConnectorAccess().getTypesKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_1__2__Impl
	rule__MConnector__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getColonEqualsSignKeyword_4_1_2()); }

	':=' 

{ after(grammarAccess.getMConnectorAccess().getColonEqualsSignKeyword_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_1__3__Impl
	rule__MConnector__Group_4_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getServerPortTypesAssignment_4_1_3()); }
(rule__MConnector__ServerPortTypesAssignment_4_1_3)
{ after(grammarAccess.getMConnectorAccess().getServerPortTypesAssignment_4_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_1__4__Impl
	rule__MConnector__Group_4_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getGroup_4_1_4()); }
(rule__MConnector__Group_4_1_4__0)*
{ after(grammarAccess.getMConnectorAccess().getGroup_4_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getSemicolonKeyword_4_1_5()); }

	';' 

{ after(grammarAccess.getMConnectorAccess().getSemicolonKeyword_4_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MConnector__Group_4_1_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_1_4__0__Impl
	rule__MConnector__Group_4_1_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_1_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getCommaKeyword_4_1_4_0()); }

	',' 

{ after(grammarAccess.getMConnectorAccess().getCommaKeyword_4_1_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_1_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_1_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_1_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getServerPortTypesAssignment_4_1_4_1()); }
(rule__MConnector__ServerPortTypesAssignment_4_1_4_1)
{ after(grammarAccess.getMConnectorAccess().getServerPortTypesAssignment_4_1_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MConnector__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_2__0__Impl
	rule__MConnector__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getAttributesKeyword_4_2_0()); }

	'attributes' 

{ after(grammarAccess.getMConnectorAccess().getAttributesKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_2__1__Impl
	rule__MConnector__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getLeftCurlyBracketKeyword_4_2_1()); }

	'{' 

{ after(grammarAccess.getMConnectorAccess().getLeftCurlyBracketKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_2__2__Impl
	rule__MConnector__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMConnectorAccess().getAttributesAssignment_4_2_2()); }
(rule__MConnector__AttributesAssignment_4_2_2)
{ after(grammarAccess.getMConnectorAccess().getAttributesAssignment_4_2_2()); }
)
(
{ before(grammarAccess.getMConnectorAccess().getAttributesAssignment_4_2_2()); }
(rule__MConnector__AttributesAssignment_4_2_2)*
{ after(grammarAccess.getMConnectorAccess().getAttributesAssignment_4_2_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_2__3__Impl
	rule__MConnector__Group_4_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getRightCurlyBracketKeyword_4_2_3()); }

	'}' 

{ after(grammarAccess.getMConnectorAccess().getRightCurlyBracketKeyword_4_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__Group_4_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__Group_4_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__Group_4_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getSemicolonKeyword_4_2_4()); }

	';' 

{ after(grammarAccess.getMConnectorAccess().getSemicolonKeyword_4_2_4()); }
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















rule__MIODomain__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
    }
:
	rule__MIODomain__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMIODomainAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainAccess().getGroup_4_0()); }
						(rule__MIODomain__Group_4_0__0)
						{ after(grammarAccess.getMIODomainAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainAccess().getGroup_4_1()); }
						(rule__MIODomain__Group_4_1__0)
						{ after(grammarAccess.getMIODomainAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainAccess().getGroup_4_2()); }
						(rule__MIODomain__Group_4_2__0)
						{ after(grammarAccess.getMIODomainAccess().getGroup_4_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainAccess().getGroup_4_3()); }
						(rule__MIODomain__Group_4_3__0)
						{ after(grammarAccess.getMIODomainAccess().getGroup_4_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainAccess().getGroup_4_4()); }
						(rule__MIODomain__Group_4_4__0)
						{ after(grammarAccess.getMIODomainAccess().getGroup_4_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainAccess().getGroup_4_5()); }
						(rule__MIODomain__Group_4_5__0)
						{ after(grammarAccess.getMIODomainAccess().getGroup_4_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainAccess().getGroup_4_6()); }
						(rule__MIODomain__Group_4_6__0)
						{ after(grammarAccess.getMIODomainAccess().getGroup_4_6()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 7);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainAccess().getGroup_4_7()); }
						(rule__MIODomain__Group_4_7__0)
						{ after(grammarAccess.getMIODomainAccess().getGroup_4_7()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 8);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainAccess().getGroup_4_8()); }
						(rule__MIODomain__Group_4_8__0)
						{ after(grammarAccess.getMIODomainAccess().getGroup_4_8()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 9)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 9);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainAccess().getGroup_4_9()); }
						(rule__MIODomain__Group_4_9__0)
						{ after(grammarAccess.getMIODomainAccess().getGroup_4_9()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 10)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 10);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainAccess().getGroup_4_10()); }
						(rule__MIODomain__Group_4_10__0)
						{ after(grammarAccess.getMIODomainAccess().getGroup_4_10()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 11)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 11);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainAccess().getGroup_4_11()); }
						(rule__MIODomain__Group_4_11__0)
						{ after(grammarAccess.getMIODomainAccess().getGroup_4_11()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__UnorderedGroup_4__Impl
	rule__MIODomain__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__UnorderedGroup_4__Impl
	rule__MIODomain__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__UnorderedGroup_4__Impl
	rule__MIODomain__UnorderedGroup_4__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__UnorderedGroup_4__Impl
	rule__MIODomain__UnorderedGroup_4__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__UnorderedGroup_4__Impl
	rule__MIODomain__UnorderedGroup_4__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__UnorderedGroup_4__Impl
	rule__MIODomain__UnorderedGroup_4__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__UnorderedGroup_4__Impl
	rule__MIODomain__UnorderedGroup_4__7?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__UnorderedGroup_4__Impl
	rule__MIODomain__UnorderedGroup_4__8?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__UnorderedGroup_4__Impl
	rule__MIODomain__UnorderedGroup_4__9?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__UnorderedGroup_4__Impl
	rule__MIODomain__UnorderedGroup_4__10?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__UnorderedGroup_4__Impl
	rule__MIODomain__UnorderedGroup_4__11?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomain__UnorderedGroup_4__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomain__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}


























rule__MIODomainSupportedPlatform__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
    }
:
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_0()); }
						(rule__MIODomainSupportedPlatform__Group_4_0__0)
						{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_1()); }
						(rule__MIODomainSupportedPlatform__Group_4_1__0)
						{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_2()); }
						(rule__MIODomainSupportedPlatform__Group_4_2__0)
						{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_3()); }
						(rule__MIODomainSupportedPlatform__Group_4_3__0)
						{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_4()); }
						(rule__MIODomainSupportedPlatform__Group_4_4__0)
						{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_5()); }
						(rule__MIODomainSupportedPlatform__Group_4_5__0)
						{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_6()); }
						(rule__MIODomainSupportedPlatform__Group_4_6__0)
						{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_6()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 7);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_7()); }
						(rule__MIODomainSupportedPlatform__Group_4_7__0)
						{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_7()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 8);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_8()); }
						(rule__MIODomainSupportedPlatform__Group_4_8__0)
						{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getGroup_4_8()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__Impl
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__Impl
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__Impl
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__UnorderedGroup_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__Impl
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__UnorderedGroup_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__Impl
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__UnorderedGroup_4__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__Impl
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__UnorderedGroup_4__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__Impl
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__7?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__UnorderedGroup_4__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__Impl
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__8?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODomainSupportedPlatform__UnorderedGroup_4__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODomainSupportedPlatform__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}




















rule__MAODomain__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
    }
:
	rule__MAODomain__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMAODomainAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MAODomain__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAODomainAccess().getGroup_4_0()); }
						(rule__MAODomain__Group_4_0__0)
						{ after(grammarAccess.getMAODomainAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAODomainAccess().getGroup_4_1()); }
						(rule__MAODomain__Group_4_1__0)
						{ after(grammarAccess.getMAODomainAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAODomainAccess().getGroup_4_2()); }
						(rule__MAODomain__Group_4_2__0)
						{ after(grammarAccess.getMAODomainAccess().getGroup_4_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAODomainAccess().getGroup_4_3()); }
						(rule__MAODomain__Group_4_3__0)
						{ after(grammarAccess.getMAODomainAccess().getGroup_4_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAODomainAccess().getGroup_4_4()); }
						(rule__MAODomain__Group_4_4__0)
						{ after(grammarAccess.getMAODomainAccess().getGroup_4_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAODomainAccess().getGroup_4_5()); }
						(rule__MAODomain__Group_4_5__0)
						{ after(grammarAccess.getMAODomainAccess().getGroup_4_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAODomainAccess().getGroup_4_6()); }
						(rule__MAODomain__Group_4_6__0)
						{ after(grammarAccess.getMAODomainAccess().getGroup_4_6()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 7);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAODomainAccess().getGroup_4_7()); }
						(rule__MAODomain__Group_4_7__0)
						{ after(grammarAccess.getMAODomainAccess().getGroup_4_7()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MAODomain__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__UnorderedGroup_4__Impl
	rule__MAODomain__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__UnorderedGroup_4__Impl
	rule__MAODomain__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__UnorderedGroup_4__Impl
	rule__MAODomain__UnorderedGroup_4__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__UnorderedGroup_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__UnorderedGroup_4__Impl
	rule__MAODomain__UnorderedGroup_4__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__UnorderedGroup_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__UnorderedGroup_4__Impl
	rule__MAODomain__UnorderedGroup_4__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__UnorderedGroup_4__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__UnorderedGroup_4__Impl
	rule__MAODomain__UnorderedGroup_4__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__UnorderedGroup_4__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__UnorderedGroup_4__Impl
	rule__MAODomain__UnorderedGroup_4__7?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAODomain__UnorderedGroup_4__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODomain__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}


















rule__MAODComponentType__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5());
    }
:
	rule__MAODComponentType__UnorderedGroup_5__0
	?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MAODComponentType__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAODComponentTypeAccess().getGroup_5_0()); }
						(rule__MAODComponentType__Group_5_0__0)
						{ after(grammarAccess.getMAODComponentTypeAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAODComponentTypeAccess().getGroup_5_1()); }
						(rule__MAODComponentType__Group_5_1__0)
						{ after(grammarAccess.getMAODComponentTypeAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAODComponentTypeAccess().getGroup_5_2()); }
						(rule__MAODComponentType__Group_5_2__0)
						{ after(grammarAccess.getMAODComponentTypeAccess().getGroup_5_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MAODComponentType__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__UnorderedGroup_5__Impl
	rule__MAODComponentType__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__UnorderedGroup_5__Impl
	rule__MAODComponentType__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAODComponentType__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAODComponentType__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__MIODAbstractComponentType__UnorderedGroup_6
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6());
    }
:
	rule__MIODAbstractComponentType__UnorderedGroup_6__0
	?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6());
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__UnorderedGroup_6__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_6_0()); }
						(rule__MIODAbstractComponentType__Group_6_0__0)
						{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_6_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_6_1()); }
						(rule__MIODAbstractComponentType__Group_6_1__0)
						{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_6_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_6_2()); }
						(rule__MIODAbstractComponentType__Group_6_2__0)
						{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getGroup_6_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6());
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__UnorderedGroup_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__UnorderedGroup_6__Impl
	rule__MIODAbstractComponentType__UnorderedGroup_6__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__UnorderedGroup_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__UnorderedGroup_6__Impl
	rule__MIODAbstractComponentType__UnorderedGroup_6__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODAbstractComponentType__UnorderedGroup_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODAbstractComponentType__UnorderedGroup_6__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__MIODComponentType__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5());
    }
:
	rule__MIODComponentType__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MIODComponentType__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODComponentTypeAccess().getGroup_5_0()); }
						(rule__MIODComponentType__Group_5_0__0)
						{ after(grammarAccess.getMIODComponentTypeAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODComponentTypeAccess().getGroup_5_1()); }
						(rule__MIODComponentType__Group_5_1__0)
						{ after(grammarAccess.getMIODComponentTypeAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODComponentTypeAccess().getGroup_5_2()); }
						(rule__MIODComponentType__Group_5_2__0)
						{ after(grammarAccess.getMIODComponentTypeAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMIODComponentTypeAccess().getGroup_5_3()); }
						(rule__MIODComponentType__Group_5_3__0)
						{ after(grammarAccess.getMIODComponentTypeAccess().getGroup_5_3()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MIODComponentType__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__UnorderedGroup_5__Impl
	rule__MIODComponentType__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__UnorderedGroup_5__Impl
	rule__MIODComponentType__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__UnorderedGroup_5__Impl
	rule__MIODComponentType__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MIODComponentType__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIODComponentType__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}










rule__MPortType__UnorderedGroup_6
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6());
    }
:
	rule__MPortType__UnorderedGroup_6__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6());
	restoreStackSize(stackSize);
}


rule__MPortType__UnorderedGroup_6__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPortTypeAccess().getGroup_6_0()); }
						(rule__MPortType__Group_6_0__0)
						{ after(grammarAccess.getMPortTypeAccess().getGroup_6_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPortTypeAccess().getGroup_6_1()); }
						(rule__MPortType__Group_6_1__0)
						{ after(grammarAccess.getMPortTypeAccess().getGroup_6_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPortTypeAccess().getGroup_6_2()); }
						(rule__MPortType__Group_6_2__0)
						{ after(grammarAccess.getMPortTypeAccess().getGroup_6_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPortTypeAccess().getGroup_6_3()); }
						(rule__MPortType__Group_6_3__0)
						{ after(grammarAccess.getMPortTypeAccess().getGroup_6_3()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6());
	restoreStackSize(stackSize);
}


rule__MPortType__UnorderedGroup_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__UnorderedGroup_6__Impl
	rule__MPortType__UnorderedGroup_6__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__UnorderedGroup_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__UnorderedGroup_6__Impl
	rule__MPortType__UnorderedGroup_6__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__UnorderedGroup_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__UnorderedGroup_6__Impl
	rule__MPortType__UnorderedGroup_6__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPortType__UnorderedGroup_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPortType__UnorderedGroup_6__Impl
;
finally {
	restoreStackSize(stackSize);
}










rule__MConnector__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMConnectorAccess().getUnorderedGroup_4());
    }
:
	rule__MConnector__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMConnectorAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMConnectorAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MConnector__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMConnectorAccess().getGroup_4_0()); }
						(rule__MConnector__Group_4_0__0)
						{ after(grammarAccess.getMConnectorAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMConnectorAccess().getGroup_4_1()); }
						(rule__MConnector__Group_4_1__0)
						{ after(grammarAccess.getMConnectorAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMConnectorAccess().getGroup_4_2()); }
						(rule__MConnector__Group_4_2__0)
						{ after(grammarAccess.getMConnectorAccess().getGroup_4_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMConnectorAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MConnector__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__UnorderedGroup_4__Impl
	rule__MConnector__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__UnorderedGroup_4__Impl
	rule__MConnector__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MConnector__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConnector__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__MMCLEVDOMPackageFile__PackageAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); }
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVDOMPackageFile__ImportsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVDOMPackageFile__ElementAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVDOMPackageFileAccess().getElementMMCLEVDOMPackageElementParserRuleCall_4_0()); }
	ruleMMCLEVDOMPackageElement{ after(grammarAccess.getMMCLEVDOMPackageFileAccess().getElementMMCLEVDOMPackageElementParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMIODomainAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__InheritsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getInheritsMIODomainCrossReference_2_1_0()); }
(
{ before(grammarAccess.getMIODomainAccess().getInheritsMIODomainVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainAccess().getInheritsMIODomainVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMIODomainAccess().getInheritsMIODomainCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__InheritsAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getInheritsMIODomainCrossReference_2_2_1_0()); }
(
{ before(grammarAccess.getMIODomainAccess().getInheritsMIODomainVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainAccess().getInheritsMIODomainVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
)
{ after(grammarAccess.getMIODomainAccess().getInheritsMIODomainCrossReference_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__VersionAssignment_4_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMIODomainAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__LanguagesAssignment_4_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLanguagesMLanguageCrossReference_4_1_2_0()); }
(
{ before(grammarAccess.getMIODomainAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
)
{ after(grammarAccess.getMIODomainAccess().getLanguagesMLanguageCrossReference_4_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__LanguagesAssignment_4_1_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0()); }
(
{ before(grammarAccess.getMIODomainAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_3_1_0_1()); }
)
{ after(grammarAccess.getMIODomainAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__AllowsSingletonAssignment_4_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getAllowsSingletonEBooleanParserRuleCall_4_2_3_0()); }
	ruleEBoolean{ after(grammarAccess.getMIODomainAccess().getAllowsSingletonEBooleanParserRuleCall_4_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__AttributesAssignment_4_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getAttributesMParameterParserRuleCall_4_3_2_0()); }
	ruleMParameter{ after(grammarAccess.getMIODomainAccess().getAttributesMParameterParserRuleCall_4_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__InterfaceTypesAssignment_4_4_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getInterfaceTypesMInterfaceTypeParserRuleCall_4_4_3_0()); }
	ruleMInterfaceType{ after(grammarAccess.getMIODomainAccess().getInterfaceTypesMInterfaceTypeParserRuleCall_4_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__PortTypesAssignment_4_5_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getPortTypesMPortTypeParserRuleCall_4_5_3_0()); }
	ruleMPortType{ after(grammarAccess.getMIODomainAccess().getPortTypesMPortTypeParserRuleCall_4_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__ConnectorsAssignment_4_6_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getConnectorsMConnectorParserRuleCall_4_6_2_0()); }
	ruleMConnector{ after(grammarAccess.getMIODomainAccess().getConnectorsMConnectorParserRuleCall_4_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__ExchangeModelsAssignment_4_7_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getExchangeModelsMExchangeModelParserRuleCall_4_7_3_0()); }
	ruleMExchangeModel{ after(grammarAccess.getMIODomainAccess().getExchangeModelsMExchangeModelParserRuleCall_4_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__ComponentTypesAssignment_4_8_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getComponentTypesMIODCTypeParserRuleCall_4_8_3_0()); }
	ruleMIODCType{ after(grammarAccess.getMIODomainAccess().getComponentTypesMIODCTypeParserRuleCall_4_8_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__ComponentTypeInstancesAssignment_4_9_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_4_9_3_0()); }
	ruleMIODComponentTypeInstance{ after(grammarAccess.getMIODomainAccess().getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_4_9_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__RequiresAssignment_4_10_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRequiresMSAICrossReference_4_10_2_0()); }
(
{ before(grammarAccess.getMIODomainAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_10_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_10_2_0_1()); }
)
{ after(grammarAccess.getMIODomainAccess().getRequiresMSAICrossReference_4_10_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__RequiresAssignment_4_10_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getRequiresMSAICrossReference_4_10_3_1_0()); }
(
{ before(grammarAccess.getMIODomainAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_10_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_10_3_1_0_1()); }
)
{ after(grammarAccess.getMIODomainAccess().getRequiresMSAICrossReference_4_10_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomain__SupportedPlatformsAssignment_4_11_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainAccess().getSupportedPlatformsMIODomainSupportedPlatformParserRuleCall_4_11_3_0()); }
	ruleMIODomainSupportedPlatform{ after(grammarAccess.getMIODomainAccess().getSupportedPlatformsMIODomainSupportedPlatformParserRuleCall_4_11_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__OsapiAssignment_4_0_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_4_0_2_1_0()); }
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_0_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_4_0_2_1_0_1()); }
)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_4_0_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__OsAssignment_4_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getOsMOperatingSystemCrossReference_4_1_2_1_0()); }
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_1_0_1()); }
)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getOsMOperatingSystemCrossReference_4_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__ArchitectureAssignment_4_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_4_2_2_1_0()); }
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_4_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_4_2_2_1_0_1()); }
)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_4_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__CompilerAssignment_4_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerMCompilerCrossReference_4_3_2_0()); }
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_4_3_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_4_3_2_0_1()); }
)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerMCompilerCrossReference_4_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__MicroprocessorAssignment_4_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_4_4_2_1_0()); }
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_4_4_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_4_4_2_1_0_1()); }
)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_4_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__BoardAssignment_4_5_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getBoardMBoardCrossReference_4_5_2_1_0()); }
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_4_5_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_4_5_2_1_0_1()); }
)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getBoardMBoardCrossReference_4_5_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__AttributesAssignment_4_6_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesMParameterParserRuleCall_4_6_2_0()); }
	ruleMParameter{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesMParameterParserRuleCall_4_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__LanguagesAssignment_4_7_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageCrossReference_4_7_2_0()); }
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_7_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_7_2_0_1()); }
)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageCrossReference_4_7_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__LanguagesAssignment_4_7_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageCrossReference_4_7_3_1_0()); }
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_7_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_7_3_1_0_1()); }
)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageCrossReference_4_7_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__RequiresAssignment_4_8_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAICrossReference_4_8_2_0()); }
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_8_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_8_2_0_1()); }
)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAICrossReference_4_8_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODomainSupportedPlatform__RequiresAssignment_4_8_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAICrossReference_4_8_3_1_0()); }
(
{ before(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_8_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_4_8_3_1_0_1()); }
)
{ after(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAICrossReference_4_8_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMAODomainAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__InheritsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getInheritsMAODomainCrossReference_2_1_0()); }
(
{ before(grammarAccess.getMAODomainAccess().getInheritsMAODomainVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMAODomainAccess().getInheritsMAODomainVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMAODomainAccess().getInheritsMAODomainCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__InheritsAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getInheritsMAODomainCrossReference_2_2_1_0()); }
(
{ before(grammarAccess.getMAODomainAccess().getInheritsMAODomainVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMAODomainAccess().getInheritsMAODomainVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
)
{ after(grammarAccess.getMAODomainAccess().getInheritsMAODomainCrossReference_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__VersionAssignment_4_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMAODomainAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__OutputIODomainsAssignment_4_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainCrossReference_4_1_3_0()); }
(
{ before(grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainVersionedQualifiedNameParserRuleCall_4_1_3_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainVersionedQualifiedNameParserRuleCall_4_1_3_0_1()); }
)
{ after(grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainCrossReference_4_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__OutputIODomainsAssignment_4_1_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainCrossReference_4_1_4_1_0()); }
(
{ before(grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainVersionedQualifiedNameParserRuleCall_4_1_4_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainVersionedQualifiedNameParserRuleCall_4_1_4_1_0_1()); }
)
{ after(grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainCrossReference_4_1_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__AttributesAssignment_4_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getAttributesMParameterParserRuleCall_4_2_2_0()); }
	ruleMParameter{ after(grammarAccess.getMAODomainAccess().getAttributesMParameterParserRuleCall_4_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__InterfaceTypesAssignment_4_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getInterfaceTypesMInterfaceTypeParserRuleCall_4_3_3_0()); }
	ruleMInterfaceType{ after(grammarAccess.getMAODomainAccess().getInterfaceTypesMInterfaceTypeParserRuleCall_4_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__PortTypesAssignment_4_4_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getPortTypesMPortTypeParserRuleCall_4_4_3_0()); }
	ruleMPortType{ after(grammarAccess.getMAODomainAccess().getPortTypesMPortTypeParserRuleCall_4_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__ConnectorsAssignment_4_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getConnectorsMConnectorParserRuleCall_4_5_2_0()); }
	ruleMConnector{ after(grammarAccess.getMAODomainAccess().getConnectorsMConnectorParserRuleCall_4_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__ComponentTypesAssignment_4_6_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getComponentTypesMAODComponentTypeParserRuleCall_4_6_3_0()); }
	ruleMAODComponentType{ after(grammarAccess.getMAODomainAccess().getComponentTypesMAODComponentTypeParserRuleCall_4_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODomain__ComponentTypeInstancesAssignment_4_7_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODomainAccess().getComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_4_7_3_0()); }
	ruleMAODComponentTypeInstance{ after(grammarAccess.getMAODomainAccess().getComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_4_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMInterfaceTypeAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__InheritsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInterfaceType__InheritsAssignment_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeCrossReference_3_2_1_0()); }
(
{ before(grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1()); }
)
{ after(grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeCrossReference_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMAODComponentTypeAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__InheritsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__InheritsAssignment_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeCrossReference_3_2_1_0()); }
(
{ before(grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1()); }
)
{ after(grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeCrossReference_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__AttributesAssignment_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getAttributesMParameterParserRuleCall_5_0_2_0()); }
	ruleMParameter{ after(grammarAccess.getMAODComponentTypeAccess().getAttributesMParameterParserRuleCall_5_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__PortTypeInstancesAssignment_5_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getPortTypeInstancesMPortTypeInstanceParserRuleCall_5_1_3_0()); }
	ruleMPortTypeInstance{ after(grammarAccess.getMAODComponentTypeAccess().getPortTypeInstancesMPortTypeInstanceParserRuleCall_5_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentType__ComponentTypeInstancesAssignment_5_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeAccess().getComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_5_2_3_0()); }
	ruleMAODComponentTypeInstance{ after(grammarAccess.getMAODComponentTypeAccess().getComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_5_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__InheritsAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_4_1_0()); }
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__InheritsAssignment_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_4_2_1_0()); }
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1()); }
)
{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__AttributesAssignment_6_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesMParameterParserRuleCall_6_0_2_0()); }
	ruleMParameter{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesMParameterParserRuleCall_6_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__PortTypeInstancesAssignment_6_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getPortTypeInstancesMPortTypeInstanceParserRuleCall_6_1_3_0()); }
	ruleMPortTypeInstance{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getPortTypeInstancesMPortTypeInstanceParserRuleCall_6_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODAbstractComponentType__ComponentTypeInstancesAssignment_6_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODAbstractComponentTypeAccess().getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_6_2_3_0()); }
	ruleMIODComponentTypeInstance{ after(grammarAccess.getMIODAbstractComponentTypeAccess().getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_6_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMIODComponentTypeAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__InheritsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__InheritsAssignment_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_3_2_1_0()); }
(
{ before(grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeVersionedQualifiedReferenceNameParserRuleCall_3_2_1_0_1()); }
)
{ after(grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__LanguageAssignment_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getLanguageMLanguageCrossReference_5_0_2_0()); }
(
{ before(grammarAccess.getMIODComponentTypeAccess().getLanguageMLanguageVersionedQualifiedNameParserRuleCall_5_0_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMIODComponentTypeAccess().getLanguageMLanguageVersionedQualifiedNameParserRuleCall_5_0_2_0_1()); }
)
{ after(grammarAccess.getMIODComponentTypeAccess().getLanguageMLanguageCrossReference_5_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__AttributesAssignment_5_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getAttributesMParameterParserRuleCall_5_1_2_0()); }
	ruleMParameter{ after(grammarAccess.getMIODComponentTypeAccess().getAttributesMParameterParserRuleCall_5_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__PortTypeInstancesAssignment_5_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getPortTypeInstancesMPortTypeInstanceParserRuleCall_5_2_3_0()); }
	ruleMPortTypeInstance{ after(grammarAccess.getMIODComponentTypeAccess().getPortTypeInstancesMPortTypeInstanceParserRuleCall_5_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentType__ComponentTypeInstancesAssignment_5_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeAccess().getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_5_3_3_0()); }
	ruleMIODComponentTypeInstance{ after(grammarAccess.getMIODComponentTypeAccess().getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_5_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentTypeInstance__ComponentTypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeInstanceAccess().getComponentTypeMIODAbstractComponentTypeCrossReference_1_0()); }
(
{ before(grammarAccess.getMIODComponentTypeInstanceAccess().getComponentTypeMIODAbstractComponentTypeIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMIODComponentTypeInstanceAccess().getComponentTypeMIODAbstractComponentTypeIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMIODComponentTypeInstanceAccess().getComponentTypeMIODAbstractComponentTypeCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentTypeInstance__LowerBoundAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMIODComponentTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIODComponentTypeInstance__UpperBoundAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIODComponentTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_5_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMIODComponentTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentTypeInstance__ComponentTypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeInstanceAccess().getComponentTypeMAODComponentTypeCrossReference_1_0()); }
(
{ before(grammarAccess.getMAODComponentTypeInstanceAccess().getComponentTypeMAODComponentTypeIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMAODComponentTypeInstanceAccess().getComponentTypeMAODComponentTypeIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMAODComponentTypeInstanceAccess().getComponentTypeMAODComponentTypeCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentTypeInstance__LowerBoundAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMAODComponentTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAODComponentTypeInstance__UpperBoundAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAODComponentTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_5_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMAODComponentTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalClientPortTypeInstance__PortTypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0()); }
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getPortTypeMPortTypeIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getPortTypeMPortTypeIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalClientPortTypeInstance__LowerBoundAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalClientPortTypeInstance__UpperBoundAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalClientPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMExternalClientPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalServerPortTypeInstance__PortTypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0()); }
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getPortTypeMPortTypeIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getPortTypeMPortTypeIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalServerPortTypeInstance__LowerBoundAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExternalServerPortTypeInstance__UpperBoundAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExternalServerPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMExternalServerPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalClientPortTypeInstance__PortTypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0()); }
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getPortTypeMPortTypeIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getPortTypeMPortTypeIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalClientPortTypeInstance__LowerBoundAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalClientPortTypeInstance__UpperBoundAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalClientPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMInternalClientPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalServerPortTypeInstance__PortTypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0()); }
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getPortTypeMPortTypeIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getPortTypeMPortTypeIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalServerPortTypeInstance__LowerBoundAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MInternalServerPortTypeInstance__UpperBoundAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMInternalServerPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMInternalServerPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMPortTypeAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__InheritsAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getInheritsMPortTypeCrossReference_4_1_0()); }
(
{ before(grammarAccess.getMPortTypeAccess().getInheritsMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMPortTypeAccess().getInheritsMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getMPortTypeAccess().getInheritsMPortTypeCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__InheritsAssignment_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getInheritsMPortTypeCrossReference_4_2_1_0()); }
(
{ before(grammarAccess.getMPortTypeAccess().getInheritsMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMPortTypeAccess().getInheritsMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1()); }
)
{ after(grammarAccess.getMPortTypeAccess().getInheritsMPortTypeCrossReference_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__InterfaceTypesAssignment_6_0_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeCrossReference_6_0_3_0()); }
(
{ before(grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_6_0_3_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_6_0_3_0_1()); }
)
{ after(grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeCrossReference_6_0_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__InterfaceTypesAssignment_6_0_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeCrossReference_6_0_4_1_0()); }
(
{ before(grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_6_0_4_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_6_0_4_1_0_1()); }
)
{ after(grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeCrossReference_6_0_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__AttributesAssignment_6_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getAttributesMParameterParserRuleCall_6_1_2_0()); }
	ruleMParameter{ after(grammarAccess.getMPortTypeAccess().getAttributesMParameterParserRuleCall_6_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__ClientAttributesAssignment_6_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getClientAttributesMParameterParserRuleCall_6_2_3_0()); }
	ruleMParameter{ after(grammarAccess.getMPortTypeAccess().getClientAttributesMParameterParserRuleCall_6_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPortType__ServerAttributesAssignment_6_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPortTypeAccess().getServerAttributesMParameterParserRuleCall_6_3_3_0()); }
	ruleMParameter{ after(grammarAccess.getMPortTypeAccess().getServerAttributesMParameterParserRuleCall_6_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMExchangeModelAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__InheritsAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelCrossReference_4_1_0()); }
(
{ before(grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__InheritsAssignment_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelCrossReference_4_2_1_0()); }
(
{ before(grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelVersionedQualifiedReferenceNameParserRuleCall_4_2_1_0_1()); }
)
{ after(grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelCrossReference_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__InterfaceTypesAssignment_9
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_9_0()); }
(
{ before(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_9_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_9_0_1()); }
)
{ after(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__InterfaceTypesAssignment_11
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_11_0()); }
(
{ before(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_11_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_11_0_1()); }
)
{ after(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_11_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MExchangeModel__InterfaceTypesAssignment_12_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_12_1_0()); }
(
{ before(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_12_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeVersionedQualifiedReferenceNameParserRuleCall_12_1_0_1()); }
)
{ after(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_12_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMConnectorAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__InheritsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getInheritsMConnectorCrossReference_2_1_0()); }
(
{ before(grammarAccess.getMConnectorAccess().getInheritsMConnectorVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMConnectorAccess().getInheritsMConnectorVersionedQualifiedReferenceNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMConnectorAccess().getInheritsMConnectorCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__InheritsAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getInheritsMConnectorCrossReference_2_2_1_0()); }
(
{ before(grammarAccess.getMConnectorAccess().getInheritsMConnectorVersionedQualifiedReferenceNameParserRuleCall_2_2_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMConnectorAccess().getInheritsMConnectorVersionedQualifiedReferenceNameParserRuleCall_2_2_1_0_1()); }
)
{ after(grammarAccess.getMConnectorAccess().getInheritsMConnectorCrossReference_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__ClientPortTypesAssignment_4_0_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeCrossReference_4_0_3_0()); }
(
{ before(grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_3_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_3_0_1()); }
)
{ after(grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeCrossReference_4_0_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__ClientPortTypesAssignment_4_0_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeCrossReference_4_0_4_1_0()); }
(
{ before(grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_4_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_0_4_1_0_1()); }
)
{ after(grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeCrossReference_4_0_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__ServerPortTypesAssignment_4_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeCrossReference_4_1_3_0()); }
(
{ before(grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_3_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_3_0_1()); }
)
{ after(grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeCrossReference_4_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__ServerPortTypesAssignment_4_1_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeCrossReference_4_1_4_1_0()); }
(
{ before(grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_4_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeVersionedQualifiedReferenceNameParserRuleCall_4_1_4_1_0_1()); }
)
{ after(grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeCrossReference_4_1_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConnector__AttributesAssignment_4_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConnectorAccess().getAttributesMParameterParserRuleCall_4_2_2_0()); }
	ruleMParameter{ after(grammarAccess.getMConnectorAccess().getAttributesMParameterParserRuleCall_4_2_2_0()); }
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


RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


