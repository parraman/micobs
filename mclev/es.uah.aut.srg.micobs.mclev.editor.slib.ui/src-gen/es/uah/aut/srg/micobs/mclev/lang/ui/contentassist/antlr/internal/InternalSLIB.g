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
grammar InternalSLIB;

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
import es.uah.aut.srg.micobs.mclev.lang.services.SLIBGrammarAccess;

}

@parser::members {
 
 	private SLIBGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(SLIBGrammarAccess grammarAccess) {
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




// Entry rule entryRuleMMCLEVSLIBPackageFile
entryRuleMMCLEVSLIBPackageFile 
:
{ before(grammarAccess.getMMCLEVSLIBPackageFileRule()); }
	 ruleMMCLEVSLIBPackageFile
{ after(grammarAccess.getMMCLEVSLIBPackageFileRule()); } 
	 EOF 
;

// Rule MMCLEVSLIBPackageFile
ruleMMCLEVSLIBPackageFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getGroup()); }
(rule__MMCLEVSLIBPackageFile__Group__0)
{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMCLEVSLIBPackageElement
entryRuleMMCLEVSLIBPackageElement 
:
{ before(grammarAccess.getMMCLEVSLIBPackageElementRule()); }
	 ruleMMCLEVSLIBPackageElement
{ after(grammarAccess.getMMCLEVSLIBPackageElementRule()); } 
	 EOF 
;

// Rule MMCLEVSLIBPackageElement
ruleMMCLEVSLIBPackageElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMCLEVSLIBPackageElementAccess().getAlternatives()); }
(rule__MMCLEVSLIBPackageElement__Alternatives)
{ after(grammarAccess.getMMCLEVSLIBPackageElementAccess().getAlternatives()); }
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



// Entry rule entryRuleMAbstractServiceLibrary
entryRuleMAbstractServiceLibrary 
:
{ before(grammarAccess.getMAbstractServiceLibraryRule()); }
	 ruleMAbstractServiceLibrary
{ after(grammarAccess.getMAbstractServiceLibraryRule()); } 
	 EOF 
;

// Rule MAbstractServiceLibrary
ruleMAbstractServiceLibrary
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getGroup()); }
(rule__MAbstractServiceLibrary__Group__0)
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMServiceLibraryProvidedSAI
entryRuleMServiceLibraryProvidedSAI 
:
{ before(grammarAccess.getMServiceLibraryProvidedSAIRule()); }
	 ruleMServiceLibraryProvidedSAI
{ after(grammarAccess.getMServiceLibraryProvidedSAIRule()); } 
	 EOF 
;

// Rule MServiceLibraryProvidedSAI
ruleMServiceLibraryProvidedSAI
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMServiceLibraryProvidedSAIAccess().getGroup()); }
(rule__MServiceLibraryProvidedSAI__Group__0)
{ after(grammarAccess.getMServiceLibraryProvidedSAIAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMSLibProvidedSAIAVA
entryRuleMSLibProvidedSAIAVA 
:
{ before(grammarAccess.getMSLibProvidedSAIAVARule()); }
	 ruleMSLibProvidedSAIAVA
{ after(grammarAccess.getMSLibProvidedSAIAVARule()); } 
	 EOF 
;

// Rule MSLibProvidedSAIAVA
ruleMSLibProvidedSAIAVA
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMSLibProvidedSAIAVAAccess().getAlternatives()); }
(rule__MSLibProvidedSAIAVA__Alternatives)
{ after(grammarAccess.getMSLibProvidedSAIAVAAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMSLibProvidedSAIAVAExpression
entryRuleMSLibProvidedSAIAVAExpression 
:
{ before(grammarAccess.getMSLibProvidedSAIAVAExpressionRule()); }
	 ruleMSLibProvidedSAIAVAExpression
{ after(grammarAccess.getMSLibProvidedSAIAVAExpressionRule()); } 
	 EOF 
;

// Rule MSLibProvidedSAIAVAExpression
ruleMSLibProvidedSAIAVAExpression
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getGroup()); }
(rule__MSLibProvidedSAIAVAExpression__Group__0)
{ after(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMSLibProvidedSAIAVASwitch
entryRuleMSLibProvidedSAIAVASwitch 
:
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchRule()); }
	 ruleMSLibProvidedSAIAVASwitch
{ after(grammarAccess.getMSLibProvidedSAIAVASwitchRule()); } 
	 EOF 
;

// Rule MSLibProvidedSAIAVASwitch
ruleMSLibProvidedSAIAVASwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getGroup()); }
(rule__MSLibProvidedSAIAVASwitch__Group__0)
{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMSLibProvidedSAIAVASwitchCase
entryRuleMSLibProvidedSAIAVASwitchCase 
:
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchCaseRule()); }
	 ruleMSLibProvidedSAIAVASwitchCase
{ after(grammarAccess.getMSLibProvidedSAIAVASwitchCaseRule()); } 
	 EOF 
;

// Rule MSLibProvidedSAIAVASwitchCase
ruleMSLibProvidedSAIAVASwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getGroup()); }
(rule__MSLibProvidedSAIAVASwitchCase__Group__0)
{ after(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMServiceLibrary
entryRuleMServiceLibrary 
:
{ before(grammarAccess.getMServiceLibraryRule()); }
	 ruleMServiceLibrary
{ after(grammarAccess.getMServiceLibraryRule()); } 
	 EOF 
;

// Rule MServiceLibrary
ruleMServiceLibrary
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMServiceLibraryAccess().getGroup()); }
(rule__MServiceLibrary__Group__0)
{ after(grammarAccess.getMServiceLibraryAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDriverServiceLibrary
entryRuleMDriverServiceLibrary 
:
{ before(grammarAccess.getMDriverServiceLibraryRule()); }
	 ruleMDriverServiceLibrary
{ after(grammarAccess.getMDriverServiceLibraryRule()); } 
	 EOF 
;

// Rule MDriverServiceLibrary
ruleMDriverServiceLibrary
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup()); }
(rule__MDriverServiceLibrary__Group__0)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMServiceLibrarySupportedPlatform
entryRuleMServiceLibrarySupportedPlatform 
:
{ before(grammarAccess.getMServiceLibrarySupportedPlatformRule()); }
	 ruleMServiceLibrarySupportedPlatform
{ after(grammarAccess.getMServiceLibrarySupportedPlatformRule()); } 
	 EOF 
;

// Rule MServiceLibrarySupportedPlatform
ruleMServiceLibrarySupportedPlatform
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup()); }
(rule__MServiceLibrarySupportedPlatform__Group__0)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDriverSLibSupportedPlatform
entryRuleMDriverSLibSupportedPlatform 
:
{ before(grammarAccess.getMDriverSLibSupportedPlatformRule()); }
	 ruleMDriverSLibSupportedPlatform
{ after(grammarAccess.getMDriverSLibSupportedPlatformRule()); } 
	 EOF 
;

// Rule MDriverSLibSupportedPlatform
ruleMDriverSLibSupportedPlatform
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup()); }
(rule__MDriverSLibSupportedPlatform__Group__0)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMDriverSLibSupportedDevice
entryRuleMDriverSLibSupportedDevice 
:
{ before(grammarAccess.getMDriverSLibSupportedDeviceRule()); }
	 ruleMDriverSLibSupportedDevice
{ after(grammarAccess.getMDriverSLibSupportedDeviceRule()); } 
	 EOF 
;

// Rule MDriverSLibSupportedDevice
ruleMDriverSLibSupportedDevice
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getGroup()); }
(rule__MDriverSLibSupportedDevice__Group__0)
{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getGroup()); }
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



// Entry rule entryRuleMParameterWithoutSLSP
entryRuleMParameterWithoutSLSP 
:
{ before(grammarAccess.getMParameterWithoutSLSPRule()); }
	 ruleMParameterWithoutSLSP
{ after(grammarAccess.getMParameterWithoutSLSPRule()); } 
	 EOF 
;

// Rule MParameterWithoutSLSP
ruleMParameterWithoutSLSP
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMParameterWithoutSLSPAccess().getAlternatives()); }
(rule__MParameterWithoutSLSP__Alternatives)
{ after(grammarAccess.getMParameterWithoutSLSPAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMBooleanParamSLSPSwitch
entryRuleMBooleanParamSLSPSwitch 
:
{ before(grammarAccess.getMBooleanParamSLSPSwitchRule()); }
	 ruleMBooleanParamSLSPSwitch
{ after(grammarAccess.getMBooleanParamSLSPSwitchRule()); } 
	 EOF 
;

// Rule MBooleanParamSLSPSwitch
ruleMBooleanParamSLSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getGroup()); }
(rule__MBooleanParamSLSPSwitch__Group__0)
{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMBooleanParamSLSPSwitchCase
entryRuleMBooleanParamSLSPSwitchCase 
:
{ before(grammarAccess.getMBooleanParamSLSPSwitchCaseRule()); }
	 ruleMBooleanParamSLSPSwitchCase
{ after(grammarAccess.getMBooleanParamSLSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MBooleanParamSLSPSwitchCase
ruleMBooleanParamSLSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getGroup()); }
(rule__MBooleanParamSLSPSwitchCase__Group__0)
{ after(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMStringParamSLSPSwitch
entryRuleMStringParamSLSPSwitch 
:
{ before(grammarAccess.getMStringParamSLSPSwitchRule()); }
	 ruleMStringParamSLSPSwitch
{ after(grammarAccess.getMStringParamSLSPSwitchRule()); } 
	 EOF 
;

// Rule MStringParamSLSPSwitch
ruleMStringParamSLSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getGroup()); }
(rule__MStringParamSLSPSwitch__Group__0)
{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMStringParamSLSPSwitchCase
entryRuleMStringParamSLSPSwitchCase 
:
{ before(grammarAccess.getMStringParamSLSPSwitchCaseRule()); }
	 ruleMStringParamSLSPSwitchCase
{ after(grammarAccess.getMStringParamSLSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MStringParamSLSPSwitchCase
ruleMStringParamSLSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getGroup()); }
(rule__MStringParamSLSPSwitchCase__Group__0)
{ after(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMIntegerParamSLSPSwitch
entryRuleMIntegerParamSLSPSwitch 
:
{ before(grammarAccess.getMIntegerParamSLSPSwitchRule()); }
	 ruleMIntegerParamSLSPSwitch
{ after(grammarAccess.getMIntegerParamSLSPSwitchRule()); } 
	 EOF 
;

// Rule MIntegerParamSLSPSwitch
ruleMIntegerParamSLSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getGroup()); }
(rule__MIntegerParamSLSPSwitch__Group__0)
{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMIntegerParamSLSPSwitchCase
entryRuleMIntegerParamSLSPSwitchCase 
:
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseRule()); }
	 ruleMIntegerParamSLSPSwitchCase
{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MIntegerParamSLSPSwitchCase
ruleMIntegerParamSLSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getGroup()); }
(rule__MIntegerParamSLSPSwitchCase__Group__0)
{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMRealParamSLSPSwitch
entryRuleMRealParamSLSPSwitch 
:
{ before(grammarAccess.getMRealParamSLSPSwitchRule()); }
	 ruleMRealParamSLSPSwitch
{ after(grammarAccess.getMRealParamSLSPSwitchRule()); } 
	 EOF 
;

// Rule MRealParamSLSPSwitch
ruleMRealParamSLSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getGroup()); }
(rule__MRealParamSLSPSwitch__Group__0)
{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMRealParamSLSPSwitchCase
entryRuleMRealParamSLSPSwitchCase 
:
{ before(grammarAccess.getMRealParamSLSPSwitchCaseRule()); }
	 ruleMRealParamSLSPSwitchCase
{ after(grammarAccess.getMRealParamSLSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MRealParamSLSPSwitchCase
ruleMRealParamSLSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getGroup()); }
(rule__MRealParamSLSPSwitchCase__Group__0)
{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParamSLSPSwitch
entryRuleMEnumParamSLSPSwitch 
:
{ before(grammarAccess.getMEnumParamSLSPSwitchRule()); }
	 ruleMEnumParamSLSPSwitch
{ after(grammarAccess.getMEnumParamSLSPSwitchRule()); } 
	 EOF 
;

// Rule MEnumParamSLSPSwitch
ruleMEnumParamSLSPSwitch
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getGroup()); }
(rule__MEnumParamSLSPSwitch__Group__0)
{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMEnumParamSLSPSwitchCase
entryRuleMEnumParamSLSPSwitchCase 
:
{ before(grammarAccess.getMEnumParamSLSPSwitchCaseRule()); }
	 ruleMEnumParamSLSPSwitchCase
{ after(grammarAccess.getMEnumParamSLSPSwitchCaseRule()); } 
	 EOF 
;

// Rule MEnumParamSLSPSwitchCase
ruleMEnumParamSLSPSwitchCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getGroup()); }
(rule__MEnumParamSLSPSwitchCase__Group__0)
{ after(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getGroup()); }
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



