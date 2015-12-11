/*
* generated by Xtext
*/
grammar InternalPROT;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
	
}

@lexer::header {
package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.parser.antlr.internal; 

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
import es.uah.aut.srg.micobs.mclev.domain.edroom.lang.services.PROTGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private PROTGrammarAccess grammarAccess;
 	
    public InternalPROTParser(TokenStream input, PROTGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "EDROOMPROTPackageFile";	
   	}
   	
   	@Override
   	protected PROTGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleEDROOMPROTPackageFile
entryRuleEDROOMPROTPackageFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEDROOMPROTPackageFileRule()); }
	 iv_ruleEDROOMPROTPackageFile=ruleEDROOMPROTPackageFile 
	 { $current=$iv_ruleEDROOMPROTPackageFile.current; } 
	 EOF 
;

// Rule EDROOMPROTPackageFile
ruleEDROOMPROTPackageFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEDROOMPROTPackageFileAccess().getPackageKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMPROTPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEDROOMPROTPackageFileAccess().getPackageEDROOMPackageCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEDROOMPROTPackageFileAccess().getSemicolonKeyword_2());
    }
(	otherlv_3='import' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEDROOMPROTPackageFileAccess().getImportKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMPROTPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEDROOMPROTPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEDROOMPROTPackageFileAccess().getSemicolonKeyword_3_2());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getEDROOMPROTPackageFileAccess().getElementEDROOMPROTPackageElementParserRuleCall_4_0()); 
	    }
		lv_element_6_0=ruleEDROOMPROTPackageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEDROOMPROTPackageFileRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_6_0, 
        		"EDROOMPROTPackageElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
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





// Entry rule entryRuleEDROOMPROTPackageElement
entryRuleEDROOMPROTPackageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEDROOMPROTPackageElementRule()); }
	 iv_ruleEDROOMPROTPackageElement=ruleEDROOMPROTPackageElement 
	 { $current=$iv_ruleEDROOMPROTPackageElement.current; } 
	 EOF 
;

// Rule EDROOMPROTPackageElement
ruleEDROOMPROTPackageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getEDROOMPROTPackageElementAccess().getEDROOMProtocolParserRuleCall()); 
    }
    this_EDROOMProtocol_0=ruleEDROOMProtocol
    { 
        $current = $this_EDROOMProtocol_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleEDROOMProtocol
entryRuleEDROOMProtocol returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getEDROOMProtocolRule()); }
	 iv_ruleEDROOMProtocol=ruleEDROOMProtocol 
	 { $current=$iv_ruleEDROOMProtocol.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule EDROOMProtocol
ruleEDROOMProtocol returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getEDROOMProtocolAccess().getEDROOMProtocolAction_0(),
            $current);
    }
)	otherlv_1='protocol' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEDROOMProtocolAccess().getProtocolKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMProtocolAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMProtocolRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)(	otherlv_3='extends' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEDROOMProtocolAccess().getExtendsKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMProtocolRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolCrossReference_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEDROOMProtocolAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMProtocolRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolCrossReference_3_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_7='{' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_9='version' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getEDROOMProtocolAccess().getVersionKeyword_5_0_0());
    }
	otherlv_10=':=' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getEDROOMProtocolAccess().getColonEqualsSignKeyword_5_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getVersionVersionParserRuleCall_5_0_2_0()); 
	    }
		lv_version_11_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEDROOMProtocolRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_11_0, 
        		"Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_12=';' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_13='interface' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getEDROOMProtocolAccess().getInterfaceKeyword_5_1_0());
    }
	otherlv_14=':=' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getEDROOMProtocolAccess().getColonEqualsSignKeyword_5_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMProtocolRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getReferencedElementMInterfaceCrossReference_5_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_16=';' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_1_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_17='input' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getEDROOMProtocolAccess().getInputKeyword_5_2_0());
    }
	otherlv_18='messages' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getEDROOMProtocolAccess().getMessagesKeyword_5_2_1());
    }
	otherlv_19='{' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_5_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getInputMessagesEDROOMMessageParserRuleCall_5_2_3_0()); 
	    }
		lv_inputMessages_20_0=ruleEDROOMMessage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEDROOMProtocolRule());
	        }
       		add(
       			$current, 
       			"inputMessages",
        		lv_inputMessages_20_0, 
        		"EDROOMMessage");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_21='}' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_5_2_4());
    }
	otherlv_22=';' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_23='output' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getEDROOMProtocolAccess().getOutputKeyword_5_3_0());
    }
	otherlv_24='messages' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getEDROOMProtocolAccess().getMessagesKeyword_5_3_1());
    }
	otherlv_25='{' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_5_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEDROOMProtocolAccess().getOutputMessagesEDROOMMessageParserRuleCall_5_3_3_0()); 
	    }
		lv_outputMessages_26_0=ruleEDROOMMessage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEDROOMProtocolRule());
	        }
       		add(
       			$current, 
       			"outputMessages",
        		lv_outputMessages_26_0, 
        		"EDROOMMessage");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_27='}' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_5_3_4());
    }
	otherlv_28=';' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5());
	}

)	otherlv_29='}' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_30=';' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleEDROOMMessage
entryRuleEDROOMMessage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEDROOMMessageRule()); }
	 iv_ruleEDROOMMessage=ruleEDROOMMessage 
	 { $current=$iv_ruleEDROOMMessage.current; } 
	 EOF 
