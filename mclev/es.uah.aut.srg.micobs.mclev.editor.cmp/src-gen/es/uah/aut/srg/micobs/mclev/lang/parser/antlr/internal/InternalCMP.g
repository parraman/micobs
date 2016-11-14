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
grammar InternalCMP;

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
import es.uah.aut.srg.micobs.mclev.lang.services.CMPGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private CMPGrammarAccess grammarAccess;
 	
    public InternalCMPParser(TokenStream input, CMPGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MMCLEVCMPPackageFile";	
   	}
   	
   	@Override
   	protected CMPGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMMCLEVCMPPackageFile
entryRuleMMCLEVCMPPackageFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMCLEVCMPPackageFileRule()); }
	 iv_ruleMMCLEVCMPPackageFile=ruleMMCLEVCMPPackageFile 
	 { $current=$iv_ruleMMCLEVCMPPackageFile.current; } 
	 EOF 
;

// Rule MMCLEVCMPPackageFile
ruleMMCLEVCMPPackageFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMCLEVCMPPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMMCLEVCMPPackageFileAccess().getSemicolonKeyword_2());
    }
(	otherlv_3='import' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMMCLEVCMPPackageFileAccess().getImportKeyword_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMMCLEVCMPPackageFileRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVCMPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMMCLEVCMPPackageFileAccess().getSemicolonKeyword_3_2());
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getMMCLEVCMPPackageFileAccess().getElementMMCLEVCMPPackageElementParserRuleCall_4_0()); 
	    }
		lv_element_6_0=ruleMMCLEVCMPPackageElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMMCLEVCMPPackageFileRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MMCLEVCMPPackageElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMMCLEVCMPPackageElement
entryRuleMMCLEVCMPPackageElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMMCLEVCMPPackageElementRule()); }
	 iv_ruleMMCLEVCMPPackageElement=ruleMMCLEVCMPPackageElement 
	 { $current=$iv_ruleMMCLEVCMPPackageElement.current; } 
	 EOF 
;

// Rule MMCLEVCMPPackageElement
ruleMMCLEVCMPPackageElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMCLEVCMPPackageElementAccess().getMAbstractComponentParserRuleCall_0()); 
    }
    this_MAbstractComponent_0=ruleMAbstractComponent
    { 
        $current = $this_MAbstractComponent_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMMCLEVCMPPackageElementAccess().getMComponentParserRuleCall_1()); 
    }
    this_MComponent_1=ruleMComponent
    { 
        $current = $this_MComponent_1.current; 
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





// Entry rule entryRuleMPort
entryRuleMPort returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMPortRule()); }
	 iv_ruleMPort=ruleMPort 
	 { $current=$iv_ruleMPort.current; } 
	 EOF 
;

// Rule MPort
ruleMPort returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMPortAccess().getMServerPortParserRuleCall_0()); 
    }
    this_MServerPort_0=ruleMServerPort
    { 
        $current = $this_MServerPort_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMPortAccess().getMClientPortParserRuleCall_1()); 
    }
    this_MClientPort_1=ruleMClientPort
    { 
        $current = $this_MClientPort_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMInternalConnection
entryRuleMInternalConnection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMInternalConnectionRule()); }
	 iv_ruleMInternalConnection=ruleMInternalConnection 
	 { $current=$iv_ruleMInternalConnection.current; } 
	 EOF 
;

// Rule MInternalConnection
ruleMInternalConnection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMInternalConnectionAccess().getMInternalComponentConnectionParserRuleCall_0()); 
    }
    this_MInternalComponentConnection_0=ruleMInternalComponentConnection
    { 
        $current = $this_MInternalComponentConnection_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getMInternalConnectionAccess().getMInternalComponentPlatformSwitchParserRuleCall_1()); 
    }
    this_MInternalComponentPlatformSwitch_1=ruleMInternalComponentPlatformSwitch
    { 
        $current = $this_MInternalComponentPlatformSwitch_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMAbstractComponent
entryRuleMAbstractComponent returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMAbstractComponentRule()); }
	 iv_ruleMAbstractComponent=ruleMAbstractComponent 
	 { $current=$iv_ruleMAbstractComponent.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MAbstractComponent
ruleMAbstractComponent returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8()
		);
    }
    @after { leaveRule(); }:
