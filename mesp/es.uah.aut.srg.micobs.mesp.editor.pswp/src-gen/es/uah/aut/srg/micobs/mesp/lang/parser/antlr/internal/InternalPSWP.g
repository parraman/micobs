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
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
	
}

@lexer::header {
package es.uah.aut.srg.micobs.mesp.lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.mesp.lang.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.micobs.mesp.lang.services.PSWPGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private PSWPGrammarAccess grammarAccess;
 	
    public InternalPSWPParser(TokenStream input, PSWPGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MMESPPSWPPackageFile";	
   	}
   	
   	@Override
   	protected PSWPGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMMESPPSWPPackageFile
entryRuleMMESPPSWPPackageFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMESPPSWPPackageFileRule()); }
	 iv_ruleMMESPPSWPPackageFile=ruleMMESPPSWPPackageFile 
	 { $current=$iv_ruleMMESPPSWPPackageFile.current; } 
	 EOF 
;

// Rule MMESPPSWPPackageFile
ruleMMESPPSWPPackageFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMESPPSWPPackageFileAccess().getPackageKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPPSWPPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_2());
    }
(	otherlv_3='import' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMMESPPSWPPackageFileAccess().getImportKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPPSWPPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMESPPSWPPackageFileAccess().getSemicolonKeyword_3_2());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPPSWPPackageFileAccess().getElementMMESPPSWPPackageElementParserRuleCall_4_0()); 
	    }
		lv_element_6_0=ruleMMESPPSWPPackageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPPSWPPackageFileRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_6_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.PSWP.MMESPPSWPPackageElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMMESPPSWPPackageElement
entryRuleMMESPPSWPPackageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMESPPSWPPackageElementRule()); }
	 iv_ruleMMESPPSWPPackageElement=ruleMMESPPSWPPackageElement 
	 { $current=$iv_ruleMMESPPSWPPackageElement.current; } 
	 EOF 
;

// Rule MMESPPSWPPackageElement
ruleMMESPPSWPPackageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMESPPSWPPackageElementAccess().getMPlatformSwPackageParserRuleCall()); 
    }
    this_MPlatformSwPackage_0=ruleMPlatformSwPackage
    { 
        $current = $this_MPlatformSwPackage_0.current; 
        afterParserOrEnumRuleCall();
    }

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







// Entry rule entryRuleMPlatformSwPackage
entryRuleMPlatformSwPackage returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMPlatformSwPackageRule()); }
	 iv_ruleMPlatformSwPackage=ruleMPlatformSwPackage 
	 { $current=$iv_ruleMPlatformSwPackage.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MPlatformSwPackage
ruleMPlatformSwPackage returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='pswpackage' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMPlatformSwPackageAccess().getPswpackageKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMPlatformSwPackageAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformSwPackageRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getMPlatformSwPackageAccess().getLeftCurlyBracketKeyword_2());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 0);
	 				}
					({true}?=>(	otherlv_4='version' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMPlatformSwPackageAccess().getVersionKeyword_3_0_0());
    }
	otherlv_5=':=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getVersionVersionParserRuleCall_3_0_2_0()); 
	    }
		lv_version_6_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMPlatformSwPackageRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_6_0, 
        		"es.uah.aut.srg.micobs.mesp.lang.PSWP.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 1);
	 				}
					({true}?=>(	otherlv_8='supported' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMPlatformSwPackageAccess().getSupportedKeyword_3_1_0());
    }
	otherlv_9='platform' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMPlatformSwPackageAccess().getPlatformKeyword_3_1_1());
    }
	otherlv_10=':=' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_1_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementMPlatformCrossReference_3_1_3_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_12=';' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 2);
	 				}
					({true}?=>(	otherlv_13='construction' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMPlatformSwPackageAccess().getConstructionKeyword_3_2_0());
    }
	otherlv_14='tools' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMPlatformSwPackageAccess().getToolsKeyword_3_2_1());
    }
	otherlv_15=':=' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_2_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_3_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_17=',' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_2_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getCtoolsMConstructionToolCrossReference_3_2_4_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_19=';' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), 3);
	 				}
					({true}?=>(	otherlv_20='osswpackages' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMPlatformSwPackageAccess().getOsswpackagesKeyword_3_3_0());
    }
	otherlv_21=':=' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMPlatformSwPackageAccess().getColonEqualsSignKeyword_3_3_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_23=',' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMPlatformSwPackageAccess().getCommaKeyword_3_3_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPlatformSwPackageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesMOSSwPackageCrossReference_3_3_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_25=';' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_3_3_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3());
	}

)	otherlv_26='}' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMPlatformSwPackageAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_27=';' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMPlatformSwPackageAccess().getSemicolonKeyword_5());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


