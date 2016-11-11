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
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
	
}

@lexer::header {
package es.uah.aut.srg.micobs.lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.lang.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.micobs.lang.services.PDLGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private PDLGrammarAccess grammarAccess;
 	
    public InternalPDLParser(TokenStream input, PDLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MPDLPackageFile";	
   	}
   	
   	@Override
   	protected PDLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMPDLPackageFile
entryRuleMPDLPackageFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMPDLPackageFileRule()); }
	 iv_ruleMPDLPackageFile=ruleMPDLPackageFile 
	 { $current=$iv_ruleMPDLPackageFile.current; } 
	 EOF 
;

// Rule MPDLPackageFile
ruleMPDLPackageFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMPDLPackageFileAccess().getPackageKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPDLPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPDLPackageFileAccess().getPackageMPDLPackageCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMPDLPackageFileAccess().getSemicolonKeyword_2());
    }
(	otherlv_3='import' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMPDLPackageFileAccess().getImportKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPDLPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPDLPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMPDLPackageFileAccess().getSemicolonKeyword_3_2());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getMPDLPackageFileAccess().getElementMPDLPackageElementParserRuleCall_4_0()); 
	    }
		lv_element_6_0=ruleMPDLPackageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMPDLPackageFileRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_6_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MPDLPackageElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMPDLPackageElement
entryRuleMPDLPackageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMPDLPackageElementRule()); }
	 iv_ruleMPDLPackageElement=ruleMPDLPackageElement 
	 { $current=$iv_ruleMPDLPackageElement.current; } 
	 EOF 
;

// Rule MPDLPackageElement
ruleMPDLPackageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMPDLPackageElementAccess().getMBoardParserRuleCall_0()); 
    }
    this_MBoard_0=ruleMBoard
    { 
        $current = $this_MBoard_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMPDLPackageElementAccess().getMMicroprocessorParserRuleCall_1()); 
    }
    this_MMicroprocessor_1=ruleMMicroprocessor
    { 
        $current = $this_MMicroprocessor_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMPDLPackageElementAccess().getMOperatingSystemParserRuleCall_2()); 
    }
    this_MOperatingSystem_2=ruleMOperatingSystem
    { 
        $current = $this_MOperatingSystem_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMPDLPackageElementAccess().getMOperatingSystemAPIParserRuleCall_3()); 
    }
    this_MOperatingSystemAPI_3=ruleMOperatingSystemAPI
    { 
        $current = $this_MOperatingSystemAPI_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMPDLPackageElementAccess().getMArchitectureParserRuleCall_4()); 
    }
    this_MArchitecture_4=ruleMArchitecture
    { 
        $current = $this_MArchitecture_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMPDLPackageElementAccess().getMPlatformParserRuleCall_5()); 
    }
    this_MPlatform_5=ruleMPlatform
    { 
        $current = $this_MPlatform_5.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMPDLPackageElementAccess().getMCompilerParserRuleCall_6()); 
    }
    this_MCompiler_6=ruleMCompiler
    { 
        $current = $this_MCompiler_6.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMPDLPackageElementAccess().getMDeviceParserRuleCall_7()); 
    }
    this_MDevice_7=ruleMDevice
    { 
        $current = $this_MDevice_7.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleVersion
entryRuleVersion returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getVersionRule()); } 
	 iv_ruleVersion=ruleVersion 
	 { $current=$iv_ruleVersion.current.getText(); }  
	 EOF 
;

// Rule Version
ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
    }

    |((    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
    }
)?    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); 
    }
))(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
    }
(    this_INT_4=RULE_INT    {
		$current.merge(this_INT_4);
    }

    { 
    newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
    }

    |((    this_INT_5=RULE_INT    {
		$current.merge(this_INT_5);
    }

    { 
    newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
    }
)?    this_ID_6=RULE_ID    {
		$current.merge(this_ID_6);
    }

    { 
    newLeafNode(this_ID_6, grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); 
    }
)))*)
    ;





// Entry rule entryRuleVersionedQualifiedName
entryRuleVersionedQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getVersionedQualifiedNameRule()); } 
	 iv_ruleVersionedQualifiedName=ruleVersionedQualifiedName 
	 { $current=$iv_ruleVersionedQualifiedName.current.getText(); }  
	 EOF 
;

// Rule VersionedQualifiedName
ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
    }
    this_QualifiedName_0=ruleQualifiedName    {
		$current.merge(this_QualifiedName_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw='(' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
    }

    { 
        newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
    }
    this_Version_2=ruleVersion    {
		$current.merge(this_Version_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw=')' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
    }
)
    ;





// Entry rule entryRuleVersionedQualifiedReferenceName
entryRuleVersionedQualifiedReferenceName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameRule()); } 
	 iv_ruleVersionedQualifiedReferenceName=ruleVersionedQualifiedReferenceName 
	 { $current=$iv_ruleVersionedQualifiedReferenceName.current.getText(); }  
	 EOF 
;

// Rule VersionedQualifiedReferenceName
ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    { 
        newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); 
    }
    this_VersionedQualifiedName_0=ruleVersionedQualifiedName    {
		$current.merge(this_VersionedQualifiedName_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw='::' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
    }
)?    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); 
    }
(
	kw='::' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
    }
    this_ID_4=RULE_ID    {
		$current.merge(this_ID_4);
    }

    { 
    newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); 
    }
)*)
    ;





