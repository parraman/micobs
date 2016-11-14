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
grammar InternalOSSWP;

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
import es.uah.aut.srg.micobs.mesp.lang.services.OSSWPGrammarAccess;

}

@parser::members {
 
 	private OSSWPGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(OSSWPGrammarAccess grammarAccess) {
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




// Entry rule entryRuleMMESPOSSWPPackageFile
entryRuleMMESPOSSWPPackageFile 
:
{ before(grammarAccess.getMMESPOSSWPPackageFileRule()); }
	 ruleMMESPOSSWPPackageFile
{ after(grammarAccess.getMMESPOSSWPPackageFileRule()); } 
	 EOF 
;

// Rule MMESPOSSWPPackageFile
ruleMMESPOSSWPPackageFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup()); }
(rule__MMESPOSSWPPackageFile__Group__0)
{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMESPOSSWPPackageElement
entryRuleMMESPOSSWPPackageElement 
:
{ before(grammarAccess.getMMESPOSSWPPackageElementRule()); }
	 ruleMMESPOSSWPPackageElement
{ after(grammarAccess.getMMESPOSSWPPackageElementRule()); } 
	 EOF 
;

// Rule MMESPOSSWPPackageElement
ruleMMESPOSSWPPackageElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPOSSWPPackageElementAccess().getMOSSwPackageParserRuleCall()); }
	ruleMOSSwPackage
{ after(grammarAccess.getMMESPOSSWPPackageElementAccess().getMOSSwPackageParserRuleCall()); }
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



// Entry rule entryRuleMOSSwPackage
entryRuleMOSSwPackage 
:
{ before(grammarAccess.getMOSSwPackageRule()); }
	 ruleMOSSwPackage
{ after(grammarAccess.getMOSSwPackageRule()); } 
	 EOF 
;

// Rule MOSSwPackage
ruleMOSSwPackage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMOSSwPackageAccess().getGroup()); }
(rule__MOSSwPackage__Group__0)
{ after(grammarAccess.getMOSSwPackageAccess().getGroup()); }
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



rule__MMESPOSSWPPackageFile__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWPPackageFile__Group__0__Impl
	rule__MMESPOSSWPPackageFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWPPackageFile__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPOSSWPPackageFile__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWPPackageFile__Group__1__Impl
	rule__MMESPOSSWPPackageFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWPPackageFile__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageAssignment_1()); }
(rule__MMESPOSSWPPackageFile__PackageAssignment_1)
{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPOSSWPPackageFile__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWPPackageFile__Group__2__Impl
	rule__MMESPOSSWPPackageFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWPPackageFile__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPOSSWPPackageFile__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWPPackageFile__Group__3__Impl
	rule__MMESPOSSWPPackageFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWPPackageFile__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup_3()); }
(rule__MMESPOSSWPPackageFile__Group_3__0)*
{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPOSSWPPackageFile__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWPPackageFile__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWPPackageFile__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementAssignment_4()); }
(rule__MMESPOSSWPPackageFile__ElementAssignment_4)
{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMESPOSSWPPackageFile__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWPPackageFile__Group_3__0__Impl
	rule__MMESPOSSWPPackageFile__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWPPackageFile__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportKeyword_3_0()); }

	'import' 

{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPOSSWPPackageFile__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWPPackageFile__Group_3__1__Impl
	rule__MMESPOSSWPPackageFile__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWPPackageFile__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsAssignment_3_1()); }
(rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1)
{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPOSSWPPackageFile__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPOSSWPPackageFile__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWPPackageFile__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_3_2()); }
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










rule__MOSSwPackage__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group__0__Impl
	rule__MOSSwPackage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getOsswpackageKeyword_0()); }

	'osswpackage' 

{ after(grammarAccess.getMOSSwPackageAccess().getOsswpackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group__1__Impl
	rule__MOSSwPackage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getNameAssignment_1()); }
(rule__MOSSwPackage__NameAssignment_1)
{ after(grammarAccess.getMOSSwPackageAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group__2__Impl
	rule__MOSSwPackage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getGroup_2()); }