rule__MMCLEVSLIBPackageElement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVSLIBPackageElementAccess().getMDriverServiceLibraryParserRuleCall_0()); }
	ruleMDriverServiceLibrary
{ after(grammarAccess.getMMCLEVSLIBPackageElementAccess().getMDriverServiceLibraryParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMMCLEVSLIBPackageElementAccess().getMServiceLibraryParserRuleCall_1()); }
	ruleMServiceLibrary
{ after(grammarAccess.getMMCLEVSLIBPackageElementAccess().getMServiceLibraryParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getMMCLEVSLIBPackageElementAccess().getMAbstractServiceLibraryParserRuleCall_2()); }
	ruleMAbstractServiceLibrary
{ after(grammarAccess.getMMCLEVSLIBPackageElementAccess().getMAbstractServiceLibraryParserRuleCall_2()); }
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

rule__MSLibProvidedSAIAVA__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVAAccess().getMSLibProvidedSAIAVAExpressionParserRuleCall_0()); }
	ruleMSLibProvidedSAIAVAExpression
{ after(grammarAccess.getMSLibProvidedSAIAVAAccess().getMSLibProvidedSAIAVAExpressionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMSLibProvidedSAIAVAAccess().getMSLibProvidedSAIAVASwitchParserRuleCall_1()); }
	ruleMSLibProvidedSAIAVASwitch
{ after(grammarAccess.getMSLibProvidedSAIAVAAccess().getMSLibProvidedSAIAVASwitchParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Alternatives_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_0_2_0()); }

	'any' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_0_2_0()); }
)

    |(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiAssignment_5_0_2_1()); }
(rule__MServiceLibrarySupportedPlatform__OsapiAssignment_5_0_2_1)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiAssignment_5_0_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Alternatives_5_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_1_2_0()); }

	'any' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_1_2_0()); }
)

    |(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsAssignment_5_1_2_1()); }
(rule__MServiceLibrarySupportedPlatform__OsAssignment_5_1_2_1)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsAssignment_5_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Alternatives_5_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_2_2_0()); }

	'any' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_2_2_0()); }
)

    |(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureAssignment_5_2_2_1()); }
(rule__MServiceLibrarySupportedPlatform__ArchitectureAssignment_5_2_2_1)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureAssignment_5_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Alternatives_5_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_4_2_0()); }

	'any' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_4_2_0()); }
)

    |(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1()); }
(rule__MServiceLibrarySupportedPlatform__MicroprocessorAssignment_5_4_2_1)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Alternatives_5_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_5_2_0()); }

	'any' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_5_2_0()); }
)

    |(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardAssignment_5_5_2_1()); }
(rule__MServiceLibrarySupportedPlatform__BoardAssignment_5_5_2_1)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardAssignment_5_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Alternatives_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_0_2_0()); }

	'any' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_0_2_0()); }
)

    |(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiAssignment_5_0_2_1()); }
(rule__MDriverSLibSupportedPlatform__OsapiAssignment_5_0_2_1)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiAssignment_5_0_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Alternatives_5_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_1_2_0()); }

	'any' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_1_2_0()); }
)

    |(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsAssignment_5_1_2_1()); }
(rule__MDriverSLibSupportedPlatform__OsAssignment_5_1_2_1)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsAssignment_5_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Alternatives_5_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_2_2_0()); }

	'any' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_2_2_0()); }
)

    |(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1()); }
(rule__MDriverSLibSupportedPlatform__ArchitectureAssignment_5_2_2_1)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Alternatives_5_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_4_2_0()); }

	'any' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_4_2_0()); }
)

    |(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1()); }
(rule__MDriverSLibSupportedPlatform__MicroprocessorAssignment_5_4_2_1)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Alternatives_5_5_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_5_2_0()); }

	'any' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_5_2_0()); }
)

    |(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardAssignment_5_5_2_1()); }
(rule__MDriverSLibSupportedPlatform__BoardAssignment_5_5_2_1)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardAssignment_5_5_2_1()); }
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
{ before(grammarAccess.getMParameterAccess().getMBooleanParamSLSPSwitchParserRuleCall_6()); }
	ruleMBooleanParamSLSPSwitch
{ after(grammarAccess.getMParameterAccess().getMBooleanParamSLSPSwitchParserRuleCall_6()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMStringParamSLSPSwitchParserRuleCall_7()); }
	ruleMStringParamSLSPSwitch
{ after(grammarAccess.getMParameterAccess().getMStringParamSLSPSwitchParserRuleCall_7()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMIntegerParamSLSPSwitchParserRuleCall_8()); }
	ruleMIntegerParamSLSPSwitch
{ after(grammarAccess.getMParameterAccess().getMIntegerParamSLSPSwitchParserRuleCall_8()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMRealParamSLSPSwitchParserRuleCall_9()); }
	ruleMRealParamSLSPSwitch
{ after(grammarAccess.getMParameterAccess().getMRealParamSLSPSwitchParserRuleCall_9()); }
)

    |(
{ before(grammarAccess.getMParameterAccess().getMEnumParamSLSPSwitchParserRuleCall_10()); }
	ruleMEnumParamSLSPSwitch
{ after(grammarAccess.getMParameterAccess().getMEnumParamSLSPSwitchParserRuleCall_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MParameterWithoutSLSP__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMParameterWithoutSLSPAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); }
	ruleMIntegerParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutSLSPAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutSLSPAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); }
	ruleMEnumParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutSLSPAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutSLSPAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); }
	ruleMBooleanParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutSLSPAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutSLSPAccess().getMRealParameterSingleExpressionParserRuleCall_3()); }
	ruleMRealParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutSLSPAccess().getMRealParameterSingleExpressionParserRuleCall_3()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutSLSPAccess().getMStringParameterSingleExpressionParserRuleCall_4()); }
	ruleMStringParameterSingleExpression
{ after(grammarAccess.getMParameterWithoutSLSPAccess().getMStringParameterSingleExpressionParserRuleCall_4()); }
)

    |(
{ before(grammarAccess.getMParameterWithoutSLSPAccess().getMEnumParameterDefinitionParserRuleCall_5()); }
	ruleMEnumParameterDefinition
{ after(grammarAccess.getMParameterWithoutSLSPAccess().getMEnumParameterDefinitionParserRuleCall_5()); }
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



rule__MMCLEVSLIBPackageFile__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVSLIBPackageFile__Group__0__Impl
	rule__MMCLEVSLIBPackageFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVSLIBPackageFile__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVSLIBPackageFile__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVSLIBPackageFile__Group__1__Impl
	rule__MMCLEVSLIBPackageFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVSLIBPackageFile__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageAssignment_1()); }
(rule__MMCLEVSLIBPackageFile__PackageAssignment_1)
{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVSLIBPackageFile__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVSLIBPackageFile__Group__2__Impl
	rule__MMCLEVSLIBPackageFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVSLIBPackageFile__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVSLIBPackageFile__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVSLIBPackageFile__Group__3__Impl
	rule__MMCLEVSLIBPackageFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVSLIBPackageFile__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getGroup_3()); }
(rule__MMCLEVSLIBPackageFile__Group_3__0)*
{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVSLIBPackageFile__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVSLIBPackageFile__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVSLIBPackageFile__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getElementAssignment_4()); }
(rule__MMCLEVSLIBPackageFile__ElementAssignment_4)
{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getElementAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMCLEVSLIBPackageFile__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVSLIBPackageFile__Group_3__0__Impl
	rule__MMCLEVSLIBPackageFile__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVSLIBPackageFile__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportKeyword_3_0()); }

	'import' 

{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVSLIBPackageFile__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVSLIBPackageFile__Group_3__1__Impl
	rule__MMCLEVSLIBPackageFile__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVSLIBPackageFile__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportsAssignment_3_1()); }
(rule__MMCLEVSLIBPackageFile__ImportsAssignment_3_1)
{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMCLEVSLIBPackageFile__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMCLEVSLIBPackageFile__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVSLIBPackageFile__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getSemicolonKeyword_3_2()); }
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






rule__MAbstractServiceLibrary__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group__0__Impl
	rule__MAbstractServiceLibrary__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getAbstractKeyword_0()); }

	'abstract' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getAbstractKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group__1__Impl
	rule__MAbstractServiceLibrary__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getServiceKeyword_1()); }

	'service' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getServiceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group__2__Impl
	rule__MAbstractServiceLibrary__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getLibraryKeyword_2()); }

	'library' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getLibraryKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group__3__Impl
	rule__MAbstractServiceLibrary__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getNameAssignment_3()); }
(rule__MAbstractServiceLibrary__NameAssignment_3)
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group__4__Impl
	rule__MAbstractServiceLibrary__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_4()); }
(rule__MAbstractServiceLibrary__Group_4__0)?
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group__5__Impl
	rule__MAbstractServiceLibrary__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group__6__Impl
	rule__MAbstractServiceLibrary__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6()); }
(rule__MAbstractServiceLibrary__UnorderedGroup_6)
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group__7__Impl
	rule__MAbstractServiceLibrary__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MAbstractServiceLibrary__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_4__0__Impl
	rule__MAbstractServiceLibrary__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsKeyword_4_0()); }

	'inherits' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_4__1__Impl
	rule__MAbstractServiceLibrary__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsAssignment_4_1()); }
(rule__MAbstractServiceLibrary__InheritsAssignment_4_1)
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_4_2()); }
(rule__MAbstractServiceLibrary__Group_4_2__0)*
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MAbstractServiceLibrary__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_4_2__0__Impl
	rule__MAbstractServiceLibrary__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getCommaKeyword_4_2_0()); }

	',' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getCommaKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsAssignment_4_2_1()); }
(rule__MAbstractServiceLibrary__InheritsAssignment_4_2_1)
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsAssignment_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MAbstractServiceLibrary__Group_6_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_0__0__Impl
	rule__MAbstractServiceLibrary__Group_6_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getVersionKeyword_6_0_0()); }

	'version' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getVersionKeyword_6_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_6_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_0__1__Impl
	rule__MAbstractServiceLibrary__Group_6_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getColonEqualsSignKeyword_6_0_1()); }

	':=' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getColonEqualsSignKeyword_6_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_6_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_0__2__Impl
	rule__MAbstractServiceLibrary__Group_6_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getVersionAssignment_6_0_2()); }
(rule__MAbstractServiceLibrary__VersionAssignment_6_0_2)
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getVersionAssignment_6_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_6_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_6_0_3()); }

	';' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_6_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MAbstractServiceLibrary__Group_6_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_1__0__Impl
	rule__MAbstractServiceLibrary__Group_6_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getAttributesKeyword_6_1_0()); }

	'attributes' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getAttributesKeyword_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_6_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_1__1__Impl
	rule__MAbstractServiceLibrary__Group_6_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getLeftCurlyBracketKeyword_6_1_1()); }

	'{' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getLeftCurlyBracketKeyword_6_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_6_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_1__2__Impl
	rule__MAbstractServiceLibrary__Group_6_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getAttributesAssignment_6_1_2()); }