// Entry rule entryRuleMCompiler
entryRuleMCompiler returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMCompilerAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMCompilerRule()); }
	 iv_ruleMCompiler=ruleMCompiler 
	 { $current=$iv_ruleMCompiler.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MCompiler
ruleMCompiler returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMCompilerAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='compiler' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMCompilerAccess().getCompilerKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMCompilerAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCompilerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)(	otherlv_2='extends' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMCompilerAccess().getExtendsKeyword_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCompilerRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMCompilerAccess().getExtendsMCompilerCrossReference_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMCompilerAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCompilerRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMCompilerAccess().getExtendsMCompilerCrossReference_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMCompilerAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMCompilerAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_8='version' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMCompilerAccess().getVersionKeyword_4_0_0());
    }
	otherlv_9=':=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMCompilerAccess().getColonEqualsSignKeyword_4_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMCompilerAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
	    }
		lv_version_10_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMCompilerRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_10_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=';' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMCompilerAccess().getSemicolonKeyword_4_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMCompilerAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_12='frontends' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMCompilerAccess().getFrontendsKeyword_4_1_0());
    }
	otherlv_13='{' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMCompilerAccess().getLeftCurlyBracketKeyword_4_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMCompilerAccess().getFrontendsMCompilerFrontendParserRuleCall_4_1_2_0()); 
	    }
		lv_frontends_14_0=ruleMCompilerFrontend		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMCompilerRule());
	        }
       		add(
       			$current, 
       			"frontends",
        		lv_frontends_14_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MCompilerFrontend");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMCompilerAccess().getRightCurlyBracketKeyword_4_1_3());
    }
	otherlv_16=';' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMCompilerAccess().getSemicolonKeyword_4_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMCompilerAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMCompilerAccess().getUnorderedGroup_4(), 2);
	 				}
					({true}?=>(	otherlv_17='configuration' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMCompilerAccess().getConfigurationKeyword_4_2_0());
    }
	otherlv_18='parameters' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMCompilerAccess().getParametersKeyword_4_2_1());
    }
	otherlv_19='{' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMCompilerAccess().getLeftCurlyBracketKeyword_4_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMCompilerAccess().getParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0()); 
	    }
		lv_parameters_20_0=ruleMParameterWithoutOSSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMCompilerRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_20_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterWithoutOSSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_21='}' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMCompilerAccess().getRightCurlyBracketKeyword_4_2_4());
    }
	otherlv_22=';' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMCompilerAccess().getSemicolonKeyword_4_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMCompilerAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMCompilerAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMCompilerAccess().getUnorderedGroup_4());
	}

)	otherlv_23='}' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMCompilerAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_24=';' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMCompilerAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMCompilerFrontend
entryRuleMCompilerFrontend returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMCompilerFrontendRule()); }
	 iv_ruleMCompilerFrontend=ruleMCompilerFrontend 
	 { $current=$iv_ruleMCompilerFrontend.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MCompilerFrontend
ruleMCompilerFrontend returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='frontend' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMCompilerFrontendAccess().getFrontendKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMCompilerFrontendAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCompilerFrontendRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMCompilerFrontendAccess().getLeftCurlyBracketKeyword_2());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), 0);
	 				}
					({true}?=>(	otherlv_4='language' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMCompilerFrontendAccess().getLanguageKeyword_3_0_0());
    }
	otherlv_5=':=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMCompilerFrontendAccess().getColonEqualsSignKeyword_3_0_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCompilerFrontendRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMCompilerFrontendAccess().getLanguageMLanguageCrossReference_3_0_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_3_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), 1);
	 				}
					({true}?=>(	otherlv_8='architectures' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMCompilerFrontendAccess().getArchitecturesKeyword_3_1_0());
    }
	otherlv_9=':=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMCompilerFrontendAccess().getColonEqualsSignKeyword_3_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCompilerFrontendRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureCrossReference_3_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_11=',' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMCompilerFrontendAccess().getCommaKeyword_3_1_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMCompilerFrontendRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureCrossReference_3_1_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_13=';' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_3_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3(), 2);
	 				}
					({true}?=>(	otherlv_14='configuration' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMCompilerFrontendAccess().getConfigurationKeyword_3_2_0());
    }
	otherlv_15='parameters' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMCompilerFrontendAccess().getParametersKeyword_3_2_1());
    }
	otherlv_16='{' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMCompilerFrontendAccess().getLeftCurlyBracketKeyword_3_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMCompilerFrontendAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0()); 
	    }
		lv_parameters_17_0=ruleMParameterWithoutOSSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMCompilerFrontendRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_17_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterWithoutOSSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_18='}' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMCompilerFrontendAccess().getRightCurlyBracketKeyword_3_2_4());
    }
	otherlv_19=';' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_3_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3());
	}

)	otherlv_20='}' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMCompilerFrontendAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_21=';' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_5());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMBoard
entryRuleMBoard returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMBoardAccess().getUnorderedGroup_3()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMBoardRule()); }
	 iv_ruleMBoard=ruleMBoard 
	 { $current=$iv_ruleMBoard.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MBoard
ruleMBoard returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMBoardAccess().getUnorderedGroup_3()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='board' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMBoardAccess().getBoardKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMBoardAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBoardRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMBoardAccess().getLeftCurlyBracketKeyword_2());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMBoardAccess().getUnorderedGroup_3());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 0);
	 				}
					({true}?=>(	otherlv_4='version' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMBoardAccess().getVersionKeyword_3_0_0());
    }
	otherlv_5=':=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMBoardAccess().getColonEqualsSignKeyword_3_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMBoardAccess().getVersionVersionParserRuleCall_3_0_2_0()); 
	    }
		lv_version_6_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMBoardRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_6_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMBoardAccess().getSemicolonKeyword_3_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMBoardAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 1);
	 				}
					({true}?=>(	otherlv_8='supported' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMBoardAccess().getSupportedKeyword_3_1_0());
    }
	otherlv_9='devices' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMBoardAccess().getDevicesKeyword_3_1_1());
    }
	otherlv_10='{' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMBoardAccess().getLeftCurlyBracketKeyword_3_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMBoardAccess().getSupportedDevicesMBoardSupportedDeviceParserRuleCall_3_1_3_0()); 
	    }
		lv_supportedDevices_11_0=ruleMBoardSupportedDevice		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMBoardRule());
	        }
       		add(
       			$current, 
       			"supportedDevices",
        		lv_supportedDevices_11_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MBoardSupportedDevice");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMBoardAccess().getRightCurlyBracketKeyword_3_1_4());
    }
	otherlv_13=';' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMBoardAccess().getSemicolonKeyword_3_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMBoardAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 2);
	 				}
					({true}?=>(	otherlv_14='microprocessor' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMBoardAccess().getMicroprocessorKeyword_3_2_0());
    }
	otherlv_15=':=' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMBoardAccess().getColonEqualsSignKeyword_3_2_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBoardRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMBoardAccess().getMicroprocessorMMicroprocessorCrossReference_3_2_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_17=';' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMBoardAccess().getSemicolonKeyword_3_2_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMBoardAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMBoardAccess().getUnorderedGroup_3(), 3);
	 				}
					({true}?=>(	otherlv_18='configuration' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMBoardAccess().getConfigurationKeyword_3_3_0());
    }
	otherlv_19='parameters' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMBoardAccess().getParametersKeyword_3_3_1());
    }
	otherlv_20='{' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMBoardAccess().getLeftCurlyBracketKeyword_3_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMBoardAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_3_3_0()); 
	    }
		lv_parameters_21_0=ruleMParameterWithoutOSSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMBoardRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_21_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterWithoutOSSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_22='}' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMBoardAccess().getRightCurlyBracketKeyword_3_3_4());
    }
	otherlv_23=';' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMBoardAccess().getSemicolonKeyword_3_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMBoardAccess().getUnorderedGroup_3());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMBoardAccess().getUnorderedGroup_3())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMBoardAccess().getUnorderedGroup_3());
	}

)	otherlv_24='}' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMBoardAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_25=';' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMBoardAccess().getSemicolonKeyword_5());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMBoardSupportedDevice
entryRuleMBoardSupportedDevice returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMBoardSupportedDeviceRule()); }
	 iv_ruleMBoardSupportedDevice=ruleMBoardSupportedDevice 
	 { $current=$iv_ruleMBoardSupportedDevice.current; } 
	 EOF 
;

// Rule MBoardSupportedDevice
ruleMBoardSupportedDevice returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='device' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMBoardSupportedDeviceAccess().getDeviceKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBoardSupportedDeviceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMBoardSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='range' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMBoardSupportedDeviceAccess().getRangeKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMBoardSupportedDeviceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_lowerBound_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMBoardSupportedDeviceRule());
	        }
       		set(
       			$current, 
       			"lowerBound",
        		lv_lowerBound_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='to' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMBoardSupportedDeviceAccess().getToKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMBoardSupportedDeviceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_5_0()); 
	    }
		lv_upperBound_5_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMBoardSupportedDeviceRule());
	        }
       		set(
       			$current, 
       			"upperBound",
        		lv_upperBound_5_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMBoardSupportedDeviceAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleMMicroprocessor
entryRuleMMicroprocessor returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMMicroprocessorRule()); }
	 iv_ruleMMicroprocessor=ruleMMicroprocessor 
	 { $current=$iv_ruleMMicroprocessor.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MMicroprocessor
ruleMMicroprocessor returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='microprocessor' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMicroprocessorAccess().getMicroprocessorKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMMicroprocessorAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMicroprocessorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMMicroprocessorAccess().getLeftCurlyBracketKeyword_2());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), 0);
	 				}
					({true}?=>(	otherlv_4='version' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMMicroprocessorAccess().getVersionKeyword_3_0_0());
    }
	otherlv_5=':=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMicroprocessorAccess().getColonEqualsSignKeyword_3_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMicroprocessorAccess().getVersionVersionParserRuleCall_3_0_2_0()); 
	    }
		lv_version_6_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMicroprocessorRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_6_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_3_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), 1);
	 				}
					({true}?=>(	otherlv_8='architecture' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMMicroprocessorAccess().getArchitectureKeyword_3_1_0());
    }
	otherlv_9=':=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMMicroprocessorAccess().getColonEqualsSignKeyword_3_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMicroprocessorRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMicroprocessorAccess().getArchitectureMArchitectureCrossReference_3_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=';' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_3_1_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3(), 2);
	 				}
					({true}?=>(	otherlv_12='configuration' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMMicroprocessorAccess().getConfigurationKeyword_3_2_0());
    }
	otherlv_13='parameters' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMMicroprocessorAccess().getParametersKeyword_3_2_1());
    }
	otherlv_14='{' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMMicroprocessorAccess().getLeftCurlyBracketKeyword_3_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMMicroprocessorAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0()); 
	    }
		lv_parameters_15_0=ruleMParameterWithoutOSSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMicroprocessorRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_15_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterWithoutOSSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_16='}' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMMicroprocessorAccess().getRightCurlyBracketKeyword_3_2_4());
    }
	otherlv_17=';' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_3_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3());
	}

)	otherlv_18='}' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMMicroprocessorAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_19=';' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_5());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMOperatingSystem
entryRuleMOperatingSystem returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMOperatingSystemRule()); }
	 iv_ruleMOperatingSystem=ruleMOperatingSystem 
	 { $current=$iv_ruleMOperatingSystem.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MOperatingSystem
ruleMOperatingSystem returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='os' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMOperatingSystemAccess().getOsKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMOperatingSystemAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOperatingSystemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)(	otherlv_2='inherits' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMOperatingSystemAccess().getInheritsKeyword_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOperatingSystemRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemCrossReference_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMOperatingSystemAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOperatingSystemRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemCrossReference_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_8='version' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMOperatingSystemAccess().getVersionKeyword_4_0_0());
    }
	otherlv_9=':=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMOperatingSystemAccess().getColonEqualsSignKeyword_4_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
	    }
		lv_version_10_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMOperatingSystemRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_10_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=';' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_12='languages' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMOperatingSystemAccess().getLanguagesKeyword_4_1_0());
    }
	otherlv_13=':=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMOperatingSystemAccess().getColonEqualsSignKeyword_4_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOperatingSystemRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageCrossReference_4_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_15=',' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMOperatingSystemAccess().getCommaKeyword_4_1_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOperatingSystemRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_17=';' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 2);
	 				}
					({true}?=>(	otherlv_18='supported' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMOperatingSystemAccess().getSupportedKeyword_4_2_0());
    }
	otherlv_19='osapis' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMOperatingSystemAccess().getOsapisKeyword_4_2_1());
    }
	otherlv_20='{' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_4_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAccess().getSupportedOSAPIsMOSSupportedOSAPIParserRuleCall_4_2_3_0()); 
	    }
		lv_supportedOSAPIs_21_0=ruleMOSSupportedOSAPI		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMOperatingSystemRule());
	        }
       		add(
       			$current, 
       			"supportedOSAPIs",
        		lv_supportedOSAPIs_21_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MOSSupportedOSAPI");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_22='}' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_4_2_4());
    }
	otherlv_23=';' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 3);
	 				}
					({true}?=>(	otherlv_24='supported' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMOperatingSystemAccess().getSupportedKeyword_4_3_0());
    }
	otherlv_25='platforms' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMOperatingSystemAccess().getPlatformsKeyword_4_3_1());
    }
	otherlv_26='{' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_4_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAccess().getSupportedPlatformsMOSSupportedPlatformParserRuleCall_4_3_3_0()); 
	    }
		lv_supportedPlatforms_27_0=ruleMOSSupportedPlatform		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMOperatingSystemRule());
	        }
       		add(
       			$current, 
       			"supportedPlatforms",
        		lv_supportedPlatforms_27_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MOSSupportedPlatform");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_28='}' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_4_3_4());
    }
	otherlv_29=';' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4(), 4);
	 				}
					({true}?=>(	otherlv_30='configuration' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMOperatingSystemAccess().getConfigurationKeyword_4_4_0());
    }
	otherlv_31='parameters' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMOperatingSystemAccess().getParametersKeyword_4_4_1());
    }
	otherlv_32='{' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_4_4_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAccess().getParametersMParameterParserRuleCall_4_4_3_0()); 
	    }
		lv_parameters_33_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMOperatingSystemRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_33_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_34='}' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_4_4_4());
    }
	otherlv_35=';' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_4_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4());
	}

)	otherlv_36='}' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_37=';' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMOSSupportedOSAPI
entryRuleMOSSupportedOSAPI returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMOSSupportedOSAPIRule()); }
	 iv_ruleMOSSupportedOSAPI=ruleMOSSupportedOSAPI 
	 { $current=$iv_ruleMOSSupportedOSAPI.current; } 
	 EOF 
