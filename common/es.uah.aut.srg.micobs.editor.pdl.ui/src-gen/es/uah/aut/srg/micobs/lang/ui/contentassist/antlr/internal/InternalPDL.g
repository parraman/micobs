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
grammar InternalPDL;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
	
}

@lexer::header {
package es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal; 

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
import es.uah.aut.srg.micobs.lang.services.PDLGrammarAccess;

}

@parser::members {
 
 	private PDLGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
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




// Entry rule entryRuleMPDLPackageFile
entryRuleMPDLPackageFile 
:
{ before(grammarAccess.getMPDLPackageFileRule()); }
	 ruleMPDLPackageFile
{ after(grammarAccess.getMPDLPackageFileRule()); } 
	 EOF 
;

// Rule MPDLPackageFile
ruleMPDLPackageFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMPDLPackageFileAccess().getGroup()); }
(rule__MPDLPackageFile__Group__0)
{ after(grammarAccess.getMPDLPackageFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMPDLPackageElement
entryRuleMPDLPackageElement 
:
{ before(grammarAccess.getMPDLPackageElementRule()); }
	 ruleMPDLPackageElement
{ after(grammarAccess.getMPDLPackageElementRule()); } 
	 EOF 
;

// Rule MPDLPackageElement
ruleMPDLPackageElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMPDLPackageElementAccess().getAlternatives()); }
(rule__MPDLPackageElement__Alternatives)
{ after(grammarAccess.getMPDLPackageElementAccess().getAlternatives()); }
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



// Entry rule entryRuleMCompiler
entryRuleMCompiler 
:
{ before(grammarAccess.getMCompilerRule()); }
	 ruleMCompiler
{ after(grammarAccess.getMCompilerRule()); } 
	 EOF 
;

// Rule MCompiler
ruleMCompiler
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMCompilerAccess().getGroup()); }
(rule__MCompiler__Group__0)
{ after(grammarAccess.getMCompilerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMCompilerFrontend
entryRuleMCompilerFrontend 
:
{ before(grammarAccess.getMCompilerFrontendRule()); }
	 ruleMCompilerFrontend
{ after(grammarAccess.getMCompilerFrontendRule()); } 
	 EOF 
;

// Rule MCompilerFrontend
ruleMCompilerFrontend
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getGroup()); }
(rule__MCompilerFrontend__Group__0)
{ after(grammarAccess.getMCompilerFrontendAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMBoard
entryRuleMBoard 
:
{ before(grammarAccess.getMBoardRule()); }
	 ruleMBoard
{ after(grammarAccess.getMBoardRule()); } 
	 EOF 
;

// Rule MBoard
ruleMBoard
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMBoardAccess().getGroup()); }
(rule__MBoard__Group__0)
{ after(grammarAccess.getMBoardAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMBoardSupportedDevice
entryRuleMBoardSupportedDevice 
:
{ before(grammarAccess.getMBoardSupportedDeviceRule()); }
	 ruleMBoardSupportedDevice
{ after(grammarAccess.getMBoardSupportedDeviceRule()); } 
	 EOF 
;

// Rule MBoardSupportedDevice
ruleMBoardSupportedDevice
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMBoardSupportedDeviceAccess().getGroup()); }
(rule__MBoardSupportedDevice__Group__0)
{ after(grammarAccess.getMBoardSupportedDeviceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMicroprocessor
entryRuleMMicroprocessor 
:
{ before(grammarAccess.getMMicroprocessorRule()); }
	 ruleMMicroprocessor
{ after(grammarAccess.getMMicroprocessorRule()); } 
	 EOF 
;

// Rule MMicroprocessor
ruleMMicroprocessor
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMicroprocessorAccess().getGroup()); }
(rule__MMicroprocessor__Group__0)
{ after(grammarAccess.getMMicroprocessorAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMOperatingSystem
entryRuleMOperatingSystem 
:
{ before(grammarAccess.getMOperatingSystemRule()); }
	 ruleMOperatingSystem
{ after(grammarAccess.getMOperatingSystemRule()); } 
	 EOF 
;

// Rule MOperatingSystem
ruleMOperatingSystem
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMOperatingSystemAccess().getGroup()); }
(rule__MOperatingSystem__Group__0)
{ after(grammarAccess.getMOperatingSystemAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMOSSupportedOSAPI
entryRuleMOSSupportedOSAPI 
:
{ before(grammarAccess.getMOSSupportedOSAPIRule()); }
	 ruleMOSSupportedOSAPI
{ after(grammarAccess.getMOSSupportedOSAPIRule()); } 
	 EOF 
;

// Rule MOSSupportedOSAPI
ruleMOSSupportedOSAPI
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMOSSupportedOSAPIAccess().getGroup()); }
(rule__MOSSupportedOSAPI__Group__0)
{ after(grammarAccess.getMOSSupportedOSAPIAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMOSSupportedOSAPIPVA
entryRuleMOSSupportedOSAPIPVA 
:
{ before(grammarAccess.getMOSSupportedOSAPIPVARule()); }
	 ruleMOSSupportedOSAPIPVA
{ after(grammarAccess.getMOSSupportedOSAPIPVARule()); } 
	 EOF 
;

// Rule MOSSupportedOSAPIPVA
ruleMOSSupportedOSAPIPVA
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVAAccess().getAlternatives()); }
(rule__MOSSupportedOSAPIPVA__Alternatives)
{ after(grammarAccess.getMOSSupportedOSAPIPVAAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMOSSupportedOSAPIPVAExpression
entryRuleMOSSupportedOSAPIPVAExpression 
:
{ before(grammarAccess.getMOSSupportedOSAPIPVAExpressionRule()); }
	 ruleMOSSupportedOSAPIPVAExpression
{ after(grammarAccess.getMOSSupportedOSAPIPVAExpressionRule()); } 
	 EOF 
;

// Rule MOSSupportedOSAPIPVAExpression
ruleMOSSupportedOSAPIPVAExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getGroup()); }
(rule__MOSSupportedOSAPIPVAExpression__Group__0)
{ after(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMOSSupportedOSAPIPVASwitch
entryRuleMOSSupportedOSAPIPVASwitch 
:
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchRule()); }
	 ruleMOSSupportedOSAPIPVASwitch
{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchRule()); } 
	 EOF 
;

// Rule MOSSupportedOSAPIPVASwitch
ruleMOSSupportedOSAPIPVASwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getGroup()); }
(rule__MOSSupportedOSAPIPVASwitch__Group__0)
{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMOSSupportedOSAPIPVASwitchCase
entryRuleMOSSupportedOSAPIPVASwitchCase 
:
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseRule()); }
	 ruleMOSSupportedOSAPIPVASwitchCase
{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseRule()); } 
	 EOF 
;

// Rule MOSSupportedOSAPIPVASwitchCase
ruleMOSSupportedOSAPIPVASwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getGroup()); }
(rule__MOSSupportedOSAPIPVASwitchCase__Group__0)
{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getGroup()); }
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



// Entry rule entryRuleMBooleanParamOSSPSwitch
entryRuleMBooleanParamOSSPSwitch 
:
{ before(grammarAccess.getMBooleanParamOSSPSwitchRule()); }
	 ruleMBooleanParamOSSPSwitch
{ after(grammarAccess.getMBooleanParamOSSPSwitchRule()); } 
	 EOF 
;

// Rule MBooleanParamOSSPSwitch
ruleMBooleanParamOSSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getGroup()); }
(rule__MBooleanParamOSSPSwitch__Group__0)
{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMBooleanParamOSSPSwitchCase
entryRuleMBooleanParamOSSPSwitchCase 
:
{ before(grammarAccess.getMBooleanParamOSSPSwitchCaseRule()); }
	 ruleMBooleanParamOSSPSwitchCase
{ after(grammarAccess.getMBooleanParamOSSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MBooleanParamOSSPSwitchCase
ruleMBooleanParamOSSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getGroup()); }
(rule__MBooleanParamOSSPSwitchCase__Group__0)
{ after(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMStringParamOSSPSwitch
entryRuleMStringParamOSSPSwitch 
:
{ before(grammarAccess.getMStringParamOSSPSwitchRule()); }
	 ruleMStringParamOSSPSwitch
{ after(grammarAccess.getMStringParamOSSPSwitchRule()); } 
	 EOF 
;

// Rule MStringParamOSSPSwitch
ruleMStringParamOSSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getGroup()); }
(rule__MStringParamOSSPSwitch__Group__0)
{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMStringParamOSSPSwitchCase
entryRuleMStringParamOSSPSwitchCase 
:
{ before(grammarAccess.getMStringParamOSSPSwitchCaseRule()); }
	 ruleMStringParamOSSPSwitchCase
{ after(grammarAccess.getMStringParamOSSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MStringParamOSSPSwitchCase
ruleMStringParamOSSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getGroup()); }
(rule__MStringParamOSSPSwitchCase__Group__0)
{ after(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMIntegerParamOSSPSwitch
entryRuleMIntegerParamOSSPSwitch 
:
{ before(grammarAccess.getMIntegerParamOSSPSwitchRule()); }
	 ruleMIntegerParamOSSPSwitch
{ after(grammarAccess.getMIntegerParamOSSPSwitchRule()); } 
	 EOF 
;

// Rule MIntegerParamOSSPSwitch
ruleMIntegerParamOSSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getGroup()); }
(rule__MIntegerParamOSSPSwitch__Group__0)
{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMIntegerParamOSSPSwitchCase
entryRuleMIntegerParamOSSPSwitchCase 
:
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseRule()); }
	 ruleMIntegerParamOSSPSwitchCase
{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MIntegerParamOSSPSwitchCase
ruleMIntegerParamOSSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getGroup()); }
(rule__MIntegerParamOSSPSwitchCase__Group__0)
{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMRealParamOSSPSwitch
entryRuleMRealParamOSSPSwitch 
:
{ before(grammarAccess.getMRealParamOSSPSwitchRule()); }
	 ruleMRealParamOSSPSwitch
{ after(grammarAccess.getMRealParamOSSPSwitchRule()); } 
	 EOF 
;

// Rule MRealParamOSSPSwitch
ruleMRealParamOSSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getGroup()); }
(rule__MRealParamOSSPSwitch__Group__0)
{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMRealParamOSSPSwitchCase
entryRuleMRealParamOSSPSwitchCase 
:
{ before(grammarAccess.getMRealParamOSSPSwitchCaseRule()); }
	 ruleMRealParamOSSPSwitchCase
{ after(grammarAccess.getMRealParamOSSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MRealParamOSSPSwitchCase
ruleMRealParamOSSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getGroup()); }
(rule__MRealParamOSSPSwitchCase__Group__0)
{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParamOSSPSwitch
entryRuleMEnumParamOSSPSwitch 
:
{ before(grammarAccess.getMEnumParamOSSPSwitchRule()); }
	 ruleMEnumParamOSSPSwitch
{ after(grammarAccess.getMEnumParamOSSPSwitchRule()); } 
	 EOF 
;

// Rule MEnumParamOSSPSwitch
ruleMEnumParamOSSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getGroup()); }
(rule__MEnumParamOSSPSwitch__Group__0)
{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParamOSSPSwitchCase
entryRuleMEnumParamOSSPSwitchCase 
:
{ before(grammarAccess.getMEnumParamOSSPSwitchCaseRule()); }
	 ruleMEnumParamOSSPSwitchCase
{ after(grammarAccess.getMEnumParamOSSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MEnumParamOSSPSwitchCase
ruleMEnumParamOSSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getGroup()); }
(rule__MEnumParamOSSPSwitchCase__Group__0)
{ after(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMParameterWithoutOSSP
entryRuleMParameterWithoutOSSP 
:
{ before(grammarAccess.getMParameterWithoutOSSPRule()); }
	 ruleMParameterWithoutOSSP
{ after(grammarAccess.getMParameterWithoutOSSPRule()); } 
	 EOF 
;

// Rule MParameterWithoutOSSP
ruleMParameterWithoutOSSP
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterWithoutOSSPAccess().getAlternatives()); }
(rule__MParameterWithoutOSSP__Alternatives)
{ after(grammarAccess.getMParameterWithoutOSSPAccess().getAlternatives()); }
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



// Entry rule entryRuleMEnumParamStringLiteralRegular
entryRuleMEnumParamStringLiteralRegular 
:
{ before(grammarAccess.getMEnumParamStringLiteralRegularRule()); }
	 ruleMEnumParamStringLiteralRegular
{ after(grammarAccess.getMEnumParamStringLiteralRegularRule()); } 
	 EOF 
;

// Rule MEnumParamStringLiteralRegular
ruleMEnumParamStringLiteralRegular
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParamStringLiteralRegularAccess().getGroup()); }
(rule__MEnumParamStringLiteralRegular__Group__0)
{ after(grammarAccess.getMEnumParamStringLiteralRegularAccess().getGroup()); }
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



// Entry rule entryRuleMOperatingSystemAPI
entryRuleMOperatingSystemAPI 
:
{ before(grammarAccess.getMOperatingSystemAPIRule()); }
	 ruleMOperatingSystemAPI
{ after(grammarAccess.getMOperatingSystemAPIRule()); } 
	 EOF 
;

// Rule MOperatingSystemAPI
ruleMOperatingSystemAPI
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getGroup()); }
(rule__MOperatingSystemAPI__Group__0)
{ after(grammarAccess.getMOperatingSystemAPIAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDevice
entryRuleMDevice 
:
{ before(grammarAccess.getMDeviceRule()); }
	 ruleMDevice
{ after(grammarAccess.getMDeviceRule()); } 
	 EOF 
;

// Rule MDevice
ruleMDevice
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDeviceAccess().getGroup()); }
(rule__MDevice__Group__0)
{ after(grammarAccess.getMDeviceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMArchitecture
entryRuleMArchitecture 
:
{ before(grammarAccess.getMArchitectureRule()); }
	 ruleMArchitecture
{ after(grammarAccess.getMArchitectureRule()); } 
	 EOF 
;

// Rule MArchitecture
ruleMArchitecture
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMArchitectureAccess().getGroup()); }
(rule__MArchitecture__Group__0)
{ after(grammarAccess.getMArchitectureAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMOSSupportedPlatform
entryRuleMOSSupportedPlatform 
:
{ before(grammarAccess.getMOSSupportedPlatformRule()); }
	 ruleMOSSupportedPlatform
{ after(grammarAccess.getMOSSupportedPlatformRule()); } 
	 EOF 
;

// Rule MOSSupportedPlatform
ruleMOSSupportedPlatform
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getGroup()); }
(rule__MOSSupportedPlatform__Group__0)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMPlatform
entryRuleMPlatform 
:
{ before(grammarAccess.getMPlatformRule()); }
	 ruleMPlatform
{ after(grammarAccess.getMPlatformRule()); } 
	 EOF 
;

// Rule MPlatform
ruleMPlatform
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMPlatformAccess().getGroup()); }
(rule__MPlatform__Group__0)
{ after(grammarAccess.getMPlatformAccess().getGroup()); }
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