(rule__MAbstractServiceLibrary__AttributesAssignment_6_1_2)
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getAttributesAssignment_6_1_2()); }
)
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getAttributesAssignment_6_1_2()); }
(rule__MAbstractServiceLibrary__AttributesAssignment_6_1_2)*
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getAttributesAssignment_6_1_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_6_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_1__3__Impl
	rule__MAbstractServiceLibrary__Group_6_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getRightCurlyBracketKeyword_6_1_3()); }

	'}' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getRightCurlyBracketKeyword_6_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_6_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_6_1_4()); }

	';' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_6_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MAbstractServiceLibrary__Group_6_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_2__0__Impl
	rule__MAbstractServiceLibrary__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getProvidedKeyword_6_2_0()); }

	'provided' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getProvidedKeyword_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_6_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_2__1__Impl
	rule__MAbstractServiceLibrary__Group_6_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getSaisKeyword_6_2_1()); }

	'sais' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getSaisKeyword_6_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_6_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_2__2__Impl
	rule__MAbstractServiceLibrary__Group_6_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getLeftCurlyBracketKeyword_6_2_2()); }

	'{' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getLeftCurlyBracketKeyword_6_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_6_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_2__3__Impl
	rule__MAbstractServiceLibrary__Group_6_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getProvidesAssignment_6_2_3()); }
(rule__MAbstractServiceLibrary__ProvidesAssignment_6_2_3)
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getProvidesAssignment_6_2_3()); }
)
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getProvidesAssignment_6_2_3()); }
(rule__MAbstractServiceLibrary__ProvidesAssignment_6_2_3)*
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getProvidesAssignment_6_2_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_6_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_2__4__Impl
	rule__MAbstractServiceLibrary__Group_6_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getRightCurlyBracketKeyword_6_2_4()); }

	'}' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getRightCurlyBracketKeyword_6_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__Group_6_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__Group_6_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__Group_6_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_6_2_5()); }

	';' 

{ after(grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_6_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MServiceLibraryProvidedSAI__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibraryProvidedSAI__Group__0__Impl
	rule__MServiceLibraryProvidedSAI__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibraryProvidedSAI__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryProvidedSAIAccess().getProvidesKeyword_0()); }

	'provides' 

{ after(grammarAccess.getMServiceLibraryProvidedSAIAccess().getProvidesKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibraryProvidedSAI__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibraryProvidedSAI__Group__1__Impl
	rule__MServiceLibraryProvidedSAI__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibraryProvidedSAI__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryProvidedSAIAccess().getSaiAssignment_1()); }
(rule__MServiceLibraryProvidedSAI__SaiAssignment_1)
{ after(grammarAccess.getMServiceLibraryProvidedSAIAccess().getSaiAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibraryProvidedSAI__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibraryProvidedSAI__Group__2__Impl
	rule__MServiceLibraryProvidedSAI__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibraryProvidedSAI__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryProvidedSAIAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMServiceLibraryProvidedSAIAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibraryProvidedSAI__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibraryProvidedSAI__Group__3__Impl
	rule__MServiceLibraryProvidedSAI__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibraryProvidedSAI__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryProvidedSAIAccess().getAttributeValueAssignmentsAssignment_3()); }
(rule__MServiceLibraryProvidedSAI__AttributeValueAssignmentsAssignment_3)*
{ after(grammarAccess.getMServiceLibraryProvidedSAIAccess().getAttributeValueAssignmentsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibraryProvidedSAI__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibraryProvidedSAI__Group__4__Impl
	rule__MServiceLibraryProvidedSAI__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibraryProvidedSAI__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryProvidedSAIAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMServiceLibraryProvidedSAIAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibraryProvidedSAI__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibraryProvidedSAI__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibraryProvidedSAI__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryProvidedSAIAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMServiceLibraryProvidedSAIAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MSLibProvidedSAIAVAExpression__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVAExpression__Group__0__Impl
	rule__MSLibProvidedSAIAVAExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVAExpression__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getAttributeKeyword_0()); }

	'attribute' 

{ after(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getAttributeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVAExpression__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVAExpression__Group__1__Impl
	rule__MSLibProvidedSAIAVAExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVAExpression__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getParameterAssignment_1()); }
(rule__MSLibProvidedSAIAVAExpression__ParameterAssignment_1)
{ after(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getParameterAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVAExpression__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVAExpression__Group__2__Impl
	rule__MSLibProvidedSAIAVAExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVAExpression__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getColonEqualsSignKeyword_2()); }

	':=' 

{ after(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getColonEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVAExpression__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVAExpression__Group__3__Impl
	rule__MSLibProvidedSAIAVAExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVAExpression__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getAttributeValueAssignment_3()); }
(rule__MSLibProvidedSAIAVAExpression__AttributeValueAssignment_3)
{ after(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getAttributeValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVAExpression__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVAExpression__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVAExpression__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MSLibProvidedSAIAVASwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitch__Group__0__Impl
	rule__MSLibProvidedSAIAVASwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getAttributeKeyword_0()); }

	'attribute' 

{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getAttributeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVASwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitch__Group__1__Impl
	rule__MSLibProvidedSAIAVASwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getParameterAssignment_1()); }
(rule__MSLibProvidedSAIAVASwitch__ParameterAssignment_1)
{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getParameterAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVASwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitch__Group__2__Impl
	rule__MSLibProvidedSAIAVASwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getColonEqualsSignKeyword_2()); }

	':=' 

{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getColonEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVASwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitch__Group__3__Impl
	rule__MSLibProvidedSAIAVASwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getSwitchKeyword_3()); }

	'switch' 

{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getSwitchKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVASwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitch__Group__4__Impl
	rule__MSLibProvidedSAIAVASwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVASwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitch__Group__5__Impl
	rule__MSLibProvidedSAIAVASwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getCasesAssignment_5()); }
(rule__MSLibProvidedSAIAVASwitch__CasesAssignment_5)
{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getCasesAssignment_5()); }
)
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getCasesAssignment_5()); }
(rule__MSLibProvidedSAIAVASwitch__CasesAssignment_5)*
{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getCasesAssignment_5()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVASwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitch__Group__6__Impl
	rule__MSLibProvidedSAIAVASwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVASwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitch__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MSLibProvidedSAIAVASwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitchCase__Group__0__Impl
	rule__MSLibProvidedSAIAVASwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVASwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitchCase__Group__1__Impl
	rule__MSLibProvidedSAIAVASwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MSLibProvidedSAIAVASwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVASwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitchCase__Group__2__Impl
	rule__MSLibProvidedSAIAVASwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVASwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitchCase__Group__3__Impl
	rule__MSLibProvidedSAIAVASwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getAttributeValueAssignment_3()); }
(rule__MSLibProvidedSAIAVASwitchCase__AttributeValueAssignment_3)
{ after(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getAttributeValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MSLibProvidedSAIAVASwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MSLibProvidedSAIAVASwitchCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MServiceLibrary__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group__0__Impl
	rule__MServiceLibrary__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getServiceKeyword_0()); }

	'service' 

{ after(grammarAccess.getMServiceLibraryAccess().getServiceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group__1__Impl
	rule__MServiceLibrary__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getLibraryKeyword_1()); }

	'library' 

{ after(grammarAccess.getMServiceLibraryAccess().getLibraryKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group__2__Impl
	rule__MServiceLibrary__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getNameAssignment_2()); }
(rule__MServiceLibrary__NameAssignment_2)
{ after(grammarAccess.getMServiceLibraryAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group__3__Impl
	rule__MServiceLibrary__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getGroup_3()); }
(rule__MServiceLibrary__Group_3__0)?
{ after(grammarAccess.getMServiceLibraryAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group__4__Impl
	rule__MServiceLibrary__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getGroup_4()); }
(rule__MServiceLibrary__Group_4__0)?
{ after(grammarAccess.getMServiceLibraryAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group__5__Impl
	rule__MServiceLibrary__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group__6__Impl
	rule__MServiceLibrary__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6()); }
(rule__MServiceLibrary__UnorderedGroup_6)
{ after(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group__7__Impl
	rule__MServiceLibrary__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MServiceLibrary__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_3__0__Impl
	rule__MServiceLibrary__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getInheritsKeyword_3_0()); }

	'inherits' 

{ after(grammarAccess.getMServiceLibraryAccess().getInheritsKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_3__1__Impl
	rule__MServiceLibrary__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getInheritsAssignment_3_1()); }
(rule__MServiceLibrary__InheritsAssignment_3_1)
{ after(grammarAccess.getMServiceLibraryAccess().getInheritsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getGroup_3_2()); }
(rule__MServiceLibrary__Group_3_2__0)*
{ after(grammarAccess.getMServiceLibraryAccess().getGroup_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MServiceLibrary__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_3_2__0__Impl
	rule__MServiceLibrary__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getCommaKeyword_3_2_0()); }

	',' 

{ after(grammarAccess.getMServiceLibraryAccess().getCommaKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getInheritsAssignment_3_2_1()); }
(rule__MServiceLibrary__InheritsAssignment_3_2_1)
{ after(grammarAccess.getMServiceLibraryAccess().getInheritsAssignment_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MServiceLibrary__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_4__0__Impl
	rule__MServiceLibrary__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getExtendsKeyword_4_0()); }

	'extends' 

{ after(grammarAccess.getMServiceLibraryAccess().getExtendsKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_4__1__Impl
	rule__MServiceLibrary__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getExtendsAssignment_4_1()); }
(rule__MServiceLibrary__ExtendsAssignment_4_1)
{ after(grammarAccess.getMServiceLibraryAccess().getExtendsAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getGroup_4_2()); }
(rule__MServiceLibrary__Group_4_2__0)*
{ after(grammarAccess.getMServiceLibraryAccess().getGroup_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MServiceLibrary__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_4_2__0__Impl
	rule__MServiceLibrary__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getCommaKeyword_4_2_0()); }

	',' 

{ after(grammarAccess.getMServiceLibraryAccess().getCommaKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getExtendsAssignment_4_2_1()); }
(rule__MServiceLibrary__ExtendsAssignment_4_2_1)
{ after(grammarAccess.getMServiceLibraryAccess().getExtendsAssignment_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MServiceLibrary__Group_6_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_0__0__Impl
	rule__MServiceLibrary__Group_6_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getVersionKeyword_6_0_0()); }

	'version' 

{ after(grammarAccess.getMServiceLibraryAccess().getVersionKeyword_6_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_0__1__Impl
	rule__MServiceLibrary__Group_6_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getColonEqualsSignKeyword_6_0_1()); }

	':=' 

{ after(grammarAccess.getMServiceLibraryAccess().getColonEqualsSignKeyword_6_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_0__2__Impl
	rule__MServiceLibrary__Group_6_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getVersionAssignment_6_0_2()); }
(rule__MServiceLibrary__VersionAssignment_6_0_2)
{ after(grammarAccess.getMServiceLibraryAccess().getVersionAssignment_6_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_0_3()); }

	';' 

{ after(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MServiceLibrary__Group_6_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_1__0__Impl
	rule__MServiceLibrary__Group_6_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getLanguagesKeyword_6_1_0()); }

	'languages' 

{ after(grammarAccess.getMServiceLibraryAccess().getLanguagesKeyword_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_1__1__Impl
	rule__MServiceLibrary__Group_6_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getColonEqualsSignKeyword_6_1_1()); }

	':=' 

{ after(grammarAccess.getMServiceLibraryAccess().getColonEqualsSignKeyword_6_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_1__2__Impl
	rule__MServiceLibrary__Group_6_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getLanguagesAssignment_6_1_2()); }
(rule__MServiceLibrary__LanguagesAssignment_6_1_2)
{ after(grammarAccess.getMServiceLibraryAccess().getLanguagesAssignment_6_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_1__3__Impl
	rule__MServiceLibrary__Group_6_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getGroup_6_1_3()); }
(rule__MServiceLibrary__Group_6_1_3__0)*
{ after(grammarAccess.getMServiceLibraryAccess().getGroup_6_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_1_4()); }

	';' 

{ after(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MServiceLibrary__Group_6_1_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_1_3__0__Impl
	rule__MServiceLibrary__Group_6_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_1_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getCommaKeyword_6_1_3_0()); }

	',' 

{ after(grammarAccess.getMServiceLibraryAccess().getCommaKeyword_6_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_1_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_1_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getLanguagesAssignment_6_1_3_1()); }
(rule__MServiceLibrary__LanguagesAssignment_6_1_3_1)
{ after(grammarAccess.getMServiceLibraryAccess().getLanguagesAssignment_6_1_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MServiceLibrary__Group_6_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_2__0__Impl
	rule__MServiceLibrary__Group_6_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getAttributesKeyword_6_2_0()); }

	'attributes' 

