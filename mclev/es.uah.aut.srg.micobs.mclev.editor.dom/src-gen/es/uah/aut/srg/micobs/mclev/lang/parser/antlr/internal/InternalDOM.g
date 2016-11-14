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
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
	
}

@lexer::header {
package es.uah.aut.srg.micobs.mclev.lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.micobs.mclev.lang.parser.antlr.internal; 

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
import es.uah.aut.srg.micobs.mclev.lang.services.DOMGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private DOMGrammarAccess grammarAccess;
 	
    public InternalDOMParser(TokenStream input, DOMGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MMCLEVDOMPackageFile";	
   	}
   	
   	@Override
   	protected DOMGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMMCLEVDOMPackageFile
entryRuleMMCLEVDOMPackageFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMCLEVDOMPackageFileRule()); }
	 iv_ruleMMCLEVDOMPackageFile=ruleMMCLEVDOMPackageFile 
	 { $current=$iv_ruleMMCLEVDOMPackageFile.current; } 
	 EOF 
;

// Rule MMCLEVDOMPackageFile
ruleMMCLEVDOMPackageFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMCLEVDOMPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVDOMPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMMCLEVDOMPackageFileAccess().getSemicolonKeyword_2());
    }
(	otherlv_3='import' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMMCLEVDOMPackageFileAccess().getImportKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMCLEVDOMPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVDOMPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMCLEVDOMPackageFileAccess().getSemicolonKeyword_3_2());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVDOMPackageFileAccess().getElementMMCLEVDOMPackageElementParserRuleCall_4_0()); 
	    }
		lv_element_6_0=ruleMMCLEVDOMPackageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMCLEVDOMPackageFileRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MMCLEVDOMPackageElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMMCLEVDOMPackageElement
entryRuleMMCLEVDOMPackageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMCLEVDOMPackageElementRule()); }
	 iv_ruleMMCLEVDOMPackageElement=ruleMMCLEVDOMPackageElement 
	 { $current=$iv_ruleMMCLEVDOMPackageElement.current; } 
	 EOF 
;

// Rule MMCLEVDOMPackageElement
ruleMMCLEVDOMPackageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMCLEVDOMPackageElementAccess().getMDomainParserRuleCall()); 
    }
    this_MDomain_0=ruleMDomain
    { 
        $current = $this_MDomain_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleMDomain
entryRuleMDomain returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMDomainRule()); }
	 iv_ruleMDomain=ruleMDomain 
	 { $current=$iv_ruleMDomain.current; } 
	 EOF 
;