rule__MPDLPackageElement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPDLPackageElementAccess().getMBoardParserRuleCall_0()); }
	ruleMBoard
{ after(grammarAccess.getMPDLPackageElementAccess().getMBoardParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMPDLPackageElementAccess().getMMicroprocessorParserRuleCall_1()); }
	ruleMMicroprocessor
{ after(grammarAccess.getMPDLPackageElementAccess().getMMicroprocessorParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getMPDLPackageElementAccess().getMOperatingSystemParserRuleCall_2()); }
	ruleMOperatingSystem
{ after(grammarAccess.getMPDLPackageElementAccess().getMOperatingSystemParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getMPDLPackageElementAccess().getMOperatingSystemAPIParserRuleCall_3()); }
	ruleMOperatingSystemAPI
{ after(grammarAccess.getMPDLPackageElementAccess().getMOperatingSystemAPIParserRuleCall_3()); }
)

    |(
{ before(grammarAccess.getMPDLPackageElementAccess().getMArchitectureParserRuleCall_4()); }
	ruleMArchitecture
{ after(grammarAccess.getMPDLPackageElementAccess().getMArchitectureParserRuleCall_4()); }
)

    |(
{ before(grammarAccess.getMPDLPackageElementAccess().getMPlatformParserRuleCall_5()); }
	ruleMPlatform
{ after(grammarAccess.getMPDLPackageElementAccess().getMPlatformParserRuleCall_5()); }
)

    |(
{ before(grammarAccess.getMPDLPackageElementAccess().getMCompilerParserRuleCall_6()); }
	ruleMCompiler
{ after(grammarAccess.getMPDLPackageElementAccess().getMCompilerParserRuleCall_6()); }
)

    |(
{ before(grammarAccess.getMPDLPackageElementAccess().getMDeviceParserRuleCall_7()); }
	ruleMDevice
{ after(grammarAccess.getMPDLPackageElementAccess().getMDeviceParserRuleCall_7()); }
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

rule__MOSSupportedOSAPIPVA__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVAAccess().getMOSSupportedOSAPIPVAExpressionParserRuleCall_0()); }
	ruleMOSSupportedOSAPIPVAExpression
{ after(grammarAccess.getMOSSupportedOSAPIPVAAccess().getMOSSupportedOSAPIPVAExpressionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMOSSupportedOSAPIPVAAccess().getMOSSupportedOSAPIPVASwitchParserRuleCall_1()); }
	ruleMOSSupportedOSAPIPVASwitch
{ after(grammarAccess.getMOSSupportedOSAPIPVAAccess().getMOSSupportedOSAPIPVASwitchParserRuleCall_1()); }
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
{ before(grammarAccess.getMParameterAccess().getMBooleanParamOSSPSwitchParserRuleCall_6()); }
	ruleMBooleanParamOSSPSwitch
{ after(grammarAccess.getMParameterAccess().getMBooleanParamOSSPSwitchParserRuleCall_6()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMStringParamOSSPSwitchParserRuleCall_7()); }
	ruleMStringParamOSSPSwitch
{ after(grammarAccess.getMParameterAccess().getMStringParamOSSPSwitchParserRuleCall_7()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMIntegerParamOSSPSwitchParserRuleCall_8()); }
	ruleMIntegerParamOSSPSwitch
{ after(grammarAccess.getMParameterAccess().getMIntegerParamOSSPSwitchParserRuleCall_8()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMRealParamOSSPSwitchParserRuleCall_9()); }
	ruleMRealParamOSSPSwitch
{ after(grammarAccess.getMParameterAccess().getMRealParamOSSPSwitchParserRuleCall_9()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMEnumParamOSSPSwitchParserRuleCall_10()); }
	ruleMEnumParamOSSPSwitch
{ after(grammarAccess.getMParameterAccess().getMEnumParamOSSPSwitchParserRuleCall_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterWithoutOSSP__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterWithoutOSSPAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); }
	ruleMIntegerParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutOSSPAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutOSSPAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); }
	ruleMEnumParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutOSSPAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutOSSPAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); }
	ruleMBooleanParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutOSSPAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutOSSPAccess().getMRealParameterSingleExpressionParserRuleCall_3()); }
	ruleMRealParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutOSSPAccess().getMRealParameterSingleExpressionParserRuleCall_3()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutOSSPAccess().getMStringParameterSingleExpressionParserRuleCall_4()); }
	ruleMStringParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutOSSPAccess().getMStringParameterSingleExpressionParserRuleCall_4()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutOSSPAccess().getMEnumParameterDefinitionParserRuleCall_5()); }
	ruleMEnumParameterDefinition
{ after(grammarAccess.getMParameterWithoutOSSPAccess().getMEnumParameterDefinitionParserRuleCall_5()); }
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
{ before(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamStringLiteralRegularParserRuleCall_3()); }
	ruleMEnumParamStringLiteralRegular
{ after(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamStringLiteralRegularParserRuleCall_3()); }
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

rule__MOSSupportedPlatform__Alternatives_5_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getAnyKeyword_5_2_2_0()); }

	'any' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getAnyKeyword_5_2_2_0()); }
)

    |(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorAssignment_5_2_2_1()); }
(rule__MOSSupportedPlatform__MicroprocessorAssignment_5_2_2_1)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorAssignment_5_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Alternatives_5_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getAnyKeyword_5_3_2_0()); }

	'any' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getAnyKeyword_5_3_2_0()); }
)

    |(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getBoardAssignment_5_3_2_1()); }
(rule__MOSSupportedPlatform__BoardAssignment_5_3_2_1)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getBoardAssignment_5_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Alternatives_3_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getAnyKeyword_3_5_2_0()); }

	'any' 

{ after(grammarAccess.getMPlatformAccess().getAnyKeyword_3_5_2_0()); }
)

    |(
{ before(grammarAccess.getMPlatformAccess().getMicroprocessorAssignment_3_5_2_1()); }
(rule__MPlatform__MicroprocessorAssignment_3_5_2_1)
{ after(grammarAccess.getMPlatformAccess().getMicroprocessorAssignment_3_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Alternatives_3_6_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getAnyKeyword_3_6_2_0()); }

	'any' 

{ after(grammarAccess.getMPlatformAccess().getAnyKeyword_3_6_2_0()); }
)

    |(
{ before(grammarAccess.getMPlatformAccess().getBoardAssignment_3_6_2_1()); }
(rule__MPlatform__BoardAssignment_3_6_2_1)
{ after(grammarAccess.getMPlatformAccess().getBoardAssignment_3_6_2_1()); }
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



rule__MPDLPackageFile__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPDLPackageFile__Group__0__Impl
	rule__MPDLPackageFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPDLPackageFile__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPDLPackageFileAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getMPDLPackageFileAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPDLPackageFile__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPDLPackageFile__Group__1__Impl
	rule__MPDLPackageFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPDLPackageFile__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPDLPackageFileAccess().getPackageAssignment_1()); }
(rule__MPDLPackageFile__PackageAssignment_1)
{ after(grammarAccess.getMPDLPackageFileAccess().getPackageAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPDLPackageFile__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPDLPackageFile__Group__2__Impl
	rule__MPDLPackageFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPDLPackageFile__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPDLPackageFileAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getMPDLPackageFileAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPDLPackageFile__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPDLPackageFile__Group__3__Impl
	rule__MPDLPackageFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MPDLPackageFile__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPDLPackageFileAccess().getGroup_3()); }
(rule__MPDLPackageFile__Group_3__0)*
{ after(grammarAccess.getMPDLPackageFileAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPDLPackageFile__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPDLPackageFile__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPDLPackageFile__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPDLPackageFileAccess().getElementAssignment_4()); }
(rule__MPDLPackageFile__ElementAssignment_4)
{ after(grammarAccess.getMPDLPackageFileAccess().getElementAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MPDLPackageFile__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPDLPackageFile__Group_3__0__Impl
	rule__MPDLPackageFile__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPDLPackageFile__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPDLPackageFileAccess().getImportKeyword_3_0()); }

	'import' 

{ after(grammarAccess.getMPDLPackageFileAccess().getImportKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPDLPackageFile__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPDLPackageFile__Group_3__1__Impl
	rule__MPDLPackageFile__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPDLPackageFile__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPDLPackageFileAccess().getImportsAssignment_3_1()); }
(rule__MPDLPackageFile__ImportsAssignment_3_1)
{ after(grammarAccess.getMPDLPackageFileAccess().getImportsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPDLPackageFile__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPDLPackageFile__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPDLPackageFile__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPDLPackageFileAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getMPDLPackageFileAccess().getSemicolonKeyword_3_2()); }
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






rule__MCompiler__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group__0__Impl
	rule__MCompiler__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getCompilerKeyword_0()); }

	'compiler' 

{ after(grammarAccess.getMCompilerAccess().getCompilerKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group__1__Impl
	rule__MCompiler__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getNameAssignment_1()); }
(rule__MCompiler__NameAssignment_1)
{ after(grammarAccess.getMCompilerAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group__2__Impl
	rule__MCompiler__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getGroup_2()); }
(rule__MCompiler__Group_2__0)?
{ after(grammarAccess.getMCompilerAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group__3__Impl
	rule__MCompiler__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMCompilerAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group__4__Impl
	rule__MCompiler__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getUnorderedGroup_4()); }
(rule__MCompiler__UnorderedGroup_4)
{ after(grammarAccess.getMCompilerAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group__5__Impl
	rule__MCompiler__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMCompilerAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMCompilerAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MCompiler__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_2__0__Impl
	rule__MCompiler__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getExtendsKeyword_2_0()); }

	'extends' 

{ after(grammarAccess.getMCompilerAccess().getExtendsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_2__1__Impl
	rule__MCompiler__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getExtendsAssignment_2_1()); }
(rule__MCompiler__ExtendsAssignment_2_1)
{ after(grammarAccess.getMCompilerAccess().getExtendsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getGroup_2_2()); }
(rule__MCompiler__Group_2_2__0)*
{ after(grammarAccess.getMCompilerAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MCompiler__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_2_2__0__Impl
	rule__MCompiler__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getMCompilerAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getExtendsAssignment_2_2_1()); }
(rule__MCompiler__ExtendsAssignment_2_2_1)
{ after(grammarAccess.getMCompilerAccess().getExtendsAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MCompiler__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_0__0__Impl
	rule__MCompiler__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getVersionKeyword_4_0_0()); }

	'version' 

{ after(grammarAccess.getMCompilerAccess().getVersionKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_0__1__Impl
	rule__MCompiler__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getColonEqualsSignKeyword_4_0_1()); }

	':=' 

{ after(grammarAccess.getMCompilerAccess().getColonEqualsSignKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_0__2__Impl
	rule__MCompiler__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getVersionAssignment_4_0_2()); }
(rule__MCompiler__VersionAssignment_4_0_2)
{ after(grammarAccess.getMCompilerAccess().getVersionAssignment_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getSemicolonKeyword_4_0_3()); }

	';' 

{ after(grammarAccess.getMCompilerAccess().getSemicolonKeyword_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MCompiler__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_1__0__Impl
	rule__MCompiler__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getFrontendsKeyword_4_1_0()); }

	'frontends' 

{ after(grammarAccess.getMCompilerAccess().getFrontendsKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_1__1__Impl
	rule__MCompiler__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getLeftCurlyBracketKeyword_4_1_1()); }

	'{' 

{ after(grammarAccess.getMCompilerAccess().getLeftCurlyBracketKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_1__2__Impl
	rule__MCompiler__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMCompilerAccess().getFrontendsAssignment_4_1_2()); }