(	otherlv_0='abstract' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMAbstractComponentAccess().getAbstractKeyword_0());
    }
	otherlv_1='component' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMAbstractComponentAccess().getComponentKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAbstractComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getDomainMDomainCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='::' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMAbstractComponentAccess().getColonColonKeyword_3());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAbstractComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getTypeMComponentTypeCrossReference_4_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_5_0=RULE_ID
		{
			newLeafNode(lv_name_5_0, grammarAccess.getMAbstractComponentAccess().getNameIDTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAbstractComponentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_5_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)(	otherlv_6='inherits' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMAbstractComponentAccess().getInheritsKeyword_6_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAbstractComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentCrossReference_6_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMAbstractComponentAccess().getCommaKeyword_6_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMAbstractComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentCrossReference_6_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_10='{' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_7());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 0);
	 				}
					({true}?=>(	otherlv_12='version' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMAbstractComponentAccess().getVersionKeyword_8_0_0());
    }
	otherlv_13=':=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMAbstractComponentAccess().getColonEqualsSignKeyword_8_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getVersionVersionParserRuleCall_8_0_2_0()); 
	    }
		lv_version_14_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAbstractComponentRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_14_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 1);
	 				}
					({true}?=>(	otherlv_16='attributes' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMAbstractComponentAccess().getAttributesKeyword_8_1_0());
    }
	otherlv_17='{' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getAttributesMParameterParserRuleCall_8_1_2_0()); 
	    }
		lv_attributes_18_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAbstractComponentRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_18_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_19='}' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_1_3());
    }
	otherlv_20=';' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 2);
	 				}
					({true}?=>(	otherlv_21='attribute' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMAbstractComponentAccess().getAttributeKeyword_8_2_0());
    }
	otherlv_22='values' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMAbstractComponentAccess().getValuesKeyword_8_2_1());
    }
	otherlv_23='{' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_2_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_2_3_0()); 
	    }
		lv_attributeValueAssignments_24_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAbstractComponentRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_24_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_25='}' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_2_4());
    }
	otherlv_26=';' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_2_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8(), 3);
	 				}
					({true}?=>(	otherlv_27='external' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMAbstractComponentAccess().getExternalKeyword_8_3_0());
    }
	otherlv_28='ports' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMAbstractComponentAccess().getPortsKeyword_8_3_1());
    }
	otherlv_29='{' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMAbstractComponentAccess().getExternalPortsMPortParserRuleCall_8_3_3_0()); 
	    }
		lv_externalPorts_30_0=ruleMPort		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMAbstractComponentRule());
	        }
       		add(
       			$current, 
       			"externalPorts",
        		lv_externalPorts_30_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MPort");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_31='}' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_3_4());
    }
	otherlv_32=';' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8());
	}

)	otherlv_33='}' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_9());
    }
	otherlv_34=';' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_10());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMComponent
entryRuleMComponent returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMComponentAccess().getUnorderedGroup_8()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getMComponentRule()); }
	 iv_ruleMComponent=ruleMComponent 
	 { $current=$iv_ruleMComponent.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule MComponent
ruleMComponent returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getMComponentAccess().getUnorderedGroup_8()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMComponentAccess().getMComponentAction_0(),
            $current);
    }
)	otherlv_1='component' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMComponentAccess().getComponentKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getDomainMDomainCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='::' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMComponentAccess().getColonColonKeyword_3());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getTypeMComponentTypeCrossReference_4_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_5_0=RULE_ID
		{
			newLeafNode(lv_name_5_0, grammarAccess.getMComponentAccess().getNameIDTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMComponentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_5_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)(	otherlv_6='inherits' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMComponentAccess().getInheritsKeyword_6_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentCrossReference_6_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMComponentAccess().getCommaKeyword_6_2_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentCrossReference_6_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_10='{' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_7());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 0);
	 				}
					({true}?=>(	otherlv_12='version' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMComponentAccess().getVersionKeyword_8_0_0());
    }
	otherlv_13=':=' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getVersionVersionParserRuleCall_8_0_2_0()); 
	    }
		lv_version_14_0=ruleVersion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMComponentRule());
	        }
       		set(
       			$current, 
       			"version",
        		lv_version_14_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.Version");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 1);
	 				}
					({true}?=>(	otherlv_16='languages' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMComponentAccess().getLanguagesKeyword_8_1_0());
    }
	otherlv_17=':=' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_1_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getLanguagesMLanguageCrossReference_8_1_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_19=',' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getMComponentAccess().getCommaKeyword_8_1_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getLanguagesMLanguageCrossReference_8_1_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_21=';' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_1_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 2);
	 				}
					({true}?=>(	otherlv_22='attributes' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getMComponentAccess().getAttributesKeyword_8_2_0());
    }
	otherlv_23='{' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getAttributesMParameterParserRuleCall_8_2_2_0()); 
	    }
		lv_attributes_24_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMComponentRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_24_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_25='}' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_2_3());
    }
	otherlv_26=';' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_2_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 3);
	 				}
					({true}?=>(	otherlv_27='attribute' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getMComponentAccess().getAttributeKeyword_8_3_0());
    }
	otherlv_28='values' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getMComponentAccess().getValuesKeyword_8_3_1());
    }
	otherlv_29='{' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_3_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_3_3_0()); 
	    }
		lv_attributeValueAssignments_30_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMComponentRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_30_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_31='}' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_3_4());
    }
	otherlv_32=';' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_3_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 4);
	 				}
					({true}?=>(	otherlv_33='external' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getMComponentAccess().getExternalKeyword_8_4_0());
    }
	otherlv_34='ports' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getMComponentAccess().getPortsKeyword_8_4_1());
    }
	otherlv_35='{' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_4_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getExternalPortsMPortParserRuleCall_8_4_3_0()); 
	    }
		lv_externalPorts_36_0=ruleMPort		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMComponentRule());
	        }
       		add(
       			$current, 
       			"externalPorts",
        		lv_externalPorts_36_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MPort");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_37='}' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_4_4());
    }
	otherlv_38=';' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_4_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 5);
	 				}
					({true}?=>(	otherlv_39='internal' 
    {
    	newLeafNode(otherlv_39, grammarAccess.getMComponentAccess().getInternalKeyword_8_5_0());
    }
	otherlv_40='ports' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getMComponentAccess().getPortsKeyword_8_5_1());
    }
	otherlv_41='{' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_5_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getInternalPortsMPortParserRuleCall_8_5_3_0()); 
	    }
		lv_internalPorts_42_0=ruleMPort		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMComponentRule());
	        }
       		add(
       			$current, 
       			"internalPorts",
        		lv_internalPorts_42_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MPort");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_43='}' 
    {
    	newLeafNode(otherlv_43, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_5_4());
    }
	otherlv_44=';' 
    {
    	newLeafNode(otherlv_44, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_5_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 6);
	 				}
					({true}?=>(	otherlv_45='requires' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getMComponentAccess().getRequiresKeyword_8_6_0());
    }
	otherlv_46=':=' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_6_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getRequiresMSAICrossReference_8_6_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_48=',' 
    {
    	newLeafNode(otherlv_48, grammarAccess.getMComponentAccess().getCommaKeyword_8_6_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMComponentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getRequiresMSAICrossReference_8_6_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_50=';' 
    {
    	newLeafNode(otherlv_50, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_6_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 7);
	 				}
					({true}?=>(	otherlv_51='supported' 
    {
    	newLeafNode(otherlv_51, grammarAccess.getMComponentAccess().getSupportedKeyword_8_7_0());
    }
	otherlv_52='platforms' 
    {
    	newLeafNode(otherlv_52, grammarAccess.getMComponentAccess().getPlatformsKeyword_8_7_1());
    }
	otherlv_53='{' 
    {
    	newLeafNode(otherlv_53, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_7_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getSupportedPlatformsComponentSupportedPlatformParserRuleCall_8_7_3_0()); 
	    }
		lv_supportedPlatforms_54_0=ruleComponentSupportedPlatform		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMComponentRule());
	        }
       		add(
       			$current, 
       			"supportedPlatforms",
        		lv_supportedPlatforms_54_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.ComponentSupportedPlatform");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_55='}' 
    {
    	newLeafNode(otherlv_55, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_7_4());
    }
	otherlv_56=';' 
    {
    	newLeafNode(otherlv_56, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_7_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 8);
	 				}
					({true}?=>(	otherlv_57='subcomponent' 
    {
    	newLeafNode(otherlv_57, grammarAccess.getMComponentAccess().getSubcomponentKeyword_8_8_0());
    }
	otherlv_58='instances' 
    {
    	newLeafNode(otherlv_58, grammarAccess.getMComponentAccess().getInstancesKeyword_8_8_1());
    }
	otherlv_59='{' 
    {
    	newLeafNode(otherlv_59, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_8_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getInternalComponentsMInternalComponentInstanceParserRuleCall_8_8_3_0()); 
	    }
		lv_internalComponents_60_0=ruleMInternalComponentInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMComponentRule());
	        }
       		add(
       			$current, 
       			"internalComponents",
        		lv_internalComponents_60_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalComponentInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_61='}' 
    {
    	newLeafNode(otherlv_61, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_8_4());
    }
	otherlv_62=';' 
    {
    	newLeafNode(otherlv_62, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_8_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 9)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getMComponentAccess().getUnorderedGroup_8(), 9);
	 				}
					({true}?=>(	otherlv_63='connections' 
    {
    	newLeafNode(otherlv_63, grammarAccess.getMComponentAccess().getConnectionsKeyword_8_9_0());
    }
	otherlv_64='{' 
    {
    	newLeafNode(otherlv_64, grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_9_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMComponentAccess().getConnectionsMInternalConnectionParserRuleCall_8_9_2_0()); 
	    }
		lv_connections_65_0=ruleMInternalConnection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMComponentRule());
	        }
       		add(
       			$current, 
       			"connections",
        		lv_connections_65_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalConnection");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_66='}' 
    {
    	newLeafNode(otherlv_66, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_9_3());
    }
	otherlv_67=';' 
    {
    	newLeafNode(otherlv_67, grammarAccess.getMComponentAccess().getSemicolonKeyword_8_9_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getMComponentAccess().getUnorderedGroup_8())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getMComponentAccess().getUnorderedGroup_8());
	}

)	otherlv_68='}' 
    {
    	newLeafNode(otherlv_68, grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_9());
    }
	otherlv_69=';' 
    {
    	newLeafNode(otherlv_69, grammarAccess.getMComponentAccess().getSemicolonKeyword_10());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





// Entry rule entryRuleMInternalComponentInstance
entryRuleMInternalComponentInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMInternalComponentInstanceRule()); }
	 iv_ruleMInternalComponentInstance=ruleMInternalComponentInstance 
	 { $current=$iv_ruleMInternalComponentInstance.current; } 
	 EOF 
;

// Rule MInternalComponentInstance
ruleMInternalComponentInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_isSingleton_0_0=	'singleton' 
    {
        newLeafNode(lv_isSingleton_0_0, grammarAccess.getMInternalComponentInstanceAccess().getIsSingletonSingletonKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentInstanceRule());
	        }
       		setWithLastConsumed($current, "isSingleton", true, "singleton");
	    }

)
)?	otherlv_1='instance' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMInternalComponentInstanceAccess().getInstanceKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentInstanceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMInternalComponentInstanceAccess().getComponentMComponentCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getMInternalComponentInstanceAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentInstanceRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getMInternalComponentInstanceAccess().getLeftCurlyBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMInternalComponentInstanceAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0()); 
	    }
		lv_attributeValueAssignments_5_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMInternalComponentInstanceRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_5_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMInternalComponentInstanceAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMInternalComponentInstanceAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleMServerPort
entryRuleMServerPort returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMServerPortRule()); }
	 iv_ruleMServerPort=ruleMServerPort 
	 { $current=$iv_ruleMServerPort.current; } 
	 EOF 
;

// Rule MServerPort
ruleMServerPort returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMServerPortAccess().getMServerPortAction_0(),
            $current);
    }
)	otherlv_1='server' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMServerPortAccess().getServerKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServerPortRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServerPortAccess().getTypeMPortTypeCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServerPortRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMServerPortAccess().getInterfaceMInterfaceCrossReference_3_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_4_0=RULE_ID
		{
			newLeafNode(lv_name_4_0, grammarAccess.getMServerPortAccess().getNameIDTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMServerPortRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_4_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMServerPortAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMServerPortAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0()); 
	    }
		lv_attributeValueAssignments_6_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMServerPortRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMServerPortAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMServerPortAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMClientPort
entryRuleMClientPort returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMClientPortRule()); }
	 iv_ruleMClientPort=ruleMClientPort 
	 { $current=$iv_ruleMClientPort.current; } 
	 EOF 
;

// Rule MClientPort
ruleMClientPort returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMClientPortAccess().getMClientPortAction_0(),
            $current);
    }
)	otherlv_1='client' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMClientPortAccess().getClientKeyword_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMClientPortRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMClientPortAccess().getTypeMPortTypeCrossReference_2_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMClientPortRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMClientPortAccess().getInterfaceMInterfaceCrossReference_3_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_4_0=RULE_ID
		{
			newLeafNode(lv_name_4_0, grammarAccess.getMClientPortAccess().getNameIDTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMClientPortRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_4_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMClientPortAccess().getLeftCurlyBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMClientPortAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0()); 
	    }
		lv_attributeValueAssignments_6_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMClientPortRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_6_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMClientPortAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_8=';' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMClientPortAccess().getSemicolonKeyword_8());
    }
)
;