// Rule MDomain
ruleMDomain returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMDomainAccess().getMIODomainParserRuleCall_0()); 
    }
    this_MIODomain_0=ruleMIODomain
    { 
        $current = $this_MIODomain_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMDomainAccess().getMAODomainParserRuleCall_1()); 
    }
    this_MAODomain_1=ruleMAODomain
    { 
        $current = $this_MAODomain_1.current; 
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





// Entry rule entryRuleMIODomain
entryRuleMIODomain returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMIODomainAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMIODomainRule()); }
	 iv_ruleMIODomain=ruleMIODomain 
	 { $current=$iv_ruleMIODomain.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MIODomain
ruleMIODomain returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMIODomainAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='iodomain' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMIODomainAccess().getIodomainKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMIODomainAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getMIODomainAccess().getInheritsKeyword_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getInheritsMIODomainCrossReference_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMIODomainAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getInheritsMIODomainCrossReference_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_8='version' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMIODomainAccess().getVersionKeyword_4_0_0());
    }
	otherlv_9=':=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
	    }
		lv_version_10_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODomainRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_10_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=';' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_12='languages' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMIODomainAccess().getLanguagesKeyword_4_1_0());
    }
	otherlv_13=':=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getLanguagesMLanguageCrossReference_4_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_15=',' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMIODomainAccess().getCommaKeyword_4_1_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_17=';' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 2);
	 				}
					({true}?=>(	otherlv_18='singleton' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMIODomainAccess().getSingletonKeyword_4_2_0());
    }
	otherlv_19='instances' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMIODomainAccess().getInstancesKeyword_4_2_1());
    }
	otherlv_20=':=' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getAllowsSingletonEBooleanParserRuleCall_4_2_3_0()); 
	    }
		lv_allowsSingleton_21_0=ruleEBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODomainRule());
	        }
       		set(
       			$current, 
       			"allowsSingleton",
        		lv_allowsSingleton_21_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.EBoolean");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_22=';' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_2_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 3);
	 				}
					({true}?=>(	otherlv_23='attributes' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMIODomainAccess().getAttributesKeyword_4_3_0());
    }
	otherlv_24='{' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_3_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getAttributesMParameterParserRuleCall_4_3_2_0()); 
	    }
		lv_attributes_25_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODomainRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_25_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_26='}' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_3_3());
    }
	otherlv_27=';' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_3_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 4);
	 				}
					({true}?=>(	otherlv_28='interface' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMIODomainAccess().getInterfaceKeyword_4_4_0());
    }
	otherlv_29='types' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMIODomainAccess().getTypesKeyword_4_4_1());
    }
	otherlv_30='{' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_4_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getInterfaceTypesMInterfaceTypeParserRuleCall_4_4_3_0()); 
	    }
		lv_interfaceTypes_31_0=ruleMInterfaceType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODomainRule());
	        }
       		add(
       			$current, 
       			"interfaceTypes",
        		lv_interfaceTypes_31_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MInterfaceType");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_32='}' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_4_4());
    }
	otherlv_33=';' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_4_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 5);
	 				}
					({true}?=>(	otherlv_34='port' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMIODomainAccess().getPortKeyword_4_5_0());
    }
	otherlv_35='types' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMIODomainAccess().getTypesKeyword_4_5_1());
    }
	otherlv_36='{' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_5_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getPortTypesMPortTypeParserRuleCall_4_5_3_0()); 
	    }
		lv_portTypes_37_0=ruleMPortType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODomainRule());
	        }
       		add(
       			$current, 
       			"portTypes",
        		lv_portTypes_37_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MPortType");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_38='}' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_5_4());
    }
	otherlv_39=';' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_5_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 6);
	 				}
					({true}?=>(	otherlv_40='connectors' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMIODomainAccess().getConnectorsKeyword_4_6_0());
    }
	otherlv_41='{' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getConnectorsMConnectorParserRuleCall_4_6_2_0()); 
	    }
		lv_connectors_42_0=ruleMConnector		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODomainRule());
	        }
       		add(
       			$current, 
       			"connectors",
        		lv_connectors_42_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MConnector");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_43='}' 
    {
    	newLeafNode(otherlv_43, grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_6_3());
    }
	otherlv_44=';' 
    {
    	newLeafNode(otherlv_44, grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_6_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 7);
	 				}
					({true}?=>(	otherlv_45='exchange' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMIODomainAccess().getExchangeKeyword_4_7_0());
    }
	otherlv_46='models' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getMIODomainAccess().getModelsKeyword_4_7_1());
    }
	otherlv_47='{' 
    {
    	newLeafNode(otherlv_47, grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_7_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getExchangeModelsMExchangeModelParserRuleCall_4_7_3_0()); 
	    }
		lv_exchangeModels_48_0=ruleMExchangeModel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODomainRule());
	        }
       		add(
       			$current, 
       			"exchangeModels",
        		lv_exchangeModels_48_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MExchangeModel");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_49='}' 
    {
    	newLeafNode(otherlv_49, grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_7_4());
    }
	otherlv_50=';' 
    {
    	newLeafNode(otherlv_50, grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_7_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 8);
	 				}
					({true}?=>(	otherlv_51='component' 
    {
    	newLeafNode(otherlv_51, grammarAccess.getMIODomainAccess().getComponentKeyword_4_8_0());
    }
	otherlv_52='types' 
    {
    	newLeafNode(otherlv_52, grammarAccess.getMIODomainAccess().getTypesKeyword_4_8_1());
    }
	otherlv_53='{' 
    {
    	newLeafNode(otherlv_53, grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_8_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getComponentTypesMIODCTypeParserRuleCall_4_8_3_0()); 
	    }
		lv_componentTypes_54_0=ruleMIODCType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODomainRule());
	        }
       		add(
       			$current, 
       			"componentTypes",
        		lv_componentTypes_54_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MIODCType");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_55='}' 
    {
    	newLeafNode(otherlv_55, grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_8_4());
    }
	otherlv_56=';' 
    {
    	newLeafNode(otherlv_56, grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_8_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 9)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 9);
	 				}
					({true}?=>(	otherlv_57='internal' 
    {
    	newLeafNode(otherlv_57, grammarAccess.getMIODomainAccess().getInternalKeyword_4_9_0());
    }
	otherlv_58='instances' 
    {
    	newLeafNode(otherlv_58, grammarAccess.getMIODomainAccess().getInstancesKeyword_4_9_1());
    }
	otherlv_59='{' 
    {
    	newLeafNode(otherlv_59, grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_9_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_4_9_3_0()); 
	    }
		lv_componentTypeInstances_60_0=ruleMIODComponentTypeInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODomainRule());
	        }
       		add(
       			$current, 
       			"componentTypeInstances",
        		lv_componentTypeInstances_60_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MIODComponentTypeInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_61='}' 
    {
    	newLeafNode(otherlv_61, grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_9_4());
    }
	otherlv_62=';' 
    {
    	newLeafNode(otherlv_62, grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_9_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 10)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 10);
	 				}
					({true}?=>(	otherlv_63='requires' 
    {
    	newLeafNode(otherlv_63, grammarAccess.getMIODomainAccess().getRequiresKeyword_4_10_0());
    }
	otherlv_64=':=' 
    {
    	newLeafNode(otherlv_64, grammarAccess.getMIODomainAccess().getColonEqualsSignKeyword_4_10_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getRequiresMSAICrossReference_4_10_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_66=',' 
    {
    	newLeafNode(otherlv_66, grammarAccess.getMIODomainAccess().getCommaKeyword_4_10_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getRequiresMSAICrossReference_4_10_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_68=';' 
    {
    	newLeafNode(otherlv_68, grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_10_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 11)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainAccess().getUnorderedGroup_4(), 11);
	 				}
					({true}?=>(	otherlv_69='supported' 
    {
    	newLeafNode(otherlv_69, grammarAccess.getMIODomainAccess().getSupportedKeyword_4_11_0());
    }
	otherlv_70='platforms' 
    {
    	newLeafNode(otherlv_70, grammarAccess.getMIODomainAccess().getPlatformsKeyword_4_11_1());
    }
	otherlv_71='{' 
    {
    	newLeafNode(otherlv_71, grammarAccess.getMIODomainAccess().getLeftCurlyBracketKeyword_4_11_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODomainAccess().getSupportedPlatformsMIODomainSupportedPlatformParserRuleCall_4_11_3_0()); 
	    }
		lv_supportedPlatforms_72_0=ruleMIODomainSupportedPlatform		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODomainRule());
	        }
       		add(
       			$current, 
       			"supportedPlatforms",
        		lv_supportedPlatforms_72_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MIODomainSupportedPlatform");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_73='}' 
    {
    	newLeafNode(otherlv_73, grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_4_11_4());
    }
	otherlv_74=';' 
    {
    	newLeafNode(otherlv_74, grammarAccess.getMIODomainAccess().getSemicolonKeyword_4_11_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMIODomainAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMIODomainAccess().getUnorderedGroup_4());
	}

)	otherlv_75='}' 
    {
    	newLeafNode(otherlv_75, grammarAccess.getMIODomainAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_76=';' 
    {
    	newLeafNode(otherlv_76, grammarAccess.getMIODomainAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMIODomainSupportedPlatform
entryRuleMIODomainSupportedPlatform returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMIODomainSupportedPlatformRule()); }
	 iv_ruleMIODomainSupportedPlatform=ruleMIODomainSupportedPlatform 
	 { $current=$iv_ruleMIODomainSupportedPlatform.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MIODomainSupportedPlatform
ruleMIODomainSupportedPlatform returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='supported' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMIODomainSupportedPlatformAccess().getSupportedKeyword_0());
    }
	otherlv_1='platform' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMIODomainSupportedPlatformAccess().getPlatformKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMIODomainSupportedPlatformAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainSupportedPlatformRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMIODomainSupportedPlatformAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_5='osapi' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiKeyword_4_0_0());
    }
	otherlv_6=':=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_0_1());
    }
(	otherlv_7='any' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_0_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_4_0_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_10='os' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMIODomainSupportedPlatformAccess().getOsKeyword_4_1_0());
    }
	otherlv_11=':=' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_1_1());
    }
(	otherlv_12='any' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_1_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainSupportedPlatformAccess().getOsMOperatingSystemCrossReference_4_1_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_14=';' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_1_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 2);
	 				}
					({true}?=>(	otherlv_15='architecture' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureKeyword_4_2_0());
    }
	otherlv_16=':=' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_2_1());
    }
(	otherlv_17='any' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_2_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_4_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_19=';' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_2_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 3);
	 				}
					({true}?=>(	otherlv_20='compiler' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerKeyword_4_3_0());
    }
	otherlv_21=':=' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_3_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainSupportedPlatformAccess().getCompilerMCompilerCrossReference_4_3_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_23=';' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_3_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 4);
	 				}
					({true}?=>(	otherlv_24='microprocessor' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorKeyword_4_4_0());
    }
	otherlv_25=':=' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_4_1());
    }