;

// Rule EDROOMMessage
ruleEDROOMMessage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getEDROOMMessageAccess().getEDROOMSendMessageParserRuleCall_0()); 
    }
    this_EDROOMSendMessage_0=ruleEDROOMSendMessage
    { 
        $current = $this_EDROOMSendMessage_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getEDROOMMessageAccess().getEDROOMInvokeMessageParserRuleCall_1()); 
    }
    this_EDROOMInvokeMessage_1=ruleEDROOMInvokeMessage
    { 
        $current = $this_EDROOMInvokeMessage_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getEDROOMMessageAccess().getEDROOMReplyMessageParserRuleCall_2()); 
    }
    this_EDROOMReplyMessage_2=ruleEDROOMReplyMessage
    { 
        $current = $this_EDROOMReplyMessage_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEDROOMSendMessage
entryRuleEDROOMSendMessage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEDROOMSendMessageRule()); }
	 iv_ruleEDROOMSendMessage=ruleEDROOMSendMessage 
	 { $current=$iv_ruleEDROOMSendMessage.current; } 
	 EOF 
;

// Rule EDROOMSendMessage
ruleEDROOMSendMessage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getEDROOMSendMessageAccess().getEDROOMSendMessageAction_0(),
            $current);
    }
)	otherlv_1='send' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEDROOMSendMessageAccess().getSendKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMSendMessageAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMSendMessageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEDROOMSendMessageAccess().getLeftParenthesisKeyword_3());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMSendMessageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEDROOMSendMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEDROOMSendMessageAccess().getRightParenthesisKeyword_5());
    }
	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEDROOMSendMessageAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleEDROOMInvokeMessage
entryRuleEDROOMInvokeMessage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEDROOMInvokeMessageRule()); }
	 iv_ruleEDROOMInvokeMessage=ruleEDROOMInvokeMessage 
	 { $current=$iv_ruleEDROOMInvokeMessage.current; } 
	 EOF 
;

// Rule EDROOMInvokeMessage
ruleEDROOMInvokeMessage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getEDROOMInvokeMessageAccess().getEDROOMInvokeMessageAction_0(),
            $current);
    }
)	otherlv_1='invoke' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEDROOMInvokeMessageAccess().getInvokeKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMInvokeMessageAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMInvokeMessageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEDROOMInvokeMessageAccess().getLeftParenthesisKeyword_3());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMInvokeMessageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEDROOMInvokeMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEDROOMInvokeMessageAccess().getRightParenthesisKeyword_5());
    }
	otherlv_6='replies' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEDROOMInvokeMessageAccess().getRepliesKeyword_6());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMInvokeMessageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageCrossReference_7_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getEDROOMInvokeMessageAccess().getCommaKeyword_8_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMInvokeMessageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageCrossReference_8_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getEDROOMInvokeMessageAccess().getSemicolonKeyword_9());
    }
)
;





// Entry rule entryRuleEDROOMReplyMessage
entryRuleEDROOMReplyMessage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEDROOMReplyMessageRule()); }
	 iv_ruleEDROOMReplyMessage=ruleEDROOMReplyMessage 
	 { $current=$iv_ruleEDROOMReplyMessage.current; } 
	 EOF 
;

// Rule EDROOMReplyMessage
ruleEDROOMReplyMessage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getEDROOMReplyMessageAccess().getEDROOMReplyMessageAction_0(),
            $current);
    }
)	otherlv_1='reply' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEDROOMReplyMessageAccess().getReplyKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getEDROOMReplyMessageAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMReplyMessageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEDROOMReplyMessageAccess().getLeftParenthesisKeyword_3());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEDROOMReplyMessageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEDROOMReplyMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEDROOMReplyMessageAccess().getRightParenthesisKeyword_5());
    }
	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEDROOMReplyMessageAccess().getSemicolonKeyword_6());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