(rule__MCompiler__FrontendsAssignment_4_1_2)
{ after(grammarAccess.getMCompilerAccess().getFrontendsAssignment_4_1_2()); }
)
(
{ before(grammarAccess.getMCompilerAccess().getFrontendsAssignment_4_1_2()); }
(rule__MCompiler__FrontendsAssignment_4_1_2)*
{ after(grammarAccess.getMCompilerAccess().getFrontendsAssignment_4_1_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_1__3__Impl
	rule__MCompiler__Group_4_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getRightCurlyBracketKeyword_4_1_3()); }

	'}' 

{ after(grammarAccess.getMCompilerAccess().getRightCurlyBracketKeyword_4_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_4_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getSemicolonKeyword_4_1_4()); }

	';' 

{ after(grammarAccess.getMCompilerAccess().getSemicolonKeyword_4_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MCompiler__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_2__0__Impl
	rule__MCompiler__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getConfigurationKeyword_4_2_0()); }

	'configuration' 

{ after(grammarAccess.getMCompilerAccess().getConfigurationKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_2__1__Impl
	rule__MCompiler__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getParametersKeyword_4_2_1()); }

	'parameters' 

{ after(grammarAccess.getMCompilerAccess().getParametersKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_2__2__Impl
	rule__MCompiler__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getLeftCurlyBracketKeyword_4_2_2()); }

	'{' 

{ after(grammarAccess.getMCompilerAccess().getLeftCurlyBracketKeyword_4_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_2__3__Impl
	rule__MCompiler__Group_4_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMCompilerAccess().getParametersAssignment_4_2_3()); }
(rule__MCompiler__ParametersAssignment_4_2_3)
{ after(grammarAccess.getMCompilerAccess().getParametersAssignment_4_2_3()); }
)
(
{ before(grammarAccess.getMCompilerAccess().getParametersAssignment_4_2_3()); }
(rule__MCompiler__ParametersAssignment_4_2_3)*
{ after(grammarAccess.getMCompilerAccess().getParametersAssignment_4_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_4_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_2__4__Impl
	rule__MCompiler__Group_4_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getRightCurlyBracketKeyword_4_2_4()); }

	'}' 

{ after(grammarAccess.getMCompilerAccess().getRightCurlyBracketKeyword_4_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__Group_4_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__Group_4_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__Group_4_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getSemicolonKeyword_4_2_5()); }

	';' 

{ after(grammarAccess.getMCompilerAccess().getSemicolonKeyword_4_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MCompilerFrontend__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group__0__Impl
	rule__MCompilerFrontend__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getFrontendKeyword_0()); }

	'frontend' 

{ after(grammarAccess.getMCompilerFrontendAccess().getFrontendKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group__1__Impl
	rule__MCompilerFrontend__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getNameAssignment_1()); }
(rule__MCompilerFrontend__NameAssignment_1)
{ after(grammarAccess.getMCompilerFrontendAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group__2__Impl
	rule__MCompilerFrontend__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMCompilerFrontendAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group__3__Impl
	rule__MCompilerFrontend__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3()); }
(rule__MCompilerFrontend__UnorderedGroup_3)
{ after(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group__4__Impl
	rule__MCompilerFrontend__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMCompilerFrontendAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MCompilerFrontend__Group_3_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_0__0__Impl
	rule__MCompilerFrontend__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getLanguageKeyword_3_0_0()); }

	'language' 

{ after(grammarAccess.getMCompilerFrontendAccess().getLanguageKeyword_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_0__1__Impl
	rule__MCompilerFrontend__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getColonEqualsSignKeyword_3_0_1()); }

	':=' 

{ after(grammarAccess.getMCompilerFrontendAccess().getColonEqualsSignKeyword_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_0__2__Impl
	rule__MCompilerFrontend__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getLanguageAssignment_3_0_2()); }
(rule__MCompilerFrontend__LanguageAssignment_3_0_2)
{ after(grammarAccess.getMCompilerFrontendAccess().getLanguageAssignment_3_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_3_0_3()); }

	';' 

{ after(grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_3_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MCompilerFrontend__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_1__0__Impl
	rule__MCompilerFrontend__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getArchitecturesKeyword_3_1_0()); }

	'architectures' 

{ after(grammarAccess.getMCompilerFrontendAccess().getArchitecturesKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_1__1__Impl
	rule__MCompilerFrontend__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getColonEqualsSignKeyword_3_1_1()); }

	':=' 

{ after(grammarAccess.getMCompilerFrontendAccess().getColonEqualsSignKeyword_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_1__2__Impl
	rule__MCompilerFrontend__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getArchitecturesAssignment_3_1_2()); }
(rule__MCompilerFrontend__ArchitecturesAssignment_3_1_2)
{ after(grammarAccess.getMCompilerFrontendAccess().getArchitecturesAssignment_3_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_1__3__Impl
	rule__MCompilerFrontend__Group_3_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getGroup_3_1_3()); }
(rule__MCompilerFrontend__Group_3_1_3__0)*
{ after(grammarAccess.getMCompilerFrontendAccess().getGroup_3_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_3_1_4()); }

	';' 

{ after(grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_3_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MCompilerFrontend__Group_3_1_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_1_3__0__Impl
	rule__MCompilerFrontend__Group_3_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_1_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getCommaKeyword_3_1_3_0()); }

	',' 

{ after(grammarAccess.getMCompilerFrontendAccess().getCommaKeyword_3_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_1_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_1_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getArchitecturesAssignment_3_1_3_1()); }
(rule__MCompilerFrontend__ArchitecturesAssignment_3_1_3_1)
{ after(grammarAccess.getMCompilerFrontendAccess().getArchitecturesAssignment_3_1_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MCompilerFrontend__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_2__0__Impl
	rule__MCompilerFrontend__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getConfigurationKeyword_3_2_0()); }

	'configuration' 

{ after(grammarAccess.getMCompilerFrontendAccess().getConfigurationKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_2__1__Impl
	rule__MCompilerFrontend__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getParametersKeyword_3_2_1()); }

	'parameters' 

{ after(grammarAccess.getMCompilerFrontendAccess().getParametersKeyword_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_2__2__Impl
	rule__MCompilerFrontend__Group_3_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getLeftCurlyBracketKeyword_3_2_2()); }

	'{' 

{ after(grammarAccess.getMCompilerFrontendAccess().getLeftCurlyBracketKeyword_3_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_2__3__Impl
	rule__MCompilerFrontend__Group_3_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMCompilerFrontendAccess().getParametersAssignment_3_2_3()); }
(rule__MCompilerFrontend__ParametersAssignment_3_2_3)
{ after(grammarAccess.getMCompilerFrontendAccess().getParametersAssignment_3_2_3()); }
)
(
{ before(grammarAccess.getMCompilerFrontendAccess().getParametersAssignment_3_2_3()); }
(rule__MCompilerFrontend__ParametersAssignment_3_2_3)*
{ after(grammarAccess.getMCompilerFrontendAccess().getParametersAssignment_3_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_2__4__Impl
	rule__MCompilerFrontend__Group_3_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getRightCurlyBracketKeyword_3_2_4()); }

	'}' 

{ after(grammarAccess.getMCompilerFrontendAccess().getRightCurlyBracketKeyword_3_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__Group_3_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__Group_3_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__Group_3_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_3_2_5()); }

	';' 

{ after(grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_3_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MBoard__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group__0__Impl
	rule__MBoard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getBoardKeyword_0()); }

	'board' 

{ after(grammarAccess.getMBoardAccess().getBoardKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group__1__Impl
	rule__MBoard__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getNameAssignment_1()); }
(rule__MBoard__NameAssignment_1)
{ after(grammarAccess.getMBoardAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group__2__Impl
	rule__MBoard__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMBoardAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group__3__Impl
	rule__MBoard__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getUnorderedGroup_3()); }
(rule__MBoard__UnorderedGroup_3)
{ after(grammarAccess.getMBoardAccess().getUnorderedGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group__4__Impl
	rule__MBoard__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMBoardAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMBoardAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MBoard__Group_3_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_0__0__Impl
	rule__MBoard__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getVersionKeyword_3_0_0()); }

	'version' 

{ after(grammarAccess.getMBoardAccess().getVersionKeyword_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_0__1__Impl
	rule__MBoard__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getColonEqualsSignKeyword_3_0_1()); }

	':=' 

{ after(grammarAccess.getMBoardAccess().getColonEqualsSignKeyword_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_0__2__Impl
	rule__MBoard__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getVersionAssignment_3_0_2()); }
(rule__MBoard__VersionAssignment_3_0_2)
{ after(grammarAccess.getMBoardAccess().getVersionAssignment_3_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getSemicolonKeyword_3_0_3()); }

	';' 

{ after(grammarAccess.getMBoardAccess().getSemicolonKeyword_3_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MBoard__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_1__0__Impl
	rule__MBoard__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getSupportedKeyword_3_1_0()); }

	'supported' 

{ after(grammarAccess.getMBoardAccess().getSupportedKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_1__1__Impl
	rule__MBoard__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getDevicesKeyword_3_1_1()); }

	'devices' 

{ after(grammarAccess.getMBoardAccess().getDevicesKeyword_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_1__2__Impl
	rule__MBoard__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getLeftCurlyBracketKeyword_3_1_2()); }

	'{' 

{ after(grammarAccess.getMBoardAccess().getLeftCurlyBracketKeyword_3_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_1__3__Impl
	rule__MBoard__Group_3_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMBoardAccess().getSupportedDevicesAssignment_3_1_3()); }
(rule__MBoard__SupportedDevicesAssignment_3_1_3)
{ after(grammarAccess.getMBoardAccess().getSupportedDevicesAssignment_3_1_3()); }
)
(
{ before(grammarAccess.getMBoardAccess().getSupportedDevicesAssignment_3_1_3()); }
(rule__MBoard__SupportedDevicesAssignment_3_1_3)*
{ after(grammarAccess.getMBoardAccess().getSupportedDevicesAssignment_3_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_1__4__Impl
	rule__MBoard__Group_3_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getRightCurlyBracketKeyword_3_1_4()); }

	'}' 

{ after(grammarAccess.getMBoardAccess().getRightCurlyBracketKeyword_3_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getSemicolonKeyword_3_1_5()); }

	';' 

{ after(grammarAccess.getMBoardAccess().getSemicolonKeyword_3_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MBoard__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_2__0__Impl
	rule__MBoard__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getMicroprocessorKeyword_3_2_0()); }

	'microprocessor' 

{ after(grammarAccess.getMBoardAccess().getMicroprocessorKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_2__1__Impl
	rule__MBoard__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getColonEqualsSignKeyword_3_2_1()); }

	':=' 

{ after(grammarAccess.getMBoardAccess().getColonEqualsSignKeyword_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_2__2__Impl
	rule__MBoard__Group_3_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getMicroprocessorAssignment_3_2_2()); }
(rule__MBoard__MicroprocessorAssignment_3_2_2)
{ after(grammarAccess.getMBoardAccess().getMicroprocessorAssignment_3_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getSemicolonKeyword_3_2_3()); }

	';' 

{ after(grammarAccess.getMBoardAccess().getSemicolonKeyword_3_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MBoard__Group_3_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_3__0__Impl
	rule__MBoard__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getConfigurationKeyword_3_3_0()); }

	'configuration' 

{ after(grammarAccess.getMBoardAccess().getConfigurationKeyword_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_3__1__Impl
	rule__MBoard__Group_3_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getParametersKeyword_3_3_1()); }

	'parameters' 

{ after(grammarAccess.getMBoardAccess().getParametersKeyword_3_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_3__2__Impl
	rule__MBoard__Group_3_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getLeftCurlyBracketKeyword_3_3_2()); }

	'{' 

{ after(grammarAccess.getMBoardAccess().getLeftCurlyBracketKeyword_3_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_3__3__Impl
	rule__MBoard__Group_3_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMBoardAccess().getParametersAssignment_3_3_3()); }
(rule__MBoard__ParametersAssignment_3_3_3)
{ after(grammarAccess.getMBoardAccess().getParametersAssignment_3_3_3()); }
)
(
{ before(grammarAccess.getMBoardAccess().getParametersAssignment_3_3_3()); }
(rule__MBoard__ParametersAssignment_3_3_3)*
{ after(grammarAccess.getMBoardAccess().getParametersAssignment_3_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_3__4__Impl
	rule__MBoard__Group_3_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getRightCurlyBracketKeyword_3_3_4()); }

	'}' 

{ after(grammarAccess.getMBoardAccess().getRightCurlyBracketKeyword_3_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__Group_3_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__Group_3_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__Group_3_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getSemicolonKeyword_3_3_5()); }

	';' 

{ after(grammarAccess.getMBoardAccess().getSemicolonKeyword_3_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MBoardSupportedDevice__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoardSupportedDevice__Group__0__Impl
	rule__MBoardSupportedDevice__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoardSupportedDevice__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardSupportedDeviceAccess().getDeviceKeyword_0()); }

	'device' 

{ after(grammarAccess.getMBoardSupportedDeviceAccess().getDeviceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoardSupportedDevice__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoardSupportedDevice__Group__1__Impl
	rule__MBoardSupportedDevice__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoardSupportedDevice__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardSupportedDeviceAccess().getDeviceAssignment_1()); }
(rule__MBoardSupportedDevice__DeviceAssignment_1)
{ after(grammarAccess.getMBoardSupportedDeviceAccess().getDeviceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoardSupportedDevice__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoardSupportedDevice__Group__2__Impl
	rule__MBoardSupportedDevice__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoardSupportedDevice__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardSupportedDeviceAccess().getRangeKeyword_2()); }

	'range' 

{ after(grammarAccess.getMBoardSupportedDeviceAccess().getRangeKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoardSupportedDevice__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoardSupportedDevice__Group__3__Impl
	rule__MBoardSupportedDevice__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoardSupportedDevice__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardSupportedDeviceAccess().getLowerBoundAssignment_3()); }
(rule__MBoardSupportedDevice__LowerBoundAssignment_3)
{ after(grammarAccess.getMBoardSupportedDeviceAccess().getLowerBoundAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoardSupportedDevice__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoardSupportedDevice__Group__4__Impl
	rule__MBoardSupportedDevice__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoardSupportedDevice__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardSupportedDeviceAccess().getToKeyword_4()); }

	'to' 

{ after(grammarAccess.getMBoardSupportedDeviceAccess().getToKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoardSupportedDevice__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoardSupportedDevice__Group__5__Impl
	rule__MBoardSupportedDevice__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoardSupportedDevice__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardSupportedDeviceAccess().getUpperBoundAssignment_5()); }
(rule__MBoardSupportedDevice__UpperBoundAssignment_5)
{ after(grammarAccess.getMBoardSupportedDeviceAccess().getUpperBoundAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBoardSupportedDevice__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoardSupportedDevice__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBoardSupportedDevice__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardSupportedDeviceAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMBoardSupportedDeviceAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MMicroprocessor__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group__0__Impl
	rule__MMicroprocessor__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getMicroprocessorKeyword_0()); }

	'microprocessor' 

{ after(grammarAccess.getMMicroprocessorAccess().getMicroprocessorKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group__1__Impl
	rule__MMicroprocessor__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getNameAssignment_1()); }
(rule__MMicroprocessor__NameAssignment_1)
{ after(grammarAccess.getMMicroprocessorAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group__2__Impl
	rule__MMicroprocessor__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMMicroprocessorAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group__3__Impl
	rule__MMicroprocessor__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3()); }
(rule__MMicroprocessor__UnorderedGroup_3)
{ after(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group__4__Impl
	rule__MMicroprocessor__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMMicroprocessorAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MMicroprocessor__Group_3_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_0__0__Impl
	rule__MMicroprocessor__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getVersionKeyword_3_0_0()); }

	'version' 

{ after(grammarAccess.getMMicroprocessorAccess().getVersionKeyword_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group_3_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_0__1__Impl
	rule__MMicroprocessor__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getColonEqualsSignKeyword_3_0_1()); }

	':=' 

{ after(grammarAccess.getMMicroprocessorAccess().getColonEqualsSignKeyword_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group_3_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_0__2__Impl
	rule__MMicroprocessor__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getVersionAssignment_3_0_2()); }
(rule__MMicroprocessor__VersionAssignment_3_0_2)
{ after(grammarAccess.getMMicroprocessorAccess().getVersionAssignment_3_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group_3_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_3_0_3()); }

	';' 

{ after(grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_3_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MMicroprocessor__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_1__0__Impl
	rule__MMicroprocessor__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getArchitectureKeyword_3_1_0()); }

	'architecture' 

{ after(grammarAccess.getMMicroprocessorAccess().getArchitectureKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_1__1__Impl
	rule__MMicroprocessor__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getColonEqualsSignKeyword_3_1_1()); }

	':=' 

{ after(grammarAccess.getMMicroprocessorAccess().getColonEqualsSignKeyword_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group_3_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_1__2__Impl
	rule__MMicroprocessor__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getArchitectureAssignment_3_1_2()); }
(rule__MMicroprocessor__ArchitectureAssignment_3_1_2)
{ after(grammarAccess.getMMicroprocessorAccess().getArchitectureAssignment_3_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group_3_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_3_1_3()); }

	';' 

{ after(grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_3_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MMicroprocessor__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_2__0__Impl
	rule__MMicroprocessor__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getConfigurationKeyword_3_2_0()); }

	'configuration' 

{ after(grammarAccess.getMMicroprocessorAccess().getConfigurationKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_2__1__Impl
	rule__MMicroprocessor__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getParametersKeyword_3_2_1()); }

	'parameters' 

{ after(grammarAccess.getMMicroprocessorAccess().getParametersKeyword_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group_3_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_2__2__Impl
	rule__MMicroprocessor__Group_3_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getLeftCurlyBracketKeyword_3_2_2()); }

	'{' 

{ after(grammarAccess.getMMicroprocessorAccess().getLeftCurlyBracketKeyword_3_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group_3_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_2__3__Impl
	rule__MMicroprocessor__Group_3_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMMicroprocessorAccess().getParametersAssignment_3_2_3()); }
(rule__MMicroprocessor__ParametersAssignment_3_2_3)
{ after(grammarAccess.getMMicroprocessorAccess().getParametersAssignment_3_2_3()); }
)
(
{ before(grammarAccess.getMMicroprocessorAccess().getParametersAssignment_3_2_3()); }
(rule__MMicroprocessor__ParametersAssignment_3_2_3)*
{ after(grammarAccess.getMMicroprocessorAccess().getParametersAssignment_3_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group_3_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_2__4__Impl
	rule__MMicroprocessor__Group_3_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getRightCurlyBracketKeyword_3_2_4()); }

	'}' 

{ after(grammarAccess.getMMicroprocessorAccess().getRightCurlyBracketKeyword_3_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__Group_3_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__Group_3_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__Group_3_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_3_2_5()); }

	';' 

{ after(grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_3_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MOperatingSystem__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group__0__Impl
	rule__MOperatingSystem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getOsKeyword_0()); }

	'os' 

{ after(grammarAccess.getMOperatingSystemAccess().getOsKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group__1__Impl
	rule__MOperatingSystem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getNameAssignment_1()); }
(rule__MOperatingSystem__NameAssignment_1)
{ after(grammarAccess.getMOperatingSystemAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group__2__Impl
	rule__MOperatingSystem__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getGroup_2()); }
(rule__MOperatingSystem__Group_2__0)?
{ after(grammarAccess.getMOperatingSystemAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group__3__Impl
	rule__MOperatingSystem__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group__4__Impl
	rule__MOperatingSystem__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4()); }
(rule__MOperatingSystem__UnorderedGroup_4)
{ after(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group__5__Impl
	rule__MOperatingSystem__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MOperatingSystem__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_2__0__Impl
	rule__MOperatingSystem__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getInheritsKeyword_2_0()); }

	'inherits' 

{ after(grammarAccess.getMOperatingSystemAccess().getInheritsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_2__1__Impl
	rule__MOperatingSystem__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getInheritsAssignment_2_1()); }
(rule__MOperatingSystem__InheritsAssignment_2_1)
{ after(grammarAccess.getMOperatingSystemAccess().getInheritsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getGroup_2_2()); }
(rule__MOperatingSystem__Group_2_2__0)*
{ after(grammarAccess.getMOperatingSystemAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MOperatingSystem__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_2_2__0__Impl
	rule__MOperatingSystem__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getMOperatingSystemAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getInheritsAssignment_2_2_1()); }
(rule__MOperatingSystem__InheritsAssignment_2_2_1)
{ after(grammarAccess.getMOperatingSystemAccess().getInheritsAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MOperatingSystem__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_0__0__Impl
	rule__MOperatingSystem__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getVersionKeyword_4_0_0()); }

	'version' 

{ after(grammarAccess.getMOperatingSystemAccess().getVersionKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_0__1__Impl
	rule__MOperatingSystem__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getColonEqualsSignKeyword_4_0_1()); }

	':=' 

{ after(grammarAccess.getMOperatingSystemAccess().getColonEqualsSignKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_0__2__Impl
	rule__MOperatingSystem__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getVersionAssignment_4_0_2()); }
(rule__MOperatingSystem__VersionAssignment_4_0_2)
{ after(grammarAccess.getMOperatingSystemAccess().getVersionAssignment_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_0_3()); }

	';' 

{ after(grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MOperatingSystem__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_1__0__Impl
	rule__MOperatingSystem__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getLanguagesKeyword_4_1_0()); }

	'languages' 

{ after(grammarAccess.getMOperatingSystemAccess().getLanguagesKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_1__1__Impl
	rule__MOperatingSystem__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getColonEqualsSignKeyword_4_1_1()); }

	':=' 

{ after(grammarAccess.getMOperatingSystemAccess().getColonEqualsSignKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_1__2__Impl
	rule__MOperatingSystem__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getLanguagesAssignment_4_1_2()); }
(rule__MOperatingSystem__LanguagesAssignment_4_1_2)
{ after(grammarAccess.getMOperatingSystemAccess().getLanguagesAssignment_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_1__3__Impl
	rule__MOperatingSystem__Group_4_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getGroup_4_1_3()); }
(rule__MOperatingSystem__Group_4_1_3__0)*
{ after(grammarAccess.getMOperatingSystemAccess().getGroup_4_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_1_4()); }

	';' 

{ after(grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MOperatingSystem__Group_4_1_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_1_3__0__Impl
	rule__MOperatingSystem__Group_4_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_1_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getCommaKeyword_4_1_3_0()); }

	',' 

{ after(grammarAccess.getMOperatingSystemAccess().getCommaKeyword_4_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_1_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_1_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getLanguagesAssignment_4_1_3_1()); }
(rule__MOperatingSystem__LanguagesAssignment_4_1_3_1)
{ after(grammarAccess.getMOperatingSystemAccess().getLanguagesAssignment_4_1_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MOperatingSystem__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_2__0__Impl
	rule__MOperatingSystem__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getSupportedKeyword_4_2_0()); }

	'supported' 

{ after(grammarAccess.getMOperatingSystemAccess().getSupportedKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_2__1__Impl
	rule__MOperatingSystem__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getOsapisKeyword_4_2_1()); }

	'osapis' 

{ after(grammarAccess.getMOperatingSystemAccess().getOsapisKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_2__2__Impl
	rule__MOperatingSystem__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_4_2_2()); }

	'{' 

{ after(grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_4_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_2__3__Impl
	rule__MOperatingSystem__Group_4_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMOperatingSystemAccess().getSupportedOSAPIsAssignment_4_2_3()); }
(rule__MOperatingSystem__SupportedOSAPIsAssignment_4_2_3)
{ after(grammarAccess.getMOperatingSystemAccess().getSupportedOSAPIsAssignment_4_2_3()); }
)
(
{ before(grammarAccess.getMOperatingSystemAccess().getSupportedOSAPIsAssignment_4_2_3()); }
(rule__MOperatingSystem__SupportedOSAPIsAssignment_4_2_3)*
{ after(grammarAccess.getMOperatingSystemAccess().getSupportedOSAPIsAssignment_4_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_2__4__Impl
	rule__MOperatingSystem__Group_4_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_4_2_4()); }

	'}' 

{ after(grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_4_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_2_5()); }

	';' 

{ after(grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MOperatingSystem__Group_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_3__0__Impl
	rule__MOperatingSystem__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getSupportedKeyword_4_3_0()); }

	'supported' 

{ after(grammarAccess.getMOperatingSystemAccess().getSupportedKeyword_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_3__1__Impl
	rule__MOperatingSystem__Group_4_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getPlatformsKeyword_4_3_1()); }

	'platforms' 

{ after(grammarAccess.getMOperatingSystemAccess().getPlatformsKeyword_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_3__2__Impl
	rule__MOperatingSystem__Group_4_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_4_3_2()); }

	'{' 

{ after(grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_4_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_3__3__Impl
	rule__MOperatingSystem__Group_4_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMOperatingSystemAccess().getSupportedPlatformsAssignment_4_3_3()); }
(rule__MOperatingSystem__SupportedPlatformsAssignment_4_3_3)
{ after(grammarAccess.getMOperatingSystemAccess().getSupportedPlatformsAssignment_4_3_3()); }
)
(
{ before(grammarAccess.getMOperatingSystemAccess().getSupportedPlatformsAssignment_4_3_3()); }
(rule__MOperatingSystem__SupportedPlatformsAssignment_4_3_3)*
{ after(grammarAccess.getMOperatingSystemAccess().getSupportedPlatformsAssignment_4_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_3__4__Impl
	rule__MOperatingSystem__Group_4_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_4_3_4()); }

	'}' 

{ after(grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_4_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_3_5()); }

	';' 

{ after(grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MOperatingSystem__Group_4_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_4__0__Impl
	rule__MOperatingSystem__Group_4_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getConfigurationKeyword_4_4_0()); }

	'configuration' 

{ after(grammarAccess.getMOperatingSystemAccess().getConfigurationKeyword_4_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_4__1__Impl
	rule__MOperatingSystem__Group_4_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getParametersKeyword_4_4_1()); }

	'parameters' 

{ after(grammarAccess.getMOperatingSystemAccess().getParametersKeyword_4_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_4__2__Impl
	rule__MOperatingSystem__Group_4_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_4_4_2()); }

	'{' 

{ after(grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_4_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_4__3__Impl
	rule__MOperatingSystem__Group_4_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMOperatingSystemAccess().getParametersAssignment_4_4_3()); }
(rule__MOperatingSystem__ParametersAssignment_4_4_3)
{ after(grammarAccess.getMOperatingSystemAccess().getParametersAssignment_4_4_3()); }
)
(
{ before(grammarAccess.getMOperatingSystemAccess().getParametersAssignment_4_4_3()); }
(rule__MOperatingSystem__ParametersAssignment_4_4_3)*
{ after(grammarAccess.getMOperatingSystemAccess().getParametersAssignment_4_4_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_4__4__Impl
	rule__MOperatingSystem__Group_4_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_4_4_4()); }

	'}' 

{ after(grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_4_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__Group_4_4__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__Group_4_4__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__Group_4_4__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_4_5()); }

	';' 

{ after(grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_4_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MOSSupportedOSAPI__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPI__Group__0__Impl
	rule__MOSSupportedOSAPI__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPI__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIAccess().getSupportsKeyword_0()); }

	'supports' 

{ after(grammarAccess.getMOSSupportedOSAPIAccess().getSupportsKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPI__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPI__Group__1__Impl
	rule__MOSSupportedOSAPI__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPI__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIAccess().getOsapiAssignment_1()); }
(rule__MOSSupportedOSAPI__OsapiAssignment_1)
{ after(grammarAccess.getMOSSupportedOSAPIAccess().getOsapiAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPI__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPI__Group__2__Impl
	rule__MOSSupportedOSAPI__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPI__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMOSSupportedOSAPIAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPI__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPI__Group__3__Impl
	rule__MOSSupportedOSAPI__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPI__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIAccess().getParameterValueAssignmentsAssignment_3()); }
(rule__MOSSupportedOSAPI__ParameterValueAssignmentsAssignment_3)*
{ after(grammarAccess.getMOSSupportedOSAPIAccess().getParameterValueAssignmentsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPI__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPI__Group__4__Impl
	rule__MOSSupportedOSAPI__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPI__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMOSSupportedOSAPIAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPI__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPI__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPI__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMOSSupportedOSAPIAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MOSSupportedOSAPIPVAExpression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVAExpression__Group__0__Impl
	rule__MOSSupportedOSAPIPVAExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVAExpression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterKeyword_0()); }

	'parameter' 

{ after(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVAExpression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVAExpression__Group__1__Impl
	rule__MOSSupportedOSAPIPVAExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVAExpression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterAssignment_1()); }
(rule__MOSSupportedOSAPIPVAExpression__ParameterAssignment_1)
{ after(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVAExpression__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVAExpression__Group__2__Impl
	rule__MOSSupportedOSAPIPVAExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVAExpression__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getColonEqualsSignKeyword_2()); }

	':=' 

{ after(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getColonEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVAExpression__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVAExpression__Group__3__Impl
	rule__MOSSupportedOSAPIPVAExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVAExpression__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterValueAssignment_3()); }
(rule__MOSSupportedOSAPIPVAExpression__ParameterValueAssignment_3)
{ after(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVAExpression__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVAExpression__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVAExpression__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MOSSupportedOSAPIPVASwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitch__Group__0__Impl
	rule__MOSSupportedOSAPIPVASwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getSwitchKeyword_0()); }

	'switch' 

{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getSwitchKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVASwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitch__Group__1__Impl
	rule__MOSSupportedOSAPIPVASwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVASwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitch__Group__2__Impl
	rule__MOSSupportedOSAPIPVASwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getParameterAssignment_2()); }