(	otherlv_26='any' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_4_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_4_4_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_28=';' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_4_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 5);
	 				}
					({true}?=>(	otherlv_29='board' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMIODomainSupportedPlatformAccess().getBoardKeyword_4_5_0());
    }
	otherlv_30=':=' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_5_1());
    }
(	otherlv_31='any' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMIODomainSupportedPlatformAccess().getAnyKeyword_4_5_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainSupportedPlatformAccess().getBoardMBoardCrossReference_4_5_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_33=';' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_5_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 6);
	 				}
					({true}?=>(	otherlv_34='attributes' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesKeyword_4_6_0());
    }
	otherlv_35='{' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMIODomainSupportedPlatformAccess().getLeftCurlyBracketKeyword_4_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODomainSupportedPlatformAccess().getAttributesMParameterParserRuleCall_4_6_2_0()); 
	    }
		lv_attributes_36_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODomainSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_36_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_37='}' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getMIODomainSupportedPlatformAccess().getRightCurlyBracketKeyword_4_6_3());
    }
	otherlv_38=';' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_6_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 7);
	 				}
					({true}?=>(	otherlv_39='languages' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesKeyword_4_7_0());
    }
	otherlv_40=':=' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_7_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageCrossReference_4_7_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_42=',' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getMIODomainSupportedPlatformAccess().getCommaKeyword_4_7_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainSupportedPlatformAccess().getLanguagesMLanguageCrossReference_4_7_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_44=';' 
    {
    	newLeafNode(otherlv_44, grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_7_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4(), 8);
	 				}
					({true}?=>(	otherlv_45='requires' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresKeyword_4_8_0());
    }
	otherlv_46=':=' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getMIODomainSupportedPlatformAccess().getColonEqualsSignKeyword_4_8_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAICrossReference_4_8_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_48=',' 
    {
    	newLeafNode(otherlv_48, grammarAccess.getMIODomainSupportedPlatformAccess().getCommaKeyword_4_8_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODomainSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODomainSupportedPlatformAccess().getRequiresMSAICrossReference_4_8_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_50=';' 
    {
    	newLeafNode(otherlv_50, grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_4_8_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMIODomainSupportedPlatformAccess().getUnorderedGroup_4());
	}

)	otherlv_51='}' 
    {
    	newLeafNode(otherlv_51, grammarAccess.getMIODomainSupportedPlatformAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_52=';' 
    {
    	newLeafNode(otherlv_52, grammarAccess.getMIODomainSupportedPlatformAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMAODomain
entryRuleMAODomain returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMAODomainAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMAODomainRule()); }
	 iv_ruleMAODomain=ruleMAODomain 
	 { $current=$iv_ruleMAODomain.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MAODomain
ruleMAODomain returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMAODomainAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='aodomain' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMAODomainAccess().getAodomainKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMAODomainAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAODomainRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getMAODomainAccess().getInheritsKeyword_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAODomainRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAODomainAccess().getInheritsMAODomainCrossReference_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMAODomainAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAODomainRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAODomainAccess().getInheritsMAODomainCrossReference_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_8='version' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMAODomainAccess().getVersionKeyword_4_0_0());
    }
	otherlv_9=':=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMAODomainAccess().getColonEqualsSignKeyword_4_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAODomainAccess().getVersionVersionParserRuleCall_4_0_2_0()); 
	    }
		lv_version_10_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAODomainRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_10_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11=';' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_12='output' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMAODomainAccess().getOutputKeyword_4_1_0());
    }
	otherlv_13='iodomains' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMAODomainAccess().getIodomainsKeyword_4_1_1());
    }
	otherlv_14=':=' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMAODomainAccess().getColonEqualsSignKeyword_4_1_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAODomainRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainCrossReference_4_1_3_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_16=',' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMAODomainAccess().getCommaKeyword_4_1_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAODomainRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAODomainAccess().getOutputIODomainsMIODomainCrossReference_4_1_4_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 2);
	 				}
					({true}?=>(	otherlv_19='attributes' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMAODomainAccess().getAttributesKeyword_4_2_0());
    }
	otherlv_20='{' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAODomainAccess().getAttributesMParameterParserRuleCall_4_2_2_0()); 
	    }
		lv_attributes_21_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAODomainRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_21_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_22='}' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_2_3());
    }
	otherlv_23=';' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_2_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 3);
	 				}
					({true}?=>(	otherlv_24='interface' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMAODomainAccess().getInterfaceKeyword_4_3_0());
    }
	otherlv_25='types' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMAODomainAccess().getTypesKeyword_4_3_1());
    }
	otherlv_26='{' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAODomainAccess().getInterfaceTypesMInterfaceTypeParserRuleCall_4_3_3_0()); 
	    }
		lv_interfaceTypes_27_0=ruleMInterfaceType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAODomainRule());
	        }
       		add(
       			$current, 
       			"interfaceTypes",
        		lv_interfaceTypes_27_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MInterfaceType");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_28='}' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_3_4());
    }
	otherlv_29=';' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 4);
	 				}
					({true}?=>(	otherlv_30='port' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMAODomainAccess().getPortKeyword_4_4_0());
    }
	otherlv_31='types' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMAODomainAccess().getTypesKeyword_4_4_1());
    }
	otherlv_32='{' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_4_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAODomainAccess().getPortTypesMPortTypeParserRuleCall_4_4_3_0()); 
	    }
		lv_portTypes_33_0=ruleMPortType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAODomainRule());
	        }
       		add(
       			$current, 
       			"portTypes",
        		lv_portTypes_33_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MPortType");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_34='}' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_4_4());
    }
	otherlv_35=';' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_4_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 5);
	 				}
					({true}?=>(	otherlv_36='connectors' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getMAODomainAccess().getConnectorsKeyword_4_5_0());
    }
	otherlv_37='{' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAODomainAccess().getConnectorsMConnectorParserRuleCall_4_5_2_0()); 
	    }
		lv_connectors_38_0=ruleMConnector		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAODomainRule());
	        }
       		add(
       			$current, 
       			"connectors",
        		lv_connectors_38_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MConnector");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_39='}' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_5_3());
    }
	otherlv_40=';' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_5_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 6);
	 				}
					({true}?=>(	otherlv_41='component' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMAODomainAccess().getComponentKeyword_4_6_0());
    }
	otherlv_42='types' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getMAODomainAccess().getTypesKeyword_4_6_1());
    }
	otherlv_43='{' 
    {
    	newLeafNode(otherlv_43, grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_6_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAODomainAccess().getComponentTypesMAODComponentTypeParserRuleCall_4_6_3_0()); 
	    }
		lv_componentTypes_44_0=ruleMAODComponentType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAODomainRule());
	        }
       		add(
       			$current, 
       			"componentTypes",
        		lv_componentTypes_44_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MAODComponentType");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_45='}' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_6_4());
    }
	otherlv_46=';' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_6_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODomainAccess().getUnorderedGroup_4(), 7);
	 				}
					({true}?=>(	otherlv_47='internal' 
    {
    	newLeafNode(otherlv_47, grammarAccess.getMAODomainAccess().getInternalKeyword_4_7_0());
    }
	otherlv_48='instances' 
    {
    	newLeafNode(otherlv_48, grammarAccess.getMAODomainAccess().getInstancesKeyword_4_7_1());
    }
	otherlv_49='{' 
    {
    	newLeafNode(otherlv_49, grammarAccess.getMAODomainAccess().getLeftCurlyBracketKeyword_4_7_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAODomainAccess().getComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_4_7_3_0()); 
	    }
		lv_componentTypeInstances_50_0=ruleMAODComponentTypeInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAODomainRule());
	        }
       		add(
       			$current, 
       			"componentTypeInstances",
        		lv_componentTypeInstances_50_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MAODComponentTypeInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_51='}' 
    {
    	newLeafNode(otherlv_51, grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_4_7_4());
    }
	otherlv_52=';' 
    {
    	newLeafNode(otherlv_52, grammarAccess.getMAODomainAccess().getSemicolonKeyword_4_7_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMAODomainAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMAODomainAccess().getUnorderedGroup_4());
	}

)	otherlv_53='}' 
    {
    	newLeafNode(otherlv_53, grammarAccess.getMAODomainAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_54=';' 
    {
    	newLeafNode(otherlv_54, grammarAccess.getMAODomainAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMInterfaceType
entryRuleMInterfaceType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMInterfaceTypeRule()); }
	 iv_ruleMInterfaceType=ruleMInterfaceType 
	 { $current=$iv_ruleMInterfaceType.current; } 
	 EOF 
;

// Rule MInterfaceType
ruleMInterfaceType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='interface' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMInterfaceTypeAccess().getInterfaceKeyword_0());
    }
	otherlv_1='type' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMInterfaceTypeAccess().getTypeKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMInterfaceTypeAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInterfaceTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)(	otherlv_3='inherits' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMInterfaceTypeAccess().getInheritsKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInterfaceTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeCrossReference_3_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMInterfaceTypeAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInterfaceTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMInterfaceTypeAccess().getInheritsMInterfaceTypeCrossReference_3_2_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_7='{' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMInterfaceTypeAccess().getLeftCurlyBracketKeyword_4());
    }
	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMInterfaceTypeAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_9=';' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMInterfaceTypeAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleMAODComponentType
entryRuleMAODComponentType returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMAODComponentTypeRule()); }
	 iv_ruleMAODComponentType=ruleMAODComponentType 
	 { $current=$iv_ruleMAODComponentType.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MAODComponentType
ruleMAODComponentType returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='component' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMAODComponentTypeAccess().getComponentKeyword_0());
    }
	otherlv_1='type' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMAODComponentTypeAccess().getTypeKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMAODComponentTypeAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAODComponentTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)(	otherlv_3='inherits' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMAODComponentTypeAccess().getInheritsKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAODComponentTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeCrossReference_3_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMAODComponentTypeAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAODComponentTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAODComponentTypeAccess().getInheritsMAODComponentTypeCrossReference_3_2_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_7='{' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_9='attributes' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMAODComponentTypeAccess().getAttributesKeyword_5_0_0());
    }
	otherlv_10='{' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_5_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAODComponentTypeAccess().getAttributesMParameterParserRuleCall_5_0_2_0()); 
	    }
		lv_attributes_11_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAODComponentTypeRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_11_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_5_0_3());
    }
	otherlv_13=';' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_5_0_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_14='port' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMAODComponentTypeAccess().getPortKeyword_5_1_0());
    }
	otherlv_15='instances' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMAODComponentTypeAccess().getInstancesKeyword_5_1_1());
    }
	otherlv_16='{' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_5_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAODComponentTypeAccess().getPortTypeInstancesMPortTypeInstanceParserRuleCall_5_1_3_0()); 
	    }
		lv_portTypeInstances_17_0=ruleMPortTypeInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAODComponentTypeRule());
	        }
       		add(
       			$current, 
       			"portTypeInstances",
        		lv_portTypeInstances_17_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MPortTypeInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_18='}' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_5_1_4());
    }
	otherlv_19=';' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_5_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_20='internal' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMAODComponentTypeAccess().getInternalKeyword_5_2_0());
    }
	otherlv_21='instances' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMAODComponentTypeAccess().getInstancesKeyword_5_2_1());
    }
	otherlv_22='{' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMAODComponentTypeAccess().getLeftCurlyBracketKeyword_5_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAODComponentTypeAccess().getComponentTypeInstancesMAODComponentTypeInstanceParserRuleCall_5_2_3_0()); 
	    }
		lv_componentTypeInstances_23_0=ruleMAODComponentTypeInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAODComponentTypeRule());
	        }
       		add(
       			$current, 
       			"componentTypeInstances",
        		lv_componentTypeInstances_23_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MAODComponentTypeInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_24='}' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_5_2_4());
    }
	otherlv_25=';' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_5_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMAODComponentTypeAccess().getUnorderedGroup_5());
	}

)	otherlv_26='}' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMAODComponentTypeAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_27=';' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMAODComponentTypeAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMIODCType
entryRuleMIODCType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMIODCTypeRule()); }
	 iv_ruleMIODCType=ruleMIODCType 
	 { $current=$iv_ruleMIODCType.current; } 
	 EOF 
;