(rule__MOSSwPackage__Group_2__0)?
{ after(grammarAccess.getMOSSwPackageAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group__3__Impl
	rule__MOSSwPackage__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getMOSSwPackageAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group__4__Impl
	rule__MOSSwPackage__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4()); }
(rule__MOSSwPackage__UnorderedGroup_4)
{ after(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group__5__Impl
	rule__MOSSwPackage__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getMOSSwPackageAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_6()); }

	';' 

{ after(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__MOSSwPackage__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_2__0__Impl
	rule__MOSSwPackage__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getExtendsKeyword_2_0()); }

	'extends' 

{ after(grammarAccess.getMOSSwPackageAccess().getExtendsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_2__1__Impl
	rule__MOSSwPackage__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_1()); }
(rule__MOSSwPackage__ExtendsAssignment_2_1)
{ after(grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getGroup_2_2()); }
(rule__MOSSwPackage__Group_2_2__0)*
{ after(grammarAccess.getMOSSwPackageAccess().getGroup_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MOSSwPackage__Group_2_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_2_2__0__Impl
	rule__MOSSwPackage__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_2_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_2_2_0()); }

	',' 

{ after(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_2_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_2_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_2_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_2_1()); }
(rule__MOSSwPackage__ExtendsAssignment_2_2_1)
{ after(grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MOSSwPackage__Group_4_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_0__0__Impl
	rule__MOSSwPackage__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getVersionKeyword_4_0_0()); }

	'version' 

{ after(grammarAccess.getMOSSwPackageAccess().getVersionKeyword_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_0__1__Impl
	rule__MOSSwPackage__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_0_1()); }

	':=' 

{ after(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_0__2__Impl
	rule__MOSSwPackage__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getVersionAssignment_4_0_2()); }
(rule__MOSSwPackage__VersionAssignment_4_0_2)
{ after(grammarAccess.getMOSSwPackageAccess().getVersionAssignment_4_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_0_3()); }

	';' 

{ after(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MOSSwPackage__Group_4_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_1__0__Impl
	rule__MOSSwPackage__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getOsKeyword_4_1_0()); }

	'os' 

{ after(grammarAccess.getMOSSwPackageAccess().getOsKeyword_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_1__1__Impl
	rule__MOSSwPackage__Group_4_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_1_1()); }

	':=' 

{ after(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_1__2__Impl
	rule__MOSSwPackage__Group_4_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getReferencedElementAssignment_4_1_2()); }
(rule__MOSSwPackage__ReferencedElementAssignment_4_1_2)
{ after(grammarAccess.getMOSSwPackageAccess().getReferencedElementAssignment_4_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_1_3()); }

	';' 

{ after(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MOSSwPackage__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_2__0__Impl
	rule__MOSSwPackage__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getConstructionKeyword_4_2_0()); }

	'construction' 

{ after(grammarAccess.getMOSSwPackageAccess().getConstructionKeyword_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_2__1__Impl
	rule__MOSSwPackage__Group_4_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getToolsKeyword_4_2_1()); }

	'tools' 

{ after(grammarAccess.getMOSSwPackageAccess().getToolsKeyword_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_2__2__Impl
	rule__MOSSwPackage__Group_4_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_2_2()); }

	':=' 

{ after(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_2__3__Impl
	rule__MOSSwPackage__Group_4_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_3()); }
(rule__MOSSwPackage__CtoolsAssignment_4_2_3)
{ after(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_2__4__Impl
	rule__MOSSwPackage__Group_4_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getGroup_4_2_4()); }
(rule__MOSSwPackage__Group_4_2_4__0)*
{ after(grammarAccess.getMOSSwPackageAccess().getGroup_4_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_2_5()); }

	';' 

{ after(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MOSSwPackage__Group_4_2_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_2_4__0__Impl
	rule__MOSSwPackage__Group_4_2_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_2_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_2_4_0()); }

	',' 

{ after(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_2_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_2_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_2_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_2_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_4_1()); }
(rule__MOSSwPackage__CtoolsAssignment_4_2_4_1)
{ after(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MOSSwPackage__Group_4_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_3__0__Impl
	rule__MOSSwPackage__Group_4_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getProvidedKeyword_4_3_0()); }

	'provided' 