{ after(grammarAccess.getMServiceLibraryAccess().getAttributesKeyword_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_2__1__Impl
	rule__MServiceLibrary__Group_6_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_6_2_1()); }

	'{' 

{ after(grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_6_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_2__2__Impl
	rule__MServiceLibrary__Group_6_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMServiceLibraryAccess().getAttributesAssignment_6_2_2()); }
(rule__MServiceLibrary__AttributesAssignment_6_2_2)
{ after(grammarAccess.getMServiceLibraryAccess().getAttributesAssignment_6_2_2()); }
)
(
{ before(grammarAccess.getMServiceLibraryAccess().getAttributesAssignment_6_2_2()); }
(rule__MServiceLibrary__AttributesAssignment_6_2_2)*
{ after(grammarAccess.getMServiceLibraryAccess().getAttributesAssignment_6_2_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_2__3__Impl
	rule__MServiceLibrary__Group_6_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_6_2_3()); }

	'}' 

{ after(grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_6_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_2_4()); }

	';' 

{ after(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MServiceLibrary__Group_6_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_3__0__Impl
	rule__MServiceLibrary__Group_6_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getProvidedKeyword_6_3_0()); }

	'provided' 

{ after(grammarAccess.getMServiceLibraryAccess().getProvidedKeyword_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_3__1__Impl
	rule__MServiceLibrary__Group_6_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getSaisKeyword_6_3_1()); }

	'sais' 

{ after(grammarAccess.getMServiceLibraryAccess().getSaisKeyword_6_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_3__2__Impl
	rule__MServiceLibrary__Group_6_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_6_3_2()); }

	'{' 

{ after(grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_6_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_3__3__Impl
	rule__MServiceLibrary__Group_6_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMServiceLibraryAccess().getProvidesAssignment_6_3_3()); }
(rule__MServiceLibrary__ProvidesAssignment_6_3_3)
{ after(grammarAccess.getMServiceLibraryAccess().getProvidesAssignment_6_3_3()); }
)
(
{ before(grammarAccess.getMServiceLibraryAccess().getProvidesAssignment_6_3_3()); }
(rule__MServiceLibrary__ProvidesAssignment_6_3_3)*
{ after(grammarAccess.getMServiceLibraryAccess().getProvidesAssignment_6_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_3__4__Impl
	rule__MServiceLibrary__Group_6_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_6_3_4()); }

	'}' 

{ after(grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_6_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_3_5()); }

	';' 

{ after(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MServiceLibrary__Group_6_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_4__0__Impl
	rule__MServiceLibrary__Group_6_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getRequiresKeyword_6_4_0()); }

	'requires' 

{ after(grammarAccess.getMServiceLibraryAccess().getRequiresKeyword_6_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_4__1__Impl
	rule__MServiceLibrary__Group_6_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getColonEqualsSignKeyword_6_4_1()); }

	':=' 

{ after(grammarAccess.getMServiceLibraryAccess().getColonEqualsSignKeyword_6_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_4__2__Impl
	rule__MServiceLibrary__Group_6_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getRequiresAssignment_6_4_2()); }
(rule__MServiceLibrary__RequiresAssignment_6_4_2)
{ after(grammarAccess.getMServiceLibraryAccess().getRequiresAssignment_6_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_4__3__Impl
	rule__MServiceLibrary__Group_6_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getGroup_6_4_3()); }
(rule__MServiceLibrary__Group_6_4_3__0)*
{ after(grammarAccess.getMServiceLibraryAccess().getGroup_6_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_4_4()); }

	';' 

{ after(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MServiceLibrary__Group_6_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_4_3__0__Impl
	rule__MServiceLibrary__Group_6_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getCommaKeyword_6_4_3_0()); }

	',' 

{ after(grammarAccess.getMServiceLibraryAccess().getCommaKeyword_6_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getRequiresAssignment_6_4_3_1()); }
(rule__MServiceLibrary__RequiresAssignment_6_4_3_1)
{ after(grammarAccess.getMServiceLibraryAccess().getRequiresAssignment_6_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MServiceLibrary__Group_6_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_5__0__Impl
	rule__MServiceLibrary__Group_6_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getSupportedKeyword_6_5_0()); }

	'supported' 

{ after(grammarAccess.getMServiceLibraryAccess().getSupportedKeyword_6_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_5__1__Impl
	rule__MServiceLibrary__Group_6_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getPlatformsKeyword_6_5_1()); }

	'platforms' 

{ after(grammarAccess.getMServiceLibraryAccess().getPlatformsKeyword_6_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_5__2__Impl
	rule__MServiceLibrary__Group_6_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_6_5_2()); }

	'{' 

{ after(grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_6_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_5__3__Impl
	rule__MServiceLibrary__Group_6_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMServiceLibraryAccess().getSupportedPlatformsAssignment_6_5_3()); }
(rule__MServiceLibrary__SupportedPlatformsAssignment_6_5_3)
{ after(grammarAccess.getMServiceLibraryAccess().getSupportedPlatformsAssignment_6_5_3()); }
)
(
{ before(grammarAccess.getMServiceLibraryAccess().getSupportedPlatformsAssignment_6_5_3()); }
(rule__MServiceLibrary__SupportedPlatformsAssignment_6_5_3)*
{ after(grammarAccess.getMServiceLibraryAccess().getSupportedPlatformsAssignment_6_5_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_5__4__Impl
	rule__MServiceLibrary__Group_6_5__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_5__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_6_5_4()); }

	'}' 

{ after(grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_6_5_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__Group_6_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__Group_6_5__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__Group_6_5__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_5_5()); }

	';' 

{ after(grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_5_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverServiceLibrary__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group__0__Impl
	rule__MDriverServiceLibrary__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getDriverKeyword_0()); }

	'driver' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getDriverKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group__1__Impl
	rule__MDriverServiceLibrary__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getServiceKeyword_1()); }

	'service' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getServiceKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group__2__Impl
	rule__MDriverServiceLibrary__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getLibraryKeyword_2()); }

	'library' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getLibraryKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group__3__Impl
	rule__MDriverServiceLibrary__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getNameAssignment_3()); }
(rule__MDriverServiceLibrary__NameAssignment_3)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group__4__Impl
	rule__MDriverServiceLibrary__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup_4()); }
(rule__MDriverServiceLibrary__Group_4__0)?
{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group__5__Impl
	rule__MDriverServiceLibrary__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup_5()); }
(rule__MDriverServiceLibrary__Group_5__0)?
{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group__6__Impl
	rule__MDriverServiceLibrary__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_6()); }

	'{' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group__7__Impl
	rule__MDriverServiceLibrary__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7()); }
(rule__MDriverServiceLibrary__UnorderedGroup_7)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group__8__Impl
	rule__MDriverServiceLibrary__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_9()); }

	';' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__MDriverServiceLibrary__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_4__0__Impl
	rule__MDriverServiceLibrary__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getInheritsKeyword_4_0()); }

	'inherits' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getInheritsKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_4__1__Impl
	rule__MDriverServiceLibrary__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getInheritsAssignment_4_1()); }
(rule__MDriverServiceLibrary__InheritsAssignment_4_1)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getInheritsAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup_4_2()); }
(rule__MDriverServiceLibrary__Group_4_2__0)*
{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MDriverServiceLibrary__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_4_2__0__Impl
	rule__MDriverServiceLibrary__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_4_2_0()); }

	',' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getInheritsAssignment_4_2_1()); }
(rule__MDriverServiceLibrary__InheritsAssignment_4_2_1)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getInheritsAssignment_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDriverServiceLibrary__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_5__0__Impl
	rule__MDriverServiceLibrary__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getExtendsKeyword_5_0()); }

	'extends' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getExtendsKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_5__1__Impl
	rule__MDriverServiceLibrary__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getExtendsAssignment_5_1()); }
(rule__MDriverServiceLibrary__ExtendsAssignment_5_1)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getExtendsAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup_5_2()); }
(rule__MDriverServiceLibrary__Group_5_2__0)*
{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MDriverServiceLibrary__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_5_2__0__Impl
	rule__MDriverServiceLibrary__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_5_2_0()); }

	',' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_5_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getExtendsAssignment_5_2_1()); }
(rule__MDriverServiceLibrary__ExtendsAssignment_5_2_1)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getExtendsAssignment_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDriverServiceLibrary__Group_7_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_0__0__Impl
	rule__MDriverServiceLibrary__Group_7_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getVersionKeyword_7_0_0()); }

	'version' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getVersionKeyword_7_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_0__1__Impl
	rule__MDriverServiceLibrary__Group_7_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getColonEqualsSignKeyword_7_0_1()); }

	':=' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getColonEqualsSignKeyword_7_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_0__2__Impl
	rule__MDriverServiceLibrary__Group_7_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getVersionAssignment_7_0_2()); }
(rule__MDriverServiceLibrary__VersionAssignment_7_0_2)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getVersionAssignment_7_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_0_3()); }

	';' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverServiceLibrary__Group_7_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_1__0__Impl
	rule__MDriverServiceLibrary__Group_7_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesKeyword_7_1_0()); }

	'languages' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesKeyword_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_1__1__Impl
	rule__MDriverServiceLibrary__Group_7_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getColonEqualsSignKeyword_7_1_1()); }

	':=' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getColonEqualsSignKeyword_7_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_1__2__Impl
	rule__MDriverServiceLibrary__Group_7_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesAssignment_7_1_2()); }
(rule__MDriverServiceLibrary__LanguagesAssignment_7_1_2)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesAssignment_7_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_1__3__Impl
	rule__MDriverServiceLibrary__Group_7_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_1_3()); }
(rule__MDriverServiceLibrary__Group_7_1_3__0)*
{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_1_4()); }

	';' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MDriverServiceLibrary__Group_7_1_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_1_3__0__Impl
	rule__MDriverServiceLibrary__Group_7_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_1_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_7_1_3_0()); }

	',' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_7_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_1_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_1_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesAssignment_7_1_3_1()); }
(rule__MDriverServiceLibrary__LanguagesAssignment_7_1_3_1)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesAssignment_7_1_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDriverServiceLibrary__Group_7_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_2__0__Impl
	rule__MDriverServiceLibrary__Group_7_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getAttributesKeyword_7_2_0()); }

	'attributes' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getAttributesKeyword_7_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_2__1__Impl
	rule__MDriverServiceLibrary__Group_7_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_7_2_1()); }

	'{' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_7_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_2__2__Impl
	rule__MDriverServiceLibrary__Group_7_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getAttributesAssignment_7_2_2()); }
(rule__MDriverServiceLibrary__AttributesAssignment_7_2_2)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getAttributesAssignment_7_2_2()); }
)
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getAttributesAssignment_7_2_2()); }
(rule__MDriverServiceLibrary__AttributesAssignment_7_2_2)*
{ after(grammarAccess.getMDriverServiceLibraryAccess().getAttributesAssignment_7_2_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_2__3__Impl
	rule__MDriverServiceLibrary__Group_7_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_7_2_3()); }

	'}' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_7_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_2_4()); }

	';' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MDriverServiceLibrary__Group_7_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_3__0__Impl
	rule__MDriverServiceLibrary__Group_7_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getProvidedKeyword_7_3_0()); }

	'provided' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getProvidedKeyword_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_3__1__Impl
	rule__MDriverServiceLibrary__Group_7_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getSaisKeyword_7_3_1()); }

	'sais' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getSaisKeyword_7_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_3__2__Impl
	rule__MDriverServiceLibrary__Group_7_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_7_3_2()); }

	'{' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_7_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_3__3__Impl
	rule__MDriverServiceLibrary__Group_7_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getProvidesAssignment_7_3_3()); }