(rule__MOSSupportedOSAPIPVASwitch__ParameterAssignment_2)
{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getParameterAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVASwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitch__Group__3__Impl
	rule__MOSSupportedOSAPIPVASwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVASwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitch__Group__4__Impl
	rule__MOSSupportedOSAPIPVASwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVASwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitch__Group__5__Impl
	rule__MOSSupportedOSAPIPVASwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getCasesAssignment_5()); }
(rule__MOSSupportedOSAPIPVASwitch__CasesAssignment_5)
{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getCasesAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVASwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitch__Group__6__Impl
	rule__MOSSupportedOSAPIPVASwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVASwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitch__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MOSSupportedOSAPIPVASwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitchCase__Group__0__Impl
	rule__MOSSupportedOSAPIPVASwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVASwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitchCase__Group__1__Impl
	rule__MOSSupportedOSAPIPVASwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MOSSupportedOSAPIPVASwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVASwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitchCase__Group__2__Impl
	rule__MOSSupportedOSAPIPVASwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVASwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitchCase__Group__3__Impl
	rule__MOSSupportedOSAPIPVASwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getParameterValueAssignment_3()); }
(rule__MOSSupportedOSAPIPVASwitchCase__ParameterValueAssignment_3)
{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getParameterValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedOSAPIPVASwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedOSAPIPVASwitchCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MBooleanParamOSSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitch__Group__0__Impl
	rule__MBooleanParamOSSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getConstantAssignment_0()); }
(rule__MBooleanParamOSSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamOSSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitch__Group__1__Impl
	rule__MBooleanParamOSSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getBooleanKeyword_1()); }

	'boolean' 

{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getBooleanKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamOSSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitch__Group__2__Impl
	rule__MBooleanParamOSSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getNameAssignment_2()); }
(rule__MBooleanParamOSSPSwitch__NameAssignment_2)
{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamOSSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitch__Group__3__Impl
	rule__MBooleanParamOSSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamOSSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitch__Group__4__Impl
	rule__MBooleanParamOSSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getSwitchKeyword_4()); }

	'switch' 

{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getSwitchKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamOSSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitch__Group__5__Impl
	rule__MBooleanParamOSSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamOSSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitch__Group__6__Impl
	rule__MBooleanParamOSSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getCasesAssignment_6()); }
(rule__MBooleanParamOSSPSwitch__CasesAssignment_6)
{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getCasesAssignment_6()); }
)
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getCasesAssignment_6()); }
(rule__MBooleanParamOSSPSwitch__CasesAssignment_6)*
{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getCasesAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamOSSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitch__Group__7__Impl
	rule__MBooleanParamOSSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamOSSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitch__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MBooleanParamOSSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitchCase__Group__0__Impl
	rule__MBooleanParamOSSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamOSSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitchCase__Group__1__Impl
	rule__MBooleanParamOSSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MBooleanParamOSSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamOSSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitchCase__Group__2__Impl
	rule__MBooleanParamOSSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamOSSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitchCase__Group__3__Impl
	rule__MBooleanParamOSSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MBooleanParamOSSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamOSSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamOSSPSwitchCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MStringParamOSSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitch__Group__0__Impl
	rule__MStringParamOSSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getConstantAssignment_0()); }
(rule__MStringParamOSSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamOSSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitch__Group__1__Impl
	rule__MStringParamOSSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getStringKeyword_1()); }

	'string' 

{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getStringKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamOSSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitch__Group__2__Impl
	rule__MStringParamOSSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getNameAssignment_2()); }
(rule__MStringParamOSSPSwitch__NameAssignment_2)
{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamOSSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitch__Group__3__Impl
	rule__MStringParamOSSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamOSSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitch__Group__4__Impl
	rule__MStringParamOSSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getSwitchKeyword_4()); }

	'switch' 