;

// Rule MOSSupportedOSAPI
ruleMOSSupportedOSAPI returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='supports' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMOSSupportedOSAPIAccess().getSupportsKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOSSupportedOSAPIRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedOSAPIAccess().getOsapiMOperatingSystemAPICrossReference_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMOSSupportedOSAPIAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedOSAPIAccess().getParameterValueAssignmentsMOSSupportedOSAPIPVAParserRuleCall_3_0()); 
	    }
		lv_parameterValueAssignments_3_0=ruleMOSSupportedOSAPIPVA		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMOSSupportedOSAPIRule());
	        }
       		add(
       			$current, 
       			"parameterValueAssignments",
        		lv_parameterValueAssignments_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MOSSupportedOSAPIPVA");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMOSSupportedOSAPIAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMOSSupportedOSAPIAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMOSSupportedOSAPIPVA
entryRuleMOSSupportedOSAPIPVA returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMOSSupportedOSAPIPVARule()); }
	 iv_ruleMOSSupportedOSAPIPVA=ruleMOSSupportedOSAPIPVA 
	 { $current=$iv_ruleMOSSupportedOSAPIPVA.current; } 
	 EOF 
;

// Rule MOSSupportedOSAPIPVA
ruleMOSSupportedOSAPIPVA returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMOSSupportedOSAPIPVAAccess().getMOSSupportedOSAPIPVAExpressionParserRuleCall_0()); 
    }
    this_MOSSupportedOSAPIPVAExpression_0=ruleMOSSupportedOSAPIPVAExpression
    { 
        $current = $this_MOSSupportedOSAPIPVAExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMOSSupportedOSAPIPVAAccess().getMOSSupportedOSAPIPVASwitchParserRuleCall_1()); 
    }
    this_MOSSupportedOSAPIPVASwitch_1=ruleMOSSupportedOSAPIPVASwitch
    { 
        $current = $this_MOSSupportedOSAPIPVASwitch_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMOSSupportedOSAPIPVAExpression
entryRuleMOSSupportedOSAPIPVAExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMOSSupportedOSAPIPVAExpressionRule()); }
	 iv_ruleMOSSupportedOSAPIPVAExpression=ruleMOSSupportedOSAPIPVAExpression 
	 { $current=$iv_ruleMOSSupportedOSAPIPVAExpression.current; } 
	 EOF 
;

// Rule MOSSupportedOSAPIPVAExpression
ruleMOSSupportedOSAPIPVAExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='parameter' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOSSupportedOSAPIPVAExpressionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterMParameterCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getColonEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_parameterValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMOSSupportedOSAPIPVAExpressionRule());
	        }
       		set(
       			$current, 
       			"parameterValue",
        		lv_parameterValue_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMOSSupportedOSAPIPVASwitch
entryRuleMOSSupportedOSAPIPVASwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMOSSupportedOSAPIPVASwitchRule()); }
	 iv_ruleMOSSupportedOSAPIPVASwitch=ruleMOSSupportedOSAPIPVASwitch 
	 { $current=$iv_ruleMOSSupportedOSAPIPVASwitch.current; } 
	 EOF 
;

// Rule MOSSupportedOSAPIPVASwitch
ruleMOSSupportedOSAPIPVASwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='switch' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getSwitchKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOSSupportedOSAPIPVASwitchRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getParameterMParameterCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getRightParenthesisKeyword_3());
    }
	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getCasesMOSSupportedOSAPIPVASwitchCaseParserRuleCall_5_0()); 
	    }
		lv_cases_5_0=ruleMOSSupportedOSAPIPVASwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMOSSupportedOSAPIPVASwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_5_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MOSSupportedOSAPIPVASwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleMOSSupportedOSAPIPVASwitchCase
entryRuleMOSSupportedOSAPIPVASwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseRule()); }
	 iv_ruleMOSSupportedOSAPIPVASwitchCase=ruleMOSSupportedOSAPIPVASwitchCase 
	 { $current=$iv_ruleMOSSupportedOSAPIPVASwitchCase.current; } 
	 EOF 
;

// Rule MOSSupportedOSAPIPVASwitchCase
ruleMOSSupportedOSAPIPVASwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_parameterValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseRule());
	        }
       		set(
       			$current, 
       			"parameterValue",
        		lv_parameterValue_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMParameter
entryRuleMParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterRule()); }
	 iv_ruleMParameter=ruleMParameter 
	 { $current=$iv_ruleMParameter.current; } 
	 EOF 
;

// Rule MParameter
ruleMParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); 
    }
    this_MIntegerParameterSingleExpression_0=ruleMIntegerParameterSingleExpression
    { 
        $current = $this_MIntegerParameterSingleExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); 
    }
    this_MEnumParameterSingleExpression_1=ruleMEnumParameterSingleExpression
    { 
        $current = $this_MEnumParameterSingleExpression_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); 
    }
    this_MBooleanParameterSingleExpression_2=ruleMBooleanParameterSingleExpression
    { 
        $current = $this_MBooleanParameterSingleExpression_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMRealParameterSingleExpressionParserRuleCall_3()); 
    }
    this_MRealParameterSingleExpression_3=ruleMRealParameterSingleExpression
    { 
        $current = $this_MRealParameterSingleExpression_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMStringParameterSingleExpressionParserRuleCall_4()); 
    }
    this_MStringParameterSingleExpression_4=ruleMStringParameterSingleExpression
    { 
        $current = $this_MStringParameterSingleExpression_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMEnumParameterDefinitionParserRuleCall_5()); 
    }
    this_MEnumParameterDefinition_5=ruleMEnumParameterDefinition
    { 
        $current = $this_MEnumParameterDefinition_5.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMBooleanParamOSSPSwitchParserRuleCall_6()); 
    }
    this_MBooleanParamOSSPSwitch_6=ruleMBooleanParamOSSPSwitch
    { 
        $current = $this_MBooleanParamOSSPSwitch_6.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMStringParamOSSPSwitchParserRuleCall_7()); 
    }
    this_MStringParamOSSPSwitch_7=ruleMStringParamOSSPSwitch
    { 
        $current = $this_MStringParamOSSPSwitch_7.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMIntegerParamOSSPSwitchParserRuleCall_8()); 
    }
    this_MIntegerParamOSSPSwitch_8=ruleMIntegerParamOSSPSwitch
    { 
        $current = $this_MIntegerParamOSSPSwitch_8.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMRealParamOSSPSwitchParserRuleCall_9()); 
    }
    this_MRealParamOSSPSwitch_9=ruleMRealParamOSSPSwitch
    { 
        $current = $this_MRealParamOSSPSwitch_9.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterAccess().getMEnumParamOSSPSwitchParserRuleCall_10()); 
    }
    this_MEnumParamOSSPSwitch_10=ruleMEnumParamOSSPSwitch
    { 
        $current = $this_MEnumParamOSSPSwitch_10.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMBooleanParamOSSPSwitch
entryRuleMBooleanParamOSSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMBooleanParamOSSPSwitchRule()); }
	 iv_ruleMBooleanParamOSSPSwitch=ruleMBooleanParamOSSPSwitch 
	 { $current=$iv_ruleMBooleanParamOSSPSwitch.current; } 
	 EOF 
;

// Rule MBooleanParamOSSPSwitch
ruleMBooleanParamOSSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMBooleanParamOSSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBooleanParamOSSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='boolean' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMBooleanParamOSSPSwitchAccess().getBooleanKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMBooleanParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBooleanParamOSSPSwitchRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_3=':=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMBooleanParamOSSPSwitchAccess().getColonEqualsSignKeyword_3());
    }
	otherlv_4='switch' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMBooleanParamOSSPSwitchAccess().getSwitchKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMBooleanParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMBooleanParamOSSPSwitchAccess().getCasesMBooleanParamOSSPSwitchCaseParserRuleCall_6_0()); 
	    }
		lv_cases_6_0=ruleMBooleanParamOSSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMBooleanParamOSSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_6_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MBooleanParamOSSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMBooleanParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMBooleanParamOSSPSwitchAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMBooleanParamOSSPSwitchCase
entryRuleMBooleanParamOSSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMBooleanParamOSSPSwitchCaseRule()); }
	 iv_ruleMBooleanParamOSSPSwitchCase=ruleMBooleanParamOSSPSwitchCase 
	 { $current=$iv_ruleMBooleanParamOSSPSwitchCase.current; } 
	 EOF 
;

// Rule MBooleanParamOSSPSwitchCase
ruleMBooleanParamOSSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBooleanParamOSSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMBooleanParamOSSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMStringParamOSSPSwitch
entryRuleMStringParamOSSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMStringParamOSSPSwitchRule()); }
	 iv_ruleMStringParamOSSPSwitch=ruleMStringParamOSSPSwitch 
	 { $current=$iv_ruleMStringParamOSSPSwitch.current; } 
	 EOF 
;

// Rule MStringParamOSSPSwitch
ruleMStringParamOSSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMStringParamOSSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMStringParamOSSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='string' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMStringParamOSSPSwitchAccess().getStringKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMStringParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMStringParamOSSPSwitchRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_3=':=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMStringParamOSSPSwitchAccess().getColonEqualsSignKeyword_3());
    }
	otherlv_4='switch' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMStringParamOSSPSwitchAccess().getSwitchKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMStringParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMStringParamOSSPSwitchAccess().getCasesMStringParamOSSPSwitchCaseParserRuleCall_6_0()); 
	    }
		lv_cases_6_0=ruleMStringParamOSSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMStringParamOSSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_6_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MStringParamOSSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMStringParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMStringParamOSSPSwitchAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMStringParamOSSPSwitchCase
entryRuleMStringParamOSSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMStringParamOSSPSwitchCaseRule()); }
	 iv_ruleMStringParamOSSPSwitchCase=ruleMStringParamOSSPSwitchCase 
	 { $current=$iv_ruleMStringParamOSSPSwitchCase.current; } 
	 EOF 
;

// Rule MStringParamOSSPSwitchCase
ruleMStringParamOSSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMStringParamOSSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMStringParamOSSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMStringParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMStringParamOSSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMStringParamOSSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMStringParamOSSPSwitchCaseAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMIntegerParamOSSPSwitch
entryRuleMIntegerParamOSSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMIntegerParamOSSPSwitchRule()); }
	 iv_ruleMIntegerParamOSSPSwitch=ruleMIntegerParamOSSPSwitch 
	 { $current=$iv_ruleMIntegerParamOSSPSwitch.current; } 
	 EOF 
;

// Rule MIntegerParamOSSPSwitch
ruleMIntegerParamOSSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMIntegerParamOSSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIntegerParamOSSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='integer' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMIntegerParamOSSPSwitchAccess().getIntegerKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMIntegerParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIntegerParamOSSPSwitchRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_3=':=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMIntegerParamOSSPSwitchAccess().getColonEqualsSignKeyword_3());
    }
	otherlv_4='switch' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMIntegerParamOSSPSwitchAccess().getSwitchKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMIntegerParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIntegerParamOSSPSwitchAccess().getCasesMIntegerParamOSSPSwitchCaseParserRuleCall_6_0()); 
	    }
		lv_cases_6_0=ruleMIntegerParamOSSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIntegerParamOSSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_6_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MIntegerParamOSSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMIntegerParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMIntegerParamOSSPSwitchAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMIntegerParamOSSPSwitchCase
entryRuleMIntegerParamOSSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMIntegerParamOSSPSwitchCaseRule()); }
	 iv_ruleMIntegerParamOSSPSwitchCase=ruleMIntegerParamOSSPSwitchCase 
	 { $current=$iv_ruleMIntegerParamOSSPSwitchCase.current; } 
	 EOF 
;

// Rule MIntegerParamOSSPSwitchCase
ruleMIntegerParamOSSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIntegerParamOSSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIntegerParamOSSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='range' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getRangeKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); 
	    }
		lv_range_5_0=ruleMParameterRange		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIntegerParamOSSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"range",
        		lv_range_5_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterRange");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMRealParamOSSPSwitch
entryRuleMRealParamOSSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMRealParamOSSPSwitchRule()); }
	 iv_ruleMRealParamOSSPSwitch=ruleMRealParamOSSPSwitch 
	 { $current=$iv_ruleMRealParamOSSPSwitch.current; } 
	 EOF 
;

// Rule MRealParamOSSPSwitch
ruleMRealParamOSSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMRealParamOSSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRealParamOSSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='real' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMRealParamOSSPSwitchAccess().getRealKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMRealParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRealParamOSSPSwitchRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_3=':=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMRealParamOSSPSwitchAccess().getColonEqualsSignKeyword_3());
    }
	otherlv_4='switch' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMRealParamOSSPSwitchAccess().getSwitchKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMRealParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRealParamOSSPSwitchAccess().getCasesMRealParamOSSPSwitchCaseParserRuleCall_6_0()); 
	    }
		lv_cases_6_0=ruleMRealParamOSSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRealParamOSSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_6_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MRealParamOSSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMRealParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMRealParamOSSPSwitchAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMRealParamOSSPSwitchCase
entryRuleMRealParamOSSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMRealParamOSSPSwitchCaseRule()); }
	 iv_ruleMRealParamOSSPSwitchCase=ruleMRealParamOSSPSwitchCase 
	 { $current=$iv_ruleMRealParamOSSPSwitchCase.current; } 
	 EOF 
;

// Rule MRealParamOSSPSwitchCase
ruleMRealParamOSSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMRealParamOSSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRealParamOSSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMRealParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMRealParamOSSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRealParamOSSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='range' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMRealParamOSSPSwitchCaseAccess().getRangeKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0()); 
	    }
		lv_range_5_0=ruleMParameterRange		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRealParamOSSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"range",
        		lv_range_5_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterRange");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMRealParamOSSPSwitchCaseAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMEnumParamOSSPSwitch
entryRuleMEnumParamOSSPSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParamOSSPSwitchRule()); }
	 iv_ruleMEnumParamOSSPSwitch=ruleMEnumParamOSSPSwitch 
	 { $current=$iv_ruleMEnumParamOSSPSwitch.current; } 
	 EOF 
;

// Rule MEnumParamOSSPSwitch
ruleMEnumParamOSSPSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMEnumParamOSSPSwitchAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamOSSPSwitchRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='enum' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamOSSPSwitchRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMEnumParamOSSPSwitchAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamOSSPSwitchRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_4=':=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMEnumParamOSSPSwitchAccess().getColonEqualsSignKeyword_4());
    }
	otherlv_5='switch' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMEnumParamOSSPSwitchAccess().getSwitchKeyword_5());
    }
	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMEnumParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParamOSSPSwitchAccess().getCasesMEnumParamOSSPSwitchCaseParserRuleCall_7_0()); 
	    }
		lv_cases_7_0=ruleMEnumParamOSSPSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParamOSSPSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_7_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MEnumParamOSSPSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMEnumParamOSSPSwitchAccess().getRightCurlyBracketKeyword_8());
    }
	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMEnumParamOSSPSwitchAccess().getSemicolonKeyword_9());
    }
)
;





// Entry rule entryRuleMEnumParamOSSPSwitchCase
entryRuleMEnumParamOSSPSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParamOSSPSwitchCaseRule()); }
	 iv_ruleMEnumParamOSSPSwitchCase=ruleMEnumParamOSSPSwitchCase 
	 { $current=$iv_ruleMEnumParamOSSPSwitchCase.current; } 
	 EOF 
;

// Rule MEnumParamOSSPSwitchCase
ruleMEnumParamOSSPSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamOSSPSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_defaultValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParamOSSPSwitchCaseRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleMParameterWithoutOSSP
entryRuleMParameterWithoutOSSP returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterWithoutOSSPRule()); }
	 iv_ruleMParameterWithoutOSSP=ruleMParameterWithoutOSSP 
	 { $current=$iv_ruleMParameterWithoutOSSP.current; } 
	 EOF 
;