(rule__MDriverServiceLibrary__ProvidesAssignment_7_3_3)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getProvidesAssignment_7_3_3()); }
)
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getProvidesAssignment_7_3_3()); }
(rule__MDriverServiceLibrary__ProvidesAssignment_7_3_3)*
{ after(grammarAccess.getMDriverServiceLibraryAccess().getProvidesAssignment_7_3_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_3__4__Impl
	rule__MDriverServiceLibrary__Group_7_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_7_3_4()); }

	'}' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_7_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_3_5()); }

	';' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverServiceLibrary__Group_7_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_4__0__Impl
	rule__MDriverServiceLibrary__Group_7_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getRequiresKeyword_7_4_0()); }

	'requires' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getRequiresKeyword_7_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_4__1__Impl
	rule__MDriverServiceLibrary__Group_7_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getColonEqualsSignKeyword_7_4_1()); }

	':=' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getColonEqualsSignKeyword_7_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_4__2__Impl
	rule__MDriverServiceLibrary__Group_7_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getRequiresAssignment_7_4_2()); }
(rule__MDriverServiceLibrary__RequiresAssignment_7_4_2)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getRequiresAssignment_7_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_4__3__Impl
	rule__MDriverServiceLibrary__Group_7_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_4_3()); }
(rule__MDriverServiceLibrary__Group_7_4_3__0)*
{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_4__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_4__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_4_4()); }

	';' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_4_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MDriverServiceLibrary__Group_7_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_4_3__0__Impl
	rule__MDriverServiceLibrary__Group_7_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_7_4_3_0()); }

	',' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_7_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_4_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getRequiresAssignment_7_4_3_1()); }
(rule__MDriverServiceLibrary__RequiresAssignment_7_4_3_1)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getRequiresAssignment_7_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDriverServiceLibrary__Group_7_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_5__0__Impl
	rule__MDriverServiceLibrary__Group_7_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getSupportedKeyword_7_5_0()); }

	'supported' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getSupportedKeyword_7_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_5__1__Impl
	rule__MDriverServiceLibrary__Group_7_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getPlatformsKeyword_7_5_1()); }

	'platforms' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getPlatformsKeyword_7_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_5__2__Impl
	rule__MDriverServiceLibrary__Group_7_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_7_5_2()); }

	'{' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_7_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_5__3__Impl
	rule__MDriverServiceLibrary__Group_7_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getSupportedPlatformsAssignment_7_5_3()); }
(rule__MDriverServiceLibrary__SupportedPlatformsAssignment_7_5_3)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getSupportedPlatformsAssignment_7_5_3()); }
)
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getSupportedPlatformsAssignment_7_5_3()); }
(rule__MDriverServiceLibrary__SupportedPlatformsAssignment_7_5_3)*
{ after(grammarAccess.getMDriverServiceLibraryAccess().getSupportedPlatformsAssignment_7_5_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_5__4__Impl
	rule__MDriverServiceLibrary__Group_7_5__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_5__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_7_5_4()); }

	'}' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_7_5_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__Group_7_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__Group_7_5__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__Group_7_5__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_5_5()); }

	';' 

{ after(grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_5_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MServiceLibrarySupportedPlatform__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group__0__Impl
	rule__MServiceLibrarySupportedPlatform__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMServiceLibrarySupportedPlatformAction_0()); }
(

)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMServiceLibrarySupportedPlatformAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group__1__Impl
	rule__MServiceLibrarySupportedPlatform__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSupportedKeyword_1()); }

	'supported' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSupportedKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group__2__Impl
	rule__MServiceLibrarySupportedPlatform__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getPlatformKeyword_2()); }

	'platform' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getPlatformKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group__3__Impl
	rule__MServiceLibrarySupportedPlatform__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getNameAssignment_3()); }
(rule__MServiceLibrarySupportedPlatform__NameAssignment_3)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group__4__Impl
	rule__MServiceLibrarySupportedPlatform__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group__5__Impl
	rule__MServiceLibrarySupportedPlatform__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5()); }
(rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group__6__Impl
	rule__MServiceLibrarySupportedPlatform__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MServiceLibrarySupportedPlatform__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_0__0__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiKeyword_5_0_0()); }

	'osapi' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_0__1__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_0__2__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_0_2()); }
(rule__MServiceLibrarySupportedPlatform__Alternatives_5_0_2)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MServiceLibrarySupportedPlatform__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_1__0__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsKeyword_5_1_0()); }

	'os' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_1__1__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1()); }

	':=' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_1__2__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_1_2()); }
(rule__MServiceLibrarySupportedPlatform__Alternatives_5_1_2)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_1_3()); }

	';' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MServiceLibrarySupportedPlatform__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_2__0__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureKeyword_5_2_0()); }

	'architecture' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_2__1__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1()); }

	':=' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_2__2__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_2_2()); }
(rule__MServiceLibrarySupportedPlatform__Alternatives_5_2_2)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_2_3()); }

	';' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MServiceLibrarySupportedPlatform__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_3__0__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerKeyword_5_3_0()); }

	'compiler' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_3__1__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1()); }

	':=' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_3__2__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerAssignment_5_3_2()); }
(rule__MServiceLibrarySupportedPlatform__CompilerAssignment_5_3_2)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerAssignment_5_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_3_3()); }

	';' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MServiceLibrarySupportedPlatform__Group_5_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_4__0__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorKeyword_5_4_0()); }

	'microprocessor' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorKeyword_5_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_4__1__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1()); }

	':=' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_4__2__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_4_2()); }
(rule__MServiceLibrarySupportedPlatform__Alternatives_5_4_2)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_4_3()); }

	';' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MServiceLibrarySupportedPlatform__Group_5_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_5__0__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardKeyword_5_5_0()); }

	'board' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardKeyword_5_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_5__1__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1()); }

	':=' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_5__2__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_5_2()); }
(rule__MServiceLibrarySupportedPlatform__Alternatives_5_5_2)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_5_3()); }

	';' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MServiceLibrarySupportedPlatform__Group_5_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_6__0__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesKeyword_5_6_0()); }

	'attributes' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesKeyword_5_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_6__1__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLeftCurlyBracketKeyword_5_6_1()); }

	'{' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLeftCurlyBracketKeyword_5_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_6__2__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesAssignment_5_6_2()); }
(rule__MServiceLibrarySupportedPlatform__AttributesAssignment_5_6_2)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesAssignment_5_6_2()); }
)
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesAssignment_5_6_2()); }
(rule__MServiceLibrarySupportedPlatform__AttributesAssignment_5_6_2)*
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesAssignment_5_6_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_6__3__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRightCurlyBracketKeyword_5_6_3()); }

	'}' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRightCurlyBracketKeyword_5_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_6_4()); }

	';' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MServiceLibrarySupportedPlatform__Group_5_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_7__0__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesKeyword_5_7_0()); }

	'languages' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesKeyword_5_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_7__1__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_7_1()); }

	':=' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_7__2__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesAssignment_5_7_2()); }
(rule__MServiceLibrarySupportedPlatform__LanguagesAssignment_5_7_2)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesAssignment_5_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_7__3__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_7__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_7_3()); }
(rule__MServiceLibrarySupportedPlatform__Group_5_7_3__0)*
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_7_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_7__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_7__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_7_4()); }

	';' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_7_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MServiceLibrarySupportedPlatform__Group_5_7_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_7_3__0__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_7_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_7_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCommaKeyword_5_7_3_0()); }

	',' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCommaKeyword_5_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_7_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_7_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_7_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesAssignment_5_7_3_1()); }
(rule__MServiceLibrarySupportedPlatform__LanguagesAssignment_5_7_3_1)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesAssignment_5_7_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MServiceLibrarySupportedPlatform__Group_5_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_8__0__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresKeyword_5_8_0()); }

	'requires' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresKeyword_5_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_8__1__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_8_1()); }

	':=' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_8__2__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresAssignment_5_8_2()); }
(rule__MServiceLibrarySupportedPlatform__RequiresAssignment_5_8_2)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresAssignment_5_8_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_8__3__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_8__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_8_3()); }
(rule__MServiceLibrarySupportedPlatform__Group_5_8_3__0)*
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_8_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_8__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_8__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_8__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_8_4()); }

	';' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_8_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MServiceLibrarySupportedPlatform__Group_5_8_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_8_3__0__Impl
	rule__MServiceLibrarySupportedPlatform__Group_5_8_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_8_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCommaKeyword_5_8_3_0()); }

	',' 

{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCommaKeyword_5_8_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__Group_5_8_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__Group_5_8_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__Group_5_8_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresAssignment_5_8_3_1()); }
(rule__MServiceLibrarySupportedPlatform__RequiresAssignment_5_8_3_1)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresAssignment_5_8_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDriverSLibSupportedPlatform__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group__0__Impl
	rule__MDriverSLibSupportedPlatform__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMDriverSLibSupportedPlatformAction_0()); }
(

)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMDriverSLibSupportedPlatformAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group__1__Impl
	rule__MDriverSLibSupportedPlatform__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedKeyword_1()); }

	'supported' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group__2__Impl
	rule__MDriverSLibSupportedPlatform__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getPlatformKeyword_2()); }

	'platform' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getPlatformKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group__3__Impl
	rule__MDriverSLibSupportedPlatform__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getNameAssignment_3()); }
(rule__MDriverSLibSupportedPlatform__NameAssignment_3)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group__4__Impl
	rule__MDriverSLibSupportedPlatform__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group__5__Impl
	rule__MDriverSLibSupportedPlatform__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5()); }
(rule__MDriverSLibSupportedPlatform__UnorderedGroup_5)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group__6__Impl
	rule__MDriverSLibSupportedPlatform__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MDriverSLibSupportedPlatform__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_0__0__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiKeyword_5_0_0()); }

	'osapi' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_0__1__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_0__2__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_0_2()); }
(rule__MDriverSLibSupportedPlatform__Alternatives_5_0_2)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSLibSupportedPlatform__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_1__0__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsKeyword_5_1_0()); }

	'os' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_1__1__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1()); }

	':=' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_1__2__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_1_2()); }
(rule__MDriverSLibSupportedPlatform__Alternatives_5_1_2)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_1_3()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSLibSupportedPlatform__Group_5_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_2__0__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureKeyword_5_2_0()); }

	'architecture' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureKeyword_5_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_2__1__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1()); }

	':=' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_2__2__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_2_2()); }
(rule__MDriverSLibSupportedPlatform__Alternatives_5_2_2)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_2_3()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSLibSupportedPlatform__Group_5_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_3__0__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerKeyword_5_3_0()); }

	'compiler' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerKeyword_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_3__1__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1()); }

	':=' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_3__2__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerAssignment_5_3_2()); }
(rule__MDriverSLibSupportedPlatform__CompilerAssignment_5_3_2)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerAssignment_5_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_3_3()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSLibSupportedPlatform__Group_5_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_4__0__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0()); }

	'microprocessor' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_4__1__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1()); }

	':=' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_4__2__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_4_2()); }
(rule__MDriverSLibSupportedPlatform__Alternatives_5_4_2)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_4_3()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSLibSupportedPlatform__Group_5_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_5__0__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardKeyword_5_5_0()); }

	'board' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardKeyword_5_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_5__1__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1()); }

	':=' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_5__2__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_5__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_5_2()); }
(rule__MDriverSLibSupportedPlatform__Alternatives_5_5_2)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_5_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_5__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_5_3()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_5_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MDriverSLibSupportedPlatform__Group_5_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_6__0__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesKeyword_5_6_0()); }

	'attributes' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesKeyword_5_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_6__1__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_6_1()); }

	'{' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_6__2__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesAssignment_5_6_2()); }
(rule__MDriverSLibSupportedPlatform__AttributesAssignment_5_6_2)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesAssignment_5_6_2()); }
)
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesAssignment_5_6_2()); }
(rule__MDriverSLibSupportedPlatform__AttributesAssignment_5_6_2)*
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesAssignment_5_6_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_6__3__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRightCurlyBracketKeyword_5_6_3()); }

	'}' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRightCurlyBracketKeyword_5_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_6__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_6__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_6_4()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_6_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MDriverSLibSupportedPlatform__Group_5_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_7__0__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedKeyword_5_7_0()); }

	'supported' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedKeyword_5_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_7__1__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getDevicesKeyword_5_7_1()); }

	'devices' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getDevicesKeyword_5_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_7__2__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_7__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2()); }

	'{' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_7__3__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_7__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_7__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedDevicesAssignment_5_7_3()); }