// Entry rule entryRuleMParameterValueAssignment
entryRuleMParameterValueAssignment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMParameterValueAssignmentRule()); }
	 iv_ruleMParameterValueAssignment=ruleMParameterValueAssignment 
	 { $current=$iv_ruleMParameterValueAssignment.current; } 
	 EOF 
;

// Rule MParameterValueAssignment
ruleMParameterValueAssignment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='attribute' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMParameterValueAssignmentAccess().getAttributeKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMParameterValueAssignmentRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMParameterValueAssignmentAccess().getParameterMParameterCrossReference_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMParameterValueAssignmentAccess().getColonEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMParameterValueAssignmentAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0()); 
	    }
		lv_parameterValue_3_0=ruleMParameterValueExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMParameterValueAssignmentRule());
	        }
       		set(
       			$current, 
       			"parameterValue",
        		lv_parameterValue_3_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMParameterValueAssignmentAccess().getSemicolonKeyword_4());
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterRange");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MEnumParameterLiteralRule");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MEnumParameterLiteralRule");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterRange");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.EBoolean");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.INTEGER");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.REAL");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueTERM");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpressionOperators");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValue");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueTERMOperators");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueTERM");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.INTEGER");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.REAL");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
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
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleMInternalComponentConnection
entryRuleMInternalComponentConnection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMInternalComponentConnectionRule()); }
	 iv_ruleMInternalComponentConnection=ruleMInternalComponentConnection 
	 { $current=$iv_ruleMInternalComponentConnection.current; } 
	 EOF 
;

// Rule MInternalComponentConnection
ruleMInternalComponentConnection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMInternalComponentConnectionAccess().getMInternalComponentConnectionAction_0(),
            $current);
    }
)	otherlv_1='connection' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMInternalComponentConnectionAccess().getConnectionKeyword_1());
    }
(	otherlv_2='this' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMInternalComponentConnectionAccess().getThisKeyword_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentConnectionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMInternalComponentConnectionAccess().getClientInstanceMInternalComponentInstanceCrossReference_2_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_4='.' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMInternalComponentConnectionAccess().getFullStopKeyword_3());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentConnectionRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getMInternalComponentConnectionAccess().getClientPortMClientPortCrossReference_4_0()); 
	}

)
)	otherlv_6='<->' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMInternalComponentConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5());
    }
(	otherlv_7='this' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMInternalComponentConnectionAccess().getThisKeyword_6_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentConnectionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMInternalComponentConnectionAccess().getServerInstanceMInternalComponentInstanceCrossReference_6_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_9='.' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMInternalComponentConnectionAccess().getFullStopKeyword_7());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentConnectionRule());
	        }
        }
	otherlv_10=RULE_ID
	{
		newLeafNode(otherlv_10, grammarAccess.getMInternalComponentConnectionAccess().getServerPortMServerPortCrossReference_8_0()); 
	}

)
)(	otherlv_11='using' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMInternalComponentConnectionAccess().getUsingKeyword_9_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentConnectionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMInternalComponentConnectionAccess().getConnectorMConnectorCrossReference_9_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_13='{' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMInternalComponentConnectionAccess().getLeftCurlyBracketKeyword_9_2());
    }