// Rule MParameterWithoutOSSP
ruleMParameterWithoutOSSP returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterWithoutOSSPAccess().getMIntegerParameterSingleExpressionParserRuleCall_0()); 
    }
    this_MIntegerParameterSingleExpression_0=ruleMIntegerParameterSingleExpression
    { 
        $current = $this_MIntegerParameterSingleExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterWithoutOSSPAccess().getMEnumParameterSingleExpressionParserRuleCall_1()); 
    }
    this_MEnumParameterSingleExpression_1=ruleMEnumParameterSingleExpression
    { 
        $current = $this_MEnumParameterSingleExpression_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterWithoutOSSPAccess().getMBooleanParameterSingleExpressionParserRuleCall_2()); 
    }
    this_MBooleanParameterSingleExpression_2=ruleMBooleanParameterSingleExpression
    { 
        $current = $this_MBooleanParameterSingleExpression_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterWithoutOSSPAccess().getMRealParameterSingleExpressionParserRuleCall_3()); 
    }
    this_MRealParameterSingleExpression_3=ruleMRealParameterSingleExpression
    { 
        $current = $this_MRealParameterSingleExpression_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterWithoutOSSPAccess().getMStringParameterSingleExpressionParserRuleCall_4()); 
    }
    this_MStringParameterSingleExpression_4=ruleMStringParameterSingleExpression
    { 
        $current = $this_MStringParameterSingleExpression_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterWithoutOSSPAccess().getMEnumParameterDefinitionParserRuleCall_5()); 
    }
    this_MEnumParameterDefinition_5=ruleMEnumParameterDefinition
    { 
        $current = $this_MEnumParameterDefinition_5.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMIntegerParameterSingleExpression
entryRuleMIntegerParameterSingleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMIntegerParameterSingleExpressionRule()); }
	 iv_ruleMIntegerParameterSingleExpression=ruleMIntegerParameterSingleExpression 
	 { $current=$iv_ruleMIntegerParameterSingleExpression.current; } 
	 EOF 
;

// Rule MIntegerParameterSingleExpression
ruleMIntegerParameterSingleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIntegerParameterSingleExpressionRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='integer' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIntegerParameterSingleExpressionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_3=':=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
	    }
		lv_defaultValue_4_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIntegerParameterSingleExpressionRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_4_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5='range' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); 
	    }
		lv_range_6_0=ruleMParameterRange		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIntegerParameterSingleExpressionRule());
	        }
       		set(
       			$current, 
       			"range",
        		lv_range_6_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterRange");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleMEnumParameterDefinition
entryRuleMEnumParameterDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParameterDefinitionRule()); }
	 iv_ruleMEnumParameterDefinition=ruleMEnumParameterDefinition 
	 { $current=$iv_ruleMEnumParameterDefinition.current; } 
	 EOF 
;

// Rule MEnumParameterDefinition
ruleMEnumParameterDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='enum' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParameterDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_3_0()); 
	    }
		lv_literals_3_0=ruleMEnumParameterLiteralRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParameterDefinitionRule());
	        }
       		add(
       			$current, 
       			"literals",
        		lv_literals_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MEnumParameterLiteralRule");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_1_0()); 
	    }
		lv_literals_5_0=ruleMEnumParameterLiteralRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParameterDefinitionRule());
	        }
       		add(
       			$current, 
       			"literals",
        		lv_literals_5_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MEnumParameterLiteralRule");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMEnumParameterDefinitionAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleMEnumParameterSingleExpression
entryRuleMEnumParameterSingleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParameterSingleExpressionRule()); }
	 iv_ruleMEnumParameterSingleExpression=ruleMEnumParameterSingleExpression 
	 { $current=$iv_ruleMEnumParameterSingleExpression.current; } 
	 EOF 
;

// Rule MEnumParameterSingleExpression
ruleMEnumParameterSingleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParameterSingleExpressionRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='enum' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParameterSingleExpressionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParameterSingleExpressionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_4=':=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_5_0()); 
	    }
		lv_defaultValue_5_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParameterSingleExpressionRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_5_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleMRealParameterSingleExpression
entryRuleMRealParameterSingleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMRealParameterSingleExpressionRule()); }
	 iv_ruleMRealParameterSingleExpression=ruleMRealParameterSingleExpression 
	 { $current=$iv_ruleMRealParameterSingleExpression.current; } 
	 EOF 
;

// Rule MRealParameterSingleExpression
ruleMRealParameterSingleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMRealParameterSingleExpressionAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRealParameterSingleExpressionRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='real' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMRealParameterSingleExpressionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_3=':=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
	    }
		lv_defaultValue_4_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRealParameterSingleExpressionRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_4_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5='range' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0()); 
	    }
		lv_range_6_0=ruleMParameterRange		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMRealParameterSingleExpressionRule());
	        }
       		set(
       			$current, 
       			"range",
        		lv_range_6_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterRange");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleMEnumParameterLiteralRule
entryRuleMEnumParameterLiteralRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleRule()); }
	 iv_ruleMEnumParameterLiteralRule=ruleMEnumParameterLiteralRule 
	 { $current=$iv_ruleMEnumParameterLiteralRule.current; } 
	 EOF 
;

// Rule MEnumParameterLiteralRule
ruleMEnumParameterLiteralRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParameterLiteralParserRuleCall_0()); 
    }
    this_MEnumParameterLiteral_0=ruleMEnumParameterLiteral
    { 
        $current = $this_MEnumParameterLiteral_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamIntegerLiteralParserRuleCall_1()); 
    }
    this_MEnumParamIntegerLiteral_1=ruleMEnumParamIntegerLiteral
    { 
        $current = $this_MEnumParamIntegerLiteral_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamRealLiteralParserRuleCall_2()); 
    }
    this_MEnumParamRealLiteral_2=ruleMEnumParamRealLiteral
    { 
        $current = $this_MEnumParamRealLiteral_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamStringLiteralRegularParserRuleCall_3()); 
    }
    this_MEnumParamStringLiteralRegular_3=ruleMEnumParamStringLiteralRegular
    { 
        $current = $this_MEnumParamStringLiteralRegular_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMEnumParameterLiteral
entryRuleMEnumParameterLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParameterLiteralRule()); }
	 iv_ruleMEnumParameterLiteral=ruleMEnumParameterLiteral 
	 { $current=$iv_ruleMEnumParameterLiteral.current; } 
	 EOF 
;

// Rule MEnumParameterLiteral
ruleMEnumParameterLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0(),
            $current);
    }
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMEnumParameterLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParameterLiteralRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
))
;





// Entry rule entryRuleMEnumParamIntegerLiteral
entryRuleMEnumParamIntegerLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParamIntegerLiteralRule()); }
	 iv_ruleMEnumParamIntegerLiteral=ruleMEnumParamIntegerLiteral 
	 { $current=$iv_ruleMEnumParamIntegerLiteral.current; } 
	 EOF 
;

// Rule MEnumParamIntegerLiteral
ruleMEnumParamIntegerLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0(),
            $current);
    }
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMEnumParamIntegerLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamIntegerLiteralRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMEnumParamIntegerLiteralAccess().getEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParamIntegerLiteralAccess().getValueINTEGERParserRuleCall_3_0()); 
	    }
		lv_value_3_0=ruleINTEGER		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParamIntegerLiteralRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.INTEGER");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMEnumParamRealLiteral
entryRuleMEnumParamRealLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParamRealLiteralRule()); }
	 iv_ruleMEnumParamRealLiteral=ruleMEnumParamRealLiteral 
	 { $current=$iv_ruleMEnumParamRealLiteral.current; } 
	 EOF 
;

// Rule MEnumParamRealLiteral
ruleMEnumParamRealLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0(),
            $current);
    }
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMEnumParamRealLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamRealLiteralRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMEnumParamRealLiteralAccess().getEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParamRealLiteralAccess().getValueREALParserRuleCall_3_0()); 
	    }
		lv_value_3_0=ruleREAL		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParamRealLiteralRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.REAL");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMEnumParamStringLiteralRegular
entryRuleMEnumParamStringLiteralRegular returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParamStringLiteralRegularRule()); }
	 iv_ruleMEnumParamStringLiteralRegular=ruleMEnumParamStringLiteralRegular 
	 { $current=$iv_ruleMEnumParamStringLiteralRegular.current; } 
	 EOF 
;

// Rule MEnumParamStringLiteralRegular
ruleMEnumParamStringLiteralRegular returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMEnumParamStringLiteralRegularAccess().getMEnumParamStringLiteralAction_0(),
            $current);
    }
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMEnumParamStringLiteralRegularAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamStringLiteralRegularRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMEnumParamStringLiteralRegularAccess().getEqualsSignKeyword_2());
    }
(
(
		lv_isRaw_3_0=	'raw' 
    {
        newLeafNode(lv_isRaw_3_0, grammarAccess.getMEnumParamStringLiteralRegularAccess().getIsRawRawKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamStringLiteralRegularRule());
	        }
       		setWithLastConsumed($current, "isRaw", true, "raw");
	    }

)
)?(
(
		lv_value_4_0=RULE_STRING
		{
			newLeafNode(lv_value_4_0, grammarAccess.getMEnumParamStringLiteralRegularAccess().getValueSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamStringLiteralRegularRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_4_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
))
;





// Entry rule entryRuleMBooleanParameterSingleExpression
entryRuleMBooleanParameterSingleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMBooleanParameterSingleExpressionRule()); }
	 iv_ruleMBooleanParameterSingleExpression=ruleMBooleanParameterSingleExpression 
	 { $current=$iv_ruleMBooleanParameterSingleExpression.current; } 
	 EOF 
;

// Rule MBooleanParameterSingleExpression
ruleMBooleanParameterSingleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBooleanParameterSingleExpressionRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='boolean' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMBooleanParameterSingleExpressionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_3=':=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
	    }
		lv_defaultValue_4_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMBooleanParameterSingleExpressionRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_4_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMStringParameterSingleExpression
entryRuleMStringParameterSingleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMStringParameterSingleExpressionRule()); }
	 iv_ruleMStringParameterSingleExpression=ruleMStringParameterSingleExpression 
	 { $current=$iv_ruleMStringParameterSingleExpression.current; } 
	 EOF 