(rule__MDriverSLibSupportedPlatform__SupportedDevicesAssignment_5_7_3)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedDevicesAssignment_5_7_3()); }
)
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedDevicesAssignment_5_7_3()); }
(rule__MDriverSLibSupportedPlatform__SupportedDevicesAssignment_5_7_3)*
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedDevicesAssignment_5_7_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_7__4__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_7__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_7__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4()); }

	'}' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_7__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_7__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_7__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_7_5()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_7_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverSLibSupportedPlatform__Group_5_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_8__0__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesKeyword_5_8_0()); }

	'languages' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesKeyword_5_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_8__1__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_8_1()); }

	':=' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_8__2__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_8__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesAssignment_5_8_2()); }
(rule__MDriverSLibSupportedPlatform__LanguagesAssignment_5_8_2)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesAssignment_5_8_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_8__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_8__3__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_8__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_8__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_8_3()); }
(rule__MDriverSLibSupportedPlatform__Group_5_8_3__0)*
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_8_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_8__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_8__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_8__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_8_4()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_8_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MDriverSLibSupportedPlatform__Group_5_8_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_8_3__0__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_8_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_8_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCommaKeyword_5_8_3_0()); }

	',' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCommaKeyword_5_8_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_8_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_8_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_8_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesAssignment_5_8_3_1()); }
(rule__MDriverSLibSupportedPlatform__LanguagesAssignment_5_8_3_1)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesAssignment_5_8_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDriverSLibSupportedPlatform__Group_5_9__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_9__0__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_9__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresKeyword_5_9_0()); }

	'requires' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresKeyword_5_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_9__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_9__1__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_9__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_9_1()); }

	':=' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_9_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_9__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_9__2__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_9__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresAssignment_5_9_2()); }
(rule__MDriverSLibSupportedPlatform__RequiresAssignment_5_9_2)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresAssignment_5_9_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_9__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_9__3__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_9__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_9_3()); }
(rule__MDriverSLibSupportedPlatform__Group_5_9_3__0)*
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_9_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_9__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_9__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_9__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_9_4()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_9_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MDriverSLibSupportedPlatform__Group_5_9_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_9_3__0__Impl
	rule__MDriverSLibSupportedPlatform__Group_5_9_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_9_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCommaKeyword_5_9_3_0()); }

	',' 

{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCommaKeyword_5_9_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__Group_5_9_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__Group_5_9_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__Group_5_9_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresAssignment_5_9_3_1()); }
(rule__MDriverSLibSupportedPlatform__RequiresAssignment_5_9_3_1)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresAssignment_5_9_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MDriverSLibSupportedDevice__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedDevice__Group__0__Impl
	rule__MDriverSLibSupportedDevice__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceKeyword_0()); }

	'device' 

{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedDevice__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedDevice__Group__1__Impl
	rule__MDriverSLibSupportedDevice__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceAssignment_1()); }
(rule__MDriverSLibSupportedDevice__DeviceAssignment_1)
{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedDevice__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedDevice__Group__2__Impl
	rule__MDriverSLibSupportedDevice__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getNameAssignment_2()); }
(rule__MDriverSLibSupportedDevice__NameAssignment_2)
{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedDevice__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedDevice__Group__3__Impl
	rule__MDriverSLibSupportedDevice__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedDevice__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedDevice__Group__4__Impl
	rule__MDriverSLibSupportedDevice__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getGroup_4()); }
(rule__MDriverSLibSupportedDevice__Group_4__0)?
{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedDevice__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedDevice__Group__5__Impl
	rule__MDriverSLibSupportedDevice__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedDevice__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedDevice__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MDriverSLibSupportedDevice__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedDevice__Group_4__0__Impl
	rule__MDriverSLibSupportedDevice__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getRequiredKeyword_4_0()); }

	'required' 

{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getRequiredKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedDevice__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedDevice__Group_4__1__Impl
	rule__MDriverSLibSupportedDevice__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getColonEqualsSignKeyword_4_1()); }

	':=' 

{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getColonEqualsSignKeyword_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedDevice__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedDevice__Group_4__2__Impl
	rule__MDriverSLibSupportedDevice__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getRequiredAssignment_4_2()); }
(rule__MDriverSLibSupportedDevice__RequiredAssignment_4_2)
{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getRequiredAssignment_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedDevice__Group_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedDevice__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__Group_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getSemicolonKeyword_4_3()); }

	';' 

{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getSemicolonKeyword_4_3()); }
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








rule__MBooleanParamSLSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitch__Group__0__Impl
	rule__MBooleanParamSLSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getConstantAssignment_0()); }
(rule__MBooleanParamSLSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSLSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitch__Group__1__Impl
	rule__MBooleanParamSLSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getBooleanKeyword_1()); }

	'boolean' 

{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getBooleanKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSLSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitch__Group__2__Impl
	rule__MBooleanParamSLSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getNameAssignment_2()); }
(rule__MBooleanParamSLSPSwitch__NameAssignment_2)
{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSLSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitch__Group__3__Impl
	rule__MBooleanParamSLSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSLSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitch__Group__4__Impl
	rule__MBooleanParamSLSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getSwitchKeyword_4()); }

	'switch' 

{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getSwitchKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSLSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitch__Group__5__Impl
	rule__MBooleanParamSLSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSLSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitch__Group__6__Impl
	rule__MBooleanParamSLSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getCasesAssignment_6()); }
(rule__MBooleanParamSLSPSwitch__CasesAssignment_6)
{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getCasesAssignment_6()); }
)
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getCasesAssignment_6()); }
(rule__MBooleanParamSLSPSwitch__CasesAssignment_6)*
{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getCasesAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSLSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitch__Group__7__Impl
	rule__MBooleanParamSLSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSLSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitch__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MBooleanParamSLSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitchCase__Group__0__Impl
	rule__MBooleanParamSLSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSLSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitchCase__Group__1__Impl
	rule__MBooleanParamSLSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MBooleanParamSLSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSLSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitchCase__Group__2__Impl
	rule__MBooleanParamSLSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSLSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitchCase__Group__3__Impl
	rule__MBooleanParamSLSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MBooleanParamSLSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MBooleanParamSLSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MBooleanParamSLSPSwitchCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MStringParamSLSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitch__Group__0__Impl
	rule__MStringParamSLSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getConstantAssignment_0()); }
(rule__MStringParamSLSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSLSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitch__Group__1__Impl
	rule__MStringParamSLSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getStringKeyword_1()); }

	'string' 

{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getStringKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSLSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitch__Group__2__Impl
	rule__MStringParamSLSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getNameAssignment_2()); }
(rule__MStringParamSLSPSwitch__NameAssignment_2)
{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSLSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitch__Group__3__Impl
	rule__MStringParamSLSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSLSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitch__Group__4__Impl
	rule__MStringParamSLSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getSwitchKeyword_4()); }

	'switch' 

{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getSwitchKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSLSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitch__Group__5__Impl
	rule__MStringParamSLSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSLSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitch__Group__6__Impl
	rule__MStringParamSLSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getCasesAssignment_6()); }
(rule__MStringParamSLSPSwitch__CasesAssignment_6)
{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getCasesAssignment_6()); }
)
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getCasesAssignment_6()); }
(rule__MStringParamSLSPSwitch__CasesAssignment_6)*
{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getCasesAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSLSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitch__Group__7__Impl
	rule__MStringParamSLSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSLSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitch__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MStringParamSLSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitchCase__Group__0__Impl
	rule__MStringParamSLSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSLSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitchCase__Group__1__Impl
	rule__MStringParamSLSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MStringParamSLSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSLSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitchCase__Group__2__Impl
	rule__MStringParamSLSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSLSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitchCase__Group__3__Impl
	rule__MStringParamSLSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MStringParamSLSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MStringParamSLSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MStringParamSLSPSwitchCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MIntegerParamSLSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitch__Group__0__Impl
	rule__MIntegerParamSLSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getConstantAssignment_0()); }
(rule__MIntegerParamSLSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitch__Group__1__Impl
	rule__MIntegerParamSLSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getIntegerKeyword_1()); }

	'integer' 

{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getIntegerKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitch__Group__2__Impl
	rule__MIntegerParamSLSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getNameAssignment_2()); }
(rule__MIntegerParamSLSPSwitch__NameAssignment_2)
{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitch__Group__3__Impl
	rule__MIntegerParamSLSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitch__Group__4__Impl
	rule__MIntegerParamSLSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getSwitchKeyword_4()); }

	'switch' 

{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getSwitchKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitch__Group__5__Impl
	rule__MIntegerParamSLSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitch__Group__6__Impl
	rule__MIntegerParamSLSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getCasesAssignment_6()); }
(rule__MIntegerParamSLSPSwitch__CasesAssignment_6)
{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getCasesAssignment_6()); }
)
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getCasesAssignment_6()); }
(rule__MIntegerParamSLSPSwitch__CasesAssignment_6)*
{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getCasesAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitch__Group__7__Impl
	rule__MIntegerParamSLSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitch__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MIntegerParamSLSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitchCase__Group__0__Impl
	rule__MIntegerParamSLSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitchCase__Group__1__Impl
	rule__MIntegerParamSLSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MIntegerParamSLSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitchCase__Group__2__Impl
	rule__MIntegerParamSLSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitchCase__Group__3__Impl
	rule__MIntegerParamSLSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MIntegerParamSLSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitchCase__Group__4__Impl
	rule__MIntegerParamSLSPSwitchCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getGroup_4()); }
(rule__MIntegerParamSLSPSwitchCase__Group_4__0)?
{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitchCase__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitchCase__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitchCase__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MIntegerParamSLSPSwitchCase__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitchCase__Group_4__0__Impl
	rule__MIntegerParamSLSPSwitchCase__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitchCase__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getRangeKeyword_4_0()); }

	'range' 

{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getRangeKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MIntegerParamSLSPSwitchCase__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MIntegerParamSLSPSwitchCase__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitchCase__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getRangeAssignment_4_1()); }
(rule__MIntegerParamSLSPSwitchCase__RangeAssignment_4_1)
{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getRangeAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MRealParamSLSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitch__Group__0__Impl
	rule__MRealParamSLSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getConstantAssignment_0()); }
(rule__MRealParamSLSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitch__Group__1__Impl
	rule__MRealParamSLSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getRealKeyword_1()); }

	'real' 

{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getRealKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitch__Group__2__Impl
	rule__MRealParamSLSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getNameAssignment_2()); }
(rule__MRealParamSLSPSwitch__NameAssignment_2)
{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitch__Group__3__Impl
	rule__MRealParamSLSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getColonEqualsSignKeyword_3()); }

	':=' 

{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getColonEqualsSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitch__Group__4__Impl
	rule__MRealParamSLSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getSwitchKeyword_4()); }

	'switch' 

{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getSwitchKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitch__Group__5__Impl
	rule__MRealParamSLSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitch__Group__6__Impl
	rule__MRealParamSLSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getCasesAssignment_6()); }
(rule__MRealParamSLSPSwitch__CasesAssignment_6)
{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getCasesAssignment_6()); }
)
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getCasesAssignment_6()); }
(rule__MRealParamSLSPSwitch__CasesAssignment_6)*
{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getCasesAssignment_6()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitch__Group__7__Impl
	rule__MRealParamSLSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitch__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getSemicolonKeyword_8()); }

	';' 

{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getSemicolonKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__MRealParamSLSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitchCase__Group__0__Impl
	rule__MRealParamSLSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitchCase__Group__1__Impl
	rule__MRealParamSLSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MRealParamSLSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitchCase__Group__2__Impl
	rule__MRealParamSLSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitchCase__Group__3__Impl
	rule__MRealParamSLSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MRealParamSLSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitchCase__Group__4__Impl
	rule__MRealParamSLSPSwitchCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getGroup_4()); }
(rule__MRealParamSLSPSwitchCase__Group_4__0)?
{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitchCase__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitchCase__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitchCase__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MRealParamSLSPSwitchCase__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitchCase__Group_4__0__Impl
	rule__MRealParamSLSPSwitchCase__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitchCase__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getRangeKeyword_4_0()); }

	'range' 