{ after(grammarAccess.getMOSSwPackageAccess().getProvidedKeyword_4_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_3__1__Impl
	rule__MOSSwPackage__Group_4_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getOsswisKeyword_4_3_1()); }

	'osswis' 

{ after(grammarAccess.getMOSSwPackageAccess().getOsswisKeyword_4_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_3__2__Impl
	rule__MOSSwPackage__Group_4_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_3_2()); }

	':=' 

{ after(grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_3__3__Impl
	rule__MOSSwPackage__Group_4_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_3()); }
(rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3)
{ after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_3__4__Impl
	rule__MOSSwPackage__Group_4_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getGroup_4_3_4()); }
(rule__MOSSwPackage__Group_4_3_4__0)*
{ after(grammarAccess.getMOSSwPackageAccess().getGroup_4_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_3__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_3__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_3_5()); }

	';' 

{ after(grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_3_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MOSSwPackage__Group_4_3_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_3_4__0__Impl
	rule__MOSSwPackage__Group_4_3_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_3_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_3_4_0()); }

	',' 

{ after(grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_3_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__Group_4_3_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__Group_4_3_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__Group_4_3_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_4_1()); }
(rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1)
{ after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__MOSSwPackage__UnorderedGroup_4
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());
    }
:
	rule__MOSSwPackage__UnorderedGroup_4__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__UnorderedGroup_4__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSwPackageAccess().getGroup_4_0()); }
						(rule__MOSSwPackage__Group_4_0__0)
						{ after(grammarAccess.getMOSSwPackageAccess().getGroup_4_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSwPackageAccess().getGroup_4_1()); }
						(rule__MOSSwPackage__Group_4_1__0)
						{ after(grammarAccess.getMOSSwPackageAccess().getGroup_4_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSwPackageAccess().getGroup_4_2()); }
						(rule__MOSSwPackage__Group_4_2__0)
						{ after(grammarAccess.getMOSSwPackageAccess().getGroup_4_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMOSSwPackageAccess().getGroup_4_3()); }
						(rule__MOSSwPackage__Group_4_3__0)
						{ after(grammarAccess.getMOSSwPackageAccess().getGroup_4_3()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4());
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__UnorderedGroup_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__UnorderedGroup_4__Impl
	rule__MOSSwPackage__UnorderedGroup_4__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__UnorderedGroup_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__UnorderedGroup_4__Impl
	rule__MOSSwPackage__UnorderedGroup_4__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__UnorderedGroup_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__UnorderedGroup_4__Impl
	rule__MOSSwPackage__UnorderedGroup_4__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MOSSwPackage__UnorderedGroup_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MOSSwPackage__UnorderedGroup_4__Impl
;
finally {
	restoreStackSize(stackSize);
}










rule__MMESPOSSWPPackageFile__PackageAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); }
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPOSSWPPackageFile__ElementAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementMMESPOSSWPPackageElementParserRuleCall_4_0()); }
	ruleMMESPOSSWPPackageElement{ after(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementMMESPOSSWPPackageElementParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMOSSwPackageAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__ExtendsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_1_0()); }
(
{ before(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__ExtendsAssignment_2_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_2_1_0()); }
(
{ before(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageVersionedQualifiedNameParserRuleCall_2_2_1_0_1()); }
)
{ after(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__VersionAssignment_4_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMOSSwPackageAccess().getVersionVersionParserRuleCall_4_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__ReferencedElementAssignment_4_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemCrossReference_4_1_2_0()); }
(
{ before(grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemVersionedQualifiedNameParserRuleCall_4_1_2_0_1()); }
)
{ after(grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemCrossReference_4_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__CtoolsAssignment_4_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_3_0()); }
(
{ before(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_3_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_3_0_1()); }
)
{ after(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__CtoolsAssignment_4_2_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_4_1_0()); }
(
{ before(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_4_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_4_2_4_1_0_1()); }
)
{ after(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_0()); }
(
{ before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_3_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_3_0_1()); }
)
{ after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_4_1_0()); }
(
{ before(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_4_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceVersionedQualifiedNameParserRuleCall_4_3_4_1_0_1()); }
)
{ after(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