// Rule MIODCType
ruleMIODCType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMIODCTypeAccess().getMIODAbstractComponentTypeParserRuleCall_0()); 
    }
    this_MIODAbstractComponentType_0=ruleMIODAbstractComponentType
    { 
        $current = $this_MIODAbstractComponentType_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMIODCTypeAccess().getMIODComponentTypeParserRuleCall_1()); 
    }
    this_MIODComponentType_1=ruleMIODComponentType
    { 
        $current = $this_MIODComponentType_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMIODAbstractComponentType
entryRuleMIODAbstractComponentType returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMIODAbstractComponentTypeRule()); }
	 iv_ruleMIODAbstractComponentType=ruleMIODAbstractComponentType 
	 { $current=$iv_ruleMIODAbstractComponentType.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MIODAbstractComponentType
ruleMIODAbstractComponentType returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='abstract' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMIODAbstractComponentTypeAccess().getAbstractKeyword_0());
    }
	otherlv_1='component' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMIODAbstractComponentTypeAccess().getComponentKeyword_1());
    }
	otherlv_2='type' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMIODAbstractComponentTypeAccess().getTypeKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMIODAbstractComponentTypeAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODAbstractComponentTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)(	otherlv_4='inherits' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsKeyword_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODAbstractComponentTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_4_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMIODAbstractComponentTypeAccess().getCommaKeyword_4_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODAbstractComponentTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODAbstractComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_4_2_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_8='{' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_5());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), 0);
	 				}
					({true}?=>(	otherlv_10='attributes' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesKeyword_6_0_0());
    }
	otherlv_11='{' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_6_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODAbstractComponentTypeAccess().getAttributesMParameterParserRuleCall_6_0_2_0()); 
	    }
		lv_attributes_12_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODAbstractComponentTypeRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_12_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_13='}' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_6_0_3());
    }
	otherlv_14=';' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_6_0_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), 1);
	 				}
					({true}?=>(	otherlv_15='port' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMIODAbstractComponentTypeAccess().getPortKeyword_6_1_0());
    }
	otherlv_16='instances' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMIODAbstractComponentTypeAccess().getInstancesKeyword_6_1_1());
    }
	otherlv_17='{' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_6_1_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODAbstractComponentTypeAccess().getPortTypeInstancesMPortTypeInstanceParserRuleCall_6_1_3_0()); 
	    }
		lv_portTypeInstances_18_0=ruleMPortTypeInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODAbstractComponentTypeRule());
	        }
       		add(
       			$current, 
       			"portTypeInstances",
        		lv_portTypeInstances_18_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MPortTypeInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_19='}' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_6_1_4());
    }
	otherlv_20=';' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_6_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6(), 2);
	 				}
					({true}?=>(	otherlv_21='internal' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMIODAbstractComponentTypeAccess().getInternalKeyword_6_2_0());
    }
	otherlv_22='instances' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMIODAbstractComponentTypeAccess().getInstancesKeyword_6_2_1());
    }
	otherlv_23='{' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMIODAbstractComponentTypeAccess().getLeftCurlyBracketKeyword_6_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODAbstractComponentTypeAccess().getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_6_2_3_0()); 
	    }
		lv_componentTypeInstances_24_0=ruleMIODComponentTypeInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODAbstractComponentTypeRule());
	        }
       		add(
       			$current, 
       			"componentTypeInstances",
        		lv_componentTypeInstances_24_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MIODComponentTypeInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_25='}' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_6_2_4());
    }
	otherlv_26=';' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_6_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMIODAbstractComponentTypeAccess().getUnorderedGroup_6());
	}

)	otherlv_27='}' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMIODAbstractComponentTypeAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_28=';' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMIODAbstractComponentTypeAccess().getSemicolonKeyword_8());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMIODComponentType
entryRuleMIODComponentType returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMIODComponentTypeRule()); }
	 iv_ruleMIODComponentType=ruleMIODComponentType 
	 { $current=$iv_ruleMIODComponentType.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MIODComponentType
ruleMIODComponentType returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='component' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMIODComponentTypeAccess().getComponentKeyword_0());
    }
	otherlv_1='type' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMIODComponentTypeAccess().getTypeKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMIODComponentTypeAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODComponentTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)(	otherlv_3='inherits' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMIODComponentTypeAccess().getInheritsKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODComponentTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_3_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMIODComponentTypeAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODComponentTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODComponentTypeAccess().getInheritsMIODAbstractComponentTypeCrossReference_3_2_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_7='{' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_9='language' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMIODComponentTypeAccess().getLanguageKeyword_5_0_0());
    }
	otherlv_10=':=' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMIODComponentTypeAccess().getColonEqualsSignKeyword_5_0_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODComponentTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMIODComponentTypeAccess().getLanguageMLanguageCrossReference_5_0_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_12=';' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_13='attributes' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMIODComponentTypeAccess().getAttributesKeyword_5_1_0());
    }
	otherlv_14='{' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_5_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODComponentTypeAccess().getAttributesMParameterParserRuleCall_5_1_2_0()); 
	    }
		lv_attributes_15_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODComponentTypeRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_15_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_16='}' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_5_1_3());
    }
	otherlv_17=';' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_18='port' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMIODComponentTypeAccess().getPortKeyword_5_2_0());
    }
	otherlv_19='instances' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMIODComponentTypeAccess().getInstancesKeyword_5_2_1());
    }
	otherlv_20='{' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_5_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODComponentTypeAccess().getPortTypeInstancesMPortTypeInstanceParserRuleCall_5_2_3_0()); 
	    }
		lv_portTypeInstances_21_0=ruleMPortTypeInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODComponentTypeRule());
	        }
       		add(
       			$current, 
       			"portTypeInstances",
        		lv_portTypeInstances_21_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MPortTypeInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_22='}' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_5_2_4());
    }
	otherlv_23=';' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_24='internal' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMIODComponentTypeAccess().getInternalKeyword_5_3_0());
    }
	otherlv_25='instances' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMIODComponentTypeAccess().getInstancesKeyword_5_3_1());
    }
	otherlv_26='{' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMIODComponentTypeAccess().getLeftCurlyBracketKeyword_5_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODComponentTypeAccess().getComponentTypeInstancesMIODComponentTypeInstanceParserRuleCall_5_3_3_0()); 
	    }
		lv_componentTypeInstances_27_0=ruleMIODComponentTypeInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODComponentTypeRule());
	        }
       		add(
       			$current, 
       			"componentTypeInstances",
        		lv_componentTypeInstances_27_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MIODComponentTypeInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_28='}' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_5_3_4());
    }
	otherlv_29=';' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_5_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMIODComponentTypeAccess().getUnorderedGroup_5());
	}

)	otherlv_30='}' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMIODComponentTypeAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_31=';' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMIODComponentTypeAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMIODComponentTypeInstance
entryRuleMIODComponentTypeInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMIODComponentTypeInstanceRule()); }
	 iv_ruleMIODComponentTypeInstance=ruleMIODComponentTypeInstance 
	 { $current=$iv_ruleMIODComponentTypeInstance.current; } 
	 EOF 
;

// Rule MIODComponentTypeInstance
ruleMIODComponentTypeInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='type' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMIODComponentTypeInstanceAccess().getTypeKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMIODComponentTypeInstanceRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMIODComponentTypeInstanceAccess().getComponentTypeMIODAbstractComponentTypeCrossReference_1_0()); 
	}

)
)	otherlv_2='range' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMIODComponentTypeInstanceAccess().getRangeKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODComponentTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_lowerBound_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODComponentTypeInstanceRule());
	        }
       		set(
       			$current, 
       			"lowerBound",
        		lv_lowerBound_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='to' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMIODComponentTypeInstanceAccess().getToKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMIODComponentTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_5_0()); 
	    }
		lv_upperBound_5_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMIODComponentTypeInstanceRule());
	        }
       		set(
       			$current, 
       			"upperBound",
        		lv_upperBound_5_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMIODComponentTypeInstanceAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleMAODComponentTypeInstance
entryRuleMAODComponentTypeInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMAODComponentTypeInstanceRule()); }
	 iv_ruleMAODComponentTypeInstance=ruleMAODComponentTypeInstance 
	 { $current=$iv_ruleMAODComponentTypeInstance.current; } 
	 EOF 