;

// Rule MStringParameterSingleExpression
ruleMStringParameterSingleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_constant_0_0=	'const' 
    {
        newLeafNode(lv_constant_0_0, grammarAccess.getMStringParameterSingleExpressionAccess().getConstantConstKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMStringParameterSingleExpressionRule());
	        }
       		setWithLastConsumed($current, "constant", true, "const");
	    }

)
)?	otherlv_1='string' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMStringParameterSingleExpressionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_3=':=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0()); 
	    }
		lv_defaultValue_4_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMStringParameterSingleExpressionRule());
	        }
       		set(
       			$current, 
       			"defaultValue",
        		lv_defaultValue_4_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMParameterValue
entryRuleMParameterValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterValueRule()); }
	 iv_ruleMParameterValue=ruleMParameterValue 
	 { $current=$iv_ruleMParameterValue.current; } 
	 EOF 
;

// Rule MParameterValue
ruleMParameterValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterValueAccess().getMParameterValueLiteralParserRuleCall_0()); 
    }
    this_MParameterValueLiteral_0=ruleMParameterValueLiteral
    { 
        $current = $this_MParameterValueLiteral_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterValueAccess().getMParameterValueRefObjectParserRuleCall_1()); 
    }
    this_MParameterValueRefObject_1=ruleMParameterValueRefObject
    { 
        $current = $this_MParameterValueRefObject_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterValueAccess().getMParameterValuePARParserRuleCall_2()); 
    }
    this_MParameterValuePAR_2=ruleMParameterValuePAR
    { 
        $current = $this_MParameterValuePAR_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMParameterValueLiteral
entryRuleMParameterValueLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterValueLiteralRule()); }
	 iv_ruleMParameterValueLiteral=ruleMParameterValueLiteral 
	 { $current=$iv_ruleMParameterValueLiteral.current; } 
	 EOF 
;

// Rule MParameterValueLiteral
ruleMParameterValueLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueBooleanLiteralParserRuleCall_0()); 
    }
    this_MParameterValueBooleanLiteral_0=ruleMParameterValueBooleanLiteral
    { 
        $current = $this_MParameterValueBooleanLiteral_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueStringLiteralParserRuleCall_1()); 
    }
    this_MParameterValueStringLiteral_1=ruleMParameterValueStringLiteral
    { 
        $current = $this_MParameterValueStringLiteral_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueIntegerLiteralParserRuleCall_2()); 
    }
    this_MParameterValueIntegerLiteral_2=ruleMParameterValueIntegerLiteral
    { 
        $current = $this_MParameterValueIntegerLiteral_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterValueLiteralAccess().getMParameterValueRealLiteralParserRuleCall_3()); 
    }
    this_MParameterValueRealLiteral_3=ruleMParameterValueRealLiteral
    { 
        $current = $this_MParameterValueRealLiteral_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMParameterValueBooleanLiteral
entryRuleMParameterValueBooleanLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterValueBooleanLiteralRule()); }
	 iv_ruleMParameterValueBooleanLiteral=ruleMParameterValueBooleanLiteral 
	 { $current=$iv_ruleMParameterValueBooleanLiteral.current; } 
	 EOF 
;

// Rule MParameterValueBooleanLiteral
ruleMParameterValueBooleanLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueEBooleanParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterValueBooleanLiteralRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMParameterValueStringLiteral
entryRuleMParameterValueStringLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterValueStringLiteralRule()); }
	 iv_ruleMParameterValueStringLiteral=ruleMParameterValueStringLiteral 
	 { $current=$iv_ruleMParameterValueStringLiteral.current; } 
	 EOF 
;

// Rule MParameterValueStringLiteral
ruleMParameterValueStringLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0(),
            $current);
    }
)(
(
		lv_isRaw_1_0=	'raw' 
    {
        newLeafNode(lv_isRaw_1_0, grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMParameterValueStringLiteralRule());
	        }
       		setWithLastConsumed($current, "isRaw", true, "raw");
	    }

)
)?(
(
		lv_value_2_0=RULE_STRING
		{
			newLeafNode(lv_value_2_0, grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMParameterValueStringLiteralRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
))
;





// Entry rule entryRuleMParameterValueIntegerLiteral
entryRuleMParameterValueIntegerLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterValueIntegerLiteralRule()); }
	 iv_ruleMParameterValueIntegerLiteral=ruleMParameterValueIntegerLiteral 
	 { $current=$iv_ruleMParameterValueIntegerLiteral.current; } 
	 EOF 
;

// Rule MParameterValueIntegerLiteral
ruleMParameterValueIntegerLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueINTEGERParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleINTEGER		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterValueIntegerLiteralRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.INTEGER");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMParameterValueRealLiteral
entryRuleMParameterValueRealLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterValueRealLiteralRule()); }
	 iv_ruleMParameterValueRealLiteral=ruleMParameterValueRealLiteral 
	 { $current=$iv_ruleMParameterValueRealLiteral.current; } 
	 EOF 
;

// Rule MParameterValueRealLiteral
ruleMParameterValueRealLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterValueRealLiteralAccess().getValueREALParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleREAL		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterValueRealLiteralRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.REAL");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMParameterValueRefObject
entryRuleMParameterValueRefObject returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterValueRefObjectRule()); }
	 iv_ruleMParameterValueRefObject=ruleMParameterValueRefObject 
	 { $current=$iv_ruleMParameterValueRefObject.current; } 
	 EOF 
;

// Rule MParameterValueRefObject
ruleMParameterValueRefObject returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0(),
            $current);
    }
)(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMParameterValueRefObjectRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMParameterValuePAR
entryRuleMParameterValuePAR returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterValuePARRule()); }
	 iv_ruleMParameterValuePAR=ruleMParameterValuePAR 
	 { $current=$iv_ruleMParameterValuePAR.current; } 
	 EOF 
;

// Rule MParameterValuePAR
ruleMParameterValuePAR returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterValuePARAccess().getValueMParameterValueExpressionParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterValuePARRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMParameterValuePARAccess().getRightParenthesisKeyword_2());
    }
)
;





// Entry rule entryRuleMParameterValueExpression
entryRuleMParameterValueExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterValueExpressionRule()); }
	 iv_ruleMParameterValueExpression=ruleMParameterValueExpression 
	 { $current=$iv_ruleMParameterValueExpression.current; } 
	 EOF 
;

// Rule MParameterValueExpression
ruleMParameterValueExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMParameterValueExpressionAccess().getMParameterValueExpressionAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0()); 
	    }
		lv_left_1_0=ruleMParameterValueTERM		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterValueExpressionRule());
	        }
       		set(
       			$current, 
       			"left",
        		lv_left_1_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueTERM");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0()); 
	    }
		lv_operation_2_0=ruleMParameterValueExpressionOperators		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterValueExpressionRule());
	        }
       		set(
       			$current, 
       			"operation",
        		lv_operation_2_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpressionOperators");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterValueExpressionAccess().getRightMParameterValueExpressionParserRuleCall_2_1_0()); 
	    }
		lv_right_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterValueExpressionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleMParameterValueTERM
entryRuleMParameterValueTERM returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterValueTERMRule()); }
	 iv_ruleMParameterValueTERM=ruleMParameterValueTERM 
	 { $current=$iv_ruleMParameterValueTERM.current; } 
	 EOF 
;

// Rule MParameterValueTERM
ruleMParameterValueTERM returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMParameterValueTERMAccess().getMParameterValueTERMAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0()); 
	    }
		lv_left_1_0=ruleMParameterValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterValueTERMRule());
	        }
       		set(
       			$current, 
       			"left",
        		lv_left_1_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValue");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0()); 
	    }
		lv_operation_2_0=ruleMParameterValueTERMOperators		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterValueTERMRule());
	        }
       		set(
       			$current, 
       			"operation",
        		lv_operation_2_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueTERMOperators");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterValueTERMAccess().getRightMParameterValueTERMParserRuleCall_2_1_0()); 
	    }
		lv_right_3_0=ruleMParameterValueTERM		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterValueTERMRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueTERM");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleMParameterRange
entryRuleMParameterRange returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterRangeRule()); }
	 iv_ruleMParameterRange=ruleMParameterRange 
	 { $current=$iv_ruleMParameterRange.current; } 
	 EOF 
;

// Rule MParameterRange
ruleMParameterRange returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterRangeAccess().getMParameterOCRParserRuleCall_0()); 
    }
    this_MParameterOCR_0=ruleMParameterOCR
    { 
        $current = $this_MParameterOCR_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterRangeAccess().getMParameterOORParserRuleCall_1()); 
    }
    this_MParameterOOR_1=ruleMParameterOOR
    { 
        $current = $this_MParameterOOR_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterRangeAccess().getMParameterCORParserRuleCall_2()); 
    }
    this_MParameterCOR_2=ruleMParameterCOR
    { 
        $current = $this_MParameterCOR_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMParameterRangeAccess().getMParameterCCRParserRuleCall_3()); 
    }
    this_MParameterCCR_3=ruleMParameterCCR
    { 
        $current = $this_MParameterCCR_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMParameterOCR
entryRuleMParameterOCR returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterOCRRule()); }
	 iv_ruleMParameterOCR=ruleMParameterOCR 
	 { $current=$iv_ruleMParameterOCR.current; } 
	 EOF 