{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getRangeKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MRealParamSLSPSwitchCase__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MRealParamSLSPSwitchCase__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitchCase__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getRangeAssignment_4_1()); }
(rule__MRealParamSLSPSwitchCase__RangeAssignment_4_1)
{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getRangeAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MEnumParamSLSPSwitch__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitch__Group__0__Impl
	rule__MEnumParamSLSPSwitch__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getConstantAssignment_0()); }
(rule__MEnumParamSLSPSwitch__ConstantAssignment_0)?
{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getConstantAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitch__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitch__Group__1__Impl
	rule__MEnumParamSLSPSwitch__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumKeyword_1()); }

	'enum' 

{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitch__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitch__Group__2__Impl
	rule__MEnumParamSLSPSwitch__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumDefinitionAssignment_2()); }
(rule__MEnumParamSLSPSwitch__EnumDefinitionAssignment_2)
{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumDefinitionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitch__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitch__Group__3__Impl
	rule__MEnumParamSLSPSwitch__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getNameAssignment_3()); }
(rule__MEnumParamSLSPSwitch__NameAssignment_3)
{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitch__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitch__Group__4__Impl
	rule__MEnumParamSLSPSwitch__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getColonEqualsSignKeyword_4()); }

	':=' 

{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getColonEqualsSignKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitch__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitch__Group__5__Impl
	rule__MEnumParamSLSPSwitch__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getSwitchKeyword_5()); }

	'switch' 

{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getSwitchKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitch__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitch__Group__6__Impl
	rule__MEnumParamSLSPSwitch__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_6()); }

	'{' 

{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitch__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitch__Group__7__Impl
	rule__MEnumParamSLSPSwitch__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getCasesAssignment_7()); }
(rule__MEnumParamSLSPSwitch__CasesAssignment_7)
{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getCasesAssignment_7()); }
)
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getCasesAssignment_7()); }
(rule__MEnumParamSLSPSwitch__CasesAssignment_7)*
{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getCasesAssignment_7()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitch__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitch__Group__8__Impl
	rule__MEnumParamSLSPSwitch__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitch__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitch__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getSemicolonKeyword_9()); }

	';' 

{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getSemicolonKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__MEnumParamSLSPSwitchCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitchCase__Group__0__Impl
	rule__MEnumParamSLSPSwitchCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitchCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getCaseKeyword_0()); }

	'case' 

{ after(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitchCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitchCase__Group__1__Impl
	rule__MEnumParamSLSPSwitchCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitchCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getPlatformAssignment_1()); }
(rule__MEnumParamSLSPSwitchCase__PlatformAssignment_1)
{ after(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getPlatformAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitchCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitchCase__Group__2__Impl
	rule__MEnumParamSLSPSwitchCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitchCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitchCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitchCase__Group__3__Impl
	rule__MEnumParamSLSPSwitchCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitchCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
(rule__MEnumParamSLSPSwitchCase__DefaultValueAssignment_3)
{ after(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MEnumParamSLSPSwitchCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MEnumParamSLSPSwitchCase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitchCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getSemicolonKeyword_4()); }
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















rule__MAbstractServiceLibrary__UnorderedGroup_6
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6());
    }
:
	rule__MAbstractServiceLibrary__UnorderedGroup_6__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6());
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__UnorderedGroup_6__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_6_0()); }
						(rule__MAbstractServiceLibrary__Group_6_0__0)
						{ after(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_6_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_6_1()); }
						(rule__MAbstractServiceLibrary__Group_6_1__0)
						{ after(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_6_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_6_2()); }
						(rule__MAbstractServiceLibrary__Group_6_2__0)
						{ after(grammarAccess.getMAbstractServiceLibraryAccess().getGroup_6_2()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6());
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__UnorderedGroup_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__UnorderedGroup_6__Impl
	rule__MAbstractServiceLibrary__UnorderedGroup_6__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__UnorderedGroup_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__UnorderedGroup_6__Impl
	rule__MAbstractServiceLibrary__UnorderedGroup_6__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MAbstractServiceLibrary__UnorderedGroup_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MAbstractServiceLibrary__UnorderedGroup_6__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__MServiceLibrary__UnorderedGroup_6
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6());
    }
:
	rule__MServiceLibrary__UnorderedGroup_6__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6());
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__UnorderedGroup_6__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibraryAccess().getGroup_6_0()); }
						(rule__MServiceLibrary__Group_6_0__0)
						{ after(grammarAccess.getMServiceLibraryAccess().getGroup_6_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibraryAccess().getGroup_6_1()); }
						(rule__MServiceLibrary__Group_6_1__0)
						{ after(grammarAccess.getMServiceLibraryAccess().getGroup_6_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibraryAccess().getGroup_6_2()); }
						(rule__MServiceLibrary__Group_6_2__0)
						{ after(grammarAccess.getMServiceLibraryAccess().getGroup_6_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibraryAccess().getGroup_6_3()); }
						(rule__MServiceLibrary__Group_6_3__0)
						{ after(grammarAccess.getMServiceLibraryAccess().getGroup_6_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibraryAccess().getGroup_6_4()); }
						(rule__MServiceLibrary__Group_6_4__0)
						{ after(grammarAccess.getMServiceLibraryAccess().getGroup_6_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibraryAccess().getGroup_6_5()); }
						(rule__MServiceLibrary__Group_6_5__0)
						{ after(grammarAccess.getMServiceLibraryAccess().getGroup_6_5()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6());
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__UnorderedGroup_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__UnorderedGroup_6__Impl
	rule__MServiceLibrary__UnorderedGroup_6__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__UnorderedGroup_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__UnorderedGroup_6__Impl
	rule__MServiceLibrary__UnorderedGroup_6__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__UnorderedGroup_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__UnorderedGroup_6__Impl
	rule__MServiceLibrary__UnorderedGroup_6__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__UnorderedGroup_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__UnorderedGroup_6__Impl
	rule__MServiceLibrary__UnorderedGroup_6__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__UnorderedGroup_6__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__UnorderedGroup_6__Impl
	rule__MServiceLibrary__UnorderedGroup_6__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrary__UnorderedGroup_6__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrary__UnorderedGroup_6__Impl
;
finally {
	restoreStackSize(stackSize);
}














rule__MDriverServiceLibrary__UnorderedGroup_7
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7());
    }
:
	rule__MDriverServiceLibrary__UnorderedGroup_7__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7());
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__UnorderedGroup_7__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_0()); }
						(rule__MDriverServiceLibrary__Group_7_0__0)
						{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_1()); }
						(rule__MDriverServiceLibrary__Group_7_1__0)
						{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_2()); }
						(rule__MDriverServiceLibrary__Group_7_2__0)
						{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_3()); }
						(rule__MDriverServiceLibrary__Group_7_3__0)
						{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_4()); }
						(rule__MDriverServiceLibrary__Group_7_4__0)
						{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_5()); }
						(rule__MDriverServiceLibrary__Group_7_5__0)
						{ after(grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_5()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7());
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__UnorderedGroup_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__UnorderedGroup_7__Impl
	rule__MDriverServiceLibrary__UnorderedGroup_7__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__UnorderedGroup_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__UnorderedGroup_7__Impl
	rule__MDriverServiceLibrary__UnorderedGroup_7__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__UnorderedGroup_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__UnorderedGroup_7__Impl
	rule__MDriverServiceLibrary__UnorderedGroup_7__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__UnorderedGroup_7__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__UnorderedGroup_7__Impl
	rule__MDriverServiceLibrary__UnorderedGroup_7__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__UnorderedGroup_7__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__UnorderedGroup_7__Impl
	rule__MDriverServiceLibrary__UnorderedGroup_7__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverServiceLibrary__UnorderedGroup_7__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverServiceLibrary__UnorderedGroup_7__Impl
;
finally {
	restoreStackSize(stackSize);
}














rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
    }
:
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_0()); }
						(rule__MServiceLibrarySupportedPlatform__Group_5_0__0)
						{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_1()); }
						(rule__MServiceLibrarySupportedPlatform__Group_5_1__0)
						{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_2()); }
						(rule__MServiceLibrarySupportedPlatform__Group_5_2__0)
						{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_3()); }
						(rule__MServiceLibrarySupportedPlatform__Group_5_3__0)
						{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_4()); }
						(rule__MServiceLibrarySupportedPlatform__Group_5_4__0)
						{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_5()); }
						(rule__MServiceLibrarySupportedPlatform__Group_5_5__0)
						{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_6()); }
						(rule__MServiceLibrarySupportedPlatform__Group_5_6__0)
						{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_6()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 7);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_7()); }
						(rule__MServiceLibrarySupportedPlatform__Group_5_7__0)
						{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_7()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5(), 8);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_8()); }
						(rule__MServiceLibrarySupportedPlatform__Group_5_8__0)
						{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_8()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__Impl
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__Impl
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__Impl
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__Impl
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__Impl
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__Impl
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__Impl
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__7?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__Impl
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__8?
;
finally {
	restoreStackSize(stackSize);
}


rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MServiceLibrarySupportedPlatform__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}




















rule__MDriverSLibSupportedPlatform__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
    }
:
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_0()); }
						(rule__MDriverSLibSupportedPlatform__Group_5_0__0)
						{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_1()); }
						(rule__MDriverSLibSupportedPlatform__Group_5_1__0)
						{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_2()); }
						(rule__MDriverSLibSupportedPlatform__Group_5_2__0)
						{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_3()); }
						(rule__MDriverSLibSupportedPlatform__Group_5_3__0)
						{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_3()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 4);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_4()); }
						(rule__MDriverSLibSupportedPlatform__Group_5_4__0)
						{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_4()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 5);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_5()); }
						(rule__MDriverSLibSupportedPlatform__Group_5_5__0)
						{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_5()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 6);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_6()); }
						(rule__MDriverSLibSupportedPlatform__Group_5_6__0)
						{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_6()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 7);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_7()); }
						(rule__MDriverSLibSupportedPlatform__Group_5_7__0)
						{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_7()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 8);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_8()); }
						(rule__MDriverSLibSupportedPlatform__Group_5_8__0)
						{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_8()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 9)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5(), 9);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_9()); }
						(rule__MDriverSLibSupportedPlatform__Group_5_9__0)
						{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_9()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__4?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__5?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__6?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__7?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__8?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__Impl
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__9?
;
finally {
	restoreStackSize(stackSize);
}


rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MDriverSLibSupportedPlatform__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}






















rule__MMCLEVSLIBPackageFile__PackageAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); }
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageMMCLEVPackageQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVSLIBPackageFile__ImportsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMCLEVSLIBPackageFile__ElementAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMCLEVSLIBPackageFileAccess().getElementMMCLEVSLIBPackageElementParserRuleCall_4_0()); }
	ruleMMCLEVSLIBPackageElement{ after(grammarAccess.getMMCLEVSLIBPackageFileAccess().getElementMMCLEVSLIBPackageElementParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMAbstractServiceLibraryAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__InheritsAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_1_0()); }
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryVersionedQualifiedNameParserRuleCall_4_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryVersionedQualifiedNameParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__InheritsAssignment_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_2_1_0()); }
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryVersionedQualifiedNameParserRuleCall_4_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryVersionedQualifiedNameParserRuleCall_4_2_1_0_1()); }
)
{ after(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__VersionAssignment_6_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getVersionVersionParserRuleCall_6_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMAbstractServiceLibraryAccess().getVersionVersionParserRuleCall_6_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__AttributesAssignment_6_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getAttributesMParameterWithoutSLSPParserRuleCall_6_1_2_0()); }
	ruleMParameterWithoutSLSP{ after(grammarAccess.getMAbstractServiceLibraryAccess().getAttributesMParameterWithoutSLSPParserRuleCall_6_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MAbstractServiceLibrary__ProvidesAssignment_6_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMAbstractServiceLibraryAccess().getProvidesMServiceLibraryProvidedSAIParserRuleCall_6_2_3_0()); }
	ruleMServiceLibraryProvidedSAI{ after(grammarAccess.getMAbstractServiceLibraryAccess().getProvidesMServiceLibraryProvidedSAIParserRuleCall_6_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibraryProvidedSAI__SaiAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryProvidedSAIAccess().getSaiMSAICrossReference_1_0()); }