{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getSwitchKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamOSSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitch__Group__5__Impl
	rule__MStringParamOSSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamOSSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitch__Group__6__Impl
	rule__MStringParamOSSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getCasesAssignment_6()); }
(rule__MStringParamOSSPSwitch__CasesAssignment_6)
{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getCasesAssignment_6()); }
)
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getCasesAssignment_6()); }
(rule__MStringParamOSSPSwitch__CasesAssignment_6)*
{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getCasesAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamOSSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitch__Group__7__Impl
	rule__MStringParamOSSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamOSSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitch__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MStringParamOSSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitchCase__Group__0__Impl
	rule__MStringParamOSSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamOSSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitchCase__Group__1__Impl
	rule__MStringParamOSSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MStringParamOSSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamOSSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitchCase__Group__2__Impl
	rule__MStringParamOSSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamOSSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitchCase__Group__3__Impl
	rule__MStringParamOSSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MStringParamOSSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamOSSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamOSSPSwitchCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIntegerParamOSSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitch__Group__0__Impl
	rule__MIntegerParamOSSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getConstantAssignment_0()); }
(rule__MIntegerParamOSSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitch__Group__1__Impl
	rule__MIntegerParamOSSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getIntegerKeyword_1()); }

	'integer' 

{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getIntegerKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitch__Group__2__Impl
	rule__MIntegerParamOSSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getNameAssignment_2()); }
(rule__MIntegerParamOSSPSwitch__NameAssignment_2)
{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitch__Group__3__Impl
	rule__MIntegerParamOSSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitch__Group__4__Impl
	rule__MIntegerParamOSSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getSwitchKeyword_4()); }

	'switch' 

{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getSwitchKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitch__Group__5__Impl
	rule__MIntegerParamOSSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitch__Group__6__Impl
	rule__MIntegerParamOSSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getCasesAssignment_6()); }
(rule__MIntegerParamOSSPSwitch__CasesAssignment_6)
{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getCasesAssignment_6()); }
)
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getCasesAssignment_6()); }
(rule__MIntegerParamOSSPSwitch__CasesAssignment_6)*
{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getCasesAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitch__Group__7__Impl
	rule__MIntegerParamOSSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitch__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MIntegerParamOSSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitchCase__Group__0__Impl
	rule__MIntegerParamOSSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitchCase__Group__1__Impl
	rule__MIntegerParamOSSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MIntegerParamOSSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitchCase__Group__2__Impl
	rule__MIntegerParamOSSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitchCase__Group__3__Impl
	rule__MIntegerParamOSSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MIntegerParamOSSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitchCase__Group__4__Impl
	rule__MIntegerParamOSSPSwitchCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getGroup_4()); }
(rule__MIntegerParamOSSPSwitchCase__Group_4__0)?
{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitchCase__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitchCase__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitchCase__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIntegerParamOSSPSwitchCase__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitchCase__Group_4__0__Impl
	rule__MIntegerParamOSSPSwitchCase__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitchCase__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getRangeKeyword_4_0()); }

	'range' 

{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getRangeKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamOSSPSwitchCase__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamOSSPSwitchCase__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitchCase__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getRangeAssignment_4_1()); }
(rule__MIntegerParamOSSPSwitchCase__RangeAssignment_4_1)
{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getRangeAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MRealParamOSSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitch__Group__0__Impl
	rule__MRealParamOSSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getConstantAssignment_0()); }
(rule__MRealParamOSSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitch__Group__1__Impl
	rule__MRealParamOSSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getRealKeyword_1()); }

	'real' 

{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getRealKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitch__Group__2__Impl
	rule__MRealParamOSSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getNameAssignment_2()); }
(rule__MRealParamOSSPSwitch__NameAssignment_2)
{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitch__Group__3__Impl
	rule__MRealParamOSSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitch__Group__4__Impl
	rule__MRealParamOSSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getSwitchKeyword_4()); }

	'switch' 

{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getSwitchKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitch__Group__5__Impl
	rule__MRealParamOSSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitch__Group__6__Impl
	rule__MRealParamOSSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getCasesAssignment_6()); }
(rule__MRealParamOSSPSwitch__CasesAssignment_6)
{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getCasesAssignment_6()); }
)
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getCasesAssignment_6()); }
(rule__MRealParamOSSPSwitch__CasesAssignment_6)*
{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getCasesAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitch__Group__7__Impl
	rule__MRealParamOSSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitch__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MRealParamOSSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitchCase__Group__0__Impl
	rule__MRealParamOSSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitchCase__Group__1__Impl
	rule__MRealParamOSSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MRealParamOSSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitchCase__Group__2__Impl
	rule__MRealParamOSSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitchCase__Group__3__Impl
	rule__MRealParamOSSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MRealParamOSSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitchCase__Group__4__Impl
	rule__MRealParamOSSPSwitchCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getGroup_4()); }
(rule__MRealParamOSSPSwitchCase__Group_4__0)?
{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitchCase__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitchCase__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitchCase__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MRealParamOSSPSwitchCase__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitchCase__Group_4__0__Impl
	rule__MRealParamOSSPSwitchCase__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitchCase__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getRangeKeyword_4_0()); }

	'range' 

{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getRangeKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamOSSPSwitchCase__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamOSSPSwitchCase__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitchCase__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getRangeAssignment_4_1()); }
(rule__MRealParamOSSPSwitchCase__RangeAssignment_4_1)
{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getRangeAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MEnumParamOSSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitch__Group__0__Impl
	rule__MEnumParamOSSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getConstantAssignment_0()); }
(rule__MEnumParamOSSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitch__Group__1__Impl
	rule__MEnumParamOSSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumKeyword_1()); }

	'enum' 

{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitch__Group__2__Impl
	rule__MEnumParamOSSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumDefinitionAssignment_2()); }
(rule__MEnumParamOSSPSwitch__EnumDefinitionAssignment_2)
{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumDefinitionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitch__Group__3__Impl
	rule__MEnumParamOSSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getNameAssignment_3()); }
(rule__MEnumParamOSSPSwitch__NameAssignment_3)
{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitch__Group__4__Impl
	rule__MEnumParamOSSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getColonEqualsSignKeyword_4()); }

	':=' 

{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getColonEqualsSignKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitch__Group__5__Impl
	rule__MEnumParamOSSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getSwitchKeyword_5()); }

	'switch' 

{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getSwitchKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitch__Group__6__Impl
	rule__MEnumParamOSSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_6()); }

	'{' 

{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitch__Group__7__Impl
	rule__MEnumParamOSSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getCasesAssignment_7()); }
(rule__MEnumParamOSSPSwitch__CasesAssignment_7)
{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getCasesAssignment_7()); }
)
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getCasesAssignment_7()); }
(rule__MEnumParamOSSPSwitch__CasesAssignment_7)*
{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getCasesAssignment_7()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitch__Group__8__Impl
	rule__MEnumParamOSSPSwitch__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitch__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitch__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getSemicolonKeyword_9()); }

	';' 

{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getSemicolonKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__MEnumParamOSSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitchCase__Group__0__Impl
	rule__MEnumParamOSSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitchCase__Group__1__Impl
	rule__MEnumParamOSSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MEnumParamOSSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitchCase__Group__2__Impl
	rule__MEnumParamOSSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitchCase__Group__3__Impl
	rule__MEnumParamOSSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MEnumParamOSSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamOSSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamOSSPSwitchCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getSemicolonKeyword_4()); }
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










rule__MEnumParamStringLiteralRegular__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamStringLiteralRegular__Group__0__Impl
	rule__MEnumParamStringLiteralRegular__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteralRegular__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralRegularAccess().getMEnumParamStringLiteralAction_0()); }
(

)
{ after(grammarAccess.getMEnumParamStringLiteralRegularAccess().getMEnumParamStringLiteralAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamStringLiteralRegular__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamStringLiteralRegular__Group__1__Impl
	rule__MEnumParamStringLiteralRegular__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteralRegular__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralRegularAccess().getNameAssignment_1()); }
(rule__MEnumParamStringLiteralRegular__NameAssignment_1)
{ after(grammarAccess.getMEnumParamStringLiteralRegularAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamStringLiteralRegular__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamStringLiteralRegular__Group__2__Impl
	rule__MEnumParamStringLiteralRegular__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteralRegular__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralRegularAccess().getEqualsSignKeyword_2()); }

	'=' 

{ after(grammarAccess.getMEnumParamStringLiteralRegularAccess().getEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamStringLiteralRegular__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamStringLiteralRegular__Group__3__Impl
	rule__MEnumParamStringLiteralRegular__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteralRegular__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralRegularAccess().getIsRawAssignment_3()); }
(rule__MEnumParamStringLiteralRegular__IsRawAssignment_3)?
{ after(grammarAccess.getMEnumParamStringLiteralRegularAccess().getIsRawAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamStringLiteralRegular__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamStringLiteralRegular__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteralRegular__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralRegularAccess().getValueAssignment_4()); }
(rule__MEnumParamStringLiteralRegular__ValueAssignment_4)
{ after(grammarAccess.getMEnumParamStringLiteralRegularAccess().getValueAssignment_4()); }
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














rule__MOperatingSystemAPI__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group__0__Impl
	rule__MOperatingSystemAPI__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getOsapiKeyword_0()); }

	'osapi' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getOsapiKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group__1__Impl
	rule__MOperatingSystemAPI__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getNameAssignment_1()); }
(rule__MOperatingSystemAPI__NameAssignment_1)
{ after(grammarAccess.getMOperatingSystemAPIAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group__2__Impl
	rule__MOperatingSystemAPI__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getGroup_2()); }
(rule__MOperatingSystemAPI__Group_2__0)?
{ after(grammarAccess.getMOperatingSystemAPIAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group__3__Impl
	rule__MOperatingSystemAPI__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group__4__Impl
	rule__MOperatingSystemAPI__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4()); }
(rule__MOperatingSystemAPI__UnorderedGroup_4)
{ after(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group__5__Impl
	rule__MOperatingSystemAPI__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MOperatingSystemAPI__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_2__0__Impl
	rule__MOperatingSystemAPI__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getInheritsKeyword_2_0()); }

	'inherits' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getInheritsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_2__1__Impl
	rule__MOperatingSystemAPI__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getInheritsAssignment_2_1()); }
(rule__MOperatingSystemAPI__InheritsAssignment_2_1)
{ after(grammarAccess.getMOperatingSystemAPIAccess().getInheritsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getGroup_2_2()); }
(rule__MOperatingSystemAPI__Group_2_2__0)*
{ after(grammarAccess.getMOperatingSystemAPIAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MOperatingSystemAPI__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_2_2__0__Impl
	rule__MOperatingSystemAPI__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getInheritsAssignment_2_2_1()); }
(rule__MOperatingSystemAPI__InheritsAssignment_2_2_1)
{ after(grammarAccess.getMOperatingSystemAPIAccess().getInheritsAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MOperatingSystemAPI__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_0__0__Impl
	rule__MOperatingSystemAPI__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getVersionKeyword_4_0_0()); }

	'version' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getVersionKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_0__1__Impl
	rule__MOperatingSystemAPI__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getColonEqualsSignKeyword_4_0_1()); }

	':=' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getColonEqualsSignKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_0__2__Impl
	rule__MOperatingSystemAPI__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getVersionAssignment_4_0_2()); }
(rule__MOperatingSystemAPI__VersionAssignment_4_0_2)
{ after(grammarAccess.getMOperatingSystemAPIAccess().getVersionAssignment_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_4_0_3()); }

	';' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MOperatingSystemAPI__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_1__0__Impl
	rule__MOperatingSystemAPI__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getLanguageKeyword_4_1_0()); }

	'language' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getLanguageKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_1__1__Impl
	rule__MOperatingSystemAPI__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getColonEqualsSignKeyword_4_1_1()); }

	':=' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getColonEqualsSignKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_1__2__Impl
	rule__MOperatingSystemAPI__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getLanguageAssignment_4_1_2()); }
(rule__MOperatingSystemAPI__LanguageAssignment_4_1_2)
{ after(grammarAccess.getMOperatingSystemAPIAccess().getLanguageAssignment_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_4_1_3()); }

	';' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_4_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MOperatingSystemAPI__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_2__0__Impl
	rule__MOperatingSystemAPI__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getConfigurationKeyword_4_2_0()); }

	'configuration' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getConfigurationKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_2__1__Impl
	rule__MOperatingSystemAPI__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getParametersKeyword_4_2_1()); }

	'parameters' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getParametersKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_2__2__Impl
	rule__MOperatingSystemAPI__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getLeftCurlyBracketKeyword_4_2_2()); }

	'{' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getLeftCurlyBracketKeyword_4_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_2__3__Impl
	rule__MOperatingSystemAPI__Group_4_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getParametersAssignment_4_2_3()); }
(rule__MOperatingSystemAPI__ParametersAssignment_4_2_3)
{ after(grammarAccess.getMOperatingSystemAPIAccess().getParametersAssignment_4_2_3()); }
)
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getParametersAssignment_4_2_3()); }
(rule__MOperatingSystemAPI__ParametersAssignment_4_2_3)*
{ after(grammarAccess.getMOperatingSystemAPIAccess().getParametersAssignment_4_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_4_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_2__4__Impl
	rule__MOperatingSystemAPI__Group_4_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getRightCurlyBracketKeyword_4_2_4()); }

	'}' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getRightCurlyBracketKeyword_4_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__Group_4_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__Group_4_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__Group_4_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_4_2_5()); }

	';' 

{ after(grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_4_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDevice__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group__0__Impl
	rule__MDevice__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getDeviceKeyword_0()); }

	'device' 

{ after(grammarAccess.getMDeviceAccess().getDeviceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group__1__Impl
	rule__MDevice__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getNameAssignment_1()); }
(rule__MDevice__NameAssignment_1)
{ after(grammarAccess.getMDeviceAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group__2__Impl
	rule__MDevice__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMDeviceAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group__3__Impl
	rule__MDevice__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getUnorderedGroup_3()); }
(rule__MDevice__UnorderedGroup_3)
{ after(grammarAccess.getMDeviceAccess().getUnorderedGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group__4__Impl
	rule__MDevice__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMDeviceAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMDeviceAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDevice__Group_3_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group_3_0__0__Impl
	rule__MDevice__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group_3_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getVersionKeyword_3_0_0()); }

	'version' 

{ after(grammarAccess.getMDeviceAccess().getVersionKeyword_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group_3_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group_3_0__1__Impl
	rule__MDevice__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group_3_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getColonEqualsSignKeyword_3_0_1()); }

	':=' 

{ after(grammarAccess.getMDeviceAccess().getColonEqualsSignKeyword_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group_3_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group_3_0__2__Impl
	rule__MDevice__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group_3_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getVersionAssignment_3_0_2()); }
(rule__MDevice__VersionAssignment_3_0_2)
{ after(grammarAccess.getMDeviceAccess().getVersionAssignment_3_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group_3_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group_3_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getSemicolonKeyword_3_0_3()); }

	';' 

{ after(grammarAccess.getMDeviceAccess().getSemicolonKeyword_3_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDevice__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group_3_1__0__Impl
	rule__MDevice__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getConfigurationKeyword_3_1_0()); }

	'configuration' 