;

// Rule MParameterOCR
ruleMParameterOCR returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0(),
            $current);
    }
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMParameterOCRAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterOCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
	    }
		lv_lowerValue_2_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterOCRRule());
	        }
       		set(
       			$current, 
       			"lowerValue",
        		lv_lowerValue_2_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMParameterOCRAccess().getCommaKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterOCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
	    }
		lv_upperValue_4_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterOCRRule());
	        }
       		set(
       			$current, 
       			"upperValue",
        		lv_upperValue_4_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=']' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMParameterOCRAccess().getRightSquareBracketKeyword_5());
    }
)
;





// Entry rule entryRuleMParameterOOR
entryRuleMParameterOOR returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterOORRule()); }
	 iv_ruleMParameterOOR=ruleMParameterOOR 
	 { $current=$iv_ruleMParameterOOR.current; } 
	 EOF 
;

// Rule MParameterOOR
ruleMParameterOOR returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMParameterOORAccess().getMParameterOORAction_0(),
            $current);
    }
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMParameterOORAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterOORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
	    }
		lv_lowerValue_2_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterOORRule());
	        }
       		set(
       			$current, 
       			"lowerValue",
        		lv_lowerValue_2_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMParameterOORAccess().getCommaKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterOORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
	    }
		lv_upperValue_4_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterOORRule());
	        }
       		set(
       			$current, 
       			"upperValue",
        		lv_upperValue_4_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMParameterOORAccess().getRightParenthesisKeyword_5());
    }
)
;





// Entry rule entryRuleMParameterCOR
entryRuleMParameterCOR returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterCORRule()); }
	 iv_ruleMParameterCOR=ruleMParameterCOR 
	 { $current=$iv_ruleMParameterCOR.current; } 
	 EOF 
;

// Rule MParameterCOR
ruleMParameterCOR returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMParameterCORAccess().getMParameterCORAction_0(),
            $current);
    }
)	otherlv_1='[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMParameterCORAccess().getLeftSquareBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterCORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
	    }
		lv_lowerValue_2_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterCORRule());
	        }
       		set(
       			$current, 
       			"lowerValue",
        		lv_lowerValue_2_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMParameterCORAccess().getCommaKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterCORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
	    }
		lv_upperValue_4_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterCORRule());
	        }
       		set(
       			$current, 
       			"upperValue",
        		lv_upperValue_4_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMParameterCORAccess().getRightParenthesisKeyword_5());
    }
)
;





// Entry rule entryRuleMParameterCCR
entryRuleMParameterCCR returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterCCRRule()); }
	 iv_ruleMParameterCCR=ruleMParameterCCR 
	 { $current=$iv_ruleMParameterCCR.current; } 
	 EOF 
;

// Rule MParameterCCR
ruleMParameterCCR returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0(),
            $current);
    }
)	otherlv_1='[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMParameterCCRAccess().getLeftSquareBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterCCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0()); 
	    }
		lv_lowerValue_2_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterCCRRule());
	        }
       		set(
       			$current, 
       			"lowerValue",
        		lv_lowerValue_2_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMParameterCCRAccess().getCommaKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterCCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0()); 
	    }
		lv_upperValue_4_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterCCRRule());
	        }
       		set(
       			$current, 
       			"upperValue",
        		lv_upperValue_4_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=']' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMParameterCCRAccess().getRightSquareBracketKeyword_5());
    }
)
;





// Entry rule entryRuleMOperatingSystemAPI
entryRuleMOperatingSystemAPI returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMOperatingSystemAPIRule()); }
	 iv_ruleMOperatingSystemAPI=ruleMOperatingSystemAPI 
	 { $current=$iv_ruleMOperatingSystemAPI.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MOperatingSystemAPI
ruleMOperatingSystemAPI returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='osapi' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMOperatingSystemAPIAccess().getOsapiKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMOperatingSystemAPIAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOperatingSystemAPIRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)(	otherlv_2='inherits' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMOperatingSystemAPIAccess().getInheritsKeyword_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOperatingSystemAPIRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPICrossReference_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMOperatingSystemAPIAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOperatingSystemAPIRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPICrossReference_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMOperatingSystemAPIAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_8='version' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMOperatingSystemAPIAccess().getVersionKeyword_4_0_0());
    }
	otherlv_9=':=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMOperatingSystemAPIAccess().getColonEqualsSignKeyword_4_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAPIAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
	    }
		lv_version_10_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMOperatingSystemAPIRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_10_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=';' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_4_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_12='language' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMOperatingSystemAPIAccess().getLanguageKeyword_4_1_0());
    }
	otherlv_13=':=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMOperatingSystemAPIAccess().getColonEqualsSignKeyword_4_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOperatingSystemAPIRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAPIAccess().getLanguageMLanguageCrossReference_4_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_4_1_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4(), 2);
	 				}
					({true}?=>(	otherlv_16='configuration' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMOperatingSystemAPIAccess().getConfigurationKeyword_4_2_0());
    }
	otherlv_17='parameters' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMOperatingSystemAPIAccess().getParametersKeyword_4_2_1());
    }
	otherlv_18='{' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMOperatingSystemAPIAccess().getLeftCurlyBracketKeyword_4_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMOperatingSystemAPIAccess().getParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0()); 
	    }
		lv_parameters_19_0=ruleMParameterWithoutOSSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMOperatingSystemAPIRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_19_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterWithoutOSSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_20='}' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMOperatingSystemAPIAccess().getRightCurlyBracketKeyword_4_2_4());
    }
	otherlv_21=';' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_4_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4());
	}

)	otherlv_22='}' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMOperatingSystemAPIAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_23=';' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMDevice
entryRuleMDevice returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDeviceAccess().getUnorderedGroup_3()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMDeviceRule()); }
	 iv_ruleMDevice=ruleMDevice 
	 { $current=$iv_ruleMDevice.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MDevice
ruleMDevice returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMDeviceAccess().getUnorderedGroup_3()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='device' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMDeviceAccess().getDeviceKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMDeviceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMDeviceAccess().getLeftCurlyBracketKeyword_2());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMDeviceAccess().getUnorderedGroup_3());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeviceAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeviceAccess().getUnorderedGroup_3(), 0);
	 				}
					({true}?=>(	otherlv_4='version' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMDeviceAccess().getVersionKeyword_3_0_0());
    }
	otherlv_5=':=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMDeviceAccess().getColonEqualsSignKeyword_3_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDeviceAccess().getVersionVersionParserRuleCall_3_0_2_0()); 
	    }
		lv_version_6_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDeviceRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_6_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMDeviceAccess().getSemicolonKeyword_3_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeviceAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMDeviceAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMDeviceAccess().getUnorderedGroup_3(), 1);
	 				}
					({true}?=>(	otherlv_8='configuration' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMDeviceAccess().getConfigurationKeyword_3_1_0());
    }
	otherlv_9='parameters' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMDeviceAccess().getParametersKeyword_3_1_1());
    }
	otherlv_10='{' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMDeviceAccess().getLeftCurlyBracketKeyword_3_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMDeviceAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_1_3_0()); 
	    }
		lv_parameters_11_0=ruleMParameterWithoutOSSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMDeviceRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_11_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterWithoutOSSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMDeviceAccess().getRightCurlyBracketKeyword_3_1_4());
    }
	otherlv_13=';' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMDeviceAccess().getSemicolonKeyword_3_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMDeviceAccess().getUnorderedGroup_3());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMDeviceAccess().getUnorderedGroup_3())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMDeviceAccess().getUnorderedGroup_3());
	}

)	otherlv_14='}' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMDeviceAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMDeviceAccess().getSemicolonKeyword_5());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMArchitecture
entryRuleMArchitecture returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMArchitectureAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMArchitectureRule()); }
	 iv_ruleMArchitecture=ruleMArchitecture 
	 { $current=$iv_ruleMArchitecture.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MArchitecture
ruleMArchitecture returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMArchitectureAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='architecture' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMArchitectureAccess().getArchitectureKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMArchitectureAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMArchitectureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)(	otherlv_2='extends' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMArchitectureAccess().getExtendsKeyword_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMArchitectureRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMArchitectureAccess().getExtendsMArchitectureCrossReference_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMArchitectureAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMArchitectureRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMArchitectureAccess().getExtendsMArchitectureCrossReference_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMArchitectureAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_8='version' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMArchitectureAccess().getVersionKeyword_4_0_0());
    }
	otherlv_9=':=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMArchitectureAccess().getColonEqualsSignKeyword_4_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMArchitectureAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
	    }
		lv_version_10_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMArchitectureRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_10_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=';' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMArchitectureAccess().getSemicolonKeyword_4_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_12='configuration' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMArchitectureAccess().getConfigurationKeyword_4_1_0());
    }
	otherlv_13='parameters' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMArchitectureAccess().getParametersKeyword_4_1_1());
    }
	otherlv_14='{' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMArchitectureAccess().getLeftCurlyBracketKeyword_4_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMArchitectureAccess().getParametersMParameterWithoutOSSPParserRuleCall_4_1_3_0()); 
	    }
		lv_parameters_15_0=ruleMParameterWithoutOSSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMArchitectureRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_15_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterWithoutOSSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_16='}' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMArchitectureAccess().getRightCurlyBracketKeyword_4_1_4());
    }
	otherlv_17=';' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMArchitectureAccess().getSemicolonKeyword_4_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMArchitectureAccess().getUnorderedGroup_4());
	}

)	otherlv_18='}' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMArchitectureAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_19=';' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMArchitectureAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMOSSupportedPlatform
entryRuleMOSSupportedPlatform returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMOSSupportedPlatformRule()); }
	 iv_ruleMOSSupportedPlatform=ruleMOSSupportedPlatform 
	 { $current=$iv_ruleMOSSupportedPlatform.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MOSSupportedPlatform
ruleMOSSupportedPlatform returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMOSSupportedPlatformAccess().getMOSSupportedPlatformAction_0(),
            $current);
    }
)	otherlv_1='supported' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMOSSupportedPlatformAccess().getSupportedKeyword_1());
    }
	otherlv_2='platform' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMOSSupportedPlatformAccess().getPlatformKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMOSSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOSSupportedPlatformRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMOSSupportedPlatformAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_6='architecture' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMOSSupportedPlatformAccess().getArchitectureKeyword_5_0_0());
    }
	otherlv_7=':=' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOSSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_0_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_10='compiler' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMOSSupportedPlatformAccess().getCompilerKeyword_5_1_0());
    }
	otherlv_11=':=' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOSSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_13=';' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_1_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_14='microprocessor' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorKeyword_5_2_0());
    }
	otherlv_15=':=' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1());
    }