;

// Rule MAODComponentTypeInstance
ruleMAODComponentTypeInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='type' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMAODComponentTypeInstanceAccess().getTypeKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAODComponentTypeInstanceRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMAODComponentTypeInstanceAccess().getComponentTypeMAODComponentTypeCrossReference_1_0()); 
	}

)
)	otherlv_2='range' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMAODComponentTypeInstanceAccess().getRangeKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAODComponentTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_lowerBound_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAODComponentTypeInstanceRule());
	        }
       		set(
       			$current, 
       			"lowerBound",
        		lv_lowerBound_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='to' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMAODComponentTypeInstanceAccess().getToKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAODComponentTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_5_0()); 
	    }
		lv_upperBound_5_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAODComponentTypeInstanceRule());
	        }
       		set(
       			$current, 
       			"upperBound",
        		lv_upperBound_5_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMAODComponentTypeInstanceAccess().getSemicolonKeyword_6());
    }
)
;





// Entry rule entryRuleMPortTypeInstance
entryRuleMPortTypeInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMPortTypeInstanceRule()); }
	 iv_ruleMPortTypeInstance=ruleMPortTypeInstance 
	 { $current=$iv_ruleMPortTypeInstance.current; } 
	 EOF 
;

// Rule MPortTypeInstance
ruleMPortTypeInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMPortTypeInstanceAccess().getMExternalPortTypeInstanceParserRuleCall_0()); 
    }
    this_MExternalPortTypeInstance_0=ruleMExternalPortTypeInstance
    { 
        $current = $this_MExternalPortTypeInstance_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMPortTypeInstanceAccess().getMInternalPortTypeInstanceParserRuleCall_1()); 
    }
    this_MInternalPortTypeInstance_1=ruleMInternalPortTypeInstance
    { 
        $current = $this_MInternalPortTypeInstance_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMExternalPortTypeInstance
entryRuleMExternalPortTypeInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMExternalPortTypeInstanceRule()); }
	 iv_ruleMExternalPortTypeInstance=ruleMExternalPortTypeInstance 
	 { $current=$iv_ruleMExternalPortTypeInstance.current; } 
	 EOF 
;

// Rule MExternalPortTypeInstance
ruleMExternalPortTypeInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMExternalPortTypeInstanceAccess().getMExternalClientPortTypeInstanceParserRuleCall_0()); 
    }
    this_MExternalClientPortTypeInstance_0=ruleMExternalClientPortTypeInstance
    { 
        $current = $this_MExternalClientPortTypeInstance_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMExternalPortTypeInstanceAccess().getMExternalServerPortTypeInstanceParserRuleCall_1()); 
    }
    this_MExternalServerPortTypeInstance_1=ruleMExternalServerPortTypeInstance
    { 
        $current = $this_MExternalServerPortTypeInstance_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMExternalClientPortTypeInstance
entryRuleMExternalClientPortTypeInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMExternalClientPortTypeInstanceRule()); }
	 iv_ruleMExternalClientPortTypeInstance=ruleMExternalClientPortTypeInstance 
	 { $current=$iv_ruleMExternalClientPortTypeInstance.current; } 
	 EOF 
;

// Rule MExternalClientPortTypeInstance
ruleMExternalClientPortTypeInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='external' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMExternalClientPortTypeInstanceAccess().getExternalKeyword_0());
    }
	otherlv_1='client' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMExternalClientPortTypeInstanceAccess().getClientKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMExternalClientPortTypeInstanceRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getMExternalClientPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0()); 
	}

)
)	otherlv_3='range' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMExternalClientPortTypeInstanceAccess().getRangeKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMExternalClientPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); 
	    }
		lv_lowerBound_4_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMExternalClientPortTypeInstanceRule());
	        }
       		set(
       			$current, 
       			"lowerBound",
        		lv_lowerBound_4_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='to' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMExternalClientPortTypeInstanceAccess().getToKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMExternalClientPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); 
	    }
		lv_upperBound_6_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMExternalClientPortTypeInstanceRule());
	        }
       		set(
       			$current, 
       			"upperBound",
        		lv_upperBound_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMExternalClientPortTypeInstanceAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleMExternalServerPortTypeInstance
entryRuleMExternalServerPortTypeInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMExternalServerPortTypeInstanceRule()); }
	 iv_ruleMExternalServerPortTypeInstance=ruleMExternalServerPortTypeInstance 
	 { $current=$iv_ruleMExternalServerPortTypeInstance.current; } 
	 EOF 
;

// Rule MExternalServerPortTypeInstance
ruleMExternalServerPortTypeInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='external' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMExternalServerPortTypeInstanceAccess().getExternalKeyword_0());
    }
	otherlv_1='server' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMExternalServerPortTypeInstanceAccess().getServerKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMExternalServerPortTypeInstanceRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getMExternalServerPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0()); 
	}

)
)	otherlv_3='range' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMExternalServerPortTypeInstanceAccess().getRangeKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMExternalServerPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); 
	    }
		lv_lowerBound_4_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMExternalServerPortTypeInstanceRule());
	        }
       		set(
       			$current, 
       			"lowerBound",
        		lv_lowerBound_4_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='to' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMExternalServerPortTypeInstanceAccess().getToKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMExternalServerPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); 
	    }
		lv_upperBound_6_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMExternalServerPortTypeInstanceRule());
	        }
       		set(
       			$current, 
       			"upperBound",
        		lv_upperBound_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMExternalServerPortTypeInstanceAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleMInternalPortTypeInstance
entryRuleMInternalPortTypeInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMInternalPortTypeInstanceRule()); }
	 iv_ruleMInternalPortTypeInstance=ruleMInternalPortTypeInstance 
	 { $current=$iv_ruleMInternalPortTypeInstance.current; } 
	 EOF 
;

// Rule MInternalPortTypeInstance
ruleMInternalPortTypeInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMInternalPortTypeInstanceAccess().getMInternalClientPortTypeInstanceParserRuleCall_0()); 
    }
    this_MInternalClientPortTypeInstance_0=ruleMInternalClientPortTypeInstance
    { 
        $current = $this_MInternalClientPortTypeInstance_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMInternalPortTypeInstanceAccess().getMInternalServerPortTypeInstanceParserRuleCall_1()); 
    }
    this_MInternalServerPortTypeInstance_1=ruleMInternalServerPortTypeInstance
    { 
        $current = $this_MInternalServerPortTypeInstance_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMInternalClientPortTypeInstance
entryRuleMInternalClientPortTypeInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMInternalClientPortTypeInstanceRule()); }
	 iv_ruleMInternalClientPortTypeInstance=ruleMInternalClientPortTypeInstance 
	 { $current=$iv_ruleMInternalClientPortTypeInstance.current; } 
	 EOF 