{ after(grammarAccess.getMDeviceAccess().getConfigurationKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group_3_1__1__Impl
	rule__MDevice__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getParametersKeyword_3_1_1()); }

	'parameters' 

{ after(grammarAccess.getMDeviceAccess().getParametersKeyword_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group_3_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group_3_1__2__Impl
	rule__MDevice__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group_3_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getLeftCurlyBracketKeyword_3_1_2()); }

	'{' 

{ after(grammarAccess.getMDeviceAccess().getLeftCurlyBracketKeyword_3_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group_3_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group_3_1__3__Impl
	rule__MDevice__Group_3_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group_3_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDeviceAccess().getParametersAssignment_3_1_3()); }
(rule__MDevice__ParametersAssignment_3_1_3)
{ after(grammarAccess.getMDeviceAccess().getParametersAssignment_3_1_3()); }
)
(
{ before(grammarAccess.getMDeviceAccess().getParametersAssignment_3_1_3()); }
(rule__MDevice__ParametersAssignment_3_1_3)*
{ after(grammarAccess.getMDeviceAccess().getParametersAssignment_3_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group_3_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group_3_1__4__Impl
	rule__MDevice__Group_3_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group_3_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getRightCurlyBracketKeyword_3_1_4()); }

	'}' 

{ after(grammarAccess.getMDeviceAccess().getRightCurlyBracketKeyword_3_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__Group_3_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__Group_3_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__Group_3_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getSemicolonKeyword_3_1_5()); }

	';' 

{ after(grammarAccess.getMDeviceAccess().getSemicolonKeyword_3_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MArchitecture__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group__0__Impl
	rule__MArchitecture__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getArchitectureKeyword_0()); }

	'architecture' 

{ after(grammarAccess.getMArchitectureAccess().getArchitectureKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group__1__Impl
	rule__MArchitecture__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getNameAssignment_1()); }
(rule__MArchitecture__NameAssignment_1)
{ after(grammarAccess.getMArchitectureAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group__2__Impl
	rule__MArchitecture__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getGroup_2()); }
(rule__MArchitecture__Group_2__0)?
{ after(grammarAccess.getMArchitectureAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group__3__Impl
	rule__MArchitecture__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMArchitectureAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group__4__Impl
	rule__MArchitecture__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4()); }
(rule__MArchitecture__UnorderedGroup_4)
{ after(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group__5__Impl
	rule__MArchitecture__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMArchitectureAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMArchitectureAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MArchitecture__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_2__0__Impl
	rule__MArchitecture__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getExtendsKeyword_2_0()); }

	'extends' 

{ after(grammarAccess.getMArchitectureAccess().getExtendsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_2__1__Impl
	rule__MArchitecture__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getExtendsAssignment_2_1()); }
(rule__MArchitecture__ExtendsAssignment_2_1)
{ after(grammarAccess.getMArchitectureAccess().getExtendsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getGroup_2_2()); }
(rule__MArchitecture__Group_2_2__0)*
{ after(grammarAccess.getMArchitectureAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MArchitecture__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_2_2__0__Impl
	rule__MArchitecture__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getMArchitectureAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getExtendsAssignment_2_2_1()); }
(rule__MArchitecture__ExtendsAssignment_2_2_1)
{ after(grammarAccess.getMArchitectureAccess().getExtendsAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MArchitecture__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_4_0__0__Impl
	rule__MArchitecture__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getVersionKeyword_4_0_0()); }

	'version' 

{ after(grammarAccess.getMArchitectureAccess().getVersionKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_4_0__1__Impl
	rule__MArchitecture__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getColonEqualsSignKeyword_4_0_1()); }

	':=' 

{ after(grammarAccess.getMArchitectureAccess().getColonEqualsSignKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_4_0__2__Impl
	rule__MArchitecture__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getVersionAssignment_4_0_2()); }
(rule__MArchitecture__VersionAssignment_4_0_2)
{ after(grammarAccess.getMArchitectureAccess().getVersionAssignment_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getSemicolonKeyword_4_0_3()); }

	';' 

{ after(grammarAccess.getMArchitectureAccess().getSemicolonKeyword_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MArchitecture__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_4_1__0__Impl
	rule__MArchitecture__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getConfigurationKeyword_4_1_0()); }

	'configuration' 

{ after(grammarAccess.getMArchitectureAccess().getConfigurationKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_4_1__1__Impl
	rule__MArchitecture__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getParametersKeyword_4_1_1()); }

	'parameters' 

{ after(grammarAccess.getMArchitectureAccess().getParametersKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_4_1__2__Impl
	rule__MArchitecture__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getLeftCurlyBracketKeyword_4_1_2()); }

	'{' 

{ after(grammarAccess.getMArchitectureAccess().getLeftCurlyBracketKeyword_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_4_1__3__Impl
	rule__MArchitecture__Group_4_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMArchitectureAccess().getParametersAssignment_4_1_3()); }
(rule__MArchitecture__ParametersAssignment_4_1_3)
{ after(grammarAccess.getMArchitectureAccess().getParametersAssignment_4_1_3()); }
)
(
{ before(grammarAccess.getMArchitectureAccess().getParametersAssignment_4_1_3()); }
(rule__MArchitecture__ParametersAssignment_4_1_3)*
{ after(grammarAccess.getMArchitectureAccess().getParametersAssignment_4_1_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group_4_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_4_1__4__Impl
	rule__MArchitecture__Group_4_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_4_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getRightCurlyBracketKeyword_4_1_4()); }

	'}' 

{ after(grammarAccess.getMArchitectureAccess().getRightCurlyBracketKeyword_4_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__Group_4_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__Group_4_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__Group_4_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getSemicolonKeyword_4_1_5()); }

	';' 

{ after(grammarAccess.getMArchitectureAccess().getSemicolonKeyword_4_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MOSSupportedPlatform__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group__0__Impl
	rule__MOSSupportedPlatform__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getMOSSupportedPlatformAction_0()); }
(

)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getMOSSupportedPlatformAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group__1__Impl
	rule__MOSSupportedPlatform__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getSupportedKeyword_1()); }

	'supported' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getSupportedKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group__2__Impl
	rule__MOSSupportedPlatform__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getPlatformKeyword_2()); }

	'platform' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getPlatformKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group__3__Impl
	rule__MOSSupportedPlatform__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getNameAssignment_3()); }
(rule__MOSSupportedPlatform__NameAssignment_3)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group__4__Impl
	rule__MOSSupportedPlatform__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group__5__Impl
	rule__MOSSupportedPlatform__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5()); }
(rule__MOSSupportedPlatform__UnorderedGroup_5)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group__6__Impl
	rule__MOSSupportedPlatform__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MOSSupportedPlatform__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_0__0__Impl
	rule__MOSSupportedPlatform__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getArchitectureKeyword_5_0_0()); }

	'architecture' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getArchitectureKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_0__1__Impl
	rule__MOSSupportedPlatform__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_0__2__Impl
	rule__MOSSupportedPlatform__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getArchitectureAssignment_5_0_2()); }
(rule__MOSSupportedPlatform__ArchitectureAssignment_5_0_2)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getArchitectureAssignment_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MOSSupportedPlatform__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_1__0__Impl
	rule__MOSSupportedPlatform__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getCompilerKeyword_5_1_0()); }

	'compiler' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getCompilerKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_1__1__Impl
	rule__MOSSupportedPlatform__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1()); }

	':=' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_1__2__Impl
	rule__MOSSupportedPlatform__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getCompilerAssignment_5_1_2()); }
(rule__MOSSupportedPlatform__CompilerAssignment_5_1_2)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getCompilerAssignment_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_1_3()); }

	';' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MOSSupportedPlatform__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_2__0__Impl
	rule__MOSSupportedPlatform__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorKeyword_5_2_0()); }

	'microprocessor' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_2__1__Impl
	rule__MOSSupportedPlatform__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1()); }

	':=' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_2__2__Impl
	rule__MOSSupportedPlatform__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getAlternatives_5_2_2()); }
(rule__MOSSupportedPlatform__Alternatives_5_2_2)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getAlternatives_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_2_3()); }

	';' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MOSSupportedPlatform__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_3__0__Impl
	rule__MOSSupportedPlatform__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getBoardKeyword_5_3_0()); }

	'board' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getBoardKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_3__1__Impl
	rule__MOSSupportedPlatform__Group_5_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1()); }

	':=' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_3__2__Impl
	rule__MOSSupportedPlatform__Group_5_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getAlternatives_5_3_2()); }
(rule__MOSSupportedPlatform__Alternatives_5_3_2)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getAlternatives_5_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_3_3()); }

	';' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MOSSupportedPlatform__Group_5_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_4__0__Impl
	rule__MOSSupportedPlatform__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesKeyword_5_4_0()); }

	'languages' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesKeyword_5_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_4__1__Impl
	rule__MOSSupportedPlatform__Group_5_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1()); }

	':=' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_4__2__Impl
	rule__MOSSupportedPlatform__Group_5_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesAssignment_5_4_2()); }
(rule__MOSSupportedPlatform__LanguagesAssignment_5_4_2)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesAssignment_5_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_4__3__Impl
	rule__MOSSupportedPlatform__Group_5_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_4_3()); }
(rule__MOSSupportedPlatform__Group_5_4_3__0)*
{ after(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_4_4()); }

	';' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MOSSupportedPlatform__Group_5_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_4_3__0__Impl
	rule__MOSSupportedPlatform__Group_5_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getCommaKeyword_5_4_3_0()); }

	',' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getCommaKeyword_5_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesAssignment_5_4_3_1()); }
(rule__MOSSupportedPlatform__LanguagesAssignment_5_4_3_1)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesAssignment_5_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MOSSupportedPlatform__Group_5_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_5__0__Impl
	rule__MOSSupportedPlatform__Group_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getConfigurationKeyword_5_5_0()); }

	'configuration' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getConfigurationKeyword_5_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_5__1__Impl
	rule__MOSSupportedPlatform__Group_5_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getParametersKeyword_5_5_1()); }

	'parameters' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getParametersKeyword_5_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_5__2__Impl
	rule__MOSSupportedPlatform__Group_5_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_5_2()); }

	'{' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_5__3__Impl
	rule__MOSSupportedPlatform__Group_5_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getParametersAssignment_5_5_3()); }
(rule__MOSSupportedPlatform__ParametersAssignment_5_5_3)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getParametersAssignment_5_5_3()); }
)
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getParametersAssignment_5_5_3()); }
(rule__MOSSupportedPlatform__ParametersAssignment_5_5_3)*
{ after(grammarAccess.getMOSSupportedPlatformAccess().getParametersAssignment_5_5_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_5__4__Impl
	rule__MOSSupportedPlatform__Group_5_5__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_5__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getRightCurlyBracketKeyword_5_5_4()); }

	'}' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getRightCurlyBracketKeyword_5_5_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__Group_5_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__Group_5_5__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__Group_5_5__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_5_5()); }

	';' 

{ after(grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_5_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MPlatform__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group__0__Impl
	rule__MPlatform__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getPlatformKeyword_0()); }

	'platform' 

{ after(grammarAccess.getMPlatformAccess().getPlatformKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group__1__Impl
	rule__MPlatform__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getNameAssignment_1()); }
(rule__MPlatform__NameAssignment_1)
{ after(grammarAccess.getMPlatformAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group__2__Impl
	rule__MPlatform__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMPlatformAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group__3__Impl
	rule__MPlatform__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getUnorderedGroup_3()); }
(rule__MPlatform__UnorderedGroup_3)
{ after(grammarAccess.getMPlatformAccess().getUnorderedGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group__4__Impl
	rule__MPlatform__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMPlatformAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMPlatformAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MPlatform__Group_3_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_0__0__Impl
	rule__MPlatform__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getVersionKeyword_3_0_0()); }

	'version' 

{ after(grammarAccess.getMPlatformAccess().getVersionKeyword_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_0__1__Impl
	rule__MPlatform__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_0_1()); }

	':=' 

{ after(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_0__2__Impl
	rule__MPlatform__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getVersionAssignment_3_0_2()); }
(rule__MPlatform__VersionAssignment_3_0_2)
{ after(grammarAccess.getMPlatformAccess().getVersionAssignment_3_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_0_3()); }

	';' 

{ after(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MPlatform__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_1__0__Impl
	rule__MPlatform__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getOsapiKeyword_3_1_0()); }

	'osapi' 

{ after(grammarAccess.getMPlatformAccess().getOsapiKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_1__1__Impl
	rule__MPlatform__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_1_1()); }

	':=' 

{ after(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_1__2__Impl
	rule__MPlatform__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getOsapiAssignment_3_1_2()); }
(rule__MPlatform__OsapiAssignment_3_1_2)
{ after(grammarAccess.getMPlatformAccess().getOsapiAssignment_3_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_1_3()); }

	';' 

{ after(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MPlatform__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_2__0__Impl
	rule__MPlatform__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getOsKeyword_3_2_0()); }

	'os' 

{ after(grammarAccess.getMPlatformAccess().getOsKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_2__1__Impl
	rule__MPlatform__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_2_1()); }

	':=' 

{ after(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_2__2__Impl
	rule__MPlatform__Group_3_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getOsAssignment_3_2_2()); }
(rule__MPlatform__OsAssignment_3_2_2)
{ after(grammarAccess.getMPlatformAccess().getOsAssignment_3_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_2_3()); }

	';' 

{ after(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MPlatform__Group_3_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_3__0__Impl
	rule__MPlatform__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getArchitectureKeyword_3_3_0()); }

	'architecture' 

{ after(grammarAccess.getMPlatformAccess().getArchitectureKeyword_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_3__1__Impl
	rule__MPlatform__Group_3_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_3_1()); }

	':=' 

{ after(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_3__2__Impl
	rule__MPlatform__Group_3_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getArchitectureAssignment_3_3_2()); }
(rule__MPlatform__ArchitectureAssignment_3_3_2)
{ after(grammarAccess.getMPlatformAccess().getArchitectureAssignment_3_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_3_3()); }

	';' 

{ after(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MPlatform__Group_3_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_4__0__Impl
	rule__MPlatform__Group_3_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getCompilerKeyword_3_4_0()); }

	'compiler' 

{ after(grammarAccess.getMPlatformAccess().getCompilerKeyword_3_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_4__1__Impl
	rule__MPlatform__Group_3_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_4_1()); }

	':=' 

{ after(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_4__2__Impl
	rule__MPlatform__Group_3_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getCompilerAssignment_3_4_2()); }
(rule__MPlatform__CompilerAssignment_3_4_2)
{ after(grammarAccess.getMPlatformAccess().getCompilerAssignment_3_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_4_3()); }

	';' 

{ after(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MPlatform__Group_3_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_5__0__Impl
	rule__MPlatform__Group_3_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getMicroprocessorKeyword_3_5_0()); }

	'microprocessor' 

{ after(grammarAccess.getMPlatformAccess().getMicroprocessorKeyword_3_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_5__1__Impl
	rule__MPlatform__Group_3_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_5_1()); }

	':=' 