(	otherlv_14='mapping' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMInternalComponentConnectionAccess().getMappingKeyword_9_3_0());
    }
	otherlv_15=':=' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMInternalComponentConnectionAccess().getColonEqualsSignKeyword_9_3_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentConnectionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMInternalComponentConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_9_3_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_17=';' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMInternalComponentConnectionAccess().getSemicolonKeyword_9_3_3());
    }
)?(	otherlv_18='attribute' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMInternalComponentConnectionAccess().getAttributeKeyword_9_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMInternalComponentConnectionAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_9_4_1_0()); 
	    }
		lv_attributeValueAssignments_19_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMInternalComponentConnectionRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_19_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_20='}' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getMInternalComponentConnectionAccess().getRightCurlyBracketKeyword_9_5());
    }
)?	otherlv_21=';' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getMInternalComponentConnectionAccess().getSemicolonKeyword_10());
    }
)
;





// Entry rule entryRuleMInternalComponentPlatformSwitch
entryRuleMInternalComponentPlatformSwitch returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchRule()); }
	 iv_ruleMInternalComponentPlatformSwitch=ruleMInternalComponentPlatformSwitch 
	 { $current=$iv_ruleMInternalComponentPlatformSwitch.current; } 
	 EOF 
;

// Rule MInternalComponentPlatformSwitch
ruleMInternalComponentPlatformSwitch returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getMInternalComponentPlatformSwitchAccess().getMInternalComponentPlatformSwitchAction_0(),
            $current);
    }
)	otherlv_1='connection' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMInternalComponentPlatformSwitchAccess().getConnectionKeyword_1());
    }
(	otherlv_2='this' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMInternalComponentPlatformSwitchAccess().getThisKeyword_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientInstanceMInternalComponentInstanceCrossReference_2_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_4='.' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMInternalComponentPlatformSwitchAccess().getFullStopKeyword_3());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientPortMClientPortCrossReference_4_0()); 
	}

)
)	otherlv_6='<->' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMInternalComponentPlatformSwitchAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5());
    }
	otherlv_7='switch' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMInternalComponentPlatformSwitchAccess().getSwitchKeyword_6());
    }
	otherlv_8='{' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMInternalComponentPlatformSwitchAccess().getLeftCurlyBracketKeyword_7());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchAccess().getCasesMInternalComponentPlatformSwitchCaseParserRuleCall_8_0()); 
	    }
		lv_cases_9_0=ruleMInternalComponentPlatformSwitchCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMInternalComponentPlatformSwitchRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_9_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalComponentPlatformSwitchCase");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMInternalComponentPlatformSwitchAccess().getRightCurlyBracketKeyword_9());
    }
	otherlv_11=';' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMInternalComponentPlatformSwitchAccess().getSemicolonKeyword_10());
    }
)
;





// Entry rule entryRuleMInternalComponentPlatformSwitchCase
entryRuleMInternalComponentPlatformSwitchCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchCaseRule()); }
	 iv_ruleMInternalComponentPlatformSwitchCase=ruleMInternalComponentPlatformSwitchCase 
	 { $current=$iv_ruleMInternalComponentPlatformSwitchCase.current; } 
	 EOF 
;

// Rule MInternalComponentPlatformSwitchCase
ruleMInternalComponentPlatformSwitchCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getCaseKeyword_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchCaseRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getPlatformMComponentSupportedPlatformCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getColonKeyword_2());
    }
(	otherlv_3='this' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getThisKeyword_3_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchCaseRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerInstanceMInternalComponentInstanceCrossReference_3_1_0()); 
	}

)
))	otherlv_5='.' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getFullStopKeyword_4());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchCaseRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerPortMServerPortCrossReference_5_0()); 
	}

)
)(	otherlv_7='using' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getUsingKeyword_6_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchCaseRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getConnectorMConnectorCrossReference_6_1_0()); 
	    }
		ruleVersionedQualifiedReferenceName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_9='{' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getLeftCurlyBracketKeyword_6_2());
    }