;

// Rule MInternalClientPortTypeInstance
ruleMInternalClientPortTypeInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='internal' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMInternalClientPortTypeInstanceAccess().getInternalKeyword_0());
    }
	otherlv_1='client' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMInternalClientPortTypeInstanceAccess().getClientKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalClientPortTypeInstanceRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getMInternalClientPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0()); 
	}

)
)	otherlv_3='range' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMInternalClientPortTypeInstanceAccess().getRangeKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMInternalClientPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); 
	    }
		lv_lowerBound_4_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMInternalClientPortTypeInstanceRule());
	        }
       		set(
       			$current, 
       			"lowerBound",
        		lv_lowerBound_4_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='to' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMInternalClientPortTypeInstanceAccess().getToKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMInternalClientPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); 
	    }
		lv_upperBound_6_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMInternalClientPortTypeInstanceRule());
	        }
       		set(
       			$current, 
       			"upperBound",
        		lv_upperBound_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMInternalClientPortTypeInstanceAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleMInternalServerPortTypeInstance
entryRuleMInternalServerPortTypeInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMInternalServerPortTypeInstanceRule()); }
	 iv_ruleMInternalServerPortTypeInstance=ruleMInternalServerPortTypeInstance 
	 { $current=$iv_ruleMInternalServerPortTypeInstance.current; } 
	 EOF 
;

// Rule MInternalServerPortTypeInstance
ruleMInternalServerPortTypeInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='internal' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMInternalServerPortTypeInstanceAccess().getInternalKeyword_0());
    }
	otherlv_1='server' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMInternalServerPortTypeInstanceAccess().getServerKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalServerPortTypeInstanceRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getMInternalServerPortTypeInstanceAccess().getPortTypeMPortTypeCrossReference_2_0()); 
	}

)
)	otherlv_3='range' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMInternalServerPortTypeInstanceAccess().getRangeKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMInternalServerPortTypeInstanceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_4_0()); 
	    }
		lv_lowerBound_4_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMInternalServerPortTypeInstanceRule());
	        }
       		set(
       			$current, 
       			"lowerBound",
        		lv_lowerBound_4_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='to' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMInternalServerPortTypeInstanceAccess().getToKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMInternalServerPortTypeInstanceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_6_0()); 
	    }
		lv_upperBound_6_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMInternalServerPortTypeInstanceRule());
	        }
       		set(
       			$current, 
       			"upperBound",
        		lv_upperBound_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMInternalServerPortTypeInstanceAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleMPortType
entryRuleMPortType returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMPortTypeAccess().getUnorderedGroup_6()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMPortTypeRule()); }
	 iv_ruleMPortType=ruleMPortType 
	 { $current=$iv_ruleMPortType.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MPortType
ruleMPortType returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMPortTypeAccess().getUnorderedGroup_6()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMPortTypeAccess().getMPortTypeAction_0(),
            $current);
    }
)	otherlv_1='port' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMPortTypeAccess().getPortKeyword_1());
    }
	otherlv_2='type' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMPortTypeAccess().getTypeKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMPortTypeAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPortTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)(	otherlv_4='inherits' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMPortTypeAccess().getInheritsKeyword_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPortTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPortTypeAccess().getInheritsMPortTypeCrossReference_4_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMPortTypeAccess().getCommaKeyword_4_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPortTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPortTypeAccess().getInheritsMPortTypeCrossReference_4_2_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_8='{' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_5());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 0);
	 				}
					({true}?=>(	otherlv_10='interface' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMPortTypeAccess().getInterfaceKeyword_6_0_0());
    }
	otherlv_11='types' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMPortTypeAccess().getTypesKeyword_6_0_1());
    }
	otherlv_12=':=' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMPortTypeAccess().getColonEqualsSignKeyword_6_0_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPortTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeCrossReference_6_0_3_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_14=',' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMPortTypeAccess().getCommaKeyword_6_0_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMPortTypeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMPortTypeAccess().getInterfaceTypesMInterfaceTypeCrossReference_6_0_4_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_16=';' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_0_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 1);
	 				}
					({true}?=>(	otherlv_17='attributes' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMPortTypeAccess().getAttributesKeyword_6_1_0());
    }
	otherlv_18='{' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_6_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMPortTypeAccess().getAttributesMParameterParserRuleCall_6_1_2_0()); 
	    }
		lv_attributes_19_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMPortTypeRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_19_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_20='}' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_6_1_3());
    }
	otherlv_21=';' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 2);
	 				}
					({true}?=>(	otherlv_22='client' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMPortTypeAccess().getClientKeyword_6_2_0());
    }
	otherlv_23='attributes' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMPortTypeAccess().getAttributesKeyword_6_2_1());
    }
	otherlv_24='{' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_6_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMPortTypeAccess().getClientAttributesMParameterParserRuleCall_6_2_3_0()); 
	    }
		lv_clientAttributes_25_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMPortTypeRule());
	        }
       		add(
       			$current, 
       			"clientAttributes",
        		lv_clientAttributes_25_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_26='}' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_6_2_4());
    }
	otherlv_27=';' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6(), 3);
	 				}
					({true}?=>(	otherlv_28='server' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMPortTypeAccess().getServerKeyword_6_3_0());
    }
	otherlv_29='attributes' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMPortTypeAccess().getAttributesKeyword_6_3_1());
    }
	otherlv_30='{' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getMPortTypeAccess().getLeftCurlyBracketKeyword_6_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMPortTypeAccess().getServerAttributesMParameterParserRuleCall_6_3_3_0()); 
	    }
		lv_serverAttributes_31_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMPortTypeRule());
	        }
       		add(
       			$current, 
       			"serverAttributes",
        		lv_serverAttributes_31_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_32='}' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_6_3_4());
    }
	otherlv_33=';' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMPortTypeAccess().getSemicolonKeyword_6_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMPortTypeAccess().getUnorderedGroup_6());
	}

)	otherlv_34='}' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMPortTypeAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_35=';' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMPortTypeAccess().getSemicolonKeyword_8());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMExchangeModel
entryRuleMExchangeModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMExchangeModelRule()); }
	 iv_ruleMExchangeModel=ruleMExchangeModel 
	 { $current=$iv_ruleMExchangeModel.current; } 
	 EOF 
;

