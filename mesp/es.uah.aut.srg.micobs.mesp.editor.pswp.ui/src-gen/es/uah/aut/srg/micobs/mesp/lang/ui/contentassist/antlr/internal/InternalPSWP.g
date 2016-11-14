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
grammar InternalPSWP;

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
import es.uah.aut.srg.micobs.mesp.lang.services.PSWPGrammarAccess;

}

@parser::members {
 
 	private PSWPGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PSWPGrammarAccess grammarAccess) {
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




// Entry rule entryRuleMMESPPSWPPackageFile
entryRuleMMESPPSWPPackageFile 
:
{ before(grammarAccess.getMMESPPSWPPackageFileRule()); }
	 ruleMMESPPSWPPackageFile
{ after(grammarAccess.getMMESPPSWPPackageFileRule()); } 
	 EOF 
;

// Rule MMESPPSWPPackageFile
ruleMMESPPSWPPackageFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getGroup()); }
(rule__MMESPPSWPPackageFile__Group__0)
{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMESPPSWPPackageElement
entryRuleMMESPPSWPPackageElement 
:
{ before(grammarAccess.getMMESPPSWPPackageElementRule()); }
	 ruleMMESPPSWPPackageElement
{ after(grammarAccess.getMMESPPSWPPackageElementRule()); } 
	 EOF 
;

// Rule MMESPPSWPPackageElement
ruleMMESPPSWPPackageElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPPSWPPackageElementAccess().getMPlatformSwPackageParserRuleCall()); }
	ruleMPlatformSwPackage
{ after(grammarAccess.getMMESPPSWPPackageElementAccess().getMPlatformSwPackageParserRuleCall()); }
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





// Entry rule entryRuleMPlatformSwPackage
entryRuleMPlatformSwPackage 
:
{ before(grammarAccess.getMPlatformSwPackageRule()); }
	 ruleMPlatformSwPackage
{ after(grammarAccess.getMPlatformSwPackageRule()); } 
	 EOF 
;

// Rule MPlatformSwPackage
ruleMPlatformSwPackage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getGroup()); }
(rule__MPlatformSwPackage__Group__0)
{ after(grammarAccess.getMPlatformSwPackageAccess().getGroup()); }
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



rule__MMESPPSWPPackageFile__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPPSWPPackageFile__Group__0__Impl
	rule__MMESPPSWPPackageFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPPSWPPackageFile__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPPSWPPackageFile__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPPSWPPackageFile__Group__1__Impl
	rule__MMESPPSWPPackageFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPPSWPPackageFile__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageAssignment_1()); }
(rule__MMESPPSWPPackageFile__PackageAssignment_1)
{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPPSWPPackageFile__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPPSWPPackageFile__Group__2__Impl
	rule__MMESPPSWPPackageFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPPSWPPackageFile__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPPSWPPackageFile__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPPSWPPackageFile__Group__3__Impl
	rule__MMESPPSWPPackageFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPPSWPPackageFile__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getGroup_3()); }
(rule__MMESPPSWPPackageFile__Group_3__0)*
{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPPSWPPackageFile__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPPSWPPackageFile__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPPSWPPackageFile__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getElementAssignment_4()); }
(rule__MMESPPSWPPackageFile__ElementAssignment_4)
{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getElementAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMESPPSWPPackageFile__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPPSWPPackageFile__Group_3__0__Impl
	rule__MMESPPSWPPackageFile__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPPSWPPackageFile__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getImportKeyword_3_0()); }

	'import' 

{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getImportKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPPSWPPackageFile__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPPSWPPackageFile__Group_3__1__Impl
	rule__MMESPPSWPPackageFile__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPPSWPPackageFile__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsAssignment_3_1()); }
(rule__MMESPPSWPPackageFile__ImportsAssignment_3_1)
{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPPSWPPackageFile__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPPSWPPackageFile__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPPSWPPackageFile__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_3_2()); }
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













rule__MPlatformSwPackage__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group__0__Impl
	rule__MPlatformSwPackage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getPswpackageKeyword_0()); }

	'pswpackage' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getPswpackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group__1__Impl
	rule__MPlatformSwPackage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getNameAssignment_1()); }
(rule__MPlatformSwPackage__NameAssignment_1)
{ after(grammarAccess.getMPlatformSwPackageAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group__2__Impl
	rule__MPlatformSwPackage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group__3__Impl
	rule__MPlatformSwPackage__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3()); }
(rule__MPlatformSwPackage__UnorderedGroup_3)
{ after(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group__4__Impl
	rule__MPlatformSwPackage__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MPlatformSwPackage__Group_3_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_0__0__Impl
	rule__MPlatformSwPackage__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getVersionKeyword_3_0_0()); }

	'version' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getVersionKeyword_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_0__1__Impl
	rule__MPlatformSwPackage__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_0_1()); }

	':=' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_0__2__Impl
	rule__MPlatformSwPackage__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getVersionAssignment_3_0_2()); }
