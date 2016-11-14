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
grammar InternalCTOOL;

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
import es.uah.aut.srg.micobs.mesp.lang.services.CTOOLGrammarAccess;

}

@parser::members {
 
 	private CTOOLGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(CTOOLGrammarAccess grammarAccess) {
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




// Entry rule entryRuleMMESPCTOOLPackageFile
entryRuleMMESPCTOOLPackageFile 
:
{ before(grammarAccess.getMMESPCTOOLPackageFileRule()); }
	 ruleMMESPCTOOLPackageFile
{ after(grammarAccess.getMMESPCTOOLPackageFileRule()); } 
	 EOF 
;

// Rule MMESPCTOOLPackageFile
ruleMMESPCTOOLPackageFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getGroup()); }
(rule__MMESPCTOOLPackageFile__Group__0)
{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMMESPCTOOLPackageElement
entryRuleMMESPCTOOLPackageElement 
:
{ before(grammarAccess.getMMESPCTOOLPackageElementRule()); }
	 ruleMMESPCTOOLPackageElement
{ after(grammarAccess.getMMESPCTOOLPackageElementRule()); } 
	 EOF 
;

// Rule MMESPCTOOLPackageElement
ruleMMESPCTOOLPackageElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMMESPCTOOLPackageElementAccess().getMConstructionToolParserRuleCall()); }
	ruleMConstructionTool
{ after(grammarAccess.getMMESPCTOOLPackageElementAccess().getMConstructionToolParserRuleCall()); }
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





// Entry rule entryRuleMConstructionTool
entryRuleMConstructionTool 
:
{ before(grammarAccess.getMConstructionToolRule()); }
	 ruleMConstructionTool
{ after(grammarAccess.getMConstructionToolRule()); } 
	 EOF 
;

// Rule MConstructionTool
ruleMConstructionTool
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMConstructionToolAccess().getGroup()); }
(rule__MConstructionTool__Group__0)
{ after(grammarAccess.getMConstructionToolAccess().getGroup()); }
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



rule__MMESPCTOOLPackageFile__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPCTOOLPackageFile__Group__0__Impl
	rule__MMESPCTOOLPackageFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPCTOOLPackageFile__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPCTOOLPackageFile__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPCTOOLPackageFile__Group__1__Impl
	rule__MMESPCTOOLPackageFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPCTOOLPackageFile__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageAssignment_1()); }
(rule__MMESPCTOOLPackageFile__PackageAssignment_1)
{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPCTOOLPackageFile__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPCTOOLPackageFile__Group__2__Impl
	rule__MMESPCTOOLPackageFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPCTOOLPackageFile__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPCTOOLPackageFile__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPCTOOLPackageFile__Group__3__Impl
	rule__MMESPCTOOLPackageFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPCTOOLPackageFile__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getGroup_3()); }
(rule__MMESPCTOOLPackageFile__Group_3__0)*
{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPCTOOLPackageFile__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPCTOOLPackageFile__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPCTOOLPackageFile__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getElementAssignment_4()); }
(rule__MMESPCTOOLPackageFile__ElementAssignment_4)
{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getElementAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__MMESPCTOOLPackageFile__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPCTOOLPackageFile__Group_3__0__Impl
	rule__MMESPCTOOLPackageFile__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPCTOOLPackageFile__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getImportKeyword_3_0()); }

	'import' 

{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getImportKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPCTOOLPackageFile__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPCTOOLPackageFile__Group_3__1__Impl
	rule__MMESPCTOOLPackageFile__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPCTOOLPackageFile__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getImportsAssignment_3_1()); }
(rule__MMESPCTOOLPackageFile__ImportsAssignment_3_1)
{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getImportsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MMESPCTOOLPackageFile__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MMESPCTOOLPackageFile__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPCTOOLPackageFile__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getSemicolonKeyword_3_2()); }

	';' 

{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getSemicolonKeyword_3_2()); }
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













rule__MConstructionTool__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group__0__Impl
	rule__MConstructionTool__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getConstructionKeyword_0()); }

	'construction' 

{ after(grammarAccess.getMConstructionToolAccess().getConstructionKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group__1__Impl
	rule__MConstructionTool__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getToolKeyword_1()); }

	'tool' 

{ after(grammarAccess.getMConstructionToolAccess().getToolKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group__2__Impl
	rule__MConstructionTool__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getNameAssignment_2()); }
(rule__MConstructionTool__NameAssignment_2)
{ after(grammarAccess.getMConstructionToolAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group__3__Impl
	rule__MConstructionTool__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getGroup_3()); }
(rule__MConstructionTool__Group_3__0)?
{ after(grammarAccess.getMConstructionToolAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group__4__Impl
	rule__MConstructionTool__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getMConstructionToolAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group__5__Impl
	rule__MConstructionTool__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5()); }
(rule__MConstructionTool__UnorderedGroup_5)
{ after(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group__6__Impl
	rule__MConstructionTool__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getMConstructionToolAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_7()); }

	';' 

{ after(grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__MConstructionTool__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_3__0__Impl
	rule__MConstructionTool__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getExtendsKeyword_3_0()); }

	'extends' 

{ after(grammarAccess.getMConstructionToolAccess().getExtendsKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_3__1__Impl
	rule__MConstructionTool__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getExtendsAssignment_3_1()); }
(rule__MConstructionTool__ExtendsAssignment_3_1)
{ after(grammarAccess.getMConstructionToolAccess().getExtendsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getGroup_3_2()); }
(rule__MConstructionTool__Group_3_2__0)*
{ after(grammarAccess.getMConstructionToolAccess().getGroup_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MConstructionTool__Group_3_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_3_2__0__Impl
	rule__MConstructionTool__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_3_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getCommaKeyword_3_2_0()); }

	',' 

