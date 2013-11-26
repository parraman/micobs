/*
* generated by Xtext
*/
grammar InternalCTOOL;

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
import es.uah.aut.srg.micobs.mesp.lang.services.CTOOLGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private CTOOLGrammarAccess grammarAccess;
 	
    public InternalCTOOLParser(TokenStream input, CTOOLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MMESPCTOOLPackageFile";	
   	}
   	
   	@Override
   	protected CTOOLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMMESPCTOOLPackageFile
entryRuleMMESPCTOOLPackageFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMESPCTOOLPackageFileRule()); }
	 iv_ruleMMESPCTOOLPackageFile=ruleMMESPCTOOLPackageFile 
	 { $current=$iv_ruleMMESPCTOOLPackageFile.current; } 
	 EOF 
;

// Rule MMESPCTOOLPackageFile
ruleMMESPCTOOLPackageFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPCTOOLPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageMMESPPackageCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMMESPCTOOLPackageFileAccess().getSemicolonKeyword_2());
    }
(	otherlv_3='import' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMMESPCTOOLPackageFileAccess().getImportKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMESPCTOOLPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMESPCTOOLPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMESPCTOOLPackageFileAccess().getSemicolonKeyword_3_2());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getMMESPCTOOLPackageFileAccess().getElementMMESPCTOOLPackageElementParserRuleCall_4_0()); 
	    }
		lv_element_6_0=ruleMMESPCTOOLPackageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMESPCTOOLPackageFileRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_6_0, 
        		"MMESPCTOOLPackageElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMMESPCTOOLPackageElement
entryRuleMMESPCTOOLPackageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMESPCTOOLPackageElementRule()); }
	 iv_ruleMMESPCTOOLPackageElement=ruleMMESPCTOOLPackageElement 
	 { $current=$iv_ruleMMESPCTOOLPackageElement.current; } 
	 EOF 
;

// Rule MMESPCTOOLPackageElement
ruleMMESPCTOOLPackageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMESPCTOOLPackageElementAccess().getMConstructionToolParserRuleCall()); 
    }
    this_MConstructionTool_0=ruleMConstructionTool
    { 
        $current = $this_MConstructionTool_0.current; 
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







// Entry rule entryRuleMConstructionTool
entryRuleMConstructionTool returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMConstructionToolAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMConstructionToolRule()); }
	 iv_ruleMConstructionTool=ruleMConstructionTool 
	 { $current=$iv_ruleMConstructionTool.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MConstructionTool
ruleMConstructionTool returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMConstructionToolAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='construction tool' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMConstructionToolAccess().getConstructionToolKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMConstructionToolAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConstructionToolRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='extends' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMConstructionToolAccess().getExtendsKeyword_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConstructionToolRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolCrossReference_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMConstructionToolAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConstructionToolRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolCrossReference_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMConstructionToolAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_8='version' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMConstructionToolAccess().getVersionKeyword_4_0_0());
    }
	otherlv_9=':=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMConstructionToolAccess().getColonEqualsSignKeyword_4_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMConstructionToolAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
	    }
		lv_version_10_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMConstructionToolRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_10_0, 
        		"Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=';' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_4_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_12='supported languages' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMConstructionToolAccess().getSupportedLanguagesKeyword_4_1_0());
    }
	otherlv_13=':=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMConstructionToolAccess().getColonEqualsSignKeyword_4_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConstructionToolRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageCrossReference_4_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_15=',' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMConstructionToolAccess().getCommaKeyword_4_1_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConstructionToolRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageCrossReference_4_1_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_17=';' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_4_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_4());
	}

)	otherlv_18='}' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMConstructionToolAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_19=';' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