// Rule MExchangeModel
ruleMExchangeModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMExchangeModelAccess().getMExchangeModelAction_0(),
            $current);
    }
)	otherlv_1='exchange' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMExchangeModelAccess().getExchangeKeyword_1());
    }
	otherlv_2='model' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMExchangeModelAccess().getModelKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMExchangeModelAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMExchangeModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)(	otherlv_4='inherits' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMExchangeModelAccess().getInheritsKeyword_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMExchangeModelRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelCrossReference_4_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMExchangeModelAccess().getCommaKeyword_4_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMExchangeModelRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMExchangeModelAccess().getInheritsMExchangeModelCrossReference_4_2_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_8='{' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMExchangeModelAccess().getLeftCurlyBracketKeyword_5());
    }
	otherlv_9='interface' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMExchangeModelAccess().getInterfaceKeyword_6());
    }
	otherlv_10='types' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMExchangeModelAccess().getTypesKeyword_7());
    }
	otherlv_11=':=' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMExchangeModelAccess().getColonEqualsSignKeyword_8());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMExchangeModelRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_9_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_13=',' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMExchangeModelAccess().getCommaKeyword_10());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMExchangeModelRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_11_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_15=',' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMExchangeModelAccess().getCommaKeyword_12_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMExchangeModelRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMExchangeModelAccess().getInterfaceTypesMInterfaceTypeCrossReference_12_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_17=';' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMExchangeModelAccess().getSemicolonKeyword_13());
    }
	otherlv_18='}' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMExchangeModelAccess().getRightCurlyBracketKeyword_14());
    }
	otherlv_19=';' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMExchangeModelAccess().getSemicolonKeyword_15());
    }
)
;





// Entry rule entryRuleMConnector
entryRuleMConnector returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMConnectorAccess().getUnorderedGroup_4()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMConnectorRule()); }
	 iv_ruleMConnector=ruleMConnector 
	 { $current=$iv_ruleMConnector.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MConnector
ruleMConnector returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMConnectorAccess().getUnorderedGroup_4()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='connector' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMConnectorAccess().getConnectorKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectorRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getMConnectorAccess().getInheritsKeyword_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectorRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMConnectorAccess().getInheritsMConnectorCrossReference_2_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMConnectorAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectorRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMConnectorAccess().getInheritsMConnectorCrossReference_2_2_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMConnectorAccess().getLeftCurlyBracketKeyword_3());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMConnectorAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_8='client' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMConnectorAccess().getClientKeyword_4_0_0());
    }
	otherlv_9='types' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMConnectorAccess().getTypesKeyword_4_0_1());
    }
	otherlv_10=':=' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMConnectorAccess().getColonEqualsSignKeyword_4_0_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectorRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeCrossReference_4_0_3_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_12=',' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMConnectorAccess().getCommaKeyword_4_0_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectorRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMConnectorAccess().getClientPortTypesMPortTypeCrossReference_4_0_4_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_14=';' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMConnectorAccess().getSemicolonKeyword_4_0_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMConnectorAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_15='server' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMConnectorAccess().getServerKeyword_4_1_0());
    }
	otherlv_16='types' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMConnectorAccess().getTypesKeyword_4_1_1());
    }
	otherlv_17=':=' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMConnectorAccess().getColonEqualsSignKeyword_4_1_2());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectorRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeCrossReference_4_1_3_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_19=',' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMConnectorAccess().getCommaKeyword_4_1_4_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMConnectorRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMConnectorAccess().getServerPortTypesMPortTypeCrossReference_4_1_4_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_21=';' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMConnectorAccess().getSemicolonKeyword_4_1_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMConnectorAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMConnectorAccess().getUnorderedGroup_4(), 2);
	 				}
					({true}?=>(	otherlv_22='attributes' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMConnectorAccess().getAttributesKeyword_4_2_0());
    }
	otherlv_23='{' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMConnectorAccess().getLeftCurlyBracketKeyword_4_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMConnectorAccess().getAttributesMParameterParserRuleCall_4_2_2_0()); 
	    }
		lv_attributes_24_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMConnectorRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_24_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_25='}' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMConnectorAccess().getRightCurlyBracketKeyword_4_2_3());
    }
	otherlv_26=';' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMConnectorAccess().getSemicolonKeyword_4_2_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMConnectorAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMConnectorAccess().getUnorderedGroup_4())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMConnectorAccess().getUnorderedGroup_4());
	}

)	otherlv_27='}' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMConnectorAccess().getRightCurlyBracketKeyword_5());
    }
	otherlv_28=';' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMConnectorAccess().getSemicolonKeyword_6());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterRange");
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
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0(),
            $current);
    }
)	otherlv_1='enum' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParameterDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0()); 
	    }
		lv_literals_4_0=ruleMEnumParameterLiteralRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParameterDefinitionRule());
	        }
       		add(
       			$current, 
       			"literals",
        		lv_literals_4_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MEnumParameterLiteralRule");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0()); 
	    }
		lv_literals_6_0=ruleMEnumParameterLiteralRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMEnumParameterDefinitionRule());
	        }
       		add(
       			$current, 
       			"literals",
        		lv_literals_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MEnumParameterLiteralRule");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMEnumParameterDefinitionAccess().getSemicolonKeyword_7());
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterRange");
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
        newCompositeNode(grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamStringLiteralParserRuleCall_3()); 
    }
    this_MEnumParamStringLiteral_3=ruleMEnumParamStringLiteral
    { 
        $current = $this_MEnumParamStringLiteral_3.current; 
        afterParserOrEnumRuleCall();
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.EBoolean");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.INTEGER");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.REAL");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueTERM");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpressionOperators");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValue");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueTERMOperators");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueTERM");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=']' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMParameterCCRAccess().getRightSquareBracketKeyword_5());
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.INTEGER");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.REAL");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMEnumParamStringLiteral
entryRuleMEnumParamStringLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMEnumParamStringLiteralRule()); }
	 iv_ruleMEnumParamStringLiteral=ruleMEnumParamStringLiteral 
	 { $current=$iv_ruleMEnumParamStringLiteral.current; } 
	 EOF 
;

// Rule MEnumParamStringLiteral
ruleMEnumParamStringLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0(),
            $current);
    }
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMEnumParamStringLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamStringLiteralRule());
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
    	newLeafNode(otherlv_2, grammarAccess.getMEnumParamStringLiteralAccess().getEqualsSignKeyword_2());
    }
(
(
		lv_isRaw_3_0=	'raw' 
    {
        newLeafNode(lv_isRaw_3_0, grammarAccess.getMEnumParamStringLiteralAccess().getIsRawRawKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamStringLiteralRule());
	        }
       		setWithLastConsumed($current, "isRaw", true, "raw");
	    }

)
)?(
(
		lv_value_4_0=RULE_STRING
		{
			newLeafNode(lv_value_4_0, grammarAccess.getMEnumParamStringLiteralAccess().getValueSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMEnumParamStringLiteralRule());
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.DOM.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_5());
    }
)
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