(	otherlv_10='mapping' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getMappingKeyword_6_3_0());
    }
	otherlv_11=':=' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getColonEqualsSignKeyword_6_3_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMInternalComponentPlatformSwitchCaseRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getIfaceMappingMInterfaceMappingCrossReference_6_3_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_13=';' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getSemicolonKeyword_6_3_3());
    }
)?(	otherlv_14='attribute' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeKeyword_6_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_4_1_0()); 
	    }
		lv_attributeValueAssignments_15_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMInternalComponentPlatformSwitchCaseRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_15_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_16='}' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getRightCurlyBracketKeyword_6_5());
    }
)?	otherlv_17=';' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getSemicolonKeyword_7());
    }
)
;





// Entry rule entryRuleComponentSupportedPlatform
entryRuleComponentSupportedPlatform returns [EObject current=null] 
	@init { 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5()
		);
	}
	:
	{ newCompositeNode(grammarAccess.getComponentSupportedPlatformRule()); }
	 iv_ruleComponentSupportedPlatform=ruleComponentSupportedPlatform 
	 { $current=$iv_ruleComponentSupportedPlatform.current; } 
	 EOF 
;
finally {
	myUnorderedGroupState.restore();
}

// Rule ComponentSupportedPlatform
ruleComponentSupportedPlatform returns [EObject current=null] 
    @init { enterRule(); 
		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
			grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5()
		);
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getComponentSupportedPlatformAccess().getMComponentSupportedPlatformAction_0(),
            $current);
    }
)	otherlv_1='supported' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getComponentSupportedPlatformAccess().getSupportedKeyword_1());
    }
	otherlv_2='platform' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getComponentSupportedPlatformAccess().getPlatformKeyword_2());
    }
(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getComponentSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
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
    	newLeafNode(otherlv_4, grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_4());
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 0);
	 				}
					({true}?=>(	otherlv_6='osapi' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getComponentSupportedPlatformAccess().getOsapiKeyword_5_0_0());
    }
	otherlv_7=':=' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1());
    }
(	otherlv_8='any' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_0_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_0_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 1);
	 				}
					({true}?=>(	otherlv_11='os' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getComponentSupportedPlatformAccess().getOsKeyword_5_1_0());
    }
	otherlv_12=':=' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1());
    }
(	otherlv_13='any' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_1_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_15=';' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_1_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 2);
	 				}
					({true}?=>(	otherlv_16='architecture' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getComponentSupportedPlatformAccess().getArchitectureKeyword_5_2_0());
    }
	otherlv_17=':=' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1());
    }
(	otherlv_18='any' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_2_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_20=';' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_2_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 3)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 3);
	 				}
					({true}?=>(	otherlv_21='compiler' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getComponentSupportedPlatformAccess().getCompilerKeyword_5_3_0());
    }
	otherlv_22=':=' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_24=';' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_3_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 4)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 4);
	 				}
					({true}?=>(	otherlv_25='microprocessor' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0());
    }
	otherlv_26=':=' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1());
    }
(	otherlv_27='any' 
    {
    	newLeafNode(otherlv_27, grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_4_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_29=';' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_4_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 5)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 5);
	 				}
					({true}?=>(	otherlv_30='board' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getComponentSupportedPlatformAccess().getBoardKeyword_5_5_0());
    }
	otherlv_31=':=' 
    {
    	newLeafNode(otherlv_31, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1());
    }