(rule__MPlatformSwPackage__VersionAssignment_3_0_2)
{ after(grammarAccess.getMPlatformSwPackageAccess().getVersionAssignment_3_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_0_3()); }

	';' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MPlatformSwPackage__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_1__0__Impl
	rule__MPlatformSwPackage__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getSupportedKeyword_3_1_0()); }

	'supported' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getSupportedKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_1__1__Impl
	rule__MPlatformSwPackage__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getPlatformKeyword_3_1_1()); }

	'platform' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getPlatformKeyword_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_1__2__Impl
	rule__MPlatformSwPackage__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_1_2()); }

	':=' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_1__3__Impl
	rule__MPlatformSwPackage__Group_3_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementAssignment_3_1_3()); }
(rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3)
{ after(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementAssignment_3_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_1_4()); }

	';' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MPlatformSwPackage__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_2__0__Impl
	rule__MPlatformSwPackage__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getConstructionKeyword_3_2_0()); }

	'construction' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getConstructionKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_2__1__Impl
	rule__MPlatformSwPackage__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getToolsKeyword_3_2_1()); }

	'tools' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getToolsKeyword_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_2__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_2__2__Impl
	rule__MPlatformSwPackage__Group_3_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_2__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_2_2()); }

	':=' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_2_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_2__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_2__3__Impl
	rule__MPlatformSwPackage__Group_3_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_2__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_3()); }
(rule__MPlatformSwPackage__CtoolsAssignment_3_2_3)
{ after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_2__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_2__4__Impl
	rule__MPlatformSwPackage__Group_3_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_2__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2_4()); }
(rule__MPlatformSwPackage__Group_3_2_4__0)*
{ after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_2__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_2__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_2_5()); }

	';' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_2_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MPlatformSwPackage__Group_3_2_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_2_4__0__Impl
	rule__MPlatformSwPackage__Group_3_2_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_2_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_2_4_0()); }

	',' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_2_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_2_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_2_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_2_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_4_1()); }
(rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1)
{ after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MPlatformSwPackage__Group_3_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_3__0__Impl
	rule__MPlatformSwPackage__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getOsswpackagesKeyword_3_3_0()); }

	'osswpackages' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getOsswpackagesKeyword_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_3__1__Impl
	rule__MPlatformSwPackage__Group_3_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_3_1()); }

	':=' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_3__2__Impl
	rule__MPlatformSwPackage__Group_3_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_2()); }
(rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2)
{ after(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_3__3__Impl
	rule__MPlatformSwPackage__Group_3_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3_3()); }
(rule__MPlatformSwPackage__Group_3_3_3__0)*
{ after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_3_4()); }

	';' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MPlatformSwPackage__Group_3_3_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_3_3__0__Impl
	rule__MPlatformSwPackage__Group_3_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_3_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_3_3_0()); }

	',' 

{ after(grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__Group_3_3_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__Group_3_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__Group_3_3_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_3_1()); }
(rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1)
{ after(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__MPlatformSwPackage__UnorderedGroup_3
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
    }
:
	rule__MPlatformSwPackage__UnorderedGroup_3__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_0()); }
						(rule__MPlatformSwPackage__Group_3_0__0)
						{ after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_1()); }
						(rule__MPlatformSwPackage__Group_3_1__0)
						{ after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2()); }
						(rule__MPlatformSwPackage__Group_3_2__0)
						{ after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3()); }
						(rule__MPlatformSwPackage__Group_3_3__0)
						{ after(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__UnorderedGroup_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__UnorderedGroup_3__Impl
	rule__MPlatformSwPackage__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__UnorderedGroup_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__UnorderedGroup_3__Impl
	rule__MPlatformSwPackage__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__UnorderedGroup_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__UnorderedGroup_3__Impl
	rule__MPlatformSwPackage__UnorderedGroup_3__3?
;
finally {
	restoreStackSize(stackSize);
}


rule__MPlatformSwPackage__UnorderedGroup_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MPlatformSwPackage__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}










rule__MMESPPSWPPackageFile__PackageAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); }
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPPSWPPackageFile__ImportsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPPSWPPackageFile__ElementAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPPSWPPackageFileAccess().getElementMMESPPSWPPackageElementParserRuleCall_4_0()); }
	ruleMMESPPSWPPackageElement{ after(grammarAccess.getMMESPPSWPPackageFileAccess().getElementMMESPPSWPPackageElementParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMPlatformSwPackageAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__VersionAssignment_3_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getVersionVersionParserRuleCall_3_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMPlatformSwPackageAccess().getVersionVersionParserRuleCall_3_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformCrossReference_3_1_3_0()); }
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformVersionedQualifiedNameParserRuleCall_3_1_3_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformVersionedQualifiedNameParserRuleCall_3_1_3_0_1()); }
)
{ after(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformCrossReference_3_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__CtoolsAssignment_3_2_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_3_0()); }
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_3_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_3_0_1()); }
)
{ after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_4_1_0()); }
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_4_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_4_1_0_1()); }
)
{ after(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_2_0()); }
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_2_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_2_0_1()); }
)
{ after(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0()); }
(
{ before(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageVersionedQualifiedNameParserRuleCall_3_3_3_1_0_1()); }
)
{ after(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0()); }
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