(	otherlv_16='any' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMOSSupportedPlatformAccess().getAnyKeyword_5_2_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOSSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_2_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_19='board' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMOSSupportedPlatformAccess().getBoardKeyword_5_3_0());
    }
	otherlv_20=':=' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1());
    }
(	otherlv_21='any' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMOSSupportedPlatformAccess().getAnyKeyword_5_3_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOSSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedPlatformAccess().getBoardMBoardCrossReference_5_3_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_23=';' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_3_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 4);
	 				}
					({true}?=>(	otherlv_24='languages' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMOSSupportedPlatformAccess().getLanguagesKeyword_5_4_0());
    }
	otherlv_25=':=' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOSSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_4_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_27=',' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMOSSupportedPlatformAccess().getCommaKeyword_5_4_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMOSSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_4_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_29=';' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_4_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5(), 5);
	 				}
					({true}?=>(	otherlv_30='configuration' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMOSSupportedPlatformAccess().getConfigurationKeyword_5_5_0());
    }
	otherlv_31='parameters' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMOSSupportedPlatformAccess().getParametersKeyword_5_5_1());
    }
	otherlv_32='{' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMOSSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_5_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMOSSupportedPlatformAccess().getParametersMParameterWithoutOSSPParserRuleCall_5_5_3_0()); 
	    }
		lv_parameters_33_0=ruleMParameterWithoutOSSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMOSSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_33_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterWithoutOSSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_34='}' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMOSSupportedPlatformAccess().getRightCurlyBracketKeyword_5_5_4());
    }
	otherlv_35=';' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_5_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5());
	}

)	otherlv_36='}' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMOSSupportedPlatformAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_37=';' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMPlatform
entryRuleMPlatform returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMPlatformAccess().getUnorderedGroup_3()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMPlatformRule()); }
	 iv_ruleMPlatform=ruleMPlatform 
	 { $current=$iv_ruleMPlatform.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MPlatform
ruleMPlatform returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMPlatformAccess().getUnorderedGroup_3()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='platform' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMPlatformAccess().getPlatformKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMPlatformAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMPlatformAccess().getLeftCurlyBracketKeyword_2());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 0);
	 				}
					({true}?=>(	otherlv_4='version' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMPlatformAccess().getVersionKeyword_3_0_0());
    }
	otherlv_5=':=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMPlatformAccess().getVersionVersionParserRuleCall_3_0_2_0()); 
	    }
		lv_version_6_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMPlatformRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_6_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 1);
	 				}
					({true}?=>(	otherlv_8='osapi' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMPlatformAccess().getOsapiKeyword_3_1_0());
    }
	otherlv_9=':=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPlatformAccess().getOsapiMOperatingSystemAPICrossReference_3_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=';' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_1_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 2);
	 				}
					({true}?=>(	otherlv_12='os' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMPlatformAccess().getOsKeyword_3_2_0());
    }
	otherlv_13=':=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_2_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPlatformAccess().getOsMOperatingSystemCrossReference_3_2_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_2_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 3);
	 				}
					({true}?=>(	otherlv_16='architecture' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMPlatformAccess().getArchitectureKeyword_3_3_0());
    }
	otherlv_17=':=' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_3_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPlatformAccess().getArchitectureMArchitectureCrossReference_3_3_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_19=';' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_3_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 4);
	 				}
					({true}?=>(	otherlv_20='compiler' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMPlatformAccess().getCompilerKeyword_3_4_0());
    }
	otherlv_21=':=' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_4_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPlatformAccess().getCompilerMCompilerCrossReference_3_4_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_23=';' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_4_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 5);
	 				}
					({true}?=>(	otherlv_24='microprocessor' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMPlatformAccess().getMicroprocessorKeyword_3_5_0());
    }
	otherlv_25=':=' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_5_1());
    }
(	otherlv_26='any' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMPlatformAccess().getAnyKeyword_3_5_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_3_5_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_28=';' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_5_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 6);
	 				}
					({true}?=>(	otherlv_29='board' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMPlatformAccess().getBoardKeyword_3_6_0());
    }
	otherlv_30=':=' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_6_1());
    }
(	otherlv_31='any' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMPlatformAccess().getAnyKeyword_3_6_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPlatformAccess().getBoardMBoardCrossReference_3_6_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_33=';' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_6_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformAccess().getUnorderedGroup_3(), 7);
	 				}
					({true}?=>(	otherlv_34='configuration' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMPlatformAccess().getConfigurationKeyword_3_7_0());
    }
	otherlv_35='parameters' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMPlatformAccess().getParametersKeyword_3_7_1());
    }
	otherlv_36='{' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMPlatformAccess().getLeftCurlyBracketKeyword_3_7_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMPlatformAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_7_3_0()); 
	    }
		lv_parameters_37_0=ruleMParameterWithoutOSSP		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMPlatformRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_37_0, 
        		"es.uah.aut.srg.micobs.lang.PDL.MParameterWithoutOSSP");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_38='}' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getMPlatformAccess().getRightCurlyBracketKeyword_3_7_4());
    }
	otherlv_39=';' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_7_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMPlatformAccess().getUnorderedGroup_3())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMPlatformAccess().getUnorderedGroup_3());
	}

)	otherlv_40='}' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMPlatformAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_41=';' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMPlatformAccess().getSemicolonKeyword_5());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleEBoolean
entryRuleEBoolean returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEBooleanRule()); } 
	 iv_ruleEBoolean=ruleEBoolean 
	 { $current=$iv_ruleEBoolean.current.getText(); }  
	 EOF 
;

// Rule EBoolean
ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='true' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
    }

    |
	kw='false' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleINTEGER
entryRuleINTEGER returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getINTEGERRule()); } 
	 iv_ruleINTEGER=ruleINTEGER 
	 { $current=$iv_ruleINTEGER.current.getText(); }  
	 EOF 
;

// Rule INTEGER
ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); 
    }
)
    |    this_HEXADECIMAL_2=RULE_HEXADECIMAL    {
		$current.merge(this_HEXADECIMAL_2);
    }

    { 
    newLeafNode(this_HEXADECIMAL_2, grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleREAL
entryRuleREAL returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getREALRule()); } 
	 iv_ruleREAL=ruleREAL 
	 { $current=$iv_ruleREAL.current.getText(); }  
	 EOF 
;

// Rule REAL
ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_0()); 
    }
)?(    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0()); 
    }

	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1_1()); 
    }
    this_INT_3=RULE_INT    {
		$current.merge(this_INT_3);
    }

    { 
    newLeafNode(this_INT_3, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2()); 
    }
)(
	kw='e' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getREALAccess().getEKeyword_2_0()); 
    }
(
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1()); 
    }
)?    this_INT_6=RULE_INT    {
		$current.merge(this_INT_6);
    }

    { 
    newLeafNode(this_INT_6, grammarAccess.getREALAccess().getINTTerminalRuleCall_2_2()); 
    }
)?)
    ;





// Rule MParameterValueExpressionOperators
ruleMParameterValueExpressionOperators returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='+' 
	{
        $current = grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueExpressionOperatorsAccess().getPlusEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='-' 
	{
        $current = grammarAccess.getMParameterValueExpressionOperatorsAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMParameterValueExpressionOperatorsAccess().getMinusEnumLiteralDeclaration_1()); 
    }
));



// Rule MParameterValueTERMOperators
ruleMParameterValueTERMOperators returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='*' 
	{
        $current = grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMParameterValueTERMOperatorsAccess().getMultEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='/' 
	{
        $current = grammarAccess.getMParameterValueTERMOperatorsAccess().getDivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMParameterValueTERMOperatorsAccess().getDivEnumLiteralDeclaration_1()); 
    }
));



RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