(	otherlv_32='any' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_5_2_0());
    }

    |(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_34=';' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_5_3());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 6)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 6);
	 				}
					({true}?=>(	otherlv_35='requires' 
    {
    	newLeafNode(otherlv_35, grammarAccess.getComponentSupportedPlatformAccess().getRequiresKeyword_5_6_0());
    }
	otherlv_36=':=' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAICrossReference_5_6_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_38=',' 
    {
    	newLeafNode(otherlv_38, grammarAccess.getComponentSupportedPlatformAccess().getCommaKeyword_5_6_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAICrossReference_5_6_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_40=';' 
    {
    	newLeafNode(otherlv_40, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_6_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 7)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 7);
	 				}
					({true}?=>(	otherlv_41='attribute' 
    {
    	newLeafNode(otherlv_41, grammarAccess.getComponentSupportedPlatformAccess().getAttributeKeyword_5_7_0());
    }
	otherlv_42='values' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getComponentSupportedPlatformAccess().getValuesKeyword_5_7_1());
    }
	otherlv_43='{' 
    {
    	newLeafNode(otherlv_43, grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_7_3_0()); 
	    }
		lv_attributeValueAssignments_44_0=ruleMParameterValueAssignment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"attributeValueAssignments",
        		lv_attributeValueAssignments_44_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameterValueAssignment");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_45='}' 
    {
    	newLeafNode(otherlv_45, grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4());
    }
	otherlv_46=';' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_7_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 8)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 8);
	 				}
					({true}?=>(	otherlv_47='attributes' 
    {
    	newLeafNode(otherlv_47, grammarAccess.getComponentSupportedPlatformAccess().getAttributesKeyword_5_8_0());
    }
	otherlv_48='{' 
    {
    	newLeafNode(otherlv_48, grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getAttributesMParameterParserRuleCall_5_8_2_0()); 
	    }
		lv_attributes_49_0=ruleMParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"attributes",
        		lv_attributes_49_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_50='}' 
    {
    	newLeafNode(otherlv_50, grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_3());
    }
	otherlv_51=';' 
    {
    	newLeafNode(otherlv_51, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_8_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 9)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 9);
	 				}
					({true}?=>(	otherlv_52='languages' 
    {
    	newLeafNode(otherlv_52, grammarAccess.getComponentSupportedPlatformAccess().getLanguagesKeyword_5_9_0());
    }
	otherlv_53=':=' 
    {
    	newLeafNode(otherlv_53, grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_9_1());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_9_2_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_55=',' 
    {
    	newLeafNode(otherlv_55, grammarAccess.getComponentSupportedPlatformAccess().getCommaKeyword_5_9_3_0());
    }
(
(
		{ 
		  /* */ 
		}
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentSupportedPlatformRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_9_3_1_0()); 
	    }
		ruleVersionedQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_57=';' 
    {
    	newLeafNode(otherlv_57, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_9_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 10)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 10);
	 				}
					({true}?=>(	otherlv_58='subcomponent' 
    {
    	newLeafNode(otherlv_58, grammarAccess.getComponentSupportedPlatformAccess().getSubcomponentKeyword_5_10_0());
    }
	otherlv_59='instances' 
    {
    	newLeafNode(otherlv_59, grammarAccess.getComponentSupportedPlatformAccess().getInstancesKeyword_5_10_1());
    }
	otherlv_60='{' 
    {
    	newLeafNode(otherlv_60, grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_10_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getInternalComponentsMInternalComponentInstanceParserRuleCall_5_10_3_0()); 
	    }
		lv_internalComponents_61_0=ruleMInternalComponentInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"internalComponents",
        		lv_internalComponents_61_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalComponentInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_62='}' 
    {
    	newLeafNode(otherlv_62, grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_10_4());
    }
	otherlv_63=';' 
    {
    	newLeafNode(otherlv_63, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_10_5());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 11)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5(), 11);
	 				}
					({true}?=>(	otherlv_64='connections' 
    {
    	newLeafNode(otherlv_64, grammarAccess.getComponentSupportedPlatformAccess().getConnectionsKeyword_5_11_0());
    }
	otherlv_65='{' 
    {
    	newLeafNode(otherlv_65, grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_11_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentSupportedPlatformAccess().getConnectionsMInternalComponentConnectionParserRuleCall_5_11_2_0()); 
	    }
		lv_connections_66_0=ruleMInternalComponentConnection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentSupportedPlatformRule());
	        }
       		add(
       			$current, 
       			"connections",
        		lv_connections_66_0, 
        		"es.uah.aut.srg.micobs.mclev.lang.CMP.MInternalComponentConnection");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_67='}' 
    {
    	newLeafNode(otherlv_67, grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_11_3());
    }
	otherlv_68=';' 
    {
    	newLeafNode(otherlv_68, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_11_4());
    }
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5());
	}

)	otherlv_69='}' 
    {
    	newLeafNode(otherlv_69, grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_70=';' 
    {
    	newLeafNode(otherlv_70, grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_7());
    }
)
;
finally {
	myUnorderedGroupState.restore();
}





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