(
{ before(grammarAccess.getMServiceLibraryProvidedSAIAccess().getSaiMSAIVersionedQualifiedNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibraryProvidedSAIAccess().getSaiMSAIVersionedQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibraryProvidedSAIAccess().getSaiMSAICrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibraryProvidedSAI__AttributeValueAssignmentsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryProvidedSAIAccess().getAttributeValueAssignmentsMSLibProvidedSAIAVAParserRuleCall_3_0()); }
	ruleMSLibProvidedSAIAVA{ after(grammarAccess.getMServiceLibraryProvidedSAIAccess().getAttributeValueAssignmentsMSLibProvidedSAIAVAParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVAExpression__ParameterAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getParameterMParameterCrossReference_1_0()); }
(
{ before(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getParameterMParameterCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVAExpression__AttributeValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getAttributeValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getAttributeValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitch__ParameterAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getParameterMParameterCrossReference_1_0()); }
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getParameterMParameterVersionedQualifiedReferenceNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getParameterMParameterCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitch__CasesAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getCasesMSLibProvidedSAIAVASwitchCaseParserRuleCall_5_0()); }
	ruleMSLibProvidedSAIAVASwitchCase{ after(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getCasesMSLibProvidedSAIAVASwitchCaseParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MSLibProvidedSAIAVASwitchCase__AttributeValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getAttributeValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getAttributeValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMServiceLibraryAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__InheritsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryVersionedQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryVersionedQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__InheritsAssignment_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_3_2_1_0()); }
(
{ before(grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryVersionedQualifiedNameParserRuleCall_3_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryVersionedQualifiedNameParserRuleCall_3_2_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__ExtendsAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_4_1_0()); }
(
{ before(grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryVersionedQualifiedNameParserRuleCall_4_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryVersionedQualifiedNameParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__ExtendsAssignment_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_4_2_1_0()); }
(
{ before(grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryVersionedQualifiedNameParserRuleCall_4_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryVersionedQualifiedNameParserRuleCall_4_2_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__VersionAssignment_6_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getVersionVersionParserRuleCall_6_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMServiceLibraryAccess().getVersionVersionParserRuleCall_6_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__LanguagesAssignment_6_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageCrossReference_6_1_2_0()); }
(
{ before(grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_6_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_6_1_2_0_1()); }
)
{ after(grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageCrossReference_6_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__LanguagesAssignment_6_1_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageCrossReference_6_1_3_1_0()); }
(
{ before(grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_6_1_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_6_1_3_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageCrossReference_6_1_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__AttributesAssignment_6_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getAttributesMParameterParserRuleCall_6_2_2_0()); }
	ruleMParameter{ after(grammarAccess.getMServiceLibraryAccess().getAttributesMParameterParserRuleCall_6_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__ProvidesAssignment_6_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getProvidesMServiceLibraryProvidedSAIParserRuleCall_6_3_3_0()); }
	ruleMServiceLibraryProvidedSAI{ after(grammarAccess.getMServiceLibraryAccess().getProvidesMServiceLibraryProvidedSAIParserRuleCall_6_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__RequiresAssignment_6_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getRequiresMSAICrossReference_6_4_2_0()); }
(
{ before(grammarAccess.getMServiceLibraryAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_6_4_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibraryAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_6_4_2_0_1()); }
)
{ after(grammarAccess.getMServiceLibraryAccess().getRequiresMSAICrossReference_6_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__RequiresAssignment_6_4_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getRequiresMSAICrossReference_6_4_3_1_0()); }
(
{ before(grammarAccess.getMServiceLibraryAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_6_4_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibraryAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_6_4_3_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibraryAccess().getRequiresMSAICrossReference_6_4_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrary__SupportedPlatformsAssignment_6_5_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibraryAccess().getSupportedPlatformsMServiceLibrarySupportedPlatformParserRuleCall_6_5_3_0()); }
	ruleMServiceLibrarySupportedPlatform{ after(grammarAccess.getMServiceLibraryAccess().getSupportedPlatformsMServiceLibrarySupportedPlatformParserRuleCall_6_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMDriverServiceLibraryAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__InheritsAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_1_0()); }
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryVersionedQualifiedNameParserRuleCall_4_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryVersionedQualifiedNameParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__InheritsAssignment_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_2_1_0()); }
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryVersionedQualifiedNameParserRuleCall_4_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryVersionedQualifiedNameParserRuleCall_4_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__ExtendsAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_5_1_0()); }
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryVersionedQualifiedNameParserRuleCall_5_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryVersionedQualifiedNameParserRuleCall_5_1_0_1()); }
)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__ExtendsAssignment_5_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_5_2_1_0()); }
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryVersionedQualifiedNameParserRuleCall_5_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryVersionedQualifiedNameParserRuleCall_5_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_5_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__VersionAssignment_7_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getVersionVersionParserRuleCall_7_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMDriverServiceLibraryAccess().getVersionVersionParserRuleCall_7_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__LanguagesAssignment_7_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageCrossReference_7_1_2_0()); }
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_7_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_7_1_2_0_1()); }
)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageCrossReference_7_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__LanguagesAssignment_7_1_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageCrossReference_7_1_3_1_0()); }
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_7_1_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_7_1_3_1_0_1()); }
)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageCrossReference_7_1_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__AttributesAssignment_7_2_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getAttributesMParameterParserRuleCall_7_2_2_0()); }
	ruleMParameter{ after(grammarAccess.getMDriverServiceLibraryAccess().getAttributesMParameterParserRuleCall_7_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__ProvidesAssignment_7_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getProvidesMServiceLibraryProvidedSAIParserRuleCall_7_3_3_0()); }
	ruleMServiceLibraryProvidedSAI{ after(grammarAccess.getMDriverServiceLibraryAccess().getProvidesMServiceLibraryProvidedSAIParserRuleCall_7_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__RequiresAssignment_7_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAICrossReference_7_4_2_0()); }
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_7_4_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_7_4_2_0_1()); }
)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAICrossReference_7_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__RequiresAssignment_7_4_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAICrossReference_7_4_3_1_0()); }
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_7_4_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_7_4_3_1_0_1()); }
)
{ after(grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAICrossReference_7_4_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverServiceLibrary__SupportedPlatformsAssignment_7_5_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverServiceLibraryAccess().getSupportedPlatformsMDriverSLibSupportedPlatformParserRuleCall_7_5_3_0()); }
	ruleMDriverSLibSupportedPlatform{ after(grammarAccess.getMDriverServiceLibraryAccess().getSupportedPlatformsMDriverSLibSupportedPlatformParserRuleCall_7_5_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__OsapiAssignment_5_0_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); }
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__OsAssignment_5_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); }
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__ArchitectureAssignment_5_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); }
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__CompilerAssignment_5_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); }
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1()); }
)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__MicroprocessorAssignment_5_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); }
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__BoardAssignment_5_5_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); }
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__AttributesAssignment_5_6_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesMParameterWithoutSLSPParserRuleCall_5_6_2_0()); }
	ruleMParameterWithoutSLSP{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesMParameterWithoutSLSPParserRuleCall_5_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__LanguagesAssignment_5_7_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_7_2_0()); }
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_7_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_7_2_0_1()); }
)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_7_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__LanguagesAssignment_5_7_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_7_3_1_0()); }
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_7_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_7_3_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_7_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__RequiresAssignment_5_8_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAICrossReference_5_8_2_0()); }
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_8_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_8_2_0_1()); }
)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAICrossReference_5_8_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MServiceLibrarySupportedPlatform__RequiresAssignment_5_8_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAICrossReference_5_8_3_1_0()); }
(
{ before(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_8_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_8_3_1_0_1()); }
)
{ after(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAICrossReference_5_8_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__OsapiAssignment_5_0_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); }
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiMOperatingSystemAPIVersionedQualifiedNameParserRuleCall_5_0_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__OsAssignment_5_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); }
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsMOperatingSystemVersionedQualifiedNameParserRuleCall_5_1_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__ArchitectureAssignment_5_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); }
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureMArchitectureVersionedQualifiedNameParserRuleCall_5_2_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__CompilerAssignment_5_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); }
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerMCompilerVersionedQualifiedNameParserRuleCall_5_3_2_0_1()); }
)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__MicroprocessorAssignment_5_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); }
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorMMicroprocessorVersionedQualifiedNameParserRuleCall_5_4_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__BoardAssignment_5_5_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); }
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardMBoardVersionedQualifiedNameParserRuleCall_5_5_2_1_0_1()); }
)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__AttributesAssignment_5_6_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesMParameterWithoutSLSPParserRuleCall_5_6_2_0()); }
	ruleMParameterWithoutSLSP{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesMParameterWithoutSLSPParserRuleCall_5_6_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__SupportedDevicesAssignment_5_7_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedDevicesMDriverSLibSupportedDeviceParserRuleCall_5_7_3_0()); }
	ruleMDriverSLibSupportedDevice{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedDevicesMDriverSLibSupportedDeviceParserRuleCall_5_7_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__LanguagesAssignment_5_8_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_8_2_0()); }
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_8_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_8_2_0_1()); }
)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_8_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__LanguagesAssignment_5_8_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_8_3_1_0()); }
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_8_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_8_3_1_0_1()); }
)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_8_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__RequiresAssignment_5_9_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAICrossReference_5_9_2_0()); }
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_9_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_9_2_0_1()); }
)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAICrossReference_5_9_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedPlatform__RequiresAssignment_5_9_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAICrossReference_5_9_3_1_0()); }
(
{ before(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_9_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAIVersionedQualifiedNameParserRuleCall_5_9_3_1_0_1()); }
)
{ after(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAICrossReference_5_9_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__DeviceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); }
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceMDeviceVersionedQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MDriverSLibSupportedDevice__RequiredAssignment_4_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMDriverSLibSupportedDeviceAccess().getRequiredMParameterValueExpressionParserRuleCall_4_2_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMDriverSLibSupportedDeviceAccess().getRequiredMParameterValueExpressionParserRuleCall_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitch__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitch__CasesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchAccess().getCasesMBooleanParamSLSPSwitchCaseParserRuleCall_6_0()); }
	ruleMBooleanParamSLSPSwitchCase{ after(grammarAccess.getMBooleanParamSLSPSwitchAccess().getCasesMBooleanParamSLSPSwitchCaseParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MBooleanParamSLSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitch__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitch__CasesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchAccess().getCasesMStringParamSLSPSwitchCaseParserRuleCall_6_0()); }
	ruleMStringParamSLSPSwitchCase{ after(grammarAccess.getMStringParamSLSPSwitchAccess().getCasesMStringParamSLSPSwitchCaseParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MStringParamSLSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitch__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitch__CasesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchAccess().getCasesMIntegerParamSLSPSwitchCaseParserRuleCall_6_0()); }
	ruleMIntegerParamSLSPSwitchCase{ after(grammarAccess.getMIntegerParamSLSPSwitchAccess().getCasesMIntegerParamSLSPSwitchCaseParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MIntegerParamSLSPSwitchCase__RangeAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
	ruleMParameterRange{ after(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitch__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitch__CasesAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchAccess().getCasesMRealParamSLSPSwitchCaseParserRuleCall_6_0()); }
	ruleMRealParamSLSPSwitchCase{ after(grammarAccess.getMRealParamSLSPSwitchAccess().getCasesMRealParamSLSPSwitchCaseParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MRealParamSLSPSwitchCase__RangeAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
	ruleMParameterRange{ after(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__ConstantAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }

	'const' 

{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getConstantConstKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__EnumDefinitionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); }
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
	ruleVersionedQualifiedReferenceName{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionVersionedQualifiedReferenceNameParserRuleCall_2_0_1()); }
)
{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitch__CasesAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchAccess().getCasesMEnumParamSLSPSwitchCaseParserRuleCall_7_0()); }
	ruleMEnumParamSLSPSwitchCase{ after(grammarAccess.getMEnumParamSLSPSwitchAccess().getCasesMEnumParamSLSPSwitchCaseParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitchCase__PlatformAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); }
(
{ before(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MEnumParamSLSPSwitchCase__DefaultValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
	ruleMParameterValueExpression{ after(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); }
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