{ after(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_5__2__Impl
	rule__MPlatform__Group_3_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getAlternatives_3_5_2()); }
(rule__MPlatform__Alternatives_3_5_2)
{ after(grammarAccess.getMPlatformAccess().getAlternatives_3_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_5_3()); }

	';' 

{ after(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MPlatform__Group_3_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_6__0__Impl
	rule__MPlatform__Group_3_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getBoardKeyword_3_6_0()); }

	'board' 

{ after(grammarAccess.getMPlatformAccess().getBoardKeyword_3_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_6__1__Impl
	rule__MPlatform__Group_3_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_6_1()); }

	':=' 

{ after(grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_6__2__Impl
	rule__MPlatform__Group_3_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getAlternatives_3_6_2()); }
(rule__MPlatform__Alternatives_3_6_2)
{ after(grammarAccess.getMPlatformAccess().getAlternatives_3_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_6_3()); }

	';' 

{ after(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MPlatform__Group_3_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_7__0__Impl
	rule__MPlatform__Group_3_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getConfigurationKeyword_3_7_0()); }

	'configuration' 

{ after(grammarAccess.getMPlatformAccess().getConfigurationKeyword_3_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_7__1__Impl
	rule__MPlatform__Group_3_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getParametersKeyword_3_7_1()); }

	'parameters' 

{ after(grammarAccess.getMPlatformAccess().getParametersKeyword_3_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_7__2__Impl
	rule__MPlatform__Group_3_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getLeftCurlyBracketKeyword_3_7_2()); }

	'{' 

{ after(grammarAccess.getMPlatformAccess().getLeftCurlyBracketKeyword_3_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_7__3__Impl
	rule__MPlatform__Group_3_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_7__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMPlatformAccess().getParametersAssignment_3_7_3()); }
(rule__MPlatform__ParametersAssignment_3_7_3)
{ after(grammarAccess.getMPlatformAccess().getParametersAssignment_3_7_3()); }
)
(
{ before(grammarAccess.getMPlatformAccess().getParametersAssignment_3_7_3()); }
(rule__MPlatform__ParametersAssignment_3_7_3)*
{ after(grammarAccess.getMPlatformAccess().getParametersAssignment_3_7_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_7__4__Impl
	rule__MPlatform__Group_3_7__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_7__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getRightCurlyBracketKeyword_3_7_4()); }

	'}' 

{ after(grammarAccess.getMPlatformAccess().getRightCurlyBracketKeyword_3_7_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__Group_3_7__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__Group_3_7__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__Group_3_7__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_7_5()); }

	';' 

{ after(grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_7_5()); }
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









rule__MCompiler__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMCompilerAccess().getUnorderedGroup_4());
    }
:
	rule__MCompiler__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMCompilerAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMCompilerAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MCompiler__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMCompilerAccess().getGroup_4_0()); }
						(rule__MCompiler__Group_4_0__0)
						{ after(grammarAccess.getMCompilerAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMCompilerAccess().getGroup_4_1()); }
						(rule__MCompiler__Group_4_1__0)
						{ after(grammarAccess.getMCompilerAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMCompilerAccess().getGroup_4_2()); }
						(rule__MCompiler__Group_4_2__0)
						{ after(grammarAccess.getMCompilerAccess().getGroup_4_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMCompilerAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MCompiler__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__UnorderedGroup_4__Impl
	rule__MCompiler__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__UnorderedGroup_4__Impl
	rule__MCompiler__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MCompiler__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompiler__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__MCompilerFrontend__UnorderedGroup_3
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3());
    }
:
	rule__MCompilerFrontend__UnorderedGroup_3__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMCompilerFrontendAccess().getGroup_3_0()); }
						(rule__MCompilerFrontend__Group_3_0__0)
						{ after(grammarAccess.getMCompilerFrontendAccess().getGroup_3_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMCompilerFrontendAccess().getGroup_3_1()); }
						(rule__MCompilerFrontend__Group_3_1__0)
						{ after(grammarAccess.getMCompilerFrontendAccess().getGroup_3_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMCompilerFrontendAccess().getGroup_3_2()); }
						(rule__MCompilerFrontend__Group_3_2__0)
						{ after(grammarAccess.getMCompilerFrontendAccess().getGroup_3_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__UnorderedGroup_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__UnorderedGroup_3__Impl
	rule__MCompilerFrontend__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__UnorderedGroup_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__UnorderedGroup_3__Impl
	rule__MCompilerFrontend__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MCompilerFrontend__UnorderedGroup_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MCompilerFrontend__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__MBoard__UnorderedGroup_3
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMBoardAccess().getUnorderedGroup_3());
    }
:
	rule__MBoard__UnorderedGroup_3__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMBoardAccess().getUnorderedGroup_3())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMBoardAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MBoard__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMBoardAccess().getGroup_3_0()); }
						(rule__MBoard__Group_3_0__0)
						{ after(grammarAccess.getMBoardAccess().getGroup_3_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMBoardAccess().getGroup_3_1()); }
						(rule__MBoard__Group_3_1__0)
						{ after(grammarAccess.getMBoardAccess().getGroup_3_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMBoardAccess().getGroup_3_2()); }
						(rule__MBoard__Group_3_2__0)
						{ after(grammarAccess.getMBoardAccess().getGroup_3_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMBoardAccess().getGroup_3_3()); }
						(rule__MBoard__Group_3_3__0)
						{ after(grammarAccess.getMBoardAccess().getGroup_3_3()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMBoardAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MBoard__UnorderedGroup_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__UnorderedGroup_3__Impl
	rule__MBoard__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__UnorderedGroup_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__UnorderedGroup_3__Impl
	rule__MBoard__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__UnorderedGroup_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__UnorderedGroup_3__Impl
	rule__MBoard__UnorderedGroup_3__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MBoard__UnorderedGroup_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBoard__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}










rule__MMicroprocessor__UnorderedGroup_3
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3());
    }
:
	rule__MMicroprocessor__UnorderedGroup_3__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMicroprocessorAccess().getGroup_3_0()); }
						(rule__MMicroprocessor__Group_3_0__0)
						{ after(grammarAccess.getMMicroprocessorAccess().getGroup_3_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMicroprocessorAccess().getGroup_3_1()); }
						(rule__MMicroprocessor__Group_3_1__0)
						{ after(grammarAccess.getMMicroprocessorAccess().getGroup_3_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMMicroprocessorAccess().getGroup_3_2()); }
						(rule__MMicroprocessor__Group_3_2__0)
						{ after(grammarAccess.getMMicroprocessorAccess().getGroup_3_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__UnorderedGroup_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__UnorderedGroup_3__Impl
	rule__MMicroprocessor__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__UnorderedGroup_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__UnorderedGroup_3__Impl
	rule__MMicroprocessor__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MMicroprocessor__UnorderedGroup_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMicroprocessor__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__MOperatingSystem__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4());
    }
:
	rule__MOperatingSystem__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOperatingSystemAccess().getGroup_4_0()); }
						(rule__MOperatingSystem__Group_4_0__0)
						{ after(grammarAccess.getMOperatingSystemAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOperatingSystemAccess().getGroup_4_1()); }
						(rule__MOperatingSystem__Group_4_1__0)
						{ after(grammarAccess.getMOperatingSystemAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOperatingSystemAccess().getGroup_4_2()); }
						(rule__MOperatingSystem__Group_4_2__0)
						{ after(grammarAccess.getMOperatingSystemAccess().getGroup_4_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOperatingSystemAccess().getGroup_4_3()); }
						(rule__MOperatingSystem__Group_4_3__0)
						{ after(grammarAccess.getMOperatingSystemAccess().getGroup_4_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOperatingSystemAccess().getGroup_4_4()); }
						(rule__MOperatingSystem__Group_4_4__0)
						{ after(grammarAccess.getMOperatingSystemAccess().getGroup_4_4()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__UnorderedGroup_4__Impl
	rule__MOperatingSystem__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__UnorderedGroup_4__Impl
	rule__MOperatingSystem__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__UnorderedGroup_4__Impl
	rule__MOperatingSystem__UnorderedGroup_4__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__UnorderedGroup_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__UnorderedGroup_4__Impl
	rule__MOperatingSystem__UnorderedGroup_4__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystem__UnorderedGroup_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystem__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}












rule__MOperatingSystemAPI__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4());
    }
:
	rule__MOperatingSystemAPI__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOperatingSystemAPIAccess().getGroup_4_0()); }
						(rule__MOperatingSystemAPI__Group_4_0__0)
						{ after(grammarAccess.getMOperatingSystemAPIAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOperatingSystemAPIAccess().getGroup_4_1()); }
						(rule__MOperatingSystemAPI__Group_4_1__0)
						{ after(grammarAccess.getMOperatingSystemAPIAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOperatingSystemAPIAccess().getGroup_4_2()); }
						(rule__MOperatingSystemAPI__Group_4_2__0)
						{ after(grammarAccess.getMOperatingSystemAPIAccess().getGroup_4_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__UnorderedGroup_4__Impl
	rule__MOperatingSystemAPI__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__UnorderedGroup_4__Impl
	rule__MOperatingSystemAPI__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOperatingSystemAPI__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOperatingSystemAPI__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__MDevice__UnorderedGroup_3
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMDeviceAccess().getUnorderedGroup_3());
    }
:
	rule__MDevice__UnorderedGroup_3__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDeviceAccess().getUnorderedGroup_3())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMDeviceAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MDevice__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeviceAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeviceAccess().getUnorderedGroup_3(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDeviceAccess().getGroup_3_0()); }
						(rule__MDevice__Group_3_0__0)
						{ after(grammarAccess.getMDeviceAccess().getGroup_3_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeviceAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeviceAccess().getUnorderedGroup_3(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDeviceAccess().getGroup_3_1()); }
						(rule__MDevice__Group_3_1__0)
						{ after(grammarAccess.getMDeviceAccess().getGroup_3_1()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeviceAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MDevice__UnorderedGroup_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__UnorderedGroup_3__Impl
	rule__MDevice__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDevice__UnorderedGroup_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDevice__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}






rule__MArchitecture__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4());
    }
:
	rule__MArchitecture__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MArchitecture__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMArchitectureAccess().getGroup_4_0()); }
						(rule__MArchitecture__Group_4_0__0)
						{ after(grammarAccess.getMArchitectureAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMArchitectureAccess().getGroup_4_1()); }
						(rule__MArchitecture__Group_4_1__0)
						{ after(grammarAccess.getMArchitectureAccess().getGroup_4_1()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MArchitecture__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__UnorderedGroup_4__Impl
	rule__MArchitecture__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MArchitecture__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MArchitecture__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}






rule__MOSSupportedPlatform__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5());
    }
:
	rule__MOSSupportedPlatform__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_0()); }
						(rule__MOSSupportedPlatform__Group_5_0__0)
						{ after(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_1()); }
						(rule__MOSSupportedPlatform__Group_5_1__0)
						{ after(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_2()); }
						(rule__MOSSupportedPlatform__Group_5_2__0)
						{ after(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_3()); }
						(rule__MOSSupportedPlatform__Group_5_3__0)
						{ after(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_4()); }
						(rule__MOSSupportedPlatform__Group_5_4__0)
						{ after(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_5()); }
						(rule__MOSSupportedPlatform__Group_5_5__0)
						{ after(grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_5()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__UnorderedGroup_5__Impl
	rule__MOSSupportedPlatform__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__UnorderedGroup_5__Impl
	rule__MOSSupportedPlatform__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__UnorderedGroup_5__Impl
	rule__MOSSupportedPlatform__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__UnorderedGroup_5__Impl
	rule__MOSSupportedPlatform__UnorderedGroup_5__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__UnorderedGroup_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__UnorderedGroup_5__Impl
	rule__MOSSupportedPlatform__UnorderedGroup_5__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSupportedPlatform__UnorderedGroup_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSupportedPlatform__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}














rule__MPlatform__UnorderedGroup_3
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
    }