{ after(grammarAccess.getMConstructionToolAccess().getCommaKeyword_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group_3_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_3_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getExtendsAssignment_3_2_1()); }
(rule__MConstructionTool__ExtendsAssignment_3_2_1)
{ after(grammarAccess.getMConstructionToolAccess().getExtendsAssignment_3_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MConstructionTool__Group_5_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_5_0__0__Impl
	rule__MConstructionTool__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_5_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getVersionKeyword_5_0_0()); }

	'version' 

{ after(grammarAccess.getMConstructionToolAccess().getVersionKeyword_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group_5_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_5_0__1__Impl
	rule__MConstructionTool__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_5_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getColonEqualsSignKeyword_5_0_1()); }

	':=' 

{ after(grammarAccess.getMConstructionToolAccess().getColonEqualsSignKeyword_5_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group_5_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_5_0__2__Impl
	rule__MConstructionTool__Group_5_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_5_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getVersionAssignment_5_0_2()); }
(rule__MConstructionTool__VersionAssignment_5_0_2)
{ after(grammarAccess.getMConstructionToolAccess().getVersionAssignment_5_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group_5_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_5_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_5_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_5_0_3()); }

	';' 

{ after(grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_5_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MConstructionTool__Group_5_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_5_1__0__Impl
	rule__MConstructionTool__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_5_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getSupportedKeyword_5_1_0()); }

	'supported' 

{ after(grammarAccess.getMConstructionToolAccess().getSupportedKeyword_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group_5_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_5_1__1__Impl
	rule__MConstructionTool__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_5_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getLanguagesKeyword_5_1_1()); }

	'languages' 

{ after(grammarAccess.getMConstructionToolAccess().getLanguagesKeyword_5_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group_5_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_5_1__2__Impl
	rule__MConstructionTool__Group_5_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_5_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getColonEqualsSignKeyword_5_1_2()); }

	':=' 

{ after(grammarAccess.getMConstructionToolAccess().getColonEqualsSignKeyword_5_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group_5_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_5_1__3__Impl
	rule__MConstructionTool__Group_5_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_5_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesAssignment_5_1_3()); }
(rule__MConstructionTool__SupportedLanguagesAssignment_5_1_3)
{ after(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesAssignment_5_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group_5_1__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_5_1__4__Impl
	rule__MConstructionTool__Group_5_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_5_1__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getGroup_5_1_4()); }
(rule__MConstructionTool__Group_5_1_4__0)*
{ after(grammarAccess.getMConstructionToolAccess().getGroup_5_1_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group_5_1__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_5_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_5_1__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_5_1_5()); }

	';' 

{ after(grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_5_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__MConstructionTool__Group_5_1_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_5_1_4__0__Impl
	rule__MConstructionTool__Group_5_1_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_5_1_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getCommaKeyword_5_1_4_0()); }

	',' 

{ after(grammarAccess.getMConstructionToolAccess().getCommaKeyword_5_1_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__Group_5_1_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__Group_5_1_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__Group_5_1_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesAssignment_5_1_4_1()); }
(rule__MConstructionTool__SupportedLanguagesAssignment_5_1_4_1)
{ after(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesAssignment_5_1_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__MConstructionTool__UnorderedGroup_5
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5());
    }
:
	rule__MConstructionTool__UnorderedGroup_5__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MConstructionTool__UnorderedGroup_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMConstructionToolAccess().getGroup_5_0()); }
						(rule__MConstructionTool__Group_5_0__0)
						{ after(grammarAccess.getMConstructionToolAccess().getGroup_5_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getMConstructionToolAccess().getGroup_5_1()); }
						(rule__MConstructionTool__Group_5_1__0)
						{ after(grammarAccess.getMConstructionToolAccess().getGroup_5_1()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5());
	restoreStackSize(stackSize);
}


rule__MConstructionTool__UnorderedGroup_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__UnorderedGroup_5__Impl
	rule__MConstructionTool__UnorderedGroup_5__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__MConstructionTool__UnorderedGroup_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MConstructionTool__UnorderedGroup_5__Impl
;
finally {
	restoreStackSize(stackSize);
}






rule__MMESPCTOOLPackageFile__PackageAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); }
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageMMESPPackageQualifiedNameParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPCTOOLPackageFile__ImportsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getImportsMCommonPackageQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MMESPCTOOLPackageFile__ElementAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMMESPCTOOLPackageFileAccess().getElementMMESPCTOOLPackageElementParserRuleCall_4_0()); }
	ruleMMESPCTOOLPackageElement{ after(grammarAccess.getMMESPCTOOLPackageFileAccess().getElementMMESPCTOOLPackageElementParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getMConstructionToolAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__ExtendsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolCrossReference_3_1_0()); }
(
{ before(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__ExtendsAssignment_3_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolCrossReference_3_2_1_0()); }
(
{ before(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolVersionedQualifiedNameParserRuleCall_3_2_1_0_1()); }
)
{ after(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolCrossReference_3_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__VersionAssignment_5_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getVersionVersionParserRuleCall_5_0_2_0()); }
	ruleVersion{ after(grammarAccess.getMConstructionToolAccess().getVersionVersionParserRuleCall_5_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__SupportedLanguagesAssignment_5_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageCrossReference_5_1_3_0()); }
(
{ before(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_3_0_1()); }
)
{ after(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageCrossReference_5_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MConstructionTool__SupportedLanguagesAssignment_5_1_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageCrossReference_5_1_4_1_0()); }
(
{ before(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_4_1_0_1()); }
	ruleVersionedQualifiedName{ after(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageVersionedQualifiedNameParserRuleCall_5_1_4_1_0_1()); }
)
{ after(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageCrossReference_5_1_4_1_0()); }
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