:
	rule__MPlatform__UnorderedGroup_3__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMPlatformAccess().getUnorderedGroup_3())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MPlatform__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPlatformAccess().getGroup_3_0()); }
						(rule__MPlatform__Group_3_0__0)
						{ after(grammarAccess.getMPlatformAccess().getGroup_3_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPlatformAccess().getGroup_3_1()); }
						(rule__MPlatform__Group_3_1__0)
						{ after(grammarAccess.getMPlatformAccess().getGroup_3_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPlatformAccess().getGroup_3_2()); }
						(rule__MPlatform__Group_3_2__0)
						{ after(grammarAccess.getMPlatformAccess().getGroup_3_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPlatformAccess().getGroup_3_3()); }
						(rule__MPlatform__Group_3_3__0)
						{ after(grammarAccess.getMPlatformAccess().getGroup_3_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPlatformAccess().getGroup_3_4()); }
						(rule__MPlatform__Group_3_4__0)
						{ after(grammarAccess.getMPlatformAccess().getGroup_3_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPlatformAccess().getGroup_3_5()); }
						(rule__MPlatform__Group_3_5__0)
						{ after(grammarAccess.getMPlatformAccess().getGroup_3_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPlatformAccess().getGroup_3_6()); }
						(rule__MPlatform__Group_3_6__0)
						{ after(grammarAccess.getMPlatformAccess().getGroup_3_6()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 7);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPlatformAccess().getGroup_3_7()); }
						(rule__MPlatform__Group_3_7__0)
						{ after(grammarAccess.getMPlatformAccess().getGroup_3_7()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MPlatform__UnorderedGroup_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__UnorderedGroup_3__Impl
	rule__MPlatform__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__UnorderedGroup_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__UnorderedGroup_3__Impl
	rule__MPlatform__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__UnorderedGroup_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__UnorderedGroup_3__Impl
	rule__MPlatform__UnorderedGroup_3__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__UnorderedGroup_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__UnorderedGroup_3__Impl
	rule__MPlatform__UnorderedGroup_3__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__UnorderedGroup_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__UnorderedGroup_3__Impl
	rule__MPlatform__UnorderedGroup_3__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__UnorderedGroup_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__UnorderedGroup_3__Impl
	rule__MPlatform__UnorderedGroup_3__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__UnorderedGroup_3__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__UnorderedGroup_3__Impl
	rule__MPlatform__UnorderedGroup_3__7?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatform__UnorderedGroup_3__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatform__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


















rule__MPDLPackageFile__PackageAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPDLPackageFileAccess().getPackageMPDLPackageCrossReference_1_0()); }
(
{ before(grammarAccess.getMPDLPackageFileAccess().getPackageMPDLPackageQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMPDLPackageFileAccess().getPackageMPDLPackageQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMPDLPackageFileAccess().getPackageMPDLPackageCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPDLPackageFile__ImportsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPDLPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMPDLPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMPDLPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMPDLPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPDLPackageFile__ElementAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPDLPackageFileAccess().getElementMPDLPackageElementParserRuleCall_4_0()); }
	ruleMPDLPackageElement{ after(grammarAccess.getMPDLPackageFileAccess().getElementMPDLPackageElementParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMCompilerAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__ExtendsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getExtendsMCompilerCrossReference_2_1_0()); }
(
{ before(grammarAccess.getMCompilerAccess().getExtendsMCompilerVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMCompilerAccess().getExtendsMCompilerVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMCompilerAccess().getExtendsMCompilerCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__ExtendsAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getExtendsMCompilerCrossReference_2_2_1_0()); }
(
{ before(grammarAccess.getMCompilerAccess().getExtendsMCompilerVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMCompilerAccess().getExtendsMCompilerVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
)
{ after(grammarAccess.getMCompilerAccess().getExtendsMCompilerCrossReference_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__VersionAssignment_4_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMCompilerAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__FrontendsAssignment_4_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getFrontendsMCompilerFrontendParserRuleCall_4_1_2_0()); }
	ruleMCompilerFrontend{ after(grammarAccess.getMCompilerAccess().getFrontendsMCompilerFrontendParserRuleCall_4_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCompiler__ParametersAssignment_4_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerAccess().getParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0()); }
	ruleMParameterWithoutOSSP{ after(grammarAccess.getMCompilerAccess().getParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMCompilerFrontendAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__LanguageAssignment_3_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getLanguageMLanguageCrossReference_3_0_2_0()); }
(
{ before(grammarAccess.getMCompilerFrontendAccess().getLanguageMLanguageVersionedQualifiedNameParserRuleCall_3_0_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMCompilerFrontendAccess().getLanguageMLanguageVersionedQualifiedNameParserRuleCall_3_0_2_0_1()); }
)
{ after(grammarAccess.getMCompilerFrontendAccess().getLanguageMLanguageCrossReference_3_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__ArchitecturesAssignment_3_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureCrossReference_3_1_2_0()); }
(
{ before(grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureVersionedQualifiedNameParserRuleCall_3_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureVersionedQualifiedNameParserRuleCall_3_1_2_0_1()); }
)
{ after(grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureCrossReference_3_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__ArchitecturesAssignment_3_1_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureCrossReference_3_1_3_1_0()); }
(
{ before(grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureVersionedQualifiedNameParserRuleCall_3_1_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureVersionedQualifiedNameParserRuleCall_3_1_3_1_0_1()); }
)
{ after(grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureCrossReference_3_1_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MCompilerFrontend__ParametersAssignment_3_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMCompilerFrontendAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0()); }
	ruleMParameterWithoutOSSP{ after(grammarAccess.getMCompilerFrontendAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMBoardAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__VersionAssignment_3_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getVersionVersionParserRuleCall_3_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMBoardAccess().getVersionVersionParserRuleCall_3_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__SupportedDevicesAssignment_3_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getSupportedDevicesMBoardSupportedDeviceParserRuleCall_3_1_3_0()); }
	ruleMBoardSupportedDevice{ after(grammarAccess.getMBoardAccess().getSupportedDevicesMBoardSupportedDeviceParserRuleCall_3_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__MicroprocessorAssignment_3_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getMicroprocessorMMicroprocessorCrossReference_3_2_2_0()); }
(
{ before(grammarAccess.getMBoardAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_3_2_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMBoardAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_3_2_2_0_1()); }
)
{ after(grammarAccess.getMBoardAccess().getMicroprocessorMMicroprocessorCrossReference_3_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBoard__ParametersAssignment_3_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_3_3_0()); }
	ruleMParameterWithoutOSSP{ after(grammarAccess.getMBoardAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBoardSupportedDevice__DeviceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); }
(
{ before(grammarAccess.getMBoardSupportedDeviceAccess().getDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMBoardSupportedDeviceAccess().getDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMBoardSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBoardSupportedDevice__LowerBoundAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardSupportedDeviceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMBoardSupportedDeviceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBoardSupportedDevice__UpperBoundAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBoardSupportedDeviceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_5_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMBoardSupportedDeviceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMMicroprocessorAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__VersionAssignment_3_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getVersionVersionParserRuleCall_3_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMMicroprocessorAccess().getVersionVersionParserRuleCall_3_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__ArchitectureAssignment_3_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getArchitectureMArchitectureCrossReference_3_1_2_0()); }
(
{ before(grammarAccess.getMMicroprocessorAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_3_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMMicroprocessorAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_3_1_2_0_1()); }
)
{ after(grammarAccess.getMMicroprocessorAccess().getArchitectureMArchitectureCrossReference_3_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMicroprocessor__ParametersAssignment_3_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMicroprocessorAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0()); }
	ruleMParameterWithoutOSSP{ after(grammarAccess.getMMicroprocessorAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMOperatingSystemAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__InheritsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemCrossReference_2_1_0()); }
(
{ before(grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__InheritsAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemCrossReference_2_2_1_0()); }
(
{ before(grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
)
{ after(grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemCrossReference_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__VersionAssignment_4_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMOperatingSystemAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__LanguagesAssignment_4_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageCrossReference_4_1_2_0()); }
(
{ before(grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
)
{ after(grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageCrossReference_4_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__LanguagesAssignment_4_1_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0()); }
(
{ before(grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_4_1_3_1_0_1()); }
)
{ after(grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__SupportedOSAPIsAssignment_4_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getSupportedOSAPIsMOSSupportedOSAPIParserRuleCall_4_2_3_0()); }
	ruleMOSSupportedOSAPI{ after(grammarAccess.getMOperatingSystemAccess().getSupportedOSAPIsMOSSupportedOSAPIParserRuleCall_4_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__SupportedPlatformsAssignment_4_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getSupportedPlatformsMOSSupportedPlatformParserRuleCall_4_3_3_0()); }
	ruleMOSSupportedPlatform{ after(grammarAccess.getMOperatingSystemAccess().getSupportedPlatformsMOSSupportedPlatformParserRuleCall_4_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystem__ParametersAssignment_4_4_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAccess().getParametersMParameterParserRuleCall_4_4_3_0()); }
	ruleMParameter{ after(grammarAccess.getMOperatingSystemAccess().getParametersMParameterParserRuleCall_4_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPI__OsapiAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIAccess().getOsapiMOperatingSystemAPICrossReference_1_0()); }
(
{ before(grammarAccess.getMOSSupportedOSAPIAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSupportedOSAPIAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMOSSupportedOSAPIAccess().getOsapiMOperatingSystemAPICrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPI__ParameterValueAssignmentsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIAccess().getParameterValueAssignmentsMOSSupportedOSAPIPVAParserRuleCall_3_0()); }
	ruleMOSSupportedOSAPIPVA{ after(grammarAccess.getMOSSupportedOSAPIAccess().getParameterValueAssignmentsMOSSupportedOSAPIPVAParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVAExpression__ParameterAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterMParameterCrossReference_1_0()); }
(
{ before(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterMParameterCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVAExpression__ParameterValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitch__ParameterAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getParameterMParameterCrossReference_2_0()); }
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getParameterMParameterCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitch__CasesAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getCasesMOSSupportedOSAPIPVASwitchCaseParserRuleCall_5_0()); }
	ruleMOSSupportedOSAPIPVASwitchCase{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getCasesMOSSupportedOSAPIPVASwitchCaseParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedOSAPIPVASwitchCase__ParameterValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitch__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitch__CasesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchAccess().getCasesMBooleanParamOSSPSwitchCaseParserRuleCall_6_0()); }
	ruleMBooleanParamOSSPSwitchCase{ after(grammarAccess.getMBooleanParamOSSPSwitchAccess().getCasesMBooleanParamOSSPSwitchCaseParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamOSSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitch__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitch__CasesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchAccess().getCasesMStringParamOSSPSwitchCaseParserRuleCall_6_0()); }
	ruleMStringParamOSSPSwitchCase{ after(grammarAccess.getMStringParamOSSPSwitchAccess().getCasesMStringParamOSSPSwitchCaseParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamOSSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitch__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitch__CasesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchAccess().getCasesMIntegerParamOSSPSwitchCaseParserRuleCall_6_0()); }
	ruleMIntegerParamOSSPSwitchCase{ after(grammarAccess.getMIntegerParamOSSPSwitchAccess().getCasesMIntegerParamOSSPSwitchCaseParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamOSSPSwitchCase__RangeAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
	ruleMParameterRange{ after(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitch__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitch__CasesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchAccess().getCasesMRealParamOSSPSwitchCaseParserRuleCall_6_0()); }
	ruleMRealParamOSSPSwitchCase{ after(grammarAccess.getMRealParamOSSPSwitchAccess().getCasesMRealParamOSSPSwitchCaseParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamOSSPSwitchCase__RangeAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
	ruleMParameterRange{ after(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__EnumDefinitionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); }
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitch__CasesAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchAccess().getCasesMEnumParamOSSPSwitchCaseParserRuleCall_7_0()); }
	ruleMEnumParamOSSPSwitchCase{ after(grammarAccess.getMEnumParamOSSPSwitchAccess().getCasesMEnumParamOSSPSwitchCaseParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamOSSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
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

rule__MEnumParamStringLiteralRegular__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralRegularAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMEnumParamStringLiteralRegularAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteralRegular__IsRawAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralRegularAccess().getIsRawRawKeyword_3_0()); }
(
{ before(grammarAccess.getMEnumParamStringLiteralRegularAccess().getIsRawRawKeyword_3_0()); }

	'raw' 

{ after(grammarAccess.getMEnumParamStringLiteralRegularAccess().getIsRawRawKeyword_3_0()); }
)

{ after(grammarAccess.getMEnumParamStringLiteralRegularAccess().getIsRawRawKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamStringLiteralRegular__ValueAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamStringLiteralRegularAccess().getValueSTRINGTerminalRuleCall_4_0()); }
	RULE_STRING{ after(grammarAccess.getMEnumParamStringLiteralRegularAccess().getValueSTRINGTerminalRuleCall_4_0()); }
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

rule__MOperatingSystemAPI__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMOperatingSystemAPIAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__InheritsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPICrossReference_2_1_0()); }
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPICrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__InheritsAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPICrossReference_2_2_1_0()); }
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
)
{ after(grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPICrossReference_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__VersionAssignment_4_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMOperatingSystemAPIAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__LanguageAssignment_4_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getLanguageMLanguageCrossReference_4_1_2_0()); }
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getLanguageMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOperatingSystemAPIAccess().getLanguageMLanguageVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
)
{ after(grammarAccess.getMOperatingSystemAPIAccess().getLanguageMLanguageCrossReference_4_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOperatingSystemAPI__ParametersAssignment_4_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOperatingSystemAPIAccess().getParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0()); }
	ruleMParameterWithoutOSSP{ after(grammarAccess.getMOperatingSystemAPIAccess().getParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMDeviceAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__VersionAssignment_3_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getVersionVersionParserRuleCall_3_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMDeviceAccess().getVersionVersionParserRuleCall_3_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDevice__ParametersAssignment_3_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDeviceAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_1_3_0()); }
	ruleMParameterWithoutOSSP{ after(grammarAccess.getMDeviceAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMArchitectureAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__ExtendsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getExtendsMArchitectureCrossReference_2_1_0()); }
(
{ before(grammarAccess.getMArchitectureAccess().getExtendsMArchitectureVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMArchitectureAccess().getExtendsMArchitectureVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMArchitectureAccess().getExtendsMArchitectureCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__ExtendsAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getExtendsMArchitectureCrossReference_2_2_1_0()); }
(
{ before(grammarAccess.getMArchitectureAccess().getExtendsMArchitectureVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMArchitectureAccess().getExtendsMArchitectureVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
)
{ after(grammarAccess.getMArchitectureAccess().getExtendsMArchitectureCrossReference_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__VersionAssignment_4_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMArchitectureAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MArchitecture__ParametersAssignment_4_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMArchitectureAccess().getParametersMParameterWithoutOSSPParserRuleCall_4_1_3_0()); }
	ruleMParameterWithoutOSSP{ after(grammarAccess.getMArchitectureAccess().getParametersMParameterWithoutOSSPParserRuleCall_4_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMOSSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__ArchitectureAssignment_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_0_2_0()); }
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_0_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_0_2_0_1()); }
)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__CompilerAssignment_5_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_1_2_0()); }
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_1_2_0_1()); }
)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__MicroprocessorAssignment_5_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_2_2_1_0()); }
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1()); }
)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__BoardAssignment_5_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getBoardMBoardCrossReference_5_3_2_1_0()); }
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_5_3_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_5_3_2_1_0_1()); }
)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getBoardMBoardCrossReference_5_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__LanguagesAssignment_5_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_4_2_0()); }
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_4_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_4_2_0_1()); }
)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__LanguagesAssignment_5_4_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_4_3_1_0()); }
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_4_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_4_3_1_0_1()); }
)
{ after(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_4_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSupportedPlatform__ParametersAssignment_5_5_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSupportedPlatformAccess().getParametersMParameterWithoutOSSPParserRuleCall_5_5_3_0()); }
	ruleMParameterWithoutOSSP{ after(grammarAccess.getMOSSupportedPlatformAccess().getParametersMParameterWithoutOSSPParserRuleCall_5_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMPlatformAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__VersionAssignment_3_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getVersionVersionParserRuleCall_3_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMPlatformAccess().getVersionVersionParserRuleCall_3_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__OsapiAssignment_3_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getOsapiMOperatingSystemAPICrossReference_3_1_2_0()); }
(
{ before(grammarAccess.getMPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_3_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_3_1_2_0_1()); }
)
{ after(grammarAccess.getMPlatformAccess().getOsapiMOperatingSystemAPICrossReference_3_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__OsAssignment_3_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getOsMOperatingSystemCrossReference_3_2_2_0()); }
(
{ before(grammarAccess.getMPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_3_2_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_3_2_2_0_1()); }
)
{ after(grammarAccess.getMPlatformAccess().getOsMOperatingSystemCrossReference_3_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__ArchitectureAssignment_3_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getArchitectureMArchitectureCrossReference_3_3_2_0()); }
(
{ before(grammarAccess.getMPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_3_3_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_3_3_2_0_1()); }
)
{ after(grammarAccess.getMPlatformAccess().getArchitectureMArchitectureCrossReference_3_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__CompilerAssignment_3_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getCompilerMCompilerCrossReference_3_4_2_0()); }
(
{ before(grammarAccess.getMPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_3_4_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_3_4_2_0_1()); }
)
{ after(grammarAccess.getMPlatformAccess().getCompilerMCompilerCrossReference_3_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__MicroprocessorAssignment_3_5_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_3_5_2_1_0()); }
(
{ before(grammarAccess.getMPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_3_5_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_3_5_2_1_0_1()); }
)
{ after(grammarAccess.getMPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_3_5_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__BoardAssignment_3_6_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getBoardMBoardCrossReference_3_6_2_1_0()); }
(
{ before(grammarAccess.getMPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_3_6_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_3_6_2_1_0_1()); }
)
{ after(grammarAccess.getMPlatformAccess().getBoardMBoardCrossReference_3_6_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatform__ParametersAssignment_3_7_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_7_3_0()); }
	ruleMParameterWithoutOSSP{ after(grammarAccess.getMPlatformAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_7_3_0()); }
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


